package com.gbhat.dsv;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ArrayAdapter<String> adapter;
    final String[] dsOptionList = {"Stack Using Array", "Stack Using Linked List", "Queue Using Array", "Queue Using Linked List", "Heap Using Array", "Binary Search Tree", "Red Black Tree", "AVL Tree"};
    private ListView listView;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_about) {
            showAboutDialog();
        }
        if (id == R.id.action_settings) {
            startActivityWithAnim(new Intent(this, SettingsActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }

    private void showAboutDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("About");
        TextView tv = new TextView(this);
        tv.setMovementMethod(LinkMovementMethod.getInstance());
        tv.setPadding(25, 25, 25, 25);
        tv.setText(Html.fromHtml("<h6>This app shows visualization of some of the frequently used data structures.<br>For any bug report or feature requests send an e-mail to <a href=mailto:gajananbhat87@gmail.com>gajananbhat87@gmail.com</a><br><br>This app uses visualization library created by David Galles. Visit <a href=\"https://www.cs.usfca.edu/~galles/visualization/about.html\">this link</a> for more information.</h6>"));
        builder.setView(tv);
        builder.setCancelable(true);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        builder.create().show();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.listView = (ListView) findViewById(R.id.listView);
        this.adapter = new ArrayAdapter<>(this, 17367043, 16908308, this.dsOptionList);
        this.listView.setAdapter(this.adapter);
        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainActivity.this, StackActivity.class);
                        intent.putExtra("StackType", StackActivity.STACK_USING_ARRAY);
                        MainActivity.this.startActivityWithAnim(intent);
                        return;
                    case 1:
                        Intent intent2 = new Intent(MainActivity.this, StackActivity.class);
                        intent2.putExtra("StackType", StackActivity.STACK_USING_LL);
                        MainActivity.this.startActivityWithAnim(intent2);
                        return;
                    case 2:
                        Intent intent3 = new Intent(MainActivity.this, QueueActivity.class);
                        intent3.putExtra("QueueType", QueueActivity.QUEUE_USING_ARRAY);
                        MainActivity.this.startActivityWithAnim(intent3);
                        return;
                    case 3:
                        Intent intent4 = new Intent(MainActivity.this, QueueActivity.class);
                        intent4.putExtra("QueueType", QueueActivity.QUEUE_USING_LL);
                        MainActivity.this.startActivityWithAnim(intent4);
                        return;
                    case 4:
                        MainActivity.this.startActivityWithAnim(new Intent(MainActivity.this, HeapActivity.class));
                        return;
                    case 5:
                        Intent intent5 = new Intent(MainActivity.this, TreeActivity.class);
                        intent5.putExtra("TreeType", TreeActivity.TREE_TYPE_BST);
                        MainActivity.this.startActivityWithAnim(intent5);
                        return;
                    case 6:
                        Intent intent6 = new Intent(MainActivity.this, TreeActivity.class);
                        intent6.putExtra("TreeType", TreeActivity.TREE_TYPE_RB);
                        MainActivity.this.startActivityWithAnim(intent6);
                        return;
                    case 7:
                        Intent intent7 = new Intent(MainActivity.this, TreeActivity.class);
                        intent7.putExtra("TreeType", TreeActivity.TREE_TYPE_AVL);
                        MainActivity.this.startActivityWithAnim(intent7);
                        return;
                    default:
                        return;
                }
            }
        });
    }

    @TargetApi(16)
    private void showActivityAnim(Intent intent) {
        startActivity(intent, ActivityOptions.makeCustomAnimation(getApplicationContext(), R.animator.anim_new_in, R.animator.anim_old_out).toBundle());
    }

    /* access modifiers changed from: private */
    public void startActivityWithAnim(Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            showActivityAnim(intent);
        } else {
            startActivity(intent);
        }
    }
}
