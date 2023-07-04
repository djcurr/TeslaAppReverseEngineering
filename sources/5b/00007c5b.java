package jx;

import okhttp3.HttpUrl;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    static /* synthetic */ Class f34001a;

    /* renamed from: b  reason: collision with root package name */
    static /* synthetic */ Class f34002b;

    /* renamed from: c  reason: collision with root package name */
    static /* synthetic */ Class f34003c;

    /* renamed from: d  reason: collision with root package name */
    static /* synthetic */ Class f34004d;

    /* renamed from: e  reason: collision with root package name */
    static /* synthetic */ Class f34005e;

    /* renamed from: f  reason: collision with root package name */
    static /* synthetic */ Class f34006f;

    /* renamed from: g  reason: collision with root package name */
    static /* synthetic */ Class f34007g;

    /* renamed from: h  reason: collision with root package name */
    static /* synthetic */ Class f34008h;

    /* renamed from: i  reason: collision with root package name */
    static /* synthetic */ Class f34009i;

    static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    public static Class b(String str) {
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                return Class.forName(str, true, contextClassLoader);
            }
        } catch (ClassNotFoundException | SecurityException unused) {
        }
        return Class.forName(str);
    }

    public static String c(Class cls) {
        return d(cls, false);
    }

    public static String d(Class cls, boolean z11) {
        if (cls == null) {
            return null;
        }
        if (cls.isArray()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(c(cls.getComponentType()));
            stringBuffer.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return stringBuffer.toString();
        }
        String name = cls.getName();
        if (name.startsWith("java.lang.") || name.startsWith("java.util.")) {
            return name.substring(10);
        }
        if (z11) {
            if (name.startsWith("freemarker.template.")) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("f.t");
                stringBuffer2.append(name.substring(19));
                return stringBuffer2.toString();
            } else if (name.startsWith("freemarker.ext.beans.")) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("f.e.b");
                stringBuffer3.append(name.substring(20));
                return stringBuffer3.toString();
            } else if (name.startsWith("freemarker.core.")) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("f.c");
                stringBuffer4.append(name.substring(15));
                return stringBuffer4.toString();
            } else if (name.startsWith("freemarker.ext.")) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("f.e");
                stringBuffer5.append(name.substring(14));
                return stringBuffer5.toString();
            } else if (name.startsWith("freemarker.")) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("f");
                stringBuffer6.append(name.substring(10));
                return stringBuffer6.toString();
            } else {
                return name;
            }
        }
        return name;
    }

    public static String e(Object obj) {
        return f(obj, false);
    }

    public static String f(Object obj, boolean z11) {
        return obj == null ? "Null" : d(obj.getClass(), z11);
    }

    public static Class g(Class cls) {
        if (cls == Integer.TYPE) {
            Class cls2 = f34001a;
            if (cls2 == null) {
                Class a11 = a("java.lang.Integer");
                f34001a = a11;
                return a11;
            }
            return cls2;
        } else if (cls == Boolean.TYPE) {
            Class cls3 = f34002b;
            if (cls3 == null) {
                Class a12 = a("java.lang.Boolean");
                f34002b = a12;
                return a12;
            }
            return cls3;
        } else if (cls == Long.TYPE) {
            Class cls4 = f34003c;
            if (cls4 == null) {
                Class a13 = a("java.lang.Long");
                f34003c = a13;
                return a13;
            }
            return cls4;
        } else if (cls == Double.TYPE) {
            Class cls5 = f34004d;
            if (cls5 == null) {
                Class a14 = a("java.lang.Double");
                f34004d = a14;
                return a14;
            }
            return cls5;
        } else if (cls == Character.TYPE) {
            Class cls6 = f34005e;
            if (cls6 == null) {
                Class a15 = a("java.lang.Character");
                f34005e = a15;
                return a15;
            }
            return cls6;
        } else if (cls == Float.TYPE) {
            Class cls7 = f34006f;
            if (cls7 == null) {
                Class a16 = a("java.lang.Float");
                f34006f = a16;
                return a16;
            }
            return cls7;
        } else if (cls == Byte.TYPE) {
            Class cls8 = f34007g;
            if (cls8 == null) {
                Class a17 = a("java.lang.Byte");
                f34007g = a17;
                return a17;
            }
            return cls8;
        } else if (cls == Short.TYPE) {
            Class cls9 = f34008h;
            if (cls9 == null) {
                Class a18 = a("java.lang.Short");
                f34008h = a18;
                return a18;
            }
            return cls9;
        } else if (cls == Void.TYPE) {
            Class cls10 = f34009i;
            if (cls10 == null) {
                Class a19 = a("java.lang.Void");
                f34009i = a19;
                return a19;
            }
            return cls10;
        } else {
            return cls;
        }
    }
}