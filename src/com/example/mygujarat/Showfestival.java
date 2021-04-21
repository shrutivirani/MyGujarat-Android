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
import android.content.Context;
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
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class Showfestival extends ActionBarActivity implements ActionBar.TabListener {

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
	public String[] name;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show);
	
		name=new String[100];
		
		
		
		
	
		
				
		final ActionBar actionBar = getSupportActionBar();
		
		actionBar.setTitle("Festival");
			
		BBHelper obj = new BBHelper(getBaseContext(), "", null, 0);
		SQLiteDatabase sd = obj.getWritableDatabase();
		Cursor c = sd.rawQuery("select * FROM festival Order by F_ID;" ,null);
		try{
			int j=0;
			if(c.moveToFirst())
			{
				  do{
				//g = c.getString();
				 g=Integer.parseInt(c.getString(c.getColumnIndex("F_ID")));
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
		
			return PlaceholderFragment.newInstance(position,name[position]);
		
		}

		
		
		@Override
		public int getCount() {
			
			 return g;
			
			
		}

		
		
		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();
			
			return name[position];
			
			//return "vish";
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
			
			View rootView = inflater.inflate(R.layout.fragment_show_festival, container,
					false);
			
			
			
			
				
			
			
			
			final ImageView img = ( ImageView )rootView.findViewById(R.id.vish2);
			final Typeface FE = Typeface.createFromAsset(getActivity().getAssets(),"font/akshar.ttf");
			final Typeface FG = Typeface.createFromAsset(getActivity().getAssets(),"font/Gujarati.ttf");
			
			final Button En= (Button)rootView.findViewById(R.id.En2);
			final Button Gu= (Button)rootView.findViewById(R.id.Gu2);
			Gu.setTypeface(FG);
			final TextView info_tx = ( TextView )rootView.findViewById(R.id.info_tx2);
			
			info_tx.setTypeface(FE);
			
			
				
				
				
			
		
			
			
			
			//Toast ts=Toast.makeText(container.getContext(), dd , Toast.LENGTH_SHORT);
			//ts.show();
			
			BBHelper obj = new BBHelper(container.getContext(), "", null, 0);
			SQLiteDatabase sd = obj.getWritableDatabase();
			Cursor c = sd.rawQuery("select * FROM festival where Name='"+ title +"';",null);
			
			try{
				if(c.moveToFirst())
				{
						do{
					
			        
							 info_tx.setText(c.getString(c.getColumnIndex("Info")).toString());
							infoE = c.getString(c.getColumnIndex("Info")).toString();
							infoG = c.getString(c.getColumnIndex("InfoG")).toString();
							 
							 img.setImageResource(Integer.parseInt(c.getString(c.getColumnIndex("pc"))));
								
							
						} while(c.moveToNext());
					
				
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
					info_tx.setTypeface(FE);
					
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
					info_tx.setTypeface(FG);
					
					En.setBackgroundResource(R.color.Red);
					En.setTextColor(getResources().getColor(R.color.EEEEE));
					
					
				}
			});
			
			
              Animation ai = AnimationUtils.loadAnimation(container.getContext(),R.anim.test);
  			
      		img.setAnimation(ai);
			
			
			return rootView;
		}
		
		
	}

}









	
	
