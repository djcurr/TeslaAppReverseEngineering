package a8;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final PointF f319a;

    /* renamed from: b  reason: collision with root package name */
    private final PointF f320b;

    /* renamed from: c  reason: collision with root package name */
    private final PointF f321c;

    public a() {
        this.f319a = new PointF();
        this.f320b = new PointF();
        this.f321c = new PointF();
    }

    public PointF a() {
        return this.f319a;
    }

    public PointF b() {
        return this.f320b;
    }

    public PointF c() {
        return this.f321c;
    }

    public void d(float f11, float f12) {
        this.f319a.set(f11, f12);
    }

    public void e(float f11, float f12) {
        this.f320b.set(f11, f12);
    }

    public void f(float f11, float f12) {
        this.f321c.set(f11, f12);
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f319a = pointF;
        this.f320b = pointF2;
        this.f321c = pointF3;
    }
}