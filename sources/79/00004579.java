package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Button$ButtonPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.x2;
import java.util.List;

/* loaded from: classes2.dex */
public final class t extends xd {

    /* renamed from: h  reason: collision with root package name */
    public final kotlinx.coroutines.flow.t<Button$ButtonPane.Rendering> f19477h;

    /* renamed from: i  reason: collision with root package name */
    public final vz.k f19478i;

    /* renamed from: j  reason: collision with root package name */
    public final vz.k f19479j;

    /* renamed from: k  reason: collision with root package name */
    public final vz.k f19480k;

    /* renamed from: l  reason: collision with root package name */
    public final vz.k f19481l;

    /* renamed from: m  reason: collision with root package name */
    public Pane$PaneRendering f19482m;

    /* renamed from: n  reason: collision with root package name */
    public Button$ButtonPane.Rendering.Events f19483n;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.button.ButtonViewModel$1", f = "ButtonViewModel.kt", l = {46, 54}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Object f19484a;

        /* renamed from: b  reason: collision with root package name */
        public int f19485b;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ vd f19487d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vd vdVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f19487d = vdVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f19487d, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new a(this.f19487d, dVar).invokeSuspend(vz.b0.f54756a);
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
                int r1 = r5.f19485b
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r5.f19484a
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Button$ButtonPane$Rendering r0 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Button$ButtonPane.Rendering) r0
                vz.r.b(r6)
                goto L97
            L18:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L20:
                java.lang.Object r1 = r5.f19484a
                com.plaid.internal.t r1 = (com.plaid.internal.t) r1
                vz.r.b(r6)
                goto L3a
            L28:
                vz.r.b(r6)
                com.plaid.internal.t r1 = com.plaid.internal.t.this
                com.plaid.internal.vd r6 = r5.f19487d
                r5.f19484a = r1
                r5.f19485b = r3
                java.lang.Object r6 = r1.a(r6, r5)
                if (r6 != r0) goto L3a
                return r0
            L3a:
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r6 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) r6
                r1.f19482m = r6
                com.plaid.internal.t r6 = com.plaid.internal.t.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r6 = r6.f19482m
                java.lang.String r1 = "pane"
                if (r6 != 0) goto L4a
                kotlin.jvm.internal.s.x(r1)
                r6 = r4
            L4a:
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Button$ButtonPane$Rendering r6 = r6.getButton()
                if (r6 != 0) goto L87
                com.plaid.internal.t5 r6 = new com.plaid.internal.t5
                com.plaid.internal.t r0 = com.plaid.internal.t.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r0 = r0.f19482m
                if (r0 != 0) goto L5c
                kotlin.jvm.internal.s.x(r1)
                r0 = r4
            L5c:
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering$b r0 = r0.getRenderingCase()
                java.lang.String r2 = "Pane rendering must be button. was "
                java.lang.String r0 = kotlin.jvm.internal.s.p(r2, r0)
                com.plaid.internal.t r2 = com.plaid.internal.t.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r2 = r2.f19482m
                if (r2 != 0) goto L70
                kotlin.jvm.internal.s.x(r1)
                r2 = r4
            L70:
                java.lang.String r2 = r2.getId()
                com.plaid.internal.t r3 = com.plaid.internal.t.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r3 = r3.f19482m
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
                com.plaid.internal.t r1 = com.plaid.internal.t.this
                kotlinx.coroutines.flow.t<com.plaid.internal.core.protos.link.workflow.nodes.panes.Button$ButtonPane$Rendering> r1 = r1.f19477h
                r5.f19484a = r6
                r5.f19485b = r2
                java.lang.Object r1 = r1.emit(r6, r5)
                if (r1 != r0) goto L96
                return r0
            L96:
                r0 = r6
            L97:
                com.plaid.internal.t r6 = com.plaid.internal.t.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Button$ButtonPane$Rendering$Events r0 = r0.getEvents()
                r6.f19483n = r0
                com.plaid.internal.t r6 = com.plaid.internal.t.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Button$ButtonPane$Rendering$Events r0 = r6.f19483n
                if (r0 != 0) goto La6
                goto Laa
            La6:
                java.util.List r4 = r0.getOnAppearList()
            Laa:
                r6.a(r4)
                vz.b0 r6 = vz.b0.f54756a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.t.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.a<Button$ButtonPane.Actions.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19488a = new b();

        public b() {
            super(0);
        }

        @Override // h00.a
        public Button$ButtonPane.Actions.b invoke() {
            return Button$ButtonPane.Actions.newBuilder().a(Button$ButtonPane.Actions.ExitAction.getDefaultInstance());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.a<Button$ButtonPane.Actions.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f19489a = new c();

        public c() {
            super(0);
        }

        @Override // h00.a
        public Button$ButtonPane.Actions.b invoke() {
            return Button$ButtonPane.Actions.newBuilder().a(Button$ButtonPane.Actions.SecondaryButtonTapAction.getDefaultInstance());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.a<Button$ButtonPane.Actions.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f19490a = new d();

        public d() {
            super(0);
        }

        @Override // h00.a
        public Button$ButtonPane.Actions.b invoke() {
            return Button$ButtonPane.Actions.newBuilder().a(Button$ButtonPane.Actions.ButtonTapAction.getDefaultInstance());
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.u implements h00.a<Button$ButtonPane.Actions.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f19491a = new e();

        public e() {
            super(0);
        }

        @Override // h00.a
        public Button$ButtonPane.Actions.b invoke() {
            return Button$ButtonPane.Actions.newBuilder().a(Button$ButtonPane.Actions.TertiaryButtonTapAction.getDefaultInstance());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(vd paneId, y7 paneHostComponent) {
        super(paneId, paneHostComponent);
        vz.k a11;
        vz.k a12;
        vz.k a13;
        vz.k a14;
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(paneHostComponent, "paneHostComponent");
        this.f19477h = kotlinx.coroutines.flow.a0.b(1, 0, null, 6, null);
        a11 = vz.m.a(d.f19490a);
        this.f19478i = a11;
        a12 = vz.m.a(c.f19489a);
        this.f19479j = a12;
        a13 = vz.m.a(e.f19491a);
        this.f19480k = a13;
        a14 = vz.m.a(b.f19488a);
        this.f19481l = a14;
        ((n) ((x2.b) paneHostComponent.m()).a()).a(this);
        v20.k.d(androidx.lifecycle.q0.a(this), null, null, new a(paneId, null), 3, null);
    }

    @Override // com.plaid.internal.xd
    public void a() {
        Button$ButtonPane.Actions.b buttonPaneExitAction = (Button$ButtonPane.Actions.b) this.f19481l.getValue();
        kotlin.jvm.internal.s.f(buttonPaneExitAction, "buttonPaneExitAction");
        a(buttonPaneExitAction, (Common$SDKEvent) null);
    }

    public final void a(Button$ButtonPane.Actions.b bVar, Common$SDKEvent common$SDKEvent) {
        List m11;
        Pane$PaneRendering pane$PaneRendering = this.f19482m;
        if (pane$PaneRendering == null) {
            kotlin.jvm.internal.s.x("pane");
            pane$PaneRendering = null;
        }
        String paneNodeId = pane$PaneRendering.getPaneNodeId();
        kotlin.jvm.internal.s.f(paneNodeId, "pane.paneNodeId");
        Pane$PaneOutput.a a11 = Pane$PaneOutput.newBuilder().a(bVar);
        kotlin.jvm.internal.s.f(a11, "newBuilder().setButton(action)");
        m11 = wz.w.m(common$SDKEvent);
        a(paneNodeId, a11, m11);
    }
}