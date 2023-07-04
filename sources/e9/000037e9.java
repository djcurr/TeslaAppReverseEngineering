package com.google.common.util.concurrent;

import java.lang.Thread;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private String f16211a = null;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f16212b = null;

    /* renamed from: c  reason: collision with root package name */
    private Integer f16213c = null;

    /* renamed from: d  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f16214d = null;

    /* renamed from: e  reason: collision with root package name */
    private ThreadFactory f16215e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ThreadFactory f16216a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f16217b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AtomicLong f16218c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Boolean f16219d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Integer f16220e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f16221f;

        a(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f16216a = threadFactory;
            this.f16217b = str;
            this.f16218c = atomicLong;
            this.f16219d = bool;
            this.f16220e = num;
            this.f16221f = uncaughtExceptionHandler;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f16216a.newThread(runnable);
            String str = this.f16217b;
            if (str != null) {
                AtomicLong atomicLong = this.f16218c;
                Objects.requireNonNull(atomicLong);
                newThread.setName(h.d(str, Long.valueOf(atomicLong.getAndIncrement())));
            }
            Boolean bool = this.f16219d;
            if (bool != null) {
                newThread.setDaemon(bool.booleanValue());
            }
            Integer num = this.f16220e;
            if (num != null) {
                newThread.setPriority(num.intValue());
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f16221f;
            if (uncaughtExceptionHandler != null) {
                newThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
            }
            return newThread;
        }
    }

    private static ThreadFactory c(h hVar) {
        String str = hVar.f16211a;
        Boolean bool = hVar.f16212b;
        Integer num = hVar.f16213c;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = hVar.f16214d;
        ThreadFactory threadFactory = hVar.f16215e;
        if (threadFactory == null) {
            threadFactory = Executors.defaultThreadFactory();
        }
        return new a(threadFactory, str, str != null ? new AtomicLong(0L) : null, bool, num, uncaughtExceptionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public ThreadFactory b() {
        return c(this);
    }

    public h e(boolean z11) {
        this.f16212b = Boolean.valueOf(z11);
        return this;
    }

    public h f(String str) {
        d(str, 0);
        this.f16211a = str;
        return this;
    }
}