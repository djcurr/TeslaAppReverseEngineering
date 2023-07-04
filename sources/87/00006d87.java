package f50;

import java.math.BigInteger;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class i extends e40.c implements o {

    /* renamed from: g  reason: collision with root package name */
    private static final BigInteger f25869g = BigInteger.valueOf(1);

    /* renamed from: a  reason: collision with root package name */
    private m f25870a;

    /* renamed from: b  reason: collision with root package name */
    private n60.e f25871b;

    /* renamed from: c  reason: collision with root package name */
    private k f25872c;

    /* renamed from: d  reason: collision with root package name */
    private BigInteger f25873d;

    /* renamed from: e  reason: collision with root package name */
    private BigInteger f25874e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f25875f;

    public i(n60.e eVar, k kVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eVar, kVar, bigInteger, bigInteger2, null);
    }

    public i(n60.e eVar, k kVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        m mVar;
        this.f25871b = eVar;
        this.f25872c = kVar;
        this.f25873d = bigInteger;
        this.f25874e = bigInteger2;
        this.f25875f = org.bouncycastle.util.a.h(bArr);
        if (n60.c.n(eVar)) {
            mVar = new m(eVar.s().getCharacteristic());
        } else if (!n60.c.l(eVar)) {
            throw new IllegalArgumentException("'curve' is of an unsupported type");
        } else {
            int[] exponentsPresent = ((u60.f) eVar.s()).getMinimalPolynomial().getExponentsPresent();
            if (exponentsPresent.length == 3) {
                mVar = new m(exponentsPresent[2], exponentsPresent[1]);
            } else if (exponentsPresent.length != 5) {
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            } else {
                mVar = new m(exponentsPresent[4], exponentsPresent[1], exponentsPresent[2], exponentsPresent[3]);
            }
        }
        this.f25870a = mVar;
    }

    private i(p pVar) {
        if (!(pVar.r(0) instanceof org.bouncycastle.asn1.i) || !((org.bouncycastle.asn1.i) pVar.r(0)).t(1)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        this.f25873d = ((org.bouncycastle.asn1.i) pVar.r(4)).s();
        if (pVar.size() == 6) {
            this.f25874e = ((org.bouncycastle.asn1.i) pVar.r(5)).s();
        }
        h hVar = new h(m.f(pVar.r(1)), this.f25873d, this.f25874e, p.p(pVar.r(2)));
        this.f25871b = hVar.e();
        e40.b r11 = pVar.r(3);
        if (r11 instanceof k) {
            this.f25872c = (k) r11;
        } else {
            this.f25872c = new k(this.f25871b, (org.bouncycastle.asn1.l) r11);
        }
        this.f25875f = hVar.f();
    }

    public static i i(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj != null) {
            return new i(p.p(obj));
        }
        return null;
    }

    public n60.e e() {
        return this.f25871b;
    }

    public n60.i f() {
        return this.f25872c.e();
    }

    public BigInteger h() {
        return this.f25874e;
    }

    public BigInteger j() {
        return this.f25873d;
    }

    public byte[] k() {
        return org.bouncycastle.util.a.h(this.f25875f);
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(6);
        dVar.a(new org.bouncycastle.asn1.i(f25869g));
        dVar.a(this.f25870a);
        dVar.a(new h(this.f25871b, this.f25875f));
        dVar.a(this.f25872c);
        dVar.a(new org.bouncycastle.asn1.i(this.f25873d));
        BigInteger bigInteger = this.f25874e;
        if (bigInteger != null) {
            dVar.a(new org.bouncycastle.asn1.i(bigInteger));
        }
        return new w0(dVar);
    }
}