package com.obu.andrew;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class About extends Activity
{
  TextView tv;

  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.about);
    tv = (TextView)findViewById(R.id.about);
    tv.setText("Hello! Thank you for using this OBU app.  This is developed by Andrew C. Nelson. Please understand that I just started developing, and this is kind of a learning process for me.  I think I will use this app simply because of the functionality it provides and convenience, and I hope you do too.  I hope you enjoy the app. :)");
  }
}