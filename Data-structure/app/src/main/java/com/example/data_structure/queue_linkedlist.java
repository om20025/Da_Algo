package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class queue_linkedlist extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue_linkedlist);

        TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13;

        textView1 = findViewById(R.id.queue_linkedlist_textview1);
        textView2 = findViewById(R.id.queue_linkedlist_textview2);
        textView3 = findViewById(R.id.queue_linkedlist_textview3);
        textView4 = findViewById(R.id.queue_linkedlist_textview4);
        textView5 = findViewById(R.id.queue_linkedlist_textview5);
        textView6 = findViewById(R.id.queue_linkedlist_textview6);
        textView7 = findViewById(R.id.queue_linkedlist_textview7);
        textView8 = findViewById(R.id.queue_linkedlist_textview8);
        textView9 = findViewById(R.id.queue_linkedlist_textview9);
        textView10 = findViewById(R.id.queue_linkedlist_textview10);
        textView11 = findViewById(R.id.queue_linkedlist_textview11);
        textView12 = findViewById(R.id.queue_linkedlist_textview12);
        textView13 = findViewById(R.id.queue_linkedlist_textview13);

        textView1.setText("Before the implementing actual operations");

        textView2.setText("Step 1: Include all the header files which are used in the program.\n" +
                "Step 2: Define a 'Node' structure with two" +
                "members data and next.\n" +
                "Step 3: Define two Node pointers 'front' and 'rear' and set both to NULL.\n");

        textView3.setText("Enqueue Operation");

        textView4.setText("Step 1: Create a newNode with given value and set 'newNode → next' to NULL.\n" +
                "Step 2: Check whether queue is Empty" +
                "(rear NULL) ==\n" +
                "Step 3: If it is Empty then, set front = newNode and rear = newNode.\n" +
                "Step 4: If it is Not Empty then, set rear → next = newNode and rear = newNode");

        textView5.setText("Example Code");

        textView6.setText("void insert(struct node *ptr, int item; )  \n" +
                "{  \n" +
                "    ptr = (struct node *) malloc (sizeof(struct node));  \n" +
                "    if(ptr == NULL)  \n" +
                "    {  \n" +
                "        printf(\"\\nOVERFLOW\\n\");  \n" +
                "        return;  \n" +
                "    }  \n" +
                "    else  \n" +
                "    {   \n" +
                "        ptr -> data = item;  \n" +
                "        if(front == NULL)  \n" +
                "        {  \n" +
                "            front = ptr;  \n" +
                "            rear = ptr;   \n" +
                "            front -> next = NULL;  \n" +
                "            rear -> next = NULL;  \n" +
                "        }  \n" +
                "        else   \n" +
                "        {  \n" +
                "            rear -> next = ptr;  \n" +
                "            rear = ptr;  \n" +
                "            rear->next = NULL;  \n" +
                "        }  \n" +
                "    }  \n" +
                "}   ");

        textView7.setText("\nDequeue Operation");

        textView8.setText("Step 1: Create a newNode with given value" +
                "and set 'newNode → next' to NULL.\n" +
                "Step 2: Check whether queue is Empty" +
                "(rear NULL) ==\n" +
                "Step 3: If it is Empty then, set front = newNode and rear = newNode.\n" +
                "Step 4: If it is Not Empty then, set rear → next = newNode and rear = newNode.");

        textView9.setText("Example Code");

        textView10.setText("void delete (struct node *ptr)  \n" +
                "{  \n" +
                "    if(front == NULL)  \n" +
                "    {  \n" +
                "        printf(\"\\nUNDERFLOW\\n\");  \n" +
                "        return;  \n" +
                "    }  \n" +
                "    else   \n" +
                "    {  \n" +
                "        ptr = front;  \n" +
                "        front = front -> next;  \n" +
                "        free(ptr);  \n" +
                "    }  \n" +
                "}  ");

        textView11.setText("\nDriver Code with Menu");

        textView12.setText("Please include the required heading files and define the SIZE value to the size of queue required.");

        textView13.setText("struct node   \n" +
                "{  \n" +
                "    int data;   \n" +
                "    struct node *next;  \n" +
                "};  \n" +
                "struct node *front;  \n" +
                "struct node *rear;   \n" +
                "void insert();  \n" +
                "void delete();  \n" +
                "void display();  \n" +
                "void main ()  \n" +
                "{  \n" +
                "    int choice;   \n" +
                "    while(choice != 4)   \n" +
                "    {     \n" +
                "        printf(\"\\n*************************Main Menu*****************************\\n\");  \n" +
                "        printf(\"\\n=================================================================\\n\");  \n" +
                "        printf(\"\\n1.insert an element\\n2.Delete an element\\n3.Display the queue\\n4.Exit\\n\");  \n" +
                "        printf(\"\\nEnter your choice ?\");  \n" +
                "        scanf(\"%d\",& choice);  \n" +
                "        switch(choice)  \n" +
                "        {  \n" +
                "            case 1:  \n" +
                "            insert();  \n" +
                "            break;  \n" +
                "            case 2:  \n" +
                "            delete();  \n" +
                "            break;  \n" +
                "            case 3:  \n" +
                "            display();  \n" +
                "            break;  \n" +
                "            case 4:  \n" +
                "            exit(0);  \n" +
                "            break;  \n" +
                "            default:   \n" +
                "            printf(\"\\nEnter valid choice??\\n\");  \n" +
                "        }  \n" +
                "    }  \n" +
                "}  \n" +
                "void insert()  \n" +
                "{  \n" +
                "    struct node *ptr;  \n" +
                "    int item;   \n" +
                "      \n" +
                "    ptr = (struct node *) malloc (sizeof(struct node));  \n" +
                "    if(ptr == NULL)  \n" +
                "    {  \n" +
                "        printf(\"\\nOVERFLOW\\n\");  \n" +
                "        return;  \n" +
                "    }  \n" +
                "    else  \n" +
                "    {   \n" +
                "        printf(\"\\nEnter value?\\n\");  \n" +
                "        scanf(\"%d\",&item);  \n" +
                "        ptr -> data = item;  \n" +
                "        if(front == NULL)  \n" +
                "        {  \n" +
                "            front = ptr;  \n" +
                "            rear = ptr;   \n" +
                "            front -> next = NULL;  \n" +
                "            rear -> next = NULL;  \n" +
                "        }  \n" +
                "        else   \n" +
                "        {  \n" +
                "            rear -> next = ptr;  \n" +
                "            rear = ptr;  \n" +
                "            rear->next = NULL;  \n" +
                "        }  \n" +
                "    }  \n" +
                "}     \n" +
                "void delete ()  \n" +
                "{  \n" +
                "    struct node *ptr;  \n" +
                "    if(front == NULL)  \n" +
                "    {  \n" +
                "        printf(\"\\nUNDERFLOW\\n\");  \n" +
                "        return;  \n" +
                "    }  \n" +
                "    else   \n" +
                "    {  \n" +
                "        ptr = front;  \n" +
                "        front = front -> next;  \n" +
                "        free(ptr);  \n" +
                "    }  \n" +
                "}  \n" +
                "void display()  \n" +
                "{  \n" +
                "    struct node *ptr;  \n" +
                "    ptr = front;      \n" +
                "    if(front == NULL)  \n" +
                "    {  \n" +
                "        printf(\"\\nEmpty queue\\n\");  \n" +
                "    }  \n" +
                "    else  \n" +
                "    {   printf(\"\\nprinting values .....\\n\");  \n" +
                "        while(ptr != NULL)   \n" +
                "        {  \n" +
                "            printf(\"\\n%d\\n\",ptr -> data);  \n" +
                "            ptr = ptr -> next;  \n" +
                "        }  \n" +
                "    }  \n" +
                "}");
    }
}