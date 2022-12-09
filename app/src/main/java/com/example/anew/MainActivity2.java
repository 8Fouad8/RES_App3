package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void tosignup2(View view) {
        Intent sign=new Intent(this,MainActivity3.class);
        startActivity(sign);
    }

    public void foe(View view) {
        Intent swe = new Intent(this,MainActivity4.class);
        startActivity(swe);
    }

    public void tomenu(View view) {
        Intent ss=new Intent(this,selectitems.class);
        startActivity(ss);
    }
}