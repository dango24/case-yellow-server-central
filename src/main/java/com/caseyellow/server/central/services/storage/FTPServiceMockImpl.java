package com.caseyellow.server.central.services.storage;

import com.caseyellow.server.central.exceptions.IORuntimeException;
import com.caseyellow.server.central.exceptions.RequestFailureException;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.io.File;

@Profile("dev")
@Service
public class FTPServiceMockImpl implements FTPService {


    @Override
    public String uploadFileToCache(String fileName, String filePath) throws IORuntimeException {
        return null;
    }
}
