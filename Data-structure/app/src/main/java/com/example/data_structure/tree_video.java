package com.example.data_structure;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class tree_video extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree_video);

        Button button1,button2,button3,button4,button5;

        button1 = findViewById(R.id.btn_tree_video1);
        button2 = findViewById(R.id.btn_tree_video2);
        button3 = findViewById(R.id.btn_tree_video3);
        button4 = findViewById(R.id.btn_tree_video4);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/9oTV7fDEaCY")));
                Log.i("Video", "Video Playing....");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/hUHqEu5Rcic")));
                Log.i("Video", "Video Playing....");

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/WyFbzCU2czg")));
                Log.i("Video", "Video Playing....");

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/iIa4WYRCgOA")));
                Log.i("Video", "Video Playing....");

            }
        });
    }
}