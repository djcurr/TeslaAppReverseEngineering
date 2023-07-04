package com.facebook.react.bridge;

import android.view.View;
import java.util.List;

/* loaded from: classes3.dex */
public interface UIManager extends JSIModule, PerformanceCounter {
    @Deprecated
    <T extends View> int addRootView(T t11, WritableMap writableMap, String str);

    void addUIManagerEventListener(UIManagerListener uIManagerListener);

    void dispatchCommand(int i11, int i12, ReadableArray readableArray);

    void dispatchCommand(int i11, String str, ReadableArray readableArray);

    <T> T getEventDispatcher();

    @Deprecated
    void preInitializeViewManagers(List<String> list);

    void receiveEvent(int i11, int i12, String str, WritableMap writableMap);

    @Deprecated
    void receiveEvent(int i11, String str, WritableMap writableMap);

    void removeUIManagerEventListener(UIManagerListener uIManagerListener);

    @Deprecated
    String resolveCustomDirectEventName(String str);

    View resolveView(int i11);

    void sendAccessibilityEvent(int i11, int i12);

    <T extends View> int startSurface(T t11, String str, WritableMap writableMap, int i11, int i12);

    void stopSurface(int i11);

    void synchronouslyUpdateViewOnUIThread(int i11, ReadableMap readableMap);

    void updateRootLayoutSpecs(int i11, int i12, int i13, int i14, int i15);
}