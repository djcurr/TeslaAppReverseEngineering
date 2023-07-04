package e50;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes5.dex */
public class w0 extends e40.c {

    /* renamed from: c  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24814c;

    /* renamed from: a  reason: collision with root package name */
    private Hashtable f24815a = new Hashtable();

    /* renamed from: b  reason: collision with root package name */
    private Vector f24816b = new Vector();

    static {
        new org.bouncycastle.asn1.k("2.5.29.9");
        new org.bouncycastle.asn1.k("2.5.29.14");
        new org.bouncycastle.asn1.k("2.5.29.15");
        new org.bouncycastle.asn1.k("2.5.29.16");
        new org.bouncycastle.asn1.k("2.5.29.17");
        new org.bouncycastle.asn1.k("2.5.29.18");
        new org.bouncycastle.asn1.k("2.5.29.19");
        new org.bouncycastle.asn1.k("2.5.29.20");
        new org.bouncycastle.asn1.k("2.5.29.21");
        new org.bouncycastle.asn1.k("2.5.29.23");
        new org.bouncycastle.asn1.k("2.5.29.24");
        new org.bouncycastle.asn1.k("2.5.29.27");
        new org.bouncycastle.asn1.k("2.5.29.28");
        new org.bouncycastle.asn1.k("2.5.29.29");
        new org.bouncycastle.asn1.k("2.5.29.30");
        new org.bouncycastle.asn1.k("2.5.29.31");
        new org.bouncycastle.asn1.k("2.5.29.32");
        new org.bouncycastle.asn1.k("2.5.29.33");
        new org.bouncycastle.asn1.k("2.5.29.35");
        new org.bouncycastle.asn1.k("2.5.29.36");
        new org.bouncycastle.asn1.k("2.5.29.37");
        new org.bouncycastle.asn1.k("2.5.29.46");
        new org.bouncycastle.asn1.k("2.5.29.54");
        new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.1.1");
        new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.1.11");
        new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.1.12");
        new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.1.2");
        new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.1.3");
        new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.1.4");
        f24814c = new org.bouncycastle.asn1.k("2.5.29.56");
        new org.bouncycastle.asn1.k("2.5.29.55");
    }

    public w0(org.bouncycastle.asn1.p pVar) {
        Enumeration s11 = pVar.s();
        while (s11.hasMoreElements()) {
            org.bouncycastle.asn1.p p11 = org.bouncycastle.asn1.p.p(s11.nextElement());
            if (p11.size() == 3) {
                this.f24815a.put(p11.r(0), new v0(org.bouncycastle.asn1.c.q(p11.r(1)), org.bouncycastle.asn1.l.p(p11.r(2))));
            } else if (p11.size() != 2) {
                throw new IllegalArgumentException("Bad sequence size: " + p11.size());
            } else {
                this.f24815a.put(p11.r(0), new v0(false, org.bouncycastle.asn1.l.p(p11.r(1))));
            }
            this.f24816b.addElement(p11.r(0));
        }
    }

    public static w0 e(Object obj) {
        if (obj == null || (obj instanceof w0)) {
            return (w0) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.p) {
            return new w0((org.bouncycastle.asn1.p) obj);
        }
        if (obj instanceof v) {
            return new w0((org.bouncycastle.asn1.p) ((v) obj).toASN1Primitive());
        }
        if (obj instanceof org.bouncycastle.asn1.s) {
            return e(((org.bouncycastle.asn1.s) obj).r());
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(this.f24816b.size());
        Enumeration elements = this.f24816b.elements();
        while (elements.hasMoreElements()) {
            org.bouncycastle.asn1.d dVar2 = new org.bouncycastle.asn1.d(3);
            org.bouncycastle.asn1.k kVar = (org.bouncycastle.asn1.k) elements.nextElement();
            v0 v0Var = (v0) this.f24815a.get(kVar);
            dVar2.a(kVar);
            if (v0Var.c()) {
                dVar2.a(org.bouncycastle.asn1.c.f43024c);
            }
            dVar2.a(v0Var.b());
            dVar.a(new org.bouncycastle.asn1.w0(dVar2));
        }
        return new org.bouncycastle.asn1.w0(dVar);
    }
}