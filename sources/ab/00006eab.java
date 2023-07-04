package freemarker.core;

import java.io.IOException;

/* loaded from: classes5.dex */
public class ParseException extends IOException {

    /* renamed from: h  reason: collision with root package name */
    private static volatile Boolean f26855h;

    /* renamed from: i  reason: collision with root package name */
    static /* synthetic */ Class f26856i;

    /* renamed from: a  reason: collision with root package name */
    private boolean f26857a;

    /* renamed from: b  reason: collision with root package name */
    private String f26858b;

    /* renamed from: c  reason: collision with root package name */
    private String f26859c;

    /* renamed from: d  reason: collision with root package name */
    public int f26860d;

    /* renamed from: e  reason: collision with root package name */
    public int f26861e;

    /* renamed from: f  reason: collision with root package name */
    protected String f26862f = jx.d.a("line.separator", "\n");

    /* renamed from: g  reason: collision with root package name */
    private String f26863g;

    protected ParseException() {
    }

    static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    private String b() {
        synchronized (this) {
            String str = this.f26859c;
            if (str != null) {
                return str;
            }
            return null;
        }
    }

    private boolean c() {
        if (f26855h == null) {
            try {
                Class cls = f26856i;
                if (cls == null) {
                    cls = a("freemarker.core.ParseException");
                    f26856i = cls;
                }
                f26855h = Boolean.valueOf(cls.getClassLoader().toString().indexOf("[org.jboss.ide.eclipse.freemarker:") != -1);
            } catch (Throwable unused) {
                f26855h = Boolean.FALSE;
            }
        }
        return f26855h.booleanValue();
    }

    private void d() {
        String stringBuffer;
        String b11 = b();
        if (!c()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Syntax error ");
            stringBuffer2.append(f.g(this.f26863g, this.f26861e, this.f26860d));
            stringBuffer2.append(":\n");
            stringBuffer = stringBuffer2.toString();
        } else {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("[col. ");
            stringBuffer3.append(this.f26860d);
            stringBuffer3.append("] ");
            stringBuffer = stringBuffer3.toString();
        }
        StringBuffer stringBuffer4 = new StringBuffer();
        stringBuffer4.append(stringBuffer);
        stringBuffer4.append(b11);
        String stringBuffer5 = stringBuffer4.toString();
        String substring = stringBuffer5.substring(stringBuffer.length());
        synchronized (this) {
            this.f26858b = stringBuffer5;
            this.f26859c = substring;
            this.f26857a = true;
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        synchronized (this) {
            if (this.f26857a) {
                return this.f26858b;
            }
            d();
            synchronized (this) {
                str = this.f26858b;
            }
            return str;
        }
    }
}