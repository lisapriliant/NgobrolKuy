package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText etuser, etpass;
    private TextView tvlogin, tvlupass, tvregis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etuser = findViewById(R.id.username);
        etpass = findViewById(R.id.password);
        tvlogin = findViewById(R.id.login);
        tvlupass = findViewById(R.id.lupapass);
        tvregis = findViewById(R.id.registrasi);

        tvlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(LoginActivity.this, HomeChatActivity.class);
                startActivity(login);
            }
        });

        tvlupass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent forget = new Intent(LoginActivity.this, ForgetPasswordActivity.class);
                startActivity(forget);
            }
        });

        tvregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regis = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(regis);
            }
        });
    }
}