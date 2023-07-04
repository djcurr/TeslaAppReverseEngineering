package com.plaid.internal;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$PollingOptions;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuth$HeadlessOAuthPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.wa;
import com.plaid.internal.x2;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class u3 extends xd {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f19556m = 0;

    /* renamed from: h  reason: collision with root package name */
    public final kotlinx.coroutines.flow.t<Pane$PaneRendering> f19557h;

    /* renamed from: i  reason: collision with root package name */
    public bb f19558i;

    /* renamed from: j  reason: collision with root package name */
    public w6 f19559j;

    /* renamed from: k  reason: collision with root package name */
    public md f19560k;

    /* renamed from: l  reason: collision with root package name */
    public j7 f19561l;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel$1", f = "HeadlessOAuthViewModel.kt", l = {50, 62}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19562a;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ vd f19564c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vd vdVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f19564c = vdVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f19564c, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new a(this.f19564c, dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            Object a11;
            md mdVar;
            m6 m6Var;
            k7 k7Var;
            d11 = a00.d.d();
            int i11 = this.f19562a;
            if (i11 == 0) {
                vz.r.b(obj);
                u3 u3Var = u3.this;
                vd vdVar = this.f19564c;
                this.f19562a = 1;
                a11 = u3Var.a(vdVar, this);
                if (a11 == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vz.r.b(obj);
                return vz.b0.f54756a;
            } else {
                vz.r.b(obj);
                a11 = obj;
            }
            Pane$PaneRendering pane$PaneRendering = (Pane$PaneRendering) a11;
            if (pane$PaneRendering.hasHeadlessOAuth()) {
                HeadlessOAuth$HeadlessOAuthPane.Rendering rendering = pane$PaneRendering.getHeadlessOAuth();
                u3 u3Var2 = u3.this;
                rendering.getEvents();
                u3Var2.getClass();
                u3 u3Var3 = u3.this;
                md mdVar2 = u3Var3.f19560k;
                if (mdVar2 != null) {
                    mdVar = mdVar2;
                } else {
                    kotlin.jvm.internal.s.x("workflowApi");
                    mdVar = null;
                }
                m6 m6Var2 = u3.this.f19843e;
                if (m6Var2 != null) {
                    m6Var = m6Var2;
                } else {
                    kotlin.jvm.internal.s.x("linkWorkflowAnalytics");
                    m6Var = null;
                }
                u3 u3Var4 = u3.this;
                kotlin.jvm.internal.s.f(rendering, "rendering");
                u3Var4.getClass();
                Common$PollingOptions options = rendering.getPolling();
                kotlin.jvm.internal.s.f(options, "this.polling");
                kotlin.jvm.internal.s.g(options, "options");
                if (kotlin.jvm.internal.s.c(options, Common$PollingOptions.getDefaultInstance())) {
                    wa.a.b(wa.f19678a, "No polling options received", false, 2);
                    k7Var = new k7(false, options.getIntervalMs() > 0 ? options.getIntervalMs() : 500L, options.getMaxDurationMs() <= 0 ? 5000L : options.getMaxDurationMs());
                } else {
                    if (options.getIntervalMs() <= 0 || options.getMaxDurationMs() <= 0) {
                        wa.a aVar = wa.f19678a;
                        StringBuilder a12 = g4.a("Invalid polling options received - duration: ");
                        a12.append(options.getMaxDurationMs());
                        a12.append(" interval: ");
                        a12.append(options.getIntervalMs());
                        wa.a.b(aVar, a12.toString(), false, 2);
                    }
                    k7Var = new k7(true, options.getIntervalMs() > 0 ? options.getIntervalMs() : 500L, options.getMaxDurationMs() <= 0 ? 5000L : options.getMaxDurationMs());
                }
                String oauthStateId = rendering.getOauthStateId();
                kotlin.jvm.internal.s.f(oauthStateId, "rendering.oauthStateId");
                j7 j7Var = new j7(mdVar, m6Var, k7Var, oauthStateId, this.f19564c);
                kotlin.jvm.internal.s.g(j7Var, "<set-?>");
                u3Var3.f19561l = j7Var;
                kotlinx.coroutines.flow.t<Pane$PaneRendering> tVar = u3.this.f19557h;
                this.f19562a = 2;
                if (tVar.emit(pane$PaneRendering, this) == d11) {
                    return d11;
                }
                return vz.b0.f54756a;
            }
            throw new t5(kotlin.jvm.internal.s.p("Pane rendering must be headless oauth. was ", pane$PaneRendering.getRenderingCase()), pane$PaneRendering.getId(), pane$PaneRendering.getPaneNodeId());
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b {

        /* loaded from: classes2.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public final String f19565a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String oautStateId) {
                super(null);
                kotlin.jvm.internal.s.g(oautStateId, "oautStateId");
                this.f19565a = oautStateId;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.s.c(this.f19565a, ((a) obj).f19565a);
            }

            public int hashCode() {
                return this.f19565a.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("PollOAuthResult(oautStateId=");
                a11.append(this.f19565a);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        /* renamed from: com.plaid.internal.u3$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0349b extends b {

            /* renamed from: a  reason: collision with root package name */
            public final String f19566a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0349b(String loginUrl) {
                super(null);
                kotlin.jvm.internal.s.g(loginUrl, "loginUrl");
                this.f19566a = loginUrl;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0349b) && kotlin.jvm.internal.s.c(this.f19566a, ((C0349b) obj).f19566a);
            }

            public int hashCode() {
                return this.f19566a.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("ShowLogin(loginUrl=");
                a11.append(this.f19566a);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public final String f19567a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String redirectUri) {
                super(null);
                kotlin.jvm.internal.s.g(redirectUri, "redirectUri");
                this.f19567a = redirectUri;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && kotlin.jvm.internal.s.c(this.f19567a, ((c) obj).f19567a);
            }

            public int hashCode() {
                return this.f19567a.hashCode();
            }

            public String toString() {
                StringBuilder a11 = g4.a("SubmitRedirectUri(redirectUri=");
                a11.append(this.f19567a);
                a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return a11.toString();
            }
        }

        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", f = "HeadlessOAuthViewModel.kt", l = {67}, m = "doOnStart")
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f19568a;

        /* renamed from: c  reason: collision with root package name */
        public int f19570c;

        public c(zz.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19568a = obj;
            this.f19570c |= Integer.MIN_VALUE;
            return u3.this.e(this);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d<T> implements kotlinx.coroutines.flow.f {

        @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel$doOnStart$2", f = "HeadlessOAuthViewModel.kt", l = {68, 69, 70}, m = "emit")
        /* loaded from: classes2.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a  reason: collision with root package name */
            public Object f19572a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ Object f19573b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ d<T> f19574c;

            /* renamed from: d  reason: collision with root package name */
            public int f19575d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, zz.d<? super a> dVar2) {
                super(dVar2);
                this.f19574c = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f19573b = obj;
                this.f19575d |= Integer.MIN_VALUE;
                return this.f19574c.emit(null, this);
            }
        }

        public d() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
        @Override // kotlinx.coroutines.flow.f
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r7, zz.d<? super vz.b0> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.plaid.internal.u3.d.a
                if (r0 == 0) goto L13
                r0 = r8
                com.plaid.internal.u3$d$a r0 = (com.plaid.internal.u3.d.a) r0
                int r1 = r0.f19575d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f19575d = r1
                goto L18
            L13:
                com.plaid.internal.u3$d$a r0 = new com.plaid.internal.u3$d$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f19573b
                java.lang.Object r1 = a00.b.d()
                int r2 = r0.f19575d
                r3 = 3
                r4 = 1
                r5 = 2
                if (r2 == 0) goto L43
                if (r2 == r4) goto L3b
                if (r2 == r5) goto L37
                if (r2 != r3) goto L2f
                vz.r.b(r8)
                goto L84
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                vz.r.b(r8)
                goto L6c
            L3b:
                java.lang.Object r7 = r0.f19572a
                com.plaid.internal.u3$d r7 = (com.plaid.internal.u3.d) r7
                vz.r.b(r8)
                goto L54
            L43:
                vz.r.b(r8)
                com.plaid.internal.u3 r8 = com.plaid.internal.u3.this
                r0.f19572a = r6
                r0.f19575d = r4
                java.lang.Object r8 = com.plaid.internal.u3.a(r8, r7, r0)
                if (r8 != r1) goto L53
                return r1
            L53:
                r7 = r6
            L54:
                com.plaid.internal.u3$b r8 = (com.plaid.internal.u3.b) r8
                boolean r2 = r8 instanceof com.plaid.internal.u3.b.C0349b
                r4 = 0
                if (r2 == 0) goto L6f
                com.plaid.internal.u3 r7 = com.plaid.internal.u3.this
                com.plaid.internal.u3$b$b r8 = (com.plaid.internal.u3.b.C0349b) r8
                java.lang.String r8 = r8.f19566a
                r0.f19572a = r4
                r0.f19575d = r5
                java.lang.Object r7 = com.plaid.internal.u3.a(r7, r8, r0)
                if (r7 != r1) goto L6c
                return r1
            L6c:
                vz.b0 r7 = vz.b0.f54756a
                return r7
            L6f:
                boolean r2 = r8 instanceof com.plaid.internal.u3.b.a
                if (r2 == 0) goto L87
                com.plaid.internal.u3 r7 = com.plaid.internal.u3.this
                com.plaid.internal.u3$b$a r8 = (com.plaid.internal.u3.b.a) r8
                java.lang.String r8 = r8.f19565a
                r0.f19572a = r4
                r0.f19575d = r3
                java.lang.Object r7 = com.plaid.internal.u3.b(r7, r8, r0)
                if (r7 != r1) goto L84
                return r1
            L84:
                vz.b0 r7 = vz.b0.f54756a
                return r7
            L87:
                boolean r0 = r8 instanceof com.plaid.internal.u3.b.c
                if (r0 == 0) goto Lb9
                com.plaid.internal.u3 r7 = com.plaid.internal.u3.this
                com.plaid.internal.u3$b$c r8 = (com.plaid.internal.u3.b.c) r8
                java.lang.String r8 = r8.f19567a
                r7.getClass()
                com.plaid.internal.wa$a r0 = com.plaid.internal.wa.f19678a
                r1 = 0
                java.lang.String r2 = "Submit redirect URI"
                com.plaid.internal.wa.a.a(r0, r2, r1, r5)
                java.lang.String r0 = "oauthRedirectUri"
                kotlin.jvm.internal.s.g(r8, r0)
                com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuth$HeadlessOAuthPane$Actions$b r0 = com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuth$HeadlessOAuthPane.Actions.newBuilder()
                com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuth$HeadlessOAuthPane$Actions$SubmitAction$a r1 = com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuth.HeadlessOAuthPane.Actions.SubmitAction.newBuilder()
                com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuth$HeadlessOAuthPane$Actions$SubmitAction$a r8 = r1.b(r8)
                com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuth$HeadlessOAuthPane$Actions$b r8 = r0.a(r8)
                java.lang.String r0 = "Actions.submitUri(oauthRedirectUri)"
                kotlin.jvm.internal.s.f(r8, r0)
                com.plaid.internal.u3.a(r7, r8, r4, r5)
            Lb9:
                vz.b0 r7 = vz.b0.f54756a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.u3.d.emit(com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering, zz.d):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(vd paneId, y7 paneHostComponent) {
        super(paneId, paneHostComponent);
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(paneHostComponent, "paneHostComponent");
        this.f19557h = kotlinx.coroutines.flow.a0.b(1, 0, null, 6, null);
        ((s3) ((x2.v) paneHostComponent.i()).a()).a(this);
        v20.k.d(androidx.lifecycle.q0.a(this), null, null, new a(paneId, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.plaid.internal.u3 r8, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r9, zz.d r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof com.plaid.internal.v3
            if (r0 == 0) goto L16
            r0 = r10
            com.plaid.internal.v3 r0 = (com.plaid.internal.v3) r0
            int r1 = r0.f19615e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f19615e = r1
            goto L1b
        L16:
            com.plaid.internal.v3 r0 = new com.plaid.internal.v3
            r0.<init>(r8, r10)
        L1b:
            java.lang.Object r10 = r0.f19613c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19615e
            r3 = 0
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L4b
            if (r2 == r6) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r8 = r0.f19611a
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r8 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) r8
            vz.r.b(r10)
            goto La9
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            java.lang.Object r8 = r0.f19612b
            r9 = r8
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r9 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) r9
            java.lang.Object r8 = r0.f19611a
            com.plaid.internal.u3 r8 = (com.plaid.internal.u3) r8
            vz.r.b(r10)
            goto L6d
        L4b:
            vz.r.b(r10)
            com.plaid.internal.w6 r10 = r8.f19559j
            if (r10 == 0) goto L53
            goto L59
        L53:
            java.lang.String r10 = "localPaneStateStore"
            kotlin.jvm.internal.s.x(r10)
            r10 = r5
        L59:
            com.plaid.internal.vd r2 = r8.f19839a
            java.lang.String r2 = r2.f19649b
            r0.f19611a = r8
            r0.f19612b = r9
            r0.f19615e = r6
            java.lang.String r7 = "login_url"
            java.lang.Object r10 = r10.a(r2, r7, r0)
            if (r10 != r1) goto L6d
            goto Lce
        L6d:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L7a
            int r10 = r10.length()
            if (r10 != 0) goto L78
            goto L7a
        L78:
            r10 = r3
            goto L7b
        L7a:
            r10 = r6
        L7b:
            if (r10 == 0) goto L90
            com.plaid.internal.u3$b$b r1 = new com.plaid.internal.u3$b$b
            com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuth$HeadlessOAuthPane$Rendering r8 = r9.getHeadlessOAuth()
            java.lang.String r8 = r8.getLoginUri()
            java.lang.String r9 = "pane.headlessOAuth.loginUri"
            kotlin.jvm.internal.s.f(r8, r9)
            r1.<init>(r8)
            goto Lce
        L90:
            com.plaid.internal.bb r8 = r8.f19558i
            if (r8 == 0) goto L95
            goto L9b
        L95:
            java.lang.String r8 = "readOAuthRedirectUri"
            kotlin.jvm.internal.s.x(r8)
            r8 = r5
        L9b:
            r0.f19611a = r9
            r0.f19612b = r5
            r0.f19615e = r4
            java.lang.Object r10 = r8.a(r0)
            if (r10 != r1) goto La8
            goto Lce
        La8:
            r8 = r9
        La9:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto Lb3
            int r9 = r10.length()
            if (r9 != 0) goto Lb4
        Lb3:
            r3 = r6
        Lb4:
            if (r3 != 0) goto Lbc
            com.plaid.internal.u3$b$c r1 = new com.plaid.internal.u3$b$c
            r1.<init>(r10)
            goto Lce
        Lbc:
            com.plaid.internal.u3$b$a r1 = new com.plaid.internal.u3$b$a
            com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuth$HeadlessOAuthPane$Rendering r8 = r8.getHeadlessOAuth()
            java.lang.String r8 = r8.getOauthStateId()
            java.lang.String r9 = "pane.headlessOAuth.oauthStateId"
            kotlin.jvm.internal.s.f(r8, r9)
            r1.<init>(r8)
        Lce:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.u3.a(com.plaid.internal.u3, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.plaid.internal.u3 r7, java.lang.String r8, zz.d r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof com.plaid.internal.x3
            if (r0 == 0) goto L16
            r0 = r9
            com.plaid.internal.x3 r0 = (com.plaid.internal.x3) r0
            int r1 = r0.f19818e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f19818e = r1
            goto L1b
        L16:
            com.plaid.internal.x3 r0 = new com.plaid.internal.x3
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.f19816c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19818e
            r3 = 0
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L3f
            if (r2 != r4) goto L37
            java.lang.Object r7 = r0.f19815b
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.f19814a
            com.plaid.internal.u3 r7 = (com.plaid.internal.u3) r7
            vz.r.b(r9)
            goto L62
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            vz.r.b(r9)
            com.plaid.internal.wa$a r9 = com.plaid.internal.wa.f19678a
            r2 = 0
            java.lang.String r6 = "Poll for oAuth result"
            com.plaid.internal.wa.a.a(r9, r6, r2, r5)
            com.plaid.internal.j7 r9 = r7.f19561l
            if (r9 == 0) goto L4f
            goto L55
        L4f:
            java.lang.String r9 = "oAuthPolling"
            kotlin.jvm.internal.s.x(r9)
            r9 = r3
        L55:
            r0.f19814a = r7
            r0.f19815b = r8
            r0.f19818e = r4
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L62
            goto L81
        L62:
            java.lang.String r9 = "oauthStateId"
            kotlin.jvm.internal.s.g(r8, r9)
            com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuth$HeadlessOAuthPane$Actions$b r9 = com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuth$HeadlessOAuthPane.Actions.newBuilder()
            com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuth$HeadlessOAuthPane$Actions$SubmitAction$a r0 = com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuth.HeadlessOAuthPane.Actions.SubmitAction.newBuilder()
            com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuth$HeadlessOAuthPane$Actions$SubmitAction$a r8 = r0.a(r8)
            com.plaid.internal.core.protos.link.workflow.nodes.panes.HeadlessOAuth$HeadlessOAuthPane$Actions$b r8 = r9.a(r8)
            java.lang.String r9 = "Actions.submitStateId(oautStateId)"
            kotlin.jvm.internal.s.f(r8, r9)
            a(r7, r8, r3, r5)
            vz.b0 r1 = vz.b0.f54756a
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.u3.b(com.plaid.internal.u3, java.lang.String, zz.d):java.lang.Object");
    }

    @Override // com.plaid.internal.xd
    public void a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(zz.d<? super vz.b0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.plaid.internal.u3.c
            if (r0 == 0) goto L13
            r0 = r5
            com.plaid.internal.u3$c r0 = (com.plaid.internal.u3.c) r0
            int r1 = r0.f19570c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19570c = r1
            goto L18
        L13:
            com.plaid.internal.u3$c r0 = new com.plaid.internal.u3$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19568a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19570c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            vz.r.b(r5)
            goto L44
        L31:
            vz.r.b(r5)
            kotlinx.coroutines.flow.t<com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> r5 = r4.f19557h
            com.plaid.internal.u3$d r2 = new com.plaid.internal.u3$d
            r2.<init>()
            r0.f19570c = r3
            java.lang.Object r5 = r5.collect(r2, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.u3.e(zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.plaid.internal.u3 r6, java.lang.String r7, zz.d r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof com.plaid.internal.w3
            if (r0 == 0) goto L16
            r0 = r8
            com.plaid.internal.w3 r0 = (com.plaid.internal.w3) r0
            int r1 = r0.f19662e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f19662e = r1
            goto L1b
        L16:
            com.plaid.internal.w3 r0 = new com.plaid.internal.w3
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f19660c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19662e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f19659b
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.f19658a
            com.plaid.internal.u3 r6 = (com.plaid.internal.u3) r6
            vz.r.b(r8)
            goto L67
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            vz.r.b(r8)
            com.plaid.internal.wa$a r8 = com.plaid.internal.wa.f19678a
            r2 = 0
            r4 = 2
            java.lang.String r5 = "Opening login URL"
            com.plaid.internal.wa.a.a(r8, r5, r2, r4)
            com.plaid.internal.w6 r8 = r6.f19559j
            if (r8 == 0) goto L4e
            goto L54
        L4e:
            java.lang.String r8 = "localPaneStateStore"
            kotlin.jvm.internal.s.x(r8)
            r8 = 0
        L54:
            com.plaid.internal.vd r2 = r6.f19839a
            java.lang.String r2 = r2.f19649b
            r0.f19658a = r6
            r0.f19659b = r7
            r0.f19662e = r3
            java.lang.String r3 = "login_url"
            java.lang.Object r8 = r8.a(r2, r3, r7, r0)
            if (r8 != r1) goto L67
            goto L70
        L67:
            com.plaid.internal.p5 r6 = r6.b()
            r6.a(r7)
            vz.b0 r1 = vz.b0.f54756a
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.u3.a(com.plaid.internal.u3, java.lang.String, zz.d):java.lang.Object");
    }

    public static void a(u3 u3Var, HeadlessOAuth$HeadlessOAuthPane.Actions.b bVar, List list, int i11) {
        String str = u3Var.f19839a.f19650c;
        Pane$PaneOutput.a a11 = Pane$PaneOutput.newBuilder().a(bVar);
        kotlin.jvm.internal.s.f(a11, "newBuilder().setHeadlessOAuth(action)");
        u3Var.a(str, a11, (Collection<Common$SDKEvent>) null);
    }
}