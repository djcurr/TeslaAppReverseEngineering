package x7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import c8.r;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import y7.a;

/* loaded from: classes.dex */
public abstract class a implements a.b, k, e {

    /* renamed from: e  reason: collision with root package name */
    private final com.airbnb.lottie.a f57200e;

    /* renamed from: f  reason: collision with root package name */
    protected final d8.b f57201f;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f57203h;

    /* renamed from: i  reason: collision with root package name */
    final Paint f57204i;

    /* renamed from: j  reason: collision with root package name */
    private final y7.a<?, Float> f57205j;

    /* renamed from: k  reason: collision with root package name */
    private final y7.a<?, Integer> f57206k;

    /* renamed from: l  reason: collision with root package name */
    private final List<y7.a<?, Float>> f57207l;

    /* renamed from: m  reason: collision with root package name */
    private final y7.a<?, Float> f57208m;

    /* renamed from: n  reason: collision with root package name */
    private y7.a<ColorFilter, ColorFilter> f57209n;

    /* renamed from: o  reason: collision with root package name */
    private y7.a<Float, Float> f57210o;

    /* renamed from: p  reason: collision with root package name */
    float f57211p;

    /* renamed from: q  reason: collision with root package name */
    private y7.c f57212q;

    /* renamed from: a  reason: collision with root package name */
    private final PathMeasure f57196a = new PathMeasure();

    /* renamed from: b  reason: collision with root package name */
    private final Path f57197b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final Path f57198c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final RectF f57199d = new RectF();

    /* renamed from: g  reason: collision with root package name */
    private final List<b> f57202g = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List<m> f57213a;

        /* renamed from: b  reason: collision with root package name */
        private final s f57214b;

        private b(s sVar) {
            this.f57213a = new ArrayList();
            this.f57214b = sVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(com.airbnb.lottie.a aVar, d8.b bVar, Paint.Cap cap, Paint.Join join, float f11, b8.d dVar, b8.b bVar2, List<b8.b> list, b8.b bVar3) {
        w7.a aVar2 = new w7.a(1);
        this.f57204i = aVar2;
        this.f57211p = BitmapDescriptorFactory.HUE_RED;
        this.f57200e = aVar;
        this.f57201f = bVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f11);
        this.f57206k = dVar.l();
        this.f57205j = bVar2.l();
        if (bVar3 == null) {
            this.f57208m = null;
        } else {
            this.f57208m = bVar3.l();
        }
        this.f57207l = new ArrayList(list.size());
        this.f57203h = new float[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f57207l.add(list.get(i11).l());
        }
        bVar.h(this.f57206k);
        bVar.h(this.f57205j);
        for (int i12 = 0; i12 < this.f57207l.size(); i12++) {
            bVar.h(this.f57207l.get(i12));
        }
        y7.a<?, Float> aVar3 = this.f57208m;
        if (aVar3 != null) {
            bVar.h(aVar3);
        }
        this.f57206k.a(this);
        this.f57205j.a(this);
        for (int i13 = 0; i13 < list.size(); i13++) {
            this.f57207l.get(i13).a(this);
        }
        y7.a<?, Float> aVar4 = this.f57208m;
        if (aVar4 != null) {
            aVar4.a(this);
        }
        if (bVar.u() != null) {
            y7.a<Float, Float> l11 = bVar.u().a().l();
            this.f57210o = l11;
            l11.a(this);
            bVar.h(this.f57210o);
        }
        if (bVar.w() != null) {
            this.f57212q = new y7.c(this, bVar, bVar.w());
        }
    }

    private void f(Matrix matrix) {
        v7.c.a("StrokeContent#applyDashPattern");
        if (this.f57207l.isEmpty()) {
            v7.c.b("StrokeContent#applyDashPattern");
            return;
        }
        float g11 = h8.h.g(matrix);
        for (int i11 = 0; i11 < this.f57207l.size(); i11++) {
            this.f57203h[i11] = this.f57207l.get(i11).h().floatValue();
            if (i11 % 2 == 0) {
                float[] fArr = this.f57203h;
                if (fArr[i11] < 1.0f) {
                    fArr[i11] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f57203h;
                if (fArr2[i11] < 0.1f) {
                    fArr2[i11] = 0.1f;
                }
            }
            float[] fArr3 = this.f57203h;
            fArr3[i11] = fArr3[i11] * g11;
        }
        y7.a<?, Float> aVar = this.f57208m;
        this.f57204i.setPathEffect(new DashPathEffect(this.f57203h, aVar == null ? BitmapDescriptorFactory.HUE_RED : g11 * aVar.h().floatValue()));
        v7.c.b("StrokeContent#applyDashPattern");
    }

    private void h(Canvas canvas, b bVar, Matrix matrix) {
        v7.c.a("StrokeContent#applyTrimPath");
        if (bVar.f57214b == null) {
            v7.c.b("StrokeContent#applyTrimPath");
            return;
        }
        this.f57197b.reset();
        for (int size = bVar.f57213a.size() - 1; size >= 0; size--) {
            this.f57197b.addPath(((m) bVar.f57213a.get(size)).getPath(), matrix);
        }
        this.f57196a.setPath(this.f57197b, false);
        float length = this.f57196a.getLength();
        while (this.f57196a.nextContour()) {
            length += this.f57196a.getLength();
        }
        float floatValue = (bVar.f57214b.f().h().floatValue() * length) / 360.0f;
        float floatValue2 = ((bVar.f57214b.h().h().floatValue() / 100.0f) * length) + floatValue;
        float floatValue3 = ((bVar.f57214b.d().h().floatValue() / 100.0f) * length) + floatValue;
        float f11 = 0.0f;
        for (int size2 = bVar.f57213a.size() - 1; size2 >= 0; size2--) {
            this.f57198c.set(((m) bVar.f57213a.get(size2)).getPath());
            this.f57198c.transform(matrix);
            this.f57196a.setPath(this.f57198c, false);
            float length2 = this.f57196a.getLength();
            if (floatValue3 > length) {
                float f12 = floatValue3 - length;
                if (f12 < f11 + length2 && f11 < f12) {
                    h8.h.a(this.f57198c, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f12 / length2, 1.0f), BitmapDescriptorFactory.HUE_RED);
                    canvas.drawPath(this.f57198c, this.f57204i);
                    f11 += length2;
                }
            }
            float f13 = f11 + length2;
            if (f13 >= floatValue2 && f11 <= floatValue3) {
                if (f13 <= floatValue3 && floatValue2 < f11) {
                    canvas.drawPath(this.f57198c, this.f57204i);
                } else {
                    h8.h.a(this.f57198c, floatValue2 < f11 ? 0.0f : (floatValue2 - f11) / length2, floatValue3 <= f13 ? (floatValue3 - f11) / length2 : 1.0f, BitmapDescriptorFactory.HUE_RED);
                    canvas.drawPath(this.f57198c, this.f57204i);
                }
            }
            f11 += length2;
        }
        v7.c.b("StrokeContent#applyTrimPath");
    }

    @Override // y7.a.b
    public void a() {
        this.f57200e.invalidateSelf();
    }

    @Override // x7.c
    public void b(List<c> list, List<c> list2) {
        s sVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof s) {
                s sVar2 = (s) cVar;
                if (sVar2.i() == r.a.INDIVIDUALLY) {
                    sVar = sVar2;
                }
            }
        }
        if (sVar != null) {
            sVar.c(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof s) {
                s sVar3 = (s) cVar2;
                if (sVar3.i() == r.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f57202g.add(bVar);
                    }
                    bVar = new b(sVar3);
                    sVar3.c(this);
                }
            }
            if (cVar2 instanceof m) {
                if (bVar == null) {
                    bVar = new b(sVar);
                }
                bVar.f57213a.add((m) cVar2);
            }
        }
        if (bVar != null) {
            this.f57202g.add(bVar);
        }
    }

    @Override // a8.f
    public <T> void c(T t11, i8.c<T> cVar) {
        y7.c cVar2;
        y7.c cVar3;
        y7.c cVar4;
        y7.c cVar5;
        y7.c cVar6;
        if (t11 == v7.j.f54283d) {
            this.f57206k.n(cVar);
        } else if (t11 == v7.j.f54298s) {
            this.f57205j.n(cVar);
        } else if (t11 == v7.j.K) {
            y7.a<ColorFilter, ColorFilter> aVar = this.f57209n;
            if (aVar != null) {
                this.f57201f.F(aVar);
            }
            if (cVar == null) {
                this.f57209n = null;
                return;
            }
            y7.q qVar = new y7.q(cVar);
            this.f57209n = qVar;
            qVar.a(this);
            this.f57201f.h(this.f57209n);
        } else if (t11 == v7.j.f54289j) {
            y7.a<Float, Float> aVar2 = this.f57210o;
            if (aVar2 != null) {
                aVar2.n(cVar);
                return;
            }
            y7.q qVar2 = new y7.q(cVar);
            this.f57210o = qVar2;
            qVar2.a(this);
            this.f57201f.h(this.f57210o);
        } else if (t11 == v7.j.f54284e && (cVar6 = this.f57212q) != null) {
            cVar6.c(cVar);
        } else if (t11 == v7.j.G && (cVar5 = this.f57212q) != null) {
            cVar5.f(cVar);
        } else if (t11 == v7.j.H && (cVar4 = this.f57212q) != null) {
            cVar4.d(cVar);
        } else if (t11 == v7.j.I && (cVar3 = this.f57212q) != null) {
            cVar3.e(cVar);
        } else if (t11 != v7.j.J || (cVar2 = this.f57212q) == null) {
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
        v7.c.a("StrokeContent#getBounds");
        this.f57197b.reset();
        for (int i11 = 0; i11 < this.f57202g.size(); i11++) {
            b bVar = this.f57202g.get(i11);
            for (int i12 = 0; i12 < bVar.f57213a.size(); i12++) {
                this.f57197b.addPath(((m) bVar.f57213a.get(i12)).getPath(), matrix);
            }
        }
        this.f57197b.computeBounds(this.f57199d, false);
        float p11 = ((y7.d) this.f57205j).p();
        RectF rectF2 = this.f57199d;
        float f11 = p11 / 2.0f;
        rectF2.set(rectF2.left - f11, rectF2.top - f11, rectF2.right + f11, rectF2.bottom + f11);
        rectF.set(this.f57199d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        v7.c.b("StrokeContent#getBounds");
    }

    @Override // x7.e
    public void g(Canvas canvas, Matrix matrix, int i11) {
        v7.c.a("StrokeContent#draw");
        if (h8.h.h(matrix)) {
            v7.c.b("StrokeContent#draw");
            return;
        }
        this.f57204i.setAlpha(h8.g.d((int) ((((i11 / 255.0f) * ((y7.f) this.f57206k).p()) / 100.0f) * 255.0f), 0, 255));
        this.f57204i.setStrokeWidth(((y7.d) this.f57205j).p() * h8.h.g(matrix));
        if (this.f57204i.getStrokeWidth() <= BitmapDescriptorFactory.HUE_RED) {
            v7.c.b("StrokeContent#draw");
            return;
        }
        f(matrix);
        y7.a<ColorFilter, ColorFilter> aVar = this.f57209n;
        if (aVar != null) {
            this.f57204i.setColorFilter(aVar.h());
        }
        y7.a<Float, Float> aVar2 = this.f57210o;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == BitmapDescriptorFactory.HUE_RED) {
                this.f57204i.setMaskFilter(null);
            } else if (floatValue != this.f57211p) {
                this.f57204i.setMaskFilter(this.f57201f.v(floatValue));
            }
            this.f57211p = floatValue;
        }
        y7.c cVar = this.f57212q;
        if (cVar != null) {
            cVar.b(this.f57204i);
        }
        for (int i12 = 0; i12 < this.f57202g.size(); i12++) {
            b bVar = this.f57202g.get(i12);
            if (bVar.f57214b != null) {
                h(canvas, bVar, matrix);
            } else {
                v7.c.a("StrokeContent#buildPath");
                this.f57197b.reset();
                for (int size = bVar.f57213a.size() - 1; size >= 0; size--) {
                    this.f57197b.addPath(((m) bVar.f57213a.get(size)).getPath(), matrix);
                }
                v7.c.b("StrokeContent#buildPath");
                v7.c.a("StrokeContent#drawPath");
                canvas.drawPath(this.f57197b, this.f57204i);
                v7.c.b("StrokeContent#drawPath");
            }
        }
        v7.c.b("StrokeContent#draw");
    }
}