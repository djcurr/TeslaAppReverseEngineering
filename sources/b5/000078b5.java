package io.realm.log;

import android.util.Log;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class RealmLog {

    /* renamed from: a  reason: collision with root package name */
    private static String f31965a = "REALM_JAVA";

    public static void a(String str, Object... objArr) {
        b(null, str, objArr);
    }

    public static void b(Throwable th2, String str, Object... objArr) {
        f(6, th2, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        d(null, str, objArr);
    }

    public static void d(Throwable th2, String str, Object... objArr) {
        f(7, th2, str, objArr);
    }

    public static int e() {
        return nativeGetLogLevel();
    }

    private static void f(int i11, Throwable th2, String str, Object... objArr) {
        if (i11 < e()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (str != null && objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        if (th2 != null) {
            sb2.append(Log.getStackTraceString(th2));
        }
        if (str != null) {
            if (th2 != null) {
                sb2.append("\n");
            }
            sb2.append(str);
        }
        nativeLog(i11, f31965a, th2, sb2.toString());
    }

    public static void g(String str, Object... objArr) {
        h(null, str, objArr);
    }

    public static void h(Throwable th2, String str, Object... objArr) {
        f(5, th2, str, objArr);
    }

    private static native void nativeAddLogger(RealmLogger realmLogger);

    private static native void nativeClearLoggers();

    static native void nativeCloseCoreLoggerBridge(long j11);

    static native long nativeCreateCoreLoggerBridge(String str);

    private static native int nativeGetLogLevel();

    private static native void nativeLog(int i11, String str, Throwable th2, String str2);

    static native void nativeLogToCoreLoggerBridge(long j11, int i11, String str);

    private static native void nativeRegisterDefaultLogger();

    private static native void nativeRemoveLogger(RealmLogger realmLogger);

    private static native void nativeSetLogLevel(int i11);
}