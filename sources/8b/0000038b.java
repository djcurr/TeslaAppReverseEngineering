package androidx.camera.core.impl;

import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface r0 {

    /* loaded from: classes.dex */
    public interface a {
        void a(r0 r0Var);
    }

    androidx.camera.core.g0 b();

    void c();

    void close();

    int d();

    void e(a aVar, Executor executor);

    androidx.camera.core.g0 f();

    int getHeight();

    Surface getSurface();

    int getWidth();
}