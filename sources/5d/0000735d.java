package hj;

import ak.k0;
import android.util.SparseArray;
import hj.f;
import ji.u;
import ji.v;
import ji.x;

/* loaded from: classes3.dex */
public final class d implements ji.j, f {

    /* renamed from: j  reason: collision with root package name */
    private static final u f29237j = new u();

    /* renamed from: a  reason: collision with root package name */
    private final ji.h f29238a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29239b;

    /* renamed from: c  reason: collision with root package name */
    private final ci.i f29240c;

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray<a> f29241d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    private boolean f29242e;

    /* renamed from: f  reason: collision with root package name */
    private f.a f29243f;

    /* renamed from: g  reason: collision with root package name */
    private long f29244g;

    /* renamed from: h  reason: collision with root package name */
    private v f29245h;

    /* renamed from: i  reason: collision with root package name */
    private ci.i[] f29246i;

    /* loaded from: classes3.dex */
    private static final class a implements x {

        /* renamed from: a  reason: collision with root package name */
        private final int f29247a;

        /* renamed from: b  reason: collision with root package name */
        private final int f29248b;

        /* renamed from: c  reason: collision with root package name */
        private final ci.i f29249c;

        /* renamed from: d  reason: collision with root package name */
        private final ji.g f29250d = new ji.g();

        /* renamed from: e  reason: collision with root package name */
        public ci.i f29251e;

        /* renamed from: f  reason: collision with root package name */
        private x f29252f;

        /* renamed from: g  reason: collision with root package name */
        private long f29253g;

        public a(int i11, int i12, ci.i iVar) {
            this.f29247a = i11;
            this.f29248b = i12;
            this.f29249c = iVar;
        }

        @Override // ji.x
        public int b(zj.f fVar, int i11, boolean z11, int i12) {
            return ((x) k0.j(this.f29252f)).a(fVar, i11, z11);
        }

        @Override // ji.x
        public void c(ak.v vVar, int i11, int i12) {
            ((x) k0.j(this.f29252f)).e(vVar, i11);
        }

        @Override // ji.x
        public void d(ci.i iVar) {
            ci.i iVar2 = this.f29249c;
            if (iVar2 != null) {
                iVar = iVar.f(iVar2);
            }
            this.f29251e = iVar;
            ((x) k0.j(this.f29252f)).d(this.f29251e);
        }

        @Override // ji.x
        public void f(long j11, int i11, int i12, int i13, x.a aVar) {
            long j12 = this.f29253g;
            if (j12 != -9223372036854775807L && j11 >= j12) {
                this.f29252f = this.f29250d;
            }
            ((x) k0.j(this.f29252f)).f(j11, i11, i12, i13, aVar);
        }

        public void g(f.a aVar, long j11) {
            if (aVar == null) {
                this.f29252f = this.f29250d;
                return;
            }
            this.f29253g = j11;
            x f11 = aVar.f(this.f29247a, this.f29248b);
            this.f29252f = f11;
            ci.i iVar = this.f29251e;
            if (iVar != null) {
                f11.d(iVar);
            }
        }
    }

    public d(ji.h hVar, int i11, ci.i iVar) {
        this.f29238a = hVar;
        this.f29239b = i11;
        this.f29240c = iVar;
    }

    @Override // hj.f
    public boolean a(ji.i iVar) {
        int e11 = this.f29238a.e(iVar, f29237j);
        ak.a.f(e11 != 1);
        return e11 == 0;
    }

    @Override // hj.f
    public ji.c b() {
        v vVar = this.f29245h;
        if (vVar instanceof ji.c) {
            return (ji.c) vVar;
        }
        return null;
    }

    @Override // hj.f
    public void c(f.a aVar, long j11, long j12) {
        this.f29243f = aVar;
        this.f29244g = j12;
        if (!this.f29242e) {
            this.f29238a.b(this);
            if (j11 != -9223372036854775807L) {
                this.f29238a.a(0L, j11);
            }
            this.f29242e = true;
            return;
        }
        ji.h hVar = this.f29238a;
        if (j11 == -9223372036854775807L) {
            j11 = 0;
        }
        hVar.a(0L, j11);
        for (int i11 = 0; i11 < this.f29241d.size(); i11++) {
            this.f29241d.valueAt(i11).g(aVar, j12);
        }
    }

    @Override // hj.f
    public ci.i[] d() {
        return this.f29246i;
    }

    @Override // ji.j
    public x f(int i11, int i12) {
        a aVar = this.f29241d.get(i11);
        if (aVar == null) {
            ak.a.f(this.f29246i == null);
            aVar = new a(i11, i12, i12 == this.f29239b ? this.f29240c : null);
            aVar.g(this.f29243f, this.f29244g);
            this.f29241d.put(i11, aVar);
        }
        return aVar;
    }

    @Override // ji.j
    public void p(v vVar) {
        this.f29245h = vVar;
    }

    @Override // hj.f
    public void release() {
        this.f29238a.release();
    }

    @Override // ji.j
    public void s() {
        ci.i[] iVarArr = new ci.i[this.f29241d.size()];
        for (int i11 = 0; i11 < this.f29241d.size(); i11++) {
            iVarArr[i11] = (ci.i) ak.a.h(this.f29241d.valueAt(i11).f29251e);
        }
        this.f29246i = iVarArr;
    }
}