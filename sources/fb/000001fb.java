package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;

/* loaded from: classes.dex */
public class i extends androidx.fragment.app.e {
    @Override // androidx.fragment.app.e
    public Dialog onCreateDialog(Bundle bundle) {
        return new h(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.e
    public void setupDialog(Dialog dialog, int i11) {
        if (dialog instanceof h) {
            h hVar = (h) dialog;
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                dialog.getWindow().addFlags(24);
            }
            hVar.d(1);
            return;
        }
        super.setupDialog(dialog, i11);
    }
}