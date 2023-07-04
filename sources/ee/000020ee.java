package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzfu;

/* loaded from: classes3.dex */
public class zzfu<M extends zzfu<M>> extends zzfz {
    protected zzfw zzrj;

    @Override // com.google.android.gms.internal.clearcut.zzfz
    public void zza(zzfs zzfsVar) {
        if (this.zzrj == null) {
            return;
        }
        for (int i11 = 0; i11 < this.zzrj.size(); i11++) {
            this.zzrj.zzaq(i11).zza(zzfsVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.clearcut.zzfz
    public int zzen() {
        if (this.zzrj != null) {
            for (int i11 = 0; i11 < this.zzrj.size(); i11++) {
                this.zzrj.zzaq(i11).zzen();
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfz
    /* renamed from: zzeo */
    public M clone() {
        M m11 = (M) super.clone();
        zzfy.zza(this, m11);
        return m11;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfz
    public /* synthetic */ zzfz zzep() {
        return (zzfu) clone();
    }
}