package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
final class o {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f16351a = c();

    public static p a() {
        p b11 = b("getEmptyRegistry");
        return b11 != null ? b11 : p.f16360d;
    }

    private static final p b(String str) {
        Class<?> cls = f16351a;
        if (cls == null) {
            return null;
        }
        try {
            return (p) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}