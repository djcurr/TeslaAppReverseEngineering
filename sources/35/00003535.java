package com.google.android.libraries.places.internal;

import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class zzzd extends zzaey implements zzagh {
    private static final zzzd zzb;
    private int zzd;
    private int zze;
    private int zzf = 1;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private int zzt;

    static {
        zzzd zzzdVar = new zzzd();
        zzb = zzzdVar;
        zzaey.zzI(zzzd.class, zzzdVar);
    }

    private zzzd() {
    }

    public static zzza zza() {
        return (zzza) zzb.zzw();
    }

    public static /* synthetic */ void zzd(zzzd zzzdVar, boolean z11) {
        zzzdVar.zzd |= 4;
        zzzdVar.zzg = z11;
    }

    public static /* synthetic */ void zze(zzzd zzzdVar, boolean z11) {
        zzzdVar.zzd |= 8;
        zzzdVar.zzh = z11;
    }

    public static /* synthetic */ void zzf(zzzd zzzdVar, boolean z11) {
        zzzdVar.zzd |= 16;
        zzzdVar.zzi = z11;
    }

    public static /* synthetic */ void zzg(zzzd zzzdVar, int i11) {
        zzzdVar.zzd |= 32;
        zzzdVar.zzj = i11;
    }

    public static /* synthetic */ void zzh(zzzd zzzdVar, int i11) {
        zzzdVar.zzd |= 64;
        zzzdVar.zzk = i11;
    }

    public static /* synthetic */ void zzi(zzzd zzzdVar, int i11) {
        zzzdVar.zzd |= 128;
        zzzdVar.zzl = i11;
    }

    public static /* synthetic */ void zzj(zzzd zzzdVar, int i11) {
        zzzdVar.zzd |= 256;
        zzzdVar.zzm = i11;
    }

    public static /* synthetic */ void zzk(zzzd zzzdVar, int i11) {
        zzzdVar.zzd |= 512;
        zzzdVar.zzn = i11;
    }

    public static /* synthetic */ void zzl(zzzd zzzdVar, int i11) {
        zzzdVar.zzd |= 1024;
        zzzdVar.zzo = i11;
    }

    public static /* synthetic */ void zzm(zzzd zzzdVar, int i11) {
        zzzdVar.zzd |= 2048;
        zzzdVar.zzp = i11;
    }

    public static /* synthetic */ void zzn(zzzd zzzdVar, boolean z11) {
        zzzdVar.zzd |= 4096;
        zzzdVar.zzq = z11;
    }

    public static /* synthetic */ void zzo(zzzd zzzdVar, int i11) {
        zzzdVar.zzd |= PKIFailureInfo.certRevoked;
        zzzdVar.zzr = i11;
    }

    public static /* synthetic */ void zzp(zzzd zzzdVar, int i11) {
        zzzdVar.zze = i11 - 1;
        zzzdVar.zzd |= 1;
    }

    public static /* synthetic */ void zzq(zzzd zzzdVar, int i11) {
        zzzdVar.zzf = i11;
        zzzdVar.zzd |= 2;
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    public final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzza(null);
                }
                return new zzzd();
            }
            return zzaey.zzF(zzb, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\nဋ\t\u000bဋ\n\fဋ\u000b\rဇ\f\u000eဋ\r\u000fဋ\b\u0010ဋ\u000e\u0011ဌ\u000f", new Object[]{"zzd", "zze", zzzc.zza, "zzf", zzyz.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzm", "zzs", "zzt", zzzb.zza});
        }
        return (byte) 1;
    }
}