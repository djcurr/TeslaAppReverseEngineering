package com.stripe.android.payments.financialconnections;

import androidx.appcompat.app.d;
import androidx.fragment.app.Fragment;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import h00.a;
import h00.l;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
public interface FinancialConnectionsPaymentsProxy {
    public static final Companion Companion = Companion.$$INSTANCE;

    void present(String str, String str2);

    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FinancialConnectionsPaymentsProxy create$default(Companion companion, Fragment fragment, l lVar, a aVar, IsFinancialConnectionsAvailable isFinancialConnectionsAvailable, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                aVar = new FinancialConnectionsPaymentsProxy$Companion$create$1(fragment, lVar);
            }
            if ((i11 & 8) != 0) {
                isFinancialConnectionsAvailable = new DefaultIsFinancialConnectionsAvailable();
            }
            return companion.create(fragment, lVar, aVar, isFinancialConnectionsAvailable);
        }

        public final FinancialConnectionsPaymentsProxy create(Fragment fragment, l<? super FinancialConnectionsSheetResult, b0> onComplete, a<? extends FinancialConnectionsPaymentsProxy> provider, IsFinancialConnectionsAvailable isFinancialConnectionsAvailable) {
            s.g(fragment, "fragment");
            s.g(onComplete, "onComplete");
            s.g(provider, "provider");
            s.g(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            if (isFinancialConnectionsAvailable.invoke()) {
                return provider.invoke();
            }
            return new UnsupportedFinancialConnectionsPaymentsProxy();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FinancialConnectionsPaymentsProxy create$default(Companion companion, d dVar, l lVar, a aVar, IsFinancialConnectionsAvailable isFinancialConnectionsAvailable, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                aVar = new FinancialConnectionsPaymentsProxy$Companion$create$2(dVar, lVar);
            }
            if ((i11 & 8) != 0) {
                isFinancialConnectionsAvailable = new DefaultIsFinancialConnectionsAvailable();
            }
            return companion.create(dVar, lVar, aVar, isFinancialConnectionsAvailable);
        }

        public final FinancialConnectionsPaymentsProxy create(d activity, l<? super FinancialConnectionsSheetResult, b0> onComplete, a<? extends FinancialConnectionsPaymentsProxy> provider, IsFinancialConnectionsAvailable isFinancialConnectionsAvailable) {
            s.g(activity, "activity");
            s.g(onComplete, "onComplete");
            s.g(provider, "provider");
            s.g(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            if (isFinancialConnectionsAvailable.invoke()) {
                return provider.invoke();
            }
            return new UnsupportedFinancialConnectionsPaymentsProxy();
        }
    }
}