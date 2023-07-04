package g40;

import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class b extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final e50.b f27736a;

    /* renamed from: b  reason: collision with root package name */
    private final org.bouncycastle.asn1.l f27737b;

    public b(e50.b bVar, byte[] bArr) {
        this.f27736a = bVar;
        this.f27737b = new s0(bArr);
    }

    private b(p pVar) {
        this.f27736a = e50.b.f(pVar.r(0));
        this.f27737b = org.bouncycastle.asn1.l.p(pVar.r(1));
    }

    public static b h(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(p.p(obj));
        }
        return null;
    }

    public org.bouncycastle.asn1.l e() {
        return this.f27737b;
    }

    public e50.b f() {
        return this.f27736a;
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f27736a);
        dVar.a(this.f27737b);
        return new w0(dVar);
    }
}