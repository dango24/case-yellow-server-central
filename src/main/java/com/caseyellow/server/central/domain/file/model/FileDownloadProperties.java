package com.caseyellow.server.central.domain.file.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FileDownloadProperties {

    private String identifier;
    private String url;
    private int size;
    private String md5;
    private int timeoutInMin;

    public FileDownloadProperties(String url) {
        this(null, url, 0, null, 0);
    }
}
