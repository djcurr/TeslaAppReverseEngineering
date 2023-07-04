package com.airbnb.android.react.maps;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes.dex */
public class t extends com.facebook.react.uimanager.events.c<t> {

    /* renamed from: a  reason: collision with root package name */
    private final LatLngBounds f9949a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f9950b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9951c;

    public t(int i11, LatLngBounds latLngBounds, boolean z11, boolean z12) {
        super(i11);
        this.f9949a = latLngBounds;
        this.f9950b = z11;
        this.f9951c = z12;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putBoolean("continuous", this.f9950b);
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        LatLng center = this.f9949a.getCenter();
        writableNativeMap2.putDouble("latitude", center.latitude);
        writableNativeMap2.putDouble("longitude", center.longitude);
        LatLngBounds latLngBounds = this.f9949a;
        writableNativeMap2.putDouble("latitudeDelta", latLngBounds.northeast.latitude - latLngBounds.southwest.latitude);
        LatLngBounds latLngBounds2 = this.f9949a;
        writableNativeMap2.putDouble("longitudeDelta", latLngBounds2.northeast.longitude - latLngBounds2.southwest.longitude);
        writableNativeMap.putMap("region", writableNativeMap2);
        writableNativeMap.putBoolean("isGesture", this.f9951c);
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), writableNativeMap);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topChange";
    }
}