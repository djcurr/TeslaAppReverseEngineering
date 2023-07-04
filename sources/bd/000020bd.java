package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzec implements zzdm {
    private final String info;
    private final zzdo zzmn;
    private final zzed zzng;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzec(zzdo zzdoVar, String str, Object[] objArr) {
        this.zzmn = zzdoVar;
        this.info = str;
        this.zzng = new zzed(zzdoVar.getClass(), str, objArr);
    }

    public final int getFieldCount() {
        int i11;
        i11 = this.zzng.zznj;
        return i11;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdm
    public final int zzcf() {
        int i11;
        i11 = this.zzng.flags;
        return (i11 & 1) == 1 ? zzcg.zzg.zzkl : zzcg.zzg.zzkm;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdm
    public final boolean zzcg() {
        int i11;
        i11 = this.zzng.flags;
        return (i11 & 2) == 2;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdm
    public final zzdo zzch() {
        return this.zzmn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzed zzco() {
        return this.zzng;
    }

    public final int zzcp() {
        int i11;
        i11 = this.zzng.zzmk;
        return i11;
    }

    public final int zzcq() {
        int i11;
        i11 = this.zzng.zzml;
        return i11;
    }

    public final int zzcr() {
        int i11;
        i11 = this.zzng.zznm;
        return i11;
    }

    public final int zzcs() {
        int i11;
        i11 = this.zzng.zzno;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int[] zzct() {
        int[] iArr;
        iArr = this.zzng.zzms;
        return iArr;
    }

    public final int zzcu() {
        int i11;
        i11 = this.zzng.zznn;
        return i11;
    }

    public final int zzcv() {
        int i11;
        i11 = this.zzng.zzmm;
        return i11;
    }
}