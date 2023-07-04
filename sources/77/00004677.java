package com.plaid.internal;

import com.plaid.BuildConfig;
import com.plaid.internal.wa;
import com.plaid.internal.z8;
import java.lang.Thread;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class z8 {

    /* renamed from: a  reason: collision with root package name */
    public final j2 f19961a;

    /* renamed from: b  reason: collision with root package name */
    public final q2 f19962b;

    /* renamed from: c  reason: collision with root package name */
    public final h2 f19963c;

    public z8(j2 crashReportFactory, q2 crashWorkManager, h2 interceptor) {
        kotlin.jvm.internal.s.g(crashReportFactory, "crashReportFactory");
        kotlin.jvm.internal.s.g(crashWorkManager, "crashWorkManager");
        kotlin.jvm.internal.s.g(interceptor, "interceptor");
        this.f19961a = crashReportFactory;
        this.f19962b = crashWorkManager;
        this.f19963c = interceptor;
    }

    public final void a() {
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: qq.r0
            {
                z8.this = this;
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th2) {
                z8.a(z8.this, defaultUncaughtExceptionHandler, thread, th2);
            }
        });
    }

    public static final void a(z8 this$0, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread paramThread, Throwable paramThrowable) {
        boolean z11;
        boolean M;
        boolean M2;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.f(paramThread, "paramThread");
        kotlin.jvm.internal.s.f(paramThrowable, "paramThrowable");
        this$0.getClass();
        kotlin.jvm.internal.s.g(paramThread, "paramThread");
        kotlin.jvm.internal.s.g(paramThrowable, "paramThrowable");
        Throwable cause = paramThrowable.getCause();
        if (cause != null) {
            StackTraceElement[] stackTrace = cause.getStackTrace();
            kotlin.jvm.internal.s.f(stackTrace, "cause.stackTrace");
            int length = stackTrace.length;
            int i11 = 0;
            while (i11 < length) {
                StackTraceElement stackTraceElement = stackTrace[i11];
                i11++;
                String className = stackTraceElement.getClassName();
                kotlin.jvm.internal.s.f(className, "element.className");
                Locale US = Locale.US;
                kotlin.jvm.internal.s.f(US, "US");
                String lowerCase = className.toLowerCase(US);
                kotlin.jvm.internal.s.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                M2 = kotlin.text.w.M(lowerCase, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null);
                if (M2) {
                    break;
                }
            }
        }
        StackTraceElement[] stackTrace2 = paramThrowable.getStackTrace();
        kotlin.jvm.internal.s.f(stackTrace2, "throwable.stackTrace");
        int length2 = stackTrace2.length;
        int i12 = 0;
        while (i12 < length2) {
            StackTraceElement stackTraceElement2 = stackTrace2[i12];
            i12++;
            String className2 = stackTraceElement2.getClassName();
            kotlin.jvm.internal.s.f(className2, "element.className");
            Locale US2 = Locale.US;
            kotlin.jvm.internal.s.f(US2, "US");
            String lowerCase2 = className2.toLowerCase(US2);
            kotlin.jvm.internal.s.f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            M = kotlin.text.w.M(lowerCase2, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null);
            if (M) {
                z11 = true;
            }
        }
        z11 = false;
        if (z11) {
            try {
                v20.j.b(null, new y8(this$0, paramThrowable, null), 1, null);
                if (this$0.f19963c.a(paramThrowable)) {
                    return;
                }
                this$0.a(uncaughtExceptionHandler, paramThread, paramThrowable);
                return;
            } catch (Exception e11) {
                wa.a.a(wa.f19678a, (Throwable) e11, false, 2);
                this$0.a(uncaughtExceptionHandler, paramThread, paramThrowable);
                return;
            }
        }
        this$0.a(uncaughtExceptionHandler, paramThread, paramThrowable);
    }

    public final void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th2) {
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        } else {
            System.exit(2);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }
}