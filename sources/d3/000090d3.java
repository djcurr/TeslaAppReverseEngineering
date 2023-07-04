package org.bouncycastle.asn1;

/* loaded from: classes5.dex */
public abstract class f extends n {

    /* renamed from: a  reason: collision with root package name */
    protected k f43037a;

    /* renamed from: b  reason: collision with root package name */
    protected i f43038b;

    /* renamed from: c  reason: collision with root package name */
    protected n f43039c;

    /* renamed from: d  reason: collision with root package name */
    protected int f43040d;

    /* renamed from: e  reason: collision with root package name */
    protected n f43041e;

    public f(d dVar) {
        int i11 = 0;
        n u11 = u(dVar, 0);
        if (u11 instanceof k) {
            this.f43037a = (k) u11;
            u11 = u(dVar, 1);
            i11 = 1;
        }
        if (u11 instanceof i) {
            this.f43038b = (i) u11;
            i11++;
            u11 = u(dVar, i11);
        }
        if (!(u11 instanceof s)) {
            this.f43039c = u11;
            i11++;
            u11 = u(dVar, i11);
        }
        if (dVar.f() != i11 + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(u11 instanceof s)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        s sVar = (s) u11;
        x(sVar.s());
        this.f43041e = sVar.r();
    }

    public f(k kVar, i iVar, n nVar, int i11, n nVar2) {
        w(kVar);
        z(iVar);
        v(nVar);
        x(i11);
        y(nVar2.toASN1Primitive());
    }

    private n u(d dVar, int i11) {
        if (dVar.f() > i11) {
            return dVar.d(i11).toASN1Primitive();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    private void v(n nVar) {
        this.f43039c = nVar;
    }

    private void w(k kVar) {
        this.f43037a = kVar;
    }

    private void x(int i11) {
        if (i11 >= 0 && i11 <= 2) {
            this.f43040d = i11;
            return;
        }
        throw new IllegalArgumentException("invalid encoding value: " + i11);
    }

    private void y(n nVar) {
        this.f43041e = nVar;
    }

    private void z(i iVar) {
        this.f43038b = iVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        n nVar2;
        i iVar;
        k kVar;
        if (nVar instanceof f) {
            if (this == nVar) {
                return true;
            }
            f fVar = (f) nVar;
            k kVar2 = this.f43037a;
            if (kVar2 == null || ((kVar = fVar.f43037a) != null && kVar.j(kVar2))) {
                i iVar2 = this.f43038b;
                if (iVar2 == null || ((iVar = fVar.f43038b) != null && iVar.j(iVar2))) {
                    n nVar3 = this.f43039c;
                    if (nVar3 == null || ((nVar2 = fVar.f43039c) != null && nVar2.j(nVar3))) {
                        return this.f43041e.j(fVar.f43041e);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        return getEncoded().length;
    }

    @Override // e40.c
    public int hashCode() {
        k kVar = this.f43037a;
        int hashCode = kVar != null ? kVar.hashCode() : 0;
        i iVar = this.f43038b;
        if (iVar != null) {
            hashCode ^= iVar.hashCode();
        }
        n nVar = this.f43039c;
        if (nVar != null) {
            hashCode ^= nVar.hashCode();
        }
        return hashCode ^ this.f43041e.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n n() {
        return new k0(this.f43037a, this.f43038b, this.f43039c, this.f43040d, this.f43041e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public n o() {
        return new g1(this.f43037a, this.f43038b, this.f43039c, this.f43040d, this.f43041e);
    }

    public n p() {
        return this.f43039c;
    }

    public k q() {
        return this.f43037a;
    }

    public int r() {
        return this.f43040d;
    }

    public n s() {
        return this.f43041e;
    }

    public i t() {
        return this.f43038b;
    }
}