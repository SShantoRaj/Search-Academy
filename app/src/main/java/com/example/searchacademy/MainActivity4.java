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

public class MainActivity4 extends AppCompatActivity {

    Button buttonMA4;
    TextView txtMarquee4;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

//হ্যালো, আমি এস শান্ত রাজ। আপনারা ইপিএস এর সকল তথ্য এই অ্যাপস এর মাধ্যমে পেয়ে যাবেন।
        txtMarquee4 = findViewById(R.id.marqueeText4);
        txtMarquee4.setSelected(true);

        buttonMA4 = findViewById(R.id.b_ma_4_1);




        buttonMA4.setOnClickListener(v -> {

            String url = "https://epstopik.hrdkorea.or.kr/epstopik/home/main/mainPage.do?lang=en";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });


        buttonMA4.setOnClickListener(v -> {

            String url = "https://www.eps.go.kr/eo/langMain.eo?langCD=ph";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });







    }
}