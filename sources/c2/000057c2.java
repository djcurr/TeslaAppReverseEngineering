package com.stripe.android.paymentsheet.viewmodels;

import android.app.Application;
import androidx.activity.result.c;
import androidx.activity.result.d;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.l0;
import androidx.lifecycle.q0;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.injection.LinkPaymentLauncherFactory;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.ui.inline.UserInput;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.FragmentConfig;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.model.SupportedPaymentMethodKtxKt;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState;
import com.stripe.android.paymentsheet.repositories.CustomerRepository;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.ui.core.Amount;
import com.stripe.android.ui.core.forms.resources.LpmRepository;
import com.stripe.android.ui.core.forms.resources.ResourceRepository;
import h00.l;
import h00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.a2;
import v20.e1;
import v20.i;
import v20.j;
import v20.k;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import wz.e0;
import wz.u;
import wz.w;
import wz.x;
import zz.g;

/* loaded from: classes6.dex */
public abstract class BaseSheetViewModel<TransitionTargetType> extends androidx.lifecycle.b {
    public static final Companion Companion = new Companion(null);
    public static final String SAVE_AMOUNT = "amount";
    public static final String SAVE_GOOGLE_PAY_READY = "google_pay_ready";
    public static final String SAVE_PAYMENT_METHODS = "customer_payment_methods";
    public static final String SAVE_PROCESSING = "processing";
    public static final String SAVE_RESOURCE_REPOSITORY_READY = "resource_repository_ready";
    public static final String SAVE_SAVED_SELECTION = "saved_selection";
    public static final String SAVE_SELECTED_ADD_LPM = "selected_add_lpm";
    public static final String SAVE_SELECTION = "selection";
    public static final String SAVE_STRIPE_INTENT = "stripe_intent";
    public static final String SAVE_SUPPORTED_PAYMENT_METHOD = "supported_payment_methods";
    private final f0<Amount> _amount;
    private final f0<Boolean> _contentVisible;
    private final f0<Throwable> _fatal;
    private final f0<Boolean> _isGooglePayReady;
    private final f0<Boolean> _isLinkEnabled;
    private final f0<Boolean> _isResourceRepositoryReady;
    private final f0<Boolean> _liveMode;
    private final f0<String> _notesText;
    private final f0<List<PaymentMethod>> _paymentMethods;
    private final f0<PrimaryButton.State> _primaryButtonState;
    private final f0<PrimaryButton.UIState> _primaryButtonUIState;
    private final f0<Boolean> _processing;
    private final f0<SavedSelection> _savedSelection;
    private final f0<PaymentSelection> _selection;
    private final f0<Boolean> _showLinkVerificationDialog;
    private final f0<StripeIntent> _stripeIntent;
    private final f0<Event<TransitionTargetType>> _transition;
    private final LiveData<Amount> amount;
    private final LiveData<Boolean> buttonsEnabled;
    private final PaymentSheet.Configuration config;
    private final LiveData<Boolean> contentVisible;
    private final LiveData<Boolean> ctaEnabled;
    private final PaymentSheet.CustomerConfiguration customerConfig;
    private final CustomerRepository customerRepository;
    private final f0<Boolean> editing;
    private final EventReporter eventReporter;
    private final LiveData<Event<FragmentConfig>> fragmentConfigEvent;
    private final f0<Boolean> googlePayDividerVisibilility;
    private final f0<String> headerText;
    private final String injectorKey;
    private final LiveData<Boolean> isGooglePayReady;
    private final LiveData<Boolean> isLinkEnabled;
    private final LiveData<Boolean> isResourceRepositoryReady;
    private d<LinkActivityContract.Args> linkActivityResultLauncher;
    private final LinkPaymentLauncher linkLauncher;
    private final LinkPaymentLauncherFactory linkPaymentLauncherFactory;
    private l<? super Boolean, b0> linkVerificationCallback;
    private final LiveData<Boolean> liveMode;
    private final Logger logger;
    private final String merchantName;
    private final LiveData<String> notesText;
    private final LiveData<List<PaymentMethod>> paymentMethods;
    private final PrefsRepository prefsRepository;
    private final LiveData<PrimaryButton.State> primaryButtonState;
    private final LiveData<PrimaryButton.UIState> primaryButtonUIState;
    private final LiveData<Boolean> processing;
    private final ResourceRepository resourceRepository;
    private final LiveData<SavedSelection> savedSelection;
    private final l0 savedStateHandle;
    private final LiveData<PaymentSelection> selection;
    private final LiveData<Boolean> showLinkVerificationDialog;
    private final LiveData<StripeIntent> stripeIntent;
    private final LiveData<Event<TransitionTargetType>> transition;
    private USBankAccountFormScreenState usBankAccountSavedScreenState;
    private final g workContext;

    @f(c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$1", f = "BaseSheetViewModel.kt", l = {238}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$1 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<o0, zz.d<? super b0>, Object> {
        int label;
        final /* synthetic */ BaseSheetViewModel<TransitionTargetType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BaseSheetViewModel<TransitionTargetType> baseSheetViewModel, zz.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = baseSheetViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.label;
            if (i11 == 0) {
                r.b(obj);
                g workContext = this.this$0.getWorkContext();
                BaseSheetViewModel$1$savedSelection$1 baseSheetViewModel$1$savedSelection$1 = new BaseSheetViewModel$1$savedSelection$1(this.this$0, null);
                this.label = 1;
                obj = i.g(workContext, baseSheetViewModel$1$savedSelection$1, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            this.this$0.getSavedStateHandle().h(BaseSheetViewModel.SAVE_SAVED_SELECTION, (SavedSelection) obj);
            return b0.f54756a;
        }
    }

    @f(c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$2", f = "BaseSheetViewModel.kt", l = {247}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$2 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.l implements p<o0, zz.d<? super b0>, Object> {
        int label;
        final /* synthetic */ BaseSheetViewModel<TransitionTargetType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BaseSheetViewModel<TransitionTargetType> baseSheetViewModel, zz.d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = baseSheetViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new AnonymousClass2(this.this$0, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
            return ((AnonymousClass2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.label;
            if (i11 == 0) {
                r.b(obj);
                ResourceRepository resourceRepository = this.this$0.getResourceRepository();
                this.label = 1;
                if (resourceRepository.waitUntilLoaded(this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            this.this$0.getSavedStateHandle().h(BaseSheetViewModel.SAVE_RESOURCE_REPOSITORY_READY, kotlin.coroutines.jvm.internal.b.a(true));
            return b0.f54756a;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Event<T> {
        public static final int $stable = 8;
        private final T content;
        private boolean hasBeenHandled;

        public Event(T t11) {
            this.content = t11;
        }

        public final T getContentIfNotHandled() {
            if (this.hasBeenHandled) {
                return null;
            }
            this.hasBeenHandled = true;
            return this.content;
        }

        public final boolean getHasBeenHandled() {
            return this.hasBeenHandled;
        }

        public final T peekContent() {
            return this.content;
        }
    }

    /* loaded from: classes6.dex */
    public static final class UserErrorMessage {
        public static final int $stable = 0;
        private final String message;

        public UserErrorMessage(String message) {
            s.g(message, "message");
            this.message = message;
        }

        public static /* synthetic */ UserErrorMessage copy$default(UserErrorMessage userErrorMessage, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = userErrorMessage.message;
            }
            return userErrorMessage.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final UserErrorMessage copy(String message) {
            s.g(message, "message");
            return new UserErrorMessage(message);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UserErrorMessage) && s.c(this.message, ((UserErrorMessage) obj).message);
        }

        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "UserErrorMessage(message=" + this.message + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountStatus.values().length];
            iArr[AccountStatus.Verified.ordinal()] = 1;
            iArr[AccountStatus.VerificationStarted.ordinal()] = 2;
            iArr[AccountStatus.NeedsVerification.ordinal()] = 3;
            iArr[AccountStatus.SignedOut.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ BaseSheetViewModel(Application application, PaymentSheet.Configuration configuration, EventReporter eventReporter, CustomerRepository customerRepository, PrefsRepository prefsRepository, g gVar, Logger logger, String str, ResourceRepository resourceRepository, l0 l0Var, LinkPaymentLauncherFactory linkPaymentLauncherFactory, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, configuration, eventReporter, customerRepository, prefsRepository, (i11 & 32) != 0 ? e1.b() : gVar, logger, str, resourceRepository, l0Var, linkPaymentLauncherFactory);
    }

    /* renamed from: buttonsEnabled$lambda-4$lambda-3$lambda-2 */
    public static final void m347buttonsEnabled$lambda4$lambda3$lambda2(d0 this_apply, BaseSheetViewModel this$0, Boolean bool) {
        s.g(this_apply, "$this_apply");
        s.g(this$0, "this$0");
        Boolean value = this$0.processing.getValue();
        Boolean bool2 = Boolean.TRUE;
        this_apply.setValue(Boolean.valueOf((s.c(value, bool2) || s.c(this$0.editing.getValue(), bool2)) ? false : true));
    }

    public final FragmentConfig createFragmentConfig() {
        StripeIntent value = this.stripeIntent.getValue();
        Boolean value2 = this.isGooglePayReady.getValue();
        Boolean value3 = this.isResourceRepositoryReady.getValue();
        Boolean value4 = this.isLinkEnabled.getValue();
        SavedSelection value5 = this.savedSelection.getValue();
        List<PaymentMethod> value6 = this.paymentMethods.getValue();
        if (value == null || value6 == null || value2 == null || value3 == null || value4 == null || value5 == null) {
            return null;
        }
        return new FragmentConfig(value, value2.booleanValue(), value5);
    }

    public final void createLinkPaymentDetails(PaymentMethodCreateParams paymentMethodCreateParams) {
        k.d(q0.a(this), null, null, new BaseSheetViewModel$createLinkPaymentDetails$1(this, paymentMethodCreateParams, null), 3, null);
    }

    public static /* synthetic */ void get_amount$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void get_contentVisible$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void get_isGooglePayReady$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void get_liveMode$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void get_paymentMethods$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void get_processing$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void onError$default(BaseSheetViewModel baseSheetViewModel, Integer num, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
        }
        if ((i11 & 1) != 0) {
            num = null;
        }
        baseSheetViewModel.onError(num);
    }

    private final void warnUnactivatedIfNeeded(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        this.logger.warning("[Stripe SDK] Warning: Your Intent contains the following payment method types which are activated for test mode but not activated for live mode: " + list + ". These payment method types will not be displayed in live mode until they are activated. To activate these payment method types visit your Stripe dashboard.More information: https://support.stripe.com/questions/activate-a-new-payment-method");
    }

    public final PaymentSelection.New.Link convertToPaymentSelection(LinkPaymentDetails linkPaymentDetails) {
        s.g(linkPaymentDetails, "<this>");
        return new PaymentSelection.New.Link(linkPaymentDetails.getPaymentDetails(), linkPaymentDetails.getPaymentMethodCreateParams());
    }

    public final LpmRepository.SupportedPaymentMethod getAddFragmentSelectedLPM$paymentsheet_release() {
        PaymentMethodCreateParams paymentMethodCreateParams;
        LpmRepository lpmRepository = this.resourceRepository.getLpmRepository();
        String str = (String) this.savedStateHandle.c(SAVE_SELECTED_ADD_LPM);
        if (str == null) {
            PaymentSelection.New newLpm = getNewLpm();
            str = (newLpm == null || (paymentMethodCreateParams = newLpm.getPaymentMethodCreateParams()) == null) ? null : paymentMethodCreateParams.getTypeCode();
        }
        LpmRepository.SupportedPaymentMethod fromCode = lpmRepository.fromCode(str);
        if (fromCode == null) {
            fromCode = (LpmRepository.SupportedPaymentMethod) u.b0(getSupportedPaymentMethods$paymentsheet_release());
        }
        if (fromCode != null) {
            return fromCode;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final LiveData<LpmRepository.SupportedPaymentMethod> getAddFragmentSelectedLpm() {
        PaymentMethodCreateParams paymentMethodCreateParams;
        l0 l0Var = this.savedStateHandle;
        PaymentSelection.New newLpm = getNewLpm();
        String str = null;
        if (newLpm != null && (paymentMethodCreateParams = newLpm.getPaymentMethodCreateParams()) != null) {
            str = paymentMethodCreateParams.getTypeCode();
        }
        f0 e11 = l0Var.e(SAVE_SELECTED_ADD_LPM, str);
        s.f(e11, "savedStateHandle.getLive…arams?.typeCode\n        )");
        LiveData<LpmRepository.SupportedPaymentMethod> b11 = androidx.lifecycle.o0.b(e11, new p.a() { // from class: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$getAddFragmentSelectedLpm$$inlined$map$1
            @Override // p.a
            public final LpmRepository.SupportedPaymentMethod apply(String str2) {
                LpmRepository.SupportedPaymentMethod fromCode = BaseSheetViewModel.this.getResourceRepository().getLpmRepository().fromCode(str2);
                return fromCode == null ? (LpmRepository.SupportedPaymentMethod) u.b0(BaseSheetViewModel.this.getSupportedPaymentMethods$paymentsheet_release()) : fromCode;
            }
        });
        s.f(b11, "crossinline transform: (…p(this) { transform(it) }");
        return b11;
    }

    public final LiveData<Amount> getAmount$paymentsheet_release() {
        return this.amount;
    }

    public final LiveData<Boolean> getButtonsEnabled() {
        return this.buttonsEnabled;
    }

    public final PaymentSheet.Configuration getConfig$paymentsheet_release() {
        return this.config;
    }

    public final LiveData<Boolean> getContentVisible$paymentsheet_release() {
        return this.contentVisible;
    }

    public final LiveData<Boolean> getCtaEnabled() {
        return this.ctaEnabled;
    }

    public final PaymentSheet.CustomerConfiguration getCustomerConfig$paymentsheet_release() {
        return this.customerConfig;
    }

    public final CustomerRepository getCustomerRepository() {
        return this.customerRepository;
    }

    public final EventReporter getEventReporter$paymentsheet_release() {
        return this.eventReporter;
    }

    public final LiveData<Event<FragmentConfig>> getFragmentConfigEvent() {
        return this.fragmentConfigEvent;
    }

    public final f0<Boolean> getGooglePayDividerVisibilility$paymentsheet_release() {
        return this.googlePayDividerVisibilility;
    }

    public final f0<String> getHeaderText$paymentsheet_release() {
        return this.headerText;
    }

    public final String getInjectorKey() {
        return this.injectorKey;
    }

    public final LinkPaymentLauncher getLinkLauncher() {
        return this.linkLauncher;
    }

    public final LinkPaymentLauncherFactory getLinkPaymentLauncherFactory$paymentsheet_release() {
        return this.linkPaymentLauncherFactory;
    }

    public final l<Boolean, b0> getLinkVerificationCallback() {
        return this.linkVerificationCallback;
    }

    public final LiveData<Boolean> getLiveMode$paymentsheet_release() {
        return this.liveMode;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final String getMerchantName$paymentsheet_release() {
        return this.merchantName;
    }

    public abstract PaymentSelection.New getNewLpm();

    public final LiveData<String> getNotesText$paymentsheet_release() {
        return this.notesText;
    }

    public final LiveData<List<PaymentMethod>> getPaymentMethods$paymentsheet_release() {
        return this.paymentMethods;
    }

    public final PrefsRepository getPrefsRepository() {
        return this.prefsRepository;
    }

    public final LiveData<PrimaryButton.State> getPrimaryButtonState() {
        return this.primaryButtonState;
    }

    public final LiveData<PrimaryButton.UIState> getPrimaryButtonUIState() {
        return this.primaryButtonUIState;
    }

    public final LiveData<Boolean> getProcessing() {
        return this.processing;
    }

    public final ResourceRepository getResourceRepository() {
        return this.resourceRepository;
    }

    public final l0 getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public final LiveData<PaymentSelection> getSelection$paymentsheet_release() {
        return this.selection;
    }

    public final LiveData<Boolean> getShowLinkVerificationDialog() {
        return this.showLinkVerificationDialog;
    }

    public final LiveData<StripeIntent> getStripeIntent$paymentsheet_release() {
        return this.stripeIntent;
    }

    public final List<LpmRepository.SupportedPaymentMethod> getSupportedPaymentMethods$paymentsheet_release() {
        ArrayList arrayList;
        List<LpmRepository.SupportedPaymentMethod> i11;
        List<String> list = (List) this.savedStateHandle.c(SAVE_SUPPORTED_PAYMENT_METHOD);
        if (list == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (String str : list) {
                LpmRepository.SupportedPaymentMethod fromCode = getResourceRepository().getLpmRepository().fromCode(str);
                if (fromCode != null) {
                    arrayList2.add(fromCode);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            i11 = w.i();
            return i11;
        }
        return arrayList;
    }

    public final LiveData<Event<TransitionTargetType>> getTransition$paymentsheet_release() {
        return this.transition;
    }

    public final USBankAccountFormScreenState getUsBankAccountSavedScreenState() {
        return this.usBankAccountSavedScreenState;
    }

    protected final g getWorkContext() {
        return this.workContext;
    }

    public final f0<Amount> get_amount$paymentsheet_release() {
        return this._amount;
    }

    public final f0<Boolean> get_contentVisible$paymentsheet_release() {
        return this._contentVisible;
    }

    public final f0<Throwable> get_fatal() {
        return this._fatal;
    }

    public final f0<Boolean> get_isGooglePayReady$paymentsheet_release() {
        return this._isGooglePayReady;
    }

    public final f0<Boolean> get_liveMode$paymentsheet_release() {
        return this._liveMode;
    }

    public final f0<List<PaymentMethod>> get_paymentMethods$paymentsheet_release() {
        return this._paymentMethods;
    }

    public final f0<Boolean> get_processing$paymentsheet_release() {
        return this._processing;
    }

    public final LiveData<Boolean> isGooglePayReady$paymentsheet_release() {
        return this.isGooglePayReady;
    }

    public final LiveData<Boolean> isLinkEnabled$paymentsheet_release() {
        return this.isLinkEnabled;
    }

    public final LiveData<Boolean> isResourceRepositoryReady$paymentsheet_release() {
        return this.isResourceRepositoryReady;
    }

    public final void launchLink() {
        d<LinkActivityContract.Args> dVar = this.linkActivityResultLauncher;
        if (dVar == null) {
            return;
        }
        getLinkLauncher().present(dVar);
        onLinkLaunched();
    }

    public abstract void onError(Integer num);

    public abstract void onError(String str);

    public abstract void onFatal(Throwable th2);

    public abstract void onFinish();

    public void onLinkActivityResult(LinkActivityResult result) {
        s.g(result, "result");
        setContentVisible(true);
    }

    public void onLinkLaunched() {
        setContentVisible(false);
    }

    public abstract void onLinkPaymentDetailsCollected(LinkPaymentDetails linkPaymentDetails);

    public abstract void onPaymentResult(PaymentResult paymentResult);

    public abstract void onUserCancel();

    public final void payWithLink(UserInput userInput) {
        PaymentMethodCreateParams paymentMethodCreateParams;
        s.g(userInput, "userInput");
        PaymentSelection value = this.selection.getValue();
        PaymentSelection.New.Card card = value instanceof PaymentSelection.New.Card ? (PaymentSelection.New.Card) value : null;
        if (card == null || (paymentMethodCreateParams = card.getPaymentMethodCreateParams()) == null) {
            return;
        }
        l0 savedStateHandle = getSavedStateHandle();
        Boolean bool = Boolean.TRUE;
        savedStateHandle.h(SAVE_PROCESSING, bool);
        updatePrimaryButtonState(PrimaryButton.State.StartProcessing.INSTANCE);
        int i11 = WhenMappings.$EnumSwitchMapping$0[getLinkLauncher().getAccountStatus().getValue().ordinal()];
        if (i11 == 1) {
            createLinkPaymentDetails(paymentMethodCreateParams);
        } else if (i11 == 2 || i11 == 3) {
            setLinkVerificationCallback(new BaseSheetViewModel$payWithLink$1$1(this, paymentMethodCreateParams));
            this._showLinkVerificationDialog.setValue(bool);
        } else if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        } else {
            k.d(q0.a(this), null, null, new BaseSheetViewModel$payWithLink$1$2(this, userInput, null), 3, null);
        }
    }

    public void registerFromActivity(c activityResultCaller) {
        s.g(activityResultCaller, "activityResultCaller");
        this.linkActivityResultLauncher = activityResultCaller.registerForActivityResult(new LinkActivityContract(), new androidx.activity.result.b() { // from class: com.stripe.android.paymentsheet.viewmodels.a
            {
                BaseSheetViewModel.this = this;
            }

            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                BaseSheetViewModel.this.onLinkActivityResult((LinkActivityResult) obj);
            }
        });
    }

    public final a2 removePaymentMethod(PaymentMethod paymentMethod) {
        Object b11;
        s.g(paymentMethod, "paymentMethod");
        b11 = j.b(null, new BaseSheetViewModel$removePaymentMethod$1(paymentMethod, this, null), 1, null);
        return (a2) b11;
    }

    public final void setAddFragmentSelectedLPM$paymentsheet_release(LpmRepository.SupportedPaymentMethod value) {
        s.g(value, "value");
        this.savedStateHandle.h(SAVE_SELECTED_ADD_LPM, value.getType().code);
    }

    public final void setContentVisible(boolean z11) {
        this._contentVisible.setValue(Boolean.valueOf(z11));
    }

    public final void setEditing(boolean z11) {
        this.editing.setValue(Boolean.valueOf(z11));
    }

    public final void setLinkVerificationCallback(l<? super Boolean, b0> lVar) {
        this.linkVerificationCallback = lVar;
    }

    public abstract void setNewLpm(PaymentSelection.New r12);

    public final void setStripeIntent(StripeIntent stripeIntent) {
        Object b11;
        l0 savedStateHandle;
        Long amount;
        List O0;
        this.savedStateHandle.h(SAVE_STRIPE_INTENT, stripeIntent);
        setSupportedPaymentMethods$paymentsheet_release(SupportedPaymentMethodKtxKt.getPMsToAdd(stripeIntent, this.config, this.resourceRepository.getLpmRepository()));
        if (stripeIntent != null && getSupportedPaymentMethods$paymentsheet_release().isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("None of the requested payment methods (");
            sb2.append(stripeIntent.getPaymentMethodTypes());
            sb2.append(") match the supported payment types (");
            O0 = e0.O0(this.resourceRepository.getLpmRepository().values());
            sb2.append(O0);
            sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            onFatal(new IllegalArgumentException(sb2.toString()));
        }
        if (stripeIntent instanceof PaymentIntent) {
            try {
                q.a aVar = q.f54772b;
                savedStateHandle = getSavedStateHandle();
                amount = ((PaymentIntent) stripeIntent).getAmount();
            } catch (Throwable th2) {
                q.a aVar2 = q.f54772b;
                b11 = q.b(r.a(th2));
            }
            if (amount != null) {
                long longValue = amount.longValue();
                String currency = ((PaymentIntent) stripeIntent).getCurrency();
                if (currency != null) {
                    savedStateHandle.h(SAVE_AMOUNT, new Amount(longValue, currency));
                    this._primaryButtonUIState.setValue(null);
                    b11 = q.b(b0.f54756a);
                    if (q.e(b11) != null) {
                        onFatal(new IllegalStateException("PaymentIntent must contain amount and currency."));
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        if (stripeIntent != null) {
            this._liveMode.postValue(Boolean.valueOf(stripeIntent.isLiveMode()));
            warnUnactivatedIfNeeded(stripeIntent.getUnactivatedPaymentMethods());
        }
    }

    public final void setSupportedPaymentMethods$paymentsheet_release(List<? extends LpmRepository.SupportedPaymentMethod> value) {
        int t11;
        s.g(value, "value");
        l0 l0Var = this.savedStateHandle;
        t11 = x.t(value, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (LpmRepository.SupportedPaymentMethod supportedPaymentMethod : value) {
            arrayList.add(supportedPaymentMethod.getType().code);
        }
        l0Var.h(SAVE_SUPPORTED_PAYMENT_METHOD, arrayList);
    }

    public final void setUsBankAccountSavedScreenState(USBankAccountFormScreenState uSBankAccountFormScreenState) {
        this.usBankAccountSavedScreenState = uSBankAccountFormScreenState;
    }

    public final void setupLink(StripeIntent stripeIntent, boolean z11) {
        s.g(stripeIntent, "stripeIntent");
        this._isLinkEnabled.setValue(Boolean.FALSE);
    }

    public void transitionTo(TransitionTargetType transitiontargettype) {
        this._transition.postValue(new Event<>(transitiontargettype));
    }

    public void unregisterFromActivity() {
        this.linkActivityResultLauncher = null;
    }

    public final void updateBelowButtonText(String str) {
        this._notesText.setValue(str);
    }

    public final void updatePrimaryButtonState(PrimaryButton.State state) {
        s.g(state, "state");
        this._primaryButtonState.setValue(state);
    }

    public final void updatePrimaryButtonUIState(PrimaryButton.UIState uIState) {
        this._primaryButtonUIState.setValue(uIState);
    }

    public void updateSelection(PaymentSelection paymentSelection) {
        if (paymentSelection instanceof PaymentSelection.New) {
            setNewLpm((PaymentSelection.New) paymentSelection);
        }
        this.savedStateHandle.h(SAVE_SELECTION, paymentSelection);
        updateBelowButtonText(null);
    }

    public static /* synthetic */ void onError$default(BaseSheetViewModel baseSheetViewModel, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
        }
        if ((i11 & 1) != 0) {
            str = null;
        }
        baseSheetViewModel.onError(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSheetViewModel(Application application, PaymentSheet.Configuration configuration, EventReporter eventReporter, CustomerRepository customerRepository, PrefsRepository prefsRepository, g workContext, Logger logger, @InjectorKey String injectorKey, ResourceRepository resourceRepository, l0 savedStateHandle, LinkPaymentLauncherFactory linkPaymentLauncherFactory) {
        super(application);
        PaymentSheet.BillingDetails defaultBillingDetails;
        List<LiveData> l11;
        List<LiveData> l12;
        List<LiveData> l13;
        s.g(application, "application");
        s.g(eventReporter, "eventReporter");
        s.g(customerRepository, "customerRepository");
        s.g(prefsRepository, "prefsRepository");
        s.g(workContext, "workContext");
        s.g(logger, "logger");
        s.g(injectorKey, "injectorKey");
        s.g(resourceRepository, "resourceRepository");
        s.g(savedStateHandle, "savedStateHandle");
        s.g(linkPaymentLauncherFactory, "linkPaymentLauncherFactory");
        this.config = configuration;
        this.eventReporter = eventReporter;
        this.customerRepository = customerRepository;
        this.prefsRepository = prefsRepository;
        this.workContext = workContext;
        this.logger = logger;
        this.injectorKey = injectorKey;
        this.resourceRepository = resourceRepository;
        this.savedStateHandle = savedStateHandle;
        this.linkPaymentLauncherFactory = linkPaymentLauncherFactory;
        this.customerConfig = configuration == null ? null : configuration.getCustomer();
        String merchantDisplayName = configuration == null ? null : configuration.getMerchantDisplayName();
        merchantDisplayName = merchantDisplayName == null ? application.getApplicationInfo().loadLabel(application.getPackageManager()).toString() : merchantDisplayName;
        this.merchantName = merchantDisplayName;
        this._fatal = new f0<>();
        f0<Boolean> d11 = savedStateHandle.d(SAVE_GOOGLE_PAY_READY);
        s.f(d11, "savedStateHandle.getLive…n>(SAVE_GOOGLE_PAY_READY)");
        this._isGooglePayReady = d11;
        LiveData<Boolean> a11 = androidx.lifecycle.o0.a(d11);
        s.f(a11, "distinctUntilChanged(this)");
        this.isGooglePayReady = a11;
        f0<Boolean> d12 = savedStateHandle.d(SAVE_RESOURCE_REPOSITORY_READY);
        s.f(d12, "savedStateHandle.getLive…CE_REPOSITORY_READY\n    )");
        this._isResourceRepositoryReady = d12;
        LiveData<Boolean> a12 = androidx.lifecycle.o0.a(d12);
        s.f(a12, "distinctUntilChanged(this)");
        this.isResourceRepositoryReady = a12;
        f0<Boolean> f0Var = new f0<>();
        this._isLinkEnabled = f0Var;
        LiveData<Boolean> a13 = androidx.lifecycle.o0.a(f0Var);
        s.f(a13, "distinctUntilChanged(this)");
        this.isLinkEnabled = a13;
        f0<StripeIntent> d13 = savedStateHandle.d(SAVE_STRIPE_INTENT);
        s.f(d13, "savedStateHandle.getLive…tent>(SAVE_STRIPE_INTENT)");
        this._stripeIntent = d13;
        this.stripeIntent = d13;
        f0<List<PaymentMethod>> d14 = savedStateHandle.d(SAVE_PAYMENT_METHODS);
        s.f(d14, "savedStateHandle.getLive…d>>(SAVE_PAYMENT_METHODS)");
        this._paymentMethods = d14;
        this.paymentMethods = d14;
        f0<Amount> d15 = savedStateHandle.d(SAVE_AMOUNT);
        s.f(d15, "savedStateHandle.getLiveData<Amount>(SAVE_AMOUNT)");
        this._amount = d15;
        this.amount = d15;
        this.headerText = new f0<>();
        Boolean bool = Boolean.FALSE;
        this.googlePayDividerVisibilility = new f0<>(bool);
        f0<SavedSelection> d16 = savedStateHandle.d(SAVE_SAVED_SELECTION);
        s.f(d16, "savedStateHandle.getLive…on>(SAVE_SAVED_SELECTION)");
        this._savedSelection = d16;
        this.savedSelection = d16;
        f0<Event<TransitionTargetType>> f0Var2 = new f0<>(new Event(null));
        this._transition = f0Var2;
        this.transition = f0Var2;
        f0<Boolean> f0Var3 = new f0<>();
        this._liveMode = f0Var3;
        this.liveMode = f0Var3;
        f0<PaymentSelection> d17 = savedStateHandle.d(SAVE_SELECTION);
        s.f(d17, "savedStateHandle.getLive…election>(SAVE_SELECTION)");
        this._selection = d17;
        this.selection = d17;
        f0<Boolean> f0Var4 = new f0<>(bool);
        this.editing = f0Var4;
        f0<Boolean> d18 = savedStateHandle.d(SAVE_PROCESSING);
        s.f(d18, "savedStateHandle.getLive…Boolean>(SAVE_PROCESSING)");
        this._processing = d18;
        this.processing = d18;
        f0<Boolean> f0Var5 = new f0<>(Boolean.TRUE);
        this._contentVisible = f0Var5;
        LiveData<Boolean> a14 = androidx.lifecycle.o0.a(f0Var5);
        s.f(a14, "distinctUntilChanged(this)");
        this.contentVisible = a14;
        f0<PrimaryButton.UIState> f0Var6 = new f0<>();
        this._primaryButtonUIState = f0Var6;
        this.primaryButtonUIState = f0Var6;
        f0<PrimaryButton.State> f0Var7 = new f0<>();
        this._primaryButtonState = f0Var7;
        this.primaryButtonState = f0Var7;
        f0<String> f0Var8 = new f0<>();
        this._notesText = f0Var8;
        this.notesText = f0Var8;
        this.linkLauncher = linkPaymentLauncherFactory.create(merchantDisplayName, (configuration == null || (defaultBillingDetails = configuration.getDefaultBillingDetails()) == null) ? null : defaultBillingDetails.getEmail());
        f0<Boolean> f0Var9 = new f0<>(bool);
        this._showLinkVerificationDialog = f0Var9;
        this.showLinkVerificationDialog = f0Var9;
        final d0 d0Var = new d0();
        l11 = w.l(getProcessing(), f0Var4);
        for (LiveData liveData : l11) {
            d0Var.b(liveData, new g0() { // from class: com.stripe.android.paymentsheet.viewmodels.b
                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj) {
                    BaseSheetViewModel.m347buttonsEnabled$lambda4$lambda3$lambda2(d0Var, this, (Boolean) obj);
                }
            });
        }
        LiveData<Boolean> a15 = androidx.lifecycle.o0.a(d0Var);
        s.f(a15, "distinctUntilChanged(this)");
        this.buttonsEnabled = a15;
        final d0 d0Var2 = new d0();
        l12 = w.l(getPrimaryButtonUIState(), getButtonsEnabled(), getSelection$paymentsheet_release());
        for (LiveData liveData2 : l12) {
            d0Var2.b(liveData2, new g0() { // from class: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$ctaEnabled$1$1$1
                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj) {
                    Boolean valueOf;
                    d0<Boolean> d0Var3 = d0Var2;
                    boolean z11 = true;
                    if (this.getPrimaryButtonUIState().getValue() != null) {
                        PrimaryButton.UIState value = this.getPrimaryButtonUIState().getValue();
                        if (!(value != null && value.getEnabled()) || !s.c(this.getButtonsEnabled().getValue(), Boolean.TRUE)) {
                            z11 = false;
                        }
                        valueOf = Boolean.valueOf(z11);
                    } else {
                        if (!s.c(this.getButtonsEnabled().getValue(), Boolean.TRUE) || this.getSelection$paymentsheet_release().getValue() == null) {
                            z11 = false;
                        }
                        valueOf = Boolean.valueOf(z11);
                    }
                    d0Var3.setValue(valueOf);
                }
            });
        }
        LiveData<Boolean> a16 = androidx.lifecycle.o0.a(d0Var2);
        s.f(a16, "distinctUntilChanged(this)");
        this.ctaEnabled = a16;
        if (this._savedSelection.getValue() == null) {
            k.d(q0.a(this), null, null, new AnonymousClass1(this, null), 3, null);
        }
        if (this._isResourceRepositoryReady.getValue() == null) {
            k.d(q0.a(this), null, null, new AnonymousClass2(this, null), 3, null);
        }
        final d0 d0Var3 = new d0();
        l13 = w.l(this.savedSelection, getStripeIntent$paymentsheet_release(), getPaymentMethods$paymentsheet_release(), isGooglePayReady$paymentsheet_release(), isResourceRepositoryReady$paymentsheet_release(), isLinkEnabled$paymentsheet_release());
        for (LiveData liveData3 : l13) {
            d0Var3.b(liveData3, new g0() { // from class: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$fragmentConfigEvent$1$1$1
                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj) {
                    FragmentConfig createFragmentConfig;
                    d0<FragmentConfig> d0Var4 = d0Var3;
                    createFragmentConfig = this.createFragmentConfig();
                    d0Var4.setValue(createFragmentConfig);
                }
            });
        }
        LiveData a17 = androidx.lifecycle.o0.a(d0Var3);
        s.f(a17, "distinctUntilChanged(this)");
        LiveData<Event<FragmentConfig>> b11 = androidx.lifecycle.o0.b(a17, new p.a() { // from class: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$special$$inlined$map$1
            @Override // p.a
            public final BaseSheetViewModel.Event<? extends FragmentConfig> apply(FragmentConfig fragmentConfig) {
                return new BaseSheetViewModel.Event<>(fragmentConfig);
            }
        });
        s.f(b11, "crossinline transform: (…p(this) { transform(it) }");
        this.fragmentConfigEvent = b11;
    }
}