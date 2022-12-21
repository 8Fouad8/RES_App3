package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.Debug;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity2 extends AppCompatActivity {
     Button button3;
     EditText name = findViewById(R.id.editTextTextEmailAddress);
    EditText password = findViewById(R.id.editTextTextPassword) ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Tester","on create");
        setContentView(R.layout.activity_main2);
          button3=findViewById(R.id.button3);

        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        button3.setOnClickListener(v -> {

            myRef.setValue("Hello, World!");

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

   public void tomenu(View view) {
       Intent ss=new Intent(this,selectitems.class);
         startActivity(ss);
    }
}