package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class doubly_linkedlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doubly_linkedlist);

        TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10;
        TextView textView11,textView12,textView13,textView14,textView15,textView16,textView17,textView18,textView19,textView20;
        TextView textView21,textView22;

        textView1 = findViewById(R.id.double_link_textview1);
        textView2 = findViewById(R.id.double_link_textview2);
        textView3 = findViewById(R.id.double_link_textview3);
        textView4 = findViewById(R.id.double_link_textview4);
        textView5 = findViewById(R.id.double_link_textview5);
        textView6 = findViewById(R.id.double_link_textview6);
        textView7 = findViewById(R.id.double_link_textview7);
        textView8 = findViewById(R.id.double_link_textview8);
        textView9 = findViewById(R.id.double_link_textview9);
        textView10 = findViewById(R.id.double_link_textview10);
        textView11 = findViewById(R.id.double_link_textview11);
        textView12 = findViewById(R.id.double_link_textview12);
        textView13 = findViewById(R.id.double_link_textview13);
        textView14 = findViewById(R.id.double_link_textview14);
        textView15 = findViewById(R.id.double_link_textview15);
        textView16 = findViewById(R.id.double_link_textview16);
        textView17 = findViewById(R.id.double_link_textview17);
        textView18 = findViewById(R.id.double_link_textview18);
        textView19 = findViewById(R.id.double_link_textview19);
        textView20 = findViewById(R.id.double_link_textview20);
        textView21 = findViewById(R.id.double_link_textview21);
        textView22 = findViewById(R.id.double_link_textview22);

        textView1.setText("Implementation");

        textView2.setText("A doubly linked list is a more complex type of linked list which contains a pointer to the next as well as the previous node in the sequence. " +
                "This allows for reverse traversal anywhere in the list.\n");

        textView3.setText("Before the implementing actual operations");

        textView4.setText("Step 1: Include all the header files which" +
                "are used in the program.\nStep 2: Declare all the user defined functions.\n" +
                "Step 3: Define a Node structure with three members data, next and previous.\n" +
                "Step 4: Define a Node pointer 'head' and set it to NULL.\n");

        textView5.setText("Inserting at Beginning");

        textView6.setText("Steps\n" +
                "\n" +
                "1.Create newNode with the given value and newNode → previous as NULL.\n" +
                "2.Check whether list is Empty (head == NULL)\n" +
                "3.If it is Empty then, assign NULL to newNode → next and newNode to head.\n" +
                "4.If it is not Empty then set head to newNode → next and newNode to head.\n\n" +
                "Example Code");

        textView7.setText("void insertAtBeginning(int value)\n" +
                "{\n" +
                "    struct Node *newNode;\n" +
                "    newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
                "    newNode -> data = value;\n" +
                "    newNode -> previous = NULL;\n" +
                "    if(head == NULL)\n" +
                "    {\n" +
                "       newNode -> next = NULL;\n" +
                "       head = newNode;\n" +
                "    }\n" +
                "    else\n" +
                "    {\n" +
                "       newNode -> next = head;\n" +
                "       head -> previous = newNode;\n" +
                "       head = newNode;\n" +
                "    }\n" +
                "    printf(\"\\nInsertion successful\");\n" +
                "}");

        textView8.setText("\nInserting at End");

        textView9.setText("Steps\n" +
                "\n" +
                "1. Create a new Node with the given value and set the Node’s next pointer to NULL.\n" +
                "2. Check whether the list is Empty (head == NULL).\n" +
                "3. If it is Empty, then assign NULL to newNode → previous and newNode to head.\n" +
                "4. If it is not Empty, then, define a node pointer temp and initialize it with head.\n" +
                "5. Keep moving the temp to its next node until it reaches the last node in the list.\n" +
                "6. Set newNode to temp → next and temp to newNode → previous\n\n" +
                "Example Code");

        textView10.setText("void insertAtEnd(int value)\n" +
                "{\n" +
                "   struct Node *newNode;\n" +
                "   newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
                "   newNode -> data = value;\n" +
                "   newNode -> next = NULL;\n" +
                "   if(head == NULL)\n" +
                "   {\n" +
                "      newNode -> previous = NULL;\n" +
                "      head = newNode;\n" +
                "   }\n" +
                "   else\n" +
                "   {\n" +
                "      struct Node *temp = head;\n" +
                "      while(temp -> next != NULL)\n" +
                "         temp = temp -> next;\n" +
                "      temp -> next = newNode;\n" +
                "      newNode -> previous = temp;\n" +
                "   }\n" +
                "   printf(\"\\nInsertion successful\");\n" +
                "}");

        textView11.setText("Inserting at a specific " +
                "position");

        textView12.setText("Steps\n" +
                "\n" +
                "1.Create a newNode with the given value.\n" +
                "2.Check whether the list is Empty (head == NULL)\n" +
                "3.If it is Empty then set NULL to newNode → previous , newNode → next and head = newNode.\n" +
                "4.Define a temp Node and set it to head.\n" +
                "5.Keep moving the temp to its next node until it reaches to the node after which we want to insert the newNode (run a for-loop till position – 1)\n" +
                "6.If temp reaches the end of the list (temp → next == NULL ), Set flag to 0 (signifies element is not found) and break out of the loop.\n" +
                "7.If flag is 1, set newNode → next = temp → next , temp → next → previous = newNode , temp → next = newNode and newNode → previous = temp" +
                "\n" +
                "Example Code");

        textView13.setText("void insertAfter(int value, int pos)\n" +
                "{\n" +
                "   int i, flag = 1;\n" +
                "   struct Node *newNode, *temp = head;\n" +
                "   newNode = (struct Node*)malloc(sizeof(struct Node));\n" +
                "   newNode -> data = value;\n" +
                "   if(head == NULL)\n" +
                "   {\n" +
                "      newNode -> previous = newNode -> next = NULL;\n" +
                "      head = newNode;\n" +
                "   }\n" +
                "   else\n" +
                "   {\n" +
                "    for (i = 0; i < pos - 1; i++) {\n" +
                "        temp = temp -> next;\n" +
                "        if (temp -> next == NULL) {\n" +
                "            flag = 0;\n" +
                "            break;\n" +
                "        }\n" +
                "    }\n" +
                "    if (flag) {\n" +
                "        newNode -> next = temp -> next;\n" +
                "        temp -> next -> previous = newNode;\n" +
                "        temp -> next = newNode;\n" +
                "        newNode -> previous = temp;\n" +
                "        printf(\"\\nInsertion successful\\n\");\n" +
                "    }\n" +
                "    else\n" +
                "        printf(\"Number of elements is less than position entered\");\n" +
                "   }\n" +
                "}");

        textView14.setText("Deletion at Beginning");

        textView15.setText("Steps\n" +
                "\n" +
                "1.Check whether the list is Empty (head == NULL )\n" +
                "2.If it is Empty then, throw an error terminate the function.\n" +
                "3.If it is not Empty then, define a Node pointer temp and initialize with head.\n" +
                "4.Check whether the list is having only one node (temp → previous = temp → next).\n" +
                "5.If it is TRUE, then set head = NULL and free(temp).\n" +
                "6.If it is FALSE, then set temp → next = head , head → previous = NULL and free(temp)\n\n" +
                "Example Code");

        textView16.setText("void deleteBeginning()\n" +
                "{\n" +
                "   if(head == NULL)\n" +
                "      printf(\"List is Empty\");\n" +
                "   else\n" +
                "   {\n" +
                "      struct Node *temp = head;\n" +
                "      if(temp -> previous == temp -> next)\n" +
                "      {\n" +
                "         head = NULL;\n" +
                "         free(temp);\n" +
                "      }\n" +
                "      else{\n" +
                "         head = temp -> next;\n" +
                "         head -> previous = NULL;\n" +
                "         free(temp);\n" +
                "      }\n" +
                "      printf(\"\\nDeletion successful\");\n" +
                "   }\n" +
                "}");

        textView17.setText("Deletion at End");

        textView18.setText("Steps\n" +
                "\n" +
                "1.Check whether the list is Empty (head == NULL).\n" +
                "2.If it is Empty, then throw an error and terminate the function.\n" +
                "3.If it is not Empty then, define a Node pointer temp and initialize with head.\n" +
                "4.Check whether the list has only one Node (temp → previous and temp → next both are NULL)\n" +
                "5.If it is TRUE, then assign NULL to head and delete temp. And terminate from the function.\n" +
                "6.If it is FALSE, then keep moving temp until it reaches the last node in the list. (until temp → next != NULL)\n" +
                "7.Set temp → previous → next = NULL and free(temp)\n" +
                "\n" +
                "Example Code");

        textView19.setText("void deleteEnd()\n" +
                "{\n" +
                "   if(head == NULL)\n" +
                "      printf(\"List is Empty\");\n" +
                "   else\n" +
                "   {\n" +
                "      struct Node *temp = head;\n" +
                "      if(temp -> previous == temp -> next)\n" +
                "      {\n" +
                "         head = NULL;\n" +
                "         free(temp);\n" +
                "      }\n" +
                "      else{\n" +
                "         while(temp -> next != NULL)\n" +
                "            temp = temp -> next;\n" +
                "         temp -> previous -> next = NULL;\n" +
                "         free(temp);\n" +
                "      }\n" +
                "      printf(\"\\nDeletion successful\");\n" +
                "   }\n" +
                "}");

        textView20.setText("Deletion at position");

        textView21.setText("Steps\n" +
                "\n" +
                "1.Check whether the list is Empty (head == NULL)\n" +
                "2.If it is Empty then, throw an error and terminate the function.\n" +
                "3.If it is not Empty, then define a Node pointer temp and initialize with head.\n" +
                "4.Keep moving the temp until it reaches to the exact node to be deleted or to the last node.\n" +
                "5.If it is reached to the last node, then display ‘Given node not found in the list’ and terminate the function.\n" +
                "6.If it is reached to the exact node which we want to delete, then check whether the list is having only one node or not\n" +
                "7.If list has only one node and that is the node which is to be deleted then set head = NULL and free(temp).\n" +
                "8.If list contains multiple nodes, then check whether temp is the first node in the list (temp == head).\n" +
                "9.If temp is the first node, then move the head to the next node (head = head → next), set head of previous to NULL (head → previous = NULL ) and free(temp).\n" +
                "10.If temp is not the first node, then check whether it is the last node in the list ( temp → next == NULL).\n" +
                "11.If temp is the last node then set temp → previous → next = NULL and free(temp).\n" +
                "12.If temp is not the first node and not the last node, then set temp → previous → next = temp → next , temp → next → previous = temp → previous and free(temp)\n" +
                "\n" +
                "Example Code");

        textView22.setText("void deleteSpecific(int delValue)\n" +
                "{\n" +
                "   if(head == NULL)\n" +
                "      printf(\"List is Empty\");\n" +
                "   else\n" +
                "   {\n" +
                "      struct Node *temp = head;\n" +
                "      while(temp -> data != delValue)\n" +
                "      {\n" +
                "         if(temp -> next == NULL)\n" +
                "         {\n" +
                "            printf(\"\\nGiven node is not found in the list\");\n" +
                "         }\n" +
                "         else\n" +
                "         {\n" +
                "            temp = temp -> next;\n" +
                "         }\n" +
                "      }\n" +
                "      if(temp == head)\n" +
                "      {\n" +
                "         head = NULL;\n" +
                "         free(temp);\n" +
                "      }\n" +
                "      else\n" +
                "      {\n" +
                "         temp -> previous -> next = temp -> next;\n" +
                "         free(temp);\n" +
                "      }\n" +
                "      printf(\"\\nDeletion successful\");\n" +
                "   }\n" +
                "}");
    }
}