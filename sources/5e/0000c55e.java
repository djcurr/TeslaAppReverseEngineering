package zu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.PowerManager;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f60767a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private static final com.tesla.logging.g f60768b = com.tesla.logging.g.f21878b.a("BatteryOptimizationUtils");

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Activity activity) {
            kotlin.jvm.internal.s.g(activity, "activity");
            e.f60768b.i("requesting ignoring battery optimization # in app dialog");
            Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
            String packageName = activity.getPackageName();
            intent.setData(Uri.parse("package:" + packageName));
            activity.startActivityForResult(intent, 8816);
        }

        public final boolean b(Context context) {
            kotlin.jvm.internal.s.g(context, "context");
            Object systemService = context.getSystemService("power");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            boolean isIgnoringBatteryOptimizations = ((PowerManager) systemService).isIgnoringBatteryOptimizations(context.getPackageName());
            com.tesla.logging.g gVar = e.f60768b;
            gVar.i("fetching current status if ignored battery optimizations: [" + isIgnoringBatteryOptimizations + "]");
            return isIgnoringBatteryOptimizations;
        }
    }
}