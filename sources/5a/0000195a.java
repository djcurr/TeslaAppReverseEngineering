package com.facebook.react.uimanager;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.util.List;

@fg.a(name = UIManagerModule.NAME)
/* loaded from: classes3.dex */
public class ReanimatedUIManager extends UIManagerModule {
    public ReanimatedUIManager(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i11) {
        super(reactApplicationContext, list, new r(), i11);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return true;
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void clearJSResponder() {
        super.clearJSResponder();
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        super.configureNextLayoutAnimation(readableMap, callback, callback2);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void createView(int i11, String str, int i12, ReadableMap readableMap) {
        super.createView(i11, str, i12, readableMap);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void dismissPopupMenu() {
        super.dismissPopupMenu();
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void dispatchViewManagerCommand(int i11, Dynamic dynamic, ReadableArray readableArray) {
        super.dispatchViewManagerCommand(i11, dynamic, readableArray);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void findSubviewIn(int i11, ReadableArray readableArray, Callback callback) {
        super.findSubviewIn(i11, readableArray, callback);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        return super.getConstantsForViewManager(str);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return super.getDefaultEventTypes();
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void manageChildren(int i11, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        super.manageChildren(i11, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void measure(int i11, Callback callback) {
        super.measure(i11, callback);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void measureInWindow(int i11, Callback callback) {
        super.measureInWindow(i11, callback);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void measureLayout(int i11, int i12, Callback callback, Callback callback2) {
        super.measureLayout(i11, i12, callback, callback2);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    @Deprecated
    public void measureLayoutRelativeToParent(int i11, Callback callback, Callback callback2) {
        super.measureLayoutRelativeToParent(i11, callback, callback2);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule, com.facebook.react.bridge.OnBatchCompleteListener
    public void onBatchComplete() {
        super.onBatchComplete();
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void removeRootView(int i11) {
        super.removeRootView(i11);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    @Deprecated
    public void removeSubviewsFromContainerWithID(int i11) {
        super.removeSubviewsFromContainerWithID(i11);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    @Deprecated
    public void replaceExistingNonRootView(int i11, int i12) {
        super.replaceExistingNonRootView(i11, i12);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule, com.facebook.react.bridge.UIManager
    @ReactMethod
    public void sendAccessibilityEvent(int i11, int i12) {
        super.sendAccessibilityEvent(i11, i12);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void setChildren(int i11, ReadableArray readableArray) {
        super.setChildren(i11, readableArray);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void setJSResponder(int i11, boolean z11) {
        super.setJSResponder(i11, z11);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z11) {
        super.setLayoutAnimationEnabledExperimental(z11);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void showPopupMenu(int i11, ReadableArray readableArray, Callback callback, Callback callback2) {
        super.showPopupMenu(i11, readableArray, callback, callback2);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    public void updateView(int i11, String str, ReadableMap readableMap) {
        super.updateView(i11, str, readableMap);
    }

    @Override // com.facebook.react.uimanager.UIManagerModule
    @ReactMethod
    @Deprecated
    public void viewIsDescendantOf(int i11, int i12, Callback callback) {
        super.viewIsDescendantOf(i11, i12, callback);
    }
}