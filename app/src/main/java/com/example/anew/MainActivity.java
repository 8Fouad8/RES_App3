package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signin(View view) {
        Intent sign=new Intent(this,MainActivity2.class);
        startActivity(sign);
    }

    public void tosignup(View view) {
        Intent toact3= new Intent(this,MainActivity3.class);
        startActivity(toact3);
    }
}