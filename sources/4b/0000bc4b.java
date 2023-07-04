package w40;

import java.math.BigInteger;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class u extends e40.c {

    /* renamed from: e  reason: collision with root package name */
    public static final e50.b f55588e;

    /* renamed from: f  reason: collision with root package name */
    public static final e50.b f55589f;

    /* renamed from: g  reason: collision with root package name */
    public static final org.bouncycastle.asn1.i f55590g;

    /* renamed from: h  reason: collision with root package name */
    public static final org.bouncycastle.asn1.i f55591h;

    /* renamed from: a  reason: collision with root package name */
    private e50.b f55592a;

    /* renamed from: b  reason: collision with root package name */
    private e50.b f55593b;

    /* renamed from: c  reason: collision with root package name */
    private org.bouncycastle.asn1.i f55594c;

    /* renamed from: d  reason: collision with root package name */
    private org.bouncycastle.asn1.i f55595d;

    static {
        e50.b bVar = new e50.b(v40.b.f54051f, q0.f43085a);
        f55588e = bVar;
        f55589f = new e50.b(n.f55553u1, bVar);
        f55590g = new org.bouncycastle.asn1.i(20L);
        f55591h = new org.bouncycastle.asn1.i(1L);
    }

    public u() {
        this.f55592a = f55588e;
        this.f55593b = f55589f;
        this.f55594c = f55590g;
        this.f55595d = f55591h;
    }

    public u(e50.b bVar, e50.b bVar2, org.bouncycastle.asn1.i iVar, org.bouncycastle.asn1.i iVar2) {
        this.f55592a = bVar;
        this.f55593b = bVar2;
        this.f55594c = iVar;
        this.f55595d = iVar2;
    }

    private u(org.bouncycastle.asn1.p pVar) {
        this.f55592a = f55588e;
        this.f55593b = f55589f;
        this.f55594c = f55590g;
        this.f55595d = f55591h;
        for (int i11 = 0; i11 != pVar.size(); i11++) {
            org.bouncycastle.asn1.s sVar = (org.bouncycastle.asn1.s) pVar.r(i11);
            int s11 = sVar.s();
            if (s11 == 0) {
                this.f55592a = e50.b.h(sVar, true);
            } else if (s11 == 1) {
                this.f55593b = e50.b.h(sVar, true);
            } else if (s11 == 2) {
                this.f55594c = org.bouncycastle.asn1.i.q(sVar, true);
            } else if (s11 != 3) {
                throw new IllegalArgumentException("unknown tag");
            } else {
                this.f55595d = org.bouncycastle.asn1.i.q(sVar, true);
            }
        }
    }

    public static u f(Object obj) {
        if (obj instanceof u) {
            return (u) obj;
        }
        if (obj != null) {
            return new u(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public e50.b e() {
        return this.f55592a;
    }

    public e50.b h() {
        return this.f55593b;
    }

    public BigInteger i() {
        return this.f55594c.s();
    }

    public BigInteger j() {
        return this.f55595d.s();
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(4);
        if (!this.f55592a.equals(f55588e)) {
            dVar.a(new z0(true, 0, this.f55592a));
        }
        if (!this.f55593b.equals(f55589f)) {
            dVar.a(new z0(true, 1, this.f55593b));
        }
        if (!this.f55594c.j(f55590g)) {
            dVar.a(new z0(true, 2, this.f55594c));
        }
        if (!this.f55595d.j(f55591h)) {
            dVar.a(new z0(true, 3, this.f55595d));
        }
        return new w0(dVar);
    }
}