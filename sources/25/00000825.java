package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j extends RecyclerView.o implements RecyclerView.t {
    private static final int[] D = {16842919};
    private static final int[] E = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.u C;

    /* renamed from: a  reason: collision with root package name */
    private final int f5580a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5581b;

    /* renamed from: c  reason: collision with root package name */
    final StateListDrawable f5582c;

    /* renamed from: d  reason: collision with root package name */
    final Drawable f5583d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5584e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5585f;

    /* renamed from: g  reason: collision with root package name */
    private final StateListDrawable f5586g;

    /* renamed from: h  reason: collision with root package name */
    private final Drawable f5587h;

    /* renamed from: i  reason: collision with root package name */
    private final int f5588i;

    /* renamed from: j  reason: collision with root package name */
    private final int f5589j;

    /* renamed from: k  reason: collision with root package name */
    int f5590k;

    /* renamed from: l  reason: collision with root package name */
    int f5591l;

    /* renamed from: m  reason: collision with root package name */
    float f5592m;

    /* renamed from: n  reason: collision with root package name */
    int f5593n;

    /* renamed from: o  reason: collision with root package name */
    int f5594o;

    /* renamed from: p  reason: collision with root package name */
    float f5595p;

    /* renamed from: s  reason: collision with root package name */
    private RecyclerView f5598s;

    /* renamed from: z  reason: collision with root package name */
    final ValueAnimator f5605z;

    /* renamed from: q  reason: collision with root package name */
    private int f5596q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f5597r = 0;

    /* renamed from: t  reason: collision with root package name */
    private boolean f5599t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f5600u = false;

    /* renamed from: v  reason: collision with root package name */
    private int f5601v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f5602w = 0;

    /* renamed from: x  reason: collision with root package name */
    private final int[] f5603x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    private final int[] f5604y = new int[2];

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.m(500);
        }
    }

    /* loaded from: classes.dex */
    class b extends RecyclerView.u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            j.this.x(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* loaded from: classes.dex */
    private class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f5608a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5608a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f5608a) {
                this.f5608a = false;
            } else if (((Float) j.this.f5605z.getAnimatedValue()).floatValue() == BitmapDescriptorFactory.HUE_RED) {
                j jVar = j.this;
                jVar.A = 0;
                jVar.u(0);
            } else {
                j jVar2 = j.this;
                jVar2.A = 2;
                jVar2.r();
            }
        }
    }

    /* loaded from: classes.dex */
    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            j.this.f5582c.setAlpha(floatValue);
            j.this.f5583d.setAlpha(floatValue);
            j.this.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i11, int i12, int i13) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.f5605z = ofFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f5582c = stateListDrawable;
        this.f5583d = drawable;
        this.f5586g = stateListDrawable2;
        this.f5587h = drawable2;
        this.f5584e = Math.max(i11, stateListDrawable.getIntrinsicWidth());
        this.f5585f = Math.max(i11, drawable.getIntrinsicWidth());
        this.f5588i = Math.max(i11, stateListDrawable2.getIntrinsicWidth());
        this.f5589j = Math.max(i11, drawable2.getIntrinsicWidth());
        this.f5580a = i12;
        this.f5581b = i13;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        f(recyclerView);
    }

    private void g() {
        this.f5598s.removeCallbacks(this.B);
    }

    private void h() {
        this.f5598s.removeItemDecoration(this);
        this.f5598s.removeOnItemTouchListener(this);
        this.f5598s.removeOnScrollListener(this.C);
        g();
    }

    private void i(Canvas canvas) {
        int i11 = this.f5597r;
        int i12 = this.f5588i;
        int i13 = i11 - i12;
        int i14 = this.f5594o;
        int i15 = this.f5593n;
        int i16 = i14 - (i15 / 2);
        this.f5586g.setBounds(0, 0, i15, i12);
        this.f5587h.setBounds(0, 0, this.f5596q, this.f5589j);
        canvas.translate(BitmapDescriptorFactory.HUE_RED, i13);
        this.f5587h.draw(canvas);
        canvas.translate(i16, BitmapDescriptorFactory.HUE_RED);
        this.f5586g.draw(canvas);
        canvas.translate(-i16, -i13);
    }

    private void j(Canvas canvas) {
        int i11 = this.f5596q;
        int i12 = this.f5584e;
        int i13 = i11 - i12;
        int i14 = this.f5591l;
        int i15 = this.f5590k;
        int i16 = i14 - (i15 / 2);
        this.f5582c.setBounds(0, 0, i12, i15);
        this.f5583d.setBounds(0, 0, this.f5585f, this.f5597r);
        if (o()) {
            this.f5583d.draw(canvas);
            canvas.translate(this.f5584e, i16);
            canvas.scale(-1.0f, 1.0f);
            this.f5582c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-this.f5584e, -i16);
            return;
        }
        canvas.translate(i13, BitmapDescriptorFactory.HUE_RED);
        this.f5583d.draw(canvas);
        canvas.translate(BitmapDescriptorFactory.HUE_RED, i16);
        this.f5582c.draw(canvas);
        canvas.translate(-i13, -i16);
    }

    private int[] k() {
        int[] iArr = this.f5604y;
        int i11 = this.f5581b;
        iArr[0] = i11;
        iArr[1] = this.f5596q - i11;
        return iArr;
    }

    private int[] l() {
        int[] iArr = this.f5603x;
        int i11 = this.f5581b;
        iArr[0] = i11;
        iArr[1] = this.f5597r - i11;
        return iArr;
    }

    private void n(float f11) {
        int[] k11 = k();
        float max = Math.max(k11[0], Math.min(k11[1], f11));
        if (Math.abs(this.f5594o - max) < 2.0f) {
            return;
        }
        int t11 = t(this.f5595p, max, k11, this.f5598s.computeHorizontalScrollRange(), this.f5598s.computeHorizontalScrollOffset(), this.f5596q);
        if (t11 != 0) {
            this.f5598s.scrollBy(t11, 0);
        }
        this.f5595p = max;
    }

    private boolean o() {
        return androidx.core.view.a0.F(this.f5598s) == 1;
    }

    private void s(int i11) {
        g();
        this.f5598s.postDelayed(this.B, i11);
    }

    private int t(float f11, float f12, int[] iArr, int i11, int i12, int i13) {
        int i14 = iArr[1] - iArr[0];
        if (i14 == 0) {
            return 0;
        }
        int i15 = i11 - i13;
        int i16 = (int) (((f12 - f11) / i14) * i15);
        int i17 = i12 + i16;
        if (i17 >= i15 || i17 < 0) {
            return 0;
        }
        return i16;
    }

    private void v() {
        this.f5598s.addItemDecoration(this);
        this.f5598s.addOnItemTouchListener(this);
        this.f5598s.addOnScrollListener(this.C);
    }

    private void y(float f11) {
        int[] l11 = l();
        float max = Math.max(l11[0], Math.min(l11[1], f11));
        if (Math.abs(this.f5591l - max) < 2.0f) {
            return;
        }
        int t11 = t(this.f5592m, max, l11, this.f5598s.computeVerticalScrollRange(), this.f5598s.computeVerticalScrollOffset(), this.f5597r);
        if (t11 != 0) {
            this.f5598s.scrollBy(0, t11);
        }
        this.f5592m = max;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f5601v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean q11 = q(motionEvent.getX(), motionEvent.getY());
            boolean p11 = p(motionEvent.getX(), motionEvent.getY());
            if (q11 || p11) {
                if (p11) {
                    this.f5602w = 1;
                    this.f5595p = (int) motionEvent.getX();
                } else if (q11) {
                    this.f5602w = 2;
                    this.f5592m = (int) motionEvent.getY();
                }
                u(2);
            }
        } else if (motionEvent.getAction() == 1 && this.f5601v == 2) {
            this.f5592m = BitmapDescriptorFactory.HUE_RED;
            this.f5595p = BitmapDescriptorFactory.HUE_RED;
            u(1);
            this.f5602w = 0;
        } else if (motionEvent.getAction() == 2 && this.f5601v == 2) {
            w();
            if (this.f5602w == 1) {
                n(motionEvent.getX());
            }
            if (this.f5602w == 2) {
                y(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i11 = this.f5601v;
        if (i11 == 1) {
            boolean q11 = q(motionEvent.getX(), motionEvent.getY());
            boolean p11 = p(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!q11 && !p11) {
                return false;
            }
            if (p11) {
                this.f5602w = 1;
                this.f5595p = (int) motionEvent.getX();
            } else if (q11) {
                this.f5602w = 2;
                this.f5592m = (int) motionEvent.getY();
            }
            u(2);
        } else if (i11 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void e(boolean z11) {
    }

    public void f(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5598s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            h();
        }
        this.f5598s = recyclerView;
        if (recyclerView != null) {
            v();
        }
    }

    void m(int i11) {
        int i12 = this.A;
        if (i12 == 1) {
            this.f5605z.cancel();
        } else if (i12 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f5605z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), BitmapDescriptorFactory.HUE_RED);
        this.f5605z.setDuration(i11);
        this.f5605z.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (this.f5596q == this.f5598s.getWidth() && this.f5597r == this.f5598s.getHeight()) {
            if (this.A != 0) {
                if (this.f5599t) {
                    j(canvas);
                }
                if (this.f5600u) {
                    i(canvas);
                    return;
                }
                return;
            }
            return;
        }
        this.f5596q = this.f5598s.getWidth();
        this.f5597r = this.f5598s.getHeight();
        u(0);
    }

    boolean p(float f11, float f12) {
        if (f12 >= this.f5597r - this.f5588i) {
            int i11 = this.f5594o;
            int i12 = this.f5593n;
            if (f11 >= i11 - (i12 / 2) && f11 <= i11 + (i12 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean q(float f11, float f12) {
        if (!o() ? f11 >= this.f5596q - this.f5584e : f11 <= this.f5584e) {
            int i11 = this.f5591l;
            int i12 = this.f5590k;
            if (f12 >= i11 - (i12 / 2) && f12 <= i11 + (i12 / 2)) {
                return true;
            }
        }
        return false;
    }

    void r() {
        this.f5598s.invalidate();
    }

    void u(int i11) {
        if (i11 == 2 && this.f5601v != 2) {
            this.f5582c.setState(D);
            g();
        }
        if (i11 == 0) {
            r();
        } else {
            w();
        }
        if (this.f5601v == 2 && i11 != 2) {
            this.f5582c.setState(E);
            s(1200);
        } else if (i11 == 1) {
            s(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
        }
        this.f5601v = i11;
    }

    public void w() {
        int i11 = this.A;
        if (i11 != 0) {
            if (i11 != 3) {
                return;
            }
            this.f5605z.cancel();
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f5605z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f5605z.setDuration(500L);
        this.f5605z.setStartDelay(0L);
        this.f5605z.start();
    }

    void x(int i11, int i12) {
        int computeVerticalScrollRange = this.f5598s.computeVerticalScrollRange();
        int i13 = this.f5597r;
        this.f5599t = computeVerticalScrollRange - i13 > 0 && i13 >= this.f5580a;
        int computeHorizontalScrollRange = this.f5598s.computeHorizontalScrollRange();
        int i14 = this.f5596q;
        boolean z11 = computeHorizontalScrollRange - i14 > 0 && i14 >= this.f5580a;
        this.f5600u = z11;
        boolean z12 = this.f5599t;
        if (!z12 && !z11) {
            if (this.f5601v != 0) {
                u(0);
                return;
            }
            return;
        }
        if (z12) {
            float f11 = i13;
            this.f5591l = (int) ((f11 * (i12 + (f11 / 2.0f))) / computeVerticalScrollRange);
            this.f5590k = Math.min(i13, (i13 * i13) / computeVerticalScrollRange);
        }
        if (this.f5600u) {
            float f12 = i14;
            this.f5594o = (int) ((f12 * (i11 + (f12 / 2.0f))) / computeHorizontalScrollRange);
            this.f5593n = Math.min(i14, (i14 * i14) / computeHorizontalScrollRange);
        }
        int i15 = this.f5601v;
        if (i15 == 0 || i15 == 1) {
            u(1);
        }
    }
}