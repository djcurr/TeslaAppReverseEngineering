package w40;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class s extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private BigInteger f55576a;

    /* renamed from: b  reason: collision with root package name */
    private BigInteger f55577b;

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f55578c;

    /* renamed from: d  reason: collision with root package name */
    private BigInteger f55579d;

    /* renamed from: e  reason: collision with root package name */
    private BigInteger f55580e;

    /* renamed from: f  reason: collision with root package name */
    private BigInteger f55581f;

    /* renamed from: g  reason: collision with root package name */
    private BigInteger f55582g;

    /* renamed from: h  reason: collision with root package name */
    private BigInteger f55583h;

    /* renamed from: i  reason: collision with root package name */
    private BigInteger f55584i;

    /* renamed from: j  reason: collision with root package name */
    private org.bouncycastle.asn1.p f55585j;

    public s(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this.f55585j = null;
        this.f55576a = BigInteger.valueOf(0L);
        this.f55577b = bigInteger;
        this.f55578c = bigInteger2;
        this.f55579d = bigInteger3;
        this.f55580e = bigInteger4;
        this.f55581f = bigInteger5;
        this.f55582g = bigInteger6;
        this.f55583h = bigInteger7;
        this.f55584i = bigInteger8;
    }

    private s(org.bouncycastle.asn1.p pVar) {
        this.f55585j = null;
        Enumeration s11 = pVar.s();
        org.bouncycastle.asn1.i iVar = (org.bouncycastle.asn1.i) s11.nextElement();
        int x11 = iVar.x();
        if (x11 < 0 || x11 > 1) {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        this.f55576a = iVar.s();
        this.f55577b = ((org.bouncycastle.asn1.i) s11.nextElement()).s();
        this.f55578c = ((org.bouncycastle.asn1.i) s11.nextElement()).s();
        this.f55579d = ((org.bouncycastle.asn1.i) s11.nextElement()).s();
        this.f55580e = ((org.bouncycastle.asn1.i) s11.nextElement()).s();
        this.f55581f = ((org.bouncycastle.asn1.i) s11.nextElement()).s();
        this.f55582g = ((org.bouncycastle.asn1.i) s11.nextElement()).s();
        this.f55583h = ((org.bouncycastle.asn1.i) s11.nextElement()).s();
        this.f55584i = ((org.bouncycastle.asn1.i) s11.nextElement()).s();
        if (s11.hasMoreElements()) {
            this.f55585j = (org.bouncycastle.asn1.p) s11.nextElement();
        }
    }

    public static s i(Object obj) {
        if (obj instanceof s) {
            return (s) obj;
        }
        if (obj != null) {
            return new s(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public BigInteger e() {
        return this.f55584i;
    }

    public BigInteger f() {
        return this.f55582g;
    }

    public BigInteger h() {
        return this.f55583h;
    }

    public BigInteger j() {
        return this.f55577b;
    }

    public BigInteger k() {
        return this.f55580e;
    }

    public BigInteger m() {
        return this.f55581f;
    }

    public BigInteger n() {
        return this.f55579d;
    }

    public BigInteger o() {
        return this.f55578c;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(10);
        dVar.a(new org.bouncycastle.asn1.i(this.f55576a));
        dVar.a(new org.bouncycastle.asn1.i(j()));
        dVar.a(new org.bouncycastle.asn1.i(o()));
        dVar.a(new org.bouncycastle.asn1.i(n()));
        dVar.a(new org.bouncycastle.asn1.i(k()));
        dVar.a(new org.bouncycastle.asn1.i(m()));
        dVar.a(new org.bouncycastle.asn1.i(f()));
        dVar.a(new org.bouncycastle.asn1.i(h()));
        dVar.a(new org.bouncycastle.asn1.i(e()));
        org.bouncycastle.asn1.p pVar = this.f55585j;
        if (pVar != null) {
            dVar.a(pVar);
        }
        return new w0(dVar);
    }
}