package androidx.camera.core.impl;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface z0<T> {

    /* loaded from: classes.dex */
    public interface a<T> {
        void a(T t11);

        void onError(Throwable th2);
    }

    void a(Executor executor, a<T> aVar);

    void b(a<T> aVar);
}