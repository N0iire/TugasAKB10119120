package com.example.tugasakb10119120;
/**
 * Tanggal : 21-04-2022 : 12:03 AM
 * Nama  : Reichan Muhammad Maulana
 * NIM : 10119120
 * Kelas : IF-3
 */
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button switchToProfile, logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchToProfile = findViewById(R.id.btn_profile);
        switchToProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchProfile();
            }
        });

        logout = findViewById(R.id.btn_logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchLogout();
            }
        });
    }

    private void switchProfile(){
        Intent switchActivityIntent = new Intent(this, ProfileActivity.class);
        startActivity(switchActivityIntent);
    }

    private void switchLogout(){
        finish();
        System.exit(0);
    }
}