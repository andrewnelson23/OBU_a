package com.obu.andrew;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Emailwebview extends Activity
{
  private WebView webView;

  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.email);
    webView = (WebView)findViewById(R.id.Email);
    webView.loadUrl("https://email.okbu.edu");
    webView.setVerticalScrollBarEnabled(true);
    webView.setHorizontalScrollBarEnabled(true);
    webView.setWebViewClient(new WebViewClient());
    webView.getSettings().setJavaScriptEnabled(true);
  }
}