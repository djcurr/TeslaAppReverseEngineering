package io.realm.internal;

import io.realm.l0;
import io.realm.n0;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public class Util {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f31909a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f31910b;

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException("Nonnull '" + str + "' required.");
    }

    public static Class<? extends l0> b(Class<? extends l0> cls) {
        if (!cls.equals(l0.class) && !cls.equals(n0.class)) {
            Class superclass = cls.getSuperclass();
            return (superclass.equals(Object.class) || superclass.equals(n0.class)) ? cls : superclass;
        }
        throw new IllegalArgumentException("RealmModel or RealmObject was passed as an argument. Only subclasses of these can be used as arguments to methods that accept a Realm model class.");
    }

    public static String c() {
        return nativeGetTablePrefix();
    }

    public static synchronized boolean d() {
        boolean booleanValue;
        synchronized (Util.class) {
            if (f31910b == null) {
                try {
                    f31910b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f31910b = Boolean.FALSE;
                }
            }
            booleanValue = f31910b.booleanValue();
        }
        return booleanValue;
    }

    public static boolean e(String str) {
        return str == null || str.length() == 0;
    }

    public static synchronized boolean f() {
        boolean booleanValue;
        synchronized (Util.class) {
            if (f31909a == null) {
                try {
                    int i11 = ey.b.f25370a;
                    f31909a = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f31909a = Boolean.FALSE;
                }
            }
            booleanValue = f31909a.booleanValue();
        }
        return booleanValue;
    }

    public static <T> Set<T> g(T... tArr) {
        if (tArr == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t11 : tArr) {
            if (t11 != null) {
                linkedHashSet.add(t11);
            }
        }
        return linkedHashSet;
    }

    static native String nativeGetTablePrefix();
}