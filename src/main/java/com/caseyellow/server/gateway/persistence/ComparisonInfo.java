package com.caseyellow.server.gateway.persistence;

/**
 * Created by Dan on 12/10/2016.
 */
public class ComparisonInfo {

    private FileDownloadInfo fileDownloadInfo;
    private SpeedTestWebSiteDownloadInfo speedTestWebSiteDownloadInfo;

    public ComparisonInfo() {}

    public ComparisonInfo(SpeedTestWebSiteDownloadInfo speedTestWebSiteDownloadInfo, FileDownloadInfo fileDownloadInfo) {
        this.speedTestWebSiteDownloadInfo = speedTestWebSiteDownloadInfo;
        this.fileDownloadInfo = fileDownloadInfo;
    }

    public SpeedTestWebSiteDownloadInfo getSpeedTestWebSiteDownloadInfo() {
        return speedTestWebSiteDownloadInfo;
    }

    public FileDownloadInfo getFileDownloadInfo() {
        return fileDownloadInfo;
    }

    public void setFileDownloadInfo(FileDownloadInfo fileDownloadInfo) {
        this.fileDownloadInfo = fileDownloadInfo;
    }

    public void setSpeedTestWebSiteDownloadInfo(SpeedTestWebSiteDownloadInfo speedTestWebSiteDownloadInfo) {
        this.speedTestWebSiteDownloadInfo = speedTestWebSiteDownloadInfo;
    }
}
