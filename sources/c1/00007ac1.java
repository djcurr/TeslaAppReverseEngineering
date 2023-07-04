package j$.time.temporal;

import java.util.Objects;

/* loaded from: classes7.dex */
public interface k {
    default int b(l lVar) {
        x g11 = g(lVar);
        if (!g11.g()) {
            throw new w("Invalid field " + lVar + " for get() method, use getLong() instead");
        }
        long e11 = e(lVar);
        if (g11.h(e11)) {
            return (int) e11;
        }
        throw new j$.time.c("Invalid value for " + lVar + " (valid values " + g11 + "): " + e11);
    }

    boolean c(l lVar);

    default Object d(u uVar) {
        int i11 = t.f32969a;
        if (uVar == m.f32962a || uVar == n.f32963a || uVar == o.f32964a) {
            return null;
        }
        return uVar.a(this);
    }

    long e(l lVar);

    default x g(l lVar) {
        if (!(lVar instanceof a)) {
            Objects.requireNonNull(lVar, "field");
            return lVar.c(this);
        } else if (c(lVar)) {
            return lVar.g();
        } else {
            throw new w("Unsupported field: " + lVar);
        }
    }
}