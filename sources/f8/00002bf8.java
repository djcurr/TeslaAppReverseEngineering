package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzcz;

/* loaded from: classes3.dex */
public final class zzdl extends zzjn<zzdl> {
    private zzcz.zzc.zzb zzoj;
    private String url = null;
    private Boolean zzoi = null;
    private Long zzok = null;
    private Long zzol = null;
    private Long zzom = null;
    private String zzon = null;

    public zzdl() {
        this.zzadp = -1;
    }

    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final void zza(zzjl zzjlVar) {
        String str = this.url;
        if (str != null) {
            zzjlVar.zza(1, str);
        }
        Boolean bool = this.zzoi;
        if (bool != null) {
            zzjlVar.zzb(2, bool.booleanValue());
        }
        zzcz.zzc.zzb zzbVar = this.zzoj;
        if (zzbVar != null && zzbVar != null) {
            zzjlVar.zze(3, zzbVar.zzr());
        }
        Long l11 = this.zzok;
        if (l11 != null) {
            zzjlVar.zzi(4, l11.longValue());
        }
        Long l12 = this.zzol;
        if (l12 != null) {
            zzjlVar.zzi(5, l12.longValue());
        }
        Long l13 = this.zzom;
        if (l13 != null) {
            zzjlVar.zzi(6, l13.longValue());
        }
        String str2 = this.zzon;
        if (str2 != null) {
            zzjlVar.zza(7, str2);
        }
        super.zza(zzjlVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final int zzt() {
        int zzt = super.zzt();
        String str = this.url;
        if (str != null) {
            zzt += zzjl.zzb(1, str);
        }
        Boolean bool = this.zzoi;
        if (bool != null) {
            bool.booleanValue();
            zzt += zzjl.zzav(2) + 1;
        }
        zzcz.zzc.zzb zzbVar = this.zzoj;
        if (zzbVar != null && zzbVar != null) {
            zzt += zzjl.zzi(3, zzbVar.zzr());
        }
        Long l11 = this.zzok;
        if (l11 != null) {
            zzt += zzjl.zzd(4, l11.longValue());
        }
        Long l12 = this.zzol;
        if (l12 != null) {
            zzt += zzjl.zzd(5, l12.longValue());
        }
        Long l13 = this.zzom;
        if (l13 != null) {
            zzt += zzjl.zzd(6, l13.longValue());
        }
        String str2 = this.zzon;
        return str2 != null ? zzt + zzjl.zzb(7, str2) : zzt;
    }

    @Override // com.google.android.gms.internal.vision.zzjt
    public final /* synthetic */ zzjt zza(zzjk zzjkVar) {
        while (true) {
            int zzdq = zzjkVar.zzdq();
            if (zzdq == 0) {
                return this;
            }
            if (zzdq == 10) {
                this.url = zzjkVar.readString();
            } else if (zzdq == 16) {
                this.zzoi = Boolean.valueOf(zzjkVar.zzcu());
            } else if (zzdq == 24) {
                int position = zzjkVar.getPosition();
                int zzdt = zzjkVar.zzdt();
                if (zzdt != 0 && zzdt != 1 && zzdt != 2 && zzdt != 3) {
                    zzjkVar.zzbt(position);
                    zza(zzjkVar, zzdq);
                } else {
                    this.zzoj = zzcz.zzc.zzb.zzs(zzdt);
                }
            } else if (zzdq == 32) {
                this.zzok = Long.valueOf(zzjkVar.zzdu());
            } else if (zzdq == 40) {
                this.zzol = Long.valueOf(zzjkVar.zzdu());
            } else if (zzdq == 48) {
                this.zzom = Long.valueOf(zzjkVar.zzdu());
            } else if (zzdq != 58) {
                if (!super.zza(zzjkVar, zzdq)) {
                    return this;
                }
            } else {
                this.zzon = zzjkVar.readString();
            }
        }
    }
}