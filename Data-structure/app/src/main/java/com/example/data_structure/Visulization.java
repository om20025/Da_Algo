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

public class Visulization extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    MenuItem item;
    Button btn1,btn2;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visulization);

        drawerLayout = findViewById(R.id.Visualization_page);
        navigationView = findViewById(R.id.Visualization_Navigation);
        toolbar = findViewById(R.id.Visualization_Toolbar);
        textView1 = findViewById(R.id.Visualization_textview1);
        btn1 = findViewById(R.id.btn_Visu_app);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            switch (id){
                case R.id.Stack:
                    startActivity(new Intent(Visulization.this,Stack.class));
                    break;


                case R.id.queue:
                    startActivity(new Intent(Visulization.this,Queue.class));
                    break;

                case R.id.Home_Menu:
                    startActivity(new Intent(Visulization.this,MainActivity.class));
                    break;

                case R.id.Linked_List:
                    startActivity(new Intent(Visulization.this,LinkedList.class));
                    break;

                case R.id.tree:
                    startActivity(new Intent(Visulization.this,tree.class));
                    break;

                case R.id.heap:
                    startActivity(new Intent(Visulization.this,Heap.class));
                    break;

                case R.id.aboutus:
                    startActivity(new Intent(Visulization.this,Aboutus.class));
                    break;

                case R.id.feedback:
                    startActivity(new Intent(Visulization.this,Feedback.class));
                    break;

                case R.id.Array:
                    startActivity(new Intent(Visulization.this,Array.class));
                    break;

                case R.id.Sorting:
                    startActivity(new Intent(Visulization.this,sorting.class));
                    break;

                default:
                    return false;
            }
            return false;
        });

        textView1.setText("For Visualization We Have Our Second App Which You Can Use." +
                "\nBelow Is The Download Link For Visualization App. Go And Understand Data Structure" +
                "Using Animation");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1KjxhsoilxE8EFQIn8o21WmIYdndf-opS/view")));
                Log.i("Video", "Video Playing....");

            }
        });
    }
}