package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f43090a;

    /* renamed from: b  reason: collision with root package name */
    private final int f43091b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[][] f43092c;

    public r(InputStream inputStream) {
        this(inputStream, v1.c(inputStream));
    }

    public r(InputStream inputStream, int i11) {
        this.f43090a = inputStream;
        this.f43091b = i11;
        this.f43092c = new byte[11];
    }

    private void e(boolean z11) {
        InputStream inputStream = this.f43090a;
        if (inputStream instanceof r1) {
            ((r1) inputStream).l(z11);
        }
    }

    e40.b a(int i11) {
        if (i11 != 4) {
            if (i11 != 8) {
                if (i11 != 16) {
                    if (i11 == 17) {
                        return new e0(this);
                    }
                    throw new ASN1Exception("unknown BER object encountered: 0x" + Integer.toHexString(i11));
                }
                return new c0(this);
            }
            return new l0(this);
        }
        return new y(this);
    }

    public e40.b b() {
        int read = this.f43090a.read();
        if (read == -1) {
            return null;
        }
        boolean z11 = false;
        e(false);
        int J = h.J(this.f43090a, read);
        boolean z12 = (read & 32) != 0;
        InputStream inputStream = this.f43090a;
        int i11 = this.f43091b;
        if (J == 4 || J == 16 || J == 17 || J == 8) {
            z11 = true;
        }
        int C = h.C(inputStream, i11, z11);
        if (C < 0) {
            if (z12) {
                r rVar = new r(new r1(this.f43090a, this.f43091b), this.f43091b);
                return (read & 192) == 192 ? new a0(J, rVar) : (read & 64) != 0 ? new v(J, rVar) : (read & 128) != 0 ? new g0(true, J, rVar) : rVar.a(J);
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        q1 q1Var = new q1(this.f43090a, C, this.f43091b);
        if ((read & 192) == 192) {
            return new j1(z12, J, q1Var.m());
        }
        if ((read & 64) != 0) {
            return new e1(z12, J, q1Var.m());
        }
        if ((read & 128) != 0) {
            return new g0(z12, J, new r(q1Var));
        }
        if (!z12) {
            if (J != 4) {
                try {
                    return h.g(J, q1Var, this.f43092c);
                } catch (IllegalArgumentException e11) {
                    throw new ASN1Exception("corrupted stream detected", e11);
                }
            }
            return new t0(q1Var);
        } else if (J != 4) {
            if (J != 8) {
                if (J != 16) {
                    if (J == 17) {
                        return new n1(new r(q1Var));
                    }
                    throw new IOException("unknown tag " + J + " encountered");
                }
                return new l1(new r(q1Var));
            }
            return new l0(new r(q1Var));
        } else {
            return new y(new r(q1Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n c(boolean z11, int i11) {
        if (z11) {
            d d11 = d();
            return this.f43090a instanceof r1 ? d11.f() == 1 ? new f0(true, i11, d11.d(0)) : new f0(false, i11, w.a(d11)) : d11.f() == 1 ? new o1(true, i11, d11.d(0)) : new o1(false, i11, h1.a(d11));
        }
        return new o1(false, i11, new s0(((q1) this.f43090a).m()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d d() {
        e40.b b11 = b();
        if (b11 == null) {
            return new d(0);
        }
        d dVar = new d();
        do {
            dVar.a(b11 instanceof e40.h ? ((e40.h) b11).getLoadedObject() : b11.toASN1Primitive());
            b11 = b();
        } while (b11 != null);
        return dVar;
    }
}