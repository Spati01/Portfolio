package com.example.portfolio.cv;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.portfolio.R;

import java.util.ArrayList;
import java.util.List;


public class CVFragment extends Fragment {

    RecyclerView RvCv;
    CVAdapter adapter;
    List<CVItem> items;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RvCv = view.findViewById(R.id.recyclerview_cv);
       items = new ArrayList<>();
       items.add(new CVItem("01 Aug 2019 - 10 Jun 2023",getString(R.string.lorem_text2)));
       items.add(new CVItem("13 march 2019",getString(R.string.lorem)));
       items.add(new CVItem("17 April 2017",getString(R.string.lore)));
       adapter = new CVAdapter(items);

       RvCv.setLayoutManager(new LinearLayoutManager(getContext()));
       RvCv.setAdapter(adapter);
    }


    public CVFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c_v, container, false);
    }
}