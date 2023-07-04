package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzg {
    private long zzA;
    private String zzB;
    private boolean zzC;
    private long zzD;
    private long zzE;
    private final zzft zza;
    private final String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private String zzj;
    private long zzk;
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private long zzp;
    private boolean zzq;
    private String zzr;
    private Boolean zzs;
    private long zzt;
    private List zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzg(zzft zzftVar, String str) {
        Preconditions.checkNotNull(zzftVar);
        Preconditions.checkNotEmpty(str);
        this.zza = zzftVar;
        this.zzb = str;
        zzftVar.zzaz().zzg();
    }

    public final String zzA() {
        this.zza.zzaz().zzg();
        return this.zze;
    }

    public final List zzB() {
        this.zza.zzaz().zzg();
        return this.zzu;
    }

    public final void zzC() {
        this.zza.zzaz().zzg();
        this.zzC = false;
    }

    public final void zzD() {
        this.zza.zzaz().zzg();
        long j11 = this.zzg + 1;
        if (j11 > 2147483647L) {
            this.zza.zzay().zzk().zzb("Bundle index overflow. appId", zzej.zzn(this.zzb));
            j11 = 0;
        }
        this.zzC = true;
        this.zzg = j11;
    }

    public final void zzE(String str) {
        this.zza.zzaz().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzC |= true ^ zzky.zzak(this.zzr, str);
        this.zzr = str;
    }

    public final void zzF(boolean z11) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzq != z11;
        this.zzq = z11;
    }

    public final void zzG(long j11) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzp != j11;
        this.zzp = j11;
    }

    public final void zzH(String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzky.zzak(this.zzc, str);
        this.zzc = str;
    }

    public final void zzI(String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzky.zzak(this.zzl, str);
        this.zzl = str;
    }

    public final void zzJ(String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzky.zzak(this.zzj, str);
        this.zzj = str;
    }

    public final void zzK(long j11) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzk != j11;
        this.zzk = j11;
    }

    public final void zzL(long j11) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzD != j11;
        this.zzD = j11;
    }

    public final void zzM(long j11) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzy != j11;
        this.zzy = j11;
    }

    public final void zzN(long j11) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzz != j11;
        this.zzz = j11;
    }

    public final void zzO(long j11) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzx != j11;
        this.zzx = j11;
    }

    public final void zzP(long j11) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzw != j11;
        this.zzw = j11;
    }

    public final void zzQ(long j11) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzA != j11;
        this.zzA = j11;
    }

    public final void zzR(long j11) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzv != j11;
        this.zzv = j11;
    }

    public final void zzS(long j11) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzn != j11;
        this.zzn = j11;
    }

    public final void zzT(long j11) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzt != j11;
        this.zzt = j11;
    }

    public final void zzU(long j11) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzE != j11;
        this.zzE = j11;
    }

    public final void zzV(String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzky.zzak(this.zzf, str);
        this.zzf = str;
    }

    public final void zzW(String str) {
        this.zza.zzaz().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzC |= true ^ zzky.zzak(this.zzd, str);
        this.zzd = str;
    }

    public final void zzX(long j11) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzm != j11;
        this.zzm = j11;
    }

    public final void zzY(String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzky.zzak(this.zzB, str);
        this.zzB = str;
    }

    public final void zzZ(long j11) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzi != j11;
        this.zzi = j11;
    }

    public final long zza() {
        this.zza.zzaz().zzg();
        return this.zzp;
    }

    public final void zzaa(long j11) {
        Preconditions.checkArgument(j11 >= 0);
        this.zza.zzaz().zzg();
        this.zzC |= this.zzg != j11;
        this.zzg = j11;
    }

    public final void zzab(long j11) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzh != j11;
        this.zzh = j11;
    }

    public final void zzac(boolean z11) {
        this.zza.zzaz().zzg();
        this.zzC |= this.zzo != z11;
        this.zzo = z11;
    }

    public final void zzad(Boolean bool) {
        boolean equals;
        this.zza.zzaz().zzg();
        boolean z11 = this.zzC;
        Boolean bool2 = this.zzs;
        int i11 = zzky.zza;
        if (bool2 == null && bool == null) {
            equals = true;
        } else {
            equals = bool2 == null ? false : bool2.equals(bool);
        }
        this.zzC = z11 | (!equals);
        this.zzs = bool;
    }

    public final void zzae(String str) {
        this.zza.zzaz().zzg();
        this.zzC |= !zzky.zzak(this.zze, str);
        this.zze = str;
    }

    public final void zzaf(List list) {
        this.zza.zzaz().zzg();
        List list2 = this.zzu;
        int i11 = zzky.zza;
        if (list2 == null && list == null) {
            return;
        }
        if (list2 != null && list2.equals(list)) {
            return;
        }
        this.zzC = true;
        this.zzu = list != null ? new ArrayList(list) : null;
    }

    public final boolean zzag() {
        this.zza.zzaz().zzg();
        return this.zzq;
    }

    public final boolean zzah() {
        this.zza.zzaz().zzg();
        return this.zzo;
    }

    public final boolean zzai() {
        this.zza.zzaz().zzg();
        return this.zzC;
    }

    public final long zzb() {
        this.zza.zzaz().zzg();
        return this.zzk;
    }

    public final long zzc() {
        this.zza.zzaz().zzg();
        return this.zzD;
    }

    public final long zzd() {
        this.zza.zzaz().zzg();
        return this.zzy;
    }

    public final long zze() {
        this.zza.zzaz().zzg();
        return this.zzz;
    }

    public final long zzf() {
        this.zza.zzaz().zzg();
        return this.zzx;
    }

    public final long zzg() {
        this.zza.zzaz().zzg();
        return this.zzw;
    }

    public final long zzh() {
        this.zza.zzaz().zzg();
        return this.zzA;
    }

    public final long zzi() {
        this.zza.zzaz().zzg();
        return this.zzv;
    }

    public final long zzj() {
        this.zza.zzaz().zzg();
        return this.zzn;
    }

    public final long zzk() {
        this.zza.zzaz().zzg();
        return this.zzt;
    }

    public final long zzl() {
        this.zza.zzaz().zzg();
        return this.zzE;
    }

    public final long zzm() {
        this.zza.zzaz().zzg();
        return this.zzm;
    }

    public final long zzn() {
        this.zza.zzaz().zzg();
        return this.zzi;
    }

    public final long zzo() {
        this.zza.zzaz().zzg();
        return this.zzg;
    }

    public final long zzp() {
        this.zza.zzaz().zzg();
        return this.zzh;
    }

    public final Boolean zzq() {
        this.zza.zzaz().zzg();
        return this.zzs;
    }

    public final String zzr() {
        this.zza.zzaz().zzg();
        return this.zzr;
    }

    public final String zzs() {
        this.zza.zzaz().zzg();
        String str = this.zzB;
        zzY(null);
        return str;
    }

    public final String zzt() {
        this.zza.zzaz().zzg();
        return this.zzb;
    }

    public final String zzu() {
        this.zza.zzaz().zzg();
        return this.zzc;
    }

    public final String zzv() {
        this.zza.zzaz().zzg();
        return this.zzl;
    }

    public final String zzw() {
        this.zza.zzaz().zzg();
        return this.zzj;
    }

    public final String zzx() {
        this.zza.zzaz().zzg();
        return this.zzf;
    }

    public final String zzy() {
        this.zza.zzaz().zzg();
        return this.zzd;
    }

    public final String zzz() {
        this.zza.zzaz().zzg();
        return this.zzB;
    }
}