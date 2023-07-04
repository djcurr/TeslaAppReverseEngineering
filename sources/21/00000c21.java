package b60;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class a extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f7509a;

    /* renamed from: b  reason: collision with root package name */
    private int f7510b;

    private a(p pVar) {
        this.f7509a = l.p(pVar.r(0)).r();
        this.f7510b = pVar.size() == 2 ? i.p(pVar.r(1)).x() : 12;
    }

    public a(byte[] bArr, int i11) {
        this.f7509a = org.bouncycastle.util.a.h(bArr);
        this.f7510b = i11;
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

    public int e() {
        return this.f7510b;
    }

    public byte[] h() {
        return org.bouncycastle.util.a.h(this.f7509a);
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        d dVar = new d(2);
        dVar.a(new s0(this.f7509a));
        int i11 = this.f7510b;
        if (i11 != 12) {
            dVar.a(new i(i11));
        }
        return new w0(dVar);
    }
}