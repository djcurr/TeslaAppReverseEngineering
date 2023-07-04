package com.tesla.widget.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.e;
import androidx.work.h;
import androidx.work.s;
import av.j;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import com.tesla.utils.DummyWorker;
import h00.p;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.u;
import v20.o0;
import v20.p0;
import vz.b0;
import vz.k;
import vz.m;
import vz.r;
import vz.v;
import wz.r0;
import zz.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/tesla/widget/worker/UpdateWidgetWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "b", "a", "widget_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class UpdateWidgetWorker extends CoroutineWorker {

    /* renamed from: b  reason: collision with root package name */
    public static final a f22023b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final g f22024c = g.f21878b.a("UpdateWidgetWorker");

    /* renamed from: d  reason: collision with root package name */
    private static final k<g> f22025d;

    /* renamed from: a  reason: collision with root package name */
    private final k f22026a;

    /* loaded from: classes6.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "com.tesla.widget.worker.UpdateWidgetWorker$Companion$scheduleWidgetUpdate$1", f = "UpdateWidgetWorker.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.tesla.widget.worker.UpdateWidgetWorker$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0403a extends l implements p<o0, d<? super b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f22027a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f22028b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f22029c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ com.tesla.widget.d f22030d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Long f22031e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ boolean f22032f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ com.tesla.widget.b f22033g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ boolean f22034h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0403a(Context context, int i11, com.tesla.widget.d dVar, Long l11, boolean z11, com.tesla.widget.b bVar, boolean z12, d<? super C0403a> dVar2) {
                super(2, dVar2);
                this.f22028b = context;
                this.f22029c = i11;
                this.f22030d = dVar;
                this.f22031e = l11;
                this.f22032f = z11;
                this.f22033g = bVar;
                this.f22034h = z12;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<b0> create(Object obj, d<?> dVar) {
                return new C0403a(this.f22028b, this.f22029c, this.f22030d, this.f22031e, this.f22032f, this.f22033g, this.f22034h, dVar);
            }

            @Override // h00.p
            public final Object invoke(o0 o0Var, d<? super b0> dVar) {
                return ((C0403a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a00.d.d();
                if (this.f22027a == 0) {
                    r.b(obj);
                    try {
                        DummyWorker.f21983b.c(this.f22028b);
                        s f11 = UpdateWidgetWorker.f22023b.f(this.f22029c, this.f22030d, this.f22031e, this.f22032f, this.f22033g);
                        if (this.f22034h) {
                            androidx.work.b0.i(this.f22028b).g("com.teslamotors.tesla.key-unique-widget-id", h.REPLACE, f11);
                        } else {
                            androidx.work.b0.i(this.f22028b).d(f11);
                        }
                    } catch (Exception e11) {
                        UpdateWidgetWorker.f22024c.d("Failed to schedule widget update worker", e11);
                    }
                    return b0.f54756a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final g c() {
            return (g) UpdateWidgetWorker.f22025d.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final s f(int i11, com.tesla.widget.d dVar, Long l11, boolean z11, com.tesla.widget.b bVar) {
            e.a e11 = new e.a().f("app_widget_id", i11).g("app_widget_type", dVar.name()).e("with_vehicle_cache", z11);
            kotlin.jvm.internal.s.f(e11, "Builder()\n        .putIn…_WIDGET_CACHE, withCache)");
            if (bVar != null) {
                e11.g("execution", bVar.name());
            }
            s.a h11 = new s.a(UpdateWidgetWorker.class).e(androidx.work.a.EXPONENTIAL, 30L, TimeUnit.SECONDS).h(e11.a());
            kotlin.jvm.internal.s.f(h11, "OneTimeWorkRequestBuilde…utData(inputData.build())");
            s.a aVar = h11;
            if (l11 != null) {
                aVar.g(l11.longValue(), TimeUnit.MILLISECONDS);
            }
            s b11 = aVar.b();
            kotlin.jvm.internal.s.f(b11, "builder.build()");
            s sVar = b11;
            g c11 = c();
            UUID a11 = sVar.a();
            c11.a("Scheduling " + dVar + " widget-" + i11 + " update worker: " + a11 + " with delay " + l11);
            return sVar;
        }

        public final void d(int i11, Context context, com.tesla.widget.d type, com.tesla.widget.b bVar, Long l11, boolean z11, boolean z12) {
            kotlin.jvm.internal.s.g(context, "context");
            kotlin.jvm.internal.s.g(type, "type");
            v20.k.d(p0.b(), null, null, new C0403a(context, i11, type, l11, z11, bVar, z12, null), 3, null);
        }
    }

    /* loaded from: classes6.dex */
    static final class b extends u implements h00.a<g> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f22035a = new b();

        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final g invoke() {
            return av.a.a().n("WidgetUpdateWorker");
        }
    }

    /* loaded from: classes6.dex */
    static final class c extends u implements h00.a<j> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f22036a = new c();

        c() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final j invoke() {
            return ev.b.f25256a.c();
        }
    }

    static {
        k<g> a11;
        a11 = m.a(b.f22035a);
        f22025d = a11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UpdateWidgetWorker(android.content.Context r2, androidx.work.WorkerParameters r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.s.g(r2, r0)
            java.lang.String r0 = "workerParams"
            kotlin.jvm.internal.s.g(r3, r0)
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "context.applicationContext"
            kotlin.jvm.internal.s.f(r2, r0)
            r1.<init>(r2, r3)
            com.tesla.widget.worker.UpdateWidgetWorker$c r2 = com.tesla.widget.worker.UpdateWidgetWorker.c.f22036a
            vz.k r2 = vz.l.a(r2)
            r1.f22026a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tesla.widget.worker.UpdateWidgetWorker.<init>(android.content.Context, androidx.work.WorkerParameters):void");
    }

    private final j d() {
        return (j) this.f22026a.getValue();
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(d<? super ListenableWorker.a> dVar) {
        Enum r72;
        com.tesla.widget.b bVar;
        Map f11;
        int i11 = getInputData().i("app_widget_id", 0);
        String k11 = getInputData().k("app_widget_type");
        com.tesla.widget.d a11 = k11 == null ? null : av.k.a(k11);
        String k12 = getInputData().k("execution");
        if (k12 == null) {
            bVar = null;
        } else {
            Object[] enumConstants = com.tesla.widget.b.class.getEnumConstants();
            kotlin.jvm.internal.s.f(enumConstants, "T::class.java.enumConstants");
            int length = enumConstants.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    r72 = null;
                    break;
                }
                r72 = enumConstants[i12];
                if (kotlin.jvm.internal.s.c(((Enum) r72).name(), k12)) {
                    break;
                }
                i12++;
            }
            bVar = (com.tesla.widget.b) r72;
        }
        boolean h11 = getInputData().h("with_vehicle_cache", false);
        if (i11 == 0 || a11 == null) {
            g c11 = f22023b.c();
            String str = "appWidget-id: " + i11 + " or type: " + a11 + " is null";
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String h12 = c11.h();
            ht.a aVar = ht.a.f29422a;
            f11 = r0.f(v.a(h12, str));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : f11.entrySet()) {
                ht.a.f29422a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(str));
            TeslaLog.setTag$default(teslaLog, h12, false, 2, null);
            n80.a.a(str, new Object[0]);
            ListenableWorker.a a12 = ListenableWorker.a.a();
            kotlin.jvm.internal.s.f(a12, "failure()");
            return a12;
        }
        f22023b.c().a("Updating widget via worker:" + getId() + " for appWidget-id: " + i11 + " , type: " + a11 + " ");
        j d11 = d();
        Context applicationContext = getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext, "applicationContext");
        if (bVar == null) {
            bVar = com.tesla.widget.b.NONE;
        }
        d11.q(applicationContext, new av.l(i11, a11, h11, bVar));
        ListenableWorker.a c12 = ListenableWorker.a.c();
        kotlin.jvm.internal.s.f(c12, "success()");
        return c12;
    }
}