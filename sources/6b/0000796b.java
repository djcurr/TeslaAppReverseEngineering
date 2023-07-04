package io.sentry;

import java.lang.Thread;

/* loaded from: classes5.dex */
interface g4 {

    /* loaded from: classes5.dex */
    public static final class a implements g4 {

        /* renamed from: a  reason: collision with root package name */
        private static final a f32269a = new a();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static g4 c() {
            return f32269a;
        }

        @Override // io.sentry.g4
        public void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }

        @Override // io.sentry.g4
        public Thread.UncaughtExceptionHandler b() {
            return Thread.getDefaultUncaughtExceptionHandler();
        }
    }

    void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    Thread.UncaughtExceptionHandler b();
}