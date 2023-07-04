package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.MessageTransformer;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.s;
import kotlin.text.o;
import org.json.JSONObject;
import vz.q;
import vz.r;
import zz.d;

/* loaded from: classes6.dex */
public interface ChallengeResponseProcessor {

    /* loaded from: classes6.dex */
    public static final class Default implements ChallengeResponseProcessor {
        private final ChallengeRequestExecutor.Config creqExecutorConfig;
        private final ErrorReporter errorReporter;
        private final MessageTransformer messageTransformer;
        private final SecretKey secretKey;

        public Default(MessageTransformer messageTransformer, SecretKey secretKey, ErrorReporter errorReporter, ChallengeRequestExecutor.Config creqExecutorConfig) {
            s.g(messageTransformer, "messageTransformer");
            s.g(secretKey, "secretKey");
            s.g(errorReporter, "errorReporter");
            s.g(creqExecutorConfig, "creqExecutorConfig");
            this.messageTransformer = messageTransformer;
            this.secretKey = secretKey;
            this.errorReporter = errorReporter;
            this.creqExecutorConfig = creqExecutorConfig;
        }

        private final ErrorData createErrorData(ChallengeRequestData challengeRequestData, int i11, String str, String str2) {
            String valueOf = String.valueOf(i11);
            ErrorData.ErrorComponent errorComponent = ErrorData.ErrorComponent.ThreeDsSdk;
            return new ErrorData(challengeRequestData.getThreeDsServerTransId(), challengeRequestData.getAcsTransId(), null, valueOf, errorComponent, str, str2, ChallengeResponseData.MESSAGE_TYPE, challengeRequestData.getMessageVersion(), challengeRequestData.getSdkTransId(), 4, null);
        }

        private final JSONObject getResponsePayload(String str) {
            return this.messageTransformer.decrypt(str, this.secretKey);
        }

        private final boolean isMessageVersionCorrect(ChallengeRequestData challengeRequestData, ChallengeResponseData challengeResponseData) {
            return s.c(challengeRequestData.getMessageVersion(), challengeResponseData.getMessageVersion());
        }

        private final boolean isValidChallengeResponse(ChallengeRequestData challengeRequestData, ChallengeResponseData challengeResponseData) {
            return s.c(challengeRequestData.getSdkTransId(), challengeResponseData.getSdkTransId()) && s.c(challengeRequestData.getThreeDsServerTransId(), challengeResponseData.getServerTransId()) && s.c(challengeRequestData.getAcsTransId(), challengeResponseData.getAcsTransId());
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeResponseProcessor
        public Object process(ChallengeRequestData challengeRequestData, HttpResponse httpResponse, d<? super ChallengeRequestResult> dVar) {
            Object b11;
            String f11;
            if (httpResponse.isJsonContentType()) {
                JSONObject jSONObject = new JSONObject(httpResponse.getContent());
                ErrorData.Companion companion = ErrorData.Companion;
                if (companion.isErrorMessage$3ds2sdk_release(jSONObject)) {
                    return new ChallengeRequestResult.ProtocolError(companion.fromJson$3ds2sdk_release(jSONObject));
                }
                return new ChallengeRequestResult.RuntimeError(new IllegalArgumentException("Received a JSON response that was not an Error message."));
            }
            try {
                q.a aVar = q.f54772b;
                b11 = q.b(getResponsePayload(httpResponse.getContent()));
            } catch (Throwable th2) {
                q.a aVar2 = q.f54772b;
                b11 = q.b(r.a(th2));
            }
            Throwable e11 = q.e(b11);
            if (e11 != null) {
                ErrorReporter errorReporter = this.errorReporter;
                f11 = o.f("\n                            Failed to process challenge response.\n\n                            CReq = " + challengeRequestData.sanitize$3ds2sdk_release() + "\n                            ");
                errorReporter.reportError(new RuntimeException(f11, e11));
            }
            Throwable e12 = q.e(b11);
            if (e12 == null) {
                return processPayload(challengeRequestData, (JSONObject) b11);
            }
            ProtocolError protocolError = ProtocolError.DataDecryptionFailure;
            int code = protocolError.getCode();
            String description = protocolError.getDescription();
            String message = e12.getMessage();
            if (message == null) {
                message = "";
            }
            return new ChallengeRequestResult.ProtocolError(createErrorData(challengeRequestData, code, description, message));
        }

        public final ChallengeRequestResult processPayload(ChallengeRequestData creqData, JSONObject payload) {
            Object b11;
            ChallengeRequestResult.ProtocolError protocolError;
            ChallengeRequestResult success;
            s.g(creqData, "creqData");
            s.g(payload, "payload");
            ErrorData.Companion companion = ErrorData.Companion;
            if (companion.isErrorMessage$3ds2sdk_release(payload)) {
                return new ChallengeRequestResult.ProtocolError(companion.fromJson$3ds2sdk_release(payload));
            }
            try {
                q.a aVar = q.f54772b;
                b11 = q.b(ChallengeResponseData.Companion.fromJson$3ds2sdk_release(payload));
            } catch (Throwable th2) {
                q.a aVar2 = q.f54772b;
                b11 = q.b(r.a(th2));
            }
            Throwable e11 = q.e(b11);
            if (e11 == null) {
                ChallengeResponseData challengeResponseData = (ChallengeResponseData) b11;
                if (!isValidChallengeResponse(creqData, challengeResponseData)) {
                    ProtocolError protocolError2 = ProtocolError.InvalidTransactionId;
                    success = new ChallengeRequestResult.ProtocolError(createErrorData(creqData, protocolError2.getCode(), protocolError2.getDescription(), "The Transaction ID received was invalid."));
                } else if (!isMessageVersionCorrect(creqData, challengeResponseData)) {
                    ProtocolError protocolError3 = ProtocolError.UnsupportedMessageVersion;
                    protocolError = new ChallengeRequestResult.ProtocolError(createErrorData(creqData, protocolError3.getCode(), protocolError3.getDescription(), creqData.getMessageVersion()));
                } else {
                    success = new ChallengeRequestResult.Success(creqData, challengeResponseData, this.creqExecutorConfig);
                }
                return success;
            } else if (e11 instanceof ChallengeResponseParseException) {
                ChallengeResponseParseException challengeResponseParseException = (ChallengeResponseParseException) e11;
                protocolError = new ChallengeRequestResult.ProtocolError(createErrorData(creqData, challengeResponseParseException.getCode(), challengeResponseParseException.getDescription(), challengeResponseParseException.getDetail()));
            } else {
                return new ChallengeRequestResult.RuntimeError(e11);
            }
            return protocolError;
        }
    }

    Object process(ChallengeRequestData challengeRequestData, HttpResponse httpResponse, d<? super ChallengeRequestResult> dVar);
}