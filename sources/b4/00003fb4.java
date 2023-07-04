package com.plaid.internal;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.ac;

/* loaded from: classes2.dex */
public final class ac extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f18175a = new ValueAnimator.AnimatorUpdateListener() { // from class: qq.a
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ac.a(ac.this, valueAnimator);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public final Paint f18176b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f18177c;

    /* renamed from: d  reason: collision with root package name */
    public final Matrix f18178d;

    /* renamed from: e  reason: collision with root package name */
    public ValueAnimator f18179e;

    /* renamed from: f  reason: collision with root package name */
    public zb f18180f;

    public ac() {
        Paint paint = new Paint();
        this.f18176b = paint;
        this.f18177c = new Rect();
        this.f18178d = new Matrix();
        paint.setAntiAlias(true);
    }

    public static final void a(ac this$0, ValueAnimator valueAnimator) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.invalidateSelf();
    }

    public final float a(float f11, float f12, float f13) {
        return ((f12 - f11) * f13) + f11;
    }

    public final void b() {
        zb zbVar;
        Shader linearGradient;
        Rect bounds = getBounds();
        kotlin.jvm.internal.s.f(bounds, "bounds");
        int width = bounds.width();
        int height = bounds.height();
        if (width == 0 || height == 0 || (zbVar = this.f18180f) == null) {
            return;
        }
        int i11 = zbVar.f19972g;
        if (i11 <= 0) {
            i11 = Math.round(zbVar.f19974i * width);
        }
        int i12 = zbVar.f19973h;
        if (i12 <= 0) {
            i12 = Math.round(zbVar.f19975j * height);
        }
        int i13 = zbVar.f19971f;
        boolean z11 = false;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        if (i13 == 0) {
            int i14 = zbVar.f19968c;
            if (i14 == 1 || i14 == 3) {
                z11 = true;
            }
            float f12 = z11 ? 0.0f : i11;
            if (z11) {
                f11 = i12;
            }
            linearGradient = new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, f12, f11, zbVar.f19967b, zbVar.f19966a, Shader.TileMode.CLAMP);
        } else if (i13 == 1) {
            linearGradient = new RadialGradient(i11 / 2.0f, i12 / 2.0f, (float) (Math.max(i11, i12) / Math.sqrt(2.0d)), zbVar.f19967b, zbVar.f19966a, Shader.TileMode.CLAMP);
        } else {
            int i15 = zbVar.f19968c;
            if (i15 == 1 || i15 == 3) {
                z11 = true;
            }
            float f13 = z11 ? 0.0f : i11;
            if (z11) {
                f11 = i12;
            }
            linearGradient = new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, f13, f11, zbVar.f19967b, zbVar.f19966a, Shader.TileMode.CLAMP);
        }
        this.f18176b.setShader(linearGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        zb zbVar;
        float a11;
        float a12;
        kotlin.jvm.internal.s.g(canvas, "canvas");
        if (this.f18176b.getShader() == null || (zbVar = this.f18180f) == null) {
            return;
        }
        float tan = (float) Math.tan(Math.toRadians(zbVar.f19978m));
        float width = (this.f18177c.width() * tan) + this.f18177c.height();
        float height = (tan * this.f18177c.height()) + this.f18177c.width();
        ValueAnimator valueAnimator = this.f18179e;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        float animatedFraction = valueAnimator == null ? 0.0f : valueAnimator.getAnimatedFraction();
        int i11 = zbVar.f19968c;
        if (i11 == 0) {
            a11 = a(-height, height, animatedFraction);
        } else if (i11 == 2) {
            a11 = a(height, -height, animatedFraction);
        } else {
            if (i11 == 1) {
                a12 = a(-width, width, animatedFraction);
            } else if (i11 == 3) {
                a12 = a(width, -width, animatedFraction);
            } else {
                a11 = a(-height, height, animatedFraction);
            }
            this.f18178d.reset();
            this.f18178d.setRotate(zbVar.f19978m, this.f18177c.width() / 2.0f, this.f18177c.height() / 2.0f);
            this.f18178d.postTranslate(f11, a12);
            this.f18176b.getShader().setLocalMatrix(this.f18178d);
            canvas.drawRect(this.f18177c, this.f18176b);
        }
        f11 = a11;
        a12 = 0.0f;
        this.f18178d.reset();
        this.f18178d.setRotate(zbVar.f19978m, this.f18177c.width() / 2.0f, this.f18177c.height() / 2.0f);
        this.f18178d.postTranslate(f11, a12);
        this.f18176b.getShader().setLocalMatrix(this.f18178d);
        canvas.drawRect(this.f18177c, this.f18176b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        zb zbVar = this.f18180f;
        boolean z11 = false;
        if (!(zbVar != null && zbVar.f19979n)) {
            if (zbVar != null && zbVar.f19981p) {
                z11 = true;
            }
            if (!z11) {
                return -1;
            }
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        kotlin.jvm.internal.s.g(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f18177c.set(bounds);
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public final void a() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2 = this.f18179e;
        boolean z11 = false;
        if ((valueAnimator2 == null || valueAnimator2.isStarted()) ? false : true) {
            zb zbVar = this.f18180f;
            if (zbVar != null && zbVar.f19980o) {
                z11 = true;
            }
            if (!z11 || getCallback() == null || (valueAnimator = this.f18179e) == null) {
                return;
            }
            valueAnimator.start();
        }
    }
}