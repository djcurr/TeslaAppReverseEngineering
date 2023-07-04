package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.a0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import wk.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class a {
    static final TimeInterpolator C = gk.a.f27995c;
    static final int[] D = {16842919, 16842910};
    static final int[] E = {16843623, 16842908, 16842910};
    static final int[] F = {16842908, 16842910};
    static final int[] G = {16843623, 16842910};
    static final int[] H = {16842910};
    static final int[] I = new int[0];
    private ViewTreeObserver.OnPreDrawListener B;

    /* renamed from: a  reason: collision with root package name */
    wk.k f15319a;

    /* renamed from: b  reason: collision with root package name */
    wk.g f15320b;

    /* renamed from: c  reason: collision with root package name */
    Drawable f15321c;

    /* renamed from: d  reason: collision with root package name */
    Drawable f15322d;

    /* renamed from: e  reason: collision with root package name */
    boolean f15323e;

    /* renamed from: g  reason: collision with root package name */
    float f15325g;

    /* renamed from: h  reason: collision with root package name */
    float f15326h;

    /* renamed from: i  reason: collision with root package name */
    float f15327i;

    /* renamed from: j  reason: collision with root package name */
    int f15328j;

    /* renamed from: k  reason: collision with root package name */
    private final com.google.android.material.internal.f f15329k;

    /* renamed from: l  reason: collision with root package name */
    private Animator f15330l;

    /* renamed from: m  reason: collision with root package name */
    private gk.h f15331m;

    /* renamed from: n  reason: collision with root package name */
    private gk.h f15332n;

    /* renamed from: o  reason: collision with root package name */
    private float f15333o;

    /* renamed from: q  reason: collision with root package name */
    private int f15335q;

    /* renamed from: s  reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f15337s;

    /* renamed from: t  reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f15338t;

    /* renamed from: u  reason: collision with root package name */
    private ArrayList<j> f15339u;

    /* renamed from: v  reason: collision with root package name */
    final FloatingActionButton f15340v;

    /* renamed from: w  reason: collision with root package name */
    final vk.b f15341w;

    /* renamed from: f  reason: collision with root package name */
    boolean f15324f = true;

    /* renamed from: p  reason: collision with root package name */
    private float f15334p = 1.0f;

    /* renamed from: r  reason: collision with root package name */
    private int f15336r = 0;

    /* renamed from: x  reason: collision with root package name */
    private final Rect f15342x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    private final RectF f15343y = new RectF();

    /* renamed from: z  reason: collision with root package name */
    private final RectF f15344z = new RectF();
    private final Matrix A = new Matrix();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0275a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f15345a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f15346b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f15347c;

        C0275a(boolean z11, k kVar) {
            this.f15346b = z11;
            this.f15347c = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f15345a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f15336r = 0;
            a.this.f15330l = null;
            if (this.f15345a) {
                return;
            }
            FloatingActionButton floatingActionButton = a.this.f15340v;
            boolean z11 = this.f15346b;
            floatingActionButton.b(z11 ? 8 : 4, z11);
            k kVar = this.f15347c;
            if (kVar != null) {
                kVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f15340v.b(0, this.f15346b);
            a.this.f15336r = 1;
            a.this.f15330l = animator;
            this.f15345a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f15349a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f15350b;

        b(boolean z11, k kVar) {
            this.f15349a = z11;
            this.f15350b = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f15336r = 0;
            a.this.f15330l = null;
            k kVar = this.f15350b;
            if (kVar != null) {
                kVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f15340v.b(0, this.f15349a);
            a.this.f15336r = 2;
            a.this.f15330l = animator;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends gk.g {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f11, Matrix matrix, Matrix matrix2) {
            a.this.f15334p = f11;
            return super.a(f11, matrix, matrix2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f15353a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f15354b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f15355c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f15356d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f15357e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f15358f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f15359g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Matrix f15360h;

        d(float f11, float f12, float f13, float f14, float f15, float f16, float f17, Matrix matrix) {
            this.f15353a = f11;
            this.f15354b = f12;
            this.f15355c = f13;
            this.f15356d = f14;
            this.f15357e = f15;
            this.f15358f = f16;
            this.f15359g = f17;
            this.f15360h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f15340v.setAlpha(gk.a.b(this.f15353a, this.f15354b, BitmapDescriptorFactory.HUE_RED, 0.2f, floatValue));
            a.this.f15340v.setScaleX(gk.a.a(this.f15355c, this.f15356d, floatValue));
            a.this.f15340v.setScaleY(gk.a.a(this.f15357e, this.f15356d, floatValue));
            a.this.f15334p = gk.a.a(this.f15358f, this.f15359g, floatValue);
            a.this.h(gk.a.a(this.f15358f, this.f15359g, floatValue), this.f15360h);
            a.this.f15340v.setImageMatrix(this.f15360h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements TypeEvaluator<Float> {

        /* renamed from: a  reason: collision with root package name */
        FloatEvaluator f15362a = new FloatEvaluator();

        e(a aVar) {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Float evaluate(float f11, Float f12, Float f13) {
            float floatValue = this.f15362a.evaluate(f11, (Number) f12, (Number) f13).floatValue();
            if (floatValue < 0.1f) {
                floatValue = BitmapDescriptorFactory.HUE_RED;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a.this.F();
            return true;
        }
    }

    /* loaded from: classes3.dex */
    private class g extends m {
        g(a aVar) {
            super(aVar, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    /* loaded from: classes3.dex */
    private class h extends m {
        h() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            a aVar = a.this;
            return aVar.f15325g + aVar.f15326h;
        }
    }

    /* loaded from: classes3.dex */
    private class i extends m {
        i() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            a aVar = a.this;
            return aVar.f15325g + aVar.f15327i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface j {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface k {
        void a();

        void b();
    }

    /* loaded from: classes3.dex */
    private class l extends m {
        l() {
            super(a.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.a.m
        protected float a() {
            return a.this.f15325g;
        }
    }

    /* loaded from: classes3.dex */
    private abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f15367a;

        /* renamed from: b  reason: collision with root package name */
        private float f15368b;

        /* renamed from: c  reason: collision with root package name */
        private float f15369c;

        private m() {
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.d0((int) this.f15369c);
            this.f15367a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f15367a) {
                wk.g gVar = a.this.f15320b;
                this.f15368b = gVar == null ? BitmapDescriptorFactory.HUE_RED : gVar.w();
                this.f15369c = a();
                this.f15367a = true;
            }
            a aVar = a.this;
            float f11 = this.f15368b;
            aVar.d0((int) (f11 + ((this.f15369c - f11) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ m(a aVar, C0275a c0275a) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(FloatingActionButton floatingActionButton, vk.b bVar) {
        this.f15340v = floatingActionButton;
        this.f15341w = bVar;
        com.google.android.material.internal.f fVar = new com.google.android.material.internal.f();
        this.f15329k = fVar;
        fVar.a(D, k(new i()));
        fVar.a(E, k(new h()));
        fVar.a(F, k(new h()));
        fVar.a(G, k(new h()));
        fVar.a(H, k(new l()));
        fVar.a(I, k(new g(this)));
        this.f15333o = floatingActionButton.getRotation();
    }

    private boolean X() {
        return a0.a0(this.f15340v) && !this.f15340v.isInEditMode();
    }

    private void e0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(float f11, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f15340v.getDrawable();
        if (drawable == null || this.f15335q == 0) {
            return;
        }
        RectF rectF = this.f15343y;
        RectF rectF2 = this.f15344z;
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i11 = this.f15335q;
        rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i11, i11);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i12 = this.f15335q;
        matrix.postScale(f11, f11, i12 / 2.0f, i12 / 2.0f);
    }

    private AnimatorSet i(gk.h hVar, float f11, float f12, float f13) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f15340v, View.ALPHA, f11);
        hVar.e("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f15340v, View.SCALE_X, f12);
        hVar.e("scale").a(ofFloat2);
        e0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f15340v, View.SCALE_Y, f12);
        hVar.e("scale").a(ofFloat3);
        e0(ofFloat3);
        arrayList.add(ofFloat3);
        h(f13, this.A);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f15340v, new gk.f(), new c(), new Matrix(this.A));
        hVar.e("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        gk.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet j(float f11, float f12, float f13) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ofFloat.addUpdateListener(new d(this.f15340v.getAlpha(), f11, this.f15340v.getScaleX(), f12, this.f15340v.getScaleY(), this.f15334p, f13, new Matrix(this.A)));
        arrayList.add(ofFloat);
        gk.b.a(animatorSet, arrayList);
        animatorSet.setDuration(qk.a.d(this.f15340v.getContext(), fk.b.B, this.f15340v.getContext().getResources().getInteger(fk.g.f26457b)));
        animatorSet.setInterpolator(qk.a.e(this.f15340v.getContext(), fk.b.C, gk.a.f27994b));
        return animatorSet;
    }

    private ValueAnimator k(m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(C);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(BitmapDescriptorFactory.HUE_RED, 1.0f);
        return valueAnimator;
    }

    private ViewTreeObserver.OnPreDrawListener q() {
        if (this.B == null) {
            this.B = new f();
        }
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void B() {
        ViewTreeObserver viewTreeObserver = this.f15340v.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.B;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.B = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(int[] iArr) {
        this.f15329k.d(iArr);
    }

    void D(float f11, float f12, float f13) {
        c0();
        d0(f11);
    }

    void E(Rect rect) {
        v3.h.g(this.f15322d, "Didn't initialize content background");
        if (W()) {
            this.f15341w.a(new InsetDrawable(this.f15322d, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f15341w.a(this.f15322d);
    }

    void F() {
        float rotation = this.f15340v.getRotation();
        if (this.f15333o != rotation) {
            this.f15333o = rotation;
            a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G() {
        ArrayList<j> arrayList = this.f15339u;
        if (arrayList != null) {
            Iterator<j> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H() {
        ArrayList<j> arrayList = this.f15339u;
        if (arrayList != null) {
            Iterator<j> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
        }
    }

    boolean I() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(ColorStateList colorStateList) {
        wk.g gVar = this.f15320b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(PorterDuff.Mode mode) {
        wk.g gVar = this.f15320b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void L(float f11) {
        if (this.f15325g != f11) {
            this.f15325g = f11;
            D(f11, this.f15326h, this.f15327i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(boolean z11) {
        this.f15323e = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void N(gk.h hVar) {
        this.f15332n = hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void O(float f11) {
        if (this.f15326h != f11) {
            this.f15326h = f11;
            D(this.f15325g, f11, this.f15327i);
        }
    }

    final void P(float f11) {
        this.f15334p = f11;
        Matrix matrix = this.A;
        h(f11, matrix);
        this.f15340v.setImageMatrix(matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void Q(int i11) {
        if (this.f15335q != i11) {
            this.f15335q = i11;
            b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void R(float f11) {
        if (this.f15327i != f11) {
            this.f15327i = f11;
            D(this.f15325g, this.f15326h, f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(ColorStateList colorStateList) {
        Drawable drawable = this.f15321c;
        if (drawable != null) {
            n3.a.o(drawable, uk.b.a(colorStateList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(boolean z11) {
        this.f15324f = z11;
        c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void U(wk.k kVar) {
        this.f15319a = kVar;
        wk.g gVar = this.f15320b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f15321c;
        if (drawable instanceof n) {
            ((n) drawable).setShapeAppearanceModel(kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void V(gk.h hVar) {
        this.f15331m = hVar;
    }

    boolean W() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Y() {
        return !this.f15323e || this.f15340v.getSizeDimension() >= this.f15328j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(k kVar, boolean z11) {
        AnimatorSet j11;
        if (x()) {
            return;
        }
        Animator animator = this.f15330l;
        if (animator != null) {
            animator.cancel();
        }
        boolean z12 = this.f15331m == null;
        if (X()) {
            if (this.f15340v.getVisibility() != 0) {
                FloatingActionButton floatingActionButton = this.f15340v;
                float f11 = BitmapDescriptorFactory.HUE_RED;
                floatingActionButton.setAlpha(BitmapDescriptorFactory.HUE_RED);
                this.f15340v.setScaleY(z12 ? 0.4f : 0.0f);
                this.f15340v.setScaleX(z12 ? 0.4f : 0.0f);
                if (z12) {
                    f11 = 0.4f;
                }
                P(f11);
            }
            gk.h hVar = this.f15331m;
            if (hVar != null) {
                j11 = i(hVar, 1.0f, 1.0f, 1.0f);
            } else {
                j11 = j(1.0f, 1.0f, 1.0f);
            }
            j11.addListener(new b(z11, kVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.f15337s;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    j11.addListener(it2.next());
                }
            }
            j11.start();
            return;
        }
        this.f15340v.b(0, z11);
        this.f15340v.setAlpha(1.0f);
        this.f15340v.setScaleY(1.0f);
        this.f15340v.setScaleX(1.0f);
        P(1.0f);
        if (kVar != null) {
            kVar.a();
        }
    }

    void a0() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f15333o % 90.0f != BitmapDescriptorFactory.HUE_RED) {
                if (this.f15340v.getLayerType() != 1) {
                    this.f15340v.setLayerType(1, null);
                }
            } else if (this.f15340v.getLayerType() != 0) {
                this.f15340v.setLayerType(0, null);
            }
        }
        wk.g gVar = this.f15320b;
        if (gVar != null) {
            gVar.e0((int) this.f15333o);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b0() {
        P(this.f15334p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c0() {
        Rect rect = this.f15342x;
        r(rect);
        E(rect);
        this.f15341w.b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0(float f11) {
        wk.g gVar = this.f15320b;
        if (gVar != null) {
            gVar.X(f11);
        }
    }

    public void e(Animator.AnimatorListener animatorListener) {
        if (this.f15338t == null) {
            this.f15338t = new ArrayList<>();
        }
        this.f15338t.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Animator.AnimatorListener animatorListener) {
        if (this.f15337s == null) {
            this.f15337s = new ArrayList<>();
        }
        this.f15337s.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(j jVar) {
        if (this.f15339u == null) {
            this.f15339u = new ArrayList<>();
        }
        this.f15339u.add(jVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable l() {
        return this.f15322d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float m() {
        return this.f15325g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return this.f15323e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final gk.h o() {
        return this.f15332n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float p() {
        return this.f15326h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(Rect rect) {
        int sizeDimension = this.f15323e ? (this.f15328j - this.f15340v.getSizeDimension()) / 2 : 0;
        float m11 = this.f15324f ? m() + this.f15327i : BitmapDescriptorFactory.HUE_RED;
        int max = Math.max(sizeDimension, (int) Math.ceil(m11));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(m11 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float s() {
        return this.f15327i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final wk.k t() {
        return this.f15319a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final gk.h u() {
        return this.f15331m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(k kVar, boolean z11) {
        AnimatorSet j11;
        if (w()) {
            return;
        }
        Animator animator = this.f15330l;
        if (animator != null) {
            animator.cancel();
        }
        if (X()) {
            gk.h hVar = this.f15332n;
            if (hVar != null) {
                j11 = i(hVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            } else {
                j11 = j(BitmapDescriptorFactory.HUE_RED, 0.4f, 0.4f);
            }
            j11.addListener(new C0275a(z11, kVar));
            ArrayList<Animator.AnimatorListener> arrayList = this.f15338t;
            if (arrayList != null) {
                Iterator<Animator.AnimatorListener> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    j11.addListener(it2.next());
                }
            }
            j11.start();
            return;
        }
        this.f15340v.b(z11 ? 8 : 4, z11);
        if (kVar != null) {
            kVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean w() {
        return this.f15340v.getVisibility() == 0 ? this.f15336r == 1 : this.f15336r != 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x() {
        return this.f15340v.getVisibility() != 0 ? this.f15336r == 2 : this.f15336r != 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y() {
        this.f15329k.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
        wk.g gVar = this.f15320b;
        if (gVar != null) {
            wk.h.f(this.f15340v, gVar);
        }
        if (I()) {
            this.f15340v.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }
}