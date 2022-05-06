package com.lau.spring2022.exam_helper_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    WebView viewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_web);


        Intent intent = getIntent();

        String url = intent.getStringExtra("url");

        viewer = (WebView) findViewById(R.id.webview);

        viewer.getSettings().setJavaScriptEnabled(true);
        viewer.setWebViewClient(new WebViewClient());
        viewer.loadUrl(url);
    }
}