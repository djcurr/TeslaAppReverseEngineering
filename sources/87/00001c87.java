package com.google.android.exoplayer2.ui;

import ak.k0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.google.android.exoplayer2.ui.i;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import yj.k;

/* loaded from: classes3.dex */
public class DefaultTimeBar extends View implements i {
    private final Runnable A;
    private final CopyOnWriteArraySet<i.a> B;
    private final Point C;
    private final float E;
    private int F;
    private long G;
    private int H;
    private Rect K;
    private ValueAnimator L;
    private float O;
    private boolean P;
    private boolean Q;
    private long R;
    private long T;

    /* renamed from: a */
    private final Rect f14428a;

    /* renamed from: b */
    private final Rect f14429b;

    /* renamed from: b1 */
    private long f14430b1;

    /* renamed from: c */
    private final Rect f14431c;

    /* renamed from: d */
    private final Rect f14432d;

    /* renamed from: e */
    private final Paint f14433e;

    /* renamed from: f */
    private final Paint f14434f;

    /* renamed from: g */
    private final Paint f14435g;

    /* renamed from: g1 */
    private long f14436g1;

    /* renamed from: h */
    private final Paint f14437h;

    /* renamed from: i */
    private final Paint f14438i;

    /* renamed from: j */
    private final Paint f14439j;

    /* renamed from: k */
    private final Drawable f14440k;

    /* renamed from: l */
    private final int f14441l;

    /* renamed from: m */
    private final int f14442m;

    /* renamed from: n */
    private final int f14443n;

    /* renamed from: o */
    private final int f14444o;

    /* renamed from: p */
    private final int f14445p;

    /* renamed from: p1 */
    private int f14446p1;

    /* renamed from: q */
    private final int f14447q;

    /* renamed from: t */
    private final int f14448t;

    /* renamed from: w */
    private final int f14449w;

    /* renamed from: x */
    private final int f14450x;

    /* renamed from: x1 */
    private long[] f14451x1;

    /* renamed from: y */
    private final StringBuilder f14452y;

    /* renamed from: y1 */
    private boolean[] f14453y1;

    /* renamed from: z */
    private final Formatter f14454z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ void c(DefaultTimeBar defaultTimeBar) {
        defaultTimeBar.i();
    }

    public static /* synthetic */ void d(DefaultTimeBar defaultTimeBar, ValueAnimator valueAnimator) {
        defaultTimeBar.j(valueAnimator);
    }

    private static int e(float f11, int i11) {
        return (int) ((i11 * f11) + 0.5f);
    }

    private void f(Canvas canvas) {
        int i11;
        if (this.T <= 0) {
            return;
        }
        Rect rect = this.f14432d;
        int r11 = k0.r(rect.right, rect.left, this.f14429b.right);
        int centerY = this.f14432d.centerY();
        Drawable drawable = this.f14440k;
        if (drawable == null) {
            if (!this.Q && !isFocused()) {
                i11 = isEnabled() ? this.f14445p : this.f14447q;
            } else {
                i11 = this.f14448t;
            }
            canvas.drawCircle(r11, centerY, (int) ((i11 * this.O) / 2.0f), this.f14439j);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.O)) / 2;
        int intrinsicHeight = ((int) (this.f14440k.getIntrinsicHeight() * this.O)) / 2;
        this.f14440k.setBounds(r11 - intrinsicWidth, centerY - intrinsicHeight, r11 + intrinsicWidth, centerY + intrinsicHeight);
        this.f14440k.draw(canvas);
    }

    private void g(Canvas canvas) {
        int min;
        int height = this.f14429b.height();
        int centerY = this.f14429b.centerY() - (height / 2);
        int i11 = height + centerY;
        if (this.T <= 0) {
            Rect rect = this.f14429b;
            canvas.drawRect(rect.left, centerY, rect.right, i11, this.f14435g);
            return;
        }
        Rect rect2 = this.f14431c;
        int i12 = rect2.left;
        int i13 = rect2.right;
        int max = Math.max(Math.max(this.f14429b.left, i13), this.f14432d.right);
        int i14 = this.f14429b.right;
        if (max < i14) {
            canvas.drawRect(max, centerY, i14, i11, this.f14435g);
        }
        int max2 = Math.max(i12, this.f14432d.right);
        if (i13 > max2) {
            canvas.drawRect(max2, centerY, i13, i11, this.f14434f);
        }
        if (this.f14432d.width() > 0) {
            Rect rect3 = this.f14432d;
            canvas.drawRect(rect3.left, centerY, rect3.right, i11, this.f14433e);
        }
        if (this.f14446p1 == 0) {
            return;
        }
        long[] jArr = (long[]) ak.a.e(this.f14451x1);
        boolean[] zArr = (boolean[]) ak.a.e(this.f14453y1);
        int i15 = this.f14444o / 2;
        for (int i16 = 0; i16 < this.f14446p1; i16++) {
            long s11 = k0.s(jArr[i16], 0L, this.T);
            Rect rect4 = this.f14429b;
            canvas.drawRect(rect4.left + Math.min(rect4.width() - this.f14444o, Math.max(0, ((int) ((this.f14429b.width() * s11) / this.T)) - i15)), centerY, min + this.f14444o, i11, zArr[i16] ? this.f14438i : this.f14437h);
        }
    }

    private long getPositionIncrement() {
        long j11 = this.G;
        if (j11 == -9223372036854775807L) {
            long j12 = this.T;
            if (j12 == -9223372036854775807L) {
                return 0L;
            }
            return j12 / this.F;
        }
        return j11;
    }

    private String getProgressText() {
        return k0.f0(this.f14452y, this.f14454z, this.f14430b1);
    }

    private long getScrubberPosition() {
        if (this.f14429b.width() <= 0 || this.T == -9223372036854775807L) {
            return 0L;
        }
        return (this.f14432d.width() * this.T) / this.f14429b.width();
    }

    private boolean h(float f11, float f12) {
        return this.f14428a.contains((int) f11, (int) f12);
    }

    public /* synthetic */ void i() {
        s(false);
    }

    public /* synthetic */ void j(ValueAnimator valueAnimator) {
        this.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f14428a);
    }

    private void k(float f11) {
        Rect rect = this.f14432d;
        Rect rect2 = this.f14429b;
        rect.right = k0.r((int) f11, rect2.left, rect2.right);
    }

    private static int l(float f11, int i11) {
        return (int) (i11 / f11);
    }

    private Point m(MotionEvent motionEvent) {
        this.C.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.C;
    }

    private boolean n(long j11) {
        long j12 = this.T;
        if (j12 <= 0) {
            return false;
        }
        long j13 = this.Q ? this.R : this.f14430b1;
        long s11 = k0.s(j13 + j11, 0L, j12);
        if (s11 == j13) {
            return false;
        }
        if (!this.Q) {
            r(s11);
        } else {
            v(s11);
        }
        t();
        return true;
    }

    private boolean o(Drawable drawable) {
        return k0.f477a >= 23 && p(drawable, getLayoutDirection());
    }

    private static boolean p(Drawable drawable, int i11) {
        return k0.f477a >= 23 && drawable.setLayoutDirection(i11);
    }

    private void q(int i11, int i12) {
        Rect rect = this.K;
        if (rect != null && rect.width() == i11 && this.K.height() == i12) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i11, i12);
        this.K = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private void r(long j11) {
        this.R = j11;
        this.Q = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<i.a> it2 = this.B.iterator();
        while (it2.hasNext()) {
            it2.next().c(this, j11);
        }
    }

    private void s(boolean z11) {
        removeCallbacks(this.A);
        this.Q = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<i.a> it2 = this.B.iterator();
        while (it2.hasNext()) {
            it2.next().b(this, this.R, z11);
        }
    }

    private void t() {
        this.f14431c.set(this.f14429b);
        this.f14432d.set(this.f14429b);
        long j11 = this.Q ? this.R : this.f14430b1;
        if (this.T > 0) {
            Rect rect = this.f14431c;
            Rect rect2 = this.f14429b;
            rect.right = Math.min(rect2.left + ((int) ((this.f14429b.width() * this.f14436g1) / this.T)), rect2.right);
            int width = (int) ((this.f14429b.width() * j11) / this.T);
            Rect rect3 = this.f14432d;
            Rect rect4 = this.f14429b;
            rect3.right = Math.min(rect4.left + width, rect4.right);
        } else {
            Rect rect5 = this.f14431c;
            int i11 = this.f14429b.left;
            rect5.right = i11;
            this.f14432d.right = i11;
        }
        invalidate(this.f14428a);
    }

    private void u() {
        Drawable drawable = this.f14440k;
        if (drawable != null && drawable.isStateful() && this.f14440k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void v(long j11) {
        if (this.R == j11) {
            return;
        }
        this.R = j11;
        Iterator<i.a> it2 = this.B.iterator();
        while (it2.hasNext()) {
            it2.next().a(this, j11);
        }
    }

    @Override // com.google.android.exoplayer2.ui.i
    public void a(i.a aVar) {
        ak.a.e(aVar);
        this.B.add(aVar);
    }

    @Override // com.google.android.exoplayer2.ui.i
    public void b(long[] jArr, boolean[] zArr, int i11) {
        ak.a.a(i11 == 0 || !(jArr == null || zArr == null));
        this.f14446p1 = i11;
        this.f14451x1 = jArr;
        this.f14453y1 = zArr;
        t();
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        u();
    }

    @Override // com.google.android.exoplayer2.ui.i
    public long getPreferredUpdateDelay() {
        int l11 = l(this.E, this.f14429b.width());
        if (l11 != 0) {
            long j11 = this.T;
            if (j11 != 0 && j11 != -9223372036854775807L) {
                return j11 / l11;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f14440k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        g(canvas);
        f(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        if (!this.Q || z11) {
            return;
        }
        s(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.T <= 0) {
            return;
        }
        if (k0.f477a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            return;
        }
        accessibilityNodeInfo.addAction(4096);
        accessibilityNodeInfo.addAction(PKIFailureInfo.certRevoked);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.n(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.A
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.A
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.Q
            if (r0 == 0) goto L30
            r5 = 0
            r4.s(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17 = i13 - i11;
        int i18 = i14 - i12;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i17 - getPaddingRight();
        int i19 = this.P ? 0 : this.f14449w;
        if (this.f14443n == 1) {
            i15 = (i18 - getPaddingBottom()) - this.f14442m;
            int i21 = this.f14441l;
            i16 = ((i18 - getPaddingBottom()) - i21) - Math.max(i19 - (i21 / 2), 0);
        } else {
            i15 = (i18 - this.f14442m) / 2;
            i16 = (i18 - this.f14441l) / 2;
        }
        this.f14428a.set(paddingLeft, i15, paddingRight, this.f14442m + i15);
        Rect rect = this.f14429b;
        Rect rect2 = this.f14428a;
        rect.set(rect2.left + i19, i16, rect2.right - i19, this.f14441l + i16);
        if (k0.f477a >= 29) {
            q(i17, i18);
        }
        t();
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (mode == 0) {
            size = this.f14442m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f14442m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i11), size);
        u();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        Drawable drawable = this.f14440k;
        if (drawable == null || !p(drawable, i11)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0025, code lost:
        if (r3 != 3) goto L32;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L76
            long r2 = r7.T
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.m(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5d
            r5 = 3
            if (r3 == r4) goto L4e
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4e
            goto L76
        L28:
            boolean r8 = r7.Q
            if (r8 == 0) goto L76
            int r8 = r7.f14450x
            if (r0 >= r8) goto L3a
            int r8 = r7.H
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.k(r8)
            goto L40
        L3a:
            r7.H = r2
            float r8 = (float) r2
            r7.k(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.v(r0)
            r7.t()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.Q
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = r4
        L59:
            r7.s(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.h(r8, r0)
            if (r0 == 0) goto L76
            r7.k(r8)
            long r0 = r7.getScrubberPosition()
            r7.r(r0)
            r7.t()
            r7.invalidate()
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i11, Bundle bundle) {
        if (super.performAccessibilityAction(i11, bundle)) {
            return true;
        }
        if (this.T <= 0) {
            return false;
        }
        if (i11 == 8192) {
            if (n(-getPositionIncrement())) {
                s(false);
            }
        } else if (i11 != 4096) {
            return false;
        } else {
            if (n(getPositionIncrement())) {
                s(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i11) {
        this.f14437h.setColor(i11);
        invalidate(this.f14428a);
    }

    public void setBufferedColor(int i11) {
        this.f14434f.setColor(i11);
        invalidate(this.f14428a);
    }

    @Override // com.google.android.exoplayer2.ui.i
    public void setBufferedPosition(long j11) {
        this.f14436g1 = j11;
        t();
    }

    @Override // com.google.android.exoplayer2.ui.i
    public void setDuration(long j11) {
        this.T = j11;
        if (this.Q && j11 == -9223372036854775807L) {
            s(true);
        }
        t();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.i
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        if (!this.Q || z11) {
            return;
        }
        s(true);
    }

    public void setKeyCountIncrement(int i11) {
        ak.a.a(i11 > 0);
        this.F = i11;
        this.G = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j11) {
        ak.a.a(j11 > 0);
        this.F = -1;
        this.G = j11;
    }

    public void setPlayedAdMarkerColor(int i11) {
        this.f14438i.setColor(i11);
        invalidate(this.f14428a);
    }

    public void setPlayedColor(int i11) {
        this.f14433e.setColor(i11);
        invalidate(this.f14428a);
    }

    @Override // com.google.android.exoplayer2.ui.i
    public void setPosition(long j11) {
        this.f14430b1 = j11;
        setContentDescription(getProgressText());
        t();
    }

    public void setScrubberColor(int i11) {
        this.f14439j.setColor(i11);
        invalidate(this.f14428a);
    }

    public void setUnplayedColor(int i11) {
        this.f14435g.setColor(i11);
        invalidate(this.f14428a);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, attributeSet);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i11, AttributeSet attributeSet2) {
        this(context, attributeSet, i11, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i11, AttributeSet attributeSet2, int i12) {
        super(context, attributeSet, i11);
        this.f14428a = new Rect();
        this.f14429b = new Rect();
        this.f14431c = new Rect();
        this.f14432d = new Rect();
        Paint paint = new Paint();
        this.f14433e = paint;
        Paint paint2 = new Paint();
        this.f14434f = paint2;
        Paint paint3 = new Paint();
        this.f14435g = paint3;
        Paint paint4 = new Paint();
        this.f14437h = paint4;
        Paint paint5 = new Paint();
        this.f14438i = paint5;
        Paint paint6 = new Paint();
        this.f14439j = paint6;
        paint6.setAntiAlias(true);
        this.B = new CopyOnWriteArraySet<>();
        this.C = new Point();
        float f11 = context.getResources().getDisplayMetrics().density;
        this.E = f11;
        this.f14450x = e(f11, -50);
        int e11 = e(f11, 4);
        int e12 = e(f11, 26);
        int e13 = e(f11, 4);
        int e14 = e(f11, 12);
        int e15 = e(f11, 0);
        int e16 = e(f11, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, k.f59609c, i11, i12);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(k.f59620n);
                this.f14440k = drawable;
                if (drawable != null) {
                    o(drawable);
                    e12 = Math.max(drawable.getMinimumHeight(), e12);
                }
                this.f14441l = obtainStyledAttributes.getDimensionPixelSize(k.f59613g, e11);
                this.f14442m = obtainStyledAttributes.getDimensionPixelSize(k.f59622p, e12);
                this.f14443n = obtainStyledAttributes.getInt(k.f59612f, 0);
                this.f14444o = obtainStyledAttributes.getDimensionPixelSize(k.f59611e, e13);
                this.f14445p = obtainStyledAttributes.getDimensionPixelSize(k.f59621o, e14);
                this.f14447q = obtainStyledAttributes.getDimensionPixelSize(k.f59618l, e15);
                this.f14448t = obtainStyledAttributes.getDimensionPixelSize(k.f59619m, e16);
                int i13 = obtainStyledAttributes.getInt(k.f59616j, -1);
                int i14 = obtainStyledAttributes.getInt(k.f59617k, -1);
                int i15 = obtainStyledAttributes.getInt(k.f59614h, -855638017);
                int i16 = obtainStyledAttributes.getInt(k.f59623q, 872415231);
                int i17 = obtainStyledAttributes.getInt(k.f59610d, -1291845888);
                int i18 = obtainStyledAttributes.getInt(k.f59615i, 872414976);
                paint.setColor(i13);
                paint6.setColor(i14);
                paint2.setColor(i15);
                paint3.setColor(i16);
                paint4.setColor(i17);
                paint5.setColor(i18);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f14441l = e11;
            this.f14442m = e12;
            this.f14443n = 0;
            this.f14444o = e13;
            this.f14445p = e14;
            this.f14447q = e15;
            this.f14448t = e16;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f14440k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f14452y = sb2;
        this.f14454z = new Formatter(sb2, Locale.getDefault());
        this.A = new Runnable() { // from class: yj.b
            {
                DefaultTimeBar.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DefaultTimeBar.c(DefaultTimeBar.this);
            }
        };
        Drawable drawable2 = this.f14440k;
        if (drawable2 != null) {
            this.f14449w = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f14449w = (Math.max(this.f14447q, Math.max(this.f14445p, this.f14448t)) + 1) / 2;
        }
        this.O = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.L = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yj.a
            {
                DefaultTimeBar.this = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DefaultTimeBar.d(DefaultTimeBar.this, valueAnimator2);
            }
        });
        this.T = -9223372036854775807L;
        this.G = -9223372036854775807L;
        this.F = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}