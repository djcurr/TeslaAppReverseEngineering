package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.c0;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class ViewManager<T extends View, C extends c0> extends BaseJavaModule {
    public void addEventEmitters(n0 n0Var, T t11) {
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    public T createView(int i11, n0 n0Var, e0 e0Var, m0 m0Var, mg.a aVar) {
        T createViewInstance = createViewInstance(i11, n0Var, e0Var, m0Var);
        if (createViewInstance instanceof mg.d) {
            ((mg.d) createViewInstance).setOnInterceptTouchEventListener(aVar);
        }
        return createViewInstance;
    }

    protected T createViewInstance(int i11, n0 n0Var, e0 e0Var, m0 m0Var) {
        Object updateState;
        T createViewInstance = createViewInstance(n0Var);
        createViewInstance.setId(i11);
        addEventEmitters(n0Var, createViewInstance);
        if (e0Var != null) {
            updateProperties(createViewInstance, e0Var);
        }
        if (m0Var != null && (updateState = updateState(createViewInstance, e0Var, m0Var)) != null) {
            updateExtraData(createViewInstance, updateState);
        }
        return createViewInstance;
    }

    protected abstract T createViewInstance(n0 n0Var);

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    public b1<T> getDelegate() {
        return null;
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return c1.e(getClass(), getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f11, com.facebook.yoga.n nVar, float f12, com.facebook.yoga.n nVar2, float[] fArr) {
        return 0L;
    }

    public void onAfterUpdateTransaction(T t11) {
    }

    public void onDropViewInstance(T t11) {
    }

    @Deprecated
    public void receiveCommand(T t11, int i11, ReadableArray readableArray) {
    }

    public void receiveCommand(T t11, String str, ReadableArray readableArray) {
    }

    public void setPadding(T t11, int i11, int i12, int i13, int i14) {
    }

    public abstract void updateExtraData(T t11, Object obj);

    public void updateProperties(T t11, e0 e0Var) {
        b1<T> delegate = getDelegate();
        if (delegate != null) {
            c1.h(delegate, t11, e0Var);
        } else {
            c1.g(this, t11, e0Var);
        }
        onAfterUpdateTransaction(t11);
    }

    public Object updateState(T t11, e0 e0Var, m0 m0Var) {
        return null;
    }

    public C createShadowNodeInstance(ReactApplicationContext reactApplicationContext) {
        return createShadowNodeInstance();
    }
}