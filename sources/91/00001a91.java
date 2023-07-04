package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;

/* loaded from: classes3.dex */
class l extends com.facebook.react.uimanager.events.c<l> {

    /* renamed from: a  reason: collision with root package name */
    private int f12787a;

    /* renamed from: b  reason: collision with root package name */
    private int f12788b;

    public l(int i11, int i12, int i13, int i14) {
        super(i11, i12);
        this.f12787a = i13;
        this.f12788b = i14;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("end", this.f12788b);
        createMap2.putInt("start", this.f12787a);
        createMap.putMap(BaseSheetViewModel.SAVE_SELECTION, createMap2);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topSelectionChange";
    }
}