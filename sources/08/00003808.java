package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f16242a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f16243b;

    static {
        f16243b = a("org.robolectric.Robolectric") != null;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> b() {
        return f16242a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        return (f16242a == null || f16243b) ? false : true;
    }
}