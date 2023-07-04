package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Credentials$CredentialsPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.x2;
import java.util.List;

/* loaded from: classes2.dex */
public final class v2 extends xd {

    /* renamed from: h  reason: collision with root package name */
    public Pane$PaneRendering f19599h;

    /* renamed from: i  reason: collision with root package name */
    public Credentials$CredentialsPane.Rendering.Events f19600i;

    /* renamed from: j  reason: collision with root package name */
    public Credentials$CredentialsPane.Rendering.Encryption f19601j;

    /* renamed from: k  reason: collision with root package name */
    public final kotlinx.coroutines.flow.t<Credentials$CredentialsPane.Rendering> f19602k;

    /* renamed from: l  reason: collision with root package name */
    public e4 f19603l;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.credentials.CredentialsViewModel$1", f = "CredentialsViewModel.kt", l = {39, 47}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Object f19604a;

        /* renamed from: b  reason: collision with root package name */
        public int f19605b;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ vd f19607d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vd vdVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f19607d = vdVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f19607d, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new a(this.f19607d, dVar).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r5.f19605b
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                java.lang.Object r0 = r5.f19604a
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Credentials$CredentialsPane$Rendering r0 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Credentials$CredentialsPane.Rendering) r0
                vz.r.b(r6)
                goto L97
            L18:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L20:
                java.lang.Object r1 = r5.f19604a
                com.plaid.internal.v2 r1 = (com.plaid.internal.v2) r1
                vz.r.b(r6)
                goto L3a
            L28:
                vz.r.b(r6)
                com.plaid.internal.v2 r1 = com.plaid.internal.v2.this
                com.plaid.internal.vd r6 = r5.f19607d
                r5.f19604a = r1
                r5.f19605b = r3
                java.lang.Object r6 = r1.a(r6, r5)
                if (r6 != r0) goto L3a
                return r0
            L3a:
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r6 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) r6
                r1.f19599h = r6
                com.plaid.internal.v2 r6 = com.plaid.internal.v2.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r6 = r6.f19599h
                java.lang.String r1 = "pane"
                if (r6 != 0) goto L4a
                kotlin.jvm.internal.s.x(r1)
                r6 = r4
            L4a:
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Credentials$CredentialsPane$Rendering r6 = r6.getCredentials()
                if (r6 != 0) goto L87
                com.plaid.internal.t5 r6 = new com.plaid.internal.t5
                com.plaid.internal.v2 r0 = com.plaid.internal.v2.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r0 = r0.f19599h
                if (r0 != 0) goto L5c
                kotlin.jvm.internal.s.x(r1)
                r0 = r4
            L5c:
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering$b r0 = r0.getRenderingCase()
                java.lang.String r2 = "Pane rendering must be credentials. was "
                java.lang.String r0 = kotlin.jvm.internal.s.p(r2, r0)
                com.plaid.internal.v2 r2 = com.plaid.internal.v2.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r2 = r2.f19599h
                if (r2 != 0) goto L70
                kotlin.jvm.internal.s.x(r1)
                r2 = r4
            L70:
                java.lang.String r2 = r2.getId()
                com.plaid.internal.v2 r3 = com.plaid.internal.v2.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r3 = r3.f19599h
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
                com.plaid.internal.v2 r1 = com.plaid.internal.v2.this
                kotlinx.coroutines.flow.t<com.plaid.internal.core.protos.link.workflow.nodes.panes.Credentials$CredentialsPane$Rendering> r1 = r1.f19602k
                r5.f19604a = r6
                r5.f19605b = r2
                java.lang.Object r1 = r1.emit(r6, r5)
                if (r1 != r0) goto L96
                return r0
            L96:
                r0 = r6
            L97:
                com.plaid.internal.v2 r6 = com.plaid.internal.v2.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Credentials$CredentialsPane$Rendering$Events r1 = r0.getEvents()
                r6.f19600i = r1
                com.plaid.internal.v2 r6 = com.plaid.internal.v2.this
                boolean r0 = r0.hasEncryption()
                if (r0 == 0) goto Lac
                com.plaid.internal.v2 r0 = com.plaid.internal.v2.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Credentials$CredentialsPane$Rendering$Encryption r0 = r0.f19601j
                goto Lad
            Lac:
                r0 = r4
            Lad:
                r6.f19601j = r0
                com.plaid.internal.v2 r6 = com.plaid.internal.v2.this
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Credentials$CredentialsPane$Rendering$Events r0 = r6.f19600i
                if (r0 != 0) goto Lb6
                goto Lba
            Lb6:
                java.util.List r4 = r0.getOnAppearList()
            Lba:
                r6.a(r4)
                vz.b0 r6 = vz.b0.f54756a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.v2.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19608a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final Credentials$CredentialsPane.Actions.b f19609b;

        /* renamed from: c  reason: collision with root package name */
        public static final Credentials$CredentialsPane.Actions.b f19610c;

        static {
            Credentials$CredentialsPane.Actions.b a11 = Credentials$CredentialsPane.Actions.newBuilder().a(Credentials$CredentialsPane.Actions.ExitAction.getDefaultInstance());
            kotlin.jvm.internal.s.f(a11, "newBuilder().setExit(Cre…ion.getDefaultInstance())");
            f19609b = a11;
            Credentials$CredentialsPane.Actions.b a12 = Credentials$CredentialsPane.Actions.newBuilder().a(Credentials$CredentialsPane.Actions.SecondaryButtonTapAction.getDefaultInstance());
            kotlin.jvm.internal.s.f(a12, "newBuilder()\n        .se…ion.getDefaultInstance())");
            f19610c = a12;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(vd paneId, y7 paneHostComponent) {
        super(paneId, paneHostComponent);
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(paneHostComponent, "paneHostComponent");
        this.f19602k = kotlinx.coroutines.flow.a0.b(1, 0, null, 6, null);
        ((s2) ((x2.r) paneHostComponent.l()).a()).a(this);
        v20.k.d(androidx.lifecycle.q0.a(this), null, null, new a(paneId, null), 3, null);
    }

    @Override // com.plaid.internal.xd
    public void a() {
        b bVar = b.f19608a;
        a(b.f19609b, (List<Common$SDKEvent>) null);
    }

    public final void a(Credentials$CredentialsPane.Actions.b bVar, List<Common$SDKEvent> list) {
        Pane$PaneRendering pane$PaneRendering = this.f19599h;
        if (pane$PaneRendering == null) {
            kotlin.jvm.internal.s.x("pane");
            pane$PaneRendering = null;
        }
        String paneNodeId = pane$PaneRendering.getPaneNodeId();
        kotlin.jvm.internal.s.f(paneNodeId, "pane.paneNodeId");
        Pane$PaneOutput.a a11 = Pane$PaneOutput.newBuilder().a(bVar);
        kotlin.jvm.internal.s.f(a11, "newBuilder().setCredentials(action)");
        a(paneNodeId, a11, list);
    }
}