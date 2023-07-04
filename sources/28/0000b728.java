package u40;

import e50.v;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class h extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    b f53152a;

    /* renamed from: b  reason: collision with root package name */
    v f53153b;

    public h(b bVar, v vVar) {
        this.f53152a = bVar;
        this.f53153b = vVar;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f53152a);
        v vVar = this.f53153b;
        if (vVar != null) {
            dVar.a(new z0(true, 0, vVar));
        }
        return new w0(dVar);
    }
}