package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
public final class zzdh extends zzjn<zzdh> {
    public String zzod = null;
    public String version = null;

    public zzdh() {
        this.zzadp = -1;
    }

    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final void zza(zzjl zzjlVar) {
        String str = this.zzod;
        if (str != null) {
            zzjlVar.zza(1, str);
        }
        String str2 = this.version;
        if (str2 != null) {
            zzjlVar.zza(2, str2);
        }
        super.zza(zzjlVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.vision.zzjn, com.google.android.gms.internal.vision.zzjt
    public final int zzt() {
        int zzt = super.zzt();
        String str = this.zzod;
        if (str != null) {
            zzt += zzjl.zzb(1, str);
        }
        String str2 = this.version;
        return str2 != null ? zzt + zzjl.zzb(2, str2) : zzt;
    }

    @Override // com.google.android.gms.internal.vision.zzjt
    public final /* synthetic */ zzjt zza(zzjk zzjkVar) {
        while (true) {
            int zzdq = zzjkVar.zzdq();
            if (zzdq == 0) {
                return this;
            }
            if (zzdq == 10) {
                this.zzod = zzjkVar.readString();
            } else if (zzdq != 18) {
                if (!super.zza(zzjkVar, zzdq)) {
                    return this;
                }
            } else {
                this.version = zzjkVar.readString();
            }
        }
    }
}