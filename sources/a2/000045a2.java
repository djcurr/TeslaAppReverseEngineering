package com.plaid.internal;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Credentials$CredentialsPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;
import com.plaid.internal.core.ui_components.PlaidInput;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.core.ui_components.PlaidTertiaryButton;
import com.plaid.internal.u2;
import com.plaid.internal.v2;
import com.plaid.link.R;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class u2 extends pd<v2> {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f19550f = 0;

    /* renamed from: e  reason: collision with root package name */
    public c9 f19551e;

    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<Common$LocalAction, vz.b0> {
        public a() {
            super(1);
        }

        @Override // h00.l
        public vz.b0 invoke(Common$LocalAction common$LocalAction) {
            Common$LocalAction it2 = common$LocalAction;
            kotlin.jvm.internal.s.g(it2, "it");
            u2 u2Var = u2.this;
            u2Var.a(it2, (h00.l<? super String, vz.b0>) null, new t2(u2Var));
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.credentials.CredentialsFragment$onViewCreated$1", f = "CredentialsFragment.kt", l = {53}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19553a;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a implements kotlinx.coroutines.flow.f, kotlin.jvm.internal.m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ u2 f19555a;

            public a(u2 u2Var) {
                this.f19555a = u2Var;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Object obj, zz.d dVar) {
                u2 u2Var = this.f19555a;
                int i11 = u2.f19550f;
                u2Var.a((Credentials$CredentialsPane.Rendering) obj);
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
                return new kotlin.jvm.internal.a(2, this.f19555a, u2.class, "bindView", "bindView(Lcom/plaid/internal/core/protos/link/workflow/nodes/panes/Credentials$CredentialsPane$Rendering;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public b(zz.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new b(dVar);
        }

        @Override // h00.p
        public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return new b(dVar).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f19553a;
            if (i11 == 0) {
                vz.r.b(obj);
                u2 u2Var = u2.this;
                int i12 = u2.f19550f;
                kotlinx.coroutines.flow.y a11 = kotlinx.coroutines.flow.g.a(u2Var.b().f19602k);
                a aVar = new a(u2.this);
                this.f19553a = 1;
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

    public u2() {
        super(v2.class);
    }

    public static final void b(u2 this$0, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.d();
    }

    @Override // com.plaid.internal.pd
    public v2 a(vd paneId, y7 component) {
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(component, "component");
        return new v2(paneId, component);
    }

    public final void c() {
        c9 c9Var = this.f19551e;
        if (c9Var == null) {
            kotlin.jvm.internal.s.x("binding");
            c9Var = null;
        }
        c9Var.f18259j.setOnClickListener(new View.OnClickListener() { // from class: qq.m0
            {
                u2.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u2.b(u2.this, view);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x014f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.u2.d():void");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.plaid_credentials_fragment, viewGroup, false);
        int i11 = R.id.content;
        TextView textView = (TextView) b5.b.a(inflate, i11);
        if (textView != null) {
            i11 = R.id.footer;
            TextView textView2 = (TextView) b5.b.a(inflate, i11);
            if (textView2 != null) {
                i11 = R.id.header;
                TextView textView3 = (TextView) b5.b.a(inflate, i11);
                if (textView3 != null) {
                    i11 = R.id.inputOne;
                    PlaidInput plaidInput = (PlaidInput) b5.b.a(inflate, i11);
                    if (plaidInput != null) {
                        i11 = R.id.inputThree;
                        PlaidInput plaidInput2 = (PlaidInput) b5.b.a(inflate, i11);
                        if (plaidInput2 != null) {
                            i11 = R.id.inputTwo;
                            PlaidInput plaidInput3 = (PlaidInput) b5.b.a(inflate, i11);
                            if (plaidInput3 != null) {
                                i11 = R.id.plaidInputsLayout;
                                LinearLayout linearLayout = (LinearLayout) b5.b.a(inflate, i11);
                                if (linearLayout != null) {
                                    i11 = R.id.plaid_institution;
                                    PlaidInstitutionHeaderItem plaidInstitutionHeaderItem = (PlaidInstitutionHeaderItem) b5.b.a(inflate, i11);
                                    if (plaidInstitutionHeaderItem != null) {
                                        i11 = R.id.plaid_navigation;
                                        PlaidNavigationBar plaidNavigationBar = (PlaidNavigationBar) b5.b.a(inflate, i11);
                                        if (plaidNavigationBar != null) {
                                            i11 = R.id.primaryButton;
                                            PlaidPrimaryButton plaidPrimaryButton = (PlaidPrimaryButton) b5.b.a(inflate, i11);
                                            if (plaidPrimaryButton != null) {
                                                LinearLayout linearLayout2 = (LinearLayout) inflate;
                                                i11 = R.id.secondaryButton;
                                                PlaidTertiaryButton plaidTertiaryButton = (PlaidTertiaryButton) b5.b.a(inflate, i11);
                                                if (plaidTertiaryButton != null) {
                                                    c9 c9Var = new c9(linearLayout2, textView, textView2, textView3, plaidInput, plaidInput2, plaidInput3, linearLayout, plaidInstitutionHeaderItem, plaidNavigationBar, plaidPrimaryButton, linearLayout2, plaidTertiaryButton);
                                                    kotlin.jvm.internal.s.f(c9Var, "inflate(inflater, container, false)");
                                                    this.f19551e = c9Var;
                                                    return c9Var.f18260k;
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
        c();
        v20.k.d(androidx.lifecycle.w.a(this), null, null, new b(null), 3, null);
    }

    public final void a(Credentials$CredentialsPane.Rendering rendering) {
        String a11;
        String str;
        Common$LocalizedString title;
        String str2;
        Common$LocalizedString title2;
        String a12;
        c9 c9Var = null;
        if (rendering.hasInstitution()) {
            c9 c9Var2 = this.f19551e;
            if (c9Var2 == null) {
                kotlin.jvm.internal.s.x("binding");
                c9Var2 = null;
            }
            PlaidInstitutionHeaderItem plaidInstitutionHeaderItem = c9Var2.f18258i;
            kotlin.jvm.internal.s.f(plaidInstitutionHeaderItem, "binding.plaidInstitution");
            k9.a(plaidInstitutionHeaderItem, rendering.getInstitution());
        }
        if (rendering.hasHeader()) {
            c9 c9Var3 = this.f19551e;
            if (c9Var3 == null) {
                kotlin.jvm.internal.s.x("binding");
                c9Var3 = null;
            }
            TextView textView = c9Var3.f18253d;
            kotlin.jvm.internal.s.f(textView, "binding.header");
            Common$LocalizedString header = rendering.getHeader();
            if (header == null) {
                a12 = null;
            } else {
                Resources resources = getResources();
                kotlin.jvm.internal.s.f(resources, "resources");
                Context context = getContext();
                a12 = z6.a(header, resources, context == null ? null : context.getPackageName(), 0, 4);
            }
            jc.a(textView, a12);
        }
        if (rendering.hasContent()) {
            c9 c9Var4 = this.f19551e;
            if (c9Var4 == null) {
                kotlin.jvm.internal.s.x("binding");
                c9Var4 = null;
            }
            TextView textView2 = c9Var4.f18251b;
            kotlin.jvm.internal.s.f(textView2, "binding.content");
            ic.a(textView2, rendering.getContent(), new a());
        }
        if (rendering.hasInputOne()) {
            c9 c9Var5 = this.f19551e;
            if (c9Var5 == null) {
                kotlin.jvm.internal.s.x("binding");
                c9Var5 = null;
            }
            PlaidInput plaidInput = c9Var5.f18254e;
            kotlin.jvm.internal.s.f(plaidInput, "binding.inputOne");
            j9.a(plaidInput, rendering.getInputOne());
        }
        if (rendering.hasInputTwo()) {
            c9 c9Var6 = this.f19551e;
            if (c9Var6 == null) {
                kotlin.jvm.internal.s.x("binding");
                c9Var6 = null;
            }
            PlaidInput plaidInput2 = c9Var6.f18256g;
            kotlin.jvm.internal.s.f(plaidInput2, "binding.inputTwo");
            j9.a(plaidInput2, rendering.getInputTwo());
        }
        if (rendering.hasInputThree()) {
            c9 c9Var7 = this.f19551e;
            if (c9Var7 == null) {
                kotlin.jvm.internal.s.x("binding");
                c9Var7 = null;
            }
            PlaidInput plaidInput3 = c9Var7.f18255f;
            kotlin.jvm.internal.s.f(plaidInput3, "binding.inputThree");
            j9.a(plaidInput3, rendering.getInputThree());
        }
        if (rendering.hasButton()) {
            c9 c9Var8 = this.f19551e;
            if (c9Var8 == null) {
                kotlin.jvm.internal.s.x("binding");
                c9Var8 = null;
            }
            PlaidPrimaryButton plaidPrimaryButton = c9Var8.f18259j;
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
        }
        if (rendering.hasSecondaryButton()) {
            c9 c9Var9 = this.f19551e;
            if (c9Var9 == null) {
                kotlin.jvm.internal.s.x("binding");
                c9Var9 = null;
            }
            PlaidTertiaryButton plaidTertiaryButton = c9Var9.f18261l;
            kotlin.jvm.internal.s.f(plaidTertiaryButton, "binding.secondaryButton");
            Common$ButtonContent secondaryButton = rendering.getSecondaryButton();
            if (secondaryButton == null || (title = secondaryButton.getTitle()) == null) {
                str = null;
            } else {
                Resources resources3 = getResources();
                kotlin.jvm.internal.s.f(resources3, "resources");
                Context context3 = getContext();
                str = z6.a(title, resources3, context3 == null ? null : context3.getPackageName(), 0, 4);
            }
            jc.a(plaidTertiaryButton, str);
            c9 c9Var10 = this.f19551e;
            if (c9Var10 == null) {
                kotlin.jvm.internal.s.x("binding");
                c9Var10 = null;
            }
            c9Var10.f18261l.setOnClickListener(new View.OnClickListener() { // from class: qq.l0
                {
                    u2.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u2.a(u2.this, view);
                }
            });
        }
        if (rendering.hasFooter()) {
            c9 c9Var11 = this.f19551e;
            if (c9Var11 == null) {
                kotlin.jvm.internal.s.x("binding");
                c9Var11 = null;
            }
            TextView textView3 = c9Var11.f18252c;
            kotlin.jvm.internal.s.f(textView3, "binding.footer");
            Common$LocalizedString footer = rendering.getFooter();
            if (footer == null) {
                a11 = null;
            } else {
                Resources resources4 = getResources();
                kotlin.jvm.internal.s.f(resources4, "resources");
                Context context4 = getContext();
                a11 = z6.a(footer, resources4, context4 == null ? null : context4.getPackageName(), 0, 4);
            }
            jc.a(textView3, a11);
        }
        c9 c9Var12 = this.f19551e;
        if (c9Var12 == null) {
            kotlin.jvm.internal.s.x("binding");
        } else {
            c9Var = c9Var12;
        }
        LinearLayout linearLayout = c9Var.f18257h;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(3, 0L);
        layoutTransition.setStartDelay(1, 800L);
        layoutTransition.setDuration(1, 800L);
        linearLayout.setLayoutTransition(layoutTransition);
    }

    public static final void a(u2 this$0, View view) {
        boolean a11;
        List<Common$SDKEvent> m11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        v2 b11 = this$0.b();
        Pane$PaneRendering pane$PaneRendering = b11.f19599h;
        if (pane$PaneRendering == null) {
            kotlin.jvm.internal.s.x("pane");
            pane$PaneRendering = null;
        }
        Credentials$CredentialsPane.Rendering credentials = pane$PaneRendering.getCredentials();
        a11 = b11.a(credentials == null ? null : credentials.getSecondaryButton(), (h00.l<? super Common$LocalAction, Boolean>) null);
        if (a11) {
            v2.b bVar = v2.b.f19608a;
            Credentials$CredentialsPane.Actions.b bVar2 = v2.b.f19610c;
            Credentials$CredentialsPane.Rendering.Events events = b11.f19600i;
            m11 = wz.w.m(events != null ? events.getOnSecondaryButtonTap() : null);
            b11.a(bVar2, m11);
        }
    }
}