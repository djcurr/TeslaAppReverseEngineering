package com.ijzerenhein.sharedelement;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.n0;
import com.ijzerenhein.sharedelement.m;
import java.util.Map;

/* loaded from: classes2.dex */
public class RNSharedElementTransitionManager extends SimpleViewManager<m> {
    public static final String REACT_CLASS = "RNSharedElementTransition";

    public RNSharedElementTransitionManager(ReactApplicationContext reactApplicationContext) {
    }

    private void setViewItem(m mVar, m.b bVar, ReadableMap readableMap) {
        if (readableMap != null && readableMap.hasKey("node") && readableMap.hasKey("ancestor")) {
            ReadableMap map = readableMap.getMap("node");
            ReadableMap map2 = readableMap.getMap("ancestor");
            int i11 = map.getInt("nodeHandle");
            int i12 = map2.getInt("nodeHandle");
            boolean z11 = map.getBoolean("isParent");
            ReadableMap map3 = map.getMap("nodeStyle");
            mVar.j(bVar, mVar.getNodeManager().a(i11, mVar.getNodeManager().b().resolveView(i11), z11, mVar.getNodeManager().b().resolveView(i12), map3));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return yf.c.a().b("onMeasureNode", yf.c.d("phasedRegistrationNames", yf.c.d("bubbled", "onMeasureNode"))).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSharedElementTransition";
    }

    @ng.a(name = "align")
    public void setAlign(m mVar, int i11) {
        mVar.setAlign(a.values()[i11]);
    }

    @ng.a(name = "animation")
    public void setAnimation(m mVar, int i11) {
        mVar.setAnimation(b.values()[i11]);
    }

    @ng.a(name = "endNode")
    public void setEndNode(m mVar, ReadableMap readableMap) {
        setViewItem(mVar, m.b.END, readableMap);
    }

    @ng.a(name = "nodePosition")
    public void setNodePosition(m mVar, float f11) {
        mVar.setNodePosition(f11);
    }

    @ng.a(name = "resize")
    public void setResize(m mVar, int i11) {
        mVar.setResize(i.values()[i11]);
    }

    @ng.a(name = "startNode")
    public void setStartNode(m mVar, ReadableMap readableMap) {
        setViewItem(mVar, m.b.START, readableMap);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public m createViewInstance(n0 n0Var) {
        return new m(n0Var, ((RNSharedElementModule) n0Var.getNativeModule(RNSharedElementModule.class)).getNodeManager());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(m mVar) {
        super.onDropViewInstance((RNSharedElementTransitionManager) mVar);
        mVar.h();
    }
}