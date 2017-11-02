package com.example.desarrollo2.peruraymi.Presentation.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.desarrollo2.peruraymi.R;

import static android.R.attr.type;
import static com.example.desarrollo2.peruraymi.R.color.texto;

public class Splash_screen extends AppCompatActivity {
private TextView texto1,texto2,texto3,texto4,texto5 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(Splash_screen.this,Sing_in.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }
        private void starComponent(){
            texto1 = (TextView) findViewById(R.id.texto1);
            texto2 = (TextView) findViewById(R.id.texto2);
            texto3 = (TextView) findViewById(R.id.texto3);
            texto4 = (TextView) findViewById(R.id.texto4);
            texto5 = (TextView) findViewById(R.id.texto5);

    }

}
