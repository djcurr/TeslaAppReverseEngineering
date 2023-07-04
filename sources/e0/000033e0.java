package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzmn extends zzaey implements zzagh {
    private static final zzmn zzb;
    private int zzd;
    private zzzo zzf;
    private zzop zzg;
    private zzacj zzh;
    private zzwl zzi;
    private zzrx zzj;
    private zzpi zzk;
    private zzoj zzl;
    private zznp zzm;
    private zzpc zzn;
    private zztv zzo;
    private zzuj zzp;
    private zzum zzq;
    private zzmz zzr;
    private zzqe zzs;
    private zzc zzt;
    private zzaj zzu;
    private zzar zzv;
    private zzbo zzw;
    private zzau zzx;
    private zzbb zzy;
    private byte zzz = 2;
    private int zze = 1;

    static {
        zzmn zzmnVar = new zzmn();
        zzb = zzmnVar;
        zzaey.zzI(zzmn.class, zzmnVar);
    }

    private zzmn() {
    }

    public static zzml zza() {
        return (zzml) zzb.zzw();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzmn zzmnVar, zzzo zzzoVar) {
        zzzoVar.getClass();
        zzmnVar.zzf = zzzoVar;
        zzmnVar.zzd |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzmn zzmnVar, int i11) {
        zzmnVar.zze = 1;
        zzmnVar.zzd = 1 | zzmnVar.zzd;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.places.internal.zzaey
    public final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            this.zzz = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzml(null);
                }
                return new zzmn();
            }
            return zzaey.zzF(zzb, "\u0001\u0015\u0000\u0001\u0001\u0016\u0015\u0000\u0000\u0002\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000fဉ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013ဉ\u0011\u0014ဉ\u0012\u0015ဉ\u0013\u0016ဉ\u0014", new Object[]{"zzd", "zze", zzmm.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        }
        return Byte.valueOf(this.zzz);
    }
}