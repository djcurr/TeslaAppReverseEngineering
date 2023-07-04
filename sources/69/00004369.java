package com.plaid.internal.core.ui_components;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.plaid.internal.core.ui_components.PlaidInput;
import com.plaid.internal.d;
import com.plaid.link.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class PlaidInput extends ConstraintLayout {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f18422a;

    /* renamed from: b  reason: collision with root package name */
    public final TextInputEditText f18423b;

    /* renamed from: c  reason: collision with root package name */
    public final View f18424c;

    /* renamed from: d  reason: collision with root package name */
    public final View f18425d;

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f18426e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18427f;

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f18428g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f18429h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f18430i;

    /* renamed from: j  reason: collision with root package name */
    public final TextWatcher f18431j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f18432k;

    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            PlaidInput.this.setError("");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidInput(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ PlaidInput(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public static final void a(View view) {
    }

    public final void a() {
        this.f18423b.setCompoundDrawables(null, null, null, null);
        this.f18423b.invalidate();
    }

    public final boolean getLoading() {
        return this.f18432k;
    }

    public final String getText() {
        EditText editText = this.f18422a.getEditText();
        s.e(editText);
        Editable text = editText.getText();
        if (text == null) {
            return null;
        }
        return text.toString();
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        this.f18422a.setEnabled(z11);
        this.f18430i = z11;
    }

    public final void setError(CharSequence charSequence) {
        this.f18425d.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        this.f18426e.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        this.f18427f.setText(charSequence);
    }

    public final void setHint(CharSequence charSequence) {
        this.f18428g = charSequence;
        this.f18423b.setHint(charSequence);
        this.f18422a.setHintEnabled(true);
    }

    public final void setInputType(int i11) {
        EditText editText = this.f18422a.getEditText();
        if (editText == null) {
            return;
        }
        editText.setInputType(i11);
    }

    public final void setLabel(CharSequence charSequence) {
        this.f18429h = charSequence;
        this.f18422a.setHint(charSequence);
    }

    public final void setLoading(boolean z11) {
        this.f18432k = z11;
        setError("");
        if (this.f18432k) {
            this.f18423b.setCompoundDrawables(null, null, null, null);
            this.f18423b.invalidate();
        }
        this.f18422a.setEnabled(this.f18432k ? false : this.f18430i);
        if (this.f18432k) {
            EditText editText = this.f18422a.getEditText();
            if (editText != null) {
                editText.removeTextChangedListener(this.f18431j);
            }
        } else {
            EditText editText2 = this.f18422a.getEditText();
            if (editText2 != null) {
                editText2.addTextChangedListener(this.f18431j);
            }
        }
        EditText editText3 = this.f18422a.getEditText();
        if (editText3 != null) {
            editText3.setText(this.f18432k ? null : getText());
        }
        EditText editText4 = this.f18422a.getEditText();
        if (editText4 != null) {
            editText4.setHint(this.f18432k ? null : this.f18428g);
        }
        this.f18422a.setHint(this.f18432k ? null : this.f18429h);
        this.f18424c.setVisibility(this.f18432k ? 0 : 8);
    }

    public final void setText(String str) {
        EditText editText = this.f18422a.getEditText();
        s.e(editText);
        editText.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidInput(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        this.f18428g = "";
        this.f18429h = "";
        this.f18430i = true;
        ViewGroup.inflate(context, R.layout.plaid_input, this);
        View findViewById = findViewById(R.id.plaid_input_layout);
        s.f(findViewById, "findViewById(R.id.plaid_input_layout)");
        TextInputLayout textInputLayout = (TextInputLayout) findViewById;
        this.f18422a = textInputLayout;
        View findViewById2 = findViewById(R.id.plaid_input_edit_text);
        s.f(findViewById2, "findViewById(R.id.plaid_input_edit_text)");
        this.f18423b = (TextInputEditText) findViewById2;
        View findViewById3 = findViewById(R.id.loading_layout);
        s.f(findViewById3, "findViewById(R.id.loading_layout)");
        this.f18424c = findViewById3;
        View findViewById4 = findViewById(R.id.loading_layout_view);
        s.f(findViewById4, "findViewById(R.id.loading_layout_view)");
        LinearLayout linearLayout = (LinearLayout) findViewById4;
        View findViewById5 = findViewById(R.id.error_guide);
        s.f(findViewById5, "findViewById(R.id.error_guide)");
        this.f18425d = findViewById5;
        View findViewById6 = findViewById(R.id.error_view);
        s.f(findViewById6, "findViewById(R.id.error_view)");
        this.f18426e = (LinearLayout) findViewById6;
        View findViewById7 = findViewById(R.id.error_text);
        s.f(findViewById7, "findViewById(R.id.error_text)");
        this.f18427f = (TextView) findViewById7;
        textInputLayout.setErrorIconDrawable(new ColorDrawable(0));
        a aVar = new a();
        this.f18431j = aVar;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            editText.addTextChangedListener(aVar);
        }
        findViewById3.setOnClickListener(new View.OnClickListener() { // from class: rq.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlaidInput.a(view);
            }
        });
        TextPaint textPaint = new TextPaint((int) d.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
        textPaint.setTextSize(15.0f);
        textPaint.setTypeface(textInputLayout.getTypeface());
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PlaidInput, 0, 0);
        s.f(obtainStyledAttributes, "context.obtainStyledAttr….PlaidInput, 0, 0\n      )");
        setHint(obtainStyledAttributes.getText(R.styleable.PlaidInput_plaid_hint));
        if (obtainStyledAttributes.getBoolean(R.styleable.PlaidInput_hide_lock, false)) {
            a();
        }
        obtainStyledAttributes.recycle();
    }
}