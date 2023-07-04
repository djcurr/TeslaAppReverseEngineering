package wz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public class o extends n {

    /* loaded from: classes5.dex */
    public static final class a extends c<Integer> implements RandomAccess {

        /* renamed from: b */
        final /* synthetic */ int[] f56495b;

        a(int[] iArr) {
            this.f56495b = iArr;
        }

        @Override // wz.a
        public int b() {
            return this.f56495b.length;
        }

        public boolean c(int i11) {
            return p.C(this.f56495b, i11);
        }

        @Override // wz.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return c(((Number) obj).intValue());
            }
            return false;
        }

        @Override // wz.c, java.util.List
        /* renamed from: e */
        public Integer get(int i11) {
            return Integer.valueOf(this.f56495b[i11]);
        }

        public int f(int i11) {
            return p.N(this.f56495b, i11);
        }

        public int h(int i11) {
            return p.a0(this.f56495b, i11);
        }

        @Override // wz.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return f(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // wz.a, java.util.Collection
        public boolean isEmpty() {
            return this.f56495b.length == 0;
        }

        @Override // wz.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return h(((Number) obj).intValue());
            }
            return -1;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends c<Float> implements RandomAccess {

        /* renamed from: b */
        final /* synthetic */ float[] f56496b;

        b(float[] fArr) {
            this.f56496b = fArr;
        }

        @Override // wz.a
        public int b() {
            return this.f56496b.length;
        }

        public boolean c(float f11) {
            for (float f12 : this.f56496b) {
                if (Float.floatToIntBits(f12) == Float.floatToIntBits(f11)) {
                    return true;
                }
            }
            return false;
        }

        @Override // wz.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Float) {
                return c(((Number) obj).floatValue());
            }
            return false;
        }

        @Override // wz.c, java.util.List
        /* renamed from: e */
        public Float get(int i11) {
            return Float.valueOf(this.f56496b[i11]);
        }

        public int f(float f11) {
            float[] fArr = this.f56496b;
            int length = fArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                if (Float.floatToIntBits(fArr[i11]) == Float.floatToIntBits(f11)) {
                    return i11;
                }
            }
            return -1;
        }

        public int h(float f11) {
            float[] fArr = this.f56496b;
            int length = fArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i11 = length - 1;
                if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f11)) {
                    return length;
                }
                if (i11 < 0) {
                    return -1;
                }
                length = i11;
            }
        }

        @Override // wz.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Float) {
                return f(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // wz.a, java.util.Collection
        public boolean isEmpty() {
            return this.f56496b.length == 0;
        }

        @Override // wz.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                return h(((Number) obj).floatValue());
            }
            return -1;
        }
    }

    public static final List<Float> c(float[] fArr) {
        kotlin.jvm.internal.s.g(fArr, "<this>");
        return new b(fArr);
    }

    public static List<Integer> d(int[] iArr) {
        kotlin.jvm.internal.s.g(iArr, "<this>");
        return new a(iArr);
    }

    public static <T> List<T> e(T[] tArr) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        List<T> a11 = q.a(tArr);
        kotlin.jvm.internal.s.f(a11, "asList(this)");
        return a11;
    }

    public static byte[] f(byte[] bArr, byte[] destination, int i11, int i12, int i13) {
        kotlin.jvm.internal.s.g(bArr, "<this>");
        kotlin.jvm.internal.s.g(destination, "destination");
        System.arraycopy(bArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    public static char[] g(char[] cArr, char[] destination, int i11, int i12, int i13) {
        kotlin.jvm.internal.s.g(cArr, "<this>");
        kotlin.jvm.internal.s.g(destination, "destination");
        System.arraycopy(cArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    public static float[] h(float[] fArr, float[] destination, int i11, int i12, int i13) {
        kotlin.jvm.internal.s.g(fArr, "<this>");
        kotlin.jvm.internal.s.g(destination, "destination");
        System.arraycopy(fArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    public static int[] i(int[] iArr, int[] destination, int i11, int i12, int i13) {
        kotlin.jvm.internal.s.g(iArr, "<this>");
        kotlin.jvm.internal.s.g(destination, "destination");
        System.arraycopy(iArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    public static long[] j(long[] jArr, long[] destination, int i11, int i12, int i13) {
        kotlin.jvm.internal.s.g(jArr, "<this>");
        kotlin.jvm.internal.s.g(destination, "destination");
        System.arraycopy(jArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    public static <T> T[] k(T[] tArr, T[] destination, int i11, int i12, int i13) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        kotlin.jvm.internal.s.g(destination, "destination");
        System.arraycopy(tArr, i12, destination, i11, i13 - i12);
        return destination;
    }

    public static /* synthetic */ byte[] l(byte[] bArr, byte[] bArr2, int i11, int i12, int i13, int i14, Object obj) {
        byte[] f11;
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = bArr.length;
        }
        f11 = f(bArr, bArr2, i11, i12, i13);
        return f11;
    }

    public static /* synthetic */ float[] m(float[] fArr, float[] fArr2, int i11, int i12, int i13, int i14, Object obj) {
        float[] h11;
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = fArr.length;
        }
        h11 = h(fArr, fArr2, i11, i12, i13);
        return h11;
    }

    public static /* synthetic */ int[] n(int[] iArr, int[] iArr2, int i11, int i12, int i13, int i14, Object obj) {
        int[] i15;
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = iArr.length;
        }
        i15 = i(iArr, iArr2, i11, i12, i13);
        return i15;
    }

    public static /* synthetic */ Object[] o(Object[] objArr, Object[] objArr2, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = objArr.length;
        }
        return l.k(objArr, objArr2, i11, i12, i13);
    }

    public static byte[] p(byte[] bArr, int i11, int i12) {
        kotlin.jvm.internal.s.g(bArr, "<this>");
        m.b(i12, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i11, i12);
        kotlin.jvm.internal.s.f(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final float[] q(float[] fArr, int i11, int i12) {
        kotlin.jvm.internal.s.g(fArr, "<this>");
        m.b(i12, fArr.length);
        float[] copyOfRange = Arrays.copyOfRange(fArr, i11, i12);
        kotlin.jvm.internal.s.f(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static <T> T[] r(T[] tArr, int i11, int i12) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        m.b(i12, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i11, i12);
        kotlin.jvm.internal.s.f(tArr2, "copyOfRange(this, fromIndex, toIndex)");
        return tArr2;
    }

    public static void s(int[] iArr, int i11, int i12, int i13) {
        kotlin.jvm.internal.s.g(iArr, "<this>");
        Arrays.fill(iArr, i12, i13, i11);
    }

    public static <T> void t(T[] tArr, T t11, int i11, int i12) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        Arrays.fill(tArr, i11, i12, t11);
    }

    public static /* synthetic */ void u(int[] iArr, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i12 = 0;
        }
        if ((i14 & 4) != 0) {
            i13 = iArr.length;
        }
        s(iArr, i11, i12, i13);
    }

    public static /* synthetic */ void v(Object[] objArr, Object obj, int i11, int i12, int i13, Object obj2) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = objArr.length;
        }
        t(objArr, obj, i11, i12);
    }

    public static <T> T[] w(T[] tArr, T t11) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        int length = tArr.length;
        T[] result = (T[]) Arrays.copyOf(tArr, length + 1);
        result[length] = t11;
        kotlin.jvm.internal.s.f(result, "result");
        return result;
    }

    public static <T> void x(T[] tArr) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void y(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        kotlin.jvm.internal.s.g(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static <T> void z(T[] tArr, Comparator<? super T> comparator, int i11, int i12) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        kotlin.jvm.internal.s.g(comparator, "comparator");
        Arrays.sort(tArr, i11, i12, comparator);
    }
}