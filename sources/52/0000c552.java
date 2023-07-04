package zu;

import android.content.Context;
import android.os.Build;

/* loaded from: classes6.dex */
public final class a0 {
    public static final boolean a(Context context) {
        kotlin.jvm.internal.s.g(context, "<this>");
        return Build.VERSION.SDK_INT < 31 || androidx.core.content.b.checkSelfPermission(context, "android.permission.BLUETOOTH_CONNECT") == 0;
    }

    public static final boolean b(Context context) {
        kotlin.jvm.internal.s.g(context, "<this>");
        return c(context) && a(context);
    }

    public static final boolean c(Context context) {
        kotlin.jvm.internal.s.g(context, "<this>");
        return Build.VERSION.SDK_INT < 31 || androidx.core.content.b.checkSelfPermission(context, "android.permission.BLUETOOTH_SCAN") == 0;
    }
}