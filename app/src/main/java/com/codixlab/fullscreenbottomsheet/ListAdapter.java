package com.codixlab.fullscreenbottomsheet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.codixlab.fullscreenbottomsheet.databinding.ListItemBinding;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {


    Context context;
    List<People> list;

    public ListAdapter(Context context, List<People> list) {

        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ListItemBinding bi = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.list_item, null, false);

        return new ViewHolder(bi);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        People people = list.get(position);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ListItemBinding bi;


        public ViewHolder(@NonNull ListItemBinding itemView) {
            super(itemView.getRoot());

            bi = itemView;
        }
    }
}
