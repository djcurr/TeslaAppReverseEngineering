package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.q1;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class CodedOutputStream extends h {

    /* renamed from: c */
    private static final Logger f16222c = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: d */
    private static final boolean f16223d = p1.C();

    /* renamed from: a */
    l f16224a;

    /* renamed from: b */
    private boolean f16225b;

    /* loaded from: classes3.dex */
    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        OutOfSpaceException(String str, Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th2);
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends CodedOutputStream {

        /* renamed from: e */
        private final byte[] f16226e;

        /* renamed from: f */
        private final int f16227f;

        /* renamed from: g */
        private int f16228g;

        b(byte[] bArr, int i11, int i12) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i13 = i11 + i12;
            if ((i11 | i12 | (bArr.length - i13)) >= 0) {
                this.f16226e = bArr;
                this.f16228g = i11;
                this.f16227f = i13;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void A0(int i11, q0 q0Var, f1 f1Var) {
            M0(i11, 2);
            O0(((com.google.crypto.tink.shaded.protobuf.a) q0Var).c(f1Var));
            f1Var.c(q0Var, this.f16224a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void B0(int i11, q0 q0Var) {
            M0(1, 3);
            N0(2, i11);
            T0(3, q0Var);
            M0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void C0(int i11, i iVar) {
            M0(1, 3);
            N0(2, i11);
            j0(3, iVar);
            M0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void L0(int i11, String str) {
            M0(i11, 2);
            V0(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void M0(int i11, int i12) {
            O0(r1.c(i11, i12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void N0(int i11, int i12) {
            M0(i11, 0);
            O0(i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void O0(int i11) {
            if (!CodedOutputStream.f16223d || d.c() || f0() < 5) {
                while ((i11 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f16226e;
                        int i12 = this.f16228g;
                        this.f16228g = i12 + 1;
                        bArr[i12] = (byte) ((i11 & 127) | 128);
                        i11 >>>= 7;
                    } catch (IndexOutOfBoundsException e11) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16228g), Integer.valueOf(this.f16227f), 1), e11);
                    }
                }
                byte[] bArr2 = this.f16226e;
                int i13 = this.f16228g;
                this.f16228g = i13 + 1;
                bArr2[i13] = (byte) i11;
            } else if ((i11 & (-128)) == 0) {
                byte[] bArr3 = this.f16226e;
                int i14 = this.f16228g;
                this.f16228g = i14 + 1;
                p1.H(bArr3, i14, (byte) i11);
            } else {
                byte[] bArr4 = this.f16226e;
                int i15 = this.f16228g;
                this.f16228g = i15 + 1;
                p1.H(bArr4, i15, (byte) (i11 | 128));
                int i16 = i11 >>> 7;
                if ((i16 & (-128)) == 0) {
                    byte[] bArr5 = this.f16226e;
                    int i17 = this.f16228g;
                    this.f16228g = i17 + 1;
                    p1.H(bArr5, i17, (byte) i16);
                    return;
                }
                byte[] bArr6 = this.f16226e;
                int i18 = this.f16228g;
                this.f16228g = i18 + 1;
                p1.H(bArr6, i18, (byte) (i16 | 128));
                int i19 = i16 >>> 7;
                if ((i19 & (-128)) == 0) {
                    byte[] bArr7 = this.f16226e;
                    int i21 = this.f16228g;
                    this.f16228g = i21 + 1;
                    p1.H(bArr7, i21, (byte) i19);
                    return;
                }
                byte[] bArr8 = this.f16226e;
                int i22 = this.f16228g;
                this.f16228g = i22 + 1;
                p1.H(bArr8, i22, (byte) (i19 | 128));
                int i23 = i19 >>> 7;
                if ((i23 & (-128)) == 0) {
                    byte[] bArr9 = this.f16226e;
                    int i24 = this.f16228g;
                    this.f16228g = i24 + 1;
                    p1.H(bArr9, i24, (byte) i23);
                    return;
                }
                byte[] bArr10 = this.f16226e;
                int i25 = this.f16228g;
                this.f16228g = i25 + 1;
                p1.H(bArr10, i25, (byte) (i23 | 128));
                byte[] bArr11 = this.f16226e;
                int i26 = this.f16228g;
                this.f16228g = i26 + 1;
                p1.H(bArr11, i26, (byte) (i23 >>> 7));
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void P0(int i11, long j11) {
            M0(i11, 0);
            Q0(j11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void Q0(long j11) {
            if (CodedOutputStream.f16223d && f0() >= 10) {
                while ((j11 & (-128)) != 0) {
                    byte[] bArr = this.f16226e;
                    int i11 = this.f16228g;
                    this.f16228g = i11 + 1;
                    p1.H(bArr, i11, (byte) ((((int) j11) & 127) | 128));
                    j11 >>>= 7;
                }
                byte[] bArr2 = this.f16226e;
                int i12 = this.f16228g;
                this.f16228g = i12 + 1;
                p1.H(bArr2, i12, (byte) j11);
                return;
            }
            while ((j11 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f16226e;
                    int i13 = this.f16228g;
                    this.f16228g = i13 + 1;
                    bArr3[i13] = (byte) ((((int) j11) & 127) | 128);
                    j11 >>>= 7;
                } catch (IndexOutOfBoundsException e11) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16228g), Integer.valueOf(this.f16227f), 1), e11);
                }
            }
            byte[] bArr4 = this.f16226e;
            int i14 = this.f16228g;
            this.f16228g = i14 + 1;
            bArr4[i14] = (byte) j11;
        }

        public final void R0(byte[] bArr, int i11, int i12) {
            try {
                System.arraycopy(bArr, i11, this.f16226e, this.f16228g, i12);
                this.f16228g += i12;
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16228g), Integer.valueOf(this.f16227f), Integer.valueOf(i12)), e11);
            }
        }

        public final void S0(i iVar) {
            O0(iVar.size());
            iVar.B(this);
        }

        public final void T0(int i11, q0 q0Var) {
            M0(i11, 2);
            U0(q0Var);
        }

        public final void U0(q0 q0Var) {
            O0(q0Var.getSerializedSize());
            q0Var.a(this);
        }

        public final void V0(String str) {
            int i11 = this.f16228g;
            try {
                int W = CodedOutputStream.W(str.length() * 3);
                int W2 = CodedOutputStream.W(str.length());
                if (W2 == W) {
                    int i12 = i11 + W2;
                    this.f16228g = i12;
                    int f11 = q1.f(str, this.f16226e, i12, f0());
                    this.f16228g = i11;
                    O0((f11 - i11) - W2);
                    this.f16228g = f11;
                } else {
                    O0(q1.g(str));
                    this.f16228g = q1.f(str, this.f16226e, this.f16228g, f0());
                }
            } catch (q1.d e11) {
                this.f16228g = i11;
                b0(str, e11);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final void a(byte[] bArr, int i11, int i12) {
            R0(bArr, i11, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int f0() {
            return this.f16227f - this.f16228g;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void g0(byte b11) {
            try {
                byte[] bArr = this.f16226e;
                int i11 = this.f16228g;
                this.f16228g = i11 + 1;
                bArr[i11] = b11;
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16228g), Integer.valueOf(this.f16227f), 1), e11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void h0(int i11, boolean z11) {
            M0(i11, 0);
            g0(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void j0(int i11, i iVar) {
            M0(i11, 2);
            S0(iVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void o0(int i11, int i12) {
            M0(i11, 5);
            p0(i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void p0(int i11) {
            try {
                byte[] bArr = this.f16226e;
                int i12 = this.f16228g;
                int i13 = i12 + 1;
                this.f16228g = i13;
                bArr[i12] = (byte) (i11 & 255);
                int i14 = i13 + 1;
                this.f16228g = i14;
                bArr[i13] = (byte) ((i11 >> 8) & 255);
                int i15 = i14 + 1;
                this.f16228g = i15;
                bArr[i14] = (byte) ((i11 >> 16) & 255);
                this.f16228g = i15 + 1;
                bArr[i15] = (byte) ((i11 >> 24) & 255);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16228g), Integer.valueOf(this.f16227f), 1), e11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void q0(int i11, long j11) {
            M0(i11, 1);
            r0(j11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void r0(long j11) {
            try {
                byte[] bArr = this.f16226e;
                int i11 = this.f16228g;
                int i12 = i11 + 1;
                this.f16228g = i12;
                bArr[i11] = (byte) (((int) j11) & 255);
                int i13 = i12 + 1;
                this.f16228g = i13;
                bArr[i12] = (byte) (((int) (j11 >> 8)) & 255);
                int i14 = i13 + 1;
                this.f16228g = i14;
                bArr[i13] = (byte) (((int) (j11 >> 16)) & 255);
                int i15 = i14 + 1;
                this.f16228g = i15;
                bArr[i14] = (byte) (((int) (j11 >> 24)) & 255);
                int i16 = i15 + 1;
                this.f16228g = i16;
                bArr[i15] = (byte) (((int) (j11 >> 32)) & 255);
                int i17 = i16 + 1;
                this.f16228g = i17;
                bArr[i16] = (byte) (((int) (j11 >> 40)) & 255);
                int i18 = i17 + 1;
                this.f16228g = i18;
                bArr[i17] = (byte) (((int) (j11 >> 48)) & 255);
                this.f16228g = i18 + 1;
                bArr[i18] = (byte) (((int) (j11 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e11) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16228g), Integer.valueOf(this.f16227f), 1), e11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void w0(int i11, int i12) {
            M0(i11, 0);
            x0(i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void x0(int i11) {
            if (i11 >= 0) {
                O0(i11);
            } else {
                Q0(i11);
            }
        }
    }

    public static int A(int i11, d0 d0Var) {
        return U(i11) + B(d0Var);
    }

    public static int B(d0 d0Var) {
        return C(d0Var.b());
    }

    public static int C(int i11) {
        return W(i11) + i11;
    }

    public static int D(int i11, q0 q0Var) {
        return (U(1) * 2) + V(2, i11) + E(3, q0Var);
    }

    public static int E(int i11, q0 q0Var) {
        return U(i11) + G(q0Var);
    }

    public static int F(int i11, q0 q0Var, f1 f1Var) {
        return U(i11) + H(q0Var, f1Var);
    }

    public static int G(q0 q0Var) {
        return C(q0Var.getSerializedSize());
    }

    public static int H(q0 q0Var, f1 f1Var) {
        return C(((com.google.crypto.tink.shaded.protobuf.a) q0Var).c(f1Var));
    }

    public static int I(int i11, i iVar) {
        return (U(1) * 2) + V(2, i11) + g(3, iVar);
    }

    @Deprecated
    public static int J(int i11) {
        return W(i11);
    }

    public static int K(int i11, int i12) {
        return U(i11) + L(i12);
    }

    public static int L(int i11) {
        return 4;
    }

    public static int M(int i11, long j11) {
        return U(i11) + N(j11);
    }

    public static int N(long j11) {
        return 8;
    }

    public static int O(int i11, int i12) {
        return U(i11) + P(i12);
    }

    public static int P(int i11) {
        return W(Z(i11));
    }

    public static int Q(int i11, long j11) {
        return U(i11) + R(j11);
    }

    public static int R(long j11) {
        return Y(a0(j11));
    }

    public static int S(int i11, String str) {
        return U(i11) + T(str);
    }

    public static int T(String str) {
        int length;
        try {
            length = q1.g(str);
        } catch (q1.d unused) {
            length = str.getBytes(a0.f16230a).length;
        }
        return C(length);
    }

    public static int U(int i11) {
        return W(r1.c(i11, 0));
    }

    public static int V(int i11, int i12) {
        return U(i11) + W(i12);
    }

    public static int W(int i11) {
        if ((i11 & (-128)) == 0) {
            return 1;
        }
        if ((i11 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i11) == 0) {
            return 3;
        }
        return (i11 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int X(int i11, long j11) {
        return U(i11) + Y(j11);
    }

    public static int Y(long j11) {
        int i11;
        if (((-128) & j11) == 0) {
            return 1;
        }
        if (j11 < 0) {
            return 10;
        }
        if (((-34359738368L) & j11) != 0) {
            i11 = 6;
            j11 >>>= 28;
        } else {
            i11 = 2;
        }
        if (((-2097152) & j11) != 0) {
            i11 += 2;
            j11 >>>= 14;
        }
        return (j11 & (-16384)) != 0 ? i11 + 1 : i11;
    }

    public static int Z(int i11) {
        return (i11 >> 31) ^ (i11 << 1);
    }

    public static long a0(long j11) {
        return (j11 >> 63) ^ (j11 << 1);
    }

    public static int d(int i11, boolean z11) {
        return U(i11) + e(z11);
    }

    public static CodedOutputStream d0(byte[] bArr) {
        return e0(bArr, 0, bArr.length);
    }

    public static int e(boolean z11) {
        return 1;
    }

    public static CodedOutputStream e0(byte[] bArr, int i11, int i12) {
        return new b(bArr, i11, i12);
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static int g(int i11, i iVar) {
        return U(i11) + h(iVar);
    }

    public static int h(i iVar) {
        return C(iVar.size());
    }

    public static int i(int i11, double d11) {
        return U(i11) + j(d11);
    }

    public static int j(double d11) {
        return 8;
    }

    public static int k(int i11, int i12) {
        return U(i11) + l(i12);
    }

    public static int l(int i11) {
        return w(i11);
    }

    public static int m(int i11, int i12) {
        return U(i11) + n(i12);
    }

    public static int n(int i11) {
        return 4;
    }

    public static int o(int i11, long j11) {
        return U(i11) + p(j11);
    }

    public static int p(long j11) {
        return 8;
    }

    public static int q(int i11, float f11) {
        return U(i11) + r(f11);
    }

    public static int r(float f11) {
        return 4;
    }

    @Deprecated
    public static int s(int i11, q0 q0Var, f1 f1Var) {
        return (U(i11) * 2) + u(q0Var, f1Var);
    }

    @Deprecated
    public static int t(q0 q0Var) {
        return q0Var.getSerializedSize();
    }

    @Deprecated
    static int u(q0 q0Var, f1 f1Var) {
        return ((com.google.crypto.tink.shaded.protobuf.a) q0Var).c(f1Var);
    }

    public static int v(int i11, int i12) {
        return U(i11) + w(i12);
    }

    public static int w(int i11) {
        if (i11 >= 0) {
            return W(i11);
        }
        return 10;
    }

    public static int x(int i11, long j11) {
        return U(i11) + y(j11);
    }

    public static int y(long j11) {
        return Y(j11);
    }

    public static int z(int i11, d0 d0Var) {
        return (U(1) * 2) + V(2, i11) + A(3, d0Var);
    }

    public abstract void A0(int i11, q0 q0Var, f1 f1Var);

    public abstract void B0(int i11, q0 q0Var);

    public abstract void C0(int i11, i iVar);

    public final void D0(int i11, int i12) {
        o0(i11, i12);
    }

    public final void E0(int i11) {
        p0(i11);
    }

    public final void F0(int i11, long j11) {
        q0(i11, j11);
    }

    public final void G0(long j11) {
        r0(j11);
    }

    public final void H0(int i11, int i12) {
        N0(i11, Z(i12));
    }

    public final void I0(int i11) {
        O0(Z(i11));
    }

    public final void J0(int i11, long j11) {
        P0(i11, a0(j11));
    }

    public final void K0(long j11) {
        Q0(a0(j11));
    }

    public abstract void L0(int i11, String str);

    public abstract void M0(int i11, int i12);

    public abstract void N0(int i11, int i12);

    public abstract void O0(int i11);

    public abstract void P0(int i11, long j11);

    public abstract void Q0(long j11);

    final void b0(String str, q1.d dVar) {
        f16222c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(a0.f16230a);
        try {
            O0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e11) {
            throw e11;
        } catch (IndexOutOfBoundsException e12) {
            throw new OutOfSpaceException(e12);
        }
    }

    public final void c() {
        if (f0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public boolean c0() {
        return this.f16225b;
    }

    public abstract int f0();

    public abstract void g0(byte b11);

    public abstract void h0(int i11, boolean z11);

    public final void i0(boolean z11) {
        g0(z11 ? (byte) 1 : (byte) 0);
    }

    public abstract void j0(int i11, i iVar);

    public final void k0(int i11, double d11) {
        q0(i11, Double.doubleToRawLongBits(d11));
    }

    public final void l0(double d11) {
        r0(Double.doubleToRawLongBits(d11));
    }

    public final void m0(int i11, int i12) {
        w0(i11, i12);
    }

    public final void n0(int i11) {
        x0(i11);
    }

    public abstract void o0(int i11, int i12);

    public abstract void p0(int i11);

    public abstract void q0(int i11, long j11);

    public abstract void r0(long j11);

    public final void s0(int i11, float f11) {
        o0(i11, Float.floatToRawIntBits(f11));
    }

    public final void t0(float f11) {
        p0(Float.floatToRawIntBits(f11));
    }

    @Deprecated
    public final void u0(int i11, q0 q0Var, f1 f1Var) {
        M0(i11, 3);
        v0(q0Var, f1Var);
        M0(i11, 4);
    }

    @Deprecated
    final void v0(q0 q0Var, f1 f1Var) {
        f1Var.c(q0Var, this.f16224a);
    }

    public abstract void w0(int i11, int i12);

    public abstract void x0(int i11);

    public final void y0(int i11, long j11) {
        P0(i11, j11);
    }

    public final void z0(long j11) {
        Q0(j11);
    }

    private CodedOutputStream() {
    }
}