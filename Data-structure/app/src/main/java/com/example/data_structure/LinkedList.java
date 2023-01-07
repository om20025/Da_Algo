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

public class LinkedList extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    MenuItem item;
    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linked_list);

        drawerLayout = findViewById(R.id.Linkedlist_Page);
        navigationView = findViewById(R.id.Linkedlist_Navigation);
        toolbar = findViewById(R.id.Linkedlist_ToolBar);
        btn1 = findViewById(R.id.btn_linkedlist_intro);
        btn2 = findViewById(R.id.btn_linkedlist_Video);
        btn3 = findViewById(R.id.btn_linkedlist_ProgramCode);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            switch (id){
                case R.id.Stack:
                    startActivity(new Intent(LinkedList.this,Stack.class));
                    break;

                case R.id.queue:
                    startActivity(new Intent(LinkedList.this,Queue.class));
                    break;

                case R.id.Array:
                    startActivity(new Intent(LinkedList.this,Array.class));
                    break;

                case R.id.Home_Menu:
                    startActivity(new Intent(LinkedList.this,MainActivity.class));
                    break;

                case R.id.tree:
                    startActivity(new Intent(LinkedList.this,tree.class));
                    break;

                case R.id.heap:
                    startActivity(new Intent(LinkedList.this,Heap.class));
                    break;

                case R.id.aboutus:
                    startActivity(new Intent(LinkedList.this,Aboutus.class));
                    break;

                case R.id.feedback:
                    startActivity(new Intent(LinkedList.this,Feedback.class));
                    break;

                case R.id.Visualization:
                    startActivity(new Intent(LinkedList.this,Visulization.class));
                    break;

                case R.id.Sorting:
                    startActivity(new Intent(LinkedList.this,sorting.class));
                    break;

                default:
                    return false;
            }
            return false;
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LinkedList.this,linkedlist_intro.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LinkedList.this,Linkedlist_Video.class));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LinkedList.this,linkedlist_code.class));
            }
        });
    }
}