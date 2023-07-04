package z50;

import f50.o;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.asn1.s0;
import u50.c0;
import u50.d0;
import u50.g0;
import u50.j0;
import u50.n1;
import u50.o1;
import u50.r;
import u50.s1;
import u50.v1;
import u50.y;
import u50.z;
import w40.n;
import w40.p;
import w40.s;

/* loaded from: classes5.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static Set f60335a;

    static {
        HashSet hashSet = new HashSet(5);
        f60335a = hashSet;
        hashSet.add(i40.a.f29857t);
        f60335a.add(i40.a.f29858u);
        f60335a.add(i40.a.f29859v);
        f60335a.add(i40.a.f29860w);
        f60335a.add(i40.a.f29861x);
    }

    public static p a(u50.b bVar) {
        return b(bVar, null);
    }

    public static p b(u50.b bVar, q qVar) {
        int bitLength;
        f50.g gVar;
        BigInteger e11;
        k kVar;
        if (bVar instanceof n1) {
            o1 o1Var = (o1) bVar;
            return new p(new e50.b(n.f55541n1, q0.f43085a), new s(o1Var.c(), o1Var.h(), o1Var.b(), o1Var.g(), o1Var.i(), o1Var.e(), o1Var.f(), o1Var.j()), qVar);
        } else if (bVar instanceof u50.s) {
            u50.s sVar = (u50.s) bVar;
            r b11 = sVar.b();
            return new p(new e50.b(o.N0, new e50.q(b11.b(), b11.c(), b11.a())), new org.bouncycastle.asn1.i(sVar.c()), qVar);
        } else if (!(bVar instanceof d0)) {
            if (bVar instanceof v1) {
                v1 v1Var = (v1) bVar;
                return new p(new e50.b(j40.a.f33206c), new s0(v1Var.getEncoded()), qVar, v1Var.b().getEncoded());
            } else if (bVar instanceof s1) {
                s1 s1Var = (s1) bVar;
                return new p(new e50.b(j40.a.f33205b), new s0(s1Var.getEncoded()), qVar, s1Var.b().getEncoded());
            } else if (bVar instanceof j0) {
                j0 j0Var = (j0) bVar;
                return new p(new e50.b(j40.a.f33208e), new s0(j0Var.getEncoded()), qVar, j0Var.b().getEncoded());
            } else if (bVar instanceof g0) {
                g0 g0Var = (g0) bVar;
                return new p(new e50.b(j40.a.f33207d), new s0(g0Var.getEncoded()), qVar, g0Var.b().getEncoded());
            } else {
                throw new IOException("key parameters not recognized");
            }
        } else {
            d0 d0Var = (d0) bVar;
            y b12 = d0Var.b();
            if (b12 == null) {
                gVar = new f50.g((org.bouncycastle.asn1.j) q0.f43085a);
                e11 = d0Var.c();
            } else if (b12 instanceof z) {
                z zVar = (z) b12;
                i40.f fVar = new i40.f(zVar.m(), zVar.k(), zVar.l());
                if (f60335a.contains(fVar.i())) {
                    kVar = i40.a.f29850m;
                } else {
                    boolean z11 = d0Var.c().bitLength() > 256;
                    k kVar2 = z11 ? x40.a.f57034h : x40.a.f57033g;
                    r2 = z11 ? 64 : 32;
                    kVar = kVar2;
                }
                byte[] bArr = new byte[r2];
                c(bArr, r2, 0, d0Var.c());
                return new p(new e50.b(kVar, fVar), new s0(bArr));
            } else if (!(b12 instanceof c0)) {
                f50.g gVar2 = new f50.g(new f50.i(b12.a(), new f50.k(b12.b(), false), b12.e(), b12.c(), b12.f()));
                bitLength = b12.e().bitLength();
                gVar = gVar2;
                return new p(new e50.b(o.f25891h0, gVar), new y40.a(bitLength, d0Var.c(), new org.bouncycastle.asn1.j0(new n60.k().a(b12.b(), d0Var.c()).l(false)), gVar), qVar);
            } else {
                gVar = new f50.g(((c0) b12).j());
                e11 = b12.e();
            }
            bitLength = e11.bitLength();
            return new p(new e50.b(o.f25891h0, gVar), new y40.a(bitLength, d0Var.c(), new org.bouncycastle.asn1.j0(new n60.k().a(b12.b(), d0Var.c()).l(false)), gVar), qVar);
        }
    }

    private static void c(byte[] bArr, int i11, int i12, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(byteArray, 0, bArr2, i11 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i13 = 0; i13 != i11; i13++) {
            bArr[i12 + i13] = byteArray[(byteArray.length - 1) - i13];
        }
    }
}