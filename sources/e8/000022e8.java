package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzhc {
    public static Object zza(zzhd zzhdVar) {
        try {
            return zzhdVar.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzhdVar.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}