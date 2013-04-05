package com.obu.andrew;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Academicswebview extends Activity
{
  private WebView webView;

  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.academics);
    webView = (WebView)findViewById(R.id.Academics);
    webView.getSettings().setJavaScriptEnabled(true);
    webView.loadUrl("http://www.okbu.edu/news/view_events.php?type=section&id=5");
  }
}