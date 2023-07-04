package com.stripe.android.view;

import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.R;
import com.stripe.android.databinding.BankListPaymentMethodBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class AddPaymentMethodNetbankingView extends AddPaymentMethodView {
    public static final Companion Companion = new Companion(null);
    private final AddPaymentMethodListAdapter netbankingAdapter;
    private Integer selectedPosition;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AddPaymentMethodNetbankingView create$payments_core_release(androidx.fragment.app.h activity) {
            kotlin.jvm.internal.s.g(activity, "activity");
            return new AddPaymentMethodNetbankingView(activity, null, 0, 6, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodNetbankingView(androidx.fragment.app.h activity) {
        this(activity, null, 0, 6, null);
        kotlin.jvm.internal.s.g(activity, "activity");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodNetbankingView(androidx.fragment.app.h activity, AttributeSet attributeSet) {
        this(activity, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(activity, "activity");
    }

    public /* synthetic */ AddPaymentMethodNetbankingView(androidx.fragment.app.h hVar, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // com.stripe.android.view.AddPaymentMethodView
    public PaymentMethodCreateParams getCreateParams() {
        Integer valueOf = Integer.valueOf(this.netbankingAdapter.getSelectedPosition());
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        valueOf.intValue();
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, new PaymentMethodCreateParams.Netbanking(NetbankingBank.values()[this.netbankingAdapter.getSelectedPosition()].getCode()), (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodNetbankingView(androidx.fragment.app.h activity, AttributeSet attributeSet, int i11) {
        super(activity, attributeSet, i11);
        List s02;
        kotlin.jvm.internal.s.g(activity, "activity");
        ThemeConfig themeConfig = new ThemeConfig(activity);
        s02 = wz.p.s0(NetbankingBank.values());
        AddPaymentMethodListAdapter addPaymentMethodListAdapter = new AddPaymentMethodListAdapter(themeConfig, s02, new AddPaymentMethodNetbankingView$netbankingAdapter$1(this));
        this.netbankingAdapter = addPaymentMethodListAdapter;
        BankListPaymentMethodBinding inflate = BankListPaymentMethodBinding.inflate(activity.getLayoutInflater(), this, true);
        kotlin.jvm.internal.s.f(inflate, "inflate(\n            act…           true\n        )");
        setId(R.id.stripe_payment_methods_add_netbanking);
        RecyclerView recyclerView = inflate.bankList;
        recyclerView.setAdapter(addPaymentMethodListAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new androidx.recyclerview.widget.g());
        Integer num = this.selectedPosition;
        if (num == null) {
            return;
        }
        addPaymentMethodListAdapter.updateSelected$payments_core_release(num.intValue());
    }
}