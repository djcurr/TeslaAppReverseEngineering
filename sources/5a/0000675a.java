package e50;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* loaded from: classes5.dex */
public class v extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private Hashtable f24806a = new Hashtable();

    /* renamed from: b  reason: collision with root package name */
    private Vector f24807b = new Vector();

    private v(org.bouncycastle.asn1.p pVar) {
        Enumeration s11 = pVar.s();
        while (s11.hasMoreElements()) {
            u i11 = u.i(s11.nextElement());
            if (this.f24806a.containsKey(i11.f())) {
                throw new IllegalArgumentException("repeated extension found: " + i11.f());
            }
            this.f24806a.put(i11.f(), i11);
            this.f24807b.addElement(i11.f());
        }
    }

    public static v f(Object obj) {
        if (obj instanceof v) {
            return (v) obj;
        }
        if (obj != null) {
            return new v(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public static v h(org.bouncycastle.asn1.s sVar, boolean z11) {
        return f(org.bouncycastle.asn1.p.q(sVar, z11));
    }

    public u e(org.bouncycastle.asn1.k kVar) {
        return (u) this.f24806a.get(kVar);
    }

    public Enumeration i() {
        return this.f24807b.elements();
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(this.f24807b.size());
        Enumeration elements = this.f24807b.elements();
        while (elements.hasMoreElements()) {
            dVar.a((u) this.f24806a.get((org.bouncycastle.asn1.k) elements.nextElement()));
        }
        return new org.bouncycastle.asn1.w0(dVar);
    }
}