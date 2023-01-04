package com.geektechkb.android33;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.geektechkb.android33.fragment.NamesFragment;
import com.google.android.material.button.MaterialButton;

public class FirstFragment extends Fragment {
    private final String admin = "admin";
    private EditText etPasswordFirstFragment;
    private MaterialButton btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
       super.onViewCreated(view, savedInstanceState);
       etPasswordFirstFragment = view.findViewById(R.id.et_passwordFirstFragment);
       btn = view.findViewById(R.id.btn);
       click();
    }

    private void click() {btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String password = etPasswordFirstFragment.getText().toString();
               if (!password.equals(admin)) {
                   etPasswordFirstFragment.setError("Не правильный пароль");
               } else {
                   FragmentManager fragmentManager = getParentFragmentManager();
                   FragmentTransaction transaction = fragmentManager.beginTransaction();
                   transaction.add(R.id.fragment_container, NamesFragment.class, null)
                           .commit();
               }
           }
           });
       }
}