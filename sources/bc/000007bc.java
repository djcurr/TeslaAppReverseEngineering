package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import w3.c;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    boolean f5289a;

    /* renamed from: b  reason: collision with root package name */
    int f5290b;

    /* renamed from: c  reason: collision with root package name */
    int[] f5291c;

    /* renamed from: d  reason: collision with root package name */
    View[] f5292d;

    /* renamed from: e  reason: collision with root package name */
    final SparseIntArray f5293e;

    /* renamed from: f  reason: collision with root package name */
    final SparseIntArray f5294f;

    /* renamed from: g  reason: collision with root package name */
    c f5295g;

    /* renamed from: h  reason: collision with root package name */
    final Rect f5296h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f5297i;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i11, int i12) {
            return i11 % i12;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i11) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final SparseIntArray f5300a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        final SparseIntArray f5301b = new SparseIntArray();

        /* renamed from: c  reason: collision with root package name */
        private boolean f5302c = false;

        /* renamed from: d  reason: collision with root package name */
        private boolean f5303d = false;

        static int a(SparseIntArray sparseIntArray, int i11) {
            int size = sparseIntArray.size() - 1;
            int i12 = 0;
            while (i12 <= size) {
                int i13 = (i12 + size) >>> 1;
                if (sparseIntArray.keyAt(i13) < i11) {
                    i12 = i13 + 1;
                } else {
                    size = i13 - 1;
                }
            }
            int i14 = i12 - 1;
            if (i14 < 0 || i14 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i14);
        }

        int b(int i11, int i12) {
            if (!this.f5303d) {
                return d(i11, i12);
            }
            int i13 = this.f5301b.get(i11, -1);
            if (i13 != -1) {
                return i13;
            }
            int d11 = d(i11, i12);
            this.f5301b.put(i11, d11);
            return d11;
        }

        int c(int i11, int i12) {
            if (!this.f5302c) {
                return e(i11, i12);
            }
            int i13 = this.f5300a.get(i11, -1);
            if (i13 != -1) {
                return i13;
            }
            int e11 = e(i11, i12);
            this.f5300a.put(i11, e11);
            return e11;
        }

        public int d(int i11, int i12) {
            int i13;
            int i14;
            int i15;
            int a11;
            if (!this.f5303d || (a11 = a(this.f5301b, i11)) == -1) {
                i13 = 0;
                i14 = 0;
                i15 = 0;
            } else {
                i13 = this.f5301b.get(a11);
                i14 = a11 + 1;
                i15 = c(a11, i12) + f(a11);
                if (i15 == i12) {
                    i13++;
                    i15 = 0;
                }
            }
            int f11 = f(i11);
            while (i14 < i11) {
                int f12 = f(i14);
                i15 += f12;
                if (i15 == i12) {
                    i13++;
                    i15 = 0;
                } else if (i15 > i12) {
                    i13++;
                    i15 = f12;
                }
                i14++;
            }
            return i15 + f11 > i12 ? i13 + 1 : i13;
        }

        public abstract int e(int i11, int i12);

        public abstract int f(int i11);

        public void g() {
            this.f5301b.clear();
        }

        public void h() {
            this.f5300a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f5289a = false;
        this.f5290b = -1;
        this.f5293e = new SparseIntArray();
        this.f5294f = new SparseIntArray();
        this.f5295g = new a();
        this.f5296h = new Rect();
        r(RecyclerView.p.getProperties(context, attributeSet, i11, i12).f5379b);
    }

    private void a(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i11, boolean z11) {
        int i12;
        int i13;
        int i14 = 0;
        int i15 = -1;
        if (z11) {
            i13 = 1;
            i15 = i11;
            i12 = 0;
        } else {
            i12 = i11 - 1;
            i13 = -1;
        }
        while (i12 != i15) {
            View view = this.f5292d[i12];
            b bVar = (b) view.getLayoutParams();
            int n11 = n(wVar, b0Var, getPosition(view));
            bVar.f5299f = n11;
            bVar.f5298e = i14;
            i14 += n11;
            i12 += i13;
        }
    }

    private void b() {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            b bVar = (b) getChildAt(i11).getLayoutParams();
            int a11 = bVar.a();
            this.f5293e.put(a11, bVar.f());
            this.f5294f.put(a11, bVar.e());
        }
    }

    private void c(int i11) {
        this.f5291c = d(this.f5291c, this.f5290b, i11);
    }

    static int[] d(int[] iArr, int i11, int i12) {
        int i13;
        if (iArr == null || iArr.length != i11 + 1 || iArr[iArr.length - 1] != i12) {
            iArr = new int[i11 + 1];
        }
        int i14 = 0;
        iArr[0] = 0;
        int i15 = i12 / i11;
        int i16 = i12 % i11;
        int i17 = 0;
        for (int i18 = 1; i18 <= i11; i18++) {
            i14 += i16;
            if (i14 <= 0 || i11 - i14 >= i16) {
                i13 = i15;
            } else {
                i13 = i15 + 1;
                i14 -= i11;
            }
            i17 += i13;
            iArr[i18] = i17;
        }
        return iArr;
    }

    private void e() {
        this.f5293e.clear();
        this.f5294f.clear();
    }

    private int f(RecyclerView.b0 b0Var) {
        int max;
        if (getChildCount() != 0 && b0Var.b() != 0) {
            ensureLayoutState();
            boolean isSmoothScrollbarEnabled = isSmoothScrollbarEnabled();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled, true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled, true);
            if (findFirstVisibleChildClosestToStart != null && findFirstVisibleChildClosestToEnd != null) {
                int b11 = this.f5295g.b(getPosition(findFirstVisibleChildClosestToStart), this.f5290b);
                int b12 = this.f5295g.b(getPosition(findFirstVisibleChildClosestToEnd), this.f5290b);
                int min = Math.min(b11, b12);
                int max2 = Math.max(b11, b12);
                int b13 = this.f5295g.b(b0Var.b() - 1, this.f5290b) + 1;
                if (this.mShouldReverseLayout) {
                    max = Math.max(0, (b13 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (isSmoothScrollbarEnabled) {
                    return Math.round((max * (Math.abs(this.mOrientationHelper.d(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.g(findFirstVisibleChildClosestToStart)) / ((this.f5295g.b(getPosition(findFirstVisibleChildClosestToEnd), this.f5290b) - this.f5295g.b(getPosition(findFirstVisibleChildClosestToStart), this.f5290b)) + 1))) + (this.mOrientationHelper.m() - this.mOrientationHelper.g(findFirstVisibleChildClosestToStart)));
                }
                return max;
            }
        }
        return 0;
    }

    private int g(RecyclerView.b0 b0Var) {
        if (getChildCount() != 0 && b0Var.b() != 0) {
            ensureLayoutState();
            View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!isSmoothScrollbarEnabled(), true);
            View findFirstVisibleChildClosestToEnd = findFirstVisibleChildClosestToEnd(!isSmoothScrollbarEnabled(), true);
            if (findFirstVisibleChildClosestToStart != null && findFirstVisibleChildClosestToEnd != null) {
                if (!isSmoothScrollbarEnabled()) {
                    return this.f5295g.b(b0Var.b() - 1, this.f5290b) + 1;
                }
                int d11 = this.mOrientationHelper.d(findFirstVisibleChildClosestToEnd) - this.mOrientationHelper.g(findFirstVisibleChildClosestToStart);
                int b11 = this.f5295g.b(getPosition(findFirstVisibleChildClosestToStart), this.f5290b);
                return (int) ((d11 / ((this.f5295g.b(getPosition(findFirstVisibleChildClosestToEnd), this.f5290b) - b11) + 1)) * (this.f5295g.b(b0Var.b() - 1, this.f5290b) + 1));
            }
        }
        return 0;
    }

    private void h(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i11) {
        boolean z11 = i11 == 1;
        int m11 = m(wVar, b0Var, aVar.f5305b);
        if (z11) {
            while (m11 > 0) {
                int i12 = aVar.f5305b;
                if (i12 <= 0) {
                    return;
                }
                int i13 = i12 - 1;
                aVar.f5305b = i13;
                m11 = m(wVar, b0Var, i13);
            }
            return;
        }
        int b11 = b0Var.b() - 1;
        int i14 = aVar.f5305b;
        while (i14 < b11) {
            int i15 = i14 + 1;
            int m12 = m(wVar, b0Var, i15);
            if (m12 <= m11) {
                break;
            }
            i14 = i15;
            m11 = m12;
        }
        aVar.f5305b = i14;
    }

    private void i() {
        View[] viewArr = this.f5292d;
        if (viewArr == null || viewArr.length != this.f5290b) {
            this.f5292d = new View[this.f5290b];
        }
    }

    private int l(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i11) {
        if (!b0Var.e()) {
            return this.f5295g.b(i11, this.f5290b);
        }
        int f11 = wVar.f(i11);
        if (f11 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i11);
            return 0;
        }
        return this.f5295g.b(f11, this.f5290b);
    }

    private int m(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i11) {
        if (!b0Var.e()) {
            return this.f5295g.c(i11, this.f5290b);
        }
        int i12 = this.f5294f.get(i11, -1);
        if (i12 != -1) {
            return i12;
        }
        int f11 = wVar.f(i11);
        if (f11 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i11);
            return 0;
        }
        return this.f5295g.c(f11, this.f5290b);
    }

    private int n(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i11) {
        if (!b0Var.e()) {
            return this.f5295g.f(i11);
        }
        int i12 = this.f5293e.get(i11, -1);
        if (i12 != -1) {
            return i12;
        }
        int f11 = wVar.f(i11);
        if (f11 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i11);
            return 1;
        }
        return this.f5295g.f(f11);
    }

    private void o(float f11, int i11) {
        c(Math.max(Math.round(f11 * this.f5290b), i11));
    }

    private void p(View view, int i11, boolean z11) {
        int i12;
        int i13;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f5383b;
        int i14 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i15 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int j11 = j(bVar.f5298e, bVar.f5299f);
        if (this.mOrientation == 1) {
            i13 = RecyclerView.p.getChildMeasureSpec(j11, i11, i15, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i12 = RecyclerView.p.getChildMeasureSpec(this.mOrientationHelper.n(), getHeightMode(), i14, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int childMeasureSpec = RecyclerView.p.getChildMeasureSpec(j11, i11, i14, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int childMeasureSpec2 = RecyclerView.p.getChildMeasureSpec(this.mOrientationHelper.n(), getWidthMode(), i15, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i12 = childMeasureSpec;
            i13 = childMeasureSpec2;
        }
        q(view, i13, i12, z11);
    }

    private void q(View view, int i11, int i12, boolean z11) {
        boolean shouldMeasureChild;
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z11) {
            shouldMeasureChild = shouldReMeasureChild(view, i11, i12, qVar);
        } else {
            shouldMeasureChild = shouldMeasureChild(view, i11, i12, qVar);
        }
        if (shouldMeasureChild) {
            view.measure(i11, i12);
        }
    }

    private void s() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        c(height - paddingTop);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean checkLayoutParams(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void collectPrefetchPositionsForLayoutState(RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int i11 = this.f5290b;
        for (int i12 = 0; i12 < this.f5290b && cVar.c(b0Var) && i11 > 0; i12++) {
            int i13 = cVar.f5316d;
            cVar2.a(i13, Math.max(0, cVar.f5319g));
            i11 -= this.f5295g.f(i13);
            cVar.f5316d += cVar.f5317e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollOffset(RecyclerView.b0 b0Var) {
        if (this.f5297i) {
            return f(b0Var);
        }
        return super.computeHorizontalScrollOffset(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollRange(RecyclerView.b0 b0Var) {
        if (this.f5297i) {
            return g(b0Var);
        }
        return super.computeHorizontalScrollRange(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollOffset(RecyclerView.b0 b0Var) {
        if (this.f5297i) {
            return f(b0Var);
        }
        return super.computeVerticalScrollOffset(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollRange(RecyclerView.b0 b0Var) {
        if (this.f5297i) {
            return g(b0Var);
        }
        return super.computeVerticalScrollRange(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View findReferenceChild(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z11, boolean z12) {
        int i11;
        int childCount = getChildCount();
        int i12 = -1;
        int i13 = 1;
        if (z12) {
            i11 = getChildCount() - 1;
            i13 = -1;
        } else {
            i12 = childCount;
            i11 = 0;
        }
        int b11 = b0Var.b();
        ensureLayoutState();
        int m11 = this.mOrientationHelper.m();
        int i14 = this.mOrientationHelper.i();
        View view = null;
        View view2 = null;
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            int position = getPosition(childAt);
            if (position >= 0 && position < b11 && m(wVar, b0Var, position) == 0) {
                if (((RecyclerView.q) childAt.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.g(childAt) < i14 && this.mOrientationHelper.d(childAt) >= m11) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i11 += i13;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int getColumnCountForAccessibility(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.mOrientation == 1) {
            return this.f5290b;
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return l(wVar, b0Var, b0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int getRowCountForAccessibility(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.mOrientation == 0) {
            return this.f5290b;
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return l(wVar, b0Var, b0Var.b() - 1) + 1;
    }

    int j(int i11, int i12) {
        if (this.mOrientation == 1 && isLayoutRTL()) {
            int[] iArr = this.f5291c;
            int i13 = this.f5290b;
            return iArr[i13 - i11] - iArr[(i13 - i11) - i12];
        }
        int[] iArr2 = this.f5291c;
        return iArr2[i12 + i11] - iArr2[i11];
    }

    public int k() {
        return this.f5290b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        r21.f5310b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void layoutChunk(androidx.recyclerview.widget.RecyclerView.w r18, androidx.recyclerview.widget.RecyclerView.b0 r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.layoutChunk(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void onAnchorReady(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i11) {
        super.onAnchorReady(wVar, b0Var, aVar, i11);
        s();
        if (b0Var.b() > 0 && !b0Var.e()) {
            h(wVar, b0Var, aVar, i11);
        }
        i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
        if (r13 == (r2 > r7)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.b0 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view, w3.c cVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, cVar);
            return;
        }
        b bVar = (b) layoutParams;
        int l11 = l(wVar, b0Var, bVar.a());
        if (this.mOrientation == 0) {
            cVar.f0(c.C1263c.b(bVar.e(), bVar.f(), l11, 1, false, false));
        } else {
            cVar.f0(c.C1263c.b(l11, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsAdded(RecyclerView recyclerView, int i11, int i12) {
        this.f5295g.h();
        this.f5295g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f5295g.h();
        this.f5295g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsMoved(RecyclerView recyclerView, int i11, int i12, int i13) {
        this.f5295g.h();
        this.f5295g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsRemoved(RecyclerView recyclerView, int i11, int i12) {
        this.f5295g.h();
        this.f5295g.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsUpdated(RecyclerView recyclerView, int i11, int i12, Object obj) {
        this.f5295g.h();
        this.f5295g.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (b0Var.e()) {
            b();
        }
        super.onLayoutChildren(wVar, b0Var);
        e();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(RecyclerView.b0 b0Var) {
        super.onLayoutCompleted(b0Var);
        this.f5289a = false;
    }

    public void r(int i11) {
        if (i11 == this.f5290b) {
            return;
        }
        this.f5289a = true;
        if (i11 >= 1) {
            this.f5290b = i11;
            this.f5295g.h();
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int scrollHorizontallyBy(int i11, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        s();
        i();
        return super.scrollHorizontallyBy(i11, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int scrollVerticallyBy(int i11, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        s();
        i();
        return super.scrollVerticallyBy(i11, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void setMeasuredDimension(Rect rect, int i11, int i12) {
        int chooseSize;
        int chooseSize2;
        if (this.f5291c == null) {
            super.setMeasuredDimension(rect, i11, i12);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            chooseSize2 = RecyclerView.p.chooseSize(i12, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.f5291c;
            chooseSize = RecyclerView.p.chooseSize(i11, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.p.chooseSize(i11, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.f5291c;
            chooseSize2 = RecyclerView.p.chooseSize(i12, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void setStackFromEnd(boolean z11) {
        if (!z11) {
            super.setStackFromEnd(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.f5289a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.q {

        /* renamed from: e  reason: collision with root package name */
        int f5298e;

        /* renamed from: f  reason: collision with root package name */
        int f5299f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5298e = -1;
            this.f5299f = 0;
        }

        public int e() {
            return this.f5298e;
        }

        public int f() {
            return this.f5299f;
        }

        public b(int i11, int i12) {
            super(i11, i12);
            this.f5298e = -1;
            this.f5299f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5298e = -1;
            this.f5299f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5298e = -1;
            this.f5299f = 0;
        }
    }

    public GridLayoutManager(Context context, int i11) {
        super(context);
        this.f5289a = false;
        this.f5290b = -1;
        this.f5293e = new SparseIntArray();
        this.f5294f = new SparseIntArray();
        this.f5295g = new a();
        this.f5296h = new Rect();
        r(i11);
    }

    public GridLayoutManager(Context context, int i11, int i12, boolean z11) {
        super(context, i12, z11);
        this.f5289a = false;
        this.f5290b = -1;
        this.f5293e = new SparseIntArray();
        this.f5294f = new SparseIntArray();
        this.f5295g = new a();
        this.f5296h = new Rect();
        r(i11);
    }
}