package com.codingw.listmenu;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity  {

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);

		// Create an array of Strings, that will be put to our ListActivity
		String[] bangundatar = new String[] { "Persegi Panjang", "Segitiga", "Lingkaran"};
		// Create an ArrayAdapter, that will actually make the Strings above
		// appear in the ListView
		//Menset nilai array ke dalam list adapater sehingga data pada array akan dimunculkan dalam list
		this.setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, bangundatar));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		// Get the item that was clicked
		//Menangkap nilai text yang dklik
		Object o = this.getListAdapter().getItem(position);
		String keyword = o.toString();
		Toast.makeText(this, "Anda Memilih: " + keyword, Toast.LENGTH_LONG).show();
	}

}
