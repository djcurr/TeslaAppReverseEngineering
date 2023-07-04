package x0;

import f2.o;
import vz.b0;
import w0.v0;

/* loaded from: classes.dex */
public final class r extends b<r> {

    /* renamed from: h  reason: collision with root package name */
    private final s2.a0 f56591h;

    /* renamed from: i  reason: collision with root package name */
    private final v0 f56592i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s2.a0 currentValue, s2.t offsetMapping, v0 v0Var, w state) {
        super(currentValue.e(), currentValue.g(), v0Var == null ? null : v0Var.i(), offsetMapping, state, null);
        kotlin.jvm.internal.s.g(currentValue, "currentValue");
        kotlin.jvm.internal.s.g(offsetMapping, "offsetMapping");
        kotlin.jvm.internal.s.g(state, "state");
        this.f56591h = currentValue;
        this.f56592i = v0Var;
    }

    private final int c0(v0 v0Var, int i11) {
        f2.o b11;
        f2.o c11 = v0Var.c();
        s1.h hVar = null;
        if (c11 != null && (b11 = v0Var.b()) != null) {
            hVar = o.a.a(b11, c11, false, 2, null);
        }
        if (hVar == null) {
            hVar = s1.h.f49955e.a();
        }
        s1.h d11 = v0Var.i().d(n().originalToTransformed(n2.y.i(this.f56591h.g())));
        return n().transformedToOriginal(v0Var.i().w(s1.g.a(d11.i(), d11.l() + (s1.l.g(hVar.k()) * i11))));
    }

    public final r Z(h00.l<? super r, b0> or2) {
        kotlin.jvm.internal.s.g(or2, "or");
        u().b();
        if (v().length() > 0) {
            if (n2.y.h(t())) {
                or2.invoke(this);
            } else {
                d();
            }
        }
        return this;
    }

    public final v0 a0() {
        return this.f56592i;
    }

    public final s2.a0 b0() {
        return s2.a0.d(this.f56591h, f(), t(), null, 4, null);
    }

    public final r d0() {
        v0 a02;
        if ((v().length() > 0) && (a02 = a0()) != null) {
            T(c0(a02, 1));
        }
        return this;
    }

    public final r e0() {
        v0 a02;
        if ((v().length() > 0) && (a02 = a0()) != null) {
            T(c0(a02, -1));
        }
        return this;
    }
}