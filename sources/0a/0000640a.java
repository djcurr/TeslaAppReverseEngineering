package com.wix.reactnativenotifications.core.notification;

/* loaded from: classes6.dex */
public enum a {
    OPEN("opened"),
    RECEIVE("received");
    
    private final String param;

    a(String str) {
        this.param = str;
    }

    public final String getParam() {
        return this.param;
    }
}