package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.a0;
import androidx.core.widget.m;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final Context f15707a;

    /* renamed from: b  reason: collision with root package name */
    private final TextInputLayout f15708b;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f15709c;

    /* renamed from: d  reason: collision with root package name */
    private int f15710d;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f15711e;

    /* renamed from: f  reason: collision with root package name */
    private Animator f15712f;

    /* renamed from: g  reason: collision with root package name */
    private final float f15713g;

    /* renamed from: h  reason: collision with root package name */
    private int f15714h;

    /* renamed from: i  reason: collision with root package name */
    private int f15715i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f15716j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f15717k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f15718l;

    /* renamed from: m  reason: collision with root package name */
    private CharSequence f15719m;

    /* renamed from: n  reason: collision with root package name */
    private int f15720n;

    /* renamed from: o  reason: collision with root package name */
    private ColorStateList f15721o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f15722p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f15723q;

    /* renamed from: r  reason: collision with root package name */
    private TextView f15724r;

    /* renamed from: s  reason: collision with root package name */
    private int f15725s;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f15726t;

    /* renamed from: u  reason: collision with root package name */
    private Typeface f15727u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15728a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f15729b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f15730c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f15731d;

        a(int i11, TextView textView, int i12, TextView textView2) {
            this.f15728a = i11;
            this.f15729b = textView;
            this.f15730c = i12;
            this.f15731d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f15714h = this.f15728a;
            f.this.f15712f = null;
            TextView textView = this.f15729b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f15730c == 1 && f.this.f15718l != null) {
                    f.this.f15718l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f15731d;
            if (textView2 != null) {
                textView2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                this.f15731d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f15731d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f15707a = context;
        this.f15708b = textInputLayout;
        this.f15713g = context.getResources().getDimensionPixelSize(fk.d.f26404h);
    }

    private void C(int i11, int i12) {
        TextView l11;
        TextView l12;
        if (i11 == i12) {
            return;
        }
        if (i12 != 0 && (l12 = l(i12)) != null) {
            l12.setVisibility(0);
            l12.setAlpha(1.0f);
        }
        if (i11 != 0 && (l11 = l(i11)) != null) {
            l11.setVisibility(4);
            if (i11 == 1) {
                l11.setText((CharSequence) null);
            }
        }
        this.f15714h = i12;
    }

    private void K(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void M(ViewGroup viewGroup, int i11) {
        if (i11 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean N(TextView textView, CharSequence charSequence) {
        return a0.a0(this.f15708b) && this.f15708b.isEnabled() && !(this.f15715i == this.f15714h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void Q(int i11, int i12, boolean z11) {
        if (i11 == i12) {
            return;
        }
        if (z11) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f15712f = animatorSet;
            ArrayList arrayList = new ArrayList();
            h(arrayList, this.f15723q, this.f15724r, 2, i11, i12);
            h(arrayList, this.f15717k, this.f15718l, 1, i11, i12);
            gk.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i12, l(i11), i11, l(i12)));
            animatorSet.start();
        } else {
            C(i11, i12);
        }
        this.f15708b.updateEditTextBackground();
        this.f15708b.updateLabelState(z11);
        this.f15708b.updateTextInputBoxState();
    }

    private boolean f() {
        return (this.f15709c == null || this.f15708b.getEditText() == null) ? false : true;
    }

    private void h(List<Animator> list, boolean z11, TextView textView, int i11, int i12, int i13) {
        if (textView == null || !z11) {
            return;
        }
        if (i11 == i13 || i11 == i12) {
            list.add(i(textView, i13 == i11));
            if (i13 == i11) {
                list.add(j(textView));
            }
        }
    }

    private ObjectAnimator i(TextView textView, boolean z11) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, z11 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(gk.a.f27993a);
        return ofFloat;
    }

    private ObjectAnimator j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f15713g, BitmapDescriptorFactory.HUE_RED);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(gk.a.f27996d);
        return ofFloat;
    }

    private TextView l(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            return this.f15724r;
        }
        return this.f15718l;
    }

    private int s(boolean z11, int i11, int i12) {
        return z11 ? this.f15707a.getResources().getDimensionPixelSize(i11) : i12;
    }

    private boolean w(int i11) {
        return (i11 != 1 || this.f15718l == null || TextUtils.isEmpty(this.f15716j)) ? false : true;
    }

    private boolean x(int i11) {
        return (i11 != 2 || this.f15724r == null || TextUtils.isEmpty(this.f15722p)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.f15723q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B(TextView textView, int i11) {
        FrameLayout frameLayout;
        if (this.f15709c == null) {
            return;
        }
        if (y(i11) && (frameLayout = this.f15711e) != null) {
            frameLayout.removeView(textView);
        } else {
            this.f15709c.removeView(textView);
        }
        int i12 = this.f15710d - 1;
        this.f15710d = i12;
        M(this.f15709c, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(CharSequence charSequence) {
        this.f15719m = charSequence;
        TextView textView = this.f15718l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(boolean z11) {
        if (this.f15717k == z11) {
            return;
        }
        g();
        if (z11) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f15707a);
            this.f15718l = appCompatTextView;
            appCompatTextView.setId(fk.f.N);
            if (Build.VERSION.SDK_INT >= 17) {
                this.f15718l.setTextAlignment(5);
            }
            Typeface typeface = this.f15727u;
            if (typeface != null) {
                this.f15718l.setTypeface(typeface);
            }
            F(this.f15720n);
            G(this.f15721o);
            D(this.f15719m);
            this.f15718l.setVisibility(4);
            a0.y0(this.f15718l, 1);
            d(this.f15718l, 0);
        } else {
            u();
            B(this.f15718l, 0);
            this.f15718l = null;
            this.f15708b.updateEditTextBackground();
            this.f15708b.updateTextInputBoxState();
        }
        this.f15717k = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F(int i11) {
        this.f15720n = i11;
        TextView textView = this.f15718l;
        if (textView != null) {
            this.f15708b.setTextAppearanceCompatWithErrorFallback(textView, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(ColorStateList colorStateList) {
        this.f15721o = colorStateList;
        TextView textView = this.f15718l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(int i11) {
        this.f15725s = i11;
        TextView textView = this.f15724r;
        if (textView != null) {
            m.n(textView, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(boolean z11) {
        if (this.f15723q == z11) {
            return;
        }
        g();
        if (z11) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f15707a);
            this.f15724r = appCompatTextView;
            appCompatTextView.setId(fk.f.O);
            if (Build.VERSION.SDK_INT >= 17) {
                this.f15724r.setTextAlignment(5);
            }
            Typeface typeface = this.f15727u;
            if (typeface != null) {
                this.f15724r.setTypeface(typeface);
            }
            this.f15724r.setVisibility(4);
            a0.y0(this.f15724r, 1);
            H(this.f15725s);
            J(this.f15726t);
            d(this.f15724r, 1);
        } else {
            v();
            B(this.f15724r, 1);
            this.f15724r = null;
            this.f15708b.updateEditTextBackground();
            this.f15708b.updateTextInputBoxState();
        }
        this.f15723q = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(ColorStateList colorStateList) {
        this.f15726t = colorStateList;
        TextView textView = this.f15724r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(Typeface typeface) {
        if (typeface != this.f15727u) {
            this.f15727u = typeface;
            K(this.f15718l, typeface);
            K(this.f15724r, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(CharSequence charSequence) {
        g();
        this.f15716j = charSequence;
        this.f15718l.setText(charSequence);
        int i11 = this.f15714h;
        if (i11 != 1) {
            this.f15715i = 1;
        }
        Q(i11, this.f15715i, N(this.f15718l, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(CharSequence charSequence) {
        g();
        this.f15722p = charSequence;
        this.f15724r.setText(charSequence);
        int i11 = this.f15714h;
        if (i11 != 2) {
            this.f15715i = 2;
        }
        Q(i11, this.f15715i, N(this.f15724r, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(TextView textView, int i11) {
        if (this.f15709c == null && this.f15711e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f15707a);
            this.f15709c = linearLayout;
            linearLayout.setOrientation(0);
            this.f15708b.addView(this.f15709c, -1, -2);
            this.f15711e = new FrameLayout(this.f15707a);
            this.f15709c.addView(this.f15711e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f15708b.getEditText() != null) {
                e();
            }
        }
        if (y(i11)) {
            this.f15711e.setVisibility(0);
            this.f15711e.addView(textView);
        } else {
            this.f15709c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f15709c.setVisibility(0);
        this.f15710d++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        if (f()) {
            EditText editText = this.f15708b.getEditText();
            boolean g11 = tk.c.g(this.f15707a);
            LinearLayout linearLayout = this.f15709c;
            int i11 = fk.d.f26416t;
            a0.K0(linearLayout, s(g11, i11, a0.K(editText)), s(g11, fk.d.f26417u, this.f15707a.getResources().getDimensionPixelSize(fk.d.f26415s)), s(g11, i11, a0.J(editText)), 0);
        }
    }

    void g() {
        Animator animator = this.f15712f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        return w(this.f15715i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence m() {
        return this.f15719m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence n() {
        return this.f15716j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        TextView textView = this.f15718l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList p() {
        TextView textView = this.f15718l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence q() {
        return this.f15722p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int r() {
        TextView textView = this.f15724r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t() {
        return x(this.f15714h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u() {
        this.f15716j = null;
        g();
        if (this.f15714h == 1) {
            if (this.f15723q && !TextUtils.isEmpty(this.f15722p)) {
                this.f15715i = 2;
            } else {
                this.f15715i = 0;
            }
        }
        Q(this.f15714h, this.f15715i, N(this.f15718l, null));
    }

    void v() {
        g();
        int i11 = this.f15714h;
        if (i11 == 2) {
            this.f15715i = 0;
        }
        Q(i11, this.f15715i, N(this.f15724r, null));
    }

    boolean y(int i11) {
        return i11 == 0 || i11 == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z() {
        return this.f15717k;
    }
}