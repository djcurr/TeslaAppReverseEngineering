package e70;

import f70.a0;
import f70.s;
import f70.y;
import java.io.IOException;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.s0;
import r70.i;
import w40.n;
import w40.p;
import w60.h;
import w60.j;
import w60.k;
import w60.m;

/* loaded from: classes5.dex */
public class b {
    public static p a(u50.b bVar, q qVar) {
        if (bVar instanceof a70.a) {
            a70.a aVar = (a70.a) bVar;
            return new p(e.d(aVar.c()), new s0(aVar.b()), qVar);
        } else if (bVar instanceof d70.b) {
            d70.b bVar2 = (d70.b) bVar;
            return new p(new e50.b(w60.e.f55682e, new h(e.f(bVar2.b()))), new s0(bVar2.c()));
        } else if (bVar instanceof z60.a) {
            e50.b bVar3 = new e50.b(w60.e.f55683f);
            short[] b11 = ((z60.a) bVar).b();
            byte[] bArr = new byte[b11.length * 2];
            for (int i11 = 0; i11 != b11.length; i11++) {
                i.B(b11[i11], bArr, i11 * 2);
            }
            return new p(bVar3, new s0(bArr));
        } else if (bVar instanceof x60.h) {
            x60.h hVar = (x60.h) bVar;
            byte[] b12 = x60.a.f().i(1).c(hVar).b();
            return new p(new e50.b(n.G2), new s0(b12), qVar, x60.a.f().i(1).c(hVar.j()).b());
        } else if (bVar instanceof x60.c) {
            x60.c cVar = (x60.c) bVar;
            byte[] b13 = x60.a.f().i(cVar.d()).c(cVar).b();
            return new p(new e50.b(n.G2), new s0(b13), qVar, x60.a.f().i(cVar.d()).c(cVar.e().d()).b());
        } else if (bVar instanceof y) {
            y yVar = (y) bVar;
            return new p(new e50.b(w60.e.f55684g, new w60.i(yVar.c().b(), e.h(yVar.b()))), b(yVar), qVar);
        } else if (bVar instanceof s) {
            s sVar = (s) bVar;
            return new p(new e50.b(w60.e.f55689l, new j(sVar.c().a(), sVar.c().b(), e.h(sVar.b()))), c(sVar), qVar);
        } else if (bVar instanceof y60.b) {
            y60.b bVar4 = (y60.b) bVar;
            return new p(new e50.b(w60.e.f55681d), new w60.a(bVar4.g(), bVar4.f(), bVar4.c(), bVar4.d(), bVar4.h(), e.a(bVar4.b())));
        } else {
            throw new IOException("key parameters not recognized");
        }
    }

    private static m b(y yVar) {
        byte[] encoded = yVar.getEncoded();
        int h11 = yVar.c().h();
        int b11 = yVar.c().b();
        int a11 = (int) a0.a(encoded, 0, 4);
        if (a0.l(b11, a11)) {
            byte[] g11 = a0.g(encoded, 4, h11);
            int i11 = 4 + h11;
            byte[] g12 = a0.g(encoded, i11, h11);
            int i12 = i11 + h11;
            byte[] g13 = a0.g(encoded, i12, h11);
            int i13 = i12 + h11;
            byte[] g14 = a0.g(encoded, i13, h11);
            int i14 = i13 + h11;
            byte[] g15 = a0.g(encoded, i14, encoded.length - i14);
            try {
                f70.a aVar = (f70.a) a0.f(g15, f70.a.class);
                return aVar.c() != (1 << b11) - 1 ? new m(a11, g11, g12, g13, g14, g15, aVar.c()) : new m(a11, g11, g12, g13, g14, g15);
            } catch (ClassNotFoundException e11) {
                throw new IOException("cannot parse BDS: " + e11.getMessage());
            }
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    private static k c(s sVar) {
        byte[] encoded = sVar.getEncoded();
        int f11 = sVar.c().f();
        int a11 = sVar.c().a();
        int i11 = (a11 + 7) / 8;
        long a12 = (int) a0.a(encoded, 0, i11);
        if (a0.l(a11, a12)) {
            int i12 = i11 + 0;
            byte[] g11 = a0.g(encoded, i12, f11);
            int i13 = i12 + f11;
            byte[] g12 = a0.g(encoded, i13, f11);
            int i14 = i13 + f11;
            byte[] g13 = a0.g(encoded, i14, f11);
            int i15 = i14 + f11;
            byte[] g14 = a0.g(encoded, i15, f11);
            int i16 = i15 + f11;
            byte[] g15 = a0.g(encoded, i16, encoded.length - i16);
            try {
                f70.b bVar = (f70.b) a0.f(g15, f70.b.class);
                return bVar.b() != (1 << a11) - 1 ? new k(a12, g11, g12, g13, g14, g15, bVar.b()) : new k(a12, g11, g12, g13, g14, g15);
            } catch (ClassNotFoundException e11) {
                throw new IOException("cannot parse BDSStateMap: " + e11.getMessage());
            }
        }
        throw new IllegalArgumentException("index out of bounds");
    }
}