package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgt;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhz;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzb extends zzd {
    private final zzhz zza;

    public zzb(zzhz zzhzVar) {
        super(null);
        Preconditions.checkNotNull(zzhzVar);
        this.zza = zzhzVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhz
    public final int zza(String str) {
        return this.zza.zza(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzhz
    public final long zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Boolean zzc() {
        return (Boolean) this.zza.zzg(4);
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Double zzd() {
        return (Double) this.zza.zzg(2);
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Integer zze() {
        return (Integer) this.zza.zzg(3);
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Long zzf() {
        return (Long) this.zza.zzg(1);
    }

    @Override // com.google.android.gms.measurement.internal.zzhz
    public final Object zzg(int i11) {
        return this.zza.zzg(i11);
    }

    @Override // com.google.android.gms.measurement.internal.zzhz
    public final String zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzhz
    public final String zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzhz
    public final String zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzhz
    public final String zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.measurement.zzd
    public final String zzl() {
        return (String) this.zza.zzg(0);
    }

    @Override // com.google.android.gms.measurement.internal.zzhz
    public final List zzm(String str, String str2) {
        return this.zza.zzm(str, str2);
    }

    @Override // com.google.android.gms.measurement.zzd
    public final Map zzn(boolean z11) {
        return this.zza.zzo(null, null, z11);
    }

    @Override // com.google.android.gms.measurement.internal.zzhz
    public final Map zzo(String str, String str2, boolean z11) {
        return this.zza.zzo(str, str2, z11);
    }

    @Override // com.google.android.gms.measurement.internal.zzhz
    public final void zzp(String str) {
        this.zza.zzp(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzhz
    public final void zzq(String str, String str2, Bundle bundle) {
        this.zza.zzq(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzhz
    public final void zzr(String str) {
        this.zza.zzr(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzhz
    public final void zzs(String str, String str2, Bundle bundle) {
        this.zza.zzs(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzhz
    public final void zzt(String str, String str2, Bundle bundle, long j11) {
        this.zza.zzt(str, str2, bundle, j11);
    }

    @Override // com.google.android.gms.measurement.internal.zzhz
    public final void zzu(zzgu zzguVar) {
        this.zza.zzu(zzguVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzhz
    public final void zzv(Bundle bundle) {
        this.zza.zzv(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzhz
    public final void zzw(zzgt zzgtVar) {
        this.zza.zzw(zzgtVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzhz
    public final void zzx(zzgu zzguVar) {
        this.zza.zzx(zzguVar);
    }
}