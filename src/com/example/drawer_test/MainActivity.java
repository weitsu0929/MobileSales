package com.example.drawer_test;

import java.text.MessageFormat.Field;

import com.example.fragment.Function_1;
import com.example.fragment.Function_2;
import com.example.fragment.Function_3;
import com.example.fragment.Function_4;
import com.example.fragment.Function_5;
import com.example.fragment.Function_6;
import com.example.fragment.Function_7;
import com.example.drawer_test.R;
import android.app.Activity;
import android.app.FragmentManager;

import android.app.SearchManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.ViewDragHelper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private DrawerLayout my_DrawerLayout;
	private ListView my_DrawerList;
	private ActionBarDrawerToggle my_DrawerToggle;

	private CharSequence my_DrawerTitle;
	private CharSequence my_Title;
	private String[] my_PlanetTitles;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		my_Title = my_DrawerTitle = getTitle();
		my_PlanetTitles = getResources().getStringArray(R.array.planets_array);
		my_DrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		my_DrawerList = (ListView) findViewById(R.id.left_drawer);

		// set a custom shadow that overlays the main content when the drawer
		// opens
		my_DrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
				GravityCompat.START);

		// set up the drawer's list view with items and click listener
		my_DrawerList.setAdapter(new ArrayAdapter<String>(this,
				R.layout.drawer_list_item, my_PlanetTitles));
		my_DrawerList.setOnItemClickListener(new DrawerItemClickListener());

		// enable ActionBar app icon to behave as action to toggle nav drawer
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setHomeButtonEnabled(true);

		// ActionBarDrawerToggle ties together the the proper interactions
		// between the sliding drawer and the action bar app icon
		my_DrawerToggle = new ActionBarDrawerToggle(this, /* host Activity */
		my_DrawerLayout, /* DrawerLayout object */
		R.drawable.drawer, /* nav drawer image to replace 'Up' caret */
		R.string.drawer_open, /* "open drawer" description for accessibility */
		R.string.drawer_close /* "close drawer" description for accessibility */
		) {
			public void onDrawerClosed(View view) {
				getActionBar().setTitle(my_Title);
				invalidateOptionsMenu(); // creates call to
											// onPrepareOptionsMenu()
			}

			public void onDrawerOpened(View drawerView) {
				getActionBar().setTitle(my_DrawerTitle);
				invalidateOptionsMenu(); // creates call to
											// onPrepareOptionsMenu()
			}
		};
		my_DrawerLayout.setDrawerListener(my_DrawerToggle);

		if (savedInstanceState == null) {
			selectItem(0);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}

	/* Called whenever we call invalidateOptionsMenu() */
	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		// If the nav drawer is open, hide action items related to the content
		// view
		boolean drawerOpen = my_DrawerLayout.isDrawerOpen(my_DrawerList);
		menu.findItem(R.id.action_notice).setVisible(!drawerOpen);
		return super.onPrepareOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// The action bar home/up action should open or close the drawer.
		// ActionBarDrawerToggle will take care of this.
		if (my_DrawerToggle.onOptionsItemSelected(item)) {
			return true;
		}
		// Handle action buttons
		switch (item.getItemId()) {
		// case R.id.action_websearch:
		// // create intent to perform web search for this planet
		// Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
		// intent.putExtra(SearchManager.QUERY, getActionBar().getTitle());
		// // catch event that there's no activity to handle intent
		// if (intent.resolveActivity(getPackageManager()) != null) {
		// startActivity(intent);
		// } else {
		// Toast.makeText(this, R.string.app_not_available,
		// Toast.LENGTH_LONG).show();
		// }
		// return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	private class DrawerItemClickListener implements
			ListView.OnItemClickListener {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			selectItem(position);
		}
	}

	private void selectItem(int position) {
		// update the main content by replacing fragments

		switch (position) {
		case 0:
			Function_1 fun_1 = new Function_1();
			FragmentManager fragmentManager1 = getFragmentManager();
			fragmentManager1.beginTransaction()
					.replace(R.id.content_frame, fun_1).commit();
			break;
		case 1:
			Function_2 fun_2 = new Function_2();
			FragmentManager fragmentManager2 = getFragmentManager();
			fragmentManager2.beginTransaction()
					.replace(R.id.content_frame, fun_2).commit();
			break;
		case 2:
			Function_3 fun_3 = new Function_3();
			FragmentManager fragmentManager3 = getFragmentManager();
			fragmentManager3.beginTransaction()
					.replace(R.id.content_frame, fun_3).commit();
			break;
		case 3:
			Function_4 fun_4 = new Function_4();
			FragmentManager fragmentManager4 = getFragmentManager();
			fragmentManager4.beginTransaction()
					.replace(R.id.content_frame, fun_4).commit();
			break;
		case 4:
			Function_5 fun_5 = new Function_5();
			FragmentManager fragmentManager5 = getFragmentManager();
			fragmentManager5.beginTransaction()
					.replace(R.id.content_frame, fun_5).commit();
			break;
		case 5:
			Function_6 fun_6 = new Function_6();
			FragmentManager fragmentManager6 = getFragmentManager();
			fragmentManager6.beginTransaction()
					.replace(R.id.content_frame, fun_6).commit();
			break;
		case 6:
			Function_7 fun_7 = new Function_7();
			FragmentManager fragmentManager7 = getFragmentManager();
			fragmentManager7.beginTransaction()
					.replace(R.id.content_frame, fun_7).commit();
			break;

		default:

			return;

		}

		my_DrawerList.setItemChecked(position, true);
		setTitle(my_PlanetTitles[position]);
		my_DrawerLayout.closeDrawer(my_DrawerList);
	}

	@Override
	public void setTitle(CharSequence title) {
		my_Title = title;
		getActionBar().setTitle(my_Title);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		// Sync the toggle state after onRestoreInstanceState has occurred.
		my_DrawerToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		// Pass any configuration change to the drawer toggls
		my_DrawerToggle.onConfigurationChanged(newConfig);
	}

}
