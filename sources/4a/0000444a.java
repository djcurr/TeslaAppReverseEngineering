package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowPollRequest;

/* loaded from: classes2.dex */
public final class j7 {

    /* renamed from: a  reason: collision with root package name */
    public final md f18876a;

    /* renamed from: b  reason: collision with root package name */
    public final m6 f18877b;

    /* renamed from: c  reason: collision with root package name */
    public final k7 f18878c;

    /* renamed from: d  reason: collision with root package name */
    public final vd f18879d;

    /* renamed from: e  reason: collision with root package name */
    public final Workflow$LinkWorkflowPollRequest f18880e;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.OAuthPolling", f = "OAuthPolling.kt", l = {43, 45}, m = "waitForOAuthComplete")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f18881a;

        /* renamed from: b  reason: collision with root package name */
        public long f18882b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f18883c;

        /* renamed from: e  reason: collision with root package name */
        public int f18885e;

        public a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18883c = obj;
            this.f18885e |= Integer.MIN_VALUE;
            return j7.this.a(this);
        }
    }

    public j7(md workflowApi, m6 analytics, k7 pollingOptions, String oAuthStateId, vd workflowPaneId) {
        kotlin.jvm.internal.s.g(workflowApi, "workflowApi");
        kotlin.jvm.internal.s.g(analytics, "analytics");
        kotlin.jvm.internal.s.g(pollingOptions, "pollingOptions");
        kotlin.jvm.internal.s.g(oAuthStateId, "oAuthStateId");
        kotlin.jvm.internal.s.g(workflowPaneId, "workflowPaneId");
        this.f18876a = workflowApi;
        this.f18877b = analytics;
        this.f18878c = pollingOptions;
        this.f18879d = workflowPaneId;
        this.f18880e = Workflow$LinkWorkflowPollRequest.newBuilder().a(workflowPaneId.b()).a(Workflow$LinkWorkflowPollRequest.OAuthRedirectComplete.newBuilder().a(oAuthStateId).build()).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ea -> B:28:0x00ed). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(zz.d<? super vz.b0> r16) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.j7.a(zz.d):java.lang.Object");
    }
}