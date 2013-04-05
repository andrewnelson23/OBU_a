package com.obu.andrew;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {
	
  public void onCreate(Bundle savedInstanceState)
  
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    TabHost tabHost = getTabHost();
    
    TabSpec cstudents = tabHost.newTabSpec("Current Students");
    cstudents.setIndicator("Students");
    Intent cstudentsIntent = new Intent(this, CurrentStudents.class);
    cstudents.setContent(cstudentsIntent);
    
    TabSpec prospects = tabHost.newTabSpec("Prospectives");
    prospects.setIndicator("Prospects");
    Intent prospectsIntent = new Intent(this, ProspectiveStudents.class);
    prospects.setContent(prospectsIntent);
    
    TabSpec majors = tabHost.newTabSpec("Majors");
    majors.setIndicator("Majors");
    Intent majorsIntent = new Intent(this, Majors.class);
    majors.setContent(majorsIntent);
    
    tabHost.addTab(cstudents);
    tabHost.addTab(prospects);
    tabHost.addTab(majors);
  }
}