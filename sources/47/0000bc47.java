package w40;

import java.math.BigInteger;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class q extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.asn1.i f55568a;

    /* renamed from: b  reason: collision with root package name */
    org.bouncycastle.asn1.l f55569b;

    public q(int i11, byte[] bArr) {
        this.f55568a = new org.bouncycastle.asn1.i(i11);
        this.f55569b = new s0(bArr);
    }

    private q(org.bouncycastle.asn1.p pVar) {
        e40.b r11;
        if (pVar.size() == 1) {
            this.f55568a = null;
            r11 = pVar.r(0);
        } else {
            this.f55568a = (org.bouncycastle.asn1.i) pVar.r(0);
            r11 = pVar.r(1);
        }
        this.f55569b = (org.bouncycastle.asn1.l) r11;
    }

    public q(byte[] bArr) {
        this.f55568a = null;
        this.f55569b = new s0(bArr);
    }

    public static q f(Object obj) {
        if (obj instanceof q) {
            return (q) obj;
        }
        if (obj != null) {
            return new q(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public byte[] e() {
        return this.f55569b.r();
    }

    public BigInteger h() {
        org.bouncycastle.asn1.i iVar = this.f55568a;
        if (iVar == null) {
            return null;
        }
        return iVar.s();
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        org.bouncycastle.asn1.i iVar = this.f55568a;
        if (iVar != null) {
            dVar.a(iVar);
        }
        dVar.a(this.f55569b);
        return new w0(dVar);
    }
}