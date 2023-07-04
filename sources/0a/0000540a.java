package com.stripe.android.payments.core.authentication.threeds2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.d;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.w;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.databinding.Stripe3ds2TransactionLayoutBinding;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.transaction.ChallengeContract;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.views.ChallengeProgressFragmentFactory;
import h00.l;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import vz.k;
import vz.m;
import vz.q;
import vz.r;

/* loaded from: classes6.dex */
public final class Stripe3ds2TransactionActivity extends d {
    public Stripe3ds2TransactionContract.Args args;
    private final k viewBinding$delegate;
    private s0.b viewModelFactory;

    public Stripe3ds2TransactionActivity() {
        k a11;
        a11 = m.a(new Stripe3ds2TransactionActivity$viewBinding$2(this));
        this.viewBinding$delegate = a11;
        this.viewModelFactory = new Stripe3ds2TransactionViewModelFactory(new Stripe3ds2TransactionActivity$viewModelFactory$1(this), this, new Stripe3ds2TransactionActivity$viewModelFactory$2(this));
    }

    public final void finishWithResult(PaymentFlowResult.Unvalidated unvalidated) {
        setResult(-1, new Intent().putExtras(unvalidated.toBundle()));
        finish();
    }

    private final Stripe3ds2TransactionLayoutBinding getViewBinding() {
        return (Stripe3ds2TransactionLayoutBinding) this.viewBinding$delegate.getValue();
    }

    public static /* synthetic */ void getViewModelFactory$payments_core_release$annotations() {
    }

    public static /* synthetic */ void h(Stripe3ds2TransactionActivity stripe3ds2TransactionActivity, PaymentFlowResult.Unvalidated unvalidated) {
        m287onCreate$lambda8(stripe3ds2TransactionActivity, unvalidated);
    }

    public static /* synthetic */ void k(l lVar, ChallengeResult challengeResult) {
        m286onCreate$lambda7(lVar, challengeResult);
    }

    /* renamed from: onCreate$lambda-6 */
    public static final Stripe3ds2TransactionViewModel m285onCreate$lambda6(k<Stripe3ds2TransactionViewModel> kVar) {
        return kVar.getValue();
    }

    /* renamed from: onCreate$lambda-7 */
    public static final void m286onCreate$lambda7(l onChallengeResult, ChallengeResult it2) {
        s.g(onChallengeResult, "$onChallengeResult");
        s.f(it2, "it");
        onChallengeResult.invoke(it2);
    }

    /* renamed from: onCreate$lambda-8 */
    public static final void m287onCreate$lambda8(Stripe3ds2TransactionActivity this$0, PaymentFlowResult.Unvalidated it2) {
        s.g(this$0, "this$0");
        s.f(it2, "it");
        this$0.finishWithResult(it2);
    }

    public final Stripe3ds2TransactionContract.Args getArgs() {
        Stripe3ds2TransactionContract.Args args = this.args;
        if (args != null) {
            return args;
        }
        s.x("args");
        return null;
    }

    public final s0.b getViewModelFactory$payments_core_release() {
        return this.viewModelFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object b11;
        Stripe3ds2TransactionContract.Args fromIntent;
        try {
            q.a aVar = q.f54772b;
            Stripe3ds2TransactionContract.Args.Companion companion = Stripe3ds2TransactionContract.Args.Companion;
            Intent intent = getIntent();
            s.f(intent, "intent");
            fromIntent = companion.fromIntent(intent);
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        if (fromIntent != null) {
            String accentColor = fromIntent.getConfig().getUiCustomization$payments_core_release().getUiCustomization().getAccentColor();
            Integer num = null;
            if (accentColor != null) {
                Object b12 = q.b(Integer.valueOf(Color.parseColor(accentColor)));
                if (!q.g(b12)) {
                    num = b12;
                }
                num = num;
            }
            getSupportFragmentManager().j1(new ChallengeProgressFragmentFactory(fromIntent.getFingerprint().getDirectoryServerName(), fromIntent.getSdkTransactionId(), num));
            b11 = q.b(fromIntent);
            super.onCreate(bundle);
            Throwable e11 = q.e(b11);
            if (e11 == null) {
                setArgs((Stripe3ds2TransactionContract.Args) b11);
                setContentView(getViewBinding().getRoot());
                Integer statusBarColor = getArgs().getStatusBarColor();
                if (statusBarColor != null) {
                    getWindow().setStatusBarColor(statusBarColor.intValue());
                }
                r0 r0Var = new r0(m0.b(Stripe3ds2TransactionViewModel.class), new Stripe3ds2TransactionActivity$onCreate$$inlined$viewModels$2(this), new Stripe3ds2TransactionActivity$onCreate$viewModel$2(this));
                final Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1 stripe3ds2TransactionActivity$onCreate$onChallengeResult$1 = new Stripe3ds2TransactionActivity$onCreate$onChallengeResult$1(this, r0Var);
                androidx.activity.result.d registerForActivityResult = registerForActivityResult(new ChallengeContract(), new androidx.activity.result.b() { // from class: com.stripe.android.payments.core.authentication.threeds2.b
                    @Override // androidx.activity.result.b
                    public final void a(Object obj) {
                        Stripe3ds2TransactionActivity.k(l.this, (ChallengeResult) obj);
                    }
                });
                s.f(registerForActivityResult, "registerForActivityResul…lengeResult(it)\n        }");
                androidx.activity.result.d registerForActivityResult2 = registerForActivityResult(new PaymentBrowserAuthContract(), new androidx.activity.result.b() { // from class: com.stripe.android.payments.core.authentication.threeds2.a
                    @Override // androidx.activity.result.b
                    public final void a(Object obj) {
                        Stripe3ds2TransactionActivity.h(Stripe3ds2TransactionActivity.this, (PaymentFlowResult.Unvalidated) obj);
                    }
                });
                s.f(registerForActivityResult2, "registerForActivityResul…hWithResult(it)\n        }");
                if (m285onCreate$lambda6(r0Var).getHasCompleted()) {
                    return;
                }
                w.a(this).d(new Stripe3ds2TransactionActivity$onCreate$3(this, registerForActivityResult, stripe3ds2TransactionActivity$onCreate$onChallengeResult$1, registerForActivityResult2, r0Var, null));
                return;
            }
            finishWithResult(new PaymentFlowResult.Unvalidated(null, 2, StripeException.Companion.create(e11), false, null, null, null, 121, null));
            return;
        }
        throw new IllegalArgumentException("Error while attempting to initiate 3DS2 transaction.".toString());
    }

    public final void setArgs(Stripe3ds2TransactionContract.Args args) {
        s.g(args, "<set-?>");
        this.args = args;
    }

    public final void setViewModelFactory$payments_core_release(s0.b bVar) {
        s.g(bVar, "<set-?>");
        this.viewModelFactory = bVar;
    }
}