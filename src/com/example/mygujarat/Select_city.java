package com.example.mygujarat;





import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;





import android.R.string;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;





public class Select_city extends Activity{
	
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.select_city);
		
	
		 final android.app.ActionBar actionBar = getActionBar();
			actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#db2121")));
			actionBar.setTitle("Select City");
		
		  final ListView listView = ( ListView )findViewById(R.id.listV);
		 
		
		/*
		 
		  String[] cityname = new String[]{
				  "Ahmedabad",
				    "Amreli",
				    "Anand",
				    "Banaskantha",
				    "Bharuch",
				    "Dahod",
				    "Dangs",
				    "Gandhinagar",
				    "Gir Somnath",
				    "Jamnagar",
				    "Junagadh",
				    "Kutch",
				    "Kheda",
				    "Mehsana",
				    "Narmada",
				    "Navsari",
				    "Patan",
				    "Panchmahal",
				    "Porbandar",
				    "Rajkot",
				    "Sabarkantha",
				    "Surendranagar",
				    "Surat",
				    "Tapi",
				    "Vadodara",
				    "Valsad"
		    	
		    };
		  
		  List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();        
	        
		 for(int i=0;i<26;i++){
	        	HashMap<String, String> hm = new HashMap<String,String>();
	        	  
	        	hm.put("name",cityname[i].toString());
	           
	            aList.add(hm);        
	        }
	        
	      
	       String[] from = {"name"};
	        
	    
	        int[] to = { R.id.city_name};        
	        
	       
	        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.city_list, from, to);
	  
	       
	        
	       AnimationSet set = new AnimationSet(true);
	        Animation animation = new AlphaAnimation(0.0f, 1.0f);
	        animation.setDuration(300);
	        set.addAnimation(animation);
	       
	        LayoutAnimationController controller = new LayoutAnimationController(
	         set, 0.5f);
	        
	      
	        listView.setLayoutAnimation(controller);
	        
	       
	        listView.setAdapter(adapter);   */
		  
		  
	      
		  BBHelper obj = new BBHelper(Select_city.this, "", null, 0);
			SQLiteDatabase sd = obj.getWritableDatabase();
			Cursor c = sd.rawQuery("select DISTINCT City_Name FROM City",null);
			
			try{
				if(c.moveToFirst())
				{
					 List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();        
					 do{
						HashMap<String, String> hm = new HashMap<String,String>();
			            hm.put("name",c.getString(c.getColumnIndex("City_Name")).toString());
			         
			            
			            aList.add(hm); 
			            
						
						}while(c.moveToNext());
					
					 String[] from = {"name"};
				        
					    
				        int[] to = {R.id.city_name};        
				        
				       
				        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.city_list, from, to);
				  
				       
				        
				       AnimationSet set = new AnimationSet(true);
				        Animation animation = new AlphaAnimation(0.0f, 1.0f);
				        animation.setDuration(300);
				        set.addAnimation(animation);
				        LayoutAnimationController controller = new LayoutAnimationController(
				         set, 0.5f);
				        listView.setLayoutAnimation(controller);
				        
				       
				        listView.setAdapter(adapter);  
				}
			}catch (Exception e) {
				// TODO: handle exception
				
			}
		  
	        
	     listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
	    	 @Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				
				TextView tname = (TextView)arg1.findViewById(R.id.city_name);

				/*
				TextView tdate = (TextView)arg1.findViewById(R.id.datee);
				pdatee=tdate.getText().toString();
				
				TextView ttype = (TextView)arg1.findViewById(R.id.Types);
				ptype=ttype.getText().toString();
				
				TextView tid = (TextView)arg1.findViewById(R.id.idd);
				pidd=tid.getText().toString();
				
			*/
				
		
				
			//	g=4;
				
				Intent intentToBePassedToNextActivity = new Intent(getBaseContext(),Showtourist_place.class); 
				intentToBePassedToNextActivity.putExtra("select_city", tname.getText().toString());
				 
				startActivity(intentToBePassedToNextActivity); 
			    	overridePendingTransition(R.anim.right_slide_out, R.anim.right_slide_in);
		       	       
			      	
				
			}
	    	  
		});
	}
	
	
	
	
	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}*/
}
