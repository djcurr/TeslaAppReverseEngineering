package e70;

import e50.m0;
import f70.t;
import f70.z;
import java.io.IOException;
import org.bouncycastle.asn1.s0;
import w40.n;
import w60.h;
import w60.j;
import w60.l;
import x60.i;

/* loaded from: classes5.dex */
public class d {
    public static m0 a(u50.b bVar) {
        if (bVar instanceof a70.b) {
            a70.b bVar2 = (a70.b) bVar;
            return new m0(e.d(bVar2.c()), bVar2.b());
        } else if (bVar instanceof d70.c) {
            d70.c cVar = (d70.c) bVar;
            return new m0(new e50.b(w60.e.f55682e, new h(e.f(cVar.b()))), cVar.c());
        } else if (bVar instanceof z60.b) {
            return new m0(new e50.b(w60.e.f55683f), ((z60.b) bVar).b());
        } else {
            if (bVar instanceof i) {
                return new m0(new e50.b(n.G2), new s0(x60.a.f().i(1).c((i) bVar).b()));
            } else if (bVar instanceof x60.d) {
                x60.d dVar = (x60.d) bVar;
                return new m0(new e50.b(n.G2), new s0(x60.a.f().i(dVar.c()).c(dVar.d()).b()));
            } else if (bVar instanceof z) {
                z zVar = (z) bVar;
                byte[] d11 = zVar.d();
                byte[] e11 = zVar.e();
                byte[] encoded = zVar.getEncoded();
                return encoded.length > d11.length + e11.length ? new m0(new e50.b(n40.a.f40491a), new s0(encoded)) : new m0(new e50.b(w60.e.f55684g, new w60.i(zVar.c().b(), e.h(zVar.b()))), new w60.n(d11, e11));
            } else if (!(bVar instanceof t)) {
                if (bVar instanceof y60.c) {
                    y60.c cVar2 = (y60.c) bVar;
                    return new m0(new e50.b(w60.e.f55681d), new w60.b(cVar2.d(), cVar2.e(), cVar2.c(), e.a(cVar2.b())));
                }
                throw new IOException("key parameters not recognized");
            } else {
                t tVar = (t) bVar;
                byte[] d12 = tVar.d();
                byte[] e12 = tVar.e();
                byte[] encoded2 = tVar.getEncoded();
                return encoded2.length > d12.length + e12.length ? new m0(new e50.b(n40.a.f40492b), new s0(encoded2)) : new m0(new e50.b(w60.e.f55689l, new j(tVar.c().a(), tVar.c().b(), e.h(tVar.b()))), new l(tVar.d(), tVar.e()));
            }
        }
    }
}