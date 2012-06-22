package com.android.providers.contacts;

import android.content.Context;
import android.util.Log;

public class CellebriteContactsDatabaseHelper extends ContactsDatabaseHelper {
	private static final String TAG = "CellebriteContactsDatabaseHelper";

    protected static CellebriteContactsDatabaseHelper sSingleton = null;

    public static synchronized ContactsDatabaseHelper getInstance(Context context) {
    	Log.i(TAG, "getInstance");
    	if(sSingleton == null) {
    		Log.i(TAG, "sSingleton == null");
    	} else {
    		Log.i(TAG, "sSingleton is " + sSingleton.getClass().getName());
    	}
        if (sSingleton == null) {
            sSingleton = new CellebriteContactsDatabaseHelper(context);
        }
        return sSingleton;
    }

	CellebriteContactsDatabaseHelper(Context context) {
		super(context, "cellebrite.db");
	}
}
