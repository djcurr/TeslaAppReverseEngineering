package com.reactnativestripesdk;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class b extends com.facebook.react.uimanager.events.c<b> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f20251a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f20252b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f20253c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f20254d;

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
    public b(int i11, Map<String, Object> cardDetails, boolean z11, boolean z12, boolean z13) {
        super(i11);
        kotlin.jvm.internal.s.g(cardDetails, "cardDetails");
        this.f20251a = cardDetails;
        this.f20252b = z11;
        this.f20253c = z12;
        this.f20254d = z13;
    }

    private final WritableMap a() {
        vz.b0 b0Var;
        vz.b0 b0Var2;
        String obj;
        WritableMap eventData = Arguments.createMap();
        Object obj2 = this.f20251a.get(AccountRangeJsonParser.FIELD_BRAND);
        eventData.putString(AccountRangeJsonParser.FIELD_BRAND, obj2 == null ? null : obj2.toString());
        Object obj3 = this.f20251a.get("last4");
        eventData.putString("last4", obj3 == null ? null : obj3.toString());
        Integer num = (Integer) this.f20251a.get("expiryMonth");
        if (num == null) {
            b0Var = null;
        } else {
            eventData.putInt("expiryMonth", num.intValue());
            b0Var = vz.b0.f54756a;
        }
        if (b0Var == null) {
            eventData.putNull("expiryMonth");
        }
        Integer num2 = (Integer) this.f20251a.get("expiryYear");
        if (num2 == null) {
            b0Var2 = null;
        } else {
            eventData.putInt("expiryYear", num2.intValue());
            b0Var2 = vz.b0.f54756a;
        }
        if (b0Var2 == null) {
            eventData.putNull("expiryYear");
        }
        eventData.putBoolean("complete", this.f20253c);
        Object obj4 = this.f20251a.get("validNumber");
        eventData.putString("validNumber", obj4 == null ? null : obj4.toString());
        Object obj5 = this.f20251a.get("validCVC");
        eventData.putString("validCVC", obj5 == null ? null : obj5.toString());
        Object obj6 = this.f20251a.get("validExpiryDate");
        eventData.putString("validExpiryDate", obj6 == null ? null : obj6.toString());
        if (this.f20252b) {
            Object obj7 = this.f20251a.get("postalCode");
            eventData.putString("postalCode", obj7 == null ? null : obj7.toString());
        }
        if (this.f20254d) {
            Object obj8 = this.f20251a.get("number");
            eventData.putString("number", (obj8 == null || (obj = obj8.toString()) == null) ? null : kotlin.text.v.D(obj, " ", "", false, 4, null));
            Object obj9 = this.f20251a.get("cvc");
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
        return "onCardChange";
    }
}