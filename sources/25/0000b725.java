package u40;

import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class e extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    o f53148a;

    public e(o oVar, m mVar) {
        this.f53148a = oVar;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f53148a);
        return new w0(dVar);
    }
}