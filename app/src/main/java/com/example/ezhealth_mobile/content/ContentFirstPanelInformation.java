package com.example.ezhealth_mobile.content;

import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ezhealth_mobile.entity.ObjectDefault;
import com.example.ezhealth_mobile.R;
import com.example.ezhealth_mobile.util.RecyclerViewAdapter;

import java.util.ArrayList;

public class ContentFirstPanelInformation extends ContentPanel {

    private ImageView imageViewAdd;

    public ContentFirstPanelInformation(View view, String titlePanel, ArrayList<ObjectDefault> list) {
        super(view, titlePanel);

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(list);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(recyclerViewAdapter);

        imageViewAdd = getView().findViewById(R.id.imageViewButtonAdd);
    }

    public void setOnListernButtonAdd(View.OnClickListener l){
        imageViewAdd.setOnClickListener(l);
    }

}
