package com.facebook.react.views.modal;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes3.dex */
class e extends com.facebook.react.uimanager.events.c<e> {
    /* JADX INFO: Access modifiers changed from: protected */
    public e(int i11, int i12) {
        super(i11, i12);
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topShow";
    }
}