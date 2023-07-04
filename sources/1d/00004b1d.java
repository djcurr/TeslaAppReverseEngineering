package com.stripe.android;

import com.stripe.android.CustomerSession;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.Customer;
import com.stripe.android.networking.StripeRepository;
import h00.l;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.q;

/* loaded from: classes2.dex */
public final class CustomerSessionOperationExecutor {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String REQUIRED_ERROR = "API request returned an invalid response.";
    private final Map<String, CustomerSession.RetrievalListener> listeners;
    private final l<Customer, b0> onCustomerUpdated;
    private final String publishableKey;
    private final String stripeAccountId;
    private final StripeRepository stripeRepository;

    /* loaded from: classes2.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomerSessionOperationExecutor(StripeRepository stripeRepository, String publishableKey, String str, Map<String, CustomerSession.RetrievalListener> listeners, l<? super Customer, b0> onCustomerUpdated) {
        s.g(stripeRepository, "stripeRepository");
        s.g(publishableKey, "publishableKey");
        s.g(listeners, "listeners");
        s.g(onCustomerUpdated, "onCustomerUpdated");
        this.stripeRepository = stripeRepository;
        this.publishableKey = publishableKey;
        this.stripeAccountId = str;
        this.listeners = listeners;
        this.onCustomerUpdated = onCustomerUpdated;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <L extends CustomerSession.RetrievalListener> L getListener(String str) {
        return (L) this.listeners.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCustomerRetrieved(EphemeralOperation ephemeralOperation, Object obj) {
        CustomerSession.CustomerRetrievalListener customerRetrievalListener = (CustomerSession.CustomerRetrievalListener) getListener(ephemeralOperation.getId$payments_core_release());
        Throwable e11 = q.e(obj);
        if (e11 == null) {
            Customer customer = (Customer) obj;
            this.onCustomerUpdated.invoke(customer);
            if (customerRetrievalListener == null) {
                return;
            }
            customerRetrievalListener.onCustomerRetrieved(customer);
            return;
        }
        onError(customerRetrievalListener, e11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(CustomerSession.RetrievalListener retrievalListener, Throwable th2) {
        if (!(th2 instanceof StripeException)) {
            if (retrievalListener == null) {
                return;
            }
            String message = th2.getMessage();
            retrievalListener.onError(0, message != null ? message : "", null);
        } else if (retrievalListener == null) {
        } else {
            int statusCode = ((StripeException) th2).getStatusCode();
            String message2 = th2.getMessage();
            retrievalListener.onError(statusCode, message2 != null ? message2 : "", ((StripeException) th2).getStripeError());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object retrieveCustomerWithKey(EphemeralKey ephemeralKey, Set<String> set, zz.d<? super Customer> dVar) {
        return this.stripeRepository.retrieveCustomer$payments_core_release(ephemeralKey.getObjectId$payments_core_release(), set, new ApiRequest.Options(ephemeralKey.getSecret(), this.stripeAccountId, null, 4, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ee A[Catch: all -> 0x00af, TRY_ENTER, TryCatch #9 {all -> 0x00af, blocks: (B:44:0x00aa, B:102:0x01ee, B:103:0x01f5, B:104:0x01fe), top: B:214:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01f5 A[Catch: all -> 0x00af, TryCatch #9 {all -> 0x00af, blocks: (B:44:0x00aa, B:102:0x01ee, B:103:0x01f5, B:104:0x01fe), top: B:214:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0221 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0222 A[PHI: r0 
      PHI: (r0v78 java.lang.Object) = (r0v72 java.lang.Object), (r0v1 java.lang.Object) binds: [B:109:0x021f, B:42:0x009d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0263 A[Catch: all -> 0x009a, TRY_ENTER, TryCatch #13 {all -> 0x009a, blocks: (B:38:0x0095, B:119:0x0263, B:120:0x026a, B:121:0x0273), top: B:220:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x026a A[Catch: all -> 0x009a, TryCatch #13 {all -> 0x009a, blocks: (B:38:0x0095, B:119:0x0263, B:120:0x026a, B:121:0x0273), top: B:220:0x0095 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0297 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0298 A[PHI: r0 
      PHI: (r0v90 java.lang.Object) = (r0v84 java.lang.Object), (r0v1 java.lang.Object) binds: [B:126:0x0295, B:36:0x0088] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d6 A[Catch: all -> 0x0085, TRY_ENTER, TryCatch #2 {all -> 0x0085, blocks: (B:32:0x0080, B:136:0x02d6, B:137:0x02dd, B:138:0x02e6), top: B:202:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02dd A[Catch: all -> 0x0085, TryCatch #2 {all -> 0x0085, blocks: (B:32:0x0080, B:136:0x02d6, B:137:0x02dd, B:138:0x02e6), top: B:202:0x0080 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x030a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x030b A[PHI: r0 
      PHI: (r0v102 java.lang.Object) = (r0v96 java.lang.Object), (r0v1 java.lang.Object) binds: [B:143:0x0308, B:30:0x0073] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0391 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0392 A[PHI: r0 
      PHI: (r0v113 java.lang.Object) = (r0v109 java.lang.Object), (r0v1 java.lang.Object) binds: [B:158:0x038f, B:24:0x005e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03db A[Catch: all -> 0x005b, TRY_ENTER, TryCatch #14 {all -> 0x005b, blocks: (B:20:0x0056, B:168:0x03db, B:169:0x03e2, B:170:0x03eb), top: B:221:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03e2 A[Catch: all -> 0x005b, TryCatch #14 {all -> 0x005b, blocks: (B:20:0x0056, B:168:0x03db, B:169:0x03e2, B:170:0x03eb), top: B:221:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x040f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0454 A[Catch: all -> 0x0046, TRY_ENTER, TryCatch #3 {all -> 0x0046, blocks: (B:14:0x0041, B:186:0x0454, B:187:0x045b, B:188:0x0464), top: B:203:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x045b A[Catch: all -> 0x0046, TryCatch #3 {all -> 0x0046, blocks: (B:14:0x0041, B:186:0x0454, B:187:0x045b, B:188:0x0464), top: B:203:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0488 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9 A[Catch: all -> 0x00d7, TRY_ENTER, TryCatch #12 {all -> 0x00d7, blocks: (B:56:0x00d3, B:67:0x00f9, B:68:0x0100, B:69:0x0109), top: B:219:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100 A[Catch: all -> 0x00d7, TryCatch #12 {all -> 0x00d7, blocks: (B:56:0x00d3, B:67:0x00f9, B:68:0x0100, B:69:0x0109), top: B:219:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0179 A[Catch: all -> 0x00c4, TRY_ENTER, TryCatch #0 {all -> 0x00c4, blocks: (B:50:0x00bf, B:85:0x0179, B:86:0x0180, B:87:0x0189), top: B:199:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0180 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:50:0x00bf, B:85:0x0179, B:86:0x0180, B:87:0x0189), top: B:199:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ad A[PHI: r0 
      PHI: (r0v66 java.lang.Object) = (r0v60 java.lang.Object), (r0v1 java.lang.Object) binds: [B:92:0x01aa, B:48:0x00b2] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object execute$payments_core_release(com.stripe.android.EphemeralKey r22, com.stripe.android.EphemeralOperation r23, zz.d r24) {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.CustomerSessionOperationExecutor.execute$payments_core_release(com.stripe.android.EphemeralKey, com.stripe.android.EphemeralOperation, zz.d):java.lang.Object");
    }
}