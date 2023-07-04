package com.reactnativestripesdk;

import android.app.Activity;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class q0 extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.react.uimanager.n0 f20362a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f20363b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.facebook.react.uimanager.n0 context) {
        super(context);
        kotlin.jvm.internal.s.g(context, "context");
        this.f20362a = context;
        this.f20363b = true;
        getRootView().setFocusable(true);
        getRootView().setFocusableInTouchMode(true);
        getRootView().setClickable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        kotlin.jvm.internal.s.e(motionEvent);
        if (motionEvent.getAction() == 0 && !this.f20363b) {
            Activity currentActivity = this.f20362a.getCurrentActivity();
            kotlin.jvm.internal.s.e(currentActivity);
            View currentFocus = currentActivity.getCurrentFocus();
            if (currentFocus instanceof EditText) {
                Rect rect = new Rect();
                EditText editText = (EditText) currentFocus;
                editText.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    Object systemService = this.f20362a.getSystemService("input_method");
                    Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                    getRootView().requestFocus();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setKeyboardShouldPersistTaps(boolean z11) {
        this.f20363b = z11;
    }
}