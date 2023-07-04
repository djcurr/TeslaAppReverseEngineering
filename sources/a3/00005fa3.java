package com.tesla.command;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.m;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.b0;
import androidx.work.e;
import androidx.work.s;
import ch.qos.logback.core.CoreConstants;
import com.tesla.logging.g;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import nu.j;
import v20.o0;
import vz.k;
import vz.p;
import vz.q;
import vz.r;
import vz.v;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/tesla/command/ExecuteCommandWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "b", "a", "command_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ExecuteCommandWorker extends CoroutineWorker {

    /* renamed from: b  reason: collision with root package name */
    public static final a f21475b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final g f21476c = g.f21878b.a("ExecuteCommandWorker");

    /* renamed from: a  reason: collision with root package name */
    private final k f21477a;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, ot.c request) {
            s.g(context, "context");
            s.g(request, "request");
            try {
                b0 i11 = b0.i(context);
                s.a aVar = new s.a(ExecuteCommandWorker.class);
                int i12 = 0;
                p[] pVarArr = {v.a("Key:CommandRequest", uu.c.a(request))};
                e.a aVar2 = new e.a();
                while (i12 < 1) {
                    p pVar = pVarArr[i12];
                    i12++;
                    aVar2.b((String) pVar.c(), pVar.d());
                }
                androidx.work.e a11 = aVar2.a();
                kotlin.jvm.internal.s.f(a11, "dataBuilder.build()");
                i11.d(aVar.h(a11).b());
            } catch (Exception e11) {
                ExecuteCommandWorker.f21476c.d("Failed to schedule execute command worker", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.tesla.command.ExecuteCommandWorker", f = "ExecuteCommandWorker.kt", l = {41, 59}, m = "doWork")
    /* loaded from: classes6.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f21478a;

        /* renamed from: b  reason: collision with root package name */
        Object f21479b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f21480c;

        /* renamed from: e  reason: collision with root package name */
        int f21482e;

        b(zz.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f21480c = obj;
            this.f21482e |= Integer.MIN_VALUE;
            return ExecuteCommandWorker.this.doWork(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class c implements uu.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ zz.d<ListenableWorker.a> f21483a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExecuteCommandWorker f21484b;

        /* JADX WARN: Multi-variable type inference failed */
        c(zz.d<? super ListenableWorker.a> dVar, ExecuteCommandWorker executeCommandWorker) {
            this.f21483a = dVar;
            this.f21484b = executeCommandWorker;
        }

        @Override // uu.d
        public final void a(ot.e response) {
            kotlin.jvm.internal.s.g(response, "response");
            if (response.h() == ot.f.RESULT_SUCCESS) {
                zz.d<ListenableWorker.a> dVar = this.f21483a;
                q.a aVar = q.f54772b;
                dVar.resumeWith(q.b(ListenableWorker.a.c()));
                return;
            }
            Context applicationContext = this.f21484b.getApplicationContext();
            kotlin.jvm.internal.s.f(applicationContext, "applicationContext");
            Notification b11 = j.e(this.f21484b.getApplicationContext()).m(this.f21484b.getApplicationContext().getString(os.c.f43993t)).l(this.f21484b.getApplicationContext().getString(os.c.f43992s)).k(PendingIntent.getActivity(this.f21484b.getApplicationContext(), 0, zu.a.a(applicationContext), 201326592)).b();
            kotlin.jvm.internal.s.f(b11, "getDefaultNotificationBu…ent)\n            .build()");
            this.f21484b.d().g(k00.c.f34202a.c(), b11);
            zz.d<ListenableWorker.a> dVar2 = this.f21483a;
            q.a aVar2 = q.f54772b;
            dVar2.resumeWith(q.b(ListenableWorker.a.a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.tesla.command.ExecuteCommandWorker$doWork$request$1", f = "ExecuteCommandWorker.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class d extends l implements h00.p<o0, zz.d<? super ot.c>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f21485a;

        d(zz.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new d(dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super ot.c> dVar) {
            return ((d) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f21485a == 0) {
                r.b(obj);
                String k11 = ExecuteCommandWorker.this.getInputData().k("Key:CommandRequest");
                if (k11 == null) {
                    return null;
                }
                return uu.b.f53671a.a(k11);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes6.dex */
    static final class e extends u implements h00.a<m> {
        e() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final m invoke() {
            return m.e(ExecuteCommandWorker.this.getApplicationContext());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecuteCommandWorker(Context context, WorkerParameters parameters) {
        super(context, parameters);
        k a11;
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(parameters, "parameters");
        a11 = vz.m.a(new e());
        this.f21477a = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m d() {
        return (m) this.f21477a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(zz.d<? super androidx.work.ListenableWorker.a> r11) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tesla.command.ExecuteCommandWorker.doWork(zz.d):java.lang.Object");
    }
}