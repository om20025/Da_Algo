package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Array_video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_video);

        Button button1,button2,button3,button4;

        button1 = findViewById(R.id.btn_array_video1);
        button2 = findViewById(R.id.btn_array_video2);
        button3 = findViewById(R.id.btn_array_video3);


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/eXFItikqw8c")));
                Log.i("Video", "Video Playing....");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/27PdRL89A9U")));
                Log.i("Video", "Video Playing....");

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/ijK6yqDGQUg")));
                Log.i("Video", "Video Playing....");

            }
        });

    }
}