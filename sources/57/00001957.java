package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;

/* loaded from: classes3.dex */
public class IllegalViewOperationException extends JSApplicationCausedNativeException {

    /* renamed from: a  reason: collision with root package name */
    private View f12199a;

    public IllegalViewOperationException(String str) {
        super(str);
    }

    public IllegalViewOperationException(String str, View view, Throwable th2) {
        super(str, th2);
        this.f12199a = view;
    }
}