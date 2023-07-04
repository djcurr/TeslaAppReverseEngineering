package com.stripe.android.payments.bankaccount;

import androidx.activity.ComponentActivity;
import androidx.activity.result.d;
import androidx.fragment.app.Fragment;
import com.stripe.android.payments.bankaccount.CollectBankAccountLauncher;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResult;
import h00.l;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
public interface CollectBankAccountLauncher {
    public static final Companion Companion = Companion.$$INSTANCE;

    void presentWithPaymentIntent(String str, String str2, CollectBankAccountConfiguration collectBankAccountConfiguration);

    void presentWithSetupIntent(String str, String str2, CollectBankAccountConfiguration collectBankAccountConfiguration);

    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ void a(l lVar, CollectBankAccountResult collectBankAccountResult) {
            m274create$lambda1(lVar, collectBankAccountResult);
        }

        public static /* synthetic */ void b(l lVar, CollectBankAccountResult collectBankAccountResult) {
            m273create$lambda0(lVar, collectBankAccountResult);
        }

        /* renamed from: create$lambda-0 */
        public static final void m273create$lambda0(l callback, CollectBankAccountResult it2) {
            s.g(callback, "$callback");
            s.f(it2, "it");
            callback.invoke(it2);
        }

        /* renamed from: create$lambda-1 */
        public static final void m274create$lambda1(l callback, CollectBankAccountResult it2) {
            s.g(callback, "$callback");
            s.f(it2, "it");
            callback.invoke(it2);
        }

        public final CollectBankAccountLauncher create(ComponentActivity activity, final l<? super CollectBankAccountResult, b0> callback) {
            s.g(activity, "activity");
            s.g(callback, "callback");
            d registerForActivityResult = activity.registerForActivityResult(new CollectBankAccountContract(), new androidx.activity.result.b() { // from class: com.stripe.android.payments.bankaccount.b
                @Override // androidx.activity.result.b
                public final void a(Object obj) {
                    CollectBankAccountLauncher.Companion.b(callback, (CollectBankAccountResult) obj);
                }
            });
            s.f(registerForActivityResult, "activity.registerForActi…ack(it)\n                }");
            return new StripeCollectBankAccountLauncher(registerForActivityResult);
        }

        public final CollectBankAccountLauncher create(Fragment fragment, final l<? super CollectBankAccountResult, b0> callback) {
            s.g(fragment, "fragment");
            s.g(callback, "callback");
            d registerForActivityResult = fragment.registerForActivityResult(new CollectBankAccountContract(), new androidx.activity.result.b() { // from class: com.stripe.android.payments.bankaccount.a
                @Override // androidx.activity.result.b
                public final void a(Object obj) {
                    CollectBankAccountLauncher.Companion.a(callback, (CollectBankAccountResult) obj);
                }
            });
            s.f(registerForActivityResult, "fragment.registerForActi…ack(it)\n                }");
            return new StripeCollectBankAccountLauncher(registerForActivityResult);
        }
    }
}