package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class i extends e {

    /* renamed from: e  reason: collision with root package name */
    private final TextWatcher f15737e;

    /* renamed from: f  reason: collision with root package name */
    private final TextInputLayout.f f15738f;

    /* renamed from: g  reason: collision with root package name */
    private final TextInputLayout.g f15739g;

    /* loaded from: classes3.dex */
    class a extends com.google.android.material.internal.i {
        a() {
        }

        @Override // com.google.android.material.internal.i, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            i iVar = i.this;
            iVar.f15705c.setChecked(!iVar.g());
        }
    }

    /* loaded from: classes3.dex */
    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            i iVar = i.this;
            iVar.f15705c.setChecked(!iVar.g());
            editText.removeTextChangedListener(i.this.f15737e);
            editText.addTextChangedListener(i.this.f15737e);
        }
    }

    /* loaded from: classes3.dex */
    class c implements TextInputLayout.g {

        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ EditText f15743a;

            a(EditText editText) {
                this.f15743a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f15743a.removeTextChangedListener(i.this.f15737e);
            }
        }

        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i11) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i11 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    /* loaded from: classes3.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = i.this.f15703a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (i.this.g()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            i.this.f15703a.refreshEndIconDrawableState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(TextInputLayout textInputLayout, int i11) {
        super(textInputLayout, i11);
        this.f15737e = new a();
        this.f15738f = new b();
        this.f15739g = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        EditText editText = this.f15703a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void a() {
        TextInputLayout textInputLayout = this.f15703a;
        int i11 = this.f15706d;
        if (i11 == 0) {
            i11 = fk.e.f26423a;
        }
        textInputLayout.setEndIconDrawable(i11);
        TextInputLayout textInputLayout2 = this.f15703a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(fk.i.f26496p));
        this.f15703a.setEndIconOnClickListener(new d());
        this.f15703a.addOnEditTextAttachedListener(this.f15738f);
        this.f15703a.addOnEndIconChangedListener(this.f15739g);
        EditText editText = this.f15703a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}