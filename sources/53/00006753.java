package e50;

import java.util.Enumeration;

/* loaded from: classes5.dex */
public class r0 extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.p f24773a;

    private r0(org.bouncycastle.asn1.p pVar) {
        this.f24773a = pVar;
    }

    public static r0 e(Object obj) {
        if (obj instanceof r0) {
            return (r0) obj;
        }
        if (obj != null) {
            return new r0(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public s0[] f() {
        s0[] s0VarArr = new s0[this.f24773a.size()];
        Enumeration s11 = this.f24773a.s();
        int i11 = 0;
        while (s11.hasMoreElements()) {
            s0VarArr[i11] = s0.e(s11.nextElement());
            i11++;
        }
        return s0VarArr;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return this.f24773a;
    }
}