package org.aspectj.lang;

import ch.qos.logback.core.CoreConstants;
import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes5.dex */
public class SoftException extends RuntimeException {

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f43008b;

    /* renamed from: a  reason: collision with root package name */
    Throwable f43009a;

    static {
        boolean z11;
        try {
            Class.forName("java.nio.Buffer");
            z11 = true;
        } catch (Throwable unused) {
            z11 = false;
        }
        f43008b = z11;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f43009a;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        Throwable th2 = this.f43009a;
        if (f43008b || th2 == null) {
            return;
        }
        printStream.print(CoreConstants.CAUSED_BY);
        th2.printStackTrace(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        Throwable th2 = this.f43009a;
        if (f43008b || th2 == null) {
            return;
        }
        printWriter.print(CoreConstants.CAUSED_BY);
        th2.printStackTrace(printWriter);
    }
}