package com.google.android.gms.common.logging;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

@KeepForSdk
/* loaded from: classes3.dex */
public class Logger {
    private final String zza;
    private final String zzb;
    private final GmsLogger zzc;
    private final int zzd;

    @KeepForSdk
    public Logger(String str, String... strArr) {
        String sb2;
        if (strArr.length == 0) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.zzb = sb2;
        this.zza = str;
        this.zzc = new GmsLogger(str);
        int i11 = 2;
        while (i11 <= 7 && !Log.isLoggable(this.zza, i11)) {
            i11++;
        }
        this.zzd = i11;
    }

    @KeepForSdk
    public void d(String str, Object... objArr) {
        if (isLoggable(3)) {
            Log.d(this.zza, format(str, objArr));
        }
    }

    @KeepForSdk
    public void e(String str, Throwable th2, Object... objArr) {
        Log.e(this.zza, format(str, objArr), th2);
    }

    @KeepForSdk
    protected String format(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.zzb.concat(str);
    }

    @KeepForSdk
    public String getTag() {
        return this.zza;
    }

    @KeepForSdk
    public void i(String str, Object... objArr) {
        Log.i(this.zza, format(str, objArr));
    }

    @KeepForSdk
    public boolean isLoggable(int i11) {
        return this.zzd <= i11;
    }

    @KeepForSdk
    public void v(String str, Throwable th2, Object... objArr) {
        if (isLoggable(2)) {
            Log.v(this.zza, format(str, objArr), th2);
        }
    }

    @KeepForSdk
    public void w(String str, Object... objArr) {
        Log.w(this.zza, format(str, objArr));
    }

    @KeepForSdk
    public void wtf(String str, Throwable th2, Object... objArr) {
        Log.wtf(this.zza, format(str, objArr), th2);
    }

    @KeepForSdk
    public void e(String str, Object... objArr) {
        Log.e(this.zza, format(str, objArr));
    }

    @KeepForSdk
    public void wtf(Throwable th2) {
        Log.wtf(this.zza, th2);
    }

    @KeepForSdk
    public void v(String str, Object... objArr) {
        if (isLoggable(2)) {
            Log.v(this.zza, format(str, objArr));
        }
    }
}