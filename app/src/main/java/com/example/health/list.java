package com.example.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class list extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        button = (Button) findViewById(R.id.weekone);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list.this, list1Details.class);
                startActivity(intent);
            }
        });


        button = (Button) findViewById(R.id.weektwo);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list.this, list2Details.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.weekthree);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list.this, list3Details.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.weekfour);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list.this, list4Details.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.weekfive);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list.this, list5Details.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.weeksix);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list.this, list6Details.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.weekseven);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list.this, list7Details.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.weekeight);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list.this, list8Details.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.weeknine);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list.this, list9Details.class);
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.weekten);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(list.this, list10Details.class);
                startActivity(intent);
            }
        });
    }

}

