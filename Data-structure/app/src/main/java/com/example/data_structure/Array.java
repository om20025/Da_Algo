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

public class Array extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    MenuItem item;
    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);

        drawerLayout = findViewById(R.id.Array_Page);
        navigationView = findViewById(R.id.Array_Navigation);
        toolbar = findViewById(R.id.Array_Toolbar);
        btn1 = findViewById(R.id.btn_array_intro);
        btn2 = findViewById(R.id.btn_array_Video);
        btn3 = findViewById(R.id.btn_array_ProgramCode);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            switch (id){
                case R.id.Stack:
                    startActivity(new Intent(Array.this,Stack.class));
                    break;


                case R.id.queue:
                    startActivity(new Intent(Array.this,Queue.class));
                    break;

                case R.id.Home_Menu:
                    startActivity(new Intent(Array.this,MainActivity.class));
                    break;

                case R.id.Linked_List:
                    startActivity(new Intent(Array.this,LinkedList.class));
                    break;

                case R.id.tree:
                    startActivity(new Intent(Array.this,tree.class));
                    break;

                case R.id.heap:
                    startActivity(new Intent(Array.this,Heap.class));
                    break;

                case R.id.aboutus:
                    startActivity(new Intent(Array.this,Aboutus.class));
                    break;

                case R.id.feedback:
                    startActivity(new Intent(Array.this,Feedback.class));
                    break;

                case R.id.Visualization:
                    startActivity(new Intent(Array.this,Visulization.class));
                    break;

                case R.id.Sorting:
                    startActivity(new Intent(Array.this,sorting.class));
                    break;

                default:
                    return false;
            }
            return false;
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Array.this,array_introduction.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Array.this,Array_video.class));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Array.this,Array_code.class));
            }
        });
    }
}