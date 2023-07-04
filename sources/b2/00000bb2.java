package b1;

import c1.v1;
import kotlin.jvm.internal.s;
import v20.o0;

/* loaded from: classes.dex */
public abstract class m implements m0.q {

    /* renamed from: a  reason: collision with root package name */
    private final q f7255a;

    public m(boolean z11, v1<f> rippleAlpha) {
        s.g(rippleAlpha, "rippleAlpha");
        this.f7255a = new q(z11, rippleAlpha);
    }

    public abstract void c(o0.p pVar, o0 o0Var);

    public final void f(v1.e receiver, float f11, long j11) {
        s.g(receiver, "$receiver");
        this.f7255a.b(receiver, f11, j11);
    }

    public abstract void g(o0.p pVar);

    public final void h(o0.j interaction, o0 scope) {
        s.g(interaction, "interaction");
        s.g(scope, "scope");
        this.f7255a.c(interaction, scope);
    }
}