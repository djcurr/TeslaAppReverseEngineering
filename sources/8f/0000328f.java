package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzan extends zzaey implements zzagh {
    private static final zzan zzb;
    private int zzd;
    private boolean zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private float zzi;
    private float zzj;
    private boolean zzk;
    private float zzl;
    private double zzm;
    private int zzn;
    private long zzo;
    private float zzp;
    private float zzq;
    private float zzr;
    private float zzs;
    private float zzt;
    private float zzu;

    static {
        zzan zzanVar = new zzan();
        zzb = zzanVar;
        zzaey.zzI(zzan.class, zzanVar);
    }

    private zzan() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    public final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 == 2) {
                zzafc zzafcVar = zzam.zza;
                return zzaey.zzF(zzb, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဌ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ဇ\u0006\bခ\u0007\tက\b\nဌ\t\u000bဂ\n\fခ\u000b\rခ\f\u000eခ\r\u000fခ\u000e\u0010ခ\u000f\u0011ခ\u0010", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzafcVar, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", zzafcVar, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
            } else if (i12 != 3) {
                if (i12 != 4) {
                    if (i12 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzal(null);
            } else {
                return new zzan();
            }
        }
        return (byte) 1;
    }
}