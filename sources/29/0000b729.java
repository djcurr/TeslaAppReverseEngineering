package u40;

import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class i extends e40.c implements e40.a {

    /* renamed from: a  reason: collision with root package name */
    private e40.b f53154a;

    public i(c50.c cVar) {
        this.f53154a = cVar;
    }

    public i(org.bouncycastle.asn1.l lVar) {
        this.f53154a = lVar;
    }

    public static i e(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj instanceof s0) {
            return new i((s0) obj);
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return sVar.s() == 1 ? new i(c50.c.h(sVar, true)) : new i(org.bouncycastle.asn1.l.q(sVar, true));
        }
        return new i(c50.c.f(obj));
    }

    public byte[] f() {
        e40.b bVar = this.f53154a;
        if (bVar instanceof org.bouncycastle.asn1.l) {
            return ((org.bouncycastle.asn1.l) bVar).r();
        }
        return null;
    }

    public c50.c h() {
        e40.b bVar = this.f53154a;
        if (bVar instanceof org.bouncycastle.asn1.l) {
            return null;
        }
        return c50.c.f(bVar);
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        e40.b bVar = this.f53154a;
        return bVar instanceof org.bouncycastle.asn1.l ? new z0(true, 2, bVar) : new z0(true, 1, bVar);
    }
}