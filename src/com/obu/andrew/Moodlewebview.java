package com.obu.andrew;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Moodlewebview extends Activity
{
  private WebView webView;

  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.moodle);
    webView = (WebView)findViewById(R.id.Moodle);
    webView.loadUrl("https://moodlerooms.okbu.edu");
    webView.setVerticalScrollBarEnabled(true);
    webView.setHorizontalScrollBarEnabled(true);
    webView.setWebViewClient(new WebViewClient());
    webView.getSettings().setLoadWithOverviewMode(true);
    webView.getSettings().setUseWideViewPort(true);
    webView.getSettings().setJavaScriptEnabled(true);
  }
}