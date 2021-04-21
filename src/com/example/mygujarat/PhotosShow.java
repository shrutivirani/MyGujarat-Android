package com.example.mygujarat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;





import android.R.string;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
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
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;


@SuppressWarnings("deprecation")
public class PhotosShow extends Activity{
	
	public Integer[] imgID;
			
	static String name;
	
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.photos_show);
		
	
		 final android.app.ActionBar actionBar = getActionBar();
			actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#db2121")));
			actionBar.setTitle("Photos");
		
			Intent myinIntent = getIntent();
			
		name=myinIntent.getStringExtra("name");
		try{
			
			 BBHelper obj = new BBHelper(PhotosShow.this, "", null, 0);
				SQLiteDatabase sd = obj.getWritableDatabase();
				Cursor c = sd.rawQuery("select * FROM photos where Name='"+name+"';",null);
				
				
					
					if(c.moveToFirst())
						imgID = new Integer[c.getCount()];
					
					{int j=0;
							 do{
								imgID[j]= Integer.parseInt(c.getString(c.getColumnIndex("photo")));
							//hm.put("photo",c.getString(c.getColumnIndex("photo")).toString());
				         
				           j++;
							}while(c.moveToNext());
						
					}
				}catch (Exception e) {
					// TODO: handle exception
					
				}
			
			
			Gallery gallery =(Gallery)findViewById(R.id.gallery1);
	gallery.setAdapter(new ImageAdapter(this));
			gallery.setOnItemClickListener(new OnItemClickListener() {
			
				
			
				public void onItemClick(AdapterView<?> Parent,View v,int position,long id) {
					// TODO Auto-generated method stub
			//		Toast.makeText(getBaseContext(), "pic"+(position+1)+"selected", Toast.LENGTH_LONG).show();
					
					ImageView imageView =(ImageView)findViewById(R.id.image1);
					imageView.setImageResource(imgID[position]);
					
				}
			});
			/*
		  final GridView GridView = (GridView)findViewById(R.id.gridview);
	
		  
	      
		 
	*/
			
			
			
			
			
	}	
	
	
	public class ImageAdapter extends BaseAdapter{
		
		private  Context context;
		private int itemBackground;
		public ImageAdapter(Context c)
		{
			context=c;
			TypedArray a =obtainStyledAttributes(R.styleable.MyGallery);
			itemBackground = a.getResourceId(R.styleable.MyGallery_android_galleryItemBackground, 0);
			a.recycle();
			
		}
		public int getCount(){
			return imgID.length;
		}
		public Object getItem(int Position)
		{
			return Position;
		}
		public long getItemId(int Position){
			return Position;
		}
		public View getView(int position,View ConvertView,ViewGroup parent){
			ImageView imageView = new ImageView(context);
imageView.setImageResource(imgID[position]);
imageView.setLayoutParams(new Gallery.LayoutParams(200,200));
imageView.setScaleType(ImageView.ScaleType.FIT_XY);
imageView.setBackgroundResource(itemBackground);
			return imageView;
		}
	}

}
