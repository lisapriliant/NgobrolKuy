package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ForgetPasswordActivity extends AppCompatActivity {

    private TextView tvsubmit;
    private ImageView imgkembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        tvsubmit = findViewById(R.id.submit);
        imgkembali = findViewById(R.id.kembali);

        imgkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(ForgetPasswordActivity.this, LoginActivity.class);
                startActivity(kembali);
            }
        });

        tvsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent submit = new Intent(ForgetPasswordActivity.this, EmailActivity.class);
                startActivity(submit);
            }
        });
    }
}