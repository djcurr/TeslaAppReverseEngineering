package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes3.dex */
public final class zzjl {
    private final String zza;
    private final String zzb;
    private final zzjj zzc;
    private final String zzd;
    private final String zze;
    private final zzji zzf;
    private final Long zzg;
    private final Boolean zzh;
    private final Boolean zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzjl(zzjh zzjhVar, zzjk zzjkVar) {
        String str;
        zzjj zzjjVar;
        String str2;
        zzji zzjiVar;
        str = zzjhVar.zza;
        this.zza = str;
        this.zzb = null;
        zzjjVar = zzjhVar.zzb;
        this.zzc = zzjjVar;
        this.zzd = null;
        str2 = zzjhVar.zzc;
        this.zze = str2;
        zzjiVar = zzjhVar.zzd;
        this.zzf = zzjiVar;
        this.zzg = null;
        this.zzh = null;
        this.zzi = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzjl) {
            zzjl zzjlVar = (zzjl) obj;
            return Objects.equal(this.zza, zzjlVar.zza) && Objects.equal(null, null) && Objects.equal(this.zzc, zzjlVar.zzc) && Objects.equal(null, null) && Objects.equal(this.zze, zzjlVar.zze) && Objects.equal(this.zzf, zzjlVar.zzf) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null, this.zzc, null, this.zze, this.zzf, null, null, null);
    }

    @zzbl(zza = 6)
    public final zzji zza() {
        return this.zzf;
    }

    @zzbl(zza = 3)
    public final zzjj zzb() {
        return this.zzc;
    }

    @zzbl(zza = 5)
    public final String zzc() {
        return this.zze;
    }

    @zzbl(zza = 1)
    public final String zzd() {
        return this.zza;
    }
}