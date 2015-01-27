package com.example.test;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends Activity {
	private ViewPager viewPager ;
	private PagerTabStrip tabStrip ;
	private List<View> views  ;
	private List<String> titles ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		InitViewPager() ;
	}
	
	private void InitViewPager(){
		viewPager = (ViewPager)findViewById(R.id.mViewPager) ;
		tabStrip = (PagerTabStrip)findViewById(R.id.pageTab) ;
		tabStrip.setTabIndicatorColor(getResources().getColor(R.color.red));
		tabStrip.setDrawFullUnderline(false);
		tabStrip.setBackgroundColor(getResources().getColor(R.color.azure));
		tabStrip.setTextSpacing(50);
		
		titles = new ArrayList<String>() ;
		titles.add("首页") ;
		titles.add("分类") ;
		titles.add("附近") ;
		titles.add("推荐") ;
		titles.add("更多") ;
		
		
//		LayoutInflater inflater = LayoutInflater.from(this) ;
		LayoutInflater inflater = getLayoutInflater() ;
		views = new ArrayList<View>() ;
		views.add(inflater.inflate(R.layout.fragment_1, null)) ;
		views.add(inflater.inflate(R.layout.fragment_2, null)) ;
		views.add(inflater.inflate(R.layout.fragment_3, null)) ;
		views.add(inflater.inflate(R.layout.fragment_4, null)) ;
		views.add(inflater.inflate(R.layout.fragment_5, null)) ;
		
		viewPager.setAdapter(new PageAdapter(views, titles));
		viewPager.setCurrentItem(0);
		viewPager.setOnPageChangeListener(new ViewPageListener(viewPager)) ;
		
		
		
	}

}
