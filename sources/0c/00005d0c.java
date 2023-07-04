package com.stripe.android.view;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.view.PostalCodeEditText;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class PostalCodeEditText extends StripeEditText {
    @Deprecated
    private static final int MAX_LENGTH_US = 5;
    private final kotlin.properties.c config$delegate;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(PostalCodeEditText.class, "config", "getConfig$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText$Config;", 0))};
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @Deprecated
    private static final Pattern ZIP_CODE_PATTERN = Pattern.compile("^[0-9]{5}$");

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public enum Config {
        Global,
        US
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Config.values().length];
            iArr[Config.Global.ordinal()] = 1;
            iArr[Config.US.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostalCodeEditText(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostalCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ PostalCodeEditText(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? g.a.A : i11);
    }

    public static final /* synthetic */ void access$configureForGlobal(PostalCodeEditText postalCodeEditText) {
        postalCodeEditText.configureForGlobal();
    }

    public static final /* synthetic */ void access$configureForUs(PostalCodeEditText postalCodeEditText) {
        postalCodeEditText.configureForUs();
    }

    public final void configureForGlobal() {
        updateHint(R.string.address_label_postal_code);
        setKeyListener(TextKeyListener.getInstance());
        setInputType(112);
        setFilters(new InputFilter[0]);
    }

    public final void configureForUs() {
        updateHint(R.string.address_label_zip_code);
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(5)});
        setKeyListener(DigitsKeyListener.getInstance(false, true));
        setNumberOnlyInputType();
    }

    private final TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private final void updateHint(int i11) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null) {
            return;
        }
        if (textInputLayout.isHintEnabled()) {
            textInputLayout.setHint(getResources().getString(i11));
        } else {
            setHint(i11);
        }
    }

    public final Config getConfig$payments_core_release() {
        return (Config) this.config$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final String getPostalCode$payments_core_release() {
        if (getConfig$payments_core_release() == Config.US) {
            String fieldText$payments_core_release = getFieldText$payments_core_release();
            if (ZIP_CODE_PATTERN.matcher(getFieldText$payments_core_release()).matches()) {
                return fieldText$payments_core_release;
            }
            return null;
        }
        return getFieldText$payments_core_release();
    }

    public final boolean hasValidPostal$payments_core_release() {
        if (getConfig$payments_core_release() == Config.US && ZIP_CODE_PATTERN.matcher(getFieldText$payments_core_release()).matches()) {
            return true;
        }
        if (getConfig$payments_core_release() == Config.Global) {
            if (getFieldText$payments_core_release().length() > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        configureForGlobal();
    }

    public final void setConfig$payments_core_release(Config config) {
        kotlin.jvm.internal.s.g(config, "<set-?>");
        this.config$delegate.setValue(this, $$delegatedProperties[0], config);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostalCodeEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.properties.a aVar = kotlin.properties.a.f34932a;
        this.config$delegate = new kotlin.properties.b<Config>(Config.Global) { // from class: com.stripe.android.view.PostalCodeEditText$special$$inlined$observable$1
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, PostalCodeEditText.Config config, PostalCodeEditText.Config config2) {
                kotlin.jvm.internal.s.g(property, "property");
                int i12 = PostalCodeEditText.WhenMappings.$EnumSwitchMapping$0[config2.ordinal()];
                if (i12 == 1) {
                    PostalCodeEditText.access$configureForGlobal(this);
                } else if (i12 != 2) {
                } else {
                    PostalCodeEditText.access$configureForUs(this);
                }
            }
        };
        setErrorMessage(getResources().getString(R.string.invalid_zip));
        setMaxLines(1);
        addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.PostalCodeEditText$special$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                PostalCodeEditText.this.setShouldShowError(false);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"postalCode"});
        }
    }
}