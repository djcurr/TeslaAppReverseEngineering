package wz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes5.dex */
public class p extends o {

    /* loaded from: classes5.dex */
    public static final class a<T> implements Iterable<T>, i00.a {

        /* renamed from: a */
        final /* synthetic */ Object[] f56497a;

        public a(Object[] objArr) {
            this.f56497a = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return kotlin.jvm.internal.c.a(this.f56497a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b<T> implements u20.h<T> {

        /* renamed from: a */
        final /* synthetic */ Object[] f56498a;

        public b(Object[] objArr) {
            this.f56498a = objArr;
        }

        @Override // u20.h
        public Iterator<T> iterator() {
            return kotlin.jvm.internal.c.a(this.f56498a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class c<T> extends kotlin.jvm.internal.u implements h00.a<Iterator<? extends T>> {

        /* renamed from: a */
        final /* synthetic */ T[] f56499a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(T[] tArr) {
            super(0);
            this.f56499a = tArr;
        }

        @Override // h00.a
        /* renamed from: a */
        public final Iterator<T> invoke() {
            return kotlin.jvm.internal.c.a(this.f56499a);
        }
    }

    public static <T> Iterable<T> A(T[] tArr) {
        List i11;
        kotlin.jvm.internal.s.g(tArr, "<this>");
        if (tArr.length == 0) {
            i11 = w.i();
            return i11;
        }
        return new a(tArr);
    }

    public static final List<Long> A0(long[] jArr) {
        kotlin.jvm.internal.s.g(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j11 : jArr) {
            arrayList.add(Long.valueOf(j11));
        }
        return arrayList;
    }

    public static <T> u20.h<T> B(T[] tArr) {
        u20.h<T> e11;
        kotlin.jvm.internal.s.g(tArr, "<this>");
        if (tArr.length == 0) {
            e11 = u20.n.e();
            return e11;
        }
        return new b(tArr);
    }

    public static <T> List<T> B0(T[] tArr) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        return new ArrayList(w.f(tArr));
    }

    public static final boolean C(int[] iArr, int i11) {
        kotlin.jvm.internal.s.g(iArr, "<this>");
        return N(iArr, i11) >= 0;
    }

    public static final List<Short> C0(short[] sArr) {
        kotlin.jvm.internal.s.g(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s11 : sArr) {
            arrayList.add(Short.valueOf(s11));
        }
        return arrayList;
    }

    public static <T> boolean D(T[] tArr, T t11) {
        int O;
        kotlin.jvm.internal.s.g(tArr, "<this>");
        O = O(tArr, t11);
        return O >= 0;
    }

    public static final List<Boolean> D0(boolean[] zArr) {
        kotlin.jvm.internal.s.g(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z11 : zArr) {
            arrayList.add(Boolean.valueOf(z11));
        }
        return arrayList;
    }

    public static <T> List<T> E(T[] tArr) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        return (List) F(tArr, new ArrayList());
    }

    public static <T> Set<T> E0(T[] tArr) {
        Set<T> d11;
        Set<T> c11;
        int e11;
        kotlin.jvm.internal.s.g(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            d11 = x0.d();
            return d11;
        } else if (length != 1) {
            e11 = r0.e(tArr.length);
            return (Set) l0(tArr, new LinkedHashSet(e11));
        } else {
            c11 = w0.c(tArr[0]);
            return c11;
        }
    }

    public static final <C extends Collection<? super T>, T> C F(T[] tArr, C destination) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        kotlin.jvm.internal.s.g(destination, "destination");
        for (T t11 : tArr) {
            if (t11 != null) {
                destination.add(t11);
            }
        }
        return destination;
    }

    public static <T> Iterable<k0<T>> F0(T[] tArr) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        return new l0(new c(tArr));
    }

    public static <T> T G(T[] tArr) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        if (!(tArr.length == 0)) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <R> List<vz.p<Integer, R>> G0(int[] iArr, R[] other) {
        kotlin.jvm.internal.s.g(iArr, "<this>");
        kotlin.jvm.internal.s.g(other, "other");
        int min = Math.min(iArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            int i12 = iArr[i11];
            arrayList.add(vz.v.a(Integer.valueOf(i12), other[i11]));
        }
        return arrayList;
    }

    public static <T> T H(T[] tArr) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static <T, R> List<vz.p<T, R>> H0(T[] tArr, R[] other) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        kotlin.jvm.internal.s.g(other, "other");
        int min = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(vz.v.a(tArr[i11], other[i11]));
        }
        return arrayList;
    }

    public static <T> m00.i I(T[] tArr) {
        int L;
        kotlin.jvm.internal.s.g(tArr, "<this>");
        L = L(tArr);
        return new m00.i(0, L);
    }

    public static final int J(int[] iArr) {
        kotlin.jvm.internal.s.g(iArr, "<this>");
        return iArr.length - 1;
    }

    public static int K(long[] jArr) {
        kotlin.jvm.internal.s.g(jArr, "<this>");
        return jArr.length - 1;
    }

    public static <T> int L(T[] tArr) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        return tArr.length - 1;
    }

    public static Integer M(int[] iArr, int i11) {
        kotlin.jvm.internal.s.g(iArr, "<this>");
        if (i11 < 0 || i11 > J(iArr)) {
            return null;
        }
        return Integer.valueOf(iArr[i11]);
    }

    public static final int N(int[] iArr, int i11) {
        kotlin.jvm.internal.s.g(iArr, "<this>");
        int length = iArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (i11 == iArr[i12]) {
                return i12;
            }
        }
        return -1;
    }

    public static <T> int O(T[] tArr, T t11) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        int i11 = 0;
        if (t11 == null) {
            int length = tArr.length;
            while (i11 < length) {
                if (tArr[i11] == null) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i11 < length2) {
            if (kotlin.jvm.internal.s.c(t11, tArr[i11])) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static final <A extends Appendable> A P(byte[] bArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, h00.l<? super Byte, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.s.g(bArr, "<this>");
        kotlin.jvm.internal.s.g(buffer, "buffer");
        kotlin.jvm.internal.s.g(separator, "separator");
        kotlin.jvm.internal.s.g(prefix, "prefix");
        kotlin.jvm.internal.s.g(postfix, "postfix");
        kotlin.jvm.internal.s.g(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (byte b11 : bArr) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Byte.valueOf(b11)));
            } else {
                buffer.append(String.valueOf((int) b11));
            }
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <A extends Appendable> A Q(int[] iArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, h00.l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.s.g(iArr, "<this>");
        kotlin.jvm.internal.s.g(buffer, "buffer");
        kotlin.jvm.internal.s.g(separator, "separator");
        kotlin.jvm.internal.s.g(prefix, "prefix");
        kotlin.jvm.internal.s.g(postfix, "postfix");
        kotlin.jvm.internal.s.g(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (int i13 : iArr) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            if (lVar != null) {
                buffer.append(lVar.invoke(Integer.valueOf(i13)));
            } else {
                buffer.append(String.valueOf(i13));
            }
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T, A extends Appendable> A R(T[] tArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, h00.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        kotlin.jvm.internal.s.g(buffer, "buffer");
        kotlin.jvm.internal.s.g(separator, "separator");
        kotlin.jvm.internal.s.g(prefix, "prefix");
        kotlin.jvm.internal.s.g(postfix, "postfix");
        kotlin.jvm.internal.s.g(truncated, "truncated");
        buffer.append(prefix);
        int i12 = 0;
        for (T t11 : tArr) {
            i12++;
            if (i12 > 1) {
                buffer.append(separator);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            kotlin.text.n.a(buffer, t11, lVar);
        }
        if (i11 >= 0 && i12 > i11) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static /* synthetic */ Appendable S(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, h00.l lVar, int i12, Object obj) {
        return R(objArr, appendable, (i12 & 2) != 0 ? ", " : charSequence, (i12 & 4) != 0 ? "" : charSequence2, (i12 & 8) == 0 ? charSequence3 : "", (i12 & 16) != 0 ? -1 : i11, (i12 & 32) != 0 ? "..." : charSequence4, (i12 & 64) != 0 ? null : lVar);
    }

    public static final String T(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, h00.l<? super Byte, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.s.g(bArr, "<this>");
        kotlin.jvm.internal.s.g(separator, "separator");
        kotlin.jvm.internal.s.g(prefix, "prefix");
        kotlin.jvm.internal.s.g(postfix, "postfix");
        kotlin.jvm.internal.s.g(truncated, "truncated");
        String sb2 = ((StringBuilder) P(bArr, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
        kotlin.jvm.internal.s.f(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final String U(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, h00.l<? super Integer, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.s.g(iArr, "<this>");
        kotlin.jvm.internal.s.g(separator, "separator");
        kotlin.jvm.internal.s.g(prefix, "prefix");
        kotlin.jvm.internal.s.g(postfix, "postfix");
        kotlin.jvm.internal.s.g(truncated, "truncated");
        String sb2 = ((StringBuilder) Q(iArr, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
        kotlin.jvm.internal.s.f(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final <T> String V(T[] tArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i11, CharSequence truncated, h00.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        kotlin.jvm.internal.s.g(separator, "separator");
        kotlin.jvm.internal.s.g(prefix, "prefix");
        kotlin.jvm.internal.s.g(postfix, "postfix");
        kotlin.jvm.internal.s.g(truncated, "truncated");
        String sb2 = ((StringBuilder) R(tArr, new StringBuilder(), separator, prefix, postfix, i11, truncated, lVar)).toString();
        kotlin.jvm.internal.s.f(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String W(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, h00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i12 & 2) != 0 ? "" : charSequence2;
        String str2 = (i12 & 4) == 0 ? charSequence3 : "";
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        return T(bArr, charSequence, str, str2, i13, charSequence5, lVar);
    }

    public static /* synthetic */ String X(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, h00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i12 & 2) != 0 ? "" : charSequence2;
        String str2 = (i12 & 4) == 0 ? charSequence3 : "";
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        return U(iArr, charSequence, str, str2, i13, charSequence5, lVar);
    }

    public static /* synthetic */ String Y(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i11, CharSequence charSequence4, h00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i12 & 2) != 0 ? "" : charSequence2;
        String str2 = (i12 & 4) == 0 ? charSequence3 : "";
        if ((i12 & 8) != 0) {
            i11 = -1;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i12 & 32) != 0) {
            lVar = null;
        }
        return V(objArr, charSequence, str, str2, i13, charSequence5, lVar);
    }

    public static <T> T Z(T[] tArr) {
        int L;
        kotlin.jvm.internal.s.g(tArr, "<this>");
        if (!(tArr.length == 0)) {
            L = L(tArr);
            return tArr[L];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int a0(int[] iArr, int i11) {
        kotlin.jvm.internal.s.g(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i12 = length - 1;
                if (i11 == iArr[length]) {
                    return length;
                }
                if (i12 < 0) {
                    break;
                }
                length = i12;
            }
        }
        return -1;
    }

    public static <T> int b0(T[] tArr, T t11) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        if (t11 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i11 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i11 < 0) {
                        break;
                    }
                    length = i11;
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i12 = length2 - 1;
                    if (kotlin.jvm.internal.s.c(t11, tArr[length2])) {
                        return length2;
                    }
                    if (i12 < 0) {
                        break;
                    }
                    length2 = i12;
                }
            }
        }
        return -1;
    }

    public static <T, R> List<R> c0(T[] tArr, h00.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        kotlin.jvm.internal.s.g(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t11 : tArr) {
            arrayList.add(transform.invoke(t11));
        }
        return arrayList;
    }

    public static <T> void d0(T[] tArr) {
        int L;
        kotlin.jvm.internal.s.g(tArr, "<this>");
        int length = (tArr.length / 2) - 1;
        if (length < 0) {
            return;
        }
        L = L(tArr);
        int i11 = 0;
        if (length < 0) {
            return;
        }
        while (true) {
            T t11 = tArr[i11];
            tArr[i11] = tArr[L];
            tArr[L] = t11;
            L--;
            if (i11 == length) {
                return;
            }
            i11++;
        }
    }

    public static <T> List<T> e0(T[] tArr) {
        List<T> B0;
        List<T> i11;
        kotlin.jvm.internal.s.g(tArr, "<this>");
        if (tArr.length == 0) {
            i11 = w.i();
            return i11;
        }
        B0 = B0(tArr);
        d0.P(B0);
        return B0;
    }

    public static char f0(char[] cArr) {
        kotlin.jvm.internal.s.g(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T g0(T[] tArr) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length == 1) {
                return tArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> T h0(T[] tArr) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static List<Float> i0(float[] fArr, m00.i indices) {
        List<Float> i11;
        kotlin.jvm.internal.s.g(fArr, "<this>");
        kotlin.jvm.internal.s.g(indices, "indices");
        if (indices.isEmpty()) {
            i11 = w.i();
            return i11;
        }
        return o.c(o.q(fArr, indices.m().intValue(), indices.k().intValue() + 1));
    }

    public static final <T> T[] j0(T[] tArr, Comparator<? super T> comparator) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        kotlin.jvm.internal.s.g(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        kotlin.jvm.internal.s.f(tArr2, "copyOf(this, size)");
        o.y(tArr2, comparator);
        return tArr2;
    }

    public static <T> List<T> k0(T[] tArr, Comparator<? super T> comparator) {
        List<T> e11;
        kotlin.jvm.internal.s.g(tArr, "<this>");
        kotlin.jvm.internal.s.g(comparator, "comparator");
        e11 = o.e(j0(tArr, comparator));
        return e11;
    }

    public static final <T, C extends Collection<? super T>> C l0(T[] tArr, C destination) {
        kotlin.jvm.internal.s.g(tArr, "<this>");
        kotlin.jvm.internal.s.g(destination, "destination");
        for (T t11 : tArr) {
            destination.add(t11);
        }
        return destination;
    }

    public static List<Byte> m0(byte[] bArr) {
        List<Byte> i11;
        List<Byte> d11;
        kotlin.jvm.internal.s.g(bArr, "<this>");
        int length = bArr.length;
        if (length == 0) {
            i11 = w.i();
            return i11;
        } else if (length != 1) {
            return v0(bArr);
        } else {
            d11 = v.d(Byte.valueOf(bArr[0]));
            return d11;
        }
    }

    public static List<Character> n0(char[] cArr) {
        List<Character> i11;
        List<Character> d11;
        kotlin.jvm.internal.s.g(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            i11 = w.i();
            return i11;
        } else if (length != 1) {
            return w0(cArr);
        } else {
            d11 = v.d(Character.valueOf(cArr[0]));
            return d11;
        }
    }

    public static List<Double> o0(double[] dArr) {
        List<Double> i11;
        List<Double> d11;
        kotlin.jvm.internal.s.g(dArr, "<this>");
        int length = dArr.length;
        if (length == 0) {
            i11 = w.i();
            return i11;
        } else if (length != 1) {
            return x0(dArr);
        } else {
            d11 = v.d(Double.valueOf(dArr[0]));
            return d11;
        }
    }

    public static List<Float> p0(float[] fArr) {
        List<Float> i11;
        List<Float> d11;
        kotlin.jvm.internal.s.g(fArr, "<this>");
        int length = fArr.length;
        if (length == 0) {
            i11 = w.i();
            return i11;
        } else if (length != 1) {
            return y0(fArr);
        } else {
            d11 = v.d(Float.valueOf(fArr[0]));
            return d11;
        }
    }

    public static List<Integer> q0(int[] iArr) {
        List<Integer> i11;
        List<Integer> d11;
        List<Integer> z02;
        kotlin.jvm.internal.s.g(iArr, "<this>");
        int length = iArr.length;
        if (length == 0) {
            i11 = w.i();
            return i11;
        } else if (length != 1) {
            z02 = z0(iArr);
            return z02;
        } else {
            d11 = v.d(Integer.valueOf(iArr[0]));
            return d11;
        }
    }

    public static List<Long> r0(long[] jArr) {
        List<Long> i11;
        List<Long> d11;
        kotlin.jvm.internal.s.g(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            i11 = w.i();
            return i11;
        } else if (length != 1) {
            return A0(jArr);
        } else {
            d11 = v.d(Long.valueOf(jArr[0]));
            return d11;
        }
    }

    public static <T> List<T> s0(T[] tArr) {
        List<T> i11;
        List<T> d11;
        List<T> B0;
        kotlin.jvm.internal.s.g(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            i11 = w.i();
            return i11;
        } else if (length != 1) {
            B0 = B0(tArr);
            return B0;
        } else {
            d11 = v.d(tArr[0]);
            return d11;
        }
    }

    public static List<Short> t0(short[] sArr) {
        List<Short> i11;
        List<Short> d11;
        kotlin.jvm.internal.s.g(sArr, "<this>");
        int length = sArr.length;
        if (length == 0) {
            i11 = w.i();
            return i11;
        } else if (length != 1) {
            return C0(sArr);
        } else {
            d11 = v.d(Short.valueOf(sArr[0]));
            return d11;
        }
    }

    public static List<Boolean> u0(boolean[] zArr) {
        List<Boolean> i11;
        List<Boolean> d11;
        kotlin.jvm.internal.s.g(zArr, "<this>");
        int length = zArr.length;
        if (length == 0) {
            i11 = w.i();
            return i11;
        } else if (length != 1) {
            return D0(zArr);
        } else {
            d11 = v.d(Boolean.valueOf(zArr[0]));
            return d11;
        }
    }

    public static final List<Byte> v0(byte[] bArr) {
        kotlin.jvm.internal.s.g(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b11 : bArr) {
            arrayList.add(Byte.valueOf(b11));
        }
        return arrayList;
    }

    public static final List<Character> w0(char[] cArr) {
        kotlin.jvm.internal.s.g(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c11 : cArr) {
            arrayList.add(Character.valueOf(c11));
        }
        return arrayList;
    }

    public static final List<Double> x0(double[] dArr) {
        kotlin.jvm.internal.s.g(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d11 : dArr) {
            arrayList.add(Double.valueOf(d11));
        }
        return arrayList;
    }

    public static final List<Float> y0(float[] fArr) {
        kotlin.jvm.internal.s.g(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f11 : fArr) {
            arrayList.add(Float.valueOf(f11));
        }
        return arrayList;
    }

    public static List<Integer> z0(int[] iArr) {
        kotlin.jvm.internal.s.g(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i11 : iArr) {
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }
}