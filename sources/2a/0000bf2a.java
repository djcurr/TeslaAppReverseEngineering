package x7;

import android.graphics.Path;
import android.graphics.PointF;
import c8.j;
import c8.r;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import y7.a;

/* loaded from: classes.dex */
public class n implements m, a.b, k {

    /* renamed from: b  reason: collision with root package name */
    private final String f57285b;

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.a f57286c;

    /* renamed from: d  reason: collision with root package name */
    private final j.a f57287d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f57288e;

    /* renamed from: f  reason: collision with root package name */
    private final y7.a<?, Float> f57289f;

    /* renamed from: g  reason: collision with root package name */
    private final y7.a<?, PointF> f57290g;

    /* renamed from: h  reason: collision with root package name */
    private final y7.a<?, Float> f57291h;

    /* renamed from: i  reason: collision with root package name */
    private final y7.a<?, Float> f57292i;

    /* renamed from: j  reason: collision with root package name */
    private final y7.a<?, Float> f57293j;

    /* renamed from: k  reason: collision with root package name */
    private final y7.a<?, Float> f57294k;

    /* renamed from: l  reason: collision with root package name */
    private final y7.a<?, Float> f57295l;

    /* renamed from: n  reason: collision with root package name */
    private boolean f57297n;

    /* renamed from: a  reason: collision with root package name */
    private final Path f57284a = new Path();

    /* renamed from: m  reason: collision with root package name */
    private final b f57296m = new b();

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f57298a;

        static {
            int[] iArr = new int[j.a.values().length];
            f57298a = iArr;
            try {
                iArr[j.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57298a[j.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public n(com.airbnb.lottie.a aVar, d8.b bVar, c8.j jVar) {
        this.f57286c = aVar;
        this.f57285b = jVar.d();
        j.a j11 = jVar.j();
        this.f57287d = j11;
        this.f57288e = jVar.k();
        y7.a<Float, Float> l11 = jVar.g().l();
        this.f57289f = l11;
        y7.a<PointF, PointF> l12 = jVar.h().l();
        this.f57290g = l12;
        y7.a<Float, Float> l13 = jVar.i().l();
        this.f57291h = l13;
        y7.a<Float, Float> l14 = jVar.e().l();
        this.f57293j = l14;
        y7.a<Float, Float> l15 = jVar.f().l();
        this.f57295l = l15;
        j.a aVar2 = j.a.STAR;
        if (j11 == aVar2) {
            this.f57292i = jVar.b().l();
            this.f57294k = jVar.c().l();
        } else {
            this.f57292i = null;
            this.f57294k = null;
        }
        bVar.h(l11);
        bVar.h(l12);
        bVar.h(l13);
        bVar.h(l14);
        bVar.h(l15);
        if (j11 == aVar2) {
            bVar.h(this.f57292i);
            bVar.h(this.f57294k);
        }
        l11.a(this);
        l12.a(this);
        l13.a(this);
        l14.a(this);
        l15.a(this);
        if (j11 == aVar2) {
            this.f57292i.a(this);
            this.f57294k.a(this);
        }
    }

    private void f() {
        y7.a<?, Float> aVar;
        double d11;
        double d12;
        double d13;
        int i11;
        int floor = (int) Math.floor(this.f57289f.h().floatValue());
        double radians = Math.toRadians((this.f57291h == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d14 = floor;
        float floatValue = this.f57295l.h().floatValue() / 100.0f;
        float floatValue2 = this.f57293j.h().floatValue();
        double d15 = floatValue2;
        float cos = (float) (Math.cos(radians) * d15);
        float sin = (float) (Math.sin(radians) * d15);
        this.f57284a.moveTo(cos, sin);
        double d16 = (float) (6.283185307179586d / d14);
        double d17 = radians + d16;
        double ceil = Math.ceil(d14);
        int i12 = 0;
        while (i12 < ceil) {
            float cos2 = (float) (Math.cos(d17) * d15);
            double d18 = ceil;
            float sin2 = (float) (d15 * Math.sin(d17));
            if (floatValue != BitmapDescriptorFactory.HUE_RED) {
                d12 = d15;
                i11 = i12;
                d11 = d17;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                d13 = d16;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f11 = floatValue2 * floatValue * 0.25f;
                this.f57284a.cubicTo(cos - (cos3 * f11), sin - (((float) Math.sin(atan2)) * f11), cos2 + (((float) Math.cos(atan22)) * f11), sin2 + (f11 * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                d11 = d17;
                d12 = d15;
                d13 = d16;
                i11 = i12;
                this.f57284a.lineTo(cos2, sin2);
            }
            d17 = d11 + d13;
            i12 = i11 + 1;
            sin = sin2;
            cos = cos2;
            ceil = d18;
            d15 = d12;
            d16 = d13;
        }
        PointF h11 = this.f57290g.h();
        this.f57284a.offset(h11.x, h11.y);
        this.f57284a.close();
    }

    private void h() {
        y7.a<?, Float> aVar;
        double d11;
        int i11;
        double d12;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        double d13;
        float f17;
        float f18;
        float f19;
        float floatValue = this.f57289f.h().floatValue();
        double radians = Math.toRadians((this.f57291h == null ? 0.0d : aVar.h().floatValue()) - 90.0d);
        double d14 = floatValue;
        float f21 = (float) (6.283185307179586d / d14);
        float f22 = f21 / 2.0f;
        float f23 = floatValue - ((int) floatValue);
        int i12 = (f23 > BitmapDescriptorFactory.HUE_RED ? 1 : (f23 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i12 != 0) {
            radians += (1.0f - f23) * f22;
        }
        float floatValue2 = this.f57293j.h().floatValue();
        float floatValue3 = this.f57292i.h().floatValue();
        y7.a<?, Float> aVar2 = this.f57294k;
        float floatValue4 = aVar2 != null ? aVar2.h().floatValue() / 100.0f : 0.0f;
        y7.a<?, Float> aVar3 = this.f57295l;
        float floatValue5 = aVar3 != null ? aVar3.h().floatValue() / 100.0f : 0.0f;
        if (i12 != 0) {
            f13 = ((floatValue2 - floatValue3) * f23) + floatValue3;
            i11 = i12;
            double d15 = f13;
            d11 = d14;
            f11 = (float) (d15 * Math.cos(radians));
            f12 = (float) (d15 * Math.sin(radians));
            this.f57284a.moveTo(f11, f12);
            d12 = radians + ((f21 * f23) / 2.0f);
        } else {
            d11 = d14;
            i11 = i12;
            double d16 = floatValue2;
            float cos = (float) (Math.cos(radians) * d16);
            float sin = (float) (d16 * Math.sin(radians));
            this.f57284a.moveTo(cos, sin);
            d12 = radians + f22;
            f11 = cos;
            f12 = sin;
            f13 = BitmapDescriptorFactory.HUE_RED;
        }
        double ceil = Math.ceil(d11) * 2.0d;
        int i13 = 0;
        boolean z11 = false;
        while (true) {
            double d17 = i13;
            if (d17 < ceil) {
                float f24 = z11 ? floatValue2 : floatValue3;
                int i14 = (f13 > BitmapDescriptorFactory.HUE_RED ? 1 : (f13 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                if (i14 == 0 || d17 != ceil - 2.0d) {
                    f14 = f21;
                    f15 = f22;
                } else {
                    f14 = f21;
                    f15 = (f21 * f23) / 2.0f;
                }
                if (i14 == 0 || d17 != ceil - 1.0d) {
                    f16 = f22;
                    d13 = d17;
                    f17 = f24;
                } else {
                    f16 = f22;
                    d13 = d17;
                    f17 = f13;
                }
                double d18 = f17;
                double d19 = ceil;
                float cos2 = (float) (d18 * Math.cos(d12));
                float sin2 = (float) (d18 * Math.sin(d12));
                if (floatValue4 == BitmapDescriptorFactory.HUE_RED && floatValue5 == BitmapDescriptorFactory.HUE_RED) {
                    this.f57284a.lineTo(cos2, sin2);
                    f18 = floatValue4;
                    f19 = f13;
                } else {
                    f18 = floatValue4;
                    f19 = f13;
                    double atan2 = (float) (Math.atan2(f12, f11) - 1.5707963267948966d);
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f25 = z11 ? f18 : floatValue5;
                    float f26 = z11 ? floatValue5 : f18;
                    float f27 = (z11 ? floatValue3 : floatValue2) * f25 * 0.47829f;
                    float f28 = cos3 * f27;
                    float f29 = f27 * sin3;
                    float f31 = (z11 ? floatValue2 : floatValue3) * f26 * 0.47829f;
                    float f32 = cos4 * f31;
                    float f33 = f31 * sin4;
                    if (i11 != 0) {
                        if (i13 == 0) {
                            f28 *= f23;
                            f29 *= f23;
                        } else if (d13 == d19 - 1.0d) {
                            f32 *= f23;
                            f33 *= f23;
                        }
                    }
                    this.f57284a.cubicTo(f11 - f28, f12 - f29, cos2 + f32, sin2 + f33, cos2, sin2);
                }
                d12 += f15;
                z11 = !z11;
                i13++;
                f11 = cos2;
                f12 = sin2;
                floatValue4 = f18;
                f13 = f19;
                f22 = f16;
                f21 = f14;
                ceil = d19;
            } else {
                PointF h11 = this.f57290g.h();
                this.f57284a.offset(h11.x, h11.y);
                this.f57284a.close();
                return;
            }
        }
    }

    private void i() {
        this.f57297n = false;
        this.f57286c.invalidateSelf();
    }

    @Override // y7.a.b
    public void a() {
        i();
    }

    @Override // x7.c
    public void b(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVar = list.get(i11);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.i() == r.a.SIMULTANEOUSLY) {
                    this.f57296m.a(sVar);
                    sVar.c(this);
                }
            }
        }
    }

    @Override // a8.f
    public <T> void c(T t11, i8.c<T> cVar) {
        y7.a<?, Float> aVar;
        y7.a<?, Float> aVar2;
        if (t11 == v7.j.f54302w) {
            this.f57289f.n(cVar);
        } else if (t11 == v7.j.f54303x) {
            this.f57291h.n(cVar);
        } else if (t11 == v7.j.f54293n) {
            this.f57290g.n(cVar);
        } else if (t11 == v7.j.f54304y && (aVar2 = this.f57292i) != null) {
            aVar2.n(cVar);
        } else if (t11 == v7.j.f54305z) {
            this.f57293j.n(cVar);
        } else if (t11 == v7.j.A && (aVar = this.f57294k) != null) {
            aVar.n(cVar);
        } else if (t11 == v7.j.B) {
            this.f57295l.n(cVar);
        }
    }

    @Override // a8.f
    public void d(a8.e eVar, int i11, List<a8.e> list, a8.e eVar2) {
        h8.g.m(eVar, i11, list, eVar2, this);
    }

    @Override // x7.c
    public String getName() {
        return this.f57285b;
    }

    @Override // x7.m
    public Path getPath() {
        if (this.f57297n) {
            return this.f57284a;
        }
        this.f57284a.reset();
        if (this.f57288e) {
            this.f57297n = true;
            return this.f57284a;
        }
        int i11 = a.f57298a[this.f57287d.ordinal()];
        if (i11 == 1) {
            h();
        } else if (i11 == 2) {
            f();
        }
        this.f57284a.close();
        this.f57296m.b(this.f57284a);
        this.f57297n = true;
        return this.f57284a;
    }
}