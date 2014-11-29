package com.example.demo_gson;


import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;





import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		List<String> phones = new ArrayList<String>();
		phones.add("123123");
		phones.add("456456");
		phones.add("789789");
		Person person=new Person("zhangsan",18,phones);
		Gson gson=new Gson();
		String s=gson.toJson(person);
		Log.i("info", s);
		Person person2 = gson.fromJson(s, Person.class);
		Log.i("info", person2.toString());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
