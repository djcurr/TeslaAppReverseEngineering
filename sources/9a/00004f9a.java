package com.stripe.android.link.ui.cardedit;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.p0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import com.stripe.android.core.Logger;
import com.stripe.android.link.injection.FormControllerSubcomponent;
import com.stripe.android.link.injection.NonFallbackInjectable;
import com.stripe.android.link.injection.NonFallbackInjector;
import com.stripe.android.link.injection.SignedInViewModelSubcomponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.Navigator;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.link.ui.ErrorMessage;
import com.stripe.android.link.ui.ErrorMessageKt;
import com.stripe.android.link.ui.forms.FormController;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.ui.core.FieldValuesToParamsMapConverter;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import java.util.Map;
import javax.inject.Provider;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import vz.b0;
import vz.k;
import vz.m;
import vz.v;

/* loaded from: classes6.dex */
public final class CardEditViewModel extends p0 {
    private final u<ErrorMessage> _errorMessage;
    private final u<Boolean> _isProcessing;
    private final u<Boolean> _setAsDefault;
    private final h0<ErrorMessage> errorMessage;
    private final u<FormController> formController;
    private final Provider<FormControllerSubcomponent.Builder> formControllerProvider;
    private final k isDefault$delegate;
    private final e<Boolean> isEnabled;
    private final h0<Boolean> isProcessing;
    private final LinkAccount linkAccount;
    private final LinkRepository linkRepository;
    private final Logger logger;
    private final Navigator navigator;
    public ConsumerPaymentDetails.PaymentDetails paymentDetails;
    private final h0<Boolean> setAsDefault;

    /* loaded from: classes6.dex */
    public static final class Factory implements s0.b, NonFallbackInjectable {
        private final NonFallbackInjector injector;
        private final LinkAccount linkAccount;
        private final String paymentDetailsId;
        public Provider<SignedInViewModelSubcomponent.Builder> subComponentBuilderProvider;

        public Factory(LinkAccount linkAccount, NonFallbackInjector injector, String paymentDetailsId) {
            s.g(linkAccount, "linkAccount");
            s.g(injector, "injector");
            s.g(paymentDetailsId, "paymentDetailsId");
            this.linkAccount = linkAccount;
            this.injector = injector;
            this.paymentDetailsId = paymentDetailsId;
        }

        @Override // androidx.lifecycle.s0.b
        public <T extends p0> T create(Class<T> modelClass) {
            s.g(modelClass, "modelClass");
            this.injector.inject(this);
            CardEditViewModel cardEditViewModel = getSubComponentBuilderProvider().get().linkAccount(this.linkAccount).build().getCardEditViewModel();
            cardEditViewModel.initWithPaymentDetailsId(this.paymentDetailsId);
            return cardEditViewModel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.stripe.android.core.injection.Injectable
        public Void fallbackInitialize(b0 b0Var) {
            return NonFallbackInjectable.DefaultImpls.fallbackInitialize(this, b0Var);
        }

        public final Provider<SignedInViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            Provider<SignedInViewModelSubcomponent.Builder> provider = this.subComponentBuilderProvider;
            if (provider != null) {
                return provider;
            }
            s.x("subComponentBuilderProvider");
            return null;
        }

        public final void setSubComponentBuilderProvider(Provider<SignedInViewModelSubcomponent.Builder> provider) {
            s.g(provider, "<set-?>");
            this.subComponentBuilderProvider = provider;
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class Result implements Parcelable {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public static final String KEY = "CardEditScreenResult";

        /* loaded from: classes6.dex */
        public static final class Cancelled extends Result {
            public static final Cancelled INSTANCE = new Cancelled();
            public static final Parcelable.Creator<Cancelled> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Cancelled> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Cancelled createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return Cancelled.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Cancelled[] newArray(int i11) {
                    return new Cancelled[i11];
                }
            }

            private Cancelled() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
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
        public static final class Failure extends Result {
            private final ErrorMessage error;
            public static final Parcelable.Creator<Failure> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Failure> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Failure createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new Failure((ErrorMessage) parcel.readParcelable(Failure.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Failure[] newArray(int i11) {
                    return new Failure[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failure(ErrorMessage error) {
                super(null);
                s.g(error, "error");
                this.error = error;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final ErrorMessage getError() {
                return this.error;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeParcelable(this.error, i11);
            }
        }

        /* loaded from: classes6.dex */
        public static final class Success extends Result {
            public static final Success INSTANCE = new Success();
            public static final Parcelable.Creator<Success> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Success> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Success createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return Success.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Success[] newArray(int i11) {
                    return new Success[i11];
                }
            }

            private Success() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        private Result() {
        }

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CardEditViewModel(LinkAccount linkAccount, LinkRepository linkRepository, Navigator navigator, Logger logger, Provider<FormControllerSubcomponent.Builder> formControllerProvider) {
        k a11;
        s.g(linkAccount, "linkAccount");
        s.g(linkRepository, "linkRepository");
        s.g(navigator, "navigator");
        s.g(logger, "logger");
        s.g(formControllerProvider, "formControllerProvider");
        this.linkAccount = linkAccount;
        this.linkRepository = linkRepository;
        this.navigator = navigator;
        this.logger = logger;
        this.formControllerProvider = formControllerProvider;
        a11 = m.a(new CardEditViewModel$isDefault$2(this));
        this.isDefault$delegate = a11;
        Boolean bool = Boolean.FALSE;
        final u<Boolean> a12 = j0.a(bool);
        this._isProcessing = a12;
        this.isProcessing = a12;
        this.isEnabled = new e<Boolean>() { // from class: com.stripe.android.link.ui.cardedit.CardEditViewModel$special$$inlined$map$1

            /* renamed from: com.stripe.android.link.ui.cardedit.CardEditViewModel$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f {
                final /* synthetic */ f $this_unsafeFlow;

                @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.link.ui.cardedit.CardEditViewModel$special$$inlined$map$1$2", f = "CardEditViewModel.kt", l = {224}, m = "emit")
                /* renamed from: com.stripe.android.link.ui.cardedit.CardEditViewModel$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(zz.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar) {
                    this.$this_unsafeFlow = fVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // kotlinx.coroutines.flow.f
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r5, zz.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.stripe.android.link.ui.cardedit.CardEditViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.stripe.android.link.ui.cardedit.CardEditViewModel$special$$inlined$map$1$2$1 r0 = (com.stripe.android.link.ui.cardedit.CardEditViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.stripe.android.link.ui.cardedit.CardEditViewModel$special$$inlined$map$1$2$1 r0 = new com.stripe.android.link.ui.cardedit.CardEditViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = a00.b.d()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        vz.r.b(r6)
                        goto L4a
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        vz.r.b(r6)
                        kotlinx.coroutines.flow.f r6 = r4.$this_unsafeFlow
                        java.lang.Boolean r5 = (java.lang.Boolean) r5
                        boolean r5 = r5.booleanValue()
                        r5 = r5 ^ r3
                        java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L4a
                        return r1
                    L4a:
                        vz.b0 r5 = vz.b0.f54756a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.ui.cardedit.CardEditViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, zz.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(f<? super Boolean> fVar, zz.d dVar) {
                Object d11;
                Object collect = e.this.collect(new AnonymousClass2(fVar), dVar);
                d11 = a00.d.d();
                return collect == d11 ? collect : b0.f54756a;
            }
        };
        this.formController = j0.a(null);
        u<ErrorMessage> a13 = j0.a(null);
        this._errorMessage = a13;
        this.errorMessage = a13;
        u<Boolean> a14 = j0.a(bool);
        this._setAsDefault = a14;
        this.setAsDefault = a14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<IdentifierSpec, String> buildInitialFormValues(ConsumerPaymentDetails.Card card) {
        Map<IdentifierSpec, String> l11;
        IdentifierSpec.Companion companion = IdentifierSpec.Companion;
        l11 = wz.s0.l(v.a(companion.getCardNumber(), s.p("•••• ", card.getLast4())), v.a(companion.getCardBrand(), card.getBrand().getCode()), v.a(companion.getCardExpMonth(), String.valueOf(card.getExpiryMonth())), v.a(companion.getCardExpYear(), String.valueOf(card.getExpiryYear())));
        return l11;
    }

    private final void clearError() {
        this._errorMessage.setValue(null);
    }

    public static /* synthetic */ void dismiss$default(CardEditViewModel cardEditViewModel, Result result, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            result = Result.Cancelled.INSTANCE;
        }
        cardEditViewModel.dismiss(result);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(Throwable th2) {
        ErrorMessage errorMessage = ErrorMessageKt.getErrorMessage(th2);
        this.logger.error("Error: ", th2);
        this._isProcessing.setValue(Boolean.FALSE);
        this._errorMessage.setValue(errorMessage);
    }

    public final void dismiss(Result result) {
        s.g(result, "result");
        this.navigator.setResult(Result.KEY, result);
        this.navigator.onBack();
    }

    public final h0<ErrorMessage> getErrorMessage() {
        return this.errorMessage;
    }

    public final u<FormController> getFormController() {
        return this.formController;
    }

    public final LinkAccount getLinkAccount() {
        return this.linkAccount;
    }

    public final ConsumerPaymentDetails.PaymentDetails getPaymentDetails() {
        ConsumerPaymentDetails.PaymentDetails paymentDetails = this.paymentDetails;
        if (paymentDetails != null) {
            return paymentDetails;
        }
        s.x("paymentDetails");
        return null;
    }

    public final h0<Boolean> getSetAsDefault() {
        return this.setAsDefault;
    }

    public final void initWithPaymentDetailsId(String paymentDetailsId) {
        s.g(paymentDetailsId, "paymentDetailsId");
        v20.k.d(q0.a(this), null, null, new CardEditViewModel$initWithPaymentDetailsId$1(this, paymentDetailsId, null), 3, null);
    }

    public final boolean isDefault() {
        return ((Boolean) this.isDefault$delegate.getValue()).booleanValue();
    }

    public final e<Boolean> isEnabled() {
        return this.isEnabled;
    }

    public final h0<Boolean> isProcessing() {
        return this.isProcessing;
    }

    public final void setAsDefault(boolean z11) {
        this._setAsDefault.setValue(Boolean.valueOf(z11));
    }

    public final void setPaymentDetails(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        s.g(paymentDetails, "<set-?>");
        this.paymentDetails = paymentDetails;
    }

    public final void updateCard(Map<IdentifierSpec, FormFieldEntry> formValues) {
        s.g(formValues, "formValues");
        clearError();
        this._isProcessing.setValue(Boolean.TRUE);
        v20.k.d(q0.a(this), null, null, new CardEditViewModel$updateCard$1(this, FieldValuesToParamsMapConverter.Companion.transformToPaymentMethodCreateParams(formValues, PaymentMethod.Type.Card), null), 3, null);
    }
}