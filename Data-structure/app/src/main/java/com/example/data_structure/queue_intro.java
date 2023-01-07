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

public class queue_intro extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    MenuItem item;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11;
    TextView textView12,textView13,textView14,textView15,textView16,textView17,textView18,textView19,textView20,textView21,textView22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue_intro);

        drawerLayout = findViewById(R.id.queue_intro);
        navigationView = findViewById(R.id.queue_intro_navigation);
        toolbar = findViewById(R.id.queue_intro_toolbar);
        textView1 = findViewById(R.id.queue_text1);
        textView2 = findViewById(R.id.queue_text2);
        textView3 = findViewById(R.id.queue_text3);
        textView4 = findViewById(R.id.queue_text4);
        textView5 = findViewById(R.id.queue_text5);
        textView6 = findViewById(R.id.queue_text6);
        textView7 = findViewById(R.id.queue_text7);
        textView8 = findViewById(R.id.queue_text8);
        textView9 = findViewById(R.id.queue_text9);
        textView10 = findViewById(R.id.queue_text10);
        textView11 = findViewById(R.id.queue_text11);
        textView12 = findViewById(R.id.queue_text12);
        textView13 = findViewById(R.id.queue_text13);
        textView14 = findViewById(R.id.queue_text14);
        textView15 = findViewById(R.id.queue_text15);
        textView16 = findViewById(R.id.queue_text16);
        textView17 = findViewById(R.id.queue_text17);
        textView18 = findViewById(R.id.queue_text18);
        textView19 = findViewById(R.id.queue_text19);
        textView20 = findViewById(R.id.queue_text20);
        textView21 = findViewById(R.id.queue_text21);
        textView22 = findViewById(R.id.queue_text22);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            switch (id){
                case R.id.Home_Menu:
                    startActivity(new Intent(queue_intro.this,MainActivity.class));
                    break;

                case R.id.queue:
                    startActivity(new Intent(queue_intro.this,Queue.class));
                    break;

                case R.id.Array:
                    startActivity(new Intent(queue_intro.this,Array.class));
                    break;

                case R.id.Linked_List:
                    startActivity(new Intent(queue_intro.this,LinkedList.class));
                    break;

                case R.id.Stack:
                    startActivity(new Intent(queue_intro.this,Stack.class));
                    break;

                case R.id.tree:
                    startActivity(new Intent(queue_intro.this,tree.class));
                    break;

                case R.id.heap:
                    startActivity(new Intent(queue_intro.this,Heap.class));
                    break;

                case R.id.aboutus:
                    startActivity(new Intent(queue_intro.this,Aboutus.class));
                    break;

                case R.id.feedback:
                    startActivity(new Intent(queue_intro.this,Feedback.class));
                    break;

                default:
                    return false;
            }
            return false;
        });

        textView1.setText("What is a Queue?");

        textView2.setText("Queue is a linear data structure which unlike the stack is open at both ends. " +
                "It follows the FIFO (First In First Out) principle, " +
                "which means that the element that is inserted first is removed first.\n");

        textView3.setText("Real Life Examples of Queues");

        textView4.setText("1. An example of a queue is the queue we see everyday in our lives. " +
                "People join a queue from the end and get out of the queue from the front, following the FIFO principle." +
                "\n" +
                "2. A queue is used in process scheduling in the Operating System. " +
                "A series of processes wait in a queue waiting to be executed when required resources are free.\n");

        textView5.setText("Average Complexity of Operations");

        textView6.setText("Access\tSearch\t\tInsertion\t\tDeletion\t\tSpace\n" +
                "O(n)\t\t\tO(n)\t\t\tO(1)\t\t\t\t\tO(1)\t\t\t\t\tO(n)\n");

        textView7.setText("Properties");

        textView8.setText("1. Follows the FIFO (FIFO In First Out Order), " +
                "the first element that is inserted, is removed first.\n" +
                "2. Two pointers keep track of the front and rear of the queue, whenever insertion or deletion takes place, " +
                "these two pointers are updated accordingly to track the last and first element.\n" +
                "3. Insertion takes place from the rear and" +
                "deletion from the front.\n");

        textView9.setText("Types of Queues\n");

        textView10.setText("Queues and their functions can be modified to have some additional advantages, " +
                "some of the other types of queues are:\n");

        textView11.setText("1. Double Ended Queues (Deque)");

        textView12.setText("A deque is a list in which the elements can be inserted or deleted at either end. These are further of two types:\n" +
                "1. Input Restricted Queue: Where insertion takes place only from the rear end, deletion can take place from both ends.\n" +
                "2. Output Restricted Queue: Where deletion takes place from only the front, however insertion can take place from both ends.");

        textView13.setText("2. Priority Queues");

        textView14.setText("Priority queue is like a regular queue or stack data structure, but where additionally each element has a 'priority' associated with it. " +
                "In a priority queue, an element with high priority is served before an element with low priority.\n" +
                "This can be helped in operations where priority is important for executing operations in a certain order.");

        textView15.setText("3. Circular Queue (Circular Buffer)");

        textView16.setText("A circular queue is a queue that uses a single, fixed-size buffer as if it were connected end-to end.\n" +
                "Circular queue is a good implementation for a queue that has fixed maximum size, " +
                "as their is no shifting involved and the whole queue can be ed up for storing all the elements, " +
                "which is not possible in an array implementation of linear queue.\n");

        textView17.setText("Queue Manipulation Operations");

        textView18.setText("Queue has 2 main operations:\n");

        textView19.setText("1. Enqueue (Insert/Store) Operation");

        textView20.setText("When an element is inserted (or stored) into the queue, the operation is called Enqueue. " +
                "The rear pointer updates to the item just inserted to specify the now last element in the queue.\n");

        textView21.setText("2. Dequeue (Delete/Access) Operation");

        textView22.setText("When an element is deleted (or accessed) from the queue, the operation is called Dequeue. " +
                "The front pointer updates to the item after the deleted item to specify the now first element in the queue.");
    }
}