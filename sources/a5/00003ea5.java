package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class s0 extends RenderableView {

    /* renamed from: a  reason: collision with root package name */
    private String f17701a;

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f17702b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f17703c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f17704d;

    /* renamed from: e  reason: collision with root package name */
    private SVGLength f17705e;

    public s0(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f11) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f17701a);
        if (definedTemplate == null) {
            nd.a.G("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f17701a + " is not defined.");
            return;
        }
        definedTemplate.clearCache();
        canvas.translate((float) relativeOnWidth(this.f17702b), (float) relativeOnHeight(this.f17703c));
        boolean z11 = definedTemplate instanceof RenderableView;
        if (z11) {
            ((RenderableView) definedTemplate).mergeProperties(this);
        }
        int saveAndSetupCanvas = definedTemplate.saveAndSetupCanvas(canvas, this.mCTM);
        clip(canvas, paint);
        if (definedTemplate instanceof d0) {
            ((d0) definedTemplate).m(canvas, paint, f11, (float) relativeOnWidth(this.f17704d), (float) relativeOnHeight(this.f17705e));
        } else {
            definedTemplate.draw(canvas, paint, f11 * this.mOpacity);
        }
        setClientRect(definedTemplate.getClientRect());
        definedTemplate.restoreCanvas(canvas, saveAndSetupCanvas);
        if (z11) {
            ((RenderableView) definedTemplate).resetProperties();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f17701a);
        if (definedTemplate == null) {
            nd.a.G("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f17701a + " is not defined.");
            return null;
        }
        Path path = definedTemplate.getPath(canvas, paint);
        Path path2 = new Path();
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) relativeOnWidth(this.f17702b), (float) relativeOnHeight(this.f17703c));
        path.transform(matrix, path2);
        return path2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        if (this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f17701a);
            if (definedTemplate == null) {
                nd.a.G("ReactNative", "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f17701a + " is not defined.");
                return -1;
            }
            int hitTest = definedTemplate.hitTest(fArr2);
            if (hitTest != -1) {
                return (definedTemplate.isResponsible() || hitTest != definedTemplate.getId()) ? hitTest : getId();
            }
        }
        return -1;
    }

    @ng.a(name = Snapshot.HEIGHT)
    public void setHeight(Dynamic dynamic) {
        this.f17705e = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "href")
    public void setHref(String str) {
        this.f17701a = str;
        invalidate();
    }

    @ng.a(name = Snapshot.WIDTH)
    public void setWidth(Dynamic dynamic) {
        this.f17704d = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "x")
    public void setX(Dynamic dynamic) {
        this.f17702b = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "y")
    public void setY(Dynamic dynamic) {
        this.f17703c = SVGLength.b(dynamic);
        invalidate();
    }
}