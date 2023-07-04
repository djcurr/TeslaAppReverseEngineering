package iy;

import java.util.Objects;

/* loaded from: classes5.dex */
public interface b {
    static b d() {
        return ly.b.INSTANCE;
    }

    static b e() {
        return f(my.a.f39641b);
    }

    static b f(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        return new e(runnable);
    }

    void dispose();

    boolean isDisposed();
}