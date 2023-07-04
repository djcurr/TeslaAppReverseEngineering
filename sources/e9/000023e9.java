package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes3.dex */
public class zzaj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i11, int i12) {
        if (i12 >= 0) {
            int i13 = i11 + (i11 >> 1) + 1;
            if (i13 < i12) {
                int highestOneBit = Integer.highestOneBit(i12 - 1);
                i13 = highestOneBit + highestOneBit;
            }
            if (i13 < 0) {
                return Integer.MAX_VALUE;
            }
            return i13;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }
}