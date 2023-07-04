package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import expo.modules.interfaces.permissions.PermissionsResponse;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class i extends l {

    /* renamed from: c  reason: collision with root package name */
    SVGLength f17609c;

    /* renamed from: d  reason: collision with root package name */
    SVGLength f17610d;

    /* renamed from: e  reason: collision with root package name */
    SVGLength f17611e;

    /* renamed from: f  reason: collision with root package name */
    SVGLength f17612f;

    /* renamed from: g  reason: collision with root package name */
    Bitmap f17613g;

    /* renamed from: h  reason: collision with root package name */
    Canvas f17614h;

    public i(ReactContext reactContext) {
        super(reactContext);
        this.f17613g = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        this.f17614h = new Canvas(this.f17613g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l
    public void c(Canvas canvas, Paint paint, float f11) {
        j();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (!(childAt instanceof q)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!PermissionsResponse.SCOPE_NONE.equals(virtualView.mDisplay)) {
                        boolean z11 = virtualView instanceof RenderableView;
                        if (z11) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int saveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, this.mCTM);
                        virtualView.render(canvas, paint, this.mOpacity * f11);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(canvas, saveAndSetupCanvas);
                        if (z11) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                } else {
                    childAt.draw(canvas);
                }
            }
        }
        setClientRect(rectF);
        i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(this.f17614h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f11) {
        canvas.translate((float) relativeOnWidth(this.f17609c), (float) relativeOnHeight(this.f17610d));
        canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) relativeOnWidth(this.f17611e), (float) relativeOnHeight(this.f17612f));
        super.draw(canvas, paint, f11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.g, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j11) {
        return super.drawChild(this.f17614h, view, j11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    @ng.a(name = Snapshot.HEIGHT)
    public void setHeight(Dynamic dynamic) {
        this.f17612f = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = Snapshot.WIDTH)
    public void setWidth(Dynamic dynamic) {
        this.f17611e = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "x")
    public void setX(Dynamic dynamic) {
        this.f17609c = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "y")
    public void setY(Dynamic dynamic) {
        this.f17610d = SVGLength.b(dynamic);
        invalidate();
    }
}