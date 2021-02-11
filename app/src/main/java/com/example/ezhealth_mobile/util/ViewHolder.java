package com.example.ezhealth_mobile.util;

import android.view.Gravity;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ezhealth_mobile.R;

import java.lang.reflect.InvocationTargetException;

public class ViewHolder extends RecyclerView.ViewHolder {

    private TextView title;
    private TextView quantity;
    private TextView quantityMeasure;
    private TextView kcal;
    private ImageView imageViewItemMore;

    private PopupMenu popup;

    private View rootView;
    private int position;

    public ViewHolder(@NonNull View itemView){
        super(itemView);
        rootView = itemView;

        title = itemView.findViewById(R.id.textViewItemTitle);
        quantity = itemView.findViewById(R.id.textViewItemQuant);
        quantityMeasure = itemView.findViewById(R.id.textViewItemQuantMeasure);
        kcal = itemView.findViewById(R.id.textViewItemKcal);

        imageViewItemMore = itemView.findViewById(R.id.imageViewButtonMore);

        popup = new PopupMenu(itemView.getContext(), itemView, Gravity.RIGHT, R.attr.actionOverflowMenuStyle, 0);

        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.overflow_menu, popup.getMenu());
        setOnClickListener();
    }

    public void setOnClickListener(){
        imageViewItemMore.setOnClickListener(v->{
            popup.show();
        });
    }


    public TextView getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title.setText(title);
    }

    public TextView getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity.setText(quantity);
    }

    public TextView getQuantityMeasure() {
        return quantityMeasure;
    }

    public void setQuantityMeasure(String quantityMeasure) {
        this.quantityMeasure.setText(quantityMeasure);
    }

    public TextView getKcal() {
        return kcal;
    }

    public void setKcal(String kcal) {
        this.kcal.setText(kcal);
    }

    public ImageView getImageViewItemMore() {
        return imageViewItemMore;
    }

    public void setImageViewItemMore(ImageView imageViewItemMore) {
        this.imageViewItemMore = imageViewItemMore;
    }

    public View getRootView() {
        return rootView;
    }

    public void setRootView(View rootView) {
        this.rootView = rootView;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
