package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class stack_code extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack_code);

        Button btn1,btn2;

        btn1 = findViewById(R.id.btn_stckarray);
        btn2 = findViewById(R.id.btn_stcklinkedlist);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(stack_code.this,stack_array.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(stack_code.this,stack_linkedlist.class));
            }
        });
    }
}