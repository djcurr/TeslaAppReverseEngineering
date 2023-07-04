package ri;

import ak.v;
import com.google.android.exoplayer2.ParserException;
import ji.l;
import ji.u;
import ji.x;

/* loaded from: classes3.dex */
public class d implements ji.h {

    /* renamed from: a */
    private ji.j f49585a;

    /* renamed from: b */
    private i f49586b;

    /* renamed from: c */
    private boolean f49587c;

    static {
        c cVar = new l() { // from class: ri.c
            @Override // ji.l
            public final ji.h[] b() {
                return d.c();
            }
        };
    }

    public static /* synthetic */ ji.h[] c() {
        return f();
    }

    public static /* synthetic */ ji.h[] f() {
        return new ji.h[]{new d()};
    }

    private static v g(v vVar) {
        vVar.O(0);
        return vVar;
    }

    private boolean h(ji.i iVar) {
        f fVar = new f();
        if (fVar.b(iVar, true) && (fVar.f49594b & 2) == 2) {
            int min = Math.min(fVar.f49598f, 8);
            v vVar = new v(min);
            iVar.n(vVar.d(), 0, min);
            if (b.p(g(vVar))) {
                this.f49586b = new b();
            } else if (j.r(g(vVar))) {
                this.f49586b = new j();
            } else if (h.o(g(vVar))) {
                this.f49586b = new h();
            }
            return true;
        }
        return false;
    }

    @Override // ji.h
    public void a(long j11, long j12) {
        i iVar = this.f49586b;
        if (iVar != null) {
            iVar.m(j11, j12);
        }
    }

    @Override // ji.h
    public void b(ji.j jVar) {
        this.f49585a = jVar;
    }

    @Override // ji.h
    public boolean d(ji.i iVar) {
        try {
            return h(iVar);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // ji.h
    public int e(ji.i iVar, u uVar) {
        ak.a.h(this.f49585a);
        if (this.f49586b == null) {
            if (h(iVar)) {
                iVar.d();
            } else {
                throw new ParserException("Failed to determine bitstream type");
            }
        }
        if (!this.f49587c) {
            x f11 = this.f49585a.f(0, 1);
            this.f49585a.s();
            this.f49586b.d(this.f49585a, f11);
            this.f49587c = true;
        }
        return this.f49586b.g(iVar, uVar);
    }

    @Override // ji.h
    public void release() {
    }
}