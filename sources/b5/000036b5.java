package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.j;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.e;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.q;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.g;
import com.google.android.material.textview.MaterialTextView;
import sk.a;

/* loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends j {
    @Override // androidx.appcompat.app.j
    protected AppCompatAutoCompleteTextView b(Context context, AttributeSet attributeSet) {
        return new g(context, attributeSet);
    }

    @Override // androidx.appcompat.app.j
    protected e c(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.j
    protected f d(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.j
    protected q j(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.j
    protected AppCompatTextView n(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}