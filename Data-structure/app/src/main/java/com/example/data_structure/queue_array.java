package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class queue_array extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue_array);

        TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12,textView13;

        textView1 = findViewById(R.id.queue_array_textview1);
        textView2 = findViewById(R.id.queue_array_textview2);
        textView3 = findViewById(R.id.queue_array_textview3);
        textView4 = findViewById(R.id.queue_array_textview4);
        textView5 = findViewById(R.id.queue_array_textview5);
        textView6 = findViewById(R.id.queue_array_textview6);
        textView7 = findViewById(R.id.queue_array_textview7);
        textView8 = findViewById(R.id.queue_array_textview8);
        textView9 = findViewById(R.id.queue_array_textview9);
        textView10 = findViewById(R.id.queue_array_textview10);
        textView11 = findViewById(R.id.queue_array_textview11);
        textView12 = findViewById(R.id.queue_array_textview12);
        textView13 = findViewById(R.id.queue_array_textview13);

        textView1.setText("Before the implementing actual operations");

        textView2.setText("Step 1: Include all the header files which are used in the program and define a constant 'SIZE' with specific value.\n" +
                "Step 2: Declare all the user defined functions which are used in queue implementation.\n" +
                "Step 3: Create a one dimensional array with above defined SIZE (int queue[SIZE]) \n" +
                "Step 4: Define two integer variables 'front' and 'rear' and initialize both with '-1'. (int front = -1, rear = -1)\n");

        textView3.setText("Enqueue Operation");

        textView4.setText("Step 1: Check whether queue is FULL. (rear == SIZE-1)\n" +
                "Step 2: If it is FULL, then display \"Overflow. Queue is Full.\" and terminate the function. \n" +
                "Step 3: If it is NOT FULL, then increment rear value by one (rear++) and set queue[rear] = value.");

        textView5.setText("Example Code");

        textView6.setText("void insert (int queue[], int max, int front, int rear, int item)   \n" +
                "{  \n" +
                "    if (rear + 1 == max)  \n" +
                "    {  \n" +
                "        printf(\"overflow\");  \n" +
                "    }  \n" +
                "    else  \n" +
                "    {  \n" +
                "        if(front == -1 && rear == -1)  \n" +
                "        {  \n" +
                "            front = 0;  \n" +
                "            rear = 0;  \n" +
                "        }  \n" +
                "        else  \n" +
                "        {  \n" +
                "            rear = rear + 1;   \n" +
                "        }  \n" +
                "        queue[rear]=item;  \n" +
                "    }  \n" +
                "}");

        textView7.setText("\nDequeue Operation");

        textView8.setText("Step 1: Check whether queue is EMPTY. (front == rear)\n" +
                "Step 2: If it is EMPTY, then display \"Underflow. Queue is Empty.\" and terminate the function.\n" +
                "Step 3: If it is NOT EMPTY, then increment the front value by one (front++). Then display queue[front] as deleted element. " +
                "Then check whether both front and rear are equal (front == rear), if it TRUE, then set both front and rear to '-1' (front = rear = -1).");

        textView9.setText("Example Code");

        textView10.setText("int delete (int queue[], int max, int front, int rear)  \n" +
                "{  \n" +
                "    int y;   \n" +
                "    if (front == -1 || front > rear)   \n" +
                "   \n" +
                "    {  \n" +
                "        printf(\"underflow\");  \n" +
                "    }  \n" +
                "    else   \n" +
                "    {  \n" +
                "        y = queue[front];  \n" +
                "        if(front == rear)  \n" +
                "        {  \n" +
                "            front = rear = -1;  \n" +
                "            else   \n" +
                "            front = front + 1;   \n" +
                "          \n" +
                "        }  \n" +
                "        return y;  \n" +
                "    }  \n" +
                "} ");

        textView11.setText("\nDriver Code with Menu");

        textView12.setText("Please include the required heading files and define the SIZE value to the size of queue required.");

        textView13.setText("void insert();  \n" +
                "void delete();  \n" +
                "void display();  \n" +
                "int front = -1, rear = -1;  \n" +
                "int queue[maxsize];  \n" +
                "void main ()  \n" +
                "{  \n" +
                "    int choice;   \n" +
                "    while(choice != 4)   \n" +
                "    {     \n" +
                "        printf(\"\\n*************************Main Menu*****************************\\n\");  \n" +
                "        printf(\"\\n=================================================================\\n\");  \n" +
                "        printf(\"\\n1.insert an element\\n2.Delete an element\\n3.Display the queue\\n4.Exit\\n\");  \n" +
                "        printf(\"\\nEnter your choice ?\");  \n" +
                "        scanf(\"%d\",&choice);  \n" +
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
                "    int item;  \n" +
                "    printf(\"\\nEnter the element\\n\");  \n" +
                "    scanf(\"\\n%d\",&item);      \n" +
                "    if(rear == maxsize-1)  \n" +
                "    {  \n" +
                "        printf(\"\\nOVERFLOW\\n\");  \n" +
                "        return;  \n" +
                "    }  \n" +
                "    if(front == -1 && rear == -1)  \n" +
                "    {  \n" +
                "        front = 0;  \n" +
                "        rear = 0;  \n" +
                "    }  \n" +
                "    else   \n" +
                "    {  \n" +
                "        rear = rear+1;  \n" +
                "    }  \n" +
                "    queue[rear] = item;  \n" +
                "    printf(\"\\nValue inserted \");  \n" +
                "}  \n" +
                "void delete()  \n" +
                "{  \n" +
                "    int item;   \n" +
                "    if (front == -1 || front > rear)  \n" +
                "    {  \n" +
                "        printf(\"\\nUNDERFLOW\\n\");  \n" +
                "        return;  \n" +
                "              \n" +
                "    }  \n" +
                "    else  \n" +
                "    {  \n" +
                "        item = queue[front];  \n" +
                "        if(front == rear)  \n" +
                "        {  \n" +
                "            front = -1;  \n" +
                "            rear = -1 ;  \n" +
                "        }  \n" +
                "        else   \n" +
                "        {  \n" +
                "            front = front + 1;  \n" +
                "        }  \n" +
                "        printf(\"\\nvalue deleted \");  \n" +
                "    }  \n" +
                "}  \n" +
                "void display()  \n" +
                "{  \n" +
                "    int i;  \n" +
                "    if(rear == -1)  \n" +
                "    {  \n" +
                "        printf(\"\\nEmpty queue\\n\");  \n" +
                "    }  \n" +
                "    else  \n" +
                "    {   printf(\"\\nprinting values .....\\n\");  \n" +
                "        for(i=front;i<=rear;i++)  \n" +
                "        {  \n" +
                "            printf(\"\\n%d\\n\",queue[i]);  \n" +
                "        }     \n" +
                "    }  \n" +
                "}  ");
    }
}