package com.tesla.widget.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.b0;
import androidx.work.e;
import androidx.work.s;
import av.j;
import ch.qos.logback.core.CoreConstants;
import cv.i;
import h00.p;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import v20.o0;
import vz.k;
import vz.m;
import vz.q;
import vz.r;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/tesla/widget/worker/WidgetCommandExecutionWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "d", "b", "widget_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class WidgetCommandExecutionWorker extends CoroutineWorker {

    /* renamed from: d  reason: collision with root package name */
    public static final b f22037d = new b(null);

    /* renamed from: e  reason: collision with root package name */
    private static final com.tesla.logging.g f22038e = com.tesla.logging.g.f21878b.a("WidgetCommandExecutionWorker");

    /* renamed from: f  reason: collision with root package name */
    private static final k<com.tesla.logging.g> f22039f;

    /* renamed from: a  reason: collision with root package name */
    private final k f22040a;

    /* renamed from: b  reason: collision with root package name */
    private final k f22041b;

    /* renamed from: c  reason: collision with root package name */
    private final k f22042c;

    /* loaded from: classes6.dex */
    static final class a extends u implements h00.a<com.tesla.logging.g> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f22043a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final com.tesla.logging.g mo11invoke() {
            return av.a.a().n("WidgetCommandWorker");
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.tesla.logging.g c() {
            return (com.tesla.logging.g) WidgetCommandExecutionWorker.f22039f.mo16getValue();
        }

        public final void b(Context context, int i11, String vehicleId, bv.c command) {
            s.g(context, "context");
            s.g(vehicleId, "vehicleId");
            s.g(command, "command");
            try {
                androidx.work.e a11 = new e.a().f("app_widget_id", i11).g("vehicle_id", vehicleId).g("command", command.toString()).a();
                s.f(a11, "Builder()\n          .put…ing())\n          .build()");
                androidx.work.s b11 = new s.a(WidgetCommandExecutionWorker.class).h(a11).b();
                kotlin.jvm.internal.s.f(b11, "OneTimeWorkRequestBuilde…tData)\n          .build()");
                b0.i(context).d(b11);
            } catch (Exception e11) {
                WidgetCommandExecutionWorker.f22038e.d("Failed to schedule widget command worker", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.tesla.widget.worker.WidgetCommandExecutionWorker", f = "WidgetCommandExecutionWorker.kt", l = {57, 67, 75}, m = "doWork")
    /* loaded from: classes6.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f22044a;

        /* renamed from: b  reason: collision with root package name */
        Object f22045b;

        /* renamed from: c  reason: collision with root package name */
        Object f22046c;

        /* renamed from: d  reason: collision with root package name */
        Object f22047d;

        /* renamed from: e  reason: collision with root package name */
        int f22048e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f22049f;

        /* renamed from: h  reason: collision with root package name */
        int f22051h;

        c(zz.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22049f = obj;
            this.f22051h |= Integer.MIN_VALUE;
            return WidgetCommandExecutionWorker.this.doWork(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class d implements uu.d {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f22053b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ bv.c f22054c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ zz.d<ot.e> f22055d;

        /* JADX WARN: Multi-variable type inference failed */
        d(String str, bv.c cVar, zz.d<? super ot.e> dVar) {
            this.f22053b = str;
            this.f22054c = cVar;
            this.f22055d = dVar;
        }

        @Override // uu.d
        public final void a(ot.e response) {
            kotlin.jvm.internal.s.g(response, "response");
            WidgetCommandExecutionWorker.this.g().c(this.f22053b, this.f22054c);
            zz.d<ot.e> dVar = this.f22055d;
            q.a aVar = q.f54772b;
            dVar.resumeWith(q.b(response));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.tesla.widget.worker.WidgetCommandExecutionWorker$doWork$vehicle$1", f = "WidgetCommandExecutionWorker.kt", l = {67}, m = "invokeSuspend")
    /* loaded from: classes6.dex */
    public static final class e extends l implements p<o0, zz.d<? super cu.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f22056a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f22058c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, zz.d<? super e> dVar) {
            super(2, dVar);
            this.f22058c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new e(this.f22058c, dVar);
        }

        @Override // h00.p
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object mo160invoke(o0 o0Var, zz.d<? super cu.a> dVar) {
            return ((e) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f22056a;
            if (i11 == 0) {
                r.b(obj);
                i h11 = WidgetCommandExecutionWorker.this.h();
                String str = this.f22058c;
                this.f22056a = 1;
                obj = h11.i(str, false, this);
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

    /* loaded from: classes6.dex */
    static final class f extends u implements h00.a<bv.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f22059a = new f();

        f() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final bv.b mo11invoke() {
            return ev.b.f25256a.a();
        }
    }

    /* loaded from: classes6.dex */
    static final class g extends u implements h00.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f22060a = new g();

        g() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final i mo11invoke() {
            return ev.b.f25256a.b();
        }
    }

    /* loaded from: classes6.dex */
    static final class h extends u implements h00.a<j> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f22061a = new h();

        h() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final j mo11invoke() {
            return ev.b.f25256a.c();
        }
    }

    static {
        k<com.tesla.logging.g> a11;
        a11 = m.a(a.f22043a);
        f22039f = a11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public WidgetCommandExecutionWorker(android.content.Context r2, androidx.work.WorkerParameters r3) {
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
            com.tesla.widget.worker.WidgetCommandExecutionWorker$h r2 = com.tesla.widget.worker.WidgetCommandExecutionWorker.h.f22061a
            vz.k r2 = vz.l.a(r2)
            r1.f22040a = r2
            com.tesla.widget.worker.WidgetCommandExecutionWorker$g r2 = com.tesla.widget.worker.WidgetCommandExecutionWorker.g.f22060a
            vz.k r2 = vz.l.a(r2)
            r1.f22041b = r2
            com.tesla.widget.worker.WidgetCommandExecutionWorker$f r2 = com.tesla.widget.worker.WidgetCommandExecutionWorker.f.f22059a
            vz.k r2 = vz.l.a(r2)
            r1.f22042c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tesla.widget.worker.WidgetCommandExecutionWorker.<init>(android.content.Context, androidx.work.WorkerParameters):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bv.b g() {
        return (bv.b) this.f22042c.mo16getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i h() {
        return (i) this.f22041b.mo16getValue();
    }

    private final j i() {
        return (j) this.f22040a.mo16getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0205  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(zz.d<? super androidx.work.ListenableWorker.a> r23) {
        /*
            Method dump skipped, instructions count: 771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tesla.widget.worker.WidgetCommandExecutionWorker.doWork(zz.d):java.lang.Object");
    }
}