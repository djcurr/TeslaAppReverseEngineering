package com.stripe.android.paymentsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.v1;
import androidx.core.view.l0;
import androidx.core.view.m0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.g0;
import androidx.lifecycle.s0;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.ui.inline.LinkInlineSignupView;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.databinding.FragmentPaymentsheetAddPaymentMethodBinding;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SupportedPaymentMethodKtxKt;
import com.stripe.android.paymentsheet.paymentdatacollection.ComposeFormDataCollectionFragment;
import com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment;
import com.stripe.android.paymentsheet.ui.AnimationConstants;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.ui.core.Amount;
import com.stripe.android.ui.core.elements.LayoutFormDescriptor;
import com.stripe.android.ui.core.forms.resources.LpmRepository;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public abstract class BaseAddPaymentMethodFragment extends Fragment {
    public static final Companion Companion = new Companion(null);
    private boolean showLinkInlineSignup;
    private FragmentPaymentsheetAddPaymentMethodBinding viewBinding;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FormFragmentArguments getFormArguments(LpmRepository.SupportedPaymentMethod showPaymentMethod, StripeIntent stripeIntent, PaymentSheet.Configuration configuration, String merchantName, Amount amount, @InjectorKey String injectorKey, PaymentSelection.New r19, boolean z11) {
            Boolean valueOf;
            boolean booleanValue;
            PaymentMethodCreateParams paymentMethodCreateParams;
            String typeCode;
            kotlin.jvm.internal.s.g(showPaymentMethod, "showPaymentMethod");
            kotlin.jvm.internal.s.g(stripeIntent, "stripeIntent");
            kotlin.jvm.internal.s.g(merchantName, "merchantName");
            kotlin.jvm.internal.s.g(injectorKey, "injectorKey");
            LayoutFormDescriptor pMAddForm = SupportedPaymentMethodKtxKt.getPMAddForm(showPaymentMethod, stripeIntent, configuration);
            String str = showPaymentMethod.getType().code;
            boolean z12 = pMAddForm.getShowCheckbox() && !z11;
            PaymentMethodCreateParams paymentMethodCreateParams2 = null;
            if (r19 == null) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(r19.getCustomerRequestedSave() == PaymentSelection.CustomerRequestedSave.RequestReuse);
            }
            if (valueOf == null) {
                booleanValue = pMAddForm.getShowCheckboxControlledFields();
            } else {
                booleanValue = valueOf.booleanValue();
            }
            boolean z13 = booleanValue;
            PaymentSheet.BillingDetails defaultBillingDetails = configuration == null ? null : configuration.getDefaultBillingDetails();
            if (r19 != null && (paymentMethodCreateParams = r19.getPaymentMethodCreateParams()) != null && (typeCode = paymentMethodCreateParams.getTypeCode()) != null) {
                if (!kotlin.jvm.internal.s.c(typeCode, showPaymentMethod.getType().code)) {
                    typeCode = null;
                }
                if (typeCode != null) {
                    if (r19 instanceof PaymentSelection.New.GenericPaymentMethod) {
                        paymentMethodCreateParams2 = ((PaymentSelection.New.GenericPaymentMethod) r19).getPaymentMethodCreateParams();
                    } else if (r19 instanceof PaymentSelection.New.Card) {
                        paymentMethodCreateParams2 = ((PaymentSelection.New.Card) r19).getPaymentMethodCreateParams();
                    }
                }
            }
            return new FormFragmentArguments(str, z12, z13, merchantName, amount, defaultBillingDetails, injectorKey, paymentMethodCreateParams2);
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            iArr[PaymentMethod.Type.USBankAccount.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void a(BaseAddPaymentMethodFragment baseAddPaymentMethodFragment, Boolean bool) {
        m288onViewCreated$lambda1(baseAddPaymentMethodFragment, bool);
    }

    private final Class<? extends Fragment> fragmentForPaymentMethod(LpmRepository.SupportedPaymentMethod supportedPaymentMethod) {
        return WhenMappings.$EnumSwitchMapping$0[supportedPaymentMethod.getType().ordinal()] == 1 ? USBankAccountFormFragment.class : ComposeFormDataCollectionFragment.class;
    }

    /* renamed from: onViewCreated$lambda-1 */
    public static final void m288onViewCreated$lambda1(BaseAddPaymentMethodFragment this$0, Boolean bool) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        FragmentPaymentsheetAddPaymentMethodBinding fragmentPaymentsheetAddPaymentMethodBinding = this$0.viewBinding;
        if (fragmentPaymentsheetAddPaymentMethodBinding == null) {
            kotlin.jvm.internal.s.x("viewBinding");
            fragmentPaymentsheetAddPaymentMethodBinding = null;
        }
        fragmentPaymentsheetAddPaymentMethodBinding.linkInlineSignup.setEnabled(!bool.booleanValue());
    }

    private final void replacePaymentMethodFragment(LpmRepository.SupportedPaymentMethod supportedPaymentMethod) {
        getSheetViewModel().setAddFragmentSelectedLPM$paymentsheet_release(supportedPaymentMethod);
        Bundle requireArguments = requireArguments();
        kotlin.jvm.internal.s.f(requireArguments, "requireArguments()");
        Companion companion = Companion;
        StripeIntent value = getSheetViewModel().getStripeIntent$paymentsheet_release().getValue();
        if (value != null) {
            StripeIntent stripeIntent = value;
            PaymentSheet.Configuration config$paymentsheet_release = getSheetViewModel().getConfig$paymentsheet_release();
            String merchantName$paymentsheet_release = getSheetViewModel().getMerchantName$paymentsheet_release();
            Amount value2 = getSheetViewModel().getAmount$paymentsheet_release().getValue();
            String injectorKey = getSheetViewModel().getInjectorKey();
            PaymentSelection.New newLpm = getSheetViewModel().getNewLpm();
            boolean z11 = this.showLinkInlineSignup;
            kotlin.jvm.internal.s.f(stripeIntent, "requireNotNull(sheetViewModel.stripeIntent.value)");
            requireArguments.putParcelable(ComposeFormDataCollectionFragment.EXTRA_CONFIG, companion.getFormArguments(supportedPaymentMethod, stripeIntent, config$paymentsheet_release, merchantName$paymentsheet_release, value2, injectorKey, newLpm, z11));
            androidx.fragment.app.q childFragmentManager = getChildFragmentManager();
            kotlin.jvm.internal.s.f(childFragmentManager, "childFragmentManager");
            androidx.fragment.app.z m11 = childFragmentManager.m();
            kotlin.jvm.internal.s.f(m11, "beginTransaction()");
            AnimationConstants animationConstants = AnimationConstants.INSTANCE;
            m11.v(animationConstants.getFADE_IN(), animationConstants.getFADE_OUT(), animationConstants.getFADE_IN(), animationConstants.getFADE_OUT());
            m11.r(R.id.payment_method_fragment_container, fragmentForPaymentMethod(supportedPaymentMethod), requireArguments);
            m11.h();
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final void setupRecyclerView(FragmentPaymentsheetAddPaymentMethodBinding fragmentPaymentsheetAddPaymentMethodBinding, List<? extends LpmRepository.SupportedPaymentMethod> list, LpmRepository.SupportedPaymentMethod supportedPaymentMethod) {
        ComposeView composeView = fragmentPaymentsheetAddPaymentMethodBinding.paymentMethodsRecycler;
        kotlin.jvm.internal.s.f(composeView, "viewBinding.paymentMethodsRecycler");
        composeView.setVisibility(0);
        ComposeView composeView2 = fragmentPaymentsheetAddPaymentMethodBinding.paymentMethodsRecycler;
        composeView2.setViewCompositionStrategy(v1.b.f3127a);
        composeView2.setContent(j1.c.c(-985536769, true, new BaseAddPaymentMethodFragment$setupRecyclerView$1$1(this, supportedPaymentMethod, list)));
    }

    private final void updateLinkInlineSignupVisibility(LpmRepository.SupportedPaymentMethod supportedPaymentMethod) {
        this.showLinkInlineSignup = kotlin.jvm.internal.s.c(getSheetViewModel().isLinkEnabled$paymentsheet_release().getValue(), Boolean.TRUE) && supportedPaymentMethod.getType() == PaymentMethod.Type.Card && getSheetViewModel().getLinkLauncher().getAccountStatus().mo260getValue() == AccountStatus.SignedOut;
        FragmentPaymentsheetAddPaymentMethodBinding fragmentPaymentsheetAddPaymentMethodBinding = this.viewBinding;
        if (fragmentPaymentsheetAddPaymentMethodBinding == null) {
            kotlin.jvm.internal.s.x("viewBinding");
            fragmentPaymentsheetAddPaymentMethodBinding = null;
        }
        LinkInlineSignupView linkInlineSignupView = fragmentPaymentsheetAddPaymentMethodBinding.linkInlineSignup;
        kotlin.jvm.internal.s.f(linkInlineSignupView, "viewBinding.linkInlineSignup");
        linkInlineSignupView.setVisibility(this.showLinkInlineSignup ? 0 : 8);
    }

    public abstract BaseSheetViewModel<?> getSheetViewModel();

    public abstract s0.b getViewModelFactory();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.s.g(inflater, "inflater");
        return inflater.cloneInContext(new l.d(requireActivity(), R.style.StripePaymentSheetAddPaymentMethodTheme)).inflate(R.layout.fragment_paymentsheet_add_payment_method, viewGroup, false);
    }

    public final void onPaymentMethodSelected$paymentsheet_release(LpmRepository.SupportedPaymentMethod paymentMethod) {
        kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
        m0 Q = androidx.core.view.a0.Q(requireView());
        if (Q != null) {
            Q.a(l0.m.a());
        }
        getSheetViewModel().updatePrimaryButtonUIState(null);
        updateLinkInlineSignupVisibility(paymentMethod);
        replacePaymentMethodFragment(paymentMethod);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.s.g(view, "view");
        super.onViewCreated(view, bundle);
        FragmentPaymentsheetAddPaymentMethodBinding bind = FragmentPaymentsheetAddPaymentMethodBinding.bind(view);
        kotlin.jvm.internal.s.f(bind, "bind(view)");
        this.viewBinding = bind;
        List<LpmRepository.SupportedPaymentMethod> supportedPaymentMethods$paymentsheet_release = getSheetViewModel().getSupportedPaymentMethods$paymentsheet_release();
        getSheetViewModel().getHeaderText$paymentsheet_release().setValue(getString(R.string.stripe_paymentsheet_add_payment_method_title));
        Integer valueOf = Integer.valueOf(supportedPaymentMethods$paymentsheet_release.indexOf(getSheetViewModel().getAddFragmentSelectedLPM$paymentsheet_release()));
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        if (supportedPaymentMethods$paymentsheet_release.size() > 1) {
            FragmentPaymentsheetAddPaymentMethodBinding fragmentPaymentsheetAddPaymentMethodBinding = this.viewBinding;
            if (fragmentPaymentsheetAddPaymentMethodBinding == null) {
                kotlin.jvm.internal.s.x("viewBinding");
                fragmentPaymentsheetAddPaymentMethodBinding = null;
            }
            setupRecyclerView(fragmentPaymentsheetAddPaymentMethodBinding, supportedPaymentMethods$paymentsheet_release, getSheetViewModel().getAddFragmentSelectedLPM$paymentsheet_release());
        }
        getSheetViewModel().getProcessing().observe(getViewLifecycleOwner(), new g0() { // from class: com.stripe.android.paymentsheet.a
            {
                BaseAddPaymentMethodFragment.this = this;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                BaseAddPaymentMethodFragment.a(BaseAddPaymentMethodFragment.this, (Boolean) obj);
            }
        });
        FragmentPaymentsheetAddPaymentMethodBinding fragmentPaymentsheetAddPaymentMethodBinding2 = this.viewBinding;
        if (fragmentPaymentsheetAddPaymentMethodBinding2 == null) {
            kotlin.jvm.internal.s.x("viewBinding");
            fragmentPaymentsheetAddPaymentMethodBinding2 = null;
        }
        fragmentPaymentsheetAddPaymentMethodBinding2.linkInlineSignup.setLinkLauncher(getSheetViewModel().getLinkLauncher());
        v20.k.d(androidx.lifecycle.w.a(this), null, null, new BaseAddPaymentMethodFragment$onViewCreated$3(this, null), 3, null);
        if (!supportedPaymentMethods$paymentsheet_release.isEmpty()) {
            updateLinkInlineSignupVisibility(supportedPaymentMethods$paymentsheet_release.get(intValue));
            if (bundle == null) {
                replacePaymentMethodFragment(supportedPaymentMethods$paymentsheet_release.get(intValue));
            }
        }
        getSheetViewModel().getEventReporter$paymentsheet_release().onShowNewPaymentOptionForm();
    }
}