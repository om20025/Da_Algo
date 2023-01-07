package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class singly_linkedlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singly_linkedlist);

        TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10;
        TextView textView11,textView12,textView13,textView14,textView15,textView16,textView17,textView18,textView19,textView20;
        TextView textView21,textView22;

        textView1 = findViewById(R.id.single_link_textview1);
        textView2 = findViewById(R.id.single_link_textview2);
        textView3 = findViewById(R.id.single_link_textview3);
        textView4 = findViewById(R.id.single_link_textview4);
        textView5 = findViewById(R.id.single_link_textview5);
        textView6 = findViewById(R.id.single_link_textview6);
        textView7 = findViewById(R.id.single_link_textview7);
        textView8 = findViewById(R.id.single_link_textview8);
        textView9 = findViewById(R.id.single_link_textview9);
        textView10 = findViewById(R.id.single_link_textview10);
        textView11 = findViewById(R.id.single_link_textview11);
        textView12 = findViewById(R.id.single_link_textview12);
        textView13 = findViewById(R.id.single_link_textview13);
        textView14 = findViewById(R.id.single_link_textview14);
        textView15 = findViewById(R.id.single_link_textview15);
        textView16 = findViewById(R.id.single_link_textview16);
        textView17 = findViewById(R.id.single_link_textview17);
        textView18 = findViewById(R.id.single_link_textview18);
        textView19 = findViewById(R.id.single_link_textview19);
        textView20 = findViewById(R.id.single_link_textview20);
        textView21 = findViewById(R.id.single_link_textview21);
        textView22 = findViewById(R.id.single_link_textview22);

        textView1.setText("Implementation");

        textView2.setText("A singly linked list is the simplest type of linked list in which every node contains some" +
                " data and a pointer to the next node. " +
                "A singly linked list allows traversal of data only in one way.\n");

        textView3.setText("Before the implementing actual operations");

        textView4.setText("Step 1: Include all the header files which are used in the program.\n" +
                "Step 2: Declare all the user defined" +
                "functions.\n" +
                "Step 3: Define a Node structure with two members data and next. Step 4: Define a Node pointer 'head' and set it to NULL.\n");

        textView5.setText("Inserting at Beginning");

        textView6.setText("Step 1: Create a newNode with given value. \nStep 2: Check whether list is Empty (head == = NULL)\n" +
                "Step 3: If it is Empty then, set newNode → next = NULL and head = newNode.\n" +
                "Step 4: If it is Not Empty then, set newNode → next = head and head = newNode.\n" +
                "\n" +
                "Example Code");

       textView7.setText("void insertAtBeginning(int value)\n" +
               "{\n" +
               "   struct Node *newNode;\n" +
               "   newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
               "   newNode->data = value;\n" +
               "   if(head == NULL)\n" +
               "   {\n" +
               "      newNode->next = NULL;\n" +
               "      head = newNode;\n" +
               "   }\n" +
               "   else\n" +
               "   {\n" +
               "      newNode->next = head;\n" +
               "      head = newNode;\n" +
               "   }\n" +
               "   printf(\"\\nNode inserted successfully at beginning\\n\");\n" +
               "}");

       textView8.setText("\nInserting at End");

       textView9.setText("Step 1: Create a newNode with given value and newNode → next as NULL.\n " +
               "Step 2: Check whether list is Empty (head" +
               "= NULL).\n" +
               "Step 3: If it is Empty then, set head = newNode.\n" +
               "Step 4: If it is Not Empty then, define a" +
               "node pointer temp and initialize with head.\n" +
               "Step 5: Keep moving the temp to its next node until it reaches to the last node in the list (until temp next is equal to NULL). Step 6: Set temp next = newNode.\n" +
               "Example Code");

       textView10.setText("void insertAtEnd(int value)\n" +
               "{\n" +
               "   struct Node *newNode;\n" +
               "   newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
               "   newNode->data = value;\n" +
               "   newNode->next = NULL;\n" +
               "   if(head == NULL)\n" +
               "      head = newNode;\n" +
               "   else\n" +
               "   {\n" +
               "      struct Node *temp = head;\n" +
               "      while(temp->next != NULL)\n" +
               "  temp = temp->next;\n" +
               "      temp->next = newNode;\n" +
               "   }\n" +
               "   printf(\"\\nNode inserted successfully at end\\n\");\n" +
               "}");

       textView11.setText("Inserting at a specific " +
               "position");

       textView12.setText("Step 1: Create a newNode with given value.\n" +

               "Step 2: Check whether list is Empty (head" +
               "== NULL)\n" +
               "Step 3: If it is Empty then, set newNode → next = NULL and head = newNode.\n" +
               "Step 4: If it is Not Empty then, define a" +
               "node pointer temp and initialize with head.\n " +
               "Step 5: Keep moving the temp to its next node until it reaches to the node after which we " +
               "want to insert the newNode (run a for loop till position - 1).\n" +
               "Step 6: Finally, Set newNode → next = temp next and temp next = newNode\n" +
               "\n" +
               "Example Code");

       textView13.setText("void insertPosition(int value, int pos)\n" +
               "{\n" +
               "   int i = 0;\n" +
               "   struct Node *newNode;\n" +
               "   newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
               "   newNode->data = value;\n" +
               "   if(head == NULL)\n" +
               "   {\n" +
               "      newNode->next = NULL;\n" +
               "      head = newNode;\n" +
               "   }\n" +
               "   else {\n" +
               "        struct Node *temp = head;\n" +
               "        for (i = 0; i < pos - 1; i++) {\n" +
               "            temp = temp-> next;\n" +
               "        }\n" +
               "        newNode->next = temp->next;\n" +
               "        temp->next = newNode;\n" +
               "   }\n" +
               "   printf(\"\\nNode inserted successfully\\n\");\n" +
               "}");

       textView14.setText("Deletion at Beginning");

       textView15.setText("Step 1: Check whether list is Empty (head == NULL)" +
               "\n" +
               "Step 2: If it is Empty then, display 'List is Empty!!! Deletion is not possible' and terminate the function.\n" +
               "Step 3: If it is Not Empty then, define a Node pointer 'temp' and initialize with head.\n" +
               "Step 4: Check whether list is having only" +
               "one node (temp-> next == NULL)" +
               "\n" +
               "Step 5: If it is TRUE then set head = NULL and delete temp\n" +
               "Step 6: If it is FALSE then set head = temp" +
               "->" +
               "next, and delete temp.\n" +
               "\n" +
               "Example Code");

       textView16.setText("void removeBeginning()\n" +
               "{\n" +
               "   if(head == NULL)\n" +
               "  printf(\"\\n\\nList is Empty\");\n" +
               "   else\n" +
               "   {\n" +
               "      struct Node *temp = head;\n" +
               "      if(head->next == NULL)\n" +
               "      {\n" +
               "        head = NULL;\n" +
               "        free(temp);\n" +
               "      }\n" +
               "      else\n" +
               "      {\n" +
               "         head = temp->next;\n" +
               "         free(temp);\n" +
               "         printf(\"\\nNode deleted at the beginning\\n\\n\");\n" +
               "      }\n" +
               "   }\n" +
               "}");

       textView17.setText("Deletion at End");

       textView18.setText("Step 1: Check whether list is Empty (head == NULL) \n" +
               "Step 2: If it is Empty then, display 'List is Empty.' and terminate the function.\n" +
               "Step 3: If it is Not Empty then, define two Node pointers 'temp1' and 'temp2' and initialize 'temp1' with head.\n" +
               "Step 4: Check whether list has only one Node (temp1 → next == NULL) " +
               "\nStep 5: If it is TRUE. Then, set head = NULL" +
               "and delete temp1. And terminate the function. (Setting Empty list condition)\n" +
               "Step 6: If it is FALSE. Then, set 'temp2 = temp1' and move temp1 to its next node. Repeat the same until it reaches to the last node in the list. (until temp1 next == NULL)\n" +
               "Step 7: Finally, Set temp2 → next = NULL - and delete temp1.\n" +
               "\n" +
               "Example Code");

       textView19.setText("void removeEnd()\n" +
               "{\n" +
               "   if(head == NULL)\n" +
               "   {\n" +
               "      printf(\"\\nList is Empty\\n\");\n" +
               "   }\n" +
               "   else\n" +
               "   {\n" +
               "      struct Node *temp1 = head,*temp2;\n" +
               "      if(head->next == NULL)\n" +
               "         head = NULL;\n" +
               "      else\n" +
               "      {\n" +
               "         while(temp1->next != NULL)\n" +
               "         {\n" +
               "             temp2 = temp1;\n" +
               "             temp1 = temp1->next;\n" +
               "         }\n" +
               "         temp2->next = NULL;\n" +
               "      }\n" +
               "      free(temp1);\n" +
               "      printf(\"\\nNode deleted at the end\\n\\n\");\n" +
               "   }\n" +
               "}");

       textView20.setText("Deletion at position");

       textView21.setText("Step 1: Check whether list is Empty (head == NULL)\n" +
               "Step 2: If it is Empty then, display 'List is Empty' and terminate the function.\n" +
               "Step 3: If it is Not Empty then, define two Node pointers 'temp1' and 'temp2' and initialize 'temp1' with head.\n" +
               "Step 4: If position to be deleted is 1, then Set head = temp1 next and then free(temp1)\n" +
               "Step 5: Else keep moving the temp1 and" +
               "temp2 to the position given (run a for-loop" +
               "to position - 1)\n" +
               "Step 6: If temp1 reaches NULL, Set flag to 0 (signifies whether the element is found in the list)\n" +
               "Step 7: If flag is 1, Set temp2 → next =" +
               "temp1 next and free(temp1)\n" +
               "Step 8: Else display 'Position exceeds number of elements in linked list. Please try again' and terminate the function\n" +
               "\n" +
               "Example Code");

       textView22.setText("void removePosition(int pos)\n" +
               "{\n" +
               "   int i,flag = 1;\n" +
               "   if (head==NULL)\n" +
               "        printf(\"List is empty\");\n" +
               "   else {\n" +
               "       struct Node *temp1 = head, *temp2;\n" +
               "       if (pos == 1) {\n" +
               "            head = temp1->next;\n" +
               "            free(temp1);\n" +
               "            printf(\"\\nNode deleted\\n\\n\");\n" +
               "       }\n" +
               "       else {\n" +
               "           for (i = 0; i < pos - 1; i++)\n" +
               "           {\n" +
               "             if (temp1 -> next != NULL) {\n" +
               "                 temp2 = temp1;\n" +
               "                 temp1 = temp1 -> next;\n" +
               "             }\n" +
               "             else {\n" +
               "                flag = 0;\n" +
               "                break;\n" +
               "             }\n" +
               "           }\n" +
               "           if (flag) {\n" +
               "               temp2 -> next = temp1 -> next;\n" +
               "               free(temp1);\n" +
               "               printf(\"\\nNode deleted\\n\\n\");\n" +
               "           }\n" +
               "           else {\n" +
               "               printf(\"Position exceeds number of elements in linked list. Please try again\");\n" +
               "           }\n" +
               "       }\n" +
               "    }\n" +
               "}");

    }
}