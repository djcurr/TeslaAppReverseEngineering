package io.grpc.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class c1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f30750b = Logger.getLogger(c1.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f30751a;

    public c1(Runnable runnable) {
        this.f30751a = (Runnable) com.google.common.base.u.p(runnable, "task");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f30751a.run();
        } catch (Throwable th2) {
            Logger logger = f30750b;
            Level level = Level.SEVERE;
            logger.log(level, "Exception while executing runnable " + this.f30751a, th2);
            com.google.common.base.b0.f(th2);
            throw new AssertionError(th2);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.f30751a + ")";
    }
}