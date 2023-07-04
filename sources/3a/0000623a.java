package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.p;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Map;

/* loaded from: classes6.dex */
class l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Float> a(a aVar) {
        return yf.c.g("top", Float.valueOf(p.a(aVar.f22263a)), "right", Float.valueOf(p.a(aVar.f22264b)), "bottom", Float.valueOf(p.a(aVar.f22265c)), "left", Float.valueOf(p.a(aVar.f22266d)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WritableMap b(a aVar) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("top", p.a(aVar.f22263a));
        createMap.putDouble("right", p.a(aVar.f22264b));
        createMap.putDouble("bottom", p.a(aVar.f22265c));
        createMap.putDouble("left", p.a(aVar.f22266d));
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, Float> c(c cVar) {
        return yf.c.g("x", Float.valueOf(p.a(cVar.f22269a)), "y", Float.valueOf(p.a(cVar.f22270b)), Snapshot.WIDTH, Float.valueOf(p.a(cVar.f22271c)), Snapshot.HEIGHT, Float.valueOf(p.a(cVar.f22272d)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WritableMap d(c cVar) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", p.a(cVar.f22269a));
        createMap.putDouble("y", p.a(cVar.f22270b));
        createMap.putDouble(Snapshot.WIDTH, p.a(cVar.f22271c));
        createMap.putDouble(Snapshot.HEIGHT, p.a(cVar.f22272d));
        return createMap;
    }
}