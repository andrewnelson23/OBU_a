package com.andrew.obu;


import android.app.Activity;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Bannerwebview extends Activity
{
  private WebView webView;

  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.banner);
    webView = ((WebView)findViewById(R.id.Banner));
    webView.loadUrl("http://www.okbu.edu/ssb");
    webView.setWebViewClient(new WebViewClient());
    webView.setVerticalScrollBarEnabled(true);
    webView.setHorizontalScrollBarEnabled(true);
    webView.getSettings().setJavaScriptEnabled(true);
    webView.getSettings().setUserAgentString("Mozilla/5.0 (Android; Mobile; rv:19.0) Gecko/19.0 Firefox/19.0");
    webView.setWebViewClient(new WebViewClient() {

        @Override
        public void onReceivedSslError (WebView view, SslErrorHandler handler, SslError error) {
            handler.proceed();
        }
    });
    
  }
}