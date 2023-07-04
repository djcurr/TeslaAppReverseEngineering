package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfd {
    private static final Logger logger = Logger.getLogger(zzfd.class.getName());
    private static final Class<?> zzfb;
    private static final boolean zzfy;
    private static final Unsafe zzmh;
    private static final boolean zzpg;
    private static final boolean zzph;
    private static final zzd zzpi;
    private static final boolean zzpj;
    private static final long zzpk;
    private static final long zzpl;
    private static final long zzpm;
    private static final long zzpn;
    private static final long zzpo;
    private static final long zzpp;
    private static final long zzpq;
    private static final long zzpr;
    private static final long zzps;
    private static final long zzpt;
    private static final long zzpu;
    private static final long zzpv;
    private static final long zzpw;
    private static final long zzpx;
    private static final long zzpy;
    private static final boolean zzpz;

    /* loaded from: classes3.dex */
    static final class zza extends zzd {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(long j11, byte b11) {
            Memory.pokeByte((int) (j11 & (-1)), b11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(Object obj, long j11, double d11) {
            zza(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(Object obj, long j11, float f11) {
            zza(obj, j11, Float.floatToIntBits(f11));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(Object obj, long j11, boolean z11) {
            if (zzfd.zzpz) {
                zzfd.zzb(obj, j11, z11);
            } else {
                zzfd.zzc(obj, j11, z11);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(byte[] bArr, long j11, long j12, long j13) {
            Memory.pokeByteArray((int) (j12 & (-1)), bArr, (int) j11, (int) j13);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zze(Object obj, long j11, byte b11) {
            if (zzfd.zzpz) {
                zzfd.zza(obj, j11, b11);
            } else {
                zzfd.zzb(obj, j11, b11);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final boolean zzl(Object obj, long j11) {
            return zzfd.zzpz ? zzfd.zzr(obj, j11) : zzfd.zzs(obj, j11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final float zzm(Object obj, long j11) {
            return Float.intBitsToFloat(zzj(obj, j11));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final double zzn(Object obj, long j11) {
            return Double.longBitsToDouble(zzk(obj, j11));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final byte zzx(Object obj, long j11) {
            return zzfd.zzpz ? zzfd.zzp(obj, j11) : zzfd.zzq(obj, j11);
        }
    }

    /* loaded from: classes3.dex */
    static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(long j11, byte b11) {
            Memory.pokeByte(j11, b11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(Object obj, long j11, double d11) {
            zza(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(Object obj, long j11, float f11) {
            zza(obj, j11, Float.floatToIntBits(f11));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(Object obj, long j11, boolean z11) {
            if (zzfd.zzpz) {
                zzfd.zzb(obj, j11, z11);
            } else {
                zzfd.zzc(obj, j11, z11);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(byte[] bArr, long j11, long j12, long j13) {
            Memory.pokeByteArray(j12, bArr, (int) j11, (int) j13);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zze(Object obj, long j11, byte b11) {
            if (zzfd.zzpz) {
                zzfd.zza(obj, j11, b11);
            } else {
                zzfd.zzb(obj, j11, b11);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final boolean zzl(Object obj, long j11) {
            return zzfd.zzpz ? zzfd.zzr(obj, j11) : zzfd.zzs(obj, j11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final float zzm(Object obj, long j11) {
            return Float.intBitsToFloat(zzj(obj, j11));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final double zzn(Object obj, long j11) {
            return Double.longBitsToDouble(zzk(obj, j11));
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final byte zzx(Object obj, long j11) {
            return zzfd.zzpz ? zzfd.zzp(obj, j11) : zzfd.zzq(obj, j11);
        }
    }

    /* loaded from: classes3.dex */
    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(long j11, byte b11) {
            this.zzqa.putByte(j11, b11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(Object obj, long j11, double d11) {
            this.zzqa.putDouble(obj, j11, d11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(Object obj, long j11, float f11) {
            this.zzqa.putFloat(obj, j11, f11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(Object obj, long j11, boolean z11) {
            this.zzqa.putBoolean(obj, j11, z11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zza(byte[] bArr, long j11, long j12, long j13) {
            this.zzqa.copyMemory(bArr, zzfd.zzpk + j11, (Object) null, j12, j13);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final void zze(Object obj, long j11, byte b11) {
            this.zzqa.putByte(obj, j11, b11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final boolean zzl(Object obj, long j11) {
            return this.zzqa.getBoolean(obj, j11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final float zzm(Object obj, long j11) {
            return this.zzqa.getFloat(obj, j11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final double zzn(Object obj, long j11) {
            return this.zzqa.getDouble(obj, j11);
        }

        @Override // com.google.android.gms.internal.clearcut.zzfd.zzd
        public final byte zzx(Object obj, long j11) {
            return this.zzqa.getByte(obj, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class zzd {
        Unsafe zzqa;

        zzd(Unsafe unsafe) {
            this.zzqa = unsafe;
        }

        public final long zza(Field field) {
            return this.zzqa.objectFieldOffset(field);
        }

        public abstract void zza(long j11, byte b11);

        public abstract void zza(Object obj, long j11, double d11);

        public abstract void zza(Object obj, long j11, float f11);

        public final void zza(Object obj, long j11, int i11) {
            this.zzqa.putInt(obj, j11, i11);
        }

        public final void zza(Object obj, long j11, long j12) {
            this.zzqa.putLong(obj, j11, j12);
        }

        public abstract void zza(Object obj, long j11, boolean z11);

        public abstract void zza(byte[] bArr, long j11, long j12, long j13);

        public abstract void zze(Object obj, long j11, byte b11);

        public final int zzj(Object obj, long j11) {
            return this.zzqa.getInt(obj, j11);
        }

        public final long zzk(Object obj, long j11) {
            return this.zzqa.getLong(obj, j11);
        }

        public abstract boolean zzl(Object obj, long j11);

        public abstract float zzm(Object obj, long j11);

        public abstract double zzn(Object obj, long j11);

        public abstract byte zzx(Object obj, long j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ec  */
    static {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzfd.<clinit>():void");
    }

    private zzfd() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte zza(byte[] bArr, long j11) {
        return zzpi.zzx(bArr, zzpk + j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zza(Field field) {
        return zzpi.zza(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(long j11, byte b11) {
        zzpi.zza(j11, b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int zzj = zzj(obj, j12);
        int i11 = ((~((int) j11)) & 3) << 3;
        zza(obj, j12, ((255 & b11) << i11) | (zzj & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j11, double d11) {
        zzpi.zza(obj, j11, d11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j11, float f11) {
        zzpi.zza(obj, j11, f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j11, int i11) {
        zzpi.zza(obj, j11, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j11, long j12) {
        zzpi.zza(obj, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j11, Object obj2) {
        zzpi.zzqa.putObject(obj, j11, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j11, boolean z11) {
        zzpi.zza(obj, j11, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(byte[] bArr, long j11, byte b11) {
        zzpi.zze(bArr, zzpk + j11, b11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(byte[] bArr, long j11, long j12, long j13) {
        zzpi.zza(bArr, j11, j12, j13);
    }

    private static long zzb(Field field) {
        zzd zzdVar;
        if (field == null || (zzdVar = zzpi) == null) {
            return -1L;
        }
        return zzdVar.zza(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzb(ByteBuffer byteBuffer) {
        return zzpi.zzk(byteBuffer, zzpx);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        zza(obj, j12, ((255 & b11) << i11) | (zzj(obj, j12) & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(Object obj, long j11, boolean z11) {
        zza(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j11, boolean z11) {
        zzb(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzed() {
        return zzfy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzee() {
        return zzpj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe zzef() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzfe());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzeg() {
        Unsafe unsafe = zzmh;
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
            if (zzaw.zzx()) {
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

    private static boolean zzeh() {
        Unsafe unsafe = zzmh;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (zzei() == null) {
                return false;
            }
            if (zzaw.zzx()) {
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

    private static Field zzei() {
        Field zzb2;
        if (!zzaw.zzx() || (zzb2 = zzb(Buffer.class, "effectiveDirectAddress")) == null) {
            Field zzb3 = zzb(Buffer.class, "address");
            if (zzb3 == null || zzb3.getType() != Long.TYPE) {
                return null;
            }
            return zzb3;
        }
        return zzb2;
    }

    private static int zzg(Class<?> cls) {
        if (zzfy) {
            return zzpi.zzqa.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzh(Class<?> cls) {
        if (zzfy) {
            return zzpi.zzqa.arrayIndexScale(cls);
        }
        return -1;
    }

    private static boolean zzi(Class<?> cls) {
        if (zzaw.zzx()) {
            try {
                Class<?> cls2 = zzfb;
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
    public static int zzj(Object obj, long j11) {
        return zzpi.zzj(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzk(Object obj, long j11) {
        return zzpi.zzk(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzl(Object obj, long j11) {
        return zzpi.zzl(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzm(Object obj, long j11) {
        return zzpi.zzm(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zzn(Object obj, long j11) {
        return zzpi.zzn(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzo(Object obj, long j11) {
        return zzpi.zzqa.getObject(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzp(Object obj, long j11) {
        return (byte) (zzj(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzq(Object obj, long j11) {
        return (byte) (zzj(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzr(Object obj, long j11) {
        return zzp(obj, j11) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzs(Object obj, long j11) {
        return zzq(obj, j11) != 0;
    }
}