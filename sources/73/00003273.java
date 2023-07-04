package com.google.android.libraries.places.internal;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzahj {
    private static final zzahj zza = new zzahj(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzahj() {
        this(0, new int[8], new Object[8], true);
    }

    private zzahj(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.zze = -1;
        this.zzb = 0;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z11;
    }

    public static zzahj zzc() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzahj zze(zzahj zzahjVar, zzahj zzahjVar2) {
        int i11 = zzahjVar.zzb;
        int i12 = zzahjVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzahjVar.zzc, 0);
        System.arraycopy(zzahjVar2.zzc, 0, copyOf, 0, 0);
        Object[] copyOf2 = Arrays.copyOf(zzahjVar.zzd, 0);
        System.arraycopy(zzahjVar2.zzd, 0, copyOf2, 0, 0);
        return new zzahj(0, copyOf, copyOf2, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzahj)) {
            zzahj zzahjVar = (zzahj) obj;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 506991;
    }

    public final int zza() {
        int i11 = this.zze;
        if (i11 == -1) {
            this.zze = 0;
            return 0;
        }
        return i11;
    }

    public final int zzb() {
        int i11 = this.zze;
        if (i11 == -1) {
            this.zze = 0;
            return 0;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzahj zzd(zzahj zzahjVar) {
        if (zzahjVar.equals(zza)) {
            return this;
        }
        if (this.zzf) {
            int[] iArr = this.zzc;
            int length = iArr.length;
            System.arraycopy(zzahjVar.zzc, 0, iArr, 0, 0);
            System.arraycopy(zzahjVar.zzd, 0, this.zzd, 0, 0);
            this.zzb = 0;
            return this;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzf() {
        this.zzf = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzg(StringBuilder sb2, int i11) {
    }
}