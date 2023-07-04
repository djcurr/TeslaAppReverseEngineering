package com.stripe.android.paymentsheet.paymentdatacollection;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.fragment.app.h;
import androidx.lifecycle.g0;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.paymentsheet.PaymentOptionsActivity;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.PaymentSheetActivity;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.ui.core.FieldValuesToParamsMapConverter;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import com.stripe.android.ui.core.forms.resources.LpmRepository;
import j1.c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import vz.k;
import vz.m;

/* loaded from: classes6.dex */
public final class ComposeFormDataCollectionFragment extends Fragment {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_CONFIG = "com.stripe.android.paymentsheet.extra_config";
    private final k formViewModel$delegate;
    private final k paymentMethodCode$delegate;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ComposeFormDataCollectionFragment() {
        k a11;
        a11 = m.a(new ComposeFormDataCollectionFragment$paymentMethodCode$2(this));
        this.paymentMethodCode$delegate = a11;
        this.formViewModel$delegate = e0.a(this, m0.b(FormViewModel.class), new ComposeFormDataCollectionFragment$special$$inlined$viewModels$default$2(new ComposeFormDataCollectionFragment$special$$inlined$viewModels$default$1(this)), new ComposeFormDataCollectionFragment$formViewModel$2(this));
    }

    public static /* synthetic */ void a(ComposeFormDataCollectionFragment composeFormDataCollectionFragment, Boolean bool) {
        m328onViewCreated$lambda2(composeFormDataCollectionFragment, bool);
    }

    public final String getPaymentMethodCode() {
        return (String) this.paymentMethodCode$delegate.getValue();
    }

    /* renamed from: onViewCreated$lambda-1 */
    public static final BaseSheetViewModel<? extends Object> m327onViewCreated$lambda1(k<? extends BaseSheetViewModel<? extends Object>> kVar) {
        return kVar.getValue();
    }

    /* renamed from: onViewCreated$lambda-2 */
    public static final void m328onViewCreated$lambda2(ComposeFormDataCollectionFragment this$0, Boolean bool) {
        s.g(this$0, "this$0");
        this$0.getFormViewModel().setEnabled$paymentsheet_release(!bool.booleanValue());
    }

    public final FormViewModel getFormViewModel() {
        return (FormViewModel) this.formViewModel$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        s.g(inflater, "inflater");
        Context context = inflater.getContext();
        s.f(context, "inflater.context");
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setPadding(0, 18, 0, 0);
        composeView.setContent(c.c(-985531830, true, new ComposeFormDataCollectionFragment$onCreateView$1$1(this)));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        k a11;
        s.g(view, "view");
        super.onViewCreated(view, bundle);
        h activity = getActivity();
        if (activity instanceof PaymentOptionsActivity) {
            a11 = e0.a(this, m0.b(PaymentOptionsViewModel.class), new ComposeFormDataCollectionFragment$onViewCreated$$inlined$activityViewModels$default$1(this), new ComposeFormDataCollectionFragment$onViewCreated$$inlined$activityViewModels$default$2(this));
        } else if (!(activity instanceof PaymentSheetActivity)) {
            return;
        } else {
            a11 = e0.a(this, m0.b(PaymentSheetViewModel.class), new ComposeFormDataCollectionFragment$onViewCreated$$inlined$activityViewModels$default$3(this), new ComposeFormDataCollectionFragment$onViewCreated$$inlined$activityViewModels$default$4(this));
        }
        v viewLifecycleOwner = getViewLifecycleOwner();
        s.f(viewLifecycleOwner, "viewLifecycleOwner");
        v20.k.d(w.a(viewLifecycleOwner), null, null, new ComposeFormDataCollectionFragment$onViewCreated$1(this, a11, null), 3, null);
        m327onViewCreated$lambda1(a11).getProcessing().observe(getViewLifecycleOwner(), new g0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.a
            {
                ComposeFormDataCollectionFragment.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                ComposeFormDataCollectionFragment.a(ComposeFormDataCollectionFragment.this, (Boolean) obj);
            }
        });
    }

    public final PaymentSelection.New transformToPaymentSelection$paymentsheet_release(FormFieldValues formFieldValues, LpmRepository.SupportedPaymentMethod selectedPaymentMethodResources) {
        s.g(selectedPaymentMethodResources, "selectedPaymentMethodResources");
        if (formFieldValues == null) {
            return null;
        }
        FieldValuesToParamsMapConverter.Companion companion = FieldValuesToParamsMapConverter.Companion;
        Map<IdentifierSpec, FormFieldEntry> fieldValuePairs = formFieldValues.getFieldValuePairs();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<IdentifierSpec, FormFieldEntry> entry : fieldValuePairs.entrySet()) {
            IdentifierSpec key = entry.getKey();
            IdentifierSpec.Companion companion2 = IdentifierSpec.Companion;
            if (!(s.c(key, companion2.getSaveForFutureUse()) || s.c(entry.getKey(), companion2.getCardBrand()))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        PaymentMethodCreateParams transformToPaymentMethodCreateParams = companion.transformToPaymentMethodCreateParams(linkedHashMap, selectedPaymentMethodResources.getType());
        if (selectedPaymentMethodResources.getType() == PaymentMethod.Type.Card) {
            CardBrand.Companion companion3 = CardBrand.Companion;
            FormFieldEntry formFieldEntry = formFieldValues.getFieldValuePairs().get(IdentifierSpec.Companion.getCardBrand());
            return new PaymentSelection.New.Card(transformToPaymentMethodCreateParams, companion3.fromCode(formFieldEntry != null ? formFieldEntry.getValue() : null), formFieldValues.getUserRequestedReuse());
        }
        String string = getString(selectedPaymentMethodResources.getDisplayNameResource());
        s.f(string, "getString(selectedPaymen…rces.displayNameResource)");
        return new PaymentSelection.New.GenericPaymentMethod(string, selectedPaymentMethodResources.getIconResource(), transformToPaymentMethodCreateParams, formFieldValues.getUserRequestedReuse());
    }
}