package e70;

import f70.a0;
import f70.r;
import f70.s;
import f70.x;
import f70.y;
import java.io.IOException;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import r70.i;
import w40.n;
import w40.p;
import w60.h;
import w60.j;
import w60.m;

/* loaded from: classes5.dex */
public class a {
    private static short[] a(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i11 = 0; i11 != length; i11++) {
            sArr[i11] = i.r(bArr, i11 * 2);
        }
        return sArr;
    }

    public static u50.b b(p pVar) {
        k e11 = pVar.i().e();
        if (e11.z(g40.a.J)) {
            return new a70.a(e.e(pVar.i()), l.p(pVar.n()).r());
        } else if (e11.j(g40.a.f27723n)) {
            return new d70.b(l.p(pVar.n()).r(), e.g(h.e(pVar.i().i())));
        } else {
            if (e11.j(g40.a.N)) {
                return new z60.a(a(l.p(pVar.n()).r()));
            }
            if (e11.j(n.G2)) {
                byte[] r11 = l.p(pVar.n()).r();
                org.bouncycastle.asn1.b j11 = pVar.j();
                if (i.a(r11, 0) == 1) {
                    if (j11 != null) {
                        byte[] r12 = j11.r();
                        return x60.h.g(org.bouncycastle.util.a.w(r11, 4, r11.length), org.bouncycastle.util.a.w(r12, 4, r12.length));
                    }
                    return x60.h.f(org.bouncycastle.util.a.w(r11, 4, r11.length));
                } else if (j11 != null) {
                    return x60.c.c(org.bouncycastle.util.a.w(r11, 4, r11.length), j11.r());
                } else {
                    return x60.c.b(org.bouncycastle.util.a.w(r11, 4, r11.length));
                }
            } else if (e11.j(g40.a.f27727r)) {
                w60.i f11 = w60.i.f(pVar.i().i());
                k e12 = f11.h().e();
                m h11 = m.h(pVar.n());
                try {
                    y.b o11 = new y.b(new x(f11.e(), e.b(e12))).l(h11.f()).q(h11.n()).p(h11.m()).n(h11.j()).o(h11.k());
                    if (h11.o() != 0) {
                        o11.m(h11.i());
                    }
                    if (h11.e() != null) {
                        o11.k(((f70.a) a0.f(h11.e(), f70.a.class)).h(e12));
                    }
                    return o11.j();
                } catch (ClassNotFoundException e13) {
                    throw new IOException("ClassNotFoundException processing BDS state: " + e13.getMessage());
                }
            } else if (!e11.j(w60.e.f55689l)) {
                if (e11.j(w60.e.f55681d)) {
                    w60.a i11 = w60.a.i(pVar.n());
                    return new y60.b(i11.k(), i11.j(), i11.f(), i11.h(), i11.m(), e.c(i11.e().e()));
                }
                throw new RuntimeException("algorithm identifier in private key not recognised");
            } else {
                j f12 = j.f(pVar.i().i());
                k e14 = f12.i().e();
                try {
                    w60.k h12 = w60.k.h(pVar.n());
                    s.b p11 = new s.b(new r(f12.e(), f12.h(), e.b(e14))).m(h12.f()).r(h12.n()).q(h12.m()).o(h12.j()).p(h12.k());
                    if (h12.o() != 0) {
                        p11.n(h12.i());
                    }
                    if (h12.e() != null) {
                        p11.l(((f70.b) a0.f(h12.e(), f70.b.class)).f(e14));
                    }
                    return p11.k();
                } catch (ClassNotFoundException e15) {
                    throw new IOException("ClassNotFoundException processing BDS state: " + e15.getMessage());
                }
            }
        }
    }
}