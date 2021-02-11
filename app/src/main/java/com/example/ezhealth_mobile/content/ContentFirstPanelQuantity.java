package com.example.ezhealth_mobile.content;

import android.view.View;
import android.widget.TextView;

import com.example.ezhealth_mobile.entity.ObjectDefault;
import com.example.ezhealth_mobile.R;

public class ContentFirstPanelQuantity extends ContentPanel {

    public ContentFirstPanelQuantity(View view, String title, ObjectDefault obj) {
        super(view, title);
        setQuantity(obj.getQuantity());
        setMeasure(obj.getQuantityMeasure());
    }

    public void setQuantity(String quantity){
        TextView textView = getView().findViewById(R.id.editTextQtd);
        textView.setText(quantity);
    }

    public void setMeasure(String measure){
        TextView textView = getView().findViewById(R.id.textViewUniMed);
        textView.setText(String.valueOf(measure));
    }

}
