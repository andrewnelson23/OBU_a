package com.andrew.obu;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Chapelswebview extends Activity
{
  private WebView webView;

  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.chapels);
    webView = (WebView)findViewById(R.id.Chapels);
    webView.getSettings().setJavaScriptEnabled(true);
    webView.loadUrl("http://www.okbu.edu/news/view_events.php?type=section&id=47");
  }
}