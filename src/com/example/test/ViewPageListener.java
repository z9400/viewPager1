package com.example.test;

import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;

public class ViewPageListener implements OnPageChangeListener {
	 private ViewPager viewPager ;
	 
	 public ViewPageListener(ViewPager viewPager){
		 this.viewPager = viewPager ;
	 }
	 
	 @Override
     public void onPageScrollStateChanged(int arg0) {
     }

     @Override
     public void onPageScrolled(int arg0, float arg1, int arg2) {
     }

     @Override
     public void onPageSelected(int position) {
     	viewPager.setCurrentItem(position);
     }

}
