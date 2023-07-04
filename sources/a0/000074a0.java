package i40;

import java.math.BigInteger;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class e extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    int f29874a;

    /* renamed from: b  reason: collision with root package name */
    i f29875b;

    /* renamed from: c  reason: collision with root package name */
    i f29876c;

    /* renamed from: d  reason: collision with root package name */
    i f29877d;

    public e(int i11, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f29874a = i11;
        this.f29875b = new i(bigInteger);
        this.f29876c = new i(bigInteger2);
        this.f29877d = new i(bigInteger3);
    }

    public BigInteger e() {
        return this.f29877d.r();
    }

    public BigInteger f() {
        return this.f29875b.r();
    }

    public BigInteger h() {
        return this.f29876c.r();
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(4);
        dVar.a(new i(this.f29874a));
        dVar.a(this.f29875b);
        dVar.a(this.f29876c);
        dVar.a(this.f29877d);
        return new w0(dVar);
    }
}