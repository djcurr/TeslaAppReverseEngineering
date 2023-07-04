package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.s1;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class m1 {

    /* renamed from: f  reason: collision with root package name */
    private static final m1 f16343f = new m1(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f16344a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f16345b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f16346c;

    /* renamed from: d  reason: collision with root package name */
    private int f16347d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f16348e;

    private m1() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i11 = this.f16344a;
        int[] iArr = this.f16345b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f16345b = Arrays.copyOf(iArr, i12);
            this.f16346c = Arrays.copyOf(this.f16346c, i12);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (iArr[i12] != iArr2[i12]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (!objArr[i12].equals(objArr2[i12])) {
                return false;
            }
        }
        return true;
    }

    public static m1 e() {
        return f16343f;
    }

    private static int h(int[] iArr, int i11) {
        int i12 = 17;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        return i12;
    }

    private static int i(Object[] objArr, int i11) {
        int i12 = 17;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 * 31) + objArr[i13].hashCode();
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m1 k(m1 m1Var, m1 m1Var2) {
        int i11 = m1Var.f16344a + m1Var2.f16344a;
        int[] copyOf = Arrays.copyOf(m1Var.f16345b, i11);
        System.arraycopy(m1Var2.f16345b, 0, copyOf, m1Var.f16344a, m1Var2.f16344a);
        Object[] copyOf2 = Arrays.copyOf(m1Var.f16346c, i11);
        System.arraycopy(m1Var2.f16346c, 0, copyOf2, m1Var.f16344a, m1Var2.f16344a);
        return new m1(i11, copyOf, copyOf2, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m1 l() {
        return new m1();
    }

    private static void p(int i11, Object obj, s1 s1Var) {
        int a11 = r1.a(i11);
        int b11 = r1.b(i11);
        if (b11 == 0) {
            s1Var.writeInt64(a11, ((Long) obj).longValue());
        } else if (b11 == 1) {
            s1Var.writeFixed64(a11, ((Long) obj).longValue());
        } else if (b11 == 2) {
            s1Var.d(a11, (i) obj);
        } else if (b11 != 3) {
            if (b11 == 5) {
                s1Var.writeFixed32(a11, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(InvalidProtocolBufferException.d());
        } else if (s1Var.fieldOrder() == s1.a.ASCENDING) {
            s1Var.writeStartGroup(a11);
            ((m1) obj).q(s1Var);
            s1Var.writeEndGroup(a11);
        } else {
            s1Var.writeEndGroup(a11);
            ((m1) obj).q(s1Var);
            s1Var.writeStartGroup(a11);
        }
    }

    void a() {
        if (!this.f16348e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof m1)) {
            m1 m1Var = (m1) obj;
            int i11 = this.f16344a;
            return i11 == m1Var.f16344a && c(this.f16345b, m1Var.f16345b, i11) && d(this.f16346c, m1Var.f16346c, this.f16344a);
        }
        return false;
    }

    public int f() {
        int X;
        int i11 = this.f16347d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f16344a; i13++) {
            int i14 = this.f16345b[i13];
            int a11 = r1.a(i14);
            int b11 = r1.b(i14);
            if (b11 == 0) {
                X = CodedOutputStream.X(a11, ((Long) this.f16346c[i13]).longValue());
            } else if (b11 == 1) {
                X = CodedOutputStream.o(a11, ((Long) this.f16346c[i13]).longValue());
            } else if (b11 == 2) {
                X = CodedOutputStream.g(a11, (i) this.f16346c[i13]);
            } else if (b11 == 3) {
                X = (CodedOutputStream.U(a11) * 2) + ((m1) this.f16346c[i13]).f();
            } else if (b11 == 5) {
                X = CodedOutputStream.m(a11, ((Integer) this.f16346c[i13]).intValue());
            } else {
                throw new IllegalStateException(InvalidProtocolBufferException.d());
            }
            i12 += X;
        }
        this.f16347d = i12;
        return i12;
    }

    public int g() {
        int i11 = this.f16347d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f16344a; i13++) {
            i12 += CodedOutputStream.I(r1.a(this.f16345b[i13]), (i) this.f16346c[i13]);
        }
        this.f16347d = i12;
        return i12;
    }

    public int hashCode() {
        int i11 = this.f16344a;
        return ((((527 + i11) * 31) + h(this.f16345b, i11)) * 31) + i(this.f16346c, this.f16344a);
    }

    public void j() {
        this.f16348e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < this.f16344a; i12++) {
            s0.c(sb2, i11, String.valueOf(r1.a(this.f16345b[i12])), this.f16346c[i12]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(int i11, Object obj) {
        a();
        b();
        int[] iArr = this.f16345b;
        int i12 = this.f16344a;
        iArr[i12] = i11;
        this.f16346c[i12] = obj;
        this.f16344a = i12 + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(s1 s1Var) {
        if (s1Var.fieldOrder() == s1.a.DESCENDING) {
            for (int i11 = this.f16344a - 1; i11 >= 0; i11--) {
                s1Var.writeMessageSetItem(r1.a(this.f16345b[i11]), this.f16346c[i11]);
            }
            return;
        }
        for (int i12 = 0; i12 < this.f16344a; i12++) {
            s1Var.writeMessageSetItem(r1.a(this.f16345b[i12]), this.f16346c[i12]);
        }
    }

    public void q(s1 s1Var) {
        if (this.f16344a == 0) {
            return;
        }
        if (s1Var.fieldOrder() == s1.a.ASCENDING) {
            for (int i11 = 0; i11 < this.f16344a; i11++) {
                p(this.f16345b[i11], this.f16346c[i11], s1Var);
            }
            return;
        }
        for (int i12 = this.f16344a - 1; i12 >= 0; i12--) {
            p(this.f16345b[i12], this.f16346c[i12], s1Var);
        }
    }

    private m1(int i11, int[] iArr, Object[] objArr, boolean z11) {
        this.f16347d = -1;
        this.f16344a = i11;
        this.f16345b = iArr;
        this.f16346c = objArr;
        this.f16348e = z11;
    }
}