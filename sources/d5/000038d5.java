package com.google.firebase.crashlytics.internal.common;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
class p implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final a f16579a;

    /* renamed from: b  reason: collision with root package name */
    private final fm.e f16580b;

    /* renamed from: c  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f16581c;

    /* renamed from: d  reason: collision with root package name */
    private final wl.a f16582d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f16583e = new AtomicBoolean(false);

    /* loaded from: classes3.dex */
    interface a {
        void a(fm.e eVar, Thread thread, Throwable th2);
    }

    public p(a aVar, fm.e eVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, wl.a aVar2) {
        this.f16579a = aVar;
        this.f16580b = eVar;
        this.f16581c = uncaughtExceptionHandler;
        this.f16582d = aVar2;
    }

    private boolean b(Thread thread, Throwable th2) {
        if (thread == null) {
            wl.f.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th2 == null) {
            wl.f.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (this.f16582d.b()) {
            wl.f.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        return this.f16583e.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r2v3, types: [wl.f] */
    /* JADX WARN: Type inference failed for: r3v1, types: [wl.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        ?? r02 = "Completed exception processing. Invoking default exception handler.";
        this.f16583e.set(true);
        try {
            try {
                if (b(thread, th2)) {
                    this.f16579a.a(this.f16580b, thread, th2);
                } else {
                    wl.f.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e11) {
                wl.f.f().e("An error occurred in the uncaught exception handler", e11);
            }
        } finally {
            wl.f.f().b(r02);
            this.f16581c.uncaughtException(thread, th2);
            this.f16583e.set(false);
        }
    }
}