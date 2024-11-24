package com.example.searchacademy;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button  button;
    TextView txtMarquee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        //হ্যালো, আমি এস শান্ত রাজ। আপনারা ইপিএস এর সকল তথ্য এই অ্যাপস এর মাধ্যমে পেয়ে যাবেন। শুধু তাই নয় ইপিএস এর সকল পরীক্ষাগুলো বিনামূল্যে এই অ্যাপস এর মাধ্য
        txtMarquee = findViewById(R.id.marqueeText);
        txtMarquee.setSelected(true);


        button = findViewById(R.id.d1);
        button.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        });



        button = findViewById(R.id.d3);
        button.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this,MainActivity3.class);
            startActivity(intent);
        });





    }
}

