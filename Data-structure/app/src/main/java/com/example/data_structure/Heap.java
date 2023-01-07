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
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class Heap extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    MenuItem item;
    TextView textView;
    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heap);

        drawerLayout = findViewById(R.id.Heappage);
        navigationView = findViewById(R.id.heap_Navigation);
        toolbar = findViewById(R.id.heap_Toolbar);
        btn1 = findViewById(R.id.btn_heap_intro);
        btn2 = findViewById(R.id.btn_heap_Video);
        btn3 = findViewById(R.id.btn_heap_ProgramCode);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();



        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            switch (id){
                case R.id.Home_Menu:
                    startActivity(new Intent(Heap.this,MainActivity.class));
                    break;

                case R.id.queue:
                    startActivity(new Intent(Heap.this,Queue.class));
                    break;

                case R.id.Array:
                    startActivity(new Intent(Heap.this,Array.class));
                    break;

                case R.id.Linked_List:
                    startActivity(new Intent(Heap.this,LinkedList.class));
                    break;

                case R.id.Stack:
                    startActivity(new Intent(Heap.this,Stack.class));
                    break;

                case R.id.tree:
                    startActivity(new Intent(Heap.this,tree.class));
                    break;

                case R.id.aboutus:
                    startActivity(new Intent(Heap.this,Aboutus.class));
                    break;

                case R.id.feedback:
                    startActivity(new Intent(Heap.this,Feedback.class));
                    break;

                case R.id.Visualization:
                    startActivity(new Intent(Heap.this,Visulization.class));
                    break;

                case R.id.Sorting:
                    startActivity(new Intent(Heap.this,sorting.class));
                    break;

                default:
                    return false;
            }
            return false;
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heap.this,heap_intro.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heap.this,heap_video.class));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Heap.this,Heap_code.class));
            }
        });
    }
}