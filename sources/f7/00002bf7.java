package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
public final class zzdk extends zzjn<zzdk> {
    public zzds[] zzoh = zzds.zzcc();

    public zzdk() {
        this.zzadp = -1;
    }

    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final void zza(zzjl zzjlVar) {
        zzds[] zzdsVarArr = this.zzoh;
        if (zzdsVarArr != null && zzdsVarArr.length > 0) {
            int i11 = 0;
            while (true) {
                zzds[] zzdsVarArr2 = this.zzoh;
                if (i11 >= zzdsVarArr2.length) {
                    break;
                }
                zzds zzdsVar = zzdsVarArr2[i11];
                if (zzdsVar != null) {
                    zzjlVar.zza(1, zzdsVar);
                }
                i11++;
            }
        }
        super.zza(zzjlVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final int zzt() {
        int zzt = super.zzt();
        zzds[] zzdsVarArr = this.zzoh;
        if (zzdsVarArr != null && zzdsVarArr.length > 0) {
            int i11 = 0;
            while (true) {
                zzds[] zzdsVarArr2 = this.zzoh;
                if (i11 >= zzdsVarArr2.length) {
                    break;
                }
                zzds zzdsVar = zzdsVarArr2[i11];
                if (zzdsVar != null) {
                    zzt += zzjl.zzb(1, zzdsVar);
                }
                i11++;
            }
        }
        return zzt;
    }

    @Override // com.google.android.gms.internal.vision.zzjt
    public final /* synthetic */ zzjt zza(zzjk zzjkVar) {
        while (true) {
            int zzdq = zzjkVar.zzdq();
            if (zzdq == 0) {
                return this;
            }
            if (zzdq != 10) {
                if (!super.zza(zzjkVar, zzdq)) {
                    return this;
                }
            } else {
                int zzb = zzjw.zzb(zzjkVar, 10);
                zzds[] zzdsVarArr = this.zzoh;
                int length = zzdsVarArr == null ? 0 : zzdsVarArr.length;
                int i11 = zzb + length;
                zzds[] zzdsVarArr2 = new zzds[i11];
                if (length != 0) {
                    System.arraycopy(zzdsVarArr, 0, zzdsVarArr2, 0, length);
                }
                while (length < i11 - 1) {
                    zzdsVarArr2[length] = new zzds();
                    zzjkVar.zza(zzdsVarArr2[length]);
                    zzjkVar.zzdq();
                    length++;
                }
                zzdsVarArr2[length] = new zzds();
                zzjkVar.zza(zzdsVarArr2[length]);
                this.zzoh = zzdsVarArr2;
            }
        }
    }
}