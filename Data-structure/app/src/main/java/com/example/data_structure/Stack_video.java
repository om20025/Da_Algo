package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Stack_video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack_video);

        Button btn1,btn2,btn3;

        btn1 = findViewById(R.id.btn_stack_video1);
        btn2 = findViewById(R.id.btn_stack_video2);
        btn3 = findViewById(R.id.btn_stack_video3);


        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/rdmNr-9_RNY")));
                Log.i("Video", "Video Playing....");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/vauOJynHT8o")));
                Log.i("Video", "Video Playing....");

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/T5xzWVTRJvg")));
                Log.i("Video", "Video Playing....");

            }
        });
    }
}