package com.example.ezhealth_mobile;

import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ContentPanel contentPanel;
    ConstraintLayout includeFirstPanel;
    ArrayList<ObjectDefault> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        includeFirstPanel = (ConstraintLayout) findViewById(R.id.include);

        list = new ArrayList<ObjectDefault>();
        list.add(new ObjectDefault("Laranja", "5", null, "120"));
        list.add(new ObjectDefault("Maça", "4", null, "100"));
        list.add(new ObjectDefault("Uva", "3", null, "80"));
        list.add(new ObjectDefault("Coca-Cola", "500", "ml", "120"));
        list.add(new ObjectDefault("Pedaço de Pizza", "2", null, "500"));

        this.selectFirstTypePanel("information" , "Café da manhã");
    }

    /* Function: selectFirstTypePainel(String type, String titlePanel, Integer quantity)
    *  For panel type quantity call it that: this.selectTypePainel(quantity , "Cajú", 5, "g");
    *  For panel type information call it that: this.selectTypePainel(information , "Cajú", null, "min" || "h");
    */
    public void selectFirstTypePanel(String type, String titlePanel){
        switch (type){
            case "quantity":
                this.setFirstPanel(R.layout.content_panel_first_quant);
                contentPanel = new ContentFirstPanelQuantity(getWindow().getDecorView(), titlePanel, list.get(0));
                break;
            case "information":
                this.setFirstPanel(R.layout.content_panel_first_info);
                contentPanel = new ContentFirstPanelInformation(getWindow().getDecorView(), titlePanel, list);
                ((ContentFirstPanelInformation)contentPanel).setOnListernButtonAdd(v->{
                    Log.d("teste", "selectFirstTypePanel: ");
                });
                break;
        }
    }


    /* Function: setFirstPanel(@LayoutRes int layoutId)
    *  Description: The first panel can be used to display information or receive quantities
    */
    private void setFirstPanel(@LayoutRes int layoutId){
        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(layoutId, null);

        includeFirstPanel.removeAllViews();
        includeFirstPanel.addView(layout);
    }


}