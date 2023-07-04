package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase;

/* loaded from: classes2.dex */
public final class a3 implements a8 {

    /* renamed from: a  reason: collision with root package name */
    public final u0<String, Pane$PaneRendering> f18157a;

    /* renamed from: b  reason: collision with root package name */
    public final v7 f18158b;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.persistence.DatabaseBackedPaneStore", f = "DatabaseBackedPaneStore.kt", l = {19}, m = "getPane")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        public Object f18159a;

        /* renamed from: b  reason: collision with root package name */
        public Object f18160b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f18161c;

        /* renamed from: e  reason: collision with root package name */
        public int f18163e;

        public a(zz.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f18161c = obj;
            this.f18163e |= Integer.MIN_VALUE;
            return a3.this.a(null, this);
        }
    }

    public a3(WorkflowDatabase database, u0<String, Pane$PaneRendering> cache) {
        kotlin.jvm.internal.s.g(database, "database");
        kotlin.jvm.internal.s.g(cache, "cache");
        this.f18157a = cache;
        this.f18158b = database.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    @Override // com.plaid.internal.cb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.plaid.internal.vd r6, zz.d<? super com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.plaid.internal.a3.a
            if (r0 == 0) goto L13
            r0 = r7
            com.plaid.internal.a3$a r0 = (com.plaid.internal.a3.a) r0
            int r1 = r0.f18163e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18163e = r1
            goto L18
        L13:
            com.plaid.internal.a3$a r0 = new com.plaid.internal.a3$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f18161c
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f18163e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.f18160b
            com.plaid.internal.vd r6 = (com.plaid.internal.vd) r6
            java.lang.Object r0 = r0.f18159a
            com.plaid.internal.a3 r0 = (com.plaid.internal.a3) r0
            vz.r.b(r7)
            goto L5e
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            vz.r.b(r7)
            com.plaid.internal.u0<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> r7 = r5.f18157a
            java.lang.String r2 = r6.a()
            java.lang.Object r7 = r7.a(r2)
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r7 = (com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering) r7
            if (r7 != 0) goto L6e
            com.plaid.internal.v7 r7 = r5.f18158b
            java.lang.String r2 = r6.f19648a
            java.lang.String r4 = r6.f19649b
            r0.f18159a = r5
            r0.f18160b = r6
            r0.f18163e = r3
            java.lang.Object r7 = r7.a(r2, r4, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r0 = r5
        L5e:
            com.plaid.internal.x7 r7 = (com.plaid.internal.x7) r7
            if (r7 != 0) goto L63
            goto L67
        L63:
            byte[] r7 = r7.f19825c
            if (r7 != 0) goto L69
        L67:
            r7 = 0
            goto L6f
        L69:
            com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering r7 = com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering.parseFrom(r7)
            goto L6f
        L6e:
            r0 = r5
        L6f:
            if (r7 != 0) goto L72
            goto L7b
        L72:
            com.plaid.internal.u0<java.lang.String, com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering> r0 = r0.f18157a
            java.lang.String r6 = r6.a()
            r0.a(r6, r7)
        L7b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.a3.a(com.plaid.internal.vd, zz.d):java.lang.Object");
    }

    @Override // com.plaid.internal.a8
    public Object a(vd vdVar, Pane$PaneRendering pane$PaneRendering, zz.d<? super vz.b0> dVar) {
        Object d11;
        this.f18157a.a(vdVar.a(), pane$PaneRendering);
        v7 v7Var = this.f18158b;
        String str = vdVar.f19648a;
        String str2 = vdVar.f19649b;
        byte[] byteArray = pane$PaneRendering.toByteArray();
        kotlin.jvm.internal.s.f(byteArray, "rendering.toByteArray()");
        Object a11 = v7Var.a(str, str2, byteArray, dVar);
        d11 = a00.d.d();
        return a11 == d11 ? a11 : vz.b0.f54756a;
    }
}