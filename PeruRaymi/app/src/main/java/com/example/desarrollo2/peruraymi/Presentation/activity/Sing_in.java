package com.example.desarrollo2.peruraymi.Presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;

import com.example.desarrollo2.peruraymi.R;

public class Sing_in extends AppCompatActivity {
    private TextView crearAqui;
    private AppCompatButton ingresar;
    private  Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_in);
        starComponents();

        crearAqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goNextActivity(getApplicationContext(),Sing_up.class);
            }
        });

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goNextActivity(getApplicationContext(),MainActivity.class);
            }
        });


    }


        public void goNextActivity(Context context,Class clase){
        intent = new Intent(context,clase);
            startActivity(intent);

    }

    private void starComponents(){
        crearAqui = (TextView) findViewById(R.id.here);
        ingresar = (AppCompatButton) findViewById(R.id.enter);
    }

    }

