package com.obu.andrew;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Newswebview extends Activity
{
  private WebView webView;

  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.news);
    webView = (WebView)findViewById(R.id.News);
    webView.loadUrl("http://www.okbu.edu/m/news.html");
    webView.setVerticalScrollBarEnabled(true);
    webView.setHorizontalScrollBarEnabled(true);
    webView.setWebViewClient(new WebViewClient());
    webView.getSettings().setJavaScriptEnabled(true);
  }
}
