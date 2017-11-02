package com.example.desarrollo2.peruraymi.Presentation.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import com.example.desarrollo2.peruraymi.R;

public class HistoriaPeruRaymi extends AppCompatActivity {
AppCompatButton salir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_peru_raymi);
        salir = (AppCompatButton)findViewById(R.id.salir);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HistoriaPeruRaymi.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
