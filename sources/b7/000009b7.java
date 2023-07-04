package androidx.work.impl;

import android.content.Context;
import androidx.room.q0;
import androidx.room.t0;
import androidx.work.impl.a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import k5.e;
import k5.k;
import k5.n;
import k5.q;
import k5.t;
import v4.g;
import v4.h;
import w4.c;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends t0 {

    /* renamed from: a  reason: collision with root package name */
    private static final long f6548a = TimeUnit.DAYS.toMillis(1);

    /* loaded from: classes.dex */
    class a implements h.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f6549a;

        a(Context context) {
            this.f6549a = context;
        }

        @Override // v4.h.c
        public h a(h.b bVar) {
            h.b.a a11 = h.b.a(this.f6549a);
            a11.c(bVar.f54037b).b(bVar.f54038c).d(true);
            return new c().a(a11.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends t0.b {
        b() {
        }

        @Override // androidx.room.t0.b
        public void c(g gVar) {
            super.c(gVar);
            gVar.beginTransaction();
            try {
                gVar.u(WorkDatabase.g());
                gVar.N();
            } finally {
                gVar.X();
            }
        }
    }

    public static WorkDatabase c(Context context, Executor executor, boolean z11) {
        t0.a a11;
        if (z11) {
            a11 = q0.c(context, WorkDatabase.class).c();
        } else {
            a11 = q0.a(context, WorkDatabase.class, d5.h.d());
            a11.f(new a(context));
        }
        return (WorkDatabase) a11.g(executor).a(e()).b(androidx.work.impl.a.f6558a).b(new a.h(context, 2, 3)).b(androidx.work.impl.a.f6559b).b(androidx.work.impl.a.f6560c).b(new a.h(context, 5, 6)).b(androidx.work.impl.a.f6561d).b(androidx.work.impl.a.f6562e).b(androidx.work.impl.a.f6563f).b(new a.i(context)).b(new a.h(context, 10, 11)).b(androidx.work.impl.a.f6564g).e().d();
    }

    static t0.b e() {
        return new b();
    }

    static long f() {
        return System.currentTimeMillis() - f6548a;
    }

    static String g() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + f() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract k5.b d();

    public abstract e h();

    public abstract k5.h i();

    public abstract k j();

    public abstract n k();

    public abstract q l();

    public abstract t m();
}