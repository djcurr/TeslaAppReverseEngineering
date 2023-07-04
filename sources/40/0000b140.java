package rz;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f49762a;

    static {
        try {
            f49762a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f49762a = false;
        }
    }

    public static boolean a() {
        return !f49762a;
    }
}