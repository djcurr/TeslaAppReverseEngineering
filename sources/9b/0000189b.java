package com.facebook.react.jscexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.soloader.SoLoader;

@xf.a
/* loaded from: classes3.dex */
public class JSCExecutor extends JavaScriptExecutor {
    static {
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JSCExecutor(ReadableNativeMap readableNativeMap) {
        super(initHybrid(readableNativeMap));
    }

    public static void a() {
        SoLoader.p("jscexecutor");
    }

    private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "JSCExecutor";
    }
}