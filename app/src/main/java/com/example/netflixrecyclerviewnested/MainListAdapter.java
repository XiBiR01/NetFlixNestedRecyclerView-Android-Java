package com.example.netflixrecyclerviewnested;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainListAdapter extends RecyclerView.Adapter<MainListAdapter.mainViewHolder>{
    Context ctx;
    ArrayList<MainListModel> mainList;

    public MainListAdapter(Context ctx, ArrayList<MainListModel> mainList) {
        this.ctx = ctx;
        this.mainList = mainList;
    }

    @NonNull
    @Override
    public mainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View holder= LayoutInflater.from(ctx).inflate(R.layout.mainlist_cell,parent,false);
        return new mainViewHolder(holder);
    }

    @Override
    public void onBindViewHolder(@NonNull mainViewHolder holder, int position) {
        MainListModel obj= mainList.get(position);
        holder.categoryTitle.setText(obj.getCategoryTitle());
        holder.rv.setAdapter(new CategoryListAdapter(ctx,obj.getCategoryList()));
        holder.rv.setLayoutManager(new LinearLayoutManager(ctx,LinearLayoutManager.HORIZONTAL,false));


    }

    @Override
    public int getItemCount() {
        return mainList.size();
    }

    public class mainViewHolder extends RecyclerView.ViewHolder{
        TextView categoryTitle;
        RecyclerView rv;
        public mainViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryTitle=itemView.findViewById(R.id.categoryListTitle);
            rv=itemView.findViewById(R.id.categoryListRecyclerView);
        }
    }
}
