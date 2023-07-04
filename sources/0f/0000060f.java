package androidx.core.view;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.a;
import androidx.core.view.l0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import w3.c;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: b */
    private static Field f4463b;

    /* renamed from: c */
    private static boolean f4464c;

    /* renamed from: d */
    private static Field f4465d;

    /* renamed from: e */
    private static boolean f4466e;

    /* renamed from: f */
    private static WeakHashMap<View, String> f4467f;

    /* renamed from: h */
    private static Field f4469h;

    /* renamed from: j */
    private static ThreadLocal<Rect> f4471j;

    /* renamed from: a */
    private static final AtomicInteger f4462a = new AtomicInteger(1);

    /* renamed from: g */
    private static WeakHashMap<View, g0> f4468g = null;

    /* renamed from: i */
    private static boolean f4470i = false;

    /* renamed from: k */
    private static final int[] f4472k = {j3.c.f33153b, j3.c.f33154c, j3.c.f33165n, j3.c.f33176y, j3.c.B, j3.c.C, j3.c.D, j3.c.E, j3.c.F, j3.c.G, j3.c.f33155d, j3.c.f33156e, j3.c.f33157f, j3.c.f33158g, j3.c.f33159h, j3.c.f33160i, j3.c.f33161j, j3.c.f33162k, j3.c.f33163l, j3.c.f33164m, j3.c.f33166o, j3.c.f33167p, j3.c.f33168q, j3.c.f33169r, j3.c.f33170s, j3.c.f33171t, j3.c.f33172u, j3.c.f33173v, j3.c.f33174w, j3.c.f33175x, j3.c.f33177z, j3.c.A};

    /* renamed from: l */
    private static final w f4473l = new w() { // from class: androidx.core.view.z
        @Override // androidx.core.view.w
        public final c onReceiveContent(c cVar) {
            c e02;
            e02 = a0.e0(cVar);
            return e02;
        }
    };

    /* loaded from: classes.dex */
    public class a extends f<Boolean> {
        a(int i11, Class cls, int i12) {
            super(i11, cls, i12);
        }

        @Override // androidx.core.view.a0.f
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(p.d(view));
        }

        @Override // androidx.core.view.a0.f
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            p.i(view, bool.booleanValue());
        }

        @Override // androidx.core.view.a0.f
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* loaded from: classes.dex */
    public class b extends f<CharSequence> {
        b(int i11, Class cls, int i12, int i13) {
            super(i11, cls, i12, i13);
        }

        @Override // androidx.core.view.a0.f
        /* renamed from: i */
        public CharSequence d(View view) {
            return p.b(view);
        }

        @Override // androidx.core.view.a0.f
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            p.h(view, charSequence);
        }

        @Override // androidx.core.view.a0.f
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* loaded from: classes.dex */
    public class c extends f<CharSequence> {
        c(int i11, Class cls, int i12, int i13) {
            super(i11, cls, i12, i13);
        }

        @Override // androidx.core.view.a0.f
        /* renamed from: i */
        public CharSequence d(View view) {
            return r.a(view);
        }

        @Override // androidx.core.view.a0.f
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            r.c(view, charSequence);
        }

        @Override // androidx.core.view.a0.f
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* loaded from: classes.dex */
    public class d extends f<Boolean> {
        d(int i11, Class cls, int i12) {
            super(i11, cls, i12);
        }

        @Override // androidx.core.view.a0.f
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(p.c(view));
        }

        @Override // androidx.core.view.a0.f
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            p.g(view, bool.booleanValue());
        }

        @Override // androidx.core.view.a0.f
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* loaded from: classes.dex */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        private final WeakHashMap<View, Boolean> f4474a = new WeakHashMap<>();

        e() {
        }

        private void a(View view, boolean z11) {
            boolean z12 = view.getVisibility() == 0;
            if (z11 != z12) {
                a0.f0(view, z12 ? 16 : 32);
                this.f4474a.put(view, Boolean.valueOf(z12));
            }
        }

        private void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f4474a.entrySet()) {
                    a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f<T> {

        /* renamed from: a */
        private final int f4475a;

        /* renamed from: b */
        private final Class<T> f4476b;

        /* renamed from: c */
        private final int f4477c;

        /* renamed from: d */
        private final int f4478d;

        f(int i11, Class<T> cls, int i12) {
            this(i11, cls, 0, i12);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean c() {
            return Build.VERSION.SDK_INT >= this.f4477c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract T d(View view);

        abstract void e(View view, T t11);

        T f(View view) {
            if (c()) {
                return d(view);
            }
            if (b()) {
                T t11 = (T) view.getTag(this.f4475a);
                if (this.f4476b.isInstance(t11)) {
                    return t11;
                }
                return null;
            }
            return null;
        }

        void g(View view, T t11) {
            if (c()) {
                e(view, t11);
            } else if (b() && h(f(view), t11)) {
                a0.m(view);
                view.setTag(this.f4475a, t11);
                a0.f0(view, this.f4478d);
            }
        }

        abstract boolean h(T t11, T t12);

        f(int i11, Class<T> cls, int i12, int i13) {
            this.f4475a = i11;
            this.f4476b = cls;
            this.f4478d = i12;
            this.f4477c = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class g {
        static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* loaded from: classes.dex */
    public static class h {
        static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        static int c(View view) {
            return view.getImportantForAccessibility();
        }

        static int d(View view) {
            return view.getMinimumHeight();
        }

        static int e(View view) {
            return view.getMinimumWidth();
        }

        static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        static boolean i(View view) {
            return view.hasTransientState();
        }

        static boolean j(View view, int i11, Bundle bundle) {
            return view.performAccessibilityAction(i11, bundle);
        }

        static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        static void l(View view, int i11, int i12, int i13, int i14) {
            view.postInvalidateOnAnimation(i11, i12, i13, i14);
        }

        static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        static void n(View view, Runnable runnable, long j11) {
            view.postOnAnimationDelayed(runnable, j11);
        }

        static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        static void p(View view) {
            view.requestFitSystemWindows();
        }

        static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        static void r(View view, boolean z11) {
            view.setHasTransientState(z11);
        }

        static void s(View view, int i11) {
            view.setImportantForAccessibility(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i {
        static int a() {
            return View.generateViewId();
        }

        static Display b(View view) {
            return view.getDisplay();
        }

        static int c(View view) {
            return view.getLabelFor();
        }

        static int d(View view) {
            return view.getLayoutDirection();
        }

        static int e(View view) {
            return view.getPaddingEnd();
        }

        static int f(View view) {
            return view.getPaddingStart();
        }

        static boolean g(View view) {
            return view.isPaddingRelative();
        }

        static void h(View view, int i11) {
            view.setLabelFor(i11);
        }

        static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        static void j(View view, int i11) {
            view.setLayoutDirection(i11);
        }

        static void k(View view, int i11, int i12, int i13, int i14) {
            view.setPaddingRelative(i11, i12, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j {
        static Rect a(View view) {
            return view.getClipBounds();
        }

        static boolean b(View view) {
            return view.isInLayout();
        }

        static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        static boolean c(View view) {
            return view.isLaidOut();
        }

        static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        static void e(ViewParent viewParent, View view, View view2, int i11) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i11);
        }

        static void f(View view, int i11) {
            view.setAccessibilityLiveRegion(i11);
        }

        static void g(AccessibilityEvent accessibilityEvent, int i11) {
            accessibilityEvent.setContentChangeTypes(i11);
        }
    }

    /* loaded from: classes.dex */
    public static class l {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class m {

        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            l0 f4479a = null;

            /* renamed from: b */
            final /* synthetic */ View f4480b;

            /* renamed from: c */
            final /* synthetic */ androidx.core.view.u f4481c;

            a(View view, androidx.core.view.u uVar) {
                this.f4480b = view;
                this.f4481c = uVar;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                l0 x11 = l0.x(windowInsets, view);
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 30) {
                    m.a(windowInsets, this.f4480b);
                    if (x11.equals(this.f4479a)) {
                        return this.f4481c.a(view, x11).v();
                    }
                }
                this.f4479a = x11;
                l0 a11 = this.f4481c.a(view, x11);
                if (i11 >= 30) {
                    return a11.v();
                }
                a0.t0(view);
                return a11.v();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(j3.c.T);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static l0 b(View view, l0 l0Var, Rect rect) {
            WindowInsets v11 = l0Var.v();
            if (v11 != null) {
                return l0.x(view.computeSystemWindowInsets(v11, rect), view);
            }
            rect.setEmpty();
            return l0Var;
        }

        static boolean c(View view, float f11, float f12, boolean z11) {
            return view.dispatchNestedFling(f11, f12, z11);
        }

        static boolean d(View view, float f11, float f12) {
            return view.dispatchNestedPreFling(f11, f12);
        }

        static boolean e(View view, int i11, int i12, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i11, i12, iArr, iArr2);
        }

        static boolean f(View view, int i11, int i12, int i13, int i14, int[] iArr) {
            return view.dispatchNestedScroll(i11, i12, i13, i14, iArr);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static l0 j(View view) {
            return l0.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f11) {
            view.setElevation(f11);
        }

        static void t(View view, boolean z11) {
            view.setNestedScrollingEnabled(z11);
        }

        static void u(View view, androidx.core.view.u uVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(j3.c.L, uVar);
            }
            if (uVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(j3.c.T));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, uVar));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f11) {
            view.setTranslationZ(f11);
        }

        static void x(View view, float f11) {
            view.setZ(f11);
        }

        static boolean y(View view, int i11) {
            return view.startNestedScroll(i11);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class n {
        public static l0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            l0 w11 = l0.w(rootWindowInsets);
            w11.t(w11);
            w11.d(view.getRootView());
            return w11;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i11) {
            view.setScrollIndicators(i11);
        }

        static void d(View view, int i11, int i12) {
            view.setScrollIndicators(i11, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class o {
        static void a(View view, Collection<View> collection, int i11) {
            view.addKeyboardNavigationClusters(collection, i11);
        }

        static int b(View view) {
            return view.getImportantForAutofill();
        }

        static int c(View view) {
            return view.getNextClusterForwardId();
        }

        static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View h(View view, View view2, int i11) {
            return view.keyboardNavigationClusterSearch(view2, i11);
        }

        static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void k(View view, boolean z11) {
            view.setFocusedByDefault(z11);
        }

        static void l(View view, int i11) {
            view.setImportantForAutofill(i11);
        }

        static void m(View view, boolean z11) {
            view.setKeyboardNavigationCluster(z11);
        }

        static void n(View view, int i11) {
            view.setNextClusterForwardId(i11);
        }

        static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static class p {
        static void a(View view, final u uVar) {
            int i11 = j3.c.S;
            androidx.collection.g gVar = (androidx.collection.g) view.getTag(i11);
            if (gVar == null) {
                gVar = new androidx.collection.g();
                view.setTag(i11, gVar);
            }
            Objects.requireNonNull(uVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.b0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return uVar.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            gVar.put(uVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, u uVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.g gVar = (androidx.collection.g) view.getTag(j3.c.S);
            if (gVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(uVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i11) {
            return (T) view.requireViewById(i11);
        }

        static void g(View view, boolean z11) {
            view.setAccessibilityHeading(z11);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void i(View view, boolean z11) {
            view.setScreenReaderFocusable(z11);
        }
    }

    /* loaded from: classes.dex */
    public static class q {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i11, int i12) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i11, i12);
        }

        static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* loaded from: classes.dex */
    public static class r {
        static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static m0 b(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return m0.b(windowInsetsController);
            }
            return null;
        }

        static void c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class s {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static androidx.core.view.c b(View view, androidx.core.view.c cVar) {
            ContentInfo f11 = cVar.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f11);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f11 ? cVar : androidx.core.view.c.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, androidx.core.view.v vVar) {
            if (vVar == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new t(vVar));
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class t implements OnReceiveContentListener {

        /* renamed from: a */
        private final androidx.core.view.v f4482a;

        t(androidx.core.view.v vVar) {
            this.f4482a = vVar;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            androidx.core.view.c g11 = androidx.core.view.c.g(contentInfo);
            androidx.core.view.c a11 = this.f4482a.a(view, g11);
            if (a11 == null) {
                return null;
            }
            return a11 == g11 ? contentInfo : a11.f();
        }
    }

    /* loaded from: classes.dex */
    public interface u {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class v {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f4483d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f4484a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f4485b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f4486c = null;

        v() {
        }

        static v a(View view) {
            int i11 = j3.c.R;
            v vVar = (v) view.getTag(i11);
            if (vVar == null) {
                v vVar2 = new v();
                view.setTag(i11, vVar2);
                return vVar2;
            }
            return vVar;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f4484a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c11 = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c11 != null) {
                            return c11;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.f4485b == null) {
                this.f4485b = new SparseArray<>();
            }
            return this.f4485b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(j3.c.S);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((u) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f4484a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f4483d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f4484a == null) {
                    this.f4484a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f4483d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f4484a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f4484a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c11 = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c11 != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c11));
                }
            }
            return c11 != null;
        }

        boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f4486c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                this.f4486c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                SparseArray<WeakReference<View>> d11 = d();
                if (keyEvent.getAction() == 1 && (indexOfKey = d11.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = d11.valueAt(indexOfKey);
                    d11.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = d11.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view = weakReference2.get();
                    if (view != null && a0.Y(view)) {
                        e(view, keyEvent);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    static {
        new e();
    }

    private static Rect A() {
        if (f4471j == null) {
            f4471j = new ThreadLocal<>();
        }
        Rect rect = f4471j.get();
        if (rect == null) {
            rect = new Rect();
            f4471j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void A0(View view, ColorStateList colorStateList) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 21) {
            m.q(view, colorStateList);
            if (i11 == 21) {
                Drawable background = view.getBackground();
                boolean z11 = (m.g(view) == null && m.h(view) == null) ? false : true;
                if (background == null || !z11) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                h.q(view, background);
            }
        } else if (view instanceof y) {
            ((y) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    private static w B(View view) {
        if (view instanceof w) {
            return (w) view;
        }
        return f4473l;
    }

    public static void B0(View view, PorterDuff.Mode mode) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 21) {
            m.r(view, mode);
            if (i11 == 21) {
                Drawable background = view.getBackground();
                boolean z11 = (m.g(view) == null && m.h(view) == null) ? false : true;
                if (background == null || !z11) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                h.q(view, background);
            }
        } else if (view instanceof y) {
            ((y) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static boolean C(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.b(view);
        }
        return false;
    }

    public static void C0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            j.c(view, rect);
        }
    }

    public static int D(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.c(view);
        }
        return 0;
    }

    public static void D0(View view, float f11) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.s(view, f11);
        }
    }

    public static int E(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.b(view);
        }
        return 0;
    }

    @Deprecated
    public static void E0(View view, boolean z11) {
        view.setFitsSystemWindows(z11);
    }

    public static int F(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.d(view);
        }
        return 0;
    }

    public static void F0(View view, boolean z11) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.r(view, z11);
        }
    }

    public static int G(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.d(view);
        }
        if (!f4466e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f4465d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4466e = true;
        }
        Field field = f4465d;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    public static void G0(View view, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 19) {
            h.s(view, i11);
        } else if (i12 >= 16) {
            if (i11 == 4) {
                i11 = 2;
            }
            h.s(view, i11);
        }
    }

    public static int H(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.e(view);
        }
        if (!f4464c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f4463b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4464c = true;
        }
        Field field = f4463b;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    public static void H0(View view, int i11) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.l(view, i11);
        }
    }

    public static String[] I(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return s.a(view);
        }
        return (String[]) view.getTag(j3.c.N);
    }

    public static void I0(View view, boolean z11) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.t(view, z11);
        } else if (view instanceof androidx.core.view.o) {
            ((androidx.core.view.o) view).setNestedScrollingEnabled(z11);
        }
    }

    public static int J(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.e(view);
        }
        return view.getPaddingRight();
    }

    public static void J0(View view, androidx.core.view.u uVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.u(view, uVar);
        }
    }

    public static int K(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.f(view);
        }
        return view.getPaddingLeft();
    }

    public static void K0(View view, int i11, int i12, int i13, int i14) {
        if (Build.VERSION.SDK_INT >= 17) {
            i.k(view, i11, i12, i13, i14);
        } else {
            view.setPadding(i11, i12, i13, i14);
        }
    }

    public static ViewParent L(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.f(view);
        }
        return view.getParent();
    }

    public static void L0(View view, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.d(view, i11, i12);
        }
    }

    public static l0 M(View view) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            return n.a(view);
        }
        if (i11 >= 21) {
            return m.j(view);
        }
        return null;
    }

    public static void M0(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            R0().g(view, charSequence);
        }
    }

    public static CharSequence N(View view) {
        return R0().f(view);
    }

    public static void N0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.v(view, str);
            return;
        }
        if (f4467f == null) {
            f4467f = new WeakHashMap<>();
        }
        f4467f.put(view, str);
    }

    public static String O(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.k(view);
        }
        WeakHashMap<View, String> weakHashMap = f4467f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static void O0(View view, float f11) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.w(view, f11);
        }
    }

    public static float P(View view) {
        return Build.VERSION.SDK_INT >= 21 ? m.l(view) : BitmapDescriptorFactory.HUE_RED;
    }

    private static void P0(View view) {
        if (D(view) == 0) {
            G0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (D((View) parent) == 4) {
                G0(view, 2);
                return;
            }
        }
    }

    public static m0 Q(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return r.b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return k0.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void Q0(View view, float f11) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.x(view, f11);
        }
    }

    @Deprecated
    public static int R(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.g(view);
        }
        return 0;
    }

    private static f<CharSequence> R0() {
        return new c(j3.c.P, CharSequence.class, 64, 30);
    }

    public static float S(View view) {
        return Build.VERSION.SDK_INT >= 21 ? m.m(view) : BitmapDescriptorFactory.HUE_RED;
    }

    public static void S0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.z(view);
        } else if (view instanceof androidx.core.view.o) {
            ((androidx.core.view.o) view).stopNestedScroll();
        }
    }

    public static boolean T(View view) {
        return p(view) != null;
    }

    private static void T0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static boolean U(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return g.a(view);
        }
        return false;
    }

    public static boolean V(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.h(view);
        }
        return true;
    }

    public static boolean W(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.i(view);
        }
        return false;
    }

    public static boolean X(View view) {
        Boolean f11 = b().f(view);
        return f11 != null && f11.booleanValue();
    }

    public static boolean Y(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return k.b(view);
        }
        return view.getWindowToken() != null;
    }

    public static boolean Z(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return j.b(view);
        }
        return false;
    }

    public static boolean a0(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return k.c(view);
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    private static f<Boolean> b() {
        return new d(j3.c.J, Boolean.class, 28);
    }

    public static boolean b0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.p(view);
        }
        if (view instanceof androidx.core.view.o) {
            return ((androidx.core.view.o) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static int c(View view, CharSequence charSequence, w3.f fVar) {
        int u11 = u(view, charSequence);
        if (u11 != -1) {
            d(view, new c.a(u11, charSequence, fVar));
        }
        return u11;
    }

    public static boolean c0(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.g(view);
        }
        return false;
    }

    private static void d(View view, c.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m(view);
            r0(aVar.b(), view);
            t(view).add(aVar);
            f0(view, 0);
        }
    }

    public static boolean d0(View view) {
        Boolean f11 = v0().f(view);
        return f11 != null && f11.booleanValue();
    }

    public static g0 e(View view) {
        if (f4468g == null) {
            f4468g = new WeakHashMap<>();
        }
        g0 g0Var = f4468g.get(view);
        if (g0Var == null) {
            g0 g0Var2 = new g0(view);
            f4468g.put(view, g0Var2);
            return g0Var2;
        }
        return g0Var;
    }

    public static /* synthetic */ androidx.core.view.c e0(androidx.core.view.c cVar) {
        return cVar;
    }

    private static void f(View view, int i11) {
        view.offsetLeftAndRight(i11);
        if (view.getVisibility() == 0) {
            T0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                T0((View) parent);
            }
        }
    }

    static void f0(View view, int i11) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z11 = s(view) != null && view.getVisibility() == 0;
            if (r(view) != 0 || z11) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z11 ? 32 : 2048);
                k.g(obtain, i11);
                if (z11) {
                    obtain.getText().add(s(view));
                    P0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i11 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                k.g(obtain2, i11);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(s(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    k.e(view.getParent(), view, view, i11);
                } catch (AbstractMethodError e11) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e11);
                }
            }
        }
    }

    private static void g(View view, int i11) {
        view.offsetTopAndBottom(i11);
        if (view.getVisibility() == 0) {
            T0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                T0((View) parent);
            }
        }
    }

    public static void g0(View view, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 23) {
            view.offsetLeftAndRight(i11);
        } else if (i12 >= 21) {
            Rect A = A();
            boolean z11 = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                A.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z11 = !A.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            f(view, i11);
            if (z11 && A.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(A);
            }
        } else {
            f(view, i11);
        }
    }

    public static l0 h(View view, l0 l0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? m.b(view, l0Var, rect) : l0Var;
    }

    public static void h0(View view, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 23) {
            view.offsetTopAndBottom(i11);
        } else if (i12 >= 21) {
            Rect A = A();
            boolean z11 = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                A.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z11 = !A.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            g(view, i11);
            if (z11 && A.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(A);
            }
        } else {
            g(view, i11);
        }
    }

    public static l0 i(View view, l0 l0Var) {
        WindowInsets v11;
        if (Build.VERSION.SDK_INT >= 21 && (v11 = l0Var.v()) != null) {
            WindowInsets a11 = l.a(view, v11);
            if (!a11.equals(v11)) {
                return l0.x(a11, view);
            }
        }
        return l0Var;
    }

    public static l0 i0(View view, l0 l0Var) {
        WindowInsets v11;
        if (Build.VERSION.SDK_INT >= 21 && (v11 = l0Var.v()) != null) {
            WindowInsets b11 = l.b(view, v11);
            if (!b11.equals(v11)) {
                return l0.x(b11, view);
            }
        }
        return l0Var;
    }

    public static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).b(view, keyEvent);
    }

    public static void j0(View view, w3.c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.O0());
    }

    public static boolean k(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).f(keyEvent);
    }

    private static f<CharSequence> k0() {
        return new b(j3.c.K, CharSequence.class, 8, 28);
    }

    public static void l(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            m(view);
        }
    }

    public static boolean l0(View view, int i11, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.j(view, i11, bundle);
        }
        return false;
    }

    static void m(View view) {
        androidx.core.view.a o11 = o(view);
        if (o11 == null) {
            o11 = new androidx.core.view.a();
        }
        w0(view, o11);
    }

    public static androidx.core.view.c m0(View view, androidx.core.view.c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return s.b(view, cVar);
        }
        androidx.core.view.v vVar = (androidx.core.view.v) view.getTag(j3.c.M);
        if (vVar != null) {
            androidx.core.view.c a11 = vVar.a(view, cVar);
            if (a11 == null) {
                return null;
            }
            return B(view).onReceiveContent(a11);
        }
        return B(view).onReceiveContent(cVar);
    }

    public static int n() {
        AtomicInteger atomicInteger;
        int i11;
        int i12;
        if (Build.VERSION.SDK_INT >= 17) {
            return i.a();
        }
        do {
            atomicInteger = f4462a;
            i11 = atomicInteger.get();
            i12 = i11 + 1;
            if (i12 > 16777215) {
                i12 = 1;
            }
        } while (!atomicInteger.compareAndSet(i11, i12));
        return i11;
    }

    public static void n0(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.k(view);
        } else {
            view.postInvalidate();
        }
    }

    public static androidx.core.view.a o(View view) {
        View.AccessibilityDelegate p11 = p(view);
        if (p11 == null) {
            return null;
        }
        if (p11 instanceof a.C0074a) {
            return ((a.C0074a) p11).f4461a;
        }
        return new androidx.core.view.a(p11);
    }

    public static void o0(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.m(view, runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    private static View.AccessibilityDelegate p(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return q.a(view);
        }
        return q(view);
    }

    public static void p0(View view, Runnable runnable, long j11) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.n(view, runnable, j11);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j11);
        }
    }

    private static View.AccessibilityDelegate q(View view) {
        if (f4470i) {
            return null;
        }
        if (f4469h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f4469h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f4470i = true;
                return null;
            }
        }
        try {
            Object obj = f4469h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f4470i = true;
            return null;
        }
    }

    public static void q0(View view, int i11) {
        if (Build.VERSION.SDK_INT >= 21) {
            r0(i11, view);
            f0(view, 0);
        }
    }

    public static int r(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return k.a(view);
        }
        return 0;
    }

    private static void r0(int i11, View view) {
        List<c.a> t11 = t(view);
        for (int i12 = 0; i12 < t11.size(); i12++) {
            if (t11.get(i12).b() == i11) {
                t11.remove(i12);
                return;
            }
        }
    }

    public static CharSequence s(View view) {
        return k0().f(view);
    }

    public static void s0(View view, c.a aVar, CharSequence charSequence, w3.f fVar) {
        if (fVar == null && charSequence == null) {
            q0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, fVar));
        }
    }

    private static List<c.a> t(View view) {
        int i11 = j3.c.H;
        ArrayList arrayList = (ArrayList) view.getTag(i11);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(i11, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static void t0(View view) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 20) {
            l.c(view);
        } else if (i11 >= 16) {
            h.p(view);
        }
    }

    private static int u(View view, CharSequence charSequence) {
        List<c.a> t11 = t(view);
        for (int i11 = 0; i11 < t11.size(); i11++) {
            if (TextUtils.equals(charSequence, t11.get(i11).c())) {
                return t11.get(i11).b();
            }
        }
        int i12 = -1;
        int i13 = 0;
        while (true) {
            int[] iArr = f4472k;
            if (i13 >= iArr.length || i12 != -1) {
                break;
            }
            int i14 = iArr[i13];
            boolean z11 = true;
            for (int i15 = 0; i15 < t11.size(); i15++) {
                z11 &= t11.get(i15).b() != i14;
            }
            if (z11) {
                i12 = i14;
            }
            i13++;
        }
        return i12;
    }

    public static void u0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 29) {
            q.c(view, context, iArr, attributeSet, typedArray, i11, i12);
        }
    }

    public static ColorStateList v(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.g(view);
        }
        if (view instanceof y) {
            return ((y) view).getSupportBackgroundTintList();
        }
        return null;
    }

    private static f<Boolean> v0() {
        return new a(j3.c.O, Boolean.class, 28);
    }

    public static PorterDuff.Mode w(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.h(view);
        }
        if (view instanceof y) {
            return ((y) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static void w0(View view, androidx.core.view.a aVar) {
        if (aVar == null && (p(view) instanceof a.C0074a)) {
            aVar = new androidx.core.view.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.getBridge());
    }

    public static Rect x(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return j.a(view);
        }
        return null;
    }

    public static void x0(View view, boolean z11) {
        b().g(view, Boolean.valueOf(z11));
    }

    public static Display y(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.b(view);
        }
        if (Y(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static void y0(View view, int i11) {
        if (Build.VERSION.SDK_INT >= 19) {
            k.f(view, i11);
        }
    }

    public static float z(View view) {
        return Build.VERSION.SDK_INT >= 21 ? m.i(view) : BitmapDescriptorFactory.HUE_RED;
    }

    public static void z0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.q(view, drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }
}