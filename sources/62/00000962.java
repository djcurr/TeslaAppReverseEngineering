package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.a0;
import androidx.core.view.l0;
import androidx.core.view.u;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public class b extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private int mActivePointerId;
    androidx.viewpager.widget.a mAdapter;
    private List<i> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private j mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<f> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private l mObserver;
    private int mOffscreenPageLimit;
    private j mOnPageChangeListener;
    private List<j> mOnPageChangeListeners;
    private int mPageMargin;
    private k mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final f mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {16842931};
    private static final Comparator<f> COMPARATOR = new a();
    private static final Interpolator sInterpolator = new animation.InterpolatorC0111b();
    private static final n sPositionComparator = new n();

    /* loaded from: classes.dex */
    static class a implements Comparator<f> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.f6379b - fVar2.f6379b;
        }
    }

    /* renamed from: androidx.viewpager.widget.b$b */
    /* loaded from: classes.dex */
    static class animation.InterpolatorC0111b implements Interpolator {
        animation.InterpolatorC0111b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12 = f11 - 1.0f;
            return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
            b.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.setScrollState(0);
            b.this.populate();
        }
    }

    /* loaded from: classes.dex */
    public class d implements u {

        /* renamed from: a */
        private final Rect f6376a = new Rect();

        d() {
            b.this = r1;
        }

        @Override // androidx.core.view.u
        public l0 a(View view, l0 l0Var) {
            l0 i02 = a0.i0(view, l0Var);
            if (i02.p()) {
                return i02;
            }
            Rect rect = this.f6376a;
            rect.left = i02.k();
            rect.top = i02.m();
            rect.right = i02.l();
            rect.bottom = i02.j();
            int childCount = b.this.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                l0 i12 = a0.i(b.this.getChildAt(i11), i02);
                rect.left = Math.min(i12.k(), rect.left);
                rect.top = Math.min(i12.m(), rect.top);
                rect.right = Math.min(i12.l(), rect.right);
                rect.bottom = Math.min(i12.j(), rect.bottom);
            }
            return i02.q(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface e {
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        Object f6378a;

        /* renamed from: b */
        int f6379b;

        /* renamed from: c */
        boolean f6380c;

        /* renamed from: d */
        float f6381d;

        /* renamed from: e */
        float f6382e;

        f() {
        }
    }

    /* loaded from: classes.dex */
    public class h extends androidx.core.view.a {
        h() {
            b.this = r1;
        }

        private boolean a() {
            androidx.viewpager.widget.a aVar = b.this.mAdapter;
            return aVar != null && aVar.getCount() > 1;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(b.class.getName());
            accessibilityEvent.setScrollable(a());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = b.this.mAdapter) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.getCount());
            accessibilityEvent.setFromIndex(b.this.mCurItem);
            accessibilityEvent.setToIndex(b.this.mCurItem);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            cVar.c0(b.class.getName());
            cVar.D0(a());
            if (b.this.canScrollHorizontally(1)) {
                cVar.a(4096);
            }
            if (b.this.canScrollHorizontally(-1)) {
                cVar.a(PKIFailureInfo.certRevoked);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            if (super.performAccessibilityAction(view, i11, bundle)) {
                return true;
            }
            if (i11 != 4096) {
                if (i11 == 8192 && b.this.canScrollHorizontally(-1)) {
                    b bVar = b.this;
                    bVar.setCurrentItem(bVar.mCurItem - 1);
                    return true;
                }
                return false;
            } else if (b.this.canScrollHorizontally(1)) {
                b bVar2 = b.this;
                bVar2.setCurrentItem(bVar2.mCurItem + 1);
                return true;
            } else {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(b bVar, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2);
    }

    /* loaded from: classes.dex */
    public interface j {
        void onPageScrollStateChanged(int i11);

        void onPageScrolled(int i11, float f11, int i12);

        void onPageSelected(int i11);
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(View view, float f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class l extends DataSetObserver {
        l() {
            b.this = r1;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            b.this.dataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            b.this.dataSetChanged();
        }
    }

    /* loaded from: classes.dex */
    public static class m extends a4.a {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: c */
        int f6391c;

        /* renamed from: d */
        Parcelable f6392d;

        /* renamed from: e */
        ClassLoader f6393e;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<m> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public m[] newArray(int i11) {
                return new m[i11];
            }
        }

        public m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f6391c + "}";
        }

        @Override // a4.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f6391c);
            parcel.writeParcelable(this.f6392d, i11);
        }

        m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? m.class.getClassLoader() : classLoader;
            this.f6391c = parcel.readInt();
            this.f6392d = parcel.readParcelable(classLoader);
            this.f6393e = classLoader;
        }
    }

    /* loaded from: classes.dex */
    public static class n implements Comparator<View> {
        n() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z11 = gVar.f6383a;
            if (z11 != gVar2.f6383a) {
                return z11 ? 1 : -1;
            }
            return gVar.f6387e - gVar2.f6387e;
        }
    }

    public b(Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new f();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new c();
        this.mScrollState = 0;
        initViewPager();
    }

    private void calculatePageOffsets(f fVar, int i11, f fVar2) {
        int i12;
        int i13;
        f fVar3;
        f fVar4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        float f11 = clientWidth > 0 ? this.mPageMargin / clientWidth : BitmapDescriptorFactory.HUE_RED;
        if (fVar2 != null) {
            int i14 = fVar2.f6379b;
            int i15 = fVar.f6379b;
            if (i14 < i15) {
                float f12 = fVar2.f6382e + fVar2.f6381d + f11;
                int i16 = i14 + 1;
                int i17 = 0;
                while (i16 <= fVar.f6379b && i17 < this.mItems.size()) {
                    f fVar5 = this.mItems.get(i17);
                    while (true) {
                        fVar4 = fVar5;
                        if (i16 <= fVar4.f6379b || i17 >= this.mItems.size() - 1) {
                            break;
                        }
                        i17++;
                        fVar5 = this.mItems.get(i17);
                    }
                    while (i16 < fVar4.f6379b) {
                        f12 += this.mAdapter.getPageWidth(i16) + f11;
                        i16++;
                    }
                    fVar4.f6382e = f12;
                    f12 += fVar4.f6381d + f11;
                    i16++;
                }
            } else if (i14 > i15) {
                int size = this.mItems.size() - 1;
                float f13 = fVar2.f6382e;
                while (true) {
                    i14--;
                    if (i14 < fVar.f6379b || size < 0) {
                        break;
                    }
                    f fVar6 = this.mItems.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i14 >= fVar3.f6379b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.mItems.get(size);
                    }
                    while (i14 > fVar3.f6379b) {
                        f13 -= this.mAdapter.getPageWidth(i14) + f11;
                        i14--;
                    }
                    f13 -= fVar3.f6381d + f11;
                    fVar3.f6382e = f13;
                }
            }
        }
        int size2 = this.mItems.size();
        float f14 = fVar.f6382e;
        int i18 = fVar.f6379b;
        int i19 = i18 - 1;
        this.mFirstOffset = i18 == 0 ? f14 : -3.4028235E38f;
        int i21 = count - 1;
        this.mLastOffset = i18 == i21 ? (fVar.f6381d + f14) - 1.0f : Float.MAX_VALUE;
        int i22 = i11 - 1;
        while (i22 >= 0) {
            f fVar7 = this.mItems.get(i22);
            while (true) {
                i13 = fVar7.f6379b;
                if (i19 <= i13) {
                    break;
                }
                f14 -= this.mAdapter.getPageWidth(i19) + f11;
                i19--;
            }
            f14 -= fVar7.f6381d + f11;
            fVar7.f6382e = f14;
            if (i13 == 0) {
                this.mFirstOffset = f14;
            }
            i22--;
            i19--;
        }
        float f15 = fVar.f6382e + fVar.f6381d + f11;
        int i23 = fVar.f6379b + 1;
        int i24 = i11 + 1;
        while (i24 < size2) {
            f fVar8 = this.mItems.get(i24);
            while (true) {
                i12 = fVar8.f6379b;
                if (i23 >= i12) {
                    break;
                }
                f15 += this.mAdapter.getPageWidth(i23) + f11;
                i23++;
            }
            if (i12 == i21) {
                this.mLastOffset = (fVar8.f6381d + f15) - 1.0f;
            }
            fVar8.f6382e = f15;
            f15 += fVar8.f6381d + f11;
            i24++;
            i23++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void completeScroll(boolean z11) {
        boolean z12 = this.mScrollState == 2;
        if (z12) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i11 = 0; i11 < this.mItems.size(); i11++) {
            f fVar = this.mItems.get(i11);
            if (fVar.f6380c) {
                fVar.f6380c = false;
                z12 = true;
            }
        }
        if (z12) {
            if (z11) {
                a0.o0(this, this.mEndScrollRunnable);
            } else {
                this.mEndScrollRunnable.run();
            }
        }
    }

    private int determineTargetPage(int i11, float f11, int i12, int i13) {
        if (Math.abs(i13) <= this.mFlingDistance || Math.abs(i12) <= this.mMinimumVelocity) {
            i11 += (int) (f11 + (i11 >= this.mCurItem ? 0.4f : 0.6f));
        } else if (i12 <= 0) {
            i11++;
        }
        if (this.mItems.size() > 0) {
            ArrayList<f> arrayList = this.mItems;
            return Math.max(this.mItems.get(0).f6379b, Math.min(i11, arrayList.get(arrayList.size() - 1).f6379b));
        }
        return i11;
    }

    private void dispatchOnPageScrolled(int i11, float f11, int i12) {
        j jVar = this.mOnPageChangeListener;
        if (jVar != null) {
            jVar.onPageScrolled(i11, f11, i12);
        }
        List<j> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                j jVar2 = this.mOnPageChangeListeners.get(i13);
                if (jVar2 != null) {
                    jVar2.onPageScrolled(i11, f11, i12);
                }
            }
        }
        j jVar3 = this.mInternalPageChangeListener;
        if (jVar3 != null) {
            jVar3.onPageScrolled(i11, f11, i12);
        }
    }

    private void dispatchOnPageSelected(int i11) {
        j jVar = this.mOnPageChangeListener;
        if (jVar != null) {
            jVar.onPageSelected(i11);
        }
        List<j> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = this.mOnPageChangeListeners.get(i12);
                if (jVar2 != null) {
                    jVar2.onPageSelected(i11);
                }
            }
        }
        j jVar3 = this.mInternalPageChangeListener;
        if (jVar3 != null) {
            jVar3.onPageSelected(i11);
        }
    }

    private void dispatchOnScrollStateChanged(int i11) {
        j jVar = this.mOnPageChangeListener;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i11);
        }
        List<j> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = this.mOnPageChangeListeners.get(i12);
                if (jVar2 != null) {
                    jVar2.onPageScrollStateChanged(i11);
                }
            }
        }
        j jVar3 = this.mInternalPageChangeListener;
        if (jVar3 != null) {
            jVar3.onPageScrollStateChanged(i11);
        }
    }

    private void enableLayers(boolean z11) {
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).setLayerType(z11 ? this.mPageTransformerLayerType : 0, null);
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private f infoForCurrentScrollPosition() {
        int i11;
        int clientWidth = getClientWidth();
        float f11 = BitmapDescriptorFactory.HUE_RED;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f12 = clientWidth > 0 ? this.mPageMargin / clientWidth : 0.0f;
        f fVar = null;
        int i12 = 0;
        int i13 = -1;
        boolean z11 = true;
        float f13 = 0.0f;
        while (i12 < this.mItems.size()) {
            f fVar2 = this.mItems.get(i12);
            if (!z11 && fVar2.f6379b != (i11 = i13 + 1)) {
                fVar2 = this.mTempItem;
                fVar2.f6382e = f11 + f13 + f12;
                fVar2.f6379b = i11;
                fVar2.f6381d = this.mAdapter.getPageWidth(i11);
                i12--;
            }
            f11 = fVar2.f6382e;
            float f14 = fVar2.f6381d + f11 + f12;
            if (!z11 && scrollX < f11) {
                return fVar;
            }
            if (scrollX < f14 || i12 == this.mItems.size() - 1) {
                return fVar2;
            }
            i13 = fVar2.f6379b;
            f13 = fVar2.f6381d;
            i12++;
            z11 = false;
            fVar = fVar2;
        }
        return fVar;
    }

    private static boolean isDecorView(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean isGutterDrag(float f11, float f12) {
        return (f11 < ((float) this.mGutterSize) && f12 > BitmapDescriptorFactory.HUE_RED) || (f11 > ((float) (getWidth() - this.mGutterSize)) && f12 < BitmapDescriptorFactory.HUE_RED);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i11 = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i11);
            this.mActivePointerId = motionEvent.getPointerId(i11);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int i11) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, BitmapDescriptorFactory.HUE_RED, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f infoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i12 = this.mPageMargin;
        int i13 = clientWidth + i12;
        float f11 = clientWidth;
        int i14 = infoForCurrentScrollPosition.f6379b;
        float f12 = ((i11 / f11) - infoForCurrentScrollPosition.f6382e) / (infoForCurrentScrollPosition.f6381d + (i12 / f11));
        this.mCalledSuper = false;
        onPageScrolled(i14, f12, (int) (i13 * f12));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean performDrag(float f11) {
        boolean z11;
        boolean z12;
        float f12 = this.mLastMotionX - f11;
        this.mLastMotionX = f11;
        float scrollX = getScrollX() + f12;
        float clientWidth = getClientWidth();
        float f13 = this.mFirstOffset * clientWidth;
        float f14 = this.mLastOffset * clientWidth;
        boolean z13 = false;
        f fVar = this.mItems.get(0);
        ArrayList<f> arrayList = this.mItems;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f6379b != 0) {
            f13 = fVar.f6382e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (fVar2.f6379b != this.mAdapter.getCount() - 1) {
            f14 = fVar2.f6382e * clientWidth;
            z12 = false;
        } else {
            z12 = true;
        }
        if (scrollX < f13) {
            if (z11) {
                this.mLeftEdge.onPull(Math.abs(f13 - scrollX) / clientWidth);
                z13 = true;
            }
            scrollX = f13;
        } else if (scrollX > f14) {
            if (z12) {
                this.mRightEdge.onPull(Math.abs(scrollX - f14) / clientWidth);
                z13 = true;
            }
            scrollX = f14;
        }
        int i11 = (int) scrollX;
        this.mLastMotionX += scrollX - i11;
        scrollTo(i11, getScrollY());
        pageScrolled(i11);
        return z13;
    }

    private void recomputeScrollPosition(int i11, int i12, int i13, int i14) {
        if (i12 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i12 - getPaddingLeft()) - getPaddingRight()) + i14)) * (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)), getScrollY());
                return;
            }
        }
        f infoForPosition = infoForPosition(this.mCurItem);
        int min = (int) ((infoForPosition != null ? Math.min(infoForPosition.f6382e, this.mLastOffset) : BitmapDescriptorFactory.HUE_RED) * ((i11 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            completeScroll(false);
            scrollTo(min, getScrollY());
        }
    }

    private void removeNonDecorViews() {
        int i11 = 0;
        while (i11 < getChildCount()) {
            if (!((g) getChildAt(i11).getLayoutParams()).f6383a) {
                removeViewAt(i11);
                i11--;
            }
            i11++;
        }
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z11) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z11);
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    private void scrollToItem(int i11, boolean z11, int i12, boolean z12) {
        f infoForPosition = infoForPosition(i11);
        int clientWidth = infoForPosition != null ? (int) (getClientWidth() * Math.max(this.mFirstOffset, Math.min(infoForPosition.f6382e, this.mLastOffset))) : 0;
        if (z11) {
            smoothScrollTo(clientWidth, 0, i12);
            if (z12) {
                dispatchOnPageSelected(i11);
                return;
            }
            return;
        }
        if (z12) {
            dispatchOnPageSelected(i11);
        }
        completeScroll(false);
        scrollTo(clientWidth, 0);
        pageScrolled(clientWidth);
    }

    private void setScrollingCacheEnabled(boolean z11) {
        if (this.mScrollingCacheEnabled != z11) {
            this.mScrollingCacheEnabled = z11;
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                this.mDrawingOrderedChildren.add(getChildAt(i11));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i11, int i12) {
        f infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f6379b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i11, i12);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i12 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    f addNewItem(int i11, int i12) {
        f fVar = new f();
        fVar.f6379b = i11;
        fVar.f6378a = this.mAdapter.instantiateItem((ViewGroup) this, i11);
        fVar.f6381d = this.mAdapter.getPageWidth(i11);
        if (i12 >= 0 && i12 < this.mItems.size()) {
            this.mItems.add(i12, fVar);
        } else {
            this.mItems.add(fVar);
        }
        return fVar;
    }

    public void addOnAdapterChangeListener(i iVar) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(iVar);
    }

    public void addOnPageChangeListener(j jVar) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(jVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f infoForChild;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f6379b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean isDecorView = gVar.f6383a | isDecorView(view);
        gVar.f6383a = isDecorView;
        if (!this.mInLayout) {
            super.addView(view, i11, layoutParams);
        } else if (!isDecorView) {
            gVar.f6386d = true;
            addViewInLayout(view, i11, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean arrowScroll(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto Lb
        L9:
            r0 = r3
            goto L69
        Lb:
            if (r0 == 0) goto L69
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r6) goto L19
            r4 = r1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = r2
        L1f:
            if (r4 != 0) goto L69
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L4e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L9
        L69:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lba
            if (r3 == r0) goto Lba
            if (r7 != r5) goto L9a
            android.graphics.Rect r1 = r6.mTempRect
            android.graphics.Rect r1 = r6.getChildRectInPagerCoordinates(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.mTempRect
            android.graphics.Rect r2 = r6.getChildRectInPagerCoordinates(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L94
            if (r1 < r2) goto L94
            boolean r0 = r6.pageLeft()
            goto L98
        L94:
            boolean r0 = r3.requestFocus()
        L98:
            r2 = r0
            goto Lcd
        L9a:
            if (r7 != r4) goto Lcd
            android.graphics.Rect r1 = r6.mTempRect
            android.graphics.Rect r1 = r6.getChildRectInPagerCoordinates(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.mTempRect
            android.graphics.Rect r2 = r6.getChildRectInPagerCoordinates(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto Lb5
            if (r1 > r2) goto Lb5
            boolean r0 = r6.pageRight()
            goto L98
        Lb5:
            boolean r0 = r3.requestFocus()
            goto L98
        Lba:
            if (r7 == r5) goto Lc9
            if (r7 != r1) goto Lbf
            goto Lc9
        Lbf:
            if (r7 == r4) goto Lc4
            r0 = 2
            if (r7 != r0) goto Lcd
        Lc4:
            boolean r2 = r6.pageRight()
            goto Lcd
        Lc9:
            boolean r2 = r6.pageLeft()
        Lcd:
            if (r2 == 0) goto Ld6
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Ld6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.b.arrowScroll(int):boolean");
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = BitmapDescriptorFactory.HUE_RED;
        this.mInitialMotionX = BitmapDescriptorFactory.HUE_RED;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    protected boolean canScroll(View view, boolean z11, int i11, int i12, int i13) {
        int i14;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i15 = i12 + scrollX;
                if (i15 >= childAt.getLeft() && i15 < childAt.getRight() && (i14 = i13 + scrollY) >= childAt.getTop() && i14 < childAt.getBottom() && canScroll(childAt, true, i11, i15 - childAt.getLeft(), i14 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z11 && view.canScrollHorizontally(-i11);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i11) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i11 < 0 ? scrollX > ((int) (((float) clientWidth) * this.mFirstOffset)) : i11 > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        List<j> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!pageScrolled(currX)) {
                    this.mScroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            a0.n0(this);
            return;
        }
        completeScroll(true);
    }

    void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z11 = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int i11 = this.mCurItem;
        int i12 = 0;
        boolean z12 = false;
        while (i12 < this.mItems.size()) {
            f fVar = this.mItems.get(i12);
            int itemPosition = this.mAdapter.getItemPosition(fVar.f6378a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i12);
                    i12--;
                    if (!z12) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z12 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, fVar.f6379b, fVar.f6378a);
                    int i13 = this.mCurItem;
                    if (i13 == fVar.f6379b) {
                        i11 = Math.max(0, Math.min(i13, count - 1));
                    }
                } else {
                    int i14 = fVar.f6379b;
                    if (i14 != itemPosition) {
                        if (i14 == this.mCurItem) {
                            i11 = itemPosition;
                        }
                        fVar.f6379b = itemPosition;
                    }
                }
                z11 = true;
            }
            i12++;
        }
        if (z12) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z11) {
            int childCount = getChildCount();
            for (int i15 = 0; i15 < childCount; i15++) {
                g gVar = (g) getChildAt(i15).getLayoutParams();
                if (!gVar.f6383a) {
                    gVar.f6385c = BitmapDescriptorFactory.HUE_RED;
                }
            }
            setCurrentItemInternal(i11, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f6379b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    float distanceInfluenceForSnapDuration(float f11) {
        return (float) Math.sin((f11 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z11 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (aVar = this.mAdapter) == null || aVar.getCount() <= 1)) {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        } else {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                z11 = false | this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                z11 |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z11) {
            a0.n0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                f infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f6379b, ((scrollX / clientWidth) - infoForCurrentScrollPosition.f6382e) / infoForCurrentScrollPosition.f6381d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            }
            endDrag();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                if (keyEvent.hasModifiers(2)) {
                    return pageLeft();
                }
                return arrowScroll(17);
            } else if (keyCode == 22) {
                if (keyEvent.hasModifiers(2)) {
                    return pageRight();
                }
                return arrowScroll(66);
            } else if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return arrowScroll(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return arrowScroll(1);
                }
            }
        }
        return false;
    }

    public void fakeDragBy(float f11) {
        ArrayList<f> arrayList;
        if (this.mFakeDragging) {
            if (this.mAdapter == null) {
                return;
            }
            this.mLastMotionX += f11;
            float scrollX = getScrollX() - f11;
            float clientWidth = getClientWidth();
            float f12 = this.mFirstOffset * clientWidth;
            float f13 = this.mLastOffset * clientWidth;
            f fVar = this.mItems.get(0);
            f fVar2 = this.mItems.get(arrayList.size() - 1);
            if (fVar.f6379b != 0) {
                f12 = fVar.f6382e * clientWidth;
            }
            if (fVar2.f6379b != this.mAdapter.getCount() - 1) {
                f13 = fVar2.f6382e * clientWidth;
            }
            if (scrollX < f12) {
                scrollX = f12;
            } else if (scrollX > f13) {
                scrollX = f13;
            }
            int i11 = (int) scrollX;
            this.mLastMotionX += scrollX - i11;
            scrollTo(i11, getScrollY());
            pageScrolled(i11);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, BitmapDescriptorFactory.HUE_RED, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i11, int i12) {
        if (this.mDrawingOrder == 2) {
            i12 = (i11 - 1) - i12;
        }
        return ((g) this.mDrawingOrderedChildren.get(i12).getLayoutParams()).f6388f;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    f infoForAnyChild(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return infoForChild(view);
            }
        }
    }

    f infoForChild(View view) {
        for (int i11 = 0; i11 < this.mItems.size(); i11++) {
            f fVar = this.mItems.get(i11);
            if (this.mAdapter.isViewFromObject(view, fVar.f6378a)) {
                return fVar;
            }
        }
        return null;
    }

    f infoForPosition(int i11) {
        for (int i12 = 0; i12 < this.mItems.size(); i12++) {
            f fVar = this.mItems.get(i12);
            if (fVar.f6379b == i11) {
                return fVar;
            }
        }
        return null;
    }

    void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f11 = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f11);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f11);
        this.mCloseEnough = (int) (2.0f * f11);
        this.mDefaultGutterSize = (int) (f11 * 16.0f);
        a0.w0(this, new h());
        if (a0.D(this) == 0) {
            a0.G0(this, 1);
        }
        a0.J0(this, new d());
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        int i11;
        float f11;
        float f12;
        super.onDraw(canvas);
        if (this.mPageMargin <= 0 || this.mMarginDrawable == null || this.mItems.size() <= 0 || this.mAdapter == null) {
            return;
        }
        int scrollX = getScrollX();
        float width2 = getWidth();
        float f13 = this.mPageMargin / width2;
        int i12 = 0;
        f fVar = this.mItems.get(0);
        float f14 = fVar.f6382e;
        int size = this.mItems.size();
        int i13 = fVar.f6379b;
        int i14 = this.mItems.get(size - 1).f6379b;
        while (i13 < i14) {
            while (true) {
                i11 = fVar.f6379b;
                if (i13 <= i11 || i12 >= size) {
                    break;
                }
                i12++;
                fVar = this.mItems.get(i12);
            }
            if (i13 == i11) {
                float f15 = fVar.f6382e;
                float f16 = fVar.f6381d;
                f11 = (f15 + f16) * width2;
                f14 = f15 + f16 + f13;
            } else {
                float pageWidth = this.mAdapter.getPageWidth(i13);
                f11 = (f14 + pageWidth) * width2;
                f14 += pageWidth + f13;
            }
            if (this.mPageMargin + f11 > scrollX) {
                f12 = f13;
                this.mMarginDrawable.setBounds(Math.round(f11), this.mTopPageBounds, Math.round(this.mPageMargin + f11), this.mBottomPageBounds);
                this.mMarginDrawable.draw(canvas);
            } else {
                f12 = f13;
            }
            if (f11 > scrollX + width) {
                return;
            }
            i13++;
            f13 = f12;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.mIsBeingDragged) {
                    return true;
                }
                if (this.mIsUnableToDrag) {
                    return false;
                }
            }
            if (action == 0) {
                float x11 = motionEvent.getX();
                this.mInitialMotionX = x11;
                this.mLastMotionX = x11;
                float y11 = motionEvent.getY();
                this.mInitialMotionY = y11;
                this.mLastMotionY = y11;
                this.mActivePointerId = motionEvent.getPointerId(0);
                this.mIsUnableToDrag = false;
                this.mIsScrollStarted = true;
                this.mScroller.computeScrollOffset();
                if (this.mScrollState == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                    this.mScroller.abortAnimation();
                    this.mPopulatePending = false;
                    populate();
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                } else {
                    completeScroll(false);
                    this.mIsBeingDragged = false;
                }
            } else if (action == 2) {
                int i11 = this.mActivePointerId;
                if (i11 != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    float x12 = motionEvent.getX(findPointerIndex);
                    float f11 = x12 - this.mLastMotionX;
                    float abs = Math.abs(f11);
                    float y12 = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y12 - this.mInitialMotionY);
                    int i12 = (f11 > BitmapDescriptorFactory.HUE_RED ? 1 : (f11 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    if (i12 != 0 && !isGutterDrag(this.mLastMotionX, f11) && canScroll(this, false, (int) f11, (int) x12, (int) y12)) {
                        this.mLastMotionX = x12;
                        this.mLastMotionY = y12;
                        this.mIsUnableToDrag = true;
                        return false;
                    }
                    int i13 = this.mTouchSlop;
                    if (abs > i13 && abs * 0.5f > abs2) {
                        this.mIsBeingDragged = true;
                        requestParentDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        float f12 = this.mInitialMotionX;
                        float f13 = this.mTouchSlop;
                        this.mLastMotionX = i12 > 0 ? f12 + f13 : f12 - f13;
                        this.mLastMotionY = y12;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > i13) {
                        this.mIsUnableToDrag = true;
                    }
                    if (this.mIsBeingDragged && performDrag(x12)) {
                        a0.n0(this);
                    }
                }
            } else if (action == 6) {
                onSecondaryPointerUp(motionEvent);
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            return this.mIsBeingDragged;
        }
        resetTouch();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.b.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        g gVar;
        g gVar2;
        int i13;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i11), ViewGroup.getDefaultSize(0, i12));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            boolean z11 = true;
            int i15 = 1073741824;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f6383a) {
                int i16 = gVar2.f6384b;
                int i17 = i16 & 7;
                int i18 = i16 & 112;
                boolean z12 = i18 == 48 || i18 == 80;
                if (i17 != 3 && i17 != 5) {
                    z11 = false;
                }
                int i19 = Integer.MIN_VALUE;
                if (z12) {
                    i13 = Integer.MIN_VALUE;
                    i19 = 1073741824;
                } else {
                    i13 = z11 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i21 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i21 != -2) {
                    if (i21 == -1) {
                        i21 = paddingLeft;
                    }
                    i19 = 1073741824;
                } else {
                    i21 = paddingLeft;
                }
                int i22 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i22 == -2) {
                    i22 = measuredHeight;
                    i15 = i13;
                } else if (i22 == -1) {
                    i22 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, i19), View.MeasureSpec.makeMeasureSpec(i22, i15));
                if (z12) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z11) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i14++;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i23 = 0; i23 < childCount2; i23++) {
            View childAt2 = getChildAt(i23);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f6383a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f6385c), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onPageScrolled(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.mDecorChildCount
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.b$g r9 = (androidx.viewpager.widget.b.g) r9
            boolean r10 = r9.f6383a
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.f6384b
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.dispatchOnPageScrolled(r13, r14, r15)
            androidx.viewpager.widget.b$k r13 = r12.mPageTransformer
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.b$g r0 = (androidx.viewpager.widget.b.g) r0
            boolean r0 = r0.f6383a
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.b$k r3 = r12.mPageTransformer
            r3.a(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.mCalledSuper = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.b.onPageScrolled(int, float, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i11, Rect rect) {
        int i12;
        int i13;
        f infoForChild;
        int childCount = getChildCount();
        int i14 = -1;
        if ((i11 & 2) != 0) {
            i14 = childCount;
            i12 = 0;
            i13 = 1;
        } else {
            i12 = childCount - 1;
            i13 = -1;
        }
        while (i12 != i14) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f6379b == this.mCurItem && childAt.requestFocus(i11, rect)) {
                return true;
            }
            i12 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.a());
        androidx.viewpager.widget.a aVar = this.mAdapter;
        if (aVar != null) {
            aVar.restoreState(mVar.f6392d, mVar.f6393e);
            setCurrentItemInternal(mVar.f6391c, false, true);
            return;
        }
        this.mRestoredCurItem = mVar.f6391c;
        this.mRestoredAdapterState = mVar.f6392d;
        this.mRestoredClassLoader = mVar.f6393e;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f6391c = this.mCurItem;
        androidx.viewpager.widget.a aVar = this.mAdapter;
        if (aVar != null) {
            mVar.f6392d = aVar.saveState();
        }
        return mVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 != i13) {
            int i15 = this.mPageMargin;
            recomputeScrollPosition(i11, i13, i15, i15);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.viewpager.widget.a aVar;
        if (this.mFakeDragging) {
            return true;
        }
        boolean z11 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.mAdapter) == null || aVar.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x11 = motionEvent.getX();
            this.mInitialMotionX = x11;
            this.mLastMotionX = x11;
            float y11 = motionEvent.getY();
            this.mInitialMotionY = y11;
            this.mLastMotionY = y11;
            this.mActivePointerId = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.mIsBeingDragged) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (findPointerIndex == -1) {
                        z11 = resetTouch();
                    } else {
                        float x12 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x12 - this.mLastMotionX);
                        float y12 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y12 - this.mLastMotionY);
                        if (abs > this.mTouchSlop && abs > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            float f11 = this.mInitialMotionX;
                            this.mLastMotionX = x12 - f11 > BitmapDescriptorFactory.HUE_RED ? f11 + this.mTouchSlop : f11 - this.mTouchSlop;
                            this.mLastMotionY = y12;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.mIsBeingDragged) {
                    z11 = false | performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.mLastMotionX = motionEvent.getX(actionIndex);
                    this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    onSecondaryPointerUp(motionEvent);
                    this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                }
            } else if (this.mIsBeingDragged) {
                scrollToItem(this.mCurItem, true, 0, false);
                z11 = resetTouch();
            }
        } else if (this.mIsBeingDragged) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            float f12 = clientWidth;
            setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f6379b, ((scrollX / f12) - infoForCurrentScrollPosition.f6382e) / (infoForCurrentScrollPosition.f6381d + (this.mPageMargin / f12)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
            z11 = resetTouch();
        }
        if (z11) {
            a0.n0(this);
        }
        return true;
    }

    boolean pageLeft() {
        int i11 = this.mCurItem;
        if (i11 > 0) {
            setCurrentItem(i11 - 1, true);
            return true;
        }
        return false;
    }

    boolean pageRight() {
        androidx.viewpager.widget.a aVar = this.mAdapter;
        if (aVar == null || this.mCurItem >= aVar.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    void populate() {
        populate(this.mCurItem);
    }

    public void removeOnAdapterChangeListener(i iVar) {
        List<i> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void removeOnPageChangeListener(j jVar) {
        List<j> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(jVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        androidx.viewpager.widget.a aVar2 = this.mAdapter;
        if (aVar2 != null) {
            aVar2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i11 = 0; i11 < this.mItems.size(); i11++) {
                f fVar = this.mItems.get(i11);
                this.mAdapter.destroyItem((ViewGroup) this, fVar.f6379b, fVar.f6378a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.mAdapter;
        this.mAdapter = aVar;
        this.mExpectedAdapterCount = 0;
        if (aVar != null) {
            if (this.mObserver == null) {
                this.mObserver = new l();
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z11 = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z11) {
                populate();
            } else {
                requestLayout();
            }
        }
        List<i> list = this.mAdapterChangeListeners;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.mAdapterChangeListeners.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.mAdapterChangeListeners.get(i12).a(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i11) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i11, !this.mFirstLayout, false);
    }

    void setCurrentItemInternal(int i11, boolean z11, boolean z12) {
        setCurrentItemInternal(i11, z11, z12, 0);
    }

    j setInternalPageChangeListener(j jVar) {
        j jVar2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = jVar;
        return jVar2;
    }

    public void setOffscreenPageLimit(int i11) {
        if (i11 < 1) {
            Log.w(TAG, "Requested offscreen page limit " + i11 + " too small; defaulting to 1");
            i11 = 1;
        }
        if (i11 != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i11;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.mOnPageChangeListener = jVar;
    }

    public void setPageMargin(int i11) {
        int i12 = this.mPageMargin;
        this.mPageMargin = i11;
        int width = getWidth();
        recomputeScrollPosition(width, width, i11, i12);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z11, k kVar) {
        setPageTransformer(z11, kVar, 2);
    }

    void setScrollState(int i11) {
        if (this.mScrollState == i11) {
            return;
        }
        this.mScrollState = i11;
        if (this.mPageTransformer != null) {
            enableLayers(i11 != 0);
        }
        dispatchOnScrollStateChanged(i11);
    }

    void smoothScrollTo(int i11, int i12) {
        smoothScrollTo(i11, i12, 0);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    /* loaded from: classes.dex */
    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f6383a;

        /* renamed from: b */
        public int f6384b;

        /* renamed from: c */
        float f6385c;

        /* renamed from: d */
        boolean f6386d;

        /* renamed from: e */
        int f6387e;

        /* renamed from: f */
        int f6388f;

        public g() {
            super(-1, -1);
            this.f6385c = BitmapDescriptorFactory.HUE_RED;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6385c = BitmapDescriptorFactory.HUE_RED;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.LAYOUT_ATTRS);
            this.f6384b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x0060, code lost:
        if (r9 == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0066, code lost:
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void populate(int r18) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.b.populate(int):void");
    }

    void setCurrentItemInternal(int i11, boolean z11, boolean z12, int i12) {
        androidx.viewpager.widget.a aVar = this.mAdapter;
        if (aVar != null && aVar.getCount() > 0) {
            if (!z12 && this.mCurItem == i11 && this.mItems.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i11 < 0) {
                i11 = 0;
            } else if (i11 >= this.mAdapter.getCount()) {
                i11 = this.mAdapter.getCount() - 1;
            }
            int i13 = this.mOffscreenPageLimit;
            int i14 = this.mCurItem;
            if (i11 > i14 + i13 || i11 < i14 - i13) {
                for (int i15 = 0; i15 < this.mItems.size(); i15++) {
                    this.mItems.get(i15).f6380c = true;
                }
            }
            boolean z13 = this.mCurItem != i11;
            if (this.mFirstLayout) {
                this.mCurItem = i11;
                if (z13) {
                    dispatchOnPageSelected(i11);
                }
                requestLayout();
                return;
            }
            populate(i11);
            scrollToItem(i11, z11, i12, z13);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public void setPageTransformer(boolean z11, k kVar, int i11) {
        boolean z12 = kVar != null;
        boolean z13 = z12 != (this.mPageTransformer != null);
        this.mPageTransformer = kVar;
        setChildrenDrawingOrderEnabled(z12);
        if (z12) {
            this.mDrawingOrder = z11 ? 2 : 1;
            this.mPageTransformerLayerType = i11;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z13) {
            populate();
        }
    }

    void smoothScrollTo(int i11, int i12, int i13) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i14 = scrollX;
        int scrollY = getScrollY();
        int i15 = i11 - i14;
        int i16 = i12 - scrollY;
        if (i15 == 0 && i16 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i17 = clientWidth / 2;
        float f11 = clientWidth;
        float f12 = i17;
        float distanceInfluenceForSnapDuration = f12 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i15) * 1.0f) / f11)) * f12);
        int abs2 = Math.abs(i13);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i15) / ((f11 * this.mAdapter.getPageWidth(this.mCurItem)) + this.mPageMargin)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, (int) MAX_SETTLE_DURATION);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i14, scrollY, i15, i16, min);
        a0.n0(this);
    }

    public void setCurrentItem(int i11, boolean z11) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i11, z11, false);
    }

    public void setPageMarginDrawable(int i11) {
        setPageMarginDrawable(androidx.core.content.b.getDrawable(getContext(), i11));
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new f();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new c();
        this.mScrollState = 0;
        initViewPager();
    }
}