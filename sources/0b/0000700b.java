package g40;

import e50.n;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class l extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final e50.b f27764a;

    /* renamed from: b  reason: collision with root package name */
    private final p f27765b;

    /* renamed from: c  reason: collision with root package name */
    private final org.bouncycastle.asn1.b f27766c;

    public l(e50.b bVar, byte[] bArr) {
        this.f27764a = bVar;
        this.f27765b = null;
        this.f27766c = new j0(org.bouncycastle.util.a.h(bArr));
    }

    public l(e50.b bVar, n[] nVarArr, byte[] bArr) {
        this.f27764a = bVar;
        this.f27765b = new w0(nVarArr);
        this.f27766c = new j0(org.bouncycastle.util.a.h(bArr));
    }

    private l(p pVar) {
        this.f27764a = e50.b.f(pVar.r(0));
        int i11 = 1;
        if (pVar.r(1) instanceof s) {
            this.f27765b = p.p(s.p(pVar.r(1)).r());
            i11 = 2;
        } else {
            this.f27765b = null;
        }
        this.f27766c = j0.v(pVar.r(i11));
    }

    public static l f(Object obj) {
        if (obj instanceof l) {
            return (l) obj;
        }
        if (obj != null) {
            return new l(p.p(obj));
        }
        return null;
    }

    public n[] e() {
        p pVar = this.f27765b;
        if (pVar == null) {
            return null;
        }
        int size = pVar.size();
        n[] nVarArr = new n[size];
        for (int i11 = 0; i11 != size; i11++) {
            nVarArr[i11] = n.f(this.f27765b.r(i11));
        }
        return nVarArr;
    }

    public org.bouncycastle.asn1.b h() {
        return new j0(this.f27766c.q(), this.f27766c.s());
    }

    public e50.b i() {
        return this.f27764a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        dVar.a(this.f27764a);
        p pVar = this.f27765b;
        if (pVar != null) {
            dVar.a(new z0(0, pVar));
        }
        dVar.a(this.f27766c);
        return new w0(dVar);
    }
}