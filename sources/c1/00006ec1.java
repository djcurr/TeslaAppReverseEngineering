package freemarker.core;

import freemarker.template.utility.UndeclaredThrowableException;
import java.lang.reflect.Constructor;
import java.util.Map;

/* loaded from: classes5.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static final Class f26892a;

    /* renamed from: b  reason: collision with root package name */
    private static final Class f26893b;

    /* renamed from: c  reason: collision with root package name */
    private static final Constructor f26894c;

    /* renamed from: d  reason: collision with root package name */
    private static final int f26895d;

    /* renamed from: e  reason: collision with root package name */
    static /* synthetic */ Class f26896e;

    static {
        Class cls;
        Class cls2;
        Constructor constructor;
        try {
            cls = jx.a.b("java.util.concurrent.ConcurrentMap");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f26892a = cls;
        int i11 = 3;
        try {
            cls2 = jx.a.b("java.util.concurrent.ConcurrentHashMap");
            try {
                Class<?> cls3 = Integer.TYPE;
                constructor = cls2.getConstructor(cls3, Float.TYPE, cls3);
            } catch (Exception e11) {
                throw new RuntimeException("Failed to get ConcurrentHashMap constructor", e11);
            }
        } catch (ClassNotFoundException unused2) {
            Class cls4 = f26896e;
            if (cls4 == null) {
                cls4 = a("java.util.HashMap");
                f26896e = cls4;
            }
            cls2 = cls4;
            try {
                constructor = cls2.getConstructor(Integer.TYPE, Float.TYPE);
                i11 = 2;
            } catch (Exception e12) {
                throw new RuntimeException("Failed to get HashMap constructor", e12);
            }
        }
        f26893b = cls2;
        f26894c = constructor;
        f26895d = i11;
    }

    static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError().initCause(e11);
        }
    }

    public static boolean b(Map map) {
        Class cls = f26892a;
        return cls != null && cls.isInstance(map);
    }

    public static Map c() {
        try {
            return (Map) f26893b.newInstance();
        } catch (Exception e11) {
            throw new UndeclaredThrowableException(e11);
        }
    }

    public static Map d(int i11, float f11, int i12) {
        try {
            int i13 = f26895d;
            if (i13 == 3) {
                return (Map) f26894c.newInstance(new Integer(i11), new Float(f11), new Integer(i12));
            }
            if (i13 == 2) {
                return (Map) f26894c.newInstance(new Integer(i11), new Float(f11));
            }
            throw new BugException();
        } catch (Exception e11) {
            throw new UndeclaredThrowableException(e11);
        }
    }
}