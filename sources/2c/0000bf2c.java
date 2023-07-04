package x7;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import c8.r;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import y7.a;

/* loaded from: classes.dex */
public class o implements a.b, k, m {

    /* renamed from: c  reason: collision with root package name */
    private final String f57301c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f57302d;

    /* renamed from: e  reason: collision with root package name */
    private final com.airbnb.lottie.a f57303e;

    /* renamed from: f  reason: collision with root package name */
    private final y7.a<?, PointF> f57304f;

    /* renamed from: g  reason: collision with root package name */
    private final y7.a<?, PointF> f57305g;

    /* renamed from: h  reason: collision with root package name */
    private final y7.a<?, Float> f57306h;

    /* renamed from: j  reason: collision with root package name */
    private boolean f57308j;

    /* renamed from: a  reason: collision with root package name */
    private final Path f57299a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final RectF f57300b = new RectF();

    /* renamed from: i  reason: collision with root package name */
    private final b f57307i = new b();

    public o(com.airbnb.lottie.a aVar, d8.b bVar, c8.k kVar) {
        this.f57301c = kVar.c();
        this.f57302d = kVar.f();
        this.f57303e = aVar;
        y7.a<PointF, PointF> l11 = kVar.d().l();
        this.f57304f = l11;
        y7.a<PointF, PointF> l12 = kVar.e().l();
        this.f57305g = l12;
        y7.a<Float, Float> l13 = kVar.b().l();
        this.f57306h = l13;
        bVar.h(l11);
        bVar.h(l12);
        bVar.h(l13);
        l11.a(this);
        l12.a(this);
        l13.a(this);
    }

    private void f() {
        this.f57308j = false;
        this.f57303e.invalidateSelf();
    }

    @Override // y7.a.b
    public void a() {
        f();
    }

    @Override // x7.c
    public void b(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVar = list.get(i11);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.i() == r.a.SIMULTANEOUSLY) {
                    this.f57307i.a(sVar);
                    sVar.c(this);
                }
            }
        }
    }

    @Override // a8.f
    public <T> void c(T t11, i8.c<T> cVar) {
        if (t11 == v7.j.f54291l) {
            this.f57305g.n(cVar);
        } else if (t11 == v7.j.f54293n) {
            this.f57304f.n(cVar);
        } else if (t11 == v7.j.f54292m) {
            this.f57306h.n(cVar);
        }
    }

    @Override // a8.f
    public void d(a8.e eVar, int i11, List<a8.e> list, a8.e eVar2) {
        h8.g.m(eVar, i11, list, eVar2, this);
    }

    @Override // x7.c
    public String getName() {
        return this.f57301c;
    }

    @Override // x7.m
    public Path getPath() {
        if (this.f57308j) {
            return this.f57299a;
        }
        this.f57299a.reset();
        if (this.f57302d) {
            this.f57308j = true;
            return this.f57299a;
        }
        PointF h11 = this.f57305g.h();
        float f11 = h11.x / 2.0f;
        float f12 = h11.y / 2.0f;
        y7.a<?, Float> aVar = this.f57306h;
        float p11 = aVar == null ? 0.0f : ((y7.d) aVar).p();
        float min = Math.min(f11, f12);
        if (p11 > min) {
            p11 = min;
        }
        PointF h12 = this.f57304f.h();
        this.f57299a.moveTo(h12.x + f11, (h12.y - f12) + p11);
        this.f57299a.lineTo(h12.x + f11, (h12.y + f12) - p11);
        int i11 = (p11 > BitmapDescriptorFactory.HUE_RED ? 1 : (p11 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i11 > 0) {
            RectF rectF = this.f57300b;
            float f13 = h12.x;
            float f14 = p11 * 2.0f;
            float f15 = h12.y;
            rectF.set((f13 + f11) - f14, (f15 + f12) - f14, f13 + f11, f15 + f12);
            this.f57299a.arcTo(this.f57300b, BitmapDescriptorFactory.HUE_RED, 90.0f, false);
        }
        this.f57299a.lineTo((h12.x - f11) + p11, h12.y + f12);
        if (i11 > 0) {
            RectF rectF2 = this.f57300b;
            float f16 = h12.x;
            float f17 = h12.y;
            float f18 = p11 * 2.0f;
            rectF2.set(f16 - f11, (f17 + f12) - f18, (f16 - f11) + f18, f17 + f12);
            this.f57299a.arcTo(this.f57300b, 90.0f, 90.0f, false);
        }
        this.f57299a.lineTo(h12.x - f11, (h12.y - f12) + p11);
        if (i11 > 0) {
            RectF rectF3 = this.f57300b;
            float f19 = h12.x;
            float f21 = h12.y;
            float f22 = p11 * 2.0f;
            rectF3.set(f19 - f11, f21 - f12, (f19 - f11) + f22, (f21 - f12) + f22);
            this.f57299a.arcTo(this.f57300b, 180.0f, 90.0f, false);
        }
        this.f57299a.lineTo((h12.x + f11) - p11, h12.y - f12);
        if (i11 > 0) {
            RectF rectF4 = this.f57300b;
            float f23 = h12.x;
            float f24 = p11 * 2.0f;
            float f25 = h12.y;
            rectF4.set((f23 + f11) - f24, f25 - f12, f23 + f11, (f25 - f12) + f24);
            this.f57299a.arcTo(this.f57300b, 270.0f, 90.0f, false);
        }
        this.f57299a.close();
        this.f57307i.b(this.f57299a);
        this.f57308j = true;
        return this.f57299a;
    }
}