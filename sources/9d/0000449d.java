package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Oauth$OAuthPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.x2;
import java.util.List;

/* loaded from: classes2.dex */
public final class m7 extends xd {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f19023n = 0;

    /* renamed from: h  reason: collision with root package name */
    public final kotlinx.coroutines.flow.t<c> f19024h;

    /* renamed from: i  reason: collision with root package name */
    public final kotlinx.coroutines.flow.t<Oauth$OAuthPane.Rendering> f19025i;

    /* renamed from: j  reason: collision with root package name */
    public Pane$PaneRendering f19026j;

    /* renamed from: k  reason: collision with root package name */
    public Oauth$OAuthPane.Rendering.Events f19027k;

    /* renamed from: l  reason: collision with root package name */
    public bb f19028l;

    /* renamed from: m  reason: collision with root package name */
    public w6 f19029m;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.oauth.OAuthViewModel$1", f = "OAuthViewModel.kt", l = {47, 56, 58, 65, 68}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Object f19030a;

        /* renamed from: b  reason: collision with root package name */
        public int f19031b;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ vd f19033d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vd vdVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f19033d = vdVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f19033d, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new a(this.f19033d, dVar).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00d8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0189  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x01a9  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 494
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.m7.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19034a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final Oauth$OAuthPane.Actions.b f19035b;

        static {
            Oauth$OAuthPane.Actions.b a11 = Oauth$OAuthPane.Actions.newBuilder().a(Oauth$OAuthPane.Actions.ExitAction.getDefaultInstance());
            kotlin.jvm.internal.s.f(a11, "newBuilder().setExit(OAu…ion.getDefaultInstance())");
            f19035b = a11;
        }
    }

    /* loaded from: classes2.dex */
    public enum c {
        BEFORE,
        DURING,
        AFTER
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(vd paneId, y7 paneHostComponent) {
        super(paneId, paneHostComponent);
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(paneHostComponent, "paneHostComponent");
        this.f19024h = kotlinx.coroutines.flow.a0.b(1, 0, kotlinx.coroutines.channels.a.DROP_OLDEST, 2, null);
        this.f19025i = kotlinx.coroutines.flow.a0.b(1, 0, null, 6, null);
        ((h7) ((x2.x) paneHostComponent.d()).a()).a(this);
        v20.k.d(androidx.lifecycle.q0.a(this), null, null, new a(paneId, null), 3, null);
    }

    public final void a(Oauth$OAuthPane.Rendering rendering) {
        if (!rendering.hasDuring()) {
            Pane$PaneRendering pane$PaneRendering = this.f19026j;
            Pane$PaneRendering pane$PaneRendering2 = null;
            if (pane$PaneRendering == null) {
                kotlin.jvm.internal.s.x("pane");
                pane$PaneRendering = null;
            }
            String id2 = pane$PaneRendering.getId();
            Pane$PaneRendering pane$PaneRendering3 = this.f19026j;
            if (pane$PaneRendering3 == null) {
                kotlin.jvm.internal.s.x("pane");
            } else {
                pane$PaneRendering2 = pane$PaneRendering3;
            }
            throw new t5("oAuth pane rendering misses during content", id2, pane$PaneRendering2.getPaneNodeId());
        }
        this.f19024h.b(c.DURING);
    }

    public final w6 c() {
        w6 w6Var = this.f19029m;
        if (w6Var != null) {
            return w6Var;
        }
        kotlin.jvm.internal.s.x("localPaneStateStore");
        return null;
    }

    @Override // com.plaid.internal.xd
    public void a() {
        b bVar = b.f19034a;
        a(this, b.f19035b, null, 2);
    }

    public static void a(m7 m7Var, Oauth$OAuthPane.Actions.b bVar, List list, int i11) {
        Pane$PaneRendering pane$PaneRendering = m7Var.f19026j;
        if (pane$PaneRendering == null) {
            kotlin.jvm.internal.s.x("pane");
            pane$PaneRendering = null;
        }
        String paneNodeId = pane$PaneRendering.getPaneNodeId();
        kotlin.jvm.internal.s.f(paneNodeId, "pane.paneNodeId");
        Pane$PaneOutput.a a11 = Pane$PaneOutput.newBuilder().a(bVar);
        kotlin.jvm.internal.s.f(a11, "newBuilder().setOauth(action)");
        m7Var.a(paneNodeId, a11, null);
    }
}