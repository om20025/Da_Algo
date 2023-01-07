package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Array_code extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_code);

        TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13;
        TextView textView14,textView15,textView16,textView17;

        textView1 = findViewById(R.id.code_array_textview1);
        textView2 = findViewById(R.id.code_array_textview2);
        textView3 = findViewById(R.id.code_array_textview3);
        textView4 = findViewById(R.id.code_array_textview4);
        textView5 = findViewById(R.id.code_array_textview5);
        textView6 = findViewById(R.id.code_array_textview6);
        textView7 = findViewById(R.id.code_array_textview7);
        textView8 = findViewById(R.id.code_array_textview8);
        textView9 = findViewById(R.id.code_array_textview9);
        textView10 = findViewById(R.id.code_array_textview10);
        textView11 = findViewById(R.id.code_array_textview11);
        textView12 = findViewById(R.id.code_array_textview12);
        textView13 = findViewById(R.id.code_array_textview13);
        textView14 = findViewById(R.id.code_array_textview14);
        textView15 = findViewById(R.id.code_array_textview15);
        textView16 = findViewById(R.id.code_array_textview16);
        textView17 = findViewById(R.id.code_array_textview17);


        textView1.setText("Array Operations\n");

        textView2.setText("There are 3 main operations that can be performed in an array:");

        textView3.setText("1. Insert Operation");

        textView4.setText("An insertion operation in an array requires us to know the index where the element is to be inserted\n" +
                "\n1. If the element is at the end, then it could be directly entered at that position by assigning it to that index.\n" +
                "2. If the position to be inserted is in-between already present elements of an array, " +
                "then we have to shift all the elements next to the element to be inserted one place after. " +
                "This is a limitation of an array as the memory assigned" +
                "to an array is continuous.");

        textView5.setText("Example Code");

        textView6.setText("void insert_position(int arr[]) {\n" +
                "    int i = 0, pos, num;\n" +
                "    printf(\"Enter the number to be inserted : \");\n" +
                "    scanf(\"%d\", &num);\n" +
                "    printf(\"Enter position at which the number is to be added :\");\n" +
                "    scanf(\"%d\", &pos);\n" +
                "    for (i = n-1; i>= pos; i--)\n" +
                "        arr[i+1] = arr[i];\n" +
                "    arr[pos] = num;\n" +
                "    n = n + 1;  // increase total number of used positions\n" +
                "    display_array(arr);\n" +
                "}");

        textView7.setText("2. Delete Operation");

        textView8.setText("This is similar to the insertion operation, we need to know the index of the element to be deleted.\n" +
                "1. If the element is at the end, then it could be directly deleted (or overwritten) at that position.\n" +
                "2. If the position to be deleted is in-between already present elements of an array, " +
                "then we have to shift all the elements next to the element to be deleted one place ahead.");

        textView9.setText("Example Code");

        textView10.setText("void delete_position(int arr[]) {\n" +
                "    int i, pos;\n" +
                "    printf(\"\\nEnter the position where the number has to be deleted: \");\n" +
                "    scanf(\"%d\", &pos);\n" +
                "    for (i = pos; i < n-1; i++)\n" +
                "        arr[i] = arr[i+1];\n" +
                "    n = n - 1;  // decrease total number of used positions\n" +
                "    display_array(arr);\n" +
                "}");

        textView11.setText("3. Access Operation");

        textView12.setText("Any array element could be accessed directly by using the reszpective indices.\n" +
                "\n" +
                "One Dimensional Array:\n" +
                "One-dimensional arrays could be accessed with" +
                "one loop.");

        textView13.setText("Example Code");

        textView14.setText("void display_oneD_array(int arr[100])\n" +
                "{\n" +
                "   int i; 5\n" +
                "   for(i=0; i<n; i++) printf(\"\\n_arr[%d] = %d\", i, arr[i])\n" +
                "}");

        textView15.setText("\nMulti Dimensional Array:\n" +
                "A multi-dimensional array could be accessed by" +
                "nesting multiple loops.");

        textView16.setText("Example Code");

        textView17.setText("Void Display_twoD_array(int arr[100][100], int n)\n" +
                "{" +
                "\n Int i,j;" +
                "\n for(i=0;i<n;i++)" +
                "\n {" +
                "\n   for(j=0;j<n;j++)" +
                "\n   {" +
                "\n     printf(\"arr[%d][%d] = %d,i,j,arr[i][j])" +
                "\n    }" +
                "\n   printf(\"\\n\")" +
                "\n  }" +
                "\n}");
    }
}