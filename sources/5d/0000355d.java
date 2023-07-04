package com.google.android.libraries.places.widget.internal.ui;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.b;
import com.google.android.libraries.places.internal.zzgb;

/* loaded from: classes3.dex */
final class zzl implements View.OnFocusChangeListener {
    private zzl() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzl(zzk zzkVar) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z11) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) b.getSystemService(view.getContext(), InputMethodManager.class);
            if (inputMethodManager == null) {
                return;
            }
            if (z11) {
                inputMethodManager.showSoftInput(view, 1);
            } else {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Error | RuntimeException e11) {
            zzgb.zzb(e11);
            throw e11;
        }
    }
}