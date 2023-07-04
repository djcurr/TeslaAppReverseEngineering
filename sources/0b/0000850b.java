package m0;

import android.view.View;
import android.widget.Magnifier;
import m0.a0;

/* loaded from: classes.dex */
public final class b0 implements z {

    /* renamed from: b  reason: collision with root package name */
    public static final b0 f37833b = new b0();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f37834c = true;

    /* loaded from: classes.dex */
    public static final class a extends a0.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Magnifier magnifier) {
            super(magnifier);
            kotlin.jvm.internal.s.g(magnifier, "magnifier");
        }

        @Override // m0.a0.a, m0.y
        public void a(long j11, long j12, float f11) {
            if (!Float.isNaN(f11)) {
                c().setZoom(f11);
            }
            if (s1.g.c(j12)) {
                c().show(s1.f.l(j11), s1.f.m(j11), s1.f.l(j12), s1.f.m(j12));
            } else {
                c().show(s1.f.l(j11), s1.f.m(j11));
            }
        }
    }

    private b0() {
    }

    @Override // m0.z
    public boolean a() {
        return f37834c;
    }

    @Override // m0.z
    /* renamed from: c */
    public a b(u style, View view, x2.d density, float f11) {
        int c11;
        int c12;
        kotlin.jvm.internal.s.g(style, "style");
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(density, "density");
        if (kotlin.jvm.internal.s.c(style, u.f38111g.b())) {
            return new a(new Magnifier(view));
        }
        long p02 = density.p0(style.g());
        float i02 = density.i0(style.d());
        float i03 = density.i0(style.e());
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (p02 != s1.l.f49969b.a()) {
            c11 = j00.c.c(s1.l.i(p02));
            c12 = j00.c.c(s1.l.g(p02));
            builder.setSize(c11, c12);
        }
        if (!Float.isNaN(i02)) {
            builder.setCornerRadius(i02);
        }
        if (!Float.isNaN(i03)) {
            builder.setElevation(i03);
        }
        if (!Float.isNaN(f11)) {
            builder.setInitialZoom(f11);
        }
        builder.setClippingEnabled(style.c());
        Magnifier build = builder.build();
        kotlin.jvm.internal.s.f(build, "Builder(view).run {\n    …    build()\n            }");
        return new a(build);
    }
}