package com.example.data_structure;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class sorting extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    MenuItem item;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12;
    TextView textView13,textView14,textView15,textView16,textView17,textView18,textView19,textView20,textView21,textView22,textView23;
    TextView textView24,textView25,textView26,textView27,textView28,textView29,textView30,textView31,textView32,textView33,textView34,textView35,textView36;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorting);

        Button btn1,btn2,btn3,btn4,btn5;

        drawerLayout = findViewById(R.id.sorting);
        navigationView = findViewById(R.id.sorting_Navigation1);
        toolbar = findViewById(R.id.sorting_Toolbar1);
        textView1 = findViewById(R.id.sorting_textview1);
        textView2 = findViewById(R.id.sorting_textview2);
        textView3 = findViewById(R.id.sorting_textview3);
        textView4 = findViewById(R.id.sorting_textview4);
        textView5 = findViewById(R.id.sorting_textview5);
        textView6 = findViewById(R.id.sorting_textview6);
        textView7 = findViewById(R.id.sorting_textview7);
        textView8 = findViewById(R.id.sorting_textview8);
        textView9 = findViewById(R.id.sorting_textview9);
        textView10 = findViewById(R.id.sorting_textview10);
        textView11 = findViewById(R.id.sorting_textview11);
        textView12 = findViewById(R.id.sorting_textview12);
        textView13 = findViewById(R.id.sorting_textview13);
        textView14 = findViewById(R.id.sorting_textview14);
        textView15 = findViewById(R.id.sorting_textview15);
        textView16 = findViewById(R.id.sorting_textview16);
        textView17 = findViewById(R.id.sorting_textview17);
        textView18 = findViewById(R.id.sorting_textview18);
        textView19 = findViewById(R.id.sorting_textview19);
        textView20 = findViewById(R.id.sorting_textview20);
        textView21 = findViewById(R.id.sorting_textview21);
        textView22 = findViewById(R.id.sorting_textview22);
        textView23 = findViewById(R.id.sorting_textview23);
        textView24 = findViewById(R.id.sorting_textview24);
        textView25 = findViewById(R.id.sorting_textview25);
        textView26 = findViewById(R.id.sorting_textview26);
        textView27 = findViewById(R.id.sorting_textview27);
        textView28 = findViewById(R.id.sorting_textview28);
        textView29 = findViewById(R.id.sorting_textview29);
        textView30 = findViewById(R.id.sorting_textview30);
        textView31 = findViewById(R.id.sorting_textview31);
        textView32 = findViewById(R.id.sorting_textview32);
        textView33 = findViewById(R.id.sorting_textview33);
        textView34 = findViewById(R.id.sorting_textview34);
        textView35 = findViewById(R.id.sorting_textview35);
        textView36 = findViewById(R.id.sorting_textview36);


        btn2 = findViewById(R.id.btn_sorting_video2);
        btn1 = findViewById(R.id.btn_sorting_video1);
        btn3 = findViewById(R.id.btn_sorting_video3);
        btn4 = findViewById(R.id.btn_sorting_video4);
        btn5 = findViewById(R.id.btn_sorting_video5);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_open, R.string.navigation_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setNavigationItemSelectedListener(item -> {

            int id = item.getItemId();

            switch (id){
                case R.id.Home_Menu:
                    startActivity(new Intent(sorting.this,MainActivity.class));
                    break;

                case R.id.queue:
                    startActivity(new Intent(sorting.this,Queue.class));
                    break;

                case R.id.Array:
                    startActivity(new Intent(sorting.this,Array.class));
                    break;

                case R.id.Linked_List:
                    startActivity(new Intent(sorting.this,LinkedList.class));
                    break;

                case R.id.Stack:
                    startActivity(new Intent(sorting.this,Stack.class));
                    break;

                case R.id.tree:
                    startActivity(new Intent(sorting.this,tree.class));
                    break;

                case R.id.heap:
                    startActivity(new Intent(sorting.this,Heap.class));
                    break;

                case R.id.aboutus:
                    startActivity(new Intent(sorting.this,Aboutus.class));
                    break;

                case R.id.feedback:
                    startActivity(new Intent(sorting.this,Feedback.class));
                    break;

                case R.id.Visualization:
                    startActivity(new Intent(sorting.this,Visulization.class));
                    break;

                default:
                    return false;
            }
            return false;
        });

        textView1.setText("Sorting Operation");

        textView2.setText("Sorting is the process of arranging a list of elements in a particular order (Ascending or Descending). " +
                "Sorting is used to arrange data, and sometimes could be used to reduce complexity of other algorithms.");

        textView3.setText("\nTerminologies");

        textView4.setText("Internal/External Sorting");

        textView5.setText("In internal sorting all the data to sort is stored in memory all the time while sorting is in progress.\n" +
                "\n" +
                "In external sorting data is stored outside memory (like on disk) and only loaded into memory in small chunks. " +
                "External sorting is usually applied in cases when data can't fit into memory entirely.");

        textView6.setText("Stability of Sort");

        textView7.setText("A sorting algorithm is said to be stable if two objects with equal keys " +
                "appear in the same order in the sorted output as they appear in the unsorted input.\n" +
                "\n" +
                "A sorting algorithm is said to be unstable if there are two or more objects with equal keys " +
                "which don't appear in same order before and after sorting.");

        textView8.setText("\n1. Bubble Sort");

        textView9.setText("Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order. " +
                "The pass through the list is repeated until the list is sorted.\n");

        textView10.setText("Average Time Complexity: O(n^2)\n" +
                "Worst Time Complexity: " +
                "O(n^2) \nSpace Complexity: " +
                "0(1) \nStability: Stable");

        textView11.setText("\nExample Code");

        textView12.setText("#include <stdio.h>\n" +
                " \n" +
                "int main()\n" +
                "{\n" +
                "  int arr[100], n, i, j, temp;\n" +
                " \n" +
                "  printf(\"Enter number of elements\\n\");\n" +
                "  scanf(\"%d\", &n);\n" +
                " \n" +
                "  printf(\"Enter %d integers\\n\", n);\n" +
                " \n" +
                "  for (i = 0; i < n; i++)\n" +
                "    scanf(\"%d\", &arr[i]);\n" +
                " \n" +
                "  for (i = 0 ; i < n - 1; i++)\n" +
                "  {\n" +
                "    for (j = 0 ; j < n - i - 1; j++)\n" +
                "    {\n" +
                "      if (arr[j] > arr[j+1])\n" +
                "      {\n" +
                "        temp = arr[j];\n" +
                "        arr[j] = arr[j+1];\n" +
                "        arr[j+1] = temp;\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                " \n" +
                "  printf(\"Sorted list in ascending order:\\n\");\n" +
                " \n" +
                "  for (i = 0; i < n; i++)\n" +
                "     printf(\"%d\\n\", arr[i]);\n" +
                " \n" +
                "  return 0;\n" +
                "}");

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/ebXrV6vyYc8")));
                Log.i("Video", "Video Playing....");

            }
        });

        textView13.setText("\n2. Insertion Sort");

        textView14.setText("In insertion sort, every iteration moves an element from unsorted portion to " +
                "sorted portion until all the elements are sorted in the list. " +
                "An analogy of insertion sort is the sorting of a deck of cards with our hands.\n");

        textView15.setText("Average Time Complexity: O(n^2) \n" +
                "Worst Time Complexity: O(n^2) \n" +
                "Space Complexity: 0(1) \n" +
                "Stability: Stable\n");

        textView16.setText("Steps to perform\n" +
                "\n" +
                "Step 1: Assume that first element in the list is in its sorted portion of the list and remaining all elements are in unsorted portion.\n" +
                "Step 2: Take the first element from the unsorted list and insert that element into the sorted list in order specified (ascending or descending).\n" +
                "Step 3: Repeat the above process until all the elements from the unsorted list are moved into the sorted list.\n");

        textView17.setText("Example Code");

        textView18.setText("#include<stdio.h>\n" +
                "int main()\n" +
                "{\n" +
                "  int data[100],n,temp,i,j;\n" +
                "  printf(\"Enter number of elements to be sorted:\");\n" +
                "  scanf(\"%d\",&n);\n" +
                "  printf(\"Enter elements: \");\n" +
                "  for(i = 0; i < n; i++)\n" +
                "    scanf(\"%d\",&data[i]);\n" +
                "  for(i = 1; i < n; i++)\n" +
                "  {\n" +
                "    temp = data[i];\n" +
                "    j = i - 1;\n" +
                "    while(temp < data[j] && j>=0)\n" +
                "    {\n" +
                "      data[j + 1] = data[j];\n" +
                "      j = j - 1;\n" +
                "    }\n" +
                "    data[j + 1]=temp;\n" +
                "  }\n" +
                "  printf(\"Sorted array: \");\n" +
                "  for(i = 0; i < n; i++)\n" +
                "    printf(\"%d  \",data[i]);\n" +
                "    return 0;\n" +
                "}");

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Nc7MiAR3fWE")));
                Log.i("Video", "Video Playing....");

            }
        });

        textView19.setText("\n3. Selection Sort");

        textView20.setText("Selection sort is generally used for sorting files with very large records and small keys. " +
                "It selects the smallest (or largest) element in the array and then removes it to place in a new list. " +
                "Doing this multiple times would yield the sorted array.\n");

        textView21.setText("Average Time Complexity: O(n^2) \n" +
                "Worst Time Complexity: O(n^2) \n" +
                "Space Complexity: 0(1) \n" +
                "Stability: UnStable\n");

        textView22.setText("Steps to perform\n" +
                "\n" +
                "Step 1:Select the first element of the list.\n" +
                "Step 2:Compare the selected element with all other elements in the list.\n" +
                "Step 3:For every comparison, if any element is smaller (or larger) than selected element, swap these two elements.\n" +
                "Step 4:Repeat the same procedure with next position in the list till the entire list is sorted\n");

        textView23.setText("Example Code");

        textView24.setText("#include <stdio.h>\n" +
                " \n" +
                "int main()\n" +
                "{\n" +
                "  int array[100], n, pos, temp, i, j;\n" +
                " \n" +
                "  printf(\"Enter number of elements\\n\");\n" +
                "  scanf(\"%d\", &n);\n" +
                " \n" +
                "  printf(\"Enter the %d values\\n\", n);\n" +
                " \n" +
                "  for (i = 0; i < n; i++)\n" +
                "    scanf(\"%d\", &array[i]);\n" +
                " \n" +
                "  for (i = 0; i < (n - 1); i++)\n" +
                "  {\n" +
                "    pos = i;\n" +
                "   \n" +
                "    for (j = i + 1; j < n; j++)\n" +
                "    {\n" +
                "      if (array[pos] > array[j])\n" +
                "        pos = j;\n" +
                "    }\n" +
                "    if (pos != i)\n" +
                "    {\n" +
                "      temp = array[i];\n" +
                "      array[i] = array[pos];\n" +
                "      array[pos] = temp;\n" +
                "    }\n" +
                "  }\n" +
                " \n" +
                "  printf(\"Sorted list in ascending order:\\n\");\n" +
                " \n" +
                "  for (i = 0; i < n; i++)\n" +
                "    printf(\"%d\\n\", array[i]);\n" +
                " \n" +
                "  return 0;\n" +
                "}");

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/dTGNYiWVkFQ")));
                Log.i("Video", "Video Playing....");

            }
        });

        textView25.setText("\n4. Merge Sort");

        textView26.setText("Merge sort is a very efficient comparison-based sorting algorithm.\n" +
                "It is a divide-and-conquer algorithm, which works by repeatedly dividing the array in small parts and merging them again in the sorted order.\n");

        textView27.setText("Average Time Complexity: O(n log n) \n" +
                "Worst Time Complexity: O(n log n) \n" +
                "Space Complexity: 0(n) \n" +
                "Stability: Stable\n");

        textView28.setText("Steps to perform\n" +
                "\n" +
                "Step 1:Divide the unsorted list into n sub-lists, each containing 1 element.\n" +
                "Step 2:Repeatedly merge the sub-lists to produce new sorted sub-lists until only 1 sub-list remains. This will be the final sorted list.Code for merge sort\n");

        textView29.setText("Example Code");

        textView30.setText("void merge(int a[], int beg, int mid, int end)    \n" +
                "{    \n" +
                "    int i, j, k;  \n" +
                "    int n1 = mid - beg + 1;    \n" +
                "    int n2 = end - mid;    \n" +
                "      \n" +
                "    int LeftArray[n1], RightArray[n2]; //temporary arrays  \n" +
                "      \n" +
                "    for (int i = 0; i < n1; i++)    \n" +
                "    LeftArray[i] = a[beg + i];    \n" +
                "    for (int j = 0; j < n2; j++)    \n" +
                "    RightArray[j] = a[mid + 1 + j];    \n" +
                "      \n" +
                "    i = 0, \n" +
                "    j = 0;  \n" +
                "    k = beg; \n" +
                "      \n" +
                "    while (i < n1 && j < n2)    \n" +
                "    {    \n" +
                "        if(LeftArray[i] <= RightArray[j])    \n" +
                "        {    \n" +
                "            a[k] = LeftArray[i];    \n" +
                "            i++;    \n" +
                "        }    \n" +
                "        else    \n" +
                "        {    \n" +
                "            a[k] = RightArray[j];    \n" +
                "            j++;    \n" +
                "        }    \n" +
                "        k++;    \n" +
                "    }    \n" +
                "    while (i<n1)    \n" +
                "    {    \n" +
                "        a[k] = LeftArray[i];    \n" +
                "        i++;    \n" +
                "        k++;    \n" +
                "    }    \n" +
                "      \n" +
                "    while (j<n2)    \n" +
                "    {    \n" +
                "        a[k] = RightArray[j];    \n" +
                "        j++;    \n" +
                "        k++;    \n" +
                "    }    \n" +
                "} ");

        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Lx_njqgBIWI")));
                Log.i("Video", "Video Playing....");

            }
        });

        textView31.setText("\n5. Quick Sort");

        textView32.setText("Quick Sort is an efficient divide-and-conquer algorithm. " +
                "It divides a large list into two smaller sub-lists based on a pivot chosen, into smaller and larger elements. " +
                "Quick Sort then recursively does this to the sub-lists finally producing a sorted list.\n");

        textView33.setText("Average Time Complexity: O(n log n) \n" +
                "Worst Time Complexity: O(n^2) \n" +
                "Space Complexity: 0(log n) \n" +
                "Stability: UnStable\n");

        textView34.setText("Steps to perform\n" +
                "\n" +
                "Step 1: Pick an element, called the pivot.\n" +
                "Step 2: Partitioning: reorder the array so that all elements with values less than the pivot come before the pivot, " +
                "while all elements with values greater than the pivot come after it. After this partitioning, the pivot is in its final position. This is called the partition operation.\n" +
                "Step 3: Recursively apply the above steps to the sub-array of elements with smaller values and separately to the sub-array of elements with greater values.\n");

        textView35.setText("Example Code");

        textView36.setText("#include <stdio.h>\n" +
                "void swap(int a, int b) \n" +
                "{ \n" +
                "  int t = a; \n" +
                "  a = b; \n" +
                "  b = t; \n" +
                "} \n" +
                "int partition (int arr[], int low, int high) \n" +
                "{ \n" +
                "  int pivot = arr[high];   \n" +
                "  int i = (low - 1);   \n" +
                "  for (int j = low; j <= high- 1; j++) \n" +
                "  { \n" +
                "    if (arr[j] < pivot) \n" +
                "    { \n" +
                "      i++;   \n" +
                "      swap(&arr[i], &arr[j]); \n" +
                "    } \n" +
                "  } \n" +
                "  swap(&arr[i + 1], &arr[high]); \n" +
                "  return (i + 1); \n" +
                "} \n" +
                "  \n" +
                "void quick_sort(int arr[], int low, int high) \n" +
                "{ \n" +
                "  if (low < high) \n" +
                "  { \n" +
                "    int pi = partition(arr, low, high); \n" +
                "    quick_sort(arr, low, pi - 1);\n" +
                "    quick_sort(arr, pi + 1, high); \n" +
                "  } \n" +
                "} \n" +
                "int main()\n" +
                "{\n" +
                "  int a[100], n, i;\n" +
                "  printf(\"No. of elements to sort\");\n" +
                "  scanf(\"%d\", &n);\n" +
                "  printf(\"\\nEnter the elements:\\n\");\n" +
                "  for(i = 0; i < n; i++)\n" +
                "    scanf(\"%d\", &a[i]);\n" +
                "  quick_sort(a, 0, n - 1);\n" +
                "  printf(\"\\nArray after sorting:\");\n" +
                "  for(i = 0; i < n; i++)\n" +
                "    printf(\"%d \",a[i]);\n" +
                "  return 0;\n" +
                "}");

        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/e-h6tPOThzo")));
                Log.i("Video", "Video Playing....");

            }
        });
    }
}