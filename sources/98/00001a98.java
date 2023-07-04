package com.facebook.react.views.view;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.views.view.g;

/* loaded from: classes3.dex */
public abstract class ReactClippingViewManager<T extends g> extends ViewGroupManager<T> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ void addView(ViewGroup viewGroup, View view, int i11) {
        addView((ReactClippingViewManager<T>) ((g) viewGroup), view, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ View getChildAt(ViewGroup viewGroup, int i11) {
        return getChildAt((ReactClippingViewManager<T>) ((g) viewGroup), i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ int getChildCount(ViewGroup viewGroup) {
        return getChildCount((ReactClippingViewManager<T>) ((g) viewGroup));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ void removeAllViews(ViewGroup viewGroup) {
        removeAllViews((ReactClippingViewManager<T>) ((g) viewGroup));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ void removeViewAt(ViewGroup viewGroup, int i11) {
        removeViewAt((ReactClippingViewManager<T>) ((g) viewGroup), i11);
    }

    @ng.a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(T t11, boolean z11) {
        UiThreadUtil.assertOnUiThread();
        t11.setRemoveClippedSubviews(z11);
    }

    public void addView(T t11, View view, int i11) {
        UiThreadUtil.assertOnUiThread();
        if (t11.getRemoveClippedSubviews()) {
            t11.addViewWithSubviewClippingEnabled(view, i11);
        } else {
            t11.addView(view, i11);
        }
    }

    public View getChildAt(T t11, int i11) {
        if (t11.getRemoveClippedSubviews()) {
            return t11.getChildAtWithSubviewClippingEnabled(i11);
        }
        return t11.getChildAt(i11);
    }

    public int getChildCount(T t11) {
        if (t11.getRemoveClippedSubviews()) {
            return t11.getAllChildrenCount();
        }
        return t11.getChildCount();
    }

    public void removeAllViews(T t11) {
        UiThreadUtil.assertOnUiThread();
        if (t11.getRemoveClippedSubviews()) {
            t11.removeAllViewsWithSubviewClippingEnabled();
        } else {
            t11.removeAllViews();
        }
    }

    public void removeViewAt(T t11, int i11) {
        UiThreadUtil.assertOnUiThread();
        if (t11.getRemoveClippedSubviews()) {
            View childAt = getChildAt((ReactClippingViewManager<T>) t11, i11);
            if (childAt.getParent() != null) {
                t11.removeView(childAt);
            }
            t11.removeViewWithSubviewClippingEnabled(childAt);
            return;
        }
        t11.removeViewAt(i11);
    }
}