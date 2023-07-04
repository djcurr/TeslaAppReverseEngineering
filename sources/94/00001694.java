package com.facebook.hermes.reactexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.soloader.SoLoader;

/* loaded from: classes3.dex */
public class HermesExecutor extends JavaScriptExecutor {

    /* renamed from: a  reason: collision with root package name */
    private static String f11251a;

    static {
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HermesExecutor(ze.a aVar) {
        super(initHybridDefaultConfig());
    }

    public static void a() {
        if (f11251a == null) {
            SoLoader.p("hermes");
            try {
                SoLoader.p("hermes-executor-debug");
                f11251a = "Debug";
            } catch (UnsatisfiedLinkError unused) {
                SoLoader.p("hermes-executor-release");
                f11251a = "Release";
            }
        }
    }

    public static native boolean canLoadFile(String str);

    private static native HybridData initHybrid(long j11);

    private static native HybridData initHybridDefaultConfig();

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "HermesExecutor" + f11251a;
    }
}