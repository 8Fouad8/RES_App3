package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity2 extends AppCompatActivity {
     Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
          button3=findViewById(R.id.button3);

        FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
        DatabaseReference mDbRef = mDatabase.getReference("message");
        button3.setOnClickListener(v -> {
            Intent ss=new Intent(this,selectitems.class);

            mDbRef.setValue("Rahul");
            startActivity(ss);
        });

    }

    public void tosignup2(View view) {
        Intent sign=new Intent(this,MainActivity3.class);
        startActivity(sign);
    }

    public void foe(View view) {
        Intent swe = new Intent(this,MainActivity4.class);
        startActivity(swe);
    }

   /* public void tomenu(View view) {

    }*/
}