package c50;

import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class a extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private k f8878a;

    /* renamed from: b  reason: collision with root package name */
    private e40.b f8879b;

    public a(k kVar, e40.b bVar) {
        this.f8878a = kVar;
        this.f8879b = bVar;
    }

    private a(p pVar) {
        this.f8878a = (k) pVar.r(0);
        this.f8879b = pVar.r(1);
    }

    public static a e(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(p.p(obj));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    public k f() {
        return this.f8878a;
    }

    public e40.b h() {
        return this.f8879b;
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f8878a);
        dVar.a(this.f8879b);
        return new w0(dVar);
    }
}