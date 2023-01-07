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

public class linkedlist_intro extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    MenuItem item;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11;
    TextView textView12,textView13,textView14,textView15,textView16,textView17,textView18,textView19;
    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkedlist_intro);

        drawerLayout = findViewById(R.id.linkedlist_intro);
        navigationView = findViewById(R.id.linkedlist_intro_navigation);
        toolbar = findViewById(R.id.linkedlist_intro_toolbar);
        textView1 = findViewById(R.id.link_text1);
        textView2 = findViewById(R.id.link_text2);
        textView3 = findViewById(R.id.link_text3);
        textView4 = findViewById(R.id.link_text4);
        textView5 = findViewById(R.id.link_text5);
        textView6 = findViewById(R.id.link_text6);
        textView7 = findViewById(R.id.link_text7);
        textView8 = findViewById(R.id.link_text8);
        textView9 = findViewById(R.id.link_text9);
        textView10 = findViewById(R.id.link_text10);
        textView11 = findViewById(R.id.link_text11);
        textView12 = findViewById(R.id.link_text12);
        textView13 = findViewById(R.id.link_text13);
        textView14 = findViewById(R.id.link_text14);
        textView15 = findViewById(R.id.link_text15);
        textView16 = findViewById(R.id.link_text16);
        textView17 = findViewById(R.id.link_text17);
        textView18 = findViewById(R.id.link_text18);
        textView19 = findViewById(R.id.link_text19);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            switch (id){
                case R.id.Home_Menu:
                    startActivity(new Intent(linkedlist_intro.this,MainActivity.class));
                    break;

                case R.id.queue:
                    startActivity(new Intent(linkedlist_intro.this,Queue.class));
                    break;

                case R.id.Array:
                    startActivity(new Intent(linkedlist_intro.this,Array.class));
                    break;

                case R.id.Linked_List:
                    startActivity(new Intent(linkedlist_intro.this,LinkedList.class));
                    break;

                case R.id.Stack:
                    startActivity(new Intent(linkedlist_intro.this,Stack.class));
                    break;

                case R.id.tree:
                    startActivity(new Intent(linkedlist_intro.this,tree.class));
                    break;

                case R.id.heap:
                    startActivity(new Intent(linkedlist_intro.this,Heap.class));
                    break;

                case R.id.aboutus:
                    startActivity(new Intent(linkedlist_intro.this,Aboutus.class));
                    break;

                case R.id.feedback:
                    startActivity(new Intent(linkedlist_intro.this,Feedback.class));
                    break;

                default:
                    return false;
            }
            return false;
        });

        textView1.setText("What is a linked list?");

        textView2.setText("A linked list is a linear data structure where each element is a separate object, " +
                "known as a node. Each node contains some data and points to the next node in the structure, " +
                "forming a sequence.\n" +
                "\n" +
                "This structure allows for efficient insertion or removal of elements from any " +
                "position as only the link is needed to be modified to point to some other element.");

        textView3.setText("The Node");

        textView4.setText("Each node in its basic contains has two portions: the data, " +
                "and references to the next node in the sequence.\n" +
                "\n" +
                "In C, we define Node as a structure that has the data and the reference pointer information.");

        textView5.setText("struct node\n" +
                "{ \n\tint data;\n struct node *next;\n};");

        textView6.setText("Advantages over an array");

        textView7.setText("1. Not Fixed in Size: Linked lists are not fixed" +
                "in size unlike that of arrays, hence they can grow and shrink depending on the data to be inserted. " +
                "Only the amount of memory required to store the data is used." +
                "\n" +
                "2. Efficient Insertion and Deletion: Insertion and deletion are efficient and take constant time as only the links are manipulated, " +
                "not the actual memory location of the actual elements.");

        textView8.setText("Disadvantages over an array");

        textView9.setText("1. Slightly more memory usage: as each"+
                "element has to store its data along with the" +
                "reference information.\n" +
                "2. Sequential Access: Nodes in a linked list must be read in order from " +
                "the beginning as linked lists are inherently sequential access.\n" +
                "3. Difficult reverse traversal: Difficulties arise in linked lists when it comes to reverse traversing in a singly linked list. This can be resolved using doubly linked lists, " +
                "but this again increases memory as we have to store the previous reference pointer.");

        textView10.setText("Complexity of Operations");

        textView11.setText("Access\tSearch\t\tInsertion\t\tDeletion\t\tSpace\n" +
                "O(n)\t\t\tO(n)\t\t\tO(1)\t\t\t\t\tO(1)\t\t\t\t\tO(n)");

        textView12.setText("Accessing an element in a Linked List");

        textView13.setText("An element in a linked list cannot be accessed directly, unlike an array. Thus, " +
                "one has to traverse from one end of the linked list to the element that has to be accessed.\n" +
                "\n" +
                "This is what causes the average O(n) search and access time in a linked list. " +
                "Insertion and deletion on the other hand is constant time as only a few pointers have to be modified.");

        textView14.setText("Uses of a Linked List");

        textView15.setText("1. Implement other data structures: It is"+
                "used to implement other data structures such as stacks, queues and non-linear ones like trees and graphs.\n" +
                "2. Hash Chaining: It has uses in hash chaining" +
                "for the implementation in open chaining.");

        textView16.setText("Types");

        textView17.setText("Singly Linked List\nEvery node has one pointer: -next");
        textView18.setText("Doubly Linked List\nEvery node has two pointer:next and previous");
        textView19.setText("Circular Linked List\nLast Node Connects to the First node,forming a loop");


        textView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(linkedlist_intro.this,singly_linkedlist.class));
            }
        });

        textView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(linkedlist_intro.this,doubly_linkedlist.class));
            }
        });

        textView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(linkedlist_intro.this,circular_linkedlist.class));
            }
        });
    }
}