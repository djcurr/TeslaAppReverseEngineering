package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class a extends com.google.android.material.textfield.e {

    /* renamed from: e  reason: collision with root package name */
    private final TextWatcher f15657e;

    /* renamed from: f  reason: collision with root package name */
    private final View.OnFocusChangeListener f15658f;

    /* renamed from: g  reason: collision with root package name */
    private final TextInputLayout.f f15659g;

    /* renamed from: h  reason: collision with root package name */
    private final TextInputLayout.g f15660h;

    /* renamed from: i  reason: collision with root package name */
    private AnimatorSet f15661i;

    /* renamed from: j  reason: collision with root package name */
    private ValueAnimator f15662j;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0280a implements TextWatcher {
        C0280a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (a.this.f15703a.getSuffixText() != null) {
                return;
            }
            a aVar = a.this;
            aVar.i(aVar.m());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnFocusChangeListener {
        b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z11) {
            a aVar = a.this;
            aVar.i(aVar.m());
        }
    }

    /* loaded from: classes3.dex */
    class c implements TextInputLayout.f {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.this.m());
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(a.this.f15658f);
            a aVar = a.this;
            aVar.f15705c.setOnFocusChangeListener(aVar.f15658f);
            editText.removeTextChangedListener(a.this.f15657e);
            editText.addTextChangedListener(a.this.f15657e);
        }
    }

    /* loaded from: classes3.dex */
    class d implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0281a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ EditText f15667a;

            RunnableC0281a(EditText editText) {
                this.f15667a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f15667a.removeTextChangedListener(a.this.f15657e);
            }
        }

        d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i11) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i11 != 2) {
                return;
            }
            editText.post(new RunnableC0281a(editText));
            if (editText.getOnFocusChangeListener() == a.this.f15658f) {
                editText.setOnFocusChangeListener(null);
            }
            if (a.this.f15705c.getOnFocusChangeListener() == a.this.f15658f) {
                a.this.f15705c.setOnFocusChangeListener(null);
            }
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f15703a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f15703a.refreshEndIconDrawableState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f15703a.setEndIconVisible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f15703a.setEndIconVisible(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            a.this.f15705c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f15705c.setScaleX(floatValue);
            a.this.f15705c.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(TextInputLayout textInputLayout, int i11) {
        super(textInputLayout, i11);
        this.f15657e = new C0280a();
        this.f15658f = new b();
        this.f15659g = new c();
        this.f15660h = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z11) {
        boolean z12 = this.f15703a.isEndIconVisible() == z11;
        if (z11 && !this.f15661i.isRunning()) {
            this.f15662j.cancel();
            this.f15661i.start();
            if (z12) {
                this.f15661i.end();
            }
        } else if (z11) {
        } else {
            this.f15661i.cancel();
            this.f15662j.start();
            if (z12) {
                this.f15662j.end();
            }
        }
    }

    private ValueAnimator j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(gk.a.f27993a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new h());
        return ofFloat;
    }

    private ValueAnimator k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(gk.a.f27996d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    private void l() {
        ValueAnimator k11 = k();
        ValueAnimator j11 = j(BitmapDescriptorFactory.HUE_RED, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f15661i = animatorSet;
        animatorSet.playTogether(k11, j11);
        this.f15661i.addListener(new f());
        ValueAnimator j12 = j(1.0f, BitmapDescriptorFactory.HUE_RED);
        this.f15662j = j12;
        j12.addListener(new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        EditText editText = this.f15703a.getEditText();
        return editText != null && (editText.hasFocus() || this.f15705c.hasFocus()) && editText.getText().length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void a() {
        TextInputLayout textInputLayout = this.f15703a;
        int i11 = this.f15706d;
        if (i11 == 0) {
            i11 = fk.e.f26428f;
        }
        textInputLayout.setEndIconDrawable(i11);
        TextInputLayout textInputLayout2 = this.f15703a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(fk.i.f26485e));
        this.f15703a.setEndIconOnClickListener(new e());
        this.f15703a.addOnEditTextAttachedListener(this.f15659g);
        this.f15703a.addOnEndIconChangedListener(this.f15660h);
        l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void c(boolean z11) {
        if (this.f15703a.getSuffixText() == null) {
            return;
        }
        i(z11);
    }
}