package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import nm.d;

/* loaded from: classes3.dex */
public final class zzoj implements zznv {
    private final zzku zza;
    private zzmw zzb = new zzmw();
    private final int zzc;

    private zzoj(zzku zzkuVar, int i11) {
        this.zza = zzkuVar;
        zzos.zza();
        this.zzc = i11;
    }

    public static zznv zzf(zzku zzkuVar) {
        return new zzoj(zzkuVar, 0);
    }

    public static zznv zzg(zzku zzkuVar, int i11) {
        return new zzoj(zzkuVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zznv
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zznv
    public final zznv zzb(zzkt zzktVar) {
        this.zza.zzf(zzktVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zznv
    public final zznv zzc(zzmw zzmwVar) {
        this.zzb = zzmwVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zznv
    public final String zzd() {
        zzmy zzf = this.zza.zzj().zzf();
        return (zzf == null || zzab.zzb(zzf.zzk())) ? "NA" : (String) Preconditions.checkNotNull(zzf.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zznv
    public final byte[] zze(int i11, boolean z11) {
        this.zzb.zzf(Boolean.valueOf(1 == (i11 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzi(this.zzb.zzm());
        try {
            zzos.zza();
            if (i11 == 0) {
                return new d().i(zzjd.zza).j(true).h().encode(this.zza.zzj()).getBytes("utf-8");
            }
            zzkw zzj = this.zza.zzj();
            zzdd zzddVar = new zzdd();
            zzjd.zza.configure(zzddVar);
            return zzddVar.zza().zza(zzj);
        } catch (UnsupportedEncodingException e11) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
        }
    }
}