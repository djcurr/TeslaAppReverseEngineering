package v40;

import e40.c;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class a extends c {

    /* renamed from: a  reason: collision with root package name */
    i f54044a;

    /* renamed from: b  reason: collision with root package name */
    i f54045b;

    public a(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f54044a = new i(bigInteger);
        this.f54045b = new i(bigInteger2);
    }

    private a(p pVar) {
        Enumeration s11 = pVar.s();
        this.f54044a = (i) s11.nextElement();
        this.f54045b = (i) s11.nextElement();
    }

    public static a f(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(p.p(obj));
        }
        return null;
    }

    public BigInteger e() {
        return this.f54045b.r();
    }

    public BigInteger h() {
        return this.f54044a.r();
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        d dVar = new d(2);
        dVar.a(this.f54044a);
        dVar.a(this.f54045b);
        return new w0(dVar);
    }
}