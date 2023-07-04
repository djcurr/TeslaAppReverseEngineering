package com.plaid.internal;

import com.google.protobuf.Timestamp;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import com.plaid.internal.wa;

/* loaded from: classes2.dex */
public final class m6 {

    /* renamed from: a  reason: collision with root package name */
    public final md f19011a;

    /* renamed from: b  reason: collision with root package name */
    public final o6 f19012b;

    /* renamed from: c  reason: collision with root package name */
    public final v20.j0 f19013c;

    /* renamed from: d  reason: collision with root package name */
    public Long f19014d;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvents$1", f = "LinkWorkflowAnalytics.kt", l = {111}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19015a;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Workflow$LinkWorkflowEventRequest.Event.a f19017c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f19018d;

        @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics$trackEvents$1$1", f = "LinkWorkflowAnalytics.kt", l = {112, 113}, m = "invokeSuspend")
        /* renamed from: com.plaid.internal.m6$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0342a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public int f19019a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ m6 f19020b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ Workflow$LinkWorkflowEventRequest.Event.a f19021c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ String f19022d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0342a(m6 m6Var, Workflow$LinkWorkflowEventRequest.Event.a aVar, String str, zz.d<? super C0342a> dVar) {
                super(2, dVar);
                this.f19020b = m6Var;
                this.f19021c = aVar;
                this.f19022d = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new C0342a(this.f19020b, this.f19021c, this.f19022d, dVar);
            }

            @Override // h00.p
            public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                return new C0342a(this.f19020b, this.f19021c, this.f19022d, dVar).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f19019a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    o6 o6Var = this.f19020b.f19012b;
                    Workflow$LinkWorkflowEventRequest.Event build = this.f19021c.a(this.f19022d).build();
                    kotlin.jvm.internal.s.f(build, "event.setWorkflowSessionId(workflowId).build()");
                    this.f19019a = 1;
                    if (o6Var.a(build, this) == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vz.r.b(obj);
                    wa.a.a(wa.f19678a, "events send", false, 2);
                    return vz.b0.f54756a;
                } else {
                    vz.r.b(obj);
                }
                m6 m6Var = this.f19020b;
                this.f19019a = 2;
                if (m6.a(m6Var, this) == d11) {
                    return d11;
                }
                wa.a.a(wa.f19678a, "events send", false, 2);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Workflow$LinkWorkflowEventRequest.Event.a aVar, String str, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f19017c = aVar;
            this.f19018d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f19017c, this.f19018d, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new a(this.f19017c, this.f19018d, dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f19015a;
            if (i11 == 0) {
                vz.r.b(obj);
                m6 m6Var = m6.this;
                v20.j0 j0Var = m6Var.f19013c;
                C0342a c0342a = new C0342a(m6Var, this.f19017c, this.f19018d, null);
                this.f19015a = 1;
                if (v20.i.g(j0Var, c0342a, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return vz.b0.f54756a;
        }
    }

    public m6(md api, o6 workflowAnalyticsStore) {
        kotlin.jvm.internal.s.g(api, "api");
        kotlin.jvm.internal.s.g(workflowAnalyticsStore, "workflowAnalyticsStore");
        this.f19011a = api;
        this.f19012b = workflowAnalyticsStore;
        this.f19013c = v20.e1.b().Q0(1);
    }

    public final void a(vd currentPane, vd vdVar) {
        kotlin.jvm.internal.s.g(currentPane, "currentPane");
        String str = currentPane.f19648a;
        Workflow$LinkWorkflowEventRequest.Event.a a11 = a();
        Workflow$LinkWorkflowEventRequest.Back.a newBuilder = Workflow$LinkWorkflowEventRequest.Back.newBuilder();
        newBuilder.a(currentPane.f19650c);
        newBuilder.b((vdVar == null || (r4 = vdVar.f19650c) == null) ? "" : "");
        vz.b0 b0Var = vz.b0.f54756a;
        Workflow$LinkWorkflowEventRequest.Event.a a12 = a11.a(newBuilder);
        kotlin.jvm.internal.s.f(a12, "eventBuilder.setBack(\n  …d ?: \"\"\n        }\n      )");
        a(str, a12);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9 A[LOOP:1: B:29:0x00b3->B:31:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x010b -> B:33:0x00e5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0125 -> B:33:0x00e5). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.plaid.internal.m6 r9, zz.d r10) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.m6.a(com.plaid.internal.m6, zz.d):java.lang.Object");
    }

    public final Workflow$LinkWorkflowEventRequest.Event.a a() {
        return Workflow$LinkWorkflowEventRequest.Event.newBuilder().a(Timestamp.newBuilder().setSeconds(System.currentTimeMillis() / 1000));
    }

    public final void a(String str, Workflow$LinkWorkflowEventRequest.Event.a aVar) {
        v20.k.d(v20.t1.f54002a, null, null, new a(aVar, str, null), 3, null);
    }
}