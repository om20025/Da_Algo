package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class linkedlist_code extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkedlist_code);

        Button btn1,btn2,btn3;
        TextView textView1;

        btn1 = findViewById(R.id.btn_link_single);
        btn2 = findViewById(R.id.btn_link_double);
        btn3 = findViewById(R.id.btn_link_circular);
        textView1 = findViewById(R.id.link_code_textview1);

        textView1.setText("Linked List Data Structure Implement Using Following Three Types.");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(linkedlist_code.this,singly_linkedlist.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(linkedlist_code.this,doubly_linkedlist.class));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(linkedlist_code.this,circular_linkedlist.class));
            }
        });
    }
}