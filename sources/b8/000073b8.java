package hr;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.q;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class c {
    public static /* synthetic */ void a(View view) {
        e(view);
    }

    public static final void b(View view) {
        InputMethodManager inputMethodManager;
        s.g(view, "<this>");
        if (!view.requestFocus() || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final void c(Fragment fragment, ReactApplicationContext context) {
        q supportFragmentManager;
        s.g(fragment, "<this>");
        s.g(context, "context");
        Activity currentActivity = context.getCurrentActivity();
        androidx.appcompat.app.d dVar = currentActivity instanceof androidx.appcompat.app.d ? (androidx.appcompat.app.d) currentActivity : null;
        if (dVar == null || (supportFragmentManager = dVar.getSupportFragmentManager()) == null || supportFragmentManager.h0(fragment.getTag()) == null) {
            return;
        }
        supportFragmentManager.m().o(fragment).i();
    }

    public static final void d(final View view) {
        s.g(view, "<this>");
        view.post(new Runnable() { // from class: hr.b
            @Override // java.lang.Runnable
            public final void run() {
                c.a(view);
            }
        });
    }

    public static final void e(View this_showSoftKeyboard) {
        InputMethodManager inputMethodManager;
        s.g(this_showSoftKeyboard, "$this_showSoftKeyboard");
        if (!this_showSoftKeyboard.requestFocus() || (inputMethodManager = (InputMethodManager) this_showSoftKeyboard.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(this_showSoftKeyboard, 1);
    }
}