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
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.OrderedList$OrderedListPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.r7;
import com.plaid.link.R;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class r7 extends pd<s7> {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f19352f = 0;

    /* renamed from: e  reason: collision with root package name */
    public ha f19353e;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.orderedlist.OrderedListFragment$onViewCreated$1", f = "OrderedListFragment.kt", l = {42}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19354a;

        /* renamed from: com.plaid.internal.r7$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0346a implements kotlinx.coroutines.flow.f, kotlin.jvm.internal.m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ r7 f19356a;

            public C0346a(r7 r7Var) {
                this.f19356a = r7Var;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Object obj, zz.d dVar) {
                r7 r7Var = this.f19356a;
                int i11 = r7.f19352f;
                r7Var.a((OrderedList$OrderedListPane.Rendering) obj);
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
                return new kotlin.jvm.internal.a(2, this.f19356a, r7.class, "bindView", "bindView(Lcom/plaid/internal/core/protos/link/workflow/nodes/panes/OrderedList$OrderedListPane$Rendering;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public a(zz.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new a(dVar);
        }

        @Override // h00.p
        /* renamed from: invoke */
        public Object mo160invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new a(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f19354a;
            if (i11 == 0) {
                vz.r.b(obj);
                r7 r7Var = r7.this;
                int i12 = r7.f19352f;
                kotlinx.coroutines.flow.y a11 = kotlinx.coroutines.flow.g.a(r7Var.b().f19421h);
                C0346a c0346a = new C0346a(r7.this);
                this.f19354a = 1;
                if (a11.collect(c0346a, this) == d11) {
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

    public r7() {
        super(s7.class);
    }

    @Override // com.plaid.internal.pd
    public s7 a(vd paneId, y7 component) {
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(component, "component");
        return new s7(paneId, component);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.plaid_ordered_list_fragment, viewGroup, false);
        int i11 = R.id.header;
        TextView textView = (TextView) b5.b.a(inflate, i11);
        if (textView != null) {
            i11 = R.id.ordered_list_content;
            LinearLayout linearLayout = (LinearLayout) b5.b.a(inflate, i11);
            if (linearLayout != null) {
                i11 = R.id.ordered_list_disclaimer;
                TextView textView2 = (TextView) b5.b.a(inflate, i11);
                if (textView2 != null) {
                    i11 = R.id.ordered_list_items;
                    LinearLayout linearLayout2 = (LinearLayout) b5.b.a(inflate, i11);
                    if (linearLayout2 != null) {
                        i11 = R.id.plaid_institution;
                        PlaidInstitutionHeaderItem plaidInstitutionHeaderItem = (PlaidInstitutionHeaderItem) b5.b.a(inflate, i11);
                        if (plaidInstitutionHeaderItem != null) {
                            i11 = R.id.plaid_navigation;
                            PlaidNavigationBar plaidNavigationBar = (PlaidNavigationBar) b5.b.a(inflate, i11);
                            if (plaidNavigationBar != null) {
                                i11 = R.id.primaryButton;
                                PlaidPrimaryButton plaidPrimaryButton = (PlaidPrimaryButton) b5.b.a(inflate, i11);
                                if (plaidPrimaryButton != null) {
                                    i11 = R.id.rendered_asset;
                                    ImageView imageView = (ImageView) b5.b.a(inflate, i11);
                                    if (imageView != null) {
                                        i11 = R.id.scrollable_content;
                                        LinearLayout linearLayout3 = (LinearLayout) b5.b.a(inflate, i11);
                                        if (linearLayout3 != null) {
                                            LinearLayout linearLayout4 = (LinearLayout) inflate;
                                            ha haVar = new ha(linearLayout4, textView, linearLayout, textView2, linearLayout2, plaidInstitutionHeaderItem, plaidNavigationBar, plaidPrimaryButton, imageView, linearLayout3);
                                            kotlin.jvm.internal.s.f(haVar, "inflate(inflater, container, false)");
                                            this.f19353e = haVar;
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
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // com.plaid.internal.pd, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.s.g(view, "view");
        super.onViewCreated(view, bundle);
        v20.k.d(androidx.lifecycle.w.a(this), null, null, new a(null), 3, null);
    }

    public final void a(OrderedList$OrderedListPane.Rendering rendering) {
        String str;
        Common$LocalizedString title;
        String a11;
        String a12;
        String a13;
        String a14;
        ha haVar = null;
        if (rendering.hasInstitution()) {
            ha haVar2 = this.f19353e;
            if (haVar2 == null) {
                kotlin.jvm.internal.s.x("binding");
                haVar2 = null;
            }
            PlaidInstitutionHeaderItem plaidInstitutionHeaderItem = haVar2.f18710e;
            kotlin.jvm.internal.s.f(plaidInstitutionHeaderItem, "binding.plaidInstitution");
            k9.a(plaidInstitutionHeaderItem, rendering.getInstitution());
        }
        if (rendering.hasHeaderAsset()) {
            ha haVar3 = this.f19353e;
            if (haVar3 == null) {
                kotlin.jvm.internal.s.x("binding");
                haVar3 = null;
            }
            ImageView imageView = haVar3.f18712g;
            kotlin.jvm.internal.s.f(imageView, "binding.renderedAsset");
            a4.a(imageView, rendering.getHeaderAsset());
        }
        if (rendering.hasHeader()) {
            ha haVar4 = this.f19353e;
            if (haVar4 == null) {
                kotlin.jvm.internal.s.x("binding");
                haVar4 = null;
            }
            TextView textView = haVar4.f18707b;
            kotlin.jvm.internal.s.f(textView, "binding.header");
            Common$LocalizedString header = rendering.getHeader();
            if (header == null) {
                a14 = null;
            } else {
                Resources resources = getResources();
                kotlin.jvm.internal.s.f(resources, "resources");
                Context context = getContext();
                a14 = z6.a(header, resources, context == null ? null : context.getPackageName(), 0, 4);
            }
            jc.a(textView, a14);
        }
        List<OrderedList$OrderedListPane.Rendering.ListItem> itemsList = rendering.getItemsList();
        kotlin.jvm.internal.s.f(itemsList, "rendering.itemsList");
        int i11 = 0;
        for (Object obj : itemsList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                wz.w.s();
            }
            OrderedList$OrderedListPane.Rendering.ListItem listItem = (OrderedList$OrderedListPane.Rendering.ListItem) obj;
            ha haVar5 = this.f19353e;
            if (haVar5 == null) {
                kotlin.jvm.internal.s.x("binding");
                haVar5 = null;
            }
            LinearLayout linearLayout = haVar5.f18709d;
            kotlin.jvm.internal.s.f(listItem, "listItem");
            LayoutInflater layoutInflater = getLayoutInflater();
            ha haVar6 = this.f19353e;
            if (haVar6 == null) {
                kotlin.jvm.internal.s.x("binding");
                haVar6 = null;
            }
            ia a15 = ia.a(layoutInflater, haVar6.f18713h, false);
            TextView textView2 = a15.f18847d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i12);
            sb2.append(CoreConstants.DOT);
            textView2.setText(sb2.toString());
            if (listItem.hasLabel()) {
                TextView textView3 = a15.f18846c;
                kotlin.jvm.internal.s.f(textView3, "this.label");
                Common$LocalizedString label = listItem.getLabel();
                if (label == null) {
                    a13 = null;
                } else {
                    Resources resources2 = getResources();
                    kotlin.jvm.internal.s.f(resources2, "resources");
                    Context context2 = getContext();
                    a13 = z6.a(label, resources2, context2 == null ? null : context2.getPackageName(), 0, 4);
                }
                jc.a(textView3, a13);
            }
            if (listItem.hasDetail()) {
                TextView textView4 = a15.f18845b;
                kotlin.jvm.internal.s.f(textView4, "this.detail");
                Common$LocalizedString detail = listItem.getDetail();
                if (detail == null) {
                    a12 = null;
                } else {
                    Resources resources3 = getResources();
                    kotlin.jvm.internal.s.f(resources3, "resources");
                    Context context3 = getContext();
                    a12 = z6.a(detail, resources3, context3 == null ? null : context3.getPackageName(), 0, 4);
                }
                jc.a(textView4, a12);
            }
            ConstraintLayout constraintLayout = a15.f18844a;
            kotlin.jvm.internal.s.f(constraintLayout, "inflate(layoutInflater, …Name))\n      }\n    }.root");
            linearLayout.addView(constraintLayout, i11);
            i11 = i12;
        }
        if (rendering.hasDisclaimer()) {
            ha haVar7 = this.f19353e;
            if (haVar7 == null) {
                kotlin.jvm.internal.s.x("binding");
                haVar7 = null;
            }
            TextView textView5 = haVar7.f18708c;
            kotlin.jvm.internal.s.f(textView5, "binding.orderedListDisclaimer");
            Common$LocalizedString disclaimer = rendering.getDisclaimer();
            if (disclaimer == null) {
                a11 = null;
            } else {
                Resources resources4 = getResources();
                kotlin.jvm.internal.s.f(resources4, "resources");
                Context context4 = getContext();
                a11 = z6.a(disclaimer, resources4, context4 == null ? null : context4.getPackageName(), 0, 4);
            }
            jc.a(textView5, a11);
        }
        if (rendering.hasButton()) {
            ha haVar8 = this.f19353e;
            if (haVar8 == null) {
                kotlin.jvm.internal.s.x("binding");
                haVar8 = null;
            }
            PlaidPrimaryButton plaidPrimaryButton = haVar8.f18711f;
            kotlin.jvm.internal.s.f(plaidPrimaryButton, "binding.primaryButton");
            Common$ButtonContent button = rendering.getButton();
            if (button == null || (title = button.getTitle()) == null) {
                str = null;
            } else {
                Resources resources5 = getResources();
                kotlin.jvm.internal.s.f(resources5, "resources");
                Context context5 = getContext();
                str = z6.a(title, resources5, context5 == null ? null : context5.getPackageName(), 0, 4);
            }
            jc.a(plaidPrimaryButton, str);
            ha haVar9 = this.f19353e;
            if (haVar9 == null) {
                kotlin.jvm.internal.s.x("binding");
            } else {
                haVar = haVar9;
            }
            haVar.f18711f.setOnClickListener(new View.OnClickListener() { // from class: qq.e0
                {
                    r7.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    r7.a(r7.this, view);
                }
            });
        }
    }

    public static final void a(r7 this$0, View view) {
        boolean a11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        s7 b11 = this$0.b();
        Pane$PaneRendering pane$PaneRendering = b11.f19424k;
        if (pane$PaneRendering == null) {
            kotlin.jvm.internal.s.x("pane");
            pane$PaneRendering = null;
        }
        OrderedList$OrderedListPane.Rendering orderedList = pane$PaneRendering.getOrderedList();
        a11 = b11.a(orderedList == null ? null : orderedList.getButton(), (h00.l<? super Common$LocalAction, Boolean>) null);
        if (a11) {
            OrderedList$OrderedListPane.Actions.b orderedListPaneTapAction = (OrderedList$OrderedListPane.Actions.b) b11.f19422i.mo16getValue();
            kotlin.jvm.internal.s.f(orderedListPaneTapAction, "orderedListPaneTapAction");
            OrderedList$OrderedListPane.Rendering.Events events = b11.f19425l;
            b11.a(orderedListPaneTapAction, events != null ? events.getOnButtonTap() : null);
        }
    }
}