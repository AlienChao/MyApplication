package com.example.alien.myapplication;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {
    private List<String> list;

    public MyRecyclerViewAdapter(List<String> list) {
        this.list = list;
    }

    @Override
    public MyRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        MyRecyclerViewAdapter.ViewHolder viewHolder = new MyRecyclerViewAdapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyRecyclerViewAdapter.ViewHolder holder, int position) {
        holder.mText.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView mText;

        ViewHolder(View itemView) {
            super(itemView);
            mText = itemView.findViewById(R.id.item_tx);
        }
    }

}
