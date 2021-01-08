package com.example.binusuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Order extends AppCompatActivity {

    int count = 0;
    private Button upbutton,downbutton;
    private TextView quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        upbutton = findViewById(R.id.upbutton);
        downbutton = findViewById(R.id.downbutton);
        quantity = findViewById(R.id.quantity);

        upbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                quantity.setText(count+"");
            }
        });

        downbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                quantity.setText(count+"");
            }
        });

        Button button = findViewById(R.id.order);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Order.this,MyOrder.class);
                startActivity(intent);
            }
        });
        Button button1 = findViewById(R.id.ordermore);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Order.this,Drinks.class);
                startActivity(intent);
            }
        });
    }
}