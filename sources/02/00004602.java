package com.plaid.internal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordion$ButtonWithAccordionPane;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.core.ui_components.PlaidSecondaryButton;
import com.plaid.internal.z;
import com.plaid.link.R;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class x extends pd<z> {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f19718f = 0;

    /* renamed from: e  reason: collision with root package name */
    public l8 f19719e;

    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.l<Common$LocalAction, vz.b0> {
        public a() {
            super(1);
        }

        @Override // h00.l
        public vz.b0 invoke(Common$LocalAction common$LocalAction) {
            Common$LocalAction localAction = common$LocalAction;
            kotlin.jvm.internal.s.g(localAction, "localAction");
            x xVar = x.this;
            xVar.a(localAction, (h00.l<? super String, vz.b0>) null, new w(xVar));
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
            x xVar = x.this;
            xVar.a(it2, (h00.l<? super String, vz.b0>) null, new y(xVar));
            return vz.b0.f54756a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.buttonwithaccordion.ButtonWithAccordionFragment$onViewCreated$1", f = "ButtonWithAccordionFragment.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f19722a;

        /* loaded from: classes2.dex */
        public /* synthetic */ class a implements kotlinx.coroutines.flow.f, kotlin.jvm.internal.m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ x f19724a;

            public a(x xVar) {
                this.f19724a = xVar;
            }

            @Override // kotlinx.coroutines.flow.f
            public Object emit(Object obj, zz.d dVar) {
                x xVar = this.f19724a;
                int i11 = x.f19718f;
                xVar.a((ButtonWithAccordion$ButtonWithAccordionPane.Rendering) obj);
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
                return new kotlin.jvm.internal.a(2, this.f19724a, x.class, "bindView", "bindView(Lcom/plaid/internal/core/protos/link/workflow/nodes/panes/ButtonWithAccordion$ButtonWithAccordionPane$Rendering;)V", 4);
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
            int i11 = this.f19722a;
            if (i11 == 0) {
                vz.r.b(obj);
                x xVar = x.this;
                int i12 = x.f19718f;
                kotlinx.coroutines.flow.y a11 = kotlinx.coroutines.flow.g.a(xVar.b().f19914h);
                a aVar = new a(x.this);
                this.f19722a = 1;
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

    public x() {
        super(z.class);
    }

    public static final void b(x this$0, View view) {
        Object b11;
        boolean a11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        z b12 = this$0.b();
        b12.getClass();
        b11 = v20.j.b(null, new a0(b12, null), 1, null);
        ButtonWithAccordion$ButtonWithAccordionPane.Rendering rendering = (ButtonWithAccordion$ButtonWithAccordionPane.Rendering) b11;
        a11 = b12.a(rendering == null ? null : rendering.getSecondaryButton(), (h00.l<? super Common$LocalAction, Boolean>) null);
        if (a11) {
            z.b bVar = z.b.f19921a;
            Object value = z.b.f19923c.getValue();
            kotlin.jvm.internal.s.f(value, "<get-secondaryButtonTap>(...)");
            ButtonWithAccordion$ButtonWithAccordionPane.Actions.b bVar2 = (ButtonWithAccordion$ButtonWithAccordionPane.Actions.b) value;
            ButtonWithAccordion$ButtonWithAccordionPane.Rendering.Events events = b12.f19916j;
            b12.a(bVar2, events != null ? events.getOnSecondaryButtonTap() : null);
        }
    }

    @Override // com.plaid.internal.pd
    public z a(vd paneId, y7 component) {
        kotlin.jvm.internal.s.g(paneId, "paneId");
        kotlin.jvm.internal.s.g(component, "component");
        return new z(paneId, component);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.plaid_button_with_accordion_fragment, viewGroup, false);
        int i11 = R.id.header_asset;
        ImageView imageView = (ImageView) b5.b.a(inflate, i11);
        if (imageView != null) {
            i11 = R.id.plaid_button_disclaimer;
            TextView textView = (TextView) b5.b.a(inflate, i11);
            if (textView != null) {
                i11 = R.id.plaid_institution;
                PlaidInstitutionHeaderItem plaidInstitutionHeaderItem = (PlaidInstitutionHeaderItem) b5.b.a(inflate, i11);
                if (plaidInstitutionHeaderItem != null) {
                    i11 = R.id.plaid_items_layout;
                    LinearLayout linearLayout = (LinearLayout) b5.b.a(inflate, i11);
                    if (linearLayout != null) {
                        i11 = R.id.plaid_navigation;
                        PlaidNavigationBar plaidNavigationBar = (PlaidNavigationBar) b5.b.a(inflate, i11);
                        if (plaidNavigationBar != null) {
                            i11 = R.id.plaid_pane_header;
                            TextView textView2 = (TextView) b5.b.a(inflate, i11);
                            if (textView2 != null) {
                                i11 = R.id.primaryButton;
                                PlaidPrimaryButton plaidPrimaryButton = (PlaidPrimaryButton) b5.b.a(inflate, i11);
                                if (plaidPrimaryButton != null) {
                                    i11 = R.id.scrollable_content;
                                    LinearLayout linearLayout2 = (LinearLayout) b5.b.a(inflate, i11);
                                    if (linearLayout2 != null) {
                                        i11 = R.id.secondaryButton;
                                        PlaidSecondaryButton plaidSecondaryButton = (PlaidSecondaryButton) b5.b.a(inflate, i11);
                                        if (plaidSecondaryButton != null) {
                                            l8 l8Var = new l8((LinearLayout) inflate, imageView, textView, plaidInstitutionHeaderItem, linearLayout, plaidNavigationBar, textView2, plaidPrimaryButton, linearLayout2, plaidSecondaryButton);
                                            kotlin.jvm.internal.s.f(l8Var, "inflate(inflater, container, false)");
                                            this.f19719e = l8Var;
                                            return l8Var.f18970a;
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
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ba, code lost:
        if (r10 == null) goto L111;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordion$ButtonWithAccordionPane.Rendering r15) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.x.a(com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordion$ButtonWithAccordionPane$Rendering):void");
    }

    public static final void a(x this$0, View view) {
        Object b11;
        boolean a11;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        z b12 = this$0.b();
        b12.getClass();
        b11 = v20.j.b(null, new a0(b12, null), 1, null);
        ButtonWithAccordion$ButtonWithAccordionPane.Rendering rendering = (ButtonWithAccordion$ButtonWithAccordionPane.Rendering) b11;
        a11 = b12.a(rendering == null ? null : rendering.getButton(), (h00.l<? super Common$LocalAction, Boolean>) null);
        if (a11) {
            z.b bVar = z.b.f19921a;
            Object value = z.b.f19922b.getValue();
            kotlin.jvm.internal.s.f(value, "<get-buttonTap>(...)");
            ButtonWithAccordion$ButtonWithAccordionPane.Actions.b bVar2 = (ButtonWithAccordion$ButtonWithAccordionPane.Actions.b) value;
            ButtonWithAccordion$ButtonWithAccordionPane.Rendering.Events events = b12.f19916j;
            b12.a(bVar2, events != null ? events.getOnButtonTap() : null);
        }
    }
}