package com.example.data_structure;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class tree_intro extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    MenuItem item;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11;
    TextView textView12,textView13,textView14,textView15,textView16,textView17,textView18,textView19,textView20,textView21,textView22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree_intro);

        drawerLayout = findViewById(R.id.tree_intro);
        navigationView = findViewById(R.id.tree_intro_navigation);
        toolbar = findViewById(R.id.tree_intro_toolbar);
        textView1 = findViewById(R.id.tree_text1);
        textView2 = findViewById(R.id.tree_text2);
        textView3 = findViewById(R.id.tree_text3);
        textView4 = findViewById(R.id.tree_text4);
        textView5 = findViewById(R.id.tree_text5);
        textView6 = findViewById(R.id.tree_text6);
        textView7 = findViewById(R.id.tree_text7);
        textView8 = findViewById(R.id.tree_text8);
        textView9 = findViewById(R.id.tree_text9);
        textView10 = findViewById(R.id.tree_text10);
        textView11 = findViewById(R.id.tree_text11);
        textView12 = findViewById(R.id.tree_text12);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            switch (id){
                case R.id.Home_Menu:
                    startActivity(new Intent(tree_intro.this,MainActivity.class));
                    break;

                case R.id.queue:
                    startActivity(new Intent(tree_intro.this,Queue.class));
                    break;

                case R.id.Array:
                    startActivity(new Intent(tree_intro.this,Array.class));
                    break;

                case R.id.Linked_List:
                    startActivity(new Intent(tree_intro.this,LinkedList.class));
                    break;

                case R.id.Stack:
                    startActivity(new Intent(tree_intro.this,Stack.class));
                    break;

                case R.id.tree:
                    startActivity(new Intent(tree_intro.this,tree.class));
                    break;

                case R.id.heap:
                    startActivity(new Intent(tree_intro.this,Heap.class));
                    break;

                case R.id.aboutus:
                    startActivity(new Intent(tree_intro.this,Aboutus.class));
                    break;

                case R.id.feedback:
                    startActivity(new Intent(tree_intro.this,Feedback.class));
                    break;

                default:
                    return false;
            }
            return false;
        });

        textView1.setText("What is a tree?");

        textView2.setText("A tree is a widely used data structure that simulates a hierarchical tree structure, " +
                "with a root value and the subtrees as children, represented as a set of linked nodes. " +
                "The children of each node could be accessed by traversing the tree until the specific value is reached.");

        textView3.setText("Advantages of trees");

        textView4.setText("1. Trees (with some ordering e.g., BST) provide moderate access/search (quicker than a Linked List).\n" +
                "2. Trees provide moderate insertion/deletion (quicker than Arrays) speed.");

        textView5.setText("Uses in programming");

        textView6.setText("1. File System structure: directories and subdirectories of a file system can be efficiently be represented by trees.\n" +
                "2. DOM structure: HTML pages are rendered using a DOM structure which contains all the tags used in the page under a tree-like structure.\n" +
                "3. Router algorithms: use trees to figure out a path for the data to follow efficiently.");

        textView7.setText("Terminology used in trees");

        textView8.setText("Root:\n" +
                "The first node in a tree is called as Root Node. Every tree must have one Root Node.\n" +
                "\nParent Node:\n" +
                "The node which is a predecessor of any node is called a Parent Node, that is, the node which has a branch from it to any other node is called as the Parent node.\n" +
                "\nChild Node:\n" +
                "The node which is descendant of any node is called as Child Node. Any parent node can have any number of child nodes. All the nodes except root are child nodes.\n" +
                "\nSiblings:\n" +
                "Nodes which belong to the same Parent are called as Siblings.\n" +
                "\nLeaf Node:\n" +
                "In a tree data structure, the node which does not have a child is called a Leaf Node. They are also known as External Nodes or Terminal Nodes.\n" +
                "\nInternal Nodes:\n" +
                "The node which has at least one child is called an Internal Node.\n" +
                "\nExternal Nodes:\n" +
                "The node which has no child is called an External Node.\n" +
                "\nDegree:\n" +
                "The total number of children of a node is called a Degree of that Node. The highest degree of a node among all the nodes in a tree is called the Degree of the tree.\n" +
                "\nLevel:\n" +
                "In a tree each step from top to bottom is called as a Level\n" +
                "\nHeight:\n" +
                "The total number of edges from the leaf node to a particular node in the longest path is called as Height of that Node.\n" +
                "\nDepth:\n" +
                "The total number of edges from root node to a particular node is called as DEPTH of that Node.\n" +
                "\nPath:\n" +
                "The sequence of Nodes and Edges from one node to another node is called as PATH between that two Nodes.\n");

        textView9.setText("Types of Tree");

        textView10.setText("Binary Search Tree");
        textView11.setText("Red Black Tree");
        textView12.setText("AVL Tree");

        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tree_intro.this,BST_tree.class));
            }
        });

        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tree_intro.this,RedBlack_tree.class));
            }
        });

        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tree_intro.this,AVl_tree.class));
            }
        });
    }
}