package com.khalidbaba.cardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by khalidbaba on 31/01/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    List<Product> list;

    public MyAdapter(List<Product> list) {
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int itemType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell_cards,viewGroup,false);
        return new MyViewHolder(view);
    }
     @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
        Product myObject = list.get(position);
        myViewHolder.bind(myObject);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
