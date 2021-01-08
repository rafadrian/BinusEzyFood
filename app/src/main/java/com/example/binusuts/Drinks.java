package com.example.binusuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Drinks extends AppCompatActivity {
    Button add1,add2,add3,add4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        add1 = findViewById(R.id.button3);

        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drinks.this,Order.class);
                startActivity(intent);
            }
        });

        add2 = findViewById(R.id.button2);

        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drinks.this,Order.class);
                startActivity(intent);
            }
        });

        add3 = findViewById(R.id.button4);

        add3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drinks.this,Order.class);
                startActivity(intent);
            }
        });

        add4 = findViewById(R.id.button1);

        add4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drinks.this,Order.class);
                startActivity(intent);
            }
        });

        Button button = findViewById(R.id.myorder);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Drinks.this,MyOrder.class);
                startActivity(intent);
            }
        });
    }
}