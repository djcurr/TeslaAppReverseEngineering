package com.henninghall.date_picker;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.Calendar;

/* loaded from: classes2.dex */
public class c {
    private static RCTEventEmitter a() {
        return (RCTEventEmitter) a.f17465a.getJSModule(RCTEventEmitter.class);
    }

    public static void b(Calendar calendar, String str, View view) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("date", k.b(calendar));
        createMap.putString("dateString", str);
        a().receiveEvent(view.getId(), "dateChange", createMap);
    }
}