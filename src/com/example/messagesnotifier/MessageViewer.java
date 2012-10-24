package com.example.messagesnotifier;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MessageViewer extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_viewer);

        NotifyManager.getInstance().cancel(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_message_viewer, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	
    	if(item.getItemId() == R.id.menu_exit) {

    		this.finish();
    	}
    	else if(item.getItemId() == R.id.menu_settings) {
    		// TODO: Activate settings activity 
    	}
    	return super.onOptionsItemSelected(item);
    }
    
    @Override
    public void onBackPressed() {
    	// TODO Auto-generated method stub
    	super.onBackPressed();
    	this.finish();
    }
}
