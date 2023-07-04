package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.a0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import w3.c;
import w3.f;

/* loaded from: classes.dex */
public final class f extends ViewGroup {

    /* renamed from: y  reason: collision with root package name */
    static boolean f6418y = true;

    /* renamed from: a  reason: collision with root package name */
    private final Rect f6419a;

    /* renamed from: b  reason: collision with root package name */
    private final Rect f6420b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.viewpager2.widget.b f6421c;

    /* renamed from: d  reason: collision with root package name */
    int f6422d;

    /* renamed from: e  reason: collision with root package name */
    boolean f6423e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView.j f6424f;

    /* renamed from: g  reason: collision with root package name */
    private LinearLayoutManager f6425g;

    /* renamed from: h  reason: collision with root package name */
    private int f6426h;

    /* renamed from: i  reason: collision with root package name */
    private Parcelable f6427i;

    /* renamed from: j  reason: collision with root package name */
    RecyclerView f6428j;

    /* renamed from: k  reason: collision with root package name */
    private u f6429k;

    /* renamed from: l  reason: collision with root package name */
    androidx.viewpager2.widget.e f6430l;

    /* renamed from: m  reason: collision with root package name */
    private androidx.viewpager2.widget.b f6431m;

    /* renamed from: n  reason: collision with root package name */
    private androidx.viewpager2.widget.c f6432n;

    /* renamed from: o  reason: collision with root package name */
    private androidx.viewpager2.widget.d f6433o;

    /* renamed from: p  reason: collision with root package name */
    private RecyclerView.m f6434p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6435q;

    /* renamed from: t  reason: collision with root package name */
    private boolean f6436t;

    /* renamed from: w  reason: collision with root package name */
    private int f6437w;

    /* renamed from: x  reason: collision with root package name */
    e f6438x;

    /* loaded from: classes.dex */
    class a extends g {
        a() {
            super(null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            f fVar = f.this;
            fVar.f6423e = true;
            fVar.f6430l.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends i {
        b() {
        }

        @Override // androidx.viewpager2.widget.f.i
        public void a(int i11) {
            if (i11 == 0) {
                f.this.n();
            }
        }

        @Override // androidx.viewpager2.widget.f.i
        public void c(int i11) {
            f fVar = f.this;
            if (fVar.f6422d != i11) {
                fVar.f6422d = i11;
                fVar.f6438x.q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends i {
        c() {
        }

        @Override // androidx.viewpager2.widget.f.i
        public void c(int i11) {
            f.this.clearFocus();
            if (f.this.hasFocus()) {
                f.this.f6428j.requestFocus(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements RecyclerView.r {
        d(f fVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void b(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void d(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) qVar).width != -1 || ((ViewGroup.MarginLayoutParams) qVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class e {
        private e(f fVar) {
        }

        boolean a() {
            return false;
        }

        boolean b(int i11) {
            return false;
        }

        boolean c(int i11, Bundle bundle) {
            return false;
        }

        boolean d() {
            return false;
        }

        void e(RecyclerView.h<?> hVar) {
        }

        void f(RecyclerView.h<?> hVar) {
        }

        String g() {
            throw new IllegalStateException("Not implemented.");
        }

        void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
        }

        void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void j(w3.c cVar) {
        }

        boolean k(int i11) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean l(int i11, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        void m() {
        }

        CharSequence n() {
            throw new IllegalStateException("Not implemented.");
        }

        void o(AccessibilityEvent accessibilityEvent) {
        }

        void p() {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }

        /* synthetic */ e(f fVar, a aVar) {
            this(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.viewpager2.widget.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0113f extends e {
        C0113f() {
            super(f.this, null);
        }

        @Override // androidx.viewpager2.widget.f.e
        public boolean b(int i11) {
            return (i11 == 8192 || i11 == 4096) && !f.this.e();
        }

        @Override // androidx.viewpager2.widget.f.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.f.e
        public void j(w3.c cVar) {
            if (f.this.e()) {
                return;
            }
            cVar.U(c.a.f55458l);
            cVar.U(c.a.f55457k);
            cVar.D0(false);
        }

        @Override // androidx.viewpager2.widget.f.e
        public boolean k(int i11) {
            if (b(i11)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.f.e
        public CharSequence n() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes.dex */
    private static abstract class g extends RecyclerView.j {
        private g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i11, int i12) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i11, int i12, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i11, int i12) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i11, int i12, int i13) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void f(int i11, int i12) {
            a();
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(RecyclerView.b0 b0Var, int[] iArr) {
            int offscreenPageLimit = f.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(b0Var, iArr);
                return;
            }
            int pageSize = f.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void onInitializeAccessibilityNodeInfo(RecyclerView.w wVar, RecyclerView.b0 b0Var, w3.c cVar) {
            super.onInitializeAccessibilityNodeInfo(wVar, b0Var, cVar);
            f.this.f6438x.j(cVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean performAccessibilityAction(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i11, Bundle bundle) {
            if (f.this.f6438x.b(i11)) {
                return f.this.f6438x.k(i11);
            }
            return super.performAccessibilityAction(wVar, b0Var, i11, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z11, boolean z12) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {
        public void a(int i11) {
        }

        public void b(int i11, float f11, int i12) {
        }

        public void c(int i11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j extends e {

        /* renamed from: a  reason: collision with root package name */
        private final w3.f f6444a;

        /* renamed from: b  reason: collision with root package name */
        private final w3.f f6445b;

        /* renamed from: c  reason: collision with root package name */
        private RecyclerView.j f6446c;

        /* loaded from: classes.dex */
        class a implements w3.f {
            a() {
            }

            @Override // w3.f
            public boolean a(View view, f.a aVar) {
                j.this.v(((f) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        class b implements w3.f {
            b() {
            }

            @Override // w3.f
            public boolean a(View view, f.a aVar) {
                j.this.v(((f) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* loaded from: classes.dex */
        class c extends g {
            c() {
                super(null);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                j.this.w();
            }
        }

        j() {
            super(f.this, null);
            this.f6444a = new a();
            this.f6445b = new b();
        }

        private void t(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i11;
            int i12;
            if (f.this.getAdapter() == null) {
                i11 = 0;
                i12 = 0;
            } else if (f.this.getOrientation() == 1) {
                i11 = f.this.getAdapter().getItemCount();
                i12 = 0;
            } else {
                i12 = f.this.getAdapter().getItemCount();
                i11 = 0;
            }
            w3.c.P0(accessibilityNodeInfo).e0(c.b.a(i11, i12, false, 0));
        }

        private void u(AccessibilityNodeInfo accessibilityNodeInfo) {
            int itemCount;
            RecyclerView.h adapter = f.this.getAdapter();
            if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !f.this.e()) {
                return;
            }
            if (f.this.f6422d > 0) {
                accessibilityNodeInfo.addAction(PKIFailureInfo.certRevoked);
            }
            if (f.this.f6422d < itemCount - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }

        @Override // androidx.viewpager2.widget.f.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.f.e
        public boolean c(int i11, Bundle bundle) {
            return i11 == 8192 || i11 == 4096;
        }

        @Override // androidx.viewpager2.widget.f.e
        public void e(RecyclerView.h<?> hVar) {
            w();
            if (hVar != null) {
                hVar.registerAdapterDataObserver(this.f6446c);
            }
        }

        @Override // androidx.viewpager2.widget.f.e
        public void f(RecyclerView.h<?> hVar) {
            if (hVar != null) {
                hVar.unregisterAdapterDataObserver(this.f6446c);
            }
        }

        @Override // androidx.viewpager2.widget.f.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.f.e
        public void h(androidx.viewpager2.widget.b bVar, RecyclerView recyclerView) {
            a0.G0(recyclerView, 2);
            this.f6446c = new c();
            if (a0.D(f.this) == 0) {
                a0.G0(f.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.f.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            t(accessibilityNodeInfo);
            if (Build.VERSION.SDK_INT >= 16) {
                u(accessibilityNodeInfo);
            }
        }

        @Override // androidx.viewpager2.widget.f.e
        public boolean l(int i11, Bundle bundle) {
            int currentItem;
            if (c(i11, bundle)) {
                if (i11 == 8192) {
                    currentItem = f.this.getCurrentItem() - 1;
                } else {
                    currentItem = f.this.getCurrentItem() + 1;
                }
                v(currentItem);
                return true;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.f.e
        public void m() {
            w();
        }

        @Override // androidx.viewpager2.widget.f.e
        public void o(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(f.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.f.e
        public void p() {
            w();
        }

        @Override // androidx.viewpager2.widget.f.e
        public void q() {
            w();
        }

        @Override // androidx.viewpager2.widget.f.e
        public void r() {
            w();
        }

        @Override // androidx.viewpager2.widget.f.e
        public void s() {
            w();
            if (Build.VERSION.SDK_INT < 21) {
                f.this.sendAccessibilityEvent(2048);
            }
        }

        void v(int i11) {
            if (f.this.e()) {
                f.this.k(i11, true);
            }
        }

        void w() {
            int itemCount;
            f fVar = f.this;
            a0.q0(fVar, 16908360);
            a0.q0(fVar, 16908361);
            a0.q0(fVar, 16908358);
            a0.q0(fVar, 16908359);
            if (f.this.getAdapter() == null || (itemCount = f.this.getAdapter().getItemCount()) == 0 || !f.this.e()) {
                return;
            }
            if (f.this.getOrientation() == 0) {
                boolean d11 = f.this.d();
                int i11 = d11 ? 16908360 : 16908361;
                int i12 = d11 ? 16908361 : 16908360;
                if (f.this.f6422d < itemCount - 1) {
                    a0.s0(fVar, new c.a(i11, null), null, this.f6444a);
                }
                if (f.this.f6422d > 0) {
                    a0.s0(fVar, new c.a(i12, null), null, this.f6445b);
                    return;
                }
                return;
            }
            if (f.this.f6422d < itemCount - 1) {
                a0.s0(fVar, new c.a(16908359, null), null, this.f6444a);
            }
            if (f.this.f6422d > 0) {
                a0.s0(fVar, new c.a(16908358, null), null, this.f6445b);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(View view, float f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class l extends u {
        l() {
        }

        @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.y
        public View f(RecyclerView.p pVar) {
            if (f.this.c()) {
                return null;
            }
            return super.f(pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class m extends RecyclerView {
        m(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            if (f.this.f6438x.d()) {
                return f.this.f6438x.n();
            }
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(f.this.f6422d);
            accessibilityEvent.setToIndex(f.this.f6422d);
            f.this.f6438x.o(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return f.this.e() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return f.this.e() && super.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final int f6456a;

        /* renamed from: b  reason: collision with root package name */
        private final RecyclerView f6457b;

        o(int i11, RecyclerView recyclerView) {
            this.f6456a = i11;
            this.f6457b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6457b.smoothScrollToPosition(this.f6456a);
        }
    }

    public f(Context context) {
        super(context);
        this.f6419a = new Rect();
        this.f6420b = new Rect();
        this.f6421c = new androidx.viewpager2.widget.b(3);
        this.f6423e = false;
        this.f6424f = new a();
        this.f6426h = -1;
        this.f6434p = null;
        this.f6435q = false;
        this.f6436t = true;
        this.f6437w = -1;
        b(context, null);
    }

    private RecyclerView.r a() {
        return new d(this);
    }

    private void b(Context context, AttributeSet attributeSet) {
        this.f6438x = f6418y ? new j() : new C0113f();
        m mVar = new m(context);
        this.f6428j = mVar;
        mVar.setId(a0.n());
        this.f6428j.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f6425g = hVar;
        this.f6428j.setLayoutManager(hVar);
        this.f6428j.setScrollingTouchSlop(1);
        l(context, attributeSet);
        this.f6428j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f6428j.addOnChildAttachStateChangeListener(a());
        androidx.viewpager2.widget.e eVar = new androidx.viewpager2.widget.e(this);
        this.f6430l = eVar;
        this.f6432n = new androidx.viewpager2.widget.c(this, eVar, this.f6428j);
        l lVar = new l();
        this.f6429k = lVar;
        lVar.b(this.f6428j);
        this.f6428j.addOnScrollListener(this.f6430l);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.f6431m = bVar;
        this.f6430l.m(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f6431m.d(bVar2);
        this.f6431m.d(cVar);
        this.f6438x.h(this.f6431m, this.f6428j);
        this.f6431m.d(this.f6421c);
        androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d(this.f6425g);
        this.f6433o = dVar;
        this.f6431m.d(dVar);
        RecyclerView recyclerView = this.f6428j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void f(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f6424f);
        }
    }

    private void i() {
        RecyclerView.h adapter;
        if (this.f6426h == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f6427i;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.a) {
                ((androidx.viewpager2.adapter.a) adapter).b(parcelable);
            }
            this.f6427i = null;
        }
        int max = Math.max(0, Math.min(this.f6426h, adapter.getItemCount() - 1));
        this.f6422d = max;
        this.f6426h = -1;
        this.f6428j.scrollToPosition(max);
        this.f6438x.m();
    }

    private void l(Context context, AttributeSet attributeSet) {
        int[] iArr = c5.a.f8876a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(c5.a.f8877b, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void m(RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.unregisterAdapterDataObserver(this.f6424f);
        }
    }

    public boolean c() {
        return this.f6432n.a();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i11) {
        return this.f6428j.canScrollHorizontally(i11);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i11) {
        return this.f6428j.canScrollVertically(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f6425g.getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof n) {
            int i11 = ((n) parcelable).f6453a;
            sparseArray.put(this.f6428j.getId(), sparseArray.get(i11));
            sparseArray.remove(i11);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        i();
    }

    public boolean e() {
        return this.f6436t;
    }

    public void g(i iVar) {
        this.f6421c.d(iVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (this.f6438x.a()) {
            return this.f6438x.g();
        }
        return super.getAccessibilityClassName();
    }

    public RecyclerView.h getAdapter() {
        return this.f6428j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f6422d;
    }

    public int getItemDecorationCount() {
        return this.f6428j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f6437w;
    }

    public int getOrientation() {
        return this.f6425g.getOrientation();
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f6428j;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f6430l.f();
    }

    public void h() {
        if (this.f6433o.d() == null) {
            return;
        }
        double e11 = this.f6430l.e();
        int i11 = (int) e11;
        float f11 = (float) (e11 - i11);
        this.f6433o.b(i11, f11, Math.round(getPageSize() * f11));
    }

    public void j(int i11, boolean z11) {
        if (!c()) {
            k(i11, z11);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    void k(int i11, boolean z11) {
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f6426h != -1) {
                this.f6426h = Math.max(i11, 0);
            }
        } else if (adapter.getItemCount() <= 0) {
        } else {
            int min = Math.min(Math.max(i11, 0), adapter.getItemCount() - 1);
            if (min == this.f6422d && this.f6430l.h()) {
                return;
            }
            int i12 = this.f6422d;
            if (min == i12 && z11) {
                return;
            }
            double d11 = i12;
            this.f6422d = min;
            this.f6438x.q();
            if (!this.f6430l.h()) {
                d11 = this.f6430l.e();
            }
            this.f6430l.k(min, z11);
            if (!z11) {
                this.f6428j.scrollToPosition(min);
                return;
            }
            double d12 = min;
            if (Math.abs(d12 - d11) > 3.0d) {
                this.f6428j.scrollToPosition(d12 > d11 ? min - 3 : min + 3);
                RecyclerView recyclerView = this.f6428j;
                recyclerView.post(new o(min, recyclerView));
                return;
            }
            this.f6428j.smoothScrollToPosition(min);
        }
    }

    void n() {
        u uVar = this.f6429k;
        if (uVar != null) {
            View f11 = uVar.f(this.f6425g);
            if (f11 == null) {
                return;
            }
            int position = this.f6425g.getPosition(f11);
            if (position != this.f6422d && getScrollState() == 0) {
                this.f6431m.c(position);
            }
            this.f6423e = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f6438x.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredWidth = this.f6428j.getMeasuredWidth();
        int measuredHeight = this.f6428j.getMeasuredHeight();
        this.f6419a.left = getPaddingLeft();
        this.f6419a.right = (i13 - i11) - getPaddingRight();
        this.f6419a.top = getPaddingTop();
        this.f6419a.bottom = (i14 - i12) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f6419a, this.f6420b);
        RecyclerView recyclerView = this.f6428j;
        Rect rect = this.f6420b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f6423e) {
            n();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        measureChild(this.f6428j, i11, i12);
        int measuredWidth = this.f6428j.getMeasuredWidth();
        int measuredHeight = this.f6428j.getMeasuredHeight();
        int measuredState = this.f6428j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i11, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i12, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n nVar = (n) parcelable;
        super.onRestoreInstanceState(nVar.getSuperState());
        this.f6426h = nVar.f6454b;
        this.f6427i = nVar.f6455c;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        n nVar = new n(super.onSaveInstanceState());
        nVar.f6453a = this.f6428j.getId();
        int i11 = this.f6426h;
        if (i11 == -1) {
            i11 = this.f6422d;
        }
        nVar.f6454b = i11;
        Parcelable parcelable = this.f6427i;
        if (parcelable != null) {
            nVar.f6455c = parcelable;
        } else {
            RecyclerView.h adapter = this.f6428j.getAdapter();
            if (adapter instanceof androidx.viewpager2.adapter.a) {
                nVar.f6455c = ((androidx.viewpager2.adapter.a) adapter).a();
            }
        }
        return nVar;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(f.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i11, Bundle bundle) {
        if (this.f6438x.c(i11, bundle)) {
            return this.f6438x.l(i11, bundle);
        }
        return super.performAccessibilityAction(i11, bundle);
    }

    public void setAdapter(RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f6428j.getAdapter();
        this.f6438x.f(adapter);
        m(adapter);
        this.f6428j.setAdapter(hVar);
        this.f6422d = 0;
        i();
        this.f6438x.e(hVar);
        f(hVar);
    }

    public void setCurrentItem(int i11) {
        j(i11, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i11) {
        super.setLayoutDirection(i11);
        this.f6438x.p();
    }

    public void setOffscreenPageLimit(int i11) {
        if (i11 < 1 && i11 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f6437w = i11;
        this.f6428j.requestLayout();
    }

    public void setOrientation(int i11) {
        this.f6425g.setOrientation(i11);
        this.f6438x.r();
    }

    public void setPageTransformer(k kVar) {
        if (kVar != null) {
            if (!this.f6435q) {
                this.f6434p = this.f6428j.getItemAnimator();
                this.f6435q = true;
            }
            this.f6428j.setItemAnimator(null);
        } else if (this.f6435q) {
            this.f6428j.setItemAnimator(this.f6434p);
            this.f6434p = null;
            this.f6435q = false;
        }
        if (kVar == this.f6433o.d()) {
            return;
        }
        this.f6433o.e(kVar);
        h();
    }

    public void setUserInputEnabled(boolean z11) {
        this.f6436t = z11;
        this.f6438x.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class n extends View.BaseSavedState {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        int f6453a;

        /* renamed from: b  reason: collision with root package name */
        int f6454b;

        /* renamed from: c  reason: collision with root package name */
        Parcelable f6455c;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<n> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public n createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new n(parcel, classLoader) : new n(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public n[] newArray(int i11) {
                return new n[i11];
            }
        }

        n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f6453a = parcel.readInt();
            this.f6454b = parcel.readInt();
            this.f6455c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f6453a);
            parcel.writeInt(this.f6454b);
            parcel.writeParcelable(this.f6455c, i11);
        }

        n(Parcel parcel) {
            super(parcel);
            a(parcel, null);
        }

        n(Parcelable parcelable) {
            super(parcelable);
        }
    }
}