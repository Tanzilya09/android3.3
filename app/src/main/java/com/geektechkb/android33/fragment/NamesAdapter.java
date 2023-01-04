package com.geektechkb.android33.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geektechkb.android33.R;

import java.util.ArrayList;
import java.util.List;

public class NamesAdapter extends RecyclerView.Adapter<NamesAdapter.NamesViewHolder> {
    ArrayList<String > names = new ArrayList<>();

    public NamesAdapter(ArrayList<String> names) {
        this.names = names;
    }

    @NonNull
    @Override
    public NamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NamesViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_names, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NamesViewHolder holder, int position) {
        holder.onBind(names.get(position));

    }

    @Override
    public int getItemCount() {
        return names.size();
    }

public class NamesViewHolder extends RecyclerView.ViewHolder{
        private TextView name;
        public NamesViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.txt_name);
        }
        public void onBind(String listNames){

            name.setText(listNames);
        }

    }

}

