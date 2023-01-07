package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class stack_array extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack_array);

        TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13;

        textView1 = findViewById(R.id.stack_array_textview1);
        textView2 = findViewById(R.id.stack_array_textview2);
        textView3 = findViewById(R.id.stack_array_textview3);
        textView4 = findViewById(R.id.stack_array_textview4);
        textView5 = findViewById(R.id.stack_array_textview5);
        textView6 = findViewById(R.id.stack_array_textview6);
        textView7 = findViewById(R.id.stack_array_textview7);
        textView8 = findViewById(R.id.stack_array_textview8);
        textView9 = findViewById(R.id.stack_array_textview9);
        textView10 = findViewById(R.id.stack_array_textview10);
        textView11 = findViewById(R.id.stack_array_textview11);
        textView12 = findViewById(R.id.stack_array_textview12);
        textView13 = findViewById(R.id.stack_array_textview13);

        textView1.setText("Before the implementing actual operations");

        textView2.setText("Step 1: Include all header files, define the main function and choose a size for the stack using #define SIZE 100\n" +
                "Step 2: Create a one dimensional array" +
                "with fixed size (int stack[SIZE])\n " +
                "Step 3: Define a integer variable 'top' and initialize with '-1'. (int top = -1)\n");

        textView3.setText("Push Operation");

        textView4.setText("Step 1: Check whether stack is FULL. (top == SIZE-1)\n" +
                "Step 2: If it is FULL, then terminate the function with output \"Stack is FULL, Insertion not possible\".\n" +
                "Step 3: If it is NOT FULL, then increment top value by one (top++) and set stack[top] to value (stack[top] = value).");

        textView5.setText("Example Code");

        textView6.setText("void push (int val,int n)\n" +
                "{  \n" +
                "    if (top == n )   \n" +
                "    printf(\"\\n Overflow\");   \n" +
                "    else   \n" +
                "    {  \n" +
                "    top = top +1;   \n" +
                "    stack[top] = val;   \n" +
                "    }   \n" +
                "} ");

        textView7.setText("\nPop Operation");

        textView8.setText("Step 1: Check whether stack is EMPTY. (top == -1)\n" +
                "Step 2: If it is EMPTY, then output \"Underflow. Stack is empty\" and terminate the function.\n" +
                "Step 3: If it is NOT EMPTY, then delete stack[top] and decrement top value by one (top--).");

        textView9.setText("Example Code");

        textView10.setText("int pop ()  \n" +
                "{   \n" +
                "    if(top == -1)   \n" +
                "    {  \n" +
                "        printf(\"Underflow\");  \n" +
                "        return 0;  \n" +
                "    }  \n" +
                "    else  \n" +
                "    {  \n" +
                "        return stack[top - - ];   \n" +
                "    }    \n" +
                "}   ");

        textView11.setText("\nDriver Code with Menu");

        textView12.setText("Please include the required header files and define SIZE to the required size of the stack to run the program.");

        textView13.setText("int stack[100],i,j,choice=0,n,top=-1;\n" +
                "void push();  \n" +
                "void pop();  \n" +
                "void show();  \n" +
                "void main ()  \n" +
                "{  \n" +
                "      \n" +
                "    printf(\"Enter the number of elements in the stack \");   \n" +
                "    scanf(\"%d\",&n);  \n" +
                "    printf(\"*********Stack operations using array*********\");  \n" +
                "  \n" +
                "printf(\"\\n----------------------------------------------\\n\");  \n" +
                "    while(choice != 4)  \n" +
                "    {  \n" +
                "        printf(\"Chose one from the below options...\\n\");  \n" +
                "        printf(\"\\n1.Push\\n2.Pop\\n3.Show\\n4.Exit\");  \n" +
                "        printf(\"\\n Enter your choice \\n\");        \n" +
                "        scanf(\"%d\",&choice);  \n" +
                "        switch(choice)  \n" +
                "        {  \n" +
                "            case 1:  \n" +
                "            {   \n" +
                "                push();  \n" +
                "                break;  \n" +
                "            }  \n" +
                "            case 2:  \n" +
                "            {  \n" +
                "                pop();  \n" +
                "                break;  \n" +
                "            }  \n" +
                "            case 3:  \n" +
                "            {  \n" +
                "                show();  \n" +
                "                break;  \n" +
                "            }  \n" +
                "            case 4:   \n" +
                "            {  \n" +
                "                printf(\"Exiting....\");  \n" +
                "                break;   \n" +
                "            }  \n" +
                "            default:  \n" +
                "            {  \n" +
                "                printf(\"Please Enter valid choice \");  \n" +
                "            }   \n" +
                "        };  \n" +
                "    }  \n" +
                "}   \n" +
                "  \n" +
                "void push ()  \n" +
                "{  \n" +
                "    int val;      \n" +
                "    if (top == n )   \n" +
                "    printf(\"\\n Overflow\");   \n" +
                "    else   \n" +
                "    {  \n" +
                "        printf(\"Enter the value?\");  \n" +
                "        scanf(\"%d\",&val);         \n" +
                "        top = top +1;   \n" +
                "        stack[top] = val;   \n" +
                "    }   \n" +
                "}   \n" +
                "  \n" +
                "void pop ()   \n" +
                "{   \n" +
                "    if(top == -1)   \n" +
                "    printf(\"Underflow\");  \n" +
                "    else  \n" +
                "    top = top -1;   \n" +
                "}   \n" +
                "void show()  \n" +
                "{  \n" +
                "    for (i=top;i>=0;i--)  \n" +
                "    {  \n" +
                "        printf(\"%d\\n\",stack[i]);  \n" +
                "    }  \n" +
                "    if(top == -1)   \n" +
                "    {  \n" +
                "        printf(\"Stack is empty\");  \n" +
                "    }  \n" +
                "}  ");
    }
}