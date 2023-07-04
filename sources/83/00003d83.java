package com.google.protobuf;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class UnsafeUtil {
    private static final long BOOLEAN_ARRAY_BASE_OFFSET;
    private static final long BOOLEAN_ARRAY_INDEX_SCALE;
    private static final long BUFFER_ADDRESS_OFFSET;
    private static final int BYTE_ARRAY_ALIGNMENT;
    static final long BYTE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_BASE_OFFSET;
    private static final long DOUBLE_ARRAY_INDEX_SCALE;
    private static final long FLOAT_ARRAY_BASE_OFFSET;
    private static final long FLOAT_ARRAY_INDEX_SCALE;
    private static final long INT_ARRAY_BASE_OFFSET;
    private static final long INT_ARRAY_INDEX_SCALE;
    static final boolean IS_BIG_ENDIAN;
    private static final long LONG_ARRAY_BASE_OFFSET;
    private static final long LONG_ARRAY_INDEX_SCALE;
    private static final long OBJECT_ARRAY_BASE_OFFSET;
    private static final long OBJECT_ARRAY_INDEX_SCALE;
    private static final int STRIDE = 8;
    private static final int STRIDE_ALIGNMENT_MASK = 7;
    private static final Unsafe UNSAFE = getUnsafe();
    private static final Class<?> MEMORY_CLASS = Android.getMemoryClass();
    private static final boolean IS_ANDROID_64 = determineAndroidSupportByAddressSize(Long.TYPE);
    private static final boolean IS_ANDROID_32 = determineAndroidSupportByAddressSize(Integer.TYPE);
    private static final MemoryAccessor MEMORY_ACCESSOR = getMemoryAccessor();
    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = supportsUnsafeByteBufferOperations();
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = supportsUnsafeArrayOperations();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class Android32MemoryAccessor extends MemoryAccessor {
        private static final long SMALL_ADDRESS_MASK = -1;

        Android32MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        private static int smallAddress(long j11) {
            return (int) (j11 & (-1));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long j11, byte[] bArr, long j12, long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object obj, long j11) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getBooleanBigEndian(obj, j11) : UnsafeUtil.getBooleanLittleEndian(obj, j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object obj, long j11) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getByteBigEndian(obj, j11) : UnsafeUtil.getByteLittleEndian(obj, j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object obj, long j11) {
            return Double.longBitsToDouble(getLong(obj, j11));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object obj, long j11) {
            return Float.intBitsToFloat(getInt(obj, j11));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object obj, long j11, boolean z11) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putBooleanBigEndian(obj, j11, z11);
            } else {
                UnsafeUtil.putBooleanLittleEndian(obj, j11, z11);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object obj, long j11, byte b11) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putByteBigEndian(obj, j11, b11);
            } else {
                UnsafeUtil.putByteLittleEndian(obj, j11, b11);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object obj, long j11, double d11) {
            putLong(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object obj, long j11, float f11) {
            putInt(obj, j11, Float.floatToIntBits(f11));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long j11, int i11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] bArr, long j11, long j12, long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long j11, byte b11) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class Android64MemoryAccessor extends MemoryAccessor {
        Android64MemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long j11, byte[] bArr, long j12, long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object obj, long j11) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getBooleanBigEndian(obj, j11) : UnsafeUtil.getBooleanLittleEndian(obj, j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object obj, long j11) {
            return UnsafeUtil.IS_BIG_ENDIAN ? UnsafeUtil.getByteBigEndian(obj, j11) : UnsafeUtil.getByteLittleEndian(obj, j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object obj, long j11) {
            return Double.longBitsToDouble(getLong(obj, j11));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object obj, long j11) {
            return Float.intBitsToFloat(getInt(obj, j11));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field field) {
            try {
                return field.get(null);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object obj, long j11, boolean z11) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putBooleanBigEndian(obj, j11, z11);
            } else {
                UnsafeUtil.putBooleanLittleEndian(obj, j11, z11);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object obj, long j11, byte b11) {
            if (UnsafeUtil.IS_BIG_ENDIAN) {
                UnsafeUtil.putByteBigEndian(obj, j11, b11);
            } else {
                UnsafeUtil.putByteLittleEndian(obj, j11, b11);
            }
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object obj, long j11, double d11) {
            putLong(obj, j11, Double.doubleToLongBits(d11));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object obj, long j11, float f11) {
            putInt(obj, j11, Float.floatToIntBits(f11));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long j11, int i11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long j11, long j12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
            return false;
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] bArr, long j11, long j12, long j13) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long j11) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long j11, byte b11) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class JvmMemoryAccessor extends MemoryAccessor {
        JvmMemoryAccessor(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(long j11, byte[] bArr, long j12, long j13) {
            this.unsafe.copyMemory((Object) null, j11, bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j12, j13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public boolean getBoolean(Object obj, long j11) {
            return this.unsafe.getBoolean(obj, j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(Object obj, long j11) {
            return this.unsafe.getByte(obj, j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public double getDouble(Object obj, long j11) {
            return this.unsafe.getDouble(obj, j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public float getFloat(Object obj, long j11) {
            return this.unsafe.getFloat(obj, j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public int getInt(long j11) {
            return this.unsafe.getInt(j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public long getLong(long j11) {
            return this.unsafe.getLong(j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public Object getStaticObject(java.lang.reflect.Field field) {
            return getObject(this.unsafe.staticFieldBase(field), this.unsafe.staticFieldOffset(field));
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putBoolean(Object obj, long j11, boolean z11) {
            this.unsafe.putBoolean(obj, j11, z11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(Object obj, long j11, byte b11) {
            this.unsafe.putByte(obj, j11, b11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putDouble(Object obj, long j11, double d11) {
            this.unsafe.putDouble(obj, j11, d11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putFloat(Object obj, long j11, float f11) {
            this.unsafe.putFloat(obj, j11, f11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putInt(long j11, int i11) {
            this.unsafe.putInt(j11, i11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putLong(long j11, long j12) {
            this.unsafe.putLong(j11, j12);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeArrayOperations() {
            if (super.supportsUnsafeArrayOperations()) {
                try {
                    Class<?> cls = this.unsafe.getClass();
                    Class<?> cls2 = Long.TYPE;
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
                    UnsafeUtil.logMissingMethod(th2);
                    return false;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public boolean supportsUnsafeByteBufferOperations() {
            if (super.supportsUnsafeByteBufferOperations()) {
                try {
                    Class<?> cls = this.unsafe.getClass();
                    Class<?> cls2 = Long.TYPE;
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
                    UnsafeUtil.logMissingMethod(th2);
                    return false;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void copyMemory(byte[] bArr, long j11, long j12, long j13) {
            this.unsafe.copyMemory(bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j11, (Object) null, j12, j13);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public byte getByte(long j11) {
            return this.unsafe.getByte(j11);
        }

        @Override // com.google.protobuf.UnsafeUtil.MemoryAccessor
        public void putByte(long j11, byte b11) {
            this.unsafe.putByte(j11, b11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static abstract class MemoryAccessor {
        Unsafe unsafe;

        MemoryAccessor(Unsafe unsafe) {
            this.unsafe = unsafe;
        }

        public final int arrayBaseOffset(Class<?> cls) {
            return this.unsafe.arrayBaseOffset(cls);
        }

        public final int arrayIndexScale(Class<?> cls) {
            return this.unsafe.arrayIndexScale(cls);
        }

        public abstract void copyMemory(long j11, byte[] bArr, long j12, long j13);

        public abstract void copyMemory(byte[] bArr, long j11, long j12, long j13);

        public abstract boolean getBoolean(Object obj, long j11);

        public abstract byte getByte(long j11);

        public abstract byte getByte(Object obj, long j11);

        public abstract double getDouble(Object obj, long j11);

        public abstract float getFloat(Object obj, long j11);

        public abstract int getInt(long j11);

        public final int getInt(Object obj, long j11) {
            return this.unsafe.getInt(obj, j11);
        }

        public abstract long getLong(long j11);

        public final long getLong(Object obj, long j11) {
            return this.unsafe.getLong(obj, j11);
        }

        public final Object getObject(Object obj, long j11) {
            return this.unsafe.getObject(obj, j11);
        }

        public abstract Object getStaticObject(java.lang.reflect.Field field);

        public final long objectFieldOffset(java.lang.reflect.Field field) {
            return this.unsafe.objectFieldOffset(field);
        }

        public abstract void putBoolean(Object obj, long j11, boolean z11);

        public abstract void putByte(long j11, byte b11);

        public abstract void putByte(Object obj, long j11, byte b11);

        public abstract void putDouble(Object obj, long j11, double d11);

        public abstract void putFloat(Object obj, long j11, float f11);

        public abstract void putInt(long j11, int i11);

        public final void putInt(Object obj, long j11, int i11) {
            this.unsafe.putInt(obj, j11, i11);
        }

        public abstract void putLong(long j11, long j12);

        public final void putLong(Object obj, long j11, long j12) {
            this.unsafe.putLong(obj, j11, j12);
        }

        public final void putObject(Object obj, long j11, Object obj2) {
            this.unsafe.putObject(obj, j11, obj2);
        }

        public boolean supportsUnsafeArrayOperations() {
            Unsafe unsafe = this.unsafe;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th2) {
                UnsafeUtil.logMissingMethod(th2);
                return false;
            }
        }

        public boolean supportsUnsafeByteBufferOperations() {
            Unsafe unsafe = this.unsafe;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return UnsafeUtil.access$100() != null;
            } catch (Throwable th2) {
                UnsafeUtil.logMissingMethod(th2);
                return false;
            }
        }
    }

    static {
        long arrayBaseOffset = arrayBaseOffset(byte[].class);
        BYTE_ARRAY_BASE_OFFSET = arrayBaseOffset;
        BOOLEAN_ARRAY_BASE_OFFSET = arrayBaseOffset(boolean[].class);
        BOOLEAN_ARRAY_INDEX_SCALE = arrayIndexScale(boolean[].class);
        INT_ARRAY_BASE_OFFSET = arrayBaseOffset(int[].class);
        INT_ARRAY_INDEX_SCALE = arrayIndexScale(int[].class);
        LONG_ARRAY_BASE_OFFSET = arrayBaseOffset(long[].class);
        LONG_ARRAY_INDEX_SCALE = arrayIndexScale(long[].class);
        FLOAT_ARRAY_BASE_OFFSET = arrayBaseOffset(float[].class);
        FLOAT_ARRAY_INDEX_SCALE = arrayIndexScale(float[].class);
        DOUBLE_ARRAY_BASE_OFFSET = arrayBaseOffset(double[].class);
        DOUBLE_ARRAY_INDEX_SCALE = arrayIndexScale(double[].class);
        OBJECT_ARRAY_BASE_OFFSET = arrayBaseOffset(Object[].class);
        OBJECT_ARRAY_INDEX_SCALE = arrayIndexScale(Object[].class);
        BUFFER_ADDRESS_OFFSET = fieldOffset(bufferAddressField());
        BYTE_ARRAY_ALIGNMENT = (int) (7 & arrayBaseOffset);
        IS_BIG_ENDIAN = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private UnsafeUtil() {
    }

    static /* synthetic */ java.lang.reflect.Field access$100() {
        return bufferAddressField();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long addressOffset(ByteBuffer byteBuffer) {
        return MEMORY_ACCESSOR.getLong(byteBuffer, BUFFER_ADDRESS_OFFSET);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T allocateInstance(Class<T> cls) {
        try {
            return (T) UNSAFE.allocateInstance(cls);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        }
    }

    private static int arrayBaseOffset(Class<?> cls) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int arrayIndexScale(Class<?> cls) {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return MEMORY_ACCESSOR.arrayIndexScale(cls);
        }
        return -1;
    }

    private static java.lang.reflect.Field bufferAddressField() {
        java.lang.reflect.Field field;
        if (!Android.isOnAndroidDevice() || (field = field(Buffer.class, "effectiveDirectAddress")) == null) {
            java.lang.reflect.Field field2 = field(Buffer.class, "address");
            if (field2 == null || field2.getType() != Long.TYPE) {
                return null;
            }
            return field2;
        }
        return field;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void copyMemory(byte[] bArr, long j11, long j12, long j13) {
        MEMORY_ACCESSOR.copyMemory(bArr, j11, j12, j13);
    }

    static boolean determineAndroidSupportByAddressSize(Class<?> cls) {
        if (Android.isOnAndroidDevice()) {
            try {
                Class<?> cls2 = MEMORY_CLASS;
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

    private static java.lang.reflect.Field field(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long fieldOffset(java.lang.reflect.Field field) {
        MemoryAccessor memoryAccessor;
        if (field == null || (memoryAccessor = MEMORY_ACCESSOR) == null) {
            return -1L;
        }
        return memoryAccessor.objectFieldOffset(field);
    }

    private static int firstDifferingByteIndexNativeEndian(long j11, long j12) {
        int numberOfTrailingZeros;
        if (IS_BIG_ENDIAN) {
            numberOfTrailingZeros = Long.numberOfLeadingZeros(j11 ^ j12);
        } else {
            numberOfTrailingZeros = Long.numberOfTrailingZeros(j11 ^ j12);
        }
        return numberOfTrailingZeros >> 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean getBoolean(Object obj, long j11) {
        return MEMORY_ACCESSOR.getBoolean(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanBigEndian(Object obj, long j11) {
        return getByteBigEndian(obj, j11) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getBooleanLittleEndian(Object obj, long j11) {
        return getByteLittleEndian(obj, j11) != 0;
    }

    static byte getByte(Object obj, long j11) {
        return MEMORY_ACCESSOR.getByte(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteBigEndian(Object obj, long j11) {
        return (byte) ((getInt(obj, (-4) & j11) >>> ((int) (((~j11) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte getByteLittleEndian(Object obj, long j11) {
        return (byte) ((getInt(obj, (-4) & j11) >>> ((int) ((j11 & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double getDouble(Object obj, long j11) {
        return MEMORY_ACCESSOR.getDouble(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float getFloat(Object obj, long j11) {
        return MEMORY_ACCESSOR.getFloat(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int getInt(Object obj, long j11) {
        return MEMORY_ACCESSOR.getInt(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long getLong(Object obj, long j11) {
        return MEMORY_ACCESSOR.getLong(obj, j11);
    }

    private static MemoryAccessor getMemoryAccessor() {
        Unsafe unsafe = UNSAFE;
        if (unsafe == null) {
            return null;
        }
        if (Android.isOnAndroidDevice()) {
            if (IS_ANDROID_64) {
                return new Android64MemoryAccessor(unsafe);
            }
            if (IS_ANDROID_32) {
                return new Android32MemoryAccessor(unsafe);
            }
            return null;
        }
        return new JvmMemoryAccessor(unsafe);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object getObject(Object obj, long j11) {
        return MEMORY_ACCESSOR.getObject(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object getStaticObject(java.lang.reflect.Field field) {
        return MEMORY_ACCESSOR.getStaticObject(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe getUnsafe() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.protobuf.UnsafeUtil.1
                @Override // java.security.PrivilegedExceptionAction
                public Unsafe run() {
                    java.lang.reflect.Field[] declaredFields;
                    for (java.lang.reflect.Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean hasUnsafeArrayOperations() {
        return HAS_UNSAFE_ARRAY_OPERATIONS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean hasUnsafeByteBufferOperations() {
        return HAS_UNSAFE_BYTEBUFFER_OPERATIONS;
    }

    static boolean isAndroid64() {
        return IS_ANDROID_64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void logMissingMethod(Throwable th2) {
        Logger logger = Logger.getLogger(UnsafeUtil.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    static int mismatch(byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        if (i11 >= 0 && i12 >= 0 && i13 >= 0 && i11 + i13 <= bArr.length && i12 + i13 <= bArr2.length) {
            int i14 = 0;
            if (HAS_UNSAFE_ARRAY_OPERATIONS) {
                for (int i15 = (BYTE_ARRAY_ALIGNMENT + i11) & 7; i14 < i13 && (i15 & 7) != 0; i15++) {
                    if (bArr[i11 + i14] != bArr2[i12 + i14]) {
                        return i14;
                    }
                    i14++;
                }
                int i16 = ((i13 - i14) & (-8)) + i14;
                while (i14 < i16) {
                    long j11 = BYTE_ARRAY_BASE_OFFSET;
                    long j12 = i14;
                    long j13 = getLong((Object) bArr, i11 + j11 + j12);
                    long j14 = getLong((Object) bArr2, j11 + i12 + j12);
                    if (j13 != j14) {
                        return i14 + firstDifferingByteIndexNativeEndian(j13, j14);
                    }
                    i14 += 8;
                }
            }
            while (i14 < i13) {
                if (bArr[i11 + i14] != bArr2[i12 + i14]) {
                    return i14;
                }
                i14++;
            }
            return -1;
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long objectFieldOffset(java.lang.reflect.Field field) {
        return MEMORY_ACCESSOR.objectFieldOffset(field);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putBoolean(Object obj, long j11, boolean z11) {
        MEMORY_ACCESSOR.putBoolean(obj, j11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanBigEndian(Object obj, long j11, boolean z11) {
        putByteBigEndian(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putBooleanLittleEndian(Object obj, long j11, boolean z11) {
        putByteLittleEndian(obj, j11, z11 ? (byte) 1 : (byte) 0);
    }

    static void putByte(Object obj, long j11, byte b11) {
        MEMORY_ACCESSOR.putByte(obj, j11, b11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteBigEndian(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int i11 = getInt(obj, j12);
        int i12 = ((~((int) j11)) & 3) << 3;
        putInt(obj, j12, ((255 & b11) << i12) | (i11 & (~(255 << i12))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void putByteLittleEndian(Object obj, long j11, byte b11) {
        long j12 = (-4) & j11;
        int i11 = (((int) j11) & 3) << 3;
        putInt(obj, j12, ((255 & b11) << i11) | (getInt(obj, j12) & (~(255 << i11))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putDouble(Object obj, long j11, double d11) {
        MEMORY_ACCESSOR.putDouble(obj, j11, d11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putFloat(Object obj, long j11, float f11) {
        MEMORY_ACCESSOR.putFloat(obj, j11, f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putInt(Object obj, long j11, int i11) {
        MEMORY_ACCESSOR.putInt(obj, j11, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putLong(Object obj, long j11, long j12) {
        MEMORY_ACCESSOR.putLong(obj, j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putObject(Object obj, long j11, Object obj2) {
        MEMORY_ACCESSOR.putObject(obj, j11, obj2);
    }

    private static boolean supportsUnsafeArrayOperations() {
        MemoryAccessor memoryAccessor = MEMORY_ACCESSOR;
        if (memoryAccessor == null) {
            return false;
        }
        return memoryAccessor.supportsUnsafeArrayOperations();
    }

    private static boolean supportsUnsafeByteBufferOperations() {
        MemoryAccessor memoryAccessor = MEMORY_ACCESSOR;
        if (memoryAccessor == null) {
            return false;
        }
        return memoryAccessor.supportsUnsafeByteBufferOperations();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void copyMemory(long j11, byte[] bArr, long j12, long j13) {
        MEMORY_ACCESSOR.copyMemory(j11, bArr, j12, j13);
    }

    static boolean getBoolean(boolean[] zArr, long j11) {
        return MEMORY_ACCESSOR.getBoolean(zArr, BOOLEAN_ARRAY_BASE_OFFSET + (j11 * BOOLEAN_ARRAY_INDEX_SCALE));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte getByte(byte[] bArr, long j11) {
        return MEMORY_ACCESSOR.getByte(bArr, BYTE_ARRAY_BASE_OFFSET + j11);
    }

    static double getDouble(double[] dArr, long j11) {
        return MEMORY_ACCESSOR.getDouble(dArr, DOUBLE_ARRAY_BASE_OFFSET + (j11 * DOUBLE_ARRAY_INDEX_SCALE));
    }

    static float getFloat(float[] fArr, long j11) {
        return MEMORY_ACCESSOR.getFloat(fArr, FLOAT_ARRAY_BASE_OFFSET + (j11 * FLOAT_ARRAY_INDEX_SCALE));
    }

    static int getInt(int[] iArr, long j11) {
        return MEMORY_ACCESSOR.getInt(iArr, INT_ARRAY_BASE_OFFSET + (j11 * INT_ARRAY_INDEX_SCALE));
    }

    static long getLong(long[] jArr, long j11) {
        return MEMORY_ACCESSOR.getLong(jArr, LONG_ARRAY_BASE_OFFSET + (j11 * LONG_ARRAY_INDEX_SCALE));
    }

    static Object getObject(Object[] objArr, long j11) {
        return MEMORY_ACCESSOR.getObject(objArr, OBJECT_ARRAY_BASE_OFFSET + (j11 * OBJECT_ARRAY_INDEX_SCALE));
    }

    static void putBoolean(boolean[] zArr, long j11, boolean z11) {
        MEMORY_ACCESSOR.putBoolean(zArr, BOOLEAN_ARRAY_BASE_OFFSET + (j11 * BOOLEAN_ARRAY_INDEX_SCALE), z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putByte(byte[] bArr, long j11, byte b11) {
        MEMORY_ACCESSOR.putByte(bArr, BYTE_ARRAY_BASE_OFFSET + j11, b11);
    }

    static void putDouble(double[] dArr, long j11, double d11) {
        MEMORY_ACCESSOR.putDouble(dArr, DOUBLE_ARRAY_BASE_OFFSET + (j11 * DOUBLE_ARRAY_INDEX_SCALE), d11);
    }

    static void putFloat(float[] fArr, long j11, float f11) {
        MEMORY_ACCESSOR.putFloat(fArr, FLOAT_ARRAY_BASE_OFFSET + (j11 * FLOAT_ARRAY_INDEX_SCALE), f11);
    }

    static void putInt(int[] iArr, long j11, int i11) {
        MEMORY_ACCESSOR.putInt(iArr, INT_ARRAY_BASE_OFFSET + (j11 * INT_ARRAY_INDEX_SCALE), i11);
    }

    static void putLong(long[] jArr, long j11, long j12) {
        MEMORY_ACCESSOR.putLong(jArr, LONG_ARRAY_BASE_OFFSET + (j11 * LONG_ARRAY_INDEX_SCALE), j12);
    }

    static void putObject(Object[] objArr, long j11, Object obj) {
        MEMORY_ACCESSOR.putObject(objArr, OBJECT_ARRAY_BASE_OFFSET + (j11 * OBJECT_ARRAY_INDEX_SCALE), obj);
    }

    static void copyMemory(byte[] bArr, long j11, byte[] bArr2, long j12, long j13) {
        System.arraycopy(bArr, (int) j11, bArr2, (int) j12, (int) j13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte getByte(long j11) {
        return MEMORY_ACCESSOR.getByte(j11);
    }

    static int getInt(long j11) {
        return MEMORY_ACCESSOR.getInt(j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long getLong(long j11) {
        return MEMORY_ACCESSOR.getLong(j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void putByte(long j11, byte b11) {
        MEMORY_ACCESSOR.putByte(j11, b11);
    }

    static void putInt(long j11, int i11) {
        MEMORY_ACCESSOR.putInt(j11, i11);
    }

    static void putLong(long j11, long j12) {
        MEMORY_ACCESSOR.putLong(j11, j12);
    }
}