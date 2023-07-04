package com.tesla.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tesla.logging.g;
import com.tesla.widget.worker.UpdateWidgetWorker;
import com.tesla.widget.worker.WidgetCommandExecutionWorker;
import cv.i;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import nv.j;
import vz.k;
import vz.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tesla/widget/VehicleStatusWidget;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "widget_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class VehicleStatusWidget extends AppWidgetProvider {

    /* renamed from: a  reason: collision with root package name */
    private final k f21990a;

    /* loaded from: classes6.dex */
    static final class a extends u implements h00.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f21991a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final i mo11invoke() {
            return ev.b.f25256a.b();
        }
    }

    public VehicleStatusWidget() {
        k a11;
        a11 = m.a(a.f21991a);
        this.f21990a = a11;
    }

    private final void a(Intent intent, Context context) {
        String queryParameter;
        Uri data = intent.getData();
        if (data == null || (queryParameter = data.getQueryParameter("vehicle_id")) == null) {
            return;
        }
        String queryParameter2 = data.getQueryParameter("command");
        bv.c d11 = queryParameter2 == null ? null : bv.d.d(queryParameter2);
        if (d11 == null) {
            return;
        }
        String queryParameter3 = data.getQueryParameter("app_widget_id");
        Integer n11 = queryParameter3 != null ? kotlin.text.u.n(queryParameter3) : null;
        if (n11 == null) {
            return;
        }
        int intValue = n11.intValue();
        g a11 = av.a.a();
        a11.a("Widget-" + intValue + " Command: " + d11 + " Broadcast received for vehicle " + queryParameter);
        WidgetCommandExecutionWorker.f22037d.b(context, intValue, queryParameter, d11);
    }

    private final i b() {
        return (i) this.f21990a.mo16getValue();
    }

    private final void c(Context context, int i11, Long l11, b bVar, boolean z11, boolean z12) {
        UpdateWidgetWorker.f22023b.d(i11, context, d.NORMAL, bVar, l11, z11, z12);
    }

    static /* synthetic */ void d(VehicleStatusWidget vehicleStatusWidget, Context context, int i11, Long l11, b bVar, boolean z11, boolean z12, int i12, Object obj) {
        vehicleStatusWidget.c(context, i11, (i12 & 4) != 0 ? null : l11, (i12 & 8) != 0 ? null : bVar, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? false : z12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        r2 = kotlin.text.u.n(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(android.content.Context r16, android.content.Intent r17) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tesla.widget.VehicleStatusWidget.e(android.content.Context, android.content.Intent):void");
    }

    private final void f(Intent intent, Context context) {
        j jVar = (j) intent.getParcelableExtra("com.teslamotors.tesla.action.ACTION_VEHICLE_BLE_UPDATE_KEY");
        String str = jVar == null ? null : jVar.f41918k;
        if (str != null) {
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, VehicleStatusWidget.class));
            i b11 = b();
            s.f(appWidgetIds, "appWidgetIds");
            Integer valueOf = Integer.valueOf(b11.c(str, appWidgetIds));
            int intValue = valueOf.intValue();
            av.a.a().i("Widget received a BLE update data but can not find associated widget");
            Integer num = intValue != 0 ? valueOf : null;
            if (num == null) {
                return;
            }
            int intValue2 = num.intValue();
            b().g(str, mv.b.a(jVar));
            d(this, context, intValue2, null, null, true, true, 12, null);
            g a11 = av.a.a();
            a11.i("Widget received a BLE update data appId for : " + intValue2);
            return;
        }
        av.a.a().i("Widget received a BLE update but data is null");
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(Context context, int[] appWidgetIds) {
        s.g(context, "context");
        s.g(appWidgetIds, "appWidgetIds");
        int length = appWidgetIds.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = appWidgetIds[i11];
            i11++;
            g a11 = av.a.a();
            a11.a("deleting widget id : " + i12);
            b().j(i12);
        }
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        s.g(context, "context");
        s.g(intent, "intent");
        super.onReceive(context, intent);
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode == -1365770836) {
                if (action.equals("com.teslamotors.tesla.action.ACTION_UPDATE_WIDGET")) {
                    e(context, intent);
                }
            } else if (hashCode == -702775382) {
                if (action.equals("com.teslamotors.tesla.action.ACTION_VEHICLE_COMMAND")) {
                    a(intent, context);
                }
            } else if (hashCode == 1220183918 && action.equals("com.teslamotors.tesla.action.ACTION_VEHICLE_BLE_UPDATE")) {
                f(intent, context);
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        s.g(context, "context");
        s.g(appWidgetManager, "appWidgetManager");
        s.g(appWidgetIds, "appWidgetIds");
        int length = appWidgetIds.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = appWidgetIds[i11];
            i11++;
            d(this, context, i12, null, null, false, false, 60, null);
        }
    }
}