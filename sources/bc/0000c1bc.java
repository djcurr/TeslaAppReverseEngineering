package y40;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class b extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private p f59086a;

    public b(BigInteger bigInteger, e40.b bVar) {
        this(bigInteger, null, bVar);
    }

    public b(BigInteger bigInteger, j0 j0Var, e40.b bVar) {
        byte[] c11 = r70.a.c(bigInteger);
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(4);
        dVar.a(new i(1L));
        dVar.a(new s0(c11));
        if (bVar != null) {
            dVar.a(new z0(true, 0, bVar));
        }
        if (j0Var != null) {
            dVar.a(new z0(true, 1, j0Var));
        }
        this.f59086a = new w0(dVar);
    }

    public b(p pVar) {
        this.f59086a = pVar;
    }

    private n f(int i11) {
        Enumeration s11 = this.f59086a.s();
        while (s11.hasMoreElements()) {
            e40.b bVar = (e40.b) s11.nextElement();
            if (bVar instanceof s) {
                s sVar = (s) bVar;
                if (sVar.s() == i11) {
                    return sVar.r().toASN1Primitive();
                }
            }
        }
        return null;
    }

    public BigInteger e() {
        return new BigInteger(1, ((l) this.f59086a.r(1)).r());
    }

    public j0 h() {
        return (j0) f(1);
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        return this.f59086a;
    }
}