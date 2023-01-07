package com.example.data_structure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class heap_video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heap_video);

        Button button1,button2,button3;

        button1 = findViewById(R.id.btn_heap_video1);
        button2 = findViewById(R.id.btn_heap_video2);


        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/gRwfHzeS-GM")));
                Log.i("Video", "Video Playing....");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/oehCioX-I8A")));
                Log.i("Video", "Video Playing....");

            }
        });
    }
}