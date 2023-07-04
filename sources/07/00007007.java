package g40;

import java.math.BigInteger;
import java.util.Date;
import org.bouncycastle.asn1.a1;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.n0;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class h extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final BigInteger f27751a;

    /* renamed from: b  reason: collision with root package name */
    private final e50.b f27752b;

    /* renamed from: c  reason: collision with root package name */
    private final org.bouncycastle.asn1.g f27753c;

    /* renamed from: d  reason: collision with root package name */
    private final org.bouncycastle.asn1.g f27754d;

    /* renamed from: e  reason: collision with root package name */
    private final f f27755e;

    /* renamed from: f  reason: collision with root package name */
    private final String f27756f;

    public h(e50.b bVar, Date date, Date date2, f fVar, String str) {
        this.f27751a = BigInteger.valueOf(1L);
        this.f27752b = bVar;
        this.f27753c = new n0(date);
        this.f27754d = new n0(date2);
        this.f27755e = fVar;
        this.f27756f = str;
    }

    private h(p pVar) {
        this.f27751a = org.bouncycastle.asn1.i.p(pVar.r(0)).s();
        this.f27752b = e50.b.f(pVar.r(1));
        this.f27753c = org.bouncycastle.asn1.g.t(pVar.r(2));
        this.f27754d = org.bouncycastle.asn1.g.t(pVar.r(3));
        this.f27755e = f.e(pVar.r(4));
        this.f27756f = pVar.size() == 6 ? a1.p(pVar.r(5)).getString() : null;
    }

    public static h f(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(p.p(obj));
        }
        return null;
    }

    public org.bouncycastle.asn1.g e() {
        return this.f27753c;
    }

    public e50.b h() {
        return this.f27752b;
    }

    public org.bouncycastle.asn1.g i() {
        return this.f27754d;
    }

    public f j() {
        return this.f27755e;
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(6);
        dVar.a(new org.bouncycastle.asn1.i(this.f27751a));
        dVar.a(this.f27752b);
        dVar.a(this.f27753c);
        dVar.a(this.f27754d);
        dVar.a(this.f27755e);
        String str = this.f27756f;
        if (str != null) {
            dVar.a(new a1(str));
        }
        return new w0(dVar);
    }
}