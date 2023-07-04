package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.spongycastle.i18n.TextBundle;

/* loaded from: classes3.dex */
public class h extends com.facebook.react.uimanager.events.c<h> {

    /* renamed from: a  reason: collision with root package name */
    private String f12775a;

    /* renamed from: b  reason: collision with root package name */
    private String f12776b;

    /* renamed from: c  reason: collision with root package name */
    private int f12777c;

    /* renamed from: d  reason: collision with root package name */
    private int f12778d;

    public h(int i11, int i12, String str, String str2, int i13, int i14) {
        super(i11, i12);
        this.f12775a = str;
        this.f12776b = str2;
        this.f12777c = i13;
        this.f12778d = i14;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("start", this.f12777c);
        createMap2.putDouble("end", this.f12778d);
        createMap.putString(TextBundle.TEXT_ENTRY, this.f12775a);
        createMap.putString("previousText", this.f12776b);
        createMap.putMap("range", createMap2);
        createMap.putInt("target", getViewTag());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topTextInput";
    }
}