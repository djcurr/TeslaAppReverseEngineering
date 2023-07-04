package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.spongycastle.i18n.TextBundle;

/* loaded from: classes3.dex */
class g extends com.facebook.react.uimanager.events.c<g> {

    /* renamed from: a  reason: collision with root package name */
    private String f12774a;

    public g(int i11, int i12, String str) {
        super(i11, i12);
        this.f12774a = str;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        createMap.putString(TextBundle.TEXT_ENTRY, this.f12774a);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topEndEditing";
    }
}