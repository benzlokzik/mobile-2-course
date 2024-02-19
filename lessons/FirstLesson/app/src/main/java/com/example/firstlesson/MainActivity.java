package com.example.firstlesson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText YourName;
    private Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        YourName = findViewById(R.id.YourName);
        continueButton = findViewById(R.id.continueButton);


        continueButton.setOnClickListener(v -> {
            String name = YourName.getText().toString();
            if (name.isEmpty()) {
                String error_msg = "Please enter your name";
                YourName.setError(error_msg);
                Toast.makeText(MainActivity.this, error_msg, Toast.LENGTH_LONG).show();

                Log.d("YourName", "Name is empty");
            } else {
                YourName.setError(null);
                Log.d("YourName", name);

                Intent intent = new Intent(MainActivity.this, SupActivity.class);
                intent.putExtra("YourName", name);
                startActivity(intent);
                Log.d("YourName", "Starting SupActivity");

            }
        });
    }
}