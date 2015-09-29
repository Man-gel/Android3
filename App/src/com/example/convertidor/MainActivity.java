package com.example.convertidor;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	private EditText kmUser;
	private EditText gradosUser;
	private TextView resMillas;
	private TextView resFar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		kmUser = (EditText)findViewById(R.id.et_km);
		gradosUser = (EditText)findViewById(R.id.et_grados);
		resMillas = (TextView)findViewById(R.id.tv_resDis);
		resFar = (TextView)findViewById(R.id.tv_resGrados);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void kmToMillas(View v)
	{
		double Km = Double.parseDouble(kmUser.getText().toString());
		double res = 0.62 * Km;
	}
	
	private void gradosCtoF(View v)
	{
		
	}
	
}
