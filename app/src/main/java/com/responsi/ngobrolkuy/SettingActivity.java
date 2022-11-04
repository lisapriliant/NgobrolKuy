package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class SettingActivity extends AppCompatActivity {

    private TextView tvchange, tvchangepass;
    private ImageView imgback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        tvchange = findViewById(R.id.chagedisplay);
        tvchangepass = findViewById(R.id.chagepass);
        imgback = findViewById(R.id.kembali);

        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(SettingActivity.this, HomeChatActivity.class);
                startActivity(back);
            }
        });

        tvchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent change = new Intent(SettingActivity.this, ProfilePicActivity.class);
                startActivity(change);
            }
        });

        tvchangepass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cpass = new Intent(SettingActivity.this, ForgetPasswordActivity.class);
                startActivity(cpass);
            }
        });
    }
}