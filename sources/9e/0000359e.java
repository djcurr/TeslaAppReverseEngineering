package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import androidx.core.view.l0;
import b4.c;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.l;
import fk.i;
import fk.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import w3.c;
import w3.f;
import wk.k;

/* loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final int Z = j.f26502f;
    int A;
    float B;
    int C;
    float D;
    boolean E;
    private boolean F;
    private boolean G;
    int H;
    b4.c I;
    private boolean J;
    private int K;
    private boolean L;
    private int M;
    int N;
    int O;
    WeakReference<V> P;
    WeakReference<View> Q;
    private final ArrayList<f> R;
    private VelocityTracker S;
    int T;
    private int U;
    boolean V;
    private Map<View, Integer> W;
    private int X;
    private final c.AbstractC0147c Y;

    /* renamed from: a  reason: collision with root package name */
    private int f14953a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14954b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14955c;

    /* renamed from: d  reason: collision with root package name */
    private float f14956d;

    /* renamed from: e  reason: collision with root package name */
    private int f14957e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14958f;

    /* renamed from: g  reason: collision with root package name */
    private int f14959g;

    /* renamed from: h  reason: collision with root package name */
    private int f14960h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f14961i;

    /* renamed from: j  reason: collision with root package name */
    private wk.g f14962j;

    /* renamed from: k  reason: collision with root package name */
    private int f14963k;

    /* renamed from: l  reason: collision with root package name */
    private int f14964l;

    /* renamed from: m  reason: collision with root package name */
    private int f14965m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f14966n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f14967o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f14968p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f14969q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f14970r;

    /* renamed from: s  reason: collision with root package name */
    private int f14971s;

    /* renamed from: t  reason: collision with root package name */
    private int f14972t;

    /* renamed from: u  reason: collision with root package name */
    private k f14973u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f14974v;

    /* renamed from: w  reason: collision with root package name */
    private BottomSheetBehavior<V>.h f14975w;

    /* renamed from: x  reason: collision with root package name */
    private ValueAnimator f14976x;

    /* renamed from: y  reason: collision with root package name */
    int f14977y;

    /* renamed from: z  reason: collision with root package name */
    int f14978z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f14979a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f14980b;

        a(View view, int i11) {
            this.f14979a = view;
            this.f14980b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.E0(this.f14979a, this.f14980b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f14962j != null) {
                BottomSheetBehavior.this.f14962j.Z(floatValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements l.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f14983a;

        c(boolean z11) {
            this.f14983a = z11;
        }

        @Override // com.google.android.material.internal.l.d
        public l0 a(View view, l0 l0Var, l.e eVar) {
            BottomSheetBehavior.this.f14972t = l0Var.m();
            boolean d11 = l.d(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f14967o) {
                BottomSheetBehavior.this.f14971s = l0Var.j();
                paddingBottom = eVar.f15470d + BottomSheetBehavior.this.f14971s;
            }
            if (BottomSheetBehavior.this.f14968p) {
                paddingLeft = (d11 ? eVar.f15469c : eVar.f15467a) + l0Var.k();
            }
            if (BottomSheetBehavior.this.f14969q) {
                paddingRight = (d11 ? eVar.f15467a : eVar.f15469c) + l0Var.l();
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f14983a) {
                BottomSheetBehavior.this.f14965m = l0Var.g().f38367d;
            }
            if (BottomSheetBehavior.this.f14967o || this.f14983a) {
                BottomSheetBehavior.this.P0(false);
            }
            return l0Var;
        }
    }

    /* loaded from: classes3.dex */
    class d extends c.AbstractC0147c {

        /* renamed from: a  reason: collision with root package name */
        private long f14985a;

        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.O + bottomSheetBehavior.e0()) / 2;
        }

        @Override // b4.c.AbstractC0147c
        public int a(View view, int i11, int i12) {
            return view.getLeft();
        }

        @Override // b4.c.AbstractC0147c
        public int b(View view, int i11, int i12) {
            int e02 = BottomSheetBehavior.this.e0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return p3.a.b(i11, e02, bottomSheetBehavior.E ? bottomSheetBehavior.O : bottomSheetBehavior.C);
        }

        @Override // b4.c.AbstractC0147c
        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.E) {
                return bottomSheetBehavior.O;
            }
            return bottomSheetBehavior.C;
        }

        @Override // b4.c.AbstractC0147c
        public void j(int i11) {
            if (i11 == 1 && BottomSheetBehavior.this.G) {
                BottomSheetBehavior.this.C0(1);
            }
        }

        @Override // b4.c.AbstractC0147c
        public void k(View view, int i11, int i12, int i13, int i14) {
            BottomSheetBehavior.this.a0(i12);
        }

        @Override // b4.c.AbstractC0147c
        public void l(View view, float f11, float f12) {
            int i11;
            BottomSheetBehavior bottomSheetBehavior;
            int i12 = 6;
            if (f12 < BitmapDescriptorFactory.HUE_RED) {
                if (BottomSheetBehavior.this.f14954b) {
                    i11 = BottomSheetBehavior.this.f14978z;
                } else {
                    int top = view.getTop();
                    long currentTimeMillis = System.currentTimeMillis() - this.f14985a;
                    if (BottomSheetBehavior.this.J0()) {
                        if (BottomSheetBehavior.this.G0(currentTimeMillis, (top * 100.0f) / bottomSheetBehavior.O)) {
                            i11 = BottomSheetBehavior.this.f14977y;
                        } else {
                            i11 = BottomSheetBehavior.this.C;
                            i12 = 4;
                        }
                    } else {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i13 = bottomSheetBehavior2.A;
                        if (top > i13) {
                            i11 = i13;
                        } else {
                            i11 = bottomSheetBehavior2.e0();
                        }
                    }
                }
                i12 = 3;
            } else {
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                if (bottomSheetBehavior3.E && bottomSheetBehavior3.I0(view, f12)) {
                    if ((Math.abs(f11) >= Math.abs(f12) || f12 <= 500.0f) && !n(view)) {
                        if (BottomSheetBehavior.this.f14954b) {
                            i11 = BottomSheetBehavior.this.f14978z;
                        } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.e0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.A)) {
                            i11 = BottomSheetBehavior.this.e0();
                        } else {
                            i11 = BottomSheetBehavior.this.A;
                        }
                        i12 = 3;
                    } else {
                        i11 = BottomSheetBehavior.this.O;
                        i12 = 5;
                    }
                } else if (f12 != BitmapDescriptorFactory.HUE_RED && Math.abs(f11) <= Math.abs(f12)) {
                    if (BottomSheetBehavior.this.f14954b) {
                        i11 = BottomSheetBehavior.this.C;
                    } else {
                        int top2 = view.getTop();
                        if (Math.abs(top2 - BottomSheetBehavior.this.A) < Math.abs(top2 - BottomSheetBehavior.this.C)) {
                            if (BottomSheetBehavior.this.J0()) {
                                i11 = BottomSheetBehavior.this.C;
                            } else {
                                i11 = BottomSheetBehavior.this.A;
                            }
                        } else {
                            i11 = BottomSheetBehavior.this.C;
                        }
                    }
                    i12 = 4;
                } else {
                    int top3 = view.getTop();
                    if (BottomSheetBehavior.this.f14954b) {
                        if (Math.abs(top3 - BottomSheetBehavior.this.f14978z) < Math.abs(top3 - BottomSheetBehavior.this.C)) {
                            i11 = BottomSheetBehavior.this.f14978z;
                            i12 = 3;
                        } else {
                            i11 = BottomSheetBehavior.this.C;
                            i12 = 4;
                        }
                    } else {
                        BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                        int i14 = bottomSheetBehavior4.A;
                        if (top3 < i14) {
                            if (top3 < Math.abs(top3 - bottomSheetBehavior4.C)) {
                                i11 = BottomSheetBehavior.this.e0();
                                i12 = 3;
                            } else if (BottomSheetBehavior.this.J0()) {
                                i11 = BottomSheetBehavior.this.C;
                                i12 = 4;
                            } else {
                                i11 = BottomSheetBehavior.this.A;
                            }
                        } else {
                            if (Math.abs(top3 - i14) < Math.abs(top3 - BottomSheetBehavior.this.C)) {
                                if (BottomSheetBehavior.this.J0()) {
                                    i11 = BottomSheetBehavior.this.C;
                                } else {
                                    i11 = BottomSheetBehavior.this.A;
                                }
                            } else {
                                i11 = BottomSheetBehavior.this.C;
                            }
                            i12 = 4;
                        }
                    }
                }
            }
            BottomSheetBehavior bottomSheetBehavior5 = BottomSheetBehavior.this;
            bottomSheetBehavior5.L0(view, i12, i11, bottomSheetBehavior5.K0());
        }

        @Override // b4.c.AbstractC0147c
        public boolean m(View view, int i11) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i12 = bottomSheetBehavior.H;
            if (i12 == 1 || bottomSheetBehavior.V) {
                return false;
            }
            if (i12 == 3 && bottomSheetBehavior.T == i11) {
                WeakReference<View> weakReference = bottomSheetBehavior.Q;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f14985a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.P;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements w3.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f14987a;

        e(int i11) {
            this.f14987a = i11;
        }

        @Override // w3.f
        public boolean a(View view, f.a aVar) {
            BottomSheetBehavior.this.B0(this.f14987a);
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class f {
        public abstract void onSlide(View view, float f11);

        public abstract void onStateChanged(View view, int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final View f14994a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f14995b;

        /* renamed from: c  reason: collision with root package name */
        int f14996c;

        h(View view, int i11) {
            this.f14994a = view;
            this.f14996c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            b4.c cVar = BottomSheetBehavior.this.I;
            if (cVar != null && cVar.m(true)) {
                a0.o0(this.f14994a, this);
            } else {
                BottomSheetBehavior.this.C0(this.f14996c);
            }
            this.f14995b = false;
        }
    }

    public BottomSheetBehavior() {
        this.f14953a = 0;
        this.f14954b = true;
        this.f14955c = false;
        this.f14963k = -1;
        this.f14964l = -1;
        this.f14975w = null;
        this.B = 0.5f;
        this.D = -1.0f;
        this.G = true;
        this.H = 4;
        this.R = new ArrayList<>();
        this.X = -1;
        this.Y = new d();
    }

    private void D0(View view) {
        boolean z11 = (Build.VERSION.SDK_INT < 29 || i0() || this.f14958f) ? false : true;
        if (this.f14967o || this.f14968p || this.f14969q || z11) {
            l.a(view, new c(z11));
        }
    }

    private void F0(int i11) {
        V v11 = this.P.get();
        if (v11 == null) {
            return;
        }
        ViewParent parent = v11.getParent();
        if (parent != null && parent.isLayoutRequested() && a0.Y(v11)) {
            v11.post(new a(v11, i11));
        } else {
            E0(v11, i11);
        }
    }

    private boolean H0() {
        return this.I != null && (this.G || this.H == 1);
    }

    private void M0() {
        V v11;
        WeakReference<V> weakReference = this.P;
        if (weakReference == null || (v11 = weakReference.get()) == null) {
            return;
        }
        a0.q0(v11, PKIFailureInfo.signerNotTrusted);
        a0.q0(v11, 262144);
        a0.q0(v11, PKIFailureInfo.badCertTemplate);
        int i11 = this.X;
        if (i11 != -1) {
            a0.q0(v11, i11);
        }
        if (!this.f14954b && this.H != 6) {
            this.X = R(v11, i.f26481a, 6);
        }
        if (this.E && this.H != 5) {
            m0(v11, c.a.f55461o, 5);
        }
        int i12 = this.H;
        if (i12 == 3) {
            m0(v11, c.a.f55460n, this.f14954b ? 4 : 6);
        } else if (i12 == 4) {
            m0(v11, c.a.f55459m, this.f14954b ? 3 : 6);
        } else if (i12 != 6) {
        } else {
            m0(v11, c.a.f55460n, 4);
            m0(v11, c.a.f55459m, 3);
        }
    }

    private void N0(int i11) {
        ValueAnimator valueAnimator;
        if (i11 == 2) {
            return;
        }
        boolean z11 = i11 == 3;
        if (this.f14974v != z11) {
            this.f14974v = z11;
            if (this.f14962j == null || (valueAnimator = this.f14976x) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f14976x.reverse();
                return;
            }
            float f11 = z11 ? BitmapDescriptorFactory.HUE_RED : 1.0f;
            this.f14976x.setFloatValues(1.0f - f11, f11);
            this.f14976x.start();
        }
    }

    private void O0(boolean z11) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.P;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z11) {
                if (this.W != null) {
                    return;
                }
                this.W = new HashMap(childCount);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if (childAt != this.P.get()) {
                    if (z11) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.W.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        if (this.f14955c) {
                            a0.G0(childAt, 4);
                        }
                    } else if (this.f14955c && (map = this.W) != null && map.containsKey(childAt)) {
                        a0.G0(childAt, this.W.get(childAt).intValue());
                    }
                }
            }
            if (!z11) {
                this.W = null;
            } else if (this.f14955c) {
                this.P.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P0(boolean z11) {
        V v11;
        if (this.P != null) {
            T();
            if (this.H != 4 || (v11 = this.P.get()) == null) {
                return;
            }
            if (z11) {
                F0(this.H);
            } else {
                v11.requestLayout();
            }
        }
    }

    private int R(V v11, int i11, int i12) {
        return a0.c(v11, v11.getResources().getString(i11), W(i12));
    }

    private void T() {
        int V = V();
        if (this.f14954b) {
            this.C = Math.max(this.O - V, this.f14978z);
        } else {
            this.C = this.O - V;
        }
    }

    private void U() {
        this.A = (int) (this.O * (1.0f - this.B));
    }

    private int V() {
        int i11;
        if (this.f14958f) {
            return Math.min(Math.max(this.f14959g, this.O - ((this.N * 9) / 16)), this.M) + this.f14971s;
        }
        if (!this.f14966n && !this.f14967o && (i11 = this.f14965m) > 0) {
            return Math.max(this.f14957e, i11 + this.f14960h);
        }
        return this.f14957e + this.f14971s;
    }

    private w3.f W(int i11) {
        return new e(i11);
    }

    private void X(Context context, AttributeSet attributeSet, boolean z11) {
        Y(context, attributeSet, z11, null);
    }

    private void Y(Context context, AttributeSet attributeSet, boolean z11, ColorStateList colorStateList) {
        if (this.f14961i) {
            this.f14973u = k.e(context, attributeSet, fk.b.f26368d, Z).m();
            wk.g gVar = new wk.g(this.f14973u);
            this.f14962j = gVar;
            gVar.O(context);
            if (z11 && colorStateList != null) {
                this.f14962j.Y(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842801, typedValue, true);
            this.f14962j.setTint(typedValue.data);
        }
    }

    private void Z() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f14976x = ofFloat;
        ofFloat.setDuration(500L);
        this.f14976x.addUpdateListener(new b());
    }

    public static <V extends View> BottomSheetBehavior<V> c0(V v11) {
        ViewGroup.LayoutParams layoutParams = v11.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c f11 = ((CoordinatorLayout.f) layoutParams).f();
            if (f11 instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) f11;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private int d0(int i11, int i12, int i13, int i14) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i12, i14);
        if (i13 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i13 = Math.min(size, i13);
            }
            return View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i13), 1073741824);
    }

    private float h0() {
        VelocityTracker velocityTracker = this.S;
        if (velocityTracker == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f14956d);
        return this.S.getYVelocity(this.T);
    }

    private void m0(V v11, c.a aVar, int i11) {
        a0.s0(v11, aVar, null, W(i11));
    }

    private void n0() {
        this.T = -1;
        VelocityTracker velocityTracker = this.S;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.S = null;
        }
    }

    private void o0(g gVar) {
        int i11 = this.f14953a;
        if (i11 == 0) {
            return;
        }
        if (i11 == -1 || (i11 & 1) == 1) {
            this.f14957e = gVar.f14990d;
        }
        if (i11 == -1 || (i11 & 2) == 2) {
            this.f14954b = gVar.f14991e;
        }
        if (i11 == -1 || (i11 & 4) == 4) {
            this.E = gVar.f14992f;
        }
        if (i11 == -1 || (i11 & 8) == 8) {
            this.F = gVar.f14993g;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v11, View view, View view2, int i11, int i12) {
        this.K = 0;
        this.L = false;
        return (i11 & 2) != 0;
    }

    public void A0(boolean z11) {
        this.F = z11;
    }

    public void B0(int i11) {
        if (i11 == this.H) {
            return;
        }
        if (this.P == null) {
            if (i11 == 4 || i11 == 3 || i11 == 6 || (this.E && i11 == 5)) {
                this.H = i11;
                return;
            }
            return;
        }
        F0(i11);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void C(CoordinatorLayout coordinatorLayout, V v11, View view, int i11) {
        int i12;
        WeakReference<View> weakReference;
        int i13 = 3;
        if (v11.getTop() == e0()) {
            C0(3);
        } else if (!k0() || ((weakReference = this.Q) != null && view == weakReference.get() && this.L)) {
            if (this.K > 0) {
                if (this.f14954b) {
                    i12 = this.f14978z;
                } else {
                    int top = v11.getTop();
                    int i14 = this.A;
                    if (top > i14) {
                        i13 = 6;
                        i12 = i14;
                    } else {
                        i12 = e0();
                    }
                }
            } else if (this.E && I0(v11, h0())) {
                i12 = this.O;
                i13 = 5;
            } else if (this.K == 0) {
                int top2 = v11.getTop();
                if (this.f14954b) {
                    if (Math.abs(top2 - this.f14978z) < Math.abs(top2 - this.C)) {
                        i12 = this.f14978z;
                    } else {
                        i12 = this.C;
                        i13 = 4;
                    }
                } else {
                    int i15 = this.A;
                    if (top2 < i15) {
                        if (top2 < Math.abs(top2 - this.C)) {
                            i12 = e0();
                        } else if (J0()) {
                            i12 = this.C;
                            i13 = 4;
                        } else {
                            i12 = this.A;
                            i13 = 6;
                        }
                    } else if (Math.abs(top2 - i15) < Math.abs(top2 - this.C)) {
                        i12 = this.A;
                        i13 = 6;
                    } else {
                        i12 = this.C;
                        i13 = 4;
                    }
                }
            } else {
                if (this.f14954b) {
                    i12 = this.C;
                } else {
                    int top3 = v11.getTop();
                    if (Math.abs(top3 - this.A) < Math.abs(top3 - this.C)) {
                        i12 = this.A;
                        i13 = 6;
                    } else {
                        i12 = this.C;
                    }
                }
                i13 = 4;
            }
            L0(v11, i13, i12, false);
            this.L = false;
        }
    }

    void C0(int i11) {
        V v11;
        if (this.H == i11) {
            return;
        }
        this.H = i11;
        if (i11 != 4 && i11 != 3 && i11 != 6) {
            boolean z11 = this.E;
        }
        WeakReference<V> weakReference = this.P;
        if (weakReference == null || (v11 = weakReference.get()) == null) {
            return;
        }
        if (i11 == 3) {
            O0(true);
        } else if (i11 == 6 || i11 == 5 || i11 == 4) {
            O0(false);
        }
        N0(i11);
        for (int i12 = 0; i12 < this.R.size(); i12++) {
            this.R.get(i12).onStateChanged(v11, i11);
        }
        M0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v11, MotionEvent motionEvent) {
        if (v11.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.H == 1 && actionMasked == 0) {
                return true;
            }
            if (H0()) {
                this.I.F(motionEvent);
            }
            if (actionMasked == 0) {
                n0();
            }
            if (this.S == null) {
                this.S = VelocityTracker.obtain();
            }
            this.S.addMovement(motionEvent);
            if (H0() && actionMasked == 2 && !this.J && Math.abs(this.U - motionEvent.getY()) > this.I.z()) {
                this.I.b(v11, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
            return !this.J;
        }
        return false;
    }

    void E0(View view, int i11) {
        int i12;
        int i13;
        if (i11 == 4) {
            i12 = this.C;
        } else if (i11 == 6) {
            int i14 = this.A;
            if (!this.f14954b || i14 > (i13 = this.f14978z)) {
                i12 = i14;
            } else {
                i11 = 3;
                i12 = i13;
            }
        } else if (i11 == 3) {
            i12 = e0();
        } else if (this.E && i11 == 5) {
            i12 = this.O;
        } else {
            Log.w("BottomSheetBehavior", "The bottom sheet may be in an invalid state. Ensure `hideable` is true when using `STATE_HIDDEN`.");
            return;
        }
        L0(view, i11, i12, false);
    }

    public boolean G0(long j11, float f11) {
        return false;
    }

    boolean I0(View view, float f11) {
        if (this.F) {
            return true;
        }
        if (view.getTop() < this.C) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f11 * 0.1f)) - ((float) this.C)) / ((float) V()) > 0.5f;
    }

    public boolean J0() {
        return false;
    }

    public boolean K0() {
        return true;
    }

    void L0(View view, int i11, int i12, boolean z11) {
        b4.c cVar = this.I;
        if (cVar != null && (!z11 ? !cVar.Q(view, view.getLeft(), i12) : !cVar.O(view.getLeft(), i12))) {
            C0(2);
            N0(i11);
            if (this.f14975w == null) {
                this.f14975w = new h(view, i11);
            }
            if (!((h) this.f14975w).f14995b) {
                BottomSheetBehavior<V>.h hVar = this.f14975w;
                hVar.f14996c = i11;
                a0.o0(view, hVar);
                ((h) this.f14975w).f14995b = true;
                return;
            }
            this.f14975w.f14996c = i11;
            return;
        }
        C0(i11);
    }

    public void S(f fVar) {
        if (this.R.contains(fVar)) {
            return;
        }
        this.R.add(fVar);
    }

    void a0(int i11) {
        float f11;
        float f12;
        V v11 = this.P.get();
        if (v11 == null || this.R.isEmpty()) {
            return;
        }
        int i12 = this.C;
        if (i11 <= i12 && i12 != e0()) {
            int i13 = this.C;
            f11 = i13 - i11;
            f12 = i13 - e0();
        } else {
            int i14 = this.C;
            f11 = i14 - i11;
            f12 = this.O - i14;
        }
        float f13 = f11 / f12;
        for (int i15 = 0; i15 < this.R.size(); i15++) {
            this.R.get(i15).onSlide(v11, f13);
        }
    }

    View b0(View view) {
        if (a0.b0(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View b02 = b0(viewGroup.getChildAt(i11));
                if (b02 != null) {
                    return b02;
                }
            }
            return null;
        }
        return null;
    }

    public int e0() {
        if (this.f14954b) {
            return this.f14978z;
        }
        return Math.max(this.f14977y, this.f14970r ? 0 : this.f14972t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public wk.g f0() {
        return this.f14962j;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.P = null;
        this.I = null;
    }

    public int g0() {
        return this.H;
    }

    public boolean i0() {
        return this.f14966n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.P = null;
        this.I = null;
    }

    public boolean j0() {
        return this.E;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v11, MotionEvent motionEvent) {
        b4.c cVar;
        if (v11.isShown() && this.G) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                n0();
            }
            if (this.S == null) {
                this.S = VelocityTracker.obtain();
            }
            this.S.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x11 = (int) motionEvent.getX();
                this.U = (int) motionEvent.getY();
                if (this.H != 2) {
                    WeakReference<View> weakReference = this.Q;
                    View view = weakReference != null ? weakReference.get() : null;
                    if (view != null && coordinatorLayout.B(view, x11, this.U)) {
                        this.T = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.V = true;
                    }
                }
                this.J = this.T == -1 && !coordinatorLayout.B(v11, x11, this.U);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.V = false;
                this.T = -1;
                if (this.J) {
                    this.J = false;
                    return false;
                }
            }
            if (this.J || (cVar = this.I) == null || !cVar.P(motionEvent)) {
                WeakReference<View> weakReference2 = this.Q;
                View view2 = weakReference2 != null ? weakReference2.get() : null;
                return (actionMasked != 2 || view2 == null || this.J || this.H == 1 || coordinatorLayout.B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.I == null || Math.abs(((float) this.U) - motionEvent.getY()) <= ((float) this.I.z())) ? false : true;
            }
            return true;
        }
        this.J = true;
        return false;
    }

    public boolean k0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v11, int i11) {
        wk.g gVar;
        if (a0.C(coordinatorLayout) && !a0.C(v11)) {
            v11.setFitsSystemWindows(true);
        }
        if (this.P == null) {
            this.f14959g = coordinatorLayout.getResources().getDimensionPixelSize(fk.d.f26398b);
            D0(v11);
            this.P = new WeakReference<>(v11);
            if (this.f14961i && (gVar = this.f14962j) != null) {
                a0.z0(v11, gVar);
            }
            wk.g gVar2 = this.f14962j;
            if (gVar2 != null) {
                float f11 = this.D;
                if (f11 == -1.0f) {
                    f11 = a0.z(v11);
                }
                gVar2.X(f11);
                boolean z11 = this.H == 3;
                this.f14974v = z11;
                this.f14962j.Z(z11 ? BitmapDescriptorFactory.HUE_RED : 1.0f);
            }
            M0();
            if (a0.D(v11) == 0) {
                a0.G0(v11, 1);
            }
        }
        if (this.I == null) {
            this.I = b4.c.o(coordinatorLayout, this.Y);
        }
        int top = v11.getTop();
        coordinatorLayout.I(v11, i11);
        this.N = coordinatorLayout.getWidth();
        this.O = coordinatorLayout.getHeight();
        int height = v11.getHeight();
        this.M = height;
        int i12 = this.O;
        int i13 = i12 - height;
        int i14 = this.f14972t;
        if (i13 < i14) {
            if (this.f14970r) {
                this.M = i12;
            } else {
                this.M = i12 - i14;
            }
        }
        this.f14978z = Math.max(0, i12 - this.M);
        U();
        T();
        int i15 = this.H;
        if (i15 == 3) {
            a0.h0(v11, e0());
        } else if (i15 == 6) {
            a0.h0(v11, this.A);
        } else if (this.E && i15 == 5) {
            a0.h0(v11, this.O);
        } else if (i15 == 4) {
            a0.h0(v11, this.C);
        } else if (i15 == 1 || i15 == 2) {
            a0.h0(v11, top - v11.getTop());
        }
        this.Q = new WeakReference<>(b0(v11));
        return true;
    }

    public void l0(f fVar) {
        this.R.remove(fVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, V v11, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v11.getLayoutParams();
        v11.measure(d0(i11, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i12, this.f14963k, marginLayoutParams.width), d0(i13, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i14, this.f14964l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v11, View view, float f11, float f12) {
        WeakReference<View> weakReference;
        if (k0() && (weakReference = this.Q) != null && view == weakReference.get()) {
            return this.H != 3 || super.o(coordinatorLayout, v11, view, f11, f12);
        }
        return false;
    }

    public void p0(boolean z11) {
        this.G = z11;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, V v11, View view, int i11, int i12, int[] iArr, int i13) {
        if (i13 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.Q;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!k0() || view == view2) {
            int top = v11.getTop();
            int i14 = top - i12;
            if (i12 > 0) {
                if (i14 < e0()) {
                    iArr[1] = top - e0();
                    a0.h0(v11, -iArr[1]);
                    C0(3);
                } else if (!this.G) {
                    return;
                } else {
                    iArr[1] = i12;
                    a0.h0(v11, -i12);
                    C0(1);
                }
            } else if (i12 < 0 && !view.canScrollVertically(-1)) {
                int i15 = this.C;
                if (i14 > i15 && !this.E) {
                    iArr[1] = top - i15;
                    a0.h0(v11, -iArr[1]);
                    C0(4);
                } else if (!this.G) {
                    return;
                } else {
                    iArr[1] = i12;
                    a0.h0(v11, -i12);
                    C0(1);
                }
            }
            a0(v11.getTop());
            this.K = i12;
            this.L = true;
        }
    }

    public void q0(int i11) {
        if (i11 >= 0) {
            this.f14977y = i11;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void r0(boolean z11) {
        if (this.f14954b == z11) {
            return;
        }
        this.f14954b = z11;
        if (this.P != null) {
            T();
        }
        C0((this.f14954b && this.H == 6) ? 3 : this.H);
        M0();
    }

    public void s0(boolean z11) {
        this.f14966n = z11;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v11, View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
    }

    public void t0(float f11) {
        if (f11 > BitmapDescriptorFactory.HUE_RED && f11 < 1.0f) {
            this.B = f11;
            if (this.P != null) {
                U();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public void u0(boolean z11) {
        if (this.E != z11) {
            this.E = z11;
            if (!z11 && this.H == 5) {
                B0(4);
            }
            M0();
        }
    }

    public void v0(int i11) {
        this.f14964l = i11;
    }

    public void w0(int i11) {
        this.f14963k = i11;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v11, Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.x(coordinatorLayout, v11, gVar.a());
        o0(gVar);
        int i11 = gVar.f14989c;
        if (i11 != 1 && i11 != 2) {
            this.H = i11;
        } else {
            this.H = 4;
        }
    }

    public void x0(int i11) {
        y0(i11, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v11) {
        return new g(super.y(coordinatorLayout, v11), (BottomSheetBehavior<?>) this);
    }

    public final void y0(int i11, boolean z11) {
        boolean z12 = true;
        if (i11 == -1) {
            if (!this.f14958f) {
                this.f14958f = true;
            }
            z12 = false;
        } else {
            if (this.f14958f || this.f14957e != i11) {
                this.f14958f = false;
                this.f14957e = Math.max(0, i11);
            }
            z12 = false;
        }
        if (z12) {
            P0(z11);
        }
    }

    public void z0(int i11) {
        this.f14953a = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class g extends a4.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        final int f14989c;

        /* renamed from: d  reason: collision with root package name */
        int f14990d;

        /* renamed from: e  reason: collision with root package name */
        boolean f14991e;

        /* renamed from: f  reason: collision with root package name */
        boolean f14992f;

        /* renamed from: g  reason: collision with root package name */
        boolean f14993g;

        /* loaded from: classes3.dex */
        static class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public g[] newArray(int i11) {
                return new g[i11];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14989c = parcel.readInt();
            this.f14990d = parcel.readInt();
            this.f14991e = parcel.readInt() == 1;
            this.f14992f = parcel.readInt() == 1;
            this.f14993g = parcel.readInt() == 1;
        }

        @Override // a4.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f14989c);
            parcel.writeInt(this.f14990d);
            parcel.writeInt(this.f14991e ? 1 : 0);
            parcel.writeInt(this.f14992f ? 1 : 0);
            parcel.writeInt(this.f14993g ? 1 : 0);
        }

        public g(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f14989c = bottomSheetBehavior.H;
            this.f14990d = ((BottomSheetBehavior) bottomSheetBehavior).f14957e;
            this.f14991e = ((BottomSheetBehavior) bottomSheetBehavior).f14954b;
            this.f14992f = bottomSheetBehavior.E;
            this.f14993g = ((BottomSheetBehavior) bottomSheetBehavior).F;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i11;
        this.f14953a = 0;
        this.f14954b = true;
        this.f14955c = false;
        this.f14963k = -1;
        this.f14964l = -1;
        this.f14975w = null;
        this.B = 0.5f;
        this.D = -1.0f;
        this.G = true;
        this.H = 4;
        this.R = new ArrayList<>();
        this.X = -1;
        this.Y = new d();
        this.f14960h = context.getResources().getDimensionPixelSize(fk.d.N);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fk.k.f26650w);
        this.f14961i = obtainStyledAttributes.hasValue(fk.k.O);
        int i12 = fk.k.A;
        boolean hasValue = obtainStyledAttributes.hasValue(i12);
        if (hasValue) {
            Y(context, attributeSet, hasValue, tk.c.a(context, obtainStyledAttributes, i12));
        } else {
            X(context, attributeSet, hasValue);
        }
        Z();
        if (Build.VERSION.SDK_INT >= 21) {
            this.D = obtainStyledAttributes.getDimension(fk.k.f26668z, -1.0f);
        }
        int i13 = fk.k.f26656x;
        if (obtainStyledAttributes.hasValue(i13)) {
            w0(obtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = fk.k.f26662y;
        if (obtainStyledAttributes.hasValue(i14)) {
            v0(obtainStyledAttributes.getDimensionPixelSize(i14, -1));
        }
        int i15 = fk.k.G;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i15);
        if (peekValue != null && (i11 = peekValue.data) == -1) {
            x0(i11);
        } else {
            x0(obtainStyledAttributes.getDimensionPixelSize(i15, -1));
        }
        u0(obtainStyledAttributes.getBoolean(fk.k.F, false));
        s0(obtainStyledAttributes.getBoolean(fk.k.J, false));
        r0(obtainStyledAttributes.getBoolean(fk.k.D, true));
        A0(obtainStyledAttributes.getBoolean(fk.k.I, false));
        p0(obtainStyledAttributes.getBoolean(fk.k.B, true));
        z0(obtainStyledAttributes.getInt(fk.k.H, 0));
        t0(obtainStyledAttributes.getFloat(fk.k.E, 0.5f));
        int i16 = fk.k.C;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i16);
        if (peekValue2 != null && peekValue2.type == 16) {
            q0(peekValue2.data);
        } else {
            q0(obtainStyledAttributes.getDimensionPixelOffset(i16, 0));
        }
        this.f14967o = obtainStyledAttributes.getBoolean(fk.k.K, false);
        this.f14968p = obtainStyledAttributes.getBoolean(fk.k.L, false);
        this.f14969q = obtainStyledAttributes.getBoolean(fk.k.M, false);
        this.f14970r = obtainStyledAttributes.getBoolean(fk.k.N, true);
        obtainStyledAttributes.recycle();
        this.f14956d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}