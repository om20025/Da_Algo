package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class stack_linkedlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack_linkedlist);

        TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13;

        textView1 = findViewById(R.id.stack_linkedlist_textview1);
        textView2 = findViewById(R.id.stack_linkedlist_textview2);
        textView3 = findViewById(R.id.stack_linkedlist_textview3);
        textView4 = findViewById(R.id.stack_linkedlist_textview4);
        textView5 = findViewById(R.id.stack_linkedlist_textview5);
        textView6 = findViewById(R.id.stack_linkedlist_textview6);
        textView7 = findViewById(R.id.stack_linkedlist_textview7);
        textView8 = findViewById(R.id.stack_linkedlist_textview8);
        textView9 = findViewById(R.id.stack_linkedlist_textview9);
        textView10 = findViewById(R.id.stack_linkedlist_textview10);
        textView11 = findViewById(R.id.stack_linkedlist_textview11);
        textView12 = findViewById(R.id.stack_linkedlist_textview12);
        textView13 = findViewById(R.id.stack_linkedlist_textview13);

        textView1.setText("Before the implementing actual operations");

        textView2.setText("Step 1: Include all header files and the" +
                "main function.\n " +
                "Step 2: Define a 'Node' structure with two members data and next. " +
                "\nStep 3: Define a Node pointer 'top' and set it to NULL.\n");

        textView3.setText("Push Operation");

        textView4.setText("Step 1: Create a newNode with given value. Step 2: Check whether stack is Empty (top" +
                "== NULL)\n" +
                "Step 3: If it is Empty, then set newNode →" +
                "next = NULL.\n" +
                "Step 4: If it is Not Empty, then set newNode next = top." +
                "\n" +
                "Step 5: Finally, set top = newNode.");

        textView5.setText("Example Code");

        textView6.setText("void push ()  \n" +
                "{  \n" +
                "    int val;  \n" +
                "    struct node *ptr =(struct node*)malloc(sizeof(struct node));   \n" +
                "    if(ptr == NULL)  \n" +
                "    {  \n" +
                "        printf(\"not able to push the element\");   \n" +
                "    }  \n" +
                "    else   \n" +
                "    {  \n" +
                "        printf(\"Enter the value\");  \n" +
                "        scanf(\"%d\",&val);  \n" +
                "        if(head==NULL)  \n" +
                "        {         \n" +
                "            ptr->val = val;  \n" +
                "            ptr -> next = NULL;  \n" +
                "            head=ptr;  \n" +
                "        }   \n" +
                "        else   \n" +
                "        {  \n" +
                "            ptr->val = val;  \n" +
                "            ptr->next = head;  \n" +
                "            head=ptr;  \n" +
                "               \n" +
                "        }  \n" +
                "        printf(\"Item pushed\");  \n" +
                "    }  \n" +
                "}  ");

        textView7.setText("\nPop Operation");

        textView8.setText("Step 1: Check whether stack is EMPTY. (top == -1)\n" +
                "Step 2: If it is EMPTY, then output \"Underflow. Stack is empty\" and terminate the function." +
                "\n" +
                "Step 3: If it is NOT EMPTY, then delete stack[top] and decrement top value by one (top--).");

        textView9.setText("Example Code");

        textView10.setText("void display()  \n" +
                "{  \n" +
                "    int i;  \n" +
                "    struct node *ptr;  \n" +
                "    ptr=head;  \n" +
                "    if(ptr == NULL)  \n" +
                "    {  \n" +
                "        printf(\"Stack is empty\");  \n" +
                "    }  \n" +
                "    else  \n" +
                "    {  \n" +
                "        printf(\"Printing Stack elements \");  \n" +
                "        while(ptr!=NULL)  \n" +
                "        {  \n" +
                "            printf(\"%d\\n\",ptr->val);  \n" +
                "            ptr = ptr->next;  \n" +
                "        }  \n" +
                "    }  \n" +
                "}  ");

        textView11.setText("\nDriver Code with Menu");

        textView12.setText("Please include the required header files and define SIZE to the required size of the stack to run the program.");

        textView13.setText("#include <stdio.h>  \n" +
                "#include <stdlib.h>  \n" +
                "void push();  \n" +
                "void pop();  \n" +
                "void display();  \n" +
                "struct node   \n" +
                "{  \n" +
                "int val;  \n" +
                "struct node *next;  \n" +
                "};  \n" +
                "struct node *head;  \n" +
                "  \n" +
                "void main ()  \n" +
                "{  \n" +
                "    int choice=0;     \n" +
                "    printf(\"\\n*********Stack operations using linked list*********\\n\");  \n" +
                "    printf(\"\\n----------------------------------------------\\n\");  \n" +
                "    while(choice != 4)  \n" +
                "    {  \n" +
                "        printf(\"\\n\\nChose one from the below options...\\n\");  \n" +
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
                "                display();  \n" +
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
                "    };  \n" +
                "}  \n" +
                "}  \n" +
                "void push ()  \n" +
                "{  \n" +
                "    int val;  \n" +
                "    struct node *ptr = (struct node*)malloc(sizeof(struct node));   \n" +
                "    if(ptr == NULL)  \n" +
                "    {  \n" +
                "        printf(\"not able to push the element\");   \n" +
                "    }  \n" +
                "    else   \n" +
                "    {  \n" +
                "        printf(\"Enter the value\");  \n" +
                "        scanf(\"%d\",&val);  \n" +
                "        if(head==NULL)  \n" +
                "        {         \n" +
                "            ptr->val = val;  \n" +
                "            ptr -> next = NULL;  \n" +
                "            head=ptr;  \n" +
                "        }   \n" +
                "        else   \n" +
                "        {  \n" +
                "            ptr->val = val;  \n" +
                "            ptr->next = head;  \n" +
                "            head=ptr;  \n" +
                "               \n" +
                "        }  \n" +
                "        printf(\"Item pushed\");  \n" +
                "          \n" +
                "    }  \n" +
                "}  \n" +
                "  \n" +
                "void pop()  \n" +
                "{  \n" +
                "    int item;  \n" +
                "    struct node *ptr;  \n" +
                "    if (head == NULL)  \n" +
                "    {  \n" +
                "        printf(\"Underflow\");  \n" +
                "    }  \n" +
                "    else  \n" +
                "    {  \n" +
                "        item = head->val;  \n" +
                "        ptr = head;  \n" +
                "        head = head->next;  \n" +
                "        free(ptr);  \n" +
                "        printf(\"Item popped\");  \n" +
                "          \n" +
                "    }  \n" +
                "}  \n" +
                "void display()  \n" +
                "{  \n" +
                "    int i;  \n" +
                "    struct node *ptr;  \n" +
                "    ptr=head;  \n" +
                "    if(ptr == NULL)  \n" +
                "    {  \n" +
                "        printf(\"Stack is empty\\n\");  \n" +
                "    }  \n" +
                "    else  \n" +
                "    {  \n" +
                "        printf(\"Printing Stack elements \\n\");  \n" +
                "        while(ptr!=NULL)  \n" +
                "        {  \n" +
                "            printf(\"%d\",ptr->val);  \n" +
                "            ptr = ptr->next;  \n" +
                "        }  \n" +
                "    }  \n" +
                "} ");
    }
}