package com.facebook.react.views.drawer;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.i;
import e4.a;

/* loaded from: classes3.dex */
class a extends e4.a {
    private int V1;

    /* renamed from: b2  reason: collision with root package name */
    private int f12513b2;

    public a(ReactContext reactContext) {
        super(reactContext);
        this.V1 = 8388611;
        this.f12513b2 = -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W() {
        d(this.V1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X() {
        I(this.V1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(int i11) {
        this.V1 = i11;
        Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            a.f fVar = (a.f) childAt.getLayoutParams();
            fVar.f24624a = this.V1;
            ((ViewGroup.MarginLayoutParams) fVar).width = this.f12513b2;
            childAt.setLayoutParams(fVar);
            childAt.setClickable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a0(int i11) {
        this.f12513b2 = i11;
        Z();
    }

    @Override // e4.a, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                i.a(this, motionEvent);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e11) {
            nd.a.H("ReactNative", "Error intercepting touch event.", e11);
            return false;
        }
    }
}