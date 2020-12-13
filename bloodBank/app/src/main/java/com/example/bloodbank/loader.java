package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class loader extends AppCompatActivity {

    private ImageView i1;
    private ImageView i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loader);
        i1=findViewById(R.id.i1);
        i2=findViewById(R.id.i2);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(loader.this,home.class);
                startActivity(intent);
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(loader.this,chatbot.class);
                startActivity(intent);
            }
        });
    }
}