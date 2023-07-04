package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import nm.d;

/* loaded from: classes3.dex */
public final class zzot implements zzof {
    private final zzld zza;
    private zzne zzb = new zzne();
    private final int zzc;

    private zzot(zzld zzldVar, int i11) {
        this.zza = zzldVar;
        zzpc.zza();
        this.zzc = i11;
    }

    public static zzof zzf(zzld zzldVar) {
        return new zzot(zzldVar, 0);
    }

    public static zzof zzg(zzld zzldVar, int i11) {
        return new zzot(zzldVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzof
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzof
    public final zzof zzb(zzlc zzlcVar) {
        this.zza.zzf(zzlcVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzof
    public final zzof zzc(zzne zzneVar) {
        this.zzb = zzneVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzof
    public final String zzd() {
        zzng zzf = this.zza.zzj().zzf();
        return (zzf == null || zzar.zzb(zzf.zzk())) ? "NA" : (String) Preconditions.checkNotNull(zzf.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzof
    public final byte[] zze(int i11, boolean z11) {
        this.zzb.zzf(Boolean.valueOf(1 == (i11 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzi(this.zzb.zzm());
        try {
            zzpc.zza();
            if (i11 == 0) {
                return new d().i(zzjm.zza).j(true).h().encode(this.zza.zzj()).getBytes("utf-8");
            }
            zzlf zzj = this.zza.zzj();
            zzdn zzdnVar = new zzdn();
            zzjm.zza.configure(zzdnVar);
            return zzdnVar.zza().zza(zzj);
        } catch (UnsupportedEncodingException e11) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
        }
    }
}