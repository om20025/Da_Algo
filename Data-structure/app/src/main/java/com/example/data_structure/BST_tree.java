package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BST_tree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bst_tree);

        TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10;

        textView1 = findViewById(R.id.bst_textview1);
        textView2 = findViewById(R.id.bst_textview2);
        textView3 = findViewById(R.id.bst_textview3);
        textView4 = findViewById(R.id.bst_textview4);
        textView5 = findViewById(R.id.bst_textview5);
        textView6 = findViewById(R.id.bst_textview6);
        textView7 = findViewById(R.id.bst_textview7);
        textView8 = findViewById(R.id.bst_textview8);
        textView9 = findViewById(R.id.bst_textview9);
        textView10 = findViewById(R.id.bst_textview10);


        textView1.setText("What is Binary Search Tree");

        textView2.setText("A Binary Search Tree is a binary tree that " +
                "additionally satisfies the binary search property.");

        textView3.setText("\nBinary Tree Property");

        textView4.setText("This property states that the key in each node must be greater than or equal to " +
                "any key stored in the left sub-tree, and less than or equal to any key stored in the right sub-tree.");

        textView5.setText("\nOperations in Binary Search" +
                "Tree");

        textView6.setText("\nSearching\n" +
                "1. We begin by examining the root node. If the tree is null, the key we are searching for does not exist in tree.\n" +
                "2. If the key equals that of the root, the search is successful and we return the node.\n" +
                "3. If the key is less than that of the root, we search the left subtree. Similarly, if the " +
                "key is greater than that of the root, we search the right subtree.\n" +
                "4. This process is repeated until the key is found or the remaining subtree is null.\n" +
                "5. If the searched key is not found after a null subtree is reached, then the key is not present in the tree.");

        textView7.setText("\nInsertion\n" +
                "To insert for a key in the tree, we follow the binary search property and insert accordingly.\n" +
                "1. Compare the key to be searched with the root's key.\n" +
                "2. If the key is lesser than the root's value, we return the left subtree of the node.\n" +
                "3. If the key is greater than the root's value, we\n" +
                "return the right subtree of the node.\n" +
                "4. This process is continued until we hit a leaf node. The new node is inserted to this location as a new node.");

        textView8.setText("\nDeletion\n" +
                "When removing a node from a binary search tree it is mandatory to maintain the in-order sequence of the nodes. There are three possible cases to consider:\n" +
                "1. Deleting a node with no children: simply\n" +
                "remove the node from the tree.\n" +
                "2. Deleting a node with one child: remove the node and replace it with its child.\n" +
                "3. Deleting a node with two children: First," +
                "we find the in-order successor of the node. " +
                "Then the contents of this in-order successor are copied to the node to be deleted. Finally, the in-order successor is deleted.\n");

        textView9.setText("Example Code");

        textView10.setText("#include <iostream>\n" +
                "using namespace std;\n" +
                " \n" +
                "class BST {\n" +
                "    int data;\n" +
                "    BST *left, *right;\n" +
                " \n" +
                "public:\n" +
                "    BST();\n" +
                " \n" +
                "    BST(int);\n" +
                " \n" +
                "    BST* Insert(BST*, int);\n" +
                " \n" +
                "    void Inorder(BST*);\n" +
                "};\n" +
                " \n" +
                "BST ::BST()\n" +
                "    : data(0)\n" +
                "    , left(NULL)\n" +
                "    , right(NULL)\n" +
                "{\n" +
                "}\n" +
                " \n" +
                "BST ::BST(int value)\n" +
                "{\n" +
                "    data = value;\n" +
                "    left = right = NULL;\n" +
                "}\n" +
                " \n" +
                "BST* BST ::Insert(BST* root, int value)\n" +
                "{\n" +
                "    if (!root) {\n" +
                "        return new BST(value);\n" +
                "    }\n" +
                " \n" +
                "    if (value > root->data) {\n" +
                " \n" +
                "        root->right = Insert(root->right, value);\n" +
                "    }\n" +
                "    else {\n" +
                " \n" +
                "        root->left = Insert(root->left, value);\n" +
                "    }\n" +
                " \n" +
                "    return root;\n" +
                "}\n" +
                " \n" +
                "void BST ::Inorder(BST* root)\n" +
                "{\n" +
                "    if (!root) {\n" +
                "        return;\n" +
                "    }\n" +
                "    Inorder(root->left);\n" +
                "    cout << root->data << endl;\n" +
                "    Inorder(root->right);\n" +
                "}\n" +
                " \n" +
                "// Driver code\n" +
                "int main()\n" +
                "{\n" +
                "    BST b, *root = NULL;\n" +
                "    root = b.Insert(root, 50);\n" +
                "    b.Insert(root, 30);\n" +
                "    b.Insert(root, 20);\n" +
                "    b.Insert(root, 40);\n" +
                "    b.Insert(root, 70);\n" +
                "    b.Insert(root, 60);\n" +
                "    b.Insert(root, 80);\n" +
                " \n" +
                "    b.Inorder(root);\n" +
                "    return 0;\n" +
                "}");
    }
}