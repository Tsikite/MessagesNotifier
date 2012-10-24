package com.example.messagesnotifier;

import android.os.Bundle;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private int notificationCounter = 0;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		try {
			NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
			try {
				NotifyManager.setNotificationManager(nm);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			Notification notify = new Notification(R.drawable.icon,
					"New message from Afeka", System.currentTimeMillis());
			Context context = MainActivity.this;
			CharSequence title = "You have a new message from Afeka";
			CharSequence details = "Continue with what you were doing";
			Intent intent = new Intent(context, MessageViewer.class);
			PendingIntent pending = PendingIntent.getActivity(context, 0,
					intent, Intent.FLAG_ACTIVITY_NEW_TASK);
			notify.setLatestEventInfo(context, title, details, pending);

			nm.notify(0, notify);
			
			finish();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Button b = (Button) findViewById(R.id.button1);
		// b.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View v) {
		//
		// }
		// });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
