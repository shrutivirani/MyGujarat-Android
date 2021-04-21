package com.example.mygujarat;

import java.io.ByteArrayOutputStream;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import android.R.color;
import android.R.drawable;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentPagerAdapter;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class Showtourist_place extends ActionBarActivity implements ActionBar.TabListener {

	/**
	 * The {@link android.support.v4.view.PagerAdapter} that will provide
	 * fragments for each of the sections. We use a {@link FragmentPagerAdapter}
	 * derivative, which will keep every loaded fragment in memory. If this
	 * becomes too memory intensive, it may be best to switch to a
	 * {@link android.support.v4.app.FragmentStatePagerAdapter}.
	 */
	SectionsPagerAdapter mSectionsPagerAdapter;

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;
	public int g=0;
	static String select_city;
	public String[] name;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show);
	
		// Set up the action bar.

		
		name=new String[100];
		
	
	
		
				
		final ActionBar actionBar = getSupportActionBar();
		
		
		Intent myinIntent = getIntent();
		select_city=myinIntent.getStringExtra("select_city");
		actionBar.setTitle(select_city);
		BBHelper obj = new BBHelper(getBaseContext(), "", null, 0);
		SQLiteDatabase sd = obj.getWritableDatabase();
		Cursor c = sd.rawQuery("select C_ID,Name FROM City where City_Name='"+ select_city +"' Order by C_ID" ,null);
		try{
			int j=0;
			if(c.moveToFirst())
			{
				  do{
				//g = c.getString();
				 g=Integer.parseInt(c.getString(c.getColumnIndex("C_ID")));
			     name[j]=c.getString(c.getColumnIndex("Name")).toString();
				    
				 
				 //city_ar[] 
				 j++;
					}while(c.moveToNext());
				
			
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			
		}
		
		
		//get_data();
		
	
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#db2121")));
		actionBar.setStackedBackgroundDrawable(new ColorDrawable(Color.parseColor("#db2121")));
		
		// Create the adapter that will return a fragment for each of the three
		// primary sections of the activity.
		
	
		
		mSectionsPagerAdapter = new SectionsPagerAdapter(
				getSupportFragmentManager());

		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		ImageView img =(ImageView)findViewById(R.id.back_img);
		
		
		
		 Animation anii = AnimationUtils.loadAnimation(getBaseContext(),R.anim.s_img_ani_file);
			img.startAnimation(anii);
			img.setBackgroundResource(R.drawable.select_backk);
		mViewPager.setAdapter(mSectionsPagerAdapter);
	
		 

		// When swiping between different sections, select the corresponding
		// tab. We can also use ActionBar.Tab#select() to do this if we have
		// a reference to the Tab.
		mViewPager
				.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
					@Override
					public void onPageSelected(int position) {
						actionBar.setSelectedNavigationItem(position);
						Animation anii = AnimationUtils.loadAnimation(getBaseContext(),R.anim.s_img_ani_file);
						
						ImageView img =(ImageView)findViewById(R.id.back_img);
						
						
							img.startAnimation(anii);
							//img.setBackgroundResource(pics[position]);
							img.setBackgroundResource(R.drawable.select_backk);
							
					}
				});

		// For each of the sections in the app, add a tab to the action bar.
		for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
			// Create a tab with text corresponding to the page title defined by
			// the adapter. Also specify this Activity object, which implements
			// the TabListener interface, as the callback (listener) for when
			// this tab is selected.
			actionBar.addTab(actionBar.newTab()
					.setText(mSectionsPagerAdapter.getPageTitle(i))
					.setTabListener(this));
			
			
		}
	}


	@Override
	public void onTabSelected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
		// When the given tab is selected, switch to the corresponding page in
		// the ViewPager.
		mViewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
	
	}

	@Override
	public void onTabReselected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
	}

	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		



		



		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			// getItem is called to instantiate the fragment for the given page.
			// Return a PlaceholderFragment (defined as a static inner class
			// below).
			
			
			
				//return  PlaceholderFragment.newInstance(position);
			return PlaceholderFragment.newInstance(position,name[position]);
		
		//return PlaceholderFragment.newInstance(position,getPageTitle(position));
			
		}

		
		
		@Override
		public int getCount() {
			// Show 3 total pages.
			 
			//Toast tos = Toast.makeText(getBaseContext(), g, Toast.LENGTH_SHORT);
			//tos.show();
			return g;
			
			
		}

		
		
		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();
			
		/*	switch (position) {
			case 0:
				return "Snset point";
				
			case 1:
				return "Shabari dham";
				
			case 2:
				return "Botanical Garden";
				
			case 3:
				return "Maya Devi";
			}*/
			
			
			return name[position];
		}
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		private static final String ARG_SECTION_NUMBER = "section_number";
		 public static String dd;
		 
		 private String title;
		 private int page;
		 
		 String infoG;
		 String infoE;
		 String LatLong;
		 
		 Boolean isInternetPresent = false;
		 ConnectionDetector cd;
		 
		/**
		 * Returns a new instance of this fragment for the given section number.
		 */
		public static PlaceholderFragment newInstance(int page , String title) {
			PlaceholderFragment fragment = new PlaceholderFragment();
			Bundle args = new Bundle();
	        args.putInt("someint", page);
			args.putString("sometitle", title);
			
			fragment.setArguments(args);
			
			return fragment;
			
		}
		
			@Override
		public void onCreate(Bundle savedlnstanceState){
			super.onCreate(savedlnstanceState);
			page=getArguments().getInt("someint",0);
			title=getArguments().getString("sometitle");
		}
	
		@Override
		public View onCreateView(LayoutInflater inflater, final ViewGroup container,
				Bundle savedInstanceState) {
			
			View rootView = inflater.inflate(R.layout.fragment_show, container,
					false);
			
		
				
			
			
			
			final ImageView img = ( ImageView )rootView.findViewById(R.id.vvvv);
			final ImageView imageVie2 = ( ImageView )rootView.findViewById(R.id.imageVie2);
			final ImageView imageVi1 = ( ImageView )rootView.findViewById(R.id.imageVi1);
			
			
			
			final Typeface FE = Typeface.createFromAsset(getActivity().getAssets(),"font/akshar.ttf");
			
			final Button En= (Button)rootView.findViewById(R.id.En);
			final Button Gu= (Button)rootView.findViewById(R.id.Gu);
			
			final TextView info_tx = ( TextView )rootView.findViewById(R.id.info_tx);
			final RelativeLayout map_show = ( RelativeLayout )rootView.findViewById(R.id.map_show);
		
			info_tx.setTypeface(FE);
			
			cd = new ConnectionDetector(container.getContext());
			 
				
				
				
			
		
			
			
			
			//Toast ts=Toast.makeText(container.getContext(), dd , Toast.LENGTH_SHORT);
			//ts.show();
			
			BBHelper obj = new BBHelper(container.getContext(), "", null, 0);
			SQLiteDatabase sd = obj.getWritableDatabase();
			Cursor c = sd.rawQuery("select * FROM City where Name='"+ title +"';",null);
			
			try{
				if(c.moveToFirst())
				{
					 
					 // info_tx.setText(c.getString(c.getColumnIndex("Info")).toString());
					 
					
						
						
					
					// List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();        
					do{
					//	HashMap<String, String> hm = new HashMap<String,String>();
			          //  hm.put("name",c.getString(c.getColumnIndex("City_Name")).toString());
			          //  hm.put("id",c.getString(c.getColumnIndex("ID")).toString());
				         // int as;
						
			        
							 info_tx.setText(c.getString(c.getColumnIndex("Info")).toString());
							infoE = c.getString(c.getColumnIndex("Info")).toString();
							infoG = c.getString(c.getColumnIndex("InfoG")).toString();
							 
							LatLong=c.getString(c.getColumnIndex("Distance")).toString();
							 img.setImageResource(Integer.parseInt(c.getString(c.getColumnIndex("pc"))));
								
							 //1 byte[] img =c.getBlob(c.getColumnIndex("pic"));
						//2	 vish.setImageBitmap(BitmapFactory.decodeByteArray(img, 0, img.length));
				       //   as=Integer.parseInt(c.getString(c.getColumnIndex("ID")))+1;
				          
			          //  txtID.setText(String.valueOf(as)); 
			            
			            
			            
			          //  aList.add(hm); 
						} while(c.moveToNext());
					
					/*
					 * 
				 String[] from = {"name"};
					    
				        int[] to = {R.id.city_name};        
				        
				        SimpleAdapter adapter = new SimpleAdapter(container.getContext(), aList, R.layout.city_list, from, to);
				   
				        ListView listView = ( ListView ) rootView.findViewById(R.id.lll);
				      
				       
				        listView.setAdapter(adapter);*/
					
					
				
					
				}
			}catch (Exception e) {
				// TODO: handle exception
				
			} 
			
		
			img.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intentToBePassedToNextActivity = new Intent(container.getContext(),PhotosShow.class); 
			      intentToBePassedToNextActivity.putExtra("name", title);
					startActivity(intentToBePassedToNextActivity); 
					
					  
					
				}
			});
			
			
			En.setOnClickListener(new OnClickListener() {
				
				
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					info_tx.setText(infoE);
					En.setBackgroundResource(R.color.EEEEE);
					En.setTextColor(getResources().getColor(R.color.Black));
					
					
					Gu.setBackgroundResource(R.color.Red);
					Gu.setTextColor(getResources().getColor(R.color.EEEEE));
					
					
				}
			});
			
              Gu.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					info_tx.setText(infoG);
					Gu.setBackgroundResource(R.color.EEEEE);
					Gu.setTextColor(getResources().getColor(R.color.Black));
					
					
					En.setBackgroundResource(R.color.Red);
					En.setTextColor(getResources().getColor(R.color.EEEEE));
					
					
				}
			});
              
		/*	map_show.setOnTouchListener(new OnTouchListener() {
				
				@SuppressLint({ "NewApi", "ResourceAsColor" })
				@Override
				public boolean onTouch(View arg0, MotionEvent arg1) {
					// TODO Auto-generated method stub
					
					
					if(MotionEvent.ACTION_POINTER_1_DOWN==arg1.getAction())
					{
						 Toast tos =Toast.makeText(container.getContext(), "1" , Toast.LENGTH_SHORT);
						 tos.show();
						//map_show.setBackgroundColor(R.color.blue);
						///map_show.animate().scaleX(1);
					}
					else if (MotionEvent.ACTION_POINTER_1_UP==arg1.getAction())  {
						 Toast tos =Toast.makeText(container.getContext(), "2" , Toast.LENGTH_SHORT);
						 tos.show();
						//map_show.setBackgroundColor(R.color.Red);
					//	map_show.animate().scaleX(-1);
							}
					
					return false;
				}
			});*/
              
              map_show.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					
					
					 isInternetPresent = cd.isConnectingToInternet();
					
					
					 LocationManager locationManager = (LocationManager) getActivity().getSystemService(LOCATION_SERVICE);

				     
				 
					 if (isInternetPresent) {
		                    // Internet Connection is Present
		                    // make HTTP requests
							if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)){
						        // Toast.makeText(, "GPS is Enabled in your devide", Toast.LENGTH_SHORT).show();
						    
								 GPSTracker mGPS = new GPSTracker(container.getContext());
								String text;
								if(mGPS.canGetLocation ){
								    mGPS.getLocation();
								    text=mGPS.getLatitude()+","+mGPS.getLongitude();
								    Intent intentToBePassedToNextActivity = new Intent(container.getContext(),Google_web.class); 
									 intentToBePassedToNextActivity.putExtra("gps", text);
									 intentToBePassedToNextActivity.putExtra("LatLong", LatLong);
										
									startActivity(intentToBePassedToNextActivity); 
								}else{
								        text="Unabletofind";
								        System.out.println("Unable");
								    }

								
						     }else{
						    	 Intent callGPSSettingIntent = new Intent(
					                        android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
					                startActivity(callGPSSettingIntent);
						    	 
						     }
							
							
						 //   showAlertDialog(container.getContext(), "Internet Connection",
		                  //          "You have internet connection", true);
		                } else {
		                    // Internet connection is not present
		                    // Ask user to connect to Internet
		                    showAlertDialog(container.getContext()," ",
		                            "You don't have internet connection.", false);
		                }
								
				
				}
			});
              
              Animation ai = AnimationUtils.loadAnimation(container.getContext(),R.anim.test);
  			
              imageVie2.setAnimation(ai);
              
            
              imageVi1.setAnimation(ai);
			
			
			return rootView;
		}
		
		
		
	}
	
	
	
	public static void showAlertDialog(Context context, String title, String message, Boolean status) {
        AlertDialog alertDialog = new AlertDialog.Builder(context).create();
 
        // Setting Dialog Title
        alertDialog.setTitle(title);
 
        // Setting Dialog Message
        alertDialog.setMessage(message);
         
        // Setting alert dialog icon
        alertDialog.setIcon((status) ? R.drawable.notconnection : R.drawable.notconnection);
 
        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });
 
        // Showing Alert Message
        alertDialog.show();
    }
}
