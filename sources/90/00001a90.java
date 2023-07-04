package com.facebook.react.views.textinput;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.widget.EditText;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final SpannableStringBuilder f12780a;

    /* renamed from: b  reason: collision with root package name */
    private final float f12781b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12782c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12783d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12784e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12785f;

    /* renamed from: g  reason: collision with root package name */
    private final CharSequence f12786g;

    public k(EditText editText) {
        this.f12780a = new SpannableStringBuilder(editText.getText());
        this.f12781b = editText.getTextSize();
        this.f12784e = editText.getInputType();
        this.f12786g = editText.getHint();
        this.f12782c = editText.getMinLines();
        this.f12783d = editText.getMaxLines();
        if (Build.VERSION.SDK_INT >= 23) {
            this.f12785f = editText.getBreakStrategy();
        } else {
            this.f12785f = 0;
        }
    }

    public void a(EditText editText) {
        editText.setText(this.f12780a);
        editText.setTextSize(0, this.f12781b);
        editText.setMinLines(this.f12782c);
        editText.setMaxLines(this.f12783d);
        editText.setInputType(this.f12784e);
        editText.setHint(this.f12786g);
        if (Build.VERSION.SDK_INT >= 23) {
            editText.setBreakStrategy(this.f12785f);
        }
    }
}