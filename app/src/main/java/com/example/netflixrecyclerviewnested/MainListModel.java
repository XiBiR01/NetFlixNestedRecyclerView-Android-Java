package com.example.netflixrecyclerviewnested;

import java.util.ArrayList;

public class MainListModel {
     String categoryTitle;
    ArrayList<CategoryListModel> categoryList;

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public ArrayList<CategoryListModel> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(ArrayList<CategoryListModel> categoryList) {
        this.categoryList = categoryList;
    }

    public MainListModel(String categoryTitle, ArrayList<CategoryListModel> categoryList) {
        this.categoryTitle = categoryTitle;
        this.categoryList = categoryList;
    }
}
