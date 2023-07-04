package com.tesla.godot;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h;
import androidx.fragment.app.q;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.c;
import com.facebook.react.uimanager.e0;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.m0;
import com.facebook.react.uimanager.n0;
import com.facebook.yoga.n;
import com.tesla.godot.AndroidGodotInterface;
import com.tesla.logging.a;
import com.tesla.logging.g;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class TMGodotViewManager extends ViewGroupManager<FrameLayout> implements AndroidGodotInterface.AndroidGodotInterfaceListener {
    public static final String REACT_CLASS = "TMGodotView";
    private static final String TAG = "TMGodotViewManager";
    ReactApplicationContext mCallerContext;
    FrameLayout mGodotFrameLayout;
    private boolean godotViewAttached = false;
    private final g logger = g.g(TAG);
    List<String> queuedMessages = new ArrayList();

    public TMGodotViewManager(ReactApplicationContext reactApplicationContext) {
        this.mCallerContext = reactApplicationContext;
    }

    private void processQueuedMessages() {
        for (String str : this.queuedMessages) {
            sendMessageToJS(str);
        }
        this.queuedMessages.clear();
    }

    private void sendMessageToJS(String str) {
        try {
            a.b(a.EnumC0395a.GODOT_MESSAGE, GodotUtils.convertJsonToMap(new JSONObject(str)));
        } catch (Exception unused) {
            this.logger.i("sendMessageToJS failed to convert json to map");
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public /* bridge */ /* synthetic */ void addViews(FrameLayout frameLayout, List list) {
        addViews2(frameLayout, (List<View>) list);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public b1<FrameLayout> getDelegate() {
        this.logger.i("getDelegate");
        return super.getDelegate();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends i> getShadowNodeClass() {
        this.logger.i("getShadowNodeCLass");
        return super.getShadowNodeClass();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.logger.i("initialize");
        super.initialize();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.logger.i("invalidate");
        super.invalidate();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f11, n nVar, float f12, n nVar2, float[] fArr) {
        this.logger.i("measure");
        return super.measure(context, readableMap, readableMap2, readableMap3, f11, nVar, f12, nVar2, fArr);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.g
    public boolean needsCustomLayoutForChildren() {
        this.logger.i("needsCustomLayoutForChildren");
        return super.needsCustomLayoutForChildren();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.logger.i("onCatalystInstanceDestroy");
        super.onCatalystInstanceDestroy();
    }

    @Override // com.tesla.godot.AndroidGodotInterface.AndroidGodotInterfaceListener
    public void onGodotMessage(String str) {
        if (!TMGodot.godotReady() && str.contains("GODOT_READY")) {
            TMGodot.setGodotReady(true);
        }
        try {
            if (new JSONObject(str).getString("type").equals("LOG")) {
                g gVar = this.logger;
                gVar.i("skipping logged message: " + str);
                return;
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
            this.logger.f("Error constructing JSON of message", e11);
        }
        if (this.godotViewAttached) {
            g gVar2 = this.logger;
            gVar2.i("sending message to JS: " + str);
            sendMessageToJS(str);
            return;
        }
        g gVar3 = this.logger;
        gVar3.i("godot not attached, queueing message for JS: " + str);
        this.queuedMessages.add(str);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public boolean shouldPromoteGrandchildren() {
        this.logger.i("shouldPromoteGrandchildren");
        return super.shouldPromoteGrandchildren();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(FrameLayout frameLayout, View view, int i11) {
        this.logger.i("addView");
        super.addView((TMGodotViewManager) frameLayout, view, i11);
    }

    /* renamed from: addViews  reason: avoid collision after fix types in other method */
    public void addViews2(FrameLayout frameLayout, List<View> list) {
        this.logger.i("addViews");
        super.addViews((TMGodotViewManager) frameLayout, list);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public i createShadowNodeInstance() {
        this.logger.i("createShadowNodeInstance");
        return super.createShadowNodeInstance();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public FrameLayout createView(int i11, n0 n0Var, e0 e0Var, m0 m0Var, mg.a aVar) {
        this.logger.i("createView");
        return (FrameLayout) super.createView(i11, n0Var, e0Var, m0Var, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public FrameLayout createViewInstance(n0 n0Var) {
        this.logger.i("createViewInstance");
        TMGodot tMGodot = TMGodot.getInstance(this.mCallerContext);
        if (this.mGodotFrameLayout != null) {
            this.logger.i("returning existing frame layout");
            return this.mGodotFrameLayout;
        }
        Activity currentActivity = n0Var.getCurrentActivity();
        if (currentActivity == null) {
            this.logger.d("returning blank frame layout for null activity", new Throwable("returning blank frame layout for null activity"));
            return new FrameLayout(n0Var);
        }
        q supportFragmentManager = ((h) currentActivity).getSupportFragmentManager();
        supportFragmentManager.Z0(new q.j() { // from class: com.tesla.godot.TMGodotViewManager.1
            @Override // androidx.fragment.app.q.j
            public void onFragmentViewCreated(q qVar, Fragment fragment, View view, Bundle bundle) {
                super.onFragmentViewCreated(qVar, fragment, view, bundle);
                String tag = fragment.getTag();
                if (tag == null || !tag.equals("godot_fragment")) {
                    return;
                }
                TMGodotViewManager.this.godotViewAttached = true;
            }
        }, false);
        supportFragmentManager.m().e(tMGodot, "godot_fragment").k();
        TMGodot.godotInterface().listener = this;
        processQueuedMessages();
        c.e(n0Var);
        FrameLayout frameLayout = (FrameLayout) tMGodot.getView();
        this.mGodotFrameLayout = frameLayout;
        return frameLayout;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(FrameLayout frameLayout, int i11) {
        this.logger.i("getChildAt");
        return super.getChildAt((TMGodotViewManager) frameLayout, i11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(FrameLayout frameLayout) {
        this.logger.i("getChildCount");
        return super.getChildCount((TMGodotViewManager) frameLayout);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(FrameLayout frameLayout) {
        this.logger.i("onDropViewInstance");
        super.onDropViewInstance((TMGodotViewManager) frameLayout);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(FrameLayout frameLayout, String str, ReadableArray readableArray) {
        this.logger.i("receiveCommand");
        super.receiveCommand((TMGodotViewManager) frameLayout, str, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(FrameLayout frameLayout) {
        this.logger.i("removeAllViews");
        super.removeAllViews((TMGodotViewManager) frameLayout);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeView(FrameLayout frameLayout, View view) {
        this.logger.i("removeView");
        super.removeView((TMGodotViewManager) frameLayout, view);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(FrameLayout frameLayout, int i11) {
        this.logger.i("removeViewAt");
        super.removeViewAt((TMGodotViewManager) frameLayout, i11);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(FrameLayout frameLayout, Object obj) {
        this.logger.i("updateExtraData");
        super.updateExtraData((TMGodotViewManager) frameLayout, obj);
    }
}