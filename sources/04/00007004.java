package g40;

import java.math.BigInteger;
import java.util.Date;
import org.bouncycastle.asn1.a1;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.n0;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class e extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final BigInteger f27742a;

    /* renamed from: b  reason: collision with root package name */
    private final String f27743b;

    /* renamed from: c  reason: collision with root package name */
    private final org.bouncycastle.asn1.g f27744c;

    /* renamed from: d  reason: collision with root package name */
    private final org.bouncycastle.asn1.g f27745d;

    /* renamed from: e  reason: collision with root package name */
    private final org.bouncycastle.asn1.l f27746e;

    /* renamed from: f  reason: collision with root package name */
    private final String f27747f;

    public e(BigInteger bigInteger, String str, Date date, Date date2, byte[] bArr, String str2) {
        this.f27742a = bigInteger;
        this.f27743b = str;
        this.f27744c = new n0(date);
        this.f27745d = new n0(date2);
        this.f27746e = new s0(org.bouncycastle.util.a.h(bArr));
        this.f27747f = str2;
    }

    private e(p pVar) {
        this.f27742a = org.bouncycastle.asn1.i.p(pVar.r(0)).s();
        this.f27743b = a1.p(pVar.r(1)).getString();
        this.f27744c = org.bouncycastle.asn1.g.t(pVar.r(2));
        this.f27745d = org.bouncycastle.asn1.g.t(pVar.r(3));
        this.f27746e = org.bouncycastle.asn1.l.p(pVar.r(4));
        this.f27747f = pVar.size() == 6 ? a1.p(pVar.r(5)).getString() : null;
    }

    public static e i(Object obj) {
        if (obj instanceof e) {
            return (e) obj;
        }
        if (obj != null) {
            return new e(p.p(obj));
        }
        return null;
    }

    public org.bouncycastle.asn1.g e() {
        return this.f27744c;
    }

    public byte[] f() {
        return org.bouncycastle.util.a.h(this.f27746e.r());
    }

    public String h() {
        return this.f27743b;
    }

    public org.bouncycastle.asn1.g j() {
        return this.f27745d;
    }

    public BigInteger k() {
        return this.f27742a;
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(6);
        dVar.a(new org.bouncycastle.asn1.i(this.f27742a));
        dVar.a(new a1(this.f27743b));
        dVar.a(this.f27744c);
        dVar.a(this.f27745d);
        dVar.a(this.f27746e);
        String str = this.f27747f;
        if (str != null) {
            dVar.a(new a1(str));
        }
        return new w0(dVar);
    }
}