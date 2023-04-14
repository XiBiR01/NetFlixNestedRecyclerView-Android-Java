package com.example.netflixrecyclerviewnested;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GameDetailedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_detailed);
        Intent data=getIntent();
        int image=data.getIntExtra("gameArt",0);
        String gameName=data.getStringExtra("gameName").toString();
        TextView dGameTitle=findViewById(R.id.dGameTitle);
        ImageView dGameImage=findViewById(R.id.dGameImage);
        dGameTitle.setText(gameName);
        dGameImage.setImageResource(image);
    }
}