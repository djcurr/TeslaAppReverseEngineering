package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* loaded from: classes3.dex */
public class zzfz {
    protected volatile int zzrs = -1;

    public static final void zza(zzfz zzfzVar, byte[] bArr, int i11, int i12) {
        try {
            zzfs zzh = zzfs.zzh(bArr, 0, i12);
            zzfzVar.zza(zzh);
            zzh.zzem();
        } catch (IOException e11) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e11);
        }
    }

    public String toString() {
        return zzga.zza(this);
    }

    public void zza(zzfs zzfsVar) {
    }

    public final int zzas() {
        int zzen = zzen();
        this.zzrs = zzen;
        return zzen;
    }

    protected int zzen() {
        return 0;
    }

    @Override // 
    /* renamed from: zzep */
    public zzfz clone() {
        return (zzfz) super.clone();
    }
}