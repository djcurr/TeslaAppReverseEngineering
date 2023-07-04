package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.core.view.a0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.b;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class a<S extends com.google.android.material.progressindicator.b> extends ProgressBar {

    /* renamed from: n  reason: collision with root package name */
    static final int f15474n = fk.j.f26515s;

    /* renamed from: a  reason: collision with root package name */
    S f15475a;

    /* renamed from: b  reason: collision with root package name */
    private int f15476b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f15477c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f15478d;

    /* renamed from: e  reason: collision with root package name */
    private final int f15479e;

    /* renamed from: f  reason: collision with root package name */
    private long f15480f;

    /* renamed from: g  reason: collision with root package name */
    rk.a f15481g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15482h;

    /* renamed from: i  reason: collision with root package name */
    private int f15483i;

    /* renamed from: j  reason: collision with root package name */
    private final Runnable f15484j;

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f15485k;

    /* renamed from: l  reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f15486l;

    /* renamed from: m  reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b f15487m;

    /* renamed from: com.google.android.material.progressindicator.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class RunnableC0277a implements Runnable {
        RunnableC0277a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.k();
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.j();
            a.this.f15480f = -1L;
        }
    }

    /* loaded from: classes3.dex */
    class c extends androidx.vectordrawable.graphics.drawable.b {
        c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void a(Drawable drawable) {
            a.this.setIndeterminate(false);
            a aVar = a.this;
            aVar.o(aVar.f15476b, a.this.f15477c);
        }
    }

    /* loaded from: classes3.dex */
    class d extends androidx.vectordrawable.graphics.drawable.b {
        d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        public void a(Drawable drawable) {
            super.a(drawable);
            if (a.this.f15482h) {
                return;
            }
            a aVar = a.this;
            aVar.setVisibility(aVar.f15483i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(yk.a.c(context, attributeSet, i11, f15474n), attributeSet, i11);
        this.f15482h = false;
        this.f15483i = 4;
        this.f15484j = new RunnableC0277a();
        this.f15485k = new b();
        this.f15486l = new c();
        this.f15487m = new d();
        Context context2 = getContext();
        this.f15475a = i(context2, attributeSet);
        TypedArray h11 = com.google.android.material.internal.j.h(context2, attributeSet, fk.k.f26596n, i11, i12, new int[0]);
        h11.getInt(fk.k.f26626s, -1);
        this.f15479e = Math.min(h11.getInt(fk.k.f26614q, -1), 1000);
        h11.recycle();
        this.f15481g = new rk.a();
        this.f15478d = true;
    }

    private h<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().v();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ((g) getCurrentDrawable()).p(false, false, true);
        if (m()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f15479e > 0) {
            SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean m() {
        return (getProgressDrawable() == null || !getProgressDrawable().isVisible()) && (getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible());
    }

    private void n() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().u().d(this.f15486l);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().l(this.f15487m);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().l(this.f15487m);
        }
    }

    private void p() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().r(this.f15487m);
            getIndeterminateDrawable().u().h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().r(this.f15487m);
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f15475a.f15497f;
    }

    public int[] getIndicatorColor() {
        return this.f15475a.f15494c;
    }

    public int getShowAnimationBehavior() {
        return this.f15475a.f15496e;
    }

    public int getTrackColor() {
        return this.f15475a.f15495d;
    }

    public int getTrackCornerRadius() {
        return this.f15475a.f15493b;
    }

    public int getTrackThickness() {
        return this.f15475a.f15492a;
    }

    protected void h(boolean z11) {
        if (this.f15478d) {
            ((g) getCurrentDrawable()).p(q(), false, z11);
        }
    }

    abstract S i(Context context, AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    boolean l() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    public void o(int i11, boolean z11) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.f15476b = i11;
                this.f15477c = z11;
                this.f15482h = true;
                if (getIndeterminateDrawable().isVisible() && this.f15481g.a(getContext().getContentResolver()) != BitmapDescriptorFactory.HUE_RED) {
                    getIndeterminateDrawable().u().f();
                    return;
                } else {
                    this.f15486l.a(getIndeterminateDrawable());
                    return;
                }
            }
            return;
        }
        super.setProgress(i11);
        if (getProgressDrawable() == null || z11) {
            return;
        }
        getProgressDrawable().jumpToCurrentState();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        n();
        if (q()) {
            k();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f15485k);
        removeCallbacks(this.f15484j);
        ((g) getCurrentDrawable()).h();
        p();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i11, int i12) {
        int paddingLeft;
        int paddingTop;
        super.onMeasure(i11, i12);
        h<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        int e11 = currentDrawingDelegate.e();
        int d11 = currentDrawingDelegate.d();
        if (e11 < 0) {
            paddingLeft = getMeasuredWidth();
        } else {
            paddingLeft = e11 + getPaddingLeft() + getPaddingRight();
        }
        if (d11 < 0) {
            paddingTop = getMeasuredHeight();
        } else {
            paddingTop = d11 + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        h(i11 == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i11) {
        super.onWindowVisibilityChanged(i11);
        h(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q() {
        return a0.Y(this) && getWindowVisibility() == 0 && l();
    }

    public void setAnimatorDurationScaleProvider(rk.a aVar) {
        this.f15481g = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f15529c = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f15529c = aVar;
        }
    }

    public void setHideAnimationBehavior(int i11) {
        this.f15475a.f15497f = i11;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z11) {
        if (z11 == isIndeterminate()) {
            return;
        }
        g gVar = (g) getCurrentDrawable();
        if (gVar != null) {
            gVar.h();
        }
        super.setIndeterminate(z11);
        g gVar2 = (g) getCurrentDrawable();
        if (gVar2 != null) {
            gVar2.p(q(), false, false);
        }
        if ((gVar2 instanceof j) && q()) {
            ((j) gVar2).u().g();
        }
        this.f15482h = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (drawable instanceof j) {
            ((g) drawable).h();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{kk.a.b(getContext(), fk.b.f26376l, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f15475a.f15494c = iArr;
        getIndeterminateDrawable().u().c();
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i11) {
        if (isIndeterminate()) {
            return;
        }
        o(i11, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else if (drawable instanceof f) {
            f fVar = (f) drawable;
            fVar.h();
            super.setProgressDrawable(fVar);
            fVar.A(getProgress() / getMax());
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i11) {
        this.f15475a.f15496e = i11;
        invalidate();
    }

    public void setTrackColor(int i11) {
        S s11 = this.f15475a;
        if (s11.f15495d != i11) {
            s11.f15495d = i11;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i11) {
        S s11 = this.f15475a;
        if (s11.f15493b != i11) {
            s11.f15493b = Math.min(i11, s11.f15492a / 2);
        }
    }

    public void setTrackThickness(int i11) {
        S s11 = this.f15475a;
        if (s11.f15492a != i11) {
            s11.f15492a = i11;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i11) {
        if (i11 != 0 && i11 != 4 && i11 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f15483i = i11;
    }

    @Override // android.widget.ProgressBar
    public j<S> getIndeterminateDrawable() {
        return (j) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public f<S> getProgressDrawable() {
        return (f) super.getProgressDrawable();
    }
}