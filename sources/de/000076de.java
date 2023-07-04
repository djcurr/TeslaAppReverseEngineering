package io.grpc.internal;

import io.grpc.h0;
import io.grpc.internal.a;
import io.grpc.r0;
import java.nio.charset.Charset;
import okhttp3.internal.http2.Header;

/* loaded from: classes5.dex */
public abstract class t0 extends a.c {

    /* renamed from: v  reason: collision with root package name */
    private static final h0.a<Integer> f31215v;

    /* renamed from: w  reason: collision with root package name */
    private static final r0.f<Integer> f31216w;

    /* renamed from: r  reason: collision with root package name */
    private io.grpc.f1 f31217r;

    /* renamed from: s  reason: collision with root package name */
    private io.grpc.r0 f31218s;

    /* renamed from: t  reason: collision with root package name */
    private Charset f31219t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f31220u;

    /* loaded from: classes5.dex */
    class a implements h0.a<Integer> {
        a() {
        }

        @Override // io.grpc.r0.i
        /* renamed from: c */
        public Integer b(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
            }
            throw new NumberFormatException("Malformed status code " + new String(bArr, io.grpc.h0.f30583a));
        }

        @Override // io.grpc.r0.i
        /* renamed from: d */
        public byte[] a(Integer num) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        a aVar = new a();
        f31215v = aVar;
        f31216w = io.grpc.h0.b(Header.RESPONSE_STATUS_UTF8, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public t0(int i11, h2 h2Var, n2 n2Var) {
        super(i11, h2Var, n2Var);
        this.f31219t = com.google.common.base.f.f15920c;
    }

    private static Charset O(io.grpc.r0 r0Var) {
        String str = (String) r0Var.g(q0.f31165h);
        if (str != null) {
            String[] split = str.split("charset=", 2);
            try {
                return Charset.forName(split[split.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return com.google.common.base.f.f15920c;
    }

    private io.grpc.f1 Q(io.grpc.r0 r0Var) {
        io.grpc.f1 r11;
        io.grpc.f1 f1Var = (io.grpc.f1) r0Var.g(io.grpc.j0.f31481b);
        if (f1Var != null) {
            return f1Var.r((String) r0Var.g(io.grpc.j0.f31480a));
        }
        if (this.f31220u) {
            return io.grpc.f1.f30564h.r("missing GRPC status in response");
        }
        Integer num = (Integer) r0Var.g(f31216w);
        if (num != null) {
            r11 = q0.l(num.intValue());
        } else {
            r11 = io.grpc.f1.f30570n.r("missing HTTP status code");
        }
        return r11.f("missing GRPC status, inferred error from HTTP status code");
    }

    private static void R(io.grpc.r0 r0Var) {
        r0Var.e(f31216w);
        r0Var.e(io.grpc.j0.f31481b);
        r0Var.e(io.grpc.j0.f31480a);
    }

    private io.grpc.f1 V(io.grpc.r0 r0Var) {
        Integer num = (Integer) r0Var.g(f31216w);
        if (num == null) {
            return io.grpc.f1.f30570n.r("Missing HTTP status code");
        }
        String str = (String) r0Var.g(q0.f31165h);
        if (q0.m(str)) {
            return null;
        }
        io.grpc.f1 l11 = q0.l(num.intValue());
        return l11.f("invalid content-type: " + str);
    }

    protected abstract void P(io.grpc.f1 f1Var, boolean z11, io.grpc.r0 r0Var);

    /* JADX INFO: Access modifiers changed from: protected */
    public void S(u1 u1Var, boolean z11) {
        io.grpc.f1 f1Var = this.f31217r;
        if (f1Var != null) {
            this.f31217r = f1Var.f("DATA-----------------------------\n" + v1.e(u1Var, this.f31219t));
            u1Var.close();
            if (this.f31217r.o().length() > 1000 || z11) {
                P(this.f31217r, false, this.f31218s);
            }
        } else if (!this.f31220u) {
            P(io.grpc.f1.f30570n.r("headers not received before payload"), false, new io.grpc.r0());
        } else {
            int f11 = u1Var.f();
            D(u1Var);
            if (z11) {
                if (f11 > 0) {
                    this.f31217r = io.grpc.f1.f30570n.r("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.f31217r = io.grpc.f1.f30570n.r("Received unexpected EOS on empty DATA frame from server");
                }
                io.grpc.r0 r0Var = new io.grpc.r0();
                this.f31218s = r0Var;
                N(this.f31217r, false, r0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Finally extract failed */
    public void T(io.grpc.r0 r0Var) {
        com.google.common.base.u.p(r0Var, "headers");
        io.grpc.f1 f1Var = this.f31217r;
        if (f1Var != null) {
            this.f31217r = f1Var.f("headers: " + r0Var);
            return;
        }
        try {
            if (this.f31220u) {
                io.grpc.f1 r11 = io.grpc.f1.f30570n.r("Received headers twice");
                this.f31217r = r11;
                if (r11 != null) {
                    this.f31217r = r11.f("headers: " + r0Var);
                    this.f31218s = r0Var;
                    this.f31219t = O(r0Var);
                    return;
                }
                return;
            }
            Integer num = (Integer) r0Var.g(f31216w);
            if (num != null && num.intValue() >= 100 && num.intValue() < 200) {
                io.grpc.f1 f1Var2 = this.f31217r;
                if (f1Var2 != null) {
                    this.f31217r = f1Var2.f("headers: " + r0Var);
                    this.f31218s = r0Var;
                    this.f31219t = O(r0Var);
                    return;
                }
                return;
            }
            this.f31220u = true;
            io.grpc.f1 V = V(r0Var);
            this.f31217r = V;
            if (V != null) {
                if (V != null) {
                    this.f31217r = V.f("headers: " + r0Var);
                    this.f31218s = r0Var;
                    this.f31219t = O(r0Var);
                    return;
                }
                return;
            }
            R(r0Var);
            E(r0Var);
            io.grpc.f1 f1Var3 = this.f31217r;
            if (f1Var3 != null) {
                this.f31217r = f1Var3.f("headers: " + r0Var);
                this.f31218s = r0Var;
                this.f31219t = O(r0Var);
            }
        } catch (Throwable th2) {
            io.grpc.f1 f1Var4 = this.f31217r;
            if (f1Var4 != null) {
                this.f31217r = f1Var4.f("headers: " + r0Var);
                this.f31218s = r0Var;
                this.f31219t = O(r0Var);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void U(io.grpc.r0 r0Var) {
        com.google.common.base.u.p(r0Var, "trailers");
        if (this.f31217r == null && !this.f31220u) {
            io.grpc.f1 V = V(r0Var);
            this.f31217r = V;
            if (V != null) {
                this.f31218s = r0Var;
            }
        }
        io.grpc.f1 f1Var = this.f31217r;
        if (f1Var != null) {
            io.grpc.f1 f11 = f1Var.f("trailers: " + r0Var);
            this.f31217r = f11;
            P(f11, false, this.f31218s);
            return;
        }
        io.grpc.f1 Q = Q(r0Var);
        R(r0Var);
        F(r0Var, Q);
    }
}