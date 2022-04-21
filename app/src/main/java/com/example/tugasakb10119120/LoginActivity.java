package com.example.tugasakb10119120;
/**
 * Tanggal : 21-04-2022 : 1:22 AM
 * Nama  : Reichan Muhammad Maulana
 * NIM : 10119120
 * Kelas : IF-3
 */
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView switchToRegister;
    Button switchToMainActivities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        switchToRegister = findViewById(R.id.createnewac);
        switchToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchActivities();
            }
        });

        switchToMainActivities = findViewById(R.id.btnlogin);
        switchToMainActivities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchToMain();
            }
        });
    }

    private void switchActivities(){
        Intent switchActivityIntent = new Intent(this, RegisterActivity.class);
        startActivity(switchActivityIntent);
    }

    private void switchToMain(){
        Intent switchActivityIntent = new Intent(this, MainActivity.class);
        startActivity(switchActivityIntent);
    }
}