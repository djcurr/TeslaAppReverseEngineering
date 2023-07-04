package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
/* loaded from: classes3.dex */
public final class CrashUtils {
    private static final String[] zza = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @KeepForSdk
    public static boolean addDynamiteErrorToDropBox(Context context, Throwable th2) {
        try {
            Preconditions.checkNotNull(context);
            Preconditions.checkNotNull(th2);
            return false;
        } catch (Exception e11) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e11);
            return false;
        }
    }
}