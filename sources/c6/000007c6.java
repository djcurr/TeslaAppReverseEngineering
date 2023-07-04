package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.f;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.z;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import w3.c;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, androidx.core.view.o {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    static final boolean ALLOW_THREAD_GAP_WORK;
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator;
    androidx.recyclerview.widget.v mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    h mAdapter;
    androidx.recyclerview.widget.a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private k mChildDrawingOrderCallback;
    androidx.recyclerview.widget.f mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private l mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.k mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private t mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    m mItemAnimator;
    private m.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<o> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    p mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final y mObserver;
    private List<r> mOnChildAttachStateListeners;
    private s mOnFlingListener;
    private final ArrayList<t> mOnItemTouchListeners;
    final List<e0> mPendingAccessibilityImportanceChange;
    z mPendingSavedState;
    boolean mPostedAnimatorRunner;
    k.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final w mRecycler;
    x mRecyclerListener;
    final List<x> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private u mScrollListener;
    private List<u> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private androidx.core.view.p mScrollingChildHelper;
    final b0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final d0 mViewFlinger;
    private final a0.b mViewInfoProcessCallback;
    final androidx.recyclerview.widget.a0 mViewInfoStore;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            RecyclerView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a0 {

        /* renamed from: b */
        private RecyclerView f5331b;

        /* renamed from: c */
        private p f5332c;

        /* renamed from: d */
        private boolean f5333d;

        /* renamed from: e */
        private boolean f5334e;

        /* renamed from: f */
        private View f5335f;

        /* renamed from: h */
        private boolean f5337h;

        /* renamed from: a */
        private int f5330a = -1;

        /* renamed from: g */
        private final a f5336g = new a(0, 0);

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            private int f5338a;

            /* renamed from: b */
            private int f5339b;

            /* renamed from: c */
            private int f5340c;

            /* renamed from: d */
            private int f5341d;

            /* renamed from: e */
            private Interpolator f5342e;

            /* renamed from: f */
            private boolean f5343f;

            /* renamed from: g */
            private int f5344g;

            public a(int i11, int i12) {
                this(i11, i12, Integer.MIN_VALUE, null);
            }

            private void e() {
                if (this.f5342e != null && this.f5340c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f5340c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f5341d >= 0;
            }

            public void b(int i11) {
                this.f5341d = i11;
            }

            void c(RecyclerView recyclerView) {
                int i11 = this.f5341d;
                if (i11 >= 0) {
                    this.f5341d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i11);
                    this.f5343f = false;
                } else if (this.f5343f) {
                    e();
                    recyclerView.mViewFlinger.e(this.f5338a, this.f5339b, this.f5340c, this.f5342e);
                    int i12 = this.f5344g + 1;
                    this.f5344g = i12;
                    if (i12 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f5343f = false;
                } else {
                    this.f5344g = 0;
                }
            }

            public void d(int i11, int i12, int i13, Interpolator interpolator) {
                this.f5338a = i11;
                this.f5339b = i12;
                this.f5340c = i13;
                this.f5342e = interpolator;
                this.f5343f = true;
            }

            public a(int i11, int i12, int i13, Interpolator interpolator) {
                this.f5341d = -1;
                this.f5343f = false;
                this.f5344g = 0;
                this.f5338a = i11;
                this.f5339b = i12;
                this.f5340c = i13;
                this.f5342e = interpolator;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF computeScrollVectorForPosition(int i11);
        }

        public PointF a(int i11) {
            p e11 = e();
            if (e11 instanceof b) {
                return ((b) e11).computeScrollVectorForPosition(i11);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i11) {
            return this.f5331b.mLayout.findViewByPosition(i11);
        }

        public int c() {
            return this.f5331b.mLayout.getChildCount();
        }

        public int d(View view) {
            return this.f5331b.getChildLayoutPosition(view);
        }

        public p e() {
            return this.f5332c;
        }

        public int f() {
            return this.f5330a;
        }

        public boolean g() {
            return this.f5333d;
        }

        public boolean h() {
            return this.f5334e;
        }

        public void i(PointF pointF) {
            float f11 = pointF.x;
            float f12 = pointF.y;
            float sqrt = (float) Math.sqrt((f11 * f11) + (f12 * f12));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        void j(int i11, int i12) {
            PointF a11;
            RecyclerView recyclerView = this.f5331b;
            if (this.f5330a == -1 || recyclerView == null) {
                r();
            }
            if (this.f5333d && this.f5335f == null && this.f5332c != null && (a11 = a(this.f5330a)) != null) {
                float f11 = a11.x;
                if (f11 != BitmapDescriptorFactory.HUE_RED || a11.y != BitmapDescriptorFactory.HUE_RED) {
                    recyclerView.scrollStep((int) Math.signum(f11), (int) Math.signum(a11.y), null);
                }
            }
            this.f5333d = false;
            View view = this.f5335f;
            if (view != null) {
                if (d(view) == this.f5330a) {
                    o(this.f5335f, recyclerView.mState, this.f5336g);
                    this.f5336g.c(recyclerView);
                    r();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f5335f = null;
                }
            }
            if (this.f5334e) {
                l(i11, i12, recyclerView.mState, this.f5336g);
                boolean a12 = this.f5336g.a();
                this.f5336g.c(recyclerView);
                if (a12 && this.f5334e) {
                    this.f5333d = true;
                    recyclerView.mViewFlinger.d();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f5335f = view;
            }
        }

        protected abstract void l(int i11, int i12, b0 b0Var, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, b0 b0Var, a aVar);

        public void p(int i11) {
            this.f5330a = i11;
        }

        void q(RecyclerView recyclerView, p pVar) {
            recyclerView.mViewFlinger.stop();
            if (this.f5337h) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f5331b = recyclerView;
            this.f5332c = pVar;
            int i11 = this.f5330a;
            if (i11 != -1) {
                recyclerView.mState.f5346a = i11;
                this.f5334e = true;
                this.f5333d = true;
                this.f5335f = b(f());
                m();
                this.f5331b.mViewFlinger.d();
                this.f5337h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final void r() {
            if (this.f5334e) {
                this.f5334e = false;
                n();
                this.f5331b.mState.f5346a = -1;
                this.f5335f = null;
                this.f5330a = -1;
                this.f5333d = false;
                this.f5332c.onSmoothScrollerStopped(this);
                this.f5332c = null;
                this.f5331b = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            RecyclerView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.mItemAnimator;
            if (mVar != null) {
                mVar.runPendingAnimations();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* loaded from: classes.dex */
    public static class b0 {

        /* renamed from: b */
        private SparseArray<Object> f5347b;

        /* renamed from: m */
        int f5358m;

        /* renamed from: n */
        long f5359n;

        /* renamed from: o */
        int f5360o;

        /* renamed from: p */
        int f5361p;

        /* renamed from: a */
        int f5346a = -1;

        /* renamed from: c */
        int f5348c = 0;

        /* renamed from: d */
        int f5349d = 0;

        /* renamed from: e */
        int f5350e = 1;

        /* renamed from: f */
        int f5351f = 0;

        /* renamed from: g */
        boolean f5352g = false;

        /* renamed from: h */
        boolean f5353h = false;

        /* renamed from: i */
        boolean f5354i = false;

        /* renamed from: j */
        boolean f5355j = false;

        /* renamed from: k */
        boolean f5356k = false;

        /* renamed from: l */
        boolean f5357l = false;

        void a(int i11) {
            if ((this.f5350e & i11) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i11) + " but it is " + Integer.toBinaryString(this.f5350e));
        }

        public int b() {
            if (this.f5353h) {
                return this.f5348c - this.f5349d;
            }
            return this.f5351f;
        }

        public int c() {
            return this.f5346a;
        }

        public boolean d() {
            return this.f5346a != -1;
        }

        public boolean e() {
            return this.f5353h;
        }

        public void f(h hVar) {
            this.f5350e = 1;
            this.f5351f = hVar.getItemCount();
            this.f5353h = false;
            this.f5354i = false;
            this.f5355j = false;
        }

        public boolean g() {
            return this.f5357l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f5346a + ", mData=" + this.f5347b + ", mItemCount=" + this.f5351f + ", mIsMeasuring=" + this.f5355j + ", mPreviousLayoutItemCount=" + this.f5348c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f5349d + ", mStructureChanged=" + this.f5352g + ", mInPreLayout=" + this.f5353h + ", mRunSimpleAnimations=" + this.f5356k + ", mRunPredictiveAnimations=" + this.f5357l + CoreConstants.CURLY_RIGHT;
        }
    }

    /* loaded from: classes.dex */
    class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12 = f11 - 1.0f;
            return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c0 {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements a0.b {
        d() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.a0.b
        public void a(e0 e0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.animateAppearance(e0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.a0.b
        public void b(e0 e0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.removeAndRecycleView(e0Var.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.a0.b
        public void c(e0 e0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.mRecycler.J(e0Var);
            RecyclerView.this.animateDisappearance(e0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.a0.b
        public void d(e0 e0Var, m.c cVar, m.c cVar2) {
            e0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.animateChange(e0Var, e0Var, cVar, cVar2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.animatePersistence(e0Var, cVar, cVar2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d0 implements Runnable {

        /* renamed from: a */
        private int f5363a;

        /* renamed from: b */
        private int f5364b;

        /* renamed from: c */
        OverScroller f5365c;

        /* renamed from: d */
        Interpolator f5366d;

        /* renamed from: e */
        private boolean f5367e;

        /* renamed from: f */
        private boolean f5368f;

        d0() {
            RecyclerView.this = r3;
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f5366d = interpolator;
            this.f5367e = false;
            this.f5368f = false;
            this.f5365c = new OverScroller(r3.getContext(), interpolator);
        }

        private int a(int i11, int i12) {
            int abs = Math.abs(i11);
            int abs2 = Math.abs(i12);
            boolean z11 = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z11 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z11) {
                abs = abs2;
            }
            return Math.min((int) (((abs / width) + 1.0f) * 300.0f), (int) RecyclerView.MAX_SCROLL_DURATION);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            androidx.core.view.a0.o0(RecyclerView.this, this);
        }

        public void b(int i11, int i12) {
            RecyclerView.this.setScrollState(2);
            this.f5364b = 0;
            this.f5363a = 0;
            Interpolator interpolator = this.f5366d;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f5366d = interpolator2;
                this.f5365c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f5365c.fling(0, 0, i11, i12, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        void d() {
            if (this.f5367e) {
                this.f5368f = true;
            } else {
                c();
            }
        }

        public void e(int i11, int i12, int i13, Interpolator interpolator) {
            if (i13 == Integer.MIN_VALUE) {
                i13 = a(i11, i12);
            }
            int i14 = i13;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f5366d != interpolator) {
                this.f5366d = interpolator;
                this.f5365c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f5364b = 0;
            this.f5363a = 0;
            RecyclerView.this.setScrollState(2);
            this.f5365c.startScroll(0, 0, i11, i12, i14);
            if (Build.VERSION.SDK_INT < 23) {
                this.f5365c.computeScrollOffset();
            }
            d();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i11;
            int i12;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                stop();
                return;
            }
            this.f5368f = false;
            this.f5367e = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f5365c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i13 = currX - this.f5363a;
                int i14 = currY - this.f5364b;
                this.f5363a = currX;
                this.f5364b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i13, i14, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i13 -= iArr2[0];
                    i14 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i13, i14);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i13, i14, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i12 = iArr4[0];
                    i11 = iArr4[1];
                    i13 -= i12;
                    i14 -= i11;
                    a0 a0Var = recyclerView4.mLayout.mSmoothScroller;
                    if (a0Var != null && !a0Var.g() && a0Var.h()) {
                        int b11 = RecyclerView.this.mState.b();
                        if (b11 == 0) {
                            a0Var.r();
                        } else if (a0Var.f() >= b11) {
                            a0Var.p(b11 - 1);
                            a0Var.j(i12, i11);
                        } else {
                            a0Var.j(i12, i11);
                        }
                    }
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i12, i11, i13, i14, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i15 = i13 - iArr6[0];
                int i16 = i14 - iArr6[1];
                if (i12 != 0 || i11 != 0) {
                    recyclerView6.dispatchOnScrolled(i12, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z11 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i15 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i16 != 0));
                a0 a0Var2 = RecyclerView.this.mLayout.mSmoothScroller;
                if (!(a0Var2 != null && a0Var2.g()) && z11) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i17 = i15 < 0 ? -currVelocity : i15 > 0 ? currVelocity : 0;
                        if (i16 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i16 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i17, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.k kVar = recyclerView7.mGapWorker;
                    if (kVar != null) {
                        kVar.f(recyclerView7, i12, i11);
                    }
                }
            }
            a0 a0Var3 = RecyclerView.this.mLayout.mSmoothScroller;
            if (a0Var3 != null && a0Var3.g()) {
                a0Var3.j(0, 0);
            }
            this.f5367e = false;
            if (this.f5368f) {
                c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }

        public void stop() {
            RecyclerView.this.removeCallbacks(this);
            this.f5365c.abortAnimation();
        }
    }

    /* loaded from: classes.dex */
    public class e implements f.b {
        e() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.f.b
        public View a(int i11) {
            return RecyclerView.this.getChildAt(i11);
        }

        @Override // androidx.recyclerview.widget.f.b
        public int b() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.f.b
        public void c(View view) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f.b
        public e0 d(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void e(int i11) {
            e0 childViewHolderInt;
            View a11 = a(i11);
            if (a11 != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(a11)) != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.addFlags(256);
            }
            RecyclerView.this.detachViewFromParent(i11);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void f(View view, int i11) {
            RecyclerView.this.addView(view, i11);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void g() {
            int b11 = b();
            for (int i11 = 0; i11 < b11; i11++) {
                View a11 = a(i11);
                RecyclerView.this.dispatchChildDetached(a11);
                a11.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.f.b
        public int h(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void i(View view) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f.b
        public void j(int i11) {
            View childAt = RecyclerView.this.getChildAt(i11);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i11);
        }

        @Override // androidx.recyclerview.widget.f.b
        public void k(View view, int i11, ViewGroup.LayoutParams layoutParams) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.clearTmpDetachFlag();
            }
            RecyclerView.this.attachViewToParent(view, i11, layoutParams);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        h<? extends e0> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        e0 mShadowedHolder = null;
        e0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        w mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;
        int mPendingAccessibilityState = -1;

        public e0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i11) {
            this.mFlags = i11 | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && androidx.core.view.a0.W(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i11, int i12, boolean z11) {
            addFlags(8);
            offsetPosition(i12, z11);
            this.mPosition = i11;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final h<? extends e0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i11 = this.mPreLayoutPosition;
            return i11 == -1 ? this.mPosition : i11;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i11 = this.mPreLayoutPosition;
            return i11 == -1 ? this.mPosition : i11;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) == 0) {
                List<Object> list = this.mPayloads;
                if (list != null && list.size() != 0) {
                    return this.mUnmodifiedPayloads;
                }
                return FULLUPDATE_PAYLOADS;
            }
            return FULLUPDATE_PAYLOADS;
        }

        boolean hasAnyOfTheFlags(int i11) {
            return (i11 & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !androidx.core.view.a0.W(this.itemView);
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i11, boolean z11) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z11) {
                this.mPreLayoutPosition += i11;
            }
            this.mPosition += i11;
            if (this.itemView.getLayoutParams() != null) {
                ((q) this.itemView.getLayoutParams()).f5384c = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i11 = this.mPendingAccessibilityState;
            if (i11 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i11;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = androidx.core.view.a0.D(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i11, int i12) {
            this.mFlags = (i11 & i12) | (this.mFlags & (~i12));
        }

        public final void setIsRecyclable(boolean z11) {
            int i11 = this.mIsRecyclableCount;
            int i12 = z11 ? i11 - 1 : i11 + 1;
            this.mIsRecyclableCount = i12;
            if (i12 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z11 && i12 == 1) {
                this.mFlags |= 16;
            } else if (z11 && i12 == 0) {
                this.mFlags &= -17;
            }
        }

        void setScrapContainer(w wVar, boolean z11) {
            this.mScrapContainer = wVar;
            this.mInChangeScrap = z11;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb2 = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        void unScrap() {
            this.mScrapContainer.J(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* loaded from: classes.dex */
    public class f implements a.InterfaceC0091a {
        f() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0091a
        public void a(int i11, int i12) {
            RecyclerView.this.offsetPositionRecordsForMove(i11, i12);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0091a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0091a
        public void c(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0091a
        public void d(int i11, int i12) {
            RecyclerView.this.offsetPositionRecordsForRemove(i11, i12, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0091a
        public void e(int i11, int i12, Object obj) {
            RecyclerView.this.viewRangeUpdate(i11, i12, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0091a
        public e0 f(int i11) {
            e0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i11, true);
            if (findViewHolderForPosition == null || RecyclerView.this.mChildHelper.n(findViewHolderForPosition.itemView)) {
                return null;
            }
            return findViewHolderForPosition;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0091a
        public void g(int i11, int i12) {
            RecyclerView.this.offsetPositionRecordsForInsert(i11, i12);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0091a
        public void h(int i11, int i12) {
            RecyclerView.this.offsetPositionRecordsForRemove(i11, i12, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f5349d += i12;
        }

        void i(a.b bVar) {
            int i11 = bVar.f5466a;
            if (i11 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.onItemsAdded(recyclerView, bVar.f5467b, bVar.f5469d);
            } else if (i11 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.onItemsRemoved(recyclerView2, bVar.f5467b, bVar.f5469d);
            } else if (i11 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.onItemsUpdated(recyclerView3, bVar.f5467b, bVar.f5469d, bVar.f5468c);
            } else if (i11 != 8) {
            } else {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.onItemsMoved(recyclerView4, bVar.f5467b, bVar.f5469d, 1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class g {

        /* renamed from: a */
        static final /* synthetic */ int[] f5372a;

        static {
            int[] iArr = new int[h.a.values().length];
            f5372a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5372a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class h<VH extends e0> {
        private final i mObservable = new i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        /* loaded from: classes.dex */
        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(VH vh2, int i11) {
            boolean z11 = vh2.mBindingAdapter == null;
            if (z11) {
                vh2.mPosition = i11;
                if (hasStableIds()) {
                    vh2.mItemId = getItemId(i11);
                }
                vh2.setFlags(1, 519);
                r3.m.a(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh2.mBindingAdapter = this;
            onBindViewHolder(vh2, i11, vh2.getUnmodifiedPayloads());
            if (z11) {
                vh2.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh2.itemView.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f5384c = true;
                }
                r3.m.b();
            }
        }

        boolean canRestoreState() {
            int i11 = g.f5372a[this.mStateRestorationPolicy.ordinal()];
            if (i11 != 1) {
                return i11 != 2 || getItemCount() > 0;
            }
            return false;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i11) {
            try {
                r3.m.a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i11);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i11;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                r3.m.b();
            }
        }

        public int findRelativeAdapterPositionIn(h<? extends e0> hVar, e0 e0Var, int i11) {
            if (hVar == this) {
                return i11;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i11) {
            return -1L;
        }

        public int getItemViewType(int i11) {
            return 0;
        }

        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i11) {
            this.mObservable.d(i11, 1);
        }

        public final void notifyItemInserted(int i11) {
            this.mObservable.f(i11, 1);
        }

        public final void notifyItemMoved(int i11, int i12) {
            this.mObservable.c(i11, i12);
        }

        public final void notifyItemRangeChanged(int i11, int i12) {
            this.mObservable.d(i11, i12);
        }

        public final void notifyItemRangeInserted(int i11, int i12) {
            this.mObservable.f(i11, i12);
        }

        public final void notifyItemRangeRemoved(int i11, int i12) {
            this.mObservable.g(i11, i12);
        }

        public final void notifyItemRemoved(int i11) {
            this.mObservable.g(i11, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh2, int i11);

        public void onBindViewHolder(VH vh2, int i11, List<Object> list) {
            onBindViewHolder(vh2, i11);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i11);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh2) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh2) {
        }

        public void onViewDetachedFromWindow(VH vh2) {
        }

        public void onViewRecycled(VH vh2) {
        }

        public void registerAdapterDataObserver(j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z11) {
            if (!hasObservers()) {
                this.mHasStableIds = z11;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.h();
        }

        public void unregisterAdapterDataObserver(j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemChanged(int i11, Object obj) {
            this.mObservable.e(i11, 1, obj);
        }

        public final void notifyItemRangeChanged(int i11, int i12, Object obj) {
            this.mObservable.e(i11, i12, obj);
        }
    }

    /* loaded from: classes.dex */
    public static class i extends Observable<j> {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i11, int i12) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i11, i12, 1);
            }
        }

        public void d(int i11, int i12) {
            e(i11, i12, null);
        }

        public void e(int i11, int i12, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i11, i12, obj);
            }
        }

        public void f(int i11, int i12) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i11, i12);
            }
        }

        public void g(int i11, int i12) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).f(i11, i12);
            }
        }

        public void h() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).g();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class j {
        public void a() {
        }

        public void b(int i11, int i12) {
        }

        public void c(int i11, int i12, Object obj) {
            b(i11, i12);
        }

        public void d(int i11, int i12) {
        }

        public void e(int i11, int i12, int i13) {
        }

        public void f(int i11, int i12) {
        }

        public void g() {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        int a(int i11, int i12);
    }

    /* loaded from: classes.dex */
    public static class l {
        protected EdgeEffect a(RecyclerView recyclerView, int i11) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private b mListener = null;
        private ArrayList<a> mFinishedListeners = new ArrayList<>();
        private long mAddDuration = 120;
        private long mRemoveDuration = 120;
        private long mMoveDuration = 250;
        private long mChangeDuration = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* loaded from: classes.dex */
        public interface b {
            void a(e0 e0Var);
        }

        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a */
            public int f5373a;

            /* renamed from: b */
            public int f5374b;

            public c a(e0 e0Var) {
                return b(e0Var, 0);
            }

            public c b(e0 e0Var, int i11) {
                View view = e0Var.itemView;
                this.f5373a = view.getLeft();
                this.f5374b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        static int buildAdapterChangeFlagsForAnimations(e0 e0Var) {
            int i11 = e0Var.mFlags & 14;
            if (e0Var.isInvalid()) {
                return 4;
            }
            if ((i11 & 4) == 0) {
                int oldPosition = e0Var.getOldPosition();
                int absoluteAdapterPosition = e0Var.getAbsoluteAdapterPosition();
                return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i11 : i11 | 2048;
            }
            return i11;
        }

        public abstract boolean animateAppearance(e0 e0Var, c cVar, c cVar2);

        public abstract boolean animateChange(e0 e0Var, e0 e0Var2, c cVar, c cVar2);

        public abstract boolean animateDisappearance(e0 e0Var, c cVar, c cVar2);

        public abstract boolean animatePersistence(e0 e0Var, c cVar, c cVar2);

        public abstract boolean canReuseUpdatedViewHolder(e0 e0Var);

        public boolean canReuseUpdatedViewHolder(e0 e0Var, List<Object> list) {
            return canReuseUpdatedViewHolder(e0Var);
        }

        public final void dispatchAnimationFinished(e0 e0Var) {
            onAnimationFinished(e0Var);
            b bVar = this.mListener;
            if (bVar != null) {
                bVar.a(e0Var);
            }
        }

        public final void dispatchAnimationStarted(e0 e0Var) {
            onAnimationStarted(e0Var);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.mFinishedListeners.get(i11).a();
            }
            this.mFinishedListeners.clear();
        }

        public abstract void endAnimation(e0 e0Var);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(a aVar) {
            boolean isRunning = isRunning();
            if (aVar != null) {
                if (!isRunning) {
                    aVar.a();
                } else {
                    this.mFinishedListeners.add(aVar);
                }
            }
            return isRunning;
        }

        public c obtainHolderInfo() {
            return new c();
        }

        public void onAnimationFinished(e0 e0Var) {
        }

        public void onAnimationStarted(e0 e0Var) {
        }

        public c recordPostLayoutInformation(b0 b0Var, e0 e0Var) {
            return obtainHolderInfo().a(e0Var);
        }

        public c recordPreLayoutInformation(b0 b0Var, e0 e0Var, int i11, List<Object> list) {
            return obtainHolderInfo().a(e0Var);
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j11) {
            this.mAddDuration = j11;
        }

        public void setChangeDuration(long j11) {
            this.mChangeDuration = j11;
        }

        void setListener(b bVar) {
            this.mListener = bVar;
        }

        public void setMoveDuration(long j11) {
            this.mMoveDuration = j11;
        }

        public void setRemoveDuration(long j11) {
            this.mRemoveDuration = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class n implements m.b {
        n() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.b
        public void a(e0 e0Var) {
            e0Var.setIsRecyclable(true);
            if (e0Var.mShadowedHolder != null && e0Var.mShadowingHolder == null) {
                e0Var.mShadowedHolder = null;
            }
            e0Var.mShadowingHolder = null;
            if (e0Var.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(e0Var.itemView) || !e0Var.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(e0Var.itemView, false);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o {
        @Deprecated
        public void getItemOffsets(Rect rect, int i11, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            onDraw(canvas, recyclerView);
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            onDrawOver(canvas, recyclerView);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, b0 b0Var) {
            getItemOffsets(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class p {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.f mChildHelper;
        private int mHeight;
        private int mHeightMode;
        androidx.recyclerview.widget.z mHorizontalBoundCheck;
        private final z.b mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;
        a0 mSmoothScroller;
        androidx.recyclerview.widget.z mVerticalBoundCheck;
        private final z.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements z.b {
            a() {
                p.this = r1;
            }

            @Override // androidx.recyclerview.widget.z.b
            public View a(int i11) {
                return p.this.getChildAt(i11);
            }

            @Override // androidx.recyclerview.widget.z.b
            public int b(View view) {
                return p.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.z.b
            public int c() {
                return p.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.z.b
            public int d() {
                return p.this.getWidth() - p.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.z.b
            public int e(View view) {
                return p.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b implements z.b {
            b() {
                p.this = r1;
            }

            @Override // androidx.recyclerview.widget.z.b
            public View a(int i11) {
                return p.this.getChildAt(i11);
            }

            @Override // androidx.recyclerview.widget.z.b
            public int b(View view) {
                return p.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.z.b
            public int c() {
                return p.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.z.b
            public int d() {
                return p.this.getHeight() - p.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.z.b
            public int e(View view) {
                return p.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(int i11, int i12);
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a */
            public int f5378a;

            /* renamed from: b */
            public int f5379b;

            /* renamed from: c */
            public boolean f5380c;

            /* renamed from: d */
            public boolean f5381d;
        }

        public p() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new androidx.recyclerview.widget.z(aVar);
            this.mVerticalBoundCheck = new androidx.recyclerview.widget.z(bVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view, int i11, boolean z11) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!z11 && !childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.p(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.b(childViewHolderInt);
            }
            q qVar = (q) view.getLayoutParams();
            if (!childViewHolderInt.wasReturnedFromScrap() && !childViewHolderInt.isScrap()) {
                if (view.getParent() == this.mRecyclerView) {
                    int m11 = this.mChildHelper.m(view);
                    if (i11 == -1) {
                        i11 = this.mChildHelper.g();
                    }
                    if (m11 == -1) {
                        throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
                    } else if (m11 != i11) {
                        this.mRecyclerView.mLayout.moveView(m11, i11);
                    }
                } else {
                    this.mChildHelper.a(view, i11, false);
                    qVar.f5384c = true;
                    a0 a0Var = this.mSmoothScroller;
                    if (a0Var != null && a0Var.h()) {
                        this.mSmoothScroller.k(view);
                    }
                }
            } else {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.c(view, i11, view.getLayoutParams(), false);
            }
            if (qVar.f5385d) {
                childViewHolderInt.itemView.invalidate();
                qVar.f5385d = false;
            }
        }

        public static int chooseSize(int i11, int i12, int i13) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i12, i13) : size;
            }
            return Math.min(size, Math.max(i12, i13));
        }

        private void detachViewInternal(int i11, View view) {
            this.mChildHelper.d(i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x000a, code lost:
            if (r3 >= 0) goto L8;
         */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto Lf
                if (r3 < 0) goto Ld
                goto L11
            Ld:
                r3 = r2
                goto L1e
            Lf:
                if (r3 < 0) goto L13
            L11:
                r2 = r0
                goto L1e
            L13:
                r4 = -1
                if (r3 != r4) goto L18
                r3 = r1
                goto L11
            L18:
                r4 = -2
                if (r3 != r4) goto Ld
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1
            L1e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.getChildMeasureSpec(int, int, int, boolean):int");
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i11 = left - paddingLeft;
            int min = Math.min(0, i11);
            int i12 = top - paddingTop;
            int min2 = Math.min(0, i12);
            int i13 = width2 - width;
            int max = Math.max(0, i13);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() != 1) {
                if (min == 0) {
                    min = Math.min(i11, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i13);
            }
            if (min2 == 0) {
                min2 = Math.min(i12, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public static d getProperties(Context context, AttributeSet attributeSet, int i11, int i12) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s4.d.f50247a, i11, i12);
            dVar.f5378a = obtainStyledAttributes.getInt(s4.d.f50248b, 1);
            dVar.f5379b = obtainStyledAttributes.getInt(s4.d.f50258l, 1);
            dVar.f5380c = obtainStyledAttributes.getBoolean(s4.d.f50257k, false);
            dVar.f5381d = obtainStyledAttributes.getBoolean(s4.d.f50259m, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i11, int i12) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i11 < width && rect.right - i11 > paddingLeft && rect.top - i12 < height && rect.bottom - i12 > paddingTop;
        }

        private static boolean isMeasurementUpToDate(int i11, int i12, int i13) {
            int mode = View.MeasureSpec.getMode(i12);
            int size = View.MeasureSpec.getSize(i12);
            if (i13 <= 0 || i11 == i13) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i11;
                } else if (mode != 0) {
                    return mode == 1073741824 && size == i11;
                } else {
                    return true;
                }
            }
            return false;
        }

        private void scrapOrRecycleView(w wVar, int i11, View view) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i11);
                wVar.C(childViewHolderInt);
                return;
            }
            detachViewAt(i11);
            wVar.D(view);
            this.mRecyclerView.mViewInfoStore.k(childViewHolderInt);
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(View view, int i11, q qVar) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.b(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.p(childViewHolderInt);
            }
            this.mChildHelper.c(view, i11, qVar, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(q qVar) {
            return qVar != null;
        }

        public void collectAdjacentPrefetchPositions(int i11, int i12, b0 b0Var, c cVar) {
        }

        public void collectInitialPrefetchPositions(int i11, c cVar) {
        }

        public int computeHorizontalScrollExtent(b0 b0Var) {
            return 0;
        }

        public int computeHorizontalScrollOffset(b0 b0Var) {
            return 0;
        }

        public int computeHorizontalScrollRange(b0 b0Var) {
            return 0;
        }

        public int computeVerticalScrollExtent(b0 b0Var) {
            return 0;
        }

        public int computeVerticalScrollOffset(b0 b0Var) {
            return 0;
        }

        public int computeVerticalScrollRange(b0 b0Var) {
            return 0;
        }

        public void detachAndScrapAttachedViews(w wVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(wVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(View view, w wVar) {
            scrapOrRecycleView(wVar, this.mChildHelper.m(view), view);
        }

        public void detachAndScrapViewAt(int i11, w wVar) {
            scrapOrRecycleView(wVar, i11, getChildAt(i11));
        }

        public void detachView(View view) {
            int m11 = this.mChildHelper.m(view);
            if (m11 >= 0) {
                detachViewInternal(m11, view);
            }
        }

        public void detachViewAt(int i11) {
            detachViewInternal(i11, getChildAt(i11));
        }

        void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        void dispatchDetachedFromWindow(RecyclerView recyclerView, w wVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, wVar);
        }

        public void endAnimation(View view) {
            m mVar = this.mRecyclerView.mItemAnimator;
            if (mVar != null) {
                mVar.endAnimation(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public View findContainingItemView(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.n(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public View findViewByPosition(int i11) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i11 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.e() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract q generateDefaultLayoutParams();

        public q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof q) {
                return new q((q) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new q((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new q(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(View view) {
            return ((q) view.getLayoutParams()).f5383b.bottom;
        }

        public View getChildAt(int i11) {
            androidx.recyclerview.widget.f fVar = this.mChildHelper;
            if (fVar != null) {
                return fVar.f(i11);
            }
            return null;
        }

        public int getChildCount() {
            androidx.recyclerview.widget.f fVar = this.mChildHelper;
            if (fVar != null) {
                return fVar.g();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(w wVar, b0 b0Var) {
            return -1;
        }

        public int getDecoratedBottom(View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((q) view.getLayoutParams()).f5383b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((q) view.getLayoutParams()).f5383b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return androidx.core.view.a0.F(this.mRecyclerView);
        }

        public int getLeftDecorationWidth(View view) {
            return ((q) view.getLayoutParams()).f5383b.left;
        }

        public int getMinimumHeight() {
            return androidx.core.view.a0.G(this.mRecyclerView);
        }

        public int getMinimumWidth() {
            return androidx.core.view.a0.H(this.mRecyclerView);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return androidx.core.view.a0.J(recyclerView);
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return androidx.core.view.a0.K(recyclerView);
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        public int getRightDecorationWidth(View view) {
            return ((q) view.getLayoutParams()).f5383b.right;
        }

        public int getRowCountForAccessibility(w wVar, b0 b0Var) {
            return -1;
        }

        public int getSelectionModeForAccessibility(w wVar, b0 b0Var) {
            return 0;
        }

        public int getTopDecorationHeight(View view) {
            return ((q) view.getLayoutParams()).f5383b.top;
        }

        public void getTransformedBoundingBox(View view, boolean z11, Rect rect) {
            Matrix matrix;
            if (z11) {
                Rect rect2 = ((q) view.getLayoutParams()).f5383b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i11).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
                e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt.addFlags(128);
                this.mRecyclerView.mViewInfoStore.q(childViewHolderInt);
                return;
            }
            throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.exceptionLabel());
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(w wVar, b0 b0Var) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            a0 a0Var = this.mSmoothScroller;
            return a0Var != null && a0Var.h();
        }

        public boolean isViewPartiallyVisible(View view, boolean z11, boolean z12) {
            boolean z13 = this.mHorizontalBoundCheck.b(view, 24579) && this.mVerticalBoundCheck.b(view, 24579);
            return z11 ? z13 : !z13;
        }

        public void layoutDecorated(View view, int i11, int i12, int i13, int i14) {
            Rect rect = ((q) view.getLayoutParams()).f5383b;
            view.layout(i11 + rect.left, i12 + rect.top, i13 - rect.right, i14 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i11, int i12, int i13, int i14) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f5383b;
            view.layout(i11 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i12 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i13 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i14 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        public void measureChild(View view, int i11, int i12) {
            q qVar = (q) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i13 = i11 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i14 = i12 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i13, ((ViewGroup.MarginLayoutParams) qVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i14, ((ViewGroup.MarginLayoutParams) qVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, qVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(View view, int i11, int i12) {
            q qVar = (q) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i13 = i11 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i14 = i12 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i13, ((ViewGroup.MarginLayoutParams) qVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i14, ((ViewGroup.MarginLayoutParams) qVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, qVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i11, int i12) {
            View childAt = getChildAt(i11);
            if (childAt != null) {
                detachViewAt(i11);
                attachView(childAt, i12);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i11 + this.mRecyclerView.toString());
        }

        public void offsetChildrenHorizontal(int i11) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i11);
            }
        }

        public void offsetChildrenVertical(int i11) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i11);
            }
        }

        public void onAdapterChanged(h hVar, h hVar2) {
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i11, int i12) {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, w wVar) {
            onDetachedFromWindow(recyclerView);
        }

        public View onFocusSearchFailed(View view, int i11, w wVar, b0 b0Var) {
            return null;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(w3.c cVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, cVar);
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, w3.c cVar) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.n(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, cVar);
        }

        public void onInitializeAccessibilityNodeInfoForItem(w wVar, b0 b0Var, View view, w3.c cVar) {
        }

        public View onInterceptFocusSearch(View view, int i11) {
            return null;
        }

        public void onItemsAdded(RecyclerView recyclerView, int i11, int i12) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i11, int i12, int i13) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i11, int i12) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i11, int i12) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i11, int i12, Object obj) {
            onItemsUpdated(recyclerView, i11, i12);
        }

        public void onLayoutChildren(w wVar, b0 b0Var) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onLayoutCompleted(b0 b0Var) {
        }

        public void onMeasure(w wVar, b0 b0Var, int i11, int i12) {
            this.mRecyclerView.defaultOnMeasure(i11, i12);
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i11) {
        }

        void onSmoothScrollerStopped(a0 a0Var) {
            if (this.mSmoothScroller == a0Var) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i11, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i11, bundle);
        }

        public boolean performAccessibilityActionForItem(View view, int i11, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i11, bundle);
        }

        public boolean performAccessibilityActionForItem(w wVar, b0 b0Var, View view, int i11, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                androidx.core.view.a0.o0(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.q(childCount);
            }
        }

        public void removeAndRecycleAllViews(w wVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, wVar);
                }
            }
        }

        void removeAndRecycleScrapInt(w wVar) {
            int j11 = wVar.j();
            for (int i11 = j11 - 1; i11 >= 0; i11--) {
                View n11 = wVar.n(i11);
                e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(n11);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(n11, false);
                    }
                    m mVar = this.mRecyclerView.mItemAnimator;
                    if (mVar != null) {
                        mVar.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    wVar.y(n11);
                }
            }
            wVar.e();
            if (j11 > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view, w wVar) {
            removeView(view);
            wVar.B(view);
        }

        public void removeAndRecycleViewAt(int i11, w wVar) {
            View childAt = getChildAt(i11);
            removeViewAt(i11);
            wVar.B(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            this.mChildHelper.p(view);
        }

        public void removeViewAt(int i11) {
            if (getChildAt(i11) != null) {
                this.mChildHelper.q(i11);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z11) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z11, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i11, w wVar, b0 b0Var) {
            return 0;
        }

        public void scrollToPosition(int i11) {
        }

        public int scrollVerticallyBy(int i11, w wVar, b0 b0Var) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z11) {
            this.mAutoMeasure = z11;
        }

        void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z11) {
            if (z11 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z11;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.K();
                }
            }
        }

        void setMeasureSpecs(int i11, int i12) {
            this.mWidth = View.MeasureSpec.getSize(i11);
            int mode = View.MeasureSpec.getMode(i11);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i12);
            int mode2 = View.MeasureSpec.getMode(i12);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i11, int i12) {
            setMeasuredDimension(chooseSize(i11, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i12, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        void setMeasuredDimensionFromChildren(int i11, int i12) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i11, i12);
                return;
            }
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MAX_VALUE;
            int i16 = Integer.MIN_VALUE;
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt = getChildAt(i17);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i18 = rect.left;
                if (i18 < i14) {
                    i14 = i18;
                }
                int i19 = rect.right;
                if (i19 > i13) {
                    i13 = i19;
                }
                int i21 = rect.top;
                if (i21 < i15) {
                    i15 = i21;
                }
                int i22 = rect.bottom;
                if (i22 > i16) {
                    i16 = i22;
                }
            }
            this.mRecyclerView.mTempRect.set(i14, i15, i13, i16);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i11, i12);
        }

        public void setMeasurementCacheEnabled(boolean z11) {
            this.mMeasurementCacheEnabled = z11;
        }

        void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(View view, int i11, int i12, q qVar) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i11, ((ViewGroup.MarginLayoutParams) qVar).width) && isMeasurementUpToDate(view.getHeight(), i12, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i11, int i12, q qVar) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i11, ((ViewGroup.MarginLayoutParams) qVar).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i12, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, b0 b0Var, int i11) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(a0 a0Var) {
            a0 a0Var2 = this.mSmoothScroller;
            if (a0Var2 != null && a0Var != a0Var2 && a0Var2.h()) {
                this.mSmoothScroller.r();
            }
            this.mSmoothScroller = a0Var;
            a0Var.q(this.mRecyclerView, this);
        }

        public void stopIgnoringView(View view) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        void stopSmoothScroller() {
            a0 a0Var = this.mSmoothScroller;
            if (a0Var != null) {
                a0Var.r();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public void addDisappearingView(View view, int i11) {
            addViewInt(view, i11, true);
        }

        public void addView(View view, int i11) {
            addViewInt(view, i11, false);
        }

        public void onInitializeAccessibilityEvent(w wVar, b0 b0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z11 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z11 = false;
            }
            accessibilityEvent.setScrollable(z11);
            h hVar = this.mRecyclerView.mAdapter;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(w wVar, b0 b0Var, w3.c cVar) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                cVar.a(PKIFailureInfo.certRevoked);
                cVar.D0(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                cVar.a(4096);
                cVar.D0(true);
            }
            cVar.e0(c.b.a(getRowCountForAccessibility(wVar, b0Var), getColumnCountForAccessibility(wVar, b0Var), isLayoutHierarchical(wVar, b0Var), getSelectionModeForAccessibility(wVar, b0Var)));
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, b0 b0Var, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public boolean performAccessibilityAction(w wVar, b0 b0Var, int i11, Bundle bundle) {
            int height;
            int width;
            int i12;
            int i13;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return false;
            }
            if (i11 == 4096) {
                height = recyclerView.canScrollVertically(1) ? (getHeight() - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    i12 = height;
                    i13 = width;
                }
                i12 = height;
                i13 = 0;
            } else if (i11 != 8192) {
                i13 = 0;
                i12 = 0;
            } else {
                height = recyclerView.canScrollVertically(-1) ? -((getHeight() - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    width = -((getWidth() - getPaddingLeft()) - getPaddingRight());
                    i12 = height;
                    i13 = width;
                }
                i12 = height;
                i13 = 0;
            }
            if (i12 == 0 && i13 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i13, i12, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z11, boolean z12) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i11 = childRectangleOnScreenScrollAmount[0];
            int i12 = childRectangleOnScreenScrollAmount[1];
            if ((!z12 || isFocusedChildVisibleAfterScrolling(recyclerView, i11, i12)) && !(i11 == 0 && i12 == 0)) {
                if (z11) {
                    recyclerView.scrollBy(i11, i12);
                } else {
                    recyclerView.smoothScrollBy(i11, i12);
                }
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0017, code lost:
            if (r5 == 1073741824) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        public void attachView(View view, int i11) {
            attachView(view, i11, (q) view.getLayoutParams());
        }

        public q generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public void setMeasuredDimension(int i11, int i12) {
            this.mRecyclerView.setMeasuredDimension(i11, i12);
        }

        public void attachView(View view) {
            attachView(view, -1);
        }
    }

    /* loaded from: classes.dex */
    public interface r {
        void b(View view);

        void d(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class s {
        public abstract boolean a(int i11, int i12);
    }

    /* loaded from: classes.dex */
    public interface t {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z11);
    }

    /* loaded from: classes.dex */
    public static abstract class u {
        public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
        }

        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
        }
    }

    /* loaded from: classes.dex */
    public static class v {

        /* renamed from: a */
        SparseArray<a> f5386a = new SparseArray<>();

        /* renamed from: b */
        private int f5387b = 0;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            final ArrayList<e0> f5388a = new ArrayList<>();

            /* renamed from: b */
            int f5389b = 5;

            /* renamed from: c */
            long f5390c = 0;

            /* renamed from: d */
            long f5391d = 0;

            a() {
            }
        }

        private a g(int i11) {
            a aVar = this.f5386a.get(i11);
            if (aVar == null) {
                a aVar2 = new a();
                this.f5386a.put(i11, aVar2);
                return aVar2;
            }
            return aVar;
        }

        void a() {
            this.f5387b++;
        }

        public void b() {
            for (int i11 = 0; i11 < this.f5386a.size(); i11++) {
                this.f5386a.valueAt(i11).f5388a.clear();
            }
        }

        void c() {
            this.f5387b--;
        }

        void d(int i11, long j11) {
            a g11 = g(i11);
            g11.f5391d = j(g11.f5391d, j11);
        }

        void e(int i11, long j11) {
            a g11 = g(i11);
            g11.f5390c = j(g11.f5390c, j11);
        }

        public e0 f(int i11) {
            a aVar = this.f5386a.get(i11);
            if (aVar == null || aVar.f5388a.isEmpty()) {
                return null;
            }
            ArrayList<e0> arrayList = aVar.f5388a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        void h(h hVar, h hVar2, boolean z11) {
            if (hVar != null) {
                c();
            }
            if (!z11 && this.f5387b == 0) {
                b();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void i(e0 e0Var) {
            int itemViewType = e0Var.getItemViewType();
            ArrayList<e0> arrayList = g(itemViewType).f5388a;
            if (this.f5386a.get(itemViewType).f5389b <= arrayList.size()) {
                return;
            }
            e0Var.resetInternal();
            arrayList.add(e0Var);
        }

        long j(long j11, long j12) {
            return j11 == 0 ? j12 : ((j11 / 4) * 3) + (j12 / 4);
        }

        boolean k(int i11, long j11, long j12) {
            long j13 = g(i11).f5391d;
            return j13 == 0 || j11 + j13 < j12;
        }

        boolean l(int i11, long j11, long j12) {
            long j13 = g(i11).f5390c;
            return j13 == 0 || j11 + j13 < j12;
        }
    }

    /* loaded from: classes.dex */
    public final class w {

        /* renamed from: a */
        final ArrayList<e0> f5392a;

        /* renamed from: b */
        ArrayList<e0> f5393b;

        /* renamed from: c */
        final ArrayList<e0> f5394c;

        /* renamed from: d */
        private final List<e0> f5395d;

        /* renamed from: e */
        private int f5396e;

        /* renamed from: f */
        int f5397f;

        /* renamed from: g */
        v f5398g;

        public w() {
            RecyclerView.this = r2;
            ArrayList<e0> arrayList = new ArrayList<>();
            this.f5392a = arrayList;
            this.f5393b = null;
            this.f5394c = new ArrayList<>();
            this.f5395d = Collections.unmodifiableList(arrayList);
            this.f5396e = 2;
            this.f5397f = 2;
        }

        private boolean H(e0 e0Var, int i11, int i12, long j11) {
            e0Var.mBindingAdapter = null;
            e0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = e0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j11 == RecyclerView.FOREVER_NS || this.f5398g.k(itemViewType, nanoTime, j11)) {
                RecyclerView.this.mAdapter.bindViewHolder(e0Var, i11);
                this.f5398g.d(e0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
                b(e0Var);
                if (RecyclerView.this.mState.e()) {
                    e0Var.mPreLayoutPosition = i12;
                    return true;
                }
                return true;
            }
            return false;
        }

        private void b(e0 e0Var) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = e0Var.itemView;
                if (androidx.core.view.a0.D(view) == 0) {
                    androidx.core.view.a0.G0(view, 1);
                }
                androidx.recyclerview.widget.v vVar = RecyclerView.this.mAccessibilityDelegate;
                if (vVar == null) {
                    return;
                }
                androidx.core.view.a a11 = vVar.a();
                if (a11 instanceof v.a) {
                    ((v.a) a11).b(view);
                }
                androidx.core.view.a0.w0(view, a11);
            }
        }

        private void q(ViewGroup viewGroup, boolean z11) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z11) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        private void r(e0 e0Var) {
            View view = e0Var.itemView;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        void A(int i11) {
            a(this.f5394c.get(i11), true);
            this.f5394c.remove(i11);
        }

        public void B(View view) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            C(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            RecyclerView.this.mItemAnimator.endAnimation(childViewHolderInt);
        }

        void C(e0 e0Var) {
            boolean z11;
            boolean z12 = true;
            if (!e0Var.isScrap() && e0Var.itemView.getParent() == null) {
                if (!e0Var.isTmpDetached()) {
                    if (!e0Var.shouldIgnore()) {
                        boolean doesTransientStatePreventRecycling = e0Var.doesTransientStatePreventRecycling();
                        h hVar = RecyclerView.this.mAdapter;
                        if ((hVar != null && doesTransientStatePreventRecycling && hVar.onFailedToRecycleView(e0Var)) || e0Var.isRecyclable()) {
                            if (this.f5397f <= 0 || e0Var.hasAnyOfTheFlags(526)) {
                                z11 = false;
                            } else {
                                int size = this.f5394c.size();
                                if (size >= this.f5397f && size > 0) {
                                    A(0);
                                    size--;
                                }
                                if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.d(e0Var.mPosition)) {
                                    int i11 = size - 1;
                                    while (i11 >= 0) {
                                        if (!RecyclerView.this.mPrefetchRegistry.d(this.f5394c.get(i11).mPosition)) {
                                            break;
                                        }
                                        i11--;
                                    }
                                    size = i11 + 1;
                                }
                                this.f5394c.add(size, e0Var);
                                z11 = true;
                            }
                            if (z11) {
                                z12 = false;
                            } else {
                                a(e0Var, true);
                            }
                            r1 = z11;
                        } else {
                            z12 = false;
                        }
                        RecyclerView.this.mViewInfoStore.q(e0Var);
                        if (r1 || z12 || !doesTransientStatePreventRecycling) {
                            return;
                        }
                        e0Var.mBindingAdapter = null;
                        e0Var.mOwnerRecyclerView = null;
                        return;
                    }
                    throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
                }
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + e0Var + RecyclerView.this.exceptionLabel());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Scrapped or attached views may not be recycled. isScrap:");
            sb2.append(e0Var.isScrap());
            sb2.append(" isAttached:");
            sb2.append(e0Var.itemView.getParent() != null);
            sb2.append(RecyclerView.this.exceptionLabel());
            throw new IllegalArgumentException(sb2.toString());
        }

        void D(View view) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f5393b == null) {
                    this.f5393b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f5393b.add(childViewHolderInt);
            } else if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !RecyclerView.this.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            } else {
                childViewHolderInt.setScrapContainer(this, false);
                this.f5392a.add(childViewHolderInt);
            }
        }

        void E(v vVar) {
            v vVar2 = this.f5398g;
            if (vVar2 != null) {
                vVar2.c();
            }
            this.f5398g = vVar;
            if (vVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f5398g.a();
        }

        void F(c0 c0Var) {
        }

        public void G(int i11) {
            this.f5396e = i11;
            K();
        }

        /* JADX WARN: Removed duplicated region for block: B:117:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:170:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x01d3 A[ADDED_TO_REGION] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.e0 I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 530
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$e0");
        }

        void J(e0 e0Var) {
            if (e0Var.mInChangeScrap) {
                this.f5393b.remove(e0Var);
            } else {
                this.f5392a.remove(e0Var);
            }
            e0Var.mScrapContainer = null;
            e0Var.mInChangeScrap = false;
            e0Var.clearReturnedFromScrapFlag();
        }

        public void K() {
            p pVar = RecyclerView.this.mLayout;
            this.f5397f = this.f5396e + (pVar != null ? pVar.mPrefetchMaxCountObserved : 0);
            for (int size = this.f5394c.size() - 1; size >= 0 && this.f5394c.size() > this.f5397f; size--) {
                A(size);
            }
        }

        boolean L(e0 e0Var) {
            if (e0Var.isRemoved()) {
                return RecyclerView.this.mState.e();
            }
            int i11 = e0Var.mPosition;
            if (i11 >= 0 && i11 < RecyclerView.this.mAdapter.getItemCount()) {
                if (RecyclerView.this.mState.e() || RecyclerView.this.mAdapter.getItemViewType(e0Var.mPosition) == e0Var.getItemViewType()) {
                    return !RecyclerView.this.mAdapter.hasStableIds() || e0Var.getItemId() == RecyclerView.this.mAdapter.getItemId(e0Var.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + e0Var + RecyclerView.this.exceptionLabel());
        }

        void M(int i11, int i12) {
            int i13;
            int i14 = i12 + i11;
            for (int size = this.f5394c.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f5394c.get(size);
                if (e0Var != null && (i13 = e0Var.mPosition) >= i11 && i13 < i14) {
                    e0Var.addFlags(2);
                    A(size);
                }
            }
        }

        public void a(e0 e0Var, boolean z11) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(e0Var);
            View view = e0Var.itemView;
            androidx.recyclerview.widget.v vVar = RecyclerView.this.mAccessibilityDelegate;
            if (vVar != null) {
                androidx.core.view.a a11 = vVar.a();
                androidx.core.view.a0.w0(view, a11 instanceof v.a ? ((v.a) a11).a(view) : null);
            }
            if (z11) {
                g(e0Var);
            }
            e0Var.mBindingAdapter = null;
            e0Var.mOwnerRecyclerView = null;
            i().i(e0Var);
        }

        public void c() {
            this.f5392a.clear();
            z();
        }

        void d() {
            int size = this.f5394c.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f5394c.get(i11).clearOldPosition();
            }
            int size2 = this.f5392a.size();
            for (int i12 = 0; i12 < size2; i12++) {
                this.f5392a.get(i12).clearOldPosition();
            }
            ArrayList<e0> arrayList = this.f5393b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    this.f5393b.get(i13).clearOldPosition();
                }
            }
        }

        void e() {
            this.f5392a.clear();
            ArrayList<e0> arrayList = this.f5393b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i11) {
            if (i11 >= 0 && i11 < RecyclerView.this.mState.b()) {
                return !RecyclerView.this.mState.e() ? i11 : RecyclerView.this.mAdapterHelper.m(i11);
            }
            throw new IndexOutOfBoundsException("invalid position " + i11 + ". State item count is " + RecyclerView.this.mState.b() + RecyclerView.this.exceptionLabel());
        }

        void g(e0 e0Var) {
            x xVar = RecyclerView.this.mRecyclerListener;
            if (xVar != null) {
                xVar.a(e0Var);
            }
            int size = RecyclerView.this.mRecyclerListeners.size();
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView.this.mRecyclerListeners.get(i11).a(e0Var);
            }
            h hVar = RecyclerView.this.mAdapter;
            if (hVar != null) {
                hVar.onViewRecycled(e0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.q(e0Var);
            }
        }

        e0 h(int i11) {
            int size;
            int m11;
            ArrayList<e0> arrayList = this.f5393b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i12 = 0; i12 < size; i12++) {
                    e0 e0Var = this.f5393b.get(i12);
                    if (!e0Var.wasReturnedFromScrap() && e0Var.getLayoutPosition() == i11) {
                        e0Var.addFlags(32);
                        return e0Var;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (m11 = RecyclerView.this.mAdapterHelper.m(i11)) > 0 && m11 < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(m11);
                    for (int i13 = 0; i13 < size; i13++) {
                        e0 e0Var2 = this.f5393b.get(i13);
                        if (!e0Var2.wasReturnedFromScrap() && e0Var2.getItemId() == itemId) {
                            e0Var2.addFlags(32);
                            return e0Var2;
                        }
                    }
                }
            }
            return null;
        }

        v i() {
            if (this.f5398g == null) {
                this.f5398g = new v();
            }
            return this.f5398g;
        }

        int j() {
            return this.f5392a.size();
        }

        public List<e0> k() {
            return this.f5395d;
        }

        e0 l(long j11, int i11, boolean z11) {
            for (int size = this.f5392a.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f5392a.get(size);
                if (e0Var.getItemId() == j11 && !e0Var.wasReturnedFromScrap()) {
                    if (i11 == e0Var.getItemViewType()) {
                        e0Var.addFlags(32);
                        if (e0Var.isRemoved() && !RecyclerView.this.mState.e()) {
                            e0Var.setFlags(2, 14);
                        }
                        return e0Var;
                    } else if (!z11) {
                        this.f5392a.remove(size);
                        RecyclerView.this.removeDetachedView(e0Var.itemView, false);
                        y(e0Var.itemView);
                    }
                }
            }
            int size2 = this.f5394c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                e0 e0Var2 = this.f5394c.get(size2);
                if (e0Var2.getItemId() == j11 && !e0Var2.isAttachedToTransitionOverlay()) {
                    if (i11 == e0Var2.getItemViewType()) {
                        if (!z11) {
                            this.f5394c.remove(size2);
                        }
                        return e0Var2;
                    } else if (!z11) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        e0 m(int i11, boolean z11) {
            View e11;
            int size = this.f5392a.size();
            for (int i12 = 0; i12 < size; i12++) {
                e0 e0Var = this.f5392a.get(i12);
                if (!e0Var.wasReturnedFromScrap() && e0Var.getLayoutPosition() == i11 && !e0Var.isInvalid() && (RecyclerView.this.mState.f5353h || !e0Var.isRemoved())) {
                    e0Var.addFlags(32);
                    return e0Var;
                }
            }
            if (!z11 && (e11 = RecyclerView.this.mChildHelper.e(i11)) != null) {
                e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(e11);
                RecyclerView.this.mChildHelper.s(e11);
                int m11 = RecyclerView.this.mChildHelper.m(e11);
                if (m11 != -1) {
                    RecyclerView.this.mChildHelper.d(m11);
                    D(e11);
                    childViewHolderInt.addFlags(8224);
                    return childViewHolderInt;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
            }
            int size2 = this.f5394c.size();
            for (int i13 = 0; i13 < size2; i13++) {
                e0 e0Var2 = this.f5394c.get(i13);
                if (!e0Var2.isInvalid() && e0Var2.getLayoutPosition() == i11 && !e0Var2.isAttachedToTransitionOverlay()) {
                    if (!z11) {
                        this.f5394c.remove(i13);
                    }
                    return e0Var2;
                }
            }
            return null;
        }

        View n(int i11) {
            return this.f5392a.get(i11).itemView;
        }

        public View o(int i11) {
            return p(i11, false);
        }

        View p(int i11, boolean z11) {
            return I(i11, z11, RecyclerView.FOREVER_NS).itemView;
        }

        void s() {
            int size = this.f5394c.size();
            for (int i11 = 0; i11 < size; i11++) {
                q qVar = (q) this.f5394c.get(i11).itemView.getLayoutParams();
                if (qVar != null) {
                    qVar.f5384c = true;
                }
            }
        }

        void t() {
            int size = this.f5394c.size();
            for (int i11 = 0; i11 < size; i11++) {
                e0 e0Var = this.f5394c.get(i11);
                if (e0Var != null) {
                    e0Var.addFlags(6);
                    e0Var.addChangePayload(null);
                }
            }
            h hVar = RecyclerView.this.mAdapter;
            if (hVar == null || !hVar.hasStableIds()) {
                z();
            }
        }

        void u(int i11, int i12) {
            int size = this.f5394c.size();
            for (int i13 = 0; i13 < size; i13++) {
                e0 e0Var = this.f5394c.get(i13);
                if (e0Var != null && e0Var.mPosition >= i11) {
                    e0Var.offsetPosition(i12, false);
                }
            }
        }

        void v(int i11, int i12) {
            int i13;
            int i14;
            int i15;
            int i16;
            if (i11 < i12) {
                i13 = -1;
                i15 = i11;
                i14 = i12;
            } else {
                i13 = 1;
                i14 = i11;
                i15 = i12;
            }
            int size = this.f5394c.size();
            for (int i17 = 0; i17 < size; i17++) {
                e0 e0Var = this.f5394c.get(i17);
                if (e0Var != null && (i16 = e0Var.mPosition) >= i15 && i16 <= i14) {
                    if (i16 == i11) {
                        e0Var.offsetPosition(i12 - i11, false);
                    } else {
                        e0Var.offsetPosition(i13, false);
                    }
                }
            }
        }

        void w(int i11, int i12, boolean z11) {
            int i13 = i11 + i12;
            for (int size = this.f5394c.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f5394c.get(size);
                if (e0Var != null) {
                    int i14 = e0Var.mPosition;
                    if (i14 >= i13) {
                        e0Var.offsetPosition(-i12, z11);
                    } else if (i14 >= i11) {
                        e0Var.addFlags(8);
                        A(size);
                    }
                }
            }
        }

        void x(h hVar, h hVar2, boolean z11) {
            c();
            i().h(hVar, hVar2, z11);
        }

        void y(View view) {
            e0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            C(childViewHolderInt);
        }

        void z() {
            for (int size = this.f5394c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f5394c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface x {
        void a(e0 e0Var);
    }

    /* loaded from: classes.dex */
    public class y extends j {
        y() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f5352g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i11, int i12, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.r(i11, i12, obj)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i11, int i12) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.s(i11, i12)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i11, int i12, int i13) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.t(i11, i12, i13)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i11, int i12) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.u(i11, i12)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void g() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (hVar = recyclerView.mAdapter) == null || !hVar.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        void h() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    androidx.core.view.a0.o0(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }
    }

    static {
        int i11 = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = i11 == 18 || i11 == 19 || i11 == 20;
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = i11 >= 23;
        POST_UPDATES_ON_ANIMATION = i11 >= 16;
        ALLOW_THREAD_GAP_WORK = i11 >= 21;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = i11 <= 15;
        IGNORE_DETACHED_FOCUSED_CHILD = i11 <= 15;
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(e0 e0Var) {
        View view = e0Var.itemView;
        boolean z11 = view.getParent() == this;
        this.mRecycler.J(getChildViewHolder(view));
        if (e0Var.isTmpDetached()) {
            this.mChildHelper.c(view, -1, view.getLayoutParams(), true);
        } else if (!z11) {
            this.mChildHelper.b(view, true);
        } else {
            this.mChildHelper.k(view);
        }
    }

    private void animateChange(e0 e0Var, e0 e0Var2, m.c cVar, m.c cVar2, boolean z11, boolean z12) {
        e0Var.setIsRecyclable(false);
        if (z11) {
            addAnimatingView(e0Var);
        }
        if (e0Var != e0Var2) {
            if (z12) {
                addAnimatingView(e0Var2);
            }
            e0Var.mShadowedHolder = e0Var2;
            addAnimatingView(e0Var);
            this.mRecycler.J(e0Var);
            e0Var2.setIsRecyclable(false);
            e0Var2.mShadowingHolder = e0Var;
        }
        if (this.mItemAnimator.animateChange(e0Var, e0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(e0 e0Var) {
        WeakReference<RecyclerView> weakReference = e0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == e0Var.itemView) {
                    return;
                }
                ViewParent parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            e0Var.mNestedRecyclerView = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i11, int i12) {
        ClassLoader classLoader;
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, trim);
            try {
                if (isInEditMode()) {
                    classLoader = getClass().getClassLoader();
                } else {
                    classLoader = context.getClassLoader();
                }
                Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(p.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i11), Integer.valueOf(i12)};
                } catch (NoSuchMethodException e11) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e12) {
                        e12.initCause(e11);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e12);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e13);
            } catch (ClassNotFoundException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e14);
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e15);
            } catch (InstantiationException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e17);
            }
        }
    }

    private boolean didChildRangeChange(int i11, int i12) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i11 && iArr[1] == i12) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i11 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i11 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        w3.b.b(obtain, i11);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void dispatchLayoutStep1() {
        boolean z11 = true;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f5355j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.f();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        b0 b0Var = this.mState;
        b0Var.f5354i = (b0Var.f5356k && this.mItemsChanged) ? false : false;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        b0Var.f5353h = b0Var.f5357l;
        b0Var.f5351f = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f5356k) {
            int g11 = this.mChildHelper.g();
            for (int i11 = 0; i11 < g11; i11++) {
                e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i11));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.e(childViewHolderInt, this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, m.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f5354i && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.c(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f5357l) {
            saveOldPositions();
            b0 b0Var2 = this.mState;
            boolean z12 = b0Var2.f5352g;
            b0Var2.f5352g = false;
            this.mLayout.onLayoutChildren(this.mRecycler, b0Var2);
            this.mState.f5352g = z12;
            for (int i12 = 0; i12 < this.mChildHelper.g(); i12++) {
                e0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.f(i12));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.i(childViewHolderInt2)) {
                    int buildAdapterChangeFlagsForAnimations = m.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(PKIFailureInfo.certRevoked);
                    if (!hasAnyOfTheFlags) {
                        buildAdapterChangeFlagsForAnimations |= 4096;
                    }
                    m.c recordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, buildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, recordPreLayoutInformation);
                    } else {
                        this.mViewInfoStore.a(childViewHolderInt2, recordPreLayoutInformation);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f5350e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.j();
        this.mState.f5351f = this.mAdapter.getItemCount();
        this.mState.f5349d = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f5401c;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        b0 b0Var = this.mState;
        b0Var.f5353h = false;
        this.mLayout.onLayoutChildren(this.mRecycler, b0Var);
        b0 b0Var2 = this.mState;
        b0Var2.f5352g = false;
        b0Var2.f5356k = b0Var2.f5356k && this.mItemAnimator != null;
        b0Var2.f5350e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        b0 b0Var = this.mState;
        b0Var.f5350e = 1;
        if (b0Var.f5356k) {
            for (int g11 = this.mChildHelper.g() - 1; g11 >= 0; g11--) {
                e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(g11));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    m.c recordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    e0 g12 = this.mViewInfoStore.g(changedHolderKey);
                    if (g12 != null && !g12.shouldIgnore()) {
                        boolean h11 = this.mViewInfoStore.h(g12);
                        boolean h12 = this.mViewInfoStore.h(childViewHolderInt);
                        if (h11 && g12 == childViewHolderInt) {
                            this.mViewInfoStore.d(childViewHolderInt, recordPostLayoutInformation);
                        } else {
                            m.c n11 = this.mViewInfoStore.n(g12);
                            this.mViewInfoStore.d(childViewHolderInt, recordPostLayoutInformation);
                            m.c m11 = this.mViewInfoStore.m(childViewHolderInt);
                            if (n11 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, g12);
                            } else {
                                animateChange(g12, childViewHolderInt, n11, m11, h11, h12);
                            }
                        }
                    } else {
                        this.mViewInfoStore.d(childViewHolderInt, recordPostLayoutInformation);
                    }
                }
            }
            this.mViewInfoStore.o(this.mViewInfoProcessCallback);
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        b0 b0Var2 = this.mState;
        b0Var2.f5348c = b0Var2.f5351f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        b0Var2.f5356k = false;
        b0Var2.f5357l = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<e0> arrayList = this.mRecycler.f5393b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = this.mLayout;
        if (pVar.mPrefetchMaxObservedInInitialPrefetch) {
            pVar.mPrefetchMaxCountObserved = 0;
            pVar.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.K();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.f();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        t tVar = this.mInterceptingOnItemTouchListener;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        tVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            t tVar = this.mOnItemTouchListeners.get(i11);
            if (tVar.c(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = tVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int g11 = this.mChildHelper.g();
        if (g11 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i11 = Integer.MAX_VALUE;
        int i12 = Integer.MIN_VALUE;
        for (int i13 = 0; i13 < g11; i13++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i13));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i11) {
                    i11 = layoutPosition;
                }
                if (layoutPosition > i12) {
                    i12 = layoutPosition;
                }
            }
        }
        iArr[0] = i11;
        iArr[1] = i12;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (view instanceof ViewGroup) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i11));
                if (findNestedRecyclerView != null) {
                    return findNestedRecyclerView;
                }
            }
            return null;
        }
        return null;
    }

    private View findNextViewToFocus() {
        e0 findViewHolderForAdapterPosition;
        b0 b0Var = this.mState;
        int i11 = b0Var.f5358m;
        if (i11 == -1) {
            i11 = 0;
        }
        int b11 = b0Var.b();
        for (int i12 = i11; i12 < b11; i12++) {
            e0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i12);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(b11, i11);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition.itemView;
            }
        }
    }

    public static e0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f5382a;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f5383b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + CoreConstants.DOT + str;
        }
    }

    private androidx.core.view.p getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new androidx.core.view.p(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j11, e0 e0Var, e0 e0Var2) {
        int g11 = this.mChildHelper.g();
        for (int i11 = 0; i11 < g11; i11++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i11));
            if (childViewHolderInt != e0Var && getChangedHolderKey(childViewHolderInt) == j11) {
                h hVar = this.mAdapter;
                if (hVar != null && hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + e0Var + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + e0Var + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + e0Var2 + " cannot be found but it is necessary for " + e0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int g11 = this.mChildHelper.g();
        for (int i11 = 0; i11 < g11; i11++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.f(i11));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private void initAutofill() {
        if (androidx.core.view.a0.E(this) == 0) {
            androidx.core.view.a0.H0(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.f(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i11) {
        int i12;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c11 = 65535;
        int i13 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i14 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i15 = rect2.left;
        if ((i14 < i15 || rect.right <= i15) && rect.right < rect2.right) {
            i12 = 1;
        } else {
            int i16 = rect.right;
            int i17 = rect2.right;
            i12 = ((i16 > i17 || i14 >= i17) && i14 > i15) ? -1 : 0;
        }
        int i18 = rect.top;
        int i19 = rect2.top;
        if ((i18 < i19 || rect.bottom <= i19) && rect.bottom < rect2.bottom) {
            c11 = 1;
        } else {
            int i21 = rect.bottom;
            int i22 = rect2.bottom;
            if ((i21 <= i22 && i18 < i22) || i18 <= i19) {
                c11 = 0;
            }
        }
        if (i11 == 1) {
            return c11 < 0 || (c11 == 0 && i12 * i13 < 0);
        } else if (i11 == 2) {
            return c11 > 0 || (c11 == 0 && i12 * i13 > 0);
        } else if (i11 == 17) {
            return i12 < 0;
        } else if (i11 == 33) {
            return c11 < 0;
        } else if (i11 == 66) {
            return i12 > 0;
        } else if (i11 == 130) {
            return c11 > 0;
        } else {
            throw new IllegalArgumentException("Invalid direction: " + i11 + exceptionLabel());
        }
    }

    private void nestedScrollByInternal(int i11, int i12, MotionEvent motionEvent, int i13) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean canScrollHorizontally = pVar.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            startNestedScroll(canScrollVertically ? canScrollHorizontally | 2 : canScrollHorizontally, i13);
            if (dispatchNestedPreScroll(canScrollHorizontally != 0 ? i11 : 0, canScrollVertically ? i12 : 0, this.mReusableIntPair, this.mScrollOffset, i13)) {
                int[] iArr2 = this.mReusableIntPair;
                i11 -= iArr2[0];
                i12 -= iArr2[1];
            }
            scrollByInternal(canScrollHorizontally != 0 ? i11 : 0, canScrollVertically ? i12 : 0, motionEvent, i13);
            androidx.recyclerview.widget.k kVar = this.mGapWorker;
            if (kVar != null && (i11 != 0 || i12 != 0)) {
                kVar.f(this, i11, i12);
            }
            stopNestedScroll(i13);
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i11 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i11);
            int x11 = (int) (motionEvent.getX(i11) + 0.5f);
            this.mLastTouchX = x11;
            this.mInitialTouchX = x11;
            int y11 = (int) (motionEvent.getY(i11) + 0.5f);
            this.mLastTouchY = y11;
            this.mInitialTouchY = y11;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z11;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.y();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.w();
        } else {
            this.mAdapterHelper.j();
        }
        boolean z12 = false;
        boolean z13 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f5356k = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z11 = this.mDataSetHasChangedAfterLayout) || z13 || this.mLayout.mRequestedSimpleAnimations) && (!z11 || this.mAdapter.hasStableIds());
        b0 b0Var = this.mState;
        if (b0Var.f5356k && z13 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z12 = true;
        }
        b0Var.f5357l = z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.h.c(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.h.c(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.h.c(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.h.c(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.view.a0.n0(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View findViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (IGNORE_DETACHED_FOCUSED_CHILD && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                if (this.mChildHelper.g() == 0) {
                    requestFocus();
                    return;
                }
            } else if (!this.mChildHelper.n(focusedChild)) {
                return;
            }
        }
        View view = null;
        e0 findViewHolderForItemId = (this.mState.f5359n == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f5359n);
        if (findViewHolderForItemId != null && !this.mChildHelper.n(findViewHolderForItemId.itemView) && findViewHolderForItemId.itemView.hasFocusable()) {
            view = findViewHolderForItemId.itemView;
        } else if (this.mChildHelper.g() > 0) {
            view = findNextViewToFocus();
        }
        if (view != null) {
            int i11 = this.mState.f5360o;
            if (i11 != -1 && (findViewById = view.findViewById(i11)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean z11;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z11 = this.mLeftGlow.isFinished();
        } else {
            z11 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z11 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z11 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z11 |= this.mBottomGlow.isFinished();
        }
        if (z11) {
            androidx.core.view.a0.n0(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f5384c) {
                Rect rect = qVar.f5383b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        b0 b0Var = this.mState;
        b0Var.f5359n = -1L;
        b0Var.f5358m = -1;
        b0Var.f5360o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int absoluteAdapterPosition;
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        e0 findContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (findContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f5359n = this.mAdapter.hasStableIds() ? findContainingViewHolder.getItemId() : -1L;
        b0 b0Var = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else {
            absoluteAdapterPosition = findContainingViewHolder.isRemoved() ? findContainingViewHolder.mOldPosition : findContainingViewHolder.getAbsoluteAdapterPosition();
        }
        b0Var.f5358m = absoluteAdapterPosition;
        this.mState.f5360o = getDeepestFocusedViewWithId(findContainingViewHolder.itemView);
    }

    private void setAdapterInternal(h hVar, boolean z11, boolean z12) {
        h hVar2 = this.mAdapter;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z11 || z12) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.y();
        h hVar3 = this.mAdapter;
        this.mAdapter = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.mObserver);
            hVar.onAttachedToRecyclerView(this);
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.onAdapterChanged(hVar3, this.mAdapter);
        }
        this.mRecycler.x(hVar3, this.mAdapter, z11);
        this.mState.f5352g = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.stop();
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.stopSmoothScroller();
        }
    }

    void absorbGlows(int i11, int i12) {
        if (i11 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i11);
            }
        }
        if (i12 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i12);
            }
        } else if (i12 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i12);
            }
        }
        if (i11 == 0 && i12 == 0) {
            return;
        }
        androidx.core.view.a0.n0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i11, int i12) {
        p pVar = this.mLayout;
        if (pVar == null || !pVar.onAddFocusables(this, arrayList, i11, i12)) {
            super.addFocusables(arrayList, i11, i12);
        }
    }

    public void addItemDecoration(o oVar, int i11) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i11 < 0) {
            this.mItemDecorations.add(oVar);
        } else {
            this.mItemDecorations.add(i11, oVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(r rVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(rVar);
    }

    public void addOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.add(tVar);
    }

    public void addOnScrollListener(u uVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(uVar);
    }

    public void addRecyclerListener(x xVar) {
        v3.h.b(xVar != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(xVar);
    }

    void animateAppearance(e0 e0Var, m.c cVar, m.c cVar2) {
        e0Var.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(e0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(e0 e0Var, m.c cVar, m.c cVar2) {
        addAnimatingView(e0Var);
        e0Var.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(e0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    boolean canReuseUpdatedViewHolder(e0 e0Var) {
        m mVar = this.mItemAnimator;
        return mVar == null || mVar.canReuseUpdatedViewHolder(e0Var, e0Var.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.mLayout.checkLayoutParams((q) layoutParams);
    }

    void clearOldPositions() {
        int j11 = this.mChildHelper.j();
        for (int i11 = 0; i11 < j11; i11++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i11));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.d();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        p pVar = this.mLayout;
        if (pVar != null && pVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    void considerReleasingGlowsOnScroll(int i11, int i12) {
        boolean z11;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i11 <= 0) {
            z11 = false;
        } else {
            this.mLeftGlow.onRelease();
            z11 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i11 < 0) {
            this.mRightGlow.onRelease();
            z11 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i12 > 0) {
            this.mTopGlow.onRelease();
            z11 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i12 < 0) {
            this.mBottomGlow.onRelease();
            z11 |= this.mBottomGlow.isFinished();
        }
        if (z11) {
            androidx.core.view.a0.n0(this);
        }
    }

    void consumePendingUpdateOperations() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout) {
            if (this.mAdapterHelper.p()) {
                if (this.mAdapterHelper.o(4) && !this.mAdapterHelper.o(11)) {
                    r3.m.a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                    startInterceptRequestLayout();
                    onEnterLayoutOrScroll();
                    this.mAdapterHelper.w();
                    if (!this.mLayoutWasDefered) {
                        if (hasUpdatedView()) {
                            dispatchLayout();
                        } else {
                            this.mAdapterHelper.i();
                        }
                    }
                    stopInterceptRequestLayout(true);
                    onExitLayoutOrScroll();
                    r3.m.b();
                    return;
                } else if (this.mAdapterHelper.p()) {
                    r3.m.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    r3.m.b();
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        r3.m.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
        dispatchLayout();
        r3.m.b();
    }

    void defaultOnMeasure(int i11, int i12) {
        setMeasuredDimension(p.chooseSize(i11, getPaddingLeft() + getPaddingRight(), androidx.core.view.a0.H(this)), p.chooseSize(i12, getPaddingTop() + getPaddingBottom(), androidx.core.view.a0.G(this)));
    }

    void dispatchChildAttached(View view) {
        e0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewAttachedToWindow(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).d(view);
            }
        }
    }

    void dispatchChildDetached(View view) {
        e0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        h hVar = this.mAdapter;
        if (hVar != null && childViewHolderInt != null) {
            hVar.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<r> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
        } else {
            this.mState.f5355j = false;
            boolean z11 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
            this.mLastAutoMeasureNonExactMeasuredWidth = 0;
            this.mLastAutoMeasureNonExactMeasuredHeight = 0;
            this.mLastAutoMeasureSkippedDueToExact = false;
            if (this.mState.f5350e == 1) {
                dispatchLayoutStep1();
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            } else if (!this.mAdapterHelper.q() && !z11 && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            }
            dispatchLayoutStep3();
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return getScrollingChildHelper().a(f11, f12, z11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f11, float f12) {
        return getScrollingChildHelper().b(f11, f12);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i11, i12, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return getScrollingChildHelper().f(i11, i12, i13, i14, iArr);
    }

    void dispatchOnScrollStateChanged(int i11) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.onScrollStateChanged(i11);
        }
        onScrollStateChanged(i11);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.onScrollStateChanged(this, i11);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i11);
            }
        }
    }

    void dispatchOnScrolled(int i11, int i12) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i11, scrollY - i12);
        onScrolled(i11, i12);
        u uVar = this.mScrollListener;
        if (uVar != null) {
            uVar.onScrolled(this, i11, i12);
        }
        List<u> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i11, i12);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i11;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            e0 e0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (e0Var.itemView.getParent() == this && !e0Var.shouldIgnore() && (i11 = e0Var.mPendingAccessibilityState) != -1) {
                androidx.core.view.a0.G0(e0Var.itemView, i11);
                e0Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z11;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z12 = false;
        for (int i11 = 0; i11 < size; i11++) {
            this.mItemDecorations.get(i11).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z13 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z11 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, BitmapDescriptorFactory.HUE_RED);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z11 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z11 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z11 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z12 = true;
            }
            z11 |= z12;
            canvas.restoreToCount(save4);
        }
        if (z11 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) {
            z13 = z11;
        }
        if (z13) {
            androidx.core.view.a0.n0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j11) {
        return super.drawChild(canvas, view, j11);
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect a11 = this.mEdgeEffectFactory.a(this, 3);
        this.mBottomGlow = a11;
        if (this.mClipToPadding) {
            a11.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a11.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect a11 = this.mEdgeEffectFactory.a(this, 0);
        this.mLeftGlow = a11;
        if (this.mClipToPadding) {
            a11.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a11.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect a11 = this.mEdgeEffectFactory.a(this, 2);
        this.mRightGlow = a11;
        if (this.mClipToPadding) {
            a11.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a11.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect a11 = this.mEdgeEffectFactory.a(this, 1);
        this.mTopGlow = a11;
        if (this.mClipToPadding) {
            a11.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a11.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    final void fillRemainingScrollValues(b0 b0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f5365c;
            b0Var.f5361p = overScroller.getFinalX() - overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        b0Var.f5361p = 0;
    }

    public View findChildViewUnder(float f11, float f12) {
        for (int g11 = this.mChildHelper.g() - 1; g11 >= 0; g11--) {
            View f13 = this.mChildHelper.f(g11);
            float translationX = f13.getTranslationX();
            float translationY = f13.getTranslationY();
            if (f11 >= f13.getLeft() + translationX && f11 <= f13.getRight() + translationX && f12 >= f13.getTop() + translationY && f12 <= f13.getBottom() + translationY) {
                return f13;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    public e0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public e0 findViewHolderForAdapterPosition(int i11) {
        e0 e0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int j11 = this.mChildHelper.j();
        for (int i12 = 0; i12 < j11; i12++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i12));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i11) {
                if (!this.mChildHelper.n(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                e0Var = childViewHolderInt;
            }
        }
        return e0Var;
    }

    public e0 findViewHolderForItemId(long j11) {
        h hVar = this.mAdapter;
        e0 e0Var = null;
        if (hVar != null && hVar.hasStableIds()) {
            int j12 = this.mChildHelper.j();
            for (int i11 = 0; i11 < j12; i11++) {
                e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i11));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j11) {
                    if (!this.mChildHelper.n(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    e0Var = childViewHolderInt;
                }
            }
        }
        return e0Var;
    }

    public e0 findViewHolderForLayoutPosition(int i11) {
        return findViewHolderForPosition(i11, false);
    }

    @Deprecated
    public e0 findViewHolderForPosition(int i11) {
        return findViewHolderForPosition(i11, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i11, int i12) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutSuppressed) {
            return false;
        } else {
            int canScrollHorizontally = pVar.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            if (canScrollHorizontally == 0 || Math.abs(i11) < this.mMinFlingVelocity) {
                i11 = 0;
            }
            if (!canScrollVertically || Math.abs(i12) < this.mMinFlingVelocity) {
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            float f11 = i11;
            float f12 = i12;
            if (!dispatchNestedPreFling(f11, f12)) {
                boolean z11 = canScrollHorizontally != 0 || canScrollVertically;
                dispatchNestedFling(f11, f12, z11);
                s sVar = this.mOnFlingListener;
                if (sVar != null && sVar.a(i11, i12)) {
                    return true;
                }
                if (z11) {
                    if (canScrollVertically) {
                        canScrollHorizontally = (canScrollHorizontally == true ? 1 : 0) | 2;
                    }
                    startNestedScroll(canScrollHorizontally, 1);
                    int i13 = this.mMaxFlingVelocity;
                    int max = Math.max(-i13, Math.min(i11, i13));
                    int i14 = this.mMaxFlingVelocity;
                    this.mViewFlinger.b(max, Math.max(-i14, Math.min(i12, i14)));
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i11) {
        View view2;
        boolean z11;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i11);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z12 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z12 && (i11 == 2 || i11 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i12 = i11 == 2 ? com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE : 33;
                z11 = focusFinder.findNextFocus(this, view, i12) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i11 = i12;
                }
            } else {
                z11 = false;
            }
            if (!z11 && this.mLayout.canScrollHorizontally()) {
                int i13 = (this.mLayout.getLayoutDirection() == 1) ^ (i11 == 2) ? 66 : 17;
                boolean z13 = focusFinder.findNextFocus(this, view, i13) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i11 = i13;
                }
                z11 = z13;
            }
            if (z11) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i11, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i11);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i11);
            if (findNextFocus == null && z12) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i11, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i11) ? view2 : super.focusSearch(view, i11);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i11);
        } else {
            requestChildOnScreen(view2, null);
            return view;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionInRecyclerView(e0 e0Var) {
        if (e0Var.hasAnyOfTheFlags(524) || !e0Var.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.e(e0Var.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.getBaseline();
        }
        return super.getBaseline();
    }

    long getChangedHolderKey(e0 e0Var) {
        return this.mAdapter.hasStableIds() ? e0Var.getItemId() : e0Var.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        e0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i11, int i12) {
        k kVar = this.mChildDrawingOrderCallback;
        if (kVar == null) {
            return super.getChildDrawingOrder(i11, i12);
        }
        return kVar.a(i11, i12);
    }

    public long getChildItemId(View view) {
        e0 childViewHolderInt;
        h hVar = this.mAdapter;
        if (hVar == null || !hVar.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        e0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public e0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return getChildViewHolderInt(view);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public androidx.recyclerview.widget.v getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public l getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public m getItemAnimator() {
        return this.mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f5384c) {
            return qVar.f5383b;
        }
        if (this.mState.e() && (qVar.b() || qVar.d())) {
            return qVar.f5383b;
        }
        Rect rect = qVar.f5383b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i11).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i12 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i12 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f5384c = false;
        return rect;
    }

    public o getItemDecorationAt(int i11) {
        int itemDecorationCount = getItemDecorationCount();
        if (i11 >= 0 && i11 < itemDecorationCount) {
            return this.mItemDecorations.get(i11);
        }
        throw new IndexOutOfBoundsException(i11 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public p getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public v getRecycledViewPool() {
        return this.mRecycler.i();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.p();
    }

    void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.a(new f());
    }

    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.j(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(s4.b.f50240a), resources.getDimensionPixelSize(s4.b.f50242c), resources.getDimensionPixelOffset(s4.b.f50241b));
            return;
        }
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        m mVar = this.mItemAnimator;
        return mVar != null && mVar.isRunning();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View, androidx.core.view.o
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    void jumpToPositionForSmoothScroller(int i11) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i11);
        awakenScrollBars();
    }

    void markItemDecorInsetsDirty() {
        int j11 = this.mChildHelper.j();
        for (int i11 = 0; i11 < j11; i11++) {
            ((q) this.mChildHelper.i(i11).getLayoutParams()).f5384c = true;
        }
        this.mRecycler.s();
    }

    void markKnownViewsInvalid() {
        int j11 = this.mChildHelper.j();
        for (int i11 = 0; i11 < j11; i11++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i11));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.t();
    }

    public void nestedScrollBy(int i11, int i12) {
        nestedScrollByInternal(i11, i12, null, 1);
    }

    public void offsetChildrenHorizontal(int i11) {
        int g11 = this.mChildHelper.g();
        for (int i12 = 0; i12 < g11; i12++) {
            this.mChildHelper.f(i12).offsetLeftAndRight(i11);
        }
    }

    public void offsetChildrenVertical(int i11) {
        int g11 = this.mChildHelper.g();
        for (int i12 = 0; i12 < g11; i12++) {
            this.mChildHelper.f(i12).offsetTopAndBottom(i11);
        }
    }

    void offsetPositionRecordsForInsert(int i11, int i12) {
        int j11 = this.mChildHelper.j();
        for (int i13 = 0; i13 < j11; i13++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i13));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i11) {
                childViewHolderInt.offsetPosition(i12, false);
                this.mState.f5352g = true;
            }
        }
        this.mRecycler.u(i11, i12);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int j11 = this.mChildHelper.j();
        if (i11 < i12) {
            i15 = -1;
            i14 = i11;
            i13 = i12;
        } else {
            i13 = i11;
            i14 = i12;
            i15 = 1;
        }
        for (int i17 = 0; i17 < j11; i17++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i17));
            if (childViewHolderInt != null && (i16 = childViewHolderInt.mPosition) >= i14 && i16 <= i13) {
                if (i16 == i11) {
                    childViewHolderInt.offsetPosition(i12 - i11, false);
                } else {
                    childViewHolderInt.offsetPosition(i15, false);
                }
                this.mState.f5352g = true;
            }
        }
        this.mRecycler.v(i11, i12);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i11, int i12, boolean z11) {
        int i13 = i11 + i12;
        int j11 = this.mChildHelper.j();
        for (int i14 = 0; i14 < j11; i14++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i14));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i15 = childViewHolderInt.mPosition;
                if (i15 >= i13) {
                    childViewHolderInt.offsetPosition(-i12, z11);
                    this.mState.f5352g = true;
                } else if (i15 >= i11) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i11 - 1, -i12, z11);
                    this.mState.f5352g = true;
                }
            }
        }
        this.mRecycler.w(i11, i12, z11);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z11 = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z11 = false;
        }
        this.mFirstLayoutComplete = z11;
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<androidx.recyclerview.widget.k> threadLocal = androidx.recyclerview.widget.k.f5611e;
            androidx.recyclerview.widget.k kVar = threadLocal.get();
            this.mGapWorker = kVar;
            if (kVar == null) {
                this.mGapWorker = new androidx.recyclerview.widget.k();
                Display y11 = androidx.core.view.a0.y(this);
                float f11 = 60.0f;
                if (!isInEditMode() && y11 != null) {
                    float refreshRate = y11.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f11 = refreshRate;
                    }
                }
                androidx.recyclerview.widget.k kVar2 = this.mGapWorker;
                kVar2.f5615c = 1.0E9f / f11;
                threadLocal.set(kVar2);
            }
            this.mGapWorker.a(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.k kVar;
        super.onDetachedFromWindow();
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.j();
        if (!ALLOW_THREAD_GAP_WORK || (kVar = this.mGapWorker) == null) {
            return;
        }
        kVar.j(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mItemDecorations.get(i11).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$p r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$p r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            return false;
        }
        boolean canScrollHorizontally = pVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x11 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x11;
            this.mInitialTouchX = x11;
            int y11 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y11;
            this.mInitialTouchY = y11;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i11 = canScrollHorizontally;
            if (canScrollVertically) {
                i11 = (canScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i11, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x12 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y12 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i12 = x12 - this.mInitialTouchX;
                int i13 = y12 - this.mInitialTouchY;
                if (!canScrollHorizontally || Math.abs(i12) <= this.mTouchSlop) {
                    z11 = false;
                } else {
                    this.mLastTouchX = x12;
                    z11 = true;
                }
                if (canScrollVertically && Math.abs(i13) > this.mTouchSlop) {
                    this.mLastTouchY = y12;
                    z11 = true;
                }
                if (z11) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x13 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x13;
            this.mInitialTouchX = x13;
            int y13 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y13;
            this.mInitialTouchY = y13;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        r3.m.a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        r3.m.b();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        p pVar = this.mLayout;
        if (pVar == null) {
            defaultOnMeasure(i11, i12);
            return;
        }
        boolean z11 = false;
        if (pVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i11, i12);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z11 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z11;
            if (z11 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f5350e == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i11, i12);
            this.mState.f5355j = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i11, i12);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f5355j = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i11, i12);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
        } else if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i11, i12);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                b0 b0Var = this.mState;
                if (b0Var.f5357l) {
                    b0Var.f5353h = true;
                } else {
                    this.mAdapterHelper.j();
                    this.mState.f5353h = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f5357l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            h hVar = this.mAdapter;
            if (hVar != null) {
                this.mState.f5351f = hVar.getItemCount();
            } else {
                this.mState.f5351f = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.onMeasure(this.mRecycler, this.mState, i11, i12);
            stopInterceptRequestLayout(false);
            this.mState.f5353h = false;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i11, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i11, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.mPendingSavedState = zVar;
        super.onRestoreInstanceState(zVar.a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.mPendingSavedState;
        if (zVar2 != null) {
            zVar.b(zVar2);
        } else {
            p pVar = this.mLayout;
            if (pVar != null) {
                zVar.f5401c = pVar.onSaveInstanceState();
            } else {
                zVar.f5401c = null;
            }
        }
        return zVar;
    }

    public void onScrollStateChanged(int i11) {
    }

    public void onScrolled(int i11, int i12) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 == i13 && i12 == i14) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        androidx.core.view.a0.o0(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    void processDataSetCompletelyChanged(boolean z11) {
        this.mDispatchItemsChangedEvent = z11 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void recordAnimationInfoIfBouncedHiddenView(e0 e0Var, m.c cVar) {
        e0Var.setFlags(0, PKIFailureInfo.certRevoked);
        if (this.mState.f5354i && e0Var.isUpdated() && !e0Var.isRemoved() && !e0Var.shouldIgnore()) {
            this.mViewInfoStore.c(getChangedHolderKey(e0Var), e0Var);
        }
        this.mViewInfoStore.e(e0Var, cVar);
    }

    public void removeAndRecycleViews() {
        m mVar = this.mItemAnimator;
        if (mVar != null) {
            mVar.endAnimations();
        }
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.c();
    }

    boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean r11 = this.mChildHelper.r(view);
        if (r11) {
            e0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.J(childViewHolderInt);
            this.mRecycler.C(childViewHolderInt);
        }
        stopInterceptRequestLayout(!r11);
        return r11;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z11) {
        e0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z11);
    }

    public void removeItemDecoration(o oVar) {
        p pVar = this.mLayout;
        if (pVar != null) {
            pVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(oVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i11) {
        int itemDecorationCount = getItemDecorationCount();
        if (i11 >= 0 && i11 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i11));
            return;
        }
        throw new IndexOutOfBoundsException(i11 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(r rVar) {
        List<r> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(rVar);
    }

    public void removeOnItemTouchListener(t tVar) {
        this.mOnItemTouchListeners.remove(tVar);
        if (this.mInterceptingOnItemTouchListener == tVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(u uVar) {
        List<u> list = this.mScrollListeners;
        if (list != null) {
            list.remove(uVar);
        }
    }

    public void removeRecyclerListener(x xVar) {
        this.mRecyclerListeners.remove(xVar);
    }

    void repositionShadowingViews() {
        e0 e0Var;
        int g11 = this.mChildHelper.g();
        for (int i11 = 0; i11 < g11; i11++) {
            View f11 = this.mChildHelper.f(i11);
            e0 childViewHolder = getChildViewHolder(f11);
            if (childViewHolder != null && (e0Var = childViewHolder.mShadowingHolder) != null) {
                View view = e0Var.itemView;
                int left = f11.getLeft();
                int top = f11.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z11) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        int size = this.mOnItemTouchListeners.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.mOnItemTouchListeners.get(i11).e(z11);
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    void saveOldPositions() {
        int j11 = this.mChildHelper.j();
        for (int i11 = 0; i11 < j11; i11++) {
            e0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.i(i11));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i11, int i12) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            boolean canScrollHorizontally = pVar.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            if (canScrollHorizontally || canScrollVertically) {
                if (!canScrollHorizontally) {
                    i11 = 0;
                }
                if (!canScrollVertically) {
                    i12 = 0;
                }
                scrollByInternal(i11, i12, null, 0);
            }
        }
    }

    boolean scrollByInternal(int i11, int i12, MotionEvent motionEvent, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i11, i12, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i18 = iArr2[0];
            int i19 = iArr2[1];
            i14 = i19;
            i15 = i18;
            i16 = i11 - i18;
            i17 = i12 - i19;
        } else {
            i14 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i15, i14, i16, i17, this.mScrollOffset, i13, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i21 = i16 - iArr4[0];
        int i22 = i17 - iArr4[1];
        boolean z11 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i23 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i23 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.n.b(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i21, motionEvent.getY(), i22);
            }
            considerReleasingGlowsOnScroll(i11, i12);
        }
        if (i15 != 0 || i14 != 0) {
            dispatchOnScrolled(i15, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z11 && i15 == 0 && i14 == 0) ? false : true;
    }

    void scrollStep(int i11, int i12, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        r3.m.a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int scrollHorizontallyBy = i11 != 0 ? this.mLayout.scrollHorizontallyBy(i11, this.mRecycler, this.mState) : 0;
        int scrollVerticallyBy = i12 != 0 ? this.mLayout.scrollVerticallyBy(i12, this.mRecycler, this.mState) : 0;
        r3.m.b();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i11, int i12) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i11) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        pVar.scrollToPosition(i11);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.v vVar) {
        this.mAccessibilityDelegate = vVar;
        androidx.core.view.a0.w0(this, vVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = kVar;
        setChildrenDrawingOrderEnabled(kVar != null);
    }

    boolean setChildImportantForAccessibilityInternal(e0 e0Var, int i11) {
        if (isComputingLayout()) {
            e0Var.mPendingAccessibilityState = i11;
            this.mPendingAccessibilityImportanceChange.add(e0Var);
            return false;
        }
        androidx.core.view.a0.G0(e0Var.itemView, i11);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z11) {
        if (z11 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z11;
        super.setClipToPadding(z11);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        v3.h.f(lVar);
        this.mEdgeEffectFactory = lVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z11) {
        this.mHasFixedSize = z11;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.mItemAnimator;
        if (mVar2 != null) {
            mVar2.endAnimations();
            this.mItemAnimator.setListener(null);
        }
        this.mItemAnimator = mVar;
        if (mVar != null) {
            mVar.setListener(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i11) {
        this.mRecycler.G(i11);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z11) {
        suppressLayout(z11);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            m mVar = this.mItemAnimator;
            if (mVar != null) {
                mVar.endAnimations();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.c();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.c();
        }
        this.mChildHelper.o();
        this.mLayout = pVar;
        if (pVar != null) {
            if (pVar.mRecyclerView == null) {
                pVar.setRecyclerView(this);
                if (this.mIsAttached) {
                    this.mLayout.dispatchAttachedToWindow(this);
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.mRecyclerView.exceptionLabel());
            }
        }
        this.mRecycler.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View, androidx.core.view.o
    public void setNestedScrollingEnabled(boolean z11) {
        getScrollingChildHelper().n(z11);
    }

    public void setOnFlingListener(s sVar) {
        this.mOnFlingListener = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.mScrollListener = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z11) {
        this.mPreserveFocusAfterLayout = z11;
    }

    public void setRecycledViewPool(v vVar) {
        this.mRecycler.E(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
        this.mRecyclerListener = xVar;
    }

    void setScrollState(int i11) {
        if (i11 == this.mScrollState) {
            return;
        }
        this.mScrollState = i11;
        if (i11 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i11);
    }

    public void setScrollingTouchSlop(int i11) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i11 != 0) {
            if (i11 != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i11 + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(c0 c0Var) {
        this.mRecycler.F(c0Var);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (isComputingLayout()) {
            int a11 = accessibilityEvent != null ? w3.b.a(accessibilityEvent) : 0;
            this.mEatenAccessibilityChangeFlags |= a11 != 0 ? a11 : 0;
            return true;
        }
        return false;
    }

    public void smoothScrollBy(int i11, int i12) {
        smoothScrollBy(i11, i12, null);
    }

    public void smoothScrollToPosition(int i11) {
        if (this.mLayoutSuppressed) {
            return;
        }
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.smoothScrollToPosition(this, this.mState, i11);
        }
    }

    void startInterceptRequestLayout() {
        int i11 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i11;
        if (i11 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i11) {
        return getScrollingChildHelper().p(i11);
    }

    void stopInterceptRequestLayout(boolean z11) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z11 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z11 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View, androidx.core.view.o
    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z11) {
        if (z11 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z11) {
                this.mLayoutSuppressed = false;
                if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(h hVar, boolean z11) {
        setLayoutFrozen(false);
        setAdapterInternal(hVar, true, z11);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    void viewRangeUpdate(int i11, int i12, Object obj) {
        int i13;
        int j11 = this.mChildHelper.j();
        int i14 = i11 + i12;
        for (int i15 = 0; i15 < j11; i15++) {
            View i16 = this.mChildHelper.i(i15);
            e0 childViewHolderInt = getChildViewHolderInt(i16);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i13 = childViewHolderInt.mPosition) >= i11 && i13 < i14) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((q) i16.getLayoutParams()).f5384c = true;
            }
        }
        this.mRecycler.M(i11, i12);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s4.a.f50239a);
    }

    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        return getScrollingChildHelper().d(i11, i12, iArr, iArr2, i13);
    }

    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr, int i15) {
        return getScrollingChildHelper().g(i11, i12, i13, i14, iArr, i15);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.RecyclerView.e0 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.f r0 = r5.mChildHelper
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.f r3 = r5.mChildHelper
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$e0 r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.f r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$e0");
    }

    public boolean hasNestedScrollingParent(int i11) {
        return getScrollingChildHelper().l(i11);
    }

    public void onExitLayoutOrScroll(boolean z11) {
        int i11 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i11;
        if (i11 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z11) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i11, int i12, Interpolator interpolator) {
        smoothScrollBy(i11, i12, interpolator, Integer.MIN_VALUE);
    }

    public boolean startNestedScroll(int i11, int i12) {
        return getScrollingChildHelper().q(i11, i12);
    }

    public void stopNestedScroll(int i11) {
        getScrollingChildHelper().s(i11);
    }

    /* loaded from: classes.dex */
    public static class z extends a4.a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* renamed from: c */
        Parcelable f5401c;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<z> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public z[] newArray(int i11) {
                return new z[i11];
            }
        }

        z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5401c = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        void b(z zVar) {
            this.f5401c = zVar.f5401c;
        }

        @Override // a4.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeParcelable(this.f5401c, 0);
        }

        z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.mObserver = new y();
        this.mRecycler = new w();
        this.mViewInfoStore = new androidx.recyclerview.widget.a0();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new l();
        this.mItemAnimator = new androidx.recyclerview.widget.g();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z11 = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new d0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new k.b() : null;
        this.mState = new b0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new n();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = androidx.core.view.c0.b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = androidx.core.view.c0.d(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (androidx.core.view.a0.D(this) == 0) {
            androidx.core.view.a0.G0(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.v(this));
        int[] iArr = s4.d.f50247a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, 0);
        androidx.core.view.a0.u0(this, context, iArr, attributeSet, obtainStyledAttributes, i11, 0);
        String string = obtainStyledAttributes.getString(s4.d.f50256j);
        if (obtainStyledAttributes.getInt(s4.d.f50250d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(s4.d.f50249c, true);
        boolean z12 = obtainStyledAttributes.getBoolean(s4.d.f50251e, false);
        this.mEnableFastScroller = z12;
        if (z12) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(s4.d.f50254h), obtainStyledAttributes.getDrawable(s4.d.f50255i), (StateListDrawable) obtainStyledAttributes.getDrawable(s4.d.f50252f), obtainStyledAttributes.getDrawable(s4.d.f50253g));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i11, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            int[] iArr2 = NESTED_SCROLLING_ATTRS;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i11, 0);
            androidx.core.view.a0.u0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i11, 0);
            z11 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z11);
    }

    public final void dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        getScrollingChildHelper().e(i11, i12, i13, i14, iArr, i15, iArr2);
    }

    public void smoothScrollBy(int i11, int i12, Interpolator interpolator, int i13) {
        smoothScrollBy(i11, i12, interpolator, i13, false);
    }

    /* loaded from: classes.dex */
    public static class q extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        e0 f5382a;

        /* renamed from: b */
        final Rect f5383b;

        /* renamed from: c */
        boolean f5384c;

        /* renamed from: d */
        boolean f5385d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5383b = new Rect();
            this.f5384c = true;
            this.f5385d = false;
        }

        public int a() {
            return this.f5382a.getLayoutPosition();
        }

        public boolean b() {
            return this.f5382a.isUpdated();
        }

        public boolean c() {
            return this.f5382a.isRemoved();
        }

        public boolean d() {
            return this.f5382a.isInvalid();
        }

        public q(int i11, int i12) {
            super(i11, i12);
            this.f5383b = new Rect();
            this.f5384c = true;
            this.f5385d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5383b = new Rect();
            this.f5384c = true;
            this.f5385d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5383b = new Rect();
            this.f5384c = true;
            this.f5385d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f5383b = new Rect();
            this.f5384c = true;
            this.f5385d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.mLayout;
        if (pVar != null) {
            return pVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    void smoothScrollBy(int i11, int i12, Interpolator interpolator, int i13, boolean z11) {
        p pVar = this.mLayout;
        if (pVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            if (!pVar.canScrollHorizontally()) {
                i11 = 0;
            }
            if (!this.mLayout.canScrollVertically()) {
                i12 = 0;
            }
            if (i11 == 0 && i12 == 0) {
                return;
            }
            if (i13 == Integer.MIN_VALUE || i13 > 0) {
                if (z11) {
                    int i14 = i11 != 0 ? 1 : 0;
                    if (i12 != 0) {
                        i14 |= 2;
                    }
                    startNestedScroll(i14, 1);
                }
                this.mViewFlinger.e(i11, i12, i13, interpolator);
                return;
            }
            scrollBy(i11, i12);
        }
    }

    public void addItemDecoration(o oVar) {
        addItemDecoration(oVar, -1);
    }
}