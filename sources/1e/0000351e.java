package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzyh extends zzaey implements zzagh {
    private static final zzyh zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private zzxv zzj;
    private zzxo zzk;
    private zzxj zzl;
    private zzabp zzm;
    private zzxq zzn;
    private zzxt zzo;
    private zzabr zzp;
    private zzabz zzq;
    private zzabv zzr;
    private int zzs;

    static {
        zzyh zzyhVar = new zzyh();
        zzb = zzyhVar;
        zzaey.zzI(zzyh.class, zzyhVar);
    }

    private zzyh() {
    }

    public static zzyc zza() {
        return (zzyc) zzb.zzw();
    }

    public static /* synthetic */ void zzd(zzyh zzyhVar, int i11) {
        zzyhVar.zzd |= 4;
        zzyhVar.zzg = i11;
    }

    public static /* synthetic */ void zze(zzyh zzyhVar, zzxv zzxvVar) {
        zzxvVar.getClass();
        zzyhVar.zzj = zzxvVar;
        zzyhVar.zzd |= 32;
    }

    public static /* synthetic */ void zzf(zzyh zzyhVar, zzxj zzxjVar) {
        zzxjVar.getClass();
        zzyhVar.zzl = zzxjVar;
        zzyhVar.zzd |= 128;
    }

    public static /* synthetic */ void zzg(zzyh zzyhVar, zzxq zzxqVar) {
        zzxqVar.getClass();
        zzyhVar.zzn = zzxqVar;
        zzyhVar.zzd |= 512;
    }

    public static /* synthetic */ void zzh(zzyh zzyhVar, int i11) {
        zzyhVar.zze = i11 - 1;
        zzyhVar.zzd |= 1;
    }

    public static /* synthetic */ void zzi(zzyh zzyhVar, int i11) {
        zzyhVar.zzf = i11 - 1;
        zzyhVar.zzd |= 2;
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
                    return new zzyc(null);
                }
                return new zzyh();
            }
            return zzaey.zzF(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000fဌ\u000e", new Object[]{"zzd", "zze", zzye.zza, "zzf", zzyg.zza, "zzg", "zzh", zzyd.zza, "zzi", zzyb.zza, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", zzyf.zza});
        }
        return (byte) 1;
    }
}