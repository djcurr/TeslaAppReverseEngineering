package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public static String f10306a = "Volley";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f10307b = Log.isLoggable("Volley", 2);

    /* renamed from: c  reason: collision with root package name */
    private static final String f10308c = n.class.getName();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final boolean f10309c = n.f10307b;

        /* renamed from: a  reason: collision with root package name */
        private final List<C0197a> f10310a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private boolean f10311b = false;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.android.volley.n$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0197a {

            /* renamed from: a  reason: collision with root package name */
            public final String f10312a;

            /* renamed from: b  reason: collision with root package name */
            public final long f10313b;

            /* renamed from: c  reason: collision with root package name */
            public final long f10314c;

            public C0197a(String str, long j11, long j12) {
                this.f10312a = str;
                this.f10313b = j11;
                this.f10314c = j12;
            }
        }

        private long c() {
            if (this.f10310a.size() == 0) {
                return 0L;
            }
            long j11 = this.f10310a.get(0).f10314c;
            List<C0197a> list = this.f10310a;
            return list.get(list.size() - 1).f10314c - j11;
        }

        public synchronized void a(String str, long j11) {
            if (!this.f10311b) {
                this.f10310a.add(new C0197a(str, j11, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        public synchronized void b(String str) {
            this.f10311b = true;
            long c11 = c();
            if (c11 <= 0) {
                return;
            }
            long j11 = this.f10310a.get(0).f10314c;
            n.b("(%-4d ms) %s", Long.valueOf(c11), str);
            for (C0197a c0197a : this.f10310a) {
                long j12 = c0197a.f10314c;
                n.b("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(c0197a.f10313b), c0197a.f10312a);
                j11 = j12;
            }
        }

        protected void finalize() {
            if (this.f10311b) {
                return;
            }
            b("Request on the loose");
            n.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }

    private static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i11 = 2;
        while (true) {
            if (i11 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i11].getClassName().equals(f10308c)) {
                String className = stackTrace[i11].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i11].getMethodName();
                break;
            } else {
                i11++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    public static void b(String str, Object... objArr) {
        Log.d(f10306a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f10306a, a(str, objArr));
    }

    public static void d(Throwable th2, String str, Object... objArr) {
        Log.e(f10306a, a(str, objArr), th2);
    }

    public static void e(String str, Object... objArr) {
        if (f10307b) {
            Log.v(f10306a, a(str, objArr));
        }
    }

    public static void f(String str, Object... objArr) {
        Log.wtf(f10306a, a(str, objArr));
    }
}