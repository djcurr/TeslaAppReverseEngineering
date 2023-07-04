package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzlk implements zzlr {
    private final zzlg zza;
    private final zzmi zzb;
    private final boolean zzc;
    private final zzjm zzd;

    private zzlk(zzmi zzmiVar, zzjm zzjmVar, zzlg zzlgVar) {
        this.zzb = zzmiVar;
        this.zzc = zzjmVar.zzc(zzlgVar);
        this.zzd = zzjmVar;
        this.zza = zzlgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlk zzc(zzmi zzmiVar, zzjm zzjmVar, zzlg zzlgVar) {
        return new zzlk(zzmiVar, zzjmVar, zzlgVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zza(Object obj) {
        zzmi zzmiVar = this.zzb;
        int zzb = zzmiVar.zzb(zzmiVar.zzc(obj));
        if (this.zzc) {
            this.zzd.zza(obj);
            throw null;
        }
        return zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzc(obj).hashCode();
        if (this.zzc) {
            this.zzd.zza(obj);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final Object zze() {
        return this.zza.zzbA().zzaA();
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzf(Object obj) {
        this.zzb.zzg(obj);
        this.zzd.zzb(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzg(Object obj, Object obj2) {
        zzlt.zzF(this.zzb, obj, obj2);
        if (this.zzc) {
            zzlt.zzE(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzh(Object obj, byte[] bArr, int i11, int i12, zzik zzikVar) {
        zzjz zzjzVar = (zzjz) obj;
        if (zzjzVar.zzc == zzmj.zzc()) {
            zzjzVar.zzc = zzmj.zze();
        }
        zzjw zzjwVar = (zzjw) obj;
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final boolean zzi(Object obj, Object obj2) {
        if (this.zzb.zzc(obj).equals(this.zzb.zzc(obj2))) {
            if (this.zzc) {
                this.zzd.zza(obj);
                this.zzd.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final boolean zzj(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlr
    public final void zzm(Object obj, zzjh zzjhVar) {
        this.zzd.zza(obj);
        throw null;
    }
}