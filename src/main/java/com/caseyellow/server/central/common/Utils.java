package com.caseyellow.server.central.common;

import com.caseyellow.server.central.domain.test.model.Test;
import com.caseyellow.server.central.domain.test.model.TestWrapper;
import com.caseyellow.server.central.exceptions.IORuntimeException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.AbstractMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public interface Utils {

    static TestWrapper prepareTest(String payload, MultipartRequest request)  {
        try {
            Map<String, File> snapshotLocation =
                    request.getFileMap()
                           .entrySet()
                           .stream()
                           .map(Utils::writeToFile)
                           .collect(toMap(Map.Entry::getKey, Map.Entry::getValue));

            Test test = new ObjectMapper().readValue(payload, Test.class);

            return new TestWrapper(test, snapshotLocation);

        } catch (IOException e) {
            throw new IORuntimeException(e.getMessage(), e);
        }
    }


    static Map.Entry<String, File> writeToFile(Map.Entry<String, MultipartFile> snapshot) {
        String identifier = snapshot.getKey();
        MultipartFile file = snapshot.getValue();

        try {
            byte[] bytes = file.getBytes();
            File tempFileLocation = new File(System.getProperty("java.io.tmpdir"), identifier + "_" +file.getOriginalFilename());
            Files.write(tempFileLocation.toPath(), bytes);

            return new AbstractMap.SimpleEntry<>(identifier, tempFileLocation);

        } catch (IOException e) {
            throw new IORuntimeException("Failed to write file from request to tmp dir, " + e.getMessage(), e);
        }
    }
}