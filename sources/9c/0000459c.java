package com.plaid.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Consent$ConsentPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.core.ui_components.PlaidSecondaryButton;
import com.plaid.internal.u1;
import com.plaid.internal.wa;
import com.plaid.link.R;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class u1 extends pd<x1> {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f19541g = 0;

    /* renamed from: e  reason: collision with root package name */
    public x8 f19542e;

    /* renamed from: f  reason: collision with root package name */
    public final vb f19543f;

    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<Object, vz.b0> {
        public a() {
            super(1);
        }

        @Override // h00.l
        public vz.b0 invoke(Object obj) {
            u1 u1Var = u1.this;
            int i11 = u1.f19541g;
            x1 b11 = u1Var.b();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.plaid.internal.core.protos.link.workflow.nodes.panes.Consent.ConsentPane.Actions");
            Consent$ConsentPane.Actions actions = (Consent$ConsentPane.Actions) obj;
            b11.getClass();
            kotlin.jvm.internal.s.g(actions, "actions");
            Consent$ConsentPane.Rendering.Events events = b11.f19737n;
            b11.a(actions, events == null ? null : events.getOnSecondaryDisclaimerButtonTap());
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
            u1 u1Var = u1.this;
            u1Var.a(it2, (h00.l<? super String, vz.b0>) null, new v1(u1Var));
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
            Common$LocalAction it2 = common$LocalAction;
            kotlin.jvm.internal.s.g(it2, "it");
            u1 u1Var = u1.this;
            u1Var.a(it2, (h00.l<? super String, vz.b0>) null, new w1(u1Var));
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.consent.ConsentFragment$onViewCreated$1", f = "ConsentFragment.kt", l = {48}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19547a;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a implements kotlinx.coroutines.flow.f, kotlin.jvm.internal.m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ u1 f19549a;

            public a(u1 u1Var) {
                this.f19549a = u1Var;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Object obj, zz.d dVar) {
                u1 u1Var = this.f19549a;
                int i11 = u1.f19541g;
                u1Var.a((Consent$ConsentPane.Rendering) obj);
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
                return new kotlin.jvm.internal.a(2, this.f19549a, u1.class, "bindView", "bindView(Lcom/plaid/internal/core/protos/link/workflow/nodes/panes/Consent$ConsentPane$Rendering;)V", 4);
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
            int i11 = this.f19547a;
            if (i11 == 0) {
                vz.r.b(obj);
                u1 u1Var = u1.this;
                int i12 = u1.f19541g;
                kotlinx.coroutines.flow.y a11 = kotlinx.coroutines.flow.g.a(u1Var.b().f19731h);
                a aVar = new a(u1.this);
                this.f19547a = 1;
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

    public u1() {
        super(x1.class);
        this.f19543f = new vb();
    }

    public static final void b(u1 this$0, View view) {
        boolean a11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        x1 b11 = this$0.b();
        Pane$PaneRendering pane$PaneRendering = b11.f19736m;
        if (pane$PaneRendering == null) {
            kotlin.jvm.internal.s.x("pane");
            pane$PaneRendering = null;
        }
        Consent$ConsentPane.Rendering consent = pane$PaneRendering.getConsent();
        a11 = b11.a(consent == null ? null : consent.getSecondaryButton(), (h00.l<? super Common$LocalAction, Boolean>) null);
        if (a11) {
            Consent$ConsentPane.Actions.b consentSecondaryButtonAction = (Consent$ConsentPane.Actions.b) b11.f19734k.getValue();
            kotlin.jvm.internal.s.f(consentSecondaryButtonAction, "consentSecondaryButtonAction");
            Consent$ConsentPane.Rendering.Events events = b11.f19737n;
            b11.a(consentSecondaryButtonAction, events != null ? events.getOnSecondaryButtonTap() : null);
        }
    }

    @Override // com.plaid.internal.pd
    public x1 a(vd paneId, y7 component) {
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(component, "component");
        return new x1(paneId, component);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View a11;
        kotlin.jvm.internal.s.g(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.plaid_consent_fragment, viewGroup, false);
        int i11 = R.id.continueDisclaimer;
        TextView textView = (TextView) b5.b.a(inflate, i11);
        if (textView != null) {
            i11 = R.id.header;
            TextView textView2 = (TextView) b5.b.a(inflate, i11);
            if (textView2 != null) {
                i11 = R.id.logo;
                ImageView imageView = (ImageView) b5.b.a(inflate, i11);
                if (imageView != null && (a11 = b5.b.a(inflate, (i11 = R.id.plaid_divider))) != null) {
                    i11 = R.id.plaid_navigation;
                    PlaidNavigationBar plaidNavigationBar = (PlaidNavigationBar) b5.b.a(inflate, i11);
                    if (plaidNavigationBar != null) {
                        i11 = R.id.primaryButton;
                        PlaidPrimaryButton plaidPrimaryButton = (PlaidPrimaryButton) b5.b.a(inflate, i11);
                        if (plaidPrimaryButton != null) {
                            i11 = R.id.secondaryButton;
                            PlaidSecondaryButton plaidSecondaryButton = (PlaidSecondaryButton) b5.b.a(inflate, i11);
                            if (plaidSecondaryButton != null) {
                                i11 = R.id.sellingPointsSection;
                                RecyclerView recyclerView = (RecyclerView) b5.b.a(inflate, i11);
                                if (recyclerView != null) {
                                    LinearLayout linearLayout = (LinearLayout) inflate;
                                    x8 x8Var = new x8(linearLayout, textView, textView2, imageView, a11, plaidNavigationBar, plaidPrimaryButton, plaidSecondaryButton, recyclerView);
                                    kotlin.jvm.internal.s.f(x8Var, "inflate(inflater, container, false)");
                                    this.f19542e = x8Var;
                                    return linearLayout;
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
        x8 x8Var = null;
        v20.k.d(androidx.lifecycle.w.a(this), null, null, new d(null), 3, null);
        x8 x8Var2 = this.f19542e;
        if (x8Var2 == null) {
            kotlin.jvm.internal.s.x("binding");
        } else {
            x8Var = x8Var2;
        }
        RecyclerView recyclerView = x8Var.f19833h;
        recyclerView.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(recyclerView.getContext(), R.anim.plaid_layout_animation_cascade_down));
        recyclerView.addItemDecoration(new qa((int) recyclerView.getResources().getDimension(R.dimen.plaid_space_2x)));
        recyclerView.setAdapter(this.f19543f);
    }

    public final void a(Consent$ConsentPane.Rendering rendering) {
        String a11;
        Common$RenderedAssetAppearance headerAsset;
        String str;
        x8 x8Var;
        Common$LocalizedString title;
        String str2;
        Common$LocalizedString title2;
        String str3;
        Consent$ConsentPane.DisclaimerText disclaimerText;
        Common$LocalizedString localizedString;
        View view = getView();
        PlaidNavigationBar plaidNavigationBar = view == null ? null : (PlaidNavigationBar) view.findViewById(R.id.plaid_navigation);
        int i11 = 0;
        if (plaidNavigationBar != null) {
            plaidNavigationBar.f18466c.setVisibility(0);
            plaidNavigationBar.f18465b.setVisibility(8);
        }
        x8 x8Var2 = this.f19542e;
        if (x8Var2 == null) {
            kotlin.jvm.internal.s.x("binding");
            x8Var2 = null;
        }
        TextView textView = x8Var2.f19828c;
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
        if (rendering.hasPlaidBrandedAsset()) {
            headerAsset = rendering.getPlaidBrandedAsset();
        } else {
            headerAsset = rendering.hasHeaderAsset() ? rendering.getHeaderAsset() : null;
        }
        if (headerAsset != null) {
            x8 x8Var3 = this.f19542e;
            if (x8Var3 == null) {
                kotlin.jvm.internal.s.x("binding");
                x8Var3 = null;
            }
            ImageView imageView = x8Var3.f19829d;
            kotlin.jvm.internal.s.f(imageView, "binding.logo");
            a4.a(imageView, headerAsset);
        }
        if (headerAsset == null && rendering.hasCoBrandedAsset()) {
            wa.a.b(wa.f19678a, "was only sent cobranded asset but SDK can not render this", false, 2);
        }
        vb vbVar = this.f19543f;
        List<Consent$ConsentPane.Rendering.Section> items = rendering.getSectionsList();
        kotlin.jvm.internal.s.f(items, "consent.sectionsList");
        vbVar.getClass();
        kotlin.jvm.internal.s.g(items, "items");
        vbVar.f19630a.clear();
        vbVar.f19630a.addAll(items);
        vbVar.notifyDataSetChanged();
        x8 x8Var4 = this.f19542e;
        if (x8Var4 == null) {
            kotlin.jvm.internal.s.x("binding");
            x8Var4 = null;
        }
        x8Var4.f19833h.scheduleLayoutAnimation();
        x8 x8Var5 = this.f19542e;
        if (x8Var5 == null) {
            kotlin.jvm.internal.s.x("binding");
            x8Var5 = null;
        }
        View view2 = x8Var5.f19830e;
        kotlin.jvm.internal.s.f(view2, "binding.plaidDivider");
        view2.setVisibility(rendering.getShowActionDividerLine() ? 0 : 8);
        if (rendering.hasButtonDisclaimerText()) {
            x8 x8Var6 = this.f19542e;
            if (x8Var6 == null) {
                kotlin.jvm.internal.s.x("binding");
                x8Var6 = null;
            }
            TextView textView2 = x8Var6.f19827b;
            kotlin.jvm.internal.s.f(textView2, "binding.continueDisclaimer");
            Consent$ConsentPane.DisclaimerText buttonDisclaimerText = rendering.getButtonDisclaimerText();
            a paneActionListener = new a();
            b localActionListener = new b();
            kotlin.jvm.internal.s.g(textView2, "<this>");
            kotlin.jvm.internal.s.g(paneActionListener, "paneActionListener");
            kotlin.jvm.internal.s.g(localActionListener, "localActionListener");
            Common$AttributedLocalizedString attributedText = buttonDisclaimerText == null ? null : buttonDisclaimerText.getAttributedText();
            if (attributedText == null || (localizedString = attributedText.getLocalizedString()) == null) {
                str3 = null;
            } else {
                Resources resources2 = textView2.getResources();
                kotlin.jvm.internal.s.f(resources2, "resources");
                Context context2 = textView2.getContext();
                str3 = z6.a(localizedString, resources2, context2 == null ? null : context2.getPackageName(), 0, 4);
            }
            if (str3 == null || str3.length() == 0) {
                textView2.setText((CharSequence) null);
                textView2.setVisibility(8);
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(str3));
                Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                kotlin.jvm.internal.s.f(spans, "html.getSpans(0, html.length, URLSpan::class.java)");
                int length = spans.length;
                int i12 = 0;
                while (i12 < length) {
                    Object obj = spans[i12];
                    i12++;
                    URLSpan uRLSpan = (URLSpan) obj;
                    Consent$ConsentPane.Actions actions = buttonDisclaimerText.getAdditionalActions().get(uRLSpan.getURL());
                    if (actions == null) {
                        disclaimerText = buttonDisclaimerText;
                    } else {
                        disclaimerText = buttonDisclaimerText;
                        spannableStringBuilder.setSpan(new b1(paneActionListener, actions), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), 18);
                        spannableStringBuilder.removeSpan(uRLSpan);
                    }
                    Common$LocalAction common$LocalAction = attributedText.getActions().get(uRLSpan.getURL());
                    if (common$LocalAction != null) {
                        spannableStringBuilder.setSpan(new r6(localActionListener, common$LocalAction), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), 18);
                        spannableStringBuilder.removeSpan(uRLSpan);
                    }
                    buttonDisclaimerText = disclaimerText;
                    i11 = 0;
                }
                textView2.setVisibility(i11);
                textView2.setText(spannableStringBuilder);
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
            }
        } else if (rendering.hasButtonDisclaimer()) {
            x8 x8Var7 = this.f19542e;
            if (x8Var7 == null) {
                kotlin.jvm.internal.s.x("binding");
                x8Var7 = null;
            }
            TextView textView3 = x8Var7.f19827b;
            kotlin.jvm.internal.s.f(textView3, "binding.continueDisclaimer");
            ic.a(textView3, rendering.getButtonDisclaimer(), new c());
        }
        if (rendering.hasButton()) {
            x8 x8Var8 = this.f19542e;
            if (x8Var8 == null) {
                kotlin.jvm.internal.s.x("binding");
                x8Var8 = null;
            }
            PlaidPrimaryButton plaidPrimaryButton = x8Var8.f19831f;
            kotlin.jvm.internal.s.f(plaidPrimaryButton, "binding.primaryButton");
            Common$ButtonContent button = rendering.getButton();
            if (button == null || (title2 = button.getTitle()) == null) {
                str2 = null;
            } else {
                Resources resources3 = getResources();
                kotlin.jvm.internal.s.f(resources3, "resources");
                Context context3 = getContext();
                str2 = z6.a(title2, resources3, context3 == null ? null : context3.getPackageName(), 0, 4);
            }
            jc.a(plaidPrimaryButton, str2);
            x8 x8Var9 = this.f19542e;
            if (x8Var9 == null) {
                kotlin.jvm.internal.s.x("binding");
                x8Var9 = null;
            }
            x8Var9.f19831f.setOnClickListener(new View.OnClickListener() { // from class: qq.j0
                {
                    u1.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    u1.a(u1.this, view3);
                }
            });
        }
        if (rendering.hasSecondaryButton()) {
            x8 x8Var10 = this.f19542e;
            if (x8Var10 == null) {
                kotlin.jvm.internal.s.x("binding");
                x8Var10 = null;
            }
            PlaidSecondaryButton plaidSecondaryButton = x8Var10.f19832g;
            kotlin.jvm.internal.s.f(plaidSecondaryButton, "binding.secondaryButton");
            Common$ButtonContent secondaryButton = rendering.getSecondaryButton();
            if (secondaryButton == null || (title = secondaryButton.getTitle()) == null) {
                str = null;
            } else {
                Resources resources4 = getResources();
                kotlin.jvm.internal.s.f(resources4, "resources");
                Context context4 = getContext();
                str = z6.a(title, resources4, context4 == null ? null : context4.getPackageName(), 0, 4);
            }
            jc.a(plaidSecondaryButton, str);
            x8 x8Var11 = this.f19542e;
            if (x8Var11 == null) {
                kotlin.jvm.internal.s.x("binding");
                x8Var = null;
            } else {
                x8Var = x8Var11;
            }
            x8Var.f19832g.setOnClickListener(new View.OnClickListener() { // from class: qq.k0
                {
                    u1.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    u1.b(u1.this, view3);
                }
            });
        }
    }

    public static final void a(u1 this$0, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        x1 b11 = this$0.b();
        Consent$ConsentPane.Actions.b consentContinueAction = (Consent$ConsentPane.Actions.b) b11.f19732i.getValue();
        kotlin.jvm.internal.s.f(consentContinueAction, "consentContinueAction");
        Consent$ConsentPane.Rendering.Events events = b11.f19737n;
        b11.a(consentContinueAction, events == null ? null : events.getOnButtonTap());
    }
}