package ti;

import ji.v;
import ti.i0;

/* loaded from: classes3.dex */
public final class b implements ji.h {

    /* renamed from: a */
    private final c f51974a = new c();

    /* renamed from: b */
    private final ak.v f51975b = new ak.v(2786);

    /* renamed from: c */
    private boolean f51976c;

    static {
        a aVar = new ji.l() { // from class: ti.a
            @Override // ji.l
            public final ji.h[] b() {
                return b.c();
            }
        };
    }

    public static /* synthetic */ ji.h[] c() {
        return f();
    }

    public static /* synthetic */ ji.h[] f() {
        return new ji.h[]{new b()};
    }

    @Override // ji.h
    public void a(long j11, long j12) {
        this.f51976c = false;
        this.f51974a.a();
    }

    @Override // ji.h
    public void b(ji.j jVar) {
        this.f51974a.e(jVar, new i0.d(0, 1));
        jVar.s();
        jVar.p(new v.b(-9223372036854775807L));
    }

    @Override // ji.h
    public boolean d(ji.i iVar) {
        ak.v vVar = new ak.v(10);
        int i11 = 0;
        while (true) {
            iVar.n(vVar.d(), 0, 10);
            vVar.O(0);
            if (vVar.F() != 4801587) {
                break;
            }
            vVar.P(3);
            int B = vVar.B();
            i11 += B + 10;
            iVar.g(B);
        }
        iVar.d();
        iVar.g(i11);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            iVar.n(vVar.d(), 0, 6);
            vVar.O(0);
            if (vVar.I() != 2935) {
                iVar.d();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                iVar.g(i13);
                i12 = 0;
            } else {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                int f11 = ei.b.f(vVar.d());
                if (f11 == -1) {
                    return false;
                }
                iVar.g(f11 - 6);
            }
        }
    }

    @Override // ji.h
    public int e(ji.i iVar, ji.u uVar) {
        int read = iVar.read(this.f51975b.d(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f51975b.O(0);
        this.f51975b.N(read);
        if (!this.f51976c) {
            this.f51974a.f(0L, 4);
            this.f51976c = true;
        }
        this.f51974a.c(this.f51975b);
        return 0;
    }

    @Override // ji.h
    public void release() {
    }
}