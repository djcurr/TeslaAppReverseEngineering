package w40;

import java.math.BigInteger;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class m extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.asn1.i f55522a;

    /* renamed from: b  reason: collision with root package name */
    org.bouncycastle.asn1.l f55523b;

    private m(org.bouncycastle.asn1.p pVar) {
        this.f55523b = (org.bouncycastle.asn1.l) pVar.r(0);
        this.f55522a = org.bouncycastle.asn1.i.p(pVar.r(1));
    }

    public m(byte[] bArr, int i11) {
        this.f55523b = new s0(bArr);
        this.f55522a = new org.bouncycastle.asn1.i(i11);
    }

    public static m f(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj != null) {
            return new m(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public byte[] e() {
        return this.f55523b.r();
    }

    public BigInteger h() {
        return this.f55522a.s();
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f55523b);
        dVar.a(this.f55522a);
        return new w0(dVar);
    }
}