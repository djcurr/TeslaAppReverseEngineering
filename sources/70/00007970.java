package io.sentry;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class h2 {

    /* renamed from: c  reason: collision with root package name */
    private static final h2 f32273c = new h2();

    /* renamed from: a  reason: collision with root package name */
    private boolean f32274a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f32275b = new Object();

    private h2() {
    }

    public static h2 a() {
        return f32273c;
    }

    public void b(boolean z11) {
        synchronized (this.f32275b) {
            if (!this.f32274a) {
                this.f32274a = true;
            }
        }
    }
}