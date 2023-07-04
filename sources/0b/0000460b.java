package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Consent$ConsentPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.x2;
import java.util.List;

/* loaded from: classes2.dex */
public final class x1 extends xd {

    /* renamed from: h  reason: collision with root package name */
    public final kotlinx.coroutines.flow.t<Consent$ConsentPane.Rendering> f19731h;

    /* renamed from: i  reason: collision with root package name */
    public final vz.k f19732i;

    /* renamed from: j  reason: collision with root package name */
    public final vz.k f19733j;

    /* renamed from: k  reason: collision with root package name */
    public final vz.k f19734k;

    /* renamed from: l  reason: collision with root package name */
    public final vz.k f19735l;

    /* renamed from: m  reason: collision with root package name */
    public Pane$PaneRendering f19736m;

    /* renamed from: n  reason: collision with root package name */
    public Consent$ConsentPane.Rendering.Events f19737n;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.consent.ConsentViewModel$1", f = "ConsentViewModel.kt", l = {50, 58}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Object f19738a;

        /* renamed from: b  reason: collision with root package name */
        public int f19739b;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ vd f19741d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vd vdVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f19741d = vdVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f19741d, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new a(this.f19741d, dVar).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r5.f19739b
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r5.f19738a
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Consent$ConsentPane$Rendering r0 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Consent$ConsentPane.Rendering) r0
                vz.r.b(r6)
                goto L97
            L18:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L20:
                java.lang.Object r1 = r5.f19738a
                com.plaid.internal.x1 r1 = (com.plaid.internal.x1) r1
                vz.r.b(r6)
                goto L3a
            L28:
                vz.r.b(r6)
                com.plaid.internal.x1 r1 = com.plaid.internal.x1.this
                com.plaid.internal.vd r6 = r5.f19741d
                r5.f19738a = r1
                r5.f19739b = r3
                java.lang.Object r6 = r1.a(r6, r5)
                if (r6 != r0) goto L3a
                return r0
            L3a:
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r6 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) r6
                r1.f19736m = r6
                com.plaid.internal.x1 r6 = com.plaid.internal.x1.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r6 = r6.f19736m
                java.lang.String r1 = "pane"
                if (r6 != 0) goto L4a
                kotlin.jvm.internal.s.x(r1)
                r6 = r4
            L4a:
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Consent$ConsentPane$Rendering r6 = r6.getConsent()
                if (r6 != 0) goto L87
                com.plaid.internal.t5 r6 = new com.plaid.internal.t5
                com.plaid.internal.x1 r0 = com.plaid.internal.x1.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r0 = r0.f19736m
                if (r0 != 0) goto L5c
                kotlin.jvm.internal.s.x(r1)
                r0 = r4
            L5c:
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering$b r0 = r0.getRenderingCase()
                java.lang.String r2 = "Pane rendering must be consent. was "
                java.lang.String r0 = kotlin.jvm.internal.s.p(r2, r0)
                com.plaid.internal.x1 r2 = com.plaid.internal.x1.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r2 = r2.f19736m
                if (r2 != 0) goto L70
                kotlin.jvm.internal.s.x(r1)
                r2 = r4
            L70:
                java.lang.String r2 = r2.getId()
                com.plaid.internal.x1 r3 = com.plaid.internal.x1.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r3 = r3.f19736m
                if (r3 != 0) goto L7e
                kotlin.jvm.internal.s.x(r1)
                goto L7f
            L7e:
                r4 = r3
            L7f:
                java.lang.String r1 = r4.getPaneNodeId()
                r6.<init>(r0, r2, r1)
                throw r6
            L87:
                com.plaid.internal.x1 r1 = com.plaid.internal.x1.this
                kotlinx.coroutines.flow.t<com.plaid.internal.core.protos.link.workflow.nodes.panes.Consent$ConsentPane$Rendering> r1 = r1.f19731h
                r5.f19738a = r6
                r5.f19739b = r2
                java.lang.Object r1 = r1.emit(r6, r5)
                if (r1 != r0) goto L96
                return r0
            L96:
                r0 = r6
            L97:
                com.plaid.internal.x1 r6 = com.plaid.internal.x1.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Consent$ConsentPane$Rendering$Events r0 = r0.getEvents()
                r6.f19737n = r0
                com.plaid.internal.x1 r6 = com.plaid.internal.x1.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Consent$ConsentPane$Rendering$Events r0 = r6.f19737n
                if (r0 != 0) goto La6
                goto Laa
            La6:
                java.util.List r4 = r0.getOnAppearList()
            Laa:
                r6.a(r4)
                vz.b0 r6 = vz.b0.f54756a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.x1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.a<Consent$ConsentPane.Actions.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19742a = new b();

        public b() {
            super(0);
        }

        @Override // h00.a
        public Consent$ConsentPane.Actions.b invoke() {
            return Consent$ConsentPane.Actions.newBuilder().a(Consent$ConsentPane.Actions.ButtonTapAction.getDefaultInstance());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.a<Consent$ConsentPane.Actions.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f19743a = new c();

        public c() {
            super(0);
        }

        @Override // h00.a
        public Consent$ConsentPane.Actions.b invoke() {
            return Consent$ConsentPane.Actions.newBuilder().a(Consent$ConsentPane.Actions.ButtonDisclaimerTapAction.getDefaultInstance());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.a<Consent$ConsentPane.Actions.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f19744a = new d();

        public d() {
            super(0);
        }

        @Override // h00.a
        public Consent$ConsentPane.Actions.b invoke() {
            return Consent$ConsentPane.Actions.newBuilder().a(Consent$ConsentPane.Actions.ExitAction.getDefaultInstance());
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.a<Consent$ConsentPane.Actions.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f19745a = new e();

        public e() {
            super(0);
        }

        @Override // h00.a
        public Consent$ConsentPane.Actions.b invoke() {
            return Consent$ConsentPane.Actions.newBuilder().a(Consent$ConsentPane.Actions.SecondaryButtonTapAction.getDefaultInstance());
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.a<Consent$ConsentPane.Actions.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f19746a = new f();

        public f() {
            super(0);
        }

        @Override // h00.a
        public Consent$ConsentPane.Actions.b invoke() {
            return Consent$ConsentPane.Actions.newBuilder().a(Consent$ConsentPane.Actions.SecondaryButtonDisclaimerTapAction.getDefaultInstance());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(vd paneId, y7 paneHostComponent) {
        super(paneId, paneHostComponent);
        vz.k a11;
        vz.k a12;
        vz.k a13;
        vz.k a14;
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(paneHostComponent, "paneHostComponent");
        this.f19731h = kotlinx.coroutines.flow.a0.b(1, 0, null, 6, null);
        a11 = vz.m.a(b.f19742a);
        this.f19732i = a11;
        a12 = vz.m.a(c.f19743a);
        this.f19733j = a12;
        a13 = vz.m.a(e.f19745a);
        this.f19734k = a13;
        vz.m.a(f.f19746a);
        a14 = vz.m.a(d.f19744a);
        this.f19735l = a14;
        ((t1) ((x2.p) paneHostComponent.o()).a()).a(this);
        v20.k.d(androidx.lifecycle.q0.a(this), null, null, new a(paneId, null), 3, null);
    }

    @Override // com.plaid.internal.xd
    public void a() {
        Consent$ConsentPane.Actions.b consentExitAction = (Consent$ConsentPane.Actions.b) this.f19735l.getValue();
        kotlin.jvm.internal.s.f(consentExitAction, "consentExitAction");
        a(consentExitAction, (Common$SDKEvent) null);
    }

    public final void c() {
        Consent$ConsentPane.Actions.b consentDisclaimerAction = (Consent$ConsentPane.Actions.b) this.f19733j.getValue();
        kotlin.jvm.internal.s.f(consentDisclaimerAction, "consentDisclaimerAction");
        Consent$ConsentPane.Rendering.Events events = this.f19737n;
        a(consentDisclaimerAction, events == null ? null : events.getOnButtonDisclaimerTap());
    }

    public final void a(Consent$ConsentPane.Actions.b action, Common$SDKEvent common$SDKEvent) {
        kotlin.jvm.internal.s.g(action, "action");
        Consent$ConsentPane.Actions build = action.build();
        kotlin.jvm.internal.s.f(build, "action.build()");
        a(build, common$SDKEvent);
    }

    public final void a(Consent$ConsentPane.Actions action, Common$SDKEvent common$SDKEvent) {
        List m11;
        kotlin.jvm.internal.s.g(action, "action");
        Pane$PaneRendering pane$PaneRendering = this.f19736m;
        if (pane$PaneRendering == null) {
            kotlin.jvm.internal.s.x("pane");
            pane$PaneRendering = null;
        }
        String paneNodeId = pane$PaneRendering.getPaneNodeId();
        kotlin.jvm.internal.s.f(paneNodeId, "pane.paneNodeId");
        Pane$PaneOutput.a a11 = Pane$PaneOutput.newBuilder().a(action);
        kotlin.jvm.internal.s.f(a11, "newBuilder().setConsent(action)");
        m11 = wz.w.m(common$SDKEvent);
        a(paneNodeId, a11, m11);
    }
}