package w40;

import java.util.Enumeration;
import org.bouncycastle.asn1.b0;
import org.bouncycastle.asn1.f0;
import org.bouncycastle.asn1.k1;

/* loaded from: classes5.dex */
public class c extends e40.c implements n {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.k f55498a;

    /* renamed from: b  reason: collision with root package name */
    private e40.b f55499b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f55500c;

    public c(org.bouncycastle.asn1.k kVar, e40.b bVar) {
        this.f55500c = true;
        this.f55498a = kVar;
        this.f55499b = bVar;
    }

    private c(org.bouncycastle.asn1.p pVar) {
        this.f55500c = true;
        Enumeration s11 = pVar.s();
        this.f55498a = (org.bouncycastle.asn1.k) s11.nextElement();
        if (s11.hasMoreElements()) {
            this.f55499b = ((org.bouncycastle.asn1.s) s11.nextElement()).r();
        }
        this.f55500c = pVar instanceof b0;
    }

    public static c h(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public e40.b e() {
        return this.f55499b;
    }

    public org.bouncycastle.asn1.k f() {
        return this.f55498a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f55498a);
        e40.b bVar = this.f55499b;
        if (bVar != null) {
            dVar.a(new f0(true, 0, bVar));
        }
        return this.f55500c ? new b0(dVar) : new k1(dVar);
    }
}