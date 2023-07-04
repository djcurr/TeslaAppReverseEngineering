package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class n6 implements o6 {

    /* renamed from: a  reason: collision with root package name */
    public final jd f19061a;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.persistence.LinkWorkflowAnalyticsDatabaseBackedStore", f = "LinkWorkflowAnalyticsDatabaseBackedStore.kt", l = {25}, m = "retrieveAllEvents")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f19062a;

        /* renamed from: c  reason: collision with root package name */
        public int f19064c;

        public a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19062a = obj;
            this.f19064c |= Integer.MIN_VALUE;
            return n6.this.a(this);
        }
    }

    public n6(WorkflowDatabase database) {
        kotlin.jvm.internal.s.g(database, "database");
        this.f19061a = database.c();
    }

    @Override // com.plaid.internal.o6
    public Object a(Workflow$LinkWorkflowEventRequest.Event event, zz.d<? super vz.b0> dVar) {
        Object d11;
        jd jdVar = this.f19061a;
        String workflowSessionId = event.getWorkflowSessionId();
        kotlin.jvm.internal.s.f(workflowSessionId, "event.workflowSessionId");
        String valueOf = String.valueOf(event.hashCode());
        byte[] byteArray = event.toByteArray();
        kotlin.jvm.internal.s.f(byteArray, "event.toByteArray()");
        Object a11 = jdVar.a(workflowSessionId, valueOf, byteArray, dVar);
        d11 = a00.d.d();
        return a11 == d11 ? a11 : vz.b0.f54756a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[LOOP:0: B:18:0x0050->B:20:0x0056, LOOP_END] */
    @Override // com.plaid.internal.o6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(zz.d<? super java.util.Collection<com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest.Event>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.plaid.internal.n6.a
            if (r0 == 0) goto L13
            r0 = r5
            com.plaid.internal.n6$a r0 = (com.plaid.internal.n6.a) r0
            int r1 = r0.f19064c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19064c = r1
            goto L18
        L13:
            com.plaid.internal.n6$a r0 = new com.plaid.internal.n6$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19062a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19064c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            vz.r.b(r5)
            com.plaid.internal.jd r5 = r4.f19061a
            r0.f19064c = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = wz.u.t(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L50:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r5.next()
            com.plaid.internal.ld r1 = (com.plaid.internal.ld) r1
            byte[] r1 = r1.f18986c
            com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest$Event r1 = com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest.Event.parseFrom(r1)
            r0.add(r1)
            goto L50
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.n6.a(zz.d):java.lang.Object");
    }

    @Override // com.plaid.internal.o6
    public Object a(Collection<Workflow$LinkWorkflowEventRequest.Event> collection, zz.d<? super vz.b0> dVar) {
        int t11;
        Object d11;
        t11 = wz.x.t(collection, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (Workflow$LinkWorkflowEventRequest.Event event : collection) {
            String workflowSessionId = event.getWorkflowSessionId();
            kotlin.jvm.internal.s.f(workflowSessionId, "event.workflowSessionId");
            String valueOf = String.valueOf(event.hashCode());
            byte[] byteArray = event.toByteArray();
            kotlin.jvm.internal.s.f(byteArray, "event.toByteArray()");
            arrayList.add(new ld(workflowSessionId, valueOf, byteArray));
        }
        Object a11 = this.f19061a.a(arrayList, dVar);
        d11 = a00.d.d();
        return a11 == d11 ? a11 : vz.b0.f54756a;
    }
}