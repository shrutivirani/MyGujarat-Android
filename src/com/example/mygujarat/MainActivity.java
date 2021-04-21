package com.example.mygujarat;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		new CountDownTimer(2000,1) {
		    @Override
		public void onTick(long ar) {
		         		}
		            
		         		@Override
		        public void onFinish() {
		         			
		         			 Intent intentToBePassedToNextActivity = new Intent(getBaseContext(),Home.class);  
		       	        	startActivity(intentToBePassedToNextActivity); 
		       	        
		       	        	overridePendingTransition(R.anim.right_slide_out, R.anim.right_slide_in);
		       	        	
		       	        	MainActivity.this.finish();
		       	        //	overridePendingTransition(R.anim.right_slide_out, R.anim.right_slide_in);
			
			
		        	}
		        	}.start();
		        	
		
	}

	

	
}
