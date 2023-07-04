package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements l.j, RecyclerView.a0.b {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final b mLayoutChunkResult;
    private c mLayoutState;
    int mOrientation;
    t mOrientationHelper;
    d mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        t f5304a;

        /* renamed from: b */
        int f5305b;

        /* renamed from: c */
        int f5306c;

        /* renamed from: d */
        boolean f5307d;

        /* renamed from: e */
        boolean f5308e;

        a() {
            e();
        }

        void a() {
            int m11;
            if (this.f5307d) {
                m11 = this.f5304a.i();
            } else {
                m11 = this.f5304a.m();
            }
            this.f5306c = m11;
        }

        public void b(View view, int i11) {
            if (this.f5307d) {
                this.f5306c = this.f5304a.d(view) + this.f5304a.o();
            } else {
                this.f5306c = this.f5304a.g(view);
            }
            this.f5305b = i11;
        }

        public void c(View view, int i11) {
            int o11 = this.f5304a.o();
            if (o11 >= 0) {
                b(view, i11);
                return;
            }
            this.f5305b = i11;
            if (this.f5307d) {
                int i12 = (this.f5304a.i() - o11) - this.f5304a.d(view);
                this.f5306c = this.f5304a.i() - i12;
                if (i12 > 0) {
                    int e11 = this.f5306c - this.f5304a.e(view);
                    int m11 = this.f5304a.m();
                    int min = e11 - (m11 + Math.min(this.f5304a.g(view) - m11, 0));
                    if (min < 0) {
                        this.f5306c += Math.min(i12, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g11 = this.f5304a.g(view);
            int m12 = g11 - this.f5304a.m();
            this.f5306c = g11;
            if (m12 > 0) {
                int i13 = (this.f5304a.i() - Math.min(0, (this.f5304a.i() - o11) - this.f5304a.d(view))) - (g11 + this.f5304a.e(view));
                if (i13 < 0) {
                    this.f5306c -= Math.min(m12, -i13);
                }
            }
        }

        boolean d(View view, RecyclerView.b0 b0Var) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < b0Var.b();
        }

        void e() {
            this.f5305b = -1;
            this.f5306c = Integer.MIN_VALUE;
            this.f5307d = false;
            this.f5308e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f5305b + ", mCoordinate=" + this.f5306c + ", mLayoutFromEnd=" + this.f5307d + ", mValid=" + this.f5308e + CoreConstants.CURLY_RIGHT;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public int f5309a;

        /* renamed from: b */
        public boolean f5310b;

        /* renamed from: c */
        public boolean f5311c;

        /* renamed from: d */
        public boolean f5312d;

        protected b() {
        }

        void a() {
            this.f5309a = 0;
            this.f5310b = false;
            this.f5311c = false;
            this.f5312d = false;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: b */
        int f5314b;

        /* renamed from: c */
        int f5315c;

        /* renamed from: d */
        int f5316d;

        /* renamed from: e */
        int f5317e;

        /* renamed from: f */
        int f5318f;

        /* renamed from: g */
        int f5319g;

        /* renamed from: j */
        boolean f5322j;

        /* renamed from: k */
        int f5323k;

        /* renamed from: m */
        boolean f5325m;

        /* renamed from: a */
        boolean f5313a = true;

        /* renamed from: h */
        int f5320h = 0;

        /* renamed from: i */
        int f5321i = 0;

        /* renamed from: l */
        List<RecyclerView.e0> f5324l = null;

        c() {
        }

        private View e() {
            int size = this.f5324l.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = this.f5324l.get(i11).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f5316d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f11 = f(view);
            if (f11 == null) {
                this.f5316d = -1;
            } else {
                this.f5316d = ((RecyclerView.q) f11.getLayoutParams()).a();
            }
        }

        public boolean c(RecyclerView.b0 b0Var) {
            int i11 = this.f5316d;
            return i11 >= 0 && i11 < b0Var.b();
        }

        public View d(RecyclerView.w wVar) {
            if (this.f5324l != null) {
                return e();
            }
            View o11 = wVar.o(this.f5316d);
            this.f5316d += this.f5317e;
            return o11;
        }

        public View f(View view) {
            int a11;
            int size = this.f5324l.size();
            View view2 = null;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < size; i12++) {
                View view3 = this.f5324l.get(i12).itemView;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (a11 = (qVar.a() - this.f5316d) * this.f5317e) >= 0 && a11 < i11) {
                    view2 = view3;
                    if (a11 == 0) {
                        break;
                    }
                    i11 = a11;
                }
            }
            return view2;
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a */
        int f5326a;

        /* renamed from: b */
        int f5327b;

        /* renamed from: c */
        boolean f5328c;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public d[] newArray(int i11) {
                return new d[i11];
            }
        }

        public d() {
        }

        boolean a() {
            return this.f5326a >= 0;
        }

        void b() {
            this.f5326a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f5326a);
            parcel.writeInt(this.f5327b);
            parcel.writeInt(this.f5328c ? 1 : 0);
        }

        d(Parcel parcel) {
            this.f5326a = parcel.readInt();
            this.f5327b = parcel.readInt();
            this.f5328c = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f5326a = dVar.f5326a;
            this.f5327b = dVar.f5327b;
            this.f5328c = dVar.f5328c;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private int computeScrollExtent(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return w.a(b0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return w.b(b0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.b0 b0Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return w.c(b0Var, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild() : findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild() : findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private int fixLayoutEndGap(int i11, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z11) {
        int i12;
        int i13 = this.mOrientationHelper.i() - i11;
        if (i13 > 0) {
            int i14 = -scrollBy(-i13, wVar, b0Var);
            int i15 = i11 + i14;
            if (!z11 || (i12 = this.mOrientationHelper.i() - i15) <= 0) {
                return i14;
            }
            this.mOrientationHelper.r(i12);
            return i12 + i14;
        }
        return 0;
    }

    private int fixLayoutStartGap(int i11, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z11) {
        int m11;
        int m12 = i11 - this.mOrientationHelper.m();
        if (m12 > 0) {
            int i12 = -scrollBy(m12, wVar, b0Var);
            int i13 = i11 + i12;
            if (!z11 || (m11 = i13 - this.mOrientationHelper.m()) <= 0) {
                return i12;
            }
            this.mOrientationHelper.r(-m11);
            return i12 - m11;
        }
        return 0;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i11, int i12) {
        if (!b0Var.g() || getChildCount() == 0 || b0Var.e() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.e0> k11 = wVar.k();
        int size = k11.size();
        int position = getPosition(getChildAt(0));
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            RecyclerView.e0 e0Var = k11.get(i15);
            if (!e0Var.isRemoved()) {
                if ((e0Var.getLayoutPosition() < position) != this.mShouldReverseLayout ? true : true) {
                    i13 += this.mOrientationHelper.e(e0Var.itemView);
                } else {
                    i14 += this.mOrientationHelper.e(e0Var.itemView);
                }
            }
        }
        this.mLayoutState.f5324l = k11;
        if (i13 > 0) {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i11);
            c cVar = this.mLayoutState;
            cVar.f5320h = i13;
            cVar.f5315c = 0;
            cVar.a();
            fill(wVar, this.mLayoutState, b0Var, false);
        }
        if (i14 > 0) {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i12);
            c cVar2 = this.mLayoutState;
            cVar2.f5320h = i14;
            cVar2.f5315c = 0;
            cVar2.a();
            fill(wVar, this.mLayoutState, b0Var, false);
        }
        this.mLayoutState.f5324l = null;
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.g(childAt));
        }
        Log.d(TAG, "==============");
    }

    private void recycleByLayoutState(RecyclerView.w wVar, c cVar) {
        if (!cVar.f5313a || cVar.f5325m) {
            return;
        }
        int i11 = cVar.f5319g;
        int i12 = cVar.f5321i;
        if (cVar.f5318f == -1) {
            recycleViewsFromEnd(wVar, i11, i12);
        } else {
            recycleViewsFromStart(wVar, i11, i12);
        }
    }

    private void recycleChildren(RecyclerView.w wVar, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        if (i12 <= i11) {
            while (i11 > i12) {
                removeAndRecycleViewAt(i11, wVar);
                i11--;
            }
            return;
        }
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            removeAndRecycleViewAt(i13, wVar);
        }
    }

    private void recycleViewsFromEnd(RecyclerView.w wVar, int i11, int i12) {
        int childCount = getChildCount();
        if (i11 < 0) {
            return;
        }
        int h11 = (this.mOrientationHelper.h() - i11) + i12;
        if (this.mShouldReverseLayout) {
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (this.mOrientationHelper.g(childAt) < h11 || this.mOrientationHelper.q(childAt) < h11) {
                    recycleChildren(wVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = childCount - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View childAt2 = getChildAt(i15);
            if (this.mOrientationHelper.g(childAt2) < h11 || this.mOrientationHelper.q(childAt2) < h11) {
                recycleChildren(wVar, i14, i15);
                return;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.w wVar, int i11, int i12) {
        if (i11 < 0) {
            return;
        }
        int i13 = i11 - i12;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (this.mOrientationHelper.d(childAt) > i13 || this.mOrientationHelper.p(childAt) > i13) {
                    recycleChildren(wVar, 0, i14);
                    return;
                }
            }
            return;
        }
        int i15 = childCount - 1;
        for (int i16 = i15; i16 >= 0; i16--) {
            View childAt2 = getChildAt(i16);
            if (this.mOrientationHelper.d(childAt2) > i13 || this.mOrientationHelper.p(childAt2) > i13) {
                recycleChildren(wVar, i15, i16);
                return;
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation != 1 && isLayoutRTL()) {
            this.mShouldReverseLayout = !this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = this.mReverseLayout;
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        View findReferenceChild;
        boolean z11 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && aVar.d(focusedChild, b0Var)) {
            aVar.c(focusedChild, getPosition(focusedChild));
            return true;
        }
        boolean z12 = this.mLastStackFromEnd;
        boolean z13 = this.mStackFromEnd;
        if (z12 == z13 && (findReferenceChild = findReferenceChild(wVar, b0Var, aVar.f5307d, z13)) != null) {
            aVar.b(findReferenceChild, getPosition(findReferenceChild));
            if (!b0Var.e() && supportsPredictiveItemAnimations()) {
                int g11 = this.mOrientationHelper.g(findReferenceChild);
                int d11 = this.mOrientationHelper.d(findReferenceChild);
                int m11 = this.mOrientationHelper.m();
                int i11 = this.mOrientationHelper.i();
                boolean z14 = d11 <= m11 && g11 < m11;
                if (g11 >= i11 && d11 > i11) {
                    z11 = true;
                }
                if (z14 || z11) {
                    if (aVar.f5307d) {
                        m11 = i11;
                    }
                    aVar.f5306c = m11;
                }
            }
            return true;
        }
        return false;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.b0 b0Var, a aVar) {
        int i11;
        int g11;
        if (!b0Var.e() && (i11 = this.mPendingScrollPosition) != -1) {
            if (i11 >= 0 && i11 < b0Var.b()) {
                aVar.f5305b = this.mPendingScrollPosition;
                d dVar = this.mPendingSavedState;
                if (dVar != null && dVar.a()) {
                    boolean z11 = this.mPendingSavedState.f5328c;
                    aVar.f5307d = z11;
                    if (z11) {
                        aVar.f5306c = this.mOrientationHelper.i() - this.mPendingSavedState.f5327b;
                    } else {
                        aVar.f5306c = this.mOrientationHelper.m() + this.mPendingSavedState.f5327b;
                    }
                    return true;
                } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                    if (findViewByPosition != null) {
                        if (this.mOrientationHelper.e(findViewByPosition) > this.mOrientationHelper.n()) {
                            aVar.a();
                            return true;
                        } else if (this.mOrientationHelper.g(findViewByPosition) - this.mOrientationHelper.m() < 0) {
                            aVar.f5306c = this.mOrientationHelper.m();
                            aVar.f5307d = false;
                            return true;
                        } else if (this.mOrientationHelper.i() - this.mOrientationHelper.d(findViewByPosition) < 0) {
                            aVar.f5306c = this.mOrientationHelper.i();
                            aVar.f5307d = true;
                            return true;
                        } else {
                            if (aVar.f5307d) {
                                g11 = this.mOrientationHelper.d(findViewByPosition) + this.mOrientationHelper.o();
                            } else {
                                g11 = this.mOrientationHelper.g(findViewByPosition);
                            }
                            aVar.f5306c = g11;
                        }
                    } else {
                        if (getChildCount() > 0) {
                            aVar.f5307d = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                        }
                        aVar.a();
                    }
                    return true;
                } else {
                    boolean z12 = this.mShouldReverseLayout;
                    aVar.f5307d = z12;
                    if (z12) {
                        aVar.f5306c = this.mOrientationHelper.i() - this.mPendingScrollPositionOffset;
                    } else {
                        aVar.f5306c = this.mOrientationHelper.m() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        if (updateAnchorFromPendingData(b0Var, aVar) || updateAnchorFromChildren(wVar, b0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.f5305b = this.mStackFromEnd ? b0Var.b() - 1 : 0;
    }

    private void updateLayoutState(int i11, int i12, boolean z11, RecyclerView.b0 b0Var) {
        int m11;
        this.mLayoutState.f5325m = resolveIsInfinite();
        this.mLayoutState.f5318f = i11;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(b0Var, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z12 = i11 == 1;
        c cVar = this.mLayoutState;
        int i13 = z12 ? max2 : max;
        cVar.f5320h = i13;
        if (!z12) {
            max = max2;
        }
        cVar.f5321i = max;
        if (z12) {
            cVar.f5320h = i13 + this.mOrientationHelper.j();
            View childClosestToEnd = getChildClosestToEnd();
            c cVar2 = this.mLayoutState;
            cVar2.f5317e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            c cVar3 = this.mLayoutState;
            cVar2.f5316d = position + cVar3.f5317e;
            cVar3.f5314b = this.mOrientationHelper.d(childClosestToEnd);
            m11 = this.mOrientationHelper.d(childClosestToEnd) - this.mOrientationHelper.i();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.f5320h += this.mOrientationHelper.m();
            c cVar4 = this.mLayoutState;
            cVar4.f5317e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            c cVar5 = this.mLayoutState;
            cVar4.f5316d = position2 + cVar5.f5317e;
            cVar5.f5314b = this.mOrientationHelper.g(childClosestToStart);
            m11 = (-this.mOrientationHelper.g(childClosestToStart)) + this.mOrientationHelper.m();
        }
        c cVar6 = this.mLayoutState;
        cVar6.f5315c = i12;
        if (z11) {
            cVar6.f5315c = i12 - m11;
        }
        cVar6.f5319g = m11;
    }

    private void updateLayoutStateToFillEnd(a aVar) {
        updateLayoutStateToFillEnd(aVar.f5305b, aVar.f5306c);
    }

    private void updateLayoutStateToFillStart(a aVar) {
        updateLayoutStateToFillStart(aVar.f5305b, aVar.f5306c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(RecyclerView.b0 b0Var, int[] iArr) {
        int i11;
        int extraLayoutSpace = getExtraLayoutSpace(b0Var);
        if (this.mLayoutState.f5318f == -1) {
            i11 = 0;
        } else {
            i11 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void collectAdjacentPrefetchPositions(int i11, int i12, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        if (this.mOrientation != 0) {
            i11 = i12;
        }
        if (getChildCount() == 0 || i11 == 0) {
            return;
        }
        ensureLayoutState();
        updateLayoutState(i11 > 0 ? 1 : -1, Math.abs(i11), true, b0Var);
        collectPrefetchPositionsForLayoutState(b0Var, this.mLayoutState, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void collectInitialPrefetchPositions(int i11, RecyclerView.p.c cVar) {
        boolean z11;
        int i12;
        d dVar = this.mPendingSavedState;
        if (dVar != null && dVar.a()) {
            d dVar2 = this.mPendingSavedState;
            z11 = dVar2.f5328c;
            i12 = dVar2.f5326a;
        } else {
            resolveShouldLayoutReverse();
            z11 = this.mShouldReverseLayout;
            i12 = this.mPendingScrollPosition;
            if (i12 == -1) {
                i12 = z11 ? i11 - 1 : 0;
            }
        }
        int i13 = z11 ? -1 : 1;
        for (int i14 = 0; i14 < this.mInitialPrefetchItemCount && i12 >= 0 && i12 < i11; i14++) {
            cVar.a(i12, 0);
            i12 += i13;
        }
    }

    void collectPrefetchPositionsForLayoutState(RecyclerView.b0 b0Var, c cVar, RecyclerView.p.c cVar2) {
        int i11 = cVar.f5316d;
        if (i11 < 0 || i11 >= b0Var.b()) {
            return;
        }
        cVar2.a(i11, Math.max(0, cVar.f5319g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollExtent(RecyclerView.b0 b0Var) {
        return computeScrollExtent(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollOffset(RecyclerView.b0 b0Var) {
        return computeScrollOffset(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollRange(RecyclerView.b0 b0Var) {
        return computeScrollRange(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF computeScrollVectorForPosition(int i11) {
        if (getChildCount() == 0) {
            return null;
        }
        int i12 = (i11 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        if (this.mOrientation == 0) {
            return new PointF(i12, BitmapDescriptorFactory.HUE_RED);
        }
        return new PointF(BitmapDescriptorFactory.HUE_RED, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollExtent(RecyclerView.b0 b0Var) {
        return computeScrollExtent(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollOffset(RecyclerView.b0 b0Var) {
        return computeScrollOffset(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollRange(RecyclerView.b0 b0Var) {
        return computeScrollRange(b0Var);
    }

    public int convertFocusDirectionToLayoutDirection(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 17 ? i11 != 33 ? i11 != 66 ? (i11 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    c createLayoutState() {
        return new c();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    int fill(RecyclerView.w wVar, c cVar, RecyclerView.b0 b0Var, boolean z11) {
        int i11 = cVar.f5315c;
        int i12 = cVar.f5319g;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                cVar.f5319g = i12 + i11;
            }
            recycleByLayoutState(wVar, cVar);
        }
        int i13 = cVar.f5315c + cVar.f5320h;
        b bVar = this.mLayoutChunkResult;
        while (true) {
            if ((!cVar.f5325m && i13 <= 0) || !cVar.c(b0Var)) {
                break;
            }
            bVar.a();
            layoutChunk(wVar, b0Var, cVar, bVar);
            if (!bVar.f5310b) {
                cVar.f5314b += bVar.f5309a * cVar.f5318f;
                if (!bVar.f5311c || cVar.f5324l != null || !b0Var.e()) {
                    int i14 = cVar.f5315c;
                    int i15 = bVar.f5309a;
                    cVar.f5315c = i14 - i15;
                    i13 -= i15;
                }
                int i16 = cVar.f5319g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + bVar.f5309a;
                    cVar.f5319g = i17;
                    int i18 = cVar.f5315c;
                    if (i18 < 0) {
                        cVar.f5319g = i17 + i18;
                    }
                    recycleByLayoutState(wVar, cVar);
                }
                if (z11 && bVar.f5312d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - cVar.f5315c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z11, boolean z12) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z11, z12);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z11, z12);
    }

    public View findFirstVisibleChildClosestToStart(boolean z11, boolean z12) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z11, z12);
        }
        return findOneVisibleChild(0, getChildCount(), z11, z12);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    View findOnePartiallyOrCompletelyInvisibleChild(int i11, int i12) {
        int i13;
        int i14;
        ensureLayoutState();
        if ((i12 > i11 ? (char) 1 : i12 < i11 ? (char) 65535 : (char) 0) == 0) {
            return getChildAt(i11);
        }
        if (this.mOrientationHelper.g(getChildAt(i11)) < this.mOrientationHelper.m()) {
            i13 = 16644;
            i14 = 16388;
        } else {
            i13 = 4161;
            i14 = 4097;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.a(i11, i12, i13, i14);
        }
        return this.mVerticalBoundCheck.a(i11, i12, i13, i14);
    }

    View findOneVisibleChild(int i11, int i12, boolean z11, boolean z12) {
        ensureLayoutState();
        int i13 = z11 ? 24579 : 320;
        int i14 = z12 ? 320 : 0;
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.a(i11, i12, i13, i14);
        }
        return this.mVerticalBoundCheck.a(i11, i12, i13, i14);
    }

    View findReferenceChild(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z11, boolean z12) {
        int i11;
        int i12;
        ensureLayoutState();
        int childCount = getChildCount();
        int i13 = -1;
        if (z12) {
            i11 = getChildCount() - 1;
            i12 = -1;
        } else {
            i13 = childCount;
            i11 = 0;
            i12 = 1;
        }
        int b11 = b0Var.b();
        int m11 = this.mOrientationHelper.m();
        int i14 = this.mOrientationHelper.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i11 != i13) {
            View childAt = getChildAt(i11);
            int position = getPosition(childAt);
            int g11 = this.mOrientationHelper.g(childAt);
            int d11 = this.mOrientationHelper.d(childAt);
            if (position >= 0 && position < b11) {
                if (!((RecyclerView.q) childAt.getLayoutParams()).c()) {
                    boolean z13 = d11 <= m11 && g11 < m11;
                    boolean z14 = g11 >= i14 && d11 > i14;
                    if (!z13 && !z14) {
                        return childAt;
                    }
                    if (z11) {
                        if (!z14) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    } else {
                        if (!z13) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                        view2 = childAt;
                    }
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            i11 += i12;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View findViewByPosition(int i11) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i11 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i11) {
                return childAt;
            }
        }
        return super.findViewByPosition(i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        return new RecyclerView.q(-2, -2);
    }

    @Deprecated
    protected int getExtraLayoutSpace(RecyclerView.b0 b0Var) {
        if (b0Var.d()) {
            return this.mOrientationHelper.n();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    void layoutChunk(RecyclerView.w wVar, RecyclerView.b0 b0Var, c cVar, b bVar) {
        int i11;
        int i12;
        int i13;
        int i14;
        int f11;
        View d11 = cVar.d(wVar);
        if (d11 == null) {
            bVar.f5310b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) d11.getLayoutParams();
        if (cVar.f5324l == null) {
            if (this.mShouldReverseLayout == (cVar.f5318f == -1)) {
                addView(d11);
            } else {
                addView(d11, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (cVar.f5318f == -1)) {
                addDisappearingView(d11);
            } else {
                addDisappearingView(d11, 0);
            }
        }
        measureChildWithMargins(d11, 0, 0);
        bVar.f5309a = this.mOrientationHelper.e(d11);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                f11 = getWidth() - getPaddingRight();
                i14 = f11 - this.mOrientationHelper.f(d11);
            } else {
                i14 = getPaddingLeft();
                f11 = this.mOrientationHelper.f(d11) + i14;
            }
            if (cVar.f5318f == -1) {
                int i15 = cVar.f5314b;
                i13 = i15;
                i12 = f11;
                i11 = i15 - bVar.f5309a;
            } else {
                int i16 = cVar.f5314b;
                i11 = i16;
                i12 = f11;
                i13 = bVar.f5309a + i16;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f12 = this.mOrientationHelper.f(d11) + paddingTop;
            if (cVar.f5318f == -1) {
                int i17 = cVar.f5314b;
                i12 = i17;
                i11 = paddingTop;
                i13 = f12;
                i14 = i17 - bVar.f5309a;
            } else {
                int i18 = cVar.f5314b;
                i11 = paddingTop;
                i12 = bVar.f5309a + i18;
                i13 = f12;
                i14 = i18;
            }
        }
        layoutDecoratedWithMargins(d11, i14, i11, i12, i13);
        if (qVar.c() || qVar.b()) {
            bVar.f5311c = true;
        }
        bVar.f5312d = d11.hasFocusable();
    }

    public void onAnchorReady(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar, int i11) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.onDetachedFromWindow(recyclerView, wVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(wVar);
            wVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View onFocusSearchFailed(View view, int i11, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int convertFocusDirectionToLayoutDirection;
        View findPartiallyOrCompletelyInvisibleChildClosestToEnd;
        View childClosestToEnd;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i11)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.n() * MAX_SCROLL_FACTOR), false, b0Var);
        c cVar = this.mLayoutState;
        cVar.f5319g = Integer.MIN_VALUE;
        cVar.f5313a = false;
        fill(wVar, cVar, b0Var, true);
        if (convertFocusDirectionToLayoutDirection == -1) {
            findPartiallyOrCompletelyInvisibleChildClosestToEnd = findPartiallyOrCompletelyInvisibleChildClosestToStart();
        } else {
            findPartiallyOrCompletelyInvisibleChildClosestToEnd = findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            childClosestToEnd = getChildClosestToStart();
        } else {
            childClosestToEnd = getChildClosestToEnd();
        }
        if (childClosestToEnd.hasFocusable()) {
            if (findPartiallyOrCompletelyInvisibleChildClosestToEnd == null) {
                return null;
            }
            return childClosestToEnd;
        }
        return findPartiallyOrCompletelyInvisibleChildClosestToEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int i11;
        int i12;
        int i13;
        int i14;
        int fixLayoutEndGap;
        int i15;
        View findViewByPosition;
        int g11;
        int i16;
        int i17 = -1;
        if ((this.mPendingSavedState != null || this.mPendingScrollPosition != -1) && b0Var.b() == 0) {
            removeAndRecycleAllViews(wVar);
            return;
        }
        d dVar = this.mPendingSavedState;
        if (dVar != null && dVar.a()) {
            this.mPendingScrollPosition = this.mPendingSavedState.f5326a;
        }
        ensureLayoutState();
        this.mLayoutState.f5313a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        a aVar = this.mAnchorInfo;
        if (aVar.f5308e && this.mPendingScrollPosition == -1 && this.mPendingSavedState == null) {
            if (focusedChild != null && (this.mOrientationHelper.g(focusedChild) >= this.mOrientationHelper.i() || this.mOrientationHelper.d(focusedChild) <= this.mOrientationHelper.m())) {
                this.mAnchorInfo.c(focusedChild, getPosition(focusedChild));
            }
        } else {
            aVar.e();
            a aVar2 = this.mAnchorInfo;
            aVar2.f5307d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(wVar, b0Var, aVar2);
            this.mAnchorInfo.f5308e = true;
        }
        c cVar = this.mLayoutState;
        cVar.f5318f = cVar.f5323k >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(b0Var, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.m();
        int max2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.j();
        if (b0Var.e() && (i15 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (findViewByPosition = findViewByPosition(i15)) != null) {
            if (this.mShouldReverseLayout) {
                i16 = this.mOrientationHelper.i() - this.mOrientationHelper.d(findViewByPosition);
                g11 = this.mPendingScrollPositionOffset;
            } else {
                g11 = this.mOrientationHelper.g(findViewByPosition) - this.mOrientationHelper.m();
                i16 = this.mPendingScrollPositionOffset;
            }
            int i18 = i16 - g11;
            if (i18 > 0) {
                max += i18;
            } else {
                max2 -= i18;
            }
        }
        a aVar3 = this.mAnchorInfo;
        if (!aVar3.f5307d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i17 = 1;
        }
        onAnchorReady(wVar, b0Var, aVar3, i17);
        detachAndScrapAttachedViews(wVar);
        this.mLayoutState.f5325m = resolveIsInfinite();
        this.mLayoutState.f5322j = b0Var.e();
        this.mLayoutState.f5321i = 0;
        a aVar4 = this.mAnchorInfo;
        if (aVar4.f5307d) {
            updateLayoutStateToFillStart(aVar4);
            c cVar2 = this.mLayoutState;
            cVar2.f5320h = max;
            fill(wVar, cVar2, b0Var, false);
            c cVar3 = this.mLayoutState;
            i12 = cVar3.f5314b;
            int i19 = cVar3.f5316d;
            int i21 = cVar3.f5315c;
            if (i21 > 0) {
                max2 += i21;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            c cVar4 = this.mLayoutState;
            cVar4.f5320h = max2;
            cVar4.f5316d += cVar4.f5317e;
            fill(wVar, cVar4, b0Var, false);
            c cVar5 = this.mLayoutState;
            i11 = cVar5.f5314b;
            int i22 = cVar5.f5315c;
            if (i22 > 0) {
                updateLayoutStateToFillStart(i19, i12);
                c cVar6 = this.mLayoutState;
                cVar6.f5320h = i22;
                fill(wVar, cVar6, b0Var, false);
                i12 = this.mLayoutState.f5314b;
            }
        } else {
            updateLayoutStateToFillEnd(aVar4);
            c cVar7 = this.mLayoutState;
            cVar7.f5320h = max2;
            fill(wVar, cVar7, b0Var, false);
            c cVar8 = this.mLayoutState;
            i11 = cVar8.f5314b;
            int i23 = cVar8.f5316d;
            int i24 = cVar8.f5315c;
            if (i24 > 0) {
                max += i24;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            c cVar9 = this.mLayoutState;
            cVar9.f5320h = max;
            cVar9.f5316d += cVar9.f5317e;
            fill(wVar, cVar9, b0Var, false);
            c cVar10 = this.mLayoutState;
            i12 = cVar10.f5314b;
            int i25 = cVar10.f5315c;
            if (i25 > 0) {
                updateLayoutStateToFillEnd(i23, i11);
                c cVar11 = this.mLayoutState;
                cVar11.f5320h = i25;
                fill(wVar, cVar11, b0Var, false);
                i11 = this.mLayoutState.f5314b;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap2 = fixLayoutEndGap(i11, wVar, b0Var, true);
                i13 = i12 + fixLayoutEndGap2;
                i14 = i11 + fixLayoutEndGap2;
                fixLayoutEndGap = fixLayoutStartGap(i13, wVar, b0Var, false);
            } else {
                int fixLayoutStartGap = fixLayoutStartGap(i12, wVar, b0Var, true);
                i13 = i12 + fixLayoutStartGap;
                i14 = i11 + fixLayoutStartGap;
                fixLayoutEndGap = fixLayoutEndGap(i14, wVar, b0Var, false);
            }
            i12 = i13 + fixLayoutEndGap;
            i11 = i14 + fixLayoutEndGap;
        }
        layoutForPredictiveAnimations(wVar, b0Var, i12, i11);
        if (!b0Var.e()) {
            this.mOrientationHelper.s();
        } else {
            this.mAnchorInfo.e();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(RecyclerView.b0 b0Var) {
        super.onLayoutCompleted(b0Var);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.mPendingSavedState = dVar;
            if (this.mPendingScrollPosition != -1) {
                dVar.b();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new d(this.mPendingSavedState);
        }
        d dVar = new d();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z11 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            dVar.f5328c = z11;
            if (z11) {
                View childClosestToEnd = getChildClosestToEnd();
                dVar.f5327b = this.mOrientationHelper.i() - this.mOrientationHelper.d(childClosestToEnd);
                dVar.f5326a = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                dVar.f5326a = getPosition(childClosestToStart);
                dVar.f5327b = this.mOrientationHelper.g(childClosestToStart) - this.mOrientationHelper.m();
            }
        } else {
            dVar.b();
        }
        return dVar;
    }

    @Override // androidx.recyclerview.widget.l.j
    public void prepareForDrop(View view, View view2, int i11, int i12) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        boolean z11 = position < position2 ? true : true;
        if (this.mShouldReverseLayout) {
            if (z11) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.i() - (this.mOrientationHelper.g(view2) + this.mOrientationHelper.e(view)));
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.i() - this.mOrientationHelper.d(view2));
            }
        } else if (z11) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.g(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.d(view2) - this.mOrientationHelper.e(view));
        }
    }

    boolean resolveIsInfinite() {
        return this.mOrientationHelper.k() == 0 && this.mOrientationHelper.h() == 0;
    }

    int scrollBy(int i11, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (getChildCount() == 0 || i11 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f5313a = true;
        int i12 = i11 > 0 ? 1 : -1;
        int abs = Math.abs(i11);
        updateLayoutState(i12, abs, true, b0Var);
        c cVar = this.mLayoutState;
        int fill = cVar.f5319g + fill(wVar, cVar, b0Var, false);
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i11 = i12 * fill;
        }
        this.mOrientationHelper.r(-i11);
        this.mLayoutState.f5323k = i11;
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollHorizontallyBy(int i11, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i11, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void scrollToPosition(int i11) {
        this.mPendingScrollPosition = i11;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        d dVar = this.mPendingSavedState;
        if (dVar != null) {
            dVar.b();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i11, int i12) {
        this.mPendingScrollPosition = i11;
        this.mPendingScrollPositionOffset = i12;
        d dVar = this.mPendingSavedState;
        if (dVar != null) {
            dVar.b();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollVerticallyBy(int i11, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i11, wVar, b0Var);
    }

    public void setInitialPrefetchItemCount(int i11) {
        this.mInitialPrefetchItemCount = i11;
    }

    public void setOrientation(int i11) {
        if (i11 != 0 && i11 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i11);
        }
        assertNotInLayoutOrScroll(null);
        if (i11 != this.mOrientation || this.mOrientationHelper == null) {
            t b11 = t.b(this, i11);
            this.mOrientationHelper = b11;
            this.mAnchorInfo.f5304a = b11;
            this.mOrientation = i11;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z11) {
        this.mRecycleChildrenOnDetach = z11;
    }

    public void setReverseLayout(boolean z11) {
        assertNotInLayoutOrScroll(null);
        if (z11 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z11;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z11) {
        this.mSmoothScrollbarEnabled = z11;
    }

    public void setStackFromEnd(boolean z11) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z11) {
            return;
        }
        this.mStackFromEnd = z11;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i11) {
        p pVar = new p(recyclerView.getContext());
        pVar.p(i11);
        startSmoothScroll(pVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int g11 = this.mOrientationHelper.g(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i11 = 1; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                int position2 = getPosition(childAt);
                int g12 = this.mOrientationHelper.g(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("detected invalid position. loc invalid? ");
                    sb2.append(g12 < g11);
                    throw new RuntimeException(sb2.toString());
                } else if (g12 > g11) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i12 = 1; i12 < getChildCount(); i12++) {
            View childAt2 = getChildAt(i12);
            int position3 = getPosition(childAt2);
            int g13 = this.mOrientationHelper.g(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("detected invalid position. loc invalid? ");
                sb3.append(g13 < g11);
                throw new RuntimeException(sb3.toString());
            } else if (g13 < g11) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(Context context, int i11, boolean z11) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i11);
        setReverseLayout(z11);
    }

    private void updateLayoutStateToFillEnd(int i11, int i12) {
        this.mLayoutState.f5315c = this.mOrientationHelper.i() - i12;
        c cVar = this.mLayoutState;
        cVar.f5317e = this.mShouldReverseLayout ? -1 : 1;
        cVar.f5316d = i11;
        cVar.f5318f = 1;
        cVar.f5314b = i12;
        cVar.f5319g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i11, int i12) {
        this.mLayoutState.f5315c = i12 - this.mOrientationHelper.m();
        c cVar = this.mLayoutState;
        cVar.f5316d = i11;
        cVar.f5317e = this.mShouldReverseLayout ? 1 : -1;
        cVar.f5318f = -1;
        cVar.f5314b = i12;
        cVar.f5319g = Integer.MIN_VALUE;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i11, int i12) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.p.d properties = RecyclerView.p.getProperties(context, attributeSet, i11, i12);
        setOrientation(properties.f5378a);
        setReverseLayout(properties.f5380c);
        setStackFromEnd(properties.f5381d);
    }
}