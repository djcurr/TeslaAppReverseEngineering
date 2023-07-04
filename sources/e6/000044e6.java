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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.UserInput$UserInputPane;
import com.plaid.internal.core.ui_components.PlaidInput;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.core.ui_components.PlaidSecondaryButton;
import com.plaid.internal.oc;
import com.plaid.internal.sc;
import com.plaid.link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class oc extends pd<sc> {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f19182g = 0;

    /* renamed from: e  reason: collision with root package name */
    public sa f19183e;

    /* renamed from: f  reason: collision with root package name */
    public final List<rc> f19184f;

    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<Common$LocalAction, vz.b0> {
        public a() {
            super(1);
        }

        @Override // h00.l
        public vz.b0 invoke(Common$LocalAction common$LocalAction) {
            Common$LocalAction it2 = common$LocalAction;
            kotlin.jvm.internal.s.g(it2, "it");
            oc ocVar = oc.this;
            ocVar.a(it2, new mc(ocVar), new nc(oc.this));
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
            oc ocVar = oc.this;
            ocVar.a(it2, new pc(ocVar), new qc(oc.this));
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.userinput.UserInputFragment$onViewCreated$1", f = "UserInputFragment.kt", l = {53}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19187a;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a implements kotlinx.coroutines.flow.f, kotlin.jvm.internal.m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ oc f19189a;

            public a(oc ocVar) {
                this.f19189a = ocVar;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Object obj, zz.d dVar) {
                oc ocVar = this.f19189a;
                int i11 = oc.f19182g;
                ocVar.a((UserInput$UserInputPane.Rendering) obj);
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
                return new kotlin.jvm.internal.a(2, this.f19189a, oc.class, "bindView", "bindView(Lcom/plaid/internal/core/protos/link/workflow/nodes/panes/UserInput$UserInputPane$Rendering;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

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
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f19187a;
            if (i11 == 0) {
                vz.r.b(obj);
                oc ocVar = oc.this;
                int i12 = oc.f19182g;
                kotlinx.coroutines.flow.y a11 = kotlinx.coroutines.flow.g.a(ocVar.b().f19454h);
                a aVar = new a(oc.this);
                this.f19187a = 1;
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

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.userinput.UserInputFragment$onViewCreated$2", f = "UserInputFragment.kt", l = {63}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19190a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.e<sc.c> f19191b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ oc f19192c;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a implements kotlinx.coroutines.flow.f, kotlin.jvm.internal.m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ oc f19193a;

            public a(oc ocVar) {
                this.f19193a = ocVar;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Object obj, zz.d dVar) {
                String a11;
                sc.c cVar = (sc.c) obj;
                oc ocVar = this.f19193a;
                sa saVar = ocVar.f19183e;
                if (saVar == null) {
                    kotlin.jvm.internal.s.x("binding");
                    saVar = null;
                }
                saVar.f19439d.removeAllViews();
                if (cVar instanceof sc.c.a) {
                    for (UserInput$UserInputPane.Rendering.Prompt prompt : cVar.f19467a.getPromptsList()) {
                        sa saVar2 = ocVar.f19183e;
                        if (saVar2 == null) {
                            kotlin.jvm.internal.s.x("binding");
                            saVar2 = null;
                        }
                        LinearLayout linearLayout = saVar2.f19439d;
                        Context requireContext = ocVar.requireContext();
                        kotlin.jvm.internal.s.f(requireContext, "requireContext()");
                        rc rcVar = new rc(requireContext, null, 0);
                        Common$LocalizedString text = prompt.getText();
                        if (text == null) {
                            a11 = null;
                        } else {
                            Resources resources = rcVar.getResources();
                            kotlin.jvm.internal.s.f(resources, "resources");
                            Context context = rcVar.getContext();
                            a11 = z6.a(text, resources, context == null ? null : context.getPackageName(), 0, 4);
                        }
                        rcVar.setPrompt(a11);
                        rcVar.setInputModel(prompt.getInput());
                        ocVar.f19184f.add(rcVar);
                        linearLayout.addView(rcVar);
                    }
                } else if (cVar instanceof sc.c.b) {
                    sa saVar3 = ocVar.f19183e;
                    if (saVar3 == null) {
                        kotlin.jvm.internal.s.x("binding");
                        saVar3 = null;
                    }
                    LinearLayout linearLayout2 = saVar3.f19439d;
                    Context requireContext2 = ocVar.requireContext();
                    kotlin.jvm.internal.s.f(requireContext2, "requireContext()");
                    rc rcVar2 = new rc(requireContext2, null, 0);
                    Common$LocalizedString text2 = cVar.f19468b.f19897a.getText();
                    if (text2 != null) {
                        Resources resources2 = rcVar2.getResources();
                        kotlin.jvm.internal.s.f(resources2, "resources");
                        Context context2 = rcVar2.getContext();
                        r2 = z6.a(text2, resources2, context2 != null ? context2.getPackageName() : null, 0, 4);
                    }
                    rcVar2.setPrompt(r2);
                    rcVar2.setInputModel(cVar.f19468b.f19897a.getInput());
                    String str = cVar.f19468b.f19898b;
                    if (str != null) {
                        rcVar2.setValue(str);
                    }
                    ocVar.f19184f.add(rcVar2);
                    linearLayout2.addView(rcVar2);
                }
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
                return new kotlin.jvm.internal.a(2, this.f19193a, oc.class, "renderInputs", "renderInputs(Lcom/plaid/internal/workflow/panes/userinput/UserInputViewModel$UserInputUiState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(kotlinx.coroutines.flow.e<? extends sc.c> eVar, oc ocVar, zz.d<? super d> dVar) {
            super(2, dVar);
            this.f19191b = eVar;
            this.f19192c = ocVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new d(this.f19191b, this.f19192c, dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new d(this.f19191b, this.f19192c, dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f19190a;
            if (i11 == 0) {
                vz.r.b(obj);
                kotlinx.coroutines.flow.e<sc.c> eVar = this.f19191b;
                a aVar = new a(this.f19192c);
                this.f19190a = 1;
                if (eVar.collect(aVar, this) == d11) {
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

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.userinput.UserInputFragment$onViewCreated$combinedFlow$1", f = "UserInputFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements h00.q<UserInput$UserInputPane.Rendering, ya, zz.d<? super sc.c>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f19194a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f19195b;

        public e(zz.d<? super e> dVar) {
            super(3, dVar);
        }

        @Override // h00.q
        public Object invoke(UserInput$UserInputPane.Rendering rendering, ya yaVar, zz.d<? super sc.c> dVar) {
            e eVar = new e(dVar);
            eVar.f19194a = rendering;
            eVar.f19195b = yaVar;
            return eVar.invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            vz.r.b(obj);
            UserInput$UserInputPane.Rendering rendering = (UserInput$UserInputPane.Rendering) this.f19194a;
            ya yaVar = (ya) this.f19195b;
            if (rendering.getDisplayMode() == o1.USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST) {
                return new sc.c.a(rendering, yaVar);
            }
            return new sc.c.b(rendering, yaVar);
        }
    }

    public oc() {
        super(sc.class);
        this.f19184f = new ArrayList();
    }

    public static final void b(oc this$0, View view) {
        boolean a11;
        List<Common$SDKEvent> m11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        sc b11 = this$0.b();
        Pane$PaneRendering pane$PaneRendering = b11.f19456j;
        if (pane$PaneRendering == null) {
            kotlin.jvm.internal.s.x("pane");
            pane$PaneRendering = null;
        }
        UserInput$UserInputPane.Rendering userInput = pane$PaneRendering.getUserInput();
        a11 = b11.a(userInput == null ? null : userInput.getSecondaryButton(), (h00.l<? super Common$LocalAction, Boolean>) null);
        if (a11) {
            sc.b bVar = sc.b.f19463a;
            UserInput$UserInputPane.Actions.b bVar2 = sc.b.f19465c;
            UserInput$UserInputPane.Rendering.Events events = b11.f19457k;
            m11 = wz.w.m(events != null ? events.getOnSecondaryButtonTap() : null);
            b11.a(bVar2, m11);
        }
    }

    @Override // com.plaid.internal.pd
    public sc a(vd paneId, y7 component) {
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(component, "component");
        return new sc(paneId, component);
    }

    public final boolean c() {
        Map t11;
        int t12;
        List<rc> list = this.f19184f;
        ArrayList arrayList = new ArrayList();
        for (rc rcVar : list) {
            vz.p<String, String> a11 = j9.a(rcVar.getInput());
            if (a11 != null) {
                arrayList.add(a11);
            }
        }
        t11 = wz.s0.t(arrayList);
        boolean z11 = true;
        List<rc> list2 = this.f19184f;
        t12 = wz.x.t(list2, 10);
        ArrayList<PlaidInput> arrayList2 = new ArrayList(t12);
        for (rc rcVar2 : list2) {
            arrayList2.add(rcVar2.getInput());
        }
        for (PlaidInput plaidInput : arrayList2) {
            Common$LocalizedString a12 = j9.a(plaidInput, t11);
            if (a12 != null) {
                Resources resources = getResources();
                kotlin.jvm.internal.s.f(resources, "resources");
                plaidInput.setError(z6.a(a12, resources, requireContext().getPackageName(), R.string.plaid_client_side_validation_error));
                z11 = false;
            }
        }
        return z11;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.plaid_user_input_fragment, viewGroup, false);
        int i11 = R.id.buttonDisclaimer;
        TextView textView = (TextView) b5.b.a(inflate, i11);
        if (textView != null) {
            i11 = R.id.header;
            TextView textView2 = (TextView) b5.b.a(inflate, i11);
            if (textView2 != null) {
                i11 = R.id.inputs;
                LinearLayout linearLayout = (LinearLayout) b5.b.a(inflate, i11);
                if (linearLayout != null) {
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
                                        i11 = R.id.user_input_content;
                                        LinearLayout linearLayout2 = (LinearLayout) b5.b.a(inflate, i11);
                                        if (linearLayout2 != null) {
                                            i11 = R.id.user_input_inputs;
                                            LinearLayout linearLayout3 = (LinearLayout) b5.b.a(inflate, i11);
                                            if (linearLayout3 != null) {
                                                LinearLayout linearLayout4 = (LinearLayout) inflate;
                                                sa saVar = new sa(linearLayout4, textView, textView2, linearLayout, plaidInstitutionHeaderItem, plaidNavigationBar, imageView, plaidPrimaryButton, plaidSecondaryButton, linearLayout2, linearLayout3);
                                                kotlin.jvm.internal.s.f(saVar, "inflate(inflater, container, false)");
                                                this.f19183e = saVar;
                                                return linearLayout4;
                                            }
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
        v20.k.d(androidx.lifecycle.w.a(this), null, null, new c(null), 3, null);
        kotlinx.coroutines.flow.y a11 = kotlinx.coroutines.flow.g.a(b().f19454h);
        c4<ya> c4Var = b().f19455i;
        v20.k.d(androidx.lifecycle.w.a(this), null, null, new d(kotlinx.coroutines.flow.g.w(a11, new b4(c4Var.f18243a, c4Var), new e(null)), this, null), 3, null);
    }

    public final void a(UserInput$UserInputPane.Rendering rendering) {
        String str;
        Common$LocalizedString title;
        String str2;
        Common$LocalizedString title2;
        String a11;
        sa saVar = null;
        if (rendering.hasInstitution()) {
            sa saVar2 = this.f19183e;
            if (saVar2 == null) {
                kotlin.jvm.internal.s.x("binding");
                saVar2 = null;
            }
            PlaidInstitutionHeaderItem plaidInstitutionHeaderItem = saVar2.f19440e;
            kotlin.jvm.internal.s.f(plaidInstitutionHeaderItem, "binding.plaidInstitution");
            k9.a(plaidInstitutionHeaderItem, rendering.getInstitution());
        }
        if (rendering.hasHeaderAsset()) {
            sa saVar3 = this.f19183e;
            if (saVar3 == null) {
                kotlin.jvm.internal.s.x("binding");
                saVar3 = null;
            }
            ImageView imageView = saVar3.f19441f;
            kotlin.jvm.internal.s.f(imageView, "binding.plaidRenderedAsset");
            a4.a(imageView, rendering.getHeaderAsset());
        }
        if (rendering.hasHeader()) {
            sa saVar4 = this.f19183e;
            if (saVar4 == null) {
                kotlin.jvm.internal.s.x("binding");
                saVar4 = null;
            }
            TextView textView = saVar4.f19438c;
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
        if (rendering.hasButtonDisclaimerText()) {
            sa saVar5 = this.f19183e;
            if (saVar5 == null) {
                kotlin.jvm.internal.s.x("binding");
                saVar5 = null;
            }
            TextView textView2 = saVar5.f19437b;
            kotlin.jvm.internal.s.f(textView2, "binding.buttonDisclaimer");
            ic.a(textView2, rendering.getButtonDisclaimerText(), new a());
        } else if (rendering.hasButtonDisclaimer()) {
            sa saVar6 = this.f19183e;
            if (saVar6 == null) {
                kotlin.jvm.internal.s.x("binding");
                saVar6 = null;
            }
            TextView textView3 = saVar6.f19437b;
            kotlin.jvm.internal.s.f(textView3, "binding.buttonDisclaimer");
            ic.a(textView3, rendering.getButtonDisclaimer(), new b());
        }
        if (rendering.hasButton()) {
            sa saVar7 = this.f19183e;
            if (saVar7 == null) {
                kotlin.jvm.internal.s.x("binding");
                saVar7 = null;
            }
            PlaidPrimaryButton plaidPrimaryButton = saVar7.f19442g;
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
            sa saVar8 = this.f19183e;
            if (saVar8 == null) {
                kotlin.jvm.internal.s.x("binding");
                saVar8 = null;
            }
            saVar8.f19442g.setOnClickListener(new View.OnClickListener() { // from class: qq.u
                {
                    oc.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    oc.a(oc.this, view);
                }
            });
        }
        if (rendering.hasSecondaryButton()) {
            sa saVar9 = this.f19183e;
            if (saVar9 == null) {
                kotlin.jvm.internal.s.x("binding");
                saVar9 = null;
            }
            PlaidSecondaryButton plaidSecondaryButton = saVar9.f19443h;
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
            sa saVar10 = this.f19183e;
            if (saVar10 == null) {
                kotlin.jvm.internal.s.x("binding");
            } else {
                saVar = saVar10;
            }
            saVar.f19443h.setOnClickListener(new View.OnClickListener() { // from class: qq.v
                {
                    oc.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    oc.b(oc.this, view);
                }
            });
        }
    }

    public static final void a(oc this$0, View view) {
        int t11;
        boolean a11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (this$0.c()) {
            sc b11 = this$0.b();
            List<rc> list = this$0.f19184f;
            t11 = wz.x.t(list, 10);
            ArrayList outputs = new ArrayList(t11);
            for (rc rcVar : list) {
                String response = rcVar.getResponse();
                if (response == null) {
                    response = "";
                }
                outputs.add(response);
            }
            b11.getClass();
            kotlin.jvm.internal.s.g(outputs, "outputs");
            Pane$PaneRendering pane$PaneRendering = b11.f19456j;
            if (pane$PaneRendering == null) {
                kotlin.jvm.internal.s.x("pane");
                pane$PaneRendering = null;
            }
            UserInput$UserInputPane.Rendering userInput = pane$PaneRendering.getUserInput();
            a11 = b11.a(userInput == null ? null : userInput.getButton(), (h00.l<? super Common$LocalAction, Boolean>) null);
            if (a11) {
                Pane$PaneRendering pane$PaneRendering2 = b11.f19456j;
                if (pane$PaneRendering2 == null) {
                    kotlin.jvm.internal.s.x("pane");
                    pane$PaneRendering2 = null;
                }
                UserInput$UserInputPane.Rendering userInput2 = pane$PaneRendering2.getUserInput();
                if ((userInput2 == null ? null : userInput2.getDisplayMode()) == o1.USER_INPUT_PROMPT_DISPLAY_MODE_FORM_LIST) {
                    int i11 = 0;
                    for (Object obj : outputs) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            wz.w.s();
                        }
                        String str = (String) obj;
                        List<? extends ya> list2 = b11.f19455i.f18245c;
                        ya yaVar = list2 == null ? null : list2.get(i11);
                        if (yaVar != null) {
                            yaVar.f19898b = str;
                        }
                        i11 = i12;
                    }
                    b11.c();
                    return;
                }
                b11.f19455i.a().f19898b = (String) wz.u.b0(outputs);
                if (b11.f19455i.b()) {
                    b11.f19455i.c();
                } else {
                    b11.c();
                }
            }
        }
    }
}