package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.u;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class h1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f16274a = B();

    /* renamed from: b  reason: collision with root package name */
    private static final l1<?, ?> f16275b = C(false);

    /* renamed from: c  reason: collision with root package name */
    private static final l1<?, ?> f16276c = C(true);

    /* renamed from: d  reason: collision with root package name */
    private static final l1<?, ?> f16277d = new n1();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB A(int i11, List<Integer> list, a0.e eVar, UB ub2, l1<UT, UB> l1Var) {
        if (eVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                int intValue = list.get(i13).intValue();
                if (eVar.isInRange(intValue)) {
                    if (i13 != i12) {
                        list.set(i12, Integer.valueOf(intValue));
                    }
                    i12++;
                } else {
                    ub2 = (UB) L(i11, intValue, ub2, l1Var);
                }
            }
            if (i12 != size) {
                list.subList(i12, size).clear();
            }
        } else {
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                int intValue2 = it2.next().intValue();
                if (!eVar.isInRange(intValue2)) {
                    ub2 = (UB) L(i11, intValue2, ub2, l1Var);
                    it2.remove();
                }
            }
        }
        return ub2;
    }

    private static Class<?> B() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static l1<?, ?> C(boolean z11) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (l1) D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z11));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends u.b<FT>> void E(q<FT> qVar, T t11, T t12) {
        u<FT> c11 = qVar.c(t12);
        if (c11.m()) {
            return;
        }
        qVar.d(t11).t(c11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void F(l0 l0Var, T t11, T t12, long j11) {
        p1.O(t11, j11, l0Var.mergeFrom(p1.A(t11, j11), p1.A(t12, j11)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void G(l1<UT, UB> l1Var, T t11, T t12) {
        l1Var.p(t11, l1Var.k(l1Var.g(t11), l1Var.g(t12)));
    }

    public static l1<?, ?> H() {
        return f16275b;
    }

    public static l1<?, ?> I() {
        return f16276c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!y.class.isAssignableFrom(cls) && (cls2 = f16274a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB L(int i11, int i12, UB ub2, l1<UT, UB> l1Var) {
        if (ub2 == null) {
            ub2 = l1Var.n();
        }
        l1Var.e(ub2, i11, i12);
        return ub2;
    }

    public static l1<?, ?> M() {
        return f16277d;
    }

    public static void N(int i11, List<Boolean> list, s1 s1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s1Var.writeBoolList(i11, list, z11);
    }

    public static void O(int i11, List<i> list, s1 s1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s1Var.writeBytesList(i11, list);
    }

    public static void P(int i11, List<Double> list, s1 s1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s1Var.writeDoubleList(i11, list, z11);
    }

    public static void Q(int i11, List<Integer> list, s1 s1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s1Var.writeEnumList(i11, list, z11);
    }

    public static void R(int i11, List<Integer> list, s1 s1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s1Var.writeFixed32List(i11, list, z11);
    }

    public static void S(int i11, List<Long> list, s1 s1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s1Var.writeFixed64List(i11, list, z11);
    }

    public static void T(int i11, List<Float> list, s1 s1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s1Var.writeFloatList(i11, list, z11);
    }

    public static void U(int i11, List<?> list, s1 s1Var, f1 f1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s1Var.f(i11, list, f1Var);
    }

    public static void V(int i11, List<Integer> list, s1 s1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s1Var.writeInt32List(i11, list, z11);
    }

    public static void W(int i11, List<Long> list, s1 s1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s1Var.writeInt64List(i11, list, z11);
    }

    public static void X(int i11, List<?> list, s1 s1Var, f1 f1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s1Var.c(i11, list, f1Var);
    }

    public static void Y(int i11, List<Integer> list, s1 s1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s1Var.writeSFixed32List(i11, list, z11);
    }

    public static void Z(int i11, List<Long> list, s1 s1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s1Var.writeSFixed64List(i11, list, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z11) {
            return CodedOutputStream.U(i11) + CodedOutputStream.C(size);
        }
        return size * CodedOutputStream.d(i11, true);
    }

    public static void a0(int i11, List<Integer> list, s1 s1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s1Var.writeSInt32List(i11, list, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i11, List<Long> list, s1 s1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s1Var.writeSInt64List(i11, list, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i11, List<i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = size * CodedOutputStream.U(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            U += CodedOutputStream.h(list.get(i12));
        }
        return U;
    }

    public static void c0(int i11, List<String> list, s1 s1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s1Var.writeStringList(i11, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e11 = e(list);
        if (z11) {
            return CodedOutputStream.U(i11) + CodedOutputStream.C(e11);
        }
        return e11 + (size * CodedOutputStream.U(i11));
    }

    public static void d0(int i11, List<Integer> list, s1 s1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s1Var.writeUInt32List(i11, list, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.l(zVar.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.l(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    public static void e0(int i11, List<Long> list, s1 s1Var, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        s1Var.writeUInt64List(i11, list, z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z11) {
            return CodedOutputStream.U(i11) + CodedOutputStream.C(size * 4);
        }
        return size * CodedOutputStream.m(i11, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(int i11, List<?> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z11) {
            return CodedOutputStream.U(i11) + CodedOutputStream.C(size * 8);
        }
        return size * CodedOutputStream.o(i11, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i11, List<q0> list, f1 f1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += CodedOutputStream.s(i11, list.get(i13), f1Var);
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l11 = l(list);
        if (z11) {
            return CodedOutputStream.U(i11) + CodedOutputStream.C(l11);
        }
        return l11 + (size * CodedOutputStream.U(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.w(zVar.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.w(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(int i11, List<Long> list, boolean z11) {
        if (list.size() == 0) {
            return 0;
        }
        int n11 = n(list);
        if (z11) {
            return CodedOutputStream.U(i11) + CodedOutputStream.C(n11);
        }
        return n11 + (list.size() * CodedOutputStream.U(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(List<Long> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.y(h0Var.getLong(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.y(list.get(i12).longValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(int i11, Object obj, f1 f1Var) {
        if (obj instanceof d0) {
            return CodedOutputStream.A(i11, (d0) obj);
        }
        return CodedOutputStream.F(i11, (q0) obj, f1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(int i11, List<?> list, f1 f1Var) {
        int H;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = CodedOutputStream.U(i11) * size;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            if (obj instanceof d0) {
                H = CodedOutputStream.B((d0) obj);
            } else {
                H = CodedOutputStream.H((q0) obj, f1Var);
            }
            U += H;
        }
        return U;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r11 = r(list);
        if (z11) {
            return CodedOutputStream.U(i11) + CodedOutputStream.C(r11);
        }
        return r11 + (size * CodedOutputStream.U(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.P(zVar.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.P(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(int i11, List<Long> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t11 = t(list);
        if (z11) {
            return CodedOutputStream.U(i11) + CodedOutputStream.C(t11);
        }
        return t11 + (size * CodedOutputStream.U(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(List<Long> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.R(h0Var.getLong(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.R(list.get(i12).longValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(int i11, List<?> list) {
        int T;
        int T2;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        int U = CodedOutputStream.U(i11) * size;
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            while (i12 < size) {
                Object raw = f0Var.getRaw(i12);
                if (raw instanceof i) {
                    T2 = CodedOutputStream.h((i) raw);
                } else {
                    T2 = CodedOutputStream.T((String) raw);
                }
                U += T2;
                i12++;
            }
        } else {
            while (i12 < size) {
                Object obj = list.get(i12);
                if (obj instanceof i) {
                    T = CodedOutputStream.h((i) obj);
                } else {
                    T = CodedOutputStream.T((String) obj);
                }
                U += T;
                i12++;
            }
        }
        return U;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(int i11, List<Integer> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w11 = w(list);
        if (z11) {
            return CodedOutputStream.U(i11) + CodedOutputStream.C(w11);
        }
        return w11 + (size * CodedOutputStream.U(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(List<Integer> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.W(zVar.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.W(list.get(i12).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(int i11, List<Long> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y11 = y(list);
        if (z11) {
            return CodedOutputStream.U(i11) + CodedOutputStream.C(y11);
        }
        return y11 + (size * CodedOutputStream.U(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(List<Long> list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.Y(h0Var.getLong(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.Y(list.get(i12).longValue());
                i12++;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB z(int i11, List<Integer> list, a0.d<?> dVar, UB ub2, l1<UT, UB> l1Var) {
        if (dVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                int intValue = list.get(i13).intValue();
                if (dVar.findValueByNumber(intValue) != null) {
                    if (i13 != i12) {
                        list.set(i12, Integer.valueOf(intValue));
                    }
                    i12++;
                } else {
                    ub2 = (UB) L(i11, intValue, ub2, l1Var);
                }
            }
            if (i12 != size) {
                list.subList(i12, size).clear();
            }
        } else {
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                int intValue2 = it2.next().intValue();
                if (dVar.findValueByNumber(intValue2) == null) {
                    ub2 = (UB) L(i11, intValue2, ub2, l1Var);
                    it2.remove();
                }
            }
        }
        return ub2;
    }
}