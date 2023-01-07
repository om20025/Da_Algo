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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class Feedback extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    MenuItem item;
    EditText editText;
    TextView textView;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        drawerLayout = findViewById(R.id.FeedBack);
        navigationView = findViewById(R.id.feedback_Navigation);
        toolbar = findViewById(R.id.feedback_Toolbar);
        editText = findViewById(R.id.addfeedback);
        btn1 = findViewById(R.id.feedback_submit);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            switch (id){
                case R.id.Home_Menu:
                    startActivity(new Intent(Feedback.this,MainActivity.class));
                    break;

                case R.id.queue:
                    startActivity(new Intent(Feedback.this,Queue.class));
                    break;

                case R.id.Array:
                    startActivity(new Intent(Feedback.this,Array.class));
                    break;

                case R.id.Linked_List:
                    startActivity(new Intent(Feedback.this,LinkedList.class));
                    break;

                case R.id.tree:
                    startActivity(new Intent(Feedback.this,tree.class));
                    break;

                case R.id.heap:
                    startActivity(new Intent(Feedback.this,Heap.class));
                    break;

                case R.id.aboutus:
                    startActivity(new Intent(Feedback.this,Aboutus.class));
                    break;

                case R.id.Stack:
                    startActivity(new Intent(Feedback.this,Stack.class));
                    break;

                case R.id.Visualization:
                    startActivity(new Intent(Feedback.this,Visulization.class));
                    break;

                case R.id.Sorting:
                    startActivity(new Intent(Feedback.this,sorting.class));
                    break;

                default:
                    return false;
            }
            return false;
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String feedback = editText.getText().toString();
                if(feedback.equals(""))
                {
                    Toast.makeText(Feedback.this, "Please Give FeedBack", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(Feedback.this, "FeedBack Submitted", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}