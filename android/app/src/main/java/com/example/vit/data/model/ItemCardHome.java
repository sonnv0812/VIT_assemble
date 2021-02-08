package com.example.vit.data.model;

public class ItemCardHome {
    private int image;
    private String title;
    private String subtitle;
    private int color;

    public ItemCardHome(int image, String title, String subtitle, int color) {
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
        this.color = color;
    }

    public ItemCardHome(int image, String title, String subtitle) {
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
    }

    public int getColor() {
        return color;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }
}
