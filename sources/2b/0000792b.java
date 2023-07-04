package io.sentry.android.core;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class z extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final Thread f32179a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(String str, Thread thread) {
        super(str);
        Thread thread2 = (Thread) rz.j.a(thread, "Thread must be provided.");
        this.f32179a = thread2;
        setStackTrace(thread2.getStackTrace());
    }

    public Thread a() {
        return this.f32179a;
    }
}