package com.henninghall.date_picker;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.v;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements v {

    /* renamed from: a */
    public static ReactApplicationContext f17465a;

    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        f17465a = reactApplicationContext;
        return Arrays.asList(new DatePickerModule(reactApplicationContext));
    }

    @Override // com.facebook.react.v
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        f17465a = reactApplicationContext;
        return Arrays.asList(new DatePickerManager());
    }
}