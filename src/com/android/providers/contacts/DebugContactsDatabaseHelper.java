package com.android.providers.contacts;

import android.content.Context;
import android.util.Log;

public class DebugContactsDatabaseHelper extends ContactsDatabaseHelper {
	private static final String TAG = "DebugContactsDatabaseHelper";

    protected static DebugContactsDatabaseHelper sSingleton = null;

    public static synchronized ContactsDatabaseHelper getInstance(Context context) {
    	Log.i(TAG, "getInstance");
    	if(sSingleton == null) {
    		Log.i(TAG, "sSingleton == null");
    	} else {
    		Log.i(TAG, "sSingleton is " + sSingleton.getClass().getName());
    	}
        if (sSingleton == null) {
            sSingleton = new DebugContactsDatabaseHelper(context);
        }
        return sSingleton;
    }

	DebugContactsDatabaseHelper(Context context) {
		super(context, "contacts2-debug.db");
	}
}
