package com.android.providers.contacts;

import android.content.Context;
import android.util.Log;

public class NormalContactsDatabaseHelper extends ContactsDatabaseHelper {
	private static final String TAG = "NormalContactsDatabaseHelper";

    protected static NormalContactsDatabaseHelper sSingleton = null;

    public static synchronized ContactsDatabaseHelper getInstance(Context context) {
    	Log.i(TAG, "getInstance");
    	if(sSingleton == null) {
    		Log.i(TAG, "sSingleton == null");
    	} else {
    		Log.i(TAG, "sSingleton is " + sSingleton.getClass().getName());
    	}
        if (sSingleton == null) {
            sSingleton = new NormalContactsDatabaseHelper(context);
        }
        return sSingleton;
    }

	NormalContactsDatabaseHelper(Context context) {
		super(context, "contacts2");
	}
}
