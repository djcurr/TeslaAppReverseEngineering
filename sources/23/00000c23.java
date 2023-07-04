package b60;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class c extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f7517a;

    /* renamed from: b  reason: collision with root package name */
    private int f7518b;

    private c(p pVar) {
        this.f7517a = l.p(pVar.r(0)).r();
        this.f7518b = pVar.size() == 2 ? i.p(pVar.r(1)).x() : 12;
    }

    public c(byte[] bArr, int i11) {
        this.f7517a = org.bouncycastle.util.a.h(bArr);
        this.f7518b = i11;
    }

    public static c f(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(p.p(obj));
        }
        return null;
    }

    public int e() {
        return this.f7518b;
    }

    public byte[] h() {
        return org.bouncycastle.util.a.h(this.f7517a);
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        d dVar = new d(2);
        dVar.a(new s0(this.f7517a));
        int i11 = this.f7518b;
        if (i11 != 12) {
            dVar.a(new i(i11));
        }
        return new w0(dVar);
    }
}