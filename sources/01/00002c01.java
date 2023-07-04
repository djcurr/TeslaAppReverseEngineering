package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
public final class zzdu extends zzjn<zzdu> {
    private zzdl zzqc = null;
    public zzdr zzqd = null;
    public zzdp zzqe = null;
    private Integer zzqf = null;

    public zzdu() {
        this.zzadp = -1;
    }

    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final void zza(zzjl zzjlVar) {
        zzdl zzdlVar = this.zzqc;
        if (zzdlVar != null) {
            zzjlVar.zza(1, zzdlVar);
        }
        zzdr zzdrVar = this.zzqd;
        if (zzdrVar != null) {
            zzjlVar.zza(2, zzdrVar);
        }
        zzdp zzdpVar = this.zzqe;
        if (zzdpVar != null) {
            zzjlVar.zza(3, zzdpVar);
        }
        Integer num = this.zzqf;
        if (num != null) {
            zzjlVar.zze(4, num.intValue());
        }
        super.zza(zzjlVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final int zzt() {
        int zzt = super.zzt();
        zzdl zzdlVar = this.zzqc;
        if (zzdlVar != null) {
            zzt += zzjl.zzb(1, zzdlVar);
        }
        zzdr zzdrVar = this.zzqd;
        if (zzdrVar != null) {
            zzt += zzjl.zzb(2, zzdrVar);
        }
        zzdp zzdpVar = this.zzqe;
        if (zzdpVar != null) {
            zzt += zzjl.zzb(3, zzdpVar);
        }
        Integer num = this.zzqf;
        return num != null ? zzt + zzjl.zzi(4, num.intValue()) : zzt;
    }

    @Override // com.google.android.gms.internal.vision.zzjt
    public final /* synthetic */ zzjt zza(zzjk zzjkVar) {
        while (true) {
            int zzdq = zzjkVar.zzdq();
            if (zzdq == 0) {
                return this;
            }
            if (zzdq == 10) {
                if (this.zzqc == null) {
                    this.zzqc = new zzdl();
                }
                zzjkVar.zza(this.zzqc);
            } else if (zzdq == 18) {
                if (this.zzqd == null) {
                    this.zzqd = new zzdr();
                }
                zzjkVar.zza(this.zzqd);
            } else if (zzdq == 26) {
                if (this.zzqe == null) {
                    this.zzqe = new zzdp();
                }
                zzjkVar.zza(this.zzqe);
            } else if (zzdq != 32) {
                if (!super.zza(zzjkVar, zzdq)) {
                    return this;
                }
            } else {
                this.zzqf = Integer.valueOf(zzjkVar.zzdt());
            }
        }
    }
}