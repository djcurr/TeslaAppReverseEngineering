package q40;

import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class b extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    l f47454a;

    private b(p pVar) {
        this.f47454a = pVar.size() == 1 ? (l) pVar.r(0) : null;
    }

    public b(byte[] bArr) {
        this.f47454a = new s0(bArr);
    }

    public static b f(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(p.p(obj));
        }
        return null;
    }

    public byte[] e() {
        l lVar = this.f47454a;
        if (lVar != null) {
            return org.bouncycastle.util.a.h(lVar.r());
        }
        return null;
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(1);
        l lVar = this.f47454a;
        if (lVar != null) {
            dVar.a(lVar);
        }
        return new w0(dVar);
    }
}