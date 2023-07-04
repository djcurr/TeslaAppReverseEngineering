package q40;

import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class a extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    i f47452a;

    /* renamed from: b  reason: collision with root package name */
    l f47453b;

    private a(p pVar) {
        this.f47453b = (l) pVar.r(0);
        this.f47452a = (i) pVar.r(1);
    }

    public a(byte[] bArr, int i11) {
        this.f47453b = new s0(org.bouncycastle.util.a.h(bArr));
        this.f47452a = new i(i11);
    }

    public static a f(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(p.p(obj));
        }
        return null;
    }

    public byte[] e() {
        return org.bouncycastle.util.a.h(this.f47453b.r());
    }

    public int h() {
        return this.f47452a.x();
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f47453b);
        dVar.a(this.f47452a);
        return new w0(dVar);
    }
}