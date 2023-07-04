package w40;

import org.bouncycastle.asn1.q0;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class r extends e40.c {

    /* renamed from: d  reason: collision with root package name */
    public static final e50.b f55570d;

    /* renamed from: e  reason: collision with root package name */
    public static final e50.b f55571e;

    /* renamed from: f  reason: collision with root package name */
    public static final e50.b f55572f;

    /* renamed from: a  reason: collision with root package name */
    private e50.b f55573a;

    /* renamed from: b  reason: collision with root package name */
    private e50.b f55574b;

    /* renamed from: c  reason: collision with root package name */
    private e50.b f55575c;

    static {
        e50.b bVar = new e50.b(v40.b.f54051f, q0.f43085a);
        f55570d = bVar;
        f55571e = new e50.b(n.f55553u1, bVar);
        f55572f = new e50.b(n.f55555v1, new s0(new byte[0]));
    }

    public r() {
        this.f55573a = f55570d;
        this.f55574b = f55571e;
        this.f55575c = f55572f;
    }

    public r(e50.b bVar, e50.b bVar2, e50.b bVar3) {
        this.f55573a = bVar;
        this.f55574b = bVar2;
        this.f55575c = bVar3;
    }

    public r(org.bouncycastle.asn1.p pVar) {
        this.f55573a = f55570d;
        this.f55574b = f55571e;
        this.f55575c = f55572f;
        for (int i11 = 0; i11 != pVar.size(); i11++) {
            org.bouncycastle.asn1.s sVar = (org.bouncycastle.asn1.s) pVar.r(i11);
            int s11 = sVar.s();
            if (s11 == 0) {
                this.f55573a = e50.b.h(sVar, true);
            } else if (s11 == 1) {
                this.f55574b = e50.b.h(sVar, true);
            } else if (s11 != 2) {
                throw new IllegalArgumentException("unknown tag");
            } else {
                this.f55575c = e50.b.h(sVar, true);
            }
        }
    }

    public static r f(Object obj) {
        if (obj instanceof r) {
            return (r) obj;
        }
        if (obj != null) {
            return new r(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public e50.b e() {
        return this.f55573a;
    }

    public e50.b h() {
        return this.f55574b;
    }

    public e50.b i() {
        return this.f55575c;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        if (!this.f55573a.equals(f55570d)) {
            dVar.a(new z0(true, 0, this.f55573a));
        }
        if (!this.f55574b.equals(f55571e)) {
            dVar.a(new z0(true, 1, this.f55574b));
        }
        if (!this.f55575c.equals(f55572f)) {
            dVar.a(new z0(true, 2, this.f55575c));
        }
        return new w0(dVar);
    }
}