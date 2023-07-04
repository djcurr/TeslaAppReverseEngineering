package a10;

import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e {
    public static final Class<?> a(ClassLoader classLoader, String fqName) {
        s.g(classLoader, "<this>");
        s.g(fqName, "fqName");
        try {
            return Class.forName(fqName, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}