package com.example.data_structure;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class heap_intro extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    MenuItem item;
    TextView textView1,textView2,textView3,textView4,textView5,textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heap_intro);

        drawerLayout = findViewById(R.id.heap_intro);
        navigationView = findViewById(R.id.heap_intro_navigation);
        toolbar = findViewById(R.id.heap_intro_toolbar);
        textView1 = findViewById(R.id.heap_text1);
        textView2 = findViewById(R.id.heap_text2);
        textView3 = findViewById(R.id.heap_text3);
        textView4 = findViewById(R.id.heap_text4);
        textView5 = findViewById(R.id.heap_text5);
        textView6 = findViewById(R.id.heap_text6);



        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            switch (id){
                case R.id.Home_Menu:
                    startActivity(new Intent(heap_intro.this,MainActivity.class));
                    break;

                case R.id.queue:
                    startActivity(new Intent(heap_intro.this,Queue.class));
                    break;

                case R.id.Array:
                    startActivity(new Intent(heap_intro.this,Array.class));
                    break;

                case R.id.Linked_List:
                    startActivity(new Intent(heap_intro.this,LinkedList.class));
                    break;

                case R.id.Stack:
                    startActivity(new Intent(heap_intro.this,Stack.class));
                    break;

                case R.id.tree:
                    startActivity(new Intent(heap_intro.this,tree.class));
                    break;

                case R.id.heap:
                    startActivity(new Intent(heap_intro.this,Heap.class));
                    break;

                case R.id.aboutus:
                    startActivity(new Intent(heap_intro.this,Aboutus.class));
                    break;

                case R.id.feedback:
                    startActivity(new Intent(heap_intro.this,Feedback.class));
                    break;

                default:
                    return false;
            }
            return false;
        });

        textView1.setText("\nWhat is a heap?");

        textView2.setText("A heap is a specialized tree-based data structure that satisfies the heap property. " +
                "It can be of 2 types: max heap and min heap.\n");

        textView3.setText("The Heap Property");

        textView4.setText("The heap property says that is the value of Parent is either greater than " +
                "or equal to (in a max heap) or less than or equal to (in a min heap) the value of the Child.\n");

        textView5.setText("Uses in programming");

        textView6.setText("1. Heapsort: One of the best in-place sorting methods with no quadratic worst-case scenarios. " +
                "This is because the minimum or maximum element is always the root of the tree." +
                "\n" +
                "2. Implementing priority queues: the highest (or lowest) priority element is always stored at the root." +
                "\n" +
                "3. Selection algorithms: A heap allows access to the min or max element in constant time, " +
                "and other selections (such as median or kth element) can be done in sub-linear time on data that is in a heap." +
                "\n" +
                "4. Graph algorithms: By using heaps as internal traversal data structures, run times\n");


    }
}