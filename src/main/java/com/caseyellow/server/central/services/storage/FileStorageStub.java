package com.caseyellow.server.central.services.storage;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.UUID;

@Service
@Profile("dev")
public class FileStorageStub implements FileStorageService {

    @Override
    public String uploadFile(String userIP, File file) {
        return UUID.randomUUID().toString();
    }

    @Override
    public File getFile(String identifier) {
        // Do nothing
        return null;
    }
}
