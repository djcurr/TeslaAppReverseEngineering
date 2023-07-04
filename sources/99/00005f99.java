package com.tesla.calendar;

import android.content.Context;
import android.provider.CalendarContract;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.b0;
import androidx.work.c;
import androidx.work.h;
import androidx.work.r;
import androidx.work.rxjava3.RxWorker;
import androidx.work.s;
import cg.c;
import ch.qos.logback.core.CoreConstants;
import com.tesla.calendar.SyncCalendarWorker;
import com.tesla.domain.model.Vehicle;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import ct.i;
import h00.l;
import hy.m;
import hy.n;
import hy.p;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import yu.d;
import yu.z;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/tesla/calendar/SyncCalendarWorker;", "Landroidx/work/rxjava3/RxWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", c.f9084i, "a", "calendar_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SyncCalendarWorker extends RxWorker {

    /* renamed from: c */
    public static final a f21460c = new a(null);

    /* renamed from: d */
    private static final g f21461d = g.f21878b.a("SyncCalendarWorker");

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context) {
            s.g(context, "context");
            try {
                ns.b.f41863a.a("Cancelling calendar change worker");
                b0.i(context).c("SyncCalendarWorker_CalendarChanges");
            } catch (Exception e11) {
                SyncCalendarWorker.f21461d.d("Failed to cancel calendar worker", e11);
            }
        }

        public final void b(Context context) {
            s.g(context, "context");
            try {
                ns.b.f41863a.a("Scheduling calendar change worker");
                c.a c11 = new c.a().c(r.CONNECTED);
                s.f(c11, "Builder().setRequiredNet…pe(NetworkType.CONNECTED)");
                c.a a11 = c11.a(CalendarContract.CONTENT_URI, true);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                a11.f(15L, timeUnit);
                androidx.work.s b11 = new s.a(SyncCalendarWorker.class).f(c11.b()).e(androidx.work.a.EXPONENTIAL, 5L, timeUnit).b();
                kotlin.jvm.internal.s.f(b11, "OneTimeWorkRequestBuilde…CONDS)\n          .build()");
                b0.i(context).g("SyncCalendarWorker_CalendarChanges", h.REPLACE, b11);
            } catch (Exception e11) {
                SyncCalendarWorker.f21461d.d("Failed to schedule calendar worker", e11);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends u implements l<Boolean, vz.b0> {

        /* renamed from: a */
        final /* synthetic */ n<ListenableWorker.a> f21462a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n<ListenableWorker.a> nVar) {
            super(1);
            this.f21462a = nVar;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return vz.b0.f54756a;
        }

        public final void invoke(boolean z11) {
            this.f21462a.onSuccess(ListenableWorker.a.a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncCalendarWorker(Context context, WorkerParameters workerParams) {
        super(context.getApplicationContext(), workerParams);
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(workerParams, "workerParams");
    }

    public static /* synthetic */ void d(String str, n nVar) {
        i(str, nVar);
    }

    public static /* synthetic */ ListenableWorker.a e(Throwable th2) {
        return j(th2);
    }

    public static /* synthetic */ void g(SyncCalendarWorker syncCalendarWorker) {
        k(syncCalendarWorker);
    }

    public static final void i(String vehicleId, n nVar) {
        kotlin.jvm.internal.s.g(vehicleId, "$vehicleId");
        ks.c.f35701a.a().a(vehicleId, "calendar-updated", new b(nVar));
    }

    public static final ListenableWorker.a j(Throwable e11) {
        ns.b bVar = ns.b.f41863a;
        String message = e11.getMessage();
        bVar.a("Worker error " + message);
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        kotlin.jvm.internal.s.f(e11, "e");
        teslaLog.e("SyncCalendarWorker", "Error sending calendar data to vehicle", e11);
        return ListenableWorker.a.a();
    }

    public static final void k(SyncCalendarWorker this$0) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        ns.b.f41863a.a("Worker terminated, enqueuing calendar change worker.");
        a aVar = f21460c;
        Context applicationContext = this$0.getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext, "applicationContext");
        aVar.b(applicationContext);
    }

    @Override // androidx.work.rxjava3.RxWorker
    public m<ListenableWorker.a> a() {
        if (getRunAttemptCount() > 3) {
            ns.b.f41863a.a("Max retries reached for calendar changes worker, failing.");
            m<ListenableWorker.a> n11 = m.n(ListenableWorker.a.a());
            kotlin.jvm.internal.s.f(n11, "just(Result.failure())");
            return n11;
        } else if (!z.p(getApplicationContext()).n()) {
            ns.b.f41863a.a("Calendar sync not enabled, doing nothing more.");
            m<ListenableWorker.a> n12 = m.n(ListenableWorker.a.a());
            kotlin.jvm.internal.s.f(n12, "just(Result.failure())");
            return n12;
        } else {
            i i11 = i.i();
            kotlin.jvm.internal.s.f(i11, "getDB()");
            Vehicle a11 = new d(i11).a();
            if (a11 == null) {
                ns.b.f41863a.a("No selected vehicle.");
                m<ListenableWorker.a> n13 = m.n(ListenableWorker.a.a());
                kotlin.jvm.internal.s.f(n13, "just(Result.failure())");
                return n13;
            }
            final String id2 = a11.getId();
            m<ListenableWorker.a> h11 = m.e(new p() { // from class: ks.d
                @Override // hy.p
                public final void a(n nVar) {
                    SyncCalendarWorker.d(id2, nVar);
                }
            }).r(new ky.h() { // from class: ks.f
                @Override // ky.h
                public final Object apply(Object obj) {
                    return SyncCalendarWorker.e((Throwable) obj);
                }
            }).h(new ky.a() { // from class: ks.e
                {
                    SyncCalendarWorker.this = this;
                }

                @Override // ky.a
                public final void run() {
                    SyncCalendarWorker.g(SyncCalendarWorker.this);
                }
            });
            kotlin.jvm.internal.s.f(h11, "create<Result> { emitter…plicationContext)\n      }");
            return h11;
        }
    }
}