package com.google.android.gms.maps.internal;

/* loaded from: classes3.dex */
public final class zza {
    public static byte zza(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    public static Boolean zzb(byte b11) {
        if (b11 != 0) {
            if (b11 != 1) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}