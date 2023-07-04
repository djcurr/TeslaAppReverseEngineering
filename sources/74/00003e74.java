package com.horcrux.svg;

import android.util.SparseArray;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.views.view.ReactViewManager;

/* loaded from: classes2.dex */
class SvgViewManager extends ReactViewManager {
    private static final String REACT_CLASS = "RNSVGSvgView";
    private static final SparseArray<SvgView> mTagToSvgView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SvgView getSvgViewByTag(int i11) {
        return mTagToSvgView.get(i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void runWhenViewIsAvailable(int i11, Runnable runnable) {
        mTagToRunnable.put(i11, runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setSvgView(int i11, SvgView svgView) {
        mTagToSvgView.put(i11, svgView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i11);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i11);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.g
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @ng.a(name = "align")
    public void setAlign(SvgView svgView, String str) {
        svgView.setAlign(str);
    }

    @ng.a(name = "bbHeight")
    public void setBbHeight(SvgView svgView, Dynamic dynamic) {
        svgView.setBbHeight(dynamic);
    }

    @ng.a(name = "bbWidth")
    public void setBbWidth(SvgView svgView, Dynamic dynamic) {
        svgView.setBbWidth(dynamic);
    }

    @ng.a(name = "color")
    public void setColor(SvgView svgView, Integer num) {
        svgView.setTintColor(num);
    }

    @ng.a(name = "meetOrSlice")
    public void setMeetOrSlice(SvgView svgView, int i11) {
        svgView.setMeetOrSlice(i11);
    }

    @ng.a(name = "minX")
    public void setMinX(SvgView svgView, float f11) {
        svgView.setMinX(f11);
    }

    @ng.a(name = "minY")
    public void setMinY(SvgView svgView, float f11) {
        svgView.setMinY(f11);
    }

    @ng.a(name = "tintColor")
    public void setTintColor(SvgView svgView, Integer num) {
        svgView.setTintColor(num);
    }

    @ng.a(name = "vbHeight")
    public void setVbHeight(SvgView svgView, float f11) {
        svgView.setVbHeight(f11);
    }

    @ng.a(name = "vbWidth")
    public void setVbWidth(SvgView svgView, float f11) {
        svgView.setVbWidth(f11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(com.facebook.react.views.view.g gVar) {
        super.onDropViewInstance((SvgViewManager) gVar);
        mTagToSvgView.remove(gVar.getId());
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public SvgView createViewInstance(com.facebook.react.uimanager.n0 n0Var) {
        return new SvgView(n0Var);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(com.facebook.react.views.view.g gVar, Object obj) {
        super.updateExtraData((SvgViewManager) gVar, obj);
        gVar.invalidate();
    }
}