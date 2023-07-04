package z50;

import org.bouncycastle.asn1.k;
import u50.c0;
import u50.e0;
import u50.h0;
import u50.n1;
import u50.r;
import u50.t;

/* loaded from: classes5.dex */
public class c {
    public static byte[] a(u50.b bVar) {
        if (bVar != null) {
            if (bVar instanceof n1) {
                if (bVar.a()) {
                    throw new IllegalArgumentException("RSAKeyParamaters was for encryption");
                }
                n1 n1Var = (n1) bVar;
                h hVar = new h();
                hVar.h("ssh-rsa");
                hVar.e(n1Var.b());
                hVar.e(n1Var.c());
                return hVar.a();
            } else if (bVar instanceof e0) {
                h hVar2 = new h();
                e0 e0Var = (e0) bVar;
                String e11 = i.e(e0Var.b());
                if (e11 == null) {
                    throw new IllegalArgumentException("unable to derive ssh curve name for " + e0Var.b().a().getClass().getName());
                }
                hVar2.h("ecdsa-sha2-" + e11);
                hVar2.h(e11);
                hVar2.f(e0Var.c().l(false));
                return hVar2.a();
            } else if (bVar instanceof t) {
                t tVar = (t) bVar;
                r b11 = tVar.b();
                h hVar3 = new h();
                hVar3.h("ssh-dss");
                hVar3.e(b11.b());
                hVar3.e(b11.c());
                hVar3.e(b11.a());
                hVar3.e(tVar.c());
                return hVar3.a();
            } else if (bVar instanceof h0) {
                h hVar4 = new h();
                hVar4.h("ssh-ed25519");
                hVar4.f(((h0) bVar).getEncoded());
                return hVar4.a();
            } else {
                throw new IllegalArgumentException("unable to convert " + bVar.getClass().getName() + " to private key");
            }
        }
        throw new IllegalArgumentException("cipherParameters was null.");
    }

    public static u50.b b(g gVar) {
        u50.b bVar;
        u50.b e0Var;
        String f11 = gVar.f();
        if ("ssh-rsa".equals(f11)) {
            bVar = new n1(false, gVar.b(), gVar.b());
        } else {
            if ("ssh-dss".equals(f11)) {
                e0Var = new t(gVar.b(), new r(gVar.b(), gVar.b(), gVar.b()));
            } else if (f11.startsWith("ecdsa")) {
                String f12 = gVar.f();
                k b11 = i.b(f12);
                f50.i f13 = i.f(b11);
                if (f13 == null) {
                    throw new IllegalStateException("unable to find curve for " + f11 + " using curve name " + f12);
                }
                e0Var = new e0(f13.e().j(gVar.c()), new c0(b11, f13));
            } else if ("ssh-ed25519".equals(f11)) {
                byte[] c11 = gVar.c();
                if (c11.length != 32) {
                    throw new IllegalStateException("public key value of wrong length");
                }
                bVar = new h0(c11, 0);
            } else {
                bVar = null;
            }
            bVar = e0Var;
        }
        if (bVar != null) {
            if (gVar.a()) {
                throw new IllegalArgumentException("decoded key has trailing data");
            }
            return bVar;
        }
        throw new IllegalArgumentException("unable to parse key");
    }

    public static u50.b c(byte[] bArr) {
        return b(new g(bArr));
    }
}