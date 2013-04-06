package com.andrew.obu;


import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Infowebview extends Activity {
	
	private WebView webView;

	  public void onCreate(Bundle savedInstanceState)
	  {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.info);
	    webView = (WebView)findViewById(R.id.Info);
	    webView.loadUrl("http://www.okbu.edu/admissions/moreinfo.html");
	    webView.setVerticalScrollBarEnabled(true);
	    webView.setHorizontalScrollBarEnabled(true);
	    webView.setWebViewClient(new WebViewClient());
	    webView.getSettings().setLoadWithOverviewMode(true);
	    webView.getSettings().setUseWideViewPort(true);
	    webView.getSettings().setJavaScriptEnabled(true);
	    webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
	  }

}
