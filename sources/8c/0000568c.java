package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import com.stripe.android.paymentsheet.DefaultPrefsRepository;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import h00.l;
import kotlin.jvm.internal.u;
import zz.g;

/* loaded from: classes6.dex */
final class FlowControllerModule$Companion$providePrefsRepositoryFactory$1 extends u implements l<PaymentSheet.CustomerConfiguration, PrefsRepository> {
    final /* synthetic */ Context $appContext;
    final /* synthetic */ g $workContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowControllerModule$Companion$providePrefsRepositoryFactory$1(Context context, g gVar) {
        super(1);
        this.$appContext = context;
        this.$workContext = gVar;
    }

    @Override // h00.l
    public final PrefsRepository invoke(PaymentSheet.CustomerConfiguration customerConfiguration) {
        DefaultPrefsRepository defaultPrefsRepository = customerConfiguration == null ? null : new DefaultPrefsRepository(this.$appContext, customerConfiguration.getId(), this.$workContext);
        return defaultPrefsRepository == null ? new PrefsRepository.Noop() : defaultPrefsRepository;
    }
}