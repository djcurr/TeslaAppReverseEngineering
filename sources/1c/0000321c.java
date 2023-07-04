package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class zzaed implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzaed zzb = new zzaea(zzafh.zzd);
    private static final zzaec zzd;
    private int zzc = 0;

    static {
        int i11 = zzads.zza;
        zzd = new zzaec(null);
        zza = new zzadv();
    }

    public static int zzj(int i11, int i12, int i13) {
        if (((i13 - i12) | i12) >= 0) {
            return i12;
        }
        throw new IndexOutOfBoundsException("End index: " + i12 + " >= " + i13);
    }

    public static zzaed zzl(String str) {
        return new zzaea(str.getBytes(zzafh.zzb));
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
        return new zzadu(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzahg.zza(this) : zzahg.zza(zzf(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i11);

    public abstract byte zzb(int i11);

    public abstract int zzd();

    protected abstract int zze(int i11, int i12, int i13);

    public abstract zzaed zzf(int i11, int i12);

    protected abstract String zzg(Charset charset);

    public abstract void zzh(zzadt zzadtVar);

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzm(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}