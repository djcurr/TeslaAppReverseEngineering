package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzc {
    private static final Object lock = new Object();
    private static int zzau;
    private SparseArray<Integer> zzav = new SparseArray<>();
    private SparseArray<Integer> zzaw = new SparseArray<>();

    public final int zzb(int i11) {
        synchronized (lock) {
            Integer num = this.zzav.get(i11);
            if (num != null) {
                return num.intValue();
            }
            int i12 = zzau;
            zzau = i12 + 1;
            this.zzav.append(i11, Integer.valueOf(i12));
            this.zzaw.append(i12, Integer.valueOf(i11));
            return i12;
        }
    }

    public final int zzc(int i11) {
        int intValue;
        synchronized (lock) {
            intValue = this.zzaw.get(i11).intValue();
        }
        return intValue;
    }
}