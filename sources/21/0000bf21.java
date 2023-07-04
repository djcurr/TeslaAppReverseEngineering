package x7;

import android.graphics.Path;
import android.graphics.PointF;
import c8.r;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import y7.a;

/* loaded from: classes.dex */
public class f implements m, a.b, k {

    /* renamed from: b  reason: collision with root package name */
    private final String f57228b;

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.a f57229c;

    /* renamed from: d  reason: collision with root package name */
    private final y7.a<?, PointF> f57230d;

    /* renamed from: e  reason: collision with root package name */
    private final y7.a<?, PointF> f57231e;

    /* renamed from: f  reason: collision with root package name */
    private final c8.b f57232f;

    /* renamed from: h  reason: collision with root package name */
    private boolean f57234h;

    /* renamed from: a  reason: collision with root package name */
    private final Path f57227a = new Path();

    /* renamed from: g  reason: collision with root package name */
    private final b f57233g = new b();

    public f(com.airbnb.lottie.a aVar, d8.b bVar, c8.b bVar2) {
        this.f57228b = bVar2.b();
        this.f57229c = aVar;
        y7.a<PointF, PointF> l11 = bVar2.d().l();
        this.f57230d = l11;
        y7.a<PointF, PointF> l12 = bVar2.c().l();
        this.f57231e = l12;
        this.f57232f = bVar2;
        bVar.h(l11);
        bVar.h(l12);
        l11.a(this);
        l12.a(this);
    }

    private void f() {
        this.f57234h = false;
        this.f57229c.invalidateSelf();
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
                    this.f57233g.a(sVar);
                    sVar.c(this);
                }
            }
        }
    }

    @Override // a8.f
    public <T> void c(T t11, i8.c<T> cVar) {
        if (t11 == v7.j.f54290k) {
            this.f57230d.n(cVar);
        } else if (t11 == v7.j.f54293n) {
            this.f57231e.n(cVar);
        }
    }

    @Override // a8.f
    public void d(a8.e eVar, int i11, List<a8.e> list, a8.e eVar2) {
        h8.g.m(eVar, i11, list, eVar2, this);
    }

    @Override // x7.c
    public String getName() {
        return this.f57228b;
    }

    @Override // x7.m
    public Path getPath() {
        if (this.f57234h) {
            return this.f57227a;
        }
        this.f57227a.reset();
        if (this.f57232f.e()) {
            this.f57234h = true;
            return this.f57227a;
        }
        PointF h11 = this.f57230d.h();
        float f11 = h11.x / 2.0f;
        float f12 = h11.y / 2.0f;
        float f13 = f11 * 0.55228f;
        float f14 = 0.55228f * f12;
        this.f57227a.reset();
        if (this.f57232f.f()) {
            float f15 = -f12;
            this.f57227a.moveTo(BitmapDescriptorFactory.HUE_RED, f15);
            Path path = this.f57227a;
            float f16 = BitmapDescriptorFactory.HUE_RED - f13;
            float f17 = -f11;
            float f18 = BitmapDescriptorFactory.HUE_RED - f14;
            path.cubicTo(f16, f15, f17, f18, f17, BitmapDescriptorFactory.HUE_RED);
            Path path2 = this.f57227a;
            float f19 = f14 + BitmapDescriptorFactory.HUE_RED;
            path2.cubicTo(f17, f19, f16, f12, BitmapDescriptorFactory.HUE_RED, f12);
            Path path3 = this.f57227a;
            float f21 = f13 + BitmapDescriptorFactory.HUE_RED;
            path3.cubicTo(f21, f12, f11, f19, f11, BitmapDescriptorFactory.HUE_RED);
            this.f57227a.cubicTo(f11, f18, f21, f15, BitmapDescriptorFactory.HUE_RED, f15);
        } else {
            float f22 = -f12;
            this.f57227a.moveTo(BitmapDescriptorFactory.HUE_RED, f22);
            Path path4 = this.f57227a;
            float f23 = f13 + BitmapDescriptorFactory.HUE_RED;
            float f24 = BitmapDescriptorFactory.HUE_RED - f14;
            path4.cubicTo(f23, f22, f11, f24, f11, BitmapDescriptorFactory.HUE_RED);
            Path path5 = this.f57227a;
            float f25 = f14 + BitmapDescriptorFactory.HUE_RED;
            path5.cubicTo(f11, f25, f23, f12, BitmapDescriptorFactory.HUE_RED, f12);
            Path path6 = this.f57227a;
            float f26 = BitmapDescriptorFactory.HUE_RED - f13;
            float f27 = -f11;
            path6.cubicTo(f26, f12, f27, f25, f27, BitmapDescriptorFactory.HUE_RED);
            this.f57227a.cubicTo(f27, f24, f26, f22, BitmapDescriptorFactory.HUE_RED, f22);
        }
        PointF h12 = this.f57231e.h();
        this.f57227a.offset(h12.x, h12.y);
        this.f57227a.close();
        this.f57233g.b(this.f57227a);
        this.f57234h = true;
        return this.f57227a;
    }
}