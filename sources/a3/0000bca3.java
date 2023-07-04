package wg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import androidx.core.view.a0;
import androidx.recyclerview.widget.l;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.d;
import com.facebook.react.uimanager.p;
import com.facebook.react.uimanager.t0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static String f55847a = wg.d.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f55848b = false;

    /* renamed from: c  reason: collision with root package name */
    private static final Set<g> f55849c = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: d  reason: collision with root package name */
    private static int f55850d = l.f.DEFAULT_SWIPE_ANIMATION_DURATION;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f55851e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f55852a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f55853b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f55854c;

        a(int i11, int i12, int i13) {
            this.f55852a = i11;
            this.f55853b = i12;
            this.f55854c = i13;
        }

        @Override // com.facebook.react.uimanager.d.b
        public WritableMap a() {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("contentOffsetLeft", p.a(this.f55852a));
            writableNativeMap.putDouble("contentOffsetTop", p.a(this.f55853b));
            writableNativeMap.putDouble("scrollAwayPaddingTop", p.a(this.f55854c));
            return writableNativeMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f55855a;

        b(ViewGroup viewGroup) {
            this.f55855a = viewGroup;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ((d) this.f55855a).getReactScrollViewScrollState().j(true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ((d) this.f55855a).getReactScrollViewScrollState().k(true);
            f.q(this.f55855a);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C1269f reactScrollViewScrollState = ((d) this.f55855a).getReactScrollViewScrollState();
            reactScrollViewScrollState.j(false);
            reactScrollViewScrollState.k(false);
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(int i11, int i12);

        ValueAnimator getFlingAnimator();
    }

    /* loaded from: classes3.dex */
    public interface d {
        C1269f getReactScrollViewScrollState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class e extends OverScroller {

        /* renamed from: a  reason: collision with root package name */
        private int f55856a;

        e(Context context) {
            super(context);
            this.f55856a = l.f.DEFAULT_SWIPE_ANIMATION_DURATION;
        }

        public int a() {
            super.startScroll(0, 0, 0, 0);
            return this.f55856a;
        }

        @Override // android.widget.OverScroller
        public void startScroll(int i11, int i12, int i13, int i14, int i15) {
            this.f55856a = i15;
        }
    }

    /* renamed from: wg.f$f  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C1269f {

        /* renamed from: a  reason: collision with root package name */
        private final int f55857a;

        /* renamed from: b  reason: collision with root package name */
        private final Point f55858b = new Point();

        /* renamed from: c  reason: collision with root package name */
        private int f55859c = 0;

        /* renamed from: d  reason: collision with root package name */
        private final Point f55860d = new Point(-1, -1);

        /* renamed from: e  reason: collision with root package name */
        private boolean f55861e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f55862f = true;

        /* renamed from: g  reason: collision with root package name */
        private float f55863g = 0.985f;

        public C1269f(int i11) {
            this.f55857a = i11;
        }

        public float a() {
            return this.f55863g;
        }

        public Point b() {
            return this.f55858b;
        }

        public boolean c() {
            return this.f55861e;
        }

        public boolean d() {
            return this.f55862f;
        }

        public Point e() {
            return this.f55860d;
        }

        public int f() {
            return this.f55857a;
        }

        public int g() {
            return this.f55859c;
        }

        public C1269f h(float f11) {
            this.f55863g = f11;
            return this;
        }

        public C1269f i(int i11, int i12) {
            this.f55858b.set(i11, i12);
            return this;
        }

        public C1269f j(boolean z11) {
            this.f55861e = z11;
            return this;
        }

        public C1269f k(boolean z11) {
            this.f55862f = z11;
            return this;
        }

        public C1269f l(int i11, int i12) {
            this.f55860d.set(i11, i12);
            return this;
        }

        public C1269f m(int i11) {
            this.f55859c = i11;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public interface g {
        void a(ViewGroup viewGroup);

        void b(ViewGroup viewGroup, com.facebook.react.views.scroll.b bVar, float f11, float f12);
    }

    public static void a(ViewGroup viewGroup) {
        for (g gVar : f55849c) {
            gVar.a(viewGroup);
        }
    }

    public static void b(ViewGroup viewGroup) {
        e(viewGroup, com.facebook.react.views.scroll.b.BEGIN_DRAG);
    }

    public static void c(ViewGroup viewGroup, float f11, float f12) {
        f(viewGroup, com.facebook.react.views.scroll.b.END_DRAG, f11, f12);
    }

    public static void d(ViewGroup viewGroup, float f11, float f12) {
        f(viewGroup, com.facebook.react.views.scroll.b.SCROLL, f11, f12);
    }

    private static void e(ViewGroup viewGroup, com.facebook.react.views.scroll.b bVar) {
        f(viewGroup, bVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    private static void f(ViewGroup viewGroup, com.facebook.react.views.scroll.b bVar, float f11, float f12) {
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null) {
            return;
        }
        for (g gVar : f55849c) {
            gVar.b(viewGroup, bVar, f11, f12);
        }
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        int e11 = t0.e(reactContext);
        com.facebook.react.uimanager.events.d c11 = t0.c(reactContext, viewGroup.getId());
        if (c11 != null) {
            c11.g(wg.g.b(e11, viewGroup.getId(), bVar, viewGroup.getScrollX(), viewGroup.getScrollY(), f11, f12, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight()));
        }
    }

    public static void g(ViewGroup viewGroup, int i11, int i12) {
        f(viewGroup, com.facebook.react.views.scroll.b.MOMENTUM_BEGIN, i11, i12);
    }

    public static void h(ViewGroup viewGroup) {
        e(viewGroup, com.facebook.react.views.scroll.b.MOMENTUM_END);
    }

    public static <T extends ViewGroup & d.a & d & c> void i(T t11) {
        int i11;
        C1269f reactScrollViewScrollState = t11.getReactScrollViewScrollState();
        int g11 = reactScrollViewScrollState.g();
        Point e11 = reactScrollViewScrollState.e();
        int i12 = e11.x;
        int i13 = e11.y;
        if (reactScrollViewScrollState.f() == 1) {
            View childAt = t11.getChildAt(0);
            i11 = -(((childAt != null ? childAt.getWidth() : 0) - i12) - t11.getWidth());
        } else {
            i11 = i12;
        }
        if (f55848b) {
            nd.a.s(f55847a, "updateFabricScrollState[%d] scrollX %d scrollY %d fabricScrollX", Integer.valueOf(t11.getId()), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i11));
        }
        t11.getFabricViewStateManager().c(new a(i12, i13, g11));
    }

    public static int j(Context context) {
        if (!f55851e) {
            f55851e = true;
            try {
                f55850d = new e(context).a();
            } catch (Throwable unused) {
            }
        }
        return f55850d;
    }

    public static <T extends ViewGroup & d.a & d & c> int k(T t11, int i11, int i12, int i13) {
        C1269f reactScrollViewScrollState = t11.getReactScrollViewScrollState();
        return (!reactScrollViewScrollState.d() || (reactScrollViewScrollState.c() && ((i13 != 0 ? i13 / Math.abs(i13) : 0) * (i12 - i11) > 0))) ? i12 : i11;
    }

    public static int l(String str) {
        if (str == null || str.equals("auto")) {
            return 1;
        }
        if (str.equals(PermissionsResponse.SCOPE_ALWAYS)) {
            return 0;
        }
        if (str.equals(PermissionsResponse.PERMISSION_EXPIRES_NEVER)) {
            return 2;
        }
        throw new JSApplicationIllegalArgumentException("wrong overScrollMode: " + str);
    }

    public static int m(String str) {
        if (str == null) {
            return 0;
        }
        if ("start".equalsIgnoreCase(str)) {
            return 1;
        }
        if ("center".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("end".equals(str)) {
            return 3;
        }
        throw new JSApplicationIllegalArgumentException("wrong snap alignment value: " + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends ViewGroup & d.a & d & c> Point n(T t11, int i11, int i12, int i13, int i14) {
        C1269f reactScrollViewScrollState = t11.getReactScrollViewScrollState();
        OverScroller overScroller = new OverScroller(t11.getContext());
        overScroller.setFriction(1.0f - reactScrollViewScrollState.a());
        int width = (t11.getWidth() - a0.K(t11)) - a0.J(t11);
        int height = (t11.getHeight() - t11.getPaddingBottom()) - t11.getPaddingTop();
        Point b11 = reactScrollViewScrollState.b();
        overScroller.fling(k(t11, t11.getScrollX(), b11.x, i11), k(t11, t11.getScrollY(), b11.y, i12), i11, i12, 0, i13, 0, i14, width / 2, height / 2);
        return new Point(overScroller.getFinalX(), overScroller.getFinalY());
    }

    public static <T extends ViewGroup & d.a & d & c> void o(T t11) {
        t11.getFlingAnimator().addListener(new b(t11));
    }

    public static <T extends ViewGroup & d.a & d & c> void p(T t11, int i11, int i12) {
        if (f55848b) {
            nd.a.r(f55847a, "smoothScrollTo[%d] x %d y %d", Integer.valueOf(t11.getId()), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        ValueAnimator flingAnimator = t11.getFlingAnimator();
        if (flingAnimator.getListeners() == null || flingAnimator.getListeners().size() == 0) {
            o(t11);
        }
        t11.getReactScrollViewScrollState().i(i11, i12);
        int scrollX = t11.getScrollX();
        int scrollY = t11.getScrollY();
        if (scrollX != i11) {
            t11.a(scrollX, i11);
        }
        if (scrollY != i12) {
            t11.a(scrollY, i12);
        }
        r(t11, i11, i12);
    }

    public static <T extends ViewGroup & d.a & d & c> boolean q(T t11) {
        return r(t11, t11.getScrollX(), t11.getScrollY());
    }

    public static <T extends ViewGroup & d.a & d & c> boolean r(T t11, int i11, int i12) {
        if (f55848b) {
            nd.a.r(f55847a, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(t11.getId()), Integer.valueOf(i11), Integer.valueOf(i12));
        }
        if (og.a.a(t11.getId()) == 1) {
            return false;
        }
        C1269f reactScrollViewScrollState = t11.getReactScrollViewScrollState();
        if (reactScrollViewScrollState.e().equals(i11, i12)) {
            return false;
        }
        reactScrollViewScrollState.l(i11, i12);
        i(t11);
        return true;
    }

    public static <T extends ViewGroup & d.a & d & c> void s(T t11, float f11, float f12) {
        q(t11);
        d(t11, f11, f12);
    }
}