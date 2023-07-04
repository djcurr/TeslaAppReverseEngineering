package t1;

import android.graphics.Shader;
import t1.a0;

/* loaded from: classes.dex */
public abstract class z0 extends s {

    /* renamed from: a  reason: collision with root package name */
    private Shader f51538a;

    /* renamed from: b  reason: collision with root package name */
    private long f51539b;

    public z0() {
        super(null);
        this.f51539b = s1.l.f49969b.a();
    }

    @Override // t1.s
    public final void a(long j11, o0 p11, float f11) {
        kotlin.jvm.internal.s.g(p11, "p");
        Shader shader = this.f51538a;
        if (shader == null || !s1.l.f(this.f51539b, j11)) {
            shader = b(j11);
            this.f51538a = shader;
            this.f51539b = j11;
        }
        long a11 = p11.a();
        a0.a aVar = a0.f51365b;
        if (!a0.n(a11, aVar.a())) {
            p11.l(aVar.a());
        }
        if (!kotlin.jvm.internal.s.c(p11.s(), shader)) {
            p11.r(shader);
        }
        if (p11.h() == f11) {
            return;
        }
        p11.b(f11);
    }

    public abstract Shader b(long j11);
}