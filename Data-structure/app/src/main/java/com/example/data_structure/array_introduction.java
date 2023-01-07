package com.example.data_structure;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class array_introduction extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    MenuItem item;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11;
    TextView textView12,textView13,textView14,textView15,textView16,textView17,textView18,textView19,textView20,textView21;
    TextView textView22,textView23,textView24,textView25,textView26,textView27,textView28,textView29,textView30,textView31;
    TextView textView32,textView33,textView34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_introduction);

        drawerLayout = findViewById(R.id.array_introduction);
        navigationView = findViewById(R.id.array_Navigation1);
        toolbar = findViewById(R.id.array_Toolbar1);
        textView1 = findViewById(R.id.arr_textview1);
        textView2 = findViewById(R.id.arr_textview2);
        textView3 = findViewById(R.id.arr_textview3);
        textView4 = findViewById(R.id.arr_textview4);
        textView5 = findViewById(R.id.arr_textview5);
        textView6 = findViewById(R.id.arr_textview6);
        textView7 = findViewById(R.id.arr_textview7);
        textView8 = findViewById(R.id.arr_textview8);
        textView9 = findViewById(R.id.arr_textview9);
        textView10 = findViewById(R.id.arr_textview10);
        textView11 = findViewById(R.id.arr_textview11);
        textView12 = findViewById(R.id.arr_textview12);
        textView13 = findViewById(R.id.arr_textview13);
        textView14 = findViewById(R.id.arr_textview14);
        textView15 = findViewById(R.id.arr_textview15);
        textView16 = findViewById(R.id.arr_textview16);
        textView17 = findViewById(R.id.arr_textview17);
        textView18 = findViewById(R.id.arr_textview18);
        textView19 = findViewById(R.id.arr_textview19);
        textView20 = findViewById(R.id.arr_textview20);
        textView21 = findViewById(R.id.arr_textview21);
        textView22 = findViewById(R.id.arr_textview22);
        textView23 = findViewById(R.id.arr_textview23);
        textView24 = findViewById(R.id.arr_textview24);
        textView25 = findViewById(R.id.arr_textview25);
        textView26 = findViewById(R.id.arr_textview26);
        textView27 = findViewById(R.id.arr_textview27);
        textView28 = findViewById(R.id.arr_textview28);
        textView29 = findViewById(R.id.arr_textview29);
        textView30 = findViewById(R.id.arr_textview30);
        textView31 = findViewById(R.id.arr_textview31);
        textView32 = findViewById(R.id.arr_textview32);
        textView33 = findViewById(R.id.arr_textview33);
        textView34 = findViewById(R.id.arr_textview34);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            switch (id){
                case R.id.Home_Menu:
                    startActivity(new Intent(array_introduction.this,MainActivity.class));
                    break;

                case R.id.queue:
                    startActivity(new Intent(array_introduction.this,Queue.class));
                    break;

                case R.id.Array:
                    startActivity(new Intent(array_introduction.this,Array.class));
                    break;

                case R.id.Linked_List:
                    startActivity(new Intent(array_introduction.this,LinkedList.class));
                    break;

                case R.id.Stack:
                    startActivity(new Intent(array_introduction.this,Stack.class));
                    break;

                case R.id.tree:
                    startActivity(new Intent(array_introduction.this,tree.class));
                    break;

                case R.id.heap:
                    startActivity(new Intent(array_introduction.this,Heap.class));
                    break;

                case R.id.aboutus:
                    startActivity(new Intent(array_introduction.this,Aboutus.class));
                    break;

                case R.id.feedback:
                    startActivity(new Intent(array_introduction.this,Feedback.class));
                    break;

                default:
                    return false;
            }
            return false;
        });

        textView1.setText("What is an array?");

        textView2.setText("An array holds a fixed number of similar elements that are stored under one name. " +
                "These elements are stored in contagious memory locations.\n" +
                "\nMost modern programming languages have arrays built-in by default.");

        textView3.setText("Why use arrays over variables?");

        textView4.setText("Consider a case where we have to store the marks of all students in an university.\n" +
                "\n" +
                "We could do this without using arrays (using variables), but considering the large number of students, " +
                "we would have to declare a large number variables and then access each of them separately. This is extremely tedious.\n" +
                "\n" +
                "In these cases, an array is preferred as it can hold the same type of data (here, marks of the type integer). " +
                "Every student's marks can be accessed by iterating through the indices of the array.");

        textView5.setText("Properties");

        textView6.setText("1. An array is a data type which can store" +
                "multiple values of same data type at a time.\n 2. The items are stored in continuous memory" +
                "locations with a single name.\n" +
                "3. Arrays cannot be resized dynamically. This" +
                "may cause memory assigned to be wasted or" +
                "insufficient.\n" + "4. The access time of each element is constant, that is O(1).");

        textView7.setText("Complexity of operations in Array");

        textView8.setText("Access\tSearch\t\tInsertion\tDeletion\t\tSpace\n" +
                "O(1)\t\t\tO(n)\t\t\tO(n)\t\t\t\tO(n)\t\t\t\tO(n)");

        textView9.setText("Declaring an Array");

        textView10.setText("1. data type: the kind of values it can store, e.g, int, char, float\n" +
                "2. name: used to identify the array\n" +
                "3. size: maximum number of values the array can store\n" +
                "The syntax for declaring an array is as follows:");

        textView11.setText("datatype name[size];");

        textView12.setText("Calculating the Address of Array Elements");

        textView13.setText("Since an array stores all its data elements in consecutive memory locations, " +
                "storing just the base address, that is, the address of the first element in the array, is sufficient.\n" +
                "The address of other data elements can be then calculated using the base address. A simple formula can be used:");

        textView14.setText("A[k] = Base_address(A) + size_of_element(K-lower_bound)");
        textView14.setMovementMethod(new ScrollingMovementMethod());

        textView15.setText("Multidimensional Arrays");

        textView16.setText("Multidimensional arrays can be defined in simple words as array of arrays.\n" +
                "Data in a two-dimensional array, for example, can be visualised as a table.\n" +
                "Each element in a multidimensional array can be accessed by specifying one or more indices.\n");

        textView17.setText("Declaring a 2D Array");

        textView18.setText("A 2D array can be declared using the following\n" +
                "syntax:");

        textView19.setText("type name[row_size][column_size]");

        textView20.setText("Accessing 2D Arrays");

        textView21.setText("A specific element in a 2D array could be accessed by defining the " +
                "row and column number of the element to be accessed:");

        textView22.setText("type name[row_number] [column_number]");

        textView23.setText("Representation of 2D arrays in memory");

        textView24.setText("In memory, a 2D array is always stored sequentially. " +
                "There are two ways of storing a two-dimensional array.\n" +
                "\n" +
                "The memory location of each element in the array could be found out by using the " +
                "respective formulas for both these methods.");

        textView25.setText("Row Major Form");

        textView26.setText("In the row major form, the elements are stored row by row. " +
                "The 'n' elements of the first row are stored in the first 'n' locations, " +
                "elements of the second row elements are stored in the next 'n' locations, and so on.");

        textView27.setText("Address(A[i][j]) = base_address + width {num_of_columns (i-1)+(j-1)}");

        textView28.setText("Column Major Form");

        textView29.setText("In the column major form, the elements are stored column by column. " +
                "The 'm' elements of the first column are stored in the first 'm' locations, " +
                "elements of the second column element are stored in the next 'm' locations, and so on.");

        textView30.setText("Address(A[i][j] = base_address + width {num_of_rows (j-1) + (i-1)}");

        textView31.setText("Array Operations");

        textView32.setText("There are 3 basic operations that can be performed in arrays:\n" +
                "1. Insertion: for adding a new element.\n" +
                "2. Deletion: for deleting an existing element.\n" +
                "3. Access: for accessing an existing element.");

        textView33.setText("Array Algorithms:");

        textView34.setText("Various Searching And Sorting Algorithm Could Be Performed in Arrays\n" +
                "Searching Algorithm:\n1.Linear Search\n2.Binary Search\n" +
                "Sorting Algorithm:\n1.Bubble Sort\n2.Insertion Sort\n3.Selection Sort\n4.Merge Sort\n5.Quick Sort");
    }
}