package com.caseyellow.server.central.domain.webSite.model;

import java.util.Set;

public class SpeedTestFlashMetaData {

    private String finishIdentifier;
    private Set<WordIdentifier> buttonIds;

    public SpeedTestFlashMetaData() {
    }

    public String getFinishIdentifier() {
        return finishIdentifier;
    }

    public void setFinishIdentifier(String finishIdentifier) {
        this.finishIdentifier = finishIdentifier;
    }

    public Set<WordIdentifier> getButtonIds() {
        return buttonIds;
    }

    public void setButtonIds(Set<WordIdentifier> buttonIds) {
        this.buttonIds = buttonIds;
    }
}
