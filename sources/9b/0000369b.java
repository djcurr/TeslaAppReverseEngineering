package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.a0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.textfield.TextInputLayout;
import wk.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class d extends com.google.android.material.textfield.e {

    /* renamed from: r  reason: collision with root package name */
    private static final boolean f15674r;

    /* renamed from: e  reason: collision with root package name */
    private final TextWatcher f15675e;

    /* renamed from: f  reason: collision with root package name */
    private final View.OnFocusChangeListener f15676f;

    /* renamed from: g  reason: collision with root package name */
    private final TextInputLayout.e f15677g;

    /* renamed from: h  reason: collision with root package name */
    private final TextInputLayout.f f15678h;

    /* renamed from: i  reason: collision with root package name */
    private final TextInputLayout.g f15679i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f15680j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f15681k;

    /* renamed from: l  reason: collision with root package name */
    private long f15682l;

    /* renamed from: m  reason: collision with root package name */
    private StateListDrawable f15683m;

    /* renamed from: n  reason: collision with root package name */
    private wk.g f15684n;

    /* renamed from: o  reason: collision with root package name */
    private AccessibilityManager f15685o;

    /* renamed from: p  reason: collision with root package name */
    private ValueAnimator f15686p;

    /* renamed from: q  reason: collision with root package name */
    private ValueAnimator f15687q;

    /* loaded from: classes3.dex */
    class a extends com.google.android.material.internal.i {

        /* renamed from: com.google.android.material.textfield.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0282a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f15689a;

            RunnableC0282a(AutoCompleteTextView autoCompleteTextView) {
                this.f15689a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean isPopupShowing = this.f15689a.isPopupShowing();
                d.this.E(isPopupShowing);
                d.this.f15680j = isPopupShowing;
            }
        }

        a() {
        }

        @Override // com.google.android.material.internal.i, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView y11 = d.y(d.this.f15703a.getEditText());
            if (d.this.f15685o.isTouchExplorationEnabled() && d.D(y11) && !d.this.f15705c.hasFocus()) {
                y11.dismissDropDown();
            }
            y11.post(new RunnableC0282a(y11));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f15705c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes3.dex */
    class c implements View.OnFocusChangeListener {
        c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z11) {
            d.this.f15703a.setEndIconActivated(z11);
            if (z11) {
                return;
            }
            d.this.E(false);
            d.this.f15680j = false;
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0283d extends TextInputLayout.e {
        C0283d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            if (!d.D(d.this.f15703a.getEditText())) {
                cVar.c0(Spinner.class.getName());
            }
            if (cVar.N()) {
                cVar.p0(null);
            }
        }

        @Override // androidx.core.view.a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            AutoCompleteTextView y11 = d.y(d.this.f15703a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && d.this.f15685o.isTouchExplorationEnabled() && !d.D(d.this.f15703a.getEditText())) {
                d.this.H(y11);
            }
        }
    }

    /* loaded from: classes3.dex */
    class e implements TextInputLayout.f {
        e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView y11 = d.y(textInputLayout.getEditText());
            d.this.F(y11);
            d.this.v(y11);
            d.this.G(y11);
            y11.setThreshold(0);
            y11.removeTextChangedListener(d.this.f15675e);
            y11.addTextChangedListener(d.this.f15675e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!d.D(y11)) {
                a0.G0(d.this.f15705c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(d.this.f15677g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* loaded from: classes3.dex */
    class f implements TextInputLayout.g {

        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f15696a;

            a(AutoCompleteTextView autoCompleteTextView) {
                this.f15696a = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f15696a.removeTextChangedListener(d.this.f15675e);
            }
        }

        f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i11) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i11 != 3) {
                return;
            }
            autoCompleteTextView.post(new a(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == d.this.f15676f) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (d.f15674r) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    /* loaded from: classes3.dex */
    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.H((AutoCompleteTextView) d.this.f15703a.getEditText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AutoCompleteTextView f15699a;

        h(AutoCompleteTextView autoCompleteTextView) {
            this.f15699a = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.C()) {
                    d.this.f15680j = false;
                }
                d.this.H(this.f15699a);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class i implements AutoCompleteTextView.OnDismissListener {
        i() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            d.this.f15680j = true;
            d.this.f15682l = System.currentTimeMillis();
            d.this.E(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f15705c.setChecked(dVar.f15681k);
            d.this.f15687q.start();
        }
    }

    static {
        f15674r = Build.VERSION.SDK_INT >= 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(TextInputLayout textInputLayout, int i11) {
        super(textInputLayout, i11);
        this.f15675e = new a();
        this.f15676f = new c();
        this.f15677g = new C0283d(this.f15703a);
        this.f15678h = new e();
        this.f15679i = new f();
        this.f15680j = false;
        this.f15681k = false;
        this.f15682l = Long.MAX_VALUE;
    }

    private wk.g A(float f11, float f12, float f13, int i11) {
        k m11 = k.a().C(f11).G(f11).u(f12).y(f12).m();
        wk.g m12 = wk.g.m(this.f15704b, f13);
        m12.setShapeAppearanceModel(m11);
        m12.a0(0, i11, 0, i11);
        return m12;
    }

    private void B() {
        this.f15687q = z(67, BitmapDescriptorFactory.HUE_RED, 1.0f);
        ValueAnimator z11 = z(50, 1.0f, BitmapDescriptorFactory.HUE_RED);
        this.f15686p = z11;
        z11.addListener(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C() {
        long currentTimeMillis = System.currentTimeMillis() - this.f15682l;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean D(EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(boolean z11) {
        if (this.f15681k != z11) {
            this.f15681k = z11;
            this.f15687q.cancel();
            this.f15686p.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(AutoCompleteTextView autoCompleteTextView) {
        if (f15674r) {
            int boxBackgroundMode = this.f15703a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f15684n);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f15683m);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f15676f);
        if (f15674r) {
            autoCompleteTextView.setOnDismissListener(new i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (C()) {
            this.f15680j = false;
        }
        if (!this.f15680j) {
            if (f15674r) {
                E(!this.f15681k);
            } else {
                this.f15681k = !this.f15681k;
                this.f15705c.toggle();
            }
            if (this.f15681k) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        this.f15680j = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(AutoCompleteTextView autoCompleteTextView) {
        if (D(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f15703a.getBoxBackgroundMode();
        wk.g boxBackground = this.f15703a.getBoxBackground();
        int d11 = kk.a.d(autoCompleteTextView, fk.b.f26374j);
        int[][] iArr = {new int[]{16842919}, new int[0]};
        if (boxBackgroundMode == 2) {
            x(autoCompleteTextView, d11, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            w(autoCompleteTextView, d11, iArr, boxBackground);
        }
    }

    private void w(AutoCompleteTextView autoCompleteTextView, int i11, int[][] iArr, wk.g gVar) {
        int boxBackgroundColor = this.f15703a.getBoxBackgroundColor();
        int[] iArr2 = {kk.a.h(i11, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f15674r) {
            a0.z0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        wk.g gVar2 = new wk.g(gVar.E());
        gVar2.Y(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int K = a0.K(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int J = a0.J(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        a0.z0(autoCompleteTextView, layerDrawable);
        a0.K0(autoCompleteTextView, K, paddingTop, J, paddingBottom);
    }

    private void x(AutoCompleteTextView autoCompleteTextView, int i11, int[][] iArr, wk.g gVar) {
        LayerDrawable layerDrawable;
        int d11 = kk.a.d(autoCompleteTextView, fk.b.f26378n);
        wk.g gVar2 = new wk.g(gVar.E());
        int h11 = kk.a.h(i11, d11, 0.1f);
        gVar2.Y(new ColorStateList(iArr, new int[]{h11, 0}));
        if (f15674r) {
            gVar2.setTint(d11);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{h11, d11});
            wk.g gVar3 = new wk.g(gVar.E());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        a0.z0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AutoCompleteTextView y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator z(int i11, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(gk.a.f27993a);
        ofFloat.setDuration(i11);
        ofFloat.addUpdateListener(new b());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public void a() {
        float dimensionPixelOffset = this.f15704b.getResources().getDimensionPixelOffset(fk.d.R);
        float dimensionPixelOffset2 = this.f15704b.getResources().getDimensionPixelOffset(fk.d.L);
        int dimensionPixelOffset3 = this.f15704b.getResources().getDimensionPixelOffset(fk.d.M);
        wk.g A = A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        wk.g A2 = A(BitmapDescriptorFactory.HUE_RED, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f15684n = A;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f15683m = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, A);
        this.f15683m.addState(new int[0], A2);
        int i11 = this.f15706d;
        if (i11 == 0) {
            i11 = f15674r ? fk.e.f26426d : fk.e.f26427e;
        }
        this.f15703a.setEndIconDrawable(i11);
        TextInputLayout textInputLayout = this.f15703a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(fk.i.f26487g));
        this.f15703a.setEndIconOnClickListener(new g());
        this.f15703a.addOnEditTextAttachedListener(this.f15678h);
        this.f15703a.addOnEndIconChangedListener(this.f15679i);
        B();
        this.f15685o = (AccessibilityManager) this.f15704b.getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public boolean b(int i11) {
        return i11 != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.e
    public boolean d() {
        return true;
    }
}