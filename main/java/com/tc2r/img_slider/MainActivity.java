package com.tc2r.img_slider;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tc2r.img_slider.adapters.CustomSwipeAdapter;

public class MainActivity extends AppCompatActivity {

	// Declare variables
	ViewPager viewPager;
	CustomSwipeAdapter adapter;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Initialize variables
		viewPager = (ViewPager) findViewById(R.id.view_pager);
		adapter = new CustomSwipeAdapter(this);

		// Set viewpager's adapter
		viewPager.setAdapter(adapter);
	}
}
