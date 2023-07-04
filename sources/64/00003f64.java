package com.oney.WebRTCModule;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
final class p {

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService f18075a = Executors.newSingleThreadExecutor();

    public static void a(Runnable runnable) {
        f18075a.execute(runnable);
    }

    public static Future<?> b(Runnable runnable) {
        return f18075a.submit(runnable);
    }

    public static <T> Future<T> c(Callable<T> callable) {
        return f18075a.submit(callable);
    }
}