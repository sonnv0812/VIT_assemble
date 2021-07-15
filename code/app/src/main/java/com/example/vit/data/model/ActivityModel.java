package com.example.vit.data.model;

import java.util.Date;

public class ActivityModel {
    private String name;
    private String description;
    private long time;
    private String place;
    private String skin;
    private int status;

    public ActivityModel() {

    }

    public ActivityModel(String name, String description, long time, String place, String skin, int status) {
        this.name = name;
        this.description = description;
        this.time = time;
        this.place = place;
        this.skin = skin;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public String getSkin() {
        return skin;
    }

    public String getDescription() {
        return description;
    }

    public long getTime() {
        return time;
    }
}
