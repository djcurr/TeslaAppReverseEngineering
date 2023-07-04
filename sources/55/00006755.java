package e50;

import java.util.Enumeration;

/* loaded from: classes5.dex */
public class s0 extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.p f24777a;

    private s0(org.bouncycastle.asn1.p pVar) {
        this.f24777a = pVar;
    }

    public static s0 e(Object obj) {
        if (obj instanceof s0) {
            return (s0) obj;
        }
        if (obj != null) {
            return new s0(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public q0[] f() {
        q0[] q0VarArr = new q0[this.f24777a.size()];
        Enumeration s11 = this.f24777a.s();
        int i11 = 0;
        while (s11.hasMoreElements()) {
            q0VarArr[i11] = q0.e(s11.nextElement());
            i11++;
        }
        return q0VarArr;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return this.f24777a;
    }
}