package n80;

import android.os.Build;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final c[] f40682a;

    /* renamed from: c  reason: collision with root package name */
    static volatile c[] f40684c;

    /* renamed from: b  reason: collision with root package name */
    private static final List<c> f40683b = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private static final c f40685d = new C0797a();

    /* renamed from: n80.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0797a extends c {
        C0797a() {
        }

        @Override // n80.a.c
        public void a(String str, Object... objArr) {
            for (c cVar : a.f40684c) {
                cVar.a(str, objArr);
            }
        }

        @Override // n80.a.c
        public void b(Throwable th2, String str, Object... objArr) {
            for (c cVar : a.f40684c) {
                cVar.b(th2, str, objArr);
            }
        }

        @Override // n80.a.c
        public void f(String str, Object... objArr) {
            for (c cVar : a.f40684c) {
                cVar.f(str, objArr);
            }
        }

        @Override // n80.a.c
        protected void i(int i11, String str, String str2, Throwable th2) {
            throw new AssertionError("Missing override for log method.");
        }

        @Override // n80.a.c
        public void k(String str, Object... objArr) {
            for (c cVar : a.f40684c) {
                cVar.k(str, objArr);
            }
        }

        @Override // n80.a.c
        public void l(String str, Object... objArr) {
            for (c cVar : a.f40684c) {
                cVar.l(str, objArr);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class b extends c {

        /* renamed from: b  reason: collision with root package name */
        private static final Pattern f40686b = Pattern.compile("(\\$\\d+)+$");

        @Override // n80.a.c
        final String e() {
            String e11 = super.e();
            if (e11 != null) {
                return e11;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length > 5) {
                return m(stackTrace[5]);
            }
            throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
        }

        protected String m(StackTraceElement stackTraceElement) {
            String className = stackTraceElement.getClassName();
            Matcher matcher = f40686b.matcher(className);
            if (matcher.find()) {
                className = matcher.replaceAll("");
            }
            String substring = className.substring(className.lastIndexOf(46) + 1);
            return (substring.length() <= 23 || Build.VERSION.SDK_INT >= 24) ? substring : substring.substring(0, 23);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final ThreadLocal<String> f40687a = new ThreadLocal<>();

        private String d(Throwable th2) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th2.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        private void j(int i11, Throwable th2, String str, Object... objArr) {
            String e11 = e();
            if (h(e11, i11)) {
                if (str != null && str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    if (objArr != null && objArr.length > 0) {
                        str = c(str, objArr);
                    }
                    if (th2 != null) {
                        str = str + "\n" + d(th2);
                    }
                } else if (th2 == null) {
                    return;
                } else {
                    str = d(th2);
                }
                i(i11, e11, str, th2);
            }
        }

        public void a(String str, Object... objArr) {
            j(6, null, str, objArr);
        }

        public void b(Throwable th2, String str, Object... objArr) {
            j(6, th2, str, objArr);
        }

        protected String c(String str, Object[] objArr) {
            return String.format(str, objArr);
        }

        String e() {
            String str = this.f40687a.get();
            if (str != null) {
                this.f40687a.remove();
            }
            return str;
        }

        public void f(String str, Object... objArr) {
            j(4, null, str, objArr);
        }

        @Deprecated
        protected boolean g(int i11) {
            return true;
        }

        protected boolean h(String str, int i11) {
            return g(i11);
        }

        protected abstract void i(int i11, String str, String str2, Throwable th2);

        public void k(String str, Object... objArr) {
            j(5, null, str, objArr);
        }

        public void l(String str, Object... objArr) {
            j(7, null, str, objArr);
        }
    }

    static {
        c[] cVarArr = new c[0];
        f40682a = cVarArr;
        f40684c = cVarArr;
    }

    public static void a(String str, Object... objArr) {
        f40685d.a(str, objArr);
    }

    public static void b(Throwable th2, String str, Object... objArr) {
        f40685d.b(th2, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        f40685d.f(str, objArr);
    }

    public static void d(c cVar) {
        Objects.requireNonNull(cVar, "tree == null");
        if (cVar != f40685d) {
            List<c> list = f40683b;
            synchronized (list) {
                list.add(cVar);
                f40684c = (c[]) list.toArray(new c[list.size()]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot plant Timber into itself.");
    }

    public static c e(String str) {
        for (c cVar : f40684c) {
            cVar.f40687a.set(str);
        }
        return f40685d;
    }

    public static void f(String str, Object... objArr) {
        f40685d.k(str, objArr);
    }

    public static void g(String str, Object... objArr) {
        f40685d.l(str, objArr);
    }
}