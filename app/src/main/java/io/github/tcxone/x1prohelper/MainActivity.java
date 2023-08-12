package io.github.tcxone.x1prohelper;

import android.app.*;
import android.content.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import io.github.tcxone.x1prohelper.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		Button button1 = findViewById(R.id.button1);
		button1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					Intent intent = new Intent(); 
					intent.setComponent(new ComponentName("com.android.settings","com.android.settings.Settings"));
					startActivity(intent);
				}
			});

		Button button2 = findViewById(R.id.button2);
		button2.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					Intent intent = new Intent();
					intent.setComponent(new ComponentName("com.android.settings","com.android.settings.Settings$DevelopmentSettingsActivity"));
					startActivity(intent);
				}
			});

		Button button3 = findViewById(R.id.button3);
		button3.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					Intent intent = new Intent(); 
					intent.setComponent(new ComponentName("com.android.settings","com.android.settings.Settings$AccessibilitySettingsActivity"));
					startActivity(intent);
				}
			});

		Button button4 = findViewById(R.id.button4);
		button4.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					Intent intent = new Intent();
					intent.setComponent(new ComponentName("com.android.settings","com.android.settings.Settings$TrustedCredentialsSettingsActivity"));
					startActivity(intent);
				}
			});
		
		Button button5 = findViewById(R.id.button5);
		button5.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					Intent intent = new Intent(); 
					intent.setComponent(new ComponentName("com.android.settings","com.android.settings.Settings$VpnSettingsActivity"));
					startActivity(intent);
				}
			});

		Button button6 = findViewById(R.id.button6);
		button6.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					Intent intent = new Intent();
					intent.setComponent(new ComponentName("com.android.settings","com.android.settings.Settings$AppDrawOverlaySettingsActivity"));
					startActivity(intent);
				}
			});

		Button button7 = findViewById(R.id.button7);
		button7.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					Intent intent = new Intent(); 
					intent.setComponent(new ComponentName("com.android.settings","com.android.settings.Settings$AdvancedAppsActivity"));
					startActivity(intent);
				}
			});

		final AlertDialog dialog = new AlertDialog.Builder(this)
			.setTitle("tcxone/X1ProHelper")
			.setMessage("v0.0.2")
			.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {

				@Override
				public void onClick(DialogInterface dia, int which) {

				}
			})
			
			.setNegativeButton(android.R.string.cancel, null)
			.create();
		
		Button button8 = findViewById(R.id.button8);
		button8.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View view) {
					dialog.show();
				}
			});
	}
}
