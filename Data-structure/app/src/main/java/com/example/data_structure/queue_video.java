package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class queue_video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue_video);

        Button button1,button2,button3,button4,button5;

        button1 = findViewById(R.id.btn_queue_video1);
        button2 = findViewById(R.id.btn_queue_Video2);
        button3 = findViewById(R.id.btn_queue_Video3);
        button4 = findViewById(R.id.btn_queue_Video4);
        button5 = findViewById(R.id.btn_queue_Video5);


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/yzj0Ch01Exo")));
                Log.i("Video", "Video Playing....");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/-sSPsEKgYmc")));
                Log.i("Video", "Video Playing....");

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/0w8kMgrtra4")));
                Log.i("Video", "Video Playing....");

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/XDxLEUgVDMM")));
                Log.i("Video", "Video Playing....");

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/2zQtymZV6dk")));
                Log.i("Video", "Video Playing....");

            }
        });
    }
}