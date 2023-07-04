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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Button$ButtonPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$HyperlinkContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.core.ui_components.PlaidSecondaryButton;
import com.plaid.internal.core.ui_components.PlaidTertiaryButton;
import com.plaid.link.R;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class o extends pd<t> {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f19114f = 0;

    /* renamed from: e  reason: collision with root package name */
    public i8 f19115e;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.button.ButtonFragment$onViewCreated$1", f = "ButtonFragment.kt", l = {41}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19116a;

        /* renamed from: com.plaid.internal.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0344a implements kotlinx.coroutines.flow.f, kotlin.jvm.internal.m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ o f19118a;

            public C0344a(o oVar) {
                this.f19118a = oVar;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Object obj, zz.d dVar) {
                o oVar = this.f19118a;
                int i11 = o.f19114f;
                oVar.a((Button$ButtonPane.Rendering) obj);
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
                return new kotlin.jvm.internal.a(2, this.f19118a, o.class, "bindView", "bindView(Lcom/plaid/internal/core/protos/link/workflow/nodes/panes/Button$ButtonPane$Rendering;)V", 4);
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
            int i11 = this.f19116a;
            if (i11 == 0) {
                vz.r.b(obj);
                o oVar = o.this;
                int i12 = o.f19114f;
                kotlinx.coroutines.flow.y a11 = kotlinx.coroutines.flow.g.a(oVar.b().f19477h);
                C0344a c0344a = new C0344a(o.this);
                this.f19116a = 1;
                if (a11.collect(c0344a, this) == d11) {
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

    public o() {
        super(t.class);
    }

    public static final void b(o this$0, View view) {
        boolean a11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        t b11 = this$0.b();
        Pane$PaneRendering pane$PaneRendering = b11.f19482m;
        if (pane$PaneRendering == null) {
            kotlin.jvm.internal.s.x("pane");
            pane$PaneRendering = null;
        }
        Button$ButtonPane.Rendering button = pane$PaneRendering.getButton();
        a11 = b11.a(button == null ? null : button.getSecondaryButton(), (h00.l<? super Common$LocalAction, Boolean>) null);
        if (a11) {
            Button$ButtonPane.Actions.b buttonPaneSecondaryTapAction = (Button$ButtonPane.Actions.b) b11.f19479j.mo16getValue();
            kotlin.jvm.internal.s.f(buttonPaneSecondaryTapAction, "buttonPaneSecondaryTapAction");
            Button$ButtonPane.Rendering.Events events = b11.f19483n;
            b11.a(buttonPaneSecondaryTapAction, events != null ? events.getOnSecondaryButtonTap() : null);
        }
    }

    public static final void c(o this$0, View view) {
        boolean a11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        t b11 = this$0.b();
        Pane$PaneRendering pane$PaneRendering = b11.f19482m;
        if (pane$PaneRendering == null) {
            kotlin.jvm.internal.s.x("pane");
            pane$PaneRendering = null;
        }
        Button$ButtonPane.Rendering button = pane$PaneRendering.getButton();
        a11 = b11.a(button == null ? null : button.getTertiaryButton(), (h00.l<? super Common$LocalAction, Boolean>) null);
        if (a11) {
            Button$ButtonPane.Actions.b buttonPaneTertiaryTapAction = (Button$ButtonPane.Actions.b) b11.f19480k.mo16getValue();
            kotlin.jvm.internal.s.f(buttonPaneTertiaryTapAction, "buttonPaneTertiaryTapAction");
            Button$ButtonPane.Rendering.Events events = b11.f19483n;
            b11.a(buttonPaneTertiaryTapAction, events != null ? events.getOnTertiaryButtonTap() : null);
        }
    }

    @Override // com.plaid.internal.pd
    public t a(vd paneId, y7 component) {
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(component, "component");
        return new t(paneId, component);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.plaid_button_fragment, viewGroup, false);
        int i11 = R.id.button_content;
        LinearLayout linearLayout = (LinearLayout) b5.b.a(inflate, i11);
        if (linearLayout != null) {
            i11 = R.id.buttonDisclaimer;
            TextView textView = (TextView) b5.b.a(inflate, i11);
            if (textView != null) {
                i11 = R.id.content;
                TextView textView2 = (TextView) b5.b.a(inflate, i11);
                if (textView2 != null) {
                    i11 = R.id.header;
                    TextView textView3 = (TextView) b5.b.a(inflate, i11);
                    if (textView3 != null) {
                        i11 = R.id.headerAssetCaption;
                        TextView textView4 = (TextView) b5.b.a(inflate, i11);
                        if (textView4 != null) {
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
                                            i11 = R.id.secondaryButton;
                                            PlaidSecondaryButton plaidSecondaryButton = (PlaidSecondaryButton) b5.b.a(inflate, i11);
                                            if (plaidSecondaryButton != null) {
                                                i11 = R.id.tertiaryButton;
                                                PlaidTertiaryButton plaidTertiaryButton = (PlaidTertiaryButton) b5.b.a(inflate, i11);
                                                if (plaidTertiaryButton != null) {
                                                    LinearLayout linearLayout2 = (LinearLayout) inflate;
                                                    i8 i8Var = new i8(linearLayout2, linearLayout, textView, textView2, textView3, textView4, plaidInstitutionHeaderItem, plaidNavigationBar, plaidPrimaryButton, imageView, plaidSecondaryButton, plaidTertiaryButton);
                                                    kotlin.jvm.internal.s.f(i8Var, "inflate(inflater, container, false)");
                                                    this.f19115e = i8Var;
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

    public final void a(Button$ButtonPane.Rendering rendering) {
        String str;
        String str2;
        Common$LocalizedString title;
        String str3;
        Common$LocalizedString title2;
        Common$LocalizedString title3;
        String str4;
        Common$LocalizedString text;
        String a11;
        String a12;
        String a13;
        i8 i8Var = null;
        if (rendering.hasInstitution()) {
            i8 i8Var2 = this.f19115e;
            if (i8Var2 == null) {
                kotlin.jvm.internal.s.x("binding");
                i8Var2 = null;
            }
            PlaidInstitutionHeaderItem plaidInstitutionHeaderItem = i8Var2.f18839f;
            kotlin.jvm.internal.s.f(plaidInstitutionHeaderItem, "binding.plaidInstitution");
            k9.a(plaidInstitutionHeaderItem, rendering.getInstitution());
        }
        if (rendering.hasHeaderAsset()) {
            i8 i8Var3 = this.f19115e;
            if (i8Var3 == null) {
                kotlin.jvm.internal.s.x("binding");
                i8Var3 = null;
            }
            ImageView imageView = i8Var3.f18841h;
            kotlin.jvm.internal.s.f(imageView, "binding.renderedAsset");
            a4.a(imageView, rendering.getHeaderAsset());
        }
        if (rendering.hasHeaderAssetCaption()) {
            i8 i8Var4 = this.f19115e;
            if (i8Var4 == null) {
                kotlin.jvm.internal.s.x("binding");
                i8Var4 = null;
            }
            TextView textView = i8Var4.f18838e;
            kotlin.jvm.internal.s.f(textView, "binding.headerAssetCaption");
            Common$LocalizedString headerAssetCaption = rendering.getHeaderAssetCaption();
            if (headerAssetCaption == null) {
                a13 = null;
            } else {
                Resources resources = getResources();
                kotlin.jvm.internal.s.f(resources, "resources");
                Context context = getContext();
                a13 = z6.a(headerAssetCaption, resources, context == null ? null : context.getPackageName(), 0, 4);
            }
            jc.a(textView, a13);
        }
        if (rendering.hasHeader()) {
            i8 i8Var5 = this.f19115e;
            if (i8Var5 == null) {
                kotlin.jvm.internal.s.x("binding");
                i8Var5 = null;
            }
            TextView textView2 = i8Var5.f18837d;
            kotlin.jvm.internal.s.f(textView2, "binding.header");
            Common$LocalizedString header = rendering.getHeader();
            if (header == null) {
                a12 = null;
            } else {
                Resources resources2 = getResources();
                kotlin.jvm.internal.s.f(resources2, "resources");
                Context context2 = getContext();
                a12 = z6.a(header, resources2, context2 == null ? null : context2.getPackageName(), 0, 4);
            }
            jc.a(textView2, a12);
        }
        if (rendering.hasContent()) {
            i8 i8Var6 = this.f19115e;
            if (i8Var6 == null) {
                kotlin.jvm.internal.s.x("binding");
                i8Var6 = null;
            }
            TextView textView3 = i8Var6.f18836c;
            kotlin.jvm.internal.s.f(textView3, "binding.content");
            Common$LocalizedString content = rendering.getContent();
            if (content == null) {
                a11 = null;
            } else {
                Resources resources3 = getResources();
                kotlin.jvm.internal.s.f(resources3, "resources");
                Context context3 = getContext();
                a11 = z6.a(content, resources3, context3 == null ? null : context3.getPackageName(), 0, 4);
            }
            jc.a(textView3, a11);
        }
        if (rendering.hasButtonDisclaimer()) {
            i8 i8Var7 = this.f19115e;
            if (i8Var7 == null) {
                kotlin.jvm.internal.s.x("binding");
                i8Var7 = null;
            }
            TextView textView4 = i8Var7.f18835b;
            kotlin.jvm.internal.s.f(textView4, "binding.buttonDisclaimer");
            Common$HyperlinkContent buttonDisclaimer = rendering.getButtonDisclaimer();
            if (buttonDisclaimer == null || (text = buttonDisclaimer.getText()) == null) {
                str4 = null;
            } else {
                Resources resources4 = getResources();
                kotlin.jvm.internal.s.f(resources4, "resources");
                Context context4 = getContext();
                str4 = z6.a(text, resources4, context4 == null ? null : context4.getPackageName(), 0, 4);
            }
            jc.a(textView4, str4);
        } else if (rendering.hasButtonDisclaimerText()) {
            i8 i8Var8 = this.f19115e;
            if (i8Var8 == null) {
                kotlin.jvm.internal.s.x("binding");
                i8Var8 = null;
            }
            TextView textView5 = i8Var8.f18835b;
            kotlin.jvm.internal.s.f(textView5, "binding.buttonDisclaimer");
            Common$LocalizedString localizedString = rendering.getButtonDisclaimerText().getLocalizedString();
            kotlin.jvm.internal.s.f(localizedString, "rendering.buttonDisclaimerText.localizedString");
            Resources resources5 = getResources();
            kotlin.jvm.internal.s.f(resources5, "resources");
            Context context5 = getContext();
            jc.a(textView5, z6.a(localizedString, resources5, context5 == null ? null : context5.getPackageName(), 0, 4));
        }
        i8 i8Var9 = this.f19115e;
        if (i8Var9 == null) {
            kotlin.jvm.internal.s.x("binding");
            i8Var9 = null;
        }
        PlaidPrimaryButton plaidPrimaryButton = i8Var9.f18840g;
        kotlin.jvm.internal.s.f(plaidPrimaryButton, "binding.primaryButton");
        Common$ButtonContent button = rendering.getButton();
        if (button == null || (title3 = button.getTitle()) == null) {
            str = null;
        } else {
            Resources resources6 = getResources();
            kotlin.jvm.internal.s.f(resources6, "resources");
            Context context6 = getContext();
            str = z6.a(title3, resources6, context6 == null ? null : context6.getPackageName(), 0, 4);
        }
        jc.a(plaidPrimaryButton, str);
        i8 i8Var10 = this.f19115e;
        if (i8Var10 == null) {
            kotlin.jvm.internal.s.x("binding");
            i8Var10 = null;
        }
        i8Var10.f18840g.setOnClickListener(new View.OnClickListener() { // from class: qq.p
            {
                com.plaid.internal.o.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.plaid.internal.o.a(com.plaid.internal.o.this, view);
            }
        });
        if (rendering.hasSecondaryButton()) {
            i8 i8Var11 = this.f19115e;
            if (i8Var11 == null) {
                kotlin.jvm.internal.s.x("binding");
                i8Var11 = null;
            }
            PlaidSecondaryButton plaidSecondaryButton = i8Var11.f18842i;
            kotlin.jvm.internal.s.f(plaidSecondaryButton, "binding.secondaryButton");
            Common$ButtonContent secondaryButton = rendering.getSecondaryButton();
            if (secondaryButton == null || (title2 = secondaryButton.getTitle()) == null) {
                str3 = null;
            } else {
                Resources resources7 = getResources();
                kotlin.jvm.internal.s.f(resources7, "resources");
                Context context7 = getContext();
                str3 = z6.a(title2, resources7, context7 == null ? null : context7.getPackageName(), 0, 4);
            }
            jc.a(plaidSecondaryButton, str3);
            i8 i8Var12 = this.f19115e;
            if (i8Var12 == null) {
                kotlin.jvm.internal.s.x("binding");
                i8Var12 = null;
            }
            i8Var12.f18842i.setOnClickListener(new View.OnClickListener() { // from class: qq.q
                {
                    com.plaid.internal.o.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.plaid.internal.o.b(com.plaid.internal.o.this, view);
                }
            });
        }
        if (rendering.hasTertiaryButton()) {
            i8 i8Var13 = this.f19115e;
            if (i8Var13 == null) {
                kotlin.jvm.internal.s.x("binding");
                i8Var13 = null;
            }
            PlaidTertiaryButton plaidTertiaryButton = i8Var13.f18843j;
            kotlin.jvm.internal.s.f(plaidTertiaryButton, "binding.tertiaryButton");
            Common$ButtonContent tertiaryButton = rendering.getTertiaryButton();
            if (tertiaryButton == null || (title = tertiaryButton.getTitle()) == null) {
                str2 = null;
            } else {
                Resources resources8 = getResources();
                kotlin.jvm.internal.s.f(resources8, "resources");
                Context context8 = getContext();
                str2 = z6.a(title, resources8, context8 == null ? null : context8.getPackageName(), 0, 4);
            }
            jc.a(plaidTertiaryButton, str2);
            i8 i8Var14 = this.f19115e;
            if (i8Var14 == null) {
                kotlin.jvm.internal.s.x("binding");
            } else {
                i8Var = i8Var14;
            }
            i8Var.f18843j.setOnClickListener(new View.OnClickListener() { // from class: qq.r
                {
                    com.plaid.internal.o.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.plaid.internal.o.c(com.plaid.internal.o.this, view);
                }
            });
        }
    }

    public static final void a(o this$0, View view) {
        boolean a11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        t b11 = this$0.b();
        Pane$PaneRendering pane$PaneRendering = b11.f19482m;
        if (pane$PaneRendering == null) {
            kotlin.jvm.internal.s.x("pane");
            pane$PaneRendering = null;
        }
        Button$ButtonPane.Rendering button = pane$PaneRendering.getButton();
        a11 = b11.a(button == null ? null : button.getButton(), (h00.l<? super Common$LocalAction, Boolean>) null);
        if (a11) {
            Button$ButtonPane.Actions.b buttonPaneTapAction = (Button$ButtonPane.Actions.b) b11.f19478i.mo16getValue();
            kotlin.jvm.internal.s.f(buttonPaneTapAction, "buttonPaneTapAction");
            Button$ButtonPane.Rendering.Events events = b11.f19483n;
            b11.a(buttonPaneTapAction, events != null ? events.getOnButtonTap() : null);
        }
    }
}