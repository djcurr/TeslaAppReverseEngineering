package ni;

import ak.v;
import ci.i;
import ji.h;
import ji.i;
import ji.j;
import ji.u;
import ji.v;
import qi.k;
import wi.a;

/* loaded from: classes3.dex */
public final class a implements h {

    /* renamed from: b  reason: collision with root package name */
    private j f41664b;

    /* renamed from: c  reason: collision with root package name */
    private int f41665c;

    /* renamed from: d  reason: collision with root package name */
    private int f41666d;

    /* renamed from: e  reason: collision with root package name */
    private int f41667e;

    /* renamed from: g  reason: collision with root package name */
    private cj.b f41669g;

    /* renamed from: h  reason: collision with root package name */
    private i f41670h;

    /* renamed from: i  reason: collision with root package name */
    private c f41671i;

    /* renamed from: j  reason: collision with root package name */
    private k f41672j;

    /* renamed from: a  reason: collision with root package name */
    private final v f41663a = new v(12);

    /* renamed from: f  reason: collision with root package name */
    private long f41668f = -1;

    private void c() {
        g(new a.b[0]);
        ((j) ak.a.e(this.f41664b)).s();
        this.f41664b.p(new v.b(-9223372036854775807L));
        this.f41665c = 6;
    }

    private static cj.b f(String str, long j11) {
        b a11;
        if (j11 == -1 || (a11 = e.a(str)) == null) {
            return null;
        }
        return a11.a(j11);
    }

    private void g(a.b... bVarArr) {
        ((j) ak.a.e(this.f41664b)).f(1024, 4).d(new i.b().X(new wi.a(bVarArr)).E());
    }

    private void h(ji.i iVar) {
        this.f41663a.K(2);
        iVar.readFully(this.f41663a.d(), 0, 2);
        int I = this.f41663a.I();
        this.f41666d = I;
        if (I == 65498) {
            if (this.f41668f != -1) {
                this.f41665c = 4;
            } else {
                c();
            }
        } else if ((I < 65488 || I > 65497) && I != 65281) {
            this.f41665c = 1;
        }
    }

    private void i(ji.i iVar) {
        String w11;
        if (this.f41666d == 65505) {
            ak.v vVar = new ak.v(this.f41667e);
            iVar.readFully(vVar.d(), 0, this.f41667e);
            if (this.f41669g == null && "http://ns.adobe.com/xap/1.0/".equals(vVar.w()) && (w11 = vVar.w()) != null) {
                cj.b f11 = f(w11, iVar.getLength());
                this.f41669g = f11;
                if (f11 != null) {
                    this.f41668f = f11.f9261d;
                }
            }
        } else {
            iVar.k(this.f41667e);
        }
        this.f41665c = 0;
    }

    private void j(ji.i iVar) {
        this.f41663a.K(2);
        iVar.readFully(this.f41663a.d(), 0, 2);
        this.f41667e = this.f41663a.I() - 2;
        this.f41665c = 2;
    }

    private void k(ji.i iVar) {
        if (!iVar.a(this.f41663a.d(), 0, 1, true)) {
            c();
            return;
        }
        iVar.d();
        if (this.f41672j == null) {
            this.f41672j = new k();
        }
        c cVar = new c(iVar, this.f41668f);
        this.f41671i = cVar;
        if (this.f41672j.d(cVar)) {
            this.f41672j.b(new d(this.f41668f, (j) ak.a.e(this.f41664b)));
            l();
            return;
        }
        c();
    }

    private void l() {
        g((a.b) ak.a.e(this.f41669g));
        this.f41665c = 5;
    }

    @Override // ji.h
    public void a(long j11, long j12) {
        if (j11 == 0) {
            this.f41665c = 0;
        } else if (this.f41665c == 5) {
            ((k) ak.a.e(this.f41672j)).a(j11, j12);
        }
    }

    @Override // ji.h
    public void b(j jVar) {
        this.f41664b = jVar;
    }

    @Override // ji.h
    public boolean d(ji.i iVar) {
        iVar.n(this.f41663a.d(), 0, 12);
        if (this.f41663a.I() == 65496 && this.f41663a.I() == 65505) {
            this.f41663a.P(2);
            return this.f41663a.E() == 1165519206 && this.f41663a.I() == 0;
        }
        return false;
    }

    @Override // ji.h
    public int e(ji.i iVar, u uVar) {
        int i11 = this.f41665c;
        if (i11 == 0) {
            h(iVar);
            return 0;
        } else if (i11 == 1) {
            j(iVar);
            return 0;
        } else if (i11 == 2) {
            i(iVar);
            return 0;
        } else if (i11 == 4) {
            long position = iVar.getPosition();
            long j11 = this.f41668f;
            if (position != j11) {
                uVar.f33770a = j11;
                return 1;
            }
            k(iVar);
            return 0;
        } else if (i11 != 5) {
            if (i11 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        } else {
            if (this.f41671i == null || iVar != this.f41670h) {
                this.f41670h = iVar;
                this.f41671i = new c(iVar, this.f41668f);
            }
            int e11 = ((k) ak.a.e(this.f41672j)).e(this.f41671i, uVar);
            if (e11 == 1) {
                uVar.f33770a += this.f41668f;
            }
            return e11;
        }
    }

    @Override // ji.h
    public void release() {
        k kVar = this.f41672j;
        if (kVar != null) {
            kVar.release();
        }
    }
}