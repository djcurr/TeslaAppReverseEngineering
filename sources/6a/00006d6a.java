package f50;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class c extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final org.bouncycastle.asn1.i f25832a;

    /* renamed from: b  reason: collision with root package name */
    private final org.bouncycastle.asn1.i f25833b;

    /* renamed from: c  reason: collision with root package name */
    private final org.bouncycastle.asn1.i f25834c;

    /* renamed from: d  reason: collision with root package name */
    private final org.bouncycastle.asn1.i f25835d;

    /* renamed from: e  reason: collision with root package name */
    private final e f25836e;

    public c(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, e eVar) {
        if (bigInteger == null) {
            throw new IllegalArgumentException("'p' cannot be null");
        }
        if (bigInteger2 == null) {
            throw new IllegalArgumentException("'g' cannot be null");
        }
        if (bigInteger3 == null) {
            throw new IllegalArgumentException("'q' cannot be null");
        }
        this.f25832a = new org.bouncycastle.asn1.i(bigInteger);
        this.f25833b = new org.bouncycastle.asn1.i(bigInteger2);
        this.f25834c = new org.bouncycastle.asn1.i(bigInteger3);
        this.f25835d = bigInteger4 != null ? new org.bouncycastle.asn1.i(bigInteger4) : null;
        this.f25836e = eVar;
    }

    private c(p pVar) {
        if (pVar.size() < 3 || pVar.size() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
        }
        Enumeration s11 = pVar.s();
        this.f25832a = org.bouncycastle.asn1.i.p(s11.nextElement());
        this.f25833b = org.bouncycastle.asn1.i.p(s11.nextElement());
        this.f25834c = org.bouncycastle.asn1.i.p(s11.nextElement());
        e40.b i11 = i(s11);
        if (i11 == null || !(i11 instanceof org.bouncycastle.asn1.i)) {
            this.f25835d = null;
        } else {
            this.f25835d = org.bouncycastle.asn1.i.p(i11);
            i11 = i(s11);
        }
        if (i11 != null) {
            this.f25836e = e.e(i11.toASN1Primitive());
        } else {
            this.f25836e = null;
        }
    }

    public static c f(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(p.p(obj));
        }
        return null;
    }

    private static e40.b i(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (e40.b) enumeration.nextElement();
        }
        return null;
    }

    public BigInteger e() {
        return this.f25833b.r();
    }

    public BigInteger h() {
        org.bouncycastle.asn1.i iVar = this.f25835d;
        if (iVar == null) {
            return null;
        }
        return iVar.r();
    }

    public BigInteger j() {
        return this.f25832a.r();
    }

    public BigInteger k() {
        return this.f25834c.r();
    }

    public e m() {
        return this.f25836e;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(5);
        dVar.a(this.f25832a);
        dVar.a(this.f25833b);
        dVar.a(this.f25834c);
        org.bouncycastle.asn1.i iVar = this.f25835d;
        if (iVar != null) {
            dVar.a(iVar);
        }
        e eVar = this.f25836e;
        if (eVar != null) {
            dVar.a(eVar);
        }
        return new w0(dVar);
    }
}