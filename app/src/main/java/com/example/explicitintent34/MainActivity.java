package com.example.explicitintent34;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn,btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        btn2=findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondintent();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webpageselect();

            }
        });
    }
    public void secondintent(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }

    public void webpageselect(){
        Uri webpage = Uri.parse("https://www.google.com");
        Intent intent= new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(intent);

    }
}