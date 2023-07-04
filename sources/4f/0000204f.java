package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;

/* loaded from: classes3.dex */
public final class zzap {

    /* loaded from: classes3.dex */
    public static final class zza extends zzcg<zza, C0260zza> implements zzdq {
        private static volatile zzdz<zza> zzbg;
        private static final zza zzes;
        private int zzbb;
        private int zzel;
        private int zzem;
        private int zzen;
        private int zzeo;
        private int zzep;
        private int zzeq;
        private int zzer;

        /* renamed from: com.google.android.gms.internal.clearcut.zzap$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0260zza extends zzcg.zza<zza, C0260zza> implements zzdq {
            private C0260zza() {
                super(zza.zzes);
            }

            /* synthetic */ C0260zza(zzaq zzaqVar) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzcj {
            UNKNOWN(0),
            ON(1),
            OFF(2);
            
            private static final zzck<zzb> zzbq = new zzar();
            private final int value;

            zzb(int i11) {
                this.value = i11;
            }

            public static zzck<zzb> zzd() {
                return zzbq;
            }

            public static zzb zze(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            return null;
                        }
                        return OFF;
                    }
                    return ON;
                }
                return UNKNOWN;
            }

            @Override // com.google.android.gms.internal.clearcut.zzcj
            public final int zzc() {
                return this.value;
            }
        }

        static {
            zza zzaVar = new zza();
            zzes = zzaVar;
            zzcg.zza(zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzap$zza>, com.google.android.gms.internal.clearcut.zzcg$zzb] */
        @Override // com.google.android.gms.internal.clearcut.zzcg
        public final Object zza(int i11, Object obj, Object obj2) {
            zzdz<zza> zzdzVar;
            switch (zzaq.zzba[i11 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0260zza(null);
                case 3:
                    return zzcg.zza(zzes, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\b\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003\u0005\f\u0004\u0006\f\u0005\u0007\f\u0006", new Object[]{"zzbb", "zzel", zzb.zzd(), "zzem", zzb.zzd(), "zzen", zzb.zzd(), "zzeo", zzb.zzd(), "zzep", zzb.zzd(), "zzeq", zzb.zzd(), "zzer", zzb.zzd()});
                case 4:
                    return zzes;
                case 5:
                    zzdz<zza> zzdzVar2 = zzbg;
                    zzdz<zza> zzdzVar3 = zzdzVar2;
                    if (zzdzVar2 == null) {
                        synchronized (zza.class) {
                            zzdz<zza> zzdzVar4 = zzbg;
                            zzdzVar = zzdzVar4;
                            if (zzdzVar4 == null) {
                                ?? zzbVar = new zzcg.zzb(zzes);
                                zzbg = zzbVar;
                                zzdzVar = zzbVar;
                            }
                        }
                        zzdzVar3 = zzdzVar;
                    }
                    return zzdzVar3;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}