package io.reactivex.exceptions;

import ch.qos.logback.classic.net.SyslogAppender;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class CompositeException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final List<Throwable> f31720a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31721b;

    /* renamed from: c  reason: collision with root package name */
    private Throwable f31722c;

    /* loaded from: classes5.dex */
    static final class a extends RuntimeException {
        a() {
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static abstract class b {
        b() {
        }

        abstract void a(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        private final PrintStream f31723a;

        c(PrintStream printStream) {
            this.f31723a = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.b
        void a(Object obj) {
            this.f31723a.println(obj);
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        private final PrintWriter f31724a;

        d(PrintWriter printWriter) {
            this.f31724a = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.b
        void a(Object obj) {
            this.f31724a.println(obj);
        }
    }

    private void a(StringBuilder sb2, Throwable th2, String str) {
        StackTraceElement[] stackTrace;
        sb2.append(str);
        sb2.append(th2);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
            sb2.append("\t\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        if (th2.getCause() != null) {
            sb2.append("\tCaused by: ");
            a(sb2, th2.getCause(), "");
        }
    }

    private List<Throwable> b(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th2.getCause();
        if (cause != null && cause != th2) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    private void d(b bVar) {
        StackTraceElement[] stackTrace;
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(this);
        sb2.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb2.append("\tat ");
            sb2.append(stackTraceElement);
            sb2.append('\n');
        }
        int i11 = 1;
        for (Throwable th2 : this.f31720a) {
            sb2.append("  ComposedException ");
            sb2.append(i11);
            sb2.append(" :\n");
            a(sb2, th2, SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
            i11++;
        }
        bVar.a(sb2.toString());
    }

    Throwable c(Throwable th2) {
        Throwable cause = th2.getCause();
        if (cause == null || this.f31722c == cause) {
            return th2;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                break;
            }
            cause = cause2;
        }
        return cause;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        if (this.f31722c == null) {
            a aVar = new a();
            HashSet hashSet = new HashSet();
            Iterator<Throwable> it2 = this.f31720a.iterator();
            a aVar2 = aVar;
            while (it2.hasNext()) {
                Throwable next = it2.next();
                if (!hashSet.contains(next)) {
                    hashSet.add(next);
                    for (Throwable th2 : b(next)) {
                        if (hashSet.contains(th2)) {
                            next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th2);
                        }
                    }
                    try {
                        aVar2.initCause(next);
                    } catch (Throwable unused) {
                    }
                    aVar2 = c(aVar2);
                }
            }
            this.f31722c = aVar;
        }
        return this.f31722c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f31721b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        d(new c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        d(new d(printWriter));
    }
}