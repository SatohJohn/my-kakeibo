package com.example.satohjohn.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.button);
        view.setOnClickListener((view1) -> {
            Intent intent = new Intent(MainActivity.this, TestActivity.class);
            startActivity(intent);
        });
        View view2 = findViewById(R.id.button2);
        view2.setOnClickListener((view1) -> {
            Intent intent = new Intent(MainActivity.this, Content1Activity.class);
            startActivity(intent);
        });
    }

}
