package io.realm.internal;

import io.realm.g0;

/* loaded from: classes5.dex */
public class OsObjectStore {
    public static boolean a(g0 g0Var, Runnable runnable) {
        return nativeCallWithLock(g0Var.k(), runnable);
    }

    public static String b(OsSharedRealm osSharedRealm, String str) {
        return nativeGetPrimaryKeyForObject(osSharedRealm.getNativePtr(), Util.c() + str);
    }

    public static long c(OsSharedRealm osSharedRealm) {
        return nativeGetSchemaVersion(osSharedRealm.getNativePtr());
    }

    public static void d(OsSharedRealm osSharedRealm, String str, String str2) {
        nativeSetPrimaryKeyForObject(osSharedRealm.getNativePtr(), Util.c() + str, str2);
    }

    public static void e(OsSharedRealm osSharedRealm, long j11) {
        nativeSetSchemaVersion(osSharedRealm.getNativePtr(), j11);
    }

    private static native boolean nativeCallWithLock(String str, Runnable runnable);

    private static native boolean nativeDeleteTableForObject(long j11, String str);

    private static native String nativeGetPrimaryKeyForObject(long j11, String str);

    private static native long nativeGetSchemaVersion(long j11);

    private static native void nativeSetPrimaryKeyForObject(long j11, String str, String str2);

    private static native void nativeSetSchemaVersion(long j11, long j12);
}