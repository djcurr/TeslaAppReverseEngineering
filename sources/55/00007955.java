package io.sentry.exception;

import io.sentry.protocol.h;
import org.jetbrains.annotations.ApiStatus;
import rz.j;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class ExceptionMechanismException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final h f32254a;

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f32255b;

    /* renamed from: c  reason: collision with root package name */
    private final Thread f32256c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f32257d;

    public ExceptionMechanismException(h hVar, Throwable th2, Thread thread, boolean z11) {
        this.f32254a = (h) j.a(hVar, "Mechanism is required.");
        this.f32255b = (Throwable) j.a(th2, "Throwable is required.");
        this.f32256c = (Thread) j.a(thread, "Thread is required.");
        this.f32257d = z11;
    }

    public h a() {
        return this.f32254a;
    }

    public Thread b() {
        return this.f32256c;
    }

    public Throwable c() {
        return this.f32255b;
    }

    public boolean d() {
        return this.f32257d;
    }

    public ExceptionMechanismException(h hVar, Throwable th2, Thread thread) {
        this(hVar, th2, thread, false);
    }
}