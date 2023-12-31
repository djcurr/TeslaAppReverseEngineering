package com.google.android.gms.internal.clearcut;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class zzbb implements Serializable, Iterable<Byte> {
    public static final zzbb zzfi = new zzbi(zzci.zzkt);
    private static final zzbf zzfj;
    private int zzfk = 0;

    static {
        zzfj = zzaw.zzx() ? new zzbj(null) : new zzbd(null);
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

    public static zzbb zzb(byte[] bArr, int i11, int i12) {
        return new zzbi(zzfj.zzc(bArr, i11, i12));
    }

    public static zzbb zzf(String str) {
        return new zzbi(str.getBytes(zzci.UTF_8));
    }

    public static zzbg zzk(int i11) {
        return new zzbg(i11, null);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i11 = this.zzfk;
        if (i11 == 0) {
            int size = size();
            i11 = zza(size, 0, size);
            if (i11 == 0) {
                i11 = 1;
            }
            this.zzfk = i11;
        }
        return i11;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new zzbc(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    protected abstract int zza(int i11, int i12, int i13);

    public abstract zzbb zza(int i11, int i12);

    protected abstract String zza(Charset charset);

    public abstract void zza(zzba zzbaVar);

    public abstract boolean zzaa();

    public final int zzab() {
        return this.zzfk;
    }

    public abstract byte zzj(int i11);

    public final String zzz() {
        return size() == 0 ? "" : zza(zzci.UTF_8);
    }
}