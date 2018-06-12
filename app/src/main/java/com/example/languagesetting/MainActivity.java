package com.example.languagesetting;

import java.util.Locale;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Configuration config;
	private DisplayMetrics dm;
	private Resources resources;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		resources =getResources();//���res��Դ����  
		config = resources.getConfiguration();//������ö���  
		dm = resources.getDisplayMetrics();
		((Button)findViewById(R.id.chinese_btn)).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				config.locale = Locale.SIMPLIFIED_CHINESE;
				resources.updateConfiguration(config, dm);
				onCreate(null);
			}
		});
		
		((Button)findViewById(R.id.english_btn)).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				config.locale = Locale.US;
				resources.updateConfiguration(config, dm);
				onCreate(null);
			}
		});
	}

	

}
