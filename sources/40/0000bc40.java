package w40;

import java.math.BigInteger;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class j extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.asn1.i f55513a;

    /* renamed from: b  reason: collision with root package name */
    org.bouncycastle.asn1.l f55514b;

    private j(org.bouncycastle.asn1.p pVar) {
        this.f55514b = (org.bouncycastle.asn1.l) pVar.r(0);
        this.f55513a = (org.bouncycastle.asn1.i) pVar.r(1);
    }

    public j(byte[] bArr, int i11) {
        if (bArr.length != 8) {
            throw new IllegalArgumentException("salt length must be 8");
        }
        this.f55514b = new s0(bArr);
        this.f55513a = new org.bouncycastle.asn1.i(i11);
    }

    public static j e(Object obj) {
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj != null) {
            return new j(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public BigInteger f() {
        return this.f55513a.s();
    }

    public byte[] h() {
        return this.f55514b.r();
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f55514b);
        dVar.a(this.f55513a);
        return new w0(dVar);
    }
}