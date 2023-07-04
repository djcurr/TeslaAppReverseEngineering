package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.n0;
import com.facebook.react.views.view.ReactViewManager;
import java.util.EnumSet;

/* loaded from: classes6.dex */
public class SafeAreaViewManager extends ReactViewManager {
    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCSafeAreaView";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends com.facebook.react.uimanager.i> getShadowNodeClass() {
        return k.class;
    }

    @ng.a(name = "edges")
    public void setEdges(g gVar, ReadableArray readableArray) {
        EnumSet<h> noneOf = EnumSet.noneOf(h.class);
        if (readableArray != null) {
            for (int i11 = 0; i11 < readableArray.size(); i11++) {
                String string = readableArray.getString(i11);
                if ("top".equals(string)) {
                    noneOf.add(h.TOP);
                } else if ("right".equals(string)) {
                    noneOf.add(h.RIGHT);
                } else if ("bottom".equals(string)) {
                    noneOf.add(h.BOTTOM);
                } else if ("left".equals(string)) {
                    noneOf.add(h.LEFT);
                }
            }
        }
        gVar.setEdges(noneOf);
    }

    @ng.a(name = "mode")
    public void setMode(g gVar, String str) {
        if ("padding".equals(str)) {
            gVar.setMode(j.PADDING);
        } else if ("margin".equals(str)) {
            gVar.setMode(j.MARGIN);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public k createShadowNodeInstance() {
        return new k();
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public g createViewInstance(n0 n0Var) {
        return new g(n0Var);
    }
}