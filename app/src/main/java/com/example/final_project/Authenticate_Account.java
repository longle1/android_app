package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Authenticate_Account extends AppCompatActivity {
    Button btnConfirm, btnNext, btnBack;
    ImageButton btnBackToLogin;
    LinearLayout layoutConfirm;
    LinearLayout layoutMethod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authenticate_account);

        btnBackToLogin = (ImageButton) findViewById(R.id.btnBack);
        btnNext = (Button) findViewById(R.id.btnNext);


        layoutConfirm = (LinearLayout)findViewById(R.id.layoutConfirmAccount);
        layoutMethod = (LinearLayout)findViewById(R.id.layoutMethod);
        btnConfirm = (Button) findViewById(R.id.btnFind);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutConfirm.setVisibility(View.GONE);
                layoutMethod.setVisibility((View.VISIBLE));
            }
        });

        btnBackToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layoutMethod.setVisibility(View.GONE);
                layoutConfirm.setVisibility((View.VISIBLE));

                Intent intent = new Intent(getApplicationContext(), Otp.class);
                intent.putExtra("key", "authenticate_page");
                startActivity(intent);
            }
        });

        btnBackToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });

    }
}