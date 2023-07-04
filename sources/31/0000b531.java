package ti;

import ji.v;
import ti.i0;

/* loaded from: classes3.dex */
public final class e implements ji.h {

    /* renamed from: a */
    private final f f51998a = new f();

    /* renamed from: b */
    private final ak.v f51999b = new ak.v(16384);

    /* renamed from: c */
    private boolean f52000c;

    static {
        d dVar = new ji.l() { // from class: ti.d
            @Override // ji.l
            public final ji.h[] b() {
                return e.c();
            }
        };
    }

    public static /* synthetic */ ji.h[] c() {
        return f();
    }

    public static /* synthetic */ ji.h[] f() {
        return new ji.h[]{new e()};
    }

    @Override // ji.h
    public void a(long j11, long j12) {
        this.f52000c = false;
        this.f51998a.a();
    }

    @Override // ji.h
    public void b(ji.j jVar) {
        this.f51998a.e(jVar, new i0.d(0, 1));
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
            iVar.n(vVar.d(), 0, 7);
            vVar.O(0);
            int I = vVar.I();
            if (I == 44096 || I == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                int e11 = ei.c.e(vVar.d(), I);
                if (e11 == -1) {
                    return false;
                }
                iVar.g(e11 - 7);
            } else {
                iVar.d();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                iVar.g(i13);
                i12 = 0;
            }
        }
    }

    @Override // ji.h
    public int e(ji.i iVar, ji.u uVar) {
        int read = iVar.read(this.f51999b.d(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f51999b.O(0);
        this.f51999b.N(read);
        if (!this.f52000c) {
            this.f51998a.f(0L, 4);
            this.f52000c = true;
        }
        this.f51998a.c(this.f51999b);
        return 0;
    }

    @Override // ji.h
    public void release() {
    }
}