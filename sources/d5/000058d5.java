package com.stripe.android.stripe3ds2.transaction;

import java.security.KeyPair;
import java.security.PublicKey;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import m00.l;
import zz.d;

/* loaded from: classes6.dex */
public final class StripeTransaction implements Transaction {
    public static final Companion Companion = new Companion(null);
    public static final int MIN_TIMEOUT = 5;
    private final AuthenticationRequestParametersFactory areqParamsFactory;
    private final String directoryServerId;
    private final String directoryServerKeyId;
    private final PublicKey directoryServerPublicKey;
    private final KeyPair sdkKeyPair;
    private final String sdkReferenceNumber;
    private final SdkTransactionId sdkTransactionId;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public StripeTransaction(AuthenticationRequestParametersFactory areqParamsFactory, String directoryServerId, PublicKey directoryServerPublicKey, String str, SdkTransactionId sdkTransactionId, KeyPair sdkKeyPair, String sdkReferenceNumber) {
        s.g(areqParamsFactory, "areqParamsFactory");
        s.g(directoryServerId, "directoryServerId");
        s.g(directoryServerPublicKey, "directoryServerPublicKey");
        s.g(sdkTransactionId, "sdkTransactionId");
        s.g(sdkKeyPair, "sdkKeyPair");
        s.g(sdkReferenceNumber, "sdkReferenceNumber");
        this.areqParamsFactory = areqParamsFactory;
        this.directoryServerId = directoryServerId;
        this.directoryServerPublicKey = directoryServerPublicKey;
        this.directoryServerKeyId = str;
        this.sdkTransactionId = sdkTransactionId;
        this.sdkKeyPair = sdkKeyPair;
        this.sdkReferenceNumber = sdkReferenceNumber;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.Transaction
    public Object createAuthenticationRequestParameters(d<? super AuthenticationRequestParameters> dVar) {
        AuthenticationRequestParametersFactory authenticationRequestParametersFactory = this.areqParamsFactory;
        String str = this.directoryServerId;
        PublicKey publicKey = this.directoryServerPublicKey;
        String str2 = this.directoryServerKeyId;
        SdkTransactionId sdkTransactionId = getSdkTransactionId();
        PublicKey publicKey2 = this.sdkKeyPair.getPublic();
        s.f(publicKey2, "sdkKeyPair.public");
        return authenticationRequestParametersFactory.create(str, publicKey, str2, sdkTransactionId, publicKey2, dVar);
    }

    @Override // com.stripe.android.stripe3ds2.transaction.Transaction
    public InitChallengeArgs createInitChallengeArgs(ChallengeParameters challengeParameters, int i11, IntentData intentData) {
        int d11;
        s.g(challengeParameters, "challengeParameters");
        s.g(intentData, "intentData");
        String str = this.sdkReferenceNumber;
        KeyPair keyPair = this.sdkKeyPair;
        d11 = l.d(i11, 5);
        return new InitChallengeArgs(str, keyPair, challengeParameters, d11, intentData);
    }

    @Override // com.stripe.android.stripe3ds2.transaction.Transaction
    public SdkTransactionId getSdkTransactionId() {
        return this.sdkTransactionId;
    }
}