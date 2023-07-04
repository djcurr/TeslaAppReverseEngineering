package org.reactnative.maskedview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;
import com.facebook.react.views.view.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes5.dex */
public class a extends g {

    /* renamed from: a  reason: collision with root package name */
    private Bitmap f43358a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f43359b;

    /* renamed from: c  reason: collision with root package name */
    private Paint f43360c;

    /* renamed from: d  reason: collision with root package name */
    private PorterDuffXfermode f43361d;

    public a(Context context) {
        super(context);
        this.f43358a = null;
        this.f43359b = false;
        setRenderingMode("hardware");
        this.f43360c = new Paint(1);
        this.f43361d = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    public static Bitmap c(View view) {
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    private void d() {
        Bitmap bitmap = this.f43358a;
        if (bitmap != null) {
            bitmap.recycle();
        }
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setVisibility(0);
            this.f43358a = c(childAt);
            childAt.setVisibility(4);
            return;
        }
        this.f43358a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f43359b) {
            d();
            this.f43359b = false;
        }
        if (this.f43358a != null) {
            this.f43360c.setXfermode(this.f43361d);
            canvas.drawBitmap(this.f43358a, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f43360c);
            this.f43360c.setXfermode(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43359b = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        View childAt;
        super.onDescendantInvalidated(view, view2);
        if (this.f43359b || (childAt = getChildAt(0)) == null || !childAt.equals(view)) {
            return;
        }
        this.f43359b = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            this.f43359b = true;
        }
    }

    public void setRenderingMode(String str) {
        if (str.equals("software")) {
            setLayerType(1, null);
        } else {
            setLayerType(2, null);
        }
    }
}