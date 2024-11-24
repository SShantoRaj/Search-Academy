package com.example.searchacademy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {

    Button buttonM3;
    Button buttonM4;
    Button buttonM5;
    TextView txtMarquee3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

//হ্যালো, আমি এস শান্ত রাজ। আপনারা ইপিএস এর সকল তথ্য এই অ্যাপস এর মাধ্যমে পেয়ে যাবেন। শুধু তাই নয় ইপিএস এর সকল পরীক্ষাগুলো বিনামূল্যে এই অ্যাপস এর মাধ্য
        txtMarquee3 = findViewById(R.id.marqueeText3);
        txtMarquee3.setSelected(true);

        buttonM3 = findViewById(R.id.b_ma_1);
        buttonM4 = findViewById(R.id.b_ma_2);
        buttonM5 = findViewById(R.id.b_ma_3);



        
        buttonM3.setOnClickListener(v -> {

            String url = "https://boesl.gov.bd";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
    });



buttonM4.setOnClickListener(v -> {

    String url = "https://www.facebook.com/boesl.gov.bd";
    Intent i = new Intent(Intent.ACTION_VIEW);
    i.setData(Uri.parse(url));
    startActivity(i);

});


        buttonM5.setOnClickListener(v -> {

            String url = "www.facebook.com/groups/searchacademybd/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);

        });







    }
}