package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.ChallengeResponseProcessor;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public interface ChallengeResponseProcessorFactory {

    /* loaded from: classes6.dex */
    public static final class Default implements ChallengeResponseProcessorFactory {
        private final ChallengeRequestExecutor.Config creqExecutorConfig;
        private final ErrorReporter errorReporter;
        private final MessageTransformer messageTransformer;

        public Default(MessageTransformer messageTransformer, ErrorReporter errorReporter, ChallengeRequestExecutor.Config creqExecutorConfig) {
            s.g(messageTransformer, "messageTransformer");
            s.g(errorReporter, "errorReporter");
            s.g(creqExecutorConfig, "creqExecutorConfig");
            this.messageTransformer = messageTransformer;
            this.errorReporter = errorReporter;
            this.creqExecutorConfig = creqExecutorConfig;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResponseProcessorFactory
        public ChallengeResponseProcessor.Default create(SecretKey secretKey) {
            s.g(secretKey, "secretKey");
            return new ChallengeResponseProcessor.Default(this.messageTransformer, secretKey, this.errorReporter, this.creqExecutorConfig);
        }
    }

    ChallengeResponseProcessor create(SecretKey secretKey);
}