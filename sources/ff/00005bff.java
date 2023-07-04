package com.stripe.android.view;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.appcompat.app.c;
import com.stripe.android.R;
import com.stripe.android.view.AlertDisplayer;

/* loaded from: classes6.dex */
public interface AlertDisplayer {

    /* loaded from: classes6.dex */
    public static final class DefaultAlertDisplayer implements AlertDisplayer {
        public static final int $stable = 8;
        private final Activity activity;

        public DefaultAlertDisplayer(Activity activity) {
            kotlin.jvm.internal.s.g(activity, "activity");
            this.activity = activity;
        }

        public static /* synthetic */ void a(DialogInterface dialogInterface, int i11) {
            dialogInterface.dismiss();
        }

        @Override // com.stripe.android.view.AlertDisplayer
        public void show(String message) {
            kotlin.jvm.internal.s.g(message, "message");
            if (this.activity.isFinishing()) {
                return;
            }
            new c.a(this.activity, R.style.AlertDialogStyle).e(message).b(true).setPositiveButton(17039370, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    AlertDisplayer.DefaultAlertDisplayer.a(dialogInterface, i11);
                }
            }).create().show();
        }
    }

    void show(String str);
}