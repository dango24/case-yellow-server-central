package com.caseyellow.server.central.domain.test.model;

public class FailedTestDetails {

    private String ip;
    private String path;
    private String errorMessage;

    public FailedTestDetails() {
    }

    private FailedTestDetails(String ip, String path, String errorMessage) {
        this.path = path;
        this.errorMessage = errorMessage;
        this.ip = ip;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public static class FailedTestDetailsBuilder {

        private String ip;
        private String path;
        private String errorMessage;

        public FailedTestDetailsBuilder() {
        }

        public FailedTestDetailsBuilder addIp(String ip) {
            this.ip = ip;
            return this;
        }

        public FailedTestDetailsBuilder addPath(String path) {
            this.path = path;
            return this;
        }

        public FailedTestDetailsBuilder addErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public FailedTestDetails build() {
            return new FailedTestDetails(ip, path, errorMessage);
        }
    }
}
