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

public class stack_introduction extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    MenuItem item;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack_introduction);

        drawerLayout = findViewById(R.id.stack_introduction);
        navigationView = findViewById(R.id.Stack_Navigation1);
        toolbar = findViewById(R.id.Stack_Toolbar1);
        textView1 = findViewById(R.id.stack_textview1);
        textView2 = findViewById(R.id.stack_textview2);
        textView3 = findViewById(R.id.stack_textview3);
        textView4 = findViewById(R.id.stack_textview4);
        textView5 = findViewById(R.id.stack_textview5);
        textView6 = findViewById(R.id.stack_textview6);
        textView7 = findViewById(R.id.stack_textview7);
        textView8 = findViewById(R.id.stack_textview8);
        textView9 = findViewById(R.id.stack_textview10);
        textView10 = findViewById(R.id.stack_textview11);
        textView11 = findViewById(R.id.stack_textview12);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            switch (id){
                case R.id.Home_Menu:
                    startActivity(new Intent(stack_introduction.this,MainActivity.class));
                    break;

                case R.id.queue:
                    startActivity(new Intent(stack_introduction.this,Queue.class));
                    break;

                case R.id.Array:
                    startActivity(new Intent(stack_introduction.this,Array.class));
                    break;

                case R.id.Linked_List:
                    startActivity(new Intent(stack_introduction.this,LinkedList.class));
                    break;

                case R.id.Stack:
                    startActivity(new Intent(stack_introduction.this,Stack.class));
                    break;

                case R.id.tree:
                    startActivity(new Intent(stack_introduction.this,tree.class));
                    break;

                case R.id.heap:
                    startActivity(new Intent(stack_introduction.this,Heap.class));
                    break;

                case R.id.aboutus:
                    startActivity(new Intent(stack_introduction.this,Aboutus.class));
                    break;

                case R.id.feedback:
                    startActivity(new Intent(stack_introduction.this,Feedback.class));
                    break;

                default:
                    return false;
            }
            return false;
        });

        textView1.setText("What Is Stack?\n");

        textView2.setText("A Stack Is A Linear Data Structure Which Stores Its Elements In Particular Order." +
                "This Order Followed By A Stack Is Known as LIFO(Last In First Out).\n" +
                "\nA Example Of Real Life Phenomena of Stacks Is of plates stacked over one Another On a Table.\n" +
                "\nThe element which is at the top is the one to be removed, it is not possible to remove the last element " +
                "unless the above elements have been removed, Following one is the principle of Last In First Out.");

        textView3.setText("\nUse Of Stack In Programming");

        textView4.setText("1.UNDO functionality in text Editors:Are Based on a stack. Every Change in The Document " +
                "is Added To Stack And Upon an UNDO Request, the last change is referred by popping it from the stack\n" +
                "\n2.Parentheses Checker:The Ordered Manner Of The Stack Could Be used for checking the proper closing parentheses.\n" +
                "Every opening parentheses is pushed on to stack and for every correct parentheses, it is popped off.irregularities can" +
                "then be detected if they mismatch.\n" +
                "\n3.Expression Parsing:using stacks can help evaluate expressions faster using postfix or prefix notation.\n");

        textView5.setText("Average Complexity of Operations");

        textView6.setText("Access\tSearch\t\tInsertion\tDeletion\t\tSpace\n" +
                "O(n)\t\t\tO(n)\t\t\tO(1)\t\t\t\tO(1)\t\t\t\tO(n)\n");

        textView7.setText("Properties");

        textView8.setText("1. Follows LIFO (Last In First Out Order), the last element that is inserted is pushed out first.\n" +
                "2. A pointer keeps track of the stack's topmost" +
                "(or last) element. This is manipulated on the" + "basis of operations to be performed to know" +
                "keep track of most recent element.\n");

        textView9.setText("\nStack Manipulation Operations");

        textView10.setText("A Stack Has 3 Basic Operations that can Manipulate The Data.");

        textView11.setText("\n1.Push Operation\n" +
                "This is used to add (or push) an element to the stack. The element always gets added to the top of the current stack items.\n" +
                "\n2.Pop Operation\n" +
                "This is used to remove (or pop) an element from the stack. The element always gets popped off from the top of the stack.\n" +
                "\n3.Peek Operation\n" +
                "The peek operation is used to return the first element of the stack without removing the element. It is a variation of the pop operation.");
    }
}