package zu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tesla.logging.TeslaLog;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f60756a = new a();

    private a() {
    }

    public static final Intent a(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        Class<?> b11 = b(context);
        if (b11 == null) {
            return null;
        }
        return new Intent(context, b11);
    }

    public static final Class<?> b(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        try {
            String packageName = context.getPackageName();
            kotlin.jvm.internal.s.f(packageName, "context.packageName");
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageName);
            ComponentName component = launchIntentForPackage == null ? null : launchIntentForPackage.getComponent();
            kotlin.jvm.internal.s.e(component);
            String className = component.getClassName();
            kotlin.jvm.internal.s.f(className, "launchIntent?.component!!.className");
            return Class.forName(className);
        } catch (ClassNotFoundException e11) {
            TeslaLog.INSTANCE.e("ActivityHelpers", "Could not determine main activity class", e11);
            return null;
        }
    }
}