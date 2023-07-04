package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzaba extends zzaey implements zzagh {
    private static final zzaba zzb;
    private int zzd;
    private int zze;
    private zzym zzh;
    private zzabj zzi;
    private zzzx zzj;
    private zzyw zzk;
    private zzzv zzl;
    private zzyy zzm;
    private zzzt zzn;
    private zzabl zzo;
    private zzabl zzp;
    private zzzz zzq;
    private zzzi zzr;
    private zzabc zzs;
    private zzabe zzt;
    private zzaap zzu;
    private zzaaf zzv;
    private zzabg zzw;
    private byte zzx = 2;
    private String zzf = "";
    private String zzg = "";

    static {
        zzaba zzabaVar = new zzaba();
        zzb = zzabaVar;
        zzaey.zzI(zzaba.class, zzabaVar);
    }

    private zzaba() {
    }

    public static zzaay zza() {
        return (zzaay) zzb.zzw();
    }

    public static /* synthetic */ void zzd(zzaba zzabaVar, String str) {
        str.getClass();
        zzabaVar.zzd |= 2;
        zzabaVar.zzf = str;
    }

    public static /* synthetic */ void zze(zzaba zzabaVar, String str) {
        str.getClass();
        zzabaVar.zzd |= 4;
        zzabaVar.zzg = str;
    }

    public static /* synthetic */ void zzf(zzaba zzabaVar, zzzv zzzvVar) {
        zzzvVar.getClass();
        zzabaVar.zzl = zzzvVar;
        zzabaVar.zzd |= 128;
    }

    public static /* synthetic */ void zzg(zzaba zzabaVar, zzyy zzyyVar) {
        zzyyVar.getClass();
        zzabaVar.zzm = zzyyVar;
        zzabaVar.zzd |= 256;
    }

    public static /* synthetic */ void zzh(zzaba zzabaVar, int i11) {
        zzabaVar.zze = i11 - 1;
        zzabaVar.zzd |= 1;
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    public final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            this.zzx = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaay(null);
                }
                return new zzaba();
            }
            return zzaey.zzF(zzb, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0004\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bဉ\u0007\tᐉ\b\nဉ\t\u000bဉ\u000b\fဉ\n\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012", new Object[]{"zzd", "zze", zzaaz.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzp", "zzo", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw"});
        }
        return Byte.valueOf(this.zzx);
    }
}