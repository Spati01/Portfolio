package com.example.portfolio.portfolio;

import java.io.Serializable;

public class PortfolioItem implements Serializable {
    private int img;
    private String title,description;

    public PortfolioItem() {
    }


    public PortfolioItem(int img, String title) {
        this.img = img;
        this.title = title;
    }

    public PortfolioItem(int img, String title, String description) {
        this.img = img;
        this.title = title;
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
