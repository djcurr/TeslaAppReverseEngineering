package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzlz {
    private static final String[] zza;
    private static final zzmd zzb;

    static {
        zzmd zzmeVar;
        String[] strArr = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
        zza = strArr;
        int i11 = 0;
        while (true) {
            if (i11 >= 2) {
                zzmeVar = new zzme();
                break;
            }
            try {
                zzmeVar = (zzmd) Class.forName(strArr[i11]).asSubclass(zzmd.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
                zzmeVar = null;
            }
            if (zzmeVar != null) {
                break;
            }
            i11++;
        }
        zzb = zzmeVar;
    }

    public static StackTraceElement zza(Class cls, int i11) {
        zzma.zza(cls, "target");
        return zzb.zza(cls, 2);
    }
}