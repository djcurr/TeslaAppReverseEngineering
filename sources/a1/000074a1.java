package i40;

import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class f extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private k f29878a;

    /* renamed from: b  reason: collision with root package name */
    private k f29879b;

    /* renamed from: c  reason: collision with root package name */
    private k f29880c;

    public f(k kVar, k kVar2) {
        this.f29878a = kVar;
        this.f29879b = kVar2;
        this.f29880c = null;
    }

    public f(k kVar, k kVar2, k kVar3) {
        this.f29878a = kVar;
        this.f29879b = kVar2;
        this.f29880c = kVar3;
    }

    private f(p pVar) {
        this.f29878a = (k) pVar.r(0);
        this.f29879b = (k) pVar.r(1);
        if (pVar.size() > 2) {
            this.f29880c = (k) pVar.r(2);
        }
    }

    public static f h(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(p.p(obj));
        }
        return null;
    }

    public k e() {
        return this.f29879b;
    }

    public k f() {
        return this.f29880c;
    }

    public k i() {
        return this.f29878a;
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        dVar.a(this.f29878a);
        dVar.a(this.f29879b);
        k kVar = this.f29880c;
        if (kVar != null) {
            dVar.a(kVar);
        }
        return new w0(dVar);
    }
}