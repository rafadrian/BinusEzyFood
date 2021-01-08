package com.example.binusuts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Foods extends AppCompatActivity {
    Button add1,add2,add3,add4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foods);

        add1 = findViewById(R.id.button3);

        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Foods.this,Order.class);
                startActivity(intent);
            }
        });

        add2 = findViewById(R.id.button2);

        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Foods.this,Order.class);
                startActivity(intent);
            }
        });

        add3 = findViewById(R.id.button4);

        add3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Foods.this,Order.class);
                startActivity(intent);
            }
        });

        add4 = findViewById(R.id.button1);

        add4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Foods.this,Order.class);
                startActivity(intent);
            }
        });

        Button button = findViewById(R.id.myorder);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Foods.this,MyOrder.class);
                startActivity(intent);
            }
        });
    }
}