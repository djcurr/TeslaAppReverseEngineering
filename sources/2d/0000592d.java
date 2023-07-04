package com.stripe.android.stripe3ds2.views;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeSubmitDialogBinding;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import com.stripe.android.stripe3ds2.utils.Factory0;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ChallengeSubmitDialogFactory implements Factory0<Dialog> {
    private final Context context;
    private final UiCustomization uiCustomization;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class ChallengeSubmitDialog extends Dialog {
        private final UiCustomization uiCustomization;
        private final vz.k viewBinding$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChallengeSubmitDialog(Context context, UiCustomization uiCustomization) {
            super(context);
            vz.k a11;
            s.g(context, "context");
            s.g(uiCustomization, "uiCustomization");
            this.uiCustomization = uiCustomization;
            a11 = vz.m.a(new ChallengeSubmitDialogFactory$ChallengeSubmitDialog$viewBinding$2(this));
            this.viewBinding$delegate = a11;
            setCancelable(false);
            Window window = getWindow();
            if (window != null) {
                window.clearFlags(2);
            }
            Window window2 = getWindow();
            if (window2 == null) {
                return;
            }
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }

        private final StripeChallengeSubmitDialogBinding getViewBinding() {
            return (StripeChallengeSubmitDialogBinding) this.viewBinding$delegate.getValue();
        }

        @Override // android.app.Dialog
        protected void onStart() {
            super.onStart();
            setContentView(getViewBinding().getRoot());
            CustomizeUtils customizeUtils = CustomizeUtils.INSTANCE;
            CircularProgressIndicator circularProgressIndicator = getViewBinding().progressBar;
            s.f(circularProgressIndicator, "viewBinding.progressBar");
            customizeUtils.applyProgressBarColor$3ds2sdk_release(circularProgressIndicator, this.uiCustomization);
        }
    }

    public ChallengeSubmitDialogFactory(Context context, UiCustomization uiCustomization) {
        s.g(context, "context");
        s.g(uiCustomization, "uiCustomization");
        this.context = context;
        this.uiCustomization = uiCustomization;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.stripe3ds2.utils.Factory0
    public Dialog create() {
        return new ChallengeSubmitDialog(this.context, this.uiCustomization);
    }
}