package com.example.desarrollo2.peruraymi.Presentation.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import com.example.desarrollo2.peruraymi.R;

public class Sing_up extends AppCompatActivity {
AppCompatButton crear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        crear = (AppCompatButton) findViewById(R.id.create);

        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Sing_up.this,HistoriaPeruRaymi.class);
                startActivity(i);
            }
        });

    }
}
