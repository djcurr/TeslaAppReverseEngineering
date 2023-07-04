package com.oney.WebRTCModule;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* loaded from: classes2.dex */
public class e {
    public static DisplayMetrics a(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) activity.getApplication().getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }
}