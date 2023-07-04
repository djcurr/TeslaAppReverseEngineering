package com.google.android.gms.internal.vision;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class zzeo implements Serializable, Iterable<Byte> {
    public static final zzeo zzrx = new zzex(zzga.zzxn);
    private static final zzet zzry;
    private static final Comparator<zzeo> zzrz;
    private int zzlv = 0;

    static {
        zzry = zzeg.zzck() ? new zzey(null) : new zzer(null);
        zzrz = new zzeq();
    }

    public static int zza(byte b11) {
        return b11 & 255;
    }

    public static zzev zzaj(int i11) {
        return new zzev(i11, null);
    }

    public static zzeo zzb(byte[] bArr, int i11, int i12) {
        zzb(i11, i11 + i12, bArr.length);
        return new zzex(zzry.zzd(bArr, i11, i12));
    }

    public static zzeo zzc(byte[] bArr, int i11, int i12) {
        return new zzes(bArr, i11, i12);
    }

    public static zzeo zze(byte[] bArr) {
        return new zzex(bArr);
    }

    public static zzeo zzl(String str) {
        return new zzex(str.getBytes(zzga.UTF_8));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i11 = this.zzlv;
        if (i11 == 0) {
            int size = size();
            i11 = zza(size, 0, size);
            if (i11 == 0) {
                i11 = 1;
            }
            this.zzlv = i11;
        }
        return i11;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzep(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    protected abstract int zza(int i11, int i12, int i13);

    protected abstract String zza(Charset charset);

    public abstract void zza(zzen zzenVar);

    public abstract void zza(byte[] bArr, int i11, int i12, int i13);

    public abstract byte zzai(int i11);

    public abstract zzeo zzc(int i11, int i12);

    public final String zzdk() {
        return size() == 0 ? "" : zza(zzga.UTF_8);
    }

    public abstract boolean zzdl();

    public final int zzdm() {
        return this.zzlv;
    }

    public static int zzb(int i11, int i12, int i13) {
        int i14 = i12 - i11;
        if ((i11 | i12 | i14 | (i13 - i12)) < 0) {
            if (i11 < 0) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Beginning index: ");
                sb2.append(i11);
                sb2.append(" < 0");
                throw new IndexOutOfBoundsException(sb2.toString());
            } else if (i12 < i11) {
                StringBuilder sb3 = new StringBuilder(66);
                sb3.append("Beginning index larger than ending index: ");
                sb3.append(i11);
                sb3.append(", ");
                sb3.append(i12);
                throw new IndexOutOfBoundsException(sb3.toString());
            } else {
                StringBuilder sb4 = new StringBuilder(37);
                sb4.append("End index: ");
                sb4.append(i12);
                sb4.append(" >= ");
                sb4.append(i13);
                throw new IndexOutOfBoundsException(sb4.toString());
            }
        }
        return i14;
    }
}