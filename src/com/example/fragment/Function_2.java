package com.example.fragment;

import com.example.drawer_test.R;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTabHost;
import android.app.ActionBar;
import android.app.Fragment;
import android.app.ActionBar.Tab;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Function_2 extends Fragment{

	public Function_2(){}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View v =inflater.inflate(R.layout.function_layout_2, container, false); 
		return v;
	}

	

	

}
