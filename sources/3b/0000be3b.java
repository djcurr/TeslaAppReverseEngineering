package x1;

import java.util.ArrayList;
import java.util.List;
import x1.f;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final List<f> f56688a = new ArrayList();

    private final d a(f fVar) {
        this.f56688a.add(fVar);
        return this;
    }

    public final d b() {
        return a(f.b.f56719c);
    }

    public final d c(float f11, float f12, float f13, float f14, float f15, float f16) {
        return a(new f.k(f11, f12, f13, f14, f15, f16));
    }

    public final List<f> d() {
        return this.f56688a;
    }

    public final d e(float f11, float f12) {
        return a(new f.e(f11, f12));
    }

    public final d f(float f11, float f12) {
        return a(new f.m(f11, f12));
    }

    public final d g(float f11, float f12) {
        return a(new f.C1297f(f11, f12));
    }

    public final d h(float f11, float f12, float f13, float f14) {
        return a(new f.p(f11, f12, f13, f14));
    }
}