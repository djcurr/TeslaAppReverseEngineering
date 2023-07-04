package com.tesla.TeslaV4;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.LocaleList;
import at.k;
import com.tesla.TeslaV4.InitializingContentProvider;
import com.tesla.calendar.SyncCalendarWorker;
import com.tesla.command.VehicleConnectivityStateManager;
import com.tesla.domain.model.DataRestrictedCountry;
import com.tesla.logging.g;
import ct.i;
import h00.l;
import io.realm.a0;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.text.w;
import ot.e;
import ot.f;
import ss.j;
import ss.q;
import vz.b0;
import wz.p0;
import ys.m;
import yu.y;
import zu.h;
import zu.x;
import zu.z;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tesla/TeslaV4/InitializingContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class InitializingContentProvider extends ContentProvider {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private static final g f21375a = g.f21878b.a("InitializingContentProvider");

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements z {

        /* renamed from: a */
        final /* synthetic */ Context f21376a;

        b(Context context) {
            this.f21376a = context;
        }

        @Override // zu.z
        public void a(String key, String value) {
            Boolean c12;
            s.g(key, "key");
            s.g(value, "value");
            c12 = w.c1(value);
            if (c12 == null) {
                return;
            }
            InitializingContentProvider.e(this.f21376a, c12.booleanValue());
        }

        @Override // zu.z
        public void b(String str) {
            z.a.a(this, str);
        }
    }

    /* loaded from: classes6.dex */
    public static final class c implements VehicleConnectivityStateManager.b {

        /* renamed from: a */
        final /* synthetic */ ConcurrentHashMap<String, Long> f21377a;

        /* renamed from: b */
        final /* synthetic */ d f21378b;

        /* loaded from: classes6.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f21379a;

            static {
                int[] iArr = new int[VehicleConnectivityStateManager.c.values().length];
                iArr[VehicleConnectivityStateManager.c.ONLINE.ordinal()] = 1;
                iArr[VehicleConnectivityStateManager.c.UNKNOWN.ordinal()] = 2;
                iArr[VehicleConnectivityStateManager.c.OFFLINE.ordinal()] = 3;
                f21379a = iArr;
            }
        }

        /* loaded from: classes6.dex */
        static final class b extends u implements l<Boolean, b0> {

            /* renamed from: a */
            public static final b f21380a = new b();

            b() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ b0 mo12invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return b0.f54756a;
            }

            public final void invoke(boolean z11) {
            }
        }

        c(ConcurrentHashMap<String, Long> concurrentHashMap, d dVar) {
            this.f21377a = concurrentHashMap;
            this.f21378b = dVar;
        }

        @Override // com.tesla.command.VehicleConnectivityStateManager.b
        public boolean a(String vehicleId, VehicleConnectivityStateManager.c state) {
            s.g(vehicleId, "vehicleId");
            s.g(state, "state");
            if (a.f21379a[state.ordinal()] != 1) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f21377a.containsKey(vehicleId) && currentTimeMillis <= ((Number) p0.j(this.f21377a, vehicleId)).longValue() + 120000) {
                g gVar = InitializingContentProvider.f21375a;
                gVar.a("not sending calendar sync, cool-down in effect, last sent " + (currentTimeMillis - ((Number) p0.j(this.f21377a, vehicleId)).longValue()) + "ms ago.");
                return false;
            }
            this.f21377a.put(vehicleId, Long.valueOf(currentTimeMillis));
            this.f21378b.a(vehicleId, "vehicle-state-change", b.f21380a);
            return false;
        }
    }

    /* loaded from: classes6.dex */
    public static final class d implements ks.b {

        /* renamed from: a */
        final /* synthetic */ Context f21381a;

        /* renamed from: b */
        final /* synthetic */ j f21382b;

        d(Context context, j jVar) {
            this.f21381a = context;
            this.f21382b = jVar;
        }

        public static /* synthetic */ void b(l lVar, e eVar) {
            c(lVar, eVar);
        }

        public static final void c(l onSuccess, e it2) {
            s.g(onSuccess, "$onSuccess");
            s.g(it2, "it");
            if (it2.h() == f.RESULT_SUCCESS) {
                onSuccess.mo12invoke(Boolean.TRUE);
            } else {
                onSuccess.mo12invoke(Boolean.FALSE);
            }
        }

        @Override // ks.b
        public void a(String vehicleId, String reason, final l<? super Boolean, b0> onSuccess) {
            s.g(vehicleId, "vehicleId");
            s.g(reason, "reason");
            s.g(onSuccess, "onSuccess");
            ot.c g11 = xs.b.g(xs.b.f57689a, vehicleId, "vehicle-state-change", yu.z.p(this.f21381a).n(), null, this.f21381a, 8, null);
            if (g11 == null) {
                return;
            }
            this.f21382b.b(g11, new uu.d() { // from class: zr.a
                @Override // uu.d
                public final void a(e eVar) {
                    InitializingContentProvider.d.b(l.this, eVar);
                }
            });
        }
    }

    private final void c(Context context) {
        h.f60771a.b(new hs.a(context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0017, code lost:
        r2 = kotlin.text.w.c1(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(android.content.Context r4, ss.j r5) {
        /*
            r3 = this;
            com.tesla.TeslaV4.InitializingContentProvider$d r0 = new com.tesla.TeslaV4.InitializingContentProvider$d
            r0.<init>(r4, r5)
            ks.a r5 = ks.a.f35700a
            r5.a(r0)
            ct.i r5 = ct.i.i()
            java.lang.String r1 = "CALENDAR_SYNC_ENABLED"
            java.lang.String r2 = r5.g(r1)
            if (r2 != 0) goto L17
            goto L25
        L17:
            java.lang.Boolean r2 = kotlin.text.m.c1(r2)
            if (r2 != 0) goto L1e
            goto L25
        L1e:
            boolean r2 = r2.booleanValue()
            e(r4, r2)
        L25:
            com.tesla.TeslaV4.InitializingContentProvider$b r2 = new com.tesla.TeslaV4.InitializingContentProvider$b
            r2.<init>(r4)
            r5.p(r1, r2)
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap
            r4.<init>()
            com.tesla.command.VehicleConnectivityStateManager r5 = com.tesla.command.VehicleConnectivityStateManager.f21488a
            com.tesla.TeslaV4.InitializingContentProvider$c r1 = new com.tesla.TeslaV4.InitializingContentProvider$c
            r1.<init>(r4, r0)
            r5.m(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tesla.TeslaV4.InitializingContentProvider.d(android.content.Context, ss.j):void");
    }

    public static final void e(Context context, boolean z11) {
        if (z11) {
            SyncCalendarWorker.f21460c.b(context);
        } else {
            SyncCalendarWorker.f21460c.a(context);
        }
    }

    private final j f(Context context) {
        return q.f50617j.a(context);
    }

    private final void g(Context context) {
        VehicleConnectivityStateManager vehicleConnectivityStateManager = VehicleConnectivityStateManager.f21488a;
        m mVar = new m(com.tesla.data.oapi.h.f21733b.a(context), y.f59842h.a(context));
        i i11 = i.i();
        s.f(i11, "getDB()");
        vehicleConnectivityStateManager.l(new yu.d(i11), mVar);
    }

    private final void h(Context context) {
        String str;
        DataRestrictedCountry.a.C0394a a11 = DataRestrictedCountry.Companion.a(context);
        String a12 = a11.a();
        String b11 = a11.b();
        LocaleList c11 = a11.c();
        g gVar = f21375a;
        gVar.i("Network country code: " + a12);
        gVar.i("Sim country code: " + b11);
        if (c11.isEmpty()) {
            gVar.i("No locales");
            return;
        }
        int i11 = 0;
        int size = c11.size();
        if (size <= 0) {
            return;
        }
        while (true) {
            int i12 = i11 + 1;
            Locale locale = c11.get(i11);
            try {
                str = locale.getISO3Country();
            } catch (Exception unused) {
                str = "";
            }
            g gVar2 = f21375a;
            String country = locale.getCountry();
            String displayCountry = locale.getDisplayCountry();
            String displayLanguage = locale.getDisplayLanguage();
            gVar2.i("locale[" + i11 + "] = {ISO2=" + country + ", ISO3=" + str + ", " + displayCountry + ", " + displayLanguage + "}");
            if (i12 >= size) {
                return;
            }
            i11 = i12;
        }
    }

    private final void i() {
        ut.a[] values;
        nu.b a11 = nu.b.f41870a.a();
        for (ut.a aVar : ut.a.values()) {
            nu.a a12 = ws.i.f56168a.a(aVar);
            if (a12 != null) {
                a11.c(aVar, a12);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        s.g(uri, "uri");
        return -1;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        s.g(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        s.g(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        s.e(context);
        Context appContext = context.getApplicationContext();
        s.f(appContext, "appContext");
        com.tesla.logging.e.b(appContext);
        g gVar = f21375a;
        gVar.i("onCreate started");
        gv.j.f28153a.c();
        c(appContext);
        if (zu.q.a()) {
            mu.c cVar = mu.c.f39463a;
            cVar.b((Application) appContext);
            cVar.d(h.f60771a.a(), appContext);
        }
        tt.l lVar = tt.l.ANDROID_INITIALIZER;
        lu.d.a(lVar);
        a0.h1(appContext);
        i();
        x.f60797a.b(appContext);
        cs.a.Companion.a().c(appContext);
        k.a(appContext);
        yu.z.p(appContext).H();
        yu.i iVar = yu.i.f59792a;
        i i11 = i.i();
        s.f(i11, "getDB()");
        iVar.e(i11);
        qu.i.f48492a.a(appContext);
        yu.e a11 = yu.e.f59783c.a();
        xs.b.f57689a.w(ys.j.f59731c.a(new ys.a(a11), a11));
        j f11 = f(appContext);
        g(appContext);
        it.c.f32751a.b(appContext);
        d(appContext, f11);
        h(appContext);
        lu.d.b(lVar);
        gVar.i("onCreate ended");
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        s.g(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        s.g(uri, "uri");
        return -1;
    }
}