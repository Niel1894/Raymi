package com.example.desarrollo2.peruraymi.Presentation.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import com.example.desarrollo2.peruraymi.R;

public class sing_up extends AppCompatActivity {
AppCompatButton crear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        crear = (AppCompatButton) findViewById(R.id.create);

        crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(sing_up.this,funcion_raymi.class);
                startActivity(i);
            }
        });

    }
}
