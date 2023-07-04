package com.facebook.react.views.text;

import org.spongycastle.i18n.TextBundle;

/* loaded from: classes3.dex */
public class l extends com.facebook.react.uimanager.d0 {

    /* renamed from: y  reason: collision with root package name */
    private String f12645y = null;

    @Override // com.facebook.react.uimanager.d0, com.facebook.react.uimanager.c0
    public boolean O() {
        return true;
    }

    public String o1() {
        return this.f12645y;
    }

    @ng.a(name = TextBundle.TEXT_ENTRY)
    public void setText(String str) {
        this.f12645y = str;
        w0();
    }

    @Override // com.facebook.react.uimanager.d0
    public String toString() {
        return u() + " [text: " + this.f12645y + "]";
    }
}