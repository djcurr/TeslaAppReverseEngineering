package x7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import y7.a;

/* loaded from: classes.dex */
public class g implements e, a.b, k {

    /* renamed from: a  reason: collision with root package name */
    private final Path f57235a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f57236b;

    /* renamed from: c  reason: collision with root package name */
    private final d8.b f57237c;

    /* renamed from: d  reason: collision with root package name */
    private final String f57238d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f57239e;

    /* renamed from: f  reason: collision with root package name */
    private final List<m> f57240f;

    /* renamed from: g  reason: collision with root package name */
    private final y7.a<Integer, Integer> f57241g;

    /* renamed from: h  reason: collision with root package name */
    private final y7.a<Integer, Integer> f57242h;

    /* renamed from: i  reason: collision with root package name */
    private y7.a<ColorFilter, ColorFilter> f57243i;

    /* renamed from: j  reason: collision with root package name */
    private final com.airbnb.lottie.a f57244j;

    /* renamed from: k  reason: collision with root package name */
    private y7.a<Float, Float> f57245k;

    /* renamed from: l  reason: collision with root package name */
    float f57246l;

    /* renamed from: m  reason: collision with root package name */
    private y7.c f57247m;

    public g(com.airbnb.lottie.a aVar, d8.b bVar, c8.n nVar) {
        Path path = new Path();
        this.f57235a = path;
        this.f57236b = new w7.a(1);
        this.f57240f = new ArrayList();
        this.f57237c = bVar;
        this.f57238d = nVar.d();
        this.f57239e = nVar.f();
        this.f57244j = aVar;
        if (bVar.u() != null) {
            y7.a<Float, Float> l11 = bVar.u().a().l();
            this.f57245k = l11;
            l11.a(this);
            bVar.h(this.f57245k);
        }
        if (bVar.w() != null) {
            this.f57247m = new y7.c(this, bVar, bVar.w());
        }
        if (nVar.b() != null && nVar.e() != null) {
            path.setFillType(nVar.c());
            y7.a<Integer, Integer> l12 = nVar.b().l();
            this.f57241g = l12;
            l12.a(this);
            bVar.h(l12);
            y7.a<Integer, Integer> l13 = nVar.e().l();
            this.f57242h = l13;
            l13.a(this);
            bVar.h(l13);
            return;
        }
        this.f57241g = null;
        this.f57242h = null;
    }

    @Override // y7.a.b
    public void a() {
        this.f57244j.invalidateSelf();
    }

    @Override // x7.c
    public void b(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < list2.size(); i11++) {
            c cVar = list2.get(i11);
            if (cVar instanceof m) {
                this.f57240f.add((m) cVar);
            }
        }
    }

    @Override // a8.f
    public <T> void c(T t11, i8.c<T> cVar) {
        y7.c cVar2;
        y7.c cVar3;
        y7.c cVar4;
        y7.c cVar5;
        y7.c cVar6;
        if (t11 == v7.j.f54280a) {
            this.f57241g.n(cVar);
        } else if (t11 == v7.j.f54283d) {
            this.f57242h.n(cVar);
        } else if (t11 == v7.j.K) {
            y7.a<ColorFilter, ColorFilter> aVar = this.f57243i;
            if (aVar != null) {
                this.f57237c.F(aVar);
            }
            if (cVar == null) {
                this.f57243i = null;
                return;
            }
            y7.q qVar = new y7.q(cVar);
            this.f57243i = qVar;
            qVar.a(this);
            this.f57237c.h(this.f57243i);
        } else if (t11 == v7.j.f54289j) {
            y7.a<Float, Float> aVar2 = this.f57245k;
            if (aVar2 != null) {
                aVar2.n(cVar);
                return;
            }
            y7.q qVar2 = new y7.q(cVar);
            this.f57245k = qVar2;
            qVar2.a(this);
            this.f57237c.h(this.f57245k);
        } else if (t11 == v7.j.f54284e && (cVar6 = this.f57247m) != null) {
            cVar6.c(cVar);
        } else if (t11 == v7.j.G && (cVar5 = this.f57247m) != null) {
            cVar5.f(cVar);
        } else if (t11 == v7.j.H && (cVar4 = this.f57247m) != null) {
            cVar4.d(cVar);
        } else if (t11 == v7.j.I && (cVar3 = this.f57247m) != null) {
            cVar3.e(cVar);
        } else if (t11 != v7.j.J || (cVar2 = this.f57247m) == null) {
        } else {
            cVar2.g(cVar);
        }
    }

    @Override // a8.f
    public void d(a8.e eVar, int i11, List<a8.e> list, a8.e eVar2) {
        h8.g.m(eVar, i11, list, eVar2, this);
    }

    @Override // x7.e
    public void e(RectF rectF, Matrix matrix, boolean z11) {
        this.f57235a.reset();
        for (int i11 = 0; i11 < this.f57240f.size(); i11++) {
            this.f57235a.addPath(this.f57240f.get(i11).getPath(), matrix);
        }
        this.f57235a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // x7.e
    public void g(Canvas canvas, Matrix matrix, int i11) {
        if (this.f57239e) {
            return;
        }
        v7.c.a("FillContent#draw");
        this.f57236b.setColor((h8.g.d((int) ((((i11 / 255.0f) * this.f57242h.h().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((y7.b) this.f57241g).p() & 16777215));
        y7.a<ColorFilter, ColorFilter> aVar = this.f57243i;
        if (aVar != null) {
            this.f57236b.setColorFilter(aVar.h());
        }
        y7.a<Float, Float> aVar2 = this.f57245k;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == BitmapDescriptorFactory.HUE_RED) {
                this.f57236b.setMaskFilter(null);
            } else if (floatValue != this.f57246l) {
                this.f57236b.setMaskFilter(this.f57237c.v(floatValue));
            }
            this.f57246l = floatValue;
        }
        y7.c cVar = this.f57247m;
        if (cVar != null) {
            cVar.b(this.f57236b);
        }
        this.f57235a.reset();
        for (int i12 = 0; i12 < this.f57240f.size(); i12++) {
            this.f57235a.addPath(this.f57240f.get(i12).getPath(), matrix);
        }
        canvas.drawPath(this.f57235a, this.f57236b);
        v7.c.b("FillContent#draw");
    }

    @Override // x7.c
    public String getName() {
        return this.f57238d;
    }
}