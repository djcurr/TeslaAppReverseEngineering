package com.reactnativestripesdk;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class l extends com.facebook.react.uimanager.events.c<l> {

    /* renamed from: a  reason: collision with root package name */
    private final String f20320a;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public l(int i11, String str) {
        super(i11);
        this.f20320a = str;
    }

    private final WritableMap a() {
        WritableMap eventData = Arguments.createMap();
        eventData.putString("focusedField", this.f20320a);
        kotlin.jvm.internal.s.f(eventData, "eventData");
        return eventData;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        kotlin.jvm.internal.s.g(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), a());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topFocusChange";
    }
}