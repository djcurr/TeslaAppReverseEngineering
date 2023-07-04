package q60;

import n60.i;

/* loaded from: classes5.dex */
public class d2 extends i.b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public d2(n60.e eVar, n60.f fVar, n60.f fVar2) {
        super(eVar, fVar, fVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d2(n60.e eVar, n60.f fVar, n60.f fVar2, n60.f[] fVarArr) {
        super(eVar, fVar, fVar2, fVarArr);
    }

    @Override // n60.i
    public n60.i J() {
        if (u()) {
            return this;
        }
        n60.e i11 = i();
        n60.f fVar = this.f40629b;
        if (fVar.i()) {
            return i11.u();
        }
        n60.f fVar2 = this.f40630c;
        n60.f fVar3 = this.f40631d[0];
        boolean h11 = fVar3.h();
        n60.f o11 = h11 ? fVar3 : fVar3.o();
        n60.f a11 = h11 ? fVar2.o().a(fVar2) : fVar2.a(fVar3).j(fVar2);
        if (a11.i()) {
            return new d2(i11, a11, i11.o());
        }
        n60.f o12 = a11.o();
        n60.f j11 = h11 ? a11 : a11.j(o11);
        n60.f o13 = fVar2.a(fVar).o();
        if (!h11) {
            fVar3 = o11.o();
        }
        return new d2(i11, o12, o13.a(a11).a(o11).j(o13).a(fVar3).a(o12).a(j11), new n60.f[]{j11});
    }

    @Override // n60.i
    public n60.i K(n60.i iVar) {
        if (u()) {
            return iVar;
        }
        if (iVar.u()) {
            return J();
        }
        n60.e i11 = i();
        n60.f fVar = this.f40629b;
        if (fVar.i()) {
            return iVar;
        }
        n60.f n11 = iVar.n();
        n60.f s11 = iVar.s(0);
        if (n11.i() || !s11.h()) {
            return J().a(iVar);
        }
        n60.f fVar2 = this.f40630c;
        n60.f fVar3 = this.f40631d[0];
        n60.f o11 = iVar.o();
        n60.f o12 = fVar.o();
        n60.f o13 = fVar2.o();
        n60.f o14 = fVar3.o();
        n60.f a11 = o13.a(fVar2.j(fVar3));
        n60.f b11 = o11.b();
        n60.f l11 = b11.j(o14).a(o13).l(a11, o12, o14);
        n60.f j11 = n11.j(o14);
        n60.f o15 = j11.a(a11).o();
        if (o15.i()) {
            return l11.i() ? iVar.J() : i11.u();
        } else if (l11.i()) {
            return new d2(i11, l11, i11.o());
        } else {
            n60.f j12 = l11.o().j(j11);
            n60.f j13 = l11.j(o15).j(o14);
            return new d2(i11, j12, l11.a(o15).o().l(a11, b11, j13), new n60.f[]{j13});
        }
    }

    @Override // n60.i
    public n60.i a(n60.i iVar) {
        n60.f fVar;
        n60.f fVar2;
        n60.f fVar3;
        n60.f fVar4;
        n60.f fVar5;
        n60.f fVar6;
        if (u()) {
            return iVar;
        }
        if (iVar.u()) {
            return this;
        }
        n60.e i11 = i();
        n60.f fVar7 = this.f40629b;
        n60.f n11 = iVar.n();
        if (fVar7.i()) {
            return n11.i() ? i11.u() : iVar.a(this);
        }
        n60.f fVar8 = this.f40630c;
        n60.f fVar9 = this.f40631d[0];
        n60.f o11 = iVar.o();
        n60.f s11 = iVar.s(0);
        boolean h11 = fVar9.h();
        if (h11) {
            fVar = n11;
            fVar2 = o11;
        } else {
            fVar = n11.j(fVar9);
            fVar2 = o11.j(fVar9);
        }
        boolean h12 = s11.h();
        if (h12) {
            fVar3 = fVar8;
        } else {
            fVar7 = fVar7.j(s11);
            fVar3 = fVar8.j(s11);
        }
        n60.f a11 = fVar3.a(fVar2);
        n60.f a12 = fVar7.a(fVar);
        if (a12.i()) {
            return a11.i() ? J() : i11.u();
        }
        if (n11.i()) {
            n60.i A = A();
            n60.f q11 = A.q();
            n60.f r11 = A.r();
            n60.f d11 = r11.a(o11).d(q11);
            fVar4 = d11.o().a(d11).a(q11);
            if (fVar4.i()) {
                return new d2(i11, fVar4, i11.o());
            }
            fVar6 = d11.j(q11.a(fVar4)).a(fVar4).a(r11).d(fVar4).a(fVar4);
            fVar5 = i11.m(n60.d.f40585b);
        } else {
            n60.f o12 = a12.o();
            n60.f j11 = a11.j(fVar7);
            n60.f j12 = a11.j(fVar);
            n60.f j13 = j11.j(j12);
            if (j13.i()) {
                return new d2(i11, j13, i11.o());
            }
            n60.f j14 = a11.j(o12);
            n60.f j15 = !h12 ? j14.j(s11) : j14;
            n60.f p11 = j12.a(o12).p(j15, fVar8.a(fVar9));
            if (!h11) {
                j15 = j15.j(fVar9);
            }
            fVar4 = j13;
            fVar5 = j15;
            fVar6 = p11;
        }
        return new d2(i11, fVar4, fVar6, new n60.f[]{fVar5});
    }

    @Override // n60.i
    protected n60.i d() {
        return new d2(null, f(), g());
    }

    @Override // n60.i
    protected boolean h() {
        n60.f n11 = n();
        return (n11.i() || o().s() == n11.s()) ? false : true;
    }

    @Override // n60.i
    public n60.f r() {
        n60.f fVar = this.f40629b;
        n60.f fVar2 = this.f40630c;
        if (u() || fVar.i()) {
            return fVar2;
        }
        n60.f j11 = fVar2.a(fVar).j(fVar);
        n60.f fVar3 = this.f40631d[0];
        return !fVar3.h() ? j11.d(fVar3) : j11;
    }

    @Override // n60.i
    public n60.i z() {
        if (u()) {
            return this;
        }
        n60.f fVar = this.f40629b;
        if (fVar.i()) {
            return this;
        }
        n60.f fVar2 = this.f40630c;
        n60.f fVar3 = this.f40631d[0];
        return new d2(this.f40628a, fVar, fVar2.a(fVar3), new n60.f[]{fVar3});
    }
}