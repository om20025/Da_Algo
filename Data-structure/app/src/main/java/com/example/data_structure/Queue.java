package com.example.data_structure;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;

public class Queue extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    MenuItem item;
    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);

        drawerLayout = findViewById(R.id.Queue_Page);
        navigationView = findViewById(R.id.Queue_Navigation);
        toolbar = findViewById(R.id.Queue_Toolbar);
        btn1 = findViewById(R.id.btn_queue_intro);
        btn2 = findViewById(R.id.btn_queue_ProgramCode);
        btn3 = findViewById(R.id.btn_queue_Video);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            switch (id){
                case R.id.Stack:
                    startActivity(new Intent(Queue.this,Stack.class));
                    break;

                case R.id.Home_Menu:
                    startActivity(new Intent(Queue.this,MainActivity.class));
                    break;

                case R.id.Array:
                    startActivity(new Intent(Queue.this,Array.class));
                    break;

                case R.id.Linked_List:
                    startActivity(new Intent(Queue.this,LinkedList.class));
                    break;

                case R.id.tree:
                    startActivity(new Intent(Queue.this,tree.class));
                    break;

                case R.id.heap:
                    startActivity(new Intent(Queue.this,Heap.class));
                    break;

                case R.id.aboutus:
                    startActivity(new Intent(Queue.this,Aboutus.class));
                    break;

                case R.id.Visualization:
                    startActivity(new Intent(Queue.this,Visulization.class));
                    break;

                case R.id.Sorting:
                    startActivity(new Intent(Queue.this,sorting.class));
                    break;

                case R.id.feedback:
                    startActivity(new Intent(Queue.this,Feedback.class));
                    break;

                default:
                    return false;
            }
            return false;
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Queue.this,queue_intro.class));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Queue.this,queue_video.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Queue.this,queue_code.class));
            }
        });
    }
}