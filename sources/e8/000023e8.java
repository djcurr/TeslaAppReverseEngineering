package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
class zzai extends zzaj {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzai(int i11) {
    }

    private final void zzc(int i11) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i11) {
            this.zza = Arrays.copyOf(objArr, zzaj.zzb(length, i11));
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
    }

    public final zzai zza(Object obj) {
        Objects.requireNonNull(obj);
        zzc(this.zzb + 1);
        Object[] objArr = this.zza;
        int i11 = this.zzb;
        this.zzb = i11 + 1;
        objArr[i11] = obj;
        return this;
    }
}