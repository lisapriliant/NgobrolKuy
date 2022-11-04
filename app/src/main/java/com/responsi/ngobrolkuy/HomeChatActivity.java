package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class HomeChatActivity extends AppCompatActivity {

    private ImageView imgsetting;
    private LinearLayout lilachat1, lilachat2, lilachat3, lilachat4, lilachat5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_chat);
        imgsetting = findViewById(R.id.setting);
        lilachat1 = findViewById(R.id.chat1);
        lilachat2 = findViewById(R.id.chat2);
        lilachat3 = findViewById(R.id.chat3);
        lilachat4 = findViewById(R.id.chat4);
        lilachat5 = findViewById(R.id.chat5);

        imgsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent setting = new Intent(HomeChatActivity.this, SettingActivity.class);
                startActivity(setting);
            }
        });

        lilachat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chat = new Intent(HomeChatActivity.this, PersonalChatActivity.class);
                startActivity(chat);
            }
        });

        lilachat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chat = new Intent(HomeChatActivity.this, PersonalChatActivity.class);
                startActivity(chat);
            }
        });

        lilachat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chat = new Intent(HomeChatActivity.this, PersonalChatActivity.class);
                startActivity(chat);
            }
        });

        lilachat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chat = new Intent(HomeChatActivity.this, PersonalChatActivity.class);
                startActivity(chat);
            }
        });

        lilachat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chat = new Intent(HomeChatActivity.this, PersonalChatActivity.class);
                startActivity(chat);
            }
        });
    }
}