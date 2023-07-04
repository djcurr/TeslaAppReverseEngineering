package com.horcrux.svg;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes2.dex */
class RNSVGRenderableManager extends ReactContextBaseJavaModule {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int EOF = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RNSVGRenderableManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getBBox(int i11, ReadableMap readableMap) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i11);
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        boolean z11 = readableMap.getBoolean("fill");
        boolean z12 = readableMap.getBoolean("stroke");
        boolean z13 = readableMap.getBoolean("markers");
        boolean z14 = readableMap.getBoolean("clipped");
        try {
            renderableViewByTag.getPath(null, null);
            float f11 = renderableViewByTag.mScale;
            renderableViewByTag.initBounds();
            RectF rectF = new RectF();
            RectF rectF2 = renderableViewByTag.mFillBounds;
            RectF rectF3 = renderableViewByTag.mStrokeBounds;
            RectF rectF4 = renderableViewByTag.mMarkerBounds;
            RectF rectF5 = renderableViewByTag.mClipBounds;
            if (z11 && rectF2 != null) {
                rectF.union(rectF2);
            }
            if (z12 && rectF3 != null) {
                rectF.union(rectF3);
            }
            if (z13 && rectF4 != null) {
                rectF.union(rectF4);
            }
            if (z14 && rectF5 != null) {
                rectF.intersect(rectF5);
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("x", rectF.left / f11);
            createMap.putDouble("y", rectF.top / f11);
            createMap.putDouble(Snapshot.WIDTH, rectF.width() / f11);
            createMap.putDouble(Snapshot.HEIGHT, rectF.height() / f11);
            return createMap;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return Arguments.createMap();
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getCTM(int i11) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i11);
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        float f11 = renderableViewByTag.mScale;
        Matrix matrix = new Matrix(renderableViewByTag.mCTM);
        matrix.preConcat(renderableViewByTag.getSvgView().mInvViewBoxMatrix);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("a", fArr[0]);
        createMap.putDouble("b", fArr[3]);
        createMap.putDouble(cg.c.f9084i, fArr[1]);
        createMap.putDouble("d", fArr[4]);
        createMap.putDouble("e", fArr[2] / f11);
        createMap.putDouble("f", fArr[5] / f11);
        return createMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGRenderableManager";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getPointAtLength(int i11, ReadableMap readableMap) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i11);
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        try {
            PathMeasure pathMeasure = new PathMeasure(renderableViewByTag.getPath(null, null), false);
            float f11 = (float) readableMap.getDouble("length");
            float f12 = renderableViewByTag.mScale;
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            pathMeasure.getPosTan(Math.max((float) BitmapDescriptorFactory.HUE_RED, Math.min(f11, pathMeasure.getLength())), fArr, fArr2);
            double atan2 = Math.atan2(fArr2[1], fArr2[0]);
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("x", fArr[0] / f12);
            createMap.putDouble("y", fArr[1] / f12);
            createMap.putDouble("angle", atan2);
            return createMap;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return Arguments.createMap();
        }
    }

    @ReactMethod
    public void getRawResource(String str, Promise promise) {
        try {
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Resources resources = reactApplicationContext.getResources();
            InputStream openRawResource = resources.openRawResource(resources.getIdentifier(str, "raw", reactApplicationContext.getPackageName()));
            InputStreamReader inputStreamReader = new InputStreamReader(openRawResource, yf.f.f59495a);
            char[] cArr = new char[4096];
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                int read = inputStreamReader.read(cArr, 0, 4096);
                if (read != -1) {
                    sb2.append(cArr, 0, read);
                } else {
                    promise.resolve(sb2.toString());
                    try {
                        openRawResource.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            promise.reject(e11);
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getScreenCTM(int i11) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i11);
        if (renderableViewByTag == null) {
            return Arguments.createMap();
        }
        float[] fArr = new float[9];
        renderableViewByTag.mCTM.getValues(fArr);
        float f11 = renderableViewByTag.mScale;
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("a", fArr[0]);
        createMap.putDouble("b", fArr[3]);
        createMap.putDouble(cg.c.f9084i, fArr[1]);
        createMap.putDouble("d", fArr[4]);
        createMap.putDouble("e", fArr[2] / f11);
        createMap.putDouble("f", fArr[5] / f11);
        return createMap;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public float getTotalLength(int i11) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i11);
        if (renderableViewByTag == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        try {
            return new PathMeasure(renderableViewByTag.getPath(null, null), false).getLength() / renderableViewByTag.mScale;
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return -1.0f;
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPointInFill(int i11, ReadableMap readableMap) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i11);
        if (renderableViewByTag == null) {
            return false;
        }
        float f11 = renderableViewByTag.mScale;
        return renderableViewByTag.hitTest(new float[]{((float) readableMap.getDouble("x")) * f11, ((float) readableMap.getDouble("y")) * f11}) != -1;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean isPointInStroke(int i11, ReadableMap readableMap) {
        RenderableView renderableViewByTag = RenderableViewManager.getRenderableViewByTag(i11);
        if (renderableViewByTag == null) {
            return false;
        }
        try {
            renderableViewByTag.getPath(null, null);
            renderableViewByTag.initBounds();
            double d11 = renderableViewByTag.mScale;
            int i12 = (int) (readableMap.getDouble("x") * d11);
            int i13 = (int) (readableMap.getDouble("y") * d11);
            Region region = renderableViewByTag.mStrokeRegion;
            return region != null && region.contains(i12, i13);
        } catch (NullPointerException unused) {
            renderableViewByTag.invalidate();
            return false;
        }
    }
}