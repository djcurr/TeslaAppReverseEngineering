package av;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tesla.TeslaV4.BuildConfig;
import com.tesla.widget.VehicleStatusSquareWidget;
import com.tesla.widget.VehicleStatusWidget;
import com.tesla.widget.VehicleStatusWidgetConfigureActivity;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class m {
    public static final PendingIntent a(Context context) {
        s.g(context, "context");
        Uri parse = Uri.parse("tesla://non_owner_screen");
        s.f(parse, "parse(this)");
        return l(new Intent("android.intent.action.VIEW", parse), context);
    }

    public static final PendingIntent b(Context context, ev.a widgetDependencies) {
        Intent b11;
        s.g(context, "context");
        s.g(widgetDependencies, "widgetDependencies");
        if (widgetDependencies.a()) {
            Uri parse = Uri.parse("tesla://");
            s.f(parse, "parse(this)");
            b11 = new Intent("android.intent.action.VIEW", parse);
        } else {
            b11 = widgetDependencies.b(context);
        }
        return l(b11, context);
    }

    public static final Intent c(Context context, Integer num, Boolean bool) {
        s.g(context, "context");
        Intent intent = new Intent(context, VehicleStatusSquareWidget.class);
        if (num != null) {
            Uri parse = Uri.parse("widget://update?app_widget_id=" + num + "&app_widget_update_with_delay=" + bool);
            s.f(parse, "parse(this)");
            intent.setData(parse);
        }
        intent.setAction("com.teslamotors.tesla.action.ACTION_UPDATE_WIDGET");
        return intent;
    }

    public static /* synthetic */ Intent d(Context context, Integer num, Boolean bool, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            bool = Boolean.FALSE;
        }
        return c(context, num, bool);
    }

    public static final Intent e(Context context, Integer num, com.tesla.widget.b bVar, Boolean bool) {
        s.g(context, "context");
        Intent intent = new Intent(context, VehicleStatusWidget.class);
        Uri parse = Uri.parse("widget://update?app_widget_id=" + num + "&execution=" + bVar + "&app_widget_update_with_delay=" + bool);
        s.f(parse, "parse(this)");
        intent.setData(parse);
        intent.setAction("com.teslamotors.tesla.action.ACTION_UPDATE_WIDGET");
        return intent;
    }

    public static /* synthetic */ Intent f(Context context, Integer num, com.tesla.widget.b bVar, Boolean bool, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            bVar = null;
        }
        if ((i11 & 8) != 0) {
            bool = Boolean.FALSE;
        }
        return e(context, num, bVar, bool);
    }

    public static final Uri g(cu.a vehicle, bv.c command, int i11) {
        s.g(vehicle, "vehicle");
        s.g(command, "command");
        String h11 = vehicle.h();
        String name = command.name();
        boolean d11 = com.tesla.widget.c.d(command, vehicle);
        Uri parse = Uri.parse("widget://command?vehicle_id=" + h11 + "&command=" + name + "&state=" + d11 + "&app_widget_id=" + i11);
        s.f(parse, "parse(this)");
        return parse;
    }

    public static final PendingIntent h(Context context, cu.a vehicle, bv.c command, int i11) {
        s.g(context, "context");
        s.g(vehicle, "vehicle");
        s.g(command, "command");
        if (bv.d.c(command, vehicle)) {
            String h11 = vehicle.h();
            String name = command.name();
            Uri parse = Uri.parse("tesla://product_home/" + h11 + "/" + name);
            s.f(parse, "parse(this)");
            return l(new Intent("android.intent.action.VIEW", parse), context);
        }
        Intent intent = new Intent(context, VehicleStatusWidget.class);
        intent.setAction("com.teslamotors.tesla.action.ACTION_VEHICLE_COMMAND");
        intent.setData(g(vehicle, command, i11));
        return m(intent, context);
    }

    public static final PendingIntent i(Context context, cu.a vehicle) {
        s.g(context, "context");
        s.g(vehicle, "vehicle");
        return j(context, vehicle.h());
    }

    public static final PendingIntent j(Context context, String vehicleId) {
        String str;
        s.g(context, "context");
        s.g(vehicleId, "vehicleId");
        if (vehicleId.length() == 0) {
            str = BuildConfig.APP_URL_SCHEME + "://";
        } else {
            str = BuildConfig.APP_URL_SCHEME + "://product_home/" + vehicleId;
        }
        Uri parse = Uri.parse(str);
        s.f(parse, "parse(this)");
        return l(new Intent("android.intent.action.VIEW", parse), context);
    }

    public static final PendingIntent k(Context context, int i11) {
        s.g(context, "context");
        Intent intent = new Intent(context, VehicleStatusWidgetConfigureActivity.class);
        intent.putExtra("appWidgetId", i11);
        intent.putExtra("com.teslamotors.tesla.key-from-widget", true);
        intent.setAction("android.appwidget.action.APPWIDGET_CONFIGURE" + i11);
        PendingIntent activity = PendingIntent.getActivity(context, i11, intent, 201326592);
        s.f(activity, "getActivity(\n    context…t.FLAG_UPDATE_CURRENT\n  )");
        return activity;
    }

    public static final PendingIntent l(Intent intent, Context context) {
        s.g(intent, "<this>");
        s.g(context, "context");
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        s.f(activity, "getActivity(\n    context…t.FLAG_UPDATE_CURRENT\n  )");
        return activity;
    }

    public static final PendingIntent m(Intent intent, Context context) {
        s.g(intent, "<this>");
        s.g(context, "context");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
        s.f(broadcast, "getBroadcast(\n    contex…t.FLAG_UPDATE_CURRENT\n  )");
        return broadcast;
    }

    public static final void n(Context context) {
        s.g(context, "<this>");
        Boolean bool = Boolean.TRUE;
        context.sendBroadcast(f(context, null, null, bool, 6, null));
        context.sendBroadcast(d(context, null, bool, 2, null));
    }
}