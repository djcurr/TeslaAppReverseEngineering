package f50;

import java.math.BigInteger;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class e extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private j0 f25837a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.asn1.i f25838b;

    private e(p pVar) {
        if (pVar.size() == 2) {
            this.f25837a = j0.v(pVar.r(0));
            this.f25838b = org.bouncycastle.asn1.i.p(pVar.r(1));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
    }

    public e(byte[] bArr, int i11) {
        if (bArr == null) {
            throw new IllegalArgumentException("'seed' cannot be null");
        }
        this.f25837a = new j0(bArr);
        this.f25838b = new org.bouncycastle.asn1.i(i11);
    }

    public static e e(Object obj) {
        if (obj instanceof e) {
            return (e) obj;
        }
        if (obj != null) {
            return new e(p.p(obj));
        }
        return null;
    }

    public BigInteger f() {
        return this.f25838b.r();
    }

    public byte[] h() {
        return this.f25837a.q();
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f25837a);
        dVar.a(this.f25838b);
        return new w0(dVar);
    }
}