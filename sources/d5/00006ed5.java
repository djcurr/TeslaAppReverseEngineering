package freemarker.ext.beans;

import expo.modules.interfaces.permissions.PermissionsResponse;
import freemarker.template.utility.UndeclaredThrowableException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public class i implements ix.h, ix.g {

    /* renamed from: l */
    private static final hx.b f26920l = hx.b.i("freemarker.beans");

    /* renamed from: m */
    static final Object f26921m = ix.h.f32829b;

    /* renamed from: n */
    private static final Constructor f26922n;

    /* renamed from: o */
    private static volatile boolean f26923o;

    /* renamed from: p */
    static /* synthetic */ Class f26924p;

    /* renamed from: q */
    static /* synthetic */ Class f26925q;

    /* renamed from: r */
    static /* synthetic */ Class f26926r;

    /* renamed from: s */
    static /* synthetic */ Class f26927s;

    /* renamed from: t */
    static /* synthetic */ Class f26928t;

    /* renamed from: u */
    static /* synthetic */ Class f26929u;

    /* renamed from: c */
    private final Object f26930c;

    /* renamed from: d */
    private p f26931d;

    /* renamed from: e */
    private final b0 f26932e;

    /* renamed from: f */
    private final n f26933f;

    /* renamed from: g */
    private final gx.e f26934g;

    /* renamed from: h */
    private volatile boolean f26935h;

    /* renamed from: i */
    private ix.g f26936i;

    /* renamed from: j */
    private boolean f26937j;

    /* renamed from: k */
    private final ix.p f26938k;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private PropertyDescriptor f26939a;

        /* renamed from: b */
        private String f26940b;

        /* renamed from: c */
        private boolean f26941c;

        public PropertyDescriptor a() {
            return this.f26939a;
        }

        public String b() {
            return this.f26940b;
        }

        public boolean c() {
            return this.f26941c;
        }

        public void d(Method method) {
            this.f26939a = null;
            this.f26940b = method.getName();
            this.f26941c = true;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private Method f26942a;

        /* renamed from: b */
        private Class f26943b;

        public Class a() {
            return this.f26943b;
        }

        public Method b() {
            return this.f26942a;
        }

        public void c(Class cls) {
            this.f26943b = cls;
        }

        public void d(Method method) {
            this.f26942a = method;
        }
    }

    static {
        try {
            Class.forName("java.lang.Iterable");
        } catch (ClassNotFoundException unused) {
        }
        f26922n = d();
        new g();
        new h();
    }

    public i() {
        this(ix.a.E);
    }

    static /* synthetic */ Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    private static n c(i iVar) {
        Constructor constructor = f26922n;
        if (constructor != null) {
            try {
                return (n) constructor.newInstance(iVar);
            } catch (Exception e11) {
                throw new UndeclaredThrowableException(e11);
            }
        }
        return null;
    }

    private static Constructor d() {
        try {
            Class[] clsArr = new Class[1];
            Class cls = f26925q;
            if (cls == null) {
                cls = b("freemarker.ext.beans.BeansWrapper");
                f26925q = cls;
            }
            clsArr[0] = cls;
            return f0.class.getDeclaredConstructor(clsArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final i h() {
        return k.f26951a;
    }

    public static boolean j(ix.p pVar) {
        return pVar.c() >= ix.q.f32844b;
    }

    public static ix.p l(ix.p pVar) {
        ix.q.a(pVar);
        if (pVar.c() >= ix.q.f32843a) {
            return j(pVar) ? ix.a.A : ix.a.f32816x;
        }
        throw new IllegalArgumentException("Version must be at least 2.3.0.");
    }

    private void m() {
        b0 b0Var = this.f26932e;
        if (b0Var != null) {
            this.f26931d.u(b0Var);
        }
        n nVar = this.f26933f;
        if (nVar != null) {
            this.f26931d.u(nVar);
        }
        gx.e eVar = this.f26934g;
        if (eVar != null) {
            this.f26931d.v(eVar);
        }
    }

    protected void a() {
        if (this.f26935h) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Can't modify the ");
            stringBuffer.append(getClass().getName());
            stringBuffer.append(" object, as it was write protected.");
            throw new IllegalStateException(stringBuffer.toString());
        }
    }

    public void e(boolean z11) {
        if (z11) {
            p();
        }
        m();
    }

    public void f(Class cls, Method method, a aVar) {
    }

    public p g() {
        return this.f26931d;
    }

    public Object i() {
        return this.f26930c;
    }

    public boolean k() {
        return this.f26935h;
    }

    public void n(boolean z11) {
        a();
        this.f26934g.b(z11);
    }

    public String o() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("simpleMapWrapper=");
        stringBuffer.append(this.f26937j);
        stringBuffer.append(", ");
        stringBuffer.append("exposureLevel=");
        stringBuffer.append(this.f26931d.n());
        stringBuffer.append(", ");
        stringBuffer.append("exposeFields=");
        stringBuffer.append(this.f26931d.m());
        stringBuffer.append(", ");
        stringBuffer.append("sharedClassIntrospCache=");
        if (this.f26931d.s()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("@");
            stringBuffer2.append(System.identityHashCode(this.f26931d));
            str = stringBuffer2.toString();
        } else {
            str = PermissionsResponse.SCOPE_NONE;
        }
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public void p() {
        this.f26935h = true;
    }

    public String toString() {
        String str;
        String o11 = o();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(jx.a.e(this));
        stringBuffer.append("@");
        stringBuffer.append(System.identityHashCode(this));
        stringBuffer.append("(");
        stringBuffer.append(this.f26938k);
        stringBuffer.append(", ");
        if (o11.length() != 0) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(o11);
            stringBuffer2.append(", ...");
            str = stringBuffer2.toString();
        } else {
            str = "";
        }
        stringBuffer.append(str);
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    public i(ix.p pVar) {
        this(new d(pVar), false);
    }

    protected i(j jVar, boolean z11) {
        this(jVar, z11, true);
    }

    public i(j jVar, boolean z11, boolean z12) {
        boolean z13;
        new f(this);
        if (jVar.d() == null) {
            Class<?> cls = getClass();
            boolean z14 = false;
            while (!z14) {
                try {
                    Class<?> cls2 = f26924p;
                    if (cls2 == null) {
                        cls2 = b("freemarker.template.DefaultObjectWrapper");
                        f26924p = cls2;
                    }
                    if (cls != cls2) {
                        Class<?> cls3 = f26925q;
                        if (cls3 == null) {
                            cls3 = b("freemarker.ext.beans.BeansWrapper");
                            f26925q = cls3;
                        }
                        if (cls != cls3) {
                            Class<?> cls4 = f26926r;
                            if (cls4 == null) {
                                cls4 = b("freemarker.template.SimpleObjectWrapper");
                                f26926r = cls4;
                            }
                            if (cls == cls4) {
                                break;
                            }
                            try {
                                Class<?>[] clsArr = new Class[3];
                                Class<?> cls5 = f26927s;
                                if (cls5 == null) {
                                    cls5 = b("java.lang.Class");
                                    f26927s = cls5;
                                }
                                clsArr[0] = cls5;
                                Class<?> cls6 = f26928t;
                                if (cls6 == null) {
                                    cls6 = b("java.lang.reflect.Method");
                                    f26928t = cls6;
                                }
                                clsArr[1] = cls6;
                                Class<?> cls7 = f26929u;
                                if (cls7 == null) {
                                    cls7 = b("freemarker.ext.beans.BeansWrapper$MethodAppearanceDecision");
                                    f26929u = cls7;
                                }
                                clsArr[2] = cls7;
                                cls.getDeclaredMethod("finetuneMethodAppearance", clsArr);
                                z14 = true;
                            } catch (NoSuchMethodException unused) {
                                cls = cls.getSuperclass();
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    hx.b bVar = f26920l;
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Failed to check if finetuneMethodAppearance is overidden in ");
                    stringBuffer.append(cls.getName());
                    stringBuffer.append("; acting like if it was, but this way it won't utilize the shared class introspection ");
                    stringBuffer.append("cache.");
                    bVar.m(stringBuffer.toString(), th2);
                    z13 = true;
                    z14 = true;
                }
            }
            z13 = false;
            if (z14) {
                if (!z13 && !f26923o) {
                    hx.b bVar2 = f26920l;
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Overriding ");
                    Class cls8 = f26925q;
                    if (cls8 == null) {
                        cls8 = b("freemarker.ext.beans.BeansWrapper");
                        f26925q = cls8;
                    }
                    stringBuffer2.append(cls8.getName());
                    stringBuffer2.append(".finetuneMethodAppearance is deprecated ");
                    stringBuffer2.append("and will be banned sometimes in the future. Use setMethodAppearanceFineTuner instead.");
                    bVar2.u(stringBuffer2.toString());
                    f26923o = true;
                }
                jVar = (j) jVar.a(false);
                jVar.i(new e(this));
            }
        }
        this.f26938k = jVar.c();
        this.f26937j = jVar.g();
        jVar.b();
        this.f26936i = jVar.e() != null ? jVar.e() : this;
        jVar.h();
        if (!z11) {
            Object obj = new Object();
            this.f26930c = obj;
            this.f26931d = new p(jVar.f26945b, obj);
        } else {
            p a11 = jVar.f26945b.a();
            this.f26931d = a11;
            this.f26930c = a11.q();
        }
        new l(Boolean.FALSE, this);
        new l(Boolean.TRUE, this);
        this.f26932e = new b0(this);
        this.f26933f = c(this);
        this.f26934g = new c(this);
        n(jVar.f());
        e(z11);
    }
}