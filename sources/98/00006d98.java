package f70;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes5.dex */
public class a0 {

    /* loaded from: classes5.dex */
    private static class a extends ObjectInputStream {

        /* renamed from: c  reason: collision with root package name */
        private static final Set f25928c;

        /* renamed from: a  reason: collision with root package name */
        private final Class f25929a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f25930b;

        static {
            HashSet hashSet = new HashSet();
            f25928c = hashSet;
            hashSet.add("java.util.TreeMap");
            hashSet.add("java.lang.Integer");
            hashSet.add("java.lang.Number");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDS");
            hashSet.add("java.util.ArrayList");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
            hashSet.add("[B");
            hashSet.add("java.util.LinkedList");
            hashSet.add("java.util.Stack");
            hashSet.add("java.util.Vector");
            hashSet.add("[Ljava.lang.Object;");
            hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
        }

        a(Class cls, InputStream inputStream) {
            super(inputStream);
            this.f25930b = false;
            this.f25929a = cls;
        }

        @Override // java.io.ObjectInputStream
        protected Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
            if (this.f25930b) {
                if (!f25928c.contains(objectStreamClass.getName())) {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
            } else if (!objectStreamClass.getName().equals(this.f25929a.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            } else {
                this.f25930b = true;
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public static long a(byte[] bArr, int i11, int i12) {
        Objects.requireNonNull(bArr, "in == null");
        long j11 = 0;
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            j11 = (j11 << 8) | (bArr[i13] & 255);
        }
        return j11;
    }

    public static int b(int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (((i11 >> i13) & 1) == 0) {
                return i13;
            }
        }
        return 0;
    }

    public static byte[] c(byte[] bArr) {
        Objects.requireNonNull(bArr, "in == null");
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static byte[][] d(byte[][] bArr) {
        if (k(bArr)) {
            throw new NullPointerException("in has null pointers");
        }
        byte[][] bArr2 = new byte[bArr.length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr2[i11] = new byte[bArr[i11].length];
            System.arraycopy(bArr[i11], 0, bArr2[i11], 0, bArr[i11].length);
        }
        return bArr2;
    }

    public static void e(byte[] bArr, byte[] bArr2, int i11) {
        Objects.requireNonNull(bArr, "dst == null");
        Objects.requireNonNull(bArr2, "src == null");
        if (i11 < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        }
        if (bArr2.length + i11 > bArr.length) {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
        for (int i12 = 0; i12 < bArr2.length; i12++) {
            bArr[i11 + i12] = bArr2[i12];
        }
    }

    public static Object f(byte[] bArr, Class cls) {
        a aVar = new a(cls, new ByteArrayInputStream(bArr));
        Object readObject = aVar.readObject();
        if (aVar.available() == 0) {
            if (cls.isInstance(readObject)) {
                return readObject;
            }
            throw new IOException("unexpected class found in ObjectInputStream");
        }
        throw new IOException("unexpected data found at end of ObjectInputStream");
    }

    public static byte[] g(byte[] bArr, int i11, int i12) {
        Objects.requireNonNull(bArr, "src == null");
        if (i11 >= 0) {
            if (i12 >= 0) {
                if (i11 + i12 <= bArr.length) {
                    byte[] bArr2 = new byte[i12];
                    for (int i13 = 0; i13 < i12; i13++) {
                        bArr2[i13] = bArr[i11 + i13];
                    }
                    return bArr2;
                }
                throw new IllegalArgumentException("offset + length must not be greater then size of source array");
            }
            throw new IllegalArgumentException("length hast to be >= 0");
        }
        throw new IllegalArgumentException("offset hast to be >= 0");
    }

    public static int h(org.bouncycastle.crypto.p pVar) {
        Objects.requireNonNull(pVar, "digest == null");
        String algorithmName = pVar.getAlgorithmName();
        if (algorithmName.equals("SHAKE128")) {
            return 32;
        }
        if (algorithmName.equals("SHAKE256")) {
            return 64;
        }
        return pVar.getDigestSize();
    }

    public static int i(long j11, int i11) {
        return (int) (j11 & ((1 << i11) - 1));
    }

    public static long j(long j11, int i11) {
        return j11 >> i11;
    }

    public static boolean k(byte[][] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(int i11, long j11) {
        if (j11 >= 0) {
            return j11 < (1 << i11);
        }
        throw new IllegalStateException("index must not be negative");
    }

    public static boolean m(long j11, int i11, int i12) {
        return j11 != 0 && (j11 + 1) % ((long) Math.pow((double) (1 << i11), (double) i12)) == 0;
    }

    public static boolean n(long j11, int i11, int i12) {
        return j11 != 0 && j11 % ((long) Math.pow((double) (1 << i11), (double) (i12 + 1))) == 0;
    }

    public static int o(int i11) {
        int i12 = 0;
        while (true) {
            i11 >>= 1;
            if (i11 == 0) {
                return i12;
            }
            i12++;
        }
    }

    public static byte[] p(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] q(long j11, int i11) {
        byte[] bArr = new byte[i11];
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            bArr[i12] = (byte) j11;
            j11 >>>= 8;
        }
        return bArr;
    }
}