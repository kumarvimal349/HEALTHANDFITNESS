package com.example.me.healthandfitnesstips;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shoulder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder);



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
                Intent int4 = new Intent(shoulder.this, Back_presses.class);
                startActivity(int4);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5 = new Intent(shoulder.this, Seated_front_presses.class);
                startActivity(int5);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int6 = new Intent(shoulder.this, Seated_dumbbell_presses.class);
                startActivity(int6);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int7 = new Intent(shoulder.this, Low_pulley_lateral_raises.class);
                startActivity(int7);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int8 = new Intent(shoulder.this, Upright_rows.class);
                startActivity(int8);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int9 = new Intent(shoulder.this, Dumbbell_rear_Deltoid_raises.class);
                startActivity(int9);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int10 = new Intent(shoulder.this, Lateral_raises.class);
                startActivity(int10);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int11 = new Intent(shoulder.this, Front_raises.class);
                startActivity(int11);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int11 = new Intent(shoulder.this, Barbell_front_raises.class);
                startActivity(int11);
            }
        });


        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int11 = new Intent(shoulder.this, Upright_row.class);
                startActivity(int11);
            }
        });


        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int12 = new Intent(shoulder.this, Low_pulley_bent_over_lateral_raises.class);
                startActivity(int12);
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int13 = new Intent(shoulder.this, Low_pulley_front_raises.class);
                startActivity(int13);
            }
        });




    }
}
