package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Linkedlist_Video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkedlist_video);

        Button button1,button2,button3,button4;

        button1 = findViewById(R.id.btn_linkedlist_video1);
        button2 = findViewById(R.id.btn_linkedlist_video2);
        button3 = findViewById(R.id.btn_linkedlist_video3);
        button4 = findViewById(R.id.btn_linkedlist_video4);

        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/SgAYtOHtGns")));
                Log.i("Video", "Video Playing....");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/L0H3YZV6vj8")));
                Log.i("Video", "Video Playing....");

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/M3f_OjFCqYQ")));
                Log.i("Video", "Video Playing....");

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/pR_vU9hgDls")));
                Log.i("Video", "Video Playing....");

            }
        });
    }
}