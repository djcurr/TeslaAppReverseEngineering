package com.facebook.react.fabric;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.soloader.SoLoader;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f11856a = false;

    public static void a() {
        if (f11856a) {
            return;
        }
        com.facebook.systrace.a.c(0L, "FabricSoLoader.staticInit::load:fabricjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_START);
        SoLoader.p("fabricjni");
        ReactMarker.logMarker(ReactMarkerConstants.LOAD_REACT_NATIVE_SO_FILE_END);
        com.facebook.systrace.a.g(0L);
        f11856a = true;
    }
}