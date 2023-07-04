package freemarker.template;

import freemarker.core.d;
import freemarker.core.k;
import freemarker.core.o;
import freemarker.core.q;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public class TemplateException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final transient freemarker.core.c f27013a;

    /* renamed from: b  reason: collision with root package name */
    private final transient d f27014b;

    /* renamed from: c  reason: collision with root package name */
    private transient k[] f27015c;

    /* renamed from: d  reason: collision with root package name */
    private String f27016d;

    /* renamed from: e  reason: collision with root package name */
    private String f27017e;

    /* renamed from: f  reason: collision with root package name */
    private String f27018f;

    /* renamed from: g  reason: collision with root package name */
    private transient String f27019g;

    /* renamed from: h  reason: collision with root package name */
    private transient String f27020h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f27021i;

    /* renamed from: j  reason: collision with root package name */
    private transient Object f27022j;

    /* renamed from: k  reason: collision with root package name */
    private transient ThreadLocal f27023k;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final PrintStream f27024a;

        a(PrintStream printStream) {
            this.f27024a = printStream;
        }

        @Override // freemarker.template.TemplateException.c
        public void a(Throwable th2) {
            if (th2 instanceof TemplateException) {
                ((TemplateException) th2).i(this.f27024a);
            } else {
                th2.printStackTrace(this.f27024a);
            }
        }

        @Override // freemarker.template.TemplateException.c
        public void b() {
            this.f27024a.println();
        }

        @Override // freemarker.template.TemplateException.c
        public void c(Object obj) {
            this.f27024a.print(obj);
        }

        @Override // freemarker.template.TemplateException.c
        public void d(Object obj) {
            this.f27024a.println(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final PrintWriter f27025a;

        b(PrintWriter printWriter) {
            this.f27025a = printWriter;
        }

        @Override // freemarker.template.TemplateException.c
        public void a(Throwable th2) {
            if (th2 instanceof TemplateException) {
                ((TemplateException) th2).j(this.f27025a);
            } else {
                th2.printStackTrace(this.f27025a);
            }
        }

        @Override // freemarker.template.TemplateException.c
        public void b() {
            this.f27025a.println();
        }

        @Override // freemarker.template.TemplateException.c
        public void c(Object obj) {
            this.f27025a.print(obj);
        }

        @Override // freemarker.template.TemplateException.c
        public void d(Object obj) {
            this.f27025a.println(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public interface c {
        void a(Throwable th2);

        void b();

        void c(Object obj);

        void d(Object obj);
    }

    public TemplateException(String str, freemarker.core.c cVar) {
        this(str, null, cVar);
    }

    private void a() {
        if (this.f27016d == null || this.f27017e == null) {
            return;
        }
        if (this.f27021i || this.f27014b != null) {
            this.f27015c = null;
        }
    }

    private String b() {
        String str;
        synchronized (this.f27022j) {
            str = this.f27018f;
        }
        return str;
    }

    private String d() {
        String stringWriter;
        synchronized (this.f27022j) {
            k[] kVarArr = this.f27015c;
            if (kVarArr == null && this.f27017e == null) {
                return null;
            }
            if (this.f27017e == null) {
                if (kVarArr.length == 0) {
                    stringWriter = "";
                } else {
                    StringWriter stringWriter2 = new StringWriter();
                    o.b(this.f27015c, true, stringWriter2);
                    stringWriter = stringWriter2.toString();
                }
                if (this.f27017e == null) {
                    this.f27017e = stringWriter;
                    a();
                }
            }
            return this.f27017e.length() != 0 ? this.f27017e : null;
        }
    }

    private void f(c cVar, boolean z11, boolean z12, boolean z13) {
        synchronized (cVar) {
            if (z11) {
                try {
                    cVar.d("FreeMarker template error:");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z12) {
                String c11 = c();
                if (c11 != null) {
                    cVar.d(e());
                    cVar.b();
                    cVar.d("----");
                    cVar.d("FTL stack trace (\"~\" means nesting-related):");
                    cVar.c(c11);
                    cVar.d("----");
                } else {
                    z12 = false;
                    z13 = true;
                }
            }
            if (z13) {
                if (z12) {
                    cVar.b();
                    cVar.d("Java stack trace (for programmers):");
                    cVar.d("----");
                    synchronized (this.f27022j) {
                        if (this.f27023k == null) {
                            this.f27023k = new ThreadLocal();
                        }
                        this.f27023k.set(Boolean.TRUE);
                    }
                    cVar.a(this);
                    this.f27023k.set(Boolean.FALSE);
                } else {
                    cVar.a(this);
                }
                if (getCause() != null && getCause().getCause() == null) {
                    try {
                        Throwable th3 = (Throwable) getCause().getClass().getMethod("getRootCause", jx.b.f34011b).invoke(getCause(), jx.b.f34010a);
                        if (th3 != null) {
                            cVar.d("ServletException root cause: ");
                            cVar.a(th3);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    private void k() {
        String b11 = b();
        if (b11 != null && b11.length() != 0) {
            this.f27019g = b11;
        } else if (getCause() != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("No error description was specified for this error; low-level message: ");
            stringBuffer.append(getCause().getClass().getName());
            stringBuffer.append(": ");
            stringBuffer.append(getCause().getMessage());
            this.f27019g = stringBuffer.toString();
        } else {
            this.f27019g = "[No error description was available.]";
        }
        String d11 = d();
        if (d11 != null) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(this.f27019g);
            stringBuffer2.append("\n\n");
            stringBuffer2.append("----");
            stringBuffer2.append("\n");
            stringBuffer2.append("FTL stack trace (\"~\" means nesting-related):");
            stringBuffer2.append("\n");
            stringBuffer2.append(d11);
            stringBuffer2.append("----");
            String stringBuffer3 = stringBuffer2.toString();
            this.f27020h = stringBuffer3;
            this.f27019g = stringBuffer3.substring(0, this.f27019g.length());
            return;
        }
        this.f27020h = this.f27019g;
    }

    public String c() {
        synchronized (this.f27022j) {
            if (this.f27015c == null && this.f27016d == null) {
                return null;
            }
            if (this.f27016d == null) {
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                o.b(this.f27015c, false, printWriter);
                printWriter.close();
                if (this.f27016d == null) {
                    this.f27016d = stringWriter.toString();
                    a();
                }
            }
            return this.f27016d;
        }
    }

    public String e() {
        String str;
        synchronized (this.f27022j) {
            if (this.f27019g == null) {
                k();
            }
            str = this.f27019g;
        }
        return str;
    }

    public void g(PrintStream printStream, boolean z11, boolean z12, boolean z13) {
        synchronized (printStream) {
            f(new a(printStream), z11, z12, z13);
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        ThreadLocal threadLocal = this.f27023k;
        if (threadLocal == null || threadLocal.get() != Boolean.TRUE) {
            synchronized (this.f27022j) {
                if (this.f27020h == null) {
                    k();
                }
                str = this.f27020h;
            }
            return str;
        }
        return "[... Exception message was already printed; see it above ...]";
    }

    public void h(PrintWriter printWriter, boolean z11, boolean z12, boolean z13) {
        synchronized (printWriter) {
            f(new b(printWriter), z11, z12, z13);
        }
    }

    public void i(PrintStream printStream) {
        super.printStackTrace(printStream);
    }

    public void j(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        g(printStream, true, true, true);
    }

    public TemplateException(String str, Exception exc, freemarker.core.c cVar) {
        this(str, exc, cVar, null, null);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter, true, true, true);
    }

    private TemplateException(String str, Throwable th2, freemarker.core.c cVar, d dVar, q qVar) {
        super(th2);
        this.f27022j = new Object();
        cVar = cVar == null ? freemarker.core.c.c() : cVar;
        this.f27013a = cVar;
        this.f27014b = dVar;
        this.f27018f = str;
        if (cVar != null) {
            this.f27015c = o.a(cVar);
        }
    }
}