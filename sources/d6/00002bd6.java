package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzfy;

/* loaded from: classes3.dex */
public final class zzcz {

    /* loaded from: classes3.dex */
    public static final class zza extends zzfy<zza, C0266zza> implements zzhh {
        private static volatile zzhq<zza> zzbf;
        private static final zza zzma;
        private int zzbg;
        private int zzlx = 1;
        private int zzly = 1;
        private String zzlz = "";

        /* renamed from: com.google.android.gms.internal.vision.zzcz$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0266zza extends zzfy.zza<zza, C0266zza> implements zzhh {
            private C0266zza() {
                super(zza.zzma);
            }

            /* synthetic */ C0266zza(zzda zzdaVar) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzma = zzaVar;
            zzfy.zza(zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i11, Object obj, Object obj2) {
            switch (zzda.zzbc[i11 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0266zza(null);
                case 3:
                    return zzfy.zza(zzma, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\b\u0002", new Object[]{"zzbg", "zzlx", zzdv.zzah(), "zzly", zzdy.zzah(), "zzlz"});
                case 4:
                    return zzma;
                case 5:
                    zzhq<zza> zzhqVar = zzbf;
                    if (zzhqVar == null) {
                        synchronized (zza.class) {
                            zzhqVar = zzbf;
                            if (zzhqVar == null) {
                                zzhqVar = new zzfy.zzb<>(zzma);
                                zzbf = zzhqVar;
                            }
                        }
                    }
                    return zzhqVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzb extends zzfy<zzb, zza> implements zzhh {
        private static volatile zzhq<zzb> zzbf;
        private static final zzb zzmc;
        private zzge<zzh> zzmb = zzfy.zzey();

        /* loaded from: classes3.dex */
        public static final class zza extends zzfy.zza<zzb, zza> implements zzhh {
            private zza() {
                super(zzb.zzmc);
            }

            /* synthetic */ zza(zzda zzdaVar) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzmc = zzbVar;
            zzfy.zza(zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i11, Object obj, Object obj2) {
            switch (zzda.zzbc[i11 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zzmc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzmb", zzh.class});
                case 4:
                    return zzmc;
                case 5:
                    zzhq<zzb> zzhqVar = zzbf;
                    if (zzhqVar == null) {
                        synchronized (zzb.class) {
                            zzhqVar = zzbf;
                            if (zzhqVar == null) {
                                zzhqVar = new zzfy.zzb<>(zzmc);
                                zzbf = zzhqVar;
                            }
                        }
                    }
                    return zzhqVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzc extends zzfy<zzc, zza> implements zzhh {
        private static volatile zzhq<zzc> zzbf;
        private static final zzc zzmk;
        private int zzbg;
        private boolean zzme;
        private int zzmf;
        private long zzmg;
        private long zzmh;
        private long zzmi;
        private String zzmd = "";
        private String zzmj = "";

        /* loaded from: classes3.dex */
        public static final class zza extends zzfy.zza<zzc, zza> implements zzhh {
            private zza() {
                super(zzc.zzmk);
            }

            /* synthetic */ zza(zzda zzdaVar) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzgb {
            REASON_UNKNOWN(0),
            REASON_MISSING(1),
            REASON_UPGRADE(2),
            REASON_INVALID(3);
            
            private static final zzgc<zzb> zzdv = new zzdb();
            private final int value;

            zzb(int i11) {
                this.value = i11;
            }

            public static zzgd zzah() {
                return zzdc.zzhl;
            }

            public static zzb zzs(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                return null;
                            }
                            return REASON_INVALID;
                        }
                        return REASON_UPGRADE;
                    }
                    return REASON_MISSING;
                }
                return REASON_UNKNOWN;
            }

            @Override // com.google.android.gms.internal.vision.zzgb
            public final int zzr() {
                return this.value;
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzmk = zzcVar;
            zzfy.zza(zzc.class, zzcVar);
        }

        private zzc() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i11, Object obj, Object obj2) {
            switch (zzda.zzbc[i11 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zzmk, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\b\u0000\u0002\u0007\u0001\u0003\f\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\b\u0006", new Object[]{"zzbg", "zzmd", "zzme", "zzmf", zzb.zzah(), "zzmg", "zzmh", "zzmi", "zzmj"});
                case 4:
                    return zzmk;
                case 5:
                    zzhq<zzc> zzhqVar = zzbf;
                    if (zzhqVar == null) {
                        synchronized (zzc.class) {
                            zzhqVar = zzbf;
                            if (zzhqVar == null) {
                                zzhqVar = new zzfy.zzb<>(zzmk);
                                zzbf = zzhqVar;
                            }
                        }
                    }
                    return zzhqVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzd extends zzfy<zzd, zza> implements zzhh {
        private static volatile zzhq<zzd> zzbf;
        private static final zzd zzmy;
        private int zzbg;
        private int zzmt;
        private long zzmv;
        private long zzmw;
        private String zzmq = "";
        private String zzmr = "";
        private zzge<String> zzms = zzfy.zzey();
        private String zzmu = "";
        private zzge<zzi> zzmx = zzfy.zzey();

        /* loaded from: classes3.dex */
        public static final class zza extends zzfy.zza<zzd, zza> implements zzhh {
            private zza() {
                super(zzd.zzmy);
            }

            /* synthetic */ zza(zzda zzdaVar) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzgb {
            RESULT_UNKNOWN(0),
            RESULT_SUCCESS(1),
            RESULT_FAIL(2),
            RESULT_SKIPPED(3);
            
            private static final zzgc<zzb> zzdv = new zzdd();
            private final int value;

            zzb(int i11) {
                this.value = i11;
            }

            public static zzgd zzah() {
                return zzde.zzhl;
            }

            public static zzb zzt(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                return null;
                            }
                            return RESULT_SKIPPED;
                        }
                        return RESULT_FAIL;
                    }
                    return RESULT_SUCCESS;
                }
                return RESULT_UNKNOWN;
            }

            @Override // com.google.android.gms.internal.vision.zzgb
            public final int zzr() {
                return this.value;
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzmy = zzdVar;
            zzfy.zza(zzd.class, zzdVar);
        }

        private zzd() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i11, Object obj, Object obj2) {
            switch (zzda.zzbc[i11 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zzmy, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u001a\u0004\f\u0002\u0005\b\u0003\u0006\u0002\u0004\u0007\u0002\u0005\b\u001b", new Object[]{"zzbg", "zzmq", "zzmr", "zzms", "zzmt", zzb.zzah(), "zzmu", "zzmv", "zzmw", "zzmx", zzi.class});
                case 4:
                    return zzmy;
                case 5:
                    zzhq<zzd> zzhqVar = zzbf;
                    if (zzhqVar == null) {
                        synchronized (zzd.class) {
                            zzhqVar = zzbf;
                            if (zzhqVar == null) {
                                zzhqVar = new zzfy.zzb<>(zzmy);
                                zzbf = zzhqVar;
                            }
                        }
                    }
                    return zzhqVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class zze extends zzfy<zze, zza> implements zzhh {
        private static volatile zzhq<zze> zzbf;
        private static final zze zznk;
        private int zzbg;
        private float zzne;
        private float zznf;
        private float zzng;
        private float zznh;
        private float zzni;
        private float zznj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzfy.zza<zze, zza> implements zzhh {
            private zza() {
                super(zze.zznk);
            }

            /* synthetic */ zza(zzda zzdaVar) {
                this();
            }
        }

        static {
            zze zzeVar = new zze();
            zznk = zzeVar;
            zzfy.zza(zze.class, zzeVar);
        }

        private zze() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i11, Object obj, Object obj2) {
            switch (zzda.zzbc[i11 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zznk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0001\u0002\u0004\u0001\u0003\u0005\u0001\u0004\u0006\u0001\u0005", new Object[]{"zzbg", "zzne", "zznf", "zzng", "zznh", "zzni", "zznj"});
                case 4:
                    return zznk;
                case 5:
                    zzhq<zze> zzhqVar = zzbf;
                    if (zzhqVar == null) {
                        synchronized (zze.class) {
                            zzhqVar = zzbf;
                            if (zzhqVar == null) {
                                zzhqVar = new zzfy.zzb<>(zznk);
                                zzbf = zzhqVar;
                            }
                        }
                    }
                    return zzhqVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzf extends zzfy<zzf, zza> implements zzhh {
        private static volatile zzhq<zzf> zzbf;
        private static final zzf zzno;
        private int zzbg;
        private long zzhr;
        private int zzlx;
        private long zznl;
        private long zznm;
        private long zznn;

        /* loaded from: classes3.dex */
        public static final class zza extends zzfy.zza<zzf, zza> implements zzhh {
            private zza() {
                super(zzf.zzno);
            }

            /* synthetic */ zza(zzda zzdaVar) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzgb {
            FORMAT_UNKNOWN(0),
            FORMAT_LUMINANCE(1),
            FORMAT_RGB8(2),
            FORMAT_MONOCHROME(3);
            
            private static final zzgc<zzb> zzdv = new zzdf();
            private final int value;

            zzb(int i11) {
                this.value = i11;
            }

            public static zzgd zzah() {
                return zzdg.zzhl;
            }

            public static zzb zzu(int i11) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                return null;
                            }
                            return FORMAT_MONOCHROME;
                        }
                        return FORMAT_RGB8;
                    }
                    return FORMAT_LUMINANCE;
                }
                return FORMAT_UNKNOWN;
            }

            @Override // com.google.android.gms.internal.vision.zzgb
            public final int zzr() {
                return this.value;
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzno = zzfVar;
            zzfy.zza(zzf.class, zzfVar);
        }

        private zzf() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i11, Object obj, Object obj2) {
            switch (zzda.zzbc[i11 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zzno, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0004\u0005\u0002\u0003", new Object[]{"zzbg", "zzlx", zzb.zzah(), "zznl", "zznm", "zzhr", "zznn"});
                case 4:
                    return zzno;
                case 5:
                    zzhq<zzf> zzhqVar = zzbf;
                    if (zzhqVar == null) {
                        synchronized (zzf.class) {
                            zzhqVar = zzbf;
                            if (zzhqVar == null) {
                                zzhqVar = new zzfy.zzb<>(zzno);
                                zzbf = zzhqVar;
                            }
                        }
                    }
                    return zzhqVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzg extends zzfy<zzg, zza> implements zzhh {
        private static volatile zzhq<zzg> zzbf;
        private static final zzg zznu;
        private int zzbg;
        private long zzmv;
        private long zzmw;

        /* loaded from: classes3.dex */
        public static final class zza extends zzfy.zza<zzg, zza> implements zzhh {
            private zza() {
                super(zzg.zznu);
            }

            /* synthetic */ zza(zzda zzdaVar) {
                this();
            }
        }

        static {
            zzg zzgVar = new zzg();
            zznu = zzgVar;
            zzfy.zza(zzg.class, zzgVar);
        }

        private zzg() {
        }

        public static zzhq<zzg> zzbx() {
            return (zzhq) zznu.zza(zzfy.zzg.zzxd, (Object) null, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i11, Object obj, Object obj2) {
            switch (zzda.zzbc[i11 - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zznu, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001", new Object[]{"zzbg", "zzmv", "zzmw"});
                case 4:
                    return zznu;
                case 5:
                    zzhq<zzg> zzhqVar = zzbf;
                    if (zzhqVar == null) {
                        synchronized (zzg.class) {
                            zzhqVar = zzbf;
                            if (zzhqVar == null) {
                                zzhqVar = new zzfy.zzb<>(zznu);
                                zzbf = zzhqVar;
                            }
                        }
                    }
                    return zzhqVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzh extends zzfy<zzh, zza> implements zzhh {
        private static volatile zzhq<zzh> zzbf;
        private static final zzh zznx;
        private int zzbg;
        private int zznv;
        private int zznw;

        /* loaded from: classes3.dex */
        public static final class zza extends zzfy.zza<zzh, zza> implements zzhh {
            private zza() {
                super(zzh.zznx);
            }

            /* synthetic */ zza(zzda zzdaVar) {
                this();
            }
        }

        static {
            zzh zzhVar = new zzh();
            zznx = zzhVar;
            zzfy.zza(zzh.class, zzhVar);
        }

        private zzh() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i11, Object obj, Object obj2) {
            switch (zzda.zzbc[i11 - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zznx, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"zzbg", "zznv", "zznw"});
                case 4:
                    return zznx;
                case 5:
                    zzhq<zzh> zzhqVar = zzbf;
                    if (zzhqVar == null) {
                        synchronized (zzh.class) {
                            zzhqVar = zzbf;
                            if (zzhqVar == null) {
                                zzhqVar = new zzfy.zzb<>(zznx);
                                zzbf = zzhqVar;
                            }
                        }
                    }
                    return zzhqVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzi extends zzfy<zzi, zza> implements zzhh {
        private static volatile zzhq<zzi> zzbf;
        private static final zzi zzoc;
        private int zzbg;
        private zzb zzny;
        private int zznz;
        private zze zzoa;
        private zza zzob;

        /* loaded from: classes3.dex */
        public static final class zza extends zzfy.zza<zzi, zza> implements zzhh {
            private zza() {
                super(zzi.zzoc);
            }

            /* synthetic */ zza(zzda zzdaVar) {
                this();
            }
        }

        static {
            zzi zziVar = new zzi();
            zzoc = zziVar;
            zzfy.zza(zzi.class, zziVar);
        }

        private zzi() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.vision.zzfy
        public final Object zza(int i11, Object obj, Object obj2) {
            switch (zzda.zzbc[i11 - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza(null);
                case 3:
                    return zzfy.zza(zzoc, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\u0004\u0001\u0010\t\u0002\u0011\t\u0003", new Object[]{"zzbg", "zzny", "zznz", "zzoa", "zzob"});
                case 4:
                    return zzoc;
                case 5:
                    zzhq<zzi> zzhqVar = zzbf;
                    if (zzhqVar == null) {
                        synchronized (zzi.class) {
                            zzhqVar = zzbf;
                            if (zzhqVar == null) {
                                zzhqVar = new zzfy.zzb<>(zzoc);
                                zzbf = zzhqVar;
                            }
                        }
                    }
                    return zzhqVar;
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