package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import nm.d;

/* loaded from: classes3.dex */
public final class zzmt implements zzmh {
    private final zzja zza;
    private zzle zzb = new zzle();

    private zzmt(zzja zzjaVar, int i11) {
        this.zza = zzjaVar;
        zzne.zza();
    }

    public static zzmh zzf(zzja zzjaVar) {
        return new zzmt(zzjaVar, 0);
    }

    public static zzmh zzg() {
        return new zzmt(new zzja(), 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmh
    public final zzmh zza(zziz zzizVar) {
        this.zza.zzf(zzizVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmh
    public final zzmh zzb(zzjg zzjgVar) {
        this.zza.zzi(zzjgVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmh
    public final zzmh zzc(zzle zzleVar) {
        this.zzb = zzleVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmh
    public final String zzd() {
        zzlg zzf = this.zza.zzk().zzf();
        return (zzf == null || zzad.zzc(zzf.zzk())) ? "NA" : (String) Preconditions.checkNotNull(zzf.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzmh
    public final byte[] zze(int i11, boolean z11) {
        this.zzb.zzf(Boolean.valueOf(1 == (i11 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzj(this.zzb.zzm());
        try {
            zzne.zza();
            if (i11 == 0) {
                return new d().i(zzhk.zza).j(true).h().encode(this.zza.zzk()).getBytes("utf-8");
            }
            zzjc zzk = this.zza.zzk();
            zzbp zzbpVar = new zzbp();
            zzhk.zza.configure(zzbpVar);
            return zzbpVar.zza().zza(zzk);
        } catch (UnsupportedEncodingException e11) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
        }
    }
}