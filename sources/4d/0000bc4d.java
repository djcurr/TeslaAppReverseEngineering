package w40;

import java.util.Enumeration;
import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class w extends e40.c implements n {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.i f55599a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.asn1.q f55600b;

    /* renamed from: c  reason: collision with root package name */
    private c f55601c;

    /* renamed from: d  reason: collision with root package name */
    private org.bouncycastle.asn1.q f55602d;

    /* renamed from: e  reason: collision with root package name */
    private org.bouncycastle.asn1.q f55603e;

    /* renamed from: f  reason: collision with root package name */
    private org.bouncycastle.asn1.q f55604f;

    public w(org.bouncycastle.asn1.i iVar, org.bouncycastle.asn1.q qVar, c cVar, org.bouncycastle.asn1.q qVar2, org.bouncycastle.asn1.q qVar3, org.bouncycastle.asn1.q qVar4) {
        this.f55599a = iVar;
        this.f55600b = qVar;
        this.f55601c = cVar;
        this.f55602d = qVar2;
        this.f55603e = qVar3;
        this.f55604f = qVar4;
    }

    public w(org.bouncycastle.asn1.p pVar) {
        Enumeration s11 = pVar.s();
        this.f55599a = (org.bouncycastle.asn1.i) s11.nextElement();
        this.f55600b = (org.bouncycastle.asn1.q) s11.nextElement();
        this.f55601c = c.h(s11.nextElement());
        while (s11.hasMoreElements()) {
            org.bouncycastle.asn1.n nVar = (org.bouncycastle.asn1.n) s11.nextElement();
            if (nVar instanceof org.bouncycastle.asn1.s) {
                org.bouncycastle.asn1.s sVar = (org.bouncycastle.asn1.s) nVar;
                int s12 = sVar.s();
                if (s12 == 0) {
                    this.f55602d = org.bouncycastle.asn1.q.r(sVar, false);
                } else if (s12 != 1) {
                    throw new IllegalArgumentException("unknown tag value " + sVar.s());
                } else {
                    this.f55603e = org.bouncycastle.asn1.q.r(sVar, false);
                }
            } else {
                this.f55604f = (org.bouncycastle.asn1.q) nVar;
            }
        }
    }

    public static w h(Object obj) {
        if (obj instanceof w) {
            return (w) obj;
        }
        if (obj != null) {
            return new w(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public org.bouncycastle.asn1.q e() {
        return this.f55603e;
    }

    public org.bouncycastle.asn1.q f() {
        return this.f55602d;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(6);
        dVar.a(this.f55599a);
        dVar.a(this.f55600b);
        dVar.a(this.f55601c);
        org.bouncycastle.asn1.q qVar = this.f55602d;
        if (qVar != null) {
            dVar.a(new z0(false, 0, qVar));
        }
        org.bouncycastle.asn1.q qVar2 = this.f55603e;
        if (qVar2 != null) {
            dVar.a(new z0(false, 1, qVar2));
        }
        dVar.a(this.f55604f);
        return new b0(dVar);
    }
}