package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
public final class zzeb {
    public static int zzx(int i11) {
        if (i11 <= 0 || i11 > 14) {
            StringBuilder sb2 = new StringBuilder(45);
            sb2.append(i11);
            sb2.append(" is not a valid enum BarcodeFormat");
            throw new IllegalArgumentException(sb2.toString());
        }
        return i11;
    }
}