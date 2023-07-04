package w40;

import java.util.Enumeration;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class f extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private e50.b f55505a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.asn1.l f55506b;

    public f(e50.b bVar, byte[] bArr) {
        this.f55505a = bVar;
        this.f55506b = new s0(bArr);
    }

    private f(org.bouncycastle.asn1.p pVar) {
        Enumeration s11 = pVar.s();
        this.f55505a = e50.b.f(s11.nextElement());
        this.f55506b = org.bouncycastle.asn1.l.p(s11.nextElement());
    }

    public static f h(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public byte[] e() {
        return this.f55506b.r();
    }

    public e50.b f() {
        return this.f55505a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f55505a);
        dVar.a(this.f55506b);
        return new w0(dVar);
    }
}