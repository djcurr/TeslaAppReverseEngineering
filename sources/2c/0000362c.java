package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.g0;

/* loaded from: classes3.dex */
public class d extends g0 {

    /* renamed from: p  reason: collision with root package name */
    private Drawable f15425p;

    /* renamed from: q  reason: collision with root package name */
    private final Rect f15426q;

    /* renamed from: t  reason: collision with root package name */
    private final Rect f15427t;

    /* renamed from: w  reason: collision with root package name */
    private int f15428w;

    /* renamed from: x  reason: collision with root package name */
    protected boolean f15429x;

    /* renamed from: y  reason: collision with root package name */
    boolean f15430y;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f15425p;
        if (drawable != null) {
            if (this.f15430y) {
                this.f15430y = false;
                Rect rect = this.f15426q;
                Rect rect2 = this.f15427t;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f15429x) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f15428w, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f11, float f12) {
        super.drawableHotspotChanged(f11, f12);
        Drawable drawable = this.f15425p;
        if (drawable != null) {
            drawable.setHotspot(f11, f12);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f15425p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f15425p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f15425p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f15428w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f15425p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.g0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f15430y = z11 | this.f15430y;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f15430y = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f15425p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f15425p);
            }
            this.f15425p = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f15428w == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i11) {
        if (this.f15428w != i11) {
            if ((8388615 & i11) == 0) {
                i11 |= 8388611;
            }
            if ((i11 & 112) == 0) {
                i11 |= 48;
            }
            this.f15428w = i11;
            if (i11 == 119 && this.f15425p != null) {
                this.f15425p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f15425p;
    }

    public d(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f15426q = new Rect();
        this.f15427t = new Rect();
        this.f15428w = 119;
        this.f15429x = true;
        this.f15430y = false;
        TypedArray h11 = j.h(context, attributeSet, fk.k.f26568i1, i11, 0, new int[0]);
        this.f15428w = h11.getInt(fk.k.f26580k1, this.f15428w);
        Drawable drawable = h11.getDrawable(fk.k.f26574j1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f15429x = h11.getBoolean(fk.k.f26586l1, true);
        h11.recycle();
    }
}