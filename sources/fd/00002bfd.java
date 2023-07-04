package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzcz;

/* loaded from: classes3.dex */
public final class zzdq extends zzjn<zzdq> {
    private zzcz.zzf.zzb zzpl;
    public Long zzpm = null;
    public Long zzpn = null;
    public Long zzpo = null;
    public Long zzpp = null;

    public zzdq() {
        this.zzadp = -1;
    }

    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final void zza(zzjl zzjlVar) {
        zzcz.zzf.zzb zzbVar = this.zzpl;
        if (zzbVar != null && zzbVar != null) {
            zzjlVar.zze(1, zzbVar.zzr());
        }
        Long l11 = this.zzpm;
        if (l11 != null) {
            zzjlVar.zzi(2, l11.longValue());
        }
        Long l12 = this.zzpn;
        if (l12 != null) {
            zzjlVar.zzi(3, l12.longValue());
        }
        Long l13 = this.zzpp;
        if (l13 != null) {
            zzjlVar.zzi(4, l13.longValue());
        }
        Long l14 = this.zzpo;
        if (l14 != null) {
            zzjlVar.zzi(5, l14.longValue());
        }
        super.zza(zzjlVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final int zzt() {
        int zzt = super.zzt();
        zzcz.zzf.zzb zzbVar = this.zzpl;
        if (zzbVar != null && zzbVar != null) {
            zzt += zzjl.zzi(1, zzbVar.zzr());
        }
        Long l11 = this.zzpm;
        if (l11 != null) {
            zzt += zzjl.zzd(2, l11.longValue());
        }
        Long l12 = this.zzpn;
        if (l12 != null) {
            zzt += zzjl.zzd(3, l12.longValue());
        }
        Long l13 = this.zzpp;
        if (l13 != null) {
            zzt += zzjl.zzd(4, l13.longValue());
        }
        Long l14 = this.zzpo;
        return l14 != null ? zzt + zzjl.zzd(5, l14.longValue()) : zzt;
    }

    @Override // com.google.android.gms.internal.vision.zzjt
    public final /* synthetic */ zzjt zza(zzjk zzjkVar) {
        while (true) {
            int zzdq = zzjkVar.zzdq();
            if (zzdq == 0) {
                return this;
            }
            if (zzdq == 8) {
                int position = zzjkVar.getPosition();
                int zzdt = zzjkVar.zzdt();
                if (zzdt != 0 && zzdt != 1 && zzdt != 2 && zzdt != 3) {
                    zzjkVar.zzbt(position);
                    zza(zzjkVar, zzdq);
                } else {
                    this.zzpl = zzcz.zzf.zzb.zzu(zzdt);
                }
            } else if (zzdq == 16) {
                this.zzpm = Long.valueOf(zzjkVar.zzdu());
            } else if (zzdq == 24) {
                this.zzpn = Long.valueOf(zzjkVar.zzdu());
            } else if (zzdq == 32) {
                this.zzpp = Long.valueOf(zzjkVar.zzdu());
            } else if (zzdq != 40) {
                if (!super.zza(zzjkVar, zzdq)) {
                    return this;
                }
            } else {
                this.zzpo = Long.valueOf(zzjkVar.zzdu());
            }
        }
    }
}