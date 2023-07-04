package com.tesla.features;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.b0;
import androidx.work.c;
import androidx.work.r;
import androidx.work.rxjava3.RxWorker;
import androidx.work.v;
import cg.c;
import ch.qos.logback.core.CoreConstants;
import com.tesla.features.RefreshFeaturesConfigWorker;
import com.tesla.logging.g;
import hy.m;
import it.e;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import ky.h;
import zu.c0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/tesla/features/RefreshFeaturesConfigWorker;", "Landroidx/work/rxjava3/RxWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", c.f9084i, "a", "features_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class RefreshFeaturesConfigWorker extends RxWorker {

    /* renamed from: c */
    public static final a f21861c = new a(null);

    /* renamed from: d */
    private static final g f21862d = g.f21878b.a("RefreshFeaturesConfigWorker");

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
                androidx.work.c b11 = new c.a().d(true).c(r.UNMETERED).e(true).b();
                s.f(b11, "Builder()\n          .set…(true)\n          .build()");
                TimeUnit timeUnit = TimeUnit.HOURS;
                v b12 = new v.a(RefreshFeaturesConfigWorker.class, 12L, timeUnit, 6L, timeUnit).f(b11).b();
                s.f(b12, "PeriodicWorkRequestBuild…ints(constraints).build()");
                b0.i(context).f("RefreshFeaturesConfigWorker", androidx.work.g.REPLACE, b12);
            } catch (Exception e11) {
                RefreshFeaturesConfigWorker.f21862d.d("Failed to schedule refresh config worker", e11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshFeaturesConfigWorker(Context context, WorkerParameters params) {
        super(context, params);
        s.g(context, "context");
        s.g(params, "params");
    }

    public static /* synthetic */ ListenableWorker.a d(c0 c0Var) {
        return g(c0Var);
    }

    public static final ListenableWorker.a g(c0 c0Var) {
        if (c0Var.c()) {
            return ListenableWorker.a.a();
        }
        return ListenableWorker.a.c();
    }

    @Override // androidx.work.rxjava3.RxWorker
    public m<ListenableWorker.a> a() {
        e.a aVar = e.f32754a;
        Context applicationContext = getApplicationContext();
        s.f(applicationContext, "applicationContext");
        m o11 = aVar.a(applicationContext).a(true).o(new h() { // from class: it.f
            @Override // ky.h
            public final Object apply(Object obj) {
                return RefreshFeaturesConfigWorker.d((c0) obj);
            }
        });
        s.f(o11, "GetFeaturesConfig.getIns…ccess()\n        }\n      }");
        return o11;
    }
}