package com.obu.andrew;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Visitwebview extends Activity {

	private WebView webView;

	  public void onCreate(Bundle savedInstanceState)
	  {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.visit);
	    webView = (WebView)findViewById(R.id.Visit);
	    webView.loadUrl("http://www.okbu.edu/admissions/visitingcampus.html");
	    webView.setVerticalScrollBarEnabled(true);
	    webView.setHorizontalScrollBarEnabled(true);
	    webView.setWebViewClient(new WebViewClient());
	    webView.getSettings().setLoadWithOverviewMode(true);
	    webView.getSettings().setUseWideViewPort(true);
	    webView.getSettings().setJavaScriptEnabled(true);
	  }

	
}
