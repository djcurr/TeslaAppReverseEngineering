package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.spongycastle.i18n.TextBundle;

/* loaded from: classes3.dex */
public class e extends com.facebook.react.uimanager.events.c<e> {

    /* renamed from: a  reason: collision with root package name */
    private String f12772a;

    /* renamed from: b  reason: collision with root package name */
    private int f12773b;

    public e(int i11, int i12, String str, int i13) {
        super(i11, i12);
        this.f12772a = str;
        this.f12773b = i13;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(TextBundle.TEXT_ENTRY, this.f12772a);
        createMap.putInt("eventCount", this.f12773b);
        createMap.putInt("target", getViewTag());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topChange";
    }
}