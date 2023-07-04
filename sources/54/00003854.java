package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class p1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f16364a = Logger.getLogger(p1.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final Unsafe f16365b = B();

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f16366c = com.google.crypto.tink.shaded.protobuf.d.b();

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f16367d = m(Long.TYPE);

    /* renamed from: e  reason: collision with root package name */
    private static final boolean f16368e = m(Integer.TYPE);

    /* renamed from: f  reason: collision with root package name */
    private static final e f16369f = z();

    /* renamed from: g  reason: collision with root package name */
    private static final boolean f16370g = Q();

    /* renamed from: h  reason: collision with root package name */
    private static final boolean f16371h = P();

    /* renamed from: i  reason: collision with root package name */
    static final long f16372i = j(byte[].class);

    /* renamed from: j  reason: collision with root package name */
    static final boolean f16373j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Unsafe run() {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public boolean c(Object obj, long j11) {
            return p1.f16373j ? p1.q(obj, j11) : p1.r(obj, j11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public byte d(Object obj, long j11) {
            return p1.f16373j ? p1.t(obj, j11) : p1.u(obj, j11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public double e(Object obj, long j11) {
            return Double.longBitsToDouble(h(obj, j11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public float f(Object obj, long j11) {
            return Float.intBitsToFloat(g(obj, j11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public void k(Object obj, long j11, boolean z11) {
            if (p1.f16373j) {
                p1.F(obj, j11, z11);
            } else {
                p1.G(obj, j11, z11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public void l(Object obj, long j11, byte b11) {
            if (p1.f16373j) {
                p1.I(obj, j11, b11);
            } else {
                p1.J(obj, j11, b11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public void m(Object obj, long j11, double d11) {
            p(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public void n(Object obj, long j11, float f11) {
            o(obj, j11, Float.floatToIntBits(f11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public boolean c(Object obj, long j11) {
            return p1.f16373j ? p1.q(obj, j11) : p1.r(obj, j11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public byte d(Object obj, long j11) {
            return p1.f16373j ? p1.t(obj, j11) : p1.u(obj, j11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public double e(Object obj, long j11) {
            return Double.longBitsToDouble(h(obj, j11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public float f(Object obj, long j11) {
            return Float.intBitsToFloat(g(obj, j11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public void k(Object obj, long j11, boolean z11) {
            if (p1.f16373j) {
                p1.F(obj, j11, z11);
            } else {
                p1.G(obj, j11, z11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public void l(Object obj, long j11, byte b11) {
            if (p1.f16373j) {
                p1.I(obj, j11, b11);
            } else {
                p1.J(obj, j11, b11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public void m(Object obj, long j11, double d11) {
            p(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public void n(Object obj, long j11, float f11) {
            o(obj, j11, Float.floatToIntBits(f11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public boolean c(Object obj, long j11) {
            return this.f16374a.getBoolean(obj, j11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public byte d(Object obj, long j11) {
            return this.f16374a.getByte(obj, j11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public double e(Object obj, long j11) {
            return this.f16374a.getDouble(obj, j11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public float f(Object obj, long j11) {
            return this.f16374a.getFloat(obj, j11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public void k(Object obj, long j11, boolean z11) {
            this.f16374a.putBoolean(obj, j11, z11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public void l(Object obj, long j11, byte b11) {
            this.f16374a.putByte(obj, j11, b11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public void m(Object obj, long j11, double d11) {
            this.f16374a.putDouble(obj, j11, d11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p1.e
        public void n(Object obj, long j11, float f11) {
            this.f16374a.putFloat(obj, j11, f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        Unsafe f16374a;

        e(Unsafe unsafe) {
            this.f16374a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f16374a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f16374a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j11);

        public abstract byte d(Object obj, long j11);

        public abstract double e(Object obj, long j11);

        public abstract float f(Object obj, long j11);

        public final int g(Object obj, long j11) {
            return this.f16374a.getInt(obj, j11);
        }

        public final long h(Object obj, long j11) {
            return this.f16374a.getLong(obj, j11);
        }

        public final Object i(Object obj, long j11) {
            return this.f16374a.getObject(obj, j11);
        }

        public final long j(Field field) {
            return this.f16374a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j11, boolean z11);

        public abstract void l(Object obj, long j11, byte b11);

        public abstract void m(Object obj, long j11, double d11);

        public abstract void n(Object obj, long j11, float f11);

        public final void o(Object obj, long j11, int i11) {
            this.f16374a.putInt(obj, j11, i11);
        }

        public final void p(Object obj, long j11, long j12) {
            this.f16374a.putLong(obj, j11, j12);
        }

        public final void q(Object obj, long j11, Object obj2) {
            this.f16374a.putObject(obj, j11, obj2);
        }
    }

    static {
        j(boolean[].class);
        k(boolean[].class);
        j(int[].class);
        k(int[].class);
        j(long[].class);
        k(long[].class);
        j(float[].class);
        k(float[].class);
        j(double[].class);
        k(double[].class);
        j(Object[].class);
        k(Object[].class);
        o(l());
        f16373j = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private p1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object A(Object obj, long j11) {
        return f16369f.i(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean C() {
        return f16371h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean D() {
        return f16370g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void E(Object obj, long j11, boolean z11) {
        f16369f.k(obj, j11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void F(Object obj, long j11, boolean z11) {
        I(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G(Object obj, long j11, boolean z11) {
        J(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void H(byte[] bArr, long j11, byte b11) {
        f16369f.l(bArr, f16372i + j11, b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void I(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int x11 = x(obj, j12);
        int i11 = ((~((int) j11)) & 3) << 3;
        M(obj, j12, ((255 & b11) << i11) | (x11 & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void J(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        M(obj, j12, ((255 & b11) << i11) | (x(obj, j12) & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void K(Object obj, long j11, double d11) {
        f16369f.m(obj, j11, d11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void L(Object obj, long j11, float f11) {
        f16369f.n(obj, j11, f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void M(Object obj, long j11, int i11) {
        f16369f.o(obj, j11, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void N(Object obj, long j11, long j12) {
        f16369f.p(obj, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void O(Object obj, long j11, Object obj2) {
        f16369f.q(obj, j11, obj2);
    }

    private static boolean P() {
        Unsafe unsafe = f16365b;
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
            if (com.google.crypto.tink.shaded.protobuf.d.c()) {
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
            Logger logger = f16364a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    private static boolean Q() {
        Unsafe unsafe = f16365b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (l() == null) {
                return false;
            }
            if (com.google.crypto.tink.shaded.protobuf.d.c()) {
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
            Logger logger = f16364a;
            Level level = Level.WARNING;
            logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T i(Class<T> cls) {
        try {
            return (T) f16365b.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static int j(Class<?> cls) {
        if (f16371h) {
            return f16369f.a(cls);
        }
        return -1;
    }

    private static int k(Class<?> cls) {
        if (f16371h) {
            return f16369f.b(cls);
        }
        return -1;
    }

    private static Field l() {
        Field n11;
        if (!com.google.crypto.tink.shaded.protobuf.d.c() || (n11 = n(Buffer.class, "effectiveDirectAddress")) == null) {
            Field n12 = n(Buffer.class, "address");
            if (n12 == null || n12.getType() != Long.TYPE) {
                return null;
            }
            return n12;
        }
        return n11;
    }

    private static boolean m(Class<?> cls) {
        if (com.google.crypto.tink.shaded.protobuf.d.c()) {
            try {
                Class<?> cls2 = f16366c;
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

    private static Field n(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f16369f) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean p(Object obj, long j11) {
        return f16369f.c(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(Object obj, long j11) {
        return t(obj, j11) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(Object obj, long j11) {
        return u(obj, j11) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte s(byte[] bArr, long j11) {
        return f16369f.d(bArr, f16372i + j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte t(Object obj, long j11) {
        return (byte) ((x(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte u(Object obj, long j11) {
        return (byte) ((x(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double v(Object obj, long j11) {
        return f16369f.e(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float w(Object obj, long j11) {
        return f16369f.f(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(Object obj, long j11) {
        return f16369f.g(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long y(Object obj, long j11) {
        return f16369f.h(obj, j11);
    }

    private static e z() {
        Unsafe unsafe = f16365b;
        if (unsafe == null) {
            return null;
        }
        if (com.google.crypto.tink.shaded.protobuf.d.c()) {
            if (f16367d) {
                return new c(unsafe);
            }
            if (f16368e) {
                return new b(unsafe);
            }
            return null;
        }
        return new d(unsafe);
    }
}