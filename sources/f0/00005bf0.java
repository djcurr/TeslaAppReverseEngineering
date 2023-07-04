package com.stripe.android.view;

import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.R;
import com.stripe.android.databinding.BankListPaymentMethodBinding;
import com.stripe.android.model.BankStatuses;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class AddPaymentMethodFpxView extends AddPaymentMethodView {
    public static final Companion Companion = new Companion(null);
    private final AddPaymentMethodListAdapter fpxAdapter;
    private BankStatuses fpxBankStatuses;
    private final vz.k viewModel$delegate;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AddPaymentMethodFpxView create$payments_core_release(androidx.fragment.app.h activity) {
            kotlin.jvm.internal.s.g(activity, "activity");
            return new AddPaymentMethodFpxView(activity, null, 0, 6, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodFpxView(androidx.fragment.app.h activity) {
        this(activity, null, 0, 6, null);
        kotlin.jvm.internal.s.g(activity, "activity");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodFpxView(androidx.fragment.app.h activity, AttributeSet attributeSet) {
        this(activity, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(activity, "activity");
    }

    public /* synthetic */ AddPaymentMethodFpxView(androidx.fragment.app.h hVar, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public static /* synthetic */ void a(AddPaymentMethodFpxView addPaymentMethodFpxView, BankStatuses bankStatuses) {
        addPaymentMethodFpxView.onFpxBankStatusesUpdated(bankStatuses);
    }

    private final FpxBank getItem(int i11) {
        return FpxBank.values()[i11];
    }

    public final FpxViewModel getViewModel() {
        return (FpxViewModel) this.viewModel$delegate.getValue();
    }

    public final void onFpxBankStatusesUpdated(BankStatuses bankStatuses) {
        if (bankStatuses == null) {
            return;
        }
        updateStatuses(bankStatuses);
    }

    private final void updateStatuses(BankStatuses bankStatuses) {
        m00.i I;
        this.fpxBankStatuses = bankStatuses;
        this.fpxAdapter.setBankStatuses$payments_core_release(bankStatuses);
        I = wz.p.I(FpxBank.values());
        ArrayList<Number> arrayList = new ArrayList();
        for (Integer num : I) {
            if (!bankStatuses.isOnline$payments_core_release(getItem(num.intValue()))) {
                arrayList.add(num);
            }
        }
        for (Number number : arrayList) {
            this.fpxAdapter.notifyAdapterItemChanged(number.intValue());
        }
    }

    @Override // com.stripe.android.view.AddPaymentMethodView
    public PaymentMethodCreateParams getCreateParams() {
        Integer valueOf = Integer.valueOf(this.fpxAdapter.getSelectedPosition());
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, new PaymentMethodCreateParams.Fpx(FpxBank.values()[valueOf.intValue()].getCode()), (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodFpxView(androidx.fragment.app.h activity, AttributeSet attributeSet, int i11) {
        super(activity, attributeSet, i11);
        List s02;
        vz.k a11;
        kotlin.jvm.internal.s.g(activity, "activity");
        this.fpxBankStatuses = new BankStatuses(null, 1, null);
        ThemeConfig themeConfig = new ThemeConfig(activity);
        s02 = wz.p.s0(FpxBank.values());
        AddPaymentMethodListAdapter addPaymentMethodListAdapter = new AddPaymentMethodListAdapter(themeConfig, s02, new AddPaymentMethodFpxView$fpxAdapter$1(this));
        this.fpxAdapter = addPaymentMethodListAdapter;
        a11 = vz.m.a(new AddPaymentMethodFpxView$viewModel$2(activity));
        this.viewModel$delegate = a11;
        BankListPaymentMethodBinding inflate = BankListPaymentMethodBinding.inflate(activity.getLayoutInflater(), this, true);
        kotlin.jvm.internal.s.f(inflate, "inflate(\n            act…           true\n        )");
        setId(R.id.stripe_payment_methods_add_fpx);
        getViewModel().getFpxBankStatues$payments_core_release().observe(activity, new androidx.lifecycle.g0() { // from class: com.stripe.android.view.c
            {
                AddPaymentMethodFpxView.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                AddPaymentMethodFpxView.a(AddPaymentMethodFpxView.this, (BankStatuses) obj);
            }
        });
        RecyclerView recyclerView = inflate.bankList;
        recyclerView.setAdapter(addPaymentMethodListAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new androidx.recyclerview.widget.g());
        Integer selectedPosition$payments_core_release = getViewModel().getSelectedPosition$payments_core_release();
        if (selectedPosition$payments_core_release == null) {
            return;
        }
        addPaymentMethodListAdapter.updateSelected$payments_core_release(selectedPosition$payments_core_release.intValue());
    }
}