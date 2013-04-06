package com.andrew.obu;


import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
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
		
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		Intent intent;
		switch(position) {
	    	default:
	        case 0 :     
	            intent = new Intent(this, Bannerdisclaimer.class);
	            break;
	        case 2 :          
	        	intent = new Intent(this, Emailwebview.class);
	            break;
	        case 3 :
	        	intent = new Intent(this, Moodlewebview.class);
	            break;
	        case 4 :
	        	intent = new Intent(this, Jupiterwebview.class);
	            break;
	        case 5 :
	        	intent = new Intent(this, Staffwebview.class);
	            break;
	        case 6 :
	        	intent = new Intent(this, Calendar.class);
	            break;
	        case 7 :
	        	intent = new Intent(this, Athleticswebview.class);
	            break;
	        case 8 :
	        	intent = new Intent(this, Newswebview.class);
	            //intent7.putExtra("KEY_SELECTED_INDEX", position);
	            //startActivity(intent7);
	            break;
	    }
		
		startActivity(intent);
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
		
	