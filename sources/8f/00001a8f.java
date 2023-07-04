package com.facebook.react.views.textinput;

import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* loaded from: classes3.dex */
public class j extends com.facebook.react.uimanager.events.c<h> {

    /* renamed from: a  reason: collision with root package name */
    private String f12779a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public j(int i11, String str) {
        this(-1, i11, str);
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(Action.KEY_ATTRIBUTE, this.f12779a);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topKeyPress";
    }

    j(int i11, int i12, String str) {
        super(i11, i12);
        this.f12779a = str;
    }
}