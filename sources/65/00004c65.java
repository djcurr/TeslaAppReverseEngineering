package com.stripe.android.cards;

import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;

/* loaded from: classes2.dex */
public final class RemoteCardAccountRangeSource implements CardAccountRangeSource {
    private final u<Boolean> _loading;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final CardAccountRangeStore cardAccountRangeStore;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final ApiRequest.Options requestOptions;
    private final StripeRepository stripeRepository;

    public RemoteCardAccountRangeSource(StripeRepository stripeRepository, ApiRequest.Options requestOptions, CardAccountRangeStore cardAccountRangeStore, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        s.g(stripeRepository, "stripeRepository");
        s.g(requestOptions, "requestOptions");
        s.g(cardAccountRangeStore, "cardAccountRangeStore");
        s.g(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.g(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        this.stripeRepository = stripeRepository;
        this.requestOptions = requestOptions;
        this.cardAccountRangeStore = cardAccountRangeStore;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this._loading = j0.a(Boolean.FALSE);
    }

    private final void onCardMetadataMissingRange() {
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.CardMetadataMissingRange, null, null, null, null, 30, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    @Override // com.stripe.android.cards.CardAccountRangeSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getAccountRange(com.stripe.android.cards.CardNumber.Unvalidated r7, zz.d<? super com.stripe.android.model.AccountRange> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.stripe.android.cards.RemoteCardAccountRangeSource$getAccountRange$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.cards.RemoteCardAccountRangeSource$getAccountRange$1 r0 = (com.stripe.android.cards.RemoteCardAccountRangeSource$getAccountRange$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.cards.RemoteCardAccountRangeSource$getAccountRange$1 r0 = new com.stripe.android.cards.RemoteCardAccountRangeSource$getAccountRange$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 != r4) goto L36
            java.lang.Object r7 = r0.L$2
            com.stripe.android.cards.Bin r7 = (com.stripe.android.cards.Bin) r7
            java.lang.Object r1 = r0.L$1
            com.stripe.android.cards.CardNumber$Unvalidated r1 = (com.stripe.android.cards.CardNumber.Unvalidated) r1
            java.lang.Object r0 = r0.L$0
            com.stripe.android.cards.RemoteCardAccountRangeSource r0 = (com.stripe.android.cards.RemoteCardAccountRangeSource) r0
            vz.r.b(r8)
            goto L69
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            vz.r.b(r8)
            com.stripe.android.cards.Bin r8 = r7.getBin()
            if (r8 != 0) goto L49
            goto Lb8
        L49:
            kotlinx.coroutines.flow.u<java.lang.Boolean> r2 = r6._loading
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r4)
            r2.setValue(r5)
            com.stripe.android.networking.StripeRepository r2 = r6.stripeRepository
            com.stripe.android.core.networking.ApiRequest$Options r5 = r6.requestOptions
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.label = r4
            java.lang.Object r0 = r2.getCardMetadata$payments_core_release(r8, r5, r0)
            if (r0 != r1) goto L65
            return r1
        L65:
            r1 = r7
            r7 = r8
            r8 = r0
            r0 = r6
        L69:
            com.stripe.android.model.CardMetadata r8 = (com.stripe.android.model.CardMetadata) r8
            if (r8 != 0) goto L6f
            r8 = r3
            goto L73
        L6f:
            java.util.List r8 = r8.getAccountRanges()
        L73:
            if (r8 != 0) goto L79
            java.util.List r8 = wz.u.i()
        L79:
            com.stripe.android.cards.CardAccountRangeStore r2 = r0.cardAccountRangeStore
            r2.save(r7, r8)
            kotlinx.coroutines.flow.u<java.lang.Boolean> r7 = r0._loading
            r2 = 0
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r2)
            r7.setValue(r2)
            boolean r7 = r8.isEmpty()
            r7 = r7 ^ r4
            if (r7 == 0) goto Lb8
            java.util.Iterator r7 = r8.iterator()
        L93:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lab
            java.lang.Object r8 = r7.next()
            r2 = r8
            com.stripe.android.model.AccountRange r2 = (com.stripe.android.model.AccountRange) r2
            com.stripe.android.model.BinRange r2 = r2.component1()
            boolean r2 = r2.matches(r1)
            if (r2 == 0) goto L93
            r3 = r8
        Lab:
            com.stripe.android.model.AccountRange r3 = (com.stripe.android.model.AccountRange) r3
            if (r3 != 0) goto Lb8
            boolean r7 = r1.isValidLuhn()
            if (r7 == 0) goto Lb8
            r0.onCardMetadataMissingRange()
        Lb8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.cards.RemoteCardAccountRangeSource.getAccountRange(com.stripe.android.cards.CardNumber$Unvalidated, zz.d):java.lang.Object");
    }

    @Override // com.stripe.android.cards.CardAccountRangeSource
    public e<Boolean> getLoading() {
        return this._loading;
    }
}