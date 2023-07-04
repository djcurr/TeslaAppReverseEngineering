package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.textfield.TextInputEditText;
import com.stripe.android.R;
import com.stripe.android.view.StripeEditText;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public class StripeEditText extends TextInputEditText {
    public static final int $stable = 8;
    private final String accessibilityText;
    private AfterTextChangedListener afterTextChangedListener;
    private ColorStateList defaultColorStateList;
    private int defaultErrorColor;
    private DeleteEmptyListener deleteEmptyListener;
    private String errorMessage;
    private ErrorMessageListener errorMessageListener;
    private ColorStateList externalColorStateList;
    private Integer externalErrorColor;
    private View.OnFocusChangeListener externalFocusChangeListener;
    private final List<View.OnFocusChangeListener> internalFocusChangeListeners;
    private boolean isLastKeyDelete;
    private boolean shouldShowError;
    private List<TextWatcher> textWatchers;

    /* loaded from: classes6.dex */
    public interface AfterTextChangedListener {
        void onTextChanged(String str);
    }

    /* loaded from: classes6.dex */
    public interface DeleteEmptyListener {
        void onDeleteEmpty();
    }

    /* loaded from: classes6.dex */
    public interface ErrorMessageListener {
        void displayErrorMessage(String str);
    }

    /* loaded from: classes6.dex */
    private static final class SoftDeleteInputConnection extends InputConnectionWrapper {
        private final DeleteEmptyListener deleteEmptyListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SoftDeleteInputConnection(InputConnection target, boolean z11, DeleteEmptyListener deleteEmptyListener) {
            super(target, z11);
            kotlin.jvm.internal.s.g(target, "target");
            this.deleteEmptyListener = deleteEmptyListener;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0013, code lost:
            if ((r2.length() == 0) == true) goto L4;
         */
        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean deleteSurroundingText(int r4, int r5) {
            /*
                r3 = this;
                r0 = 1
                r1 = 0
                java.lang.CharSequence r2 = r3.getTextBeforeCursor(r0, r1)
                if (r2 != 0) goto La
            L8:
                r0 = r1
                goto L15
            La:
                int r2 = r2.length()
                if (r2 != 0) goto L12
                r2 = r0
                goto L13
            L12:
                r2 = r1
            L13:
                if (r2 != r0) goto L8
            L15:
                if (r0 == 0) goto L1f
                com.stripe.android.view.StripeEditText$DeleteEmptyListener r0 = r3.deleteEmptyListener
                if (r0 != 0) goto L1c
                goto L1f
            L1c:
                r0.onDeleteEmpty()
            L1f:
                boolean r4 = super.deleteSurroundingText(r4, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.StripeEditText.SoftDeleteInputConnection.deleteSurroundingText(int, int):boolean");
        }
    }

    /* loaded from: classes6.dex */
    public static final class StripeEditTextState implements Parcelable {
        public static final Parcelable.Creator<StripeEditTextState> CREATOR = new Creator();
        private final String errorMessage;
        private final boolean shouldShowError;
        private final Parcelable superState;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<StripeEditTextState> {
            @Override // android.os.Parcelable.Creator
            public final StripeEditTextState createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new StripeEditTextState(parcel.readParcelable(StripeEditTextState.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final StripeEditTextState[] newArray(int i11) {
                return new StripeEditTextState[i11];
            }
        }

        public StripeEditTextState(Parcelable parcelable, String str, boolean z11) {
            this.superState = parcelable;
            this.errorMessage = str;
            this.shouldShowError = z11;
        }

        public static /* synthetic */ StripeEditTextState copy$default(StripeEditTextState stripeEditTextState, Parcelable parcelable, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                parcelable = stripeEditTextState.superState;
            }
            if ((i11 & 2) != 0) {
                str = stripeEditTextState.errorMessage;
            }
            if ((i11 & 4) != 0) {
                z11 = stripeEditTextState.shouldShowError;
            }
            return stripeEditTextState.copy(parcelable, str, z11);
        }

        public final Parcelable component1() {
            return this.superState;
        }

        public final String component2() {
            return this.errorMessage;
        }

        public final boolean component3() {
            return this.shouldShowError;
        }

        public final StripeEditTextState copy(Parcelable parcelable, String str, boolean z11) {
            return new StripeEditTextState(parcelable, str, z11);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof StripeEditTextState) {
                StripeEditTextState stripeEditTextState = (StripeEditTextState) obj;
                return kotlin.jvm.internal.s.c(this.superState, stripeEditTextState.superState) && kotlin.jvm.internal.s.c(this.errorMessage, stripeEditTextState.errorMessage) && this.shouldShowError == stripeEditTextState.shouldShowError;
            }
            return false;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final boolean getShouldShowError() {
            return this.shouldShowError;
        }

        public final Parcelable getSuperState() {
            return this.superState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            Parcelable parcelable = this.superState;
            int hashCode = (parcelable == null ? 0 : parcelable.hashCode()) * 31;
            String str = this.errorMessage;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            boolean z11 = this.shouldShowError;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode2 + i11;
        }

        public String toString() {
            return "StripeEditTextState(superState=" + this.superState + ", errorMessage=" + ((Object) this.errorMessage) + ", shouldShowError=" + this.shouldShowError + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeParcelable(this.superState, i11);
            out.writeString(this.errorMessage);
            out.writeInt(this.shouldShowError ? 1 : 0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeEditText(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ StripeEditText(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? g.a.A : i11);
    }

    public static /* synthetic */ void a(StripeEditText stripeEditText, View view, boolean z11) {
        m547setOnFocusChangeListener$lambda9(stripeEditText, view, z11);
    }

    public static final /* synthetic */ AfterTextChangedListener access$getAfterTextChangedListener$p(StripeEditText stripeEditText) {
        return stripeEditText.afterTextChangedListener;
    }

    public static /* synthetic */ boolean b(StripeEditText stripeEditText, View view, int i11, KeyEvent keyEvent) {
        return m546listenForDeleteEmpty$lambda6(stripeEditText, view, i11, keyEvent);
    }

    private final void determineDefaultErrorColor() {
        int i11;
        Context context = getContext();
        if (StripeColorUtils.Companion.isColorDark(this.defaultColorStateList.getDefaultColor())) {
            i11 = R.color.stripe_error_text_light_theme;
        } else {
            i11 = R.color.stripe_error_text_dark_theme;
        }
        this.defaultErrorColor = androidx.core.content.b.getColor(context, i11);
    }

    private final boolean isDeleteKey(int i11, KeyEvent keyEvent) {
        return i11 == 67 && keyEvent.getAction() == 0;
    }

    private final void listenForDeleteEmpty() {
        setOnKeyListener(new View.OnKeyListener() { // from class: com.stripe.android.view.o0
            {
                StripeEditText.this = this;
            }

            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                return StripeEditText.b(StripeEditText.this, view, i11, keyEvent);
            }
        });
    }

    /* renamed from: listenForDeleteEmpty$lambda-6 */
    public static final boolean m546listenForDeleteEmpty$lambda6(StripeEditText this$0, View view, int i11, KeyEvent event) {
        DeleteEmptyListener deleteEmptyListener;
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.f(event, "event");
        boolean isDeleteKey = this$0.isDeleteKey(i11, event);
        this$0.isLastKeyDelete = isDeleteKey;
        if (isDeleteKey && this$0.length() == 0 && (deleteEmptyListener = this$0.deleteEmptyListener) != null) {
            deleteEmptyListener.onDeleteEmpty();
            return false;
        }
        return false;
    }

    private final void listenForTextChanges() {
        addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.StripeEditText$listenForTextChanges$$inlined$doAfterTextChanged$1
            {
                StripeEditText.this = this;
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                StripeEditText.AfterTextChangedListener access$getAfterTextChangedListener$p = StripeEditText.access$getAfterTextChangedListener$p(StripeEditText.this);
                if (access$getAfterTextChangedListener$p == null) {
                    return;
                }
                String obj = editable == null ? null : editable.toString();
                if (obj == null) {
                    obj = "";
                }
                access$getAfterTextChangedListener$p.onTextChanged(obj);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            }
        });
    }

    /* renamed from: setOnFocusChangeListener$lambda-9 */
    public static final void m547setOnFocusChangeListener$lambda9(StripeEditText this$0, View view, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        for (View.OnFocusChangeListener onFocusChangeListener : this$0.internalFocusChangeListeners) {
            onFocusChangeListener.onFocusChange(view, z11);
        }
        View.OnFocusChangeListener onFocusChangeListener2 = this$0.externalFocusChangeListener;
        if (onFocusChangeListener2 == null) {
            return;
        }
        onFocusChangeListener2.onFocusChange(view, z11);
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        List<TextWatcher> list;
        super.addTextChangedListener(textWatcher);
        if (textWatcher == null || (list = this.textWatchers) == null) {
            return;
        }
        list.add(textWatcher);
    }

    protected String getAccessibilityText() {
        return this.accessibilityText;
    }

    public final ColorStateList getDefaultColorStateList$payments_core_release() {
        return this.defaultColorStateList;
    }

    public final int getDefaultErrorColorInt() {
        determineDefaultErrorColor();
        return this.defaultErrorColor;
    }

    public final String getErrorMessage$payments_core_release() {
        return this.errorMessage;
    }

    public final String getFieldText$payments_core_release() {
        Editable text = getText();
        String obj = text == null ? null : text.toString();
        return obj == null ? "" : obj;
    }

    public final List<View.OnFocusChangeListener> getInternalFocusChangeListeners() {
        return this.internalFocusChangeListeners;
    }

    @Override // android.view.View
    public View.OnFocusChangeListener getOnFocusChangeListener() {
        return this.externalFocusChangeListener;
    }

    public final View.OnFocusChangeListener getParentOnFocusChangeListener() {
        return super.getOnFocusChangeListener();
    }

    public final boolean getShouldShowError() {
        return this.shouldShowError;
    }

    public final boolean isLastKeyDelete() {
        return this.isLastKeyDelete;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, androidx.appcompat.widget.j, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        kotlin.jvm.internal.s.g(outAttrs, "outAttrs");
        InputConnection onCreateInputConnection = super.onCreateInputConnection(outAttrs);
        if (onCreateInputConnection == null) {
            return null;
        }
        return new SoftDeleteInputConnection(onCreateInputConnection, true, this.deleteEmptyListener);
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        kotlin.jvm.internal.s.g(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setContentInvalid(this.shouldShowError);
        String accessibilityText = getAccessibilityText();
        if (accessibilityText != null) {
            info.setText(accessibilityText);
        }
        String str = this.errorMessage;
        if (!getShouldShowError()) {
            str = null;
        }
        info.setError(str);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Objects.requireNonNull(parcelable, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText.StripeEditTextState");
        StripeEditTextState stripeEditTextState = (StripeEditTextState) parcelable;
        super.onRestoreInstanceState(stripeEditTextState.getSuperState());
        setErrorMessage$payments_core_release(stripeEditTextState.getErrorMessage());
        setShouldShowError(stripeEditTextState.getShouldShowError());
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new StripeEditTextState(super.onSaveInstanceState(), this.errorMessage, this.shouldShowError);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        List<TextWatcher> list;
        super.removeTextChangedListener(textWatcher);
        if (textWatcher == null || (list = this.textWatchers) == null) {
            return;
        }
        list.remove(textWatcher);
    }

    public final void setAfterTextChangedListener(AfterTextChangedListener afterTextChangedListener) {
        this.afterTextChangedListener = afterTextChangedListener;
    }

    public final void setDefaultColorStateList$payments_core_release(ColorStateList colorStateList) {
        kotlin.jvm.internal.s.g(colorStateList, "<set-?>");
        this.defaultColorStateList = colorStateList;
    }

    public final void setDeleteEmptyListener(DeleteEmptyListener deleteEmptyListener) {
        this.deleteEmptyListener = deleteEmptyListener;
    }

    public final void setErrorColor(int i11) {
        this.externalErrorColor = Integer.valueOf(i11);
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setErrorMessage$payments_core_release(String str) {
        this.errorMessage = str;
    }

    public final void setErrorMessageListener(ErrorMessageListener errorMessageListener) {
        this.errorMessageListener = errorMessageListener;
    }

    protected final void setLastKeyDelete(boolean z11) {
        this.isLastKeyDelete = z11;
    }

    public final void setNumberOnlyInputType() {
        Typeface typeface = getTypeface();
        setInputType(18);
        setTypeface(typeface);
        setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }

    @Override // android.view.View
    public final void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        super.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.n0
            {
                StripeEditText.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                StripeEditText.a(StripeEditText.this, view, z11);
            }
        });
        this.externalFocusChangeListener = onFocusChangeListener;
    }

    public final void setShouldShowError(boolean z11) {
        ErrorMessageListener errorMessageListener;
        String str = this.errorMessage;
        if (str != null && (errorMessageListener = this.errorMessageListener) != null) {
            if (!z11) {
                str = null;
            }
            errorMessageListener.displayErrorMessage(str);
        }
        if (this.shouldShowError != z11) {
            if (z11) {
                Integer num = this.externalErrorColor;
                super.setTextColor(num == null ? this.defaultErrorColor : num.intValue());
            } else {
                ColorStateList colorStateList = this.externalColorStateList;
                if (colorStateList == null) {
                    colorStateList = this.defaultColorStateList;
                }
                super.setTextColor(colorStateList);
            }
            refreshDrawableState();
        }
        this.shouldShowError = z11;
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.externalColorStateList = getTextColors();
    }

    public final void setTextSilent$payments_core_release(CharSequence charSequence) {
        List<TextWatcher> list = this.textWatchers;
        if (list != null) {
            for (TextWatcher textWatcher : list) {
                super.removeTextChangedListener(textWatcher);
            }
        }
        setText(charSequence);
        List<TextWatcher> list2 = this.textWatchers;
        if (list2 == null) {
            return;
        }
        for (TextWatcher textWatcher2 : list2) {
            super.addTextChangedListener(textWatcher2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StripeEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        this.textWatchers = new ArrayList();
        setMaxLines(1);
        listenForTextChanges();
        listenForDeleteEmpty();
        ColorStateList textColors = getTextColors();
        kotlin.jvm.internal.s.f(textColors, "textColors");
        this.defaultColorStateList = textColors;
        determineDefaultErrorColor();
        setOnFocusChangeListener(null);
        this.internalFocusChangeListeners = new ArrayList();
    }

    @Override // android.widget.TextView
    public void setTextColor(int i11) {
        setTextColor(ColorStateList.valueOf(i11));
    }
}