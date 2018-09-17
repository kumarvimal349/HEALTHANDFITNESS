package com.example.me.healthandfitnesstips;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class exercise_in_english extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_in_english);

Button btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16;


        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);

        btn10 = (Button) findViewById(R.id.btn10);
        btn11 = (Button) findViewById(R.id.btn11);
        btn12 = (Button) findViewById(R.id.btn12);

        btn13 = (Button) findViewById(R.id.btn13);

        btn14 = (Button) findViewById(R.id.btn14);
        btn15 = (Button) findViewById(R.id.btn15);
        btn16 = (Button) findViewById(R.id.btn16);


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4 = new Intent(exercise_in_english.this, abs.class);
                startActivity(int4);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5 = new Intent(exercise_in_english.this, back.class);
                startActivity(int5);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6 = new Intent(exercise_in_english.this, biceps.class);
                startActivity(int6);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int7 = new Intent(exercise_in_english.this, calf.class);
                startActivity(int7);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int8 = new Intent(exercise_in_english.this, chest.class);
                startActivity(int8);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int9 = new Intent(exercise_in_english.this,forearm.class);
                startActivity(int9);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int10 = new Intent(exercise_in_english.this, leg.class);
                startActivity(int10);
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int11 = new Intent(exercise_in_english.this, shoulder.class);
                startActivity(int11);
            }
        });


        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int12 = new Intent(exercise_in_english.this, triceps.class);
                startActivity(int12);
            }
        });

    }
}
