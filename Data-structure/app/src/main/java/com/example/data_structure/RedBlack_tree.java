package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class RedBlack_tree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_black_tree);

        TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10;

        textView1 = findViewById(R.id.redblack_textview1);
        textView2 = findViewById(R.id.redblack_textview2);
        textView3 = findViewById(R.id.redblack_textview3);
        textView4 = findViewById(R.id.redblack_textview4);
        textView5 = findViewById(R.id.redblack_textview5);
        textView6 = findViewById(R.id.redblack_textview6);


        textView1.setText("Red Black Tree");

        textView2.setText("The red-Black tree is a binary search tree. The prerequisite of the red-black tree is that we should know about the binary search tree. " +
                "In a binary search tree, the values of the nodes in the left subtree should be less than the value of the root node, " +
                "and the values of the nodes in the right subtree should be greater than the value of the root node.\n" +
                "\n" +
                "Each node in the Red-black tree contains an extra bit that represents a color to ensure that the tree is balanced during any operations performed on the tree like insertion, deletion, etc. " +
                "In a binary search tree, the searching, insertion and deletion take O(log2n) time in the average case, " +
                "O(1) in the best case and O(n) in the worst case.");

        textView3.setText("\nProperties of Red-Black tree");

        textView4.setText("1. It is a self-balancing Binary Search tree. Here, self-balancing means that it balances the tree itself by either doing the rotations or recoloring the nodes.\n" +
                "\n2. This tree data structure is named as a Red-Black tree as each node is either Red or Black in color. Every node stores one extra information known as a bit that represents the color of the node. For example, " +
                "0 bit denotes the black color while 1 bit denotes the red color of the node. Other information stored by the node is similar to the binary tree, i.e., data part, left pointer and right pointer.\n" +
                "\n3. In the Red-Black tree, the root node is always black in color.\n" +
                "\n4. In a binary tree, we consider those nodes as the leaf which have no child. In contrast, in the Red-Black tree, the nodes that have no child are considered the internal nodes and these nodes are connected to the NIL nodes that are always black in color. The NIL nodes are the leaf nodes in the Red-Black tree.\n" +
                "\n5. If the node is Red, then its children should be in Black color. In other words, " +
                "we can say that there should be no red-red parent-child relationship.\n" +
                "\n6. Every path from a node to any of its descendant's NIL node should have same number of black nodes.");

        textView5.setText("\nIs every AVL tree can be a Red-Black tree?");

        textView6.setText("\nYes, every AVL tree can be a Red-Black tree if we color each node either by Red or Black color. " +
                "But every Red-Black tree is not an AVL because the AVL tree is strictly height-balanced while the Red-Black tree is not completely height-balanced.");
    }
}