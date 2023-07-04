package l0;

import l0.l0;

/* loaded from: classes.dex */
public final class j {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends p> V b(d1<T, V> d1Var, T t11) {
        if (t11 == null) {
            return null;
        }
        return d1Var.a().invoke(t11);
    }

    public static final <T> i0<T> c(z<T> animation, q0 repeatMode, long j11) {
        kotlin.jvm.internal.s.g(animation, "animation");
        kotlin.jvm.internal.s.g(repeatMode, "repeatMode");
        return new i0<>(animation, repeatMode, j11, null);
    }

    public static /* synthetic */ i0 d(z zVar, q0 q0Var, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            q0Var = q0.Restart;
        }
        if ((i11 & 4) != 0) {
            j11 = w0.c(0, 0, 2, null);
        }
        return c(zVar, q0Var, j11);
    }

    public static final <T> l0<T> e(h00.l<? super l0.b<T>, vz.b0> init) {
        kotlin.jvm.internal.s.g(init, "init");
        l0.b bVar = new l0.b();
        init.invoke(bVar);
        return new l0<>(bVar);
    }

    public static final <T> r0<T> f(int i11) {
        return new r0<>(i11);
    }

    public static /* synthetic */ r0 g(int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return f(i11);
    }

    public static final <T> v0<T> h(float f11, float f12, T t11) {
        return new v0<>(f11, f12, t11);
    }

    public static /* synthetic */ v0 i(float f11, float f12, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        if ((i11 & 2) != 0) {
            f12 = 1500.0f;
        }
        if ((i11 & 4) != 0) {
            obj = null;
        }
        return h(f11, f12, obj);
    }

    public static final <T> c1<T> j(int i11, int i12, a0 easing) {
        kotlin.jvm.internal.s.g(easing, "easing");
        return new c1<>(i11, i12, easing);
    }

    public static /* synthetic */ c1 k(int i11, int i12, a0 a0Var, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 300;
        }
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        if ((i13 & 4) != 0) {
            a0Var = b0.a();
        }
        return j(i11, i12, a0Var);
    }
}