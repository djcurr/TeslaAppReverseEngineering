package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzaq {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzap zzc;

    public final zzaq zza(Object obj, Object obj2) {
        int i11 = this.zzb + 1;
        int i12 = i11 + i11;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (i12 > length) {
            this.zza = Arrays.copyOf(objArr, zzaj.zzb(length, i12));
        }
        zzaf.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i13 = this.zzb;
        int i14 = i13 + i13;
        objArr2[i14] = obj;
        objArr2[i14 + 1] = obj2;
        this.zzb = i13 + 1;
        return this;
    }

    public final zzar zzb() {
        zzap zzapVar = this.zzc;
        if (zzapVar == null) {
            zzaz zzg = zzaz.zzg(this.zzb, this.zza, this);
            zzap zzapVar2 = this.zzc;
            if (zzapVar2 == null) {
                return zzg;
            }
            throw zzapVar2.zza();
        }
        throw zzapVar.zza();
    }
}