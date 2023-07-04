package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowEventRequest;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Transition;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public abstract class xd extends androidx.lifecycle.p0 {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f19838g = 0;

    /* renamed from: a  reason: collision with root package name */
    public final vd f19839a;

    /* renamed from: b  reason: collision with root package name */
    public final y7 f19840b;

    /* renamed from: c  reason: collision with root package name */
    public p5 f19841c;

    /* renamed from: d  reason: collision with root package name */
    public cb f19842d;

    /* renamed from: e  reason: collision with root package name */
    public m6 f19843e;

    /* renamed from: f  reason: collision with root package name */
    public h00.l<? super Pane$Transition, vz.b0> f19844f;

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19845a;

        static {
            int[] iArr = new int[Common$LocalAction.a.values().length];
            iArr[Common$LocalAction.a.NAVIGATE_TO_URL.ordinal()] = 1;
            iArr[Common$LocalAction.a.CALL_PHONE_NUMBER.ordinal()] = 2;
            iArr[Common$LocalAction.a.GO_BACK.ordinal()] = 3;
            iArr[Common$LocalAction.a.SHOW_MODAL.ordinal()] = 4;
            iArr[Common$LocalAction.a.HIDE_MODAL.ordinal()] = 5;
            iArr[Common$LocalAction.a.FOCUS_INPUT.ordinal()] = 6;
            iArr[Common$LocalAction.a.ACTION_NOT_SET.ordinal()] = 7;
            iArr[Common$LocalAction.a.EXECUTE_RECAPTCHA_ENTERPRISE.ordinal()] = 8;
            f19845a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.WorkflowViewModel", f = "WorkflowViewModel.kt", l = {153}, m = "getNavigation")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f19846a;

        /* renamed from: c  reason: collision with root package name */
        public int f19848c;

        public b(zz.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19846a = obj;
            this.f19848c |= Integer.MIN_VALUE;
            return xd.this.a(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.WorkflowViewModel", f = "WorkflowViewModel.kt", l = {149}, m = "getNavigationLogo$link_sdk_release")
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f19849a;

        /* renamed from: c  reason: collision with root package name */
        public int f19851c;

        public c(zz.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19849a = obj;
            this.f19851c |= Integer.MIN_VALUE;
            return xd.this.b(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.WorkflowViewModel$getPane$2", f = "WorkflowViewModel.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super Pane$PaneRendering>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19852a;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ vd f19854c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(vd vdVar, zz.d<? super d> dVar) {
            super(2, dVar);
            this.f19854c = vdVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new d(this.f19854c, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super Pane$PaneRendering> dVar) {
            return new d(this.f19854c, dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f19852a;
            if (i11 == 0) {
                vz.r.b(obj);
                cb cbVar = xd.this.f19842d;
                if (cbVar == null) {
                    kotlin.jvm.internal.s.x("paneStore");
                    cbVar = null;
                }
                vd vdVar = this.f19854c;
                this.f19852a = 1;
                obj = cbVar.a(vdVar, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            Pane$PaneRendering pane$PaneRendering = (Pane$PaneRendering) obj;
            if (pane$PaneRendering != null) {
                return pane$PaneRendering;
            }
            StringBuilder a11 = g4.a("No pane rendering found for ");
            a11.append(this.f19854c);
            a11.append(".first: ");
            a11.append(this.f19854c);
            a11.append(".second");
            throw new v5(a11.toString());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.WorkflowViewModel$next$1", f = "WorkflowViewModel.kt", l = {61, 63}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public Object f19855a;

        /* renamed from: b  reason: collision with root package name */
        public int f19856b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Collection<Common$SDKEvent> f19857c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ xd f19858d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Pane$PaneOutput.a f19859e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f19860f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Collection<Common$SDKEvent> collection, xd xdVar, Pane$PaneOutput.a aVar, String str, zz.d<? super e> dVar) {
            super(2, dVar);
            this.f19857c = collection;
            this.f19858d = xdVar;
            this.f19859e = aVar;
            this.f19860f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new e(this.f19857c, this.f19858d, this.f19859e, this.f19860f, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new e(this.f19857c, this.f19858d, this.f19859e, this.f19860f, dVar).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r6.f19856b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                vz.r.b(r7)
                goto L78
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f19855a
                h00.l r1 = (h00.l) r1
                vz.r.b(r7)
                goto L41
            L22:
                vz.r.b(r7)
                java.util.Collection<com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent> r7 = r6.f19857c
                if (r7 != 0) goto L2a
                goto L2f
            L2a:
                com.plaid.internal.xd r1 = r6.f19858d
                r1.a(r7)
            L2f:
                com.plaid.internal.xd r7 = r6.f19858d
                h00.l<? super com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Transition, vz.b0> r1 = r7.f19844f
                if (r1 != 0) goto L36
                goto L44
            L36:
                r6.f19855a = r1
                r6.f19856b = r3
                java.lang.Object r7 = com.plaid.internal.xd.a(r7, r6)
                if (r7 != r0) goto L41
                return r0
            L41:
                r1.invoke(r7)
            L44:
                com.plaid.internal.xd r7 = r6.f19858d
                com.plaid.internal.p5 r7 = r7.b()
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput[] r1 = new com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput[r3]
                r3 = 0
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput$a r4 = r6.f19859e
                com.plaid.internal.xd r5 = r6.f19858d
                com.plaid.internal.vd r5 = r5.f19839a
                java.lang.String r5 = r5.f19649b
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput$a r4 = r4.b(r5)
                java.lang.String r5 = r6.f19860f
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput$a r4 = r4.a(r5)
                com.google.protobuf.GeneratedMessageLite r4 = r4.build()
                java.lang.String r5 = "actionsOutput\n          …odeId)\n          .build()"
                kotlin.jvm.internal.s.f(r4, r5)
                com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput r4 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneOutput) r4
                r1[r3] = r4
                r3 = 0
                r6.f19855a = r3
                r6.f19856b = r2
                java.lang.Object r7 = r7.a(r1, r6)
                if (r7 != r0) goto L78
                return r0
            L78:
                vz.b0 r7 = vz.b0.f54756a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.xd.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.WorkflowViewModel", f = "WorkflowViewModel.kt", l = {147}, m = "shouldShowBackButton$link_sdk_release")
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f19861a;

        /* renamed from: c  reason: collision with root package name */
        public int f19863c;

        public f(zz.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19861a = obj;
            this.f19863c |= Integer.MIN_VALUE;
            return xd.this.c(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.WorkflowViewModel", f = "WorkflowViewModel.kt", l = {148}, m = "shouldShowExitButton$link_sdk_release")
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f19864a;

        /* renamed from: c  reason: collision with root package name */
        public int f19866c;

        public g(zz.d<? super g> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19864a = obj;
            this.f19866c |= Integer.MIN_VALUE;
            return xd.this.d(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.WorkflowViewModel$shouldSubmitAfterTryToHandleOverride$1$1", f = "WorkflowViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Common$LocalAction f19868b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Common$LocalAction common$LocalAction, zz.d<? super h> dVar) {
            super(2, dVar);
            this.f19868b = common$LocalAction;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new h(this.f19868b, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new h(this.f19868b, dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            vz.r.b(obj);
            m6 m6Var = xd.this.f19843e;
            if (m6Var == null) {
                kotlin.jvm.internal.s.x("linkWorkflowAnalytics");
                m6Var = null;
            }
            vd currentPane = xd.this.f19839a;
            String localActionId = this.f19868b.getId();
            kotlin.jvm.internal.s.f(localActionId, "it.id");
            m6Var.getClass();
            kotlin.jvm.internal.s.g(currentPane, "currentPane");
            kotlin.jvm.internal.s.g(localActionId, "localActionId");
            String str = currentPane.f19648a;
            Workflow$LinkWorkflowEventRequest.Event.a a11 = m6Var.a().a(Workflow$LinkWorkflowEventRequest.ActionOverride.newBuilder().a(currentPane.f19650c).b(localActionId));
            kotlin.jvm.internal.s.f(a11, "eventBuilder.setActionOv…Id(localActionId)\n      )");
            m6Var.a(str, a11);
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.WorkflowViewModel$shouldSubmitAfterTryToHandleOverride$4", f = "WorkflowViewModel.kt", l = {123}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19869a;

        public i(zz.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new i(dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new i(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f19869a;
            if (i11 == 0) {
                vz.r.b(obj);
                p5 b11 = xd.this.b();
                this.f19869a = 1;
                if (b11.a(this) == d11) {
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

    public xd(vd paneId, y7 paneHostComponent) {
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(paneHostComponent, "paneHostComponent");
        this.f19839a = paneId;
        this.f19840b = paneHostComponent;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.plaid.internal.xd r6, zz.d r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof com.plaid.internal.yd
            if (r0 == 0) goto L16
            r0 = r7
            com.plaid.internal.yd r0 = (com.plaid.internal.yd) r0
            int r1 = r0.f19913d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f19913d = r1
            goto L1b
        L16:
            com.plaid.internal.yd r0 = new com.plaid.internal.yd
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f19911b
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19913d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            vz.r.b(r7)
            goto L61
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f19910a
            com.plaid.internal.xd r6 = (com.plaid.internal.xd) r6
            vz.r.b(r7)
            goto L4e
        L40:
            vz.r.b(r7)
            r0.f19910a = r6
            r0.f19913d = r5
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r1) goto L4e
            goto L69
        L4e:
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation r7 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation) r7
            boolean r7 = r7.hasTransition()
            if (r7 == 0) goto L68
            r0.f19910a = r3
            r0.f19913d = r4
            java.lang.Object r7 = r6.a(r0)
            if (r7 != r1) goto L61
            goto L69
        L61:
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation r7 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation) r7
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Transition r1 = r7.getTransition()
            goto L69
        L68:
            r1 = r3
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.xd.a(com.plaid.internal.xd, zz.d):java.lang.Object");
    }

    public abstract void a();

    public final p5 b() {
        p5 p5Var = this.f19841c;
        if (p5Var != null) {
            return p5Var;
        }
        kotlin.jvm.internal.s.x("linkController");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(zz.d<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.plaid.internal.xd.f
            if (r0 == 0) goto L13
            r0 = r5
            com.plaid.internal.xd$f r0 = (com.plaid.internal.xd.f) r0
            int r1 = r0.f19863c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19863c = r1
            goto L18
        L13:
            com.plaid.internal.xd$f r0 = new com.plaid.internal.xd$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19861a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19863c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            vz.r.b(r5)
            r0.f19863c = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation r5 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation) r5
            boolean r5 = r5.getBackVisible()
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.xd.c(zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(zz.d<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.plaid.internal.xd.g
            if (r0 == 0) goto L13
            r0 = r5
            com.plaid.internal.xd$g r0 = (com.plaid.internal.xd.g) r0
            int r1 = r0.f19866c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19866c = r1
            goto L18
        L13:
            com.plaid.internal.xd$g r0 = new com.plaid.internal.xd$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19864a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19866c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            vz.r.b(r5)
            r0.f19866c = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation r5 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation) r5
            boolean r5 = r5.getExitVisible()
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.xd.d(zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(zz.d<? super com.plaid.internal.d> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.plaid.internal.xd.c
            if (r0 == 0) goto L13
            r0 = r5
            com.plaid.internal.xd$c r0 = (com.plaid.internal.xd.c) r0
            int r1 = r0.f19851c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19851c = r1
            goto L18
        L13:
            com.plaid.internal.xd$c r0 = new com.plaid.internal.xd$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19849a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19851c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            vz.r.b(r5)
            r0.f19851c = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation r5 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation) r5
            com.plaid.internal.d r5 = r5.getLogo()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.xd.b(zz.d):java.lang.Object");
    }

    public final Object a(vd vdVar, zz.d<? super Pane$PaneRendering> dVar) {
        return v20.i.g(v20.e1.b(), new d(vdVar, null), dVar);
    }

    public final v20.a2 a(String paneNodeId, Pane$PaneOutput.a actionsOutput, Collection<Common$SDKEvent> collection) {
        v20.a2 d11;
        kotlin.jvm.internal.s.g(paneNodeId, "paneNodeId");
        kotlin.jvm.internal.s.g(actionsOutput, "actionsOutput");
        d11 = v20.k.d(androidx.lifecycle.q0.a(this), null, null, new e(collection, this, actionsOutput, paneNodeId, null), 3, null);
        return d11;
    }

    public final boolean a(Common$ButtonContent common$ButtonContent, h00.l<? super Common$LocalAction, Boolean> lVar) {
        Common$LocalAction actionOverride;
        if (!(common$ButtonContent != null && common$ButtonContent.hasActionOverride()) || (actionOverride = common$ButtonContent.getActionOverride()) == null) {
            return true;
        }
        v20.k.d(androidx.lifecycle.q0.a(this), null, null, new h(actionOverride, null), 3, null);
        return a(actionOverride, lVar);
    }

    public final boolean a(Common$LocalAction action, h00.l<? super Common$LocalAction, Boolean> lVar) {
        kotlin.jvm.internal.s.g(action, "action");
        Common$LocalAction.a actionCase = action.getActionCase();
        switch (actionCase == null ? -1 : a.f19845a[actionCase.ordinal()]) {
            case 1:
                String navigateToUrl = action.getNavigateToUrl();
                if (navigateToUrl != null) {
                    b().a(navigateToUrl);
                }
                return action.getAlsoSubmitAction();
            case 2:
                String callPhoneNumber = action.getCallPhoneNumber();
                if (callPhoneNumber != null) {
                    b().b(callPhoneNumber);
                }
                return action.getAlsoSubmitAction();
            case 3:
                v20.k.d(androidx.lifecycle.q0.a(this), null, null, new i(null), 3, null);
                return action.getAlsoSubmitAction();
            case 4:
                if (!(lVar != null && lVar.invoke(action).booleanValue()) && !action.getAlsoSubmitAction()) {
                    return false;
                }
                break;
            case 5:
                if (!(lVar != null && lVar.invoke(action).booleanValue()) && !action.getAlsoSubmitAction()) {
                    return false;
                }
                break;
            case 6:
                if (!(lVar != null && lVar.invoke(action).booleanValue()) && !action.getAlsoSubmitAction()) {
                    return false;
                }
                break;
            case 7:
                if (!(lVar != null && lVar.invoke(action).booleanValue()) && !action.getAlsoSubmitAction()) {
                    return false;
                }
                break;
            case 8:
                throw new vz.o(null, 1, null);
            default:
                throw new NoWhenBranchMatchedException();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(zz.d<? super com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.plaid.internal.xd.b
            if (r0 == 0) goto L13
            r0 = r5
            com.plaid.internal.xd$b r0 = (com.plaid.internal.xd.b) r0
            int r1 = r0.f19848c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19848c = r1
            goto L18
        L13:
            com.plaid.internal.xd$b r0 = new com.plaid.internal.xd$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19846a
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f19848c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            vz.r.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            vz.r.b(r5)
            com.plaid.internal.vd r5 = r4.f19839a
            r0.f19848c = r3
            java.lang.Object r5 = r4.a(r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r5 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) r5
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Navigation r5 = r5.getNavigation()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.xd.a(zz.d):java.lang.Object");
    }

    public final void a(Collection<Common$SDKEvent> collection) {
        h00.l<LinkEvent, vz.b0> linkEventListenerInternal$link_sdk_release;
        if (collection == null) {
            return;
        }
        for (Common$SDKEvent common$SDKEvent : collection) {
            if (!kotlin.jvm.internal.s.c(common$SDKEvent, Common$SDKEvent.getDefaultInstance()) && (linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release()) != null) {
                linkEventListenerInternal$link_sdk_release.invoke(ib.a(common$SDKEvent));
            }
        }
    }
}