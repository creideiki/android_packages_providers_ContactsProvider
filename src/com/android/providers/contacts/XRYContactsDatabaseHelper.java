package com.android.providers.contacts;

import android.content.Context;
import android.util.Log;

public class XRYContactsDatabaseHelper extends ContactsDatabaseHelper {
    private static final String TAG = "CellebriteContactsDatabaseHelper";

    protected static XRYContactsDatabaseHelper sSingleton = null;

    public static synchronized ContactsDatabaseHelper getInstance(Context context) {
        Log.i(TAG, "getInstance");
        if(sSingleton == null) {
            Log.i(TAG, "sSingleton == null");
        } else {
            Log.i(TAG, "sSingleton is " + sSingleton.getClass().getName());
        }
        if (sSingleton == null) {
            sSingleton = new XRYContactsDatabaseHelper(context);
        }
        return sSingleton;
    }

    XRYContactsDatabaseHelper(Context context) {
        super(context, "xry.db");
    }
}
