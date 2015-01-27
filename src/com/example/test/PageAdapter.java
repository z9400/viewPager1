package com.example.test;

import java.util.List;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class PageAdapter extends PagerAdapter {
	private List<View> listView ;
	private List<String> titles ;
	
	public PageAdapter(List<View> list, List<String> titles){
		this.listView = list ;
		this.titles = titles ;
	}
	
	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView(listView.get(position));
	}
	
	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		container.addView(listView.get(position), 0);
		return listView.get(position) ;
	}
	
	@Override
	public int getCount() {
		
		return listView==null?0:listView.size();
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0==arg1;
	}
	
	@Override
	public CharSequence getPageTitle(int position) {
		return titles.get(position) ;
	}

}
