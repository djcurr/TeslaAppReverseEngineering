package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import com.stripe.android.R;
import com.stripe.android.model.ExpirationDate;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import vz.q;

/* loaded from: classes6.dex */
public final class ExpiryDateEditText extends StripeEditText {
    @Deprecated
    private static final boolean INCLUDE_SEPARATOR_GAPS_DEFAULT = false;
    @Deprecated
    private static final int INVALID_INPUT = -1;
    @Deprecated
    private static final String SEPARATOR_WITHOUT_GAPS = "/";
    @Deprecated
    private static final String SEPARATOR_WITH_GAPS = " / ";
    private /* synthetic */ h00.a<vz.b0> completionCallback;
    private final int dateDigitsLength;
    private final kotlin.properties.c includeSeparatorGaps$delegate;
    private boolean isDateValid;
    private String separator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(ExpiryDateEditText.class, "includeSeparatorGaps", "getIncludeSeparatorGaps$payments_core_release()Z", 0))};
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ ExpiryDateEditText(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? g.a.A : i11);
    }

    /* renamed from: _init_$lambda-1 */
    public static final void m527_init_$lambda1(ExpiryDateEditText this$0, View view, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (z11) {
            return;
        }
        Editable text = this$0.getText();
        if ((text == null || text.length() == 0) || this$0.isDateValid) {
            return;
        }
        this$0.setShouldShowError(true);
    }

    public static final /* synthetic */ int access$getDateDigitsLength$p(ExpiryDateEditText expiryDateEditText) {
        return expiryDateEditText.dateDigitsLength;
    }

    public static final /* synthetic */ String access$getSeparator$p(ExpiryDateEditText expiryDateEditText) {
        return expiryDateEditText.separator;
    }

    public static final /* synthetic */ boolean access$isDateValid(ExpiryDateEditText expiryDateEditText, String str, String str2) {
        return expiryDateEditText.isDateValid(str, str2);
    }

    public static final /* synthetic */ void access$setDateValid$p(ExpiryDateEditText expiryDateEditText, boolean z11) {
        expiryDateEditText.isDateValid = z11;
    }

    public static final /* synthetic */ void access$updateSeparatorUi(ExpiryDateEditText expiryDateEditText, boolean z11) {
        expiryDateEditText.updateSeparatorUi(z11);
    }

    public static /* synthetic */ void c(ExpiryDateEditText expiryDateEditText, View view, boolean z11) {
        m527_init_$lambda1(expiryDateEditText, view, z11);
    }

    private final void listenForTextChanges() {
        addTextChangedListener(new StripeTextWatcher() { // from class: com.stripe.android.view.ExpiryDateEditText$listenForTextChanges$1
            private ExpirationDate.Unvalidated expirationDate = ExpirationDate.Unvalidated.Companion.getEMPTY();
            private String formattedDate;
            private int latestChangeStart;
            private int latestInsertionSize;
            private Integer newCursorPosition;

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                int i11;
                String str;
                int m11;
                boolean z11 = false;
                if (!ExpiryDateEditText.this.isLastKeyDelete() && (str = this.formattedDate) != null) {
                    ExpiryDateEditText.this.setTextSilent$payments_core_release(str);
                    Integer num = this.newCursorPosition;
                    if (num != null) {
                        ExpiryDateEditText expiryDateEditText = ExpiryDateEditText.this;
                        m11 = m00.l.m(num.intValue(), 0, expiryDateEditText.getFieldText$payments_core_release().length());
                        expiryDateEditText.setSelection(m11);
                    }
                }
                String month = this.expirationDate.getMonth();
                String year = this.expirationDate.getYear();
                boolean z12 = month.length() == 2 && !this.expirationDate.isMonthValid();
                if (month.length() == 2 && year.length() == 2) {
                    boolean isDateValid = ExpiryDateEditText.this.isDateValid();
                    ExpiryDateEditText expiryDateEditText2 = ExpiryDateEditText.this;
                    ExpiryDateEditText.access$setDateValid$p(expiryDateEditText2, ExpiryDateEditText.access$isDateValid(expiryDateEditText2, month, year));
                    boolean z13 = !ExpiryDateEditText.this.isDateValid();
                    if (!isDateValid && ExpiryDateEditText.this.isDateValid()) {
                        ExpiryDateEditText.this.getCompletionCallback$payments_core_release().invoke();
                    }
                    z12 = z13;
                } else {
                    ExpiryDateEditText.access$setDateValid$p(ExpiryDateEditText.this, false);
                }
                ExpiryDateEditText expiryDateEditText3 = ExpiryDateEditText.this;
                Resources resources = expiryDateEditText3.getResources();
                if (this.expirationDate.isPartialEntry$payments_core_release()) {
                    i11 = R.string.incomplete_expiry_date;
                } else if (!this.expirationDate.isMonthValid()) {
                    i11 = R.string.invalid_expiry_month;
                } else {
                    i11 = R.string.invalid_expiry_year;
                }
                expiryDateEditText3.setErrorMessage(resources.getString(i11));
                ExpiryDateEditText expiryDateEditText4 = ExpiryDateEditText.this;
                if (z12 && (this.expirationDate.isPartialEntry$payments_core_release() || this.expirationDate.isComplete$payments_core_release())) {
                    z11 = true;
                }
                expiryDateEditText4.setShouldShowError(z11);
                this.formattedDate = null;
                this.newCursorPosition = null;
            }

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
                this.latestChangeStart = i11;
                this.latestInsertionSize = i13;
            }

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
                String obj = charSequence == null ? null : charSequence.toString();
                if (obj == null) {
                    obj = "";
                }
                StringBuilder sb2 = new StringBuilder();
                int length = obj.length();
                for (int i14 = 0; i14 < length; i14++) {
                    char charAt = obj.charAt(i14);
                    if (Character.isDigit(charAt)) {
                        sb2.append(charAt);
                    }
                }
                String sb3 = sb2.toString();
                kotlin.jvm.internal.s.f(sb3, "filterTo(StringBuilder(), predicate).toString()");
                if (sb3.length() == 1 && this.latestChangeStart == 0 && this.latestInsertionSize == 1) {
                    char charAt2 = sb3.charAt(0);
                    if (charAt2 != '0' && charAt2 != '1') {
                        sb3 = kotlin.jvm.internal.s.p("0", sb3);
                        this.latestInsertionSize++;
                    }
                } else if (sb3.length() == 2 && this.latestChangeStart == 2 && this.latestInsertionSize == 0) {
                    sb3 = sb3.substring(0, 1);
                    kotlin.jvm.internal.s.f(sb3, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                ExpirationDate.Unvalidated create = ExpirationDate.Unvalidated.Companion.create(sb3);
                this.expirationDate = create;
                boolean z11 = !create.isMonthValid();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(create.getMonth());
                if ((create.getMonth().length() == 2 && this.latestInsertionSize > 0 && !z11) || sb3.length() > 2) {
                    sb4.append(ExpiryDateEditText.access$getSeparator$p(ExpiryDateEditText.this));
                }
                sb4.append(create.getYear());
                String sb5 = sb4.toString();
                kotlin.jvm.internal.s.f(sb5, "formattedDateBuilder.toString()");
                this.newCursorPosition = Integer.valueOf(ExpiryDateEditText.this.updateSelectionIndex$payments_core_release(sb5.length(), this.latestChangeStart, this.latestInsertionSize, ExpiryDateEditText.access$getDateDigitsLength$p(ExpiryDateEditText.this) + ExpiryDateEditText.access$getSeparator$p(ExpiryDateEditText.this).length()));
                this.formattedDate = sb5;
            }
        });
    }

    public final void updateSeparatorUi(boolean z11) {
        List d11;
        this.separator = z11 ? SEPARATOR_WITH_GAPS : SEPARATOR_WITHOUT_GAPS;
        d11 = wz.v.d(new InputFilter.LengthFilter(this.dateDigitsLength + this.separator.length()));
        Object[] array = d11.toArray(new InputFilter.LengthFilter[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        setFilters((InputFilter[]) array);
    }

    static /* synthetic */ void updateSeparatorUi$default(ExpiryDateEditText expiryDateEditText, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        expiryDateEditText.updateSeparatorUi(z11);
    }

    @Override // com.stripe.android.view.StripeEditText
    protected String getAccessibilityText() {
        String string = getResources().getString(R.string.acc_label_expiry_date_node, getText());
        kotlin.jvm.internal.s.f(string, "resources.getString(R.st…l_expiry_date_node, text)");
        return string;
    }

    public final h00.a<vz.b0> getCompletionCallback$payments_core_release() {
        return this.completionCallback;
    }

    public final boolean getIncludeSeparatorGaps$payments_core_release() {
        return ((Boolean) this.includeSeparatorGaps$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final ExpirationDate.Validated getValidatedDate() {
        boolean z11 = this.isDateValid;
        if (z11) {
            return ExpirationDate.Unvalidated.Companion.create(getFieldText$payments_core_release()).validate();
        }
        if (z11) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    public final boolean isDateValid() {
        return this.isDateValid;
    }

    public final void setCompletionCallback$payments_core_release(h00.a<vz.b0> aVar) {
        kotlin.jvm.internal.s.g(aVar, "<set-?>");
        this.completionCallback = aVar;
    }

    public final void setIncludeSeparatorGaps(boolean z11) {
        setIncludeSeparatorGaps$payments_core_release(z11);
    }

    public final void setIncludeSeparatorGaps$payments_core_release(boolean z11) {
        this.includeSeparatorGaps$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z11));
    }

    public final void setText$payments_core_release(Integer num, Integer num2) {
        String m02;
        String j12;
        String m03;
        List l11;
        String l02;
        if (num == null || num2 == null) {
            return;
        }
        m02 = kotlin.text.w.m0(num.toString(), 2, '0');
        j12 = kotlin.text.y.j1(num2.toString(), 2);
        m03 = kotlin.text.w.m0(j12, 2, '0');
        l11 = wz.w.l(m02, m03);
        l02 = wz.e0.l0(l11, this.separator, null, null, 0, null, null, 62, null);
        setText(l02);
    }

    public final int updateSelectionIndex$payments_core_release(int i11, int i12, int i13, int i14) {
        int i15 = 0;
        int length = (i12 > 2 || i12 + i13 < 2) ? 0 : this.separator.length();
        boolean z11 = true;
        if (!(i13 == 0) || i12 != this.separator.length() + 2) {
            z11 = false;
        }
        int i16 = i12 + i13 + length;
        if (z11 && i16 > 0) {
            i15 = this.separator.length();
        }
        return Math.min(i14, Math.min(i16 - i15, i11));
    }

    public final boolean isDateValid(String str, String str2) {
        Object obj;
        int intValue;
        Object obj2;
        int i11 = -1;
        if (str.length() != 2) {
            intValue = -1;
        } else {
            try {
                q.a aVar = vz.q.f54772b;
                obj = vz.q.b(Integer.valueOf(Integer.parseInt(str)));
            } catch (Throwable th2) {
                q.a aVar2 = vz.q.f54772b;
                obj = vz.q.b(vz.r.a(th2));
            }
            boolean g11 = vz.q.g(obj);
            Object obj3 = obj;
            if (g11) {
                obj3 = r3;
            }
            intValue = ((Number) obj3).intValue();
        }
        if (str2.length() == 2) {
            try {
                q.a aVar3 = vz.q.f54772b;
                obj2 = vz.q.b(Integer.valueOf(DateUtils.INSTANCE.convertTwoDigitYearToFour(Integer.parseInt(str2))));
            } catch (Throwable th3) {
                q.a aVar4 = vz.q.f54772b;
                obj2 = vz.q.b(vz.r.a(th3));
            }
            i11 = ((Number) (vz.q.g(obj2) ? -1 : obj2)).intValue();
        }
        return DateUtils.isExpiryDataValid(intValue, i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        this.completionCallback = ExpiryDateEditText$completionCallback$1.INSTANCE;
        kotlin.properties.a aVar = kotlin.properties.a.f34932a;
        this.includeSeparatorGaps$delegate = new kotlin.properties.b<Boolean>(Boolean.FALSE) { // from class: com.stripe.android.view.ExpiryDateEditText$special$$inlined$observable$1
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, Boolean bool, Boolean bool2) {
                kotlin.jvm.internal.s.g(property, "property");
                boolean booleanValue = bool2.booleanValue();
                bool.booleanValue();
                ExpiryDateEditText.access$updateSeparatorUi(this, booleanValue);
            }
        };
        this.dateDigitsLength = context.getResources().getInteger(R.integer.stripe_date_digits_length);
        this.separator = SEPARATOR_WITHOUT_GAPS;
        setNumberOnlyInputType();
        updateSeparatorUi$default(this, false, 1, null);
        listenForTextChanges();
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"creditCardExpirationDate"});
        }
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.w
            {
                ExpiryDateEditText.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                ExpiryDateEditText.c(ExpiryDateEditText.this, view, z11);
            }
        });
        setLayoutDirection(0);
    }
}