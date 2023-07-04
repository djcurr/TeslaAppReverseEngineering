package w60;

import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class n extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f55737a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f55738b;

    private n(p pVar) {
        if (!org.bouncycastle.asn1.i.p(pVar.r(0)).t(0)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f55737a = org.bouncycastle.util.a.h(org.bouncycastle.asn1.l.p(pVar.r(1)).r());
        this.f55738b = org.bouncycastle.util.a.h(org.bouncycastle.asn1.l.p(pVar.r(2)).r());
    }

    public n(byte[] bArr, byte[] bArr2) {
        this.f55737a = org.bouncycastle.util.a.h(bArr);
        this.f55738b = org.bouncycastle.util.a.h(bArr2);
    }

    public static n e(Object obj) {
        if (obj instanceof n) {
            return (n) obj;
        }
        if (obj != null) {
            return new n(p.p(obj));
        }
        return null;
    }

    public byte[] f() {
        return org.bouncycastle.util.a.h(this.f55737a);
    }

    public byte[] h() {
        return org.bouncycastle.util.a.h(this.f55738b);
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d();
        dVar.a(new org.bouncycastle.asn1.i(0L));
        dVar.a(new s0(this.f55737a));
        dVar.a(new s0(this.f55738b));
        return new w0(dVar);
    }
}