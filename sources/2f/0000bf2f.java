package x7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public class r extends a {

    /* renamed from: r  reason: collision with root package name */
    private final d8.b f57325r;

    /* renamed from: s  reason: collision with root package name */
    private final String f57326s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f57327t;

    /* renamed from: u  reason: collision with root package name */
    private final y7.a<Integer, Integer> f57328u;

    /* renamed from: v  reason: collision with root package name */
    private y7.a<ColorFilter, ColorFilter> f57329v;

    public r(com.airbnb.lottie.a aVar, d8.b bVar, c8.q qVar) {
        super(aVar, bVar, qVar.b().toPaintCap(), qVar.e().toPaintJoin(), qVar.g(), qVar.i(), qVar.j(), qVar.f(), qVar.d());
        this.f57325r = bVar;
        this.f57326s = qVar.h();
        this.f57327t = qVar.k();
        y7.a<Integer, Integer> l11 = qVar.c().l();
        this.f57328u = l11;
        l11.a(this);
        bVar.h(l11);
    }

    @Override // x7.a, a8.f
    public <T> void c(T t11, i8.c<T> cVar) {
        super.c(t11, cVar);
        if (t11 == v7.j.f54281b) {
            this.f57328u.n(cVar);
        } else if (t11 == v7.j.K) {
            y7.a<ColorFilter, ColorFilter> aVar = this.f57329v;
            if (aVar != null) {
                this.f57325r.F(aVar);
            }
            if (cVar == null) {
                this.f57329v = null;
                return;
            }
            y7.q qVar = new y7.q(cVar);
            this.f57329v = qVar;
            qVar.a(this);
            this.f57325r.h(this.f57328u);
        }
    }

    @Override // x7.a, x7.e
    public void g(Canvas canvas, Matrix matrix, int i11) {
        if (this.f57327t) {
            return;
        }
        this.f57204i.setColor(((y7.b) this.f57328u).p());
        y7.a<ColorFilter, ColorFilter> aVar = this.f57329v;
        if (aVar != null) {
            this.f57204i.setColorFilter(aVar.h());
        }
        super.g(canvas, matrix, i11);
    }

    @Override // x7.c
    public String getName() {
        return this.f57326s;
    }
}