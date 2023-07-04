package j1;

import c1.i;
import c1.y0;
import c1.z0;
import java.util.Objects;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class c {
    public static final int a(int i11, int i12) {
        return i11 << (((i12 % 10) * 3) + 1);
    }

    public static final a b(i composer, int i11, boolean z11, Object block) {
        b bVar;
        s.g(composer, "composer");
        s.g(block, "block");
        composer.x(i11);
        Object y11 = composer.y();
        if (y11 == i.f8486a.a()) {
            bVar = new b(i11, z11);
            composer.p(bVar);
        } else {
            Objects.requireNonNull(y11, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            bVar = (b) y11;
        }
        bVar.k(block);
        composer.N();
        return bVar;
    }

    public static final a c(int i11, boolean z11, Object block) {
        s.g(block, "block");
        b bVar = new b(i11, z11);
        bVar.k(block);
        return bVar;
    }

    public static final int d(int i11) {
        return a(2, i11);
    }

    public static final boolean e(y0 y0Var, y0 other) {
        s.g(other, "other");
        if (y0Var != null) {
            if ((y0Var instanceof z0) && (other instanceof z0)) {
                z0 z0Var = (z0) y0Var;
                if (!z0Var.q() || s.c(y0Var, other) || s.c(z0Var.i(), ((z0) other).i())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final int f(int i11) {
        return a(1, i11);
    }
}