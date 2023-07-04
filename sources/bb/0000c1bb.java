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
public class a extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private p f59085a;

    public a(int i11, BigInteger bigInteger, e40.b bVar) {
        this(i11, bigInteger, null, bVar);
    }

    public a(int i11, BigInteger bigInteger, j0 j0Var, e40.b bVar) {
        byte[] b11 = r70.a.b((i11 + 7) / 8, bigInteger);
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(4);
        dVar.a(new i(1L));
        dVar.a(new s0(b11));
        if (bVar != null) {
            dVar.a(new z0(true, 0, bVar));
        }
        if (j0Var != null) {
            dVar.a(new z0(true, 1, j0Var));
        }
        this.f59085a = new w0(dVar);
    }

    private a(p pVar) {
        this.f59085a = pVar;
    }

    public static a e(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(p.p(obj));
        }
        return null;
    }

    private n h(int i11) {
        Enumeration s11 = this.f59085a.s();
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

    public BigInteger f() {
        return new BigInteger(1, ((l) this.f59085a.r(1)).r());
    }

    public n i() {
        return h(0);
    }

    public j0 j() {
        return (j0) h(1);
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        return this.f59085a;
    }
}