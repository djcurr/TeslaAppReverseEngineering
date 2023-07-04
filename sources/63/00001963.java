package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public abstract class ViewGroupManager<T extends ViewGroup> extends BaseViewManager<T, i> implements g {
    private static WeakHashMap<View, Integer> mZIndexHash = new WeakHashMap<>();

    public static Integer getViewZIndex(View view) {
        return mZIndexHash.get(view);
    }

    public static void setViewZIndex(View view, int i11) {
        mZIndexHash.put(view, Integer.valueOf(i11));
    }

    public void addView(T t11, View view, int i11) {
        t11.addView(view, i11);
    }

    public void addViews(T t11, List<View> list) {
        UiThreadUtil.assertOnUiThread();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            addView(t11, list.get(i11), i11);
        }
    }

    public View getChildAt(T t11, int i11) {
        return t11.getChildAt(i11);
    }

    public int getChildCount(T t11) {
        return t11.getChildCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends i> getShadowNodeClass() {
        return i.class;
    }

    @Override // com.facebook.react.uimanager.g
    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public void removeAllViews(T t11) {
        UiThreadUtil.assertOnUiThread();
        for (int childCount = getChildCount(t11) - 1; childCount >= 0; childCount--) {
            removeViewAt(t11, childCount);
        }
    }

    public void removeView(T t11, View view) {
        UiThreadUtil.assertOnUiThread();
        for (int i11 = 0; i11 < getChildCount(t11); i11++) {
            if (getChildAt(t11, i11) == view) {
                removeViewAt(t11, i11);
                return;
            }
        }
    }

    public void removeViewAt(T t11, int i11) {
        UiThreadUtil.assertOnUiThread();
        t11.removeViewAt(i11);
    }

    public boolean shouldPromoteGrandchildren() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ void updateExtraData(View view, Object obj) {
        updateExtraData((ViewGroupManager<T>) ((ViewGroup) view), obj);
    }

    public void updateExtraData(T t11, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public i createShadowNodeInstance() {
        return new i();
    }
}