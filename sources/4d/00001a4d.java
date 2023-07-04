package com.facebook.react.views.text;

import android.content.Context;
import android.text.Spannable;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.m0;
import com.facebook.react.uimanager.n0;
import java.util.HashMap;
import java.util.Map;

@fg.a(name = ReactTextViewManager.REACT_CLASS)
/* loaded from: classes3.dex */
public class ReactTextViewManager extends ReactTextAnchorViewManager<s, q> implements com.facebook.react.uimanager.g {
    public static final String REACT_CLASS = "RCTText";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_HASH = 2;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    protected t mReactTextViewManagerCallback;

    private Object getReactTextUpdate(s sVar, com.facebook.react.uimanager.e0 e0Var, ReadableMapBuffer readableMapBuffer) {
        ReadableMapBuffer m11 = readableMapBuffer.m(0);
        ReadableMapBuffer m12 = readableMapBuffer.m(1);
        Spannable d11 = d0.d(sVar.getContext(), m11, this.mReactTextViewManagerCallback);
        sVar.setSpanned(d11);
        return new r(d11, -1, false, y.m(e0Var, d0.e(m11)), y.n(m12.o(2)), y.i(e0Var));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(yf.c.e("topTextLayout", yf.c.d("registrationName", "onTextLayout"), "topInlineViewLayout", yf.c.d("registrationName", "onInlineViewLayout")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<q> getShadowNodeClass() {
        return q.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f11, com.facebook.yoga.n nVar, float f12, com.facebook.yoga.n nVar2, float[] fArr) {
        return c0.h(context, readableMap, readableMap2, f11, nVar, f12, nVar2, this.mReactTextViewManagerCallback, fArr);
    }

    @Override // com.facebook.react.uimanager.g
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public q createShadowNodeInstance() {
        return new q();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public s createViewInstance(n0 n0Var) {
        return new s(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(s sVar) {
        super.onAfterUpdateTransaction((ReactTextViewManager) sVar);
        sVar.i();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(s sVar, int i11, int i12, int i13, int i14) {
        sVar.setPadding(i11, i12, i13, i14);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(s sVar, Object obj) {
        r rVar = (r) obj;
        if (rVar.b()) {
            a0.g(rVar.k(), sVar);
        }
        sVar.setText(rVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(s sVar, com.facebook.react.uimanager.e0 e0Var, m0 m0Var) {
        ReadableMapBuffer c11;
        if (m0Var == null) {
            return null;
        }
        if (ReactFeatureFlags.isMapBufferSerializationEnabled() && (c11 = m0Var.c()) != null) {
            return getReactTextUpdate(sVar, e0Var, c11);
        }
        ReadableNativeMap b11 = m0Var.b();
        if (b11 == null) {
            return null;
        }
        ReadableNativeMap map = b11.getMap("attributedString");
        ReadableNativeMap map2 = b11.getMap("paragraphAttributes");
        Spannable e11 = c0.e(sVar.getContext(), map, this.mReactTextViewManagerCallback);
        sVar.setSpanned(e11);
        return new r(e11, b11.hasKey("mostRecentEventCount") ? b11.getInt("mostRecentEventCount") : -1, false, y.m(e0Var, c0.f(map)), y.n(map2.getString("textBreakStrategy")), y.i(e0Var));
    }

    public q createShadowNodeInstance(t tVar) {
        return new q(tVar);
    }
}