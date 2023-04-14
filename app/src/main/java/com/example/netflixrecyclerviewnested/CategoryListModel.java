package com.example.netflixrecyclerviewnested;

public class CategoryListModel {
    int imageResource;
    String gameName;

    public CategoryListModel(int imageResource, String gameName) {
        this.imageResource = imageResource;
        this.gameName = gameName;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

}
