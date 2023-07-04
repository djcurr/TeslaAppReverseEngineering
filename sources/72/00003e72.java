package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.Base64;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class SvgView extends com.facebook.react.views.view.g implements com.facebook.react.uimanager.v, com.facebook.react.uimanager.w {
    private String mAlign;
    private Bitmap mBitmap;
    private Canvas mCanvas;
    private final Map<String, a> mDefinedBrushes;
    private final Map<String, VirtualView> mDefinedClipPaths;
    private final Map<String, VirtualView> mDefinedMarkers;
    private final Map<String, VirtualView> mDefinedMasks;
    private final Map<String, VirtualView> mDefinedTemplates;
    final Matrix mInvViewBoxMatrix;
    private boolean mInvertible;
    private int mMeetOrSlice;
    private float mMinX;
    private float mMinY;
    private boolean mRendered;
    private boolean mResponsible;
    private final float mScale;
    int mTintColor;
    private float mVbHeight;
    private float mVbWidth;
    private SVGLength mbbHeight;
    private SVGLength mbbWidth;
    private Runnable toDataUrlTask;

    /* loaded from: classes2.dex */
    public enum Events {
        EVENT_DATA_URL("onDataURL");
        
        private final String mName;

        Events(String str) {
            this.mName = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mName;
        }
    }

    public SvgView(ReactContext reactContext) {
        super(reactContext);
        this.toDataUrlTask = null;
        this.mResponsible = false;
        this.mDefinedClipPaths = new HashMap();
        this.mDefinedTemplates = new HashMap();
        this.mDefinedMarkers = new HashMap();
        this.mDefinedMasks = new HashMap();
        this.mDefinedBrushes = new HashMap();
        this.mInvViewBoxMatrix = new Matrix();
        this.mInvertible = true;
        this.mRendered = false;
        this.mTintColor = 0;
        this.mScale = com.facebook.react.uimanager.c.c().density;
    }

    private void clearChildCache() {
        if (this.mRendered) {
            this.mRendered = false;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).clearChildCache();
                }
            }
        }
    }

    private Bitmap drawOutput() {
        boolean z11 = true;
        this.mRendered = true;
        float width = getWidth();
        float height = getHeight();
        if (!Float.isNaN(width) && !Float.isNaN(height) && width >= 1.0f && height >= 1.0f && Math.log10(width) + Math.log10(height) <= 42.0d) {
            z11 = false;
        }
        if (z11) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap((int) width, (int) height, Bitmap.Config.ARGB_8888);
        drawChildren(new Canvas(createBitmap));
        return createBitmap;
    }

    private RectF getViewBox() {
        float f11 = this.mMinX;
        float f12 = this.mScale;
        float f13 = this.mMinY;
        return new RectF(f11 * f12, f13 * f12, (f11 + this.mVbWidth) * f12, (f13 + this.mVbHeight) * f12);
    }

    private int hitTest(float f11, float f12) {
        if (this.mResponsible && this.mInvertible) {
            float[] fArr = {f11, f12};
            this.mInvViewBoxMatrix.mapPoints(fArr);
            int i11 = -1;
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (childAt instanceof VirtualView) {
                    i11 = ((VirtualView) childAt).hitTest(fArr);
                } else if (childAt instanceof SvgView) {
                    i11 = ((SvgView) childAt).hitTest(f11, f12);
                }
                if (i11 != -1) {
                    break;
                }
            }
            return i11 == -1 ? getId() : i11;
        }
        return getId();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void defineBrush(a aVar, String str) {
        this.mDefinedBrushes.put(str, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void defineClipPath(VirtualView virtualView, String str) {
        this.mDefinedClipPaths.put(str, virtualView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void defineMarker(VirtualView virtualView, String str) {
        this.mDefinedMarkers.put(str, virtualView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void defineMask(VirtualView virtualView, String str) {
        this.mDefinedMasks.put(str, virtualView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void defineTemplate(VirtualView virtualView, String str) {
        this.mDefinedTemplates.put(str, virtualView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void drawChildren(Canvas canvas) {
        this.mRendered = true;
        this.mCanvas = canvas;
        Matrix matrix = new Matrix();
        if (this.mAlign != null) {
            RectF viewBox = getViewBox();
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            boolean z11 = getParent() instanceof VirtualView;
            if (z11) {
                width = (float) x.a(this.mbbWidth, width, 0.0d, this.mScale, 12.0d);
                height = (float) x.a(this.mbbHeight, height, 0.0d, this.mScale, 12.0d);
            }
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
            if (z11) {
                canvas.clipRect(rectF);
            }
            matrix = t0.a(viewBox, rectF, this.mAlign, this.mMeetOrSlice);
            this.mInvertible = matrix.invert(this.mInvViewBoxMatrix);
            canvas.concat(matrix);
        }
        Paint paint = new Paint();
        paint.setFlags(385);
        paint.setTypeface(Typeface.DEFAULT);
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2 instanceof VirtualView) {
                VirtualView virtualView = (VirtualView) childAt2;
                int saveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, matrix);
                virtualView.render(canvas, paint, 1.0f);
                virtualView.restoreCanvas(canvas, saveAndSetupCanvas);
                if (virtualView.isResponsible() && !this.mResponsible) {
                    this.mResponsible = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void enableTouchEvents() {
        if (this.mResponsible) {
            return;
        }
        this.mResponsible = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Rect getCanvasBounds() {
        return this.mCanvas.getClipBounds();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a getDefinedBrush(String str) {
        return this.mDefinedBrushes.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VirtualView getDefinedClipPath(String str) {
        return this.mDefinedClipPaths.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VirtualView getDefinedMarker(String str) {
        return this.mDefinedMarkers.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VirtualView getDefinedMask(String str) {
        return this.mDefinedMasks.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VirtualView getDefinedTemplate(String str) {
        return this.mDefinedTemplates.get(str);
    }

    @Override // com.facebook.react.uimanager.w
    public boolean interceptsTouchEvent(float f11, float f12) {
        return true;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            if (this.mRendered) {
                this.mRendered = false;
                ((VirtualView) parent).getSvgView().invalidate();
                return;
            }
            return;
        }
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.mBitmap = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isResponsible() {
        return this.mResponsible;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean notRendered() {
        return !this.mRendered;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (getParent() instanceof VirtualView) {
            return;
        }
        super.onDraw(canvas);
        if (this.mBitmap == null) {
            this.mBitmap = drawOutput();
        }
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
            Runnable runnable = this.toDataUrlTask;
            if (runnable != null) {
                runnable.run();
                this.toDataUrlTask = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.g, android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        invalidate();
    }

    @Override // com.facebook.react.uimanager.v
    public int reactTagForTouch(float f11, float f12) {
        return hitTest(f11, f12);
    }

    @ng.a(name = "align")
    public void setAlign(String str) {
        this.mAlign = str;
        invalidate();
        clearChildCache();
    }

    @ng.a(name = "bbHeight")
    public void setBbHeight(Dynamic dynamic) {
        this.mbbHeight = SVGLength.b(dynamic);
        invalidate();
        clearChildCache();
    }

    @ng.a(name = "bbWidth")
    public void setBbWidth(Dynamic dynamic) {
        this.mbbWidth = SVGLength.b(dynamic);
        invalidate();
        clearChildCache();
    }

    @Override // android.view.View
    public void setId(int i11) {
        super.setId(i11);
        SvgViewManager.setSvgView(i11, this);
    }

    @ng.a(name = "meetOrSlice")
    public void setMeetOrSlice(int i11) {
        this.mMeetOrSlice = i11;
        invalidate();
        clearChildCache();
    }

    @ng.a(name = "minX")
    public void setMinX(float f11) {
        this.mMinX = f11;
        invalidate();
        clearChildCache();
    }

    @ng.a(name = "minY")
    public void setMinY(float f11) {
        this.mMinY = f11;
        invalidate();
        clearChildCache();
    }

    @ng.a(name = "tintColor")
    public void setTintColor(Integer num) {
        if (num == null) {
            this.mTintColor = 0;
        } else {
            this.mTintColor = num.intValue();
        }
        invalidate();
        clearChildCache();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setToDataUrlTask(Runnable runnable) {
        this.toDataUrlTask = runnable;
    }

    @ng.a(name = "vbHeight")
    public void setVbHeight(float f11) {
        this.mVbHeight = f11;
        invalidate();
        clearChildCache();
    }

    @ng.a(name = "vbWidth")
    public void setVbWidth(float f11) {
        this.mVbWidth = f11;
        invalidate();
        clearChildCache();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String toDataURL() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        clearChildCache();
        drawChildren(new Canvas(createBitmap));
        clearChildCache();
        invalidate();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        createBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String toDataURL(int i11, int i12) {
        Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        clearChildCache();
        drawChildren(new Canvas(createBitmap));
        clearChildCache();
        invalidate();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        createBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }
}