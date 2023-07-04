package u40;

import e50.v;
import e50.w;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class o extends e40.c {

    /* renamed from: f  reason: collision with root package name */
    private static final org.bouncycastle.asn1.i f53171f = new org.bouncycastle.asn1.i(0);

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.asn1.i f53172a = f53171f;

    /* renamed from: b  reason: collision with root package name */
    w f53173b;

    /* renamed from: c  reason: collision with root package name */
    p f53174c;

    /* renamed from: d  reason: collision with root package name */
    v f53175d;

    /* renamed from: e  reason: collision with root package name */
    boolean f53176e;

    public o(w wVar, p pVar, v vVar) {
        this.f53173b = wVar;
        this.f53174c = pVar;
        this.f53175d = vVar;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(4);
        if (!this.f53172a.j(f53171f) || this.f53176e) {
            dVar.a(new z0(true, 0, this.f53172a));
        }
        w wVar = this.f53173b;
        if (wVar != null) {
            dVar.a(new z0(true, 1, wVar));
        }
        dVar.a(this.f53174c);
        v vVar = this.f53175d;
        if (vVar != null) {
            dVar.a(new z0(true, 2, vVar));
        }
        return new w0(dVar);
    }
}