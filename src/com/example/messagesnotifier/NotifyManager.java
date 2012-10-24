package com.example.messagesnotifier;

import android.app.NotificationManager;
import android.content.Context;

public class NotifyManager {
	private static NotificationManager notificationManager=null;
	
	public static NotificationManager getInstance() {
		if(notificationManager==null) {
			throw new NullPointerException("NotificationManager has not been set yet.");
		}
		else {
			return notificationManager;
		}
	}
	
	public static void setNotificationManager(NotificationManager nm) throws NotificationManagerException {
		if(notificationManager==null) {
			notificationManager = nm;
		}
		else {
			throw new NotificationManagerException("NotificationManager has already been set.");
		}
	}
}
