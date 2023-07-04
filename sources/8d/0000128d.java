package com.adyen.checkout.bacs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.lifecycle.g0;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import t6.b;
import t6.c;
import t6.p;
import t6.r;
import t6.v;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\b\u0012\u0004\u0012\u00020\u00020\u0006B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/bacs/BacsDirectDebitConfirmationView;", "Lcom/adyen/checkout/components/ui/view/a;", "Lt6/p;", "Lt6/c;", "Lt6/b;", "Lt6/a;", "Landroidx/lifecycle/g0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bacs_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class BacsDirectDebitConfirmationView extends com.adyen.checkout.components.ui.view.a<p, c, b, t6.a> implements g0<p> {

    /* renamed from: c  reason: collision with root package name */
    private final u6.a f9536c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BacsDirectDebitConfirmationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ BacsDirectDebitConfirmationView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // c7.e
    public void a() {
    }

    @Override // c7.e
    public void b() {
        p i11 = getComponent().i();
        if (i11 != null) {
            this.f9536c.f53329c.setText(i11.b().b());
            this.f9536c.f53328b.setText(i11.a().b());
            this.f9536c.f53331e.setText(i11.d().b());
            this.f9536c.f53330d.setText(i11.c().b());
        }
        getComponent().A();
    }

    @Override // com.adyen.checkout.components.ui.view.a
    protected void e(Context localizedContext) {
        s.g(localizedContext, "localizedContext");
        TextInputLayout textInputLayout = this.f9536c.f53333g;
        s.f(textInputLayout, "binding.textInputLayoutHolderName");
        h7.a.a(textInputLayout, v.AdyenCheckout_Bacs_HolderNameInput, localizedContext);
        TextInputLayout textInputLayout2 = this.f9536c.f53332f;
        s.f(textInputLayout2, "binding.textInputLayoutBankAccountNumber");
        h7.a.a(textInputLayout2, v.AdyenCheckout_Bacs_AccountNumberInput, localizedContext);
        TextInputLayout textInputLayout3 = this.f9536c.f53335i;
        s.f(textInputLayout3, "binding.textInputLayoutSortCode");
        h7.a.a(textInputLayout3, v.AdyenCheckout_Bacs_SortCodeInput, localizedContext);
        TextInputLayout textInputLayout4 = this.f9536c.f53334h;
        s.f(textInputLayout4, "binding.textInputLayoutShopperEmail");
        h7.a.a(textInputLayout4, v.AdyenCheckout_Bacs_ShopperEmailInput, localizedContext);
    }

    @Override // com.adyen.checkout.components.ui.view.a
    protected void f(androidx.lifecycle.v lifecycleOwner) {
        s.g(lifecycleOwner, "lifecycleOwner");
        getComponent().r(lifecycleOwner, this);
    }

    @Override // androidx.lifecycle.g0
    /* renamed from: g */
    public void onChanged(p pVar) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BacsDirectDebitConfirmationView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        u6.a b11 = u6.a.b(LayoutInflater.from(context), this);
        s.f(b11, "inflate(LayoutInflater.from(context), this)");
        this.f9536c = b11;
        setOrientation(1);
        int dimension = (int) getResources().getDimension(r.f51699a);
        setPadding(dimension, dimension, dimension, 0);
    }
}