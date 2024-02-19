package com.example.firstlesson;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SupActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sup);

        TextView supText = findViewById(R.id.supText);
        supText.setText("Sup " + getIntent().getStringExtra("YourName") + "!");


        Button returnButton = findViewById(R.id.returnButton);

        returnButton.setOnClickListener(v -> {
            Log.d("SupActivity", "Finishing SupActivity due to returnButton click");
            finish();
        });

    }
}