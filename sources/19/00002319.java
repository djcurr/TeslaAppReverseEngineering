package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class zziy implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zziy zzb = new zziv(zzkh.zzd);
    private static final zzix zzd;
    private int zzc = 0;

    static {
        int i11 = zzij.zza;
        zzd = new zzix(null);
        zza = new zziq();
    }

    public static int zzj(int i11, int i12, int i13) {
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

    public static zziy zzl(byte[] bArr, int i11, int i12) {
        zzj(i11, i11 + i12, bArr.length);
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new zziv(bArr2);
    }

    public static zziy zzm(String str) {
        return new zziv(str.getBytes(zzkh.zzb));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i11 = this.zzc;
        if (i11 == 0) {
            int zzd2 = zzd();
            i11 = zze(zzd2, 0, zzd2);
            if (i11 == 0) {
                i11 = 1;
            }
            this.zzc = i11;
        }
        return i11;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzio(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzmg.zza(this) : zzmg.zza(zzf(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i11);

    public abstract byte zzb(int i11);

    public abstract int zzd();

    protected abstract int zze(int i11, int i12, int i13);

    public abstract zziy zzf(int i11, int i12);

    protected abstract String zzg(Charset charset);

    public abstract void zzh(zzin zzinVar);

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzn(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}