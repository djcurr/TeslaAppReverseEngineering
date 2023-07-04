package com.adyen.checkout.components.ui.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;

/* loaded from: classes.dex */
public class AdyenTextInputEditText extends TextInputEditText {

    /* renamed from: a  reason: collision with root package name */
    private b f9564a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AdyenTextInputEditText.this.a(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Editable editable);
    }

    public AdyenTextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private TextWatcher getTextWatcher() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Editable editable) {
        b bVar = this.f9564a;
        if (bVar != null) {
            bVar.a(editable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(int i11) {
        if (i11 != -1) {
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i11)});
        }
    }

    public String getRawValue() {
        return getText() != null ? getText().toString() : "";
    }

    public void setOnChangeListener(b bVar) {
        this.f9564a = bVar;
    }

    public AdyenTextInputEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11 == 0 ? fk.b.f26379o : i11);
        addTextChangedListener(getTextWatcher());
    }
}