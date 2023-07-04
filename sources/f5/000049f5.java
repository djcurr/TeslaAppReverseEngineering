package com.reactnativestripesdk;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class m extends com.facebook.react.uimanager.events.c<b> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f20322a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f20323b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f20324c;

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

    public m(int i11, Map<String, Object> map, boolean z11, boolean z12) {
        super(i11);
        this.f20322a = map;
        this.f20323b = z11;
        this.f20324c = z12;
    }

    private final WritableMap a() {
        String obj;
        WritableMap eventData = Arguments.createMap();
        Map<String, Object> map = this.f20322a;
        if (map == null) {
            kotlin.jvm.internal.s.f(eventData, "eventData");
            return eventData;
        }
        Object obj2 = map.get(AccountRangeJsonParser.FIELD_BRAND);
        eventData.putString(AccountRangeJsonParser.FIELD_BRAND, obj2 == null ? null : obj2.toString());
        Object obj3 = this.f20322a.get("last4");
        eventData.putString("last4", obj3 == null ? null : obj3.toString());
        Object obj4 = this.f20322a.get("country");
        eventData.putString("country", obj4 == null ? null : obj4.toString());
        Object obj5 = this.f20322a.get("expiryMonth");
        Objects.requireNonNull(obj5, "null cannot be cast to non-null type kotlin.Int");
        eventData.putInt("expiryMonth", ((Integer) obj5).intValue());
        Object obj6 = this.f20322a.get("expiryYear");
        Objects.requireNonNull(obj6, "null cannot be cast to non-null type kotlin.Int");
        eventData.putInt("expiryYear", ((Integer) obj6).intValue());
        eventData.putBoolean("complete", this.f20323b);
        Object obj7 = this.f20322a.get("postalCode");
        eventData.putString("postalCode", obj7 == null ? null : obj7.toString());
        if (this.f20324c) {
            Object obj8 = this.f20322a.get("number");
            eventData.putString("number", (obj8 == null || (obj = obj8.toString()) == null) ? null : kotlin.text.v.D(obj, " ", "", false, 4, null));
            Object obj9 = this.f20322a.get("cvc");
            eventData.putString("cvc", obj9 != null ? obj9.toString() : null);
        }
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
        return "onFormComplete";
    }
}