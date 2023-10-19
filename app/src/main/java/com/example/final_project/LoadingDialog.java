package com.example.final_project;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LoadingDialog {
    Activity activity;
    LayoutInflater inflate;
    AlertDialog.Builder aleart;
    View view;
    AlertDialog alertDialog;
    public LoadingDialog(Activity mainActivity) {
        activity = mainActivity;
    }

    public void startLoadingDialog() {
        aleart = new AlertDialog.Builder(activity);

        //Chuyển đổi 1 đối tượng xml thành đối tượng view
        LayoutInflater inflate = activity.getLayoutInflater();
        aleart.setView(inflate.inflate(R.layout.custome_loading, null));
        aleart.setCancelable(false);

        alertDialog = aleart.create();
        alertDialog.show();

    }
    public void cancelLoadingDialog(boolean isSusscess) {
        alertDialog.dismiss();
        aleart = new AlertDialog.Builder(activity);
        // Chuyển đổi 1 đối tượng xml thành đối tượng view
        inflate = activity.getLayoutInflater();
        if(isSusscess) {

        }else {

        }
        aleart.setView(view);
        aleart.setCancelable(false);

        alertDialog = aleart.create();
        alertDialog.show();
    }

}
