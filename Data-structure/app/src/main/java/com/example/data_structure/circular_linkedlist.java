package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class circular_linkedlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular_linkedlist);

        TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10;
        TextView textView11,textView12,textView13,textView14,textView15,textView16,textView17,textView18,textView19,textView20;
        TextView textView21,textView22;

        textView1 = findViewById(R.id.circular_link_textview1);
        textView2 = findViewById(R.id.circular_link_textview2);
        textView3 = findViewById(R.id.circular_link_textview3);
        textView4 = findViewById(R.id.circular_link_textview4);
        textView5 = findViewById(R.id.circular_link_textview5);
        textView6 = findViewById(R.id.circular_link_textview6);
        textView7 = findViewById(R.id.circular_link_textview7);
        textView8 = findViewById(R.id.circular_link_textview8);
        textView9 = findViewById(R.id.circular_link_textview9);
        textView10 = findViewById(R.id.circular_link_textview10);
        textView11 = findViewById(R.id.circular_link_textview11);
        textView12 = findViewById(R.id.circular_link_textview12);
        textView13 = findViewById(R.id.circular_link_textview13);
        textView14 = findViewById(R.id.circular_link_textview14);
        textView15 = findViewById(R.id.circular_link_textview15);
        textView16 = findViewById(R.id.circular_link_textview16);
        textView17 = findViewById(R.id.circular_link_textview17);
        textView18 = findViewById(R.id.circular_link_textview18);
        textView19 = findViewById(R.id.circular_link_textview19);
        textView20 = findViewById(R.id.circular_link_textview20);
        textView21 = findViewById(R.id.circular_link_textview21);
        textView22 = findViewById(R.id.circular_link_textview22);

        textView1.setText("Implementation");

        textView2.setText("In a circular linked list, the last node contains a pointer to the first node of the list, forming a loop.\n" +
                "While traversing a circular linked list, we can begin at any node and traverse the list in any direction, forward or backward, until we reach the same node where we started.\n" +
                "Thus, a circular linked list has no beginning and no ending.\n");

        textView3.setText("Before the implementing actual operations");

        textView4.setText("Step 1: Include all the header files which" +
                "are used in the program. \nStep 2: Declare all the user defined functions.\n" +
                "Step 3: Define a Node structure with two members data and next Step 4: Define a Node pointer 'head' and set it to NULL.\n");

        textView5.setText("Inserting at Beginning");

        textView6.setText("Step 1: Create a newNode with given value. \nStep 2: Check whether list is Empty (head" +
                "==" +
                "NULL)\n" +
                "Step 3: If it is Empty then, set head = newNode and newNode → next = head.\n" +
                "Step 4: If it is Not Empty then, define a Node pointer 'temp' and initialize with 'head'.\n" +
                "Step 5: Keep moving the 'temp' to its next node until it reaches to the last node (until 'temp next == = head').\n" +
                "Step 6: Set 'newNode next =head', 'head" +
                "= newNode' and 'temp next = head'.\n\n" +
                "Example Code");

        textView7.setText("void insertAtBeginning(int value)\n" +
                "{\n" +
                "    struct Node *newNode;\n" +
                "    newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
                "    newNode -> data = value;\n" +
                "    if(head == NULL)\n" +
                "    {\n" +
                "       head = newNode;\n" +
                "       newNode -> next = head;\n" +
                "    }\n" +
                "    else\n" +
                "    {\n" +
                "       struct Node *temp = head;\n" +
                "       while(temp -> next != head)\n" +
                "          temp = temp -> next;\n" +
                "       newNode -> next = head;\n" +
                "       head = newNode;\n" +
                "       temp -> next = head;\n" +
                "    }\n" +
                "    printf(\"\\nInsertion successful\");\n" +
                "}");

        textView8.setText("\nInserting at End");

        textView9.setText("Step 1: Create a newNode with given value. \nStep 2: Check whether list is Empty (head NULL).\n" +
                "Step 3: If it is Empty then, set head = newNode and newNode → next = head. " +
                "\nStep 4: If it is Not Empty then, define a node pointer temp and initialize with head. " +
                "\nStep 5: Keep moving the temp to its next node until it reaches to the last node in the" +
                "list (until temp next == head). \nStep 6: Set temp next = newNode and" +
                "newNode → next = head.\n\n" +
                "Example Code");

        textView10.setText("void insertAtEnd(int value)\n" +
                "{\n" +
                "   struct Node *newNode;\n" +
                "   newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
                "   newNode -> data = value;\n" +
                "   if(head == NULL)\n" +
                "   {\n" +
                "      head = newNode;\n" +
                "      newNode -> next = head;\n" +
                "   }\n" +
                "   else\n" +
                "   {\n" +
                "      struct Node *temp = head;\n" +
                "      while(temp -> next != head)\n" +
                "         temp = temp -> next;\n" +
                "      temp -> next = newNode;\n" +
                "      newNode -> next = head;\n" +
                "   }\n" +
                "   printf(\"\\nInsertion successful\");\n" +
                "}");

        textView11.setText("Inserting at a specific " +
                "position");

        textView12.setText("Step 1: Create a newNode with given value.\n" +
                "Step 2: Check whether list is Empty (head==NULL)\n" +
                "Step 3: If it is Empty then, set head = newNode and newNode next = head. \nStep 4: If it is Not Empty then, define a node pointer temp and initialize with head.\n" +
                "Step 5: Keep moving the temp to its next node until it reaches to the node after which we want to insert the newNode (until temp1" +
                "→ data is equal to location, here location is the node value after which we want to insert the newNode).\n" +
                "Step 6: Every time check whether temp is reached to the last node or not. If it is reached to last node then display 'Given node is not found in the list!!! Insertion not possible!!!' and terminate the function. Otherwise move the temp to next node.\n" +
                "Step 7: If temp is reached to the exact node after which we want to insert the newNode then check whether it is last node (temp → next == head).\n" +
                "Step 8: If temp is last node then set temp next = newNode and newNode → next = head.\n" +
                "Step 9: If temp is not last node then set newNode next = temp next = newNode. next and temp\n" +
                "\n" +
                "Example Code");

        textView13.setText("void insertAfter(int value, int location)\n" +
                "{\n" +
                "   struct Node *newNode;\n" +
                "   newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
                "   newNode -> data = value;\n" +
                "   if(head == NULL)\n" +
                "   {\n" +
                "      head = newNode;\n" +
                "      newNode -> next = head;\n" +
                "   }\n" +
                "   else\n" +
                "   {\n" +
                "      struct Node *temp = head;\n" +
                "      while(temp -> data != location)\n" +
                "      {\n" +
                "         if(temp -> next == head)\n" +
                "         {\n" +
                "            printf(\"Given node is not found in the list\");\n" +
                "         }\n" +
                "         else\n" +
                "         {\n" +
                "            temp = temp -> next;\n" +
                "         }\n" +
                "      }\n" +
                "      newNode -> next = temp -> next;\n" +
                "      temp -> next = newNode;\n" +
                "      printf(\"\\nInsertion successful\");\n" +
                "   }\n" +
                "}");

        textView14.setText("Deletion at Beginning");

        textView15.setText("Step 1: Check whether list is Empty (head == = NULL)\n" +
                "Step 2: If it is Empty then, display 'List is" +
                "Empty' and terminate the function.\n" +
                "Step 3: Else find the last node in the list by running a loop until temp->next = head, assign this to last\n" +
                "Step 4: Set last = temp, temp = head, head = head next, last->next = head and then - free(temp)\n\n" +
                "Example Code");

        textView16.setText("void deleteBeginning()\n" +
                "{\n" +
                "   if(head == NULL)\n" +
                "      printf(\"List is Empty\");\n" +
                "   else\n" +
                "   {\n" +
                "      struct Node *temp = head, *last = NULL;\n" +
                "      if(temp -> next == head)\n" +
                "      {\n" +
                "         head = NULL;\n" +
                "         free(temp);\n" +
                "      }\n" +
                "      else{\n" +
                "        while(temp -> next != head)\n" +
                "            temp = temp -> next;\n" +
                "        last = temp;\n" +
                "        temp = head;\n" +
                "        head = head -> next;\n" +
                "        free(temp);\n" +
                "        last -> next = head;\n" +
                "      }\n" +
                "      printf(\"\\nDeletion successful\");\n" +
                "   }\n" +
                "}");

        textView17.setText("Deletion at End");

        textView18.setText("Step 1: Check whether list is Empty (head == NULL)\n" +
                "Step 2: If it is Empty then, display 'List is" +
                "Empty!!! Deletion is not possible' and" +
                "terminate the function.\n" +
                "Step 3: If it is Not Empty then, define two Node pointers 'temp1' and 'temp2' and initialize 'temp1' with head.\n" +
                "Step 4: Check whether list has only one\n" +
                "Node (temp1 head) Step 5: If it is TRUE. Then, set head = NULL and delete temp1. And terminate from the function. (Setting Empty list condition)" +
                "→ next ==\n" +
                "Step 6: If it is FALSE. Then, set 'temp2 = temp1' and move temp1 to its next node. Repeat the same until temp1 reaches to the last node in the list. (until temp1 next == head)\n" +
                "Step 7: Set temp2. next = head and delete temp1.\n" +
                "\n" +
                "Example Code");

        textView19.setText("void deleteEnd()\n" +
                "{\n" +
                "   if(head == NULL)\n" +
                "      printf(\"List is Empty\");\n" +
                "   else\n" +
                "   {\n" +
                "      struct Node *temp1 = head, *temp2;\n" +
                "      if(temp1 -> next == head)\n" +
                "      {\n" +
                "         head = NULL;\n" +
                "         free(temp1);\n" +
                "      }\n" +
                "      else{\n" +
                "         while(temp1 -> next != head){\n" +
                "            temp2 = temp1;\n" +
                "            temp1 = temp1 -> next;\n" +
                "         }\n" +
                "         temp2 -> next = head;\n" +
                "         free(temp1);\n" +
                "      }\n" +
                "      printf(\"\\nDeletion successful\");\n" +
                "   }\n" +
                "}");

        textView20.setText("Deletion at position");

        textView21.setText("Step 1: Check whether list is Empty (head == NULL) \nStep 2: If it is Empty then, display 'List is" +
                "Empty!!! Deletion is not possible' and" +
                "terminate the function.\n" +
                "Step 3: If it is Not Empty then, define two Node pointers 'temp1' and 'temp2' and initialize 'temp1' with head.\n" +
                "Step 4: eep moving the temp1 until it reaches to the exact node to be deleted or to the last node. And every time set 'temp2 = temp1' before moving the 'temp1' to its next node.\n" +
                "Step 5: If it is reached to the last node then display 'Given node not found in the list! Deletion not possible!!!'. And terminate the function.\n" +
                "Step 6: If it is reached to the exact node which we want to delete, then check whether list is having only one node (temp1 - next head)\n" +
                "Step 7: If list has only one node and that is the node to be deleted then set head = NULL and delete temp1 (free(temp1)).\n" +
                "Step 8: If list contains multiple nodes then check whether temp1 is the first node in the list (temp1 == head).\n" +
                "Step 9: If temp1 is the first node then set temp2 = head and keep moving temp2 to its next node until temp2 reaches to the last node. Then set head = head next, temp2 next = head and delete temp1.\n" +
                "Step 10: If temp1 is not first node then" +
                "check whether it is last node in the list (temp1 → next == head)\n" +
                "Step 11: If temp1 is last node then set temp2 next = head and delete temp1 (free(temp1)).\n" +
                "Step 12: If temp1 is not first node and not last node then set temp2 → next = temp1 → next and delete temp1 (free(temp1))\n" +
                "\n" +
                "Example Code");

        textView22.setText("void deleteSpecific(int delValue)\n" +
                "{\n" +
                "   if(head == NULL)\n" +
                "      printf(\"List is Empty\");\n" +
                "   else\n" +
                "   {\n" +
                "      struct Node *temp1 = head, *temp2;\n" +
                "      while(temp1 -> data != delValue)\n" +
                "      {\n" +
                "         if(temp1 -> next == head)\n" +
                "         {\n" +
                "            printf(\"\\nGiven node is not found in the list\");\n" +
                "         }\n" +
                "         else\n" +
                "         {\n" +
                "            temp2 = temp1;\n" +
                "            temp1 = temp1 -> next;\n" +
                "         }\n" +
                "      }\n" +
                "      if(temp1 -> next == head){\n" +
                "         head = NULL;\n" +
                "         free(temp1);\n" +
                "      }\n" +
                "      else{\n" +
                "         if(temp1 == head)\n" +
                "         {\n" +
                "            temp2 = head;\n" +
                "            while(temp2 -> next != head)\n" +
                "               temp2 = temp2 -> next;\n" +
                "            head = head -> next;\n" +
                "            temp2 -> next = head;\n" +
                "            free(temp1);\n" +
                "         }\n" +
                "         else\n" +
                "         {\n" +
                "            if(temp1 -> next == head)\n" +
                "            {\n" +
                "               temp2 -> next = head;\n" +
                "            }\n" +
                "            else\n" +
                "            {\n" +
                "               temp2 -> next = temp1 -> next;\n" +
                "            }\n" +
                "            free(temp1);\n" +
                "         }\n" +
                "      }\n" +
                "      printf(\"\\nDeletion successful\");\n" +
                "   }\n" +
                "}");
    }
}