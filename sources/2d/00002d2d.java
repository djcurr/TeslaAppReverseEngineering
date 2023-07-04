package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzbc {
    public static int zza(int i11) {
        boolean z11;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                z11 = false;
                Preconditions.checkArgument(z11, "granularity %d must be a Granularity.GRANULARITY_* constants", Integer.valueOf(i11));
                return i11;
            }
            i11 = 2;
        }
        z11 = true;
        Preconditions.checkArgument(z11, "granularity %d must be a Granularity.GRANULARITY_* constants", Integer.valueOf(i11));
        return i11;
    }

    public static String zzb(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return "GRANULARITY_FINE";
                }
                throw new IllegalArgumentException();
            }
            return "GRANULARITY_COARSE";
        }
        return "GRANULARITY_PERMISSION_LEVEL";
    }
}