package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.DiffieHellmanKeyGenerator;
import com.stripe.android.stripe3ds2.security.EcKeyFactory;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.security.StripeDiffieHellmanKeyGenerator;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResponseProcessorFactory;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import java.security.PrivateKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.concurrent.TimeUnit;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import zz.g;

/* loaded from: classes6.dex */
public final class StripeChallengeRequestExecutor implements ChallengeRequestExecutor {
    public static final Companion Companion = new Companion(null);
    private static final long TIMEOUT = TimeUnit.SECONDS.toMillis(10);
    private final ECPublicKey acsPublicKey;
    private final ChallengeRequestExecutor.Config creqExecutorConfig;
    private final DiffieHellmanKeyGenerator dhKeyGenerator;
    private final ErrorReporter errorReporter;
    private final HttpClient httpClient;
    private final MessageTransformer messageTransformer;
    private final ChallengeResponseProcessor responseProcessor;
    private final PrivateKey sdkPrivateKey;
    private final String sdkReferenceId;
    private final SecretKey secretKey;
    private final g workContext;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ChallengeRequestResult.Timeout createTimeoutResult(ChallengeRequestData challengeRequestData) {
            SdkTransactionId sdkTransId = challengeRequestData.getSdkTransId();
            String messageVersion = challengeRequestData.getMessageVersion();
            String acsTransId = challengeRequestData.getAcsTransId();
            String threeDsServerTransId = challengeRequestData.getThreeDsServerTransId();
            ProtocolError protocolError = ProtocolError.TransactionTimedout;
            return new ChallengeRequestResult.Timeout(new ErrorData(threeDsServerTransId, acsTransId, null, String.valueOf(protocolError.getCode()), ErrorData.ErrorComponent.ThreeDsSdk, protocolError.getDescription(), "Challenge request timed-out", ChallengeRequestData.MESSAGE_TYPE, messageVersion, sdkTransId, 4, null));
        }

        public final long getTIMEOUT() {
            return StripeChallengeRequestExecutor.TIMEOUT;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Factory implements ChallengeRequestExecutor.Factory {
        private final ChallengeRequestExecutor.Config config;

        public Factory(ChallengeRequestExecutor.Config config) {
            s.g(config, "config");
            this.config = config;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor.Factory
        public ChallengeRequestExecutor create(ErrorReporter errorReporter, g workContext) {
            s.g(errorReporter, "errorReporter");
            s.g(workContext, "workContext");
            EcKeyFactory ecKeyFactory = new EcKeyFactory(errorReporter);
            return new StripeChallengeRequestExecutor(this.config.getMessageTransformer$3ds2sdk_release(), this.config.getSdkReferenceId$3ds2sdk_release(), ecKeyFactory.createPrivate(this.config.getKeys$3ds2sdk_release().getSdkPrivateKeyEncoded$3ds2sdk_release()), ecKeyFactory.createPublic(this.config.getKeys$3ds2sdk_release().getAcsPublicKeyEncoded$3ds2sdk_release()), this.config.getAcsUrl$3ds2sdk_release(), errorReporter, new StripeDiffieHellmanKeyGenerator(errorReporter), workContext, null, this.config, null, 1280, null);
        }
    }

    public StripeChallengeRequestExecutor(MessageTransformer messageTransformer, String sdkReferenceId, PrivateKey sdkPrivateKey, ECPublicKey acsPublicKey, String acsUrl, ErrorReporter errorReporter, DiffieHellmanKeyGenerator dhKeyGenerator, g workContext, HttpClient httpClient, ChallengeRequestExecutor.Config creqExecutorConfig, ChallengeResponseProcessorFactory responseProcessorFactory) {
        s.g(messageTransformer, "messageTransformer");
        s.g(sdkReferenceId, "sdkReferenceId");
        s.g(sdkPrivateKey, "sdkPrivateKey");
        s.g(acsPublicKey, "acsPublicKey");
        s.g(acsUrl, "acsUrl");
        s.g(errorReporter, "errorReporter");
        s.g(dhKeyGenerator, "dhKeyGenerator");
        s.g(workContext, "workContext");
        s.g(httpClient, "httpClient");
        s.g(creqExecutorConfig, "creqExecutorConfig");
        s.g(responseProcessorFactory, "responseProcessorFactory");
        this.messageTransformer = messageTransformer;
        this.sdkReferenceId = sdkReferenceId;
        this.sdkPrivateKey = sdkPrivateKey;
        this.acsPublicKey = acsPublicKey;
        this.errorReporter = errorReporter;
        this.dhKeyGenerator = dhKeyGenerator;
        this.workContext = workContext;
        this.httpClient = httpClient;
        this.creqExecutorConfig = creqExecutorConfig;
        SecretKey generateSecretKey = generateSecretKey();
        this.secretKey = generateSecretKey;
        this.responseProcessor = responseProcessorFactory.create(generateSecretKey);
    }

    private final SecretKey generateSecretKey() {
        return this.dhKeyGenerator.generate(this.acsPublicKey, (ECPrivateKey) this.sdkPrivateKey, this.sdkReferenceId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getRequestBody(JSONObject jSONObject) {
        return this.messageTransformer.encrypt(jSONObject, this.secretKey);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object execute(com.stripe.android.stripe3ds2.transactions.ChallengeRequestData r7, zz.d<? super com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$1
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$1 r0 = (com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$1 r0 = new com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.L$0
            com.stripe.android.stripe3ds2.transactions.ChallengeRequestData r7 = (com.stripe.android.stripe3ds2.transactions.ChallengeRequestData) r7
            vz.r.b(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            vz.r.b(r8)
            long r4 = com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor.TIMEOUT
            com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$2 r8 = new com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$execute$2
            r2 = 0
            r8.<init>(r6, r7, r2)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = v20.e3.d(r4, r8, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult r8 = (com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult) r8
            if (r8 != 0) goto L55
            com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor$Companion r8 = com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor.Companion
            com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult$Timeout r8 = com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor.Companion.access$createTimeoutResult(r8, r7)
        L55:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor.execute(com.stripe.android.stripe3ds2.transactions.ChallengeRequestData, zz.d):java.lang.Object");
    }

    public /* synthetic */ StripeChallengeRequestExecutor(MessageTransformer messageTransformer, String str, PrivateKey privateKey, ECPublicKey eCPublicKey, String str2, ErrorReporter errorReporter, DiffieHellmanKeyGenerator diffieHellmanKeyGenerator, g gVar, HttpClient httpClient, ChallengeRequestExecutor.Config config, ChallengeResponseProcessorFactory challengeResponseProcessorFactory, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(messageTransformer, str, privateKey, eCPublicKey, str2, errorReporter, diffieHellmanKeyGenerator, gVar, (i11 & 256) != 0 ? new StripeHttpClient(str2, null, errorReporter, gVar, 2, null) : httpClient, config, (i11 & 1024) != 0 ? new ChallengeResponseProcessorFactory.Default(messageTransformer, errorReporter, config) : challengeResponseProcessorFactory);
    }
}