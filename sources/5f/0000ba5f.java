package vy;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
final class c implements Future<Object> {

    /* renamed from: a  reason: collision with root package name */
    final iy.b f54667a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(iy.b bVar) {
        this.f54667a = bVar;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        this.f54667a.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j11, TimeUnit timeUnit) {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }
}