package com.example.netflixrecyclerviewnested;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        RecyclerView mainListRecyclerView = findViewById(R.id.mainListRecyclerView);
        ArrayList<MainListModel> mainList=new ArrayList<>();
        ArrayList<CategoryListModel> category1=new ArrayList<>();
        ArrayList<CategoryListModel> category2=new ArrayList<>();
        populateData(category1,category2,mainList);
        mainListRecyclerView.setAdapter(new MainListAdapter(this,mainList));
        mainListRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void populateData(ArrayList<CategoryListModel> category1,ArrayList<CategoryListModel> category2,ArrayList<MainListModel> mainList) {
        category1.add(new CategoryListModel(R.drawable.cod,"Call of Duty"));
        category1.add(new CategoryListModel(R.drawable.loa,"Last of us"));
        category1.add(new CategoryListModel(R.drawable.md,"Mafia Definitive Edition"));
        category1.add(new CategoryListModel(R.drawable.val,"Valorant"));
        category1.add(new CategoryListModel(R.drawable.mfs,"Microsoft Flight Simulator"));
        category1.add(new CategoryListModel(R.drawable.wdl,"Watch Dogs Legion"));
        category1.add(new CategoryListModel(R.drawable.cod,"Call of Duty"));
        category1.add(new CategoryListModel(R.drawable.loa,"Last of us"));
        category1.add(new CategoryListModel(R.drawable.md,"Mafia Definitive Edition"));
        category1.add(new CategoryListModel(R.drawable.val,"Valorant"));
        category1.add(new CategoryListModel(R.drawable.mfs,"Microsoft Flight Simulator"));
        category1.add(new CategoryListModel(R.drawable.wdl,"Watch Dogs Legion"));

        category2.add(new CategoryListModel(R.drawable.cod,"Call of Duty"));
        category2.add(new CategoryListModel(R.drawable.val,"Valorant"));
        category2.add(new CategoryListModel(R.drawable.md,"Mafia Definitive Edition"));
        category2.add(new CategoryListModel(R.drawable.mfs,"Microsoft Flight Simulator"));
        category2.add(new CategoryListModel(R.drawable.wdl,"Watch Dogs Legion"));
        category2.add(new CategoryListModel(R.drawable.loa,"Last of us"));
        mainList.add(new MainListModel("Top AAA 2023",category1));
        mainList.add(new MainListModel("List 2",category2));
        mainList.add(new MainListModel("List 3",category2));
        mainList.add(new MainListModel("List 4",category2));
        mainList.add(new MainListModel("List 5",category2));
        mainList.add(new MainListModel("List 6",category2));
    }
}