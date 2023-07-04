package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class l extends RenderableView {

    /* renamed from: a  reason: collision with root package name */
    ReadableMap f17644a;

    /* renamed from: b  reason: collision with root package name */
    private j f17645b;

    public l(ReactContext reactContext) {
        super(reactContext);
    }

    private static <T> T k(T t11) {
        Objects.requireNonNull(t11);
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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
                }
            }
        }
        setClientRect(rectF);
        i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(Canvas canvas, Paint paint, float f11) {
        super.draw(canvas, paint, f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f11) {
        l(canvas);
        clip(canvas, paint);
        c(canvas, paint, f11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j f() {
        return this.f17645b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path g(Canvas canvas, Paint paint, Region.Op op2) {
        Path path;
        Path path2;
        Path path3 = new Path();
        int i11 = 0;
        if (Build.VERSION.SDK_INT >= 19) {
            Path.Op valueOf = Path.Op.valueOf(op2.name());
            while (i11 < getChildCount()) {
                View childAt = getChildAt(i11);
                if (!(childAt instanceof q) && (childAt instanceof VirtualView)) {
                    VirtualView virtualView = (VirtualView) childAt;
                    Matrix matrix = virtualView.mMatrix;
                    if (virtualView instanceof l) {
                        path2 = ((l) virtualView).g(canvas, paint, op2);
                    } else {
                        path2 = virtualView.getPath(canvas, paint);
                    }
                    path2.transform(matrix);
                    path3.op(path2, valueOf);
                }
                i11++;
            }
        } else {
            Region region = new Region(canvas.getClipBounds());
            Region region2 = new Region();
            while (i11 < getChildCount()) {
                View childAt2 = getChildAt(i11);
                if (!(childAt2 instanceof q) && (childAt2 instanceof VirtualView)) {
                    VirtualView virtualView2 = (VirtualView) childAt2;
                    Matrix matrix2 = virtualView2.mMatrix;
                    if (virtualView2 instanceof l) {
                        path = ((l) virtualView2).g(canvas, paint, op2);
                    } else {
                        path = virtualView2.getPath(canvas, paint);
                    }
                    if (matrix2 != null) {
                        path.transform(matrix2);
                    }
                    Region region3 = new Region();
                    region3.setPath(path, region);
                    region2.op(region3, op2);
                }
                i11++;
            }
            path3.addPath(region2.getBoundaryPath());
        }
        return path3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        ((VirtualView) this).mPath = new Path();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (!(childAt instanceof q) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                ((VirtualView) this).mPath.addPath(virtualView.getPath(canvas, paint), virtualView.mMatrix);
            }
        }
        return ((VirtualView) this).mPath;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j h() {
        return ((l) k(getTextRoot())).f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        int reactTagForTouch;
        VirtualView virtualView;
        int hitTest;
        if (this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            Path clipPath = getClipPath();
            if (clipPath != null) {
                if (this.mClipRegionPath != clipPath) {
                    this.mClipRegionPath = clipPath;
                    RectF rectF = new RectF();
                    this.mClipBounds = rectF;
                    clipPath.computeBounds(rectF, true);
                    this.mClipRegion = getRegion(clipPath, this.mClipBounds);
                }
                if (!this.mClipRegion.contains(round, round2)) {
                    return -1;
                }
            }
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (childAt instanceof VirtualView) {
                    if (!(childAt instanceof q) && (hitTest = (virtualView = (VirtualView) childAt).hitTest(fArr2)) != -1) {
                        return (virtualView.isResponsible() || hitTest != childAt.getId()) ? hitTest : getId();
                    }
                } else if ((childAt instanceof SvgView) && (reactTagForTouch = ((SvgView) childAt).reactTagForTouch(fArr2[0], fArr2[1])) != childAt.getId()) {
                    return reactTagForTouch;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        h().n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        h().o(this, this.f17644a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        Matrix matrix2 = this.mTransform;
        if (matrix2 != null) {
            matrix2.mapRect(rectF);
        }
        this.f17645b = new j(this.mScale, rectF.width(), rectF.height());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView
    public void resetProperties() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof RenderableView) {
                ((RenderableView) childAt).resetProperties();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }

    @ng.a(name = PaymentSheetEvent.FIELD_FONT)
    public void setFont(ReadableMap readableMap) {
        this.f17644a = readableMap;
        invalidate();
    }
}