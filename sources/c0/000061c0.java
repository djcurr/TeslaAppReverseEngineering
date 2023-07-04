package com.tesla.widget;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.widget.RemoteViews;
import av.f;
import av.m;
import av.n;
import cv.h;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import lt.w2;
import wz.e0;
import wz.w;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final List<Integer> f22015a;

    /* renamed from: b  reason: collision with root package name */
    private static final List<Integer> f22016b;

    /* renamed from: c  reason: collision with root package name */
    private static final List<Integer> f22017c;

    /* renamed from: d  reason: collision with root package name */
    private static final List<Integer> f22018d;

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22019a;

        static {
            int[] iArr = new int[bv.c.values().length];
            iArr[bv.c.CHARGE_PORT.ordinal()] = 1;
            iArr[bv.c.TRUNK.ordinal()] = 2;
            iArr[bv.c.FRUNK.ordinal()] = 3;
            iArr[bv.c.REMOTE_START.ordinal()] = 4;
            iArr[bv.c.HOME_LINK.ordinal()] = 5;
            iArr[bv.c.SUNROOF_CONTROL.ordinal()] = 6;
            iArr[bv.c.LOCK.ordinal()] = 7;
            iArr[bv.c.CLIMATE_TOGGLE.ordinal()] = 8;
            iArr[bv.c.BIOWEAPON.ordinal()] = 9;
            iArr[bv.c.SUMMON.ordinal()] = 10;
            iArr[bv.c.FLASH_LIGHTS.ordinal()] = 11;
            iArr[bv.c.HONK_HORN.ordinal()] = 12;
            iArr[bv.c.SENTRY.ordinal()] = 13;
            iArr[bv.c.VENT.ordinal()] = 14;
            iArr[bv.c.MAX_DEFROST.ordinal()] = 15;
            iArr[bv.c.ACTUATE_ALL_DOORS.ordinal()] = 16;
            iArr[bv.c.UNLATCH_DRIVER_DOOR.ordinal()] = 17;
            iArr[bv.c.REMOTE_BOOMBOX.ordinal()] = 18;
            f22019a = iArr;
        }
    }

    static {
        List<Integer> l11;
        List<Integer> l12;
        List<Integer> l13;
        List<Integer> l14;
        l11 = w.l(Integer.valueOf(f.widget_button_1), Integer.valueOf(f.widget_button_2), Integer.valueOf(f.widget_button_3), Integer.valueOf(f.widget_button_4), Integer.valueOf(f.widget_button_5));
        f22015a = l11;
        l12 = w.l(Integer.valueOf(f.widget_icon_1), Integer.valueOf(f.widget_icon_2), Integer.valueOf(f.widget_icon_3), Integer.valueOf(f.widget_icon_4), Integer.valueOf(f.widget_icon_5));
        f22016b = l12;
        l13 = w.l(Integer.valueOf(f.widget_loading_1), Integer.valueOf(f.widget_loading_2), Integer.valueOf(f.widget_loading_3), Integer.valueOf(f.widget_loading_4), Integer.valueOf(f.widget_loading_5));
        f22017c = l13;
        l14 = w.l(Integer.valueOf(f.widget_flipper_1), Integer.valueOf(f.widget_flipper_2), Integer.valueOf(f.widget_flipper_3), Integer.valueOf(f.widget_flipper_4), Integer.valueOf(f.widget_flipper_5));
        f22018d = l14;
    }

    private static final boolean a(bv.c cVar, cu.a aVar) {
        w2 g11 = aVar.g();
        if (g11 == null || et.a.C(g11)) {
            return true;
        }
        switch (a.f22019a[cVar.ordinal()]) {
            case 1:
                if (n.g(aVar)) {
                    return true;
                }
                if (!et.a.r(g11) && et.a.x(aVar)) {
                    return true;
                }
                break;
            case 2:
                if (!et.a.t(g11) && et.a.J(aVar)) {
                    return true;
                }
                break;
            case 3:
                return et.a.B(aVar);
            case 4:
                return et.a.F(g11);
            case 5:
                if (!et.a.q(g11)) {
                    return true;
                }
                break;
            case 6:
                if (!et.a.I(g11) && !et.a.H(g11)) {
                    return true;
                }
                break;
        }
        return false;
    }

    private static final int b(boolean z11, bv.c cVar, com.tesla.widget.a aVar) {
        if (cVar != bv.c.SUNROOF_CONTROL && z11) {
            return av.c.control_button_enabled_color;
        }
        return aVar.getBackgroundRes();
    }

    private static final int c(boolean z11, bv.c cVar, cu.a aVar) {
        if (cVar == bv.c.MAX_DEFROST && z11) {
            return av.c.control_button_icon_defrost_enable_tint;
        }
        if (cVar == bv.c.CHARGE_PORT && n.g(aVar)) {
            return av.c.battery_charging_color;
        }
        if (z11) {
            return av.c.control_button_icon_enable_tint;
        }
        return av.c.control_button_icon_normal_tint;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final boolean d(bv.c cVar, cu.a appVehicle) {
        s.g(cVar, "<this>");
        s.g(appVehicle, "appVehicle");
        w2 g11 = appVehicle.g();
        if (g11 == null) {
            return true;
        }
        switch (a.f22019a[cVar.ordinal()]) {
            case 1:
                return et.a.x(appVehicle);
            case 2:
                return et.a.J(appVehicle);
            case 3:
                return et.a.B(appVehicle);
            case 4:
                return et.a.F(g11);
            case 5:
            case 10:
            case 11:
            case 12:
            case 17:
            case 18:
                break;
            case 6:
                return et.a.I(g11);
            case 7:
                return et.a.K(appVehicle);
            case 8:
                return et.a.z(g11);
            case 9:
                return et.a.w(g11);
            case 13:
                return et.a.G(g11);
            case 14:
                if (!et.a.L(g11)) {
                    return true;
                }
                break;
            case 15:
                return et.a.D(g11);
            case 16:
                return et.a.v(appVehicle);
            default:
                throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    public static final void e(RemoteViews remoteViews, List<? extends bv.c> commands) {
        s.g(remoteViews, "<this>");
        s.g(commands, "commands");
        int size = commands.size();
        int size2 = f22015a.size();
        if (size >= size2) {
            return;
        }
        while (true) {
            int i11 = size + 1;
            remoteViews.setViewVisibility(f22018d.get(size).intValue(), 8);
            if (i11 >= size2) {
                return;
            }
            size = i11;
        }
    }

    private static final void f(RemoteViews remoteViews, int i11, int i12, com.tesla.widget.a aVar, boolean z11) {
        if (z11) {
            remoteViews.setDisplayedChild(i11, 1);
        } else {
            remoteViews.setDisplayedChild(i11, 0);
        }
        remoteViews.setViewVisibility(i11, 0);
        remoteViews.setInt(i12, "setBackgroundResource", aVar.getBackgroundRes());
    }

    private static final void g(RemoteViews remoteViews, cu.a aVar, Context context, int i11, int i12, int i13, bv.c cVar, com.tesla.widget.a aVar2) {
        boolean d11 = d(cVar, aVar);
        w2 g11 = aVar.g();
        Icon createWithResource = Icon.createWithResource(context, cVar.getIcon(d11, g11 == null ? null : g11.n()));
        if (!j(cVar, d11)) {
            createWithResource.setTint(context.getColor(c(d11, cVar, aVar)));
        }
        remoteViews.setImageViewIcon(i13, createWithResource);
        remoteViews.setInt(i12, "setBackgroundResource", b(d11, cVar, aVar2));
        boolean a11 = a(cVar, aVar);
        remoteViews.setOnClickPendingIntent(i12, m.h(context, aVar, cVar, i11));
        remoteViews.setBoolean(i12, "setEnabled", !a11);
    }

    public static final void h(RemoteViews remoteViews, Context context, cu.a vehicle, int i11, List<? extends bv.c> vehicleCommands, bv.b vehicleCommandMarker) {
        List<bv.c> H0;
        int k11;
        com.tesla.widget.a aVar;
        s.g(remoteViews, "<this>");
        s.g(context, "context");
        s.g(vehicle, "vehicle");
        s.g(vehicleCommands, "vehicleCommands");
        s.g(vehicleCommandMarker, "vehicleCommandMarker");
        if (vehicleCommands.size() < 4) {
            H0 = h.f23125f.a();
        } else {
            H0 = e0.H0(vehicleCommands, 5);
        }
        List<bv.c> list = H0;
        if (vehicleCommands.contains(bv.c.SENTRY)) {
            remoteViews.setViewVisibility(f.vehicle_sentry_mode, 4);
        }
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                w.s();
            }
            bv.c cVar = (bv.c) obj;
            if (i12 == 0) {
                aVar = com.tesla.widget.a.LEFT;
            } else {
                k11 = w.k(list);
                aVar = i12 == k11 ? com.tesla.widget.a.RIGHT : com.tesla.widget.a.NORMAL;
            }
            com.tesla.widget.a aVar2 = aVar;
            g(remoteViews, vehicle, context, i11, f22015a.get(i12).intValue(), f22016b.get(i12).intValue(), cVar, aVar2);
            f(remoteViews, f22018d.get(i12).intValue(), f22017c.get(i12).intValue(), aVar2, vehicleCommandMarker.a(vehicle.h(), cVar));
            i12 = i13;
        }
        e(remoteViews, list);
    }

    public static final void i(RemoteViews remoteViews, Context context, b commandExecution) {
        s.g(remoteViews, "<this>");
        s.g(context, "context");
        s.g(commandExecution, "commandExecution");
        if (commandExecution == b.NONE) {
            remoteViews.setViewVisibility(f.refresh_zone, 0);
            remoteViews.setViewVisibility(f.command_execution_text, 8);
            remoteViews.setDisplayedChild(f.refresh_flipper, 1);
            return;
        }
        remoteViews.setViewVisibility(f.refresh_zone, 8);
        int i11 = f.command_execution_text;
        remoteViews.setViewVisibility(i11, 0);
        String string = context.getString(commandExecution.getExecutionLabel());
        s.f(string, "context.getString(comman…tion.getExecutionLabel())");
        remoteViews.setTextViewText(i11, string);
    }

    private static final boolean j(bv.c cVar, boolean z11) {
        return cVar == bv.c.SENTRY && z11;
    }
}