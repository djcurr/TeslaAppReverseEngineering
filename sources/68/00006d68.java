package f50;

import java.util.Enumeration;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class a extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.i f25825a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.asn1.i f25826b;

    /* renamed from: c  reason: collision with root package name */
    private org.bouncycastle.asn1.i f25827c;

    /* renamed from: d  reason: collision with root package name */
    private org.bouncycastle.asn1.i f25828d;

    /* renamed from: e  reason: collision with root package name */
    private b f25829e;

    private a(p pVar) {
        if (pVar.size() < 3 || pVar.size() > 5) {
            throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
        }
        Enumeration s11 = pVar.s();
        this.f25825a = org.bouncycastle.asn1.i.p(s11.nextElement());
        this.f25826b = org.bouncycastle.asn1.i.p(s11.nextElement());
        this.f25827c = org.bouncycastle.asn1.i.p(s11.nextElement());
        e40.b h11 = h(s11);
        if (h11 != null && (h11 instanceof org.bouncycastle.asn1.i)) {
            this.f25828d = org.bouncycastle.asn1.i.p(h11);
            h11 = h(s11);
        }
        if (h11 != null) {
            this.f25829e = b.e(h11.toASN1Primitive());
        }
    }

    public static a f(Object obj) {
        if (obj == null || (obj instanceof a)) {
            return (a) obj;
        }
        if (obj instanceof p) {
            return new a((p) obj);
        }
        throw new IllegalArgumentException("Invalid DHDomainParameters: " + obj.getClass().getName());
    }

    private static e40.b h(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (e40.b) enumeration.nextElement();
        }
        return null;
    }

    public org.bouncycastle.asn1.i e() {
        return this.f25826b;
    }

    public org.bouncycastle.asn1.i i() {
        return this.f25825a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(5);
        dVar.a(this.f25825a);
        dVar.a(this.f25826b);
        dVar.a(this.f25827c);
        org.bouncycastle.asn1.i iVar = this.f25828d;
        if (iVar != null) {
            dVar.a(iVar);
        }
        b bVar = this.f25829e;
        if (bVar != null) {
            dVar.a(bVar);
        }
        return new w0(dVar);
    }
}