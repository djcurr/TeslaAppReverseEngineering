package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1490a;

    /* renamed from: b  reason: collision with root package name */
    private View f1491b;

    /* renamed from: c  reason: collision with root package name */
    private View f1492c;

    /* renamed from: d  reason: collision with root package name */
    private View f1493d;

    /* renamed from: e  reason: collision with root package name */
    Drawable f1494e;

    /* renamed from: f  reason: collision with root package name */
    Drawable f1495f;

    /* renamed from: g  reason: collision with root package name */
    Drawable f1496g;

    /* renamed from: h  reason: collision with root package name */
    boolean f1497h;

    /* renamed from: i  reason: collision with root package name */
    boolean f1498i;

    /* renamed from: j  reason: collision with root package name */
    private int f1499j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.core.view.a0.z0(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f27179a);
        this.f1494e = obtainStyledAttributes.getDrawable(g.j.f27184b);
        this.f1495f = obtainStyledAttributes.getDrawable(g.j.f27194d);
        this.f1499j = obtainStyledAttributes.getDimensionPixelSize(g.j.f27224j, -1);
        boolean z11 = true;
        if (getId() == g.f.H) {
            this.f1497h = true;
            this.f1496g = obtainStyledAttributes.getDrawable(g.j.f27189c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1497h ? this.f1494e != null || this.f1495f != null : this.f1496g != null) {
            z11 = false;
        }
        setWillNotDraw(z11);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1494e;
        if (drawable != null && drawable.isStateful()) {
            this.f1494e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1495f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1495f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1496g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1496g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f1491b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1494e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1495f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1496g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1492c = findViewById(g.f.f27115a);
        this.f1493d = findViewById(g.f.f27120f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1490a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        Drawable drawable;
        super.onLayout(z11, i11, i12, i13, i14);
        View view = this.f1491b;
        boolean z12 = true;
        boolean z13 = false;
        boolean z14 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i15 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i11, (measuredHeight - view.getMeasuredHeight()) - i15, i13, measuredHeight - i15);
        }
        if (this.f1497h) {
            Drawable drawable2 = this.f1496g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z12 = z13;
        } else {
            if (this.f1494e != null) {
                if (this.f1492c.getVisibility() == 0) {
                    this.f1494e.setBounds(this.f1492c.getLeft(), this.f1492c.getTop(), this.f1492c.getRight(), this.f1492c.getBottom());
                } else {
                    View view2 = this.f1493d;
                    if (view2 != null && view2.getVisibility() == 0) {
                        this.f1494e.setBounds(this.f1493d.getLeft(), this.f1493d.getTop(), this.f1493d.getRight(), this.f1493d.getBottom());
                    } else {
                        this.f1494e.setBounds(0, 0, 0, 0);
                    }
                }
                z13 = true;
            }
            this.f1498i = z14;
            if (z14 && (drawable = this.f1495f) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            z12 = z13;
        }
        if (z12) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int a11;
        int i13;
        if (this.f1492c == null && View.MeasureSpec.getMode(i12) == Integer.MIN_VALUE && (i13 = this.f1499j) >= 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i13, View.MeasureSpec.getSize(i12)), Integer.MIN_VALUE);
        }
        super.onMeasure(i11, i12);
        if (this.f1492c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i12);
        View view = this.f1491b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (!b(this.f1492c)) {
            a11 = a(this.f1492c);
        } else {
            a11 = !b(this.f1493d) ? a(this.f1493d) : 0;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a11 + a(this.f1491b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i12) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1494e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1494e);
        }
        this.f1494e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1492c;
            if (view != null) {
                this.f1494e.setBounds(view.getLeft(), this.f1492c.getTop(), this.f1492c.getRight(), this.f1492c.getBottom());
            }
        }
        boolean z11 = true;
        if (!this.f1497h ? this.f1494e != null || this.f1495f != null : this.f1496g != null) {
            z11 = false;
        }
        setWillNotDraw(z11);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1496g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1496g);
        }
        this.f1496g = drawable;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1497h && (drawable2 = this.f1496g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1497h ? !(this.f1494e != null || this.f1495f != null) : this.f1496g == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1495f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1495f);
        }
        this.f1495f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1498i && (drawable2 = this.f1495f) != null) {
                drawable2.setBounds(this.f1491b.getLeft(), this.f1491b.getTop(), this.f1491b.getRight(), this.f1491b.getBottom());
            }
        }
        boolean z11 = true;
        if (!this.f1497h ? this.f1494e != null || this.f1495f != null : this.f1496g != null) {
            z11 = false;
        }
        setWillNotDraw(z11);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(n0 n0Var) {
        View view = this.f1491b;
        if (view != null) {
            removeView(view);
        }
        this.f1491b = n0Var;
        if (n0Var != null) {
            addView(n0Var);
            ViewGroup.LayoutParams layoutParams = n0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            n0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z11) {
        this.f1490a = z11;
        setDescendantFocusability(z11 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        boolean z11 = i11 == 0;
        Drawable drawable = this.f1494e;
        if (drawable != null) {
            drawable.setVisible(z11, false);
        }
        Drawable drawable2 = this.f1495f;
        if (drawable2 != null) {
            drawable2.setVisible(z11, false);
        }
        Drawable drawable3 = this.f1496g;
        if (drawable3 != null) {
            drawable3.setVisible(z11, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i11) {
        if (i11 != 0) {
            return super.startActionModeForChild(view, callback, i11);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f1494e && !this.f1497h) || (drawable == this.f1495f && this.f1498i) || ((drawable == this.f1496g && this.f1497h) || super.verifyDrawable(drawable));
    }
}