package com.andrew.obu;


import android.net.Uri;
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

public class ProspectiveStudents extends ListActivity
{
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
        String[] choose = getResources().getStringArray(R.array.pstudents_array);
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
	            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.okbu.edu/admissions/onlineapp.html"));
	            break;
	        case 2 :          
	        	intent = new Intent(this, Majors.class);
	            break;
	        case 3 :
	        	intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.okbu.edu/admissions/moreinfo.html"));
	            break;
	        case 4 :
	        	intent = new Intent(this, Visitwebview.class);
	            break;
	        /*case 5 :
	        	intent = new Intent(this, Getinvolved.class);
	            break;*/
	    }
						
		startActivity(intent);
	};
}