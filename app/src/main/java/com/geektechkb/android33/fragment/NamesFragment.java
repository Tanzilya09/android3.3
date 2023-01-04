package com.geektechkb.android33.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektechkb.android33.R;

import java.util.ArrayList;
import java.util.List;

public class NamesFragment extends Fragment {

    private RecyclerView.Adapter adapter;
    private ArrayList<String > names;
    private RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_names, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_names);
        names= new ArrayList<>();
        names.add("Фотографии");
        names.add("Картинки");
        names.add("Сериалы");
        names.add("Мультфильм");
        names.add("Фильм");
        names.add("Волейбол");
        names.add("Футбол");

        adapter = new NamesAdapter(names);
        recyclerView.setAdapter(adapter);
    }
}