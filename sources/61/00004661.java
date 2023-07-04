package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelection$UserSelectionPane;
import com.plaid.internal.x2;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class yc extends xd {

    /* renamed from: h  reason: collision with root package name */
    public final kotlinx.coroutines.flow.t<UserSelection$UserSelectionPane.Rendering> f19899h;

    /* renamed from: i  reason: collision with root package name */
    public final c4<tb> f19900i;

    /* renamed from: j  reason: collision with root package name */
    public Pane$PaneRendering f19901j;

    /* renamed from: k  reason: collision with root package name */
    public UserSelection$UserSelectionPane.Rendering.Events f19902k;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.userselection.UserSelectionViewModel$1", f = "UserSelectionViewModel.kt", l = {36, 44}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Object f19903a;

        /* renamed from: b  reason: collision with root package name */
        public int f19904b;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ vd f19906d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vd vdVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f19906d = vdVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f19906d, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new a(this.f19906d, dVar).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[LOOP:0: B:35:0x00b3->B:37:0x00b9, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00df  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                Method dump skipped, instructions count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.yc.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19907a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final UserSelection$UserSelectionPane.Actions.b f19908b;

        /* renamed from: c  reason: collision with root package name */
        public static final UserSelection$UserSelectionPane.Actions.b f19909c;

        static {
            UserSelection$UserSelectionPane.Actions.b a11 = UserSelection$UserSelectionPane.Actions.newBuilder().a(UserSelection$UserSelectionPane.Actions.ExitAction.getDefaultInstance());
            kotlin.jvm.internal.s.f(a11, "newBuilder().setExit(Use…ion.getDefaultInstance())");
            f19908b = a11;
            UserSelection$UserSelectionPane.Actions.b a12 = UserSelection$UserSelectionPane.Actions.newBuilder().a(UserSelection$UserSelectionPane.Actions.SecondaryButtonTapAction.getDefaultInstance());
            kotlin.jvm.internal.s.f(a12, "newBuilder().setSecondar…DefaultInstance()\n      )");
            f19909c = a12;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(vd paneId, y7 paneHostComponent) {
        super(paneId, paneHostComponent);
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(paneHostComponent, "paneHostComponent");
        this.f19899h = kotlinx.coroutines.flow.a0.b(1, 0, null, 6, null);
        this.f19900i = new c4<>(null, 1);
        ((uc) ((x2.f0) paneHostComponent.e()).a()).a(this);
        v20.k.d(androidx.lifecycle.q0.a(this), null, null, new a(paneId, null), 3, null);
    }

    @Override // com.plaid.internal.xd
    public void a() {
        b bVar = b.f19907a;
        a(b.f19908b, (List<Common$SDKEvent>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelection$UserSelectionPane$Actions$SubmitAction$a] */
    public final void c() {
        ?? responses;
        UserSelection$UserSelectionPane.Actions.SubmitAction.Response.a builder;
        List<Common$SDKEvent> m11;
        List<? extends tb> list = this.f19900i.f18245c;
        if (list == null) {
            responses = 0;
        } else {
            responses = new ArrayList();
            for (tb tbVar : list) {
                UserSelection$UserSelectionPane.Actions.SubmitAction.Response response = tbVar.f19537b;
                UserSelection$UserSelectionPane.Actions.SubmitAction.Response build = (response == null || (builder = response.toBuilder()) == null) ? null : builder.a(tbVar.f19536a.getId()).build();
                if (build != null) {
                    responses.add(build);
                }
            }
        }
        if (responses == 0) {
            responses = wz.w.i();
        }
        b bVar = b.f19907a;
        kotlin.jvm.internal.s.g(responses, "responses");
        UserSelection$UserSelectionPane.Actions.b a11 = UserSelection$UserSelectionPane.Actions.newBuilder().a(UserSelection$UserSelectionPane.Actions.SubmitAction.newBuilder().a(responses));
        kotlin.jvm.internal.s.f(a11, "newBuilder().setSubmit(\n…ponses(responses)\n      )");
        UserSelection$UserSelectionPane.Rendering.Events events = this.f19902k;
        m11 = wz.w.m(events != null ? events.getOnSubmitTap() : null);
        a(a11, m11);
    }

    public final void a(UserSelection$UserSelectionPane.Actions.b bVar, List<Common$SDKEvent> list) {
        Pane$PaneRendering pane$PaneRendering = this.f19901j;
        if (pane$PaneRendering == null) {
            kotlin.jvm.internal.s.x("pane");
            pane$PaneRendering = null;
        }
        String paneNodeId = pane$PaneRendering.getPaneNodeId();
        kotlin.jvm.internal.s.f(paneNodeId, "pane.paneNodeId");
        Pane$PaneOutput.a a11 = Pane$PaneOutput.newBuilder().a(bVar);
        kotlin.jvm.internal.s.f(a11, "newBuilder().setUserSelection(action)");
        a(paneNodeId, a11, list);
    }
}