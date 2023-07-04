package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

/* loaded from: classes3.dex */
public final class zzhq implements zzhp {
    private final zzfz zza;
    private final zzgd zzb;

    public zzhq(zzgd zzgdVar, zzfz zzfzVar, byte[] bArr) {
        this.zzb = zzgdVar;
        this.zza = zzfzVar;
    }

    @Override // com.google.android.libraries.places.internal.zzhp
    public final void zza(zzho zzhoVar) {
        zzza zza = zzzd.zza();
        zza.zzg(zzhoVar.zzz());
        zza.zzd(zzhoVar.zzx());
        zza.zze(zzhoVar.zzy());
        zza.zzj(zzhoVar.zzd());
        zza.zzc(zzhoVar.zzb());
        zza.zzb(zzhoVar.zza());
        zza.zzk(zzhoVar.zze());
        zza.zzh(zzhoVar.zzk().length());
        zza.zzl(zzhoVar.zzg());
        zza.zzf(zzhoVar.zzc());
        zza.zzi(zzhoVar.zzA());
        zza.zza(zzhoVar.zzf());
        if (zzhoVar.zzi() == zzgp.FRAGMENT) {
            zza.zzn(2);
        } else if (zzhoVar.zzi() == zzgp.INTENT) {
            zza.zzn(3);
        } else {
            zza.zzn(1);
        }
        if (zzhoVar.zzj() == AutocompleteActivityMode.FULLSCREEN) {
            zza.zzm(2);
        } else if (zzhoVar.zzj() == AutocompleteActivityMode.OVERLAY) {
            zza.zzm(1);
        }
        zzzj zzb = zzge.zzb(this.zza);
        zzb.zzl(10);
        zzb.zzc((zzzd) zza.zzq());
        this.zzb.zza(zzge.zza((zzzo) zzb.zzq()));
    }
}