package com.example.mygujarat;





import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;





import android.R.string;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;


public class Home extends Activity{
	TextView a_tx;
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		
		
		 final android.app.ActionBar actionBar = getActionBar();
		 
		actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#db2121")));
			
			
		
		 final ImageView a_img=(ImageView)findViewById(R.id.a_img);
		 final ImageView b_img=(ImageView)findViewById(R.id.b_img);
		 final LinearLayout one_event=(LinearLayout)findViewById(R.id.one_e);
		 a_tx  =(TextView)findViewById(R.id.a_tx);
	       
		 final LinearLayout two_event=(LinearLayout)findViewById(R.id.two_e);
			
		 //img_v.animate().translationX(400).withLayer();
		
		/* final int[] pics = new int[]{
		    		R.drawable.city
		    		
		    	
		    		
		    		
		    		
		    };
		    
		    
		 */
		 
		 
		
		 
		 Animation anii = AnimationUtils.loadAnimation(getBaseContext(),R.anim.test);
			
			
				a_img.startAnimation(anii);
				b_img.startAnimation(anii);
		  
		//  img_v.animate().scaleX(3);
		//img_v.animate().scaleY(3);
		  
		  
		  
		 
		 one_event.setOnClickListener(new OnClickListener() {
			
			 
			 
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				Intent intentToBePassedToNextActivity = new Intent(getBaseContext(),Select_city.class); 
		      	startActivity(intentToBePassedToNextActivity); 
		    	overridePendingTransition(R.anim.right_slide_out, R.anim.right_slide_in);
	       	       
			}
		});
		
		 two_event.setOnClickListener(new OnClickListener() {
				
			 
			 
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					Intent intentToBePassedToNextActivity = new Intent(getBaseContext(),Showfestival.class); 
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
