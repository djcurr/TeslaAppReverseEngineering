package com.stripe.android.paymentsheet;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.payments.bankaccount.CollectBankAccountLauncher;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import com.stripe.android.paymentsheet.CollectBankAccountForPaymentSheetLauncher;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class CollectBankAccountForPaymentSheetLauncher implements CollectBankAccountLauncher {
    public static final Companion Companion = new Companion(null);
    private final androidx.activity.result.d<CollectBankAccountContract.Args> hostActivityLauncher;

    public CollectBankAccountForPaymentSheetLauncher(androidx.activity.result.d<CollectBankAccountContract.Args> hostActivityLauncher) {
        kotlin.jvm.internal.s.g(hostActivityLauncher, "hostActivityLauncher");
        this.hostActivityLauncher = hostActivityLauncher;
    }

    @Override // com.stripe.android.payments.bankaccount.CollectBankAccountLauncher
    public void presentWithPaymentIntent(String publishableKey, String clientSecret, CollectBankAccountConfiguration configuration) {
        kotlin.jvm.internal.s.g(publishableKey, "publishableKey");
        kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
        kotlin.jvm.internal.s.g(configuration, "configuration");
        this.hostActivityLauncher.b(new CollectBankAccountContract.Args.ForPaymentIntent(publishableKey, clientSecret, configuration, false));
    }

    @Override // com.stripe.android.payments.bankaccount.CollectBankAccountLauncher
    public void presentWithSetupIntent(String publishableKey, String clientSecret, CollectBankAccountConfiguration configuration) {
        kotlin.jvm.internal.s.g(publishableKey, "publishableKey");
        kotlin.jvm.internal.s.g(clientSecret, "clientSecret");
        kotlin.jvm.internal.s.g(configuration, "configuration");
        this.hostActivityLauncher.b(new CollectBankAccountContract.Args.ForSetupIntent(publishableKey, clientSecret, configuration, false));
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void a(h00.l lVar, CollectBankAccountResult collectBankAccountResult) {
            m293create$lambda1(lVar, collectBankAccountResult);
        }

        public static /* synthetic */ void b(h00.l lVar, CollectBankAccountResult collectBankAccountResult) {
            m292create$lambda0(lVar, collectBankAccountResult);
        }

        /* renamed from: create$lambda-0 */
        public static final void m292create$lambda0(h00.l callback, CollectBankAccountResult it2) {
            kotlin.jvm.internal.s.g(callback, "$callback");
            kotlin.jvm.internal.s.f(it2, "it");
            callback.invoke(it2);
        }

        /* renamed from: create$lambda-1 */
        public static final void m293create$lambda1(h00.l callback, CollectBankAccountResult it2) {
            kotlin.jvm.internal.s.g(callback, "$callback");
            kotlin.jvm.internal.s.f(it2, "it");
            callback.invoke(it2);
        }

        public final CollectBankAccountForPaymentSheetLauncher create(ComponentActivity activity, final h00.l<? super CollectBankAccountResult, vz.b0> callback) {
            kotlin.jvm.internal.s.g(activity, "activity");
            kotlin.jvm.internal.s.g(callback, "callback");
            androidx.activity.result.d registerForActivityResult = activity.registerForActivityResult(new CollectBankAccountContract(), new androidx.activity.result.b() { // from class: com.stripe.android.paymentsheet.d
                @Override // androidx.activity.result.b
                public final void a(Object obj) {
                    CollectBankAccountForPaymentSheetLauncher.Companion.b(callback, (CollectBankAccountResult) obj);
                }
            });
            kotlin.jvm.internal.s.f(registerForActivityResult, "activity.registerForActi…ack(it)\n                }");
            return new CollectBankAccountForPaymentSheetLauncher(registerForActivityResult);
        }

        public final CollectBankAccountForPaymentSheetLauncher create(Fragment fragment, final h00.l<? super CollectBankAccountResult, vz.b0> callback) {
            kotlin.jvm.internal.s.g(fragment, "fragment");
            kotlin.jvm.internal.s.g(callback, "callback");
            androidx.activity.result.d registerForActivityResult = fragment.registerForActivityResult(new CollectBankAccountContract(), new androidx.activity.result.b() { // from class: com.stripe.android.paymentsheet.c
                @Override // androidx.activity.result.b
                public final void a(Object obj) {
                    CollectBankAccountForPaymentSheetLauncher.Companion.a(callback, (CollectBankAccountResult) obj);
                }
            });
            kotlin.jvm.internal.s.f(registerForActivityResult, "fragment.registerForActi…ack(it)\n                }");
            return new CollectBankAccountForPaymentSheetLauncher(registerForActivityResult);
        }
    }
}