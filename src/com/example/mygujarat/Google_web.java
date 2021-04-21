package com.example.mygujarat;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Google_web extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.google_web);
		
		String gps,LatLong;
		Intent myinIntent = getIntent();
		gps=myinIntent.getStringExtra("gps");
		LatLong=myinIntent.getStringExtra("LatLong");
		WebView webview = (WebView) findViewById(R.id.webview);
		    webview.setWebViewClient(new WebViewClient());
	        webview.getSettings().setJavaScriptEnabled(true);
	       // Toast to =Toast.makeText(Google_web.this, gps, Toast.LENGTH_SHORT);
	     //   to.show();
	        webview.loadUrl("http://maps.google.com/maps?" + "saddr="+ gps + "&daddr="+LatLong);
	    
		
	}

	
	
	
	
	

	
}
