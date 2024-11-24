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

public class MainActivity6 extends AppCompatActivity {

    Button buttonM2;
    Button button2M2;
    Button button3M2;
    Button button4M2;
    Button button5M2;
    Button button6M2;
    Button button7M2;
    Button button8M2;
    Button button9M2;
    Button button10M2;
    Button button11M2;
    Button button12M2;
    Button button13M2;
    Button button14M2;
    Button button15M2;
    Button button16M2;
    Button button17M2;
    Button button18M2;
    Button button19M2;
    Button button20M2;
    Button button21M2;
    Button button22M2;
    Button button23M2;
    Button button24M2;
    Button button25M2;
    Button button26M2;
    Button button27M2;
    Button button28M2;
    Button button29M2;
    Button button30M2;
    Button button31M2;
    Button button32M2;
    Button button33M2;
    Button button34M2;
    Button button35M2;
    Button button36M2;
    Button button37M2;
    Button button38M2;
    Button button39M2;
    Button button40M2;
    Button button41M2;
    Button button42M2;


    TextView txtMarquee5;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main6);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        buttonM2 = findViewById(R.id.v1);
        button2M2 = findViewById(R.id.v2);
        button3M2 =findViewById(R.id.v3);
        button4M2 =findViewById(R.id.v4);
        button5M2 =findViewById(R.id.v5);
        button6M2 =findViewById(R.id.v6);
        button7M2 =findViewById(R.id.v7);
        button8M2 =findViewById(R.id.v8);
        button9M2 =findViewById(R.id.v9);
        button10M2 =findViewById(R.id.v10);
        button11M2 =findViewById(R.id.v11);
        button12M2 =findViewById(R.id.v12);
        button13M2 =findViewById(R.id.v13);
        button14M2 =findViewById(R.id.v14);
        button15M2 =findViewById(R.id.v15);
        button16M2 =findViewById(R.id.v16);
        button17M2 =findViewById(R.id.v17);
        button18M2 =findViewById(R.id.v18);
        button19M2 =findViewById(R.id.v19);
        button20M2 =findViewById(R.id.v20);
        button21M2 =findViewById(R.id.v21);
        button22M2 =findViewById(R.id.v22);
        button23M2 =findViewById(R.id.v23);
        button24M2 =findViewById(R.id.v24);
        button25M2 =findViewById(R.id.v25);
        button26M2 =findViewById(R.id.v26);
        button27M2 =findViewById(R.id.v27);
        button28M2 =findViewById(R.id.v28);
        button29M2 =findViewById(R.id.v29);
        button30M2 =findViewById(R.id.v30);
        button31M2 =findViewById(R.id.v31);
        button32M2 =findViewById(R.id.v32);
        button33M2 =findViewById(R.id.v33);
        button34M2 =findViewById(R.id.v34);
        button35M2 =findViewById(R.id.v35);
        button36M2 =findViewById(R.id.v36);
        button37M2 =findViewById(R.id.v37);
        button38M2 =findViewById(R.id.v38);
        button39M2 =findViewById(R.id.v39);
        button40M2 =findViewById(R.id.v40);
        button41M2 =findViewById(R.id.v41);
        button42M2 =findViewById(R.id.v42);



        txtMarquee5 = findViewById(R.id.marqueeText5);
        txtMarquee5.setSelected(true);












        buttonM2.setOnClickListener(v -> {

            String url = "www.moi.gov.bd";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });


        button2M2.setOnClickListener(v -> {

            String url = "http://labour.nic.in/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);

        });

        button3M2.setOnClickListener(v -> {

            String url = "www.mohr.gov.my";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);

        });

        button4M2.setOnClickListener(v -> {

            String url = " http://www.mom.gov.sg/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);

        });

        button5M2.setOnClickListener(v -> {

            String url = "http://www.moi.gov.sa/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });



        button6M2.setOnClickListener(v -> {

            String url = "https://mhrys.gov.mv/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button7M2.setOnClickListener(v -> {

            String url = " http://www.moi.gov.qa/VsaWeb/Actions?action=geteServiceVisaInfoInput&language=english";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button8M2.setOnClickListener(v -> {

            String url = "http://www.moi.gov.kw/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button9M2.setOnClickListener(v -> {

            String url = "http://www.dvlottery.state.gov/ESC";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button10M2.setOnClickListener(v -> {

            String url = "www.moel.go.kr/english";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button11M2.setOnClickListener(v -> {

            String url = "http://www.labourdept.gov.lk/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button12M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
        button13M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button14M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
        button15M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button16M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });
        button17M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button18M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button19M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button20M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button21M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button22M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button23M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button24M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button25M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });


        button26M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button27M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button28M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button28M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button29M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button30M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button31M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button32M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button33M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button34M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button35M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button36M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button37M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        button38M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });


        button39M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });


        button40M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });


        button41M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });


        button42M2.setOnClickListener(v -> {

            String url = "https://forms.gle/iHH9m1MVC1DEBjbM6";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });








    }
}