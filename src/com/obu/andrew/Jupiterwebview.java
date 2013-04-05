package com.obu.andrew;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Jupiterwebview extends Activity
{
  private WebView webView;

  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.jupiter);
    webView = (WebView)findViewById(R.id.Jupiter);    
    webView.loadUrl("https://jupitergrades.com/login/");
    webView.setVerticalScrollBarEnabled(true);
    webView.setHorizontalScrollBarEnabled(true);
    webView.setWebViewClient(new WebViewClient());
    webView.getSettings().setJavaScriptEnabled(true);
  }
}