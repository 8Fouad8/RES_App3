package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class confirmord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmord);
    }
    public void toburger(View view) {
        Intent sign22=new Intent(this,burger.class);
        startActivity(sign22);
    }
    public void backtopizza(View view) {
        Intent sign22=new Intent(this,pizzamenu.class);
        startActivity(sign22);
    }
    public void topastamenu(View view) {
        Intent sign22=new Intent(this,pastamenu.class);
        startActivity(sign22);
    }
    public void tofinal(View view) {
        Intent sign22=new Intent(this,payment.class);
        startActivity(sign22);
    }


}