package com.my.examples.lection_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
	public static final String TAG  = SecondActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_layout);

		Button firstActivity = (Button)findViewById(R.id.first_activity);
		firstActivity.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SecondActivity.this, FirstActivity.class);
				startActivity(i);
			}
		});

		Button thirdActivity = (Button)findViewById(R.id.third_activity);
		thirdActivity.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(SecondActivity.this, ThirdActivity.class);
				startActivity(i);
			}
		});
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.i(TAG, "OnDestroy");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.i(TAG, "OnStop");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.i(TAG, "OnStart");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.i(TAG, "OnPause");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.i(TAG, "OnResume");
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Log.i(TAG, "onSaveInstanceState");
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		super.onRestoreInstanceState(savedInstanceState);
		Log.i(TAG, "onRestoreInstanceState");
	}
}
