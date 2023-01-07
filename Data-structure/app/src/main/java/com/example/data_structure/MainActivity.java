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

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    MenuItem item;
    Button button1;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textview9,textview10,textView11,textView12,textView13,textView14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.Main_page);
        navigationView = findViewById(R.id.Navigation);
        toolbar = findViewById(R.id.ToolBar);
        textView1 = findViewById(R.id.main_textview1);
        textView2 = findViewById(R.id.main_textview2);
        textView3 = findViewById(R.id.main_textview3);
        textView4 = findViewById(R.id.main_textview4);
        textView5 = findViewById(R.id.main_textview5);
        textView6 = findViewById(R.id.main_textview6);
        textView7 = findViewById(R.id.main_textview7);
        textView8 = findViewById(R.id.main_textview8);
        textview9 = findViewById(R.id.main_textview9);
        textview10 = findViewById(R.id.main_textview10);
        textView11 = findViewById(R.id.main_textview11);
        textView12 = findViewById(R.id.main_textview12);
        textView13 = findViewById(R.id.main_textview13);
        textView14 = findViewById(R.id.main_textview14);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();



        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            switch (id){
                case R.id.Stack:
                    startActivity(new Intent(MainActivity.this,Stack.class));
                    break;

                case R.id.queue:
                    startActivity(new Intent(MainActivity.this,Queue.class));
                    break;

                case R.id.Array:
                    startActivity(new Intent(MainActivity.this,Array.class));
                    break;

                case R.id.Linked_List:
                    startActivity(new Intent(MainActivity.this,LinkedList.class));
                    break;

                case R.id.tree:
                    startActivity(new Intent(MainActivity.this,tree.class));
                    break;

                case R.id.heap:
                    startActivity(new Intent(MainActivity.this,Heap.class));
                    break;

                case R.id.aboutus:
                    startActivity(new Intent(MainActivity.this,Aboutus.class));
                    break;

                case R.id.feedback:
                    startActivity(new Intent(MainActivity.this,Feedback.class));
                    break;

                case R.id.Visualization:
                    startActivity(new Intent(MainActivity.this,Visulization.class));
                    break;

                case R.id.Sorting:
                    startActivity(new Intent(MainActivity.this,sorting.class));
                    break;

                default:
                    return false;
            }
            return false;
        });

        textView1.setText("Data Structures");

        textView2.setText("A Data Structure is a Model Where Data is Organized, Managed And Stored in a format That Enables " +
                "Efficient Access And Modification of Data. \n\nDifferent Forms OF Data May Require Different Types Of Data Structures. \n\n" +
                "A Program Built Using Improper Data Structures Will Be Therefore Inefficient or Unnecessarily Complex." +
                "It is necessary to Have A Good Knowledge Of Data Structures And Understand Where To Use The Best One.");

        textView3.setText("Inbuilt Data Structures");

        textView4.setText("Inbuilt Data Structures Are Provided by most Programing Languages." +
                "They May Be Used To Derive Other Data Structures.\n");

        textView5.setText("Arrays\nStore Elements Of The Same Type In a contiguous Block of Memory,can Accessed By A Common Identifier.");

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Array.class));
            }
        });

        textView6.setText("Linked Lists\nConsists of nodes, Where Each node Points to some other node forming a sequence");

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,LinkedList.class));
            }
        });

        textView7.setText("Abstract Data Type (ADT)");

        textView8.setText("Abstract Data Types Are Defined By Its Behaviour From Point Of View Of The User of the Data.it Defines It in Terms of Possible Values," +
                "Operations On Data,and the Behaviour Of These Operations\n" +
                "\nThe Definition of ADT only Mentions What Operations Are to be performed but not how these operations will be implemented." +
                "it does not specify how the data is being handled under the hood, this is known as abstraction.\n");

        textview9.setText("Stacks\nThe Insertion And Deletion Operation Are Performed At only one End. it follows LIFO Principle");

        textview10.setText("Queue\nThe Insertion And Deletion Operation Are Performed At Two Different Ends. It follows the FIFO Principle");

        textView11.setText("Tree\nHierarchical Data Structures Where The Information is Represented in the form of a parent and children.");

        textView12.setText("Heap\nSpecialized Tree based data structure that satisfies the heap property.");

        textView13.setText("Graphs\nConsists of nodes and edges used to represent relations between pairs of objects.");

        textView14.setText("Hash Tables\nData is stored is an associative manner. A hash function is used to map the data to array positions.");

        textview9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Stack.class));
            }
        });

        textview10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Queue.class));
            }
        });

        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,tree.class));
            }
        });

        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Heap.class));
            }
        });
    }
}