package com.plaid;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.plaid.gson.PlaidJsonConverter;
import com.plaid.link.event.LinkEvent;
import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import org.json.JSONObject;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/plaid/link/event/LinkEvent;", "linkEvent", "Lvz/b0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
final class PlaidModule$startLinkActivityForResult$1 extends u implements l<LinkEvent, b0> {
    final /* synthetic */ PlaidModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidModule$startLinkActivityForResult$1(PlaidModule plaidModule) {
        super(1);
        this.this$0 = plaidModule;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(LinkEvent linkEvent) {
        invoke2(linkEvent);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LinkEvent linkEvent) {
        PlaidJsonConverter jsonConverter;
        ReactApplicationContext reactApplicationContext;
        s.g(linkEvent, "linkEvent");
        jsonConverter = this.this$0.getJsonConverter();
        WritableMap convertJsonToMap = GlobalFunctionsKt.convertJsonToMap(new JSONObject(jsonConverter.convert(linkEvent)));
        reactApplicationContext = this.this$0.getReactApplicationContext();
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("onEvent", convertJsonToMap);
    }
}