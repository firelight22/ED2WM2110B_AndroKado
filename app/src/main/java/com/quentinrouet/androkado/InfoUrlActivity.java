package com.quentinrouet.androkado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.quentinrouet.androkado.bo.Article;

public class InfoUrlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_url);
        Article articleRecupere = getIntent().getParcelableExtra("article");
        TextView textView = findViewById(R.id.textView);
        textView.setText(articleRecupere.getUrl());
    }
}