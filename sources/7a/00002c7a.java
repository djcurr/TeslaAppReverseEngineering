package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhu implements zzhd {
    private final int flags;
    private final String info;
    private final Object[] zzze;
    private final zzhf zzzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhu(zzhf zzhfVar, String str, Object[] objArr) {
        this.zzzh = zzhfVar;
        this.info = str;
        this.zzze = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.flags = charAt;
            return;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        int i13 = 1;
        while (true) {
            int i14 = i13 + 1;
            char charAt2 = str.charAt(i13);
            if (charAt2 < 55296) {
                this.flags = i11 | (charAt2 << i12);
                return;
            }
            i11 |= (charAt2 & 8191) << i12;
            i12 += 13;
            i13 = i14;
        }
    }

    @Override // com.google.android.gms.internal.vision.zzhd
    public final int zzge() {
        return (this.flags & 1) == 1 ? zzfy.zzg.zzxf : zzfy.zzg.zzxg;
    }

    @Override // com.google.android.gms.internal.vision.zzhd
    public final boolean zzgf() {
        return (this.flags & 2) == 2;
    }

    @Override // com.google.android.gms.internal.vision.zzhd
    public final zzhf zzgg() {
        return this.zzzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzgn() {
        return this.info;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] zzgo() {
        return this.zzze;
    }
}