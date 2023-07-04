package com.plaid.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.plaid.internal.b4;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Modal;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.UserSelection$UserSelectionPane;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.core.ui_components.PlaidSecondaryButton;
import com.plaid.internal.u9;
import com.plaid.internal.vc;
import com.plaid.internal.workflow.panes.userselection.SelectionView;
import com.plaid.internal.yc;
import com.plaid.link.R;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class vc extends pd<yc> implements bc {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f19632h = 0;

    /* renamed from: e  reason: collision with root package name */
    public ta f19633e;

    /* renamed from: f  reason: collision with root package name */
    public Common$Modal f19634f;

    /* renamed from: g  reason: collision with root package name */
    public final h00.l<Common$LocalAction, vz.b0> f19635g;

    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<List<? extends String>, vz.b0> {
        public a() {
            super(1);
        }

        @Override // h00.l
        public vz.b0 invoke(List<? extends String> list) {
            boolean z11;
            List<? extends String> responses = list;
            kotlin.jvm.internal.s.g(responses, "responseIds");
            vc vcVar = vc.this;
            int i11 = vc.f19632h;
            yc b11 = vcVar.b();
            b11.getClass();
            kotlin.jvm.internal.s.g(responses, "responses");
            b11.f19900i.a().f19537b = UserSelection$UserSelectionPane.Actions.SubmitAction.Response.newBuilder().a(responses).build();
            if (b11.f19900i.b()) {
                b11.f19900i.c();
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                vc.this.b().c();
            }
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.l<Common$LocalAction, vz.b0> {
        public b() {
            super(1);
        }

        @Override // h00.l
        public vz.b0 invoke(Common$LocalAction common$LocalAction) {
            Common$LocalAction it2 = common$LocalAction;
            kotlin.jvm.internal.s.g(it2, "it");
            vc vcVar = vc.this;
            vcVar.a(it2, (h00.l<? super String, vz.b0>) null, new wc(vcVar));
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<Common$LocalAction, vz.b0> {
        public c() {
            super(1);
        }

        @Override // h00.l
        public vz.b0 invoke(Common$LocalAction common$LocalAction) {
            Common$LocalAction localAction = common$LocalAction;
            kotlin.jvm.internal.s.g(localAction, "localAction");
            vc vcVar = vc.this;
            vcVar.a(localAction, (h00.l<? super String, vz.b0>) null, new xc(vcVar));
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.userselection.UserSelectionFragment$onViewCreated$1", f = "UserSelectionFragment.kt", l = {54}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19639a;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a implements kotlinx.coroutines.flow.f, kotlin.jvm.internal.m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ vc f19641a;

            public a(vc vcVar) {
                this.f19641a = vcVar;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Object obj, zz.d dVar) {
                vc vcVar = this.f19641a;
                int i11 = vc.f19632h;
                vcVar.a((UserSelection$UserSelectionPane.Rendering) obj);
                vz.b0 b0Var = vz.b0.f54756a;
                a00.d.d();
                return b0Var;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof kotlinx.coroutines.flow.f) && (obj instanceof kotlin.jvm.internal.m)) {
                    return kotlin.jvm.internal.s.c(getFunctionDelegate(), ((kotlin.jvm.internal.m) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.m
            public final vz.g<?> getFunctionDelegate() {
                return new kotlin.jvm.internal.a(2, this.f19641a, vc.class, "bindView", "bindView(Lcom/plaid/internal/core/protos/link/workflow/nodes/panes/UserSelection$UserSelectionPane$Rendering;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public d(zz.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new d(dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new d(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f19639a;
            if (i11 == 0) {
                vz.r.b(obj);
                vc vcVar = vc.this;
                int i12 = vc.f19632h;
                kotlinx.coroutines.flow.y a11 = kotlinx.coroutines.flow.g.a(vcVar.b().f19899h);
                a aVar = new a(vc.this);
                this.f19639a = 1;
                if (a11.collect(aVar, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.userselection.UserSelectionFragment$onViewCreated$2", f = "UserSelectionFragment.kt", l = {57}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19642a;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a implements kotlinx.coroutines.flow.f, kotlin.jvm.internal.m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ vc f19644a;

            public a(vc vcVar) {
                this.f19644a = vcVar;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Object obj, zz.d dVar) {
                tb tbVar = (tb) obj;
                vc vcVar = this.f19644a;
                ta taVar = vcVar.f19633e;
                if (taVar == null) {
                    kotlin.jvm.internal.s.x("binding");
                    taVar = null;
                }
                PlaidPrimaryButton plaidPrimaryButton = taVar.f19533f;
                kotlin.jvm.internal.s.f(plaidPrimaryButton, "binding.primaryButton");
                plaidPrimaryButton.setVisibility(tbVar.f19536a.getBehavior() != k1.SELECTION_LIST_BEHAVIOR_SINGLE_SELECT_IMMEDIATE ? 0 : 8);
                ta taVar2 = vcVar.f19633e;
                if (taVar2 == null) {
                    kotlin.jvm.internal.s.x("binding");
                    taVar2 = null;
                }
                SelectionView selectionView = taVar2.f19535h;
                UserSelection$UserSelectionPane.Rendering.Selection selection = tbVar.f19536a;
                UserSelection$UserSelectionPane.Actions.SubmitAction.Response response = tbVar.f19537b;
                selectionView.a(selection, vcVar, response != null ? response.getResponseIdsList() : null, vcVar.f19635g);
                vz.b0 b0Var = vz.b0.f54756a;
                a00.d.d();
                return b0Var;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof kotlinx.coroutines.flow.f) && (obj instanceof kotlin.jvm.internal.m)) {
                    return kotlin.jvm.internal.s.c(getFunctionDelegate(), ((kotlin.jvm.internal.m) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.m
            public final vz.g<?> getFunctionDelegate() {
                return new kotlin.jvm.internal.a(2, this.f19644a, vc.class, "bindPrompt", "bindPrompt(Lcom/plaid/internal/workflow/panes/userselection/SelectionWithResponses;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public e(zz.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new e(dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new e(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            Object d12;
            d11 = a00.d.d();
            int i11 = this.f19642a;
            if (i11 == 0) {
                vz.r.b(obj);
                vc vcVar = vc.this;
                int i12 = vc.f19632h;
                c4<tb> c4Var = vcVar.b().f19900i;
                kotlinx.coroutines.flow.t<Integer> tVar = c4Var.f18243a;
                a aVar = new a(vc.this);
                this.f19642a = 1;
                Object collect = tVar.collect(new b4.a(aVar, c4Var), this);
                d12 = a00.d.d();
                if (collect != d12) {
                    collect = vz.b0.f54756a;
                }
                if (collect == d11) {
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

    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.u implements h00.l<u9, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h00.a<vz.b0> f19645a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(h00.a<vz.b0> aVar) {
            super(1);
            this.f19645a = aVar;
        }

        @Override // h00.l
        public vz.b0 invoke(u9 u9Var) {
            u9 m11 = u9Var;
            kotlin.jvm.internal.s.g(m11, "m");
            this.f19645a.invoke();
            m11.dismiss();
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.u implements h00.l<u9, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h00.a<vz.b0> f19646a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(h00.a<vz.b0> aVar) {
            super(1);
            this.f19646a = aVar;
        }

        @Override // h00.l
        public vz.b0 invoke(u9 u9Var) {
            u9 m11 = u9Var;
            kotlin.jvm.internal.s.g(m11, "m");
            this.f19646a.invoke();
            m11.dismiss();
            return vz.b0.f54756a;
        }
    }

    public vc() {
        super(yc.class);
        this.f19635g = new c();
    }

    public static final void b(vc this$0, View view) {
        boolean a11;
        List<Common$SDKEvent> m11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        yc b11 = this$0.b();
        Pane$PaneRendering pane$PaneRendering = b11.f19901j;
        if (pane$PaneRendering == null) {
            kotlin.jvm.internal.s.x("pane");
            pane$PaneRendering = null;
        }
        UserSelection$UserSelectionPane.Rendering userSelection = pane$PaneRendering.getUserSelection();
        a11 = b11.a(userSelection == null ? null : userSelection.getSecondaryButton(), (h00.l<? super Common$LocalAction, Boolean>) null);
        if (a11) {
            yc.b bVar = yc.b.f19907a;
            UserSelection$UserSelectionPane.Actions.b bVar2 = yc.b.f19909c;
            UserSelection$UserSelectionPane.Rendering.Events events = b11.f19902k;
            m11 = wz.w.m(events != null ? events.getOnSecondaryButtonTap() : null);
            b11.a(bVar2, m11);
        }
    }

    @Override // com.plaid.internal.pd
    public yc a(vd paneId, y7 component) {
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(component, "component");
        return new yc(paneId, component);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.plaid_user_selection_fragment, viewGroup, false);
        int i11 = R.id.buttonDisclaimer;
        TextView textView = (TextView) b5.b.a(inflate, i11);
        if (textView != null) {
            i11 = R.id.header;
            TextView textView2 = (TextView) b5.b.a(inflate, i11);
            if (textView2 != null) {
                i11 = R.id.plaid_institution;
                PlaidInstitutionHeaderItem plaidInstitutionHeaderItem = (PlaidInstitutionHeaderItem) b5.b.a(inflate, i11);
                if (plaidInstitutionHeaderItem != null) {
                    i11 = R.id.plaid_navigation;
                    PlaidNavigationBar plaidNavigationBar = (PlaidNavigationBar) b5.b.a(inflate, i11);
                    if (plaidNavigationBar != null) {
                        i11 = R.id.plaid_rendered_asset;
                        ImageView imageView = (ImageView) b5.b.a(inflate, i11);
                        if (imageView != null) {
                            i11 = R.id.primaryButton;
                            PlaidPrimaryButton plaidPrimaryButton = (PlaidPrimaryButton) b5.b.a(inflate, i11);
                            if (plaidPrimaryButton != null) {
                                i11 = R.id.secondaryButton;
                                PlaidSecondaryButton plaidSecondaryButton = (PlaidSecondaryButton) b5.b.a(inflate, i11);
                                if (plaidSecondaryButton != null) {
                                    i11 = R.id.selection;
                                    SelectionView selectionView = (SelectionView) b5.b.a(inflate, i11);
                                    if (selectionView != null) {
                                        i11 = R.id.user_selection_content;
                                        LinearLayout linearLayout = (LinearLayout) b5.b.a(inflate, i11);
                                        if (linearLayout != null) {
                                            LinearLayout linearLayout2 = (LinearLayout) inflate;
                                            ta taVar = new ta(linearLayout2, textView, textView2, plaidInstitutionHeaderItem, plaidNavigationBar, imageView, plaidPrimaryButton, plaidSecondaryButton, selectionView, linearLayout);
                                            kotlin.jvm.internal.s.f(taVar, "inflate(inflater, container, false)");
                                            this.f19633e = taVar;
                                            kotlin.jvm.internal.s.f(linearLayout2, "binding.root");
                                            return linearLayout2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // com.plaid.internal.pd, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.s.g(view, "view");
        super.onViewCreated(view, bundle);
        v20.k.d(androidx.lifecycle.w.a(this), null, null, new d(null), 3, null);
        v20.k.d(androidx.lifecycle.w.a(this), null, null, new e(null), 3, null);
    }

    public final void a(UserSelection$UserSelectionPane.Rendering rendering) {
        String str;
        Common$LocalizedString title;
        String str2;
        Common$LocalizedString title2;
        String a11;
        ta taVar = null;
        if (rendering.hasInstitution()) {
            ta taVar2 = this.f19633e;
            if (taVar2 == null) {
                kotlin.jvm.internal.s.x("binding");
                taVar2 = null;
            }
            PlaidInstitutionHeaderItem plaidInstitutionHeaderItem = taVar2.f19531d;
            kotlin.jvm.internal.s.f(plaidInstitutionHeaderItem, "binding.plaidInstitution");
            k9.a(plaidInstitutionHeaderItem, rendering.getInstitution());
        }
        if (rendering.hasHeaderAsset()) {
            ta taVar3 = this.f19633e;
            if (taVar3 == null) {
                kotlin.jvm.internal.s.x("binding");
                taVar3 = null;
            }
            ImageView imageView = taVar3.f19532e;
            kotlin.jvm.internal.s.f(imageView, "binding.plaidRenderedAsset");
            imageView.setVisibility(rendering.hasHeaderAsset() ? 0 : 8);
            ta taVar4 = this.f19633e;
            if (taVar4 == null) {
                kotlin.jvm.internal.s.x("binding");
                taVar4 = null;
            }
            ImageView imageView2 = taVar4.f19532e;
            kotlin.jvm.internal.s.f(imageView2, "binding.plaidRenderedAsset");
            a4.a(imageView2, rendering.getHeaderAsset());
        }
        if (rendering.hasHeader()) {
            ta taVar5 = this.f19633e;
            if (taVar5 == null) {
                kotlin.jvm.internal.s.x("binding");
                taVar5 = null;
            }
            TextView textView = taVar5.f19530c;
            kotlin.jvm.internal.s.f(textView, "binding.header");
            Common$LocalizedString header = rendering.getHeader();
            if (header == null) {
                a11 = null;
            } else {
                Resources resources = getResources();
                kotlin.jvm.internal.s.f(resources, "resources");
                Context context = getContext();
                a11 = z6.a(header, resources, context == null ? null : context.getPackageName(), 0, 4);
            }
            jc.a(textView, a11);
        }
        this.f19634f = rendering.hasUnselectConfirmationModal() ? rendering.getUnselectConfirmationModal() : null;
        ta taVar6 = this.f19633e;
        if (taVar6 == null) {
            kotlin.jvm.internal.s.x("binding");
            taVar6 = null;
        }
        taVar6.f19535h.setOnSubmitListener$link_sdk_release(new a());
        if (rendering.hasButtonDisclaimerText()) {
            ta taVar7 = this.f19633e;
            if (taVar7 == null) {
                kotlin.jvm.internal.s.x("binding");
                taVar7 = null;
            }
            TextView textView2 = taVar7.f19529b;
            kotlin.jvm.internal.s.f(textView2, "binding.buttonDisclaimer");
            ic.a(textView2, rendering.getButtonDisclaimerText(), new b());
        }
        if (rendering.hasButton()) {
            ta taVar8 = this.f19633e;
            if (taVar8 == null) {
                kotlin.jvm.internal.s.x("binding");
                taVar8 = null;
            }
            PlaidPrimaryButton plaidPrimaryButton = taVar8.f19533f;
            kotlin.jvm.internal.s.f(plaidPrimaryButton, "binding.primaryButton");
            Common$ButtonContent button = rendering.getButton();
            if (button == null || (title2 = button.getTitle()) == null) {
                str2 = null;
            } else {
                Resources resources2 = getResources();
                kotlin.jvm.internal.s.f(resources2, "resources");
                Context context2 = getContext();
                str2 = z6.a(title2, resources2, context2 == null ? null : context2.getPackageName(), 0, 4);
            }
            jc.a(plaidPrimaryButton, str2);
            ta taVar9 = this.f19633e;
            if (taVar9 == null) {
                kotlin.jvm.internal.s.x("binding");
                taVar9 = null;
            }
            taVar9.f19533f.setOnClickListener(new View.OnClickListener() { // from class: qq.n0
                {
                    vc.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    vc.a(vc.this, view);
                }
            });
        }
        if (rendering.hasSecondaryButton()) {
            ta taVar10 = this.f19633e;
            if (taVar10 == null) {
                kotlin.jvm.internal.s.x("binding");
                taVar10 = null;
            }
            PlaidSecondaryButton plaidSecondaryButton = taVar10.f19534g;
            kotlin.jvm.internal.s.f(plaidSecondaryButton, "binding.secondaryButton");
            Common$ButtonContent secondaryButton = rendering.getSecondaryButton();
            if (secondaryButton == null || (title = secondaryButton.getTitle()) == null) {
                str = null;
            } else {
                Resources resources3 = getResources();
                kotlin.jvm.internal.s.f(resources3, "resources");
                Context context3 = getContext();
                str = z6.a(title, resources3, context3 == null ? null : context3.getPackageName(), 0, 4);
            }
            jc.a(plaidSecondaryButton, str);
            ta taVar11 = this.f19633e;
            if (taVar11 == null) {
                kotlin.jvm.internal.s.x("binding");
            } else {
                taVar = taVar11;
            }
            taVar.f19534g.setOnClickListener(new View.OnClickListener() { // from class: qq.o0
                {
                    vc.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    vc.b(vc.this, view);
                }
            });
        }
    }

    public static final void a(vc this$0, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        ta taVar = this$0.f19633e;
        ta taVar2 = null;
        if (taVar == null) {
            kotlin.jvm.internal.s.x("binding");
            taVar = null;
        }
        h00.l<List<String>, vz.b0> onSubmitListener$link_sdk_release = taVar.f19535h.getOnSubmitListener$link_sdk_release();
        ta taVar3 = this$0.f19633e;
        if (taVar3 == null) {
            kotlin.jvm.internal.s.x("binding");
        } else {
            taVar2 = taVar3;
        }
        onSubmitListener$link_sdk_release.invoke(taVar2.f19535h.getResponses$link_sdk_release());
    }

    @Override // com.plaid.internal.bc
    public void a(h00.a<vz.b0> onApprove, h00.a<vz.b0> onDeny) {
        String a11;
        String a12;
        String str;
        String str2;
        vz.b0 b0Var;
        Common$LocalizedString title;
        Common$LocalizedString title2;
        kotlin.jvm.internal.s.g(onApprove, "onApprove");
        kotlin.jvm.internal.s.g(onDeny, "onDeny");
        Common$Modal showModal = this.f19634f;
        if (showModal == null) {
            b0Var = null;
        } else {
            f primaryButtonListener = new f(onApprove);
            g secondaryButtonListener = new g(onDeny);
            kotlin.jvm.internal.s.g(showModal, "showModal");
            kotlin.jvm.internal.s.g(primaryButtonListener, "primaryButtonListener");
            kotlin.jvm.internal.s.g(secondaryButtonListener, "secondaryButtonListener");
            Common$LocalizedString title3 = showModal.getTitle();
            if (title3 == null) {
                a11 = null;
            } else {
                Resources resources = getResources();
                kotlin.jvm.internal.s.f(resources, "resources");
                Context context = getContext();
                a11 = z6.a(title3, resources, context == null ? null : context.getPackageName(), 0, 4);
            }
            Common$LocalizedString content = showModal.getContent();
            if (content == null) {
                a12 = null;
            } else {
                Resources resources2 = getResources();
                kotlin.jvm.internal.s.f(resources2, "resources");
                Context context2 = getContext();
                a12 = z6.a(content, resources2, context2 == null ? null : context2.getPackageName(), 0, 4);
            }
            Common$ButtonContent button = showModal.getButton();
            if (button == null || (title2 = button.getTitle()) == null) {
                str = null;
            } else {
                Resources resources3 = getResources();
                kotlin.jvm.internal.s.f(resources3, "resources");
                Context context3 = getContext();
                str = z6.a(title2, resources3, context3 == null ? null : context3.getPackageName(), 0, 4);
            }
            Common$ButtonContent secondaryButton = showModal.getSecondaryButton();
            if (secondaryButton == null || (title = secondaryButton.getTitle()) == null) {
                str2 = null;
            } else {
                Resources resources4 = getResources();
                kotlin.jvm.internal.s.f(resources4, "resources");
                Context context4 = getContext();
                str2 = z6.a(title, resources4, context4 == null ? null : context4.getPackageName(), 0, 4);
            }
            new u9(new u9.a(null, a11, a12, str, primaryButtonListener, str2, secondaryButtonListener, 1)).show(getChildFragmentManager(), "PlaidModal");
            b0Var = vz.b0.f54756a;
        }
        if (b0Var == null) {
            ((SelectionView.b) onApprove).invoke();
        }
    }
}