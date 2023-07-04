package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* loaded from: classes6.dex */
class b extends com.facebook.react.uimanager.events.c<b> {

    /* renamed from: a  reason: collision with root package name */
    private a f22267a;

    /* renamed from: b  reason: collision with root package name */
    private c f22268b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(int i11, a aVar, c cVar) {
        super(i11);
        this.f22267a = aVar;
        this.f22268b = cVar;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putMap("insets", l.b(this.f22267a));
        createMap.putMap("frame", l.d(this.f22268b));
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), createMap);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topInsetsChange";
    }
}