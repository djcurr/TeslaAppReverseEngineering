package io.sentry.android.core;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes5.dex */
final class j0 {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f32100a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0() {
        this(Looper.getMainLooper());
    }

    public Thread a() {
        return this.f32100a.getLooper().getThread();
    }

    public void b(Runnable runnable) {
        this.f32100a.post(runnable);
    }

    j0(Looper looper) {
        this.f32100a = new Handler(looper);
    }
}