package b00;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;
import kotlin.text.w;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7174a;

    static {
        a aVar;
        Object newInstance;
        Object newInstance2;
        int a11 = a();
        if (a11 >= 65544 || a11 < 65536) {
            try {
                newInstance = d00.a.class.newInstance();
                s.f(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            } catch (ClassNotFoundException unused) {
                Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                s.f(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    aVar = (a) newInstance3;
                } catch (ClassCastException e11) {
                    ClassLoader classLoader = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader2 = a.class.getClassLoader();
                    if (s.c(classLoader, classLoader2)) {
                        throw e11;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e11);
                }
            }
            try {
                if (newInstance == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
                aVar = (a) newInstance;
                f7174a = aVar;
            } catch (ClassCastException e12) {
                ClassLoader classLoader3 = newInstance.getClass().getClassLoader();
                ClassLoader classLoader4 = a.class.getClassLoader();
                if (s.c(classLoader3, classLoader4)) {
                    throw e12;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e12);
            }
        }
        if (a11 >= 65543 || a11 < 65536) {
            try {
                try {
                    newInstance2 = c00.a.class.newInstance();
                    s.f(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                    } catch (ClassCastException e13) {
                        ClassLoader classLoader5 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader6 = a.class.getClassLoader();
                        if (s.c(classLoader5, classLoader6)) {
                            throw e13;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e13);
                    }
                } catch (ClassNotFoundException unused2) {
                }
            } catch (ClassNotFoundException unused3) {
                Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                s.f(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    aVar = (a) newInstance4;
                } catch (ClassCastException e14) {
                    ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                    ClassLoader classLoader8 = a.class.getClassLoader();
                    if (s.c(classLoader7, classLoader8)) {
                        throw e14;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e14);
                }
            }
            if (newInstance2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            aVar = (a) newInstance2;
            f7174a = aVar;
        }
        aVar = new a();
        f7174a = aVar;
    }

    private static final int a() {
        int Y;
        int Y2;
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        Y = w.Y(property, CoreConstants.DOT, 0, false, 6, null);
        if (Y < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        }
        int i11 = Y + 1;
        Y2 = w.Y(property, CoreConstants.DOT, i11, false, 4, null);
        if (Y2 < 0) {
            Y2 = property.length();
        }
        String substring = property.substring(0, Y);
        s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = property.substring(i11, Y2);
        s.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        try {
            return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
        } catch (NumberFormatException unused2) {
            return 65542;
        }
    }
}