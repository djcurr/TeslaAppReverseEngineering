package gv;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.teslamotors.plugins.ble.BLEService;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f28151a = new g();

    private g() {
    }

    public static final void a(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        Object systemService = context.getSystemService("alarm");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        ((AlarmManager) systemService).cancel(d(context));
    }

    public static final void b(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        Object systemService = context.getSystemService("alarm");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        ((AlarmManager) systemService).cancel(c(context));
    }

    public static final PendingIntent c(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        Intent intent = new Intent(context, BLEService.class);
        intent.setAction("com.teslamotors.plugins.ble.action.REINITIALIZE_CONNECTION");
        return PendingIntent.getService(context, 0, intent, 67108864);
    }

    public static final PendingIntent d(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        Intent intent = new Intent(context, BLEService.class);
        intent.setAction("com.teslamotors.plugins.ble.action.RESTART_BG_SCAN");
        return PendingIntent.getService(context, 0, intent, 67108864);
    }

    public static final void e(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        Object systemService = context.getSystemService("alarm");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        ((AlarmManager) systemService).setWindow(0, 1200000 + System.currentTimeMillis(), 600000L, d(context));
    }

    public static final void f(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        Object systemService = context.getSystemService("alarm");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        ((AlarmManager) systemService).setWindow(0, 14400000 + System.currentTimeMillis(), 14400000L, c(context));
    }
}