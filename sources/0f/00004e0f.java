package com.stripe.android.googlepaylauncher;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.g0;
import androidx.lifecycle.r0;
import androidx.lifecycle.w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;
import com.stripe.android.googlepaylauncher.GooglePayLauncher;
import com.stripe.android.googlepaylauncher.GooglePayLauncherContract;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import vz.k;
import vz.q;
import vz.r;
import vz.v;

/* loaded from: classes6.dex */
public final class GooglePayLauncherActivity extends androidx.appcompat.app.d {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final int LOAD_PAYMENT_DATA_REQUEST_CODE = 4444;
    private GooglePayLauncherContract.Args args;
    private final k viewModel$delegate = new r0(m0.b(GooglePayLauncherViewModel.class), new GooglePayLauncherActivity$special$$inlined$viewModels$2(this), new GooglePayLauncherActivity$viewModel$2(this));

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void disableAnimations() {
        overridePendingTransition(0, 0);
    }

    private final void finishWithResult(GooglePayLauncher.Result result) {
        setResult(-1, new Intent().putExtras(r3.b.a(v.a("extra_result", result))));
        finish();
    }

    public final GooglePayLauncherViewModel getViewModel() {
        return (GooglePayLauncherViewModel) this.viewModel$delegate.getValue();
    }

    public static /* synthetic */ void h(GooglePayLauncherActivity googlePayLauncherActivity, GooglePayLauncher.Result result) {
        m139onCreate$lambda3(googlePayLauncherActivity, result);
    }

    /* renamed from: onCreate$lambda-3 */
    public static final void m139onCreate$lambda3(GooglePayLauncherActivity this$0, GooglePayLauncher.Result result) {
        s.g(this$0, "this$0");
        if (result == null) {
            return;
        }
        this$0.finishWithResult(result);
    }

    private final void onGooglePayResult(Intent intent) {
        PaymentData fromIntent = intent == null ? null : PaymentData.getFromIntent(intent);
        if (fromIntent == null) {
            getViewModel().updateResult(new GooglePayLauncher.Result.Failed(new IllegalArgumentException("Google Pay data was not available")));
            return;
        }
        v20.k.d(w.a(this), null, null, new GooglePayLauncherActivity$onGooglePayResult$1(this, AuthActivityStarterHost.Companion.create$payments_core_release(this), PaymentMethodCreateParams.Companion.createFromGooglePay(new JSONObject(fromIntent.toJson())), null), 3, null);
    }

    public final void payWithGoogle(Task<PaymentData> task) {
        AutoResolveHelper.resolveTask(task, this, LOAD_PAYMENT_DATA_REQUEST_CODE);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        disableAnimations();
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 != LOAD_PAYMENT_DATA_REQUEST_CODE) {
            v20.k.d(w.a(this), null, null, new GooglePayLauncherActivity$onActivityResult$1(this, i11, intent, null), 3, null);
        } else if (i12 == -1) {
            onGooglePayResult(intent);
        } else if (i12 == 0) {
            getViewModel().updateResult(GooglePayLauncher.Result.Canceled.INSTANCE);
        } else if (i12 != 1) {
            getViewModel().updateResult(new GooglePayLauncher.Result.Failed(new RuntimeException("Google Pay returned an expected result code.")));
        } else {
            Status statusFromIntent = AutoResolveHelper.getStatusFromIntent(intent);
            String statusMessage = statusFromIntent != null ? statusFromIntent.getStatusMessage() : null;
            if (statusMessage == null) {
                statusMessage = "";
            }
            getViewModel().updateResult(new GooglePayLauncher.Result.Failed(new RuntimeException(s.p("Google Pay failed with error: ", statusMessage))));
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object b11;
        GooglePayLauncherContract.Args fromIntent$payments_core_release;
        super.onCreate(bundle);
        disableAnimations();
        try {
            q.a aVar = q.f54772b;
            GooglePayLauncherContract.Args.Companion companion = GooglePayLauncherContract.Args.Companion;
            Intent intent = getIntent();
            s.f(intent, "intent");
            fromIntent$payments_core_release = companion.fromIntent$payments_core_release(intent);
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        if (fromIntent$payments_core_release != null) {
            b11 = q.b(fromIntent$payments_core_release);
            Throwable e11 = q.e(b11);
            if (e11 == null) {
                this.args = (GooglePayLauncherContract.Args) b11;
                int intExtra = getIntent().getIntExtra("extra_status_bar_color", -1);
                if (intExtra != -1) {
                    getWindow().setStatusBarColor(intExtra);
                }
                getViewModel().getGooglePayResult$payments_core_release().observe(this, new g0() { // from class: com.stripe.android.googlepaylauncher.d
                    @Override // androidx.lifecycle.g0
                    public final void onChanged(Object obj) {
                        GooglePayLauncherActivity.h(GooglePayLauncherActivity.this, (GooglePayLauncher.Result) obj);
                    }
                });
                if (getViewModel().getHasLaunched()) {
                    return;
                }
                getViewModel().setHasLaunched(true);
                v20.k.d(w.a(this), null, null, new GooglePayLauncherActivity$onCreate$4(this, null), 3, null);
                return;
            }
            finishWithResult(new GooglePayLauncher.Result.Failed(e11));
            return;
        }
        throw new IllegalArgumentException("GooglePayLauncherActivity was started without arguments.".toString());
    }
}