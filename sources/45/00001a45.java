package com.facebook.react.views.swiperefresh;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.c;

/* loaded from: classes3.dex */
public class b extends c<b> {
    /* JADX INFO: Access modifiers changed from: protected */
    public b(int i11, int i12) {
        super(i11, i12);
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topRefresh";
    }
}