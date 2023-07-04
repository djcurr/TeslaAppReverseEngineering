package m0;

import android.view.View;
import android.widget.Magnifier;

/* loaded from: classes.dex */
public final class a0 implements z {

    /* renamed from: b  reason: collision with root package name */
    public static final a0 f37828b = new a0();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f37829c = false;

    /* loaded from: classes.dex */
    public static class a implements y {

        /* renamed from: a  reason: collision with root package name */
        private final Magnifier f37830a;

        public a(Magnifier magnifier) {
            kotlin.jvm.internal.s.g(magnifier, "magnifier");
            this.f37830a = magnifier;
        }

        @Override // m0.y
        public void a(long j11, long j12, float f11) {
            this.f37830a.show(s1.f.l(j11), s1.f.m(j11));
        }

        @Override // m0.y
        public void b() {
            this.f37830a.update();
        }

        public final Magnifier c() {
            return this.f37830a;
        }

        @Override // m0.y
        public void dismiss() {
            this.f37830a.dismiss();
        }
    }

    private a0() {
    }

    @Override // m0.z
    public boolean a() {
        return f37829c;
    }

    @Override // m0.z
    /* renamed from: c */
    public a b(u style, View view, x2.d density, float f11) {
        kotlin.jvm.internal.s.g(style, "style");
        kotlin.jvm.internal.s.g(view, "view");
        kotlin.jvm.internal.s.g(density, "density");
        return new a(new Magnifier(view));
    }
}