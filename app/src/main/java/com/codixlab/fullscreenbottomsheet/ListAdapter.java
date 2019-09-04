package com.codixlab.fullscreenbottomsheet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.codixlab.fullscreenbottomsheet.databinding.ListItemBinding;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {


    Context context;
    List<People> list;
    OnClickItem onClickItem;

    public ListAdapter(Context context, List<People> list) {

        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ListItemBinding bi = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.list_item, parent, false);

        return new ViewHolder(bi);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.bi.userImage.setImageResource(list.get(position).getImage());
        holder.bi.userName.setText(list.get(position).getName());

        holder.bi.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onClickItem.OnClick(list.get(position));
            }
        });

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

    public interface OnClickItem {

        void OnClick(People people);
    }

    public void setOnItemClickListener(OnClickItem clickListener) {

        onClickItem = clickListener;

    }
}
