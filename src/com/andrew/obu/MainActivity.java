package com.andrew.obu;


import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
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
    prospects.setIndicator("Prospectives");
    Intent prospectsIntent = new Intent(this, ProspectiveStudents.class);
    prospects.setContent(prospectsIntent);
    
    tabHost.addTab(cstudents);
    tabHost.addTab(prospects);
    
    tabHost.getTabWidget().getChildAt(0).setBackgroundColor(Color.BLACK);
    tabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.BLACK);  
  
    
    tabHost.setOnTabChangedListener(new OnTabChangeListener() {

        @Override
        public void onTabChanged(String arg0) {
        	TabHost tabHost = getTabHost();

            setTabColor(tabHost);
        }
         });
         setTabColor(tabHost);
  }
  public void setTabColor(TabHost tabhost) {

	    for(int i=0;i<tabhost.getTabWidget().getChildCount();i++)
	        tabhost.getTabWidget().getChildAt(i).setBackgroundColor(Color.BLACK); //unselected

	    if(tabhost.getCurrentTab()==0)
	           tabhost.getTabWidget().getChildAt(tabhost.getCurrentTab()).setBackgroundColor(Color.rgb(34, 34, 34)); //1st tab selected
	    else
	           tabhost.getTabWidget().getChildAt(tabhost.getCurrentTab()).setBackgroundColor(Color.rgb(34, 34, 34)); //2nd tab selected
	}
}