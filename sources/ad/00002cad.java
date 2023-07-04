package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjn;

/* loaded from: classes3.dex */
public abstract class zzjn<M extends zzjn<M>> extends zzjt {
    protected zzjp zzadg;

    @Override // com.google.android.gms.internal.vision.zzjt
    public /* synthetic */ Object clone() {
        zzjn zzjnVar = (zzjn) super.clone();
        zzjr.zza(this, zzjnVar);
        return zzjnVar;
    }

    @Override // com.google.android.gms.internal.vision.zzjt
    public void zza(zzjl zzjlVar) {
        if (this.zzadg == null) {
            return;
        }
        for (int i11 = 0; i11 < this.zzadg.size(); i11++) {
            this.zzadg.zzbx(i11).zza(zzjlVar);
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjt
    public final /* synthetic */ zzjt zzhr() {
        return (zzjn) clone();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.vision.zzjt
    public int zzt() {
        if (this.zzadg != null) {
            int i11 = 0;
            for (int i12 = 0; i12 < this.zzadg.size(); i12++) {
                i11 += this.zzadg.zzbx(i12).zzt();
            }
            return i11;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zza(zzjk zzjkVar, int i11) {
        int position = zzjkVar.getPosition();
        if (zzjkVar.zzal(i11)) {
            int i12 = i11 >>> 3;
            zzjv zzjvVar = new zzjv(i11, zzjkVar.zzv(position, zzjkVar.getPosition() - position));
            zzjq zzjqVar = null;
            zzjp zzjpVar = this.zzadg;
            if (zzjpVar == null) {
                this.zzadg = new zzjp();
            } else {
                zzjqVar = zzjpVar.zzbw(i12);
            }
            if (zzjqVar == null) {
                zzjqVar = new zzjq();
                this.zzadg.zza(i12, zzjqVar);
            }
            zzjqVar.zza(zzjvVar);
            return true;
        }
        return false;
    }
}