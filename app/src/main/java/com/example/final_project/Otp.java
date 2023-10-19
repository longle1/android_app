package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.chaos.view.PinView;
import com.google.firebase.auth.PhoneAuthProvider;

public class Otp extends AppCompatActivity {
    ImageButton btnBack;
    Button btnConfirm;
    TextView tvResend, tvNotificationResend;
    boolean isResend = true, isClickedResend = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        final LoadingDialog loadingDialog = new LoadingDialog(Otp.this);

        btnBack = findViewById(R.id.btnBack);
        btnConfirm = findViewById(R.id.btnConfirm);
        tvResend = findViewById(R.id.tvResend);
        tvNotificationResend = findViewById(R.id.txtNotificationResend);
        tvNotificationResend.setVisibility(View.VISIBLE);
        startCountdownTimer();



        tvResend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isClickedResend) {
                    if(isResend) {
                        isResend = false;
                        isClickedResend = false;
                        tvNotificationResend.setVisibility(View.VISIBLE);
                    }else {
                        startCountdownTimer();
                    }
                }else {
                    Toast.makeText(Otp.this, "Thao tác này không thể thực hiện", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Register.class);
                startActivity(intent);
            }
        });
    }

    private void startCountdownTimer() {
        
    }
}