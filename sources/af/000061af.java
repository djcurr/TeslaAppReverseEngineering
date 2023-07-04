package com.tesla.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import com.tesla.logging.g;
import com.tesla.widget.worker.UpdateWidgetWorker;
import cv.i;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.k;
import vz.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tesla/widget/VehicleStatusSquareWidget;", "Landroid/appwidget/AppWidgetProvider;", "<init>", "()V", "widget_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class VehicleStatusSquareWidget extends AppWidgetProvider {

    /* renamed from: a  reason: collision with root package name */
    private final k f21988a;

    /* loaded from: classes6.dex */
    static final class a extends u implements h00.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f21989a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final i invoke() {
            return ev.b.f25256a.b();
        }
    }

    public VehicleStatusSquareWidget() {
        k a11;
        a11 = m.a(a.f21989a);
        this.f21988a = a11;
    }

    private final i a() {
        return (i) this.f21988a.getValue();
    }

    private final void b(Context context, int i11, Boolean bool) {
        UpdateWidgetWorker.f22023b.d(i11, context, d.SQUARE, (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : Long.valueOf(s.c(bool, Boolean.TRUE) ? 1000L : 0L), (r18 & 32) != 0 ? false : false, (r18 & 64) != 0 ? false : false);
    }

    static /* synthetic */ void c(VehicleStatusSquareWidget vehicleStatusSquareWidget, Context context, int i11, Boolean bool, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            bool = Boolean.FALSE;
        }
        vehicleStatusSquareWidget.b(context, i11, bool);
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
            a().j(i12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        r2 = kotlin.text.u.n(r2);
     */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.s.g(r9, r0)
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.s.g(r10, r0)
            super.onReceive(r9, r10)
            java.lang.String r0 = r10.getAction()
            if (r0 == 0) goto La4
            int r1 = r0.hashCode()
            r2 = -1365770836(0xffffffffae97fdac, float:-6.911746E-11)
            if (r1 == r2) goto L1e
            goto La4
        L1e:
            java.lang.String r1 = "com.teslamotors.tesla.action.ACTION_UPDATE_WIDGET"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L28
            goto La4
        L28:
            android.appwidget.AppWidgetManager r0 = android.appwidget.AppWidgetManager.getInstance(r9)
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class<com.tesla.widget.VehicleStatusSquareWidget> r2 = com.tesla.widget.VehicleStatusSquareWidget.class
            r1.<init>(r9, r2)
            android.net.Uri r2 = r10.getData()
            r3 = 0
            if (r2 != 0) goto L3c
        L3a:
            r2 = r3
            goto L50
        L3c:
            java.lang.String r4 = "app_widget_id"
            java.lang.String r2 = r2.getQueryParameter(r4)
            if (r2 != 0) goto L45
            goto L3a
        L45:
            java.lang.Integer r2 = kotlin.text.m.n(r2)
            if (r2 != 0) goto L4c
            goto L3a
        L4c:
            int r2 = r2.intValue()
        L50:
            android.net.Uri r10 = r10.getData()
            r4 = 0
            if (r10 != 0) goto L58
            goto L69
        L58:
            java.lang.String r5 = "app_widget_update_with_delay"
            java.lang.String r10 = r10.getQueryParameter(r5)
            if (r10 != 0) goto L61
            goto L69
        L61:
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r10)
        L69:
            if (r2 != 0) goto La1
            int[] r10 = r0.getAppWidgetIds(r1)
            java.lang.String r0 = "appWidgetManager.getAppWidgetIds(componentName)"
            kotlin.jvm.internal.s.f(r10, r0)
            int r0 = r10.length
        L75:
            if (r3 >= r0) goto La4
            r1 = r10[r3]
            com.tesla.logging.g r2 = av.a.a()
            com.tesla.widget.d r5 = com.tesla.widget.d.SQUARE
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "updating widget: "
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = " for type "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r2.i(r5)
            r8.b(r9, r1, r4)
            int r3 = r3 + 1
            goto L75
        La1:
            r8.b(r9, r2, r4)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tesla.widget.VehicleStatusSquareWidget.onReceive(android.content.Context, android.content.Intent):void");
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
            c(this, context, i12, null, 4, null);
        }
    }
}