package com.stripe.android.link.repositories;

import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerPaymentDetailsCreateParams;
import com.stripe.android.model.ConsumerPaymentDetailsUpdateParams;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.StripeIntent;
import java.util.Map;
import vz.b0;
import vz.q;
import zz.d;

/* loaded from: classes6.dex */
public interface LinkRepository {

    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: createPaymentDetails-yxL6bBk$default */
        public static /* synthetic */ Object m173createPaymentDetailsyxL6bBk$default(LinkRepository linkRepository, ConsumerPaymentDetailsCreateParams consumerPaymentDetailsCreateParams, String str, StripeIntent stripeIntent, Map map, d dVar, int i11, Object obj) {
            if (obj == null) {
                Map<String, ? extends Object> map2 = map;
                if ((i11 & 8) != 0) {
                    map2 = null;
                }
                return linkRepository.mo166createPaymentDetailsyxL6bBk(consumerPaymentDetailsCreateParams, str, stripeIntent, map2, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createPaymentDetails-yxL6bBk");
        }
    }

    /* renamed from: confirmVerification-BWLJW6A */
    Object mo164confirmVerificationBWLJW6A(String str, String str2, String str3, d<? super q<ConsumerSession>> dVar);

    /* renamed from: consumerSignUp-yxL6bBk */
    Object mo165consumerSignUpyxL6bBk(String str, String str2, String str3, String str4, d<? super q<ConsumerSession>> dVar);

    /* renamed from: createPaymentDetails-yxL6bBk */
    Object mo166createPaymentDetailsyxL6bBk(ConsumerPaymentDetailsCreateParams consumerPaymentDetailsCreateParams, String str, StripeIntent stripeIntent, Map<String, ? extends Object> map, d<? super q<LinkPaymentDetails>> dVar);

    /* renamed from: deletePaymentDetails-0E7RQCE */
    Object mo167deletePaymentDetails0E7RQCE(String str, String str2, d<? super q<b0>> dVar);

    /* renamed from: listPaymentDetails-gIAlu-s */
    Object mo168listPaymentDetailsgIAlus(String str, d<? super q<ConsumerPaymentDetails>> dVar);

    /* renamed from: logout-0E7RQCE */
    Object mo169logout0E7RQCE(String str, String str2, d<? super q<ConsumerSession>> dVar);

    /* renamed from: lookupConsumer-0E7RQCE */
    Object mo170lookupConsumer0E7RQCE(String str, String str2, d<? super q<ConsumerSessionLookup>> dVar);

    /* renamed from: startVerification-0E7RQCE */
    Object mo171startVerification0E7RQCE(String str, String str2, d<? super q<ConsumerSession>> dVar);

    /* renamed from: updatePaymentDetails-0E7RQCE */
    Object mo172updatePaymentDetails0E7RQCE(ConsumerPaymentDetailsUpdateParams consumerPaymentDetailsUpdateParams, String str, d<? super q<ConsumerPaymentDetails>> dVar);
}