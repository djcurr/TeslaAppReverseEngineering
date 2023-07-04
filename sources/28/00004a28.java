package com.reactnativestripesdk;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class z extends com.facebook.react.uimanager.events.c<z> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f20400a;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i11, Map<String, Object> formDetails) {
        super(i11);
        kotlin.jvm.internal.s.g(formDetails, "formDetails");
        this.f20400a = formDetails;
    }

    private final WritableMap a() {
        WritableMap eventData = Arguments.createMap();
        eventData.putString("accountNumber", String.valueOf(this.f20400a.get("accountNumber")));
        eventData.putString("bsbNumber", String.valueOf(this.f20400a.get("bsbNumber")));
        eventData.putString("email", String.valueOf(this.f20400a.get("email")));
        eventData.putString("name", String.valueOf(this.f20400a.get("name")));
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
        return "onCompleteAction";
    }
}