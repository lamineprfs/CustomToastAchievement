package com.nextgeneration.dz.customtoastachievementexample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.nextgeneration.dz.customtoastutils.CustomToast;

public class MainActivity extends AppCompatActivity {

    Context context = MainActivity.this;

    private CustomToast bottomToast, topToast;
    Button btnToastBottom, btnToastTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomToast= new CustomToast(this);
        topToast = new CustomToast(this);

        btnToastBottom = findViewById(R.id.bottom_toast);
        btnToastTop = findViewById(R.id.top_toast);

        topToast.setBackground(context.getResources().getColor(R.color.colorAccent));

        btnToastBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomToast.showToastOnBottom("Test", "message bottom goes here", Toast.LENGTH_SHORT, R.drawable.ic_success);
            }
        });

        btnToastTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                topToast.showToastOnTop("Test", "message top goes here", Toast.LENGTH_SHORT, R.drawable.ic_error);
            }
        });
    }
}
