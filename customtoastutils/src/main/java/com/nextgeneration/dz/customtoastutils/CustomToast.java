package com.nextgeneration.dz.customtoastutils;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Lamine on 2/1/2018.
 */

public class CustomToast extends AppCompatActivity {
    private Context context;
    private int backColor;
    private int textColor;
    private int titleTextColor;

    public CustomToast(Context context) {
        this.backColor = context.getResources().getColor(R.color.colorPrimary);
        this.textColor = context.getResources().getColor(R.color.white);
        this.titleTextColor = context.getResources().getColor(R.color.white);
        this.context = context;
    }

    public void setBackground(int backColor) {
        this.backColor = backColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    public void setTitleTextColor(int textColor) {
        this.titleTextColor = textColor;
    }


    public void showToastOnTop(String title, String message, int duration, int icon) {

        if (context != null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            View toastRoot = inflater.inflate(R.layout.custom_toast, null);
            LinearLayout linearLayout = (LinearLayout) toastRoot.findViewById(R.id.toast_achievement_layout);
            linearLayout.setBackgroundColor(backColor);
            TextView toastText = (TextView) toastRoot.findViewById(R.id.achievement_toast_message_text_view);
            TextView toastSuccessTitle = (TextView) toastRoot.findViewById(R.id.achievement_toast_title_text_view);
            toastSuccessTitle.setText(title);
            toastSuccessTitle.setTextColor(titleTextColor);
            toastText.setText(message);
            toastText.setTextColor(textColor);
            ImageView toastImage = (ImageView) toastRoot.findViewById(R.id.achievement_toast_icon);
            toastImage.setImageResource(icon);
            Toast toast = new Toast(context);
            toast.setView(toastRoot);
            toast.setGravity(Gravity.TOP | Gravity.FILL_HORIZONTAL, 0, 0);
            toast.setDuration(duration);
            toast.show();
        }

    }

    public void showToastOnBottom(String title, String message, int duration, int icon) {

        if (context != null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            View toastRoot = inflater.inflate(R.layout.custom_toast, null);
            LinearLayout linearLayout = (LinearLayout) toastRoot.findViewById(R.id.toast_achievement_layout);
            linearLayout.setBackgroundColor(backColor);
            TextView toastText = (TextView) toastRoot.findViewById(R.id.achievement_toast_message_text_view);
            TextView toastSuccessTitle = (TextView) toastRoot.findViewById(R.id.achievement_toast_title_text_view);
            toastSuccessTitle.setText(title);
            toastSuccessTitle.setTextColor(titleTextColor);
            toastText.setText(message);
            toastText.setTextColor(textColor);
            ImageView toastImage = (ImageView) toastRoot.findViewById(R.id.achievement_toast_icon);
            toastImage.setImageResource(icon);
            Toast toast = new Toast(context);
            toast.setView(toastRoot);
            toast.setGravity(Gravity.BOTTOM | Gravity.FILL_HORIZONTAL, 0, 0);
            toast.setDuration(duration);
            toast.show();
        }

    }

}
