package com.tesla.TeslaV4.reactnative.module;

import android.content.Context;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.tesla.TeslaV4.reactnative.module.e;

/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f21426a = new d();

    private d() {
    }

    public final void a(Context context, ReadableMap fromLocationDictionary, ReadableMap toLocationDictionary, String mapType, Promise promise) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(fromLocationDictionary, "fromLocationDictionary");
        kotlin.jvm.internal.s.g(toLocationDictionary, "toLocationDictionary");
        kotlin.jvm.internal.s.g(mapType, "mapType");
        kotlin.jvm.internal.s.g(promise, "promise");
        double d11 = fromLocationDictionary.getDouble("latitude");
        double d12 = fromLocationDictionary.getDouble("longitude");
        double d13 = toLocationDictionary.getDouble("latitude");
        double d14 = toLocationDictionary.getDouble("longitude");
        e.a aVar = e.Companion;
        fu.b b11 = aVar.a().b(d11, d12, d13, d14);
        String string = fromLocationDictionary.getString("name");
        String string2 = toLocationDictionary.getString("name");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        for (fu.c cVar : aVar.a().a()) {
            if (cVar.isSupported(context) && cVar.a(vz.v.a(Double.valueOf(d11), Double.valueOf(d12)), vz.v.a(Double.valueOf(d13), Double.valueOf(d14)), string, string2, b11, context)) {
                writableNativeMap.putString("result", "SUCCESS");
                promise.resolve(writableNativeMap);
                return;
            }
        }
        writableNativeMap.putString("result", "ERROR_UNABLE_TO_LAUNCH");
        promise.resolve(writableNativeMap);
    }
}