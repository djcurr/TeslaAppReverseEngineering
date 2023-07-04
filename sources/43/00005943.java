package com.stripe.android.stripe3ds2.views;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class KeyboardController {
    private final androidx.fragment.app.h activity;

    public KeyboardController(androidx.fragment.app.h activity) {
        s.g(activity, "activity");
        this.activity = activity;
    }

    public final void hide() {
        InputMethodManager inputMethodManager = (InputMethodManager) androidx.core.content.b.getSystemService(this.activity, InputMethodManager.class);
        if (inputMethodManager != null && inputMethodManager.isAcceptingText()) {
            View currentFocus = this.activity.getCurrentFocus();
            inputMethodManager.hideSoftInputFromWindow(currentFocus == null ? null : currentFocus.getWindowToken(), 0);
        }
    }
}