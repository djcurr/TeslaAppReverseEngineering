package com.google.android.libraries.places.internal;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzja {
    Object[] zza = new Object[8];
    int zzb = 0;
    zziz zzc;

    public final zzja zza(Object obj, Object obj2) {
        int i11 = this.zzb + 1;
        int i12 = i11 + i11;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (i12 > length) {
            int i13 = length + (length >> 1) + 1;
            if (i13 < i12) {
                int highestOneBit = Integer.highestOneBit(i12 - 1);
                i13 = highestOneBit + highestOneBit;
            }
            if (i13 < 0) {
                i13 = Integer.MAX_VALUE;
            }
            this.zza = Arrays.copyOf(objArr, i13);
        }
        zzin.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i14 = this.zzb;
        int i15 = i14 + i14;
        objArr2[i15] = obj;
        objArr2[i15 + 1] = obj2;
        this.zzb = i14 + 1;
        return this;
    }

    public final zzjb zzb() {
        zziz zzizVar = this.zzc;
        if (zzizVar == null) {
            zzjr zzf = zzjr.zzf(this.zzb, this.zza, this);
            zziz zzizVar2 = this.zzc;
            if (zzizVar2 == null) {
                return zzf;
            }
            throw zzizVar2.zza();
        }
        throw zzizVar.zza();
    }
}