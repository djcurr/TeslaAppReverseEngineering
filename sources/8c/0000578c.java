package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.f0;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.model.Address;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.databinding.StripeBillingAddressLayoutBinding;
import com.stripe.android.paymentsheet.ui.BillingAddressView;
import com.stripe.android.view.CountryTextInputLayout;
import com.stripe.android.view.PostalCodeValidator;
import com.stripe.android.view.StripeEditText;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.z;
import kotlin.reflect.KProperty;
import kotlin.text.v;
import vz.b0;
import wz.x0;

/* loaded from: classes6.dex */
public final class BillingAddressView extends FrameLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {m0.f(new z(BillingAddressView.class, "level", "getLevel$paymentsheet_release()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;", 0)), m0.f(new z(BillingAddressView.class, "postalCodeConfig", "getPostalCodeConfig()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;", 0))};
    private final f0<Address> _address;
    private final LiveData<Address> address;
    private final TextInputEditText address1View;
    private final TextInputEditText address2View;
    private final Set<EditText> allFields;
    private final TextInputLayout cityLayout;
    private final LinearLayout cityPostalContainer;
    private final TextInputEditText cityView;
    private final CountryTextInputLayout countryLayout;
    private final AutoCompleteTextView countryView;
    private final kotlin.properties.c level$delegate;
    private final h00.l<CountryCode, b0> newCountryCodeCallback;
    private h00.a<b0> onFocus;
    private final kotlin.properties.c postalCodeConfig$delegate;
    private final TextInputLayout postalCodeLayout;
    private final PostalCodeValidator postalCodeValidator;
    private final StripeEditText postalCodeView;
    private PostalCodeViewListener postalCodeViewListener;
    private final Set<View> requiredViews;
    private final TextInputLayout stateLayout;
    private final TextInputEditText stateView;
    private final StripeBillingAddressLayoutBinding viewBinding;

    /* loaded from: classes6.dex */
    public enum BillingAddressCollectionLevel {
        Automatic,
        Required
    }

    /* loaded from: classes6.dex */
    public static abstract class PostalCodeConfig {

        /* loaded from: classes6.dex */
        public static final class Global extends PostalCodeConfig {
            public static final int $stable = 0;
            public static final Global INSTANCE = new Global();
            private static final int maxLength = 13;
            private static final int inputType = 112;

            private Global() {
                super(null);
            }

            @Override // com.stripe.android.paymentsheet.ui.BillingAddressView.PostalCodeConfig
            public int getInputType() {
                return inputType;
            }

            @Override // com.stripe.android.paymentsheet.ui.BillingAddressView.PostalCodeConfig
            public KeyListener getKeyListener() {
                TextKeyListener textKeyListener = TextKeyListener.getInstance();
                s.f(textKeyListener, "getInstance()");
                return textKeyListener;
            }

            @Override // com.stripe.android.paymentsheet.ui.BillingAddressView.PostalCodeConfig
            public int getMaxLength() {
                return maxLength;
            }
        }

        /* loaded from: classes6.dex */
        public static final class UnitedStates extends PostalCodeConfig {
            public static final int $stable = 0;
            public static final UnitedStates INSTANCE = new UnitedStates();
            private static final int maxLength = 5;
            private static final int inputType = 18;

            private UnitedStates() {
                super(null);
            }

            @Override // com.stripe.android.paymentsheet.ui.BillingAddressView.PostalCodeConfig
            public int getInputType() {
                return inputType;
            }

            @Override // com.stripe.android.paymentsheet.ui.BillingAddressView.PostalCodeConfig
            public KeyListener getKeyListener() {
                DigitsKeyListener digitsKeyListener = DigitsKeyListener.getInstance(false, true);
                s.f(digitsKeyListener, "getInstance(false, true)");
                return digitsKeyListener;
            }

            @Override // com.stripe.android.paymentsheet.ui.BillingAddressView.PostalCodeConfig
            public int getMaxLength() {
                return maxLength;
            }
        }

        private PostalCodeConfig() {
        }

        public /* synthetic */ PostalCodeConfig(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int getInputType();

        public abstract KeyListener getKeyListener();

        public abstract int getMaxLength();
    }

    /* loaded from: classes6.dex */
    public interface PostalCodeViewListener {
        void onCountryChanged(Country country, boolean z11);

        void onGainingFocus(Country country, boolean z11);

        void onLosingFocus(Country country, boolean z11);
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BillingAddressCollectionLevel.values().length];
            iArr[BillingAddressCollectionLevel.Automatic.ordinal()] = 1;
            iArr[BillingAddressCollectionLevel.Required.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BillingAddressView(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BillingAddressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ BillingAddressView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0064  */
    /* renamed from: _init_$lambda-9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m344_init_$lambda9(com.stripe.android.paymentsheet.ui.BillingAddressView r5, android.view.View r6, boolean r7) {
        /*
            java.lang.String r6 = "this$0"
            kotlin.jvm.internal.s.g(r5, r6)
            com.stripe.android.view.CountryTextInputLayout r6 = r5.countryLayout
            com.stripe.android.core.model.CountryCode r6 = r6.getSelectedCountryCode()
            r0 = 0
            if (r6 != 0) goto L10
            r6 = r0
            goto L26
        L10:
            com.stripe.android.view.PostalCodeValidator r1 = r5.postalCodeValidator
            com.stripe.android.view.StripeEditText r2 = r5.getPostalCodeView$paymentsheet_release()
            java.lang.String r2 = r5.getValue(r2)
            if (r2 != 0) goto L1e
            java.lang.String r2 = ""
        L1e:
            java.lang.String r6 = r6.getValue()
            boolean r6 = r1.isValid(r2, r6)
        L26:
            com.stripe.android.view.StripeEditText r1 = r5.postalCodeView
            r2 = 1
            if (r7 != 0) goto L41
            java.lang.String r3 = r5.getValue(r1)
            if (r3 == 0) goto L3a
            boolean r3 = kotlin.text.m.w(r3)
            if (r3 == 0) goto L38
            goto L3a
        L38:
            r3 = r0
            goto L3b
        L3a:
            r3 = r2
        L3b:
            if (r3 != 0) goto L41
            if (r6 != 0) goto L41
            r3 = r2
            goto L42
        L41:
            r3 = r0
        L42:
            r1.setShouldShowError(r3)
            r1 = 0
            if (r7 == 0) goto L64
            com.stripe.android.paymentsheet.ui.BillingAddressView$PostalCodeViewListener r7 = r5.postalCodeViewListener
            if (r7 != 0) goto L4d
            goto L99
        L4d:
            com.stripe.android.view.CountryTextInputLayout r0 = r5.countryLayout
            com.stripe.android.core.model.CountryCode r0 = r0.getSelectedCountryCode()
            if (r0 != 0) goto L56
            goto L60
        L56:
            com.stripe.android.core.model.CountryUtils r1 = com.stripe.android.core.model.CountryUtils.INSTANCE
            java.util.Locale r5 = r5.getLocale()
            com.stripe.android.core.model.Country r1 = r1.getCountryByCode(r0, r5)
        L60:
            r7.onGainingFocus(r1, r6)
            goto L99
        L64:
            com.stripe.android.paymentsheet.ui.BillingAddressView$PostalCodeViewListener r7 = r5.postalCodeViewListener
            if (r7 != 0) goto L69
            goto L7f
        L69:
            com.stripe.android.view.CountryTextInputLayout r3 = r5.countryLayout
            com.stripe.android.core.model.CountryCode r3 = r3.getSelectedCountryCode()
            if (r3 != 0) goto L72
            goto L7c
        L72:
            com.stripe.android.core.model.CountryUtils r1 = com.stripe.android.core.model.CountryUtils.INSTANCE
            java.util.Locale r4 = r5.getLocale()
            com.stripe.android.core.model.Country r1 = r1.getCountryByCode(r3, r4)
        L7c:
            r7.onLosingFocus(r1, r6)
        L7f:
            com.stripe.android.view.StripeEditText r7 = r5.postalCodeView
            java.lang.String r5 = r5.getValue(r7)
            if (r5 == 0) goto L90
            boolean r5 = kotlin.text.m.w(r5)
            if (r5 == 0) goto L8e
            goto L90
        L8e:
            r5 = r0
            goto L91
        L90:
            r5 = r2
        L91:
            if (r5 != 0) goto L96
            if (r6 != 0) goto L96
            r0 = r2
        L96:
            r7.setShouldShowError(r0)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.ui.BillingAddressView.m344_init_$lambda9(com.stripe.android.paymentsheet.ui.BillingAddressView, android.view.View, boolean):void");
    }

    public static /* synthetic */ void a(BillingAddressView billingAddressView, View view, boolean z11) {
        m344_init_$lambda9(billingAddressView, view, z11);
    }

    public static final /* synthetic */ void access$configureForLevel(BillingAddressView billingAddressView) {
        billingAddressView.configureForLevel();
    }

    public static final /* synthetic */ Address access$createAddress(BillingAddressView billingAddressView) {
        return billingAddressView.createAddress();
    }

    public static final /* synthetic */ f0 access$get_address$p(BillingAddressView billingAddressView) {
        return billingAddressView._address;
    }

    public static /* synthetic */ void b(BillingAddressView billingAddressView, View view, boolean z11) {
        m345lambda5$lambda4(billingAddressView, view, z11);
    }

    public final void configureForLevel() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[getLevel$paymentsheet_release().ordinal()];
        if (i11 == 1) {
            for (View it2 : this.requiredViews) {
                s.f(it2, "it");
                it2.setVisibility(8);
            }
        } else if (i11 == 2) {
            for (View it3 : this.requiredViews) {
                s.f(it3, "it");
                it3.setVisibility(0);
            }
        }
        this._address.setValue(createAddress());
    }

    public final Address createAddress() {
        Address build;
        CountryCode selectedCountryCode = this.countryLayout.getSelectedCountryCode();
        if (selectedCountryCode == null) {
            return null;
        }
        String value = getValue(getPostalCodeView$paymentsheet_release());
        if (this.postalCodeValidator.isValid(value == null ? "" : value, selectedCountryCode.getValue())) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[getLevel$paymentsheet_release().ordinal()];
            if (i11 == 1) {
                build = new Address.Builder().setCountryCode(selectedCountryCode).setPostalCode(value).build();
            } else if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                build = createRequiredAddress(selectedCountryCode, value);
            }
            return build;
        }
        return null;
    }

    private final Address createRequiredAddress(CountryCode countryCode, String str) {
        String value = getValue(this.address1View);
        String value2 = getValue(this.address2View);
        String value3 = getValue(this.cityView);
        String value4 = getValue(this.stateView);
        if (value == null || value3 == null) {
            return null;
        }
        if (isUnitedStates()) {
            if (value4 != null) {
                return new Address.Builder().setCountryCode(countryCode).setPostalCode(str).setLine1(value).setLine2(value2).setCity(value3).setState(value4).build();
            }
            return null;
        }
        return new Address.Builder().setCountryCode(countryCode).setPostalCode(str).setLine1(value).setLine2(value2).setCity(value3).build();
    }

    public static /* synthetic */ void getAddress1View$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getAddress2View$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getCityLayout$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getCityPostalContainer$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getCityView$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getCountryLayout$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getCountryView$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getLevel$paymentsheet_release$annotations() {
    }

    public final Locale getLocale() {
        Locale c11 = r3.d.a(getContext().getResources().getConfiguration()).c(0);
        s.e(c11);
        return c11;
    }

    private final PostalCodeConfig getPostalCodeConfig() {
        return (PostalCodeConfig) this.postalCodeConfig$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public static /* synthetic */ void getPostalCodeLayout$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getPostalCodeView$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getPostalCodeViewListener$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getStateLayout$paymentsheet_release$annotations() {
    }

    public static /* synthetic */ void getStateView$paymentsheet_release$annotations() {
    }

    public final String getValue(EditText editText) {
        Editable text;
        boolean w11;
        boolean z11 = true;
        if (!(editText.getVisibility() == 0)) {
            editText = null;
        }
        String obj = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
        if (obj != null) {
            w11 = v.w(obj);
            if (!w11) {
                z11 = false;
            }
        }
        if (z11) {
            return null;
        }
        return obj;
    }

    private final boolean isUnitedStates() {
        return CountryCode.Companion.isUS(this.countryLayout.getSelectedCountryCode());
    }

    /* renamed from: lambda-5$lambda-4 */
    public static final void m345lambda5$lambda4(BillingAddressView this$0, View view, boolean z11) {
        s.g(this$0, "this$0");
        if (z11) {
            this$0.onFocus.invoke();
        }
    }

    private final void setPostalCodeConfig(PostalCodeConfig postalCodeConfig) {
        this.postalCodeConfig$delegate.setValue(this, $$delegatedProperties[1], postalCodeConfig);
    }

    public final void updatePostalCodeView(CountryCode countryCode) {
        PostalCodeConfig postalCodeConfig;
        int i11;
        boolean z11 = true;
        boolean z12 = countryCode == null || CountryUtils.INSTANCE.doesCountryUsePostalCode(countryCode);
        this.postalCodeLayout.setVisibility(z12 ? 0 : 8);
        if (getLevel$paymentsheet_release() != BillingAddressCollectionLevel.Required && !z12) {
            z11 = false;
        }
        View view = this.viewBinding.cityPostalDivider;
        s.f(view, "viewBinding.cityPostalDivider");
        view.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout = this.viewBinding.cityPostalContainer;
        s.f(linearLayout, "viewBinding.cityPostalContainer");
        linearLayout.setVisibility(z11 ? 0 : 8);
        CountryCode.Companion companion = CountryCode.Companion;
        if (companion.isUS(countryCode)) {
            postalCodeConfig = PostalCodeConfig.UnitedStates.INSTANCE;
        } else {
            postalCodeConfig = PostalCodeConfig.Global.INSTANCE;
        }
        setPostalCodeConfig(postalCodeConfig);
        TextInputLayout textInputLayout = this.viewBinding.postalCodeLayout;
        Resources resources = getResources();
        if (companion.isUS(countryCode)) {
            i11 = R.string.acc_label_zip_short;
        } else {
            i11 = R.string.address_label_postal_code;
        }
        textInputLayout.setHint(resources.getString(i11));
    }

    public final void updateStateView(CountryCode countryCode) {
        int i11;
        CountryCode.Companion companion = CountryCode.Companion;
        if (companion.isUS(countryCode)) {
            i11 = R.string.address_label_state;
        } else if (companion.isCA(countryCode)) {
            i11 = R.string.address_label_province;
        } else if (companion.isGB(countryCode)) {
            i11 = R.string.address_label_county;
        } else {
            i11 = R.string.address_label_region_generic;
        }
        getStateLayout$paymentsheet_release().setHint(getResources().getString(i11));
    }

    public final void focusFirstField() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[getLevel$paymentsheet_release().ordinal()];
        if (i11 == 1) {
            this.postalCodeLayout.requestFocus();
        } else if (i11 != 2) {
        } else {
            this.viewBinding.address1Layout.requestFocus();
        }
    }

    public final LiveData<Address> getAddress$paymentsheet_release() {
        return this.address;
    }

    public final TextInputEditText getAddress1View$paymentsheet_release() {
        return this.address1View;
    }

    public final TextInputEditText getAddress2View$paymentsheet_release() {
        return this.address2View;
    }

    public final TextInputLayout getCityLayout$paymentsheet_release() {
        return this.cityLayout;
    }

    public final LinearLayout getCityPostalContainer$paymentsheet_release() {
        return this.cityPostalContainer;
    }

    public final TextInputEditText getCityView$paymentsheet_release() {
        return this.cityView;
    }

    public final CountryTextInputLayout getCountryLayout$paymentsheet_release() {
        return this.countryLayout;
    }

    public final AutoCompleteTextView getCountryView$paymentsheet_release() {
        return this.countryView;
    }

    public final BillingAddressCollectionLevel getLevel$paymentsheet_release() {
        return (BillingAddressCollectionLevel) this.level$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final h00.a<b0> getOnFocus$paymentsheet_release() {
        return this.onFocus;
    }

    public final TextInputLayout getPostalCodeLayout$paymentsheet_release() {
        return this.postalCodeLayout;
    }

    public final StripeEditText getPostalCodeView$paymentsheet_release() {
        return this.postalCodeView;
    }

    public final PostalCodeViewListener getPostalCodeViewListener$paymentsheet_release() {
        return this.postalCodeViewListener;
    }

    public final TextInputLayout getStateLayout$paymentsheet_release() {
        return this.stateLayout;
    }

    public final TextInputEditText getStateView$paymentsheet_release() {
        return this.stateView;
    }

    public final void populate$paymentsheet_release(Address address) {
        if (address == null) {
            return;
        }
        getPostalCodeView$paymentsheet_release().setText(address.getPostalCode());
        CountryCode countryCode = address.getCountryCode();
        if (countryCode != null) {
            getCountryLayout$paymentsheet_release().setSelectedCountryCode(countryCode);
            getCountryView$paymentsheet_release().setText(CountryUtils.INSTANCE.getDisplayCountry(countryCode, getLocale()));
        }
        getAddress1View$paymentsheet_release().setText(address.getLine1());
        getAddress2View$paymentsheet_release().setText(address.getLine2());
        getCityView$paymentsheet_release().setText(address.getCity());
        getStateView$paymentsheet_release().setText(address.getState());
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        Set<TextInputLayout> i11;
        super.setEnabled(z11);
        StripeBillingAddressLayoutBinding stripeBillingAddressLayoutBinding = this.viewBinding;
        i11 = x0.i(this.countryLayout, stripeBillingAddressLayoutBinding.address1Layout, stripeBillingAddressLayoutBinding.address2Layout, stripeBillingAddressLayoutBinding.cityLayout, this.postalCodeLayout, this.stateLayout);
        for (TextInputLayout textInputLayout : i11) {
            textInputLayout.setEnabled(z11);
        }
    }

    public final void setLevel$paymentsheet_release(BillingAddressCollectionLevel billingAddressCollectionLevel) {
        s.g(billingAddressCollectionLevel, "<set-?>");
        this.level$delegate.setValue(this, $$delegatedProperties[0], billingAddressCollectionLevel);
    }

    public final void setOnFocus$paymentsheet_release(h00.a<b0> aVar) {
        s.g(aVar, "<set-?>");
        this.onFocus = aVar;
    }

    public final void setPostalCodeViewListener$paymentsheet_release(PostalCodeViewListener postalCodeViewListener) {
        this.postalCodeViewListener = postalCodeViewListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingAddressView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Set<View> i12;
        Set<EditText> i13;
        s.g(context, "context");
        kotlin.properties.a aVar = kotlin.properties.a.f34932a;
        this.level$delegate = new kotlin.properties.b<BillingAddressCollectionLevel>(BillingAddressCollectionLevel.Automatic) { // from class: com.stripe.android.paymentsheet.ui.BillingAddressView$special$$inlined$observable$1
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, BillingAddressView.BillingAddressCollectionLevel billingAddressCollectionLevel, BillingAddressView.BillingAddressCollectionLevel billingAddressCollectionLevel2) {
                s.g(property, "property");
                if (billingAddressCollectionLevel != billingAddressCollectionLevel2) {
                    BillingAddressView.access$configureForLevel(this);
                }
            }
        };
        this.onFocus = BillingAddressView$onFocus$1.INSTANCE;
        StripeBillingAddressLayoutBinding inflate = StripeBillingAddressLayoutBinding.inflate(LayoutInflater.from(context), this);
        s.f(inflate, "inflate(\n        LayoutI…text),\n        this\n    )");
        this.viewBinding = inflate;
        this.postalCodeValidator = new PostalCodeValidator();
        f0<Address> f0Var = new f0<>(null);
        this._address = f0Var;
        this.address = f0Var;
        CountryTextInputLayout countryTextInputLayout = inflate.countryLayout;
        s.f(countryTextInputLayout, "viewBinding.countryLayout");
        this.countryLayout = countryTextInputLayout;
        AutoCompleteTextView countryAutocomplete = countryTextInputLayout.getCountryAutocomplete();
        this.countryView = countryAutocomplete;
        LinearLayout linearLayout = inflate.cityPostalContainer;
        s.f(linearLayout, "viewBinding.cityPostalContainer");
        this.cityPostalContainer = linearLayout;
        StripeEditText stripeEditText = inflate.postalCode;
        s.f(stripeEditText, "viewBinding.postalCode");
        this.postalCodeView = stripeEditText;
        TextInputLayout textInputLayout = inflate.postalCodeLayout;
        s.f(textInputLayout, "viewBinding.postalCodeLayout");
        this.postalCodeLayout = textInputLayout;
        TextInputEditText textInputEditText = inflate.address1;
        s.f(textInputEditText, "viewBinding.address1");
        this.address1View = textInputEditText;
        TextInputEditText textInputEditText2 = inflate.address2;
        s.f(textInputEditText2, "viewBinding.address2");
        this.address2View = textInputEditText2;
        TextInputLayout textInputLayout2 = inflate.cityLayout;
        s.f(textInputLayout2, "viewBinding.cityLayout");
        this.cityLayout = textInputLayout2;
        TextInputEditText textInputEditText3 = inflate.city;
        s.f(textInputEditText3, "viewBinding.city");
        this.cityView = textInputEditText3;
        TextInputEditText textInputEditText4 = inflate.state;
        s.f(textInputEditText4, "viewBinding.state");
        this.stateView = textInputEditText4;
        TextInputLayout textInputLayout3 = inflate.stateLayout;
        s.f(textInputLayout3, "viewBinding.stateLayout");
        this.stateLayout = textInputLayout3;
        this.postalCodeConfig$delegate = new kotlin.properties.b<PostalCodeConfig>(PostalCodeConfig.Global.INSTANCE) { // from class: com.stripe.android.paymentsheet.ui.BillingAddressView$special$$inlined$observable$2
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, BillingAddressView.PostalCodeConfig postalCodeConfig, BillingAddressView.PostalCodeConfig postalCodeConfig2) {
                s.g(property, "property");
                BillingAddressView.PostalCodeConfig postalCodeConfig3 = postalCodeConfig2;
                this.getPostalCodeView$paymentsheet_release().setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(postalCodeConfig3.getMaxLength())});
                this.getPostalCodeView$paymentsheet_release().setKeyListener(postalCodeConfig3.getKeyListener());
                if (postalCodeConfig3.getInputType() == 18) {
                    this.getPostalCodeView$paymentsheet_release().setNumberOnlyInputType();
                } else {
                    this.getPostalCodeView$paymentsheet_release().setInputType(postalCodeConfig3.getInputType());
                }
            }
        };
        BillingAddressView$newCountryCodeCallback$1 billingAddressView$newCountryCodeCallback$1 = new BillingAddressView$newCountryCodeCallback$1(this);
        this.newCountryCodeCallback = billingAddressView$newCountryCodeCallback$1;
        i12 = x0.i(inflate.address1Divider, inflate.address1Layout, textInputEditText, inflate.address2Divider, inflate.address2Layout, textInputEditText2, inflate.cityLayout, textInputEditText3, inflate.stateDivider, textInputLayout3, textInputEditText4);
        this.requiredViews = i12;
        i13 = x0.i(textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, stripeEditText, countryAutocomplete);
        this.allFields = i13;
        countryTextInputLayout.setCountryCodeChangeCallback(billingAddressView$newCountryCodeCallback$1);
        CountryCode selectedCountryCode = countryTextInputLayout.getSelectedCountryCode();
        if (selectedCountryCode != null) {
            billingAddressView$newCountryCodeCallback$1.invoke((BillingAddressView$newCountryCodeCallback$1) selectedCountryCode);
        }
        configureForLevel();
        for (EditText editText : i13) {
            editText.addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.paymentsheet.ui.BillingAddressView$_init_$lambda-5$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    BillingAddressView.access$get_address$p(BillingAddressView.this).setValue(BillingAddressView.access$createAddress(BillingAddressView.this));
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
                }
            });
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.stripe.android.paymentsheet.ui.p
                {
                    BillingAddressView.this = this;
                }

                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    BillingAddressView.b(BillingAddressView.this, view, z11);
                }
            });
        }
        this.postalCodeView.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.paymentsheet.ui.o
            {
                BillingAddressView.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                BillingAddressView.a(BillingAddressView.this, view, z11);
            }
        });
    }
}