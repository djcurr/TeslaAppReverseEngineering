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
public final class Analytical$RequestFields extends GeneratedMessageLite<Analytical$RequestFields, a> implements MessageLiteOrBuilder {
    public static final int API_VERSION_FIELD_NUMBER = 2;
    private static final Analytical$RequestFields DEFAULT_INSTANCE;
    private static volatile Parser<Analytical$RequestFields> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    private String requestId_ = "";
    private String apiVersion_ = "";

    /* loaded from: classes2.dex */
    public static final class a extends GeneratedMessageLite.Builder<Analytical$RequestFields, a> implements MessageLiteOrBuilder {
        public a() {
            super(Analytical$RequestFields.DEFAULT_INSTANCE);
        }
    }

    static {
        Analytical$RequestFields analytical$RequestFields = new Analytical$RequestFields();
        DEFAULT_INSTANCE = analytical$RequestFields;
        GeneratedMessageLite.registerDefaultInstance(Analytical$RequestFields.class, analytical$RequestFields);
    }

    private Analytical$RequestFields() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApiVersion() {
        this.apiVersion_ = getDefaultInstance().getApiVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    public static Analytical$RequestFields getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Analytical$RequestFields parseDelimitedFrom(InputStream inputStream) {
        return (Analytical$RequestFields) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$RequestFields parseFrom(ByteBuffer byteBuffer) {
        return (Analytical$RequestFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Analytical$RequestFields> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApiVersion(String str) {
        str.getClass();
        this.apiVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApiVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.apiVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestId(String str) {
        str.getClass();
        this.requestId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (com.plaid.internal.a.f18151a[methodToInvoke.ordinal()]) {
            case 1:
                return new Analytical$RequestFields();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"requestId_", "apiVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Analytical$RequestFields> parser = PARSER;
                if (parser == null) {
                    synchronized (Analytical$RequestFields.class) {
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

    public String getApiVersion() {
        return this.apiVersion_;
    }

    public ByteString getApiVersionBytes() {
        return ByteString.copyFromUtf8(this.apiVersion_);
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8(this.requestId_);
    }

    public static a newBuilder(Analytical$RequestFields analytical$RequestFields) {
        return DEFAULT_INSTANCE.createBuilder(analytical$RequestFields);
    }

    public static Analytical$RequestFields parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$RequestFields) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$RequestFields parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$RequestFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Analytical$RequestFields parseFrom(ByteString byteString) {
        return (Analytical$RequestFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Analytical$RequestFields parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$RequestFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Analytical$RequestFields parseFrom(byte[] bArr) {
        return (Analytical$RequestFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Analytical$RequestFields parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$RequestFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Analytical$RequestFields parseFrom(InputStream inputStream) {
        return (Analytical$RequestFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Analytical$RequestFields parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$RequestFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Analytical$RequestFields parseFrom(CodedInputStream codedInputStream) {
        return (Analytical$RequestFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Analytical$RequestFields parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Analytical$RequestFields) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}