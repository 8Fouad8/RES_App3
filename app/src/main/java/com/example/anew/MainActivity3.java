package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }


    public void toast2(View view) {
        Intent ss=new Intent(this,MainActivity.class);
        startActivity(ss);
        Toast.makeText(this, "your information has been saved", Toast.LENGTH_SHORT).show();
    }
}