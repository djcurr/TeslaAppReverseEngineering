package org.godotengine.godot;

import al.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes5.dex */
public class GodotDownloaderAlarmReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.d("GODOT", "Alarma recivida");
        try {
            c.d(context, intent, GodotDownloaderService.class);
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
            Log.d("GODOT", "Exception: " + e11.getClass().getName() + ":" + e11.getMessage());
        }
    }
}