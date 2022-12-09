package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class burger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);
    }
    public void toconfirm(View view) {
        Intent sign22=new Intent(this,confirmord.class);
        startActivity(sign22);
    }
    public void toconfirm2(View view) {
        Intent sign22=new Intent(this,confirmord.class);
        startActivity(sign22);
    }
    public void toconfirm3(View view) {
        Intent sign22=new Intent(this,confirmord.class);
        startActivity(sign22);
}
}