package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes3.dex */
public class e0 {

    /* renamed from: a  reason: collision with root package name */
    final ReadableMap f12246a;

    public e0(ReadableMap readableMap) {
        this.f12246a = readableMap;
    }

    public ReadableArray a(String str) {
        return this.f12246a.getArray(str);
    }

    public boolean b(String str, boolean z11) {
        return this.f12246a.isNull(str) ? z11 : this.f12246a.getBoolean(str);
    }

    public float c(String str, float f11) {
        return this.f12246a.isNull(str) ? f11 : (float) this.f12246a.getDouble(str);
    }

    public int d(String str, int i11) {
        return this.f12246a.isNull(str) ? i11 : this.f12246a.getInt(str);
    }

    public ReadableMap e(String str) {
        return this.f12246a.getMap(str);
    }

    public String f(String str) {
        return this.f12246a.getString(str);
    }

    public boolean g(String str) {
        return this.f12246a.hasKey(str);
    }

    public String toString() {
        return "{ " + e0.class.getSimpleName() + ": " + this.f12246a.toString() + " }";
    }
}