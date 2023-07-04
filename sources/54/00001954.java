package com.facebook.react.uimanager;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.j;
import com.facebook.react.uimanager.s;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.i18n.TextBundle;

/* loaded from: classes3.dex */
public abstract class BaseViewManager<T extends View, C extends i> extends ViewManager<T, C> implements b<T> {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    public static final Map<String, Integer> sStateDescription;
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static j.a sMatrixDecompositionContext = new j.a();
    private static double[] sTransformDecompositionArray = new double[16];

    static {
        HashMap hashMap = new HashMap();
        sStateDescription = hashMap;
        hashMap.put(STATE_BUSY, Integer.valueOf(com.facebook.react.i.f11894o));
        hashMap.put(STATE_EXPANDED, Integer.valueOf(com.facebook.react.i.f11896q));
        hashMap.put("collapsed", Integer.valueOf(com.facebook.react.i.f11895p));
    }

    private void logUnsupportedPropertyWarning(String str) {
        nd.a.I("ReactNative", "%s doesn't support property '%s'", getName(), str);
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(p.c(0.0f));
        view.setTranslationY(p.c(0.0f));
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(0.0f);
    }

    private static float sanitizeFloatPropertyValue(float f11) {
        if (f11 < -3.4028235E38f || f11 > Float.MAX_VALUE) {
            if (f11 < -3.4028235E38f || f11 == Float.NEGATIVE_INFINITY) {
                return -3.4028235E38f;
            }
            if (f11 > Float.MAX_VALUE || f11 == Float.POSITIVE_INFINITY) {
                return Float.MAX_VALUE;
            }
            if (Float.isNaN(f11)) {
                return 0.0f;
            }
            throw new IllegalStateException("Invalid float property value: " + f11);
        }
        return f11;
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        sMatrixDecompositionContext.a();
        p0.b(readableArray, sTransformDecompositionArray);
        j.k(sTransformDecompositionArray, sMatrixDecompositionContext);
        view.setTranslationX(p.c(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f12327d[0])));
        view.setTranslationY(p.c(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f12327d[1])));
        view.setRotation(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f12328e[2]));
        view.setRotationX(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f12328e[0]));
        view.setRotationY(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f12328e[1]));
        view.setScaleX(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f12325b[0]));
        view.setScaleY(sanitizeFloatPropertyValue((float) sMatrixDecompositionContext.f12325b[1]));
        double[] dArr = sMatrixDecompositionContext.f12324a;
        if (dArr.length > 2) {
            float f11 = (float) dArr[2];
            if (f11 == 0.0f) {
                f11 = 7.8125E-4f;
            }
            float f12 = (-1.0f) / f11;
            float f13 = c.c().density;
            view.setCameraDistance(sanitizeFloatPropertyValue(f13 * f13 * f12 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    private void updateViewAccessibility(T t11) {
        s.b(t11);
    }

    private void updateViewContentDescription(T t11) {
        Dynamic dynamic;
        int i11;
        String str = (String) t11.getTag(com.facebook.react.h.f11869c);
        ReadableMap readableMap = (ReadableMap) t11.getTag(com.facebook.react.h.f11871e);
        String str2 = (String) t11.getTag(com.facebook.react.h.f11868b);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t11.getTag(com.facebook.react.h.f11872f);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(nextKey);
                if (nextKey.equals(STATE_CHECKED) && dynamic2.getType() == ReadableType.String && dynamic2.asString().equals(STATE_MIXED)) {
                    arrayList.add(t11.getContext().getString(com.facebook.react.i.f11897r));
                } else if (nextKey.equals(STATE_BUSY) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    arrayList.add(t11.getContext().getString(com.facebook.react.i.f11894o));
                } else if (nextKey.equals(STATE_EXPANDED) && dynamic2.getType() == ReadableType.Boolean) {
                    Context context = t11.getContext();
                    if (dynamic2.asBoolean()) {
                        i11 = com.facebook.react.i.f11896q;
                    } else {
                        i11 = com.facebook.react.i.f11895p;
                    }
                    arrayList.add(context.getString(i11));
                }
            }
        }
        if (readableMap2 != null && readableMap2.hasKey(TextBundle.TEXT_ENTRY) && (dynamic = readableMap2.getDynamic(TextBundle.TEXT_ENTRY)) != null && dynamic.getType() == ReadableType.String) {
            arrayList.add(dynamic.asString());
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (arrayList.size() > 0) {
            t11.setContentDescription(TextUtils.join(", ", arrayList));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(yf.c.a().b("topAccessibilityAction", yf.c.d("registrationName", "onAccessibilityAction")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(T t11) {
        super.onAfterUpdateTransaction(t11);
        updateViewAccessibility(t11);
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(name = "accessibilityActions")
    public void setAccessibilityActions(T t11, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        t11.setTag(com.facebook.react.h.f11867a, readableArray);
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(name = "accessibilityHint")
    public void setAccessibilityHint(T t11, String str) {
        t11.setTag(com.facebook.react.h.f11868b, str);
        updateViewContentDescription(t11);
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(name = "accessibilityLabel")
    public void setAccessibilityLabel(T t11, String str) {
        t11.setTag(com.facebook.react.h.f11869c, str);
        updateViewContentDescription(t11);
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(name = "accessibilityLabelledBy")
    public void setAccessibilityLabelledBy(T t11, Dynamic dynamic) {
        if (dynamic.isNull()) {
            return;
        }
        if (dynamic.getType() == ReadableType.String) {
            t11.setTag(com.facebook.react.h.f11873g, dynamic.asString());
        } else if (dynamic.getType() == ReadableType.Array) {
            t11.setTag(com.facebook.react.h.f11873g, dynamic.asArray().getString(0));
        }
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(name = "accessibilityLiveRegion")
    public void setAccessibilityLiveRegion(T t11, String str) {
        if (str != null && !str.equals(PermissionsResponse.SCOPE_NONE)) {
            if (str.equals("polite")) {
                androidx.core.view.a0.y0(t11, 1);
                return;
            } else if (str.equals("assertive")) {
                androidx.core.view.a0.y0(t11, 2);
                return;
            } else {
                return;
            }
        }
        androidx.core.view.a0.y0(t11, 0);
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(name = "accessibilityRole")
    public void setAccessibilityRole(T t11, String str) {
        if (str == null) {
            return;
        }
        t11.setTag(com.facebook.react.h.f11870d, s.d.fromValue(str));
    }

    @ng.a(name = "accessibilityValue")
    public void setAccessibilityValue(T t11, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        t11.setTag(com.facebook.react.h.f11872f, readableMap);
        if (readableMap.hasKey(TextBundle.TEXT_ENTRY)) {
            updateViewContentDescription(t11);
        }
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(customType = "Color", defaultInt = 0, name = "backgroundColor")
    public void setBackgroundColor(T t11, int i11) {
        t11.setBackgroundColor(i11);
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderBottomLeftRadius(T t11, float f11) {
        logUnsupportedPropertyWarning("borderBottomLeftRadius");
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderBottomRightRadius(T t11, float f11) {
        logUnsupportedPropertyWarning("borderBottomRightRadius");
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderRadius(T t11, float f11) {
        logUnsupportedPropertyWarning("borderRadius");
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderTopLeftRadius(T t11, float f11) {
        logUnsupportedPropertyWarning("borderTopLeftRadius");
    }

    @Override // com.facebook.react.uimanager.b
    public void setBorderTopRightRadius(T t11, float f11) {
        logUnsupportedPropertyWarning("borderTopRightRadius");
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(name = "elevation")
    public void setElevation(T t11, float f11) {
        androidx.core.view.a0.D0(t11, p.c(f11));
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(name = "importantForAccessibility")
    public void setImportantForAccessibility(T t11, String str) {
        if (str != null && !str.equals("auto")) {
            if (str.equals("yes")) {
                androidx.core.view.a0.G0(t11, 1);
                return;
            } else if (str.equals("no")) {
                androidx.core.view.a0.G0(t11, 2);
                return;
            } else if (str.equals("no-hide-descendants")) {
                androidx.core.view.a0.G0(t11, 4);
                return;
            } else {
                return;
            }
        }
        androidx.core.view.a0.G0(t11, 0);
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(name = "nativeID")
    public void setNativeId(T t11, String str) {
        t11.setTag(com.facebook.react.h.f11879m, str);
        qg.a.c(t11);
    }

    @ng.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(T t11, float f11) {
        t11.setAlpha(f11);
    }

    @ng.a(name = "pointerenter")
    public void setPointerEnter(T t11, boolean z11) {
        t11.setTag(com.facebook.react.h.f11874h, Boolean.valueOf(z11));
    }

    @ng.a(name = "pointerleave")
    public void setPointerLeave(T t11, boolean z11) {
        t11.setTag(com.facebook.react.h.f11875i, Boolean.valueOf(z11));
    }

    @ng.a(name = "pointermove")
    public void setPointerMove(T t11, boolean z11) {
        t11.setTag(com.facebook.react.h.f11876j, Boolean.valueOf(z11));
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(name = "renderToHardwareTextureAndroid")
    public void setRenderToHardwareTexture(T t11, boolean z11) {
        t11.setLayerType(z11 ? 2 : 0, null);
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(name = "rotation")
    @Deprecated
    public void setRotation(T t11, float f11) {
        t11.setRotation(f11);
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(defaultFloat = 1.0f, name = "scaleX")
    @Deprecated
    public void setScaleX(T t11, float f11) {
        t11.setScaleX(f11);
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(defaultFloat = 1.0f, name = "scaleY")
    @Deprecated
    public void setScaleY(T t11, float f11) {
        t11.setScaleY(f11);
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(customType = "Color", defaultInt = -16777216, name = "shadowColor")
    public void setShadowColor(T t11, int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            t11.setOutlineAmbientShadowColor(i11);
            t11.setOutlineSpotShadowColor(i11);
        }
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(name = "testID")
    public void setTestId(T t11, String str) {
        t11.setTag(com.facebook.react.h.f11877k, str);
        t11.setTag(str);
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(name = "transform")
    public void setTransform(T t11, ReadableArray readableArray) {
        if (readableArray == null) {
            resetTransformProperty(t11);
        } else {
            setTransformProperty(t11, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(defaultFloat = 0.0f, name = "translateX")
    @Deprecated
    public void setTranslateX(T t11, float f11) {
        t11.setTranslationX(p.c(f11));
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(defaultFloat = 0.0f, name = "translateY")
    @Deprecated
    public void setTranslateY(T t11, float f11) {
        t11.setTranslationY(p.c(f11));
    }

    @Override // com.facebook.react.uimanager.b
    @ng.a(name = "accessibilityState")
    public void setViewState(T t11, ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        if (readableMap.hasKey("selected")) {
            boolean isSelected = t11.isSelected();
            boolean z11 = readableMap.getBoolean("selected");
            t11.setSelected(z11);
            if (t11.isAccessibilityFocused() && isSelected && !z11) {
                t11.announceForAccessibility(t11.getContext().getString(com.facebook.react.i.f11900u));
            }
        } else {
            t11.setSelected(false);
        }
        t11.setTag(com.facebook.react.h.f11871e, readableMap);
        t11.setEnabled(true);
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (!nextKey.equals(STATE_BUSY) && !nextKey.equals(STATE_EXPANDED) && (!nextKey.equals(STATE_CHECKED) || readableMap.getType(STATE_CHECKED) != ReadableType.String)) {
                if (t11.isAccessibilityFocused()) {
                    t11.sendAccessibilityEvent(1);
                }
            } else {
                updateViewContentDescription(t11);
                return;
            }
        }
    }

    @ng.a(name = "zIndex")
    public void setZIndex(T t11, float f11) {
        ViewGroupManager.setViewZIndex(t11, Math.round(f11));
        ViewParent parent = t11.getParent();
        if (parent instanceof g0) {
            ((g0) parent).updateDrawingOrder();
        }
    }
}