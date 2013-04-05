package com.obu.andrew;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;



public class CurrentStudents extends ListActivity {
	
	private static final int MENU_ABOUT = 0;
	private static final int MENU_CONTACT = 1;
	int counter;
	Button banner, email, moodle, jupiter, staff, calendar, athletics, news, prosp;
	TextView display;
	Drawable drawable;
	
    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu)
    {
     menu.add(0, MENU_ABOUT, 0, "About");
     menu.add(0, MENU_CONTACT, 0, "Contact Me");
     return true;
    }
        @Override
	public boolean onOptionsItemSelected(MenuItem item){
		switch (item.getItemId()) {
		case MENU_ABOUT:
			doSomething();
			return true;
		case MENU_CONTACT:
			doSomethingElse();
			return true;			
		}
			return super.onOptionsItemSelected(item);
    }
	private void doSomethingElse() {
		Intent intent = new Intent(getBaseContext(), Contact.class);
		startActivity(intent);
	}
	
	private void doSomething() {
        Intent intent = new Intent(getBaseContext(), About.class);
        startActivity(intent);}

	/*@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cstudents);*/
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);        
        String[] choose = getResources().getStringArray(R.array.cstudents_array);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, choose));
		ListView lv = getListView();
		lv.setTextFilterEnabled(true);
		}
		
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
	    switch(position) {
	        case '0' :     
	            Intent intent = new Intent(this, Bannerwebview.class);
	            startActivity(intent);
	            break;
	        case '1' :          
	        	Intent intent1 = new Intent(this, Emailwebview.class);
	            startActivity(intent1);
	            break;
	        case '2' :
	        	Intent intent2 = new Intent(this, Moodlewebview.class);
	            startActivity(intent2);
	            break;
	        case '3' :
	        	Intent intent3 = new Intent(this, Jupiterwebview.class);
	            startActivity(intent3);
	            break;
	        case '4' :
	        	Intent intent4 = new Intent(this, Staffwebview.class);
	            startActivity(intent4);
	            break;
	        case '5' :
	        	Intent intent5 = new Intent(this, Calendar.class);
	            startActivity(intent5);
	            break;
	        case '6' :
	        	Intent intent6 = new Intent(this, Athleticswebview.class);
	            startActivity(intent6);
	            break;
	        case '7' :
	        	Intent intent7 = new Intent(this, Newswebview.class);
	            //intent7.putExtra("KEY_SELECTED_INDEX", position);
	            startActivity(intent7);
	            break;
	    }
	};
}
		
		//Resources res = getResources();
		//drawable = res.getDrawable(R.drawable.bannera);
		
		
		
		
		
		
		
		
		
		
		
		
		/*final Context context1 = this;
		banner = (Button) findViewById(R.id.BannerButton);
		banner.getBackground().setColorFilter(Color.rgb(148, 148, 148), PorterDuff.Mode.MULTIPLY);
		banner.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebView = new Intent(context1, Bannerwebview.class);
					startActivity(myWebView);
			}
		});
		
		final Context context2 = this;
		email = (Button) findViewById(R.id.EmailButton);
		email.getBackground().setColorFilter(Color.rgb(148, 148, 148), PorterDuff.Mode.MULTIPLY);
		email.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebView = new Intent(context2, Emailwebview.class);
					startActivity(myWebView);
			}
		});
		
		final Context context3 = this;
		moodle = (Button) findViewById(R.id.MoodleButton);
		moodle.getBackground().setColorFilter(Color.rgb(148, 148, 148), PorterDuff.Mode.MULTIPLY);
		moodle.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebView = new Intent(context3, Moodlewebview.class);
					startActivity(myWebView);
			}
		});
		
		final Context context4 = this;
		jupiter = (Button) findViewById(R.id.JupiterButton);
		jupiter.getBackground().setColorFilter(Color.rgb(148, 148, 148), PorterDuff.Mode.MULTIPLY);
		jupiter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebView = new Intent(context4, Jupiterwebview.class);
					startActivity(myWebView);
			}
		});

		final Context context5 = this;
		staff = (Button) findViewById(R.id.StaffButton);
		staff.getBackground().setColorFilter(Color.rgb(148, 148, 148), PorterDuff.Mode.MULTIPLY);
		staff.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent myWebView = new Intent(context5, Staffwebview.class);
					startActivity(myWebView);
			}
		});		
		
		final Context context = this;
		calendar = (Button) findViewById(R.id.CalendarButton);
		calendar.getBackground().setColorFilter(Color.rgb(148, 148, 148), PorterDuff.Mode.MULTIPLY);
		calendar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context, Calendar.class);
				startActivity(intent);				
			}
		});
		
		final Context context6 = this;
		athletics = (Button) findViewById(R.id.AthleticsButton);
		athletics.getBackground().setColorFilter(Color.rgb(148, 148, 148), PorterDuff.Mode.MULTIPLY);
		athletics.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context6, Athleticswebview.class);
				startActivity(intent);				
			}
		});		
		final Context context7 = this;
		news = (Button) findViewById(R.id.NewsButton);
		news.getBackground().setColorFilter(Color.rgb(148, 148, 148), PorterDuff.Mode.MULTIPLY);
		news.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context7, Newswebview.class);
				startActivity(intent);				
			}
		});*/
		
	