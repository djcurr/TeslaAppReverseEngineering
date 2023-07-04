package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.security.EphemeralKeyPairGenerator;
import com.stripe.android.stripe3ds2.views.Brand;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class DefaultTransactionFactory implements TransactionFactory {
    private final AuthenticationRequestParametersFactory areqParamsFactory;
    private final EphemeralKeyPairGenerator ephemeralKeyPairGenerator;
    private final String sdkReferenceNumber;

    public DefaultTransactionFactory(AuthenticationRequestParametersFactory areqParamsFactory, EphemeralKeyPairGenerator ephemeralKeyPairGenerator, String sdkReferenceNumber) {
        s.g(areqParamsFactory, "areqParamsFactory");
        s.g(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        s.g(sdkReferenceNumber, "sdkReferenceNumber");
        this.areqParamsFactory = areqParamsFactory;
        this.ephemeralKeyPairGenerator = ephemeralKeyPairGenerator;
        this.sdkReferenceNumber = sdkReferenceNumber;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.TransactionFactory
    public Transaction create(String directoryServerId, List<? extends X509Certificate> rootCerts, PublicKey directoryServerPublicKey, String str, SdkTransactionId sdkTransactionId, boolean z11, Brand brand) {
        s.g(directoryServerId, "directoryServerId");
        s.g(rootCerts, "rootCerts");
        s.g(directoryServerPublicKey, "directoryServerPublicKey");
        s.g(sdkTransactionId, "sdkTransactionId");
        s.g(brand, "brand");
        return new StripeTransaction(this.areqParamsFactory, directoryServerId, directoryServerPublicKey, str, sdkTransactionId, this.ephemeralKeyPairGenerator.generate(), this.sdkReferenceNumber);
    }
}