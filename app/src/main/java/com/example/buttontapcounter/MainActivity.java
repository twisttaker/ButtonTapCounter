
package com.example.buttontapcounter;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvCounter;
    private Button btnTap, btnReset;

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect XML components with Java
        tvCounter = findViewById(R.id.tvCounter);
        btnTap = findViewById(R.id.btnTap);
        btnReset = findViewById(R.id.btnReset);

        // Increase counter when TAP ME is clicked
        btnTap.setOnClickListener(v -> {
            count++;
            tvCounter.setText(String.valueOf(count));
        });

        // Reset counter to zero
        btnReset.setOnClickListener(v -> {
            count = 0;
            tvCounter.setText(String.valueOf(count));
        });
    }
}
