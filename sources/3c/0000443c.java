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
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTable$ButtonWithTablePane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.core.ui_components.PlaidSecondaryButton;
import com.plaid.internal.r9;
import com.plaid.link.R;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class j0 extends pd<k0> {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f18853f = 0;

    /* renamed from: e  reason: collision with root package name */
    public n8 f18854e;

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.buttonwithtable.ButtonWithTableFragment$onViewCreated$1", f = "ButtonWithTableFragment.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f18855a;

        /* renamed from: com.plaid.internal.j0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0341a implements kotlinx.coroutines.flow.f, kotlin.jvm.internal.m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ j0 f18857a;

            public C0341a(j0 j0Var) {
                this.f18857a = j0Var;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Object obj, zz.d dVar) {
                j0 j0Var = this.f18857a;
                int i11 = j0.f18853f;
                j0Var.a((ButtonWithTable$ButtonWithTablePane.Rendering) obj);
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
                return new kotlin.jvm.internal.a(2, this.f18857a, j0.class, "bindView", "bindView(Lcom/plaid/internal/core/protos/link/workflow/nodes/panes/ButtonWithTable$ButtonWithTablePane$Rendering;)V", 4);
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
            int i11 = this.f18855a;
            if (i11 == 0) {
                vz.r.b(obj);
                j0 j0Var = j0.this;
                int i12 = j0.f18853f;
                kotlinx.coroutines.flow.y a11 = kotlinx.coroutines.flow.g.a(j0Var.b().f18903k);
                C0341a c0341a = new C0341a(j0.this);
                this.f18855a = 1;
                if (a11.collect(c0341a, this) == d11) {
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

    public j0() {
        super(k0.class);
    }

    public static final void b(j0 this$0, View view) {
        Object b11;
        boolean a11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        k0 b12 = this$0.b();
        b12.getClass();
        b11 = v20.j.b(null, new l0(b12, null), 1, null);
        ButtonWithTable$ButtonWithTablePane.Rendering rendering = (ButtonWithTable$ButtonWithTablePane.Rendering) b11;
        a11 = b12.a(rendering == null ? null : rendering.getSecondaryButton(), (h00.l<? super Common$LocalAction, Boolean>) null);
        if (a11) {
            ButtonWithTable$ButtonWithTablePane.Actions.b buttonWithTablePaneSecondaryTapAction = (ButtonWithTable$ButtonWithTablePane.Actions.b) b12.f18901i.mo16getValue();
            kotlin.jvm.internal.s.f(buttonWithTablePaneSecondaryTapAction, "buttonWithTablePaneSecondaryTapAction");
            ButtonWithTable$ButtonWithTablePane.Rendering.Events events = b12.f18905m;
            b12.a(buttonWithTablePaneSecondaryTapAction, events != null ? events.getOnSecondaryButtonTap() : null);
        }
    }

    @Override // com.plaid.internal.pd
    public k0 a(vd paneId, y7 component) {
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(component, "component");
        return new k0(paneId, component);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.plaid_button_with_table_fragment, viewGroup, false);
        int i11 = R.id.header;
        TextView textView = (TextView) b5.b.a(inflate, i11);
        if (textView != null) {
            i11 = R.id.header_asset;
            ImageView imageView = (ImageView) b5.b.a(inflate, i11);
            if (imageView != null) {
                i11 = R.id.plaid_institution;
                PlaidInstitutionHeaderItem plaidInstitutionHeaderItem = (PlaidInstitutionHeaderItem) b5.b.a(inflate, i11);
                if (plaidInstitutionHeaderItem != null) {
                    i11 = R.id.plaid_navigation;
                    PlaidNavigationBar plaidNavigationBar = (PlaidNavigationBar) b5.b.a(inflate, i11);
                    if (plaidNavigationBar != null) {
                        i11 = R.id.primaryButton;
                        PlaidPrimaryButton plaidPrimaryButton = (PlaidPrimaryButton) b5.b.a(inflate, i11);
                        if (plaidPrimaryButton != null) {
                            i11 = R.id.scrollable_content;
                            LinearLayout linearLayout = (LinearLayout) b5.b.a(inflate, i11);
                            if (linearLayout != null) {
                                i11 = R.id.secondaryButton;
                                PlaidSecondaryButton plaidSecondaryButton = (PlaidSecondaryButton) b5.b.a(inflate, i11);
                                if (plaidSecondaryButton != null) {
                                    i11 = R.id.table;
                                    LinearLayout linearLayout2 = (LinearLayout) b5.b.a(inflate, i11);
                                    if (linearLayout2 != null) {
                                        i11 = R.id.table_title;
                                        TextView textView2 = (TextView) b5.b.a(inflate, i11);
                                        if (textView2 != null) {
                                            LinearLayout linearLayout3 = (LinearLayout) inflate;
                                            n8 n8Var = new n8(linearLayout3, textView, imageView, plaidInstitutionHeaderItem, plaidNavigationBar, plaidPrimaryButton, linearLayout, plaidSecondaryButton, linearLayout2, textView2);
                                            kotlin.jvm.internal.s.f(n8Var, "inflate(inflater, container, false)");
                                            this.f18854e = n8Var;
                                            return linearLayout3;
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

    public final void a(ButtonWithTable$ButtonWithTablePane.Rendering rendering) {
        String str;
        Common$LocalizedString title;
        String str2;
        Common$LocalizedString title2;
        String a11;
        String a12;
        String a13;
        String a14;
        n8 n8Var = null;
        if (rendering.hasInstitution()) {
            n8 n8Var2 = this.f18854e;
            if (n8Var2 == null) {
                kotlin.jvm.internal.s.x("binding");
                n8Var2 = null;
            }
            PlaidInstitutionHeaderItem plaidInstitutionHeaderItem = n8Var2.f19071d;
            kotlin.jvm.internal.s.f(plaidInstitutionHeaderItem, "binding.plaidInstitution");
            k9.a(plaidInstitutionHeaderItem, rendering.getInstitution());
        }
        if (rendering.hasHeaderAsset()) {
            n8 n8Var3 = this.f18854e;
            if (n8Var3 == null) {
                kotlin.jvm.internal.s.x("binding");
                n8Var3 = null;
            }
            ImageView imageView = n8Var3.f19070c;
            kotlin.jvm.internal.s.f(imageView, "binding.headerAsset");
            a4.a(imageView, rendering.getHeaderAsset());
        }
        if (rendering.hasHeader()) {
            n8 n8Var4 = this.f18854e;
            if (n8Var4 == null) {
                kotlin.jvm.internal.s.x("binding");
                n8Var4 = null;
            }
            TextView textView = n8Var4.f19069b;
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
        if (rendering.hasTableTitle()) {
            n8 n8Var5 = this.f18854e;
            if (n8Var5 == null) {
                kotlin.jvm.internal.s.x("binding");
                n8Var5 = null;
            }
            TextView textView2 = n8Var5.f19075h;
            kotlin.jvm.internal.s.f(textView2, "binding.tableTitle");
            Common$LocalizedString tableTitle = rendering.getTableTitle();
            if (tableTitle == null) {
                a13 = null;
            } else {
                Resources resources2 = getResources();
                kotlin.jvm.internal.s.f(resources2, "resources");
                Context context2 = getContext();
                a13 = z6.a(tableTitle, resources2, context2 == null ? null : context2.getPackageName(), 0, 4);
            }
            jc.a(textView2, a13);
        }
        List<ButtonWithTable$ButtonWithTablePane.Rendering.TableRow> tableRowsList = rendering.getTableRowsList();
        kotlin.jvm.internal.s.f(tableRowsList, "rendering.tableRowsList");
        int i11 = 0;
        for (Object obj : tableRowsList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                wz.w.s();
            }
            ButtonWithTable$ButtonWithTablePane.Rendering.TableRow tableRow = (ButtonWithTable$ButtonWithTablePane.Rendering.TableRow) obj;
            n8 n8Var6 = this.f18854e;
            if (n8Var6 == null) {
                kotlin.jvm.internal.s.x("binding");
                n8Var6 = null;
            }
            LinearLayout linearLayout = n8Var6.f19074g;
            kotlin.jvm.internal.s.f(tableRow, "tableRow");
            Context requireContext = requireContext();
            kotlin.jvm.internal.s.f(requireContext, "requireContext()");
            r9 r9Var = new r9(requireContext, null, 0);
            Common$LocalizedString label = tableRow.getLabel();
            if (label == null) {
                a11 = null;
            } else {
                Resources resources3 = r9Var.getResources();
                kotlin.jvm.internal.s.f(resources3, "resources");
                Context context3 = r9Var.getContext();
                a11 = z6.a(label, resources3, context3 == null ? null : context3.getPackageName(), 0, 4);
            }
            r9Var.setTitle(a11);
            Common$LocalizedString value = tableRow.getValue();
            if (value == null) {
                a12 = null;
            } else {
                Resources resources4 = r9Var.getResources();
                kotlin.jvm.internal.s.f(resources4, "resources");
                Context context4 = r9Var.getContext();
                a12 = z6.a(value, resources4, context4 == null ? null : context4.getPackageName(), 0, 4);
            }
            r9Var.setLabel(a12);
            if (tableRow.getStyle() == h0.TABLE_ROW_STYLE_LEADING_LABEL) {
                r9Var.setStyle(r9.a.LEADING_LABEL);
            } else {
                r9Var.setStyle(r9.a.TRAILING_LABEL);
            }
            r9Var.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
            linearLayout.addView(r9Var, i11);
            i11 = i12;
        }
        if (rendering.hasButton()) {
            n8 n8Var7 = this.f18854e;
            if (n8Var7 == null) {
                kotlin.jvm.internal.s.x("binding");
                n8Var7 = null;
            }
            PlaidPrimaryButton plaidPrimaryButton = n8Var7.f19072e;
            kotlin.jvm.internal.s.f(plaidPrimaryButton, "binding.primaryButton");
            Common$ButtonContent button = rendering.getButton();
            if (button == null || (title2 = button.getTitle()) == null) {
                str2 = null;
            } else {
                Resources resources5 = getResources();
                kotlin.jvm.internal.s.f(resources5, "resources");
                Context context5 = getContext();
                str2 = z6.a(title2, resources5, context5 == null ? null : context5.getPackageName(), 0, 4);
            }
            jc.a(plaidPrimaryButton, str2);
            n8 n8Var8 = this.f18854e;
            if (n8Var8 == null) {
                kotlin.jvm.internal.s.x("binding");
                n8Var8 = null;
            }
            n8Var8.f19072e.setOnClickListener(new View.OnClickListener() { // from class: qq.l
                {
                    com.plaid.internal.j0.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.plaid.internal.j0.a(com.plaid.internal.j0.this, view);
                }
            });
        }
        if (rendering.hasSecondaryButton()) {
            n8 n8Var9 = this.f18854e;
            if (n8Var9 == null) {
                kotlin.jvm.internal.s.x("binding");
                n8Var9 = null;
            }
            PlaidSecondaryButton plaidSecondaryButton = n8Var9.f19073f;
            kotlin.jvm.internal.s.f(plaidSecondaryButton, "binding.secondaryButton");
            Common$ButtonContent secondaryButton = rendering.getSecondaryButton();
            if (secondaryButton == null || (title = secondaryButton.getTitle()) == null) {
                str = null;
            } else {
                Resources resources6 = getResources();
                kotlin.jvm.internal.s.f(resources6, "resources");
                Context context6 = getContext();
                str = z6.a(title, resources6, context6 == null ? null : context6.getPackageName(), 0, 4);
            }
            jc.a(plaidSecondaryButton, str);
            n8 n8Var10 = this.f18854e;
            if (n8Var10 == null) {
                kotlin.jvm.internal.s.x("binding");
            } else {
                n8Var = n8Var10;
            }
            n8Var.f19073f.setOnClickListener(new View.OnClickListener() { // from class: qq.m
                {
                    com.plaid.internal.j0.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    com.plaid.internal.j0.b(com.plaid.internal.j0.this, view);
                }
            });
        }
    }

    public static final void a(j0 this$0, View view) {
        Object b11;
        boolean a11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        k0 b12 = this$0.b();
        b12.getClass();
        b11 = v20.j.b(null, new l0(b12, null), 1, null);
        ButtonWithTable$ButtonWithTablePane.Rendering rendering = (ButtonWithTable$ButtonWithTablePane.Rendering) b11;
        a11 = b12.a(rendering == null ? null : rendering.getButton(), (h00.l<? super Common$LocalAction, Boolean>) null);
        if (a11) {
            ButtonWithTable$ButtonWithTablePane.Actions.b buttonWithTablePaneTapAction = (ButtonWithTable$ButtonWithTablePane.Actions.b) b12.f18900h.mo16getValue();
            kotlin.jvm.internal.s.f(buttonWithTablePaneTapAction, "buttonWithTablePaneTapAction");
            ButtonWithTable$ButtonWithTablePane.Rendering.Events events = b12.f18905m;
            b12.a(buttonWithTablePaneTapAction, events != null ? events.getOnButtonTap() : null);
        }
    }
}