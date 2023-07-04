package g3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j extends p {
    public j(f3.e eVar) {
        super(eVar);
        eVar.f25708d.f();
        eVar.f25710e.f();
        this.f27545f = ((f3.g) eVar).r1();
    }

    private void q(f fVar) {
        this.f27547h.f27520k.add(fVar);
        fVar.f27521l.add(this.f27547h);
    }

    @Override // g3.p, g3.d
    public void a(d dVar) {
        f fVar = this.f27547h;
        if (fVar.f27512c && !fVar.f27519j) {
            this.f27547h.d((int) ((fVar.f27521l.get(0).f27516g * ((f3.g) this.f27541b).u1()) + 0.5f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g3.p
    public void d() {
        f3.g gVar = (f3.g) this.f27541b;
        int s12 = gVar.s1();
        int t12 = gVar.t1();
        gVar.u1();
        if (gVar.r1() == 1) {
            if (s12 != -1) {
                this.f27547h.f27521l.add(this.f27541b.Y.f25708d.f27547h);
                this.f27541b.Y.f25708d.f27547h.f27520k.add(this.f27547h);
                this.f27547h.f27515f = s12;
            } else if (t12 != -1) {
                this.f27547h.f27521l.add(this.f27541b.Y.f25708d.f27548i);
                this.f27541b.Y.f25708d.f27548i.f27520k.add(this.f27547h);
                this.f27547h.f27515f = -t12;
            } else {
                f fVar = this.f27547h;
                fVar.f27511b = true;
                fVar.f27521l.add(this.f27541b.Y.f25708d.f27548i);
                this.f27541b.Y.f25708d.f27548i.f27520k.add(this.f27547h);
            }
            q(this.f27541b.f25708d.f27547h);
            q(this.f27541b.f25708d.f27548i);
            return;
        }
        if (s12 != -1) {
            this.f27547h.f27521l.add(this.f27541b.Y.f25710e.f27547h);
            this.f27541b.Y.f25710e.f27547h.f27520k.add(this.f27547h);
            this.f27547h.f27515f = s12;
        } else if (t12 != -1) {
            this.f27547h.f27521l.add(this.f27541b.Y.f25710e.f27548i);
            this.f27541b.Y.f25710e.f27548i.f27520k.add(this.f27547h);
            this.f27547h.f27515f = -t12;
        } else {
            f fVar2 = this.f27547h;
            fVar2.f27511b = true;
            fVar2.f27521l.add(this.f27541b.Y.f25710e.f27548i);
            this.f27541b.Y.f25710e.f27548i.f27520k.add(this.f27547h);
        }
        q(this.f27541b.f25710e.f27547h);
        q(this.f27541b.f25710e.f27548i);
    }

    @Override // g3.p
    public void e() {
        if (((f3.g) this.f27541b).r1() == 1) {
            this.f27541b.l1(this.f27547h.f27516g);
        } else {
            this.f27541b.m1(this.f27547h.f27516g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g3.p
    public void f() {
        this.f27547h.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // g3.p
    public boolean m() {
        return false;
    }
}