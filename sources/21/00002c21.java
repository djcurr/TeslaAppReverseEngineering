package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
public abstract class zzez {
    int zzsf;
    int zzsg;
    private int zzsh;
    zzfc zzsi;
    private boolean zzsj;

    /* JADX INFO: Access modifiers changed from: private */
    public zzez() {
        this.zzsg = 100;
        this.zzsh = Integer.MAX_VALUE;
        this.zzsj = false;
    }

    private static zzez zza(byte[] bArr, int i11, int i12, boolean z11) {
        zzfb zzfbVar = new zzfb(bArr, i11, i12, false);
        try {
            zzfbVar.zzan(i12);
            return zzfbVar;
        } catch (zzgf e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public static int zzaq(int i11) {
        return (-(i11 & 1)) ^ (i11 >>> 1);
    }

    public static long zzd(long j11) {
        return (-(j11 & 1)) ^ (j11 >>> 1);
    }

    public static zzez zze(byte[] bArr, int i11, int i12) {
        return zza(bArr, i11, i12, false);
    }

    public static zzez zzf(byte[] bArr) {
        return zza(bArr, 0, bArr.length, false);
    }

    public abstract double readDouble();

    public abstract float readFloat();

    public abstract String readString();

    public abstract <T extends zzhf> T zza(zzhq<T> zzhqVar, zzfk zzfkVar);

    public abstract void zzak(int i11);

    public abstract boolean zzal(int i11);

    public final int zzam(int i11) {
        if (i11 >= 0) {
            int i12 = this.zzsg;
            this.zzsg = i11;
            return i12;
        }
        StringBuilder sb2 = new StringBuilder(47);
        sb2.append("Recursion limit cannot be negative: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    public abstract int zzan(int i11);

    public abstract void zzao(int i11);

    public abstract void zzap(int i11);

    public abstract boolean zzcm();

    public abstract long zzcp();

    public abstract long zzcq();

    public abstract int zzcr();

    public abstract long zzcs();

    public abstract int zzct();

    public abstract boolean zzcu();

    public abstract String zzcv();

    public abstract zzeo zzcw();

    public abstract int zzcx();

    public abstract int zzcy();

    public abstract int zzcz();

    public abstract long zzda();

    public abstract int zzdb();

    public abstract long zzdc();

    public abstract int zzdq();

    public abstract long zzdr();

    public abstract int zzds();
}