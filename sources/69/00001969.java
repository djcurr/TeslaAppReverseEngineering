package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes3.dex */
public interface b<T extends View> {
    void setAccessibilityActions(T t11, ReadableArray readableArray);

    void setAccessibilityHint(T t11, String str);

    void setAccessibilityLabel(T t11, String str);

    void setAccessibilityLabelledBy(T t11, Dynamic dynamic);

    void setAccessibilityLiveRegion(T t11, String str);

    void setAccessibilityRole(T t11, String str);

    void setBackgroundColor(T t11, int i11);

    void setBorderBottomLeftRadius(T t11, float f11);

    void setBorderBottomRightRadius(T t11, float f11);

    void setBorderRadius(T t11, float f11);

    void setBorderTopLeftRadius(T t11, float f11);

    void setBorderTopRightRadius(T t11, float f11);

    void setElevation(T t11, float f11);

    void setImportantForAccessibility(T t11, String str);

    void setNativeId(T t11, String str);

    void setOpacity(T t11, float f11);

    void setRenderToHardwareTexture(T t11, boolean z11);

    void setRotation(T t11, float f11);

    void setScaleX(T t11, float f11);

    void setScaleY(T t11, float f11);

    void setShadowColor(T t11, int i11);

    void setTestId(T t11, String str);

    void setTransform(T t11, ReadableArray readableArray);

    void setTranslateX(T t11, float f11);

    void setTranslateY(T t11, float f11);

    void setViewState(T t11, ReadableMap readableMap);

    void setZIndex(T t11, float f11);
}