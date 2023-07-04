package com.google.android.gms.vision;

import android.util.Log;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes3.dex */
public class L {
    public static boolean isLoggable(int i11) {
        return 4 <= i11;
    }

    public static int zza(String str, Object... objArr) {
        if (isLoggable(2)) {
            return Log.v("Vision", String.format(str, objArr));
        }
        return 0;
    }

    public static int zzb(String str, Object... objArr) {
        if (isLoggable(3)) {
            return Log.d("Vision", String.format(str, objArr));
        }
        return 0;
    }

    public static int zzc(String str, Object... objArr) {
        if (isLoggable(6)) {
            return Log.e("Vision", String.format(str, objArr));
        }
        return 0;
    }

    public static int zza(Throwable th2, String str, Object... objArr) {
        if (isLoggable(6)) {
            if (isLoggable(3)) {
                return Log.e("Vision", String.format(str, objArr), th2);
            }
            String format = String.format(str, objArr);
            String valueOf = String.valueOf(th2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(format).length() + 2 + valueOf.length());
            sb2.append(format);
            sb2.append(": ");
            sb2.append(valueOf);
            return Log.e("Vision", sb2.toString());
        }
        return 0;
    }
}