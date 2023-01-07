package com.example.data_structure;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class Stack extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    MenuItem item;
    TextView textView;
    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack);

        drawerLayout = findViewById(R.id.StackPage);
        navigationView = findViewById(R.id.Stack_Navigation);
        toolbar = findViewById(R.id.Stack_Toolbar);
        btn1 = findViewById(R.id.btn_stack_intro);
        btn2 = findViewById(R.id.btn_stack_ProgramCode);
        btn3 = findViewById(R.id.btn_stack_Video);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Stack.this,stack_introduction.class));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Stack.this,Stack_video.class));

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Stack.this,stack_code.class));
            }
        });


        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            switch (id){
                case R.id.Home_Menu:
                    startActivity(new Intent(Stack.this,MainActivity.class));
                    break;

                case R.id.queue:
                    startActivity(new Intent(Stack.this,Queue.class));
                    break;

                case R.id.Array:
                    startActivity(new Intent(Stack.this,Array.class));
                    break;

                case R.id.Linked_List:
                    startActivity(new Intent(Stack.this,LinkedList.class));
                    break;

                case R.id.tree:
                    startActivity(new Intent(Stack.this,tree.class));
                    break;

                case R.id.heap:
                    startActivity(new Intent(Stack.this,Heap.class));
                    break;

                case R.id.aboutus:
                    startActivity(new Intent(Stack.this,Aboutus.class));
                    break;

                case R.id.Visualization:
                    startActivity(new Intent(Stack.this,Visulization.class));
                    break;

                case R.id.feedback:
                    startActivity(new Intent(Stack.this,Feedback.class));
                    break;

                case R.id.Sorting:
                    startActivity(new Intent(Stack.this,sorting.class));
                    break;

                default:
                    return false;
            }
            return false;
        });
    }
}