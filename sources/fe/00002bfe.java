package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
public final class zzdr extends zzjn<zzdr> {
    public String name = null;
    public Long zzpq = null;
    public zzdh zzpr = null;
    public String zzon = null;
    public zzdn zzps = null;
    private zzdi zzpt = null;

    public zzdr() {
        this.zzadp = -1;
    }

    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final void zza(zzjl zzjlVar) {
        String str = this.name;
        if (str != null) {
            zzjlVar.zza(1, str);
        }
        Long l11 = this.zzpq;
        if (l11 != null) {
            zzjlVar.zzi(2, l11.longValue());
        }
        zzdh zzdhVar = this.zzpr;
        if (zzdhVar != null) {
            zzjlVar.zza(3, zzdhVar);
        }
        String str2 = this.zzon;
        if (str2 != null) {
            zzjlVar.zza(6, str2);
        }
        zzdn zzdnVar = this.zzps;
        if (zzdnVar != null) {
            zzjlVar.zza(16, zzdnVar);
        }
        zzdi zzdiVar = this.zzpt;
        if (zzdiVar != null) {
            zzjlVar.zza(17, zzdiVar);
        }
        super.zza(zzjlVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final int zzt() {
        int zzt = super.zzt();
        String str = this.name;
        if (str != null) {
            zzt += zzjl.zzb(1, str);
        }
        Long l11 = this.zzpq;
        if (l11 != null) {
            zzt += zzjl.zzd(2, l11.longValue());
        }
        zzdh zzdhVar = this.zzpr;
        if (zzdhVar != null) {
            zzt += zzjl.zzb(3, zzdhVar);
        }
        String str2 = this.zzon;
        if (str2 != null) {
            zzt += zzjl.zzb(6, str2);
        }
        zzdn zzdnVar = this.zzps;
        if (zzdnVar != null) {
            zzt += zzjl.zzb(16, zzdnVar);
        }
        zzdi zzdiVar = this.zzpt;
        return zzdiVar != null ? zzt + zzjl.zzb(17, zzdiVar) : zzt;
    }

    @Override // com.google.android.gms.internal.vision.zzjt
    public final /* synthetic */ zzjt zza(zzjk zzjkVar) {
        while (true) {
            int zzdq = zzjkVar.zzdq();
            if (zzdq == 0) {
                return this;
            }
            if (zzdq == 10) {
                this.name = zzjkVar.readString();
            } else if (zzdq == 16) {
                this.zzpq = Long.valueOf(zzjkVar.zzdu());
            } else if (zzdq == 26) {
                if (this.zzpr == null) {
                    this.zzpr = new zzdh();
                }
                zzjkVar.zza(this.zzpr);
            } else if (zzdq == 50) {
                this.zzon = zzjkVar.readString();
            } else if (zzdq == 130) {
                if (this.zzps == null) {
                    this.zzps = new zzdn();
                }
                zzjkVar.zza(this.zzps);
            } else if (zzdq != 138) {
                if (!super.zza(zzjkVar, zzdq)) {
                    return this;
                }
            } else {
                if (this.zzpt == null) {
                    this.zzpt = new zzdi();
                }
                zzjkVar.zza(this.zzpt);
            }
        }
    }
}