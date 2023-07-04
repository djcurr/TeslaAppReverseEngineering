package e50;

import java.util.Enumeration;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class e0 extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private y[] f24680a;

    /* renamed from: b  reason: collision with root package name */
    private y[] f24681b;

    private e0(org.bouncycastle.asn1.p pVar) {
        Enumeration s11 = pVar.s();
        while (s11.hasMoreElements()) {
            org.bouncycastle.asn1.s p11 = org.bouncycastle.asn1.s.p(s11.nextElement());
            int s12 = p11.s();
            if (s12 == 0) {
                this.f24680a = f(org.bouncycastle.asn1.p.q(p11, false));
            } else if (s12 != 1) {
                throw new IllegalArgumentException("Unknown tag encountered: " + p11.s());
            } else {
                this.f24681b = f(org.bouncycastle.asn1.p.q(p11, false));
            }
        }
    }

    private static y[] e(y[] yVarArr) {
        if (yVarArr != null) {
            int length = yVarArr.length;
            y[] yVarArr2 = new y[length];
            System.arraycopy(yVarArr, 0, yVarArr2, 0, length);
            return yVarArr2;
        }
        return null;
    }

    private y[] f(org.bouncycastle.asn1.p pVar) {
        int size = pVar.size();
        y[] yVarArr = new y[size];
        for (int i11 = 0; i11 != size; i11++) {
            yVarArr[i11] = y.f(pVar.r(i11));
        }
        return yVarArr;
    }

    public static e0 i(Object obj) {
        if (obj instanceof e0) {
            return (e0) obj;
        }
        if (obj != null) {
            return new e0(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public y[] h() {
        return e(this.f24681b);
    }

    public y[] j() {
        return e(this.f24680a);
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(2);
        y[] yVarArr = this.f24680a;
        if (yVarArr != null) {
            dVar.a(new z0(false, 0, new org.bouncycastle.asn1.w0(yVarArr)));
        }
        y[] yVarArr2 = this.f24681b;
        if (yVarArr2 != null) {
            dVar.a(new z0(false, 1, new org.bouncycastle.asn1.w0(yVarArr2)));
        }
        return new org.bouncycastle.asn1.w0(dVar);
    }
}