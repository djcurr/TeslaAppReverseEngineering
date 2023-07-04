package hx;

import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.PrintStream;
import java.security.AccessControlException;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f29472a;

    /* renamed from: b  reason: collision with root package name */
    private static c f29473b;

    /* renamed from: c  reason: collision with root package name */
    private static String f29474c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map f29475d;

    /* renamed from: e  reason: collision with root package name */
    static /* synthetic */ Class f29476e;

    /* renamed from: f  reason: collision with root package name */
    static /* synthetic */ Class f29477f;

    static {
        String[] strArr = {null, "JUL", "org.apache.log.Logger", "Avalon", "org.apache.log4j.Logger", "Log4j", "org.apache.commons.logging.Log", "CommonsLogging", "org.slf4j.Logger", "SLF4J"};
        f29472a = strArr;
        if (strArr.length / 2 == 5) {
            f29474c = "";
            f29475d = new HashMap();
            return;
        }
        throw new AssertionError();
    }

    static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    private static c b(int i11) {
        if (i11 == -1) {
            int i12 = 5;
            int i13 = 5;
            while (i13 >= -1) {
                if (n(i13)) {
                    if (i13 == 3 && k()) {
                        i13 = i12;
                    }
                    try {
                        return c(i13);
                    } catch (ClassNotFoundException unused) {
                        continue;
                    } catch (Throwable th2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Unexpected error when initializing logging for \"");
                        stringBuffer.append(h(i13));
                        stringBuffer.append("\".");
                        p(stringBuffer.toString(), th2);
                    }
                }
                i13--;
            }
            r("Auto detecton couldn't set up any logger libraries; FreeMarker logging suppressed.");
            return new g();
        }
        return c(i11);
    }

    private static c c(int i11) {
        String g11 = g(i11);
        if (g11 == null) {
            if (i11 == 1) {
                return new d();
            }
            if (i11 == 0) {
                return new g();
            }
            throw new RuntimeException("Bug");
        }
        Class.forName(g11);
        String h11 = h(i11);
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("freemarker.log._");
            stringBuffer.append(h11);
            stringBuffer.append("LoggerFactory");
            return (c) Class.forName(stringBuffer.toString()).newInstance();
        } catch (Exception e11) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Unexpected error when creating logger factory for \"");
            stringBuffer2.append(h11);
            stringBuffer2.append("\".");
            throw new RuntimeException(stringBuffer2.toString(), e11);
        }
    }

    private static void d(boolean z11) {
        if (f29473b != null) {
            return;
        }
        Class cls = f29476e;
        if (cls == null) {
            cls = a("freemarker.log.Logger");
            f29476e = cls;
        }
        synchronized (cls) {
            if (f29473b != null) {
                return;
            }
            String j11 = j("org.freemarker.loggerLibrary");
            int i11 = -1;
            if (j11 != null) {
                String trim = j11.trim();
                boolean z12 = false;
                int i12 = -1;
                do {
                    if (trim.equalsIgnoreCase(h(i12))) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                    if (i12 > 5) {
                        break;
                    }
                } while (!z12);
                if (!z12) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Ignored invalid \"org.freemarker.loggerLibrary\" system property value: \"");
                    stringBuffer.append(trim);
                    stringBuffer.append("\"");
                    r(stringBuffer.toString());
                    if (z11) {
                        return;
                    }
                }
                if (z12) {
                    i11 = i12;
                }
            } else if (z11) {
                return;
            }
            s(i11);
        }
    }

    private static String g(int i11) {
        if (i11 == -1 || i11 == 0) {
            return null;
        }
        return f29472a[(i11 - 1) * 2];
    }

    private static String h(int i11) {
        return i11 == -1 ? "auto" : i11 == 0 ? PermissionsResponse.SCOPE_NONE : f29472a[((i11 - 1) * 2) + 1];
    }

    public static b i(String str) {
        b bVar;
        if (f29474c.length() != 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(f29474c);
            stringBuffer.append(str);
            str = stringBuffer.toString();
        }
        Map map = f29475d;
        synchronized (map) {
            bVar = (b) map.get(str);
            if (bVar == null) {
                d(false);
                bVar = f29473b.getLogger(str);
                map.put(str, bVar);
            }
        }
        return bVar;
    }

    private static String j(String str) {
        try {
            return (String) AccessController.doPrivileged(new a(str));
        } catch (AccessControlException unused) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Insufficient permissions to read system property \"");
            stringBuffer.append(str);
            stringBuffer.append("\".");
            r(stringBuffer.toString());
            return null;
        } catch (Throwable th2) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Failed to read system property \"");
            stringBuffer2.append(str);
            stringBuffer2.append("\".");
            p(stringBuffer2.toString(), th2);
            return null;
        }
    }

    private static boolean k() {
        try {
            Class.forName(g(3));
            Class.forName(g(5));
            try {
                Class.forName("org.apache.log4j.FileAppender");
                return false;
            } catch (ClassNotFoundException unused) {
                Class cls = e.f29479a;
                return ((Boolean) e.class.getMethod("test", new Class[0]).invoke(null, new Object[0])).booleanValue();
            }
        } catch (Throwable unused2) {
            return false;
        }
    }

    private static boolean n(int i11) {
        return (i11 == -1 || i11 == 0 || i11 == 5 || i11 == 4) ? false : true;
    }

    private static void p(String str, Throwable th2) {
        q(true, str, th2);
    }

    private static void q(boolean z11, String str, Throwable th2) {
        boolean z12;
        boolean z13;
        Class cls = f29476e;
        if (cls == null) {
            cls = a("freemarker.log.Logger");
            f29476e = cls;
        }
        synchronized (cls) {
            c cVar = f29473b;
            z12 = false;
            z13 = (cVar == null || (cVar instanceof g)) ? false : true;
        }
        if (z13) {
            try {
                b i11 = i("freemarker.logger");
                if (z11) {
                    i11.e(str);
                } else {
                    i11.u(str);
                }
            } catch (Throwable unused) {
            }
        }
        z12 = z13;
        if (z12) {
            return;
        }
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(z11 ? "ERROR" : "WARN");
        stringBuffer.append(" ");
        Class cls2 = f29477f;
        if (cls2 == null) {
            cls2 = a("freemarker.log.LoggerFactory");
            f29477f = cls2;
        }
        stringBuffer.append(cls2.getName());
        stringBuffer.append(": ");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
        if (th2 != null) {
            PrintStream printStream2 = System.err;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("\tException: ");
            stringBuffer2.append(t(th2));
            printStream2.println(stringBuffer2.toString());
            while (th2.getCause() != null) {
                th2 = th2.getCause();
                PrintStream printStream3 = System.err;
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("\tCaused by: ");
                stringBuffer3.append(t(th2));
                printStream3.println(stringBuffer3.toString());
            }
        }
    }

    private static void r(String str) {
        q(false, str, null);
    }

    private static synchronized void s(int i11) {
        synchronized (b.class) {
            f29473b = b(i11);
        }
    }

    private static String t(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return obj.toString();
        } catch (Throwable unused) {
            return obj.getClass().getName();
        }
    }

    public abstract void e(String str);

    public abstract void f(String str, Throwable th2);

    public abstract void l(String str);

    public abstract void m(String str, Throwable th2);

    public abstract boolean o();

    public abstract void u(String str);

    public abstract void v(String str, Throwable th2);
}