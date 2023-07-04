package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzkv {
    private static final zzkx zza;

    static {
        String[] strArr;
        strArr = zzkx.zzd;
        zza = zzb(strArr);
    }

    public static /* bridge */ /* synthetic */ zzkx zza() {
        return zza;
    }

    private static zzkx zzb(String[] strArr) {
        zzkx zzkxVar;
        try {
            zzkxVar = zzky.zza();
        } catch (NoClassDefFoundError unused) {
            zzkxVar = null;
        }
        if (zzkxVar != null) {
            return zzkxVar;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArr) {
            try {
                return (zzkx) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb2.append('\n');
                sb2.append(str);
                sb2.append(": ");
                sb2.append(th);
            }
        }
        throw new IllegalStateException(sb2.insert(0, "No logging platforms found:").toString());
    }
}