package com.example.ezhealth_mobile.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ezhealth_mobile.R;

public class TelaCadastro3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro3);
    }

    public void irTela4(View v){
        Intent intent = new Intent(this, TelaCadastro4Activity.class);
        startActivity(intent);
    }

}