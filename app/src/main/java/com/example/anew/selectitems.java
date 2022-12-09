package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class selectitems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectitems);
    }
    public void toburger(View view) {
        Intent sign22=new Intent(this,burger.class);
        startActivity(sign22);
    }

    public void topizza(View view) {
        Intent sign22=new Intent(this,pizzamenu.class);
        startActivity(sign22);
    }

    public void topasta(View view) {
        Intent sign22=new Intent(this,pastamenu.class);
        startActivity(sign22);
    }
}