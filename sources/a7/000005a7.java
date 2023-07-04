package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.view.a0;
import androidx.core.view.l0;
import androidx.core.view.q;
import androidx.core.view.r;
import androidx.core.view.t;
import androidx.core.view.u;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements q, r {
    static final ThreadLocal<Map<String, Constructor<c>>> A;
    static final Comparator<View> B;
    private static final v3.f<Rect> C;

    /* renamed from: y */
    static final String f4207y;

    /* renamed from: z */
    static final Class<?>[] f4208z;

    /* renamed from: a */
    private final List<View> f4209a;

    /* renamed from: b */
    private final androidx.coordinatorlayout.widget.a<View> f4210b;

    /* renamed from: c */
    private final List<View> f4211c;

    /* renamed from: d */
    private final List<View> f4212d;

    /* renamed from: e */
    private Paint f4213e;

    /* renamed from: f */
    private final int[] f4214f;

    /* renamed from: g */
    private final int[] f4215g;

    /* renamed from: h */
    private boolean f4216h;

    /* renamed from: i */
    private boolean f4217i;

    /* renamed from: j */
    private int[] f4218j;

    /* renamed from: k */
    private View f4219k;

    /* renamed from: l */
    private View f4220l;

    /* renamed from: m */
    private g f4221m;

    /* renamed from: n */
    private boolean f4222n;

    /* renamed from: o */
    private l0 f4223o;

    /* renamed from: p */
    private boolean f4224p;

    /* renamed from: q */
    private Drawable f4225q;

    /* renamed from: t */
    ViewGroup.OnHierarchyChangeListener f4226t;

    /* renamed from: w */
    private u f4227w;

    /* renamed from: x */
    private final t f4228x;

    /* loaded from: classes.dex */
    public class a implements u {
        a() {
            CoordinatorLayout.this = r1;
        }

        @Override // androidx.core.view.u
        public l0 a(View view, l0 l0Var) {
            return CoordinatorLayout.this.W(l0Var);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        c getBehavior();
    }

    /* loaded from: classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, V v11, View view, View view2, int i11, int i12) {
            if (i12 == 0) {
                return z(coordinatorLayout, v11, view, view2, i11);
            }
            return false;
        }

        @Deprecated
        public void B(CoordinatorLayout coordinatorLayout, V v11, View view) {
        }

        public void C(CoordinatorLayout coordinatorLayout, V v11, View view, int i11) {
            if (i11 == 0) {
                B(coordinatorLayout, v11, view);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, V v11, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v11) {
            return d(coordinatorLayout, v11) > BitmapDescriptorFactory.HUE_RED;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v11, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, V v11) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, V v11) {
            return BitmapDescriptorFactory.HUE_RED;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v11, View view) {
            return false;
        }

        public l0 f(CoordinatorLayout coordinatorLayout, V v11, l0 l0Var) {
            return l0Var;
        }

        public void g(f fVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v11, View view) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, V v11, View view) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, V v11, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v11, int i11) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v11, int i11, int i12, int i13, int i14) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, V v11, View view, float f11, float f12, boolean z11) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, V v11, View view, float f11, float f12) {
            return false;
        }

        @Deprecated
        public void p(CoordinatorLayout coordinatorLayout, V v11, View view, int i11, int i12, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, V v11, View view, int i11, int i12, int[] iArr, int i13) {
            if (i13 == 0) {
                p(coordinatorLayout, v11, view, i11, i12, iArr);
            }
        }

        @Deprecated
        public void r(CoordinatorLayout coordinatorLayout, V v11, View view, int i11, int i12, int i13, int i14) {
        }

        @Deprecated
        public void s(CoordinatorLayout coordinatorLayout, V v11, View view, int i11, int i12, int i13, int i14, int i15) {
            if (i15 == 0) {
                r(coordinatorLayout, v11, view, i11, i12, i13, i14);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, V v11, View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
            iArr[0] = iArr[0] + i13;
            iArr[1] = iArr[1] + i14;
            s(coordinatorLayout, v11, view, i11, i12, i13, i14, i15);
        }

        @Deprecated
        public void u(CoordinatorLayout coordinatorLayout, V v11, View view, View view2, int i11) {
        }

        public void v(CoordinatorLayout coordinatorLayout, V v11, View view, View view2, int i11, int i12) {
            if (i12 == 0) {
                u(coordinatorLayout, v11, view, view2, i11);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, V v11, Rect rect, boolean z11) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, V v11, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, V v11) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean z(CoordinatorLayout coordinatorLayout, V v11, View view, View view2, int i11) {
            return false;
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
            CoordinatorLayout.this = r1;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f4226t;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f4226t;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
            CoordinatorLayout.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    static class i implements Comparator<View> {
        i() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            float S = a0.S(view);
            float S2 = a0.S(view2);
            if (S > S2) {
                return -1;
            }
            return S < S2 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f4207y = r02 != null ? r02.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            B = new i();
        } else {
            B = null;
        }
        f4208z = new Class[]{Context.class, AttributeSet.class};
        A = new ThreadLocal<>();
        C = new v3.g(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private boolean A(View view) {
        return this.f4210b.j(view);
    }

    private void C(View view, int i11) {
        f fVar = (f) view.getLayoutParams();
        Rect b11 = b();
        b11.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f4223o != null && a0.C(this) && !a0.C(view)) {
            b11.left += this.f4223o.k();
            b11.top += this.f4223o.m();
            b11.right -= this.f4223o.l();
            b11.bottom -= this.f4223o.j();
        }
        Rect b12 = b();
        androidx.core.view.e.a(S(fVar.f4233c), view.getMeasuredWidth(), view.getMeasuredHeight(), b11, b12, i11);
        view.layout(b12.left, b12.top, b12.right, b12.bottom);
        O(b11);
        O(b12);
    }

    private void D(View view, View view2, int i11) {
        Rect b11 = b();
        Rect b12 = b();
        try {
            t(view2, b11);
            u(view, i11, b11, b12);
            view.layout(b12.left, b12.top, b12.right, b12.bottom);
        } finally {
            O(b11);
            O(b12);
        }
    }

    private void E(View view, int i11, int i12) {
        f fVar = (f) view.getLayoutParams();
        int b11 = androidx.core.view.e.b(T(fVar.f4233c), i12);
        int i13 = b11 & 7;
        int i14 = b11 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i12 == 1) {
            i11 = width - i11;
        }
        int w11 = w(i11) - measuredWidth;
        int i15 = 0;
        if (i13 == 1) {
            w11 += measuredWidth / 2;
        } else if (i13 == 5) {
            w11 += measuredWidth;
        }
        if (i14 == 16) {
            i15 = 0 + (measuredHeight / 2);
        } else if (i14 == 80) {
            i15 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(w11, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i15, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void F(View view, Rect rect, int i11) {
        boolean z11;
        boolean z12;
        int width;
        int i12;
        int i13;
        int i14;
        int height;
        int i15;
        int i16;
        int i17;
        if (a0.a0(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c f11 = fVar.f();
            Rect b11 = b();
            Rect b12 = b();
            b12.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f11 != null && f11.b(this, view, b11)) {
                if (!b12.contains(b11)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + b11.toShortString() + " | Bounds:" + b12.toShortString());
                }
            } else {
                b11.set(b12);
            }
            O(b12);
            if (b11.isEmpty()) {
                O(b11);
                return;
            }
            int b13 = androidx.core.view.e.b(fVar.f4238h, i11);
            boolean z13 = true;
            if ((b13 & 48) != 48 || (i16 = (b11.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f4240j) >= (i17 = rect.top)) {
                z11 = false;
            } else {
                V(view, i17 - i16);
                z11 = true;
            }
            if ((b13 & 80) == 80 && (height = ((getHeight() - b11.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f4240j) < (i15 = rect.bottom)) {
                V(view, height - i15);
                z11 = true;
            }
            if (!z11) {
                V(view, 0);
            }
            if ((b13 & 3) != 3 || (i13 = (b11.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f4239i) >= (i14 = rect.left)) {
                z12 = false;
            } else {
                U(view, i14 - i13);
                z12 = true;
            }
            if ((b13 & 5) != 5 || (width = ((getWidth() - b11.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f4239i) >= (i12 = rect.right)) {
                z13 = z12;
            } else {
                U(view, width - i12);
            }
            if (!z13) {
                U(view, 0);
            }
            O(b11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static c K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f4207y;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + CoreConstants.DOT + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = A;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f4208z);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e11) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e11);
        }
    }

    private boolean L(MotionEvent motionEvent, int i11) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f4211c;
        z(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = list.get(i12);
            f fVar = (f) view.getLayoutParams();
            c f11 = fVar.f();
            if (!(z11 || z12) || actionMasked == 0) {
                if (!z11 && f11 != null) {
                    if (i11 == 0) {
                        z11 = f11.k(this, view, motionEvent);
                    } else if (i11 == 1) {
                        z11 = f11.D(this, view, motionEvent);
                    }
                    if (z11) {
                        this.f4219k = view;
                    }
                }
                boolean c11 = fVar.c();
                boolean i13 = fVar.i(this, view);
                z12 = i13 && !c11;
                if (i13 && !z12) {
                    break;
                }
            } else if (f11 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                }
                if (i11 == 0) {
                    f11.k(this, view, motionEvent2);
                } else if (i11 == 1) {
                    f11.D(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z11;
    }

    private void M() {
        this.f4209a.clear();
        this.f4210b.c();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f y11 = y(childAt);
            y11.d(this, childAt);
            this.f4210b.b(childAt);
            for (int i12 = 0; i12 < childCount; i12++) {
                if (i12 != i11) {
                    View childAt2 = getChildAt(i12);
                    if (y11.b(this, childAt, childAt2)) {
                        if (!this.f4210b.d(childAt2)) {
                            this.f4210b.b(childAt2);
                        }
                        this.f4210b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f4209a.addAll(this.f4210b.i());
        Collections.reverse(this.f4209a);
    }

    private static void O(Rect rect) {
        rect.setEmpty();
        C.a(rect);
    }

    private void Q(boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            c f11 = ((f) childAt.getLayoutParams()).f();
            if (f11 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                if (z11) {
                    f11.k(this, childAt, obtain);
                } else {
                    f11.D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            ((f) getChildAt(i12).getLayoutParams()).m();
        }
        this.f4219k = null;
        this.f4216h = false;
    }

    private static int R(int i11) {
        if (i11 == 0) {
            return 17;
        }
        return i11;
    }

    private static int S(int i11) {
        if ((i11 & 7) == 0) {
            i11 |= 8388611;
        }
        return (i11 & 112) == 0 ? i11 | 48 : i11;
    }

    private static int T(int i11) {
        if (i11 == 0) {
            return 8388661;
        }
        return i11;
    }

    private void U(View view, int i11) {
        f fVar = (f) view.getLayoutParams();
        int i12 = fVar.f4239i;
        if (i12 != i11) {
            a0.g0(view, i11 - i12);
            fVar.f4239i = i11;
        }
    }

    private void V(View view, int i11) {
        f fVar = (f) view.getLayoutParams();
        int i12 = fVar.f4240j;
        if (i12 != i11) {
            a0.h0(view, i11 - i12);
            fVar.f4240j = i11;
        }
    }

    private void X() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (a0.C(this)) {
            if (this.f4227w == null) {
                this.f4227w = new a();
            }
            a0.J0(this, this.f4227w);
            setSystemUiVisibility(1280);
            return;
        }
        a0.J0(this, null);
    }

    private static Rect b() {
        Rect b11 = C.b();
        return b11 == null ? new Rect() : b11;
    }

    private static int d(int i11, int i12, int i13) {
        return i11 < i12 ? i12 : i11 > i13 ? i13 : i11;
    }

    private void e(f fVar, Rect rect, int i11, int i12) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i12) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i11 + max, i12 + max2);
    }

    private l0 f(l0 l0Var) {
        c f11;
        if (l0Var.p()) {
            return l0Var;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (a0.C(childAt) && (f11 = ((f) childAt.getLayoutParams()).f()) != null) {
                l0Var = f11.f(this, childAt, l0Var);
                if (l0Var.p()) {
                    break;
                }
            }
        }
        return l0Var;
    }

    private void v(View view, int i11, Rect rect, Rect rect2, f fVar, int i12, int i13) {
        int width;
        int height;
        int b11 = androidx.core.view.e.b(R(fVar.f4233c), i11);
        int b12 = androidx.core.view.e.b(S(fVar.f4234d), i11);
        int i14 = b11 & 7;
        int i15 = b11 & 112;
        int i16 = b12 & 7;
        int i17 = b12 & 112;
        if (i16 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i16 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i17 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i17 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i14 == 1) {
            width -= i12 / 2;
        } else if (i14 != 5) {
            width -= i12;
        }
        if (i15 == 16) {
            height -= i13 / 2;
        } else if (i15 != 80) {
            height -= i13;
        }
        rect2.set(width, height, i12 + width, i13 + height);
    }

    private int w(int i11) {
        int[] iArr = this.f4218j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i11);
            return 0;
        } else if (i11 >= 0 && i11 < iArr.length) {
            return iArr[i11];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i11 + " out of range for " + this);
            return 0;
        }
    }

    private void z(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        Comparator<View> comparator = B;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public boolean B(View view, int i11, int i12) {
        Rect b11 = b();
        t(view, b11);
        try {
            return b11.contains(i11, i12);
        } finally {
            O(b11);
        }
    }

    void G(View view, int i11) {
        c f11;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f4241k != null) {
            Rect b11 = b();
            Rect b12 = b();
            Rect b13 = b();
            t(fVar.f4241k, b11);
            boolean z11 = false;
            q(view, false, b12);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            v(view, i11, b11, b13, fVar, measuredWidth, measuredHeight);
            z11 = (b13.left == b12.left && b13.top == b12.top) ? true : true;
            e(fVar, b13, measuredWidth, measuredHeight);
            int i12 = b13.left - b12.left;
            int i13 = b13.top - b12.top;
            if (i12 != 0) {
                a0.g0(view, i12);
            }
            if (i13 != 0) {
                a0.h0(view, i13);
            }
            if (z11 && (f11 = fVar.f()) != null) {
                f11.h(this, view, fVar.f4241k);
            }
            O(b11);
            O(b12);
            O(b13);
        }
    }

    final void H(int i11) {
        boolean z11;
        int F = a0.F(this);
        int size = this.f4209a.size();
        Rect b11 = b();
        Rect b12 = b();
        Rect b13 = b();
        for (int i12 = 0; i12 < size; i12++) {
            View view = this.f4209a.get(i12);
            f fVar = (f) view.getLayoutParams();
            if (i11 != 0 || view.getVisibility() != 8) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (fVar.f4242l == this.f4209a.get(i13)) {
                        G(view, F);
                    }
                }
                q(view, true, b12);
                if (fVar.f4237g != 0 && !b12.isEmpty()) {
                    int b14 = androidx.core.view.e.b(fVar.f4237g, F);
                    int i14 = b14 & 112;
                    if (i14 == 48) {
                        b11.top = Math.max(b11.top, b12.bottom);
                    } else if (i14 == 80) {
                        b11.bottom = Math.max(b11.bottom, getHeight() - b12.top);
                    }
                    int i15 = b14 & 7;
                    if (i15 == 3) {
                        b11.left = Math.max(b11.left, b12.right);
                    } else if (i15 == 5) {
                        b11.right = Math.max(b11.right, getWidth() - b12.left);
                    }
                }
                if (fVar.f4238h != 0 && view.getVisibility() == 0) {
                    F(view, b11, F);
                }
                if (i11 != 2) {
                    x(view, b13);
                    if (!b13.equals(b12)) {
                        N(view, b12);
                    }
                }
                for (int i16 = i12 + 1; i16 < size; i16++) {
                    View view2 = this.f4209a.get(i16);
                    f fVar2 = (f) view2.getLayoutParams();
                    c f11 = fVar2.f();
                    if (f11 != null && f11.e(this, view2, view)) {
                        if (i11 == 0 && fVar2.g()) {
                            fVar2.k();
                        } else {
                            if (i11 != 2) {
                                z11 = f11.h(this, view2, view);
                            } else {
                                f11.i(this, view2, view);
                                z11 = true;
                            }
                            if (i11 == 1) {
                                fVar2.p(z11);
                            }
                        }
                    }
                }
            }
        }
        O(b11);
        O(b12);
        O(b13);
    }

    public void I(View view, int i11) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.a()) {
            View view2 = fVar.f4241k;
            if (view2 != null) {
                D(view, view2, i11);
                return;
            }
            int i12 = fVar.f4235e;
            if (i12 >= 0) {
                E(view, i12, i11);
                return;
            } else {
                C(view, i11);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public void J(View view, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    void N(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    void P() {
        if (this.f4217i && this.f4221m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f4221m);
        }
        this.f4222n = false;
    }

    final l0 W(l0 l0Var) {
        if (v3.c.a(this.f4223o, l0Var)) {
            return l0Var;
        }
        this.f4223o = l0Var;
        boolean z11 = true;
        boolean z12 = l0Var != null && l0Var.m() > 0;
        this.f4224p = z12;
        if (z12 || getBackground() != null) {
            z11 = false;
        }
        setWillNotDraw(z11);
        l0 f11 = f(l0Var);
        requestLayout();
        return f11;
    }

    @Override // androidx.core.view.q
    public void a(View view, View view2, int i11, int i12) {
        c f11;
        this.f4228x.c(view, view2, i11, i12);
        this.f4220l = view2;
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i12) && (f11 = fVar.f()) != null) {
                f11.v(this, childAt, view, view2, i11, i12);
            }
        }
    }

    void c() {
        if (this.f4217i) {
            if (this.f4221m == null) {
                this.f4221m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f4221m);
        }
        this.f4222n = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j11) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f4231a;
        if (cVar != null) {
            float d11 = cVar.d(this, view);
            if (d11 > BitmapDescriptorFactory.HUE_RED) {
                if (this.f4213e == null) {
                    this.f4213e = new Paint();
                }
                this.f4213e.setColor(fVar.f4231a.c(this, view));
                this.f4213e.setAlpha(d(Math.round(d11 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f4213e);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j11);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4225q;
        boolean z11 = false;
        if (drawable != null && drawable.isStateful()) {
            z11 = false | drawable.setState(drawableState);
        }
        if (z11) {
            invalidate();
        }
    }

    public void g(View view) {
        List g11 = this.f4210b.g(view);
        if (g11 == null || g11.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < g11.size(); i11++) {
            View view2 = (View) g11.get(i11);
            c f11 = ((f) view2.getLayoutParams()).f();
            if (f11 != null) {
                f11.h(this, view2, view);
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        M();
        return Collections.unmodifiableList(this.f4209a);
    }

    public final l0 getLastWindowInsets() {
        return this.f4223o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f4228x.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f4225q;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    void h() {
        int childCount = getChildCount();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            } else if (A(getChildAt(i11))) {
                z11 = true;
                break;
            } else {
                i11++;
            }
        }
        if (z11 != this.f4222n) {
            if (z11) {
                c();
            } else {
                P();
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // androidx.core.view.q
    public void j(View view, int i11) {
        this.f4228x.e(view, i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i11)) {
                c f11 = fVar.f();
                if (f11 != null) {
                    f11.C(this, childAt, view, i11);
                }
                fVar.l(i11);
                fVar.k();
            }
        }
        this.f4220l = null;
    }

    @Override // androidx.core.view.q
    public void k(View view, int i11, int i12, int[] iArr, int i13) {
        c f11;
        int childCount = getChildCount();
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i13) && (f11 = fVar.f()) != null) {
                    int[] iArr2 = this.f4214f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f11.q(this, childAt, view, i11, i12, iArr2, i13);
                    int[] iArr3 = this.f4214f;
                    i14 = i11 > 0 ? Math.max(i14, iArr3[0]) : Math.min(i14, iArr3[0]);
                    int[] iArr4 = this.f4214f;
                    i15 = i12 > 0 ? Math.max(i15, iArr4[1]) : Math.min(i15, iArr4[1]);
                    z11 = true;
                }
            }
        }
        iArr[0] = i14;
        iArr[1] = i15;
        if (z11) {
            H(1);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: l */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // androidx.core.view.r
    public void m(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        c f11;
        boolean z11;
        int min;
        int childCount = getChildCount();
        boolean z12 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i15) && (f11 = fVar.f()) != null) {
                    int[] iArr2 = this.f4214f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f11.t(this, childAt, view, i11, i12, i13, i14, i15, iArr2);
                    int[] iArr3 = this.f4214f;
                    i16 = i13 > 0 ? Math.max(i16, iArr3[0]) : Math.min(i16, iArr3[0]);
                    if (i14 > 0) {
                        z11 = true;
                        min = Math.max(i17, this.f4214f[1]);
                    } else {
                        z11 = true;
                        min = Math.min(i17, this.f4214f[1]);
                    }
                    i17 = min;
                    z12 = z11;
                }
            }
        }
        iArr[0] = iArr[0] + i16;
        iArr[1] = iArr[1] + i17;
        if (z12) {
            H(1);
        }
    }

    @Override // androidx.core.view.q
    public void n(View view, int i11, int i12, int i13, int i14, int i15) {
        m(view, i11, i12, i13, i14, 0, this.f4215g);
    }

    @Override // androidx.core.view.q
    public boolean o(View view, View view2, int i11, int i12) {
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c f11 = fVar.f();
                if (f11 != null) {
                    boolean A2 = f11.A(this, childAt, view, view2, i11, i12);
                    z11 |= A2;
                    fVar.r(i12, A2);
                } else {
                    fVar.r(i12, false);
                }
            }
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q(false);
        if (this.f4222n) {
            if (this.f4221m == null) {
                this.f4221m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f4221m);
        }
        if (this.f4223o == null && a0.C(this)) {
            a0.t0(this);
        }
        this.f4217i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q(false);
        if (this.f4222n && this.f4221m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f4221m);
        }
        View view = this.f4220l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f4217i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f4224p || this.f4225q == null) {
            return;
        }
        l0 l0Var = this.f4223o;
        int m11 = l0Var != null ? l0Var.m() : 0;
        if (m11 > 0) {
            this.f4225q.setBounds(0, 0, getWidth(), m11);
            this.f4225q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Q(true);
        }
        boolean L = L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            Q(true);
        }
        return L;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        c f11;
        int F = a0.F(this);
        int size = this.f4209a.size();
        for (int i15 = 0; i15 < size; i15++) {
            View view = this.f4209a.get(i15);
            if (view.getVisibility() != 8 && ((f11 = ((f) view.getLayoutParams()).f()) == null || !f11.l(this, view, F))) {
                I(view, F);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x011a, code lost:
        if (r0.m(r30, r20, r11, r21, r23, 0) == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        c f13;
        int childCount = getChildCount();
        boolean z12 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f13 = fVar.f()) != null) {
                    z12 |= f13.n(this, childAt, view, f11, f12, z11);
                }
            }
        }
        if (z12) {
            H(1);
        }
        return z12;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onNestedPreFling(View view, float f11, float f12) {
        c f13;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (f13 = fVar.f()) != null) {
                    z11 |= f13.o(this, childAt, view, f11, f12);
                }
            }
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        k(view, i11, i12, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        n(view, i11, i12, i13, i14, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        a(view, view2, i11, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray<Parcelable> sparseArray = hVar.f4249c;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id2 = childAt.getId();
            c f11 = y(childAt).f();
            if (id2 != -1 && f11 != null && (parcelable2 = sparseArray.get(id2)) != null) {
                f11.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable y11;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            int id2 = childAt.getId();
            c f11 = ((f) childAt.getLayoutParams()).f();
            if (id2 != -1 && f11 != null && (y11 = f11.y(this, childAt)) != null) {
                sparseArray.append(id2, y11);
            }
        }
        hVar.f4249c = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        return o(view, view2, i11, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f4219k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.L(r1, r4)
            if (r3 == 0) goto L2b
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.f4219k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f()
            if (r6 == 0) goto L2b
            android.view.View r7 = r0.f4219k
            boolean r6 = r6.D(r0, r7, r1)
            goto L2c
        L2b:
            r6 = r5
        L2c:
            android.view.View r7 = r0.f4219k
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L57
        L54:
            r0.Q(r5)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    /* renamed from: p */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new f((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new f(layoutParams);
    }

    void q(View view, boolean z11, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z11) {
            t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List<View> r(View view) {
        List<View> h11 = this.f4210b.h(view);
        this.f4212d.clear();
        if (h11 != null) {
            this.f4212d.addAll(h11);
        }
        return this.f4212d;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        c f11 = ((f) view.getLayoutParams()).f();
        if (f11 == null || !f11.w(this, view, rect, z11)) {
            return super.requestChildRectangleOnScreen(view, rect, z11);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        super.requestDisallowInterceptTouchEvent(z11);
        if (!z11 || this.f4216h) {
            return;
        }
        Q(false);
        this.f4216h = true;
    }

    public List<View> s(View view) {
        List g11 = this.f4210b.g(view);
        this.f4212d.clear();
        if (g11 != null) {
            this.f4212d.addAll(g11);
        }
        return this.f4212d;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z11) {
        super.setFitsSystemWindows(z11);
        X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f4226t = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f4225q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f4225q = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f4225q.setState(getDrawableState());
                }
                n3.a.m(this.f4225q, a0.F(this));
                this.f4225q.setVisible(getVisibility() == 0, false);
                this.f4225q.setCallback(this);
            }
            a0.n0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i11) {
        setStatusBarBackground(new ColorDrawable(i11));
    }

    public void setStatusBarBackgroundResource(int i11) {
        setStatusBarBackground(i11 != 0 ? androidx.core.content.b.getDrawable(getContext(), i11) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.f4225q;
        if (drawable == null || drawable.isVisible() == z11) {
            return;
        }
        this.f4225q.setVisible(z11, false);
    }

    void t(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void u(View view, int i11, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        v(view, i11, rect, rect2, fVar, measuredWidth, measuredHeight);
        e(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4225q;
    }

    void x(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    f y(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f4232b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.f4232b = true;
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.o(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e11) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e11);
                    }
                }
                fVar.f4232b = true;
            }
        }
        return fVar;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i3.a.f29811a);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray obtainStyledAttributes;
        this.f4209a = new ArrayList();
        this.f4210b = new androidx.coordinatorlayout.widget.a<>();
        this.f4211c = new ArrayList();
        this.f4212d = new ArrayList();
        this.f4214f = new int[2];
        this.f4215g = new int[2];
        this.f4228x = new t(this);
        if (i11 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i3.c.f29813a, 0, i3.b.f29812a);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i3.c.f29813a, i11, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i11 == 0) {
                saveAttributeDataForStyleable(context, i3.c.f29813a, attributeSet, obtainStyledAttributes, 0, i3.b.f29812a);
            } else {
                saveAttributeDataForStyleable(context, i3.c.f29813a, attributeSet, obtainStyledAttributes, i11, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(i3.c.f29814b, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f4218j = resources.getIntArray(resourceId);
            float f11 = resources.getDisplayMetrics().density;
            int length = this.f4218j.length;
            for (int i12 = 0; i12 < length; i12++) {
                int[] iArr = this.f4218j;
                iArr[i12] = (int) (iArr[i12] * f11);
            }
        }
        this.f4225q = obtainStyledAttributes.getDrawable(i3.c.f29815c);
        obtainStyledAttributes.recycle();
        X();
        super.setOnHierarchyChangeListener(new e());
        if (a0.D(this) == 0) {
            a0.G0(this, 1);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends a4.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c */
        SparseArray<Parcelable> f4249c;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public h[] newArray(int i11) {
                return new h[i11];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f4249c = new SparseArray<>(readInt);
            for (int i11 = 0; i11 < readInt; i11++) {
                this.f4249c.append(iArr[i11], readParcelableArray[i11]);
            }
        }

        @Override // a4.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            SparseArray<Parcelable> sparseArray = this.f4249c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = this.f4249c.keyAt(i12);
                parcelableArr[i12] = this.f4249c.valueAt(i12);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i11);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        c f4231a;

        /* renamed from: b */
        boolean f4232b;

        /* renamed from: c */
        public int f4233c;

        /* renamed from: d */
        public int f4234d;

        /* renamed from: e */
        public int f4235e;

        /* renamed from: f */
        int f4236f;

        /* renamed from: g */
        public int f4237g;

        /* renamed from: h */
        public int f4238h;

        /* renamed from: i */
        int f4239i;

        /* renamed from: j */
        int f4240j;

        /* renamed from: k */
        View f4241k;

        /* renamed from: l */
        View f4242l;

        /* renamed from: m */
        private boolean f4243m;

        /* renamed from: n */
        private boolean f4244n;

        /* renamed from: o */
        private boolean f4245o;

        /* renamed from: p */
        private boolean f4246p;

        /* renamed from: q */
        final Rect f4247q;

        public f(int i11, int i12) {
            super(i11, i12);
            this.f4232b = false;
            this.f4233c = 0;
            this.f4234d = 0;
            this.f4235e = -1;
            this.f4236f = -1;
            this.f4237g = 0;
            this.f4238h = 0;
            this.f4247q = new Rect();
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f4236f);
            this.f4241k = findViewById;
            if (findViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f4242l = null;
                    this.f4241k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f4236f) + " to anchor view " + view);
            } else if (findViewById == coordinatorLayout) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f4242l = null;
                    this.f4241k = null;
                    return;
                }
                throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
            } else {
                for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                    if (parent == view) {
                        if (coordinatorLayout.isInEditMode()) {
                            this.f4242l = null;
                            this.f4241k = null;
                            return;
                        }
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    if (parent instanceof View) {
                        findViewById = (View) parent;
                    }
                }
                this.f4242l = findViewById;
            }
        }

        private boolean s(View view, int i11) {
            int b11 = androidx.core.view.e.b(((f) view.getLayoutParams()).f4237g, i11);
            return b11 != 0 && (androidx.core.view.e.b(this.f4238h, i11) & b11) == b11;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f4241k.getId() != this.f4236f) {
                return false;
            }
            View view2 = this.f4241k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent != null && parent != view) {
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    }
                } else {
                    this.f4242l = null;
                    this.f4241k = null;
                    return false;
                }
            }
            this.f4242l = view2;
            return true;
        }

        boolean a() {
            return this.f4241k == null && this.f4236f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.f4242l || s(view2, a0.F(coordinatorLayout)) || ((cVar = this.f4231a) != null && cVar.e(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.f4231a == null) {
                this.f4243m = false;
            }
            return this.f4243m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f4236f == -1) {
                this.f4242l = null;
                this.f4241k = null;
                return null;
            }
            if (this.f4241k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f4241k;
        }

        public int e() {
            return this.f4236f;
        }

        public c f() {
            return this.f4231a;
        }

        boolean g() {
            return this.f4246p;
        }

        Rect h() {
            return this.f4247q;
        }

        boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z11 = this.f4243m;
            if (z11) {
                return true;
            }
            c cVar = this.f4231a;
            boolean a11 = (cVar != null ? cVar.a(coordinatorLayout, view) : false) | z11;
            this.f4243m = a11;
            return a11;
        }

        boolean j(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    return false;
                }
                return this.f4245o;
            }
            return this.f4244n;
        }

        void k() {
            this.f4246p = false;
        }

        void l(int i11) {
            r(i11, false);
        }

        void m() {
            this.f4243m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.f4231a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.j();
                }
                this.f4231a = cVar;
                this.f4232b = true;
                if (cVar != null) {
                    cVar.g(this);
                }
            }
        }

        void p(boolean z11) {
            this.f4246p = z11;
        }

        void q(Rect rect) {
            this.f4247q.set(rect);
        }

        void r(int i11, boolean z11) {
            if (i11 == 0) {
                this.f4244n = z11;
            } else if (i11 != 1) {
            } else {
                this.f4245o = z11;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4232b = false;
            this.f4233c = 0;
            this.f4234d = 0;
            this.f4235e = -1;
            this.f4236f = -1;
            this.f4237g = 0;
            this.f4238h = 0;
            this.f4247q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i3.c.f29816d);
            this.f4233c = obtainStyledAttributes.getInteger(i3.c.f29817e, 0);
            this.f4236f = obtainStyledAttributes.getResourceId(i3.c.f29818f, -1);
            this.f4234d = obtainStyledAttributes.getInteger(i3.c.f29819g, 0);
            this.f4235e = obtainStyledAttributes.getInteger(i3.c.f29823k, -1);
            this.f4237g = obtainStyledAttributes.getInt(i3.c.f29822j, 0);
            this.f4238h = obtainStyledAttributes.getInt(i3.c.f29821i, 0);
            int i11 = i3.c.f29820h;
            boolean hasValue = obtainStyledAttributes.hasValue(i11);
            this.f4232b = hasValue;
            if (hasValue) {
                this.f4231a = CoordinatorLayout.K(context, attributeSet, obtainStyledAttributes.getString(i11));
            }
            obtainStyledAttributes.recycle();
            c cVar = this.f4231a;
            if (cVar != null) {
                cVar.g(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f4232b = false;
            this.f4233c = 0;
            this.f4234d = 0;
            this.f4235e = -1;
            this.f4236f = -1;
            this.f4237g = 0;
            this.f4238h = 0;
            this.f4247q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4232b = false;
            this.f4233c = 0;
            this.f4234d = 0;
            this.f4235e = -1;
            this.f4236f = -1;
            this.f4237g = 0;
            this.f4238h = 0;
            this.f4247q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4232b = false;
            this.f4233c = 0;
            this.f4234d = 0;
            this.f4235e = -1;
            this.f4236f = -1;
            this.f4237g = 0;
            this.f4238h = 0;
            this.f4247q = new Rect();
        }
    }
}