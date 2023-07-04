package com.stripe.android.view;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class KeyboardController {
    public static final int $stable = 8;
    private final Activity activity;
    private final InputMethodManager inputMethodManager;

    public KeyboardController(Activity activity) {
        kotlin.jvm.internal.s.g(activity, "activity");
        this.activity = activity;
        Object systemService = activity.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        this.inputMethodManager = (InputMethodManager) systemService;
    }

    public final /* synthetic */ void hide() {
        if (this.inputMethodManager.isAcceptingText()) {
            InputMethodManager inputMethodManager = this.inputMethodManager;
            View currentFocus = this.activity.getCurrentFocus();
            inputMethodManager.hideSoftInputFromWindow(currentFocus == null ? null : currentFocus.getWindowToken(), 0);
        }
    }
}