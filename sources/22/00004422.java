package com.plaid.internal;

import com.google.android.gms.wallet.WalletConstants;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowNextResponse;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartResponse;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.f7;
import com.plaid.internal.g6;
import com.plaid.internal.wa;
import com.plaid.link.R;
import com.plaid.link.result.LinkErrorCode;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class i6 {

    /* renamed from: a  reason: collision with root package name */
    public final md f18754a;

    /* renamed from: b  reason: collision with root package name */
    public final a8 f18755b;

    /* renamed from: c  reason: collision with root package name */
    public final m6 f18756c;

    /* renamed from: d  reason: collision with root package name */
    public final g3 f18757d;

    /* renamed from: e  reason: collision with root package name */
    public final nd f18758e;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", l = {99, 101, 112, 125}, m = "callWorkflowStart")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f18759a;

        /* renamed from: b  reason: collision with root package name */
        public Object f18760b;

        /* renamed from: c  reason: collision with root package name */
        public Object f18761c;

        /* renamed from: d  reason: collision with root package name */
        public Object f18762d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f18763e;

        /* renamed from: g  reason: collision with root package name */
        public int f18765g;

        public a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18763e = obj;
            this.f18765g |= Integer.MIN_VALUE;
            return i6.this.a((Workflow$LinkWorkflowStartRequest) null, (String) null, (String) null, (String) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.LinkStateReducer$callWorkflowStart$networkResponse$1", f = "LinkStateReducer.kt", l = {99}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super f7<? extends Workflow$LinkWorkflowStartResponse, ? extends Object>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f18766a;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Workflow$LinkWorkflowStartRequest f18768c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f18768c = workflow$LinkWorkflowStartRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(this.f18768c, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super f7<? extends Workflow$LinkWorkflowStartResponse, ? extends Object>> dVar) {
            return new b(this.f18768c, dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f18766a;
            if (i11 == 0) {
                vz.r.b(obj);
                md mdVar = i6.this.f18754a;
                Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest = this.f18768c;
                this.f18766a = 1;
                obj = mdVar.a(workflow$LinkWorkflowStartRequest, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return obj;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", l = {324, 324, 331, 339}, m = "exitFromCurrentState")
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f18769a;

        /* renamed from: b  reason: collision with root package name */
        public Object f18770b;

        /* renamed from: c  reason: collision with root package name */
        public Object f18771c;

        /* renamed from: d  reason: collision with root package name */
        public Object f18772d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f18773e;

        /* renamed from: g  reason: collision with root package name */
        public int f18775g;

        public c(zz.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18773e = obj;
            this.f18775g |= Integer.MIN_VALUE;
            return i6.this.a(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", l = {456}, m = "handleError")
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f18776a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f18777b;

        /* renamed from: d  reason: collision with root package name */
        public int f18779d;

        public d(zz.d<? super d> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18777b = obj;
            this.f18779d |= Integer.MIN_VALUE;
            return i6.this.a((String) null, (f3) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", l = {DownloaderService.STATUS_FORBIDDEN, WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE, WalletConstants.ERROR_CODE_UNKNOWN}, m = "handleSuccess")
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f18780a;

        /* renamed from: b  reason: collision with root package name */
        public Object f18781b;

        /* renamed from: c  reason: collision with root package name */
        public Object f18782c;

        /* renamed from: d  reason: collision with root package name */
        public Object f18783d;

        /* renamed from: e  reason: collision with root package name */
        public Object f18784e;

        /* renamed from: f  reason: collision with root package name */
        public Object f18785f;

        /* renamed from: g  reason: collision with root package name */
        public Object f18786g;

        /* renamed from: h  reason: collision with root package name */
        public Object f18787h;

        /* renamed from: i  reason: collision with root package name */
        public Object f18788i;

        /* renamed from: j  reason: collision with root package name */
        public Object f18789j;

        /* renamed from: k  reason: collision with root package name */
        public /* synthetic */ Object f18790k;

        /* renamed from: m  reason: collision with root package name */
        public int f18792m;

        public e(zz.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18790k = obj;
            this.f18792m |= Integer.MIN_VALUE;
            return i6.this.a(null, null, null, null, null, null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", l = {205, 212, 221}, m = "next")
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f18793a;

        /* renamed from: b  reason: collision with root package name */
        public Object f18794b;

        /* renamed from: c  reason: collision with root package name */
        public Object f18795c;

        /* renamed from: d  reason: collision with root package name */
        public Object f18796d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f18797e;

        /* renamed from: g  reason: collision with root package name */
        public int f18799g;

        public f(zz.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18797e = obj;
            this.f18799g |= Integer.MIN_VALUE;
            return i6.this.a((g6) null, (List<Pane$PaneOutput>) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.LinkStateReducer$next$networkResponse$1", f = "LinkStateReducer.kt", l = {206}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements h00.l<zz.d<? super f7<? extends Workflow$LinkWorkflowNextResponse, ? extends Object>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f18800a;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Workflow$LinkWorkflowNextRequest f18802c;

        @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.LinkStateReducer$next$networkResponse$1$1", f = "LinkStateReducer.kt", l = {207}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super f7<? extends Workflow$LinkWorkflowNextResponse, ? extends Object>>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public int f18803a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ i6 f18804b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ Workflow$LinkWorkflowNextRequest f18805c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i6 i6Var, Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest, zz.d<? super a> dVar) {
                super(2, dVar);
                this.f18804b = i6Var;
                this.f18805c = workflow$LinkWorkflowNextRequest;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new a(this.f18804b, this.f18805c, dVar);
            }

            @Override // h00.p
            public Object invoke(v20.o0 o0Var, zz.d<? super f7<? extends Workflow$LinkWorkflowNextResponse, ? extends Object>> dVar) {
                return new a(this.f18804b, this.f18805c, dVar).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d11;
                d11 = a00.d.d();
                int i11 = this.f18803a;
                if (i11 == 0) {
                    vz.r.b(obj);
                    md mdVar = this.f18804b.f18754a;
                    Workflow$LinkWorkflowNextRequest nextRequest = this.f18805c;
                    kotlin.jvm.internal.s.f(nextRequest, "nextRequest");
                    this.f18803a = 1;
                    obj = mdVar.a(nextRequest, this);
                    if (obj == d11) {
                        return d11;
                    }
                } else if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    vz.r.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Workflow$LinkWorkflowNextRequest workflow$LinkWorkflowNextRequest, zz.d<? super g> dVar) {
            super(1, dVar);
            this.f18802c = workflow$LinkWorkflowNextRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(zz.d<?> dVar) {
            return new g(this.f18802c, dVar);
        }

        @Override // h00.l
        public Object invoke(zz.d<? super f7<? extends Workflow$LinkWorkflowNextResponse, ? extends Object>> dVar) {
            return new g(this.f18802c, dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f18800a;
            if (i11 == 0) {
                vz.r.b(obj);
                v20.j0 b11 = v20.e1.b();
                a aVar = new a(i6.this, this.f18802c, null);
                this.f18800a = 1;
                obj = v20.i.g(b11, aVar, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return obj;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", l = {275, 280, 287, 314}, m = "previous")
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f18806a;

        /* renamed from: b  reason: collision with root package name */
        public Object f18807b;

        /* renamed from: c  reason: collision with root package name */
        public Object f18808c;

        /* renamed from: d  reason: collision with root package name */
        public Object f18809d;

        /* renamed from: e  reason: collision with root package name */
        public Object f18810e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f18811f;

        /* renamed from: h  reason: collision with root package name */
        public int f18813h;

        public h(zz.d<? super h> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18811f = obj;
            this.f18813h |= Integer.MIN_VALUE;
            return i6.this.b(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", l = {350, 361, 370, 378, 380}, m = "resume")
    /* loaded from: classes2.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f18814a;

        /* renamed from: b  reason: collision with root package name */
        public Object f18815b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f18816c;

        /* renamed from: e  reason: collision with root package name */
        public int f18818e;

        public i(zz.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18816c = obj;
            this.f18818e |= Integer.MIN_VALUE;
            return i6.this.a((g6) null, (fb) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.LinkStateReducer", f = "LinkStateReducer.kt", l = {49, 57, 57, 67, 68, 73, 79}, m = "start")
    /* loaded from: classes2.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f18819a;

        /* renamed from: b  reason: collision with root package name */
        public Object f18820b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f18821c;

        /* renamed from: e  reason: collision with root package name */
        public int f18823e;

        public j(zz.d<? super j> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18821c = obj;
            this.f18823e |= Integer.MIN_VALUE;
            return i6.this.c(null, this);
        }
    }

    public i6(md api, a8 paneStore, m6 linkWorkflowAnalytics, g3 errorStateWithRenderingFactory, nd requestFactory) {
        kotlin.jvm.internal.s.g(api, "api");
        kotlin.jvm.internal.s.g(paneStore, "paneStore");
        kotlin.jvm.internal.s.g(linkWorkflowAnalytics, "linkWorkflowAnalytics");
        kotlin.jvm.internal.s.g(errorStateWithRenderingFactory, "errorStateWithRenderingFactory");
        kotlin.jvm.internal.s.g(requestFactory, "requestFactory");
        this.f18754a = api;
        this.f18755b = paneStore;
        this.f18756c = linkWorkflowAnalytics;
        this.f18757d = errorStateWithRenderingFactory;
        this.f18758e = requestFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, zz.d<? super com.plaid.internal.g6> r25) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.i6.a(com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest, java.lang.String, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0154 -> B:18:0x005c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.plaid.internal.g6 r27, zz.d<? super com.plaid.internal.g6> r28) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.i6.b(com.plaid.internal.g6, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x034b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x034c A[PHI: r1 
      PHI: (r1v30 java.lang.Object) = (r1v25 java.lang.Object), (r1v1 java.lang.Object) binds: [B:113:0x0349, B:18:0x0075] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0394 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.plaid.internal.g6 r25, zz.d<? super com.plaid.internal.g6> r26) {
        /*
            Method dump skipped, instructions count: 1168
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.i6.c(com.plaid.internal.g6, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.plaid.internal.g6 r13, java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput> r14, zz.d<? super com.plaid.internal.g6> r15) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.i6.a(com.plaid.internal.g6, java.util.List, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.plaid.internal.g6 r13, zz.d<? super com.plaid.internal.g6> r14) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.i6.a(com.plaid.internal.g6, zz.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
        if ((r4) == true) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0196 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.plaid.internal.g6 r10, com.plaid.internal.fb r11, zz.d<? super com.plaid.internal.g6> r12) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.i6.a(com.plaid.internal.g6, com.plaid.internal.fb, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0155 A[LOOP:1: B:36:0x014f->B:38:0x0155, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r22, java.util.List<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> r23, java.util.List<com.plaid.internal.vd> r24, java.lang.String r25, zz.d<? super com.plaid.internal.g6> r26) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.i6.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering, java.util.List, java.util.List, java.lang.String, zz.d):java.lang.Object");
    }

    public final <T> Object a(String workflowId, f7<? extends T, ? extends Object> errorResponse, String continuationToken, List<vd> backstack, zz.d<? super g6.h> dVar) {
        String str;
        Pane$PaneRendering a11;
        g3 g3Var = this.f18757d;
        g3Var.getClass();
        kotlin.jvm.internal.s.g(errorResponse, "errorResponse");
        kotlin.jvm.internal.s.g(workflowId, "workflowId");
        kotlin.jvm.internal.s.g(continuationToken, "continuationToken");
        kotlin.jvm.internal.s.g(backstack, "backstack");
        if (!(errorResponse instanceof f7.c)) {
            str = "";
            if (errorResponse instanceof f7.b) {
                String string = g3Var.f18613a.getString(R.string.plaid_error_no_network_connection_title);
                kotlin.jvm.internal.s.f(string, "resources.getString(R.st…network_connection_title)");
                String string2 = g3Var.f18613a.getString(R.string.plaid_error_no_network_connection_content);
                kotlin.jvm.internal.s.f(string2, "resources.getString(R.st…twork_connection_content)");
                String string3 = g3Var.f18613a.getString(R.string.plaid_error_no_network_connection_exit);
                kotlin.jvm.internal.s.f(string3, "resources.getString(R.st…_network_connection_exit)");
                a11 = g3Var.a(string, string2, string3);
            } else if (errorResponse instanceof f7.d) {
                if (((f7.d) errorResponse).f18588a == null) {
                    new RuntimeException("Unknown error");
                }
                String string4 = g3Var.f18613a.getString(R.string.plaid_error_local_error_header);
                kotlin.jvm.internal.s.f(string4, "resources.getString(R.st…error_local_error_header)");
                String string5 = g3Var.f18613a.getString(R.string.plaid_error_local_error_content);
                kotlin.jvm.internal.s.f(string5, "resources.getString(R.st…rror_local_error_content)");
                String string6 = g3Var.f18613a.getString(R.string.plaid_error_local_error_button_text);
                kotlin.jvm.internal.s.f(string6, "resources.getString(R.st…_local_error_button_text)");
                a11 = g3Var.a(string4, string5, string6);
            } else if (errorResponse instanceof f7.a) {
                f7.a aVar = (f7.a) errorResponse;
                U u11 = aVar.f18584a;
                str = u11 instanceof on.h ? String.valueOf(((Map) u11).get("request_id")) : "";
                if (aVar.f18585b == 440) {
                    String string7 = g3Var.f18613a.getString(R.string.plaid_error_session_expired_title);
                    kotlin.jvm.internal.s.f(string7, "resources.getString(R.st…or_session_expired_title)");
                    String string8 = g3Var.f18613a.getString(R.string.plaid_error_session_expired_content);
                    kotlin.jvm.internal.s.f(string8, "resources.getString(R.st…_session_expired_content)");
                    String string9 = g3Var.f18613a.getString(R.string.plaid_error_session_expired_exit);
                    kotlin.jvm.internal.s.f(string9, "resources.getString(R.st…ror_session_expired_exit)");
                    a11 = g3Var.a(string7, string8, string9);
                } else {
                    String string10 = g3Var.f18613a.getString(R.string.plaid_error_internal_server_error_something_went_wrong);
                    kotlin.jvm.internal.s.f(string10, "resources.getString(R.st…ror_something_went_wrong)");
                    String string11 = g3Var.f18613a.getString(R.string.plaid_error_internal_server_error_try_again_later);
                    kotlin.jvm.internal.s.f(string11, "resources.getString(R.st…er_error_try_again_later)");
                    String string12 = g3Var.f18613a.getString(R.string.plaid_error_internal_error_exit);
                    kotlin.jvm.internal.s.f(string12, "resources.getString(R.st…rror_internal_error_exit)");
                    a11 = g3Var.a(string10, string11, string12);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return a(workflowId, g3Var.a(a11, str, workflowId, continuationToken, backstack, LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE), dVar);
        }
        throw new r5("Can't convert success response to local error");
    }

    public final Object a(String requestId, String workflowId, Throwable throwable, String continuationToken, List<vd> backstack, zz.d<? super g6.h> dVar) {
        wa.a.a(wa.f19678a, throwable, false, 2);
        g3 g3Var = this.f18757d;
        g3Var.getClass();
        kotlin.jvm.internal.s.g(requestId, "requestId");
        kotlin.jvm.internal.s.g(throwable, "throwable");
        kotlin.jvm.internal.s.g(workflowId, "workflowId");
        kotlin.jvm.internal.s.g(continuationToken, "continuationToken");
        kotlin.jvm.internal.s.g(backstack, "backstack");
        String string = g3Var.f18613a.getString(R.string.plaid_error_local_error_header);
        kotlin.jvm.internal.s.f(string, "resources.getString(R.st…error_local_error_header)");
        String string2 = g3Var.f18613a.getString(R.string.plaid_error_local_error_content);
        kotlin.jvm.internal.s.f(string2, "resources.getString(R.st…rror_local_error_content)");
        String string3 = g3Var.f18613a.getString(R.string.plaid_error_local_error_button_text);
        kotlin.jvm.internal.s.f(string3, "resources.getString(R.st…_local_error_button_text)");
        return a(workflowId, g3Var.a(g3Var.a(string, string2, string3), requestId, workflowId, continuationToken, backstack, LinkErrorCode.ApiError.INTERNAL_SERVER_ERROR.INSTANCE), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r6, com.plaid.internal.f3 r7, zz.d<? super com.plaid.internal.g6.h> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.plaid.internal.i6.d
            if (r0 == 0) goto L13
            r0 = r8
            com.plaid.internal.i6$d r0 = (com.plaid.internal.i6.d) r0
            int r1 = r0.f18779d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18779d = r1
            goto L18
        L13:
            com.plaid.internal.i6$d r0 = new com.plaid.internal.i6$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f18777b
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f18779d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.f18776a
            r7 = r6
            com.plaid.internal.f3 r7 = (com.plaid.internal.f3) r7
            vz.r.b(r8)
            goto L50
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            vz.r.b(r8)
            com.plaid.internal.a8 r8 = r5.f18755b
            com.plaid.internal.vd$b r2 = com.plaid.internal.vd.CREATOR
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r4 = r7.f18574b
            com.plaid.internal.vd r6 = r2.a(r4, r6)
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r2 = r7.f18574b
            r0.f18776a = r7
            r0.f18779d = r3
            java.lang.Object r6 = r8.a(r6, r2, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            com.plaid.internal.g6$h r6 = r7.f18573a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.i6.a(java.lang.String, com.plaid.internal.f3, zz.d):java.lang.Object");
    }
}