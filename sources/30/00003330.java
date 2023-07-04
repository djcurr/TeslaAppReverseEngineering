package com.google.android.libraries.places.internal;

import android.content.Context;
import android.os.Build;
import android.os.DropBoxManager;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzgb {
    private static DropBoxManager zza;
    private static final LinkedHashMap zzb = new zzga(16, 0.75f, true);
    private static String zzc;

    public static synchronized void zza(Context context, boolean z11) {
        synchronized (zzgb.class) {
            if (zza == null) {
                zza = (DropBoxManager) context.getApplicationContext().getSystemService("dropbox");
                zzc = "com.google.android.libraries.places";
            }
        }
    }

    public static synchronized void zzb(Throwable th2) {
        long j11;
        synchronized (zzgb.class) {
            long id2 = Thread.currentThread().getId();
            int hashCode = th2.hashCode();
            Integer num = (Integer) zzb.get(Long.valueOf(id2));
            if (num == null || num.intValue() != hashCode) {
                DropBoxManager dropBoxManager = zza;
                if (dropBoxManager == null || !dropBoxManager.isTagEnabled("system_app_crash")) {
                    return;
                }
                DropBoxManager dropBoxManager2 = zza;
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr = new Object[3];
                objArr[0] = zzc;
                List zzc2 = zzik.zzb(CoreConstants.DOT).zzc("2.7.0");
                if (zzc2.size() == 3) {
                    long j12 = 0;
                    for (int i11 = 0; i11 < zzc2.size(); i11++) {
                        try {
                            j12 = (j12 * 100) + Integer.parseInt((String) zzc2.get(i11));
                        } catch (NumberFormatException unused) {
                        }
                    }
                    j11 = j12;
                    objArr[1] = Long.valueOf(j11);
                    objArr[2] = "2.7.0";
                    sb2.append(String.format("Package: %s v%d (%s)\n", objArr));
                    sb2.append(String.format("Build: %s\n", Build.FINGERPRINT));
                    sb2.append("\n");
                    sb2.append(Log.getStackTraceString(th2));
                    dropBoxManager2.addText("system_app_crash", sb2.toString());
                    zzb.put(Long.valueOf(id2), Integer.valueOf(hashCode));
                }
                j11 = -1;
                objArr[1] = Long.valueOf(j11);
                objArr[2] = "2.7.0";
                sb2.append(String.format("Package: %s v%d (%s)\n", objArr));
                sb2.append(String.format("Build: %s\n", Build.FINGERPRINT));
                sb2.append("\n");
                sb2.append(Log.getStackTraceString(th2));
                dropBoxManager2.addText("system_app_crash", sb2.toString());
                zzb.put(Long.valueOf(id2), Integer.valueOf(hashCode));
            }
        }
    }
}