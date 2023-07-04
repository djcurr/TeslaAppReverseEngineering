package com.brentvatne.exoplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private float f10367a;

    /* renamed from: b  reason: collision with root package name */
    private int f10368b;

    public a(Context context) {
        this(context, null);
    }

    public void a() {
        this.f10367a = BitmapDescriptorFactory.HUE_RED;
    }

    public float getAspectRatio() {
        return this.f10367a;
    }

    public int getResizeMode() {
        return this.f10368b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        float f11;
        float f12;
        super.onMeasure(i11, i12);
        if (this.f10367a == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f13 = measuredWidth;
        float f14 = measuredHeight;
        float f15 = (this.f10367a / (f13 / f14)) - 1.0f;
        if (Math.abs(f15) <= 0.01f) {
            return;
        }
        int i13 = this.f10368b;
        if (i13 == 1) {
            f11 = this.f10367a;
        } else {
            if (i13 == 2) {
                f12 = this.f10367a;
            } else {
                if (i13 != 3) {
                    if (i13 == 4) {
                        int i14 = (int) (this.f10367a * f14);
                        if (i14 < measuredWidth) {
                            float f16 = i14;
                            float f17 = f13 / f16;
                            measuredWidth = (int) (f16 * f17);
                            measuredHeight = (int) (f14 * f17);
                        } else {
                            measuredWidth = i14;
                        }
                    } else if (f15 > BitmapDescriptorFactory.HUE_RED) {
                        f11 = this.f10367a;
                    } else {
                        f12 = this.f10367a;
                    }
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
            measuredWidth = (int) (f14 * f12);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
        measuredHeight = (int) (f13 / f11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f11) {
        if (this.f10367a != f11) {
            this.f10367a = f11;
            requestLayout();
        }
    }

    public void setResizeMode(int i11) {
        if (this.f10368b != i11) {
            this.f10368b = i11;
            requestLayout();
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10368b = 0;
    }
}