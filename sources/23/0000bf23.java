package x7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import y7.a;

/* loaded from: classes.dex */
public class h implements e, a.b, k {

    /* renamed from: a  reason: collision with root package name */
    private final String f57248a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f57249b;

    /* renamed from: c  reason: collision with root package name */
    private final d8.b f57250c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.collection.d<LinearGradient> f57251d = new androidx.collection.d<>();

    /* renamed from: e  reason: collision with root package name */
    private final androidx.collection.d<RadialGradient> f57252e = new androidx.collection.d<>();

    /* renamed from: f  reason: collision with root package name */
    private final Path f57253f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f57254g;

    /* renamed from: h  reason: collision with root package name */
    private final RectF f57255h;

    /* renamed from: i  reason: collision with root package name */
    private final List<m> f57256i;

    /* renamed from: j  reason: collision with root package name */
    private final c8.g f57257j;

    /* renamed from: k  reason: collision with root package name */
    private final y7.a<c8.d, c8.d> f57258k;

    /* renamed from: l  reason: collision with root package name */
    private final y7.a<Integer, Integer> f57259l;

    /* renamed from: m  reason: collision with root package name */
    private final y7.a<PointF, PointF> f57260m;

    /* renamed from: n  reason: collision with root package name */
    private final y7.a<PointF, PointF> f57261n;

    /* renamed from: o  reason: collision with root package name */
    private y7.a<ColorFilter, ColorFilter> f57262o;

    /* renamed from: p  reason: collision with root package name */
    private y7.q f57263p;

    /* renamed from: q  reason: collision with root package name */
    private final com.airbnb.lottie.a f57264q;

    /* renamed from: r  reason: collision with root package name */
    private final int f57265r;

    /* renamed from: s  reason: collision with root package name */
    private y7.a<Float, Float> f57266s;

    /* renamed from: t  reason: collision with root package name */
    float f57267t;

    /* renamed from: u  reason: collision with root package name */
    private y7.c f57268u;

    public h(com.airbnb.lottie.a aVar, d8.b bVar, c8.e eVar) {
        Path path = new Path();
        this.f57253f = path;
        this.f57254g = new w7.a(1);
        this.f57255h = new RectF();
        this.f57256i = new ArrayList();
        this.f57267t = BitmapDescriptorFactory.HUE_RED;
        this.f57250c = bVar;
        this.f57248a = eVar.f();
        this.f57249b = eVar.i();
        this.f57264q = aVar;
        this.f57257j = eVar.e();
        path.setFillType(eVar.c());
        this.f57265r = (int) (aVar.q().d() / 32.0f);
        y7.a<c8.d, c8.d> l11 = eVar.d().l();
        this.f57258k = l11;
        l11.a(this);
        bVar.h(l11);
        y7.a<Integer, Integer> l12 = eVar.g().l();
        this.f57259l = l12;
        l12.a(this);
        bVar.h(l12);
        y7.a<PointF, PointF> l13 = eVar.h().l();
        this.f57260m = l13;
        l13.a(this);
        bVar.h(l13);
        y7.a<PointF, PointF> l14 = eVar.b().l();
        this.f57261n = l14;
        l14.a(this);
        bVar.h(l14);
        if (bVar.u() != null) {
            y7.a<Float, Float> l15 = bVar.u().a().l();
            this.f57266s = l15;
            l15.a(this);
            bVar.h(this.f57266s);
        }
        if (bVar.w() != null) {
            this.f57268u = new y7.c(this, bVar, bVar.w());
        }
    }

    private int[] f(int[] iArr) {
        y7.q qVar = this.f57263p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.h();
            int i11 = 0;
            if (iArr.length == numArr.length) {
                while (i11 < iArr.length) {
                    iArr[i11] = numArr[i11].intValue();
                    i11++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i11 < numArr.length) {
                    iArr[i11] = numArr[i11].intValue();
                    i11++;
                }
            }
        }
        return iArr;
    }

    private int h() {
        int round = Math.round(this.f57260m.f() * this.f57265r);
        int round2 = Math.round(this.f57261n.f() * this.f57265r);
        int round3 = Math.round(this.f57258k.f() * this.f57265r);
        int i11 = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i11 = i11 * 31 * round2;
        }
        return round3 != 0 ? i11 * 31 * round3 : i11;
    }

    private LinearGradient i() {
        long h11 = h();
        LinearGradient f11 = this.f57251d.f(h11);
        if (f11 != null) {
            return f11;
        }
        PointF h12 = this.f57260m.h();
        PointF h13 = this.f57261n.h();
        c8.d h14 = this.f57258k.h();
        LinearGradient linearGradient = new LinearGradient(h12.x, h12.y, h13.x, h13.y, f(h14.a()), h14.b(), Shader.TileMode.CLAMP);
        this.f57251d.j(h11, linearGradient);
        return linearGradient;
    }

    private RadialGradient j() {
        long h11 = h();
        RadialGradient f11 = this.f57252e.f(h11);
        if (f11 != null) {
            return f11;
        }
        PointF h12 = this.f57260m.h();
        PointF h13 = this.f57261n.h();
        c8.d h14 = this.f57258k.h();
        int[] f12 = f(h14.a());
        float[] b11 = h14.b();
        float f13 = h12.x;
        float f14 = h12.y;
        float hypot = (float) Math.hypot(h13.x - f13, h13.y - f14);
        if (hypot <= BitmapDescriptorFactory.HUE_RED) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f13, f14, hypot, f12, b11, Shader.TileMode.CLAMP);
        this.f57252e.j(h11, radialGradient);
        return radialGradient;
    }

    @Override // y7.a.b
    public void a() {
        this.f57264q.invalidateSelf();
    }

    @Override // x7.c
    public void b(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < list2.size(); i11++) {
            c cVar = list2.get(i11);
            if (cVar instanceof m) {
                this.f57256i.add((m) cVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a8.f
    public <T> void c(T t11, i8.c<T> cVar) {
        y7.c cVar2;
        y7.c cVar3;
        y7.c cVar4;
        y7.c cVar5;
        y7.c cVar6;
        if (t11 == v7.j.f54283d) {
            this.f57259l.n(cVar);
        } else if (t11 == v7.j.K) {
            y7.a<ColorFilter, ColorFilter> aVar = this.f57262o;
            if (aVar != null) {
                this.f57250c.F(aVar);
            }
            if (cVar == null) {
                this.f57262o = null;
                return;
            }
            y7.q qVar = new y7.q(cVar);
            this.f57262o = qVar;
            qVar.a(this);
            this.f57250c.h(this.f57262o);
        } else if (t11 == v7.j.L) {
            y7.q qVar2 = this.f57263p;
            if (qVar2 != null) {
                this.f57250c.F(qVar2);
            }
            if (cVar == null) {
                this.f57263p = null;
                return;
            }
            this.f57251d.b();
            this.f57252e.b();
            y7.q qVar3 = new y7.q(cVar);
            this.f57263p = qVar3;
            qVar3.a(this);
            this.f57250c.h(this.f57263p);
        } else if (t11 == v7.j.f54289j) {
            y7.a<Float, Float> aVar2 = this.f57266s;
            if (aVar2 != null) {
                aVar2.n(cVar);
                return;
            }
            y7.q qVar4 = new y7.q(cVar);
            this.f57266s = qVar4;
            qVar4.a(this);
            this.f57250c.h(this.f57266s);
        } else if (t11 == v7.j.f54284e && (cVar6 = this.f57268u) != null) {
            cVar6.c(cVar);
        } else if (t11 == v7.j.G && (cVar5 = this.f57268u) != null) {
            cVar5.f(cVar);
        } else if (t11 == v7.j.H && (cVar4 = this.f57268u) != null) {
            cVar4.d(cVar);
        } else if (t11 == v7.j.I && (cVar3 = this.f57268u) != null) {
            cVar3.e(cVar);
        } else if (t11 != v7.j.J || (cVar2 = this.f57268u) == null) {
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
        this.f57253f.reset();
        for (int i11 = 0; i11 < this.f57256i.size(); i11++) {
            this.f57253f.addPath(this.f57256i.get(i11).getPath(), matrix);
        }
        this.f57253f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // x7.e
    public void g(Canvas canvas, Matrix matrix, int i11) {
        Shader j11;
        if (this.f57249b) {
            return;
        }
        v7.c.a("GradientFillContent#draw");
        this.f57253f.reset();
        for (int i12 = 0; i12 < this.f57256i.size(); i12++) {
            this.f57253f.addPath(this.f57256i.get(i12).getPath(), matrix);
        }
        this.f57253f.computeBounds(this.f57255h, false);
        if (this.f57257j == c8.g.LINEAR) {
            j11 = i();
        } else {
            j11 = j();
        }
        j11.setLocalMatrix(matrix);
        this.f57254g.setShader(j11);
        y7.a<ColorFilter, ColorFilter> aVar = this.f57262o;
        if (aVar != null) {
            this.f57254g.setColorFilter(aVar.h());
        }
        y7.a<Float, Float> aVar2 = this.f57266s;
        if (aVar2 != null) {
            float floatValue = aVar2.h().floatValue();
            if (floatValue == BitmapDescriptorFactory.HUE_RED) {
                this.f57254g.setMaskFilter(null);
            } else if (floatValue != this.f57267t) {
                this.f57254g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f57267t = floatValue;
        }
        y7.c cVar = this.f57268u;
        if (cVar != null) {
            cVar.b(this.f57254g);
        }
        this.f57254g.setAlpha(h8.g.d((int) ((((i11 / 255.0f) * this.f57259l.h().intValue()) / 100.0f) * 255.0f), 0, 255));
        canvas.drawPath(this.f57253f, this.f57254g);
        v7.c.b("GradientFillContent#draw");
    }

    @Override // x7.c
    public String getName() {
        return this.f57248a;
    }
}