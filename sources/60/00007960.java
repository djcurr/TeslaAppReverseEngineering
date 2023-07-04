package io.sentry;

import java.util.concurrent.Future;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public interface g0 {
    void a(long j11);

    Future<?> b(Runnable runnable, long j11);

    Future<?> submit(Runnable runnable);
}