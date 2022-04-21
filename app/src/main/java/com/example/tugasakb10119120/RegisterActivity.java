package com.example.tugasakb10119120;
/**
 * Tanggal : 21-04-2022 : 1:32 AM
 * Nama  : Reichan Muhammad Maulana
 * NIM : 10119120
 * Kelas : IF-3
 */
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {
    TextView switchToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        switchToLogin = findViewById(R.id.alaccount);
        switchToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchActivities();
            }
        });
    }

    private void switchActivities(){
        Intent switchActivityIntent = new Intent(this, LoginActivity.class);
        startActivity(switchActivityIntent);
    }
}