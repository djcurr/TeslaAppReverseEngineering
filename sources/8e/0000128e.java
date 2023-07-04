package com.adyen.checkout.bacs;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.lifecycle.g0;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.bacs.BacsDirectDebitInputView;
import com.adyen.checkout.components.ui.view.AdyenTextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import j7.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import t6.b;
import t6.c;
import t6.d;
import t6.o;
import t6.p;
import t6.r;
import t6.u;
import t6.v;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\b\u0012\u0004\u0012\u00020\u00020\u0006B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/bacs/BacsDirectDebitInputView;", "Lcom/adyen/checkout/components/ui/view/a;", "Lt6/p;", "Lt6/c;", "Lt6/b;", "Lt6/a;", "Landroidx/lifecycle/g0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bacs_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class BacsDirectDebitInputView extends com.adyen.checkout.components.ui.view.a<p, c, b, t6.a> implements g0<p> {

    /* renamed from: c */
    private final u6.b f9537c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BacsDirectDebitInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ BacsDirectDebitInputView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void A() {
        AdyenTextInputEditText adyenTextInputEditText = this.f9537c.f53339d;
        if (!(adyenTextInputEditText instanceof AdyenTextInputEditText)) {
            adyenTextInputEditText = null;
        }
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnChangeListener(new AdyenTextInputEditText.b() { // from class: t6.l
                {
                    BacsDirectDebitInputView.this = this;
                }

                @Override // com.adyen.checkout.components.ui.view.AdyenTextInputEditText.b
                public final void a(Editable editable) {
                    BacsDirectDebitInputView.l(BacsDirectDebitInputView.this, editable);
                }
            });
        }
        if (adyenTextInputEditText == null) {
            return;
        }
        adyenTextInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: t6.h
            {
                BacsDirectDebitInputView.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                BacsDirectDebitInputView.p(BacsDirectDebitInputView.this, view, z11);
            }
        });
    }

    public static final void B(BacsDirectDebitInputView this$0, Editable it2) {
        s.g(this$0, "this$0");
        s.g(it2, "it");
        this$0.getComponent().x().m(it2.toString());
        this$0.G();
        this$0.f9537c.f53345j.setError(null);
    }

    public static final void C(BacsDirectDebitInputView this$0, View view, boolean z11) {
        j7.a<String> c11;
        s.g(this$0, "this$0");
        p i11 = this$0.getComponent().i();
        f a11 = (i11 == null || (c11 = i11.c()) == null) ? null : c11.a();
        if (z11) {
            this$0.f9537c.f53345j.setError(null);
        } else if (a11 == null || !(a11 instanceof f.a)) {
        } else {
            this$0.f9537c.f53345j.setError(this$0.f9572b.getString(((f.a) a11).b()));
        }
    }

    private final void D() {
        AdyenTextInputEditText adyenTextInputEditText = this.f9537c.f53340e;
        if (!(adyenTextInputEditText instanceof AdyenTextInputEditText)) {
            adyenTextInputEditText = null;
        }
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnChangeListener(new AdyenTextInputEditText.b() { // from class: t6.m
                {
                    BacsDirectDebitInputView.this = this;
                }

                @Override // com.adyen.checkout.components.ui.view.AdyenTextInputEditText.b
                public final void a(Editable editable) {
                    BacsDirectDebitInputView.n(BacsDirectDebitInputView.this, editable);
                }
            });
        }
        if (adyenTextInputEditText == null) {
            return;
        }
        adyenTextInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: t6.e
            {
                BacsDirectDebitInputView.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                BacsDirectDebitInputView.g(BacsDirectDebitInputView.this, view, z11);
            }
        });
    }

    public static final void E(BacsDirectDebitInputView this$0, Editable it2) {
        s.g(this$0, "this$0");
        s.g(it2, "it");
        this$0.getComponent().x().n(it2.toString());
        this$0.G();
        this$0.f9537c.f53346k.setError(null);
    }

    public static final void F(BacsDirectDebitInputView this$0, View view, boolean z11) {
        j7.a<String> d11;
        s.g(this$0, "this$0");
        p i11 = this$0.getComponent().i();
        f a11 = (i11 == null || (d11 = i11.d()) == null) ? null : d11.a();
        if (z11) {
            this$0.f9537c.f53346k.setError(null);
        } else if (a11 == null || !(a11 instanceof f.a)) {
        } else {
            this$0.f9537c.f53346k.setError(this$0.f9572b.getString(((f.a) a11).b()));
        }
    }

    private final void G() {
        getComponent().j(getComponent().x());
    }

    private final void H(j7.a<String> aVar) {
        if (aVar.a().a()) {
            q(this.f9537c.f53337b);
        }
    }

    private final void J(j7.a<String> aVar) {
        if (aVar.a().a()) {
            q(this.f9537c.f53340e);
        }
    }

    private final void K() {
        if (!((c) getComponent().f()).d().isEmpty()) {
            String b11 = m7.b.b(((c) getComponent().f()).d(), ((c) getComponent().f()).c());
            s.f(b11, "formatAmount(component.configuration.amount, component.configuration.shopperLocale)");
            this.f9537c.f53342g.setText(getLocalizedContext().getString(u.bacs_consent_amount_specified, b11));
            return;
        }
        SwitchCompat switchCompat = this.f9537c.f53342g;
        s.f(switchCompat, "binding.switchConsentAmount");
        int i11 = v.AdyenCheckout_Bacs_Switch_Amount;
        Context localizedContext = getLocalizedContext();
        s.f(localizedContext, "localizedContext");
        h7.a.b(switchCompat, i11, localizedContext);
    }

    private final void L(p pVar) {
        d x11 = getComponent().x();
        x11.k(pVar.b().b());
        x11.j(pVar.a().b());
        x11.n(pVar.d().b());
        x11.m(pVar.c().b());
        x11.h(pVar.e());
        x11.i(pVar.f());
    }

    public static /* synthetic */ void g(BacsDirectDebitInputView bacsDirectDebitInputView, View view, boolean z11) {
        F(bacsDirectDebitInputView, view, z11);
    }

    public static /* synthetic */ void h(BacsDirectDebitInputView bacsDirectDebitInputView, View view, boolean z11) {
        z(bacsDirectDebitInputView, view, z11);
    }

    public static /* synthetic */ void i(BacsDirectDebitInputView bacsDirectDebitInputView, CompoundButton compoundButton, boolean z11) {
        v(bacsDirectDebitInputView, compoundButton, z11);
    }

    public static /* synthetic */ void j(BacsDirectDebitInputView bacsDirectDebitInputView, CompoundButton compoundButton, boolean z11) {
        w(bacsDirectDebitInputView, compoundButton, z11);
    }

    public static /* synthetic */ void k(BacsDirectDebitInputView bacsDirectDebitInputView, Editable editable) {
        y(bacsDirectDebitInputView, editable);
    }

    public static /* synthetic */ void l(BacsDirectDebitInputView bacsDirectDebitInputView, Editable editable) {
        B(bacsDirectDebitInputView, editable);
    }

    public static /* synthetic */ void m(BacsDirectDebitInputView bacsDirectDebitInputView, View view, boolean z11) {
        t(bacsDirectDebitInputView, view, z11);
    }

    public static /* synthetic */ void n(BacsDirectDebitInputView bacsDirectDebitInputView, Editable editable) {
        E(bacsDirectDebitInputView, editable);
    }

    public static /* synthetic */ void o(BacsDirectDebitInputView bacsDirectDebitInputView, Editable editable) {
        s(bacsDirectDebitInputView, editable);
    }

    public static /* synthetic */ void p(BacsDirectDebitInputView bacsDirectDebitInputView, View view, boolean z11) {
        C(bacsDirectDebitInputView, view, z11);
    }

    private final void q(View view) {
        if (getRootView().findFocus() != view || view == null) {
            return;
        }
        findViewById(view.getNextFocusForwardId()).requestFocus();
    }

    private final void r() {
        AdyenTextInputEditText adyenTextInputEditText = this.f9537c.f53337b;
        if (!(adyenTextInputEditText instanceof AdyenTextInputEditText)) {
            adyenTextInputEditText = null;
        }
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnChangeListener(new AdyenTextInputEditText.b() { // from class: t6.n
                {
                    BacsDirectDebitInputView.this = this;
                }

                @Override // com.adyen.checkout.components.ui.view.AdyenTextInputEditText.b
                public final void a(Editable editable) {
                    BacsDirectDebitInputView.o(BacsDirectDebitInputView.this, editable);
                }
            });
        }
        if (adyenTextInputEditText == null) {
            return;
        }
        adyenTextInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: t6.g
            {
                BacsDirectDebitInputView.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                BacsDirectDebitInputView.m(BacsDirectDebitInputView.this, view, z11);
            }
        });
    }

    public static final void s(BacsDirectDebitInputView this$0, Editable it2) {
        s.g(this$0, "this$0");
        s.g(it2, "it");
        this$0.getComponent().x().j(it2.toString());
        this$0.G();
        this$0.f9537c.f53343h.setError(null);
    }

    public static final void t(BacsDirectDebitInputView this$0, View view, boolean z11) {
        j7.a<String> a11;
        s.g(this$0, "this$0");
        p i11 = this$0.getComponent().i();
        f a12 = (i11 == null || (a11 = i11.a()) == null) ? null : a11.a();
        if (z11) {
            this$0.f9537c.f53343h.setError(null);
        } else if (a12 == null || !(a12 instanceof f.a)) {
        } else {
            this$0.f9537c.f53343h.setError(this$0.f9572b.getString(((f.a) a12).b()));
        }
    }

    private final void u() {
        this.f9537c.f53342g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: t6.i
            {
                BacsDirectDebitInputView.this = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                BacsDirectDebitInputView.i(BacsDirectDebitInputView.this, compoundButton, z11);
            }
        });
        this.f9537c.f53341f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: t6.j
            {
                BacsDirectDebitInputView.this = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                BacsDirectDebitInputView.j(BacsDirectDebitInputView.this, compoundButton, z11);
            }
        });
    }

    public static final void v(BacsDirectDebitInputView this$0, CompoundButton compoundButton, boolean z11) {
        s.g(this$0, "this$0");
        this$0.getComponent().x().i(z11);
        TextView textView = this$0.f9537c.f53348m;
        s.f(textView, "binding.textViewErrorConsentAmount");
        textView.setVisibility(z11 ^ true ? 0 : 8);
        this$0.G();
    }

    public static final void w(BacsDirectDebitInputView this$0, CompoundButton compoundButton, boolean z11) {
        s.g(this$0, "this$0");
        this$0.getComponent().x().h(z11);
        TextView textView = this$0.f9537c.f53347l;
        s.f(textView, "binding.textViewErrorConsentAccount");
        textView.setVisibility(z11 ^ true ? 0 : 8);
        this$0.G();
    }

    private final void x() {
        AdyenTextInputEditText adyenTextInputEditText = this.f9537c.f53338c;
        if (!(adyenTextInputEditText instanceof AdyenTextInputEditText)) {
            adyenTextInputEditText = null;
        }
        if (adyenTextInputEditText != null) {
            adyenTextInputEditText.setOnChangeListener(new AdyenTextInputEditText.b() { // from class: t6.k
                {
                    BacsDirectDebitInputView.this = this;
                }

                @Override // com.adyen.checkout.components.ui.view.AdyenTextInputEditText.b
                public final void a(Editable editable) {
                    BacsDirectDebitInputView.k(BacsDirectDebitInputView.this, editable);
                }
            });
        }
        if (adyenTextInputEditText == null) {
            return;
        }
        adyenTextInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: t6.f
            {
                BacsDirectDebitInputView.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                BacsDirectDebitInputView.h(BacsDirectDebitInputView.this, view, z11);
            }
        });
    }

    public static final void y(BacsDirectDebitInputView this$0, Editable it2) {
        s.g(this$0, "this$0");
        s.g(it2, "it");
        this$0.getComponent().x().k(it2.toString());
        this$0.G();
        this$0.f9537c.f53344i.setError(null);
    }

    public static final void z(BacsDirectDebitInputView this$0, View view, boolean z11) {
        j7.a<String> b11;
        s.g(this$0, "this$0");
        p i11 = this$0.getComponent().i();
        f a11 = (i11 == null || (b11 = i11.b()) == null) ? null : b11.a();
        if (z11) {
            this$0.f9537c.f53344i.setError(null);
        } else if (a11 == null || !(a11 instanceof f.a)) {
        } else {
            this$0.f9537c.f53344i.setError(this$0.f9572b.getString(((f.a) a11).b()));
        }
    }

    @Override // androidx.lifecycle.g0
    /* renamed from: I */
    public void onChanged(p bacsDirectDebitOutputData) {
        String str;
        s.g(bacsDirectDebitOutputData, "bacsDirectDebitOutputData");
        str = o.f51691a;
        o7.b.f(str, "bacsDirectDebitOutputData changed");
        H(bacsDirectDebitOutputData.a());
        J(bacsDirectDebitOutputData.d());
    }

    @Override // c7.e
    public void a() {
        x();
        r();
        D();
        A();
        u();
    }

    @Override // c7.e
    public void b() {
        p i11 = getComponent().i();
        if (i11 != null) {
            L(i11);
            this.f9537c.f53338c.setText(i11.b().b());
            this.f9537c.f53337b.setText(i11.a().b());
            this.f9537c.f53340e.setText(i11.d().b());
            this.f9537c.f53339d.setText(i11.c().b());
            this.f9537c.f53342g.setChecked(i11.f());
            this.f9537c.f53341f.setChecked(i11.e());
        }
        getComponent().B();
        if (((c) getComponent().f()).d().isEmpty()) {
            return;
        }
        String b11 = m7.b.b(((c) getComponent().f()).d(), ((c) getComponent().f()).c());
        s.f(b11, "formatAmount(component.configuration.amount, component.configuration.shopperLocale)");
        this.f9537c.f53342g.setText(getResources().getString(u.bacs_consent_amount_specified, b11));
    }

    @Override // com.adyen.checkout.components.ui.view.a
    protected void e(Context localizedContext) {
        s.g(localizedContext, "localizedContext");
        TextInputLayout textInputLayout = this.f9537c.f53344i;
        s.f(textInputLayout, "binding.textInputLayoutHolderName");
        h7.a.a(textInputLayout, v.AdyenCheckout_Bacs_HolderNameInput, localizedContext);
        TextInputLayout textInputLayout2 = this.f9537c.f53343h;
        s.f(textInputLayout2, "binding.textInputLayoutBankAccountNumber");
        h7.a.a(textInputLayout2, v.AdyenCheckout_Bacs_AccountNumberInput, localizedContext);
        TextInputLayout textInputLayout3 = this.f9537c.f53346k;
        s.f(textInputLayout3, "binding.textInputLayoutSortCode");
        h7.a.a(textInputLayout3, v.AdyenCheckout_Bacs_SortCodeInput, localizedContext);
        TextInputLayout textInputLayout4 = this.f9537c.f53345j;
        s.f(textInputLayout4, "binding.textInputLayoutShopperEmail");
        h7.a.a(textInputLayout4, v.AdyenCheckout_Bacs_ShopperEmailInput, localizedContext);
        SwitchCompat switchCompat = this.f9537c.f53341f;
        s.f(switchCompat, "binding.switchConsentAccount");
        h7.a.b(switchCompat, v.AdyenCheckout_Bacs_Switch_Account, localizedContext);
        K();
    }

    @Override // com.adyen.checkout.components.ui.view.a
    protected void f(androidx.lifecycle.v lifecycleOwner) {
        s.g(lifecycleOwner, "lifecycleOwner");
        getComponent().r(lifecycleOwner, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BacsDirectDebitInputView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        u6.b b11 = u6.b.b(LayoutInflater.from(context), this);
        s.f(b11, "inflate(LayoutInflater.from(context), this)");
        this.f9537c = b11;
        setOrientation(1);
        int dimension = (int) getResources().getDimension(r.f51699a);
        setPadding(dimension, dimension, dimension, 0);
    }
}