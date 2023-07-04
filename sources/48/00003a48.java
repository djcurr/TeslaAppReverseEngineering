package com.google.maps.android.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class RotationLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private int f17222a;

    public RotationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int i11 = this.f17222a;
        if (i11 == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (i11 == 1) {
            canvas.translate(getWidth(), BitmapDescriptorFactory.HUE_RED);
            canvas.rotate(90.0f, getWidth() / 2, BitmapDescriptorFactory.HUE_RED);
            canvas.translate(getHeight() / 2, getWidth() / 2);
        } else if (i11 == 2) {
            canvas.rotate(180.0f, getWidth() / 2, getHeight() / 2);
        } else {
            canvas.translate(BitmapDescriptorFactory.HUE_RED, getHeight());
            canvas.rotate(270.0f, getWidth() / 2, BitmapDescriptorFactory.HUE_RED);
            canvas.translate(getHeight() / 2, (-getWidth()) / 2);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13 = this.f17222a;
        if (i13 != 1 && i13 != 3) {
            super.onMeasure(i11, i12);
            return;
        }
        super.onMeasure(i11, i12);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    public void setViewRotation(int i11) {
        this.f17222a = ((i11 + 360) % 360) / 90;
    }
}