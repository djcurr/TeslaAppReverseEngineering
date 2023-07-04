package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.WorkflowPaneFragment$openPlaidModal$1", f = "WorkflowPaneFragment.kt", l = {198}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class rd extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19375a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ pd<xd> f19376b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Common$Modal f19377c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h00.a<vz.b0> f19378d;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.WorkflowPaneFragment$openPlaidModal$1$1", f = "WorkflowPaneFragment.kt", l = {201}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19379a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ pd<xd> f19380b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Common$Modal f19381c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ h00.a<vz.b0> f19382d;

        /* renamed from: com.plaid.internal.rd$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0347a extends kotlin.jvm.internal.u implements h00.l<u9, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ pd<xd> f19383a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Common$Modal f19384b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ h00.a<vz.b0> f19385c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0347a(pd<xd> pdVar, Common$Modal common$Modal, h00.a<vz.b0> aVar) {
                super(1);
                this.f19383a = pdVar;
                this.f19384b = common$Modal;
                this.f19385c = aVar;
            }

            @Override // h00.l
            /* renamed from: invoke */
            public vz.b0 mo12invoke(u9 u9Var) {
                u9 it2 = u9Var;
                kotlin.jvm.internal.s.g(it2, "it");
                pd<xd> pdVar = this.f19383a;
                Common$ButtonContent button = this.f19384b.getButton();
                kotlin.jvm.internal.s.f(button, "showModal.button");
                pdVar.a(button, this.f19385c, (h00.l<? super String, vz.b0>) null);
                return vz.b0.f54756a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.l<u9, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ pd<xd> f19386a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Common$Modal f19387b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ h00.a<vz.b0> f19388c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(pd<xd> pdVar, Common$Modal common$Modal, h00.a<vz.b0> aVar) {
                super(1);
                this.f19386a = pdVar;
                this.f19387b = common$Modal;
                this.f19388c = aVar;
            }

            @Override // h00.l
            /* renamed from: invoke */
            public vz.b0 mo12invoke(u9 u9Var) {
                u9 it2 = u9Var;
                kotlin.jvm.internal.s.g(it2, "it");
                pd<xd> pdVar = this.f19386a;
                Common$ButtonContent secondaryButton = this.f19387b.getSecondaryButton();
                kotlin.jvm.internal.s.f(secondaryButton, "showModal.secondaryButton");
                pdVar.a(secondaryButton, this.f19388c, (h00.l<? super String, vz.b0>) null);
                return vz.b0.f54756a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pd<xd> pdVar, Common$Modal common$Modal, h00.a<vz.b0> aVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f19380b = pdVar;
            this.f19381c = common$Modal;
            this.f19382d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f19380b, this.f19381c, this.f19382d, dVar);
        }

        @Override // h00.p
        /* renamed from: invoke */
        public Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new a(this.f19380b, this.f19381c, this.f19382d, dVar).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 287
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.rd.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd(pd<xd> pdVar, Common$Modal common$Modal, h00.a<vz.b0> aVar, zz.d<? super rd> dVar) {
        super(2, dVar);
        this.f19376b = pdVar;
        this.f19377c = common$Modal;
        this.f19378d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new rd(this.f19376b, this.f19377c, this.f19378d, dVar);
    }

    @Override // h00.p
    /* renamed from: invoke */
    public Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
        return new rd(this.f19376b, this.f19377c, this.f19378d, dVar).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.f19375a;
        if (i11 == 0) {
            vz.r.b(obj);
            v20.l2 c11 = v20.e1.c();
            a aVar = new a(this.f19376b, this.f19377c, this.f19378d, null);
            this.f19375a = 1;
            if (v20.i.g(c11, aVar, this) == d11) {
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