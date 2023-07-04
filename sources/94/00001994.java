package com.facebook.react.uimanager.events;

/* loaded from: classes3.dex */
public enum l {
    START("topTouchStart"),
    END("topTouchEnd"),
    MOVE("topTouchMove"),
    CANCEL("topTouchCancel");
    
    private final String mJsName;

    l(String str) {
        this.mJsName = str;
    }

    public static String getJSEventName(l lVar) {
        return lVar.getJsName();
    }

    public String getJsName() {
        return this.mJsName;
    }
}