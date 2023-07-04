package g40;

import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class g extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final e40.b f27749a;

    /* renamed from: b  reason: collision with root package name */
    private final i f27750b;

    public g(b bVar, i iVar) {
        this.f27749a = bVar;
        this.f27750b = iVar;
    }

    private g(p pVar) {
        if (pVar.size() != 2) {
            throw new IllegalArgumentException("malformed sequence");
        }
        e40.b r11 = pVar.r(0);
        if (!(r11 instanceof b) && !(r11 instanceof h)) {
            p p11 = p.p(r11);
            r11 = p11.size() == 2 ? b.h(p11) : h.f(p11);
        }
        this.f27749a = r11;
        this.f27750b = i.e(pVar.r(1));
    }

    public static g e(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj != null) {
            return new g(p.p(obj));
        }
        return null;
    }

    public i f() {
        return this.f27750b;
    }

    public e40.b h() {
        return this.f27749a;
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        dVar.a(this.f27749a);
        dVar.a(this.f27750b);
        return new w0(dVar);
    }
}