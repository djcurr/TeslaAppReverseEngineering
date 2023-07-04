package ex;

import freemarker.core.BugException;
import freemarker.template.utility.UndeclaredThrowableException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Method f25272a;

    /* renamed from: b  reason: collision with root package name */
    private static final Method f25273b;

    /* renamed from: c  reason: collision with root package name */
    static /* synthetic */ Class f25274c;

    /* renamed from: d  reason: collision with root package name */
    static /* synthetic */ Class f25275d;

    /* renamed from: e  reason: collision with root package name */
    static /* synthetic */ Class f25276e;

    /* renamed from: f  reason: collision with root package name */
    static /* synthetic */ Class f25277f;

    /* renamed from: g  reason: collision with root package name */
    static /* synthetic */ Class f25278g;

    /* renamed from: h  reason: collision with root package name */
    static /* synthetic */ Class f25279h;

    /* renamed from: i  reason: collision with root package name */
    static /* synthetic */ Class f25280i;

    /* renamed from: j  reason: collision with root package name */
    static /* synthetic */ Class f25281j;

    /* renamed from: k  reason: collision with root package name */
    static /* synthetic */ Class f25282k;

    static {
        Class cls = f25274c;
        if (cls == null) {
            cls = a("java.lang.reflect.Method");
            f25274c = cls;
        }
        f25272a = d(cls);
        Class cls2 = f25275d;
        if (cls2 == null) {
            cls2 = a("java.lang.reflect.Constructor");
            f25275d = cls2;
        }
        f25273b = d(cls2);
    }

    static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    private static void b(Class cls, Class cls2, Set set) {
        if (cls.isAssignableFrom(cls2)) {
            set.add(cls);
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            b(superclass, cls2, set);
        }
        for (Class<?> cls3 : cls.getInterfaces()) {
            b(cls3, cls2, set);
        }
    }

    public static Set c(Class cls, Class cls2) {
        HashSet hashSet = new HashSet();
        b(cls, cls2, hashSet);
        return hashSet;
    }

    private static Method d(Class cls) {
        try {
            return cls.getMethod("isVarArgs", null);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static int e(Class cls, Class cls2, boolean z11, int i11) {
        if (i11 >= 4) {
            return 0;
        }
        if (cls2.isAssignableFrom(cls)) {
            return cls2 == cls ? 1 : 4;
        }
        boolean isPrimitive = cls.isPrimitive();
        boolean isPrimitive2 = cls2.isPrimitive();
        if (!isPrimitive) {
            if (i11 < 3 && z11 && !isPrimitive2) {
                Class cls3 = f25276e;
                if (cls3 == null) {
                    cls3 = a("java.lang.Number");
                    f25276e = cls3;
                }
                if (cls3.isAssignableFrom(cls)) {
                    Class cls4 = f25276e;
                    if (cls4 == null) {
                        cls4 = a("java.lang.Number");
                        f25276e = cls4;
                    }
                    return (cls4.isAssignableFrom(cls2) && h(cls, cls2)) ? 3 : 0;
                }
                return 0;
            }
            return 0;
        } else if (isPrimitive2) {
            return (i11 < 3 && i(cls, cls2)) ? 3 : 0;
        } else if (z11) {
            Class<?> g11 = jx.a.g(cls);
            if (g11 == cls2) {
                return 2;
            }
            if (cls2.isAssignableFrom(g11)) {
                return 4;
            }
            if (i11 >= 3) {
                return 0;
            }
            Class cls5 = f25276e;
            if (cls5 == null) {
                cls5 = a("java.lang.Number");
                f25276e = cls5;
            }
            if (cls5.isAssignableFrom(g11)) {
                Class cls6 = f25276e;
                if (cls6 == null) {
                    cls6 = a("java.lang.Number");
                    f25276e = cls6;
                }
                return (cls6.isAssignableFrom(cls2) && h(g11, cls2)) ? 3 : 0;
            }
            return 0;
        } else {
            return 0;
        }
    }

    public static boolean f(Member member) {
        if (member instanceof Method) {
            return g(member, f25272a);
        }
        if (member instanceof Constructor) {
            return g(member, f25273b);
        }
        throw new BugException();
    }

    private static boolean g(Member member, Method method) {
        if (method == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(member, null)).booleanValue();
        } catch (Exception e11) {
            throw new UndeclaredThrowableException(e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        if (r7 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
        if (r7 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b4, code lost:
        if (r7 == r0) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean h(java.lang.Class r7, java.lang.Class r8) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ex.a.h(java.lang.Class, java.lang.Class):boolean");
    }

    private static boolean i(Class cls, Class cls2) {
        Class cls3 = Short.TYPE;
        if (cls2 == cls3 && cls == Byte.TYPE) {
            return true;
        }
        Class cls4 = Integer.TYPE;
        if (cls2 == cls4 && (cls == cls3 || cls == Byte.TYPE)) {
            return true;
        }
        Class cls5 = Long.TYPE;
        if (cls2 == cls5 && (cls == cls4 || cls == cls3 || cls == Byte.TYPE)) {
            return true;
        }
        Class cls6 = Float.TYPE;
        if (cls2 == cls6 && (cls == cls5 || cls == cls4 || cls == cls3 || cls == Byte.TYPE)) {
            return true;
        }
        if (cls2 == Double.TYPE) {
            return cls == cls6 || cls == cls5 || cls == cls4 || cls == cls3 || cls == Byte.TYPE;
        }
        return false;
    }
}