package g3;

import g3.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k extends p {
    public k(f3.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f27547h.f27520k.add(fVar);
        fVar.f27521l.add(this.f27547h);
    }

    @Override // g3.p, g3.d
    public void a(d dVar) {
        f3.a aVar = (f3.a) this.f27541b;
        int u12 = aVar.u1();
        int i11 = 0;
        int i12 = -1;
        for (f fVar : this.f27547h.f27521l) {
            int i13 = fVar.f27516g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (u12 != 0 && u12 != 2) {
            this.f27547h.d(i11 + aVar.v1());
        } else {
            this.f27547h.d(i12 + aVar.v1());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g3.p
    public void d() {
        f3.e eVar = this.f27541b;
        if (eVar instanceof f3.a) {
            this.f27547h.f27511b = true;
            f3.a aVar = (f3.a) eVar;
            int u12 = aVar.u1();
            boolean t12 = aVar.t1();
            int i11 = 0;
            if (u12 == 0) {
                this.f27547h.f27514e = f.a.LEFT;
                while (i11 < aVar.f25759y0) {
                    f3.e eVar2 = aVar.f25758x0[i11];
                    if (t12 || eVar2.V() != 8) {
                        f fVar = eVar2.f25708d.f27547h;
                        fVar.f27520k.add(this.f27547h);
                        this.f27547h.f27521l.add(fVar);
                    }
                    i11++;
                }
                q(this.f27541b.f25708d.f27547h);
                q(this.f27541b.f25708d.f27548i);
            } else if (u12 == 1) {
                this.f27547h.f27514e = f.a.RIGHT;
                while (i11 < aVar.f25759y0) {
                    f3.e eVar3 = aVar.f25758x0[i11];
                    if (t12 || eVar3.V() != 8) {
                        f fVar2 = eVar3.f25708d.f27548i;
                        fVar2.f27520k.add(this.f27547h);
                        this.f27547h.f27521l.add(fVar2);
                    }
                    i11++;
                }
                q(this.f27541b.f25708d.f27547h);
                q(this.f27541b.f25708d.f27548i);
            } else if (u12 == 2) {
                this.f27547h.f27514e = f.a.TOP;
                while (i11 < aVar.f25759y0) {
                    f3.e eVar4 = aVar.f25758x0[i11];
                    if (t12 || eVar4.V() != 8) {
                        f fVar3 = eVar4.f25710e.f27547h;
                        fVar3.f27520k.add(this.f27547h);
                        this.f27547h.f27521l.add(fVar3);
                    }
                    i11++;
                }
                q(this.f27541b.f25710e.f27547h);
                q(this.f27541b.f25710e.f27548i);
            } else if (u12 != 3) {
            } else {
                this.f27547h.f27514e = f.a.BOTTOM;
                while (i11 < aVar.f25759y0) {
                    f3.e eVar5 = aVar.f25758x0[i11];
                    if (t12 || eVar5.V() != 8) {
                        f fVar4 = eVar5.f25710e.f27548i;
                        fVar4.f27520k.add(this.f27547h);
                        this.f27547h.f27521l.add(fVar4);
                    }
                    i11++;
                }
                q(this.f27541b.f25710e.f27547h);
                q(this.f27541b.f25710e.f27548i);
            }
        }
    }

    @Override // g3.p
    public void e() {
        f3.e eVar = this.f27541b;
        if (eVar instanceof f3.a) {
            int u12 = ((f3.a) eVar).u1();
            if (u12 != 0 && u12 != 1) {
                this.f27541b.m1(this.f27547h.f27516g);
            } else {
                this.f27541b.l1(this.f27547h.f27516g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g3.p
    public void f() {
        this.f27542c = null;
        this.f27547h.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g3.p
    public boolean m() {
        return false;
    }
}