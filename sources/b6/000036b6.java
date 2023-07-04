package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.i;
import com.google.android.material.internal.l;
import com.google.android.material.textfield.TextInputLayout;
import fk.f;
import fk.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a  reason: collision with root package name */
    private final Chip f15746a;

    /* renamed from: b  reason: collision with root package name */
    private final TextInputLayout f15747b;

    /* renamed from: c  reason: collision with root package name */
    private final EditText f15748c;

    /* renamed from: d  reason: collision with root package name */
    private TextWatcher f15749d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f15750e;

    /* loaded from: classes3.dex */
    private class b extends i {
        private b() {
        }

        @Override // com.google.android.material.internal.i, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f15746a.setText(ChipTextInputComboView.this.c("00"));
            } else {
                ChipTextInputComboView.this.f15746a.setText(ChipTextInputComboView.this.c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(CharSequence charSequence) {
        return c.a(getResources(), charSequence);
    }

    private void d() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f15748c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f15746a.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        this.f15746a.setChecked(z11);
        this.f15748c.setVisibility(z11 ? 0 : 4);
        this.f15746a.setVisibility(z11 ? 8 : 0);
        if (isChecked()) {
            l.g(this.f15748c);
            if (TextUtils.isEmpty(this.f15748c.getText())) {
                return;
            }
            EditText editText = this.f15748c;
            editText.setSelection(editText.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f15746a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i11, Object obj) {
        this.f15746a.setTag(i11, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f15746a.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(h.f26468j, (ViewGroup) this, false);
        this.f15746a = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(h.f26469k, (ViewGroup) this, false);
        this.f15747b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f15748c = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f15749d = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f15750e = (TextView) findViewById(f.f26443n);
        editText.setSaveEnabled(false);
    }
}