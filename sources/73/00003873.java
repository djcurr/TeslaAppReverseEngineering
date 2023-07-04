package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.j0;
import com.google.crypto.tink.shaded.protobuf.s1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class t0<T> implements f1<T> {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f16383r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    private static final Unsafe f16384s = p1.B();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f16385a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f16386b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16387c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16388d;

    /* renamed from: e  reason: collision with root package name */
    private final q0 f16389e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f16390f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f16391g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f16392h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f16393i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f16394j;

    /* renamed from: k  reason: collision with root package name */
    private final int f16395k;

    /* renamed from: l  reason: collision with root package name */
    private final int f16396l;

    /* renamed from: m  reason: collision with root package name */
    private final v0 f16397m;

    /* renamed from: n  reason: collision with root package name */
    private final g0 f16398n;

    /* renamed from: o  reason: collision with root package name */
    private final l1<?, ?> f16399o;

    /* renamed from: p  reason: collision with root package name */
    private final q<?> f16400p;

    /* renamed from: q  reason: collision with root package name */
    private final l0 f16401q;

    private t0(int[] iArr, Object[] objArr, int i11, int i12, q0 q0Var, boolean z11, boolean z12, int[] iArr2, int i13, int i14, v0 v0Var, g0 g0Var, l1<?, ?> l1Var, q<?> qVar, l0 l0Var) {
        this.f16385a = iArr;
        this.f16386b = objArr;
        this.f16387c = i11;
        this.f16388d = i12;
        this.f16391g = q0Var instanceof y;
        this.f16392h = z11;
        this.f16390f = qVar != null && qVar.e(q0Var);
        this.f16393i = z12;
        this.f16394j = iArr2;
        this.f16395k = i13;
        this.f16396l = i14;
        this.f16397m = v0Var;
        this.f16398n = g0Var;
        this.f16399o = l1Var;
        this.f16400p = qVar;
        this.f16389e = q0Var;
        this.f16401q = l0Var;
    }

    private boolean A(T t11, int i11, int i12) {
        return p1.x(t11, (long) (a0(i12) & 1048575)) == i11;
    }

    private static boolean B(int i11) {
        return (i11 & 268435456) != 0;
    }

    private static List<?> C(Object obj, long j11) {
        return (List) p1.A(obj, j11);
    }

    private static <T> long D(T t11, long j11) {
        return p1.y(t11, j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
        r0 = r16.f16395k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r0 >= r16.f16396l) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
        r13 = i(r19, r16.f16394j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
        if (r13 == null) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        r17.o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.u.b<ET>> void E(com.google.crypto.tink.shaded.protobuf.l1<UT, UB> r17, com.google.crypto.tink.shaded.protobuf.q<ET> r18, T r19, com.google.crypto.tink.shaded.protobuf.e1 r20, com.google.crypto.tink.shaded.protobuf.p r21) {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.E(com.google.crypto.tink.shaded.protobuf.l1, com.google.crypto.tink.shaded.protobuf.q, java.lang.Object, com.google.crypto.tink.shaded.protobuf.e1, com.google.crypto.tink.shaded.protobuf.p):void");
    }

    private final <K, V> void F(Object obj, int i11, Object obj2, p pVar, e1 e1Var) {
        long N = N(k0(i11));
        Object A = p1.A(obj, N);
        if (A == null) {
            A = this.f16401q.newMapField(obj2);
            p1.O(obj, N, A);
        } else if (this.f16401q.isImmutable(A)) {
            Object newMapField = this.f16401q.newMapField(obj2);
            this.f16401q.mergeFrom(newMapField, A);
            p1.O(obj, N, newMapField);
            A = newMapField;
        }
        e1Var.c(this.f16401q.forMutableMapData(A), this.f16401q.forMapMetadata(obj2), pVar);
    }

    private void G(T t11, T t12, int i11) {
        long N = N(k0(i11));
        if (u(t12, i11)) {
            Object A = p1.A(t11, N);
            Object A2 = p1.A(t12, N);
            if (A != null && A2 != null) {
                p1.O(t11, N, a0.h(A, A2));
                g0(t11, i11);
            } else if (A2 != null) {
                p1.O(t11, N, A2);
                g0(t11, i11);
            }
        }
    }

    private void H(T t11, T t12, int i11) {
        int k02 = k0(i11);
        int M = M(i11);
        long N = N(k02);
        if (A(t12, M, i11)) {
            Object A = p1.A(t11, N);
            Object A2 = p1.A(t12, N);
            if (A != null && A2 != null) {
                p1.O(t11, N, a0.h(A, A2));
                h0(t11, M, i11);
            } else if (A2 != null) {
                p1.O(t11, N, A2);
                h0(t11, M, i11);
            }
        }
    }

    private void I(T t11, T t12, int i11) {
        int k02 = k0(i11);
        long N = N(k02);
        int M = M(i11);
        switch (j0(k02)) {
            case 0:
                if (u(t12, i11)) {
                    p1.K(t11, N, p1.v(t12, N));
                    g0(t11, i11);
                    return;
                }
                return;
            case 1:
                if (u(t12, i11)) {
                    p1.L(t11, N, p1.w(t12, N));
                    g0(t11, i11);
                    return;
                }
                return;
            case 2:
                if (u(t12, i11)) {
                    p1.N(t11, N, p1.y(t12, N));
                    g0(t11, i11);
                    return;
                }
                return;
            case 3:
                if (u(t12, i11)) {
                    p1.N(t11, N, p1.y(t12, N));
                    g0(t11, i11);
                    return;
                }
                return;
            case 4:
                if (u(t12, i11)) {
                    p1.M(t11, N, p1.x(t12, N));
                    g0(t11, i11);
                    return;
                }
                return;
            case 5:
                if (u(t12, i11)) {
                    p1.N(t11, N, p1.y(t12, N));
                    g0(t11, i11);
                    return;
                }
                return;
            case 6:
                if (u(t12, i11)) {
                    p1.M(t11, N, p1.x(t12, N));
                    g0(t11, i11);
                    return;
                }
                return;
            case 7:
                if (u(t12, i11)) {
                    p1.E(t11, N, p1.p(t12, N));
                    g0(t11, i11);
                    return;
                }
                return;
            case 8:
                if (u(t12, i11)) {
                    p1.O(t11, N, p1.A(t12, N));
                    g0(t11, i11);
                    return;
                }
                return;
            case 9:
                G(t11, t12, i11);
                return;
            case 10:
                if (u(t12, i11)) {
                    p1.O(t11, N, p1.A(t12, N));
                    g0(t11, i11);
                    return;
                }
                return;
            case 11:
                if (u(t12, i11)) {
                    p1.M(t11, N, p1.x(t12, N));
                    g0(t11, i11);
                    return;
                }
                return;
            case 12:
                if (u(t12, i11)) {
                    p1.M(t11, N, p1.x(t12, N));
                    g0(t11, i11);
                    return;
                }
                return;
            case 13:
                if (u(t12, i11)) {
                    p1.M(t11, N, p1.x(t12, N));
                    g0(t11, i11);
                    return;
                }
                return;
            case 14:
                if (u(t12, i11)) {
                    p1.N(t11, N, p1.y(t12, N));
                    g0(t11, i11);
                    return;
                }
                return;
            case 15:
                if (u(t12, i11)) {
                    p1.M(t11, N, p1.x(t12, N));
                    g0(t11, i11);
                    return;
                }
                return;
            case 16:
                if (u(t12, i11)) {
                    p1.N(t11, N, p1.y(t12, N));
                    g0(t11, i11);
                    return;
                }
                return;
            case 17:
                G(t11, t12, i11);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f16398n.d(t11, t12, N);
                return;
            case 50:
                h1.F(this.f16401q, t11, t12, N);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (A(t12, M, i11)) {
                    p1.O(t11, N, p1.A(t12, N));
                    h0(t11, M, i11);
                    return;
                }
                return;
            case 60:
                H(t11, t12, i11);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (A(t12, M, i11)) {
                    p1.O(t11, N, p1.A(t12, N));
                    h0(t11, M, i11);
                    return;
                }
                return;
            case 68:
                H(t11, t12, i11);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> t0<T> J(Class<T> cls, o0 o0Var, v0 v0Var, g0 g0Var, l1<?, ?> l1Var, q<?> qVar, l0 l0Var) {
        if (o0Var instanceof d1) {
            return L((d1) o0Var, v0Var, g0Var, l1Var, qVar, l0Var);
        }
        return K((j1) o0Var, v0Var, g0Var, l1Var, qVar, l0Var);
    }

    static <T> t0<T> K(j1 j1Var, v0 v0Var, g0 g0Var, l1<?, ?> l1Var, q<?> qVar, l0 l0Var) {
        boolean z11 = j1Var.getSyntax() == a1.PROTO3;
        t[] b11 = j1Var.b();
        if (b11.length == 0) {
            int length = b11.length;
            int[] iArr = new int[length * 3];
            Object[] objArr = new Object[length * 2];
            if (b11.length <= 0) {
                int[] a11 = j1Var.a();
                if (a11 == null) {
                    a11 = f16383r;
                }
                if (b11.length <= 0) {
                    int[] iArr2 = f16383r;
                    int[] iArr3 = f16383r;
                    int[] iArr4 = new int[a11.length + iArr2.length + iArr3.length];
                    System.arraycopy(a11, 0, iArr4, 0, a11.length);
                    System.arraycopy(iArr2, 0, iArr4, a11.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, a11.length + iArr2.length, iArr3.length);
                    return new t0<>(iArr, objArr, 0, 0, j1Var.getDefaultInstance(), z11, true, iArr4, a11.length, a11.length + iArr2.length, v0Var, g0Var, l1Var, qVar, l0Var);
                }
                t tVar = b11[0];
                throw null;
            }
            t tVar2 = b11[0];
            throw null;
        }
        t tVar3 = b11[0];
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x039e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> com.google.crypto.tink.shaded.protobuf.t0<T> L(com.google.crypto.tink.shaded.protobuf.d1 r36, com.google.crypto.tink.shaded.protobuf.v0 r37, com.google.crypto.tink.shaded.protobuf.g0 r38, com.google.crypto.tink.shaded.protobuf.l1<?, ?> r39, com.google.crypto.tink.shaded.protobuf.q<?> r40, com.google.crypto.tink.shaded.protobuf.l0 r41) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.L(com.google.crypto.tink.shaded.protobuf.d1, com.google.crypto.tink.shaded.protobuf.v0, com.google.crypto.tink.shaded.protobuf.g0, com.google.crypto.tink.shaded.protobuf.l1, com.google.crypto.tink.shaded.protobuf.q, com.google.crypto.tink.shaded.protobuf.l0):com.google.crypto.tink.shaded.protobuf.t0");
    }

    private int M(int i11) {
        return this.f16385a[i11];
    }

    private static long N(int i11) {
        return i11 & 1048575;
    }

    private static <T> boolean O(T t11, long j11) {
        return ((Boolean) p1.A(t11, j11)).booleanValue();
    }

    private static <T> double P(T t11, long j11) {
        return ((Double) p1.A(t11, j11)).doubleValue();
    }

    private static <T> float Q(T t11, long j11) {
        return ((Float) p1.A(t11, j11)).floatValue();
    }

    private static <T> int R(T t11, long j11) {
        return ((Integer) p1.A(t11, j11)).intValue();
    }

    private static <T> long S(T t11, long j11) {
        return ((Long) p1.A(t11, j11)).longValue();
    }

    private <K, V> int T(T t11, byte[] bArr, int i11, int i12, int i13, long j11, e.b bVar) {
        Unsafe unsafe = f16384s;
        Object m11 = m(i13);
        Object object = unsafe.getObject(t11, j11);
        if (this.f16401q.isImmutable(object)) {
            Object newMapField = this.f16401q.newMapField(m11);
            this.f16401q.mergeFrom(newMapField, object);
            unsafe.putObject(t11, j11, newMapField);
            object = newMapField;
        }
        return f(bArr, i11, i12, this.f16401q.forMapMetadata(m11), this.f16401q.forMutableMapData(object), bVar);
    }

    private int U(T t11, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, int i18, e.b bVar) {
        Unsafe unsafe = f16384s;
        long j12 = this.f16385a[i18 + 2] & 1048575;
        switch (i17) {
            case 51:
                if (i15 == 1) {
                    unsafe.putObject(t11, j11, Double.valueOf(e.d(bArr, i11)));
                    int i19 = i11 + 8;
                    unsafe.putInt(t11, j12, i14);
                    return i19;
                }
                break;
            case 52:
                if (i15 == 5) {
                    unsafe.putObject(t11, j11, Float.valueOf(e.l(bArr, i11)));
                    int i21 = i11 + 4;
                    unsafe.putInt(t11, j12, i14);
                    return i21;
                }
                break;
            case 53:
            case 54:
                if (i15 == 0) {
                    int L = e.L(bArr, i11, bVar);
                    unsafe.putObject(t11, j11, Long.valueOf(bVar.f16254b));
                    unsafe.putInt(t11, j12, i14);
                    return L;
                }
                break;
            case 55:
            case 62:
                if (i15 == 0) {
                    int I = e.I(bArr, i11, bVar);
                    unsafe.putObject(t11, j11, Integer.valueOf(bVar.f16253a));
                    unsafe.putInt(t11, j12, i14);
                    return I;
                }
                break;
            case 56:
            case 65:
                if (i15 == 1) {
                    unsafe.putObject(t11, j11, Long.valueOf(e.j(bArr, i11)));
                    int i22 = i11 + 8;
                    unsafe.putInt(t11, j12, i14);
                    return i22;
                }
                break;
            case 57:
            case 64:
                if (i15 == 5) {
                    unsafe.putObject(t11, j11, Integer.valueOf(e.h(bArr, i11)));
                    int i23 = i11 + 4;
                    unsafe.putInt(t11, j12, i14);
                    return i23;
                }
                break;
            case 58:
                if (i15 == 0) {
                    int L2 = e.L(bArr, i11, bVar);
                    unsafe.putObject(t11, j11, Boolean.valueOf(bVar.f16254b != 0));
                    unsafe.putInt(t11, j12, i14);
                    return L2;
                }
                break;
            case 59:
                if (i15 == 2) {
                    int I2 = e.I(bArr, i11, bVar);
                    int i24 = bVar.f16253a;
                    if (i24 == 0) {
                        unsafe.putObject(t11, j11, "");
                    } else if ((i16 & PKIFailureInfo.duplicateCertReq) != 0 && !q1.n(bArr, I2, I2 + i24)) {
                        throw InvalidProtocolBufferException.c();
                    } else {
                        unsafe.putObject(t11, j11, new String(bArr, I2, i24, a0.f16230a));
                        I2 += i24;
                    }
                    unsafe.putInt(t11, j12, i14);
                    return I2;
                }
                break;
            case 60:
                if (i15 == 2) {
                    int p11 = e.p(n(i18), bArr, i11, i12, bVar);
                    Object object = unsafe.getInt(t11, j12) == i14 ? unsafe.getObject(t11, j11) : null;
                    if (object == null) {
                        unsafe.putObject(t11, j11, bVar.f16255c);
                    } else {
                        unsafe.putObject(t11, j11, a0.h(object, bVar.f16255c));
                    }
                    unsafe.putInt(t11, j12, i14);
                    return p11;
                }
                break;
            case 61:
                if (i15 == 2) {
                    int b11 = e.b(bArr, i11, bVar);
                    unsafe.putObject(t11, j11, bVar.f16255c);
                    unsafe.putInt(t11, j12, i14);
                    return b11;
                }
                break;
            case 63:
                if (i15 == 0) {
                    int I3 = e.I(bArr, i11, bVar);
                    int i25 = bVar.f16253a;
                    a0.e l11 = l(i18);
                    if (l11 != null && !l11.isInRange(i25)) {
                        o(t11).n(i13, Long.valueOf(i25));
                    } else {
                        unsafe.putObject(t11, j11, Integer.valueOf(i25));
                        unsafe.putInt(t11, j12, i14);
                    }
                    return I3;
                }
                break;
            case 66:
                if (i15 == 0) {
                    int I4 = e.I(bArr, i11, bVar);
                    unsafe.putObject(t11, j11, Integer.valueOf(j.b(bVar.f16253a)));
                    unsafe.putInt(t11, j12, i14);
                    return I4;
                }
                break;
            case 67:
                if (i15 == 0) {
                    int L3 = e.L(bArr, i11, bVar);
                    unsafe.putObject(t11, j11, Long.valueOf(j.c(bVar.f16254b)));
                    unsafe.putInt(t11, j12, i14);
                    return L3;
                }
                break;
            case 68:
                if (i15 == 3) {
                    int n11 = e.n(n(i18), bArr, i11, i12, (i13 & (-8)) | 4, bVar);
                    Object object2 = unsafe.getInt(t11, j12) == i14 ? unsafe.getObject(t11, j11) : null;
                    if (object2 == null) {
                        unsafe.putObject(t11, j11, bVar.f16255c);
                    } else {
                        unsafe.putObject(t11, j11, a0.h(object2, bVar.f16255c));
                    }
                    unsafe.putInt(t11, j12, i14);
                    return n11;
                }
                break;
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x022b, code lost:
        if (r0 != r15) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x022e, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01de, code lost:
        if (r0 != r15) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x020c, code lost:
        if (r0 != r15) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int W(T r28, byte[] r29, int r30, int r31, com.google.crypto.tink.shaded.protobuf.e.b r32) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.W(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    private int X(T t11, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, long j11, int i17, long j12, e.b bVar) {
        int J;
        Unsafe unsafe = f16384s;
        a0.i iVar = (a0.i) unsafe.getObject(t11, j12);
        if (!iVar.isModifiable()) {
            int size = iVar.size();
            iVar = iVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            unsafe.putObject(t11, j12, iVar);
        }
        switch (i17) {
            case 18:
            case 35:
                if (i15 == 2) {
                    return e.s(bArr, i11, iVar, bVar);
                }
                if (i15 == 1) {
                    return e.e(i13, bArr, i11, i12, iVar, bVar);
                }
                break;
            case 19:
            case 36:
                if (i15 == 2) {
                    return e.v(bArr, i11, iVar, bVar);
                }
                if (i15 == 5) {
                    return e.m(i13, bArr, i11, i12, iVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i15 == 2) {
                    return e.z(bArr, i11, iVar, bVar);
                }
                if (i15 == 0) {
                    return e.M(i13, bArr, i11, i12, iVar, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i15 == 2) {
                    return e.y(bArr, i11, iVar, bVar);
                }
                if (i15 == 0) {
                    return e.J(i13, bArr, i11, i12, iVar, bVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i15 == 2) {
                    return e.u(bArr, i11, iVar, bVar);
                }
                if (i15 == 1) {
                    return e.k(i13, bArr, i11, i12, iVar, bVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i15 == 2) {
                    return e.t(bArr, i11, iVar, bVar);
                }
                if (i15 == 5) {
                    return e.i(i13, bArr, i11, i12, iVar, bVar);
                }
                break;
            case 25:
            case 42:
                if (i15 == 2) {
                    return e.r(bArr, i11, iVar, bVar);
                }
                if (i15 == 0) {
                    return e.a(i13, bArr, i11, i12, iVar, bVar);
                }
                break;
            case 26:
                if (i15 == 2) {
                    if ((j11 & 536870912) == 0) {
                        return e.D(i13, bArr, i11, i12, iVar, bVar);
                    }
                    return e.E(i13, bArr, i11, i12, iVar, bVar);
                }
                break;
            case 27:
                if (i15 == 2) {
                    return e.q(n(i16), i13, bArr, i11, i12, iVar, bVar);
                }
                break;
            case 28:
                if (i15 == 2) {
                    return e.c(i13, bArr, i11, i12, iVar, bVar);
                }
                break;
            case 30:
            case 44:
                if (i15 == 2) {
                    J = e.y(bArr, i11, iVar, bVar);
                } else if (i15 == 0) {
                    J = e.J(i13, bArr, i11, i12, iVar, bVar);
                }
                y yVar = (y) t11;
                m1 m1Var = yVar.unknownFields;
                if (m1Var == m1.e()) {
                    m1Var = null;
                }
                m1 m1Var2 = (m1) h1.A(i14, iVar, l(i16), m1Var, this.f16399o);
                if (m1Var2 != null) {
                    yVar.unknownFields = m1Var2;
                }
                return J;
            case 33:
            case 47:
                if (i15 == 2) {
                    return e.w(bArr, i11, iVar, bVar);
                }
                if (i15 == 0) {
                    return e.A(i13, bArr, i11, i12, iVar, bVar);
                }
                break;
            case 34:
            case 48:
                if (i15 == 2) {
                    return e.x(bArr, i11, iVar, bVar);
                }
                if (i15 == 0) {
                    return e.B(i13, bArr, i11, i12, iVar, bVar);
                }
                break;
            case 49:
                if (i15 == 3) {
                    return e.o(n(i16), i13, bArr, i11, i12, iVar, bVar);
                }
                break;
        }
        return i11;
    }

    private int Y(int i11) {
        if (i11 < this.f16387c || i11 > this.f16388d) {
            return -1;
        }
        return i0(i11, 0);
    }

    private int Z(int i11, int i12) {
        if (i11 < this.f16387c || i11 > this.f16388d) {
            return -1;
        }
        return i0(i11, i12);
    }

    private int a0(int i11) {
        return this.f16385a[i11 + 2];
    }

    private <E> void b0(Object obj, long j11, e1 e1Var, f1<E> f1Var, p pVar) {
        e1Var.g(this.f16398n.e(obj, j11), f1Var, pVar);
    }

    private <E> void c0(Object obj, int i11, e1 e1Var, f1<E> f1Var, p pVar) {
        e1Var.d(this.f16398n.e(obj, N(i11)), f1Var, pVar);
    }

    private boolean d(T t11, T t12, int i11) {
        return u(t11, i11) == u(t12, i11);
    }

    private void d0(Object obj, int i11, e1 e1Var) {
        if (t(i11)) {
            p1.O(obj, N(i11), e1Var.readStringRequireUtf8());
        } else if (this.f16391g) {
            p1.O(obj, N(i11), e1Var.readString());
        } else {
            p1.O(obj, N(i11), e1Var.readBytes());
        }
    }

    private static <T> boolean e(T t11, long j11) {
        return p1.p(t11, j11);
    }

    private void e0(Object obj, int i11, e1 e1Var) {
        if (t(i11)) {
            e1Var.readStringListRequireUtf8(this.f16398n.e(obj, N(i11)));
        } else {
            e1Var.readStringList(this.f16398n.e(obj, N(i11)));
        }
    }

    private <K, V> int f(byte[] bArr, int i11, int i12, j0.a<K, V> aVar, Map<K, V> map, e.b bVar) {
        int I = e.I(bArr, i11, bVar);
        int i13 = bVar.f16253a;
        if (i13 >= 0 && i13 <= i12 - I) {
            throw null;
        }
        throw InvalidProtocolBufferException.j();
    }

    private static Field f0(Class<?> cls, String str) {
        Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static <T> double g(T t11, long j11) {
        return p1.v(t11, j11);
    }

    private void g0(T t11, int i11) {
        if (this.f16392h) {
            return;
        }
        int a02 = a0(i11);
        long j11 = a02 & 1048575;
        p1.M(t11, j11, p1.x(t11, j11) | (1 << (a02 >>> 20)));
    }

    private boolean h(T t11, T t12, int i11) {
        int k02 = k0(i11);
        long N = N(k02);
        switch (j0(k02)) {
            case 0:
                return d(t11, t12, i11) && Double.doubleToLongBits(p1.v(t11, N)) == Double.doubleToLongBits(p1.v(t12, N));
            case 1:
                return d(t11, t12, i11) && Float.floatToIntBits(p1.w(t11, N)) == Float.floatToIntBits(p1.w(t12, N));
            case 2:
                return d(t11, t12, i11) && p1.y(t11, N) == p1.y(t12, N);
            case 3:
                return d(t11, t12, i11) && p1.y(t11, N) == p1.y(t12, N);
            case 4:
                return d(t11, t12, i11) && p1.x(t11, N) == p1.x(t12, N);
            case 5:
                return d(t11, t12, i11) && p1.y(t11, N) == p1.y(t12, N);
            case 6:
                return d(t11, t12, i11) && p1.x(t11, N) == p1.x(t12, N);
            case 7:
                return d(t11, t12, i11) && p1.p(t11, N) == p1.p(t12, N);
            case 8:
                return d(t11, t12, i11) && h1.K(p1.A(t11, N), p1.A(t12, N));
            case 9:
                return d(t11, t12, i11) && h1.K(p1.A(t11, N), p1.A(t12, N));
            case 10:
                return d(t11, t12, i11) && h1.K(p1.A(t11, N), p1.A(t12, N));
            case 11:
                return d(t11, t12, i11) && p1.x(t11, N) == p1.x(t12, N);
            case 12:
                return d(t11, t12, i11) && p1.x(t11, N) == p1.x(t12, N);
            case 13:
                return d(t11, t12, i11) && p1.x(t11, N) == p1.x(t12, N);
            case 14:
                return d(t11, t12, i11) && p1.y(t11, N) == p1.y(t12, N);
            case 15:
                return d(t11, t12, i11) && p1.x(t11, N) == p1.x(t12, N);
            case 16:
                return d(t11, t12, i11) && p1.y(t11, N) == p1.y(t12, N);
            case 17:
                return d(t11, t12, i11) && h1.K(p1.A(t11, N), p1.A(t12, N));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return h1.K(p1.A(t11, N), p1.A(t12, N));
            case 50:
                return h1.K(p1.A(t11, N), p1.A(t12, N));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return z(t11, t12, i11) && h1.K(p1.A(t11, N), p1.A(t12, N));
            default:
                return true;
        }
    }

    private void h0(T t11, int i11, int i12) {
        p1.M(t11, a0(i12) & 1048575, i11);
    }

    private final <UT, UB> UB i(Object obj, int i11, UB ub2, l1<UT, UB> l1Var) {
        a0.e l11;
        int M = M(i11);
        Object A = p1.A(obj, N(k0(i11)));
        return (A == null || (l11 = l(i11)) == null) ? ub2 : (UB) j(i11, M, this.f16401q.forMutableMapData(A), l11, ub2, l1Var);
    }

    private int i0(int i11, int i12) {
        int length = (this.f16385a.length / 3) - 1;
        while (i12 <= length) {
            int i13 = (length + i12) >>> 1;
            int i14 = i13 * 3;
            int M = M(i14);
            if (i11 == M) {
                return i14;
            }
            if (i11 < M) {
                length = i13 - 1;
            } else {
                i12 = i13 + 1;
            }
        }
        return -1;
    }

    private final <K, V, UT, UB> UB j(int i11, int i12, Map<K, V> map, a0.e eVar, UB ub2, l1<UT, UB> l1Var) {
        j0.a<?, ?> forMapMetadata = this.f16401q.forMapMetadata(m(i11));
        Iterator<Map.Entry<K, V>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<K, V> next = it2.next();
            if (!eVar.isInRange(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = l1Var.n();
                }
                i.h o11 = i.o(j0.b(forMapMetadata, next.getKey(), next.getValue()));
                try {
                    j0.d(o11.b(), forMapMetadata, next.getKey(), next.getValue());
                    l1Var.d(ub2, i12, o11.a());
                    it2.remove();
                } catch (IOException e11) {
                    throw new RuntimeException(e11);
                }
            }
        }
        return ub2;
    }

    private static int j0(int i11) {
        return (i11 & 267386880) >>> 20;
    }

    private static <T> float k(T t11, long j11) {
        return p1.w(t11, j11);
    }

    private int k0(int i11) {
        return this.f16385a[i11 + 1];
    }

    private a0.e l(int i11) {
        return (a0.e) this.f16386b[((i11 / 3) * 2) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x049e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void l0(T r18, com.google.crypto.tink.shaded.protobuf.s1 r19) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.l0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.s1):void");
    }

    private Object m(int i11) {
        return this.f16386b[(i11 / 3) * 2];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m0(T r13, com.google.crypto.tink.shaded.protobuf.s1 r14) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.m0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.s1):void");
    }

    private f1 n(int i11) {
        int i12 = (i11 / 3) * 2;
        f1 f1Var = (f1) this.f16386b[i12];
        if (f1Var != null) {
            return f1Var;
        }
        f1<T> d11 = b1.a().d((Class) this.f16386b[i12 + 1]);
        this.f16386b[i12] = d11;
        return d11;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x058e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void n0(T r11, com.google.crypto.tink.shaded.protobuf.s1 r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.n0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.s1):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m1 o(Object obj) {
        y yVar = (y) obj;
        m1 m1Var = yVar.unknownFields;
        if (m1Var == m1.e()) {
            m1 l11 = m1.l();
            yVar.unknownFields = l11;
            return l11;
        }
        return m1Var;
    }

    private <K, V> void o0(s1 s1Var, int i11, Object obj, int i12) {
        if (obj != null) {
            s1Var.a(i11, this.f16401q.forMapMetadata(m(i12)), this.f16401q.forMapData(obj));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int p(T t11) {
        int i11;
        int i12;
        int i13;
        int d11;
        int K;
        boolean z11;
        int f11;
        int i14;
        int U;
        int W;
        Unsafe unsafe = f16384s;
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < this.f16385a.length) {
            int k02 = k0(i16);
            int M = M(i16);
            int j02 = j0(k02);
            if (j02 <= 17) {
                i11 = this.f16385a[i16 + 2];
                int i19 = 1048575 & i11;
                int i21 = 1 << (i11 >>> 20);
                if (i19 != i15) {
                    i18 = unsafe.getInt(t11, i19);
                    i15 = i19;
                }
                i12 = i21;
            } else {
                i11 = (!this.f16393i || j02 < v.DOUBLE_LIST_PACKED.id() || j02 > v.SINT64_LIST_PACKED.id()) ? 0 : this.f16385a[i16 + 2] & 1048575;
                i12 = 0;
            }
            long N = N(k02);
            int i22 = i15;
            switch (j02) {
                case 0:
                    if ((i18 & i12) == 0) {
                        break;
                    } else {
                        i13 = CodedOutputStream.i(M, 0.0d);
                        i17 += i13;
                        break;
                    }
                case 1:
                    if ((i18 & i12) == 0) {
                        break;
                    } else {
                        i13 = CodedOutputStream.q(M, BitmapDescriptorFactory.HUE_RED);
                        i17 += i13;
                        break;
                    }
                case 2:
                    if ((i18 & i12) == 0) {
                        break;
                    } else {
                        i13 = CodedOutputStream.x(M, unsafe.getLong(t11, N));
                        i17 += i13;
                        break;
                    }
                case 3:
                    if ((i18 & i12) == 0) {
                        break;
                    } else {
                        i13 = CodedOutputStream.X(M, unsafe.getLong(t11, N));
                        i17 += i13;
                        break;
                    }
                case 4:
                    if ((i18 & i12) == 0) {
                        break;
                    } else {
                        i13 = CodedOutputStream.v(M, unsafe.getInt(t11, N));
                        i17 += i13;
                        break;
                    }
                case 5:
                    if ((i18 & i12) == 0) {
                        break;
                    } else {
                        i13 = CodedOutputStream.o(M, 0L);
                        i17 += i13;
                        break;
                    }
                case 6:
                    if ((i18 & i12) != 0) {
                        i13 = CodedOutputStream.m(M, 0);
                        i17 += i13;
                        break;
                    }
                    break;
                case 7:
                    if ((i18 & i12) != 0) {
                        d11 = CodedOutputStream.d(M, true);
                        i17 += d11;
                    }
                    break;
                case 8:
                    if ((i18 & i12) != 0) {
                        Object object = unsafe.getObject(t11, N);
                        if (object instanceof i) {
                            d11 = CodedOutputStream.g(M, (i) object);
                        } else {
                            d11 = CodedOutputStream.S(M, (String) object);
                        }
                        i17 += d11;
                    }
                    break;
                case 9:
                    if ((i18 & i12) != 0) {
                        d11 = h1.o(M, unsafe.getObject(t11, N), n(i16));
                        i17 += d11;
                    }
                    break;
                case 10:
                    if ((i18 & i12) != 0) {
                        d11 = CodedOutputStream.g(M, (i) unsafe.getObject(t11, N));
                        i17 += d11;
                    }
                    break;
                case 11:
                    if ((i18 & i12) != 0) {
                        d11 = CodedOutputStream.V(M, unsafe.getInt(t11, N));
                        i17 += d11;
                    }
                    break;
                case 12:
                    if ((i18 & i12) != 0) {
                        d11 = CodedOutputStream.k(M, unsafe.getInt(t11, N));
                        i17 += d11;
                    }
                    break;
                case 13:
                    if ((i18 & i12) != 0) {
                        K = CodedOutputStream.K(M, 0);
                        i17 += K;
                    }
                    break;
                case 14:
                    if ((i18 & i12) != 0) {
                        d11 = CodedOutputStream.M(M, 0L);
                        i17 += d11;
                    }
                    break;
                case 15:
                    if ((i18 & i12) != 0) {
                        d11 = CodedOutputStream.O(M, unsafe.getInt(t11, N));
                        i17 += d11;
                    }
                    break;
                case 16:
                    if ((i18 & i12) != 0) {
                        d11 = CodedOutputStream.Q(M, unsafe.getLong(t11, N));
                        i17 += d11;
                    }
                    break;
                case 17:
                    if ((i18 & i12) != 0) {
                        d11 = CodedOutputStream.s(M, (q0) unsafe.getObject(t11, N), n(i16));
                        i17 += d11;
                    }
                    break;
                case 18:
                    d11 = h1.h(M, (List) unsafe.getObject(t11, N), false);
                    i17 += d11;
                    break;
                case 19:
                    z11 = false;
                    f11 = h1.f(M, (List) unsafe.getObject(t11, N), false);
                    i17 += f11;
                    break;
                case 20:
                    z11 = false;
                    f11 = h1.m(M, (List) unsafe.getObject(t11, N), false);
                    i17 += f11;
                    break;
                case 21:
                    z11 = false;
                    f11 = h1.x(M, (List) unsafe.getObject(t11, N), false);
                    i17 += f11;
                    break;
                case 22:
                    z11 = false;
                    f11 = h1.k(M, (List) unsafe.getObject(t11, N), false);
                    i17 += f11;
                    break;
                case 23:
                    z11 = false;
                    f11 = h1.h(M, (List) unsafe.getObject(t11, N), false);
                    i17 += f11;
                    break;
                case 24:
                    z11 = false;
                    f11 = h1.f(M, (List) unsafe.getObject(t11, N), false);
                    i17 += f11;
                    break;
                case 25:
                    z11 = false;
                    f11 = h1.a(M, (List) unsafe.getObject(t11, N), false);
                    i17 += f11;
                    break;
                case 26:
                    d11 = h1.u(M, (List) unsafe.getObject(t11, N));
                    i17 += d11;
                    break;
                case 27:
                    d11 = h1.p(M, (List) unsafe.getObject(t11, N), n(i16));
                    i17 += d11;
                    break;
                case 28:
                    d11 = h1.c(M, (List) unsafe.getObject(t11, N));
                    i17 += d11;
                    break;
                case 29:
                    d11 = h1.v(M, (List) unsafe.getObject(t11, N), false);
                    i17 += d11;
                    break;
                case 30:
                    z11 = false;
                    f11 = h1.d(M, (List) unsafe.getObject(t11, N), false);
                    i17 += f11;
                    break;
                case 31:
                    z11 = false;
                    f11 = h1.f(M, (List) unsafe.getObject(t11, N), false);
                    i17 += f11;
                    break;
                case 32:
                    z11 = false;
                    f11 = h1.h(M, (List) unsafe.getObject(t11, N), false);
                    i17 += f11;
                    break;
                case 33:
                    z11 = false;
                    f11 = h1.q(M, (List) unsafe.getObject(t11, N), false);
                    i17 += f11;
                    break;
                case 34:
                    z11 = false;
                    f11 = h1.s(M, (List) unsafe.getObject(t11, N), false);
                    i17 += f11;
                    break;
                case 35:
                    i14 = h1.i((List) unsafe.getObject(t11, N));
                    if (i14 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i11, i14);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i14);
                        K = U + W + i14;
                        i17 += K;
                    }
                    break;
                case 36:
                    i14 = h1.g((List) unsafe.getObject(t11, N));
                    if (i14 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i11, i14);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i14);
                        K = U + W + i14;
                        i17 += K;
                    }
                    break;
                case 37:
                    i14 = h1.n((List) unsafe.getObject(t11, N));
                    if (i14 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i11, i14);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i14);
                        K = U + W + i14;
                        i17 += K;
                    }
                    break;
                case 38:
                    i14 = h1.y((List) unsafe.getObject(t11, N));
                    if (i14 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i11, i14);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i14);
                        K = U + W + i14;
                        i17 += K;
                    }
                    break;
                case 39:
                    i14 = h1.l((List) unsafe.getObject(t11, N));
                    if (i14 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i11, i14);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i14);
                        K = U + W + i14;
                        i17 += K;
                    }
                    break;
                case 40:
                    i14 = h1.i((List) unsafe.getObject(t11, N));
                    if (i14 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i11, i14);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i14);
                        K = U + W + i14;
                        i17 += K;
                    }
                    break;
                case 41:
                    i14 = h1.g((List) unsafe.getObject(t11, N));
                    if (i14 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i11, i14);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i14);
                        K = U + W + i14;
                        i17 += K;
                    }
                    break;
                case 42:
                    i14 = h1.b((List) unsafe.getObject(t11, N));
                    if (i14 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i11, i14);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i14);
                        K = U + W + i14;
                        i17 += K;
                    }
                    break;
                case 43:
                    i14 = h1.w((List) unsafe.getObject(t11, N));
                    if (i14 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i11, i14);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i14);
                        K = U + W + i14;
                        i17 += K;
                    }
                    break;
                case 44:
                    i14 = h1.e((List) unsafe.getObject(t11, N));
                    if (i14 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i11, i14);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i14);
                        K = U + W + i14;
                        i17 += K;
                    }
                    break;
                case 45:
                    i14 = h1.g((List) unsafe.getObject(t11, N));
                    if (i14 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i11, i14);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i14);
                        K = U + W + i14;
                        i17 += K;
                    }
                    break;
                case 46:
                    i14 = h1.i((List) unsafe.getObject(t11, N));
                    if (i14 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i11, i14);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i14);
                        K = U + W + i14;
                        i17 += K;
                    }
                    break;
                case 47:
                    i14 = h1.r((List) unsafe.getObject(t11, N));
                    if (i14 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i11, i14);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i14);
                        K = U + W + i14;
                        i17 += K;
                    }
                    break;
                case 48:
                    i14 = h1.t((List) unsafe.getObject(t11, N));
                    if (i14 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i11, i14);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i14);
                        K = U + W + i14;
                        i17 += K;
                    }
                    break;
                case 49:
                    d11 = h1.j(M, (List) unsafe.getObject(t11, N), n(i16));
                    i17 += d11;
                    break;
                case 50:
                    d11 = this.f16401q.getSerializedSize(M, unsafe.getObject(t11, N), m(i16));
                    i17 += d11;
                    break;
                case 51:
                    if (A(t11, M, i16)) {
                        d11 = CodedOutputStream.i(M, 0.0d);
                        i17 += d11;
                    }
                    break;
                case 52:
                    if (A(t11, M, i16)) {
                        d11 = CodedOutputStream.q(M, BitmapDescriptorFactory.HUE_RED);
                        i17 += d11;
                    }
                    break;
                case 53:
                    if (A(t11, M, i16)) {
                        d11 = CodedOutputStream.x(M, S(t11, N));
                        i17 += d11;
                    }
                    break;
                case 54:
                    if (A(t11, M, i16)) {
                        d11 = CodedOutputStream.X(M, S(t11, N));
                        i17 += d11;
                    }
                    break;
                case 55:
                    if (A(t11, M, i16)) {
                        d11 = CodedOutputStream.v(M, R(t11, N));
                        i17 += d11;
                    }
                    break;
                case 56:
                    if (A(t11, M, i16)) {
                        d11 = CodedOutputStream.o(M, 0L);
                        i17 += d11;
                    }
                    break;
                case 57:
                    if (A(t11, M, i16)) {
                        K = CodedOutputStream.m(M, 0);
                        i17 += K;
                    }
                    break;
                case 58:
                    if (A(t11, M, i16)) {
                        d11 = CodedOutputStream.d(M, true);
                        i17 += d11;
                    }
                    break;
                case 59:
                    if (A(t11, M, i16)) {
                        Object object2 = unsafe.getObject(t11, N);
                        if (object2 instanceof i) {
                            d11 = CodedOutputStream.g(M, (i) object2);
                        } else {
                            d11 = CodedOutputStream.S(M, (String) object2);
                        }
                        i17 += d11;
                    }
                    break;
                case 60:
                    if (A(t11, M, i16)) {
                        d11 = h1.o(M, unsafe.getObject(t11, N), n(i16));
                        i17 += d11;
                    }
                    break;
                case 61:
                    if (A(t11, M, i16)) {
                        d11 = CodedOutputStream.g(M, (i) unsafe.getObject(t11, N));
                        i17 += d11;
                    }
                    break;
                case 62:
                    if (A(t11, M, i16)) {
                        d11 = CodedOutputStream.V(M, R(t11, N));
                        i17 += d11;
                    }
                    break;
                case 63:
                    if (A(t11, M, i16)) {
                        d11 = CodedOutputStream.k(M, R(t11, N));
                        i17 += d11;
                    }
                    break;
                case 64:
                    if (A(t11, M, i16)) {
                        K = CodedOutputStream.K(M, 0);
                        i17 += K;
                    }
                    break;
                case 65:
                    if (A(t11, M, i16)) {
                        d11 = CodedOutputStream.M(M, 0L);
                        i17 += d11;
                    }
                    break;
                case 66:
                    if (A(t11, M, i16)) {
                        d11 = CodedOutputStream.O(M, R(t11, N));
                        i17 += d11;
                    }
                    break;
                case 67:
                    if (A(t11, M, i16)) {
                        d11 = CodedOutputStream.Q(M, S(t11, N));
                        i17 += d11;
                    }
                    break;
                case 68:
                    if (A(t11, M, i16)) {
                        d11 = CodedOutputStream.s(M, (q0) unsafe.getObject(t11, N), n(i16));
                        i17 += d11;
                    }
                    break;
            }
            i16 += 3;
            i15 = i22;
        }
        int r11 = i17 + r(this.f16399o, t11);
        return this.f16390f ? r11 + this.f16400p.c(t11).l() : r11;
    }

    private void p0(int i11, Object obj, s1 s1Var) {
        if (obj instanceof String) {
            s1Var.writeString(i11, (String) obj);
        } else {
            s1Var.d(i11, (i) obj);
        }
    }

    private int q(T t11) {
        int i11;
        int i12;
        int U;
        int W;
        Unsafe unsafe = f16384s;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f16385a.length; i14 += 3) {
            int k02 = k0(i14);
            int j02 = j0(k02);
            int M = M(i14);
            long N = N(k02);
            int i15 = (j02 < v.DOUBLE_LIST_PACKED.id() || j02 > v.SINT64_LIST_PACKED.id()) ? 0 : this.f16385a[i14 + 2] & 1048575;
            switch (j02) {
                case 0:
                    if (u(t11, i14)) {
                        i11 = CodedOutputStream.i(M, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (u(t11, i14)) {
                        i11 = CodedOutputStream.q(M, BitmapDescriptorFactory.HUE_RED);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (u(t11, i14)) {
                        i11 = CodedOutputStream.x(M, p1.y(t11, N));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (u(t11, i14)) {
                        i11 = CodedOutputStream.X(M, p1.y(t11, N));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (u(t11, i14)) {
                        i11 = CodedOutputStream.v(M, p1.x(t11, N));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (u(t11, i14)) {
                        i11 = CodedOutputStream.o(M, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (u(t11, i14)) {
                        i11 = CodedOutputStream.m(M, 0);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (u(t11, i14)) {
                        i11 = CodedOutputStream.d(M, true);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (u(t11, i14)) {
                        Object A = p1.A(t11, N);
                        if (A instanceof i) {
                            i11 = CodedOutputStream.g(M, (i) A);
                            break;
                        } else {
                            i11 = CodedOutputStream.S(M, (String) A);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (u(t11, i14)) {
                        i11 = h1.o(M, p1.A(t11, N), n(i14));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (u(t11, i14)) {
                        i11 = CodedOutputStream.g(M, (i) p1.A(t11, N));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (u(t11, i14)) {
                        i11 = CodedOutputStream.V(M, p1.x(t11, N));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (u(t11, i14)) {
                        i11 = CodedOutputStream.k(M, p1.x(t11, N));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (u(t11, i14)) {
                        i11 = CodedOutputStream.K(M, 0);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (u(t11, i14)) {
                        i11 = CodedOutputStream.M(M, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (u(t11, i14)) {
                        i11 = CodedOutputStream.O(M, p1.x(t11, N));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (u(t11, i14)) {
                        i11 = CodedOutputStream.Q(M, p1.y(t11, N));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (u(t11, i14)) {
                        i11 = CodedOutputStream.s(M, (q0) p1.A(t11, N), n(i14));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    i11 = h1.h(M, C(t11, N), false);
                    break;
                case 19:
                    i11 = h1.f(M, C(t11, N), false);
                    break;
                case 20:
                    i11 = h1.m(M, C(t11, N), false);
                    break;
                case 21:
                    i11 = h1.x(M, C(t11, N), false);
                    break;
                case 22:
                    i11 = h1.k(M, C(t11, N), false);
                    break;
                case 23:
                    i11 = h1.h(M, C(t11, N), false);
                    break;
                case 24:
                    i11 = h1.f(M, C(t11, N), false);
                    break;
                case 25:
                    i11 = h1.a(M, C(t11, N), false);
                    break;
                case 26:
                    i11 = h1.u(M, C(t11, N));
                    break;
                case 27:
                    i11 = h1.p(M, C(t11, N), n(i14));
                    break;
                case 28:
                    i11 = h1.c(M, C(t11, N));
                    break;
                case 29:
                    i11 = h1.v(M, C(t11, N), false);
                    break;
                case 30:
                    i11 = h1.d(M, C(t11, N), false);
                    break;
                case 31:
                    i11 = h1.f(M, C(t11, N), false);
                    break;
                case 32:
                    i11 = h1.h(M, C(t11, N), false);
                    break;
                case 33:
                    i11 = h1.q(M, C(t11, N), false);
                    break;
                case 34:
                    i11 = h1.s(M, C(t11, N), false);
                    break;
                case 35:
                    i12 = h1.i((List) unsafe.getObject(t11, N));
                    if (i12 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i15, i12);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    i12 = h1.g((List) unsafe.getObject(t11, N));
                    if (i12 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i15, i12);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    i12 = h1.n((List) unsafe.getObject(t11, N));
                    if (i12 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i15, i12);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    i12 = h1.y((List) unsafe.getObject(t11, N));
                    if (i12 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i15, i12);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    i12 = h1.l((List) unsafe.getObject(t11, N));
                    if (i12 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i15, i12);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    i12 = h1.i((List) unsafe.getObject(t11, N));
                    if (i12 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i15, i12);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    i12 = h1.g((List) unsafe.getObject(t11, N));
                    if (i12 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i15, i12);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    i12 = h1.b((List) unsafe.getObject(t11, N));
                    if (i12 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i15, i12);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    i12 = h1.w((List) unsafe.getObject(t11, N));
                    if (i12 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i15, i12);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    i12 = h1.e((List) unsafe.getObject(t11, N));
                    if (i12 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i15, i12);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    i12 = h1.g((List) unsafe.getObject(t11, N));
                    if (i12 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i15, i12);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    i12 = h1.i((List) unsafe.getObject(t11, N));
                    if (i12 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i15, i12);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    i12 = h1.r((List) unsafe.getObject(t11, N));
                    if (i12 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i15, i12);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    i12 = h1.t((List) unsafe.getObject(t11, N));
                    if (i12 > 0) {
                        if (this.f16393i) {
                            unsafe.putInt(t11, i15, i12);
                        }
                        U = CodedOutputStream.U(M);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    i11 = h1.j(M, C(t11, N), n(i14));
                    break;
                case 50:
                    i11 = this.f16401q.getSerializedSize(M, p1.A(t11, N), m(i14));
                    break;
                case 51:
                    if (A(t11, M, i14)) {
                        i11 = CodedOutputStream.i(M, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (A(t11, M, i14)) {
                        i11 = CodedOutputStream.q(M, BitmapDescriptorFactory.HUE_RED);
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (A(t11, M, i14)) {
                        i11 = CodedOutputStream.x(M, S(t11, N));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (A(t11, M, i14)) {
                        i11 = CodedOutputStream.X(M, S(t11, N));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (A(t11, M, i14)) {
                        i11 = CodedOutputStream.v(M, R(t11, N));
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (A(t11, M, i14)) {
                        i11 = CodedOutputStream.o(M, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (A(t11, M, i14)) {
                        i11 = CodedOutputStream.m(M, 0);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (A(t11, M, i14)) {
                        i11 = CodedOutputStream.d(M, true);
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (A(t11, M, i14)) {
                        Object A2 = p1.A(t11, N);
                        if (A2 instanceof i) {
                            i11 = CodedOutputStream.g(M, (i) A2);
                            break;
                        } else {
                            i11 = CodedOutputStream.S(M, (String) A2);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (A(t11, M, i14)) {
                        i11 = h1.o(M, p1.A(t11, N), n(i14));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (A(t11, M, i14)) {
                        i11 = CodedOutputStream.g(M, (i) p1.A(t11, N));
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (A(t11, M, i14)) {
                        i11 = CodedOutputStream.V(M, R(t11, N));
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (A(t11, M, i14)) {
                        i11 = CodedOutputStream.k(M, R(t11, N));
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (A(t11, M, i14)) {
                        i11 = CodedOutputStream.K(M, 0);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (A(t11, M, i14)) {
                        i11 = CodedOutputStream.M(M, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (A(t11, M, i14)) {
                        i11 = CodedOutputStream.O(M, R(t11, N));
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (A(t11, M, i14)) {
                        i11 = CodedOutputStream.Q(M, S(t11, N));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (A(t11, M, i14)) {
                        i11 = CodedOutputStream.s(M, (q0) p1.A(t11, N), n(i14));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i13 += i11;
        }
        return i13 + r(this.f16399o, t11);
    }

    private <UT, UB> void q0(l1<UT, UB> l1Var, T t11, s1 s1Var) {
        l1Var.t(l1Var.g(t11), s1Var);
    }

    private <UT, UB> int r(l1<UT, UB> l1Var, T t11) {
        return l1Var.h(l1Var.g(t11));
    }

    private static <T> int s(T t11, long j11) {
        return p1.x(t11, j11);
    }

    private static boolean t(int i11) {
        return (i11 & PKIFailureInfo.duplicateCertReq) != 0;
    }

    private boolean u(T t11, int i11) {
        if (this.f16392h) {
            int k02 = k0(i11);
            long N = N(k02);
            switch (j0(k02)) {
                case 0:
                    return p1.v(t11, N) != 0.0d;
                case 1:
                    return p1.w(t11, N) != BitmapDescriptorFactory.HUE_RED;
                case 2:
                    return p1.y(t11, N) != 0;
                case 3:
                    return p1.y(t11, N) != 0;
                case 4:
                    return p1.x(t11, N) != 0;
                case 5:
                    return p1.y(t11, N) != 0;
                case 6:
                    return p1.x(t11, N) != 0;
                case 7:
                    return p1.p(t11, N);
                case 8:
                    Object A = p1.A(t11, N);
                    if (A instanceof String) {
                        return !((String) A).isEmpty();
                    }
                    if (A instanceof i) {
                        return !i.f16278b.equals(A);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return p1.A(t11, N) != null;
                case 10:
                    return !i.f16278b.equals(p1.A(t11, N));
                case 11:
                    return p1.x(t11, N) != 0;
                case 12:
                    return p1.x(t11, N) != 0;
                case 13:
                    return p1.x(t11, N) != 0;
                case 14:
                    return p1.y(t11, N) != 0;
                case 15:
                    return p1.x(t11, N) != 0;
                case 16:
                    return p1.y(t11, N) != 0;
                case 17:
                    return p1.A(t11, N) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int a02 = a0(i11);
        return (p1.x(t11, (long) (a02 & 1048575)) & (1 << (a02 >>> 20))) != 0;
    }

    private boolean v(T t11, int i11, int i12, int i13) {
        if (this.f16392h) {
            return u(t11, i11);
        }
        return (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean w(Object obj, int i11, f1 f1Var) {
        return f1Var.isInitialized(p1.A(obj, N(i11)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean x(Object obj, int i11, int i12) {
        List list = (List) p1.A(obj, N(i11));
        if (list.isEmpty()) {
            return true;
        }
        f1 n11 = n(i12);
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (!n11.isInitialized(list.get(i13))) {
                return false;
            }
        }
        return true;
    }

    private boolean y(T t11, int i11, int i12) {
        if (this.f16401q.forMapData(p1.A(t11, N(i11))).isEmpty()) {
            return true;
        }
        this.f16401q.forMapMetadata(m(i12));
        throw null;
    }

    private boolean z(T t11, T t12, int i11) {
        long a02 = a0(i11) & 1048575;
        return p1.x(t11, a02) == p1.x(t12, a02);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0359, code lost:
        if (r0 != r11) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x035b, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r9 = r36;
        r1 = r17;
        r3 = r18;
        r7 = r19;
        r2 = r20;
        r6 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03a2, code lost:
        if (r0 != r15) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03c5, code lost:
        if (r0 != r15) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03c8, code lost:
        r2 = r0;
        r8 = r18;
        r0 = r35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int V(T r31, byte[] r32, int r33, int r34, int r35, com.google.crypto.tink.shaded.protobuf.e.b r36) {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.V(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void a(T t11, byte[] bArr, int i11, int i12, e.b bVar) {
        if (this.f16392h) {
            W(t11, bArr, i11, i12, bVar);
        } else {
            V(t11, bArr, i11, i12, 0, bVar);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void b(T t11, e1 e1Var, p pVar) {
        Objects.requireNonNull(pVar);
        E(this.f16399o, this.f16400p, t11, e1Var, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void c(T t11, s1 s1Var) {
        if (s1Var.fieldOrder() == s1.a.DESCENDING) {
            n0(t11, s1Var);
        } else if (this.f16392h) {
            m0(t11, s1Var);
        } else {
            l0(t11, s1Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public boolean equals(T t11, T t12) {
        int length = this.f16385a.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            if (!h(t11, t12, i11)) {
                return false;
            }
        }
        if (this.f16399o.g(t11).equals(this.f16399o.g(t12))) {
            if (this.f16390f) {
                return this.f16400p.c(t11).equals(this.f16400p.c(t12));
            }
            return true;
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int getSerializedSize(T t11) {
        return this.f16392h ? q(t11) : p(t11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int hashCode(T t11) {
        int i11;
        int f11;
        int length = this.f16385a.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int k02 = k0(i13);
            int M = M(i13);
            long N = N(k02);
            int i14 = 37;
            switch (j0(k02)) {
                case 0:
                    i11 = i12 * 53;
                    f11 = a0.f(Double.doubleToLongBits(p1.v(t11, N)));
                    i12 = i11 + f11;
                    break;
                case 1:
                    i11 = i12 * 53;
                    f11 = Float.floatToIntBits(p1.w(t11, N));
                    i12 = i11 + f11;
                    break;
                case 2:
                    i11 = i12 * 53;
                    f11 = a0.f(p1.y(t11, N));
                    i12 = i11 + f11;
                    break;
                case 3:
                    i11 = i12 * 53;
                    f11 = a0.f(p1.y(t11, N));
                    i12 = i11 + f11;
                    break;
                case 4:
                    i11 = i12 * 53;
                    f11 = p1.x(t11, N);
                    i12 = i11 + f11;
                    break;
                case 5:
                    i11 = i12 * 53;
                    f11 = a0.f(p1.y(t11, N));
                    i12 = i11 + f11;
                    break;
                case 6:
                    i11 = i12 * 53;
                    f11 = p1.x(t11, N);
                    i12 = i11 + f11;
                    break;
                case 7:
                    i11 = i12 * 53;
                    f11 = a0.c(p1.p(t11, N));
                    i12 = i11 + f11;
                    break;
                case 8:
                    i11 = i12 * 53;
                    f11 = ((String) p1.A(t11, N)).hashCode();
                    i12 = i11 + f11;
                    break;
                case 9:
                    Object A = p1.A(t11, N);
                    if (A != null) {
                        i14 = A.hashCode();
                    }
                    i12 = (i12 * 53) + i14;
                    break;
                case 10:
                    i11 = i12 * 53;
                    f11 = p1.A(t11, N).hashCode();
                    i12 = i11 + f11;
                    break;
                case 11:
                    i11 = i12 * 53;
                    f11 = p1.x(t11, N);
                    i12 = i11 + f11;
                    break;
                case 12:
                    i11 = i12 * 53;
                    f11 = p1.x(t11, N);
                    i12 = i11 + f11;
                    break;
                case 13:
                    i11 = i12 * 53;
                    f11 = p1.x(t11, N);
                    i12 = i11 + f11;
                    break;
                case 14:
                    i11 = i12 * 53;
                    f11 = a0.f(p1.y(t11, N));
                    i12 = i11 + f11;
                    break;
                case 15:
                    i11 = i12 * 53;
                    f11 = p1.x(t11, N);
                    i12 = i11 + f11;
                    break;
                case 16:
                    i11 = i12 * 53;
                    f11 = a0.f(p1.y(t11, N));
                    i12 = i11 + f11;
                    break;
                case 17:
                    Object A2 = p1.A(t11, N);
                    if (A2 != null) {
                        i14 = A2.hashCode();
                    }
                    i12 = (i12 * 53) + i14;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i12 * 53;
                    f11 = p1.A(t11, N).hashCode();
                    i12 = i11 + f11;
                    break;
                case 50:
                    i11 = i12 * 53;
                    f11 = p1.A(t11, N).hashCode();
                    i12 = i11 + f11;
                    break;
                case 51:
                    if (A(t11, M, i13)) {
                        i11 = i12 * 53;
                        f11 = a0.f(Double.doubleToLongBits(P(t11, N)));
                        i12 = i11 + f11;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (A(t11, M, i13)) {
                        i11 = i12 * 53;
                        f11 = Float.floatToIntBits(Q(t11, N));
                        i12 = i11 + f11;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (A(t11, M, i13)) {
                        i11 = i12 * 53;
                        f11 = a0.f(S(t11, N));
                        i12 = i11 + f11;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (A(t11, M, i13)) {
                        i11 = i12 * 53;
                        f11 = a0.f(S(t11, N));
                        i12 = i11 + f11;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (A(t11, M, i13)) {
                        i11 = i12 * 53;
                        f11 = R(t11, N);
                        i12 = i11 + f11;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (A(t11, M, i13)) {
                        i11 = i12 * 53;
                        f11 = a0.f(S(t11, N));
                        i12 = i11 + f11;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (A(t11, M, i13)) {
                        i11 = i12 * 53;
                        f11 = R(t11, N);
                        i12 = i11 + f11;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (A(t11, M, i13)) {
                        i11 = i12 * 53;
                        f11 = a0.c(O(t11, N));
                        i12 = i11 + f11;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (A(t11, M, i13)) {
                        i11 = i12 * 53;
                        f11 = ((String) p1.A(t11, N)).hashCode();
                        i12 = i11 + f11;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (A(t11, M, i13)) {
                        i11 = i12 * 53;
                        f11 = p1.A(t11, N).hashCode();
                        i12 = i11 + f11;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (A(t11, M, i13)) {
                        i11 = i12 * 53;
                        f11 = p1.A(t11, N).hashCode();
                        i12 = i11 + f11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (A(t11, M, i13)) {
                        i11 = i12 * 53;
                        f11 = R(t11, N);
                        i12 = i11 + f11;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (A(t11, M, i13)) {
                        i11 = i12 * 53;
                        f11 = R(t11, N);
                        i12 = i11 + f11;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (A(t11, M, i13)) {
                        i11 = i12 * 53;
                        f11 = R(t11, N);
                        i12 = i11 + f11;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (A(t11, M, i13)) {
                        i11 = i12 * 53;
                        f11 = a0.f(S(t11, N));
                        i12 = i11 + f11;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (A(t11, M, i13)) {
                        i11 = i12 * 53;
                        f11 = R(t11, N);
                        i12 = i11 + f11;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (A(t11, M, i13)) {
                        i11 = i12 * 53;
                        f11 = a0.f(S(t11, N));
                        i12 = i11 + f11;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (A(t11, M, i13)) {
                        i11 = i12 * 53;
                        f11 = p1.A(t11, N).hashCode();
                        i12 = i11 + f11;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i12 * 53) + this.f16399o.g(t11).hashCode();
        return this.f16390f ? (hashCode * 53) + this.f16400p.c(t11).hashCode() : hashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public final boolean isInitialized(T t11) {
        int i11;
        int i12 = -1;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f16395k; i14++) {
            int i15 = this.f16394j[i14];
            int M = M(i15);
            int k02 = k0(i15);
            if (this.f16392h) {
                i11 = 0;
            } else {
                int i16 = this.f16385a[i15 + 2];
                int i17 = 1048575 & i16;
                i11 = 1 << (i16 >>> 20);
                if (i17 != i12) {
                    i13 = f16384s.getInt(t11, i17);
                    i12 = i17;
                }
            }
            if (B(k02) && !v(t11, i15, i13, i11)) {
                return false;
            }
            int j02 = j0(k02);
            if (j02 != 9 && j02 != 17) {
                if (j02 != 27) {
                    if (j02 == 60 || j02 == 68) {
                        if (A(t11, M, i15) && !w(t11, k02, n(i15))) {
                            return false;
                        }
                    } else if (j02 != 49) {
                        if (j02 == 50 && !y(t11, k02, i15)) {
                            return false;
                        }
                    }
                }
                if (!x(t11, k02, i15)) {
                    return false;
                }
            } else if (v(t11, i15, i13, i11) && !w(t11, k02, n(i15))) {
                return false;
            }
        }
        return !this.f16390f || this.f16400p.c(t11).o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void makeImmutable(T t11) {
        int i11;
        int i12 = this.f16395k;
        while (true) {
            i11 = this.f16396l;
            if (i12 >= i11) {
                break;
            }
            long N = N(k0(this.f16394j[i12]));
            Object A = p1.A(t11, N);
            if (A != null) {
                p1.O(t11, N, this.f16401q.toImmutable(A));
            }
            i12++;
        }
        int length = this.f16394j.length;
        while (i11 < length) {
            this.f16398n.c(t11, this.f16394j[i11]);
            i11++;
        }
        this.f16399o.j(t11);
        if (this.f16390f) {
            this.f16400p.f(t11);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void mergeFrom(T t11, T t12) {
        Objects.requireNonNull(t12);
        for (int i11 = 0; i11 < this.f16385a.length; i11 += 3) {
            I(t11, t12, i11);
        }
        h1.G(this.f16399o, t11, t12);
        if (this.f16390f) {
            h1.E(this.f16400p, t11, t12);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public T newInstance() {
        return (T) this.f16397m.newInstance(this.f16389e);
    }
}