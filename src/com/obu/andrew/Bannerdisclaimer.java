package com.obu.andrew;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bannerdisclaimer extends Activity {

	TextView tv;
	Button banner;
	
	  protected void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
		    setContentView(R.layout.bannerdisclaimer);
		    
		    
		    
		    
		    {   super.onCreate(savedInstanceState);
		        setContentView(R.layout.bannerdisclaimer);
		        tv = (TextView)findViewById(R.id.disclaimer);
		        tv.setText("Hello! Banner will only work on the Firefox Mobile Browser.  I am sorry for the inconvenience, but this is the webpage security check, and it appears impossible to spoof in the normal browser.");
		    }
		    
		    final Context contexta = this;
		    banner = (Button) findViewById(R.id.BFirefoxButton);
		    banner.getBackground().setColorFilter(Color.rgb(148, 148, 148), Mode.MULTIPLY);
		    banner.setOnClickListener(new View.OnClickListener()
		    {
		    	@Override
		      public void onClick(View v) {
		    		Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.okbu.edu/ssb"));
		    		startActivity(browserIntent);
		      }
		    });	

}
}
