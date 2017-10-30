package com.example.desarrollo2.peruraymi.Presentation.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.desarrollo2.peruraymi.R;

import org.w3c.dom.Text;

public class sing_in extends AppCompatActivity {
TextView crearAqui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_in);

crearAqui = (TextView) findViewById(R.id.create);

        crearAqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(sing_in.this,sing_up.class);
                startActivity(i);

            }
        });

    }
}
