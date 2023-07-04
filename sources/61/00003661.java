package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import androidx.core.view.l0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.b;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes3.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: r  reason: collision with root package name */
    static final Handler f15577r;

    /* renamed from: s  reason: collision with root package name */
    private static final boolean f15578s;

    /* renamed from: t  reason: collision with root package name */
    private static final int[] f15579t;

    /* renamed from: u  reason: collision with root package name */
    private static final String f15580u;

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f15581a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f15582b;

    /* renamed from: c  reason: collision with root package name */
    protected final v f15583c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.material.snackbar.a f15584d;

    /* renamed from: e  reason: collision with root package name */
    private int f15585e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15586f;

    /* renamed from: h  reason: collision with root package name */
    private Rect f15588h;

    /* renamed from: i  reason: collision with root package name */
    private int f15589i;

    /* renamed from: j  reason: collision with root package name */
    private int f15590j;

    /* renamed from: k  reason: collision with root package name */
    private int f15591k;

    /* renamed from: l  reason: collision with root package name */
    private int f15592l;

    /* renamed from: m  reason: collision with root package name */
    private int f15593m;

    /* renamed from: n  reason: collision with root package name */
    private List<r<B>> f15594n;

    /* renamed from: o  reason: collision with root package name */
    private Behavior f15595o;

    /* renamed from: p  reason: collision with root package name */
    private final AccessibilityManager f15596p;

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f15587g = new j();

    /* renamed from: q  reason: collision with root package name */
    b.InterfaceC0279b f15597q = new m();

    /* loaded from: classes3.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k  reason: collision with root package name */
        private final s f15598k = new s(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void P(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f15598k.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean E(View view) {
            return this.f15598k.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f15598k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15600a;

        b(int i11) {
            this.f15600a = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.H(this.f15600a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f15583c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f15583c.setScaleX(floatValue);
            BaseTransientBottomBar.this.f15583c.setScaleY(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e extends AnimatorListenerAdapter {
        e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.I();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f15584d.a(70, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private int f15605a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f15606b;

        f(int i11) {
            this.f15606b = i11;
            this.f15605a = i11;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f15578s) {
                a0.h0(BaseTransientBottomBar.this.f15583c, intValue - this.f15605a);
            } else {
                BaseTransientBottomBar.this.f15583c.setTranslationY(intValue);
            }
            this.f15605a = intValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15608a;

        g(int i11) {
            this.f15608a = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.H(this.f15608a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f15584d.b(0, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private int f15610a = 0;

        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f15578s) {
                a0.h0(BaseTransientBottomBar.this.f15583c, intValue - this.f15610a);
            } else {
                BaseTransientBottomBar.this.f15583c.setTranslationY(intValue);
            }
            this.f15610a = intValue;
        }
    }

    /* loaded from: classes3.dex */
    static class i implements Handler.Callback {
        i() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11 = message.what;
            if (i11 == 0) {
                ((BaseTransientBottomBar) message.obj).P();
                return true;
            } else if (i11 != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).E(message.arg1);
                return true;
            }
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int z11;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f15583c == null || baseTransientBottomBar.f15582b == null || (z11 = (BaseTransientBottomBar.this.z() - BaseTransientBottomBar.this.C()) + ((int) BaseTransientBottomBar.this.f15583c.getTranslationY())) >= BaseTransientBottomBar.this.f15592l) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f15583c.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f15580u, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f15592l - z11;
            BaseTransientBottomBar.this.f15583c.requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    class k implements androidx.core.view.u {
        k() {
        }

        @Override // androidx.core.view.u
        public l0 a(View view, l0 l0Var) {
            BaseTransientBottomBar.this.f15589i = l0Var.j();
            BaseTransientBottomBar.this.f15590j = l0Var.k();
            BaseTransientBottomBar.this.f15591k = l0Var.l();
            BaseTransientBottomBar.this.V();
            return l0Var;
        }
    }

    /* loaded from: classes3.dex */
    class l extends androidx.core.view.a {
        l() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            cVar.a(PKIFailureInfo.badCertTemplate);
            cVar.i0(true);
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            if (i11 == 1048576) {
                BaseTransientBottomBar.this.s();
                return true;
            }
            return super.performAccessibilityAction(view, i11, bundle);
        }
    }

    /* loaded from: classes3.dex */
    class m implements b.InterfaceC0279b {
        m() {
        }

        @Override // com.google.android.material.snackbar.b.InterfaceC0279b
        public void a(int i11) {
            Handler handler = BaseTransientBottomBar.f15577r;
            handler.sendMessage(handler.obtainMessage(1, i11, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.b.InterfaceC0279b
        public void show() {
            Handler handler = BaseTransientBottomBar.f15577r;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class n implements t {

        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BaseTransientBottomBar.this.H(3);
            }
        }

        n() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t
        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = BaseTransientBottomBar.this.f15583c.getRootWindowInsets()) == null) {
                return;
            }
            BaseTransientBottomBar.this.f15592l = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            BaseTransientBottomBar.this.V();
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.t
        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.F()) {
                BaseTransientBottomBar.f15577r.post(new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class o implements u {
        o() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.u
        public void a(View view, int i11, int i12, int i13, int i14) {
            BaseTransientBottomBar.this.f15583c.setOnLayoutChangeListener(null);
            BaseTransientBottomBar.this.Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class p implements SwipeDismissBehavior.c {
        p() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.t(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i11) {
            if (i11 == 0) {
                com.google.android.material.snackbar.b.c().k(BaseTransientBottomBar.this.f15597q);
            } else if (i11 == 1 || i11 == 2) {
                com.google.android.material.snackbar.b.c().j(BaseTransientBottomBar.this.f15597q);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v vVar = BaseTransientBottomBar.this.f15583c;
            if (vVar == null) {
                return;
            }
            if (vVar.getParent() != null) {
                BaseTransientBottomBar.this.f15583c.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f15583c.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.R();
            } else {
                BaseTransientBottomBar.this.T();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class r<B> {
        public void a(B b11, int i11) {
        }

        public void b(B b11) {
        }
    }

    /* loaded from: classes3.dex */
    public static class s {

        /* renamed from: a  reason: collision with root package name */
        private b.InterfaceC0279b f15621a;

        public s(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.J(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(View view) {
            return view instanceof v;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.b.c().j(this.f15621a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.b.c().k(this.f15621a);
            }
        }

        public void c(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f15621a = baseTransientBottomBar.f15597q;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public interface t {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public interface u {
        void a(View view, int i11, int i12, int i13, int i14);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class v extends FrameLayout {

        /* renamed from: j  reason: collision with root package name */
        private static final View.OnTouchListener f15622j = new a();

        /* renamed from: a  reason: collision with root package name */
        private u f15623a;

        /* renamed from: b  reason: collision with root package name */
        private t f15624b;

        /* renamed from: c  reason: collision with root package name */
        private int f15625c;

        /* renamed from: d  reason: collision with root package name */
        private final float f15626d;

        /* renamed from: e  reason: collision with root package name */
        private final float f15627e;

        /* renamed from: f  reason: collision with root package name */
        private final int f15628f;

        /* renamed from: g  reason: collision with root package name */
        private final int f15629g;

        /* renamed from: h  reason: collision with root package name */
        private ColorStateList f15630h;

        /* renamed from: i  reason: collision with root package name */
        private PorterDuff.Mode f15631i;

        /* loaded from: classes3.dex */
        static class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public v(Context context, AttributeSet attributeSet) {
            super(yk.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, fk.k.f26540d3);
            int i11 = fk.k.f26582k3;
            if (obtainStyledAttributes.hasValue(i11)) {
                a0.D0(this, obtainStyledAttributes.getDimensionPixelSize(i11, 0));
            }
            this.f15625c = obtainStyledAttributes.getInt(fk.k.f26558g3, 0);
            this.f15626d = obtainStyledAttributes.getFloat(fk.k.f26564h3, 1.0f);
            setBackgroundTintList(tk.c.a(context2, obtainStyledAttributes, fk.k.f26570i3));
            setBackgroundTintMode(com.google.android.material.internal.l.e(obtainStyledAttributes.getInt(fk.k.f26576j3, -1), PorterDuff.Mode.SRC_IN));
            this.f15627e = obtainStyledAttributes.getFloat(fk.k.f26552f3, 1.0f);
            this.f15628f = obtainStyledAttributes.getDimensionPixelSize(fk.k.f26546e3, -1);
            this.f15629g = obtainStyledAttributes.getDimensionPixelSize(fk.k.f26588l3, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f15622j);
            setFocusable(true);
            if (getBackground() == null) {
                a0.z0(this, a());
            }
        }

        private Drawable a() {
            float dimension = getResources().getDimension(fk.d.S);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(kk.a.i(this, fk.b.f26378n, fk.b.f26375k, getBackgroundOverlayColorAlpha()));
            if (this.f15630h != null) {
                Drawable r11 = n3.a.r(gradientDrawable);
                n3.a.o(r11, this.f15630h);
                return r11;
            }
            return n3.a.r(gradientDrawable);
        }

        float getActionTextColorAlpha() {
            return this.f15627e;
        }

        int getAnimationMode() {
            return this.f15625c;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f15626d;
        }

        int getMaxInlineActionWidth() {
            return this.f15629g;
        }

        int getMaxWidth() {
            return this.f15628f;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            t tVar = this.f15624b;
            if (tVar != null) {
                tVar.onViewAttachedToWindow(this);
            }
            a0.t0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            t tVar = this.f15624b;
            if (tVar != null) {
                tVar.onViewDetachedFromWindow(this);
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
            super.onLayout(z11, i11, i12, i13, i14);
            u uVar = this.f15623a;
            if (uVar != null) {
                uVar.a(this, i11, i12, i13, i14);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i11, int i12) {
            super.onMeasure(i11, i12);
            if (this.f15628f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i13 = this.f15628f;
                if (measuredWidth > i13) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), i12);
                }
            }
        }

        void setAnimationMode(int i11) {
            this.f15625c = i11;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f15630h != null) {
                drawable = n3.a.r(drawable.mutate());
                n3.a.o(drawable, this.f15630h);
                n3.a.p(drawable, this.f15631i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f15630h = colorStateList;
            if (getBackground() != null) {
                Drawable r11 = n3.a.r(getBackground().mutate());
                n3.a.o(r11, colorStateList);
                n3.a.p(r11, this.f15631i);
                if (r11 != getBackground()) {
                    super.setBackgroundDrawable(r11);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f15631i = mode;
            if (getBackground() != null) {
                Drawable r11 = n3.a.r(getBackground().mutate());
                n3.a.p(r11, mode);
                if (r11 != getBackground()) {
                    super.setBackgroundDrawable(r11);
                }
            }
        }

        void setOnAttachStateChangeListener(t tVar) {
            this.f15624b = tVar;
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f15622j);
            super.setOnClickListener(onClickListener);
        }

        void setOnLayoutChangeListener(u uVar) {
            this.f15623a = uVar;
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        f15578s = i11 >= 16 && i11 <= 19;
        f15579t = new int[]{fk.b.G};
        f15580u = BaseTransientBottomBar.class.getSimpleName();
        f15577r = new Handler(Looper.getMainLooper(), new i());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar != null) {
            this.f15581a = viewGroup;
            this.f15584d = aVar;
            this.f15582b = context;
            com.google.android.material.internal.j.a(context);
            v vVar = (v) LayoutInflater.from(context).inflate(A(), viewGroup, false);
            this.f15583c = vVar;
            if (view instanceof SnackbarContentLayout) {
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                snackbarContentLayout.c(vVar.getActionTextColorAlpha());
                snackbarContentLayout.setMaxInlineActionWidth(vVar.getMaxInlineActionWidth());
            }
            vVar.addView(view);
            ViewGroup.LayoutParams layoutParams = vVar.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f15588h = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            a0.y0(vVar, 1);
            a0.G0(vVar, 1);
            a0.E0(vVar, true);
            a0.J0(vVar, new k());
            a0.w0(vVar, new l());
            this.f15596p = (AccessibilityManager) context.getSystemService("accessibility");
            return;
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
    }

    private int B() {
        int height = this.f15583c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f15583c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int C() {
        int[] iArr = new int[2];
        this.f15583c.getLocationOnScreen(iArr);
        return iArr[1] + this.f15583c.getHeight();
    }

    private boolean G() {
        ViewGroup.LayoutParams layoutParams = this.f15583c.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    private void J() {
        this.f15593m = r();
        V();
    }

    private void L(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior = this.f15595o;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = x();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).P(this);
        }
        swipeDismissBehavior.K(new p());
        fVar.o(swipeDismissBehavior);
        if (v() == null) {
            fVar.f4237g = 80;
        }
    }

    private boolean N() {
        return this.f15592l > 0 && !this.f15586f && G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() {
        if (M()) {
            p();
            return;
        }
        if (this.f15583c.getParent() != null) {
            this.f15583c.setVisibility(0);
        }
        I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        ValueAnimator u11 = u(BitmapDescriptorFactory.HUE_RED, 1.0f);
        ValueAnimator y11 = y(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(u11, y11);
        animatorSet.setDuration(150L);
        animatorSet.addListener(new a());
        animatorSet.start();
    }

    private void S(int i11) {
        ValueAnimator u11 = u(1.0f, BitmapDescriptorFactory.HUE_RED);
        u11.setDuration(75L);
        u11.addListener(new b(i11));
        u11.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        int B = B();
        if (f15578s) {
            a0.h0(this.f15583c, B);
        } else {
            this.f15583c.setTranslationY(B);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(B, 0);
        valueAnimator.setInterpolator(gk.a.f27994b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new e());
        valueAnimator.addUpdateListener(new f(B));
        valueAnimator.start();
    }

    private void U(int i11) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, B());
        valueAnimator.setInterpolator(gk.a.f27994b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener(new g(i11));
        valueAnimator.addUpdateListener(new h());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        ViewGroup.LayoutParams layoutParams = this.f15583c.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && this.f15588h != null) {
            int i11 = v() != null ? this.f15593m : this.f15589i;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Rect rect = this.f15588h;
            marginLayoutParams.bottomMargin = rect.bottom + i11;
            marginLayoutParams.leftMargin = rect.left + this.f15590j;
            marginLayoutParams.rightMargin = rect.right + this.f15591k;
            this.f15583c.requestLayout();
            if (Build.VERSION.SDK_INT < 29 || !N()) {
                return;
            }
            this.f15583c.removeCallbacks(this.f15587g);
            this.f15583c.post(this.f15587g);
            return;
        }
        Log.w(f15580u, "Unable to update margins because layout params are not MarginLayoutParams");
    }

    private void q(int i11) {
        if (this.f15583c.getAnimationMode() == 1) {
            S(i11);
        } else {
            U(i11);
        }
    }

    private int r() {
        if (v() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        v().getLocationOnScreen(iArr);
        int i11 = iArr[1];
        int[] iArr2 = new int[2];
        this.f15581a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f15581a.getHeight()) - i11;
    }

    private ValueAnimator u(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(gk.a.f27993a);
        ofFloat.addUpdateListener(new c());
        return ofFloat;
    }

    private ValueAnimator y(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(gk.a.f27996d);
        ofFloat.addUpdateListener(new d());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int z() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f15582b.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    protected int A() {
        return D() ? fk.h.f26477s : fk.h.f26460b;
    }

    protected boolean D() {
        TypedArray obtainStyledAttributes = this.f15582b.obtainStyledAttributes(f15579t);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    final void E(int i11) {
        if (M() && this.f15583c.getVisibility() == 0) {
            q(i11);
        } else {
            H(i11);
        }
    }

    public boolean F() {
        return com.google.android.material.snackbar.b.c().e(this.f15597q);
    }

    void H(int i11) {
        com.google.android.material.snackbar.b.c().h(this.f15597q);
        List<r<B>> list = this.f15594n;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f15594n.get(size).a(this, i11);
            }
        }
        ViewParent parent = this.f15583c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f15583c);
        }
    }

    void I() {
        com.google.android.material.snackbar.b.c().i(this.f15597q);
        List<r<B>> list = this.f15594n;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f15594n.get(size).b(this);
            }
        }
    }

    public B K(int i11) {
        this.f15585e = i11;
        return this;
    }

    boolean M() {
        AccessibilityManager accessibilityManager = this.f15596p;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void O() {
        com.google.android.material.snackbar.b.c().m(w(), this.f15597q);
    }

    final void P() {
        this.f15583c.setOnAttachStateChangeListener(new n());
        if (this.f15583c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f15583c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                L((CoordinatorLayout.f) layoutParams);
            }
            J();
            this.f15583c.setVisibility(4);
            this.f15581a.addView(this.f15583c);
        }
        if (a0.a0(this.f15583c)) {
            Q();
        } else {
            this.f15583c.setOnLayoutChangeListener(new o());
        }
    }

    void p() {
        this.f15583c.post(new q());
    }

    public void s() {
        t(3);
    }

    protected void t(int i11) {
        com.google.android.material.snackbar.b.c().b(this.f15597q, i11);
    }

    public View v() {
        return null;
    }

    public int w() {
        return this.f15585e;
    }

    protected SwipeDismissBehavior<? extends View> x() {
        return new Behavior();
    }
}