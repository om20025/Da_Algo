package com.example.data_structure;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class Aboutus extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    MenuItem item;
    TextView textView1,textView2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        drawerLayout = findViewById(R.id.Aboutus);
        navigationView = findViewById(R.id.aboutus_Navigation);
        toolbar = findViewById(R.id.aboutus_Toolbar);
        textView1 = findViewById(R.id.aboutus_textview1);
        textView2 = findViewById(R.id.aboutus_textview2);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            switch (id){
                case R.id.Home_Menu:
                    startActivity(new Intent(Aboutus.this,MainActivity.class));
                    break;

                case R.id.queue:
                    startActivity(new Intent(Aboutus.this,Queue.class));
                    break;

                case R.id.Array:
                    startActivity(new Intent(Aboutus.this,Array.class));
                    break;

                case R.id.Linked_List:
                    startActivity(new Intent(Aboutus.this,LinkedList.class));
                    break;

                case R.id.tree:
                    startActivity(new Intent(Aboutus.this,tree.class));
                    break;

                case R.id.heap:
                    startActivity(new Intent(Aboutus.this,Heap.class));
                    break;

                case R.id.Stack:
                    startActivity(new Intent(Aboutus.this,Stack.class));
                    break;

                case R.id.feedback:
                    startActivity(new Intent(Aboutus.this,Feedback.class));
                    break;

                case R.id.Visualization:
                    startActivity(new Intent(Aboutus.this,Visulization.class));
                    break;

                case R.id.Sorting:
                    startActivity(new Intent(Aboutus.this,sorting.class));
                    break;

                default:
                    return false;
            }
            return false;
        });

        textView1.setText("We Are Student Of Charusat University");

        textView2.setText("We Are Presenting App For Understanding One Of The Core Subject Of Computer Engineering" +
                ",Information Technology And Computer Science And Engineering Is \n \"Data Structure And Algorithm. \" \n" +
                "We Can Provide Details, Video, Animation And Code For Any Data Structure.");

    }
}