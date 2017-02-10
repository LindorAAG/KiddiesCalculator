package com.example.lindokuhlema.kiddiescalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(1000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                finally{
                    onPause();
                    Intent intent = new Intent(MainActivity.this, Calculator.class);
                    startActivity(intent);
                }
            }
        };
        thread.start();
    }
    @Override
    public void onPause(){
        super.onPause();
        finish();
    }
}

