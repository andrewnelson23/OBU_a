package com.andrew.obu;

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
    tv.setText("School: Oklahoma Baptist University\n\nDeveloper: Andrew Nelson\n\nVersion: 3.0\n\n");
  }
}