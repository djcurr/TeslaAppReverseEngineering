package c8;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f8920a;

    /* renamed from: b  reason: collision with root package name */
    private final b8.m<PointF, PointF> f8921b;

    /* renamed from: c  reason: collision with root package name */
    private final b8.f f8922c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8923d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f8924e;

    public b(String str, b8.m<PointF, PointF> mVar, b8.f fVar, boolean z11, boolean z12) {
        this.f8920a = str;
        this.f8921b = mVar;
        this.f8922c = fVar;
        this.f8923d = z11;
        this.f8924e = z12;
    }

    @Override // c8.c
    public x7.c a(com.airbnb.lottie.a aVar, d8.b bVar) {
        return new x7.f(aVar, bVar, this);
    }

    public String b() {
        return this.f8920a;
    }

    public b8.m<PointF, PointF> c() {
        return this.f8921b;
    }

    public b8.f d() {
        return this.f8922c;
    }

    public boolean e() {
        return this.f8924e;
    }

    public boolean f() {
        return this.f8923d;
    }
}