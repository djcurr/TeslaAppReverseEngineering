package com.google.android.gms.common;

/* loaded from: classes3.dex */
final class zzd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i11) {
        int[] iArr = {1, 2, 3};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr[i12];
            int i14 = i13 - 1;
            if (i13 == 0) {
                throw null;
            }
            if (i14 == i11) {
                return i13;
            }
        }
        return 1;
    }
}