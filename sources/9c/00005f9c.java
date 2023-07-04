package com.tesla.command;

import android.app.Notification;
import android.content.Context;
import androidx.core.app.m;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.b0;
import androidx.work.h;
import androidx.work.s;
import ch.qos.logback.core.CoreConstants;
import com.tesla.logging.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import nu.j;
import os.c;
import ot.b;
import ot.e;
import vz.p;
import wz.e0;
import wz.x0;

/* loaded from: classes6.dex */
public final class CommandCenterBackgroundTasker {

    /* renamed from: a  reason: collision with root package name */
    public static final CommandCenterBackgroundTasker f21463a = new CommandCenterBackgroundTasker();

    /* renamed from: b  reason: collision with root package name */
    private static final g f21464b = g.f21878b.a("CommandCenterBackgroundTasker");

    /* renamed from: c  reason: collision with root package name */
    private static final Set<String> f21465c;

    /* renamed from: d  reason: collision with root package name */
    private static final List<b> f21466d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/tesla/command/CommandCenterBackgroundTasker$OnGoingCommandWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "command_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes6.dex */
    public static final class OnGoingCommandWorker extends CoroutineWorker {

        /* renamed from: a  reason: collision with root package name */
        public static final a f21467a = new a(null);

        /* renamed from: b  reason: collision with root package name */
        private static final g f21468b = g.f21878b.a("OnGoingCommandWorker");

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
                    b0.i(context).c("OnGoingCommandWorker");
                } catch (Exception e11) {
                    OnGoingCommandWorker.f21468b.d("Failed to cancel on going command worker", e11);
                }
            }

            public final void b(Context context) {
                s.g(context, "context");
                try {
                    OnGoingCommandWorker.f21468b.i("Scheduling worker...");
                    b0.i(context).g("OnGoingCommandWorker", h.REPLACE, new s.a(OnGoingCommandWorker.class).b());
                } catch (Exception e11) {
                    OnGoingCommandWorker.f21468b.d("Failed to schedule on going command worker", e11);
                }
            }

            public final void c(Context context, List<ot.b> onGoingCommands) {
                kotlin.jvm.internal.s.g(context, "context");
                kotlin.jvm.internal.s.g(onGoingCommands, "onGoingCommands");
                p<Integer, Notification> a11 = os.a.f43972a.a(context, onGoingCommands);
                m.e(context).g(a11.a().intValue(), a11.b());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "com.tesla.command.CommandCenterBackgroundTasker$OnGoingCommandWorker", f = "CommandCenterBackgroundTasker.kt", l = {354, 357}, m = "doWork")
        /* loaded from: classes6.dex */
        public static final class b extends d {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f21469a;

            /* renamed from: c  reason: collision with root package name */
            int f21471c;

            b(zz.d<? super b> dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f21469a = obj;
                this.f21471c |= Integer.MIN_VALUE;
                return OnGoingCommandWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnGoingCommandWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
            kotlin.jvm.internal.s.g(context, "context");
            kotlin.jvm.internal.s.g(workerParameters, "workerParameters");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00bd A[RETURN] */
        @Override // androidx.work.CoroutineWorker
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object doWork(zz.d<? super androidx.work.ListenableWorker.a> r8) {
            /*
                r7 = this;
                boolean r0 = r8 instanceof com.tesla.command.CommandCenterBackgroundTasker.OnGoingCommandWorker.b
                if (r0 == 0) goto L13
                r0 = r8
                com.tesla.command.CommandCenterBackgroundTasker$OnGoingCommandWorker$b r0 = (com.tesla.command.CommandCenterBackgroundTasker.OnGoingCommandWorker.b) r0
                int r1 = r0.f21471c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f21471c = r1
                goto L18
            L13:
                com.tesla.command.CommandCenterBackgroundTasker$OnGoingCommandWorker$b r0 = new com.tesla.command.CommandCenterBackgroundTasker$OnGoingCommandWorker$b
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f21469a
                java.lang.Object r1 = a00.b.d()
                int r2 = r0.f21471c
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L39
                if (r2 == r4) goto L35
                if (r2 != r3) goto L2d
                vz.r.b(r8)
                goto Lbe
            L2d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L35:
                vz.r.b(r8)
                goto Lb2
            L39:
                vz.r.b(r8)
                com.tesla.logging.g r8 = com.tesla.command.CommandCenterBackgroundTasker.OnGoingCommandWorker.f21468b
                int r2 = r7.getRunAttemptCount()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Running... "
                r5.append(r6)
                r5.append(r2)
                java.lang.String r2 = r5.toString()
                r8.i(r2)
                int r8 = r7.getRunAttemptCount()
                if (r8 <= 0) goto L66
                androidx.work.ListenableWorker$a r8 = androidx.work.ListenableWorker.a.c()
                java.lang.String r0 = "success()"
                kotlin.jvm.internal.s.f(r8, r0)
                return r8
            L66:
                java.util.List r8 = com.tesla.command.CommandCenterBackgroundTasker.a()
                monitor-enter(r8)
                java.util.List r2 = com.tesla.command.CommandCenterBackgroundTasker.a()     // Catch: java.lang.Throwable -> Lcf
                boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> Lcf
                if (r2 == 0) goto L80
                androidx.work.ListenableWorker$a r0 = androidx.work.ListenableWorker.a.c()     // Catch: java.lang.Throwable -> Lcf
                java.lang.String r1 = "success()"
                kotlin.jvm.internal.s.f(r0, r1)     // Catch: java.lang.Throwable -> Lcf
                monitor-exit(r8)
                return r0
            L80:
                os.a r2 = os.a.f43972a     // Catch: java.lang.Throwable -> Lcf
                android.content.Context r5 = r7.getApplicationContext()     // Catch: java.lang.Throwable -> Lcf
                java.lang.String r6 = "applicationContext"
                kotlin.jvm.internal.s.f(r5, r6)     // Catch: java.lang.Throwable -> Lcf
                java.util.List r6 = com.tesla.command.CommandCenterBackgroundTasker.a()     // Catch: java.lang.Throwable -> Lcf
                vz.p r2 = r2.a(r5, r6)     // Catch: java.lang.Throwable -> Lcf
                monitor-exit(r8)
                java.lang.Object r8 = r2.a()
                java.lang.Number r8 = (java.lang.Number) r8
                int r8 = r8.intValue()
                java.lang.Object r2 = r2.b()
                android.app.Notification r2 = (android.app.Notification) r2
                androidx.work.i r5 = new androidx.work.i
                r5.<init>(r8, r2)
                r0.f21471c = r4
                java.lang.Object r8 = r7.setForeground(r5, r0)
                if (r8 != r1) goto Lb2
                return r1
            Lb2:
                r4 = 60000(0xea60, double:2.9644E-319)
                r0.f21471c = r3
                java.lang.Object r8 = v20.y0.b(r4, r0)
                if (r8 != r1) goto Lbe
                return r1
            Lbe:
                com.tesla.logging.g r8 = com.tesla.command.CommandCenterBackgroundTasker.OnGoingCommandWorker.f21468b
                java.lang.String r0 = "Done."
                r8.i(r0)
                androidx.work.ListenableWorker$a r8 = androidx.work.ListenableWorker.a.c()
                java.lang.String r0 = "success()"
                kotlin.jvm.internal.s.f(r8, r0)
                return r8
            Lcf:
                r0 = move-exception
                monitor-exit(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tesla.command.CommandCenterBackgroundTasker.OnGoingCommandWorker.doWork(zz.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f21472a;

        /* renamed from: b  reason: collision with root package name */
        private final String f21473b;

        public a(String title, String text) {
            kotlin.jvm.internal.s.g(title, "title");
            kotlin.jvm.internal.s.g(text, "text");
            this.f21472a = title;
            this.f21473b = text;
        }

        public final String a() {
            return this.f21472a;
        }

        public final String b() {
            return this.f21473b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return kotlin.jvm.internal.s.c(this.f21472a, aVar.f21472a) && kotlin.jvm.internal.s.c(this.f21473b, aVar.f21473b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f21472a.hashCode() * 31) + this.f21473b.hashCode();
        }

        public String toString() {
            String str = this.f21472a;
            String str2 = this.f21473b;
            return "NotificationPresentation(title=" + str + ", text=" + str2 + ")";
        }
    }

    static {
        Set<String> i11;
        i11 = x0.i("already_set", "already_unset", "already closed", "already open", "already on");
        f21465c = i11;
        f21466d = new ArrayList();
    }

    private CommandCenterBackgroundTasker() {
    }

    private final a b(b bVar, Context context) {
        String string = context.getString(c.f43975b);
        kotlin.jvm.internal.s.f(string, "context.getString(R.stri…ask_failed_default_title)");
        String string2 = context.getString(c.f43974a);
        kotlin.jvm.internal.s.f(string2, "context.getString(R.stri…task_failed_default_body)");
        return new a(string, string2);
    }

    private final int c() {
        return f21466d.size();
    }

    private final boolean g(b bVar) {
        return false;
    }

    private final boolean h(e eVar) {
        boolean T;
        if (eVar.h() == ot.f.RESULT_SUCCESS) {
            return false;
        }
        T = e0.T(f21465c, eVar.i());
        return !T;
    }

    private final void i(Context context, b bVar) {
        a b11 = b(bVar, context);
        if (b11 == null) {
            return;
        }
        String a11 = b11.a();
        Notification b12 = j.e(context).m(a11).l(b11.b()).b();
        kotlin.jvm.internal.s.f(b12, "getDefaultNotificationBu…Text(body)\n      .build()");
        g gVar = f21464b;
        String a12 = com.tesla.data.oapi.c.a(bVar);
        gVar.i("Showing failure notification for " + a12);
        m.e(context).g(a11.hashCode(), b12);
    }

    public final void d(Context context, b action, e response) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(action, "action");
        kotlin.jvm.internal.s.g(response, "response");
        if (h(response) && zu.c.f60760g3.a(context).e() && g(action)) {
            i(context, action);
        }
    }

    public final void e(Context context, b action) {
        Object obj;
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(action, "action");
        if (g(action)) {
            synchronized (this) {
                Iterator<T> it2 = f21466d.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (kotlin.jvm.internal.s.c((b) obj, action)) {
                        break;
                    }
                }
                b bVar = (b) obj;
                if (bVar != null) {
                    List<b> list = f21466d;
                    if (list.remove(bVar)) {
                        OnGoingCommandWorker.f21467a.c(context, list);
                    }
                }
                g gVar = f21464b;
                CommandCenterBackgroundTasker commandCenterBackgroundTasker = f21463a;
                int c11 = commandCenterBackgroundTasker.c();
                gVar.i("On-going command count: " + c11);
                if (commandCenterBackgroundTasker.c() == 0) {
                    gVar.i("Killing on-going command worker...");
                    OnGoingCommandWorker.f21467a.a(context);
                }
                vz.b0 b0Var = vz.b0.f54756a;
            }
        }
    }

    public final void f(Context context, b action) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(action, "action");
        if (g(action)) {
            synchronized (this) {
                List<b> list = f21466d;
                list.add(action);
                g gVar = f21464b;
                CommandCenterBackgroundTasker commandCenterBackgroundTasker = f21463a;
                int c11 = commandCenterBackgroundTasker.c();
                gVar.i("On-going command count: " + c11);
                if (commandCenterBackgroundTasker.c() == 1) {
                    String a11 = com.tesla.data.oapi.c.a(action);
                    gVar.i("Starting on-going command worker... " + a11);
                    OnGoingCommandWorker.f21467a.b(context);
                } else {
                    gVar.i("Updating on-going commands notification...");
                    OnGoingCommandWorker.f21467a.c(context, list);
                }
                vz.b0 b0Var = vz.b0.f54756a;
            }
        }
    }
}