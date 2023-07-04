package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.core.view.a0;
import androidx.core.view.o;
import androidx.core.view.p;
import androidx.core.view.q;
import androidx.core.view.r;
import androidx.core.view.s;
import androidx.core.view.t;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class c extends ViewGroup implements r, q, o, s {
    private static final String V1 = c.class.getSimpleName();

    /* renamed from: b2  reason: collision with root package name */
    private static final int[] f6007b2 = {16842766};
    private int A;
    protected int B;
    float C;
    protected int E;
    int F;
    int G;
    androidx.swiperefreshlayout.widget.b H;
    private Animation K;
    private Animation L;
    private Animation O;
    private Animation P;
    private Animation Q;
    private final Animation Q1;
    boolean R;
    private int T;

    /* renamed from: a  reason: collision with root package name */
    private View f6008a;

    /* renamed from: b  reason: collision with root package name */
    j f6009b;

    /* renamed from: b1  reason: collision with root package name */
    boolean f6010b1;

    /* renamed from: c  reason: collision with root package name */
    boolean f6011c;

    /* renamed from: d  reason: collision with root package name */
    private int f6012d;

    /* renamed from: e  reason: collision with root package name */
    private float f6013e;

    /* renamed from: f  reason: collision with root package name */
    private float f6014f;

    /* renamed from: g  reason: collision with root package name */
    private final t f6015g;

    /* renamed from: g1  reason: collision with root package name */
    private i f6016g1;

    /* renamed from: h  reason: collision with root package name */
    private final p f6017h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f6018i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f6019j;

    /* renamed from: k  reason: collision with root package name */
    private final int[] f6020k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f6021l;

    /* renamed from: m  reason: collision with root package name */
    private int f6022m;

    /* renamed from: n  reason: collision with root package name */
    int f6023n;

    /* renamed from: o  reason: collision with root package name */
    private float f6024o;

    /* renamed from: p  reason: collision with root package name */
    private float f6025p;

    /* renamed from: p1  reason: collision with root package name */
    private boolean f6026p1;

    /* renamed from: q  reason: collision with root package name */
    private boolean f6027q;

    /* renamed from: t  reason: collision with root package name */
    private int f6028t;

    /* renamed from: w  reason: collision with root package name */
    boolean f6029w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f6030x;

    /* renamed from: x1  reason: collision with root package name */
    private Animation.AnimationListener f6031x1;

    /* renamed from: y  reason: collision with root package name */
    private final DecelerateInterpolator f6032y;

    /* renamed from: y1  reason: collision with root package name */
    private final Animation f6033y1;

    /* renamed from: z  reason: collision with root package name */
    androidx.swiperefreshlayout.widget.a f6034z;

    /* loaded from: classes.dex */
    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            c cVar = c.this;
            if (cVar.f6011c) {
                cVar.H.setAlpha(255);
                c.this.H.start();
                c cVar2 = c.this;
                if (cVar2.R && (jVar = cVar2.f6009b) != null) {
                    jVar.a();
                }
                c cVar3 = c.this;
                cVar3.f6023n = cVar3.f6034z.getTop();
                return;
            }
            cVar.r();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            c.this.setAnimationProgress(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0104c extends Animation {
        C0104c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            c.this.setAnimationProgress(1.0f - f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends Animation {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f6038a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f6039b;

        d(int i11, int i12) {
            this.f6038a = i11;
            this.f6039b = i12;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            androidx.swiperefreshlayout.widget.b bVar = c.this.H;
            int i11 = this.f6038a;
            bVar.setAlpha((int) (i11 + ((this.f6039b - i11) * f11)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            c cVar = c.this;
            if (cVar.f6029w) {
                return;
            }
            cVar.y(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            int i11;
            c cVar = c.this;
            if (!cVar.f6010b1) {
                i11 = cVar.F - Math.abs(cVar.E);
            } else {
                i11 = cVar.F;
            }
            c cVar2 = c.this;
            int i12 = cVar2.B;
            c.this.setTargetOffsetTopAndBottom((i12 + ((int) ((i11 - i12) * f11))) - cVar2.f6034z.getTop());
            c.this.H.e(1.0f - f11);
        }
    }

    /* loaded from: classes.dex */
    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            c.this.p(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f11, Transformation transformation) {
            c cVar = c.this;
            float f12 = cVar.C;
            cVar.setAnimationProgress(f12 + ((-f12) * f11));
            c.this.p(f11);
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        boolean a(c cVar, View view);
    }

    /* loaded from: classes.dex */
    public interface j {
        void a();
    }

    public c(Context context) {
        this(context, null);
    }

    private void A(Animation.AnimationListener animationListener) {
        this.f6034z.setVisibility(0);
        this.H.setAlpha(255);
        b bVar = new b();
        this.K = bVar;
        bVar.setDuration(this.f6022m);
        if (animationListener != null) {
            this.f6034z.b(animationListener);
        }
        this.f6034z.clearAnimation();
        this.f6034z.startAnimation(this.K);
    }

    private void b(int i11, Animation.AnimationListener animationListener) {
        this.B = i11;
        this.f6033y1.reset();
        this.f6033y1.setDuration(200L);
        this.f6033y1.setInterpolator(this.f6032y);
        if (animationListener != null) {
            this.f6034z.b(animationListener);
        }
        this.f6034z.clearAnimation();
        this.f6034z.startAnimation(this.f6033y1);
    }

    private void c(int i11, Animation.AnimationListener animationListener) {
        if (this.f6029w) {
            z(i11, animationListener);
            return;
        }
        this.B = i11;
        this.Q1.reset();
        this.Q1.setDuration(200L);
        this.Q1.setInterpolator(this.f6032y);
        if (animationListener != null) {
            this.f6034z.b(animationListener);
        }
        this.f6034z.clearAnimation();
        this.f6034z.startAnimation(this.Q1);
    }

    private void e() {
        this.f6034z = new androidx.swiperefreshlayout.widget.a(getContext());
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.H = bVar;
        bVar.l(1);
        this.f6034z.setImageDrawable(this.H);
        this.f6034z.setVisibility(8);
        addView(this.f6034z);
    }

    private void g() {
        if (this.f6008a == null) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (!childAt.equals(this.f6034z)) {
                    this.f6008a = childAt;
                    return;
                }
            }
        }
    }

    private void h(float f11) {
        if (f11 > this.f6013e) {
            t(true, true);
            return;
        }
        this.f6011c = false;
        this.H.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        c(this.f6023n, this.f6029w ? null : new e());
        this.H.d(false);
    }

    private boolean i(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void l(float f11) {
        this.H.d(true);
        float min = Math.min(1.0f, Math.abs(f11 / this.f6013e));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f11) - this.f6013e;
        int i11 = this.G;
        if (i11 <= 0) {
            if (this.f6010b1) {
                i11 = this.F - this.E;
            } else {
                i11 = this.F;
            }
        }
        float f12 = i11;
        double max2 = Math.max((float) BitmapDescriptorFactory.HUE_RED, Math.min(abs, f12 * 2.0f) / f12) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i12 = this.E + ((int) ((f12 * min) + (f12 * pow * 2.0f)));
        if (this.f6034z.getVisibility() != 0) {
            this.f6034z.setVisibility(0);
        }
        if (!this.f6029w) {
            this.f6034z.setScaleX(1.0f);
            this.f6034z.setScaleY(1.0f);
        }
        if (this.f6029w) {
            setAnimationProgress(Math.min(1.0f, f11 / this.f6013e));
        }
        if (f11 < this.f6013e) {
            if (this.H.getAlpha() > 76 && !i(this.O)) {
                x();
            }
        } else if (this.H.getAlpha() < 255 && !i(this.P)) {
            w();
        }
        this.H.j(BitmapDescriptorFactory.HUE_RED, Math.min(0.8f, max * 0.8f));
        this.H.e(Math.min(1.0f, max));
        this.H.g((((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i12 - this.f6023n);
    }

    private void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f6028t) {
            this.f6028t = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void setColorViewAlpha(int i11) {
        this.f6034z.getBackground().setAlpha(i11);
        this.H.setAlpha(i11);
    }

    private void t(boolean z11, boolean z12) {
        if (this.f6011c != z11) {
            this.R = z12;
            g();
            this.f6011c = z11;
            if (z11) {
                b(this.f6023n, this.f6031x1);
            } else {
                y(this.f6031x1);
            }
        }
    }

    private Animation u(int i11, int i12) {
        d dVar = new d(i11, i12);
        dVar.setDuration(300L);
        this.f6034z.b(null);
        this.f6034z.clearAnimation();
        this.f6034z.startAnimation(dVar);
        return dVar;
    }

    private void v(float f11) {
        float f12 = this.f6025p;
        int i11 = this.f6012d;
        if (f11 - f12 <= i11 || this.f6027q) {
            return;
        }
        this.f6024o = f12 + i11;
        this.f6027q = true;
        this.H.setAlpha(76);
    }

    private void w() {
        this.P = u(this.H.getAlpha(), 255);
    }

    private void x() {
        this.O = u(this.H.getAlpha(), 76);
    }

    private void z(int i11, Animation.AnimationListener animationListener) {
        this.B = i11;
        this.C = this.f6034z.getScaleX();
        h hVar = new h();
        this.Q = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f6034z.b(animationListener);
        }
        this.f6034z.clearAnimation();
        this.f6034z.startAnimation(this.Q);
    }

    @Override // androidx.core.view.q
    public void a(View view, View view2, int i11, int i12) {
        if (i12 == 0) {
            onNestedScrollAccepted(view, view2, i11);
        }
    }

    public boolean d() {
        i iVar = this.f6016g1;
        if (iVar != null) {
            return iVar.a(this, this.f6008a);
        }
        View view = this.f6008a;
        if (view instanceof ListView) {
            return androidx.core.widget.k.a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f11, float f12, boolean z11) {
        return this.f6017h.a(f11, f12, z11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f11, float f12) {
        return this.f6017h.b(f11, f12);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i11, int i12, int[] iArr, int[] iArr2) {
        return this.f6017h.c(i11, i12, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i11, int i12, int i13, int i14, int[] iArr) {
        return this.f6017h.f(i11, i12, i13, i14, iArr);
    }

    public void f(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        if (i15 == 0) {
            this.f6017h.e(i11, i12, i13, i14, iArr, i15, iArr2);
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i11, int i12) {
        int i13 = this.A;
        return i13 < 0 ? i12 : i12 == i11 + (-1) ? i13 : i12 >= i13 ? i12 + 1 : i12;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f6015g.a();
    }

    public int getProgressCircleDiameter() {
        return this.T;
    }

    public int getProgressViewEndOffset() {
        return this.F;
    }

    public int getProgressViewStartOffset() {
        return this.E;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f6017h.k();
    }

    @Override // android.view.View, androidx.core.view.o
    public boolean isNestedScrollingEnabled() {
        return this.f6017h.m();
    }

    @Override // androidx.core.view.q
    public void j(View view, int i11) {
        if (i11 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.q
    public void k(View view, int i11, int i12, int[] iArr, int i13) {
        if (i13 == 0) {
            onNestedPreScroll(view, i11, i12, iArr);
        }
    }

    @Override // androidx.core.view.r
    public void m(View view, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        if (i15 != 0) {
            return;
        }
        int i16 = iArr[1];
        f(i11, i12, i13, i14, this.f6019j, i15, iArr);
        int i17 = i14 - (iArr[1] - i16);
        int i18 = i17 == 0 ? i14 + this.f6019j[1] : i17;
        if (i18 >= 0 || d()) {
            return;
        }
        float abs = this.f6014f + Math.abs(i18);
        this.f6014f = abs;
        l(abs);
        iArr[1] = iArr[1] + i17;
    }

    @Override // androidx.core.view.q
    public void n(View view, int i11, int i12, int i13, int i14, int i15) {
        m(view, i11, i12, i13, i14, i15, this.f6020k);
    }

    @Override // androidx.core.view.q
    public boolean o(View view, View view2, int i11, int i12) {
        if (i12 == 0) {
            return onStartNestedScroll(view, view2, i11);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        g();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f6030x && actionMasked == 0) {
            this.f6030x = false;
        }
        if (!isEnabled() || this.f6030x || d() || this.f6011c || this.f6021l) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i11 = this.f6028t;
                    if (i11 == -1) {
                        Log.e(V1, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i11);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    v(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        q(motionEvent);
                    }
                }
            }
            this.f6027q = false;
            this.f6028t = -1;
        } else {
            setTargetOffsetTopAndBottom(this.E - this.f6034z.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f6028t = pointerId;
            this.f6027q = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f6025p = motionEvent.getY(findPointerIndex2);
        }
        return this.f6027q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f6008a == null) {
            g();
        }
        View view = this.f6008a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f6034z.getMeasuredWidth();
        int measuredHeight2 = this.f6034z.getMeasuredHeight();
        int i15 = measuredWidth / 2;
        int i16 = measuredWidth2 / 2;
        int i17 = this.f6023n;
        this.f6034z.layout(i15 - i16, i17, i15 + i16, measuredHeight2 + i17);
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.f6008a == null) {
            g();
        }
        View view = this.f6008a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f6034z.measure(View.MeasureSpec.makeMeasureSpec(this.T, 1073741824), View.MeasureSpec.makeMeasureSpec(this.T, 1073741824));
        this.A = -1;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            if (getChildAt(i13) == this.f6034z) {
                this.A = i13;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onNestedFling(View view, float f11, float f12, boolean z11) {
        return dispatchNestedFling(f11, f12, z11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onNestedPreFling(View view, float f11, float f12) {
        return dispatchNestedPreFling(f11, f12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        if (i12 > 0) {
            float f11 = this.f6014f;
            if (f11 > BitmapDescriptorFactory.HUE_RED) {
                float f12 = i12;
                if (f12 > f11) {
                    iArr[1] = (int) f11;
                    this.f6014f = BitmapDescriptorFactory.HUE_RED;
                } else {
                    this.f6014f = f11 - f12;
                    iArr[1] = i12;
                }
                l(this.f6014f);
            }
        }
        if (this.f6010b1 && i12 > 0 && this.f6014f == BitmapDescriptorFactory.HUE_RED && Math.abs(i12 - iArr[1]) > 0) {
            this.f6034z.setVisibility(8);
        }
        int[] iArr2 = this.f6018i;
        if (dispatchNestedPreScroll(i11 - iArr[0], i12 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        m(view, i11, i12, i13, i14, 0, this.f6020k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        this.f6015g.b(view, view2, i11);
        startNestedScroll(i11 & 2);
        this.f6014f = BitmapDescriptorFactory.HUE_RED;
        this.f6021l = true;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        setRefreshing(kVar.f6045a);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new k(super.onSaveInstanceState(), this.f6011c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        return (!isEnabled() || this.f6030x || this.f6011c || (i11 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.s
    public void onStopNestedScroll(View view) {
        this.f6015g.d(view);
        this.f6021l = false;
        float f11 = this.f6014f;
        if (f11 > BitmapDescriptorFactory.HUE_RED) {
            h(f11);
            this.f6014f = BitmapDescriptorFactory.HUE_RED;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f6030x && actionMasked == 0) {
            this.f6030x = false;
        }
        if (!isEnabled() || this.f6030x || d() || this.f6011c || this.f6021l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f6028t = motionEvent.getPointerId(0);
            this.f6027q = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f6028t);
            if (findPointerIndex < 0) {
                Log.e(V1, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f6027q) {
                this.f6027q = false;
                h((motionEvent.getY(findPointerIndex) - this.f6024o) * 0.5f);
            }
            this.f6028t = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f6028t);
            if (findPointerIndex2 < 0) {
                Log.e(V1, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y11 = motionEvent.getY(findPointerIndex2);
            v(y11);
            if (this.f6027q) {
                float f11 = (y11 - this.f6024o) * 0.5f;
                if (f11 <= BitmapDescriptorFactory.HUE_RED) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                l(f11);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(V1, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f6028t = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                q(motionEvent);
            }
        }
        return true;
    }

    void p(float f11) {
        int i11 = this.B;
        setTargetOffsetTopAndBottom((i11 + ((int) ((this.E - i11) * f11))) - this.f6034z.getTop());
    }

    void r() {
        this.f6034z.clearAnimation();
        this.H.stop();
        this.f6034z.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f6029w) {
            setAnimationProgress(BitmapDescriptorFactory.HUE_RED);
        } else {
            setTargetOffsetTopAndBottom(this.E - this.f6023n);
        }
        this.f6023n = this.f6034z.getTop();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        View view;
        ViewParent parent;
        if ((Build.VERSION.SDK_INT < 21 && (this.f6008a instanceof AbsListView)) || ((view = this.f6008a) != null && !a0.b0(view))) {
            if (this.f6026p1 || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z11);
            return;
        }
        super.requestDisallowInterceptTouchEvent(z11);
    }

    public void s(boolean z11, int i11, int i12) {
        this.f6029w = z11;
        this.E = i11;
        this.F = i12;
        this.f6010b1 = true;
        r();
        this.f6011c = false;
    }

    void setAnimationProgress(float f11) {
        this.f6034z.setScaleX(f11);
        this.f6034z.setScaleY(f11);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        g();
        this.H.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr2[i11] = androidx.core.content.b.getColor(context, iArr[i11]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i11) {
        this.f6013e = i11;
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        if (z11) {
            return;
        }
        r();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z11) {
        this.f6026p1 = z11;
    }

    @Override // android.view.View, androidx.core.view.o
    public void setNestedScrollingEnabled(boolean z11) {
        this.f6017h.n(z11);
    }

    public void setOnChildScrollUpCallback(i iVar) {
        this.f6016g1 = iVar;
    }

    public void setOnRefreshListener(j jVar) {
        this.f6009b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i11) {
        setProgressBackgroundColorSchemeResource(i11);
    }

    public void setProgressBackgroundColorSchemeColor(int i11) {
        this.f6034z.setBackgroundColor(i11);
    }

    public void setProgressBackgroundColorSchemeResource(int i11) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.b.getColor(getContext(), i11));
    }

    public void setRefreshing(boolean z11) {
        int i11;
        if (z11 && this.f6011c != z11) {
            this.f6011c = z11;
            if (!this.f6010b1) {
                i11 = this.F + this.E;
            } else {
                i11 = this.F;
            }
            setTargetOffsetTopAndBottom(i11 - this.f6023n);
            this.R = false;
            A(this.f6031x1);
            return;
        }
        t(z11, false);
    }

    public void setSize(int i11) {
        if (i11 == 0 || i11 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i11 == 0) {
                this.T = (int) (displayMetrics.density * 56.0f);
            } else {
                this.T = (int) (displayMetrics.density * 40.0f);
            }
            this.f6034z.setImageDrawable(null);
            this.H.l(i11);
            this.f6034z.setImageDrawable(this.H);
        }
    }

    public void setSlingshotDistance(int i11) {
        this.G = i11;
    }

    void setTargetOffsetTopAndBottom(int i11) {
        this.f6034z.bringToFront();
        a0.h0(this.f6034z, i11);
        this.f6023n = this.f6034z.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i11) {
        return this.f6017h.p(i11);
    }

    @Override // android.view.View, androidx.core.view.o
    public void stopNestedScroll() {
        this.f6017h.r();
    }

    void y(Animation.AnimationListener animationListener) {
        C0104c c0104c = new C0104c();
        this.L = c0104c;
        c0104c.setDuration(150L);
        this.f6034z.b(animationListener);
        this.f6034z.clearAnimation();
        this.f6034z.startAnimation(this.L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class k extends View.BaseSavedState {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        final boolean f6045a;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<k> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public k[] newArray(int i11) {
                return new k[i11];
            }
        }

        k(Parcelable parcelable, boolean z11) {
            super(parcelable);
            this.f6045a = z11;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeByte(this.f6045a ? (byte) 1 : (byte) 0);
        }

        k(Parcel parcel) {
            super(parcel);
            this.f6045a = parcel.readByte() != 0;
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6011c = false;
        this.f6013e = -1.0f;
        this.f6018i = new int[2];
        this.f6019j = new int[2];
        this.f6020k = new int[2];
        this.f6028t = -1;
        this.A = -1;
        this.f6031x1 = new a();
        this.f6033y1 = new f();
        this.Q1 = new g();
        this.f6012d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f6022m = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f6032y = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.T = (int) (displayMetrics.density * 40.0f);
        e();
        setChildrenDrawingOrderEnabled(true);
        int i11 = (int) (displayMetrics.density * 64.0f);
        this.F = i11;
        this.f6013e = i11;
        this.f6015g = new t(this);
        this.f6017h = new p(this);
        setNestedScrollingEnabled(true);
        int i12 = -this.T;
        this.f6023n = i12;
        this.E = i12;
        p(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6007b2);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
}