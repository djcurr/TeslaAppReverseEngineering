package com.stripe.android.stripe3ds2.transactions;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ChallengeResponseParseException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final int code;
    private final String description;
    private final String detail;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChallengeResponseParseException createInvalidDataElementFormat(String fieldName) {
            s.g(fieldName, "fieldName");
            return new ChallengeResponseParseException(ProtocolError.InvalidDataElementFormat.getCode(), "Data element not in the required format or value is invalid as defined in Table A.1", fieldName);
        }

        public final ChallengeResponseParseException createRequiredDataElementMissing(String fieldName) {
            s.g(fieldName, "fieldName");
            return new ChallengeResponseParseException(ProtocolError.RequiredDataElementMissing.getCode(), "A message element required as defined in Table A.1 is missing from the message.", fieldName);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeResponseParseException(int i11, String description, String detail) {
        super(i11 + " - " + description + " (" + detail + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        s.g(description, "description");
        s.g(detail, "detail");
        this.code = i11;
        this.description = description;
        this.detail = detail;
    }

    public static final ChallengeResponseParseException createInvalidDataElementFormat(String str) {
        return Companion.createInvalidDataElementFormat(str);
    }

    public static final ChallengeResponseParseException createRequiredDataElementMissing(String str) {
        return Companion.createRequiredDataElementMissing(str);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDetail() {
        return this.detail;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeResponseParseException(ProtocolError protocolError, String detail) {
        this(protocolError.getCode(), protocolError.getDescription(), detail);
        s.g(protocolError, "protocolError");
        s.g(detail, "detail");
    }
}