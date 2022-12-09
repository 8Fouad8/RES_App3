package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void ne(View view) {
        Intent se = new Intent(this,MainActivity6.class);
        startActivity(se);
        Toast.makeText(this, "enter code", Toast.LENGTH_SHORT).show();
    }
}