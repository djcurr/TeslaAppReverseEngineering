package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.a0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import fk.j;
import fk.k;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ClockHandView extends View {

    /* renamed from: a  reason: collision with root package name */
    private ValueAnimator f15768a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f15769b;

    /* renamed from: c  reason: collision with root package name */
    private float f15770c;

    /* renamed from: d  reason: collision with root package name */
    private float f15771d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f15772e;

    /* renamed from: f  reason: collision with root package name */
    private int f15773f;

    /* renamed from: g  reason: collision with root package name */
    private final List<d> f15774g;

    /* renamed from: h  reason: collision with root package name */
    private final int f15775h;

    /* renamed from: i  reason: collision with root package name */
    private final float f15776i;

    /* renamed from: j  reason: collision with root package name */
    private final Paint f15777j;

    /* renamed from: k  reason: collision with root package name */
    private final RectF f15778k;

    /* renamed from: l  reason: collision with root package name */
    private final int f15779l;

    /* renamed from: m  reason: collision with root package name */
    private float f15780m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f15781n;

    /* renamed from: o  reason: collision with root package name */
    private c f15782o;

    /* renamed from: p  reason: collision with root package name */
    private double f15783p;

    /* renamed from: q  reason: collision with root package name */
    private int f15784q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        b(ClockHandView clockHandView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(float f11, boolean z11);
    }

    /* loaded from: classes3.dex */
    public interface d {
        void b(float f11, boolean z11);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fk.b.f26390z);
    }

    private void c(Canvas canvas) {
        int width;
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f11 = height;
        this.f15777j.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
        canvas.drawCircle((this.f15784q * ((float) Math.cos(this.f15783p))) + width2, (this.f15784q * ((float) Math.sin(this.f15783p))) + f11, this.f15775h, this.f15777j);
        double sin = Math.sin(this.f15783p);
        double cos = Math.cos(this.f15783p);
        this.f15777j.setStrokeWidth(this.f15779l);
        canvas.drawLine(width2, f11, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.f15777j);
        canvas.drawCircle(width2, f11, this.f15776i, this.f15777j);
    }

    private int e(float f11, float f12) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f12 - (getHeight() / 2), f11 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    private Pair<Float, Float> h(float f11) {
        float f12 = f();
        if (Math.abs(f12 - f11) > 180.0f) {
            if (f12 > 180.0f && f11 < 180.0f) {
                f11 += 360.0f;
            }
            if (f12 < 180.0f && f11 > 180.0f) {
                f12 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f12), Float.valueOf(f11));
    }

    private boolean i(float f11, float f12, boolean z11, boolean z12, boolean z13) {
        float e11 = e(f11, f12);
        boolean z14 = false;
        boolean z15 = f() != e11;
        if (z12 && z15) {
            return true;
        }
        if (z15 || z11) {
            if (z13 && this.f15769b) {
                z14 = true;
            }
            l(e11, z14);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(float f11, boolean z11) {
        float f12 = f11 % 360.0f;
        this.f15780m = f12;
        this.f15783p = Math.toRadians(f12 - 90.0f);
        float width = (getWidth() / 2) + (this.f15784q * ((float) Math.cos(this.f15783p)));
        float height = (getHeight() / 2) + (this.f15784q * ((float) Math.sin(this.f15783p)));
        RectF rectF = this.f15778k;
        int i11 = this.f15775h;
        rectF.set(width - i11, height - i11, width + i11, height + i11);
        for (d dVar : this.f15774g) {
            dVar.b(f12, z11);
        }
        invalidate();
    }

    public void b(d dVar) {
        this.f15774g.add(dVar);
    }

    public RectF d() {
        return this.f15778k;
    }

    public float f() {
        return this.f15780m;
    }

    public int g() {
        return this.f15775h;
    }

    public void j(int i11) {
        this.f15784q = i11;
        invalidate();
    }

    public void k(float f11) {
        l(f11, false);
    }

    public void l(float f11, boolean z11) {
        ValueAnimator valueAnimator = this.f15768a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z11) {
            m(f11, false);
            return;
        }
        Pair<Float, Float> h11 = h(f11);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) h11.first).floatValue(), ((Float) h11.second).floatValue());
        this.f15768a = ofFloat;
        ofFloat.setDuration(200L);
        this.f15768a.addUpdateListener(new a());
        this.f15768a.addListener(new b(this));
        this.f15768a.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        k(f());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        boolean z13;
        c cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f15770c = x11;
            this.f15771d = y11;
            this.f15772e = true;
            this.f15781n = false;
            z11 = false;
            z12 = false;
            z13 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i11 = (int) (x11 - this.f15770c);
            int i12 = (int) (y11 - this.f15771d);
            this.f15772e = (i11 * i11) + (i12 * i12) > this.f15773f;
            boolean z14 = this.f15781n;
            z11 = actionMasked == 1;
            z13 = false;
            z12 = z14;
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
        }
        boolean i13 = i(x11, y11, z12, z13, z11) | this.f15781n;
        this.f15781n = i13;
        if (i13 && z11 && (cVar = this.f15782o) != null) {
            cVar.a(e(x11, y11), this.f15772e);
        }
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f15774g = new ArrayList();
        Paint paint = new Paint();
        this.f15777j = paint;
        this.f15778k = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.W0, i11, j.f26516t);
        this.f15784q = obtainStyledAttributes.getDimensionPixelSize(k.Y0, 0);
        this.f15775h = obtainStyledAttributes.getDimensionPixelSize(k.Z0, 0);
        Resources resources = getResources();
        this.f15779l = resources.getDimensionPixelSize(fk.d.f26407k);
        this.f15776i = resources.getDimensionPixelSize(fk.d.f26405i);
        int color = obtainStyledAttributes.getColor(k.X0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        k(BitmapDescriptorFactory.HUE_RED);
        this.f15773f = ViewConfiguration.get(context).getScaledTouchSlop();
        a0.G0(this, 2);
        obtainStyledAttributes.recycle();
    }
}