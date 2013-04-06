package com.andrew.obu;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.*;
import android.net.http.*;

public class Applywebview extends Activity {

	 private WebView webView;

	  public void onCreate(Bundle savedInstanceState)
	  {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.apply);
	    webView = (WebView)findViewById(R.id.Apply);
	    webView.loadUrl("http://www.okbu.edu/admissions/onlineapp.html");
	    webView.setVerticalScrollBarEnabled(true);
	    webView.setHorizontalScrollBarEnabled(true);
	    webView.setWebViewClient(new WebViewClient());
	    webView.getSettings().setLoadWithOverviewMode(true);
	    webView.getSettings().setUseWideViewPort(true);
	    webView.getSettings().setJavaScriptEnabled(true);
	    webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
	    webView.setWebViewClient(new WebViewClient() {

	        @Override
	        public void onReceivedSslError (WebView view, SslErrorHandler handler, SslError error) {
	            handler.proceed();
	        }
	    });
	  }
}
