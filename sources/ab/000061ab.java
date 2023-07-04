package com.tesla.utils;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.a0;
import androidx.work.s;
import ch.qos.logback.core.CoreConstants;
import h00.p;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v20.e1;
import v20.i;
import v20.j0;
import v20.k;
import v20.o0;
import v20.p0;
import vz.b0;
import vz.r;
import zz.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/tesla/utils/DummyWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "b", "a", "widget_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class DummyWorker extends Worker {

    /* renamed from: b  reason: collision with root package name */
    public static final a f21983b = new a(null);

    /* loaded from: classes6.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "com.tesla.utils.DummyWorker$Companion$scheduleIfNecessary$1", f = "WorkManagerUtils.kt", l = {36}, m = "invokeSuspend")
        /* renamed from: com.tesla.utils.DummyWorker$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0401a extends l implements p<o0, d<? super b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f21984a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f21985b;

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "com.tesla.utils.DummyWorker$Companion$scheduleIfNecessary$1$hasDummy$1", f = "WorkManagerUtils.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.tesla.utils.DummyWorker$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C0402a extends l implements p<o0, d<? super Boolean>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f21986a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Context f21987b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0402a(Context context, d<? super C0402a> dVar) {
                    super(2, dVar);
                    this.f21987b = context;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d<b0> create(Object obj, d<?> dVar) {
                    return new C0402a(this.f21987b, dVar);
                }

                @Override // h00.p
                public final Object invoke(o0 o0Var, d<? super Boolean> dVar) {
                    return ((C0402a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    a00.d.d();
                    if (this.f21986a == 0) {
                        r.b(obj);
                        return b.a(DummyWorker.f21983b.b(this.f21987b));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0401a(Context context, d<? super C0401a> dVar) {
                super(2, dVar);
                this.f21985b = context;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<b0> create(Object obj, d<?> dVar) {
                return new C0401a(this.f21985b, dVar);
            }

            @Override // h00.p
            public final Object invoke(o0 o0Var, d<? super b0> dVar) {
                return ((C0401a) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f21984a;
                if (i11 == 0) {
                    r.b(obj);
                    j0 b11 = e1.b();
                    C0402a c0402a = new C0402a(this.f21985b, null);
                    this.f21984a = 1;
                    obj = i.g(b11, c0402a, this);
                    if (obj == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    r.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    androidx.work.b0.i(this.f21985b).d(new s.a(DummyWorker.class).a("tesla-widget-DummyWorker").g(3650L, TimeUnit.DAYS).b());
                }
                return b0.f54756a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(Context context) {
            List<a0> list;
            boolean z11;
            boolean z12;
            try {
                list = androidx.work.b0.i(context).j("tesla-widget-DummyWorker").get();
            } catch (Exception unused) {
                list = null;
            }
            if (list != null) {
                if (!list.isEmpty()) {
                    for (a0 a0Var : list) {
                        if (a0Var.a() == a0.a.ENQUEUED || a0Var.a() == a0.a.RUNNING) {
                            z11 = true;
                            continue;
                        } else {
                            z11 = false;
                            continue;
                        }
                        if (z11) {
                            z12 = true;
                            break;
                        }
                    }
                }
                z12 = false;
                if (z12) {
                    return true;
                }
            }
            return false;
        }

        public final void c(Context context) {
            kotlin.jvm.internal.s.g(context, "context");
            k.d(p0.b(), null, null, new C0401a(context, null), 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DummyWorker(Context context, WorkerParameters params) {
        super(context, params);
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(params, "params");
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a a() {
        a aVar = f21983b;
        Context applicationContext = getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext, "applicationContext");
        aVar.c(applicationContext);
        ListenableWorker.a c11 = ListenableWorker.a.c();
        kotlin.jvm.internal.s.f(c11, "success()");
        return c11;
    }
}