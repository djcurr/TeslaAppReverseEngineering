package com.google.android.material.textfield;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import wk.k;

/* loaded from: classes3.dex */
class c extends wk.g {
    private final Paint E;
    private final RectF F;
    private int G;

    c() {
        this(null);
    }

    private void n0(Canvas canvas) {
        if (u0(getCallback())) {
            return;
        }
        canvas.restoreToCount(this.G);
    }

    private void o0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (u0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
                return;
            }
            return;
        }
        q0(canvas);
    }

    private void q0(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.G = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, canvas.getWidth(), canvas.getHeight(), null);
        } else {
            this.G = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, canvas.getWidth(), canvas.getHeight(), null, 31);
        }
    }

    private void t0() {
        this.E.setStyle(Paint.Style.FILL_AND_STROKE);
        this.E.setColor(-1);
        this.E.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    private boolean u0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    @Override // wk.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        o0(canvas);
        super.draw(canvas);
        n0(canvas);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m0() {
        return !this.F.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p0() {
        r0(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // wk.g
    public void r(Canvas canvas) {
        if (this.F.isEmpty()) {
            super.r(canvas);
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        super.r(canvas2);
        canvas2.drawRect(this.F, this.E);
        canvas.drawBitmap(createBitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
    }

    void r0(float f11, float f12, float f13, float f14) {
        RectF rectF = this.F;
        if (f11 == rectF.left && f12 == rectF.top && f13 == rectF.right && f14 == rectF.bottom) {
            return;
        }
        rectF.set(f11, f12, f13, f14);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s0(RectF rectF) {
        r0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(k kVar) {
        super(kVar == null ? new k() : kVar);
        this.E = new Paint(1);
        t0();
        this.F = new RectF();
    }
}