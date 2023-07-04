package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class DefaultInitChallengeRepository implements InitChallengeRepository {
    private final AcsDataParser acsDataParser;
    private final ChallengeRequestResultRepository challengeRequestResultRepository;
    private final ErrorReporter errorReporter;
    private final ErrorRequestExecutor.Factory errorRequestExecutorFactory;
    private final JwsValidator jwsValidator;
    private final Logger logger;
    private final MessageTransformer messageTransformer;
    private final MessageVersionRegistry messageVersionRegistry;
    private final SdkTransactionId sdkTransactionId;
    private final StripeUiCustomization uiCustomization;

    public DefaultInitChallengeRepository(SdkTransactionId sdkTransactionId, MessageVersionRegistry messageVersionRegistry, JwsValidator jwsValidator, MessageTransformer messageTransformer, AcsDataParser acsDataParser, ChallengeRequestResultRepository challengeRequestResultRepository, ErrorRequestExecutor.Factory errorRequestExecutorFactory, StripeUiCustomization uiCustomization, ErrorReporter errorReporter, Logger logger) {
        s.g(sdkTransactionId, "sdkTransactionId");
        s.g(messageVersionRegistry, "messageVersionRegistry");
        s.g(jwsValidator, "jwsValidator");
        s.g(messageTransformer, "messageTransformer");
        s.g(acsDataParser, "acsDataParser");
        s.g(challengeRequestResultRepository, "challengeRequestResultRepository");
        s.g(errorRequestExecutorFactory, "errorRequestExecutorFactory");
        s.g(uiCustomization, "uiCustomization");
        s.g(errorReporter, "errorReporter");
        s.g(logger, "logger");
        this.sdkTransactionId = sdkTransactionId;
        this.messageVersionRegistry = messageVersionRegistry;
        this.jwsValidator = jwsValidator;
        this.messageTransformer = messageTransformer;
        this.acsDataParser = acsDataParser;
        this.challengeRequestResultRepository = challengeRequestResultRepository;
        this.errorRequestExecutorFactory = errorRequestExecutorFactory;
        this.uiCustomization = uiCustomization;
        this.errorReporter = errorReporter;
        this.logger = logger;
    }

    private final ChallengeRequestData createCreqData(SdkTransactionId sdkTransactionId, ChallengeParameters challengeParameters) {
        String acsTransactionId = challengeParameters.getAcsTransactionId();
        if (acsTransactionId != null) {
            String threeDsServerTransactionId = challengeParameters.getThreeDsServerTransactionId();
            if (threeDsServerTransactionId != null) {
                return new ChallengeRequestData(this.messageVersionRegistry.getCurrent(), threeDsServerTransactionId, acsTransactionId, sdkTransactionId, null, null, null, null, null, null, 1008, null);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8 A[Catch: all -> 0x0044, TryCatch #2 {all -> 0x0044, blocks: (B:12:0x003e, B:27:0x00d2, B:29:0x00d8, B:39:0x0157, B:30:0x0100, B:32:0x0104, B:33:0x0123, B:35:0x0127, B:36:0x013f, B:38:0x0143, B:40:0x015c, B:41:0x0161), top: B:59:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100 A[Catch: all -> 0x0044, TryCatch #2 {all -> 0x0044, blocks: (B:12:0x003e, B:27:0x00d2, B:29:0x00d8, B:39:0x0157, B:30:0x0100, B:32:0x0104, B:33:0x0123, B:35:0x0127, B:36:0x013f, B:38:0x0143, B:40:0x015c, B:41:0x0161), top: B:59:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.stripe.android.stripe3ds2.transaction.JwsValidator] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    @Override // com.stripe.android.stripe3ds2.transaction.InitChallengeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object startChallenge(com.stripe.android.stripe3ds2.transaction.InitChallengeArgs r17, zz.d<? super com.stripe.android.stripe3ds2.transaction.InitChallengeResult> r18) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.DefaultInitChallengeRepository.startChallenge(com.stripe.android.stripe3ds2.transaction.InitChallengeArgs, zz.d):java.lang.Object");
    }
}