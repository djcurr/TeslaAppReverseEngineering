package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCards$ButtonWithCardsPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.x2;
import java.util.List;

/* loaded from: classes2.dex */
public final class f0 extends xd {

    /* renamed from: h  reason: collision with root package name */
    public final kotlinx.coroutines.flow.t<ButtonWithCards$ButtonWithCardsPane.Rendering> f18557h;

    /* renamed from: i  reason: collision with root package name */
    public Pane$PaneRendering f18558i;

    /* renamed from: j  reason: collision with root package name */
    public ButtonWithCards$ButtonWithCardsPane.Rendering.Events f18559j;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.buttonwithcards.ButtonWithCardsViewModel$1", f = "ButtonWithCardsViewModel.kt", l = {34, 42}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Object f18560a;

        /* renamed from: b  reason: collision with root package name */
        public int f18561b;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ vd f18563d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vd vdVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f18563d = vdVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f18563d, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new a(this.f18563d, dVar).invokeSuspend(vz.b0.f54756a);
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
                int r1 = r5.f18561b
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r5.f18560a
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCards$ButtonWithCardsPane$Rendering r0 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCards$ButtonWithCardsPane.Rendering) r0
                vz.r.b(r6)
                goto L97
            L18:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L20:
                java.lang.Object r1 = r5.f18560a
                com.plaid.internal.f0 r1 = (com.plaid.internal.f0) r1
                vz.r.b(r6)
                goto L3a
            L28:
                vz.r.b(r6)
                com.plaid.internal.f0 r1 = com.plaid.internal.f0.this
                com.plaid.internal.vd r6 = r5.f18563d
                r5.f18560a = r1
                r5.f18561b = r3
                java.lang.Object r6 = r1.a(r6, r5)
                if (r6 != r0) goto L3a
                return r0
            L3a:
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r6 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) r6
                r1.f18558i = r6
                com.plaid.internal.f0 r6 = com.plaid.internal.f0.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r6 = r6.f18558i
                java.lang.String r1 = "pane"
                if (r6 != 0) goto L4a
                kotlin.jvm.internal.s.x(r1)
                r6 = r4
            L4a:
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCards$ButtonWithCardsPane$Rendering r6 = r6.getButtonWithCards()
                if (r6 != 0) goto L87
                com.plaid.internal.t5 r6 = new com.plaid.internal.t5
                com.plaid.internal.f0 r0 = com.plaid.internal.f0.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r0 = r0.f18558i
                if (r0 != 0) goto L5c
                kotlin.jvm.internal.s.x(r1)
                r0 = r4
            L5c:
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering$b r0 = r0.getRenderingCase()
                java.lang.String r2 = "Pane rendering must be ButtonWithCards. was "
                java.lang.String r0 = kotlin.jvm.internal.s.p(r2, r0)
                com.plaid.internal.f0 r2 = com.plaid.internal.f0.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r2 = r2.f18558i
                if (r2 != 0) goto L70
                kotlin.jvm.internal.s.x(r1)
                r2 = r4
            L70:
                java.lang.String r2 = r2.getId()
                com.plaid.internal.f0 r3 = com.plaid.internal.f0.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r3 = r3.f18558i
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
                com.plaid.internal.f0 r1 = com.plaid.internal.f0.this
                kotlinx.coroutines.flow.t<com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCards$ButtonWithCardsPane$Rendering> r1 = r1.f18557h
                r5.f18560a = r6
                r5.f18561b = r2
                java.lang.Object r1 = r1.emit(r6, r5)
                if (r1 != r0) goto L96
                return r0
            L96:
                r0 = r6
            L97:
                com.plaid.internal.f0 r6 = com.plaid.internal.f0.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCards$ButtonWithCardsPane$Rendering$Events r0 = r0.getEvents()
                r6.f18559j = r0
                com.plaid.internal.f0 r6 = com.plaid.internal.f0.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithCards$ButtonWithCardsPane$Rendering$Events r0 = r6.f18559j
                if (r0 != 0) goto La6
                goto Laa
            La6:
                java.util.List r4 = r0.getOnAppearList()
            Laa:
                r6.a(r4)
                vz.b0 r6 = vz.b0.f54756a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.f0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f18564a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final ButtonWithCards$ButtonWithCardsPane.Actions.b f18565b;

        /* renamed from: c  reason: collision with root package name */
        public static final ButtonWithCards$ButtonWithCardsPane.Actions.b f18566c;

        /* renamed from: d  reason: collision with root package name */
        public static final ButtonWithCards$ButtonWithCardsPane.Actions.b f18567d;

        static {
            ButtonWithCards$ButtonWithCardsPane.Actions.b a11 = ButtonWithCards$ButtonWithCardsPane.Actions.newBuilder().a(ButtonWithCards$ButtonWithCardsPane.Actions.ButtonTapAction.getDefaultInstance());
            kotlin.jvm.internal.s.f(a11, "newBuilder()\n      .setB…ion.getDefaultInstance())");
            f18565b = a11;
            ButtonWithCards$ButtonWithCardsPane.Actions.b a12 = ButtonWithCards$ButtonWithCardsPane.Actions.newBuilder().a(ButtonWithCards$ButtonWithCardsPane.Actions.SecondaryButtonTapAction.getDefaultInstance());
            kotlin.jvm.internal.s.f(a12, "newBuilder().setSecondar…DefaultInstance()\n      )");
            f18566c = a12;
            ButtonWithCards$ButtonWithCardsPane.Actions.b a13 = ButtonWithCards$ButtonWithCardsPane.Actions.newBuilder().a(ButtonWithCards$ButtonWithCardsPane.Actions.ExitAction.getDefaultInstance());
            kotlin.jvm.internal.s.f(a13, "newBuilder().setExit(But…ion.getDefaultInstance())");
            f18567d = a13;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(vd paneId, y7 paneHostComponent) {
        super(paneId, paneHostComponent);
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(paneHostComponent, "paneHostComponent");
        this.f18557h = kotlinx.coroutines.flow.a0.b(1, 0, null, 6, null);
        ((c0) ((x2.h) paneHostComponent.g()).a()).a(this);
        v20.k.d(androidx.lifecycle.q0.a(this), null, null, new a(paneId, null), 3, null);
    }

    @Override // com.plaid.internal.xd
    public void a() {
        b bVar = b.f18564a;
        a(b.f18567d, (List<Common$SDKEvent>) null);
    }

    public final void a(ButtonWithCards$ButtonWithCardsPane.Actions.b bVar, List<Common$SDKEvent> list) {
        Pane$PaneRendering pane$PaneRendering = this.f18558i;
        if (pane$PaneRendering == null) {
            kotlin.jvm.internal.s.x("pane");
            pane$PaneRendering = null;
        }
        String paneNodeId = pane$PaneRendering.getPaneNodeId();
        kotlin.jvm.internal.s.f(paneNodeId, "pane.paneNodeId");
        Pane$PaneOutput.a a11 = Pane$PaneOutput.newBuilder().a(bVar);
        kotlin.jvm.internal.s.f(a11, "newBuilder().setButtonWithCards(action)");
        a(paneNodeId, a11, list);
    }
}