package com.stripe.android;

import android.content.Context;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.networking.DefaultFraudDetectionDataRequestFactory;
import com.stripe.android.networking.FraudDetectionData;
import com.stripe.android.networking.FraudDetectionDataRequestFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.e1;
import v20.i;
import v20.p0;
import zz.g;

/* loaded from: classes2.dex */
public final class DefaultFraudDetectionDataRepository implements FraudDetectionDataRepository {
    private FraudDetectionData cachedFraudDetectionData;
    private final FraudDetectionDataRequestFactory fraudDetectionDataRequestFactory;
    private final FraudDetectionDataStore localStore;
    private final StripeNetworkClient stripeNetworkClient;
    private final g workContext;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataRepository(Context context) {
        this(context, (g) null, 2, (DefaultConstructorMarker) null);
        s.g(context, "context");
    }

    public DefaultFraudDetectionDataRepository(FraudDetectionDataStore localStore, FraudDetectionDataRequestFactory fraudDetectionDataRequestFactory, StripeNetworkClient stripeNetworkClient, g workContext) {
        s.g(localStore, "localStore");
        s.g(fraudDetectionDataRequestFactory, "fraudDetectionDataRequestFactory");
        s.g(stripeNetworkClient, "stripeNetworkClient");
        s.g(workContext, "workContext");
        this.localStore = localStore;
        this.fraudDetectionDataRequestFactory = fraudDetectionDataRequestFactory;
        this.stripeNetworkClient = stripeNetworkClient;
        this.workContext = workContext;
    }

    @Override // com.stripe.android.FraudDetectionDataRepository
    public FraudDetectionData getCached() {
        FraudDetectionData fraudDetectionData = this.cachedFraudDetectionData;
        if (Stripe.Companion.getAdvancedFraudSignalsEnabled()) {
            return fraudDetectionData;
        }
        return null;
    }

    @Override // com.stripe.android.FraudDetectionDataRepository
    public Object getLatest(zz.d<? super FraudDetectionData> dVar) {
        return i.g(this.workContext, new DefaultFraudDetectionDataRepository$getLatest$2(this, null), dVar);
    }

    @Override // com.stripe.android.FraudDetectionDataRepository
    public void refresh() {
        if (Stripe.Companion.getAdvancedFraudSignalsEnabled()) {
            i.d(p0.a(this.workContext), null, null, new DefaultFraudDetectionDataRepository$refresh$1(this, null), 3, null);
        }
    }

    @Override // com.stripe.android.FraudDetectionDataRepository
    public void save(FraudDetectionData fraudDetectionData) {
        s.g(fraudDetectionData, "fraudDetectionData");
        this.cachedFraudDetectionData = fraudDetectionData;
        this.localStore.save(fraudDetectionData);
    }

    public /* synthetic */ DefaultFraudDetectionDataRepository(Context context, g gVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? e1.b() : gVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataRepository(Context context, g workContext) {
        this(new DefaultFraudDetectionDataStore(context, workContext), new DefaultFraudDetectionDataRequestFactory(context), new DefaultStripeNetworkClient(workContext, null, null, 0, null, 30, null), workContext);
        s.g(context, "context");
        s.g(workContext, "workContext");
    }
}