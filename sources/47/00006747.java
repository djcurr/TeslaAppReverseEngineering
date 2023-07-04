package e50;

import java.util.Enumeration;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class n0 extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    org.bouncycastle.asn1.i f24734a;

    /* renamed from: b  reason: collision with root package name */
    e50.b f24735b;

    /* renamed from: c  reason: collision with root package name */
    c50.c f24736c;

    /* renamed from: d  reason: collision with root package name */
    t0 f24737d;

    /* renamed from: e  reason: collision with root package name */
    t0 f24738e;

    /* renamed from: f  reason: collision with root package name */
    org.bouncycastle.asn1.p f24739f;

    /* renamed from: g  reason: collision with root package name */
    v f24740g;

    /* loaded from: classes5.dex */
    public static class b extends e40.c {

        /* renamed from: a  reason: collision with root package name */
        org.bouncycastle.asn1.p f24741a;

        /* renamed from: b  reason: collision with root package name */
        v f24742b;

        private b(org.bouncycastle.asn1.p pVar) {
            if (pVar.size() >= 2 && pVar.size() <= 3) {
                this.f24741a = pVar;
                return;
            }
            throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
        }

        public static b f(Object obj) {
            if (obj instanceof b) {
                return (b) obj;
            }
            if (obj != null) {
                return new b(org.bouncycastle.asn1.p.p(obj));
            }
            return null;
        }

        public v e() {
            if (this.f24742b == null && this.f24741a.size() == 3) {
                this.f24742b = v.f(this.f24741a.r(2));
            }
            return this.f24742b;
        }

        public t0 h() {
            return t0.f(this.f24741a.r(1));
        }

        public org.bouncycastle.asn1.i i() {
            return org.bouncycastle.asn1.i.p(this.f24741a.r(0));
        }

        public boolean j() {
            return this.f24741a.size() == 3;
        }

        @Override // e40.c, e40.b
        public org.bouncycastle.asn1.n toASN1Primitive() {
            return this.f24741a;
        }
    }

    /* loaded from: classes5.dex */
    private class c implements Enumeration {
        private c(n0 n0Var) {
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return false;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            throw new NoSuchElementException("Empty Enumeration");
        }
    }

    /* loaded from: classes5.dex */
    private class d implements Enumeration {

        /* renamed from: a  reason: collision with root package name */
        private final Enumeration f24743a;

        d(n0 n0Var, Enumeration enumeration) {
            this.f24743a = enumeration;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f24743a.hasMoreElements();
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            return b.f(this.f24743a.nextElement());
        }
    }

    public n0(org.bouncycastle.asn1.p pVar) {
        if (pVar.size() < 3 || pVar.size() > 7) {
            throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
        }
        int i11 = 0;
        if (pVar.r(0) instanceof org.bouncycastle.asn1.i) {
            this.f24734a = org.bouncycastle.asn1.i.p(pVar.r(0));
            i11 = 1;
        } else {
            this.f24734a = null;
        }
        int i12 = i11 + 1;
        this.f24735b = e50.b.f(pVar.r(i11));
        int i13 = i12 + 1;
        this.f24736c = c50.c.f(pVar.r(i12));
        int i14 = i13 + 1;
        this.f24737d = t0.f(pVar.r(i13));
        if (i14 < pVar.size() && ((pVar.r(i14) instanceof org.bouncycastle.asn1.t) || (pVar.r(i14) instanceof org.bouncycastle.asn1.g) || (pVar.r(i14) instanceof t0))) {
            this.f24738e = t0.f(pVar.r(i14));
            i14++;
        }
        if (i14 < pVar.size() && !(pVar.r(i14) instanceof org.bouncycastle.asn1.s)) {
            this.f24739f = org.bouncycastle.asn1.p.p(pVar.r(i14));
            i14++;
        }
        if (i14 >= pVar.size() || !(pVar.r(i14) instanceof org.bouncycastle.asn1.s)) {
            return;
        }
        this.f24740g = v.f(org.bouncycastle.asn1.p.q((org.bouncycastle.asn1.s) pVar.r(i14), true));
    }

    public static n0 f(Object obj) {
        if (obj instanceof n0) {
            return (n0) obj;
        }
        if (obj != null) {
            return new n0(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public v e() {
        return this.f24740g;
    }

    public c50.c h() {
        return this.f24736c;
    }

    public t0 i() {
        return this.f24738e;
    }

    public Enumeration j() {
        org.bouncycastle.asn1.p pVar = this.f24739f;
        return pVar == null ? new c() : new d(this, pVar.s());
    }

    public e50.b k() {
        return this.f24735b;
    }

    public t0 m() {
        return this.f24737d;
    }

    public int n() {
        org.bouncycastle.asn1.i iVar = this.f24734a;
        if (iVar == null) {
            return 1;
        }
        return iVar.x() + 1;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(7);
        org.bouncycastle.asn1.i iVar = this.f24734a;
        if (iVar != null) {
            dVar.a(iVar);
        }
        dVar.a(this.f24735b);
        dVar.a(this.f24736c);
        dVar.a(this.f24737d);
        t0 t0Var = this.f24738e;
        if (t0Var != null) {
            dVar.a(t0Var);
        }
        org.bouncycastle.asn1.p pVar = this.f24739f;
        if (pVar != null) {
            dVar.a(pVar);
        }
        v vVar = this.f24740g;
        if (vVar != null) {
            dVar.a(new z0(0, vVar));
        }
        return new org.bouncycastle.asn1.w0(dVar);
    }
}