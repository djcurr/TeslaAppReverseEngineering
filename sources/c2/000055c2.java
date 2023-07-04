package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;

/* loaded from: classes6.dex */
public interface PrefsRepository {

    /* loaded from: classes6.dex */
    public static final class Noop implements PrefsRepository {
        public static final int $stable = 0;

        @Override // com.stripe.android.paymentsheet.PrefsRepository
        public Object getSavedSelection(boolean z11, zz.d<? super SavedSelection> dVar) {
            return SavedSelection.None.INSTANCE;
        }

        @Override // com.stripe.android.paymentsheet.PrefsRepository
        public void savePaymentSelection(PaymentSelection paymentSelection) {
        }
    }

    Object getSavedSelection(boolean z11, zz.d<? super SavedSelection> dVar);

    void savePaymentSelection(PaymentSelection paymentSelection);
}