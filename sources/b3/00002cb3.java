package com.google.android.gms.internal.vision;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class zzjt {
    protected volatile int zzadp = -1;

    public static final void zza(zzjt zzjtVar, byte[] bArr, int i11, int i12) {
        try {
            zzjl zzl = zzjl.zzl(bArr, 0, i12);
            zzjtVar.zza(zzl);
            zzl.zzea();
        } catch (IOException e11) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e11);
        }
    }

    private static final <T extends zzjt> T zzb(T t11, byte[] bArr, int i11, int i12) {
        try {
            zzjk zzk = zzjk.zzk(bArr, 0, i12);
            t11.zza(zzk);
            zzk.zzak(0);
            return t11;
        } catch (zzjs e11) {
            throw e11;
        } catch (IOException e12) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e12);
        }
    }

    public String toString() {
        return zzju.zzb(this);
    }

    public abstract zzjt zza(zzjk zzjkVar);

    public void zza(zzjl zzjlVar) {
    }

    public final int zzeq() {
        int zzt = zzt();
        this.zzadp = zzt;
        return zzt;
    }

    @Override // 
    /* renamed from: zzhr */
    public zzjt clone() {
        return (zzjt) super.clone();
    }

    protected int zzt() {
        return 0;
    }

    public static final <T extends zzjt> T zza(T t11, byte[] bArr) {
        return (T) zzb(t11, bArr, 0, bArr.length);
    }
}