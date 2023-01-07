package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Heap_code extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heap_code);

        TextView textView7,textView8,textView9,textView10,textView11,textView12,textView13,textView14;

        textView7 = findViewById(R.id.heap_text7);
        textView8 = findViewById(R.id.heap_text8);
        textView9 = findViewById(R.id.heap_text9);
        textView10 = findViewById(R.id.heap_text10);
        textView11 = findViewById(R.id.heap_text11);
        textView12 = findViewById(R.id.heap_text12);
        textView13 = findViewById(R.id.heap_text13);
        textView14 = findViewById(R.id.heap_text14);


        textView7.setText("Operations On Heaps");

        textView8.setText("The following operations are performed on a heap data structure:\n");

        textView9.setText("Finding Maximum/Minimum");

        textView10.setText("Finding the node which has maximum or minimum value is easy. Due to the heap property, " +
                "it will be always the root node, hence we can access it in constant time\n");

        textView11.setText("\t\tInsertion");

        textView12.setText("The new heap would not necessarily satisfy the heap property, we have to make it satisfy the heap property." +
                "\n" +
                "Step 1: Insert the node like in a normal" +
                "tree.\n" +
                "Step 2: If the new Node is greater/lesser than its parent, swap it with it's parent.\n");

        textView13.setText("\t\tDeletion");

        textView14.setText("An element is always deleted from the root of the heap. So, deleting an element from the heap is done in the following three steps:\n" +
                "Step 1: Replace the root node's value with the last node's value.\n" +
                "Step 2: Delete the last node.\n" +
                "Step 3: Sink down the new root node's value so that the heap again satisfies the heap property.");
    }
}