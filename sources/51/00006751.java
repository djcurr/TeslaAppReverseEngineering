package e50;

import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class q0 extends e40.c implements e40.a {

    /* renamed from: a  reason: collision with root package name */
    private w f24769a;

    /* renamed from: b  reason: collision with root package name */
    private w f24770b;

    private q0(org.bouncycastle.asn1.s sVar) {
        int s11 = sVar.s();
        if (s11 == 0) {
            this.f24769a = w.h(sVar, true);
        } else if (s11 == 1) {
            this.f24770b = w.h(sVar, true);
        } else {
            throw new IllegalArgumentException("unknown tag: " + sVar.s());
        }
    }

    public static q0 e(Object obj) {
        if (obj == null || (obj instanceof q0)) {
            return (q0) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.s) {
            return new q0((org.bouncycastle.asn1.s) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass());
    }

    public w f() {
        return this.f24770b;
    }

    public w h() {
        return this.f24769a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        w wVar = this.f24769a;
        return wVar != null ? new z0(true, 0, wVar) : new z0(true, 1, this.f24770b);
    }
}