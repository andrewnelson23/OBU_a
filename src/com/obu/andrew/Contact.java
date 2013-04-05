package com.obu.andrew;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Contact extends Activity
{
  TextView tv;

  public void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.contact);
    this.tv = (TextView)findViewById(R.id.contact);
    this.tv.setText("You can contact me through a couple of ways. \n\nEmail me: andrew.nelson@okbu.edu \n\nFind me on Facebook at https://www.facebook.com/andrew.c.nelson23");
  }
}
