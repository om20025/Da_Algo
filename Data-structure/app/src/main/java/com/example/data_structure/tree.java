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

public class tree extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    MenuItem item;
    TextView textView;
    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree);

        drawerLayout = findViewById(R.id.TreePage);
        navigationView = findViewById(R.id.tree_Navigation);
        toolbar = findViewById(R.id.Tree_Toolbar);
        btn1 = findViewById(R.id.btn_tree_intro);
        btn2 = findViewById(R.id.btn_tree_Video);
        btn3 = findViewById(R.id.btn_tree_ProgramCode);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //      startActivity(new Intent(tree.this,tree_introduction.class));
            }
        });


        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            switch (id){
                case R.id.Home_Menu:
                    startActivity(new Intent(tree.this,MainActivity.class));
                    break;

                case R.id.queue:
                    startActivity(new Intent(tree.this,Queue.class));
                    break;

                case R.id.Array:
                    startActivity(new Intent(tree.this,Array.class));
                    break;

                case R.id.Linked_List:
                    startActivity(new Intent(tree.this,LinkedList.class));
                    break;

                case R.id.Stack:
                    startActivity(new Intent(tree.this,Stack.class));
                    break;

                case R.id.heap:
                    startActivity(new Intent(tree.this,Heap.class));
                    break;

                case R.id.aboutus:
                    startActivity(new Intent(tree.this,Aboutus.class));
                    break;

                case R.id.Visualization:
                    startActivity(new Intent(tree.this,Visulization.class));
                    break;

                case R.id.feedback:
                    startActivity(new Intent(tree.this,Feedback.class));
                    break;

                case R.id.Sorting:
                    startActivity(new Intent(tree.this,sorting.class));
                    break;

                default:
                    return false;
            }
            return false;
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tree.this,tree_intro.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tree.this,tree_video.class));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tree.this,tree_code.class));
            }
        });
    }
}