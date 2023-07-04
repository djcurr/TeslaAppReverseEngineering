package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import nm.d;

/* loaded from: classes3.dex */
public final class zzla implements zzkr {
    private final zzhu zza;
    private zzjp zzb = new zzjp();

    private zzla(zzhu zzhuVar, int i11) {
        this.zza = zzhuVar;
        zzlm.zza();
    }

    public static zzkr zze(zzhu zzhuVar) {
        return new zzla(zzhuVar, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzkr
    public final zzkr zza(zzht zzhtVar) {
        this.zza.zzc(zzhtVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzkr
    public final zzkr zzb(zzjp zzjpVar) {
        this.zzb = zzjpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzkr
    public final String zzc() {
        zzjr zzc = this.zza.zzf().zzc();
        return (zzc == null || zzg.zzb(zzc.zzk())) ? "NA" : (String) Preconditions.checkNotNull(zzc.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzkr
    public final byte[] zzd(int i11, boolean z11) {
        this.zzb.zzf(Boolean.valueOf(1 == (i11 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zze(this.zzb.zzm());
        try {
            zzlm.zza();
            if (i11 == 0) {
                return new d().i(zzgi.zza).j(true).h().encode(this.zza.zzf()).getBytes("utf-8");
            }
            zzhw zzf = this.zza.zzf();
            zzam zzamVar = new zzam();
            zzgi.zza.configure(zzamVar);
            return zzamVar.zza().zza(zzf);
        } catch (UnsupportedEncodingException e11) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
        }
    }
}