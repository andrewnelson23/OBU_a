package com.andrew.obu;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Staffwebview extends Activity
{
  private WebView webView;

  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.staff);
    webView = ((WebView)findViewById(R.id.Staff));
    webView.getSettings().setUserAgentString("Android");
    webView.loadUrl("http://www.okbu.edu/businessaffairs/hr/staff_directory.html");
    webView.setVerticalScrollBarEnabled(true);
    webView.setHorizontalScrollBarEnabled(true);
    webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
    webView.setWebViewClient(new WebViewClient());
  }
}