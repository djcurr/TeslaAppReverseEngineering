package com.facebook.react.views.scroll;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.core.view.a0;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.e0;
import com.facebook.react.uimanager.m0;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.p;
import com.facebook.react.uimanager.q;
import com.facebook.react.views.scroll.a;
import com.facebook.yoga.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import wg.e;
import wg.f;
import yf.c;

@fg.a(name = ReactScrollViewManager.REACT_CLASS)
/* loaded from: classes3.dex */
public class ReactScrollViewManager extends ViewGroupManager<e> implements a.InterfaceC0237a<e> {
    public static final String REACT_CLASS = "RCTScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private wg.a mFpsListener;

    public ReactScrollViewManager() {
        this(null);
    }

    public static Map<String, Object> createExportedCustomDirectEventTypeConstants() {
        return c.a().b(b.getJSEventName(b.SCROLL), c.d("registrationName", "onScroll")).b(b.getJSEventName(b.BEGIN_DRAG), c.d("registrationName", "onScrollBeginDrag")).b(b.getJSEventName(b.END_DRAG), c.d("registrationName", "onScrollEndDrag")).b(b.getJSEventName(b.MOMENTUM_BEGIN), c.d("registrationName", "onMomentumScrollBegin")).b(b.getJSEventName(b.MOMENTUM_END), c.d("registrationName", "onMomentumScrollEnd")).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return a.a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(createExportedCustomDirectEventTypeConstants());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ng.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(e eVar, int i11, Integer num) {
        eVar.t(SPACING_TYPES[i11], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @ng.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(e eVar, int i11, float f11) {
        if (!g.a(f11)) {
            f11 = p.c(f11);
        }
        if (i11 == 0) {
            eVar.setBorderRadius(f11);
        } else {
            eVar.u(f11, i11 - 1);
        }
    }

    @ng.a(name = "borderStyle")
    public void setBorderStyle(e eVar, String str) {
        eVar.setBorderStyle(str);
    }

    @ng.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(e eVar, int i11, float f11) {
        if (!g.a(f11)) {
            f11 = p.c(f11);
        }
        eVar.v(SPACING_TYPES[i11], f11);
    }

    @ng.a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(e eVar, int i11) {
        eVar.setEndFillColor(i11);
    }

    @ng.a(customType = "Point", name = "contentOffset")
    public void setContentOffset(e eVar, ReadableMap readableMap) {
        if (readableMap != null) {
            eVar.scrollTo((int) p.b(readableMap.hasKey("x") ? readableMap.getDouble("x") : 0.0d), (int) p.b(readableMap.hasKey("y") ? readableMap.getDouble("y") : 0.0d));
        } else {
            eVar.scrollTo(0, 0);
        }
    }

    @ng.a(name = "decelerationRate")
    public void setDecelerationRate(e eVar, float f11) {
        eVar.setDecelerationRate(f11);
    }

    @ng.a(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(e eVar, boolean z11) {
        eVar.setDisableIntervalMomentum(z11);
    }

    @ng.a(name = "fadingEdgeLength")
    public void setFadingEdgeLength(e eVar, int i11) {
        if (i11 > 0) {
            eVar.setVerticalFadingEdgeEnabled(true);
            eVar.setFadingEdgeLength(i11);
            return;
        }
        eVar.setVerticalFadingEdgeEnabled(false);
        eVar.setFadingEdgeLength(0);
    }

    @ng.a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(e eVar, boolean z11) {
        a0.I0(eVar, z11);
    }

    @ng.a(name = "overScrollMode")
    public void setOverScrollMode(e eVar, String str) {
        eVar.setOverScrollMode(f.l(str));
    }

    @ng.a(name = "overflow")
    public void setOverflow(e eVar, String str) {
        eVar.setOverflow(str);
    }

    @ng.a(name = "pagingEnabled")
    public void setPagingEnabled(e eVar, boolean z11) {
        eVar.setPagingEnabled(z11);
    }

    @ng.a(name = "persistentScrollbar")
    public void setPersistentScrollbar(e eVar, boolean z11) {
        eVar.setScrollbarFadingEnabled(!z11);
    }

    @ng.a(name = "pointerEvents")
    public void setPointerEvents(e eVar, String str) {
        eVar.setPointerEvents(q.parsePointerEvents(str));
    }

    @ng.a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(e eVar, boolean z11) {
        eVar.setRemoveClippedSubviews(z11);
    }

    @ng.a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(e eVar, boolean z11) {
        eVar.setScrollEnabled(z11);
        eVar.setFocusable(z11);
    }

    @ng.a(name = "scrollPerfTag")
    public void setScrollPerfTag(e eVar, String str) {
        eVar.setScrollPerfTag(str);
    }

    @ng.a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(e eVar, boolean z11) {
        eVar.setSendMomentumEvents(z11);
    }

    @ng.a(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(e eVar, boolean z11) {
        eVar.setVerticalScrollBarEnabled(z11);
    }

    @ng.a(name = "snapToAlignment")
    public void setSnapToAlignment(e eVar, String str) {
        eVar.setSnapToAlignment(f.m(str));
    }

    @ng.a(name = "snapToEnd")
    public void setSnapToEnd(e eVar, boolean z11) {
        eVar.setSnapToEnd(z11);
    }

    @ng.a(name = "snapToInterval")
    public void setSnapToInterval(e eVar, float f11) {
        eVar.setSnapInterval((int) (f11 * com.facebook.react.uimanager.c.c().density));
    }

    @ng.a(name = "snapToOffsets")
    public void setSnapToOffsets(e eVar, ReadableArray readableArray) {
        if (readableArray == null) {
            eVar.setSnapOffsets(null);
            return;
        }
        DisplayMetrics c11 = com.facebook.react.uimanager.c.c();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i11) * c11.density)));
        }
        eVar.setSnapOffsets(arrayList);
    }

    @ng.a(name = "snapToStart")
    public void setSnapToStart(e eVar, boolean z11) {
        eVar.setSnapToStart(z11);
    }

    public ReactScrollViewManager(wg.a aVar) {
        this.mFpsListener = null;
        this.mFpsListener = aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public e createViewInstance(n0 n0Var) {
        return new e(n0Var, this.mFpsListener);
    }

    @Override // com.facebook.react.views.scroll.a.InterfaceC0237a
    public void flashScrollIndicators(e eVar) {
        eVar.k();
    }

    @Override // com.facebook.react.views.scroll.a.InterfaceC0237a
    public void scrollTo(e eVar, a.b bVar) {
        if (bVar.f12581c) {
            eVar.r(bVar.f12579a, bVar.f12580b);
        } else {
            eVar.scrollTo(bVar.f12579a, bVar.f12580b);
        }
    }

    @Override // com.facebook.react.views.scroll.a.InterfaceC0237a
    public void scrollToEnd(e eVar, a.c cVar) {
        View childAt = eVar.getChildAt(0);
        if (childAt != null) {
            int height = childAt.getHeight() + eVar.getPaddingBottom();
            if (cVar.f12582a) {
                eVar.r(eVar.getScrollX(), height);
                return;
            } else {
                eVar.scrollTo(eVar.getScrollX(), height);
                return;
            }
        }
        throw new RetryableMountingLayerException("scrollToEnd called on ScrollView without child");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(e eVar, e0 e0Var, m0 m0Var) {
        eVar.getFabricViewStateManager().e(m0Var);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(e eVar, int i11, ReadableArray readableArray) {
        a.b(this, eVar, i11, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(e eVar, String str, ReadableArray readableArray) {
        a.c(this, eVar, str, readableArray);
    }
}