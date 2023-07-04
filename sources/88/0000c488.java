package z50;

import expo.modules.interfaces.permissions.PermissionsResponse;
import java.math.BigInteger;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.crypto.k;
import r70.m;
import u50.c0;
import u50.d0;
import u50.g0;
import u50.h0;
import u50.o1;
import u50.r;
import u50.s;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f60329a = m.f("openssh-key-v1\u0000");

    private static boolean a(p pVar) {
        for (int i11 = 0; i11 < pVar.size(); i11++) {
            if (!(pVar.r(i11) instanceof org.bouncycastle.asn1.i)) {
                return false;
            }
        }
        return true;
    }

    public static byte[] b(u50.b bVar) {
        if (bVar != null) {
            if (!(bVar instanceof o1) && !(bVar instanceof d0)) {
                if (bVar instanceof s) {
                    s sVar = (s) bVar;
                    r b11 = sVar.b();
                    org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d();
                    dVar.a(new org.bouncycastle.asn1.i(0L));
                    dVar.a(new org.bouncycastle.asn1.i(b11.b()));
                    dVar.a(new org.bouncycastle.asn1.i(b11.c()));
                    dVar.a(new org.bouncycastle.asn1.i(b11.a()));
                    dVar.a(new org.bouncycastle.asn1.i(b11.a().modPow(sVar.c(), b11.b())));
                    dVar.a(new org.bouncycastle.asn1.i(sVar.c()));
                    try {
                        return new w0(dVar).getEncoded();
                    } catch (Exception e11) {
                        throw new IllegalStateException("unable to encode DSAPrivateKeyParameters " + e11.getMessage());
                    }
                } else if (!(bVar instanceof g0)) {
                    throw new IllegalArgumentException("unable to convert " + bVar.getClass().getName() + " to openssh private key");
                } else {
                    g0 g0Var = (g0) bVar;
                    h0 b12 = g0Var.b();
                    h hVar = new h();
                    hVar.g(f60329a);
                    hVar.h(PermissionsResponse.SCOPE_NONE);
                    hVar.h(PermissionsResponse.SCOPE_NONE);
                    hVar.h("");
                    hVar.d(1);
                    hVar.f(c.a(b12));
                    h hVar2 = new h();
                    int nextInt = k.b().nextInt();
                    hVar2.d(nextInt);
                    hVar2.d(nextInt);
                    hVar2.h("ssh-ed25519");
                    byte[] encoded = b12.getEncoded();
                    hVar2.f(encoded);
                    hVar2.f(org.bouncycastle.util.a.p(g0Var.getEncoded(), encoded));
                    hVar2.h("");
                    hVar.f(hVar2.b());
                    return hVar.a();
                }
            }
            return f.a(bVar).n().toASN1Primitive().getEncoded();
        }
        throw new IllegalArgumentException("param is null");
    }

    public static u50.b c(byte[] bArr) {
        u50.b bVar = null;
        if (bArr[0] == 48) {
            p p11 = p.p(bArr);
            if (p11.size() == 6) {
                if (a(p11) && ((org.bouncycastle.asn1.i) p11.r(0)).r().equals(r70.a.f49293a)) {
                    bVar = new s(((org.bouncycastle.asn1.i) p11.r(5)).r(), new r(((org.bouncycastle.asn1.i) p11.r(1)).r(), ((org.bouncycastle.asn1.i) p11.r(2)).r(), ((org.bouncycastle.asn1.i) p11.r(3)).r()));
                }
            } else if (p11.size() == 9) {
                if (a(p11) && ((org.bouncycastle.asn1.i) p11.r(0)).r().equals(r70.a.f49293a)) {
                    w40.s i11 = w40.s.i(p11);
                    bVar = new o1(i11.j(), i11.o(), i11.n(), i11.k(), i11.m(), i11.f(), i11.h(), i11.e());
                }
            } else if (p11.size() == 4 && (p11.r(3) instanceof org.bouncycastle.asn1.s) && (p11.r(2) instanceof org.bouncycastle.asn1.s)) {
                y40.a e11 = y40.a.e(p11);
                org.bouncycastle.asn1.k kVar = (org.bouncycastle.asn1.k) e11.i();
                bVar = new d0(e11.f(), new c0(kVar, f50.d.c(kVar)));
            }
        } else {
            g gVar = new g(f60329a, bArr);
            if (!PermissionsResponse.SCOPE_NONE.equals(gVar.f())) {
                throw new IllegalStateException("encrypted keys not supported");
            }
            gVar.h();
            gVar.h();
            if (gVar.g() != 1) {
                throw new IllegalStateException("multiple keys not supported");
            }
            c.c(gVar.c());
            byte[] d11 = gVar.d();
            if (gVar.a()) {
                throw new IllegalArgumentException("decoded key has trailing data");
            }
            g gVar2 = new g(d11);
            if (gVar2.g() != gVar2.g()) {
                throw new IllegalStateException("private key check values are not the same");
            }
            String f11 = gVar2.f();
            if ("ssh-ed25519".equals(f11)) {
                gVar2.c();
                byte[] c11 = gVar2.c();
                if (c11.length != 64) {
                    throw new IllegalStateException("private key value of wrong length");
                }
                bVar = new g0(c11, 0);
            } else if (f11.startsWith("ecdsa")) {
                org.bouncycastle.asn1.k b11 = i.b(m.b(gVar2.c()));
                if (b11 == null) {
                    throw new IllegalStateException("OID not found for: " + f11);
                }
                f50.i c12 = r40.a.c(b11);
                if (c12 == null) {
                    throw new IllegalStateException("Curve not found for: " + b11);
                }
                gVar2.c();
                bVar = new d0(new BigInteger(1, gVar2.c()), new c0(b11, c12));
            }
            gVar2.h();
            if (gVar2.a()) {
                throw new IllegalArgumentException("private key block has trailing data");
            }
        }
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("unable to parse key");
    }
}