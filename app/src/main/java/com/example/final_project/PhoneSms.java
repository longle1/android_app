package com.example.final_project;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class PhoneSms {
    private Activity activity;
    public String verificationId;
    public boolean toggleInterface;
    public String phoneNumber;
    public  PhoneSms(Activity activity, boolean toggleInterface, String phoneNumber) {
        this.activity = activity;
        this.toggleInterface = toggleInterface;
        this.phoneNumber = phoneNumber;
    }

}
