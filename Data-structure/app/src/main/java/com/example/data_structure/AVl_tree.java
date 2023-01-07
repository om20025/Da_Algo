package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AVl_tree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avl_tree);

        TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10;

        textView1 = findViewById(R.id.avl_textview1);
        textView2 = findViewById(R.id.avl_textview2);
        textView3 = findViewById(R.id.avl_textview3);
        textView4 = findViewById(R.id.avl_textview4);
        textView5 = findViewById(R.id.avl_textview5);
        textView6 = findViewById(R.id.avl_textview6);
        textView7 = findViewById(R.id.avl_textview7);
        textView8 = findViewById(R.id.avl_textview8);
        textView9 = findViewById(R.id.avl_textview9);


        textView1.setText("AVL Tree");

        textView2.setText("An AVL tree is a self-balancing binary search tree. " +
                "A binary tree is said to be balanced, if the difference between the heights of " +
                "left and right subtrees of every node in the tree is either -1,0 or +1. This is known as the Balance Factor.");

        textView3.setText("\nBalance Factor");

        textView4.setText("The balance factor can be calculated using the following formula:");

        textView5.setText("Balance Factor = height(left_subtree)");

        textView6.setText("\nRe-Balancing");

        textView7.setText("During a modifying operation (e.g. insert, delete), " +
                "if the height difference of more than 1 arises between two subtrees, the parent subtree has to be \"rebalanced\" to satisfy the AVL property.\n" +
                "\n" +
                "These are done by tree rotations, which moves the keys in such a manner that there order is preserved, " +
                "but the balance factor is also satisfied.");

        textView8.setText("AVL Tree Rotations");

        textView9.setText("Rotation is the process of moving the nodes to either left or right to make tree balanced. There are 4 types of rotations:\n" +
                "\n1. Single Left Rotation (LL Rotation)\n" +
                "2. Single Right Rotation (RR Rotation)\n" +
                "3. Left Right Rotation (LR Rotation)\n" +
                "4. Right Left Rotation (RL Rotation)");


    }
}