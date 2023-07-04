package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.core.view.GestureDetectorCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
public class l extends RecyclerView.o implements RecyclerView.r {
    private g A;
    private Rect C;
    private long D;

    /* renamed from: d  reason: collision with root package name */
    float f5629d;

    /* renamed from: e  reason: collision with root package name */
    float f5630e;

    /* renamed from: f  reason: collision with root package name */
    private float f5631f;

    /* renamed from: g  reason: collision with root package name */
    private float f5632g;

    /* renamed from: h  reason: collision with root package name */
    float f5633h;

    /* renamed from: i  reason: collision with root package name */
    float f5634i;

    /* renamed from: j  reason: collision with root package name */
    private float f5635j;

    /* renamed from: k  reason: collision with root package name */
    private float f5636k;

    /* renamed from: m  reason: collision with root package name */
    f f5638m;

    /* renamed from: o  reason: collision with root package name */
    int f5640o;

    /* renamed from: q  reason: collision with root package name */
    private int f5642q;

    /* renamed from: r  reason: collision with root package name */
    RecyclerView f5643r;

    /* renamed from: t  reason: collision with root package name */
    VelocityTracker f5645t;

    /* renamed from: u  reason: collision with root package name */
    private List<RecyclerView.e0> f5646u;

    /* renamed from: v  reason: collision with root package name */
    private List<Integer> f5647v;

    /* renamed from: z  reason: collision with root package name */
    GestureDetectorCompat f5651z;

    /* renamed from: a  reason: collision with root package name */
    final List<View> f5626a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final float[] f5627b = new float[2];

    /* renamed from: c  reason: collision with root package name */
    RecyclerView.e0 f5628c = null;

    /* renamed from: l  reason: collision with root package name */
    int f5637l = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f5639n = 0;

    /* renamed from: p  reason: collision with root package name */
    List<h> f5641p = new ArrayList();

    /* renamed from: s  reason: collision with root package name */
    final Runnable f5644s = new a();

    /* renamed from: w  reason: collision with root package name */
    private RecyclerView.k f5648w = null;

    /* renamed from: x  reason: collision with root package name */
    View f5649x = null;

    /* renamed from: y  reason: collision with root package name */
    int f5650y = -1;
    private final RecyclerView.t B = new b();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = l.this;
            if (lVar.f5628c == null || !lVar.y()) {
                return;
            }
            l lVar2 = l.this;
            RecyclerView.e0 e0Var = lVar2.f5628c;
            if (e0Var != null) {
                lVar2.t(e0Var);
            }
            l lVar3 = l.this;
            lVar3.f5643r.removeCallbacks(lVar3.f5644s);
            androidx.core.view.a0.o0(l.this.f5643r, this);
        }
    }

    /* loaded from: classes.dex */
    class b implements RecyclerView.t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            l.this.f5651z.a(motionEvent);
            VelocityTracker velocityTracker = l.this.f5645t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (l.this.f5637l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(l.this.f5637l);
            if (findPointerIndex >= 0) {
                l.this.i(actionMasked, motionEvent, findPointerIndex);
            }
            l lVar = l.this;
            RecyclerView.e0 e0Var = lVar.f5628c;
            if (e0Var == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        lVar.E(motionEvent, lVar.f5640o, findPointerIndex);
                        l.this.t(e0Var);
                        l lVar2 = l.this;
                        lVar2.f5643r.removeCallbacks(lVar2.f5644s);
                        l.this.f5644s.run();
                        l.this.f5643r.invalidate();
                        return;
                    }
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    l lVar3 = l.this;
                    if (pointerId == lVar3.f5637l) {
                        lVar3.f5637l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        l lVar4 = l.this;
                        lVar4.E(motionEvent, lVar4.f5640o, actionIndex);
                        return;
                    }
                    return;
                } else {
                    VelocityTracker velocityTracker2 = lVar.f5645t;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                }
            }
            l.this.z(null, 0);
            l.this.f5637l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            h m11;
            l.this.f5651z.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                l.this.f5637l = motionEvent.getPointerId(0);
                l.this.f5629d = motionEvent.getX();
                l.this.f5630e = motionEvent.getY();
                l.this.u();
                l lVar = l.this;
                if (lVar.f5628c == null && (m11 = lVar.m(motionEvent)) != null) {
                    l lVar2 = l.this;
                    lVar2.f5629d -= m11.f5671i;
                    lVar2.f5630e -= m11.f5672j;
                    lVar2.l(m11.f5667e, true);
                    if (l.this.f5626a.remove(m11.f5667e.itemView)) {
                        l lVar3 = l.this;
                        lVar3.f5638m.clearView(lVar3.f5643r, m11.f5667e);
                    }
                    l.this.z(m11.f5667e, m11.f5668f);
                    l lVar4 = l.this;
                    lVar4.E(motionEvent, lVar4.f5640o, 0);
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i11 = l.this.f5637l;
                if (i11 != -1 && (findPointerIndex = motionEvent.findPointerIndex(i11)) >= 0) {
                    l.this.i(actionMasked, motionEvent, findPointerIndex);
                }
            } else {
                l lVar5 = l.this;
                lVar5.f5637l = -1;
                lVar5.z(null, 0);
            }
            VelocityTracker velocityTracker = l.this.f5645t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return l.this.f5628c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void e(boolean z11) {
            if (z11) {
                l.this.z(null, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends h {

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f5654n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ RecyclerView.e0 f5655o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(RecyclerView.e0 e0Var, int i11, int i12, float f11, float f12, float f13, float f14, int i13, RecyclerView.e0 e0Var2) {
            super(e0Var, i11, i12, f11, f12, f13, f14);
            this.f5654n = i13;
            this.f5655o = e0Var2;
        }

        @Override // androidx.recyclerview.widget.l.h, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f5673k) {
                return;
            }
            if (this.f5654n <= 0) {
                l lVar = l.this;
                lVar.f5638m.clearView(lVar.f5643r, this.f5655o);
            } else {
                l.this.f5626a.add(this.f5655o.itemView);
                this.f5670h = true;
                int i11 = this.f5654n;
                if (i11 > 0) {
                    l.this.v(this, i11);
                }
            }
            l lVar2 = l.this;
            View view = lVar2.f5649x;
            View view2 = this.f5655o.itemView;
            if (view == view2) {
                lVar2.x(view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f5657a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5658b;

        d(h hVar, int i11) {
            this.f5657a = hVar;
            this.f5658b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = l.this.f5643r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            h hVar = this.f5657a;
            if (hVar.f5673k || hVar.f5667e.getAbsoluteAdapterPosition() == -1) {
                return;
            }
            RecyclerView.m itemAnimator = l.this.f5643r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !l.this.r()) {
                l.this.f5638m.onSwiped(this.f5657a.f5667e, this.f5658b);
            } else {
                l.this.f5643r.post(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements RecyclerView.k {
        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k
        public int a(int i11, int i12) {
            l lVar = l.this;
            View view = lVar.f5649x;
            if (view == null) {
                return i12;
            }
            int i13 = lVar.f5650y;
            if (i13 == -1) {
                i13 = lVar.f5643r.indexOfChild(view);
                l.this.f5650y = i13;
            }
            return i12 == i11 + (-1) ? i13 : i12 < i13 ? i12 : i12 + 1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new a();
        private static final Interpolator sDragViewScrollCapInterpolator = new b();
        private int mCachedMaxScrollSpeed = -1;

        /* loaded from: classes.dex */
        class a implements Interpolator {
            a() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f11) {
                return f11 * f11 * f11 * f11 * f11;
            }
        }

        /* loaded from: classes.dex */
        class b implements Interpolator {
            b() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f11) {
                float f12 = f11 - 1.0f;
                return (f12 * f12 * f12 * f12 * f12) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i11, int i12) {
            int i13;
            int i14 = i11 & ABS_HORIZONTAL_DIR_FLAGS;
            if (i14 == 0) {
                return i11;
            }
            int i15 = i11 & (~i14);
            if (i12 == 0) {
                i13 = i14 << 2;
            } else {
                int i16 = i14 << 1;
                i15 |= (-789517) & i16;
                i13 = (i16 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i15 | i13;
        }

        public static m getDefaultUIUtil() {
            return n.f5677a;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(s4.b.f50243d);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i11, int i12) {
            return i12 << (i11 * 8);
        }

        public static int makeMovementFlags(int i11, int i12) {
            int makeFlag = makeFlag(0, i12 | i11);
            return makeFlag(2, i11) | makeFlag(1, i12) | makeFlag;
        }

        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            return true;
        }

        public RecyclerView.e0 chooseDropTarget(RecyclerView.e0 e0Var, List<RecyclerView.e0> list, int i11, int i12) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = i11 + e0Var.itemView.getWidth();
            int height = i12 + e0Var.itemView.getHeight();
            int left2 = i11 - e0Var.itemView.getLeft();
            int top2 = i12 - e0Var.itemView.getTop();
            int size = list.size();
            RecyclerView.e0 e0Var2 = null;
            int i13 = -1;
            for (int i14 = 0; i14 < size; i14++) {
                RecyclerView.e0 e0Var3 = list.get(i14);
                if (left2 > 0 && (right = e0Var3.itemView.getRight() - width) < 0 && e0Var3.itemView.getRight() > e0Var.itemView.getRight() && (abs4 = Math.abs(right)) > i13) {
                    e0Var2 = e0Var3;
                    i13 = abs4;
                }
                if (left2 < 0 && (left = e0Var3.itemView.getLeft() - i11) > 0 && e0Var3.itemView.getLeft() < e0Var.itemView.getLeft() && (abs3 = Math.abs(left)) > i13) {
                    e0Var2 = e0Var3;
                    i13 = abs3;
                }
                if (top2 < 0 && (top = e0Var3.itemView.getTop() - i12) > 0 && e0Var3.itemView.getTop() < e0Var.itemView.getTop() && (abs2 = Math.abs(top)) > i13) {
                    e0Var2 = e0Var3;
                    i13 = abs2;
                }
                if (top2 > 0 && (bottom = e0Var3.itemView.getBottom() - height) < 0 && e0Var3.itemView.getBottom() > e0Var.itemView.getBottom() && (abs = Math.abs(bottom)) > i13) {
                    e0Var2 = e0Var3;
                    i13 = abs;
                }
            }
            return e0Var2;
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            n.f5677a.a(e0Var.itemView);
        }

        public int convertToAbsoluteDirection(int i11, int i12) {
            int i13;
            int i14 = i11 & RELATIVE_DIR_FLAGS;
            if (i14 == 0) {
                return i11;
            }
            int i15 = i11 & (~i14);
            if (i12 == 0) {
                i13 = i14 >> 2;
            } else {
                int i16 = i14 >> 1;
                i15 |= (-3158065) & i16;
                i13 = (i16 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i15 | i13;
        }

        final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, e0Var), androidx.core.view.a0.F(recyclerView));
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i11, float f11, float f12) {
            RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i11 == 8 ? 200L : 250L;
            } else if (i11 == 8) {
                return itemAnimator.getMoveDuration();
            } else {
                return itemAnimator.getRemoveDuration();
            }
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(RecyclerView.e0 e0Var) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.e0 e0Var);

        public float getSwipeEscapeVelocity(float f11) {
            return f11;
        }

        public abstract float getSwipeThreshold(RecyclerView.e0 e0Var);

        public float getSwipeVelocityThreshold(float f11) {
            return f11;
        }

        boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return (getAbsoluteMovementFlags(recyclerView, e0Var) & 16711680) != 0;
        }

        boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return (getAbsoluteMovementFlags(recyclerView, e0Var) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) != 0;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i11, int i12, int i13, long j11) {
            int signum = (int) (((int) (((int) Math.signum(i12)) * getMaxDragScroll(recyclerView) * sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i12) * 1.0f) / i11)))) * sDragScrollInterpolator.getInterpolation(j11 <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS ? ((float) j11) / 2000.0f : 1.0f));
            return signum == 0 ? i12 > 0 ? 1 : -1 : signum;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, float f11, float f12, int i11, boolean z11) {
            n.f5677a.c(canvas, recyclerView, e0Var.itemView, f11, f12, i11, z11);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, float f11, float f12, int i11, boolean z11) {
            n.f5677a.d(canvas, recyclerView, e0Var.itemView, f11, f12, i11, z11);
        }

        void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, List<h> list, int i11, float f11, float f12) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                h hVar = list.get(i12);
                hVar.e();
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, hVar.f5667e, hVar.f5671i, hVar.f5672j, hVar.f5668f, false);
                canvas.restoreToCount(save);
            }
            if (e0Var != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, e0Var, f11, f12, i11, true);
                canvas.restoreToCount(save2);
            }
        }

        void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.e0 e0Var, List<h> list, int i11, float f11, float f12) {
            int size = list.size();
            boolean z11 = false;
            for (int i12 = 0; i12 < size; i12++) {
                h hVar = list.get(i12);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, hVar.f5667e, hVar.f5671i, hVar.f5672j, hVar.f5668f, false);
                canvas.restoreToCount(save);
            }
            if (e0Var != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, e0Var, f11, f12, i11, true);
                canvas.restoreToCount(save2);
            }
            for (int i13 = size - 1; i13 >= 0; i13--) {
                h hVar2 = list.get(i13);
                boolean z12 = hVar2.f5674l;
                if (z12 && !hVar2.f5670h) {
                    list.remove(i13);
                } else if (!z12) {
                    z11 = true;
                }
            }
            if (z11) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2);

        public void onMoved(RecyclerView recyclerView, RecyclerView.e0 e0Var, int i11, RecyclerView.e0 e0Var2, int i12, int i13, int i14) {
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof j) {
                ((j) layoutManager).prepareForDrop(e0Var.itemView, e0Var2.itemView, i13, i14);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(e0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i12);
                }
                if (layoutManager.getDecoratedRight(e0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i12);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(e0Var2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i12);
                }
                if (layoutManager.getDecoratedBottom(e0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i12);
                }
            }
        }

        public void onSelectedChanged(RecyclerView.e0 e0Var, int i11) {
            if (e0Var != null) {
                n.f5677a.b(e0Var.itemView);
            }
        }

        public abstract void onSwiped(RecyclerView.e0 e0Var, int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f5661a = true;

        g() {
        }

        void a() {
            this.f5661a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View n11;
            RecyclerView.e0 childViewHolder;
            if (!this.f5661a || (n11 = l.this.n(motionEvent)) == null || (childViewHolder = l.this.f5643r.getChildViewHolder(n11)) == null) {
                return;
            }
            l lVar = l.this;
            if (lVar.f5638m.hasDragFlag(lVar.f5643r, childViewHolder)) {
                int pointerId = motionEvent.getPointerId(0);
                int i11 = l.this.f5637l;
                if (pointerId == i11) {
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    float x11 = motionEvent.getX(findPointerIndex);
                    float y11 = motionEvent.getY(findPointerIndex);
                    l lVar2 = l.this;
                    lVar2.f5629d = x11;
                    lVar2.f5630e = y11;
                    lVar2.f5634i = BitmapDescriptorFactory.HUE_RED;
                    lVar2.f5633h = BitmapDescriptorFactory.HUE_RED;
                    if (lVar2.f5638m.isLongPressDragEnabled()) {
                        l.this.z(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final float f5663a;

        /* renamed from: b  reason: collision with root package name */
        final float f5664b;

        /* renamed from: c  reason: collision with root package name */
        final float f5665c;

        /* renamed from: d  reason: collision with root package name */
        final float f5666d;

        /* renamed from: e  reason: collision with root package name */
        final RecyclerView.e0 f5667e;

        /* renamed from: f  reason: collision with root package name */
        final int f5668f;

        /* renamed from: g  reason: collision with root package name */
        final ValueAnimator f5669g;

        /* renamed from: h  reason: collision with root package name */
        boolean f5670h;

        /* renamed from: i  reason: collision with root package name */
        float f5671i;

        /* renamed from: j  reason: collision with root package name */
        float f5672j;

        /* renamed from: k  reason: collision with root package name */
        boolean f5673k = false;

        /* renamed from: l  reason: collision with root package name */
        boolean f5674l = false;

        /* renamed from: m  reason: collision with root package name */
        private float f5675m;

        /* loaded from: classes.dex */
        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        h(RecyclerView.e0 e0Var, int i11, int i12, float f11, float f12, float f13, float f14) {
            this.f5668f = i12;
            this.f5667e = e0Var;
            this.f5663a = f11;
            this.f5664b = f12;
            this.f5665c = f13;
            this.f5666d = f14;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.f5669g = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(e0Var.itemView);
            ofFloat.addListener(this);
            c(BitmapDescriptorFactory.HUE_RED);
        }

        public void a() {
            this.f5669g.cancel();
        }

        public void b(long j11) {
            this.f5669g.setDuration(j11);
        }

        public void c(float f11) {
            this.f5675m = f11;
        }

        public void d() {
            this.f5667e.setIsRecyclable(false);
            this.f5669g.start();
        }

        public void e() {
            float f11 = this.f5663a;
            float f12 = this.f5665c;
            if (f11 == f12) {
                this.f5671i = this.f5667e.itemView.getTranslationX();
            } else {
                this.f5671i = f11 + (this.f5675m * (f12 - f11));
            }
            float f13 = this.f5664b;
            float f14 = this.f5666d;
            if (f13 == f14) {
                this.f5672j = this.f5667e.itemView.getTranslationY();
            } else {
                this.f5672j = f13 + (this.f5675m * (f14 - f13));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f5674l) {
                this.f5667e.setIsRecyclable(true);
            }
            this.f5674l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i extends f {
        private int mDefaultDragDirs;
        private int mDefaultSwipeDirs;

        public i(int i11, int i12) {
            this.mDefaultSwipeDirs = i12;
            this.mDefaultDragDirs = i11;
        }

        public int getDragDirs(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return this.mDefaultDragDirs;
        }

        @Override // androidx.recyclerview.widget.l.f
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return f.makeMovementFlags(getDragDirs(recyclerView, e0Var), getSwipeDirs(recyclerView, e0Var));
        }

        public int getSwipeDirs(RecyclerView recyclerView, RecyclerView.e0 e0Var) {
            return this.mDefaultSwipeDirs;
        }

        public void setDefaultDragDirs(int i11) {
            this.mDefaultDragDirs = i11;
        }

        public void setDefaultSwipeDirs(int i11) {
            this.mDefaultSwipeDirs = i11;
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        void prepareForDrop(View view, View view2, int i11, int i12);
    }

    public l(f fVar) {
        this.f5638m = fVar;
    }

    private void A() {
        this.f5642q = ViewConfiguration.get(this.f5643r.getContext()).getScaledTouchSlop();
        this.f5643r.addItemDecoration(this);
        this.f5643r.addOnItemTouchListener(this.B);
        this.f5643r.addOnChildAttachStateChangeListener(this);
        B();
    }

    private void B() {
        this.A = new g();
        this.f5651z = new GestureDetectorCompat(this.f5643r.getContext(), this.A);
    }

    private void C() {
        g gVar = this.A;
        if (gVar != null) {
            gVar.a();
            this.A = null;
        }
        if (this.f5651z != null) {
            this.f5651z = null;
        }
    }

    private int D(RecyclerView.e0 e0Var) {
        if (this.f5639n == 2) {
            return 0;
        }
        int movementFlags = this.f5638m.getMovementFlags(this.f5643r, e0Var);
        int convertToAbsoluteDirection = (this.f5638m.convertToAbsoluteDirection(movementFlags, androidx.core.view.a0.F(this.f5643r)) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) >> 8;
        if (convertToAbsoluteDirection == 0) {
            return 0;
        }
        int i11 = (movementFlags & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) >> 8;
        if (Math.abs(this.f5633h) > Math.abs(this.f5634i)) {
            int h11 = h(e0Var, convertToAbsoluteDirection);
            if (h11 > 0) {
                return (i11 & h11) == 0 ? f.convertToRelativeDirection(h11, androidx.core.view.a0.F(this.f5643r)) : h11;
            }
            int j11 = j(e0Var, convertToAbsoluteDirection);
            if (j11 > 0) {
                return j11;
            }
        } else {
            int j12 = j(e0Var, convertToAbsoluteDirection);
            if (j12 > 0) {
                return j12;
            }
            int h12 = h(e0Var, convertToAbsoluteDirection);
            if (h12 > 0) {
                return (i11 & h12) == 0 ? f.convertToRelativeDirection(h12, androidx.core.view.a0.F(this.f5643r)) : h12;
            }
        }
        return 0;
    }

    private void f() {
        if (Build.VERSION.SDK_INT >= 21) {
            return;
        }
        if (this.f5648w == null) {
            this.f5648w = new e();
        }
        this.f5643r.setChildDrawingOrderCallback(this.f5648w);
    }

    private int h(RecyclerView.e0 e0Var, int i11) {
        if ((i11 & 12) != 0) {
            int i12 = this.f5633h > BitmapDescriptorFactory.HUE_RED ? 8 : 4;
            VelocityTracker velocityTracker = this.f5645t;
            if (velocityTracker != null && this.f5637l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f5638m.getSwipeVelocityThreshold(this.f5632g));
                float xVelocity = this.f5645t.getXVelocity(this.f5637l);
                float yVelocity = this.f5645t.getYVelocity(this.f5637l);
                int i13 = xVelocity <= BitmapDescriptorFactory.HUE_RED ? 4 : 8;
                float abs = Math.abs(xVelocity);
                if ((i13 & i11) != 0 && i12 == i13 && abs >= this.f5638m.getSwipeEscapeVelocity(this.f5631f) && abs > Math.abs(yVelocity)) {
                    return i13;
                }
            }
            float width = this.f5643r.getWidth() * this.f5638m.getSwipeThreshold(e0Var);
            if ((i11 & i12) == 0 || Math.abs(this.f5633h) <= width) {
                return 0;
            }
            return i12;
        }
        return 0;
    }

    private int j(RecyclerView.e0 e0Var, int i11) {
        if ((i11 & 3) != 0) {
            int i12 = this.f5634i > BitmapDescriptorFactory.HUE_RED ? 2 : 1;
            VelocityTracker velocityTracker = this.f5645t;
            if (velocityTracker != null && this.f5637l > -1) {
                velocityTracker.computeCurrentVelocity(1000, this.f5638m.getSwipeVelocityThreshold(this.f5632g));
                float xVelocity = this.f5645t.getXVelocity(this.f5637l);
                float yVelocity = this.f5645t.getYVelocity(this.f5637l);
                int i13 = yVelocity <= BitmapDescriptorFactory.HUE_RED ? 1 : 2;
                float abs = Math.abs(yVelocity);
                if ((i13 & i11) != 0 && i13 == i12 && abs >= this.f5638m.getSwipeEscapeVelocity(this.f5631f) && abs > Math.abs(xVelocity)) {
                    return i13;
                }
            }
            float height = this.f5643r.getHeight() * this.f5638m.getSwipeThreshold(e0Var);
            if ((i11 & i12) == 0 || Math.abs(this.f5634i) <= height) {
                return 0;
            }
            return i12;
        }
        return 0;
    }

    private void k() {
        this.f5643r.removeItemDecoration(this);
        this.f5643r.removeOnItemTouchListener(this.B);
        this.f5643r.removeOnChildAttachStateChangeListener(this);
        for (int size = this.f5641p.size() - 1; size >= 0; size--) {
            h hVar = this.f5641p.get(0);
            hVar.a();
            this.f5638m.clearView(this.f5643r, hVar.f5667e);
        }
        this.f5641p.clear();
        this.f5649x = null;
        this.f5650y = -1;
        w();
        C();
    }

    private List<RecyclerView.e0> o(RecyclerView.e0 e0Var) {
        RecyclerView.e0 e0Var2 = e0Var;
        List<RecyclerView.e0> list = this.f5646u;
        if (list == null) {
            this.f5646u = new ArrayList();
            this.f5647v = new ArrayList();
        } else {
            list.clear();
            this.f5647v.clear();
        }
        int boundingBoxMargin = this.f5638m.getBoundingBoxMargin();
        int round = Math.round(this.f5635j + this.f5633h) - boundingBoxMargin;
        int round2 = Math.round(this.f5636k + this.f5634i) - boundingBoxMargin;
        int i11 = boundingBoxMargin * 2;
        int width = e0Var2.itemView.getWidth() + round + i11;
        int height = e0Var2.itemView.getHeight() + round2 + i11;
        int i12 = (round + width) / 2;
        int i13 = (round2 + height) / 2;
        RecyclerView.p layoutManager = this.f5643r.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = layoutManager.getChildAt(i14);
            if (childAt != e0Var2.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                RecyclerView.e0 childViewHolder = this.f5643r.getChildViewHolder(childAt);
                if (this.f5638m.canDropOver(this.f5643r, this.f5628c, childViewHolder)) {
                    int abs = Math.abs(i12 - ((childAt.getLeft() + childAt.getRight()) / 2));
                    int abs2 = Math.abs(i13 - ((childAt.getTop() + childAt.getBottom()) / 2));
                    int i15 = (abs * abs) + (abs2 * abs2);
                    int size = this.f5646u.size();
                    int i16 = 0;
                    for (int i17 = 0; i17 < size && i15 > this.f5647v.get(i17).intValue(); i17++) {
                        i16++;
                    }
                    this.f5646u.add(i16, childViewHolder);
                    this.f5647v.add(i16, Integer.valueOf(i15));
                }
            }
            i14++;
            e0Var2 = e0Var;
        }
        return this.f5646u;
    }

    private RecyclerView.e0 p(MotionEvent motionEvent) {
        View n11;
        RecyclerView.p layoutManager = this.f5643r.getLayoutManager();
        int i11 = this.f5637l;
        if (i11 == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i11);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f5629d);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f5630e);
        int i12 = this.f5642q;
        if (abs >= i12 || abs2 >= i12) {
            if (abs <= abs2 || !layoutManager.canScrollHorizontally()) {
                if ((abs2 <= abs || !layoutManager.canScrollVertically()) && (n11 = n(motionEvent)) != null) {
                    return this.f5643r.getChildViewHolder(n11);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    private void q(float[] fArr) {
        if ((this.f5640o & 12) != 0) {
            fArr[0] = (this.f5635j + this.f5633h) - this.f5628c.itemView.getLeft();
        } else {
            fArr[0] = this.f5628c.itemView.getTranslationX();
        }
        if ((this.f5640o & 3) != 0) {
            fArr[1] = (this.f5636k + this.f5634i) - this.f5628c.itemView.getTop();
        } else {
            fArr[1] = this.f5628c.itemView.getTranslationY();
        }
    }

    private static boolean s(View view, float f11, float f12, float f13, float f14) {
        return f11 >= f13 && f11 <= f13 + ((float) view.getWidth()) && f12 >= f14 && f12 <= f14 + ((float) view.getHeight());
    }

    private void w() {
        VelocityTracker velocityTracker = this.f5645t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5645t = null;
        }
    }

    void E(MotionEvent motionEvent, int i11, int i12) {
        float x11 = motionEvent.getX(i12);
        float y11 = motionEvent.getY(i12);
        float f11 = x11 - this.f5629d;
        this.f5633h = f11;
        this.f5634i = y11 - this.f5630e;
        if ((i11 & 4) == 0) {
            this.f5633h = Math.max((float) BitmapDescriptorFactory.HUE_RED, f11);
        }
        if ((i11 & 8) == 0) {
            this.f5633h = Math.min((float) BitmapDescriptorFactory.HUE_RED, this.f5633h);
        }
        if ((i11 & 1) == 0) {
            this.f5634i = Math.max((float) BitmapDescriptorFactory.HUE_RED, this.f5634i);
        }
        if ((i11 & 2) == 0) {
            this.f5634i = Math.min((float) BitmapDescriptorFactory.HUE_RED, this.f5634i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void b(View view) {
        x(view);
        RecyclerView.e0 childViewHolder = this.f5643r.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.e0 e0Var = this.f5628c;
        if (e0Var != null && childViewHolder == e0Var) {
            z(null, 0);
            return;
        }
        l(childViewHolder, false);
        if (this.f5626a.remove(childViewHolder.itemView)) {
            this.f5638m.clearView(this.f5643r, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void d(View view) {
    }

    public void g(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5643r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            k();
        }
        this.f5643r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f5631f = resources.getDimension(s4.b.f50245f);
            this.f5632g = resources.getDimension(s4.b.f50244e);
            A();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.setEmpty();
    }

    void i(int i11, MotionEvent motionEvent, int i12) {
        RecyclerView.e0 p11;
        int absoluteMovementFlags;
        if (this.f5628c != null || i11 != 2 || this.f5639n == 2 || !this.f5638m.isItemViewSwipeEnabled() || this.f5643r.getScrollState() == 1 || (p11 = p(motionEvent)) == null || (absoluteMovementFlags = (this.f5638m.getAbsoluteMovementFlags(this.f5643r, p11) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) >> 8) == 0) {
            return;
        }
        float x11 = motionEvent.getX(i12);
        float y11 = motionEvent.getY(i12);
        float f11 = x11 - this.f5629d;
        float f12 = y11 - this.f5630e;
        float abs = Math.abs(f11);
        float abs2 = Math.abs(f12);
        int i13 = this.f5642q;
        if (abs >= i13 || abs2 >= i13) {
            if (abs > abs2) {
                if (f11 < BitmapDescriptorFactory.HUE_RED && (absoluteMovementFlags & 4) == 0) {
                    return;
                }
                if (f11 > BitmapDescriptorFactory.HUE_RED && (absoluteMovementFlags & 8) == 0) {
                    return;
                }
            } else if (f12 < BitmapDescriptorFactory.HUE_RED && (absoluteMovementFlags & 1) == 0) {
                return;
            } else {
                if (f12 > BitmapDescriptorFactory.HUE_RED && (absoluteMovementFlags & 2) == 0) {
                    return;
                }
            }
            this.f5634i = BitmapDescriptorFactory.HUE_RED;
            this.f5633h = BitmapDescriptorFactory.HUE_RED;
            this.f5637l = motionEvent.getPointerId(0);
            z(p11, 1);
        }
    }

    void l(RecyclerView.e0 e0Var, boolean z11) {
        for (int size = this.f5641p.size() - 1; size >= 0; size--) {
            h hVar = this.f5641p.get(size);
            if (hVar.f5667e == e0Var) {
                hVar.f5673k |= z11;
                if (!hVar.f5674l) {
                    hVar.a();
                }
                this.f5641p.remove(size);
                return;
            }
        }
    }

    h m(MotionEvent motionEvent) {
        if (this.f5641p.isEmpty()) {
            return null;
        }
        View n11 = n(motionEvent);
        for (int size = this.f5641p.size() - 1; size >= 0; size--) {
            h hVar = this.f5641p.get(size);
            if (hVar.f5667e.itemView == n11) {
                return hVar;
            }
        }
        return null;
    }

    View n(MotionEvent motionEvent) {
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        RecyclerView.e0 e0Var = this.f5628c;
        if (e0Var != null) {
            View view = e0Var.itemView;
            if (s(view, x11, y11, this.f5635j + this.f5633h, this.f5636k + this.f5634i)) {
                return view;
            }
        }
        for (int size = this.f5641p.size() - 1; size >= 0; size--) {
            h hVar = this.f5641p.get(size);
            View view2 = hVar.f5667e.itemView;
            if (s(view2, x11, y11, hVar.f5671i, hVar.f5672j)) {
                return view2;
            }
        }
        return this.f5643r.findChildViewUnder(x11, y11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        float f11;
        float f12;
        this.f5650y = -1;
        if (this.f5628c != null) {
            q(this.f5627b);
            float[] fArr = this.f5627b;
            float f13 = fArr[0];
            f12 = fArr[1];
            f11 = f13;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        this.f5638m.onDraw(canvas, recyclerView, this.f5628c, this.f5641p, this.f5639n, f11, f12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        float f11;
        float f12;
        if (this.f5628c != null) {
            q(this.f5627b);
            float[] fArr = this.f5627b;
            float f13 = fArr[0];
            f12 = fArr[1];
            f11 = f13;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        this.f5638m.onDrawOver(canvas, recyclerView, this.f5628c, this.f5641p, this.f5639n, f11, f12);
    }

    boolean r() {
        int size = this.f5641p.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!this.f5641p.get(i11).f5674l) {
                return true;
            }
        }
        return false;
    }

    void t(RecyclerView.e0 e0Var) {
        if (!this.f5643r.isLayoutRequested() && this.f5639n == 2) {
            float moveThreshold = this.f5638m.getMoveThreshold(e0Var);
            int i11 = (int) (this.f5635j + this.f5633h);
            int i12 = (int) (this.f5636k + this.f5634i);
            if (Math.abs(i12 - e0Var.itemView.getTop()) >= e0Var.itemView.getHeight() * moveThreshold || Math.abs(i11 - e0Var.itemView.getLeft()) >= e0Var.itemView.getWidth() * moveThreshold) {
                List<RecyclerView.e0> o11 = o(e0Var);
                if (o11.size() == 0) {
                    return;
                }
                RecyclerView.e0 chooseDropTarget = this.f5638m.chooseDropTarget(e0Var, o11, i11, i12);
                if (chooseDropTarget == null) {
                    this.f5646u.clear();
                    this.f5647v.clear();
                    return;
                }
                int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = e0Var.getAbsoluteAdapterPosition();
                if (this.f5638m.onMove(this.f5643r, e0Var, chooseDropTarget)) {
                    this.f5638m.onMoved(this.f5643r, e0Var, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i11, i12);
                }
            }
        }
    }

    void u() {
        VelocityTracker velocityTracker = this.f5645t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f5645t = VelocityTracker.obtain();
    }

    void v(h hVar, int i11) {
        this.f5643r.post(new d(hVar, i11));
    }

    void x(View view) {
        if (view == this.f5649x) {
            this.f5649x = null;
            if (this.f5648w != null) {
                this.f5643r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
        if (r1 > 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean y() {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l.y():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void z(androidx.recyclerview.widget.RecyclerView.e0 r24, int r25) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l.z(androidx.recyclerview.widget.RecyclerView$e0, int):void");
    }
}