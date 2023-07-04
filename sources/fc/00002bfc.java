package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzcz;

/* loaded from: classes3.dex */
public final class zzdp extends zzjn<zzdp> {
    private zzcz.zzg zzpj;
    public zzdq zzpi = null;
    public zzdm[] zzpk = zzdm.zzcb();

    public zzdp() {
        this.zzadp = -1;
    }

    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final void zza(zzjl zzjlVar) {
        zzdq zzdqVar = this.zzpi;
        if (zzdqVar != null) {
            zzjlVar.zza(1, zzdqVar);
        }
        zzcz.zzg zzgVar = this.zzpj;
        if (zzgVar != null) {
            zzjlVar.zze(2, zzgVar);
        }
        zzdm[] zzdmVarArr = this.zzpk;
        if (zzdmVarArr != null && zzdmVarArr.length > 0) {
            int i11 = 0;
            while (true) {
                zzdm[] zzdmVarArr2 = this.zzpk;
                if (i11 >= zzdmVarArr2.length) {
                    break;
                }
                zzdm zzdmVar = zzdmVarArr2[i11];
                if (zzdmVar != null) {
                    zzjlVar.zza(3, zzdmVar);
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
        zzdq zzdqVar = this.zzpi;
        if (zzdqVar != null) {
            zzt += zzjl.zzb(1, zzdqVar);
        }
        zzcz.zzg zzgVar = this.zzpj;
        if (zzgVar != null) {
            zzt += zzfe.zzc(2, zzgVar);
        }
        zzdm[] zzdmVarArr = this.zzpk;
        if (zzdmVarArr != null && zzdmVarArr.length > 0) {
            int i11 = 0;
            while (true) {
                zzdm[] zzdmVarArr2 = this.zzpk;
                if (i11 >= zzdmVarArr2.length) {
                    break;
                }
                zzdm zzdmVar = zzdmVarArr2[i11];
                if (zzdmVar != null) {
                    zzt += zzjl.zzb(3, zzdmVar);
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
            if (zzdq == 10) {
                if (this.zzpi == null) {
                    this.zzpi = new zzdq();
                }
                zzjkVar.zza(this.zzpi);
            } else if (zzdq == 18) {
                this.zzpj = (zzcz.zzg) zzjkVar.zza(zzcz.zzg.zzbx());
            } else if (zzdq != 26) {
                if (!super.zza(zzjkVar, zzdq)) {
                    return this;
                }
            } else {
                int zzb = zzjw.zzb(zzjkVar, 26);
                zzdm[] zzdmVarArr = this.zzpk;
                int length = zzdmVarArr == null ? 0 : zzdmVarArr.length;
                int i11 = zzb + length;
                zzdm[] zzdmVarArr2 = new zzdm[i11];
                if (length != 0) {
                    System.arraycopy(zzdmVarArr, 0, zzdmVarArr2, 0, length);
                }
                while (length < i11 - 1) {
                    zzdmVarArr2[length] = new zzdm();
                    zzjkVar.zza(zzdmVarArr2[length]);
                    zzjkVar.zzdq();
                    length++;
                }
                zzdmVarArr2[length] = new zzdm();
                zzjkVar.zza(zzdmVarArr2[length]);
                this.zzpk = zzdmVarArr2;
            }
        }
    }
}