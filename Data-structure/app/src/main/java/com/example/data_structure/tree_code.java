package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tree_code extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree_code);

        Button btn1,btn2,btn3;
        TextView textView1;

        btn1 = findViewById(R.id.btn_tree_BST);
        btn2 = findViewById(R.id.btn_tree_AVL);
        btn3 = findViewById(R.id.btn_tree_Redblack);
        textView1 = findViewById(R.id.tree_code_textview1);

        textView1.setText("Tree Data Structure Implement Using Following Three Types.");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tree_code.this,BST_tree.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tree_code.this,AVl_tree.class));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tree_code.this,RedBlack_tree.class));
            }
        });
    }
}