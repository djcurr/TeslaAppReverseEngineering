package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelect$SearchAndSelectPane;
import com.plaid.internal.x2;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.a2;

/* loaded from: classes2.dex */
public final class pb extends xd {

    /* renamed from: h  reason: collision with root package name */
    public md f19228h;

    /* renamed from: i  reason: collision with root package name */
    public e f19229i;

    /* renamed from: j  reason: collision with root package name */
    public ab f19230j;

    /* renamed from: k  reason: collision with root package name */
    public final kotlinx.coroutines.flow.t<SearchAndSelect$SearchAndSelectPane.Rendering> f19231k;

    /* renamed from: l  reason: collision with root package name */
    public v20.a2 f19232l;

    /* renamed from: m  reason: collision with root package name */
    public String f19233m;

    /* renamed from: n  reason: collision with root package name */
    public v20.a2 f19234n;

    /* renamed from: o  reason: collision with root package name */
    public final kotlinx.coroutines.flow.t<List<Common$ListItem>> f19235o;

    /* renamed from: p  reason: collision with root package name */
    public Pane$PaneRendering f19236p;

    /* renamed from: q  reason: collision with root package name */
    public Workflow$LinkWorkflowSearchRequest.a f19237q;

    /* renamed from: r  reason: collision with root package name */
    public SearchAndSelect$SearchAndSelectPane.Rendering.Events f19238r;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.searchandselect.SearchAndSelectViewModel$1", f = "SearchAndSelectViewModel.kt", l = {97, 105, 113}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Object f19239a;

        /* renamed from: b  reason: collision with root package name */
        public Object f19240b;

        /* renamed from: c  reason: collision with root package name */
        public int f19241c;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ vd f19243e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vd vdVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f19243e = vdVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f19243e, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new a(this.f19243e, dVar).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00f5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00f6  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 266
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.pb.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19244a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final SearchAndSelect$SearchAndSelectPane.Actions.b f19245b;

        /* renamed from: c  reason: collision with root package name */
        public static final SearchAndSelect$SearchAndSelectPane.Actions.b f19246c;

        /* renamed from: d  reason: collision with root package name */
        public static final SearchAndSelect$SearchAndSelectPane.Actions.b f19247d;

        static {
            SearchAndSelect$SearchAndSelectPane.Actions.b a11 = SearchAndSelect$SearchAndSelectPane.Actions.newBuilder().a(SearchAndSelect$SearchAndSelectPane.Actions.TapNoResultsAction.getDefaultInstance());
            kotlin.jvm.internal.s.f(a11, "newBuilder().setTapNoRes…DefaultInstance()\n      )");
            f19245b = a11;
            SearchAndSelect$SearchAndSelectPane.Actions.b a12 = SearchAndSelect$SearchAndSelectPane.Actions.newBuilder().a(SearchAndSelect$SearchAndSelectPane.Actions.ExitAction.getDefaultInstance());
            kotlin.jvm.internal.s.f(a12, "newBuilder().setExit(\n  …DefaultInstance()\n      )");
            f19246c = a12;
            SearchAndSelect$SearchAndSelectPane.Actions.b a13 = SearchAndSelect$SearchAndSelectPane.Actions.newBuilder().a(SearchAndSelect$SearchAndSelectPane.Actions.TapEndOfResultsAction.getDefaultInstance());
            kotlin.jvm.internal.s.f(a13, "newBuilder().setTapEndOf…DefaultInstance()\n      )");
            f19247d = a13;
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19248a;

        static {
            int[] iArr = new int[j1.values().length];
            iArr[j1.SEARCH_BEHAVIOR_FILTER_INITIAL_ITEMS.ordinal()] = 1;
            iArr[j1.SEARCH_BEHAVIOR_WORKFLOW_SEARCH_ENDPOINT.ordinal()] = 2;
            f19248a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.searchandselect.SearchAndSelectViewModel$locallyFilterInitialItems$1", f = "SearchAndSelectViewModel.kt", l = {CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19249a;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ List<Common$ListItem> f19251c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<Common$ListItem> list, zz.d<? super d> dVar) {
            super(2, dVar);
            this.f19251c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new d(this.f19251c, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new d(this.f19251c, dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f19249a;
            if (i11 == 0) {
                vz.r.b(obj);
                kotlinx.coroutines.flow.t<List<Common$ListItem>> tVar = pb.this.f19235o;
                List<Common$ListItem> list = this.f19251c;
                this.f19249a = 1;
                if (tVar.emit(list, this) == d11) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(vd paneId, y7 paneHostComponent) {
        super(paneId, paneHostComponent);
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(paneHostComponent, "paneHostComponent");
        this.f19231k = kotlinx.coroutines.flow.a0.b(1, 0, null, 6, null);
        this.f19235o = kotlinx.coroutines.flow.a0.b(1, 0, null, 6, null);
        ((mb) ((x2.b0) paneHostComponent.f()).a()).a(this);
        v20.k.d(androidx.lifecycle.q0.a(this), null, null, new a(paneId, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x001b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r13, boolean r14) {
        /*
            r12 = this;
            com.plaid.internal.rb r0 = new com.plaid.internal.rb
            r1 = 0
            r0.<init>(r12, r1)
            r2 = 1
            java.lang.Object r0 = v20.i.f(r1, r0, r2, r1)
            java.lang.String r3 = "get() = runBlocking { fl…irst().initialItemsList }"
            kotlin.jvm.internal.s.f(r0, r3)
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L45
            java.lang.Object r4 = r0.next()
            r5 = r4
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem r5 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem) r5
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString r5 = r5.getTitle()
            if (r5 != 0) goto L2f
            goto L3e
        L2f:
            java.lang.String r5 = r5.getTranslation()
            if (r5 != 0) goto L36
            goto L3e
        L36:
            boolean r5 = kotlin.text.m.K(r5, r13, r14)
            if (r5 != r2) goto L3e
            r5 = r2
            goto L3f
        L3e:
            r5 = 0
        L3f:
            if (r5 == 0) goto L1b
            r3.add(r4)
            goto L1b
        L45:
            v20.o0 r6 = androidx.lifecycle.q0.a(r12)
            com.plaid.internal.pb$d r9 = new com.plaid.internal.pb$d
            r9.<init>(r3, r1)
            r7 = 0
            r8 = 0
            r10 = 3
            r11 = 0
            v20.i.d(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.pb.a(java.lang.String, boolean):void");
    }

    public final void a(String selectedId) {
        kotlin.jvm.internal.s.g(selectedId, "institutionId");
        if (kotlin.jvm.internal.s.c(this.f19233m, selectedId)) {
            return;
        }
        this.f19233m = selectedId;
        v20.a2 a2Var = this.f19234n;
        if (a2Var != null) {
            a2.a.a(a2Var, null, 1, null);
        }
        b bVar = b.f19244a;
        kotlin.jvm.internal.s.g(selectedId, "selectedId");
        SearchAndSelect$SearchAndSelectPane.Actions.b a11 = SearchAndSelect$SearchAndSelectPane.Actions.newBuilder().a(SearchAndSelect$SearchAndSelectPane.Actions.SubmitAction.newBuilder().a(selectedId));
        kotlin.jvm.internal.s.f(a11, "newBuilder().setSubmit(\n…tedId(selectedId)\n      )");
        SearchAndSelect$SearchAndSelectPane.Rendering.Events events = this.f19238r;
        this.f19234n = a(a11, events != null ? events.getOnSubmit() : null);
    }

    public final v20.a2 a(SearchAndSelect$SearchAndSelectPane.Actions.b action, Common$SDKEvent common$SDKEvent) {
        List m11;
        kotlin.jvm.internal.s.g(action, "action");
        Pane$PaneRendering pane$PaneRendering = this.f19236p;
        if (pane$PaneRendering == null) {
            kotlin.jvm.internal.s.x("pane");
            pane$PaneRendering = null;
        }
        String paneNodeId = pane$PaneRendering.getPaneNodeId();
        kotlin.jvm.internal.s.f(paneNodeId, "pane.paneNodeId");
        Pane$PaneOutput.a a11 = Pane$PaneOutput.newBuilder().a(action);
        kotlin.jvm.internal.s.f(a11, "newBuilder().setSearchAndSelect(action)");
        m11 = wz.w.m(common$SDKEvent);
        return a(paneNodeId, a11, m11);
    }

    @Override // com.plaid.internal.xd
    public void a() {
        b bVar = b.f19244a;
        a(b.f19246c, (Common$SDKEvent) null);
    }
}