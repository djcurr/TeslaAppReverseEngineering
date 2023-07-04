package com.adyen.checkout.components.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j7.e;

/* loaded from: classes.dex */
public class RoundCornerImageView extends AppCompatImageView {

    /* renamed from: c  reason: collision with root package name */
    private float f9566c;

    /* renamed from: d  reason: collision with root package name */
    private final Paint f9567d;

    /* renamed from: e  reason: collision with root package name */
    private float f9568e;

    /* renamed from: f  reason: collision with root package name */
    private int f9569f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9570g;

    public RoundCornerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void c(TypedArray typedArray) {
        try {
            this.f9569f = typedArray.getColor(e.f33273c, -16777216);
            this.f9568e = typedArray.getDimension(e.f33274d, 4.0f);
            this.f9566c = typedArray.getDimension(e.f33272b, 9.0f);
        } finally {
            typedArray.recycle();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (!this.f9570g) {
            super.onDraw(canvas);
            return;
        }
        float f11 = this.f9568e;
        RectF rectF = new RectF(f11 / 2.0f, f11 / 2.0f, getWidth() - (this.f9568e / 2.0f), getHeight() - (this.f9568e / 2.0f));
        this.f9567d.reset();
        if (this.f9568e > BitmapDescriptorFactory.HUE_RED) {
            this.f9567d.setStyle(Paint.Style.STROKE);
            this.f9567d.setAntiAlias(true);
            this.f9567d.setColor(this.f9569f);
            this.f9567d.setStrokeWidth(this.f9568e);
            float f12 = this.f9566c;
            canvas.drawRoundRect(rectF, f12, f12, this.f9567d);
        }
        Path path = new Path();
        float f13 = this.f9566c;
        path.addRoundRect(rectF, f13, f13, Path.Direction.CW);
        canvas.clipPath(path);
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        float f11 = this.f9568e;
        super.onMeasure(i11 + (((int) f11) * 2), i12 + (((int) f11) * 2));
    }

    public void setBorderEnabled(boolean z11) {
        this.f9570g = z11;
        invalidate();
    }

    public void setRadius(float f11) {
        this.f9566c = f11;
        invalidate();
    }

    public void setStrokeColor(int i11) {
        this.f9569f = i11;
        invalidate();
    }

    public void setStrokeWidth(float f11) {
        this.f9568e = f11;
        invalidate();
    }

    public RoundCornerImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f9567d = new Paint();
        this.f9570g = true;
        c(context.getTheme().obtainStyledAttributes(attributeSet, e.f33271a, 0, 0));
    }
}