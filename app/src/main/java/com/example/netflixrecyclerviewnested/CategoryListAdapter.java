package com.example.netflixrecyclerviewnested;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryListAdapter extends RecyclerView.Adapter<CategoryListAdapter.viewHolder>{
    Context ctx;
    ArrayList<CategoryListModel> categoryImageList;

    public CategoryListAdapter(Context ctx, ArrayList<CategoryListModel> categoryImageList) {
        this.ctx = ctx;
        this.categoryImageList = categoryImageList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.categorylist_cell,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        CategoryListModel obj=categoryImageList.get(position);
        holder.gameImage.setImageResource(obj.getImageResource());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ctx,GameDetailedActivity.class);
                intent.putExtra("gameArt",obj.getImageResource());
                intent.putExtra("gameName",obj.getGameName());
                ctx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryImageList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView gameImage;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            gameImage=itemView.findViewById(R.id.gameImage);

        }
    }
}
