package com.example.vit.data.model;

public class ActivityModel {
    private String name;
    private String description;
    private long time;
    private String place;
    private String dress;
    private int status;

    public ActivityModel() {

    }

    public ActivityModel(String name, String description, long time, String place, String skin, int status) {
        this.name = name;
        this.description = description;
        this.time = time;
        this.place = place;
        this.dress = skin;
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

    public String getDress() {
        return dress;
    }

    public String getDescription() {
        return description;
    }

    public long getTime() {
        return time;
    }
}
