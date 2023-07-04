package com.stripe.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class CountryTextInputLayout extends TextInputLayout {
    @Deprecated
    public static final int INVALID_COUNTRY_AUTO_COMPLETE_STYLE = 0;
    private CountryAdapter countryAdapter;
    private int countryAutoCompleteStyleRes;
    private final AutoCompleteTextView countryAutocomplete;
    private /* synthetic */ h00.l<? super Country, vz.b0> countryChangeCallback;
    private /* synthetic */ h00.l<? super CountryCode, vz.b0> countryCodeChangeCallback;
    private int itemLayoutRes;
    private final kotlin.properties.c selectedCountryCode$delegate;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(CountryTextInputLayout.class, "selectedCountryCode", "getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;", 0))};
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @Deprecated
    private static final int DEFAULT_ITEM_LAYOUT = R.layout.country_text_view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.CountryTextInputLayout$2 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.u implements h00.l<ViewGroup, TextView> {
        final /* synthetic */ Context $context;
        final /* synthetic */ CountryTextInputLayout this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context, CountryTextInputLayout countryTextInputLayout) {
            super(1);
            this.$context = context;
            this.this$0 = countryTextInputLayout;
        }

        @Override // h00.l
        public final TextView invoke(ViewGroup it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            View inflate = LayoutInflater.from(this.$context).inflate(this.this$0.itemLayoutRes, it2, false);
            Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.widget.TextView");
            return (TextView) inflate;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.CountryTextInputLayout$5 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass5 extends kotlin.jvm.internal.u implements h00.l<Country, vz.b0> {
        final /* synthetic */ String $errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(String str) {
            super(1);
            CountryTextInputLayout.this = r1;
            this.$errorMessage = str;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Country country) {
            invoke2(country);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(Country country) {
            CountryTextInputLayout.this.setSelectedCountryCode$payments_core_release(country == null ? null : country.getCode());
            if (country != null) {
                CountryTextInputLayout.this.clearError();
                return;
            }
            CountryTextInputLayout.this.setError(this.$errorMessage);
            CountryTextInputLayout.this.setErrorEnabled(true);
        }
    }

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDEFAULT_ITEM_LAYOUT() {
            return CountryTextInputLayout.DEFAULT_ITEM_LAYOUT;
        }
    }

    /* loaded from: classes6.dex */
    public static final class SelectedCountryState implements Parcelable {
        public static final Parcelable.Creator<SelectedCountryState> CREATOR = new Creator();
        private final CountryCode countryCode;
        private final Parcelable superState;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<SelectedCountryState> {
            @Override // android.os.Parcelable.Creator
            public final SelectedCountryState createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new SelectedCountryState((CountryCode) parcel.readParcelable(SelectedCountryState.class.getClassLoader()), parcel.readParcelable(SelectedCountryState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SelectedCountryState[] newArray(int i11) {
                return new SelectedCountryState[i11];
            }
        }

        public SelectedCountryState(CountryCode countryCode, Parcelable parcelable) {
            kotlin.jvm.internal.s.g(countryCode, "countryCode");
            this.countryCode = countryCode;
            this.superState = parcelable;
        }

        public static /* synthetic */ SelectedCountryState copy$default(SelectedCountryState selectedCountryState, CountryCode countryCode, Parcelable parcelable, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                countryCode = selectedCountryState.countryCode;
            }
            if ((i11 & 2) != 0) {
                parcelable = selectedCountryState.superState;
            }
            return selectedCountryState.copy(countryCode, parcelable);
        }

        public final CountryCode component1() {
            return this.countryCode;
        }

        public final Parcelable component2() {
            return this.superState;
        }

        public final SelectedCountryState copy(CountryCode countryCode, Parcelable parcelable) {
            kotlin.jvm.internal.s.g(countryCode, "countryCode");
            return new SelectedCountryState(countryCode, parcelable);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SelectedCountryState) {
                SelectedCountryState selectedCountryState = (SelectedCountryState) obj;
                return kotlin.jvm.internal.s.c(this.countryCode, selectedCountryState.countryCode) && kotlin.jvm.internal.s.c(this.superState, selectedCountryState.superState);
            }
            return false;
        }

        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        public final Parcelable getSuperState() {
            return this.superState;
        }

        public int hashCode() {
            int hashCode = this.countryCode.hashCode() * 31;
            Parcelable parcelable = this.superState;
            return hashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        public String toString() {
            return "SelectedCountryState(countryCode=" + this.countryCode + ", superState=" + this.superState + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeParcelable(this.countryCode, i11);
            out.writeParcelable(this.superState, i11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountryTextInputLayout(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountryTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ CountryTextInputLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? fk.b.O : i11);
    }

    /* renamed from: _init_$lambda-5 */
    public static final void m521_init_$lambda5(CountryTextInputLayout this$0, AdapterView adapterView, View view, int i11, long j11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.updatedSelectedCountryCode$payments_core_release(this$0.countryAdapter.getItem(i11).getCode());
    }

    /* renamed from: _init_$lambda-8 */
    public static final void m522_init_$lambda8(CountryTextInputLayout this$0, View view, boolean z11) {
        vz.b0 b0Var;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (z11) {
            this$0.countryAutocomplete.showDropDown();
            return;
        }
        String obj = this$0.countryAutocomplete.getText().toString();
        CountryUtils countryUtils = CountryUtils.INSTANCE;
        CountryCode countryCodeByName = countryUtils.getCountryCodeByName(obj, this$0.getLocale());
        if (countryCodeByName == null) {
            b0Var = null;
        } else {
            this$0.updateUiForCountryEntered(countryCodeByName);
            b0Var = vz.b0.f54756a;
        }
        if (b0Var == null) {
            CountryCode.Companion companion = CountryCode.Companion;
            if (countryUtils.getCountryByCode(companion.create(obj), this$0.getLocale()) == null) {
                return;
            }
            this$0.updateUiForCountryEntered(companion.create(obj));
        }
    }

    public static /* synthetic */ void a(CountryTextInputLayout countryTextInputLayout, View view, boolean z11) {
        m522_init_$lambda8(countryTextInputLayout, view, z11);
    }

    public static /* synthetic */ void b(CountryTextInputLayout countryTextInputLayout, AdapterView adapterView, View view, int i11, long j11) {
        m521_init_$lambda5(countryTextInputLayout, adapterView, view, i11, j11);
    }

    public final void clearError() {
        setError(null);
        setErrorEnabled(false);
    }

    public static /* synthetic */ void getCountryAutocomplete$annotations() {
    }

    public static /* synthetic */ void getCountryChangeCallback$payments_core_release$annotations() {
    }

    public final Locale getLocale() {
        Locale c11 = r3.d.a(getContext().getResources().getConfiguration()).c(0);
        kotlin.jvm.internal.s.f(c11, "ConfigurationCompat.getL…sources.configuration)[0]");
        return c11;
    }

    public static /* synthetic */ void getSelectedCountryCode$payments_core_release$annotations() {
    }

    private final AutoCompleteTextView initializeCountryAutoCompleteWithStyle() {
        if (this.countryAutoCompleteStyleRes == 0) {
            return new AutoCompleteTextView(getContext(), null, R.attr.autoCompleteTextViewStyle);
        }
        return new AutoCompleteTextView(getContext(), null, 0, this.countryAutoCompleteStyleRes);
    }

    private final void updateInitialCountry() {
        Country firstItem$payments_core_release = this.countryAdapter.getFirstItem$payments_core_release();
        this.countryAutocomplete.setText(firstItem$payments_core_release.getName());
        setSelectedCountryCode$payments_core_release(firstItem$payments_core_release.getCode());
    }

    public final AutoCompleteTextView getCountryAutocomplete() {
        return this.countryAutocomplete;
    }

    public final h00.l<Country, vz.b0> getCountryChangeCallback$payments_core_release() {
        return this.countryChangeCallback;
    }

    public final h00.l<CountryCode, vz.b0> getCountryCodeChangeCallback() {
        return this.countryCodeChangeCallback;
    }

    public final Country getSelectedCountry$payments_core_release() {
        CountryCode selectedCountryCode$payments_core_release = getSelectedCountryCode$payments_core_release();
        if (selectedCountryCode$payments_core_release == null) {
            return null;
        }
        return CountryUtils.INSTANCE.getCountryByCode(selectedCountryCode$payments_core_release, getLocale());
    }

    public final CountryCode getSelectedCountryCode() {
        return getSelectedCountryCode$payments_core_release();
    }

    public final CountryCode getSelectedCountryCode$payments_core_release() {
        return (CountryCode) this.selectedCountryCode$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SelectedCountryState) {
            restoreSelectedCountry$payments_core_release((SelectedCountryState) parcelable);
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public Parcelable onSaveInstanceState() {
        Country selectedCountry$payments_core_release = getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release == null) {
            return super.onSaveInstanceState();
        }
        return new SelectedCountryState(selectedCountry$payments_core_release.getCode(), super.onSaveInstanceState());
    }

    public final void restoreSelectedCountry$payments_core_release(SelectedCountryState state) {
        kotlin.jvm.internal.s.g(state, "state");
        super.onRestoreInstanceState(state.getSuperState());
        CountryCode countryCode = state.getCountryCode();
        updatedSelectedCountryCode$payments_core_release(countryCode);
        updateUiForCountryEntered(countryCode);
        requestLayout();
    }

    public final void setAllowedCountryCodes$payments_core_release(Set<String> allowedCountryCodes) {
        kotlin.jvm.internal.s.g(allowedCountryCodes, "allowedCountryCodes");
        if (this.countryAdapter.updateUnfilteredCountries$payments_core_release(allowedCountryCodes)) {
            updateInitialCountry();
        }
    }

    public final void setCountryChangeCallback$payments_core_release(h00.l<? super Country, vz.b0> lVar) {
        kotlin.jvm.internal.s.g(lVar, "<set-?>");
        this.countryChangeCallback = lVar;
    }

    public final void setCountryCodeChangeCallback(h00.l<? super CountryCode, vz.b0> lVar) {
        kotlin.jvm.internal.s.g(lVar, "<set-?>");
        this.countryCodeChangeCallback = lVar;
    }

    public final void setCountrySelected$payments_core_release(CountryCode countryCode) {
        kotlin.jvm.internal.s.g(countryCode, "countryCode");
        updateUiForCountryEntered(countryCode);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public void setEnabled(final boolean z11) {
        super.setEnabled(z11);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.stripe.android.view.CountryTextInputLayout$setEnabled$$inlined$doOnNextLayout$1
            {
                CountryTextInputLayout.this = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                kotlin.jvm.internal.s.g(view, "view");
                view.removeOnLayoutChangeListener(this);
                CountryTextInputLayout.this.getCountryAutocomplete().setEnabled(z11);
            }
        });
    }

    public final void setSelectedCountryCode(CountryCode countryCode) {
        setSelectedCountryCode$payments_core_release(countryCode);
    }

    public final void setSelectedCountryCode$payments_core_release(CountryCode countryCode) {
        this.selectedCountryCode$delegate.setValue(this, $$delegatedProperties[0], countryCode);
    }

    public final void updateUiForCountryEntered(CountryCode countryCode) {
        kotlin.jvm.internal.s.g(countryCode, "countryCode");
        CountryUtils countryUtils = CountryUtils.INSTANCE;
        Country countryByCode = countryUtils.getCountryByCode(countryCode, getLocale());
        if (countryByCode == null) {
            countryByCode = null;
        } else {
            updatedSelectedCountryCode$payments_core_release(countryCode);
        }
        if (countryByCode == null) {
            countryByCode = countryUtils.getCountryByCode(getSelectedCountryCode$payments_core_release(), getLocale());
        }
        this.countryAutocomplete.setText(countryByCode != null ? countryByCode.getName() : null);
    }

    public final void updatedSelectedCountryCode$payments_core_release(CountryCode countryCode) {
        kotlin.jvm.internal.s.g(countryCode, "countryCode");
        clearError();
        if (kotlin.jvm.internal.s.c(getSelectedCountryCode$payments_core_release(), countryCode)) {
            return;
        }
        setSelectedCountryCode$payments_core_release(countryCode);
    }

    public final void validateCountry$payments_core_release() {
        this.countryAutocomplete.performValidation();
    }

    public final void setCountrySelected$payments_core_release(String countryCode) {
        kotlin.jvm.internal.s.g(countryCode, "countryCode");
        updateUiForCountryEntered(CountryCode.Companion.create(countryCode));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryTextInputLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        int i12 = DEFAULT_ITEM_LAYOUT;
        this.itemLayoutRes = i12;
        kotlin.properties.a aVar = kotlin.properties.a.f34932a;
        this.selectedCountryCode$delegate = new kotlin.properties.b<CountryCode>(null) { // from class: com.stripe.android.view.CountryTextInputLayout$special$$inlined$observable$1
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, CountryCode countryCode, CountryCode countryCode2) {
                Locale locale;
                kotlin.jvm.internal.s.g(property, "property");
                CountryCode countryCode3 = countryCode2;
                if (countryCode3 == null) {
                    return;
                }
                this.getCountryCodeChangeCallback().invoke(countryCode3);
                CountryUtils countryUtils = CountryUtils.INSTANCE;
                locale = this.getLocale();
                Country countryByCode = countryUtils.getCountryByCode(countryCode3, locale);
                if (countryByCode == null) {
                    return;
                }
                this.getCountryChangeCallback$payments_core_release().invoke(countryByCode);
            }
        };
        this.countryChangeCallback = CountryTextInputLayout$countryChangeCallback$1.INSTANCE;
        this.countryCodeChangeCallback = CountryTextInputLayout$countryCodeChangeCallback$1.INSTANCE;
        int[] StripeCountryAutoCompleteTextInputLayout = R.styleable.StripeCountryAutoCompleteTextInputLayout;
        kotlin.jvm.internal.s.f(StripeCountryAutoCompleteTextInputLayout, "StripeCountryAutoCompleteTextInputLayout");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, StripeCountryAutoCompleteTextInputLayout, 0, 0);
        kotlin.jvm.internal.s.f(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        this.countryAutoCompleteStyleRes = obtainStyledAttributes.getResourceId(R.styleable.StripeCountryAutoCompleteTextInputLayout_countryAutoCompleteStyle, 0);
        this.itemLayoutRes = obtainStyledAttributes.getResourceId(R.styleable.StripeCountryAutoCompleteTextInputLayout_countryItemLayout, i12);
        obtainStyledAttributes.recycle();
        AutoCompleteTextView initializeCountryAutoCompleteWithStyle = initializeCountryAutoCompleteWithStyle();
        this.countryAutocomplete = initializeCountryAutoCompleteWithStyle;
        addView(initializeCountryAutoCompleteWithStyle, new LinearLayout.LayoutParams(-1, -2));
        this.countryAdapter = new CountryAdapter(context, CountryUtils.INSTANCE.getOrderedCountries(getLocale()), this.itemLayoutRes, new AnonymousClass2(context, this));
        initializeCountryAutoCompleteWithStyle.setThreshold(0);
        initializeCountryAutoCompleteWithStyle.setAdapter(this.countryAdapter);
        initializeCountryAutoCompleteWithStyle.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.stripe.android.view.r
            {
                CountryTextInputLayout.this = this;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i13, long j11) {
                CountryTextInputLayout.b(CountryTextInputLayout.this, adapterView, view, i13, j11);
            }
        });
        initializeCountryAutoCompleteWithStyle.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.q
            {
                CountryTextInputLayout.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CountryTextInputLayout.a(CountryTextInputLayout.this, view, z11);
            }
        });
        setSelectedCountryCode$payments_core_release(this.countryAdapter.getFirstItem$payments_core_release().getCode());
        updateInitialCountry();
        String string = getResources().getString(R.string.address_country_invalid);
        kotlin.jvm.internal.s.f(string, "resources.getString(R.st….address_country_invalid)");
        initializeCountryAutoCompleteWithStyle.setValidator(new CountryAutoCompleteTextViewValidator(this.countryAdapter, new AnonymousClass5(string)));
    }
}