package com.benzlokzik.secondlesson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

    @Override
    protected void onStart() {
        Log.d("MainActivity", "onStart called");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Log.d("MainActivity", "onRestart called");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Log.d("MainActivity", "onResume called");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("MainActivity", "onPause called");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("MainActivity", "onStop called");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("MainActivity", "onDestroy called");
        super.onDestroy();
    }
}