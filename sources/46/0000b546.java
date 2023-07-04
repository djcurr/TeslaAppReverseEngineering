package ti;

import ci.i;
import java.util.Collections;
import java.util.List;
import ti.i0;

/* loaded from: classes3.dex */
public final class l implements m {

    /* renamed from: a  reason: collision with root package name */
    private final List<i0.a> f52115a;

    /* renamed from: b  reason: collision with root package name */
    private final ji.x[] f52116b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f52117c;

    /* renamed from: d  reason: collision with root package name */
    private int f52118d;

    /* renamed from: e  reason: collision with root package name */
    private int f52119e;

    /* renamed from: f  reason: collision with root package name */
    private long f52120f;

    public l(List<i0.a> list) {
        this.f52115a = list;
        this.f52116b = new ji.x[list.size()];
    }

    private boolean b(ak.v vVar, int i11) {
        if (vVar.a() == 0) {
            return false;
        }
        if (vVar.C() != i11) {
            this.f52117c = false;
        }
        this.f52118d--;
        return this.f52117c;
    }

    @Override // ti.m
    public void a() {
        this.f52117c = false;
    }

    @Override // ti.m
    public void c(ak.v vVar) {
        ji.x[] xVarArr;
        if (this.f52117c) {
            if (this.f52118d != 2 || b(vVar, 32)) {
                if (this.f52118d != 1 || b(vVar, 0)) {
                    int e11 = vVar.e();
                    int a11 = vVar.a();
                    for (ji.x xVar : this.f52116b) {
                        vVar.O(e11);
                        xVar.e(vVar, a11);
                    }
                    this.f52119e += a11;
                }
            }
        }
    }

    @Override // ti.m
    public void d() {
        if (this.f52117c) {
            for (ji.x xVar : this.f52116b) {
                xVar.f(this.f52120f, 1, this.f52119e, 0, null);
            }
            this.f52117c = false;
        }
    }

    @Override // ti.m
    public void e(ji.j jVar, i0.d dVar) {
        for (int i11 = 0; i11 < this.f52116b.length; i11++) {
            i0.a aVar = this.f52115a.get(i11);
            dVar.a();
            ji.x f11 = jVar.f(dVar.c(), 3);
            f11.d(new i.b().S(dVar.b()).e0("application/dvbsubs").T(Collections.singletonList(aVar.f52090b)).V(aVar.f52089a).E());
            this.f52116b[i11] = f11;
        }
    }

    @Override // ti.m
    public void f(long j11, int i11) {
        if ((i11 & 4) == 0) {
            return;
        }
        this.f52117c = true;
        this.f52120f = j11;
        this.f52119e = 0;
        this.f52118d = 2;
    }
}