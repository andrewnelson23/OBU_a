package com.obu.andrew;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Majors extends Activity
{
  private WebView webView;

  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.majors);
    webView = (WebView)findViewById(R.id.Majors);
    webView.loadUrl("http://www.okbu.edu/academics/majors.html");
    webView.setVerticalScrollBarEnabled(true);
    webView.setHorizontalScrollBarEnabled(true);
    webView.setWebViewClient(new WebViewClient());
    webView.getSettings().setJavaScriptEnabled(true);
  }
}