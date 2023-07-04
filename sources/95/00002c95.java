package com.google.android.gms.internal.vision;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zziu {
    private static final Logger logger = Logger.getLogger(zziu.class.getName());
    private static final boolean zzaaz;
    private static final boolean zzaba;
    private static final zzd zzabb;
    private static final boolean zzabc;
    private static final long zzabd;
    private static final long zzabe;
    private static final long zzabf;
    private static final long zzabg;
    private static final long zzabh;
    private static final long zzabi;
    private static final long zzabj;
    private static final long zzabk;
    private static final long zzabl;
    private static final long zzabm;
    private static final long zzabn;
    private static final long zzabo;
    private static final long zzabp;
    private static final long zzabq;
    private static final boolean zzabr;
    private static final Class<?> zzrm;
    private static final boolean zzsr;
    private static final Unsafe zzzc;

    /* loaded from: classes3.dex */
    static final class zza extends zzd {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final void zza(long j11, byte b11) {
            Memory.pokeByte((int) (j11 & (-1)), b11);
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final void zze(Object obj, long j11, byte b11) {
            if (!zziu.zzabr) {
                zziu.zzb(obj, j11, b11);
            } else {
                zziu.zza(obj, j11, b11);
            }
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final boolean zzm(Object obj, long j11) {
            return zziu.zzabr ? zziu.zzs(obj, j11) : zziu.zzt(obj, j11);
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final float zzn(Object obj, long j11) {
            return Float.intBitsToFloat(zzk(obj, j11));
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final double zzo(Object obj, long j11) {
            return Double.longBitsToDouble(zzl(obj, j11));
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final byte zzy(Object obj, long j11) {
            return zziu.zzabr ? zziu.zzq(obj, j11) : zziu.zzr(obj, j11);
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final void zza(Object obj, long j11, boolean z11) {
            if (!zziu.zzabr) {
                zziu.zzc(obj, j11, z11);
            } else {
                zziu.zzb(obj, j11, z11);
            }
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final void zza(Object obj, long j11, float f11) {
            zzb(obj, j11, Float.floatToIntBits(f11));
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final void zza(Object obj, long j11, double d11) {
            zza(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final void zza(byte[] bArr, long j11, long j12, long j13) {
            Memory.pokeByteArray((int) (j12 & (-1)), bArr, (int) j11, (int) j13);
        }
    }

    /* loaded from: classes3.dex */
    static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final void zza(long j11, byte b11) {
            Memory.pokeByte(j11, b11);
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final void zze(Object obj, long j11, byte b11) {
            if (!zziu.zzabr) {
                zziu.zzb(obj, j11, b11);
            } else {
                zziu.zza(obj, j11, b11);
            }
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final boolean zzm(Object obj, long j11) {
            return zziu.zzabr ? zziu.zzs(obj, j11) : zziu.zzt(obj, j11);
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final float zzn(Object obj, long j11) {
            return Float.intBitsToFloat(zzk(obj, j11));
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final double zzo(Object obj, long j11) {
            return Double.longBitsToDouble(zzl(obj, j11));
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final byte zzy(Object obj, long j11) {
            return zziu.zzabr ? zziu.zzq(obj, j11) : zziu.zzr(obj, j11);
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final void zza(Object obj, long j11, boolean z11) {
            if (!zziu.zzabr) {
                zziu.zzc(obj, j11, z11);
            } else {
                zziu.zzb(obj, j11, z11);
            }
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final void zza(Object obj, long j11, float f11) {
            zzb(obj, j11, Float.floatToIntBits(f11));
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final void zza(Object obj, long j11, double d11) {
            zza(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final void zza(byte[] bArr, long j11, long j12, long j13) {
            Memory.pokeByteArray(j12, bArr, (int) j11, (int) j13);
        }
    }

    /* loaded from: classes3.dex */
    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final void zza(long j11, byte b11) {
            this.zzabs.putByte(j11, b11);
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final void zze(Object obj, long j11, byte b11) {
            this.zzabs.putByte(obj, j11, b11);
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final boolean zzm(Object obj, long j11) {
            return this.zzabs.getBoolean(obj, j11);
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final float zzn(Object obj, long j11) {
            return this.zzabs.getFloat(obj, j11);
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final double zzo(Object obj, long j11) {
            return this.zzabs.getDouble(obj, j11);
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final byte zzy(Object obj, long j11) {
            return this.zzabs.getByte(obj, j11);
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final void zza(Object obj, long j11, boolean z11) {
            this.zzabs.putBoolean(obj, j11, z11);
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final void zza(Object obj, long j11, float f11) {
            this.zzabs.putFloat(obj, j11, f11);
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final void zza(Object obj, long j11, double d11) {
            this.zzabs.putDouble(obj, j11, d11);
        }

        @Override // com.google.android.gms.internal.vision.zziu.zzd
        public final void zza(byte[] bArr, long j11, long j12, long j13) {
            this.zzabs.copyMemory(bArr, zziu.zzabd + j11, (Object) null, j12, j13);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class zzd {
        Unsafe zzabs;

        zzd(Unsafe unsafe) {
            this.zzabs = unsafe;
        }

        public abstract void zza(long j11, byte b11);

        public abstract void zza(Object obj, long j11, double d11);

        public abstract void zza(Object obj, long j11, float f11);

        public final void zza(Object obj, long j11, long j12) {
            this.zzabs.putLong(obj, j11, j12);
        }

        public abstract void zza(Object obj, long j11, boolean z11);

        public abstract void zza(byte[] bArr, long j11, long j12, long j13);

        public final void zzb(Object obj, long j11, int i11) {
            this.zzabs.putInt(obj, j11, i11);
        }

        public abstract void zze(Object obj, long j11, byte b11);

        public final int zzk(Object obj, long j11) {
            return this.zzabs.getInt(obj, j11);
        }

        public final long zzl(Object obj, long j11) {
            return this.zzabs.getLong(obj, j11);
        }

        public abstract boolean zzm(Object obj, long j11);

        public abstract float zzn(Object obj, long j11);

        public abstract double zzo(Object obj, long j11);

        public abstract byte zzy(Object obj, long j11);
    }

    static {
        Unsafe zzhj = zzhj();
        zzzc = zzhj;
        zzrm = zzeg.zzcl();
        boolean zzk = zzk(Long.TYPE);
        zzaaz = zzk;
        boolean zzk2 = zzk(Integer.TYPE);
        zzaba = zzk2;
        zzd zzdVar = null;
        if (zzhj != null) {
            if (!zzeg.zzck()) {
                zzdVar = new zzc(zzhj);
            } else if (zzk) {
                zzdVar = new zzb(zzhj);
            } else if (zzk2) {
                zzdVar = new zza(zzhj);
            }
        }
        zzabb = zzdVar;
        zzabc = zzhl();
        zzsr = zzhk();
        zzabd = zzi(byte[].class);
        zzabe = zzi(boolean[].class);
        zzabf = zzj(boolean[].class);
        zzabg = zzi(int[].class);
        zzabh = zzj(int[].class);
        zzabi = zzi(long[].class);
        zzabj = zzj(long[].class);
        zzabk = zzi(float[].class);
        zzabl = zzj(float[].class);
        zzabm = zzi(double[].class);
        zzabn = zzj(double[].class);
        zzabo = zzi(Object[].class);
        zzabp = zzj(Object[].class);
        Field zzhm = zzhm();
        zzabq = (zzhm == null || zzdVar == null) ? -1L : zzdVar.zzabs.objectFieldOffset(zzhm);
        zzabr = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zziu() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j11, long j12) {
        zzabb.zza(obj, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(Object obj, long j11, int i11) {
        zzabb.zzb(obj, j11, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j11, boolean z11) {
        zzb(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T zzh(Class<T> cls) {
        try {
            return (T) zzzc.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzhh() {
        return zzsr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzhi() {
        return zzabc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe zzhj() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zziv());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzhk() {
        Unsafe unsafe = zzzc;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (zzeg.zzck()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th2);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 71);
            sb2.append("platform method missing - proto runtime falling back to safer methods: ");
            sb2.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb2.toString());
            return false;
        }
    }

    private static boolean zzhl() {
        Unsafe unsafe = zzzc;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (zzhm() == null) {
                return false;
            }
            if (zzeg.zzck()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th2) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th2);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 71);
            sb2.append("platform method missing - proto runtime falling back to safer methods: ");
            sb2.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb2.toString());
            return false;
        }
    }

    private static Field zzhm() {
        Field zzb2;
        if (!zzeg.zzck() || (zzb2 = zzb(Buffer.class, "effectiveDirectAddress")) == null) {
            Field zzb3 = zzb(Buffer.class, "address");
            if (zzb3 == null || zzb3.getType() != Long.TYPE) {
                return null;
            }
            return zzb3;
        }
        return zzb2;
    }

    private static int zzi(Class<?> cls) {
        if (zzsr) {
            return zzabb.zzabs.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzj(Class<?> cls) {
        if (zzsr) {
            return zzabb.zzabs.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(Object obj, long j11) {
        return zzabb.zzk(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzl(Object obj, long j11) {
        return zzabb.zzl(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzm(Object obj, long j11) {
        return zzabb.zzm(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzn(Object obj, long j11) {
        return zzabb.zzn(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zzo(Object obj, long j11) {
        return zzabb.zzo(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzp(Object obj, long j11) {
        return zzabb.zzabs.getObject(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzq(Object obj, long j11) {
        return (byte) (zzk(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzr(Object obj, long j11) {
        return (byte) (zzk(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzs(Object obj, long j11) {
        return zzq(obj, j11) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzt(Object obj, long j11) {
        return zzr(obj, j11) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j11, boolean z11) {
        zzabb.zza(obj, j11, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzb(ByteBuffer byteBuffer) {
        return zzabb.zzl(byteBuffer, zzabq);
    }

    private static boolean zzk(Class<?> cls) {
        if (zzeg.zzck()) {
            try {
                Class<?> cls2 = zzrm;
                Class<?> cls3 = Boolean.TYPE;
                cls2.getMethod("peekLong", cls, cls3);
                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
                Class<?> cls4 = Integer.TYPE;
                cls2.getMethod("pokeInt", cls, cls4, cls3);
                cls2.getMethod("peekInt", cls, cls3);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j11, float f11) {
        zzabb.zza(obj, j11, f11);
    }

    private static Field zzb(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j11, double d11) {
        zzabb.zza(obj, j11, d11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j11, Object obj2) {
        zzabb.zzabs.putObject(obj, j11, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        zzb(obj, j12, ((255 & b11) << i11) | (zzk(obj, j12) & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte zza(byte[] bArr, long j11) {
        return zzabb.zzy(bArr, zzabd + j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(Object obj, long j11, boolean z11) {
        zza(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(byte[] bArr, long j11, byte b11) {
        zzabb.zze(bArr, zzabd + j11, b11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(byte[] bArr, long j11, long j12, long j13) {
        zzabb.zza(bArr, j11, j12, j13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(long j11, byte b11) {
        zzabb.zza(j11, b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int zzk = zzk(obj, j12);
        int i11 = ((~((int) j11)) & 3) << 3;
        zzb(obj, j12, ((255 & b11) << i11) | (zzk & (~(255 << i11))));
    }
}