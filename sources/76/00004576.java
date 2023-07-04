package com.plaid.internal;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$Transition;
import com.plaid.internal.core.ui_components.PlaidLoadingView;
import com.plaid.internal.pd;
import java.util.ArrayList;
import java.util.List;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.WorkflowPaneFragment$showRisingTide$1", f = "WorkflowPaneFragment.kt", l = {261, 264}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class sd extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19469a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Pane$Transition.RisingTide f19470b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ pd<xd> f19471c;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.WorkflowPaneFragment$showRisingTide$1$1", f = "WorkflowPaneFragment.kt", l = {265}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19472a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ pd<xd> f19473b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ List<String> f19474c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pd<xd> pdVar, List<String> list, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f19473b = pdVar;
            this.f19474c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(this.f19473b, this.f19474c, dVar);
        }

        @Override // h00.p
        /* renamed from: invoke */
        public Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new a(this.f19473b, this.f19474c, dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f19472a;
            if (i11 == 0) {
                vz.r.b(obj);
                this.f19472a = 1;
                if (v20.y0.b(500L, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            View view = this.f19473b.getView();
            if (view != null) {
                view.setVisibility(8);
            }
            pd<xd> pdVar = this.f19473b;
            pd.a aVar = pd.f19253d;
            PlaidLoadingView b11 = ((ud) pdVar.requireActivity()).b();
            if (b11 != null) {
                List<String> messages = this.f19474c;
                int i12 = PlaidLoadingView.f18456e;
                kotlin.jvm.internal.s.g(messages, "messages");
                b11.a(0, 100, 0L, 2000L, messages, b11.f18457a);
            }
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.WorkflowPaneFragment$showRisingTide$1$messagesList$1", f = "WorkflowPaneFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super List<? extends String>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Pane$Transition.RisingTide f19475a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ pd<xd> f19476b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Pane$Transition.RisingTide risingTide, pd<xd> pdVar, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f19475a = risingTide;
            this.f19476b = pdVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(this.f19475a, this.f19476b, dVar);
        }

        @Override // h00.p
        /* renamed from: invoke */
        public Object mo160invoke(v20.o0 o0Var, zz.d<? super List<? extends String>> dVar) {
            return new b(this.f19475a, this.f19476b, dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int t11;
            a00.d.d();
            vz.r.b(obj);
            List<Common$LocalizedString> messagesList = this.f19475a.getMessagesList();
            kotlin.jvm.internal.s.f(messagesList, "risingTideModel.messagesList");
            pd<xd> pdVar = this.f19476b;
            t11 = wz.x.t(messagesList, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (Common$LocalizedString it2 : messagesList) {
                kotlin.jvm.internal.s.f(it2, "it");
                Resources resources = pdVar.getResources();
                kotlin.jvm.internal.s.f(resources, "resources");
                Context context = pdVar.getContext();
                arrayList.add(z6.a(it2, resources, context == null ? null : context.getPackageName(), 0, 4));
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd(Pane$Transition.RisingTide risingTide, pd<xd> pdVar, zz.d<? super sd> dVar) {
        super(2, dVar);
        this.f19470b = risingTide;
        this.f19471c = pdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new sd(this.f19470b, this.f19471c, dVar);
    }

    @Override // h00.p
    /* renamed from: invoke */
    public Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
        return new sd(this.f19470b, this.f19471c, dVar).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.f19469a;
        if (i11 == 0) {
            vz.r.b(obj);
            v20.j0 b11 = v20.e1.b();
            b bVar = new b(this.f19470b, this.f19471c, null);
            this.f19469a = 1;
            obj = v20.i.g(b11, bVar, this);
            if (obj == d11) {
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
        }
        v20.l2 c11 = v20.e1.c();
        a aVar = new a(this.f19471c, (List) obj, null);
        this.f19469a = 2;
        if (v20.i.g(c11, aVar, this) == d11) {
            return d11;
        }
        return vz.b0.f54756a;
    }
}