package com.example.me.healthandfitnesstips;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class triceps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps);

        Button btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13;


        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);

        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn10 = (Button) findViewById(R.id.btn10);
        btn11 = (Button) findViewById(R.id.btn11);
        btn12= (Button) findViewById(R.id.btn12);
        btn13 = (Button) findViewById(R.id.btn13);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4 = new Intent(triceps.this, Close_grip_Bench_presses.class);
                startActivity(int4);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5 = new Intent(triceps.this, push_Downs.class);
                startActivity(int5);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6 = new Intent(triceps.this, Triceps_Extension.class);
                startActivity(int6);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int7 = new Intent(triceps.this,Triceps_Kick_Bricks.class);
                startActivity(int7);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int8 = new Intent(triceps.this, One_arm_Dumbbell_Triceps_Extension.class);
                startActivity(int8);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int9 = new Intent(triceps.this, Bar_triceps_extension.class);
                startActivity(int9);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int10 = new Intent(triceps.this, Dumbbell_triceps_extensions.class);
                startActivity(int10);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int11 = new Intent(triceps.this, Triceps_dips.class);
                startActivity(int11);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int11 = new Intent(triceps.this, Triceps_push_down.class);
                startActivity(int11);
            }
        });


        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int11 = new Intent(triceps.this, One_arm_reverse_push_down.class);
                startActivity(int11);
            }
        });


        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int12 = new Intent(triceps.this, Diamond_pushup_on_bench.class);
                startActivity(int12);
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int13 = new Intent(triceps.this, Dumbbell_row_kick_back.class);
                startActivity(int13);
            }
        });






    }
}
