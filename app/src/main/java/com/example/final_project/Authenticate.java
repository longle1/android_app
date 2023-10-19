package com.example.final_project;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthMissingActivityForRecaptchaException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;

import java.text.DecimalFormat;
import java.util.Random ;
import java.util.concurrent.TimeUnit;

public class Authenticate extends AppCompatActivity {
    Button btnConfirm, btnNext, btnBack;
    ImageButton btnBackToLogin;
    LinearLayout layoutConfirm, layoutMethod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authenticate);


        btnBackToLogin = (ImageButton) findViewById(R.id.btnBack);
        btnNext = (Button) findViewById(R.id.btnNext);

        //Random otp
        String phoneNumber = "+84947934406";

        layoutConfirm = (LinearLayout) findViewById(R.id.layoutConfirmAccount);
        layoutMethod = (LinearLayout) findViewById(R.id.layoutMethod);
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
//                layoutMethod.setVisibility(View.GONE);
//                layoutConfirm.setVisibility((View.VISIBLE));
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
//    @Override
//    protected void onStart() {
//        super.onStart();
//        FirebaseUser currentUser =  FirebaseAuth.getInstance().getCurrentUser();
//        if(currentUser != null) {
//            finish();
//        }
//    }
}