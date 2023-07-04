package av;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Icon;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import h00.p;
import j$.time.Instant;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import lt.w2;
import mt.u;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.e1;
import v20.j0;
import v20.o0;
import v20.p0;
import vz.b0;
import vz.r;

/* loaded from: classes6.dex */
public final class j {

    /* renamed from: e  reason: collision with root package name */
    public static final a f6998e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final cv.i f6999a;

    /* renamed from: b  reason: collision with root package name */
    private final ev.a f7000b;

    /* renamed from: c  reason: collision with root package name */
    private final bv.b f7001c;

    /* renamed from: d  reason: collision with root package name */
    private final com.tesla.logging.g f7002d;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bitmap a(Context context, cu.a vehicle) {
            s.g(context, "context");
            s.g(vehicle, "vehicle");
            View inflate = LayoutInflater.from(context).inflate(av.g.vehicle_status_battery_view, (ViewGroup) null);
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(av.d.dim_battery_background_width_with_nipple);
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(av.d.dim_battery_background_height);
            View findViewById = inflate.findViewById(av.f.battery_body);
            s.f(findViewById, "batteryView.findViewById<View>(R.id.battery_body)");
            n.h(findViewById, vehicle);
            inflate.measure(View.MeasureSpec.makeMeasureSpec(dimensionPixelOffset, 0), View.MeasureSpec.makeMeasureSpec(dimensionPixelOffset2, 0));
            inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
            Bitmap batteryBitmap = Bitmap.createBitmap(dimensionPixelOffset, dimensionPixelOffset2, Bitmap.Config.RGB_565);
            inflate.draw(new Canvas(batteryBitmap));
            s.f(batteryBitmap, "batteryBitmap");
            return batteryBitmap;
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f7003a;

        static {
            int[] iArr = new int[com.tesla.data.oapi.f.values().length];
            iArr[com.tesla.data.oapi.f.OWNERAPI_ERROR_MOBILE_ACCESS_DISABLED.ordinal()] = 1;
            iArr[com.tesla.data.oapi.f.OWNERAPI_ERROR_UNAUTHORIZED.ordinal()] = 2;
            iArr[com.tesla.data.oapi.f.OWNERAPI_ERROR_NOT_FOUND.ordinal()] = 3;
            f7003a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static abstract class c {

        /* loaded from: classes6.dex */
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            private final cu.a f7004a;

            public a(cu.a aVar) {
                super(null);
                this.f7004a = aVar;
            }

            public final cu.a b() {
                return this.f7004a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && s.c(this.f7004a, ((a) obj).f7004a);
            }

            public int hashCode() {
                cu.a aVar = this.f7004a;
                if (aVar == null) {
                    return 0;
                }
                return aVar.hashCode();
            }

            public String toString() {
                cu.a aVar = this.f7004a;
                return "MobileAccessDisabled(vehicle=" + aVar + ")";
            }
        }

        /* loaded from: classes6.dex */
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            private final String f7005a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String vehicleId) {
                super(null);
                s.g(vehicleId, "vehicleId");
                this.f7005a = vehicleId;
            }

            public final String b() {
                return this.f7005a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && s.c(this.f7005a, ((b) obj).f7005a);
            }

            public int hashCode() {
                return this.f7005a.hashCode();
            }

            public String toString() {
                String str = this.f7005a;
                return "NeedMigration(vehicleId=" + str + ")";
            }
        }

        /* renamed from: av.j$c$c  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0131c extends c {

            /* renamed from: a  reason: collision with root package name */
            private final String f7006a;

            /* renamed from: b  reason: collision with root package name */
            private final Throwable f7007b;

            public C0131c(String str, Throwable th2) {
                super(null);
                this.f7006a = str;
                this.f7007b = th2;
            }

            public final String b() {
                return this.f7006a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0131c) {
                    C0131c c0131c = (C0131c) obj;
                    return s.c(this.f7006a, c0131c.f7006a) && s.c(this.f7007b, c0131c.f7007b);
                }
                return false;
            }

            public int hashCode() {
                String str = this.f7006a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Throwable th2 = this.f7007b;
                return hashCode + (th2 != null ? th2.hashCode() : 0);
            }

            public String toString() {
                String str = this.f7006a;
                Throwable th2 = this.f7007b;
                return "NoData(vehicleId=" + str + ", error=" + th2 + ")";
            }
        }

        /* loaded from: classes6.dex */
        public static final class d extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final d f7008a = new d();

            private d() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class e extends c {

            /* renamed from: a  reason: collision with root package name */
            private final cu.a f7009a;

            /* renamed from: b  reason: collision with root package name */
            private final List<bv.c> f7010b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public e(cu.a vehicle, List<? extends bv.c> vehicleCommand) {
                super(null);
                s.g(vehicle, "vehicle");
                s.g(vehicleCommand, "vehicleCommand");
                this.f7009a = vehicle;
                this.f7010b = vehicleCommand;
            }

            public final cu.a b() {
                return this.f7009a;
            }

            public final List<bv.c> c() {
                return this.f7010b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    return s.c(this.f7009a, eVar.f7009a) && s.c(this.f7010b, eVar.f7010b);
                }
                return false;
            }

            public int hashCode() {
                return (this.f7009a.hashCode() * 31) + this.f7010b.hashCode();
            }

            public String toString() {
                cu.a aVar = this.f7009a;
                List<bv.c> list = this.f7010b;
                return "Normal(vehicle=" + aVar + ", vehicleCommand=" + list + ")";
            }
        }

        /* loaded from: classes6.dex */
        public static final class f extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final f f7011a = new f();

            private f() {
                super(null);
            }
        }

        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RemoteViews a(com.tesla.widget.d type, Context context) {
            s.g(type, "type");
            s.g(context, "context");
            return this instanceof e ? new RemoteViews(context.getPackageName(), type.getLayoutRes()) : new RemoteViews(context.getPackageName(), type.getDefaultLayoutRes());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.tesla.widget.VehicleWidgetBuilder", f = "VehicleWidgetBuilder.kt", l = {168, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384, 188}, m = "mapToWidgetType")
    /* loaded from: classes6.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f7012a;

        /* renamed from: b  reason: collision with root package name */
        Object f7013b;

        /* renamed from: c  reason: collision with root package name */
        int f7014c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f7015d;

        /* renamed from: f  reason: collision with root package name */
        int f7017f;

        d(zz.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7015d = obj;
            this.f7017f |= Integer.MIN_VALUE;
            return j.this.f(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.tesla.widget.VehicleWidgetBuilder", f = "VehicleWidgetBuilder.kt", l = {100, 115}, m = "setup")
    /* loaded from: classes6.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f7018a;

        /* renamed from: b  reason: collision with root package name */
        Object f7019b;

        /* renamed from: c  reason: collision with root package name */
        Object f7020c;

        /* renamed from: d  reason: collision with root package name */
        Object f7021d;

        /* renamed from: e  reason: collision with root package name */
        Object f7022e;

        /* renamed from: f  reason: collision with root package name */
        Object f7023f;

        /* renamed from: g  reason: collision with root package name */
        Object f7024g;

        /* renamed from: h  reason: collision with root package name */
        int f7025h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f7026i;

        /* renamed from: k  reason: collision with root package name */
        int f7028k;

        e(zz.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7026i = obj;
            this.f7028k |= Integer.MIN_VALUE;
            return j.this.g(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.tesla.widget.VehicleWidgetBuilder", f = "VehicleWidgetBuilder.kt", l = {339}, m = "setupVehicleChargeOrLocation")
    /* loaded from: classes6.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f7029a;

        /* renamed from: b  reason: collision with root package name */
        Object f7030b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f7031c;

        /* renamed from: e  reason: collision with root package name */
        int f7033e;

        f(zz.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7031c = obj;
            this.f7033e |= Integer.MIN_VALUE;
            return j.this.l(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.tesla.widget.VehicleWidgetBuilder$setupVehicleChargeOrLocation$location$1", f = "VehicleWidgetBuilder.kt", l = {342}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements p<o0, zz.d<? super String>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f7034a;

        /* renamed from: b  reason: collision with root package name */
        int f7035b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ cu.a f7036c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ j f7037d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ct.i f7038e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(cu.a aVar, j jVar, ct.i iVar, zz.d<? super g> dVar) {
            super(2, dVar);
            this.f7036c = aVar;
            this.f7037d = jVar;
            this.f7038e = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new g(this.f7036c, this.f7037d, this.f7038e, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super String> dVar) {
            return ((g) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            vz.p<Double, Double> pVar;
            d11 = a00.d.d();
            int i11 = this.f7035b;
            String str = null;
            if (i11 == 0) {
                r.b(obj);
                w2 g11 = this.f7036c.g();
                vz.p<Double, Double> i12 = g11 == null ? null : et.a.i(g11);
                if (i12 == null) {
                    return null;
                }
                ev.a aVar = this.f7037d.f7000b;
                this.f7034a = i12;
                this.f7035b = 1;
                Object c11 = aVar.c(i12, this);
                if (c11 == d11) {
                    return d11;
                }
                pVar = i12;
                obj = c11;
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                pVar = (vz.p) this.f7034a;
                r.b(obj);
            }
            String str2 = (String) obj;
            if (str2 != null) {
                j jVar = this.f7037d;
                ct.i realmHelper = this.f7038e;
                cu.a aVar2 = this.f7036c;
                jVar.f7002d.a("Successfully fetched location from geocoder,caching it");
                s.f(realmHelper, "realmHelper");
                cv.b.e(realmHelper, et.a.l(aVar2), pVar, str2);
                str = str2;
            }
            if (str == null) {
                ct.i realmHelper2 = this.f7038e;
                s.f(realmHelper2, "realmHelper");
                String c12 = cv.b.c(realmHelper2, et.a.l(this.f7036c), pVar);
                this.f7037d.f7002d.a("Got cached location from realm");
                return c12;
            }
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.tesla.widget.VehicleWidgetBuilder$updateAppWidget$1", f = "VehicleWidgetBuilder.kt", l = {68, 71}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements p<o0, zz.d<? super b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f7039a;

        /* renamed from: b  reason: collision with root package name */
        int f7040b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.tesla.widget.d f7041c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f7042d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f7043e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ l f7044f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ AppWidgetManager f7045g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f7046h;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.tesla.widget.VehicleWidgetBuilder$updateAppWidget$1$widgetType$1", f = "VehicleWidgetBuilder.kt", l = {68}, m = "invokeSuspend")
        /* loaded from: classes6.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements p<o0, zz.d<? super c>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f7047a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ j f7048b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ l f7049c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, l lVar, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f7048b = jVar;
                this.f7049c = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
                return new a(this.f7048b, this.f7049c, dVar);
            }

            @Override // h00.p
            public final Object invoke(o0 o0Var, zz.d<? super c> dVar) {
                return ((a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f7047a;
                if (i11 == 0) {
                    r.b(obj);
                    j jVar = this.f7048b;
                    l lVar = this.f7049c;
                    this.f7047a = 1;
                    obj = jVar.f(lVar, this);
                    if (obj == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    r.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(com.tesla.widget.d dVar, Context context, j jVar, l lVar, AppWidgetManager appWidgetManager, int i11, zz.d<? super h> dVar2) {
            super(2, dVar2);
            this.f7041c = dVar;
            this.f7042d = context;
            this.f7043e = jVar;
            this.f7044f = lVar;
            this.f7045g = appWidgetManager;
            this.f7046h = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new h(this.f7041c, this.f7042d, this.f7043e, this.f7044f, this.f7045g, this.f7046h, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((h) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            RemoteViews remoteViews;
            d11 = a00.d.d();
            int i11 = this.f7040b;
            if (i11 == 0) {
                r.b(obj);
                j0 b11 = e1.b();
                a aVar = new a(this.f7043e, this.f7044f, null);
                this.f7040b = 1;
                obj = v20.i.g(b11, aVar, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                remoteViews = (RemoteViews) this.f7039a;
                r.b(obj);
                av.a.a().i("Setup done, widget should be refreshed");
                this.f7045g.updateAppWidget(this.f7046h, remoteViews);
                return b0.f54756a;
            } else {
                r.b(obj);
            }
            c cVar = (c) obj;
            RemoteViews a11 = cVar.a(this.f7041c, this.f7042d);
            com.tesla.logging.g a12 = av.a.a();
            a12.i("Successfully generated widget type, current type: " + cVar + " ,start setup");
            j jVar = this.f7043e;
            Context context = this.f7042d;
            l lVar = this.f7044f;
            this.f7039a = a11;
            this.f7040b = 2;
            if (jVar.g(a11, cVar, context, lVar, this) == d11) {
                return d11;
            }
            remoteViews = a11;
            av.a.a().i("Setup done, widget should be refreshed");
            this.f7045g.updateAppWidget(this.f7046h, remoteViews);
            return b0.f54756a;
        }
    }

    public j(cv.i vehicleRepository, ev.a widgetDependencies, bv.b vehicleCommandMarker) {
        s.g(vehicleRepository, "vehicleRepository");
        s.g(widgetDependencies, "widgetDependencies");
        s.g(vehicleCommandMarker, "vehicleCommandMarker");
        this.f6999a = vehicleRepository;
        this.f7000b = widgetDependencies;
        this.f7001c = vehicleCommandMarker;
        this.f7002d = av.a.a().n("WidgetBuilder");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(av.l r11, zz.d<? super av.j.c> r12) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: av.j.f(av.l, zz.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(android.widget.RemoteViews r19, av.j.c r20, android.content.Context r21, av.l r22, zz.d<? super vz.b0> r23) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: av.j.g(android.widget.RemoteViews, av.j$c, android.content.Context, av.l, zz.d):java.lang.Object");
    }

    private final void h(RemoteViews remoteViews, Context context, com.tesla.widget.d dVar, int i11) {
        int i12 = av.f.refresh_zone;
        remoteViews.setViewVisibility(i12, 0);
        remoteViews.setOnClickPendingIntent(i12, dVar.getRefreshPendingIntent(context, Integer.valueOf(i11)));
    }

    private final void i(RemoteViews remoteViews, Context context, String str) {
        remoteViews.setTextViewText(av.f.widget_default_title, context.getText(av.h.f6992n));
        remoteViews.setViewVisibility(av.f.widget_default_subtitle, 8);
        if (str != null) {
            remoteViews.setOnClickPendingIntent(av.f.widget_root, m.j(context, str));
        } else {
            remoteViews.setOnClickPendingIntent(av.f.widget_root, m.b(context, this.f7000b));
        }
        remoteViews.setImageViewResource(av.f.vehicle_image, av.e.red_m3_place_holder);
    }

    private final void j(RemoteViews remoteViews, Context context) {
        remoteViews.setTextViewText(av.f.widget_default_title, context.getText(av.h.f6990l));
        remoteViews.setTextViewText(av.f.widget_default_subtitle, context.getText(av.h.f6993o));
        remoteViews.setOnClickPendingIntent(av.f.widget_root, m.a(context));
        remoteViews.setImageViewResource(av.f.vehicle_image, av.e.red_m3_place_holder);
    }

    private final void k(RemoteViews remoteViews, Context context, int i11) {
        PendingIntent b11;
        remoteViews.setTextViewText(av.f.widget_default_title, context.getText(av.h.f6990l));
        remoteViews.setTextViewText(av.f.widget_default_subtitle, context.getText(av.h.f6989k));
        int i12 = av.f.widget_root;
        if (this.f6999a.b() > 1) {
            b11 = m.k(context, i11);
        } else {
            b11 = m.b(context, this.f7000b);
        }
        remoteViews.setOnClickPendingIntent(i12, b11);
        remoteViews.setImageViewResource(av.f.vehicle_image, av.e.red_m3_place_holder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(android.widget.RemoteViews r7, android.content.Context r8, cu.a r9, zz.d<? super vz.b0> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof av.j.f
            if (r0 == 0) goto L13
            r0 = r10
            av.j$f r0 = (av.j.f) r0
            int r1 = r0.f7033e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7033e = r1
            goto L18
        L13:
            av.j$f r0 = new av.j$f
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f7031c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f7033e
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 != r5) goto L33
            java.lang.Object r7 = r0.f7030b
            android.widget.RemoteViews r7 = (android.widget.RemoteViews) r7
            java.lang.Object r8 = r0.f7029a
            av.j r8 = (av.j) r8
            vz.r.b(r10)
            goto L6e
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            vz.r.b(r10)
            ct.i r10 = ct.i.i()
            java.lang.String r8 = av.n.f(r9, r8)
            boolean r2 = av.n.g(r9)
            if (r2 == 0) goto L57
            if (r8 == 0) goto L57
            int r9 = av.f.vehicle_charge_time
            r7.setTextViewText(r9, r8)
            r7.setViewVisibility(r9, r3)
            goto La0
        L57:
            v20.j0 r8 = v20.e1.b()
            av.j$g r2 = new av.j$g
            r2.<init>(r9, r6, r10, r4)
            r0.f7029a = r6
            r0.f7030b = r7
            r0.f7033e = r5
            java.lang.Object r10 = v20.i.g(r8, r2, r0)
            if (r10 != r1) goto L6d
            return r1
        L6d:
            r8 = r6
        L6e:
            java.lang.String r10 = (java.lang.String) r10
            com.tesla.logging.g r8 = r8.f7002d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "got vehicle location : "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.a(r9)
            int r8 = av.f.vehicle_charge_time
            if (r10 != 0) goto L8b
            goto L96
        L8b:
            int r9 = r10.length()
            if (r9 <= 0) goto L92
            r3 = r5
        L92:
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r3)
        L96:
            int r9 = av.a.b(r4)
            r7.setViewVisibility(r8, r9)
            r7.setTextViewText(r8, r10)
        La0:
            vz.b0 r7 = vz.b0.f54756a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: av.j.l(android.widget.RemoteViews, android.content.Context, cu.a, zz.d):java.lang.Object");
    }

    private final void m(RemoteViews remoteViews, cu.a aVar, Context context) {
        w2 g11;
        b0 b0Var = null;
        remoteViews.setTextViewText(av.f.widget_default_title, (aVar == null || (g11 = aVar.g()) == null) ? null : et.a.k(g11));
        remoteViews.setTextViewText(av.f.widget_default_subtitle, context.getText(av.h.f6991m));
        if (aVar != null) {
            n(remoteViews, context, aVar);
            remoteViews.setOnClickPendingIntent(av.f.widget_root, m.i(context, aVar));
            b0Var = b0.f54756a;
        }
        if (b0Var == null) {
            remoteViews.setOnClickPendingIntent(av.f.widget_root, m.b(context, this.f7000b));
        }
    }

    private final void n(RemoteViews remoteViews, Context context, cu.a aVar) {
        Bitmap decodeFile;
        String d11 = n.d(aVar, context);
        b0 b0Var = null;
        if (d11 != null && (decodeFile = BitmapFactory.decodeFile(d11)) != null) {
            remoteViews.setImageViewBitmap(av.f.vehicle_image, decodeFile);
            b0Var = b0.f54756a;
        }
        if (b0Var == null) {
            remoteViews.setImageViewResource(av.f.vehicle_image, n.e(aVar));
        }
    }

    private final void o(RemoteViews remoteViews, Context context, int i11) {
        if (this.f6999a.b() > 1) {
            remoteViews.setOnClickPendingIntent(av.f.vehicle_name, m.k(context, i11));
            remoteViews.setOnClickPendingIntent(av.f.widget_default_title, m.k(context, i11));
        }
    }

    private final void p(RemoteViews remoteViews, Context context, cu.a aVar) {
        int i11;
        int color;
        u n11;
        long elapsedRealtime;
        w2 g11 = aVar.g();
        String k11 = g11 == null ? null : et.a.k(g11);
        if (k11 == null) {
            k11 = context.getString(av.h.f6985g);
            s.f(k11, "context.getString(R.stri…fault_name_model_unknown)");
        }
        remoteViews.setTextViewText(av.f.vehicle_name, k11);
        if (et.a.K(aVar)) {
            i11 = av.e.ic_unlock;
        } else {
            i11 = av.e.ic_lock;
        }
        Icon createWithResource = Icon.createWithResource(context, i11);
        int i12 = av.c.control_button_icon_enable_tint;
        createWithResource.setTint(context.getColor(i12));
        remoteViews.setImageViewIcon(av.f.f6977f, createWithResource);
        n(remoteViews, context, aVar);
        remoteViews.setImageViewBitmap(av.f.battery_image, f6998e.a(context, aVar));
        Integer c11 = n.c(aVar);
        if (c11 != null) {
            int intValue = c11.intValue();
            int i13 = av.f.battery_range;
            remoteViews.setTextViewText(i13, intValue + " " + n.b(aVar, context));
            remoteViews.setTextColor(i13, context.getColor(n.a(aVar)));
        }
        remoteViews.setViewVisibility(av.f.battery_blot, av.a.b(Boolean.valueOf(n.g(aVar))));
        cu.b c12 = aVar.c();
        boolean z11 = false;
        if (c12 != null && c12.e()) {
            z11 = true;
        }
        if (z11) {
            color = context.getColor(i12);
        } else {
            color = context.getColor(av.c.control_button_icon_normal_tint);
        }
        Icon createWithResource2 = Icon.createWithResource(context, av.e.ic_phonekey);
        createWithResource2.setTint(color);
        int i14 = av.f.vehicle_phone_key;
        remoteViews.setViewVisibility(i14, av.a.b(Boolean.valueOf(et.a.s(aVar))));
        remoteViews.setImageViewIcon(i14, createWithResource2);
        int i15 = av.f.vehicle_sentry_mode;
        w2 g12 = aVar.g();
        remoteViews.setViewVisibility(i15, av.a.b(g12 == null ? null : Boolean.valueOf(et.a.G(g12))));
        w2 g13 = aVar.g();
        Instant F0 = (g13 == null || (n11 = g13.n()) == null) ? null : n11.F0();
        if (F0 != null) {
            elapsedRealtime = (SystemClock.elapsedRealtime() - System.currentTimeMillis()) + F0.toEpochMilli();
        } else {
            elapsedRealtime = SystemClock.elapsedRealtime();
        }
        remoteViews.setChronometer(av.f.vehicle_update_chronometer, elapsedRealtime, context.getString(av.h.f6994p), true);
        remoteViews.setOnClickPendingIntent(av.f.widget_root, m.i(context, aVar));
        int i16 = av.f.service_mode_label;
        w2 g14 = aVar.g();
        remoteViews.setViewVisibility(i16, av.a.b(g14 == null ? null : Boolean.valueOf(et.a.C(g14))));
        int i17 = av.f.service_mode_overlay;
        w2 g15 = aVar.g();
        remoteViews.setViewVisibility(i17, av.a.b(g15 != null ? Boolean.valueOf(et.a.C(g15)) : null));
    }

    public final void q(Context context, l widgetBuilderConfig) {
        s.g(context, "context");
        s.g(widgetBuilderConfig, "widgetBuilderConfig");
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        int a11 = widgetBuilderConfig.a();
        com.tesla.widget.d b11 = widgetBuilderConfig.b();
        com.tesla.logging.g gVar = this.f7002d;
        gVar.a("start widget update type :" + b11);
        v20.k.d(p0.b(), null, null, new h(b11, context, this, widgetBuilderConfig, appWidgetManager, a11, null), 3, null);
    }
}