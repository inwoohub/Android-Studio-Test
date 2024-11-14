package com.example.myapplicationtest;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        TextView tv_sub = findViewById(R.id.tv_sub);
        TextView tv_sub2 = findViewById(R.id.tv_sub2);

        Intent intent = getIntent();
        String str = intent.getStringExtra("str");
        String str2 = intent.getStringExtra("str2");

        tv_sub.setText(str);
        tv_sub2.setText(str2);
    }
}
