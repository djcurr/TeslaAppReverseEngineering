package com.facebook.react.views.scroll;

import android.util.DisplayMetrics;
import androidx.core.view.a0;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.c;
import com.facebook.react.uimanager.e0;
import com.facebook.react.uimanager.m0;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.p;
import com.facebook.react.uimanager.q;
import com.facebook.react.views.scroll.a;
import com.facebook.yoga.g;
import java.util.ArrayList;
import wg.d;
import wg.f;

@fg.a(name = ReactHorizontalScrollViewManager.REACT_CLASS)
/* loaded from: classes3.dex */
public class ReactHorizontalScrollViewManager extends ViewGroupManager<d> implements a.InterfaceC0237a<d> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private wg.a mFpsListener;

    public ReactHorizontalScrollViewManager() {
        this(null);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ng.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(d dVar, int i11, Integer num) {
        dVar.y(SPACING_TYPES[i11], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @ng.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(d dVar, int i11, float f11) {
        if (!g.a(f11)) {
            f11 = p.c(f11);
        }
        if (i11 == 0) {
            dVar.setBorderRadius(f11);
        } else {
            dVar.z(f11, i11 - 1);
        }
    }

    @ng.a(name = "borderStyle")
    public void setBorderStyle(d dVar, String str) {
        dVar.setBorderStyle(str);
    }

    @ng.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(d dVar, int i11, float f11) {
        if (!g.a(f11)) {
            f11 = p.c(f11);
        }
        dVar.A(SPACING_TYPES[i11], f11);
    }

    @ng.a(customType = "Color", defaultInt = 0, name = "endFillColor")
    public void setBottomFillColor(d dVar, int i11) {
        dVar.setEndFillColor(i11);
    }

    @ng.a(name = "contentOffset")
    public void setContentOffset(d dVar, ReadableMap readableMap) {
        if (readableMap != null) {
            dVar.scrollTo((int) p.b(readableMap.hasKey("x") ? readableMap.getDouble("x") : 0.0d), (int) p.b(readableMap.hasKey("y") ? readableMap.getDouble("y") : 0.0d));
        } else {
            dVar.scrollTo(0, 0);
        }
    }

    @ng.a(name = "decelerationRate")
    public void setDecelerationRate(d dVar, float f11) {
        dVar.setDecelerationRate(f11);
    }

    @ng.a(name = "disableIntervalMomentum")
    public void setDisableIntervalMomentum(d dVar, boolean z11) {
        dVar.setDisableIntervalMomentum(z11);
    }

    @ng.a(name = "fadingEdgeLength")
    public void setFadingEdgeLength(d dVar, int i11) {
        if (i11 > 0) {
            dVar.setHorizontalFadingEdgeEnabled(true);
            dVar.setFadingEdgeLength(i11);
            return;
        }
        dVar.setHorizontalFadingEdgeEnabled(false);
        dVar.setFadingEdgeLength(0);
    }

    @ng.a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(d dVar, boolean z11) {
        a0.I0(dVar, z11);
    }

    @ng.a(name = "overScrollMode")
    public void setOverScrollMode(d dVar, String str) {
        dVar.setOverScrollMode(f.l(str));
    }

    @ng.a(name = "overflow")
    public void setOverflow(d dVar, String str) {
        dVar.setOverflow(str);
    }

    @ng.a(name = "pagingEnabled")
    public void setPagingEnabled(d dVar, boolean z11) {
        dVar.setPagingEnabled(z11);
    }

    @ng.a(name = "persistentScrollbar")
    public void setPersistentScrollbar(d dVar, boolean z11) {
        dVar.setScrollbarFadingEnabled(!z11);
    }

    @ng.a(name = "pointerEvents")
    public void setPointerEvents(d dVar, String str) {
        dVar.setPointerEvents(q.parsePointerEvents(str));
    }

    @ng.a(name = "removeClippedSubviews")
    public void setRemoveClippedSubviews(d dVar, boolean z11) {
        dVar.setRemoveClippedSubviews(z11);
    }

    @ng.a(defaultBoolean = true, name = "scrollEnabled")
    public void setScrollEnabled(d dVar, boolean z11) {
        dVar.setScrollEnabled(z11);
    }

    @ng.a(name = "scrollPerfTag")
    public void setScrollPerfTag(d dVar, String str) {
        dVar.setScrollPerfTag(str);
    }

    @ng.a(name = "sendMomentumEvents")
    public void setSendMomentumEvents(d dVar, boolean z11) {
        dVar.setSendMomentumEvents(z11);
    }

    @ng.a(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(d dVar, boolean z11) {
        dVar.setHorizontalScrollBarEnabled(z11);
    }

    @ng.a(name = "snapToAlignment")
    public void setSnapToAlignment(d dVar, String str) {
        dVar.setSnapToAlignment(f.m(str));
    }

    @ng.a(name = "snapToEnd")
    public void setSnapToEnd(d dVar, boolean z11) {
        dVar.setSnapToEnd(z11);
    }

    @ng.a(name = "snapToInterval")
    public void setSnapToInterval(d dVar, float f11) {
        dVar.setSnapInterval((int) (f11 * c.c().density));
    }

    @ng.a(name = "snapToOffsets")
    public void setSnapToOffsets(d dVar, ReadableArray readableArray) {
        if (readableArray == null) {
            dVar.setSnapOffsets(null);
            return;
        }
        DisplayMetrics c11 = c.c();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            arrayList.add(Integer.valueOf((int) (readableArray.getDouble(i11) * c11.density)));
        }
        dVar.setSnapOffsets(arrayList);
    }

    @ng.a(name = "snapToStart")
    public void setSnapToStart(d dVar, boolean z11) {
        dVar.setSnapToStart(z11);
    }

    public ReactHorizontalScrollViewManager(wg.a aVar) {
        this.mFpsListener = null;
        this.mFpsListener = aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public d createViewInstance(n0 n0Var) {
        return new d(n0Var, this.mFpsListener);
    }

    @Override // com.facebook.react.views.scroll.a.InterfaceC0237a
    public void flashScrollIndicators(d dVar) {
        dVar.l();
    }

    @Override // com.facebook.react.views.scroll.a.InterfaceC0237a
    public void scrollTo(d dVar, a.b bVar) {
        if (bVar.f12581c) {
            dVar.w(bVar.f12579a, bVar.f12580b);
        } else {
            dVar.scrollTo(bVar.f12579a, bVar.f12580b);
        }
    }

    @Override // com.facebook.react.views.scroll.a.InterfaceC0237a
    public void scrollToEnd(d dVar, a.c cVar) {
        int width = dVar.getChildAt(0).getWidth() + dVar.getPaddingRight();
        if (cVar.f12582a) {
            dVar.w(width, dVar.getScrollY());
        } else {
            dVar.scrollTo(width, dVar.getScrollY());
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(d dVar, e0 e0Var, m0 m0Var) {
        dVar.getFabricViewStateManager().e(m0Var);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(d dVar, int i11, ReadableArray readableArray) {
        a.b(this, dVar, i11, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(d dVar, String str, ReadableArray readableArray) {
        a.c(this, dVar, str, readableArray);
    }
}