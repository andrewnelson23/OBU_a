package com.obu.andrew;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Calendar extends ListActivity {
	
 /* Button academic, chapel, finals;  
  
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.calendars);*/
    
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        
        String[] choose = getResources().getStringArray(R.array.calendars_array);
        ListView lv = getListView();
		LayoutInflater lf;
        View headerView;
        lf = this.getLayoutInflater();
        headerView = (View)lf.inflate(R.layout.cstudents, null, false);

		lv.addHeaderView(headerView, null, false);
		lv.setTextFilterEnabled(true);
		lv.setBackgroundColor(Color.WHITE);
		setListAdapter(new ArrayAdapter<String>(this, R.layout.list_content, choose));
		}
		
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Intent intent;
		switch(position) {
	    	default:
	        case 0 :     
	            intent = new Intent(this, Academicswebview.class);
	            break;
	        case 2 :          
	        	intent = new Intent(this, Finalswebactivity.class);
	            break;
	        case 3 :
	        	intent = new Intent(this, Chapelswebview.class);
	            break;
    
		}
		startActivity(intent);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*final Context contexta = this;
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
    });*/
  }
}
