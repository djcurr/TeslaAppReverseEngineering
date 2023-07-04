package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class h extends FilterInputStream {

    /* renamed from: a */
    private final int f43046a;

    /* renamed from: b */
    private final boolean f43047b;

    /* renamed from: c */
    private final byte[][] f43048c;

    public h(InputStream inputStream) {
        this(inputStream, v1.c(inputStream));
    }

    public h(InputStream inputStream, int i11) {
        this(inputStream, i11, false);
    }

    public h(InputStream inputStream, int i11, boolean z11) {
        super(inputStream);
        this.f43046a = i11;
        this.f43047b = z11;
        this.f43048c = new byte[11];
    }

    public h(InputStream inputStream, boolean z11) {
        this(inputStream, v1.c(inputStream), z11);
    }

    public h(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public h(byte[] bArr, boolean z11) {
        this(new ByteArrayInputStream(bArr), bArr.length, z11);
    }

    public static int C(InputStream inputStream, int i11, boolean z11) {
        int read = inputStream.read();
        if (read >= 0) {
            if (read == 128) {
                return -1;
            }
            if (read > 127) {
                int i12 = read & 127;
                if (i12 > 4) {
                    throw new IOException("DER length more than 4 bytes: " + i12);
                }
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    int read2 = inputStream.read();
                    if (read2 < 0) {
                        throw new EOFException("EOF found reading length");
                    }
                    i13 = (i13 << 8) + read2;
                }
                if (i13 >= 0) {
                    if (i13 < i11 || z11) {
                        return i13;
                    }
                    throw new IOException("corrupted stream - out of bounds length found: " + i13 + " >= " + i11);
                }
                throw new IOException("corrupted stream - negative length found");
            }
            return read;
        }
        throw new EOFException("EOF found when length expected");
    }

    public static int J(InputStream inputStream, int i11) {
        int i12 = i11 & 31;
        if (i12 == 31) {
            int i13 = 0;
            int read = inputStream.read();
            if ((read & 127) != 0) {
                while (read >= 0 && (read & 128) != 0) {
                    i13 = (i13 | (read & 127)) << 7;
                    read = inputStream.read();
                }
                if (read >= 0) {
                    return i13 | (read & 127);
                }
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        return i12;
    }

    public static n g(int i11, q1 q1Var, byte[][] bArr) {
        if (i11 != 10) {
            if (i11 != 12) {
                if (i11 != 30) {
                    switch (i11) {
                        case 1:
                            return c.p(l(q1Var, bArr));
                        case 2:
                            return new i(q1Var.m(), false);
                        case 3:
                            return b.p(q1Var.j(), q1Var);
                        case 4:
                            return new s0(q1Var.m());
                        case 5:
                            return q0.f43085a;
                        case 6:
                            return k.r(l(q1Var, bArr));
                        default:
                            switch (i11) {
                                case 18:
                                    return new r0(q1Var.m());
                                case 19:
                                    return new v0(q1Var.m());
                                case 20:
                                    return new y0(q1Var.m());
                                case 21:
                                    return new c1(q1Var.m());
                                case 22:
                                    return new p0(q1Var.m());
                                case 23:
                                    return new t(q1Var.m());
                                case 24:
                                    return new g(q1Var.m());
                                case 25:
                                    return new o0(q1Var.m());
                                case 26:
                                    return new d1(q1Var.m());
                                case 27:
                                    return new m0(q1Var.m());
                                case 28:
                                    return new b1(q1Var.m());
                                default:
                                    throw new IOException("unknown tag " + i11 + " encountered");
                            }
                    }
                }
                return new i0(j(q1Var));
            }
            return new a1(q1Var.m());
        }
        return e.p(l(q1Var, bArr));
    }

    private static char[] j(q1 q1Var) {
        int i11;
        int j11 = q1Var.j();
        if ((j11 & 1) == 0) {
            int i12 = j11 / 2;
            char[] cArr = new char[i12];
            byte[] bArr = new byte[8];
            int i13 = 0;
            int i14 = 0;
            while (j11 >= 8) {
                if (t70.a.f(q1Var, bArr, 0, 8) != 8) {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
                cArr[i14] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
                cArr[i14 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
                cArr[i14 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
                cArr[i14 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
                i14 += 4;
                j11 -= 8;
            }
            if (j11 > 0) {
                if (t70.a.f(q1Var, bArr, 0, j11) != j11) {
                    throw new EOFException("EOF encountered in middle of BMPString");
                }
                while (true) {
                    int i15 = i13 + 1;
                    int i16 = i15 + 1;
                    i11 = i14 + 1;
                    cArr[i14] = (char) ((bArr[i13] << 8) | (bArr[i15] & 255));
                    if (i16 >= j11) {
                        break;
                    }
                    i13 = i16;
                    i14 = i11;
                }
                i14 = i11;
            }
            if (q1Var.j() == 0 && i12 == i14) {
                return cArr;
            }
            throw new IllegalStateException();
        }
        throw new IOException("malformed BMPString encoding encountered");
    }

    private static byte[] l(q1 q1Var, byte[][] bArr) {
        int j11 = q1Var.j();
        if (j11 >= bArr.length) {
            return q1Var.m();
        }
        byte[] bArr2 = bArr[j11];
        if (bArr2 == null) {
            bArr2 = new byte[j11];
            bArr[j11] = bArr2;
        }
        q1Var.l(bArr2);
        return bArr2;
    }

    public n D() {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int J = J(this, read);
        boolean z11 = (read & 32) != 0;
        int p11 = p();
        if (p11 >= 0) {
            try {
                return a(read, J, p11);
            } catch (IllegalArgumentException e11) {
                throw new ASN1Exception("corrupted stream detected", e11);
            }
        } else if (z11) {
            r rVar = new r(new r1(this, this.f43046a), this.f43046a);
            if ((read & 192) == 192) {
                return new a0(J, rVar).getLoadedObject();
            }
            if ((read & 64) != 0) {
                return new v(J, rVar).getLoadedObject();
            }
            if ((read & 128) != 0) {
                return new g0(true, J, rVar).getLoadedObject();
            }
            if (J != 4) {
                if (J != 8) {
                    if (J != 16) {
                        if (J == 17) {
                            return new e0(rVar).getLoadedObject();
                        }
                        throw new IOException("unknown BER object encountered");
                    }
                    return new c0(rVar).getLoadedObject();
                }
                return new l0(rVar).getLoadedObject();
            }
            return new y(rVar).getLoadedObject();
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }

    d L(q1 q1Var) {
        if (q1Var.j() < 1) {
            return new d(0);
        }
        h hVar = new h(q1Var);
        d dVar = new d();
        while (true) {
            n D = hVar.D();
            if (D == null) {
                return dVar;
            }
            dVar.a(D);
        }
    }

    protected n a(int i11, int i12, int i13) {
        boolean z11 = (i11 & 32) != 0;
        q1 q1Var = new q1(this, i13, this.f43046a);
        if ((i11 & 192) == 192) {
            return new j1(z11, i12, q1Var.m());
        }
        if ((i11 & 64) != 0) {
            return new e1(z11, i12, q1Var.m());
        }
        if ((i11 & 128) != 0) {
            return new r(q1Var).c(z11, i12);
        }
        if (z11) {
            if (i12 != 4) {
                if (i12 != 8) {
                    if (i12 == 16) {
                        return this.f43047b ? new t1(q1Var.m()) : h1.a(L(q1Var));
                    } else if (i12 == 17) {
                        return h1.b(L(q1Var));
                    } else {
                        throw new IOException("unknown tag " + i12 + " encountered");
                    }
                }
                return new g1(L(q1Var));
            }
            d L = L(q1Var);
            int f11 = L.f();
            l[] lVarArr = new l[f11];
            for (int i14 = 0; i14 != f11; i14++) {
                e40.b d11 = L.d(i14);
                if (!(d11 instanceof l)) {
                    throw new ASN1Exception("unknown object encountered in constructed OCTET STRING: " + d11.getClass());
                }
                lVarArr[i14] = (l) d11;
            }
            return new x(lVarArr);
        }
        return g(i12, q1Var, this.f43048c);
    }

    public int m() {
        return this.f43046a;
    }

    protected int p() {
        return C(this, this.f43046a, false);
    }
}