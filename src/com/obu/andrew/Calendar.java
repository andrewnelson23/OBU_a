package com.obu.andrew;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Calendar extends Activity {
	
  Button academic, chapel, finals;  
  
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.calendars);
    
    final Context contexta = this;
    chapel = (Button) findViewById(R.id.ChapelButton);
    chapel.getBackground().setColorFilter(Color.rgb(148, 148, 148), Mode.MULTIPLY);
    chapel.setOnClickListener(new View.OnClickListener()
    {
    	@Override
      public void onClick(View v) {
        Intent myWebView = new Intent(contexta, Chapelswebview.class);
        startActivity(myWebView);
      }
    });
    
    final Context contextb = this;
    academic = (Button) findViewById(R.id.AcademicButton);
    academic.getBackground().setColorFilter(Color.rgb(148, 148, 148), Mode.MULTIPLY);
    academic.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent myWebView = new Intent(contextb, Academicswebview.class);
        startActivity(myWebView);
      }
    });
    
    final Context contextc = this;
    finals = (Button)findViewById(R.id.FinalsButton);
    finals.getBackground().setColorFilter(Color.rgb(148, 148, 148), Mode.MULTIPLY);
    finals.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View v)
      {
        Intent myWebView = new Intent(contextc, Finalswebactivity.class);
        startActivity(myWebView);
      }
    });
  }
}
