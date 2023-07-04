package com.plaid.internal.core.protos.analyticalcore;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Analytical$ResponseErrorFields extends GeneratedMessageLite<Analytical$ResponseErrorFields, a> implements MessageLiteOrBuilder {
    private static final Analytical$ResponseErrorFields DEFAULT_INSTANCE;
    public static final int HTTP_STATUS_CODE_FIELD_NUMBER = 4;
    private static volatile Parser<Analytical$ResponseErrorFields> PARSER = null;
    public static final int PLAID_ERROR_CODE_FIELD_NUMBER = 1;
    public static final int PLAID_ERROR_MESSAGE_FIELD_NUMBER = 2;
    public static final int PLAID_ERROR_TYPE_FIELD_NUMBER = 3;
    private int httpStatusCode_;
    private String plaidErrorCode_ = "";
    private String plaidErrorMessage_ = "";
    private String plaidErrorType_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Analytical$ResponseErrorFields, a> implements MessageLiteOrBuilder {
        public a() {
            super(Analytical$ResponseErrorFields.DEFAULT_INSTANCE);
        }
    }

    static {
        Analytical$ResponseErrorFields analytical$ResponseErrorFields = new Analytical$ResponseErrorFields();
        DEFAULT_INSTANCE = analytical$ResponseErrorFields;
        GeneratedMessageLite.registerDefaultInstance(Analytical$ResponseErrorFields.class, analytical$ResponseErrorFields);
    }

    private Analytical$ResponseErrorFields() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpStatusCode() {
        this.httpStatusCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaidErrorCode() {
        this.plaidErrorCode_ = getDefaultInstance().getPlaidErrorCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaidErrorMessage() {
        this.plaidErrorMessage_ = getDefaultInstance().getPlaidErrorMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaidErrorType() {
        this.plaidErrorType_ = getDefaultInstance().getPlaidErrorType();
    }

    public static Analytical$ResponseErrorFields getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Analytical$ResponseErrorFields parseDelimitedFrom(InputStream inputStream) {
        return (Analytical$ResponseErrorFields) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$ResponseErrorFields parseFrom(ByteBuffer byteBuffer) {
        return (Analytical$ResponseErrorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Analytical$ResponseErrorFields> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpStatusCode(int i11) {
        this.httpStatusCode_ = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaidErrorCode(String str) {
        str.getClass();
        this.plaidErrorCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaidErrorCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.plaidErrorCode_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaidErrorMessage(String str) {
        str.getClass();
        this.plaidErrorMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaidErrorMessageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.plaidErrorMessage_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaidErrorType(String str) {
        str.getClass();
        this.plaidErrorType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaidErrorTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.plaidErrorType_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (com.plaid.internal.a.f18151a[methodToInvoke.ordinal()]) {
            case 1:
                return new Analytical$ResponseErrorFields();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\u0004", new Object[]{"plaidErrorCode_", "plaidErrorMessage_", "plaidErrorType_", "httpStatusCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Analytical$ResponseErrorFields> parser = PARSER;
                if (parser == null) {
                    synchronized (Analytical$ResponseErrorFields.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode_;
    }

    public String getPlaidErrorCode() {
        return this.plaidErrorCode_;
    }

    public ByteString getPlaidErrorCodeBytes() {
        return ByteString.copyFromUtf8(this.plaidErrorCode_);
    }

    public String getPlaidErrorMessage() {
        return this.plaidErrorMessage_;
    }

    public ByteString getPlaidErrorMessageBytes() {
        return ByteString.copyFromUtf8(this.plaidErrorMessage_);
    }

    public String getPlaidErrorType() {
        return this.plaidErrorType_;
    }

    public ByteString getPlaidErrorTypeBytes() {
        return ByteString.copyFromUtf8(this.plaidErrorType_);
    }

    public static a newBuilder(Analytical$ResponseErrorFields analytical$ResponseErrorFields) {
        return DEFAULT_INSTANCE.createBuilder(analytical$ResponseErrorFields);
    }

    public static Analytical$ResponseErrorFields parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ResponseErrorFields) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$ResponseErrorFields parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ResponseErrorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Analytical$ResponseErrorFields parseFrom(ByteString byteString) {
        return (Analytical$ResponseErrorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Analytical$ResponseErrorFields parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ResponseErrorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Analytical$ResponseErrorFields parseFrom(byte[] bArr) {
        return (Analytical$ResponseErrorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Analytical$ResponseErrorFields parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ResponseErrorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Analytical$ResponseErrorFields parseFrom(InputStream inputStream) {
        return (Analytical$ResponseErrorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$ResponseErrorFields parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ResponseErrorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$ResponseErrorFields parseFrom(CodedInputStream codedInputStream) {
        return (Analytical$ResponseErrorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Analytical$ResponseErrorFields parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$ResponseErrorFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}