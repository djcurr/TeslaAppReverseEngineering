package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Challenge$ChallengePane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.x2;
import java.util.List;

/* loaded from: classes2.dex */
public final class z0 extends xd {

    /* renamed from: h  reason: collision with root package name */
    public kotlinx.serialization.json.a f19930h;

    /* renamed from: i  reason: collision with root package name */
    public g9 f19931i;

    /* renamed from: j  reason: collision with root package name */
    public md f19932j;

    /* renamed from: k  reason: collision with root package name */
    public final kotlinx.coroutines.flow.t<Challenge$ChallengePane.Rendering> f19933k;

    /* renamed from: l  reason: collision with root package name */
    public Pane$PaneRendering f19934l;

    /* renamed from: m  reason: collision with root package name */
    public Challenge$ChallengePane.Rendering.Events f19935m;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.challenge.ChallengeViewModel$1", f = "ChallengeViewModel.kt", l = {50, 54}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Object f19936a;

        /* renamed from: b  reason: collision with root package name */
        public int f19937b;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ vd f19939d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vd vdVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f19939d = vdVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f19939d, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new a(this.f19939d, dVar).invokeSuspend(vz.b0.f54756a);
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
                int r1 = r5.f19937b
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r5.f19936a
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Challenge$ChallengePane$Rendering r0 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Challenge$ChallengePane.Rendering) r0
                vz.r.b(r6)
                goto L97
            L18:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L20:
                java.lang.Object r1 = r5.f19936a
                com.plaid.internal.z0 r1 = (com.plaid.internal.z0) r1
                vz.r.b(r6)
                goto L3a
            L28:
                vz.r.b(r6)
                com.plaid.internal.z0 r1 = com.plaid.internal.z0.this
                com.plaid.internal.vd r6 = r5.f19939d
                r5.f19936a = r1
                r5.f19937b = r3
                java.lang.Object r6 = r1.a(r6, r5)
                if (r6 != r0) goto L3a
                return r0
            L3a:
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r6 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) r6
                r1.f19934l = r6
                com.plaid.internal.z0 r6 = com.plaid.internal.z0.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r6 = r6.f19934l
                java.lang.String r1 = "pane"
                if (r6 != 0) goto L4a
                kotlin.jvm.internal.s.x(r1)
                r6 = r4
            L4a:
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Challenge$ChallengePane$Rendering r6 = r6.getChallenge()
                if (r6 != 0) goto L87
                com.plaid.internal.t5 r6 = new com.plaid.internal.t5
                com.plaid.internal.z0 r0 = com.plaid.internal.z0.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r0 = r0.f19934l
                if (r0 != 0) goto L5c
                kotlin.jvm.internal.s.x(r1)
                r0 = r4
            L5c:
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering$b r0 = r0.getRenderingCase()
                java.lang.String r2 = "Pane rendering must be ButtonWithWebview. was "
                java.lang.String r0 = kotlin.jvm.internal.s.p(r2, r0)
                com.plaid.internal.z0 r2 = com.plaid.internal.z0.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r2 = r2.f19934l
                if (r2 != 0) goto L70
                kotlin.jvm.internal.s.x(r1)
                r2 = r4
            L70:
                java.lang.String r2 = r2.getId()
                com.plaid.internal.z0 r3 = com.plaid.internal.z0.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r3 = r3.f19934l
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
                com.plaid.internal.z0 r1 = com.plaid.internal.z0.this
                kotlinx.coroutines.flow.t<com.plaid.internal.core.protos.link.workflow.nodes.panes.Challenge$ChallengePane$Rendering> r1 = r1.f19933k
                r5.f19936a = r6
                r5.f19937b = r2
                java.lang.Object r1 = r1.emit(r6, r5)
                if (r1 != r0) goto L96
                return r0
            L96:
                r0 = r6
            L97:
                com.plaid.internal.z0 r6 = com.plaid.internal.z0.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Challenge$ChallengePane$Rendering$Events r0 = r0.getEvents()
                r6.f19935m = r0
                com.plaid.internal.z0 r6 = com.plaid.internal.z0.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Challenge$ChallengePane$Rendering$Events r0 = r6.f19935m
                if (r0 != 0) goto La6
                goto Laa
            La6:
                java.util.List r4 = r0.getOnAppearList()
            Laa:
                r6.a(r4)
                vz.b0 r6 = vz.b0.f54756a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.z0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19940a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final Challenge$ChallengePane.Actions.b f19941b;

        static {
            Challenge$ChallengePane.Actions.b a11 = Challenge$ChallengePane.Actions.newBuilder().a(Challenge$ChallengePane.Actions.ExitAction.getDefaultInstance());
            kotlin.jvm.internal.s.f(a11, "newBuilder().setExit(Cha…ion.getDefaultInstance())");
            f19941b = a11;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.challenge.ChallengeViewModel$exit$1", f = "ChallengeViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {
        public c(zz.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new c(dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new c(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            vz.r.b(obj);
            z0 z0Var = z0.this;
            b bVar = b.f19940a;
            z0.a(z0Var, b.f19941b, null, 2);
            return vz.b0.f54756a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(vd paneId, y7 paneHostComponent) {
        super(paneId, paneHostComponent);
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(paneHostComponent, "paneHostComponent");
        this.f19933k = kotlinx.coroutines.flow.a0.b(1, 0, null, 6, null);
        ((w0) ((x2.n) paneHostComponent.b()).a()).a(this);
        v20.k.d(androidx.lifecycle.q0.a(this), null, null, new a(paneId, null), 3, null);
    }

    @Override // com.plaid.internal.xd
    public void a() {
        v20.k.d(androidx.lifecycle.q0.a(this), null, null, new c(null), 3, null);
    }

    public static void a(z0 z0Var, Challenge$ChallengePane.Actions.b bVar, Common$SDKEvent common$SDKEvent, int i11) {
        List m11;
        Pane$PaneRendering pane$PaneRendering = z0Var.f19934l;
        if (pane$PaneRendering == null) {
            kotlin.jvm.internal.s.x("pane");
            pane$PaneRendering = null;
        }
        String paneNodeId = pane$PaneRendering.getPaneNodeId();
        kotlin.jvm.internal.s.f(paneNodeId, "pane.paneNodeId");
        Pane$PaneOutput.a a11 = Pane$PaneOutput.newBuilder().a(bVar);
        kotlin.jvm.internal.s.f(a11, "newBuilder().setChallenge(action)");
        m11 = wz.w.m(null);
        z0Var.a(paneNodeId, a11, m11);
    }
}