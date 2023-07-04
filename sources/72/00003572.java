package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import androidx.core.view.l0;
import androidx.core.view.o;
import androidx.core.view.u;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import fk.j;
import fk.k;
import java.lang.ref.WeakReference;
import java.util.List;
import w3.c;
import w3.f;
import wk.h;

/* loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: w  reason: collision with root package name */
    private static final int f14814w = j.f26501e;

    /* renamed from: a  reason: collision with root package name */
    private int f14815a;

    /* renamed from: b  reason: collision with root package name */
    private int f14816b;

    /* renamed from: c  reason: collision with root package name */
    private int f14817c;

    /* renamed from: d  reason: collision with root package name */
    private int f14818d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14819e;

    /* renamed from: f  reason: collision with root package name */
    private int f14820f;

    /* renamed from: g  reason: collision with root package name */
    private l0 f14821g;

    /* renamed from: h  reason: collision with root package name */
    private List<c> f14822h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f14823i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f14824j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f14825k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f14826l;

    /* renamed from: m  reason: collision with root package name */
    private int f14827m;

    /* renamed from: n  reason: collision with root package name */
    private WeakReference<View> f14828n;

    /* renamed from: o  reason: collision with root package name */
    private ValueAnimator f14829o;

    /* renamed from: p  reason: collision with root package name */
    private final List<g> f14830p;

    /* renamed from: q  reason: collision with root package name */
    private int[] f14831q;

    /* renamed from: t  reason: collision with root package name */
    private Drawable f14832t;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.a<T> {

        /* renamed from: k  reason: collision with root package name */
        private int f14833k;

        /* renamed from: l  reason: collision with root package name */
        private int f14834l;

        /* renamed from: m  reason: collision with root package name */
        private ValueAnimator f14835m;

        /* renamed from: n  reason: collision with root package name */
        private d f14836n;

        /* renamed from: o  reason: collision with root package name */
        private WeakReference<View> f14837o;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f14838a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f14839b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f14838a = coordinatorLayout;
                this.f14839b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.f14838a, this.f14839b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class b implements w3.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f14841a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f14842b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ View f14843c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f14844d;

            b(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i11) {
                this.f14841a = coordinatorLayout;
                this.f14842b = appBarLayout;
                this.f14843c = view;
                this.f14844d = i11;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // w3.f
            public boolean a(View view, f.a aVar) {
                BaseBehavior.this.q(this.f14841a, this.f14842b, this.f14843c, 0, this.f14844d, new int[]{0, 0}, 1);
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public class c implements w3.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f14846a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f14847b;

            c(BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z11) {
                this.f14846a = appBarLayout;
                this.f14847b = z11;
            }

            @Override // w3.f
            public boolean a(View view, f.a aVar) {
                this.f14846a.setExpanded(this.f14847b);
                return true;
            }
        }

        public BaseBehavior() {
        }

        private void S(CoordinatorLayout coordinatorLayout, T t11, View view) {
            if (M() != (-t11.getTotalScrollRange()) && view.canScrollVertically(1)) {
                T(coordinatorLayout, t11, c.a.f55457k, false);
            }
            if (M() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i11 = -t11.getDownNestedPreScrollRange();
                    if (i11 != 0) {
                        a0.s0(coordinatorLayout, c.a.f55458l, null, new b(coordinatorLayout, t11, view, i11));
                        return;
                    }
                    return;
                }
                T(coordinatorLayout, t11, c.a.f55458l, true);
            }
        }

        private void T(CoordinatorLayout coordinatorLayout, T t11, c.a aVar, boolean z11) {
            a0.s0(coordinatorLayout, aVar, null, new c(this, t11, z11));
        }

        private void U(CoordinatorLayout coordinatorLayout, T t11, int i11, float f11) {
            int height;
            int abs = Math.abs(M() - i11);
            float abs2 = Math.abs(f11);
            if (abs2 > BitmapDescriptorFactory.HUE_RED) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / t11.getHeight()) + 1.0f) * 150.0f);
            }
            V(coordinatorLayout, t11, i11, height);
        }

        private void V(CoordinatorLayout coordinatorLayout, T t11, int i11, int i12) {
            int M = M();
            if (M == i11) {
                ValueAnimator valueAnimator = this.f14835m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f14835m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f14835m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f14835m = valueAnimator3;
                valueAnimator3.setInterpolator(gk.a.f27997e);
                this.f14835m.addUpdateListener(new a(coordinatorLayout, t11));
            } else {
                valueAnimator2.cancel();
            }
            this.f14835m.setDuration(Math.min(i12, 600));
            this.f14835m.setIntValues(M, i11);
            this.f14835m.start();
        }

        private boolean X(CoordinatorLayout coordinatorLayout, T t11, View view) {
            return t11.j() && coordinatorLayout.getHeight() - view.getHeight() <= t11.getHeight();
        }

        private static boolean Y(int i11, int i12) {
            return (i11 & i12) == i12;
        }

        private View Z(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = coordinatorLayout.getChildAt(i11);
                if ((childAt instanceof o) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View a0(AppBarLayout appBarLayout, int i11) {
            int abs = Math.abs(i11);
            int childCount = appBarLayout.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = appBarLayout.getChildAt(i12);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int b0(T t11, int i11) {
            int childCount = t11.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = t11.getChildAt(i12);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                f fVar = (f) childAt.getLayoutParams();
                if (Y(fVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) fVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) fVar).bottomMargin;
                }
                int i13 = -i11;
                if (top <= i13 && bottom >= i13) {
                    return i12;
                }
            }
            return -1;
        }

        private int e0(T t11, int i11) {
            int abs = Math.abs(i11);
            int childCount = t11.getChildCount();
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i13 >= childCount) {
                    break;
                }
                View childAt = t11.getChildAt(i13);
                f fVar = (f) childAt.getLayoutParams();
                Interpolator d11 = fVar.d();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i13++;
                } else if (d11 != null) {
                    int c11 = fVar.c();
                    if ((c11 & 1) != 0) {
                        i12 = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
                        if ((c11 & 2) != 0) {
                            i12 -= a0.G(childAt);
                        }
                    }
                    if (a0.C(childAt)) {
                        i12 -= t11.getTopInset();
                    }
                    if (i12 > 0) {
                        float f11 = i12;
                        return Integer.signum(i11) * (childAt.getTop() + Math.round(f11 * d11.getInterpolation((abs - childAt.getTop()) / f11)));
                    }
                }
            }
            return i11;
        }

        private boolean p0(CoordinatorLayout coordinatorLayout, T t11) {
            List<View> s11 = coordinatorLayout.s(t11);
            int size = s11.size();
            for (int i11 = 0; i11 < size; i11++) {
                CoordinatorLayout.c f11 = ((CoordinatorLayout.f) s11.get(i11).getLayoutParams()).f();
                if (f11 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f11).K() != 0;
                }
            }
            return false;
        }

        private void q0(CoordinatorLayout coordinatorLayout, T t11) {
            int M = M();
            int b02 = b0(t11, M);
            if (b02 >= 0) {
                View childAt = t11.getChildAt(b02);
                f fVar = (f) childAt.getLayoutParams();
                int c11 = fVar.c();
                if ((c11 & 17) == 17) {
                    int i11 = -childAt.getTop();
                    int i12 = -childAt.getBottom();
                    if (b02 == t11.getChildCount() - 1) {
                        i12 += t11.getTopInset() + t11.getPaddingTop();
                    }
                    if (Y(c11, 2)) {
                        i12 += a0.G(childAt);
                    } else if (Y(c11, 5)) {
                        int G = a0.G(childAt) + i12;
                        if (M < G) {
                            i11 = G;
                        } else {
                            i12 = G;
                        }
                    }
                    if (Y(c11, 32)) {
                        i11 += ((LinearLayout.LayoutParams) fVar).topMargin;
                        i12 -= ((LinearLayout.LayoutParams) fVar).bottomMargin;
                    }
                    if (M < (i12 + i11) / 2) {
                        i11 = i12;
                    }
                    U(coordinatorLayout, t11, p3.a.b(i11, -t11.getTotalScrollRange(), 0), BitmapDescriptorFactory.HUE_RED);
                }
            }
        }

        private void r0(CoordinatorLayout coordinatorLayout, T t11) {
            a0.q0(coordinatorLayout, c.a.f55457k.b());
            a0.q0(coordinatorLayout, c.a.f55458l.b());
            View Z = Z(coordinatorLayout);
            if (Z == null || t11.getTotalScrollRange() == 0 || !(((CoordinatorLayout.f) Z.getLayoutParams()).f() instanceof ScrollingViewBehavior)) {
                return;
            }
            S(coordinatorLayout, t11, Z);
        }

        private void s0(CoordinatorLayout coordinatorLayout, T t11, int i11, int i12, boolean z11) {
            View a02 = a0(t11, i11);
            boolean z12 = false;
            if (a02 != null) {
                int c11 = ((f) a02.getLayoutParams()).c();
                if ((c11 & 1) != 0) {
                    int G = a0.G(a02);
                    if (i12 <= 0 || (c11 & 12) == 0 ? !((c11 & 2) == 0 || (-i11) < (a02.getBottom() - G) - t11.getTopInset()) : (-i11) >= (a02.getBottom() - G) - t11.getTopInset()) {
                        z12 = true;
                    }
                }
            }
            if (t11.l()) {
                z12 = t11.v(Z(coordinatorLayout));
            }
            boolean s11 = t11.s(z12);
            if (z11 || (s11 && p0(coordinatorLayout, t11))) {
                t11.jumpDrawablesToCurrentState();
            }
        }

        @Override // com.google.android.material.appbar.a
        int M() {
            return E() + this.f14833k;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: W */
        public boolean H(T t11) {
            WeakReference<View> weakReference = this.f14837o;
            if (weakReference != null) {
                View view = weakReference.get();
                return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: c0 */
        public int K(T t11) {
            return -t11.getDownNestedScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: d0 */
        public int L(T t11) {
            return t11.getTotalScrollRange();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: f0 */
        public void N(CoordinatorLayout coordinatorLayout, T t11) {
            q0(coordinatorLayout, t11);
            if (t11.l()) {
                t11.s(t11.v(Z(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: g0 */
        public boolean l(CoordinatorLayout coordinatorLayout, T t11, int i11) {
            int round;
            boolean l11 = super.l(coordinatorLayout, t11, i11);
            int pendingAction = t11.getPendingAction();
            d dVar = this.f14836n;
            if (dVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z11 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i12 = -t11.getUpNestedPreScrollRange();
                        if (z11) {
                            U(coordinatorLayout, t11, i12, BitmapDescriptorFactory.HUE_RED);
                        } else {
                            P(coordinatorLayout, t11, i12);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z11) {
                            U(coordinatorLayout, t11, 0, BitmapDescriptorFactory.HUE_RED);
                        } else {
                            P(coordinatorLayout, t11, 0);
                        }
                    }
                }
            } else if (dVar.f14848c) {
                P(coordinatorLayout, t11, -t11.getTotalScrollRange());
            } else {
                View childAt = t11.getChildAt(dVar.f14849d);
                int i13 = -childAt.getBottom();
                if (this.f14836n.f14851f) {
                    round = a0.G(childAt) + t11.getTopInset();
                } else {
                    round = Math.round(childAt.getHeight() * this.f14836n.f14850e);
                }
                P(coordinatorLayout, t11, i13 + round);
            }
            t11.o();
            this.f14836n = null;
            G(p3.a.b(E(), -t11.getTotalScrollRange(), 0));
            s0(coordinatorLayout, t11, E(), 0, true);
            t11.m(E());
            r0(coordinatorLayout, t11);
            return l11;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: h0 */
        public boolean m(CoordinatorLayout coordinatorLayout, T t11, int i11, int i12, int i13, int i14) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) t11.getLayoutParams())).height == -2) {
                coordinatorLayout.J(t11, i11, i12, View.MeasureSpec.makeMeasureSpec(0, 0), i14);
                return true;
            }
            return super.m(coordinatorLayout, t11, i11, i12, i13, i14);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: i0 */
        public void q(CoordinatorLayout coordinatorLayout, T t11, View view, int i11, int i12, int[] iArr, int i13) {
            int i14;
            int i15;
            if (i12 != 0) {
                if (i12 < 0) {
                    i14 = -t11.getTotalScrollRange();
                    i15 = t11.getDownNestedPreScrollRange() + i14;
                } else {
                    i14 = -t11.getUpNestedPreScrollRange();
                    i15 = 0;
                }
                int i16 = i14;
                int i17 = i15;
                if (i16 != i17) {
                    iArr[1] = O(coordinatorLayout, t11, i12, i16, i17);
                }
            }
            if (t11.l()) {
                t11.s(t11.v(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: j0 */
        public void t(CoordinatorLayout coordinatorLayout, T t11, View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
            if (i14 < 0) {
                iArr[1] = O(coordinatorLayout, t11, i14, -t11.getDownNestedScrollRange(), 0);
            }
            if (i14 == 0) {
                r0(coordinatorLayout, t11);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: k0 */
        public void x(CoordinatorLayout coordinatorLayout, T t11, Parcelable parcelable) {
            if (parcelable instanceof d) {
                d dVar = (d) parcelable;
                this.f14836n = dVar;
                super.x(coordinatorLayout, t11, dVar.a());
                return;
            }
            super.x(coordinatorLayout, t11, parcelable);
            this.f14836n = null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: l0 */
        public Parcelable y(CoordinatorLayout coordinatorLayout, T t11) {
            Parcelable y11 = super.y(coordinatorLayout, t11);
            int E = E();
            int childCount = t11.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t11.getChildAt(i11);
                int bottom = childAt.getBottom() + E;
                if (childAt.getTop() + E <= 0 && bottom >= 0) {
                    d dVar = new d(y11);
                    dVar.f14848c = (-E()) >= t11.getTotalScrollRange();
                    dVar.f14849d = i11;
                    dVar.f14851f = bottom == a0.G(childAt) + t11.getTopInset();
                    dVar.f14850e = bottom / childAt.getHeight();
                    return dVar;
                }
            }
            return y11;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: m0 */
        public boolean A(CoordinatorLayout coordinatorLayout, T t11, View view, View view2, int i11, int i12) {
            ValueAnimator valueAnimator;
            boolean z11 = (i11 & 2) != 0 && (t11.l() || X(coordinatorLayout, t11, view));
            if (z11 && (valueAnimator = this.f14835m) != null) {
                valueAnimator.cancel();
            }
            this.f14837o = null;
            this.f14834l = i12;
            return z11;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: n0 */
        public void C(CoordinatorLayout coordinatorLayout, T t11, View view, int i11) {
            if (this.f14834l == 0 || i11 == 1) {
                q0(coordinatorLayout, t11);
                if (t11.l()) {
                    t11.s(t11.v(view));
                }
            }
            this.f14837o = new WeakReference<>(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.a
        /* renamed from: o0 */
        public int Q(CoordinatorLayout coordinatorLayout, T t11, int i11, int i12, int i13) {
            int M = M();
            int i14 = 0;
            if (i12 != 0 && M >= i12 && M <= i13) {
                int b11 = p3.a.b(i11, i12, i13);
                if (M != b11) {
                    int e02 = t11.h() ? e0(t11, b11) : b11;
                    boolean G = G(e02);
                    int i15 = M - b11;
                    this.f14833k = b11 - e02;
                    if (G) {
                        while (i14 < t11.getChildCount()) {
                            f fVar = (f) t11.getChildAt(i14).getLayoutParams();
                            d b12 = fVar.b();
                            if (b12 != null && (fVar.c() & 1) != 0) {
                                b12.a(t11, t11.getChildAt(i14), E());
                            }
                            i14++;
                        }
                    }
                    if (!G && t11.h()) {
                        coordinatorLayout.g(t11);
                    }
                    t11.m(E());
                    s0(coordinatorLayout, t11, b11, b11 < M ? -1 : 1, false);
                    i14 = i15;
                }
            } else {
                this.f14833k = 0;
            }
            r0(coordinatorLayout, t11);
            return i14;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* loaded from: classes3.dex */
        public static class d extends a4.a {
            public static final Parcelable.Creator<d> CREATOR = new a();

            /* renamed from: c  reason: collision with root package name */
            boolean f14848c;

            /* renamed from: d  reason: collision with root package name */
            int f14849d;

            /* renamed from: e  reason: collision with root package name */
            float f14850e;

            /* renamed from: f  reason: collision with root package name */
            boolean f14851f;

            /* loaded from: classes3.dex */
            static class a implements Parcelable.ClassLoaderCreator<d> {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public d createFromParcel(Parcel parcel) {
                    return new d(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b */
                public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new d(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c */
                public d[] newArray(int i11) {
                    return new d[i11];
                }
            }

            public d(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f14848c = parcel.readByte() != 0;
                this.f14849d = parcel.readInt();
                this.f14850e = parcel.readFloat();
                this.f14851f = parcel.readByte() != 0;
            }

            @Override // a4.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i11) {
                super.writeToParcel(parcel, i11);
                parcel.writeByte(this.f14848c ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f14849d);
                parcel.writeFloat(this.f14850e);
                parcel.writeByte(this.f14851f ? (byte) 1 : (byte) 0);
            }

            public d(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes3.dex */
    public static class ScrollingViewBehavior extends com.google.android.material.appbar.b {
        public ScrollingViewBehavior() {
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c f11 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f11 instanceof BaseBehavior) {
                return ((BaseBehavior) f11).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.c f11 = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f11 instanceof BaseBehavior) {
                a0.h0(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f11).f14833k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.l()) {
                    appBarLayout.s(appBarLayout.v(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.b
        float J(View view) {
            int i11;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int R = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + R > downNestedPreScrollRange) && (i11 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (R / i11) + 1.0f;
                }
            }
            return BitmapDescriptorFactory.HUE_RED;
        }

        @Override // com.google.android.material.appbar.b
        int L(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return super.L(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.b
        /* renamed from: Q */
        public AppBarLayout H(List<View> list) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = list.get(i11);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                a0.q0(coordinatorLayout, c.a.f55457k.b());
                a0.q0(coordinatorLayout, c.a.f55458l.b());
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z11) {
            AppBarLayout H = H(coordinatorLayout.r(view));
            if (H != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f14872d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    H.p(false, !z11);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.Q2);
            O(obtainStyledAttributes.getDimensionPixelSize(k.R2, 0));
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes3.dex */
    class a implements u {
        a() {
        }

        @Override // androidx.core.view.u
        public l0 a(View view, l0 l0Var) {
            return AppBarLayout.this.n(l0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ wk.g f14853a;

        b(wk.g gVar) {
            this.f14853a = gVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f14853a.X(floatValue);
            if (AppBarLayout.this.f14832t instanceof wk.g) {
                ((wk.g) AppBarLayout.this.f14832t).X(floatValue);
            }
            for (g gVar : AppBarLayout.this.f14830p) {
                gVar.a(floatValue, this.f14853a.A());
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface c<T extends AppBarLayout> {
        void a(T t11, int i11);
    }

    /* loaded from: classes3.dex */
    public static abstract class d {
        public abstract void a(AppBarLayout appBarLayout, View view, float f11);
    }

    /* loaded from: classes3.dex */
    public static class e extends d {

        /* renamed from: a  reason: collision with root package name */
        private final Rect f14855a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        private final Rect f14856b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.d
        public void a(AppBarLayout appBarLayout, View view, float f11) {
            b(this.f14855a, appBarLayout, view);
            float abs = this.f14855a.top - Math.abs(f11);
            if (abs <= BitmapDescriptorFactory.HUE_RED) {
                float a11 = 1.0f - p3.a.a(Math.abs(abs / this.f14855a.height()), BitmapDescriptorFactory.HUE_RED, 1.0f);
                float height = (-abs) - ((this.f14855a.height() * 0.3f) * (1.0f - (a11 * a11)));
                view.setTranslationY(height);
                view.getDrawingRect(this.f14856b);
                this.f14856b.offset(0, (int) (-height));
                a0.C0(view, this.f14856b);
                return;
            }
            a0.C0(view, null);
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* loaded from: classes3.dex */
    public interface g {
        void a(float f11, int i11);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    private void c() {
        WeakReference<View> weakReference = this.f14828n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f14828n = null;
    }

    private View d(View view) {
        int i11;
        if (this.f14828n == null && (i11 = this.f14827m) != -1) {
            View findViewById = view != null ? view.findViewById(i11) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.f14827m);
            }
            if (findViewById != null) {
                this.f14828n = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.f14828n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private boolean i() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            if (((f) getChildAt(i11).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void k() {
        this.f14816b = -1;
        this.f14817c = -1;
        this.f14818d = -1;
    }

    private void q(boolean z11, boolean z12, boolean z13) {
        this.f14820f = (z11 ? 1 : 2) | (z12 ? 4 : 0) | (z13 ? 8 : 0);
        requestLayout();
    }

    private boolean r(boolean z11) {
        if (this.f14824j != z11) {
            this.f14824j = z11;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    private boolean u() {
        return this.f14832t != null && getTopInset() > 0;
    }

    private boolean w() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            return (childAt.getVisibility() == 8 || a0.C(childAt)) ? false : true;
        }
        return false;
    }

    private void x(wk.g gVar, boolean z11) {
        float dimension = getResources().getDimension(fk.d.f26397a);
        float f11 = z11 ? 0.0f : dimension;
        if (!z11) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f14829o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, dimension);
        this.f14829o = ofFloat;
        ofFloat.setDuration(getResources().getInteger(fk.g.f26456a));
        this.f14829o.setInterpolator(gk.a.f27993a);
        this.f14829o.addUpdateListener(new b(gVar));
        this.f14829o.start();
    }

    private void y() {
        setWillNotDraw(!u());
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (u()) {
            int save = canvas.save();
            canvas.translate(BitmapDescriptorFactory.HUE_RED, -this.f14815a);
            this.f14832t.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f14832t;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e */
    public f generateDefaultLayoutParams() {
        return new f(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: f */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (Build.VERSION.SDK_INT >= 19 && (layoutParams instanceof LinearLayout.LayoutParams)) {
            return new f((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    int getDownNestedPreScrollRange() {
        int i11;
        int G;
        int i12 = this.f14817c;
        if (i12 != -1) {
            return i12;
        }
        int i13 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            f fVar = (f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i14 = fVar.f14857a;
            if ((i14 & 5) == 5) {
                int i15 = ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
                if ((i14 & 8) != 0) {
                    G = a0.G(childAt);
                } else if ((i14 & 2) != 0) {
                    G = measuredHeight - a0.G(childAt);
                } else {
                    i11 = i15 + measuredHeight;
                    if (childCount == 0 && a0.C(childAt)) {
                        i11 = Math.min(i11, measuredHeight - getTopInset());
                    }
                    i13 += i11;
                }
                i11 = i15 + G;
                if (childCount == 0) {
                    i11 = Math.min(i11, measuredHeight - getTopInset());
                }
                i13 += i11;
            } else if (i13 > 0) {
                break;
            }
        }
        int max = Math.max(0, i13);
        this.f14817c = max;
        return max;
    }

    int getDownNestedScrollRange() {
        int i11 = this.f14818d;
        if (i11 != -1) {
            return i11;
        }
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
            int i14 = fVar.f14857a;
            if ((i14 & 1) == 0) {
                break;
            }
            i13 += measuredHeight;
            if ((i14 & 2) != 0) {
                i13 -= a0.G(childAt);
                break;
            }
            i12++;
        }
        int max = Math.max(0, i13);
        this.f14818d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f14827m;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int G = a0.G(this);
        if (G == 0) {
            int childCount = getChildCount();
            G = childCount >= 1 ? a0.G(getChildAt(childCount - 1)) : 0;
            if (G == 0) {
                return getHeight() / 3;
            }
        }
        return (G * 2) + topInset;
    }

    int getPendingAction() {
        return this.f14820f;
    }

    public Drawable getStatusBarForeground() {
        return this.f14832t;
    }

    @Deprecated
    public float getTargetElevation() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    final int getTopInset() {
        l0 l0Var = this.f14821g;
        if (l0Var != null) {
            return l0Var.m();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i11 = this.f14816b;
        if (i11 != -1) {
            return i11;
        }
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i14 = fVar.f14857a;
            if ((i14 & 1) == 0) {
                break;
            }
            i13 += measuredHeight + ((LinearLayout.LayoutParams) fVar).topMargin + ((LinearLayout.LayoutParams) fVar).bottomMargin;
            if (i12 == 0 && a0.C(childAt)) {
                i13 -= getTopInset();
            }
            if ((i14 & 2) != 0) {
                i13 -= a0.G(childAt);
                break;
            }
            i12++;
        }
        int max = Math.max(0, i13);
        this.f14816b = max;
        return max;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    boolean h() {
        return this.f14819e;
    }

    boolean j() {
        return getTotalScrollRange() != 0;
    }

    public boolean l() {
        return this.f14826l;
    }

    void m(int i11) {
        this.f14815a = i11;
        if (!willNotDraw()) {
            a0.n0(this);
        }
        List<c> list = this.f14822h;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                c cVar = this.f14822h.get(i12);
                if (cVar != null) {
                    cVar.a(this, i11);
                }
            }
        }
    }

    l0 n(l0 l0Var) {
        l0 l0Var2 = a0.C(this) ? l0Var : null;
        if (!v3.c.a(this.f14821g, l0Var2)) {
            this.f14821g = l0Var2;
            y();
            requestLayout();
        }
        return l0Var;
    }

    void o() {
        this.f14820f = 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        if (this.f14831q == null) {
            this.f14831q = new int[4];
        }
        int[] iArr = this.f14831q;
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + iArr.length);
        boolean z11 = this.f14824j;
        int i12 = fk.b.L;
        if (!z11) {
            i12 = -i12;
        }
        iArr[0] = i12;
        iArr[1] = (z11 && this.f14825k) ? fk.b.M : -fk.b.M;
        int i13 = fk.b.J;
        if (!z11) {
            i13 = -i13;
        }
        iArr[2] = i13;
        iArr[3] = (z11 && this.f14825k) ? fk.b.I : -fk.b.I;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        boolean z12 = true;
        if (a0.C(this) && w()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                a0.h0(getChildAt(childCount), topInset);
            }
        }
        k();
        this.f14819e = false;
        int childCount2 = getChildCount();
        int i15 = 0;
        while (true) {
            if (i15 >= childCount2) {
                break;
            } else if (((f) getChildAt(i15).getLayoutParams()).d() != null) {
                this.f14819e = true;
                break;
            } else {
                i15++;
            }
        }
        Drawable drawable = this.f14832t;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f14823i) {
            return;
        }
        if (!this.f14826l && !i()) {
            z12 = false;
        }
        r(z12);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i12);
        if (mode != 1073741824 && a0.C(this) && w()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = p3.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i12));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        k();
    }

    public void p(boolean z11, boolean z12) {
        q(z11, z12, true);
    }

    boolean s(boolean z11) {
        return t(z11, !this.f14823i);
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        h.d(this, f11);
    }

    public void setExpanded(boolean z11) {
        p(z11, a0.a0(this));
    }

    public void setLiftOnScroll(boolean z11) {
        this.f14826l = z11;
    }

    public void setLiftOnScrollTargetViewId(int i11) {
        this.f14827m = i11;
        c();
    }

    public void setLiftableOverrideEnabled(boolean z11) {
        this.f14823i = z11;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i11) {
        if (i11 == 1) {
            super.setOrientation(i11);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f14832t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f14832t = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f14832t.setState(getDrawableState());
                }
                n3.a.m(this.f14832t, a0.F(this));
                this.f14832t.setVisible(getVisibility() == 0, false);
                this.f14832t.setCallback(this);
            }
            y();
            a0.n0(this);
        }
    }

    public void setStatusBarForegroundColor(int i11) {
        setStatusBarForeground(new ColorDrawable(i11));
    }

    public void setStatusBarForegroundResource(int i11) {
        setStatusBarForeground(h.a.d(getContext(), i11));
    }

    @Deprecated
    public void setTargetElevation(float f11) {
        if (Build.VERSION.SDK_INT >= 21) {
            com.google.android.material.appbar.e.b(this, f11);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.f14832t;
        if (drawable != null) {
            drawable.setVisible(z11, false);
        }
    }

    boolean t(boolean z11, boolean z12) {
        if (!z12 || this.f14825k == z11) {
            return false;
        }
        this.f14825k = z11;
        refreshDrawableState();
        if (this.f14826l && (getBackground() instanceof wk.g)) {
            x((wk.g) getBackground(), z11);
            return true;
        }
        return true;
    }

    boolean v(View view) {
        View d11 = d(view);
        if (d11 != null) {
            view = d11;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f14832t;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fk.b.f26365a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AppBarLayout(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r4 = com.google.android.material.appbar.AppBarLayout.f14814w
            android.content.Context r11 = yk.a.c(r11, r12, r13, r4)
            r10.<init>(r11, r12, r13)
            r11 = -1
            r10.f14816b = r11
            r10.f14817c = r11
            r10.f14818d = r11
            r6 = 0
            r10.f14820f = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f14830p = r0
            android.content.Context r7 = r10.getContext()
            r0 = 1
            r10.setOrientation(r0)
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 21
            if (r8 < r9) goto L36
            android.view.ViewOutlineProvider r0 = r10.getOutlineProvider()
            android.view.ViewOutlineProvider r1 = android.view.ViewOutlineProvider.BACKGROUND
            if (r0 != r1) goto L33
            com.google.android.material.appbar.e.a(r10)
        L33:
            com.google.android.material.appbar.e.c(r10, r12, r13, r4)
        L36:
            int[] r2 = fk.k.f26518a
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r12
            r3 = r13
            android.content.res.TypedArray r12 = com.google.android.material.internal.j.h(r0, r1, r2, r3, r4, r5)
            int r13 = fk.k.f26524b
            android.graphics.drawable.Drawable r13 = r12.getDrawable(r13)
            androidx.core.view.a0.z0(r10, r13)
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            boolean r13 = r13 instanceof android.graphics.drawable.ColorDrawable
            if (r13 == 0) goto L6e
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            android.graphics.drawable.ColorDrawable r13 = (android.graphics.drawable.ColorDrawable) r13
            wk.g r0 = new wk.g
            r0.<init>()
            int r13 = r13.getColor()
            android.content.res.ColorStateList r13 = android.content.res.ColorStateList.valueOf(r13)
            r0.Y(r13)
            r0.O(r7)
            androidx.core.view.a0.z0(r10, r0)
        L6e:
            int r13 = fk.k.f26548f
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L7d
            boolean r13 = r12.getBoolean(r13, r6)
            r10.q(r13, r6, r6)
        L7d:
            if (r8 < r9) goto L8f
            int r13 = fk.k.f26542e
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto L8f
            int r13 = r12.getDimensionPixelSize(r13, r6)
            float r13 = (float) r13
            com.google.android.material.appbar.e.b(r10, r13)
        L8f:
            r13 = 26
            if (r8 < r13) goto Lb1
            int r13 = fk.k.f26536d
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto La2
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setKeyboardNavigationCluster(r13)
        La2:
            int r13 = fk.k.f26530c
            boolean r0 = r12.hasValue(r13)
            if (r0 == 0) goto Lb1
            boolean r13 = r12.getBoolean(r13, r6)
            r10.setTouchscreenBlocksFocus(r13)
        Lb1:
            int r13 = fk.k.f26554g
            boolean r13 = r12.getBoolean(r13, r6)
            r10.f14826l = r13
            int r13 = fk.k.f26560h
            int r11 = r12.getResourceId(r13, r11)
            r10.f14827m = r11
            int r11 = fk.k.f26566i
            android.graphics.drawable.Drawable r11 = r12.getDrawable(r11)
            r10.setStatusBarForeground(r11)
            r12.recycle()
            com.google.android.material.appbar.AppBarLayout$a r11 = new com.google.android.material.appbar.AppBarLayout$a
            r11.<init>()
            androidx.core.view.a0.J0(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* loaded from: classes3.dex */
    public static class f extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        int f14857a;

        /* renamed from: b  reason: collision with root package name */
        private d f14858b;

        /* renamed from: c  reason: collision with root package name */
        Interpolator f14859c;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14857a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f26572j);
            this.f14857a = obtainStyledAttributes.getInt(k.f26584l, 0);
            f(a(obtainStyledAttributes.getInt(k.f26578k, 0)));
            int i11 = k.f26590m;
            if (obtainStyledAttributes.hasValue(i11)) {
                this.f14859c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i11, 0));
            }
            obtainStyledAttributes.recycle();
        }

        private d a(int i11) {
            if (i11 != 1) {
                return null;
            }
            return new e();
        }

        public d b() {
            return this.f14858b;
        }

        public int c() {
            return this.f14857a;
        }

        public Interpolator d() {
            return this.f14859c;
        }

        boolean e() {
            int i11 = this.f14857a;
            return (i11 & 1) == 1 && (i11 & 10) != 0;
        }

        public void f(d dVar) {
            this.f14858b = dVar;
        }

        public void g(int i11) {
            this.f14857a = i11;
        }

        public f(int i11, int i12) {
            super(i11, i12);
            this.f14857a = 1;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f14857a = 1;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f14857a = 1;
        }

        public f(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f14857a = 1;
        }
    }
}