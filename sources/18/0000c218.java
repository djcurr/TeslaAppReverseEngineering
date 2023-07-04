package y7;

import android.graphics.Color;
import android.graphics.Paint;
import y7.a;

/* loaded from: classes.dex */
public class c implements a.b {

    /* renamed from: a  reason: collision with root package name */
    private final a.b f59272a;

    /* renamed from: b  reason: collision with root package name */
    private final y7.a<Integer, Integer> f59273b;

    /* renamed from: c  reason: collision with root package name */
    private final y7.a<Float, Float> f59274c;

    /* renamed from: d  reason: collision with root package name */
    private final y7.a<Float, Float> f59275d;

    /* renamed from: e  reason: collision with root package name */
    private final y7.a<Float, Float> f59276e;

    /* renamed from: f  reason: collision with root package name */
    private final y7.a<Float, Float> f59277f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f59278g = true;

    /* loaded from: classes.dex */
    class a extends i8.c<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i8.c f59279c;

        a(c cVar, i8.c cVar2) {
            this.f59279c = cVar2;
        }

        @Override // i8.c
        /* renamed from: d */
        public Float a(i8.b<Float> bVar) {
            Float f11 = (Float) this.f59279c.a(bVar);
            if (f11 == null) {
                return null;
            }
            return Float.valueOf(f11.floatValue() * 2.55f);
        }
    }

    public c(a.b bVar, d8.b bVar2, f8.j jVar) {
        this.f59272a = bVar;
        y7.a<Integer, Integer> l11 = jVar.a().l();
        this.f59273b = l11;
        l11.a(this);
        bVar2.h(l11);
        y7.a<Float, Float> l12 = jVar.d().l();
        this.f59274c = l12;
        l12.a(this);
        bVar2.h(l12);
        y7.a<Float, Float> l13 = jVar.b().l();
        this.f59275d = l13;
        l13.a(this);
        bVar2.h(l13);
        y7.a<Float, Float> l14 = jVar.c().l();
        this.f59276e = l14;
        l14.a(this);
        bVar2.h(l14);
        y7.a<Float, Float> l15 = jVar.e().l();
        this.f59277f = l15;
        l15.a(this);
        bVar2.h(l15);
    }

    @Override // y7.a.b
    public void a() {
        this.f59278g = true;
        this.f59272a.a();
    }

    public void b(Paint paint) {
        if (this.f59278g) {
            this.f59278g = false;
            double floatValue = this.f59275d.h().floatValue() * 0.017453292519943295d;
            float floatValue2 = this.f59276e.h().floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = this.f59273b.h().intValue();
            paint.setShadowLayer(this.f59277f.h().floatValue(), sin, cos, Color.argb(Math.round(this.f59274c.h().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    public void c(i8.c<Integer> cVar) {
        this.f59273b.n(cVar);
    }

    public void d(i8.c<Float> cVar) {
        this.f59275d.n(cVar);
    }

    public void e(i8.c<Float> cVar) {
        this.f59276e.n(cVar);
    }

    public void f(i8.c<Float> cVar) {
        if (cVar == null) {
            this.f59274c.n(null);
        } else {
            this.f59274c.n(new a(this, cVar));
        }
    }

    public void g(i8.c<Float> cVar) {
        this.f59277f.n(cVar);
    }
}