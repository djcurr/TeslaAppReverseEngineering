package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
final class zzme implements zzmd {
    @Override // com.google.android.libraries.places.internal.zzmd
    public final StackTraceElement zza(Class cls, int i11) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String name = cls.getName();
        int i12 = 3;
        boolean z11 = false;
        while (true) {
            if (i12 >= stackTrace.length) {
                i12 = -1;
                break;
            }
            if (stackTrace[i12].getClassName().equals(name)) {
                z11 = true;
            } else if (z11) {
                break;
            } else {
                z11 = false;
            }
            i12++;
        }
        if (i12 != -1) {
            return stackTrace[i12];
        }
        return null;
    }
}