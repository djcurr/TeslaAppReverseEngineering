package w40;

import java.math.BigInteger;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class i extends e40.c {

    /* renamed from: d  reason: collision with root package name */
    private static final BigInteger f55509d = BigInteger.valueOf(1);

    /* renamed from: a  reason: collision with root package name */
    e50.r f55510a;

    /* renamed from: b  reason: collision with root package name */
    byte[] f55511b;

    /* renamed from: c  reason: collision with root package name */
    BigInteger f55512c;

    public i(e50.r rVar, byte[] bArr, int i11) {
        this.f55510a = rVar;
        this.f55511b = org.bouncycastle.util.a.h(bArr);
        this.f55512c = BigInteger.valueOf(i11);
    }

    private i(org.bouncycastle.asn1.p pVar) {
        this.f55510a = e50.r.h(pVar.r(0));
        this.f55511b = org.bouncycastle.util.a.h(org.bouncycastle.asn1.l.p(pVar.r(1)).r());
        this.f55512c = pVar.size() == 3 ? org.bouncycastle.asn1.i.p(pVar.r(2)).s() : f55509d;
    }

    public static i e(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj != null) {
            return new i(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public BigInteger f() {
        return this.f55512c;
    }

    public e50.r h() {
        return this.f55510a;
    }

    public byte[] i() {
        return org.bouncycastle.util.a.h(this.f55511b);
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        dVar.a(this.f55510a);
        dVar.a(new s0(this.f55511b));
        if (!this.f55512c.equals(f55509d)) {
            dVar.a(new org.bouncycastle.asn1.i(this.f55512c));
        }
        return new w0(dVar);
    }
}